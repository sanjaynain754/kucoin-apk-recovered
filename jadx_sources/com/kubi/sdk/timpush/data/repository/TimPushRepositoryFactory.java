package com.kubi.sdk.timpush.data.repository;

import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import t00.C44607a;
import t00.InterfaceC44608b;

/* JADX INFO: renamed from: com.kubi.sdk.timpush.data.repository.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TimPushRepositoryFactory.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/repository/TimPushRepositoryFactory;", "", "<init>", "()V", "create", "Lcom/kubi/sdk/timpush/data/repository/TimPushRepository;", "webService", "Lcom/kubi/sdk/timpush/data/source/remote/WebService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TimPushRepositoryFactory {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TimPushRepositoryFactory f48093a = new TimPushRepositoryFactory();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TimPushRepository m58252a(@NotNull InterfaceC44608b webService, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        return new TimPushRepository(new C44607a(webService), ioDispatcher);
    }
}
