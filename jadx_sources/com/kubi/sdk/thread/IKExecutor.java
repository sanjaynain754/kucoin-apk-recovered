package com.kubi.sdk.thread;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IKExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/thread/IKExecutor;", "", "", "getName", "()Ljava/lang/String;", "name", "Companion", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IKExecutor {

    /* JADX INFO: compiled from: IKExecutor.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/thread/IKExecutor$Companion;", "", "<init>", "()V", "", "MAIN_NAME", "Ljava/lang/String;", "IO_NAME", "COMPUTE_NAME", "LONG_TIME_NAME", "DELAYED_NAME", "SINGLE_NAME", "BACKUP_NAME", "ThreadPool_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String BACKUP_NAME = "kPool-backup";

        @NotNull
        public static final String COMPUTE_NAME = "kPool-cpu";

        @NotNull
        public static final String DELAYED_NAME = "kPool-delay";

        @NotNull
        public static final String IO_NAME = "kPool-io";

        @NotNull
        public static final String LONG_TIME_NAME = "kPool-long-time";

        @NotNull
        public static final String MAIN_NAME = "kPool-main";

        @NotNull
        public static final String SINGLE_NAME = "kPool-single";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f47983a = new Companion();
    }

    @NotNull
    String getName();
}
