package com.madfooatcom.movietestlibrary

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.data.local.entity.MovieEntity
import com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl
import com.madfooatcom.movietestlibrary.data.remote.ApiService
import com.madfooatcom.movietestlibrary.data.remote.source.RemoteDataSourceImpl
import com.madfooatcom.movietestlibrary.data.repository.MovieRepositoryImpl
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.ui.feature.movie.MovieViewModel
import com.madfooatcom.movietestlibrary.utils.LocalData
import io.reactivex.Observable
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class MovieViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()


    private var remoteImpl: RemoteDataSourceImpl = mock(RemoteDataSourceImpl::class.java)


    private var localImpl: LocalDataSourceImpl = mock(LocalDataSourceImpl::class.java)


    private var api: ApiService = mock(ApiService::class.java)

    @Mock
    private lateinit var observer: Observer<ViewState<List<MovieEntity>>>

    @Mock
    private lateinit var repository: MovieRepositoryImpl

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        repository = MovieRepositoryImpl(remoteImpl, localImpl)
        viewModel = MovieViewModel(repository, SchedulerProviders.TEST_SCHEDULER)
        viewModel.movieListState.observeForever(observer)
    }

    @Test
    fun testDataNotNull() {
        `when`(api.getMovies("ac313fc1138a0ed697567a0dedddc6cd")).thenReturn(Observable.just(LocalData.movie))
        assertNotNull(viewModel.getMovies("ac313fc1138a0ed697567a0dedddc6cd"))
        assertTrue(viewModel.movieListState.hasObservers())
        assertNotNull(LocalData.movie.results)
        assertEquals(20, LocalData.movie.results.size)
    }

    @Test
    fun testFetchDataSuccess() {
        `when`(api.getMovies("ac313fc1138a0ed697567a0dedddc6cd")).thenReturn(Observable.just(LocalData.movie))
        viewModel.getMovies("ac313fc1138a0ed697567a0dedddc6cd")
        verify(observer, times(1)).onChanged(ViewState.success(ArgumentMatchers.any()))
    }


}