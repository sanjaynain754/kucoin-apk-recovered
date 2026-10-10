package com.kubi.sdk.timpush.data.repository;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.timpush.data.model.PushBinding;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import t00.C44607a;

/* JADX INFO: compiled from: TimPushRepository.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/repository/TimPushRepository;", "", "remoteDataSource", "Lcom/kubi/sdk/timpush/data/source/remote/TimPushRemoteDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/sdk/timpush/data/source/remote/TimPushRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "bindAnonymous", "Lcom/kubi/sdk/base/entity/BaseEntity;", "binding", "Lcom/kubi/sdk/timpush/data/model/PushBinding;", "(Lcom/kubi/sdk/timpush/data/model/PushBinding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bind", "unbind", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TimPushRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C44607a f48091a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f48092b;

    public TimPushRepository(@NotNull C44607a remoteDataSource, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f48091a = remoteDataSource;
        this.f48092b = ioDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m58249b(@NotNull PushBinding pushBinding, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f48092b, new TimPushRepository$bind$2(pushBinding, this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m58250c(@NotNull PushBinding pushBinding, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f48092b, new TimPushRepository$bindAnonymous$2(pushBinding, this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m58251d(@NotNull PushBinding pushBinding, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return C41686h.m91049g(this.f48092b, new TimPushRepository$unbind$2(pushBinding, this, null), continuation);
    }
}
