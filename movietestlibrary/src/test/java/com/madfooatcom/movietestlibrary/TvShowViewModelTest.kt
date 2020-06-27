package com.madfooatcom.movietestlibrary

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.madfooatcom.movietestlibrary.common.ViewState
import com.madfooatcom.movietestlibrary.data.local.entity.TvShowEntity
import com.madfooatcom.movietestlibrary.data.local.source.LocalDataSourceImpl
import com.madfooatcom.movietestlibrary.data.remote.ApiService
import com.madfooatcom.movietestlibrary.data.remote.source.RemoteDataSourceImpl
import com.madfooatcom.movietestlibrary.data.repository.TvShowRepositoryImpl
import com.madfooatcom.movietestlibrary.domain.SchedulerProviders
import com.madfooatcom.movietestlibrary.ui.feature.tvshow.TvShowViewModel
import com.madfooatcom.movietestlibrary.utils.LocalData
import io.reactivex.Observable
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class TvShowViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()
    private var remoteImpl: RemoteDataSourceImpl = Mockito.mock(RemoteDataSourceImpl::class.java)


    private var localImpl: LocalDataSourceImpl = Mockito.mock(LocalDataSourceImpl::class.java)


    private var api: ApiService = Mockito.mock(ApiService::class.java)

    @Mock
    private lateinit var observer: Observer<ViewState<List<TvShowEntity>>>

    @Mock
    private lateinit var repository: TvShowRepositoryImpl


    private lateinit var viewModel: TvShowViewModel

    @Before
    @Throws(Exception::class)
    fun setup() {
        MockitoAnnotations.initMocks(this)
        repository = TvShowRepositoryImpl(remoteImpl, localImpl)
        viewModel = TvShowViewModel(repository, SchedulerProviders.TEST_SCHEDULER)
        Mockito.`when`(api.getTvShows("ac313fc1138a0ed697567a0dedddc6cd")).thenReturn(Observable.just(LocalData.tvShow))
        viewModel.tvShowListState.observeForever(observer)
    }

    @Test
    fun testDataNotNull() {
        assertNotNull(viewModel.getTvShow("ac313fc1138a0ed697567a0dedddc6cd"))
        Assert.assertTrue(viewModel.tvShowListState.hasObservers())
        assertNotNull(LocalData.tvShow.results)
        assertEquals(20, LocalData.tvShow.results.size)
    }

    @Test
    fun testFetchDataSuccess() {
        viewModel.getTvShow("ac313fc1138a0ed697567a0dedddc6cd")
        viewModel.tvShowListState.observeForever(observer)
        verify(observer, times(1)).onChanged(ViewState.success(ArgumentMatchers.any()))
    }

}