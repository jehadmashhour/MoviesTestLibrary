package com.madfooatcom.movietestlibrary.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "Companion", "movietestlibrary_release"})
public abstract interface SchedulerProviders {
    public static final com.madfooatcom.movietestlibrary.domain.SchedulerProviders.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Scheduler io();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Scheduler computation();
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Scheduler ui();
    
    @org.jetbrains.annotations.NotNull()
    public static com.madfooatcom.movietestlibrary.domain.SchedulerProviders getDEFAULT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static com.madfooatcom.movietestlibrary.domain.SchedulerProviders getTEST_SCHEDULER() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders$Companion;", "", "()V", "DEFAULT", "Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "DEFAULT$annotations", "getDEFAULT", "()Lcom/madfooatcom/movietestlibrary/domain/SchedulerProviders;", "TEST_SCHEDULER", "TEST_SCHEDULER$annotations", "getTEST_SCHEDULER", "movietestlibrary_release"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final com.madfooatcom.movietestlibrary.domain.SchedulerProviders DEFAULT = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.madfooatcom.movietestlibrary.domain.SchedulerProviders TEST_SCHEDULER = null;
        
        @java.lang.Deprecated()
        public static void DEFAULT$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.madfooatcom.movietestlibrary.domain.SchedulerProviders getDEFAULT() {
            return null;
        }
        
        @java.lang.Deprecated()
        public static void TEST_SCHEDULER$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.madfooatcom.movietestlibrary.domain.SchedulerProviders getTEST_SCHEDULER() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}