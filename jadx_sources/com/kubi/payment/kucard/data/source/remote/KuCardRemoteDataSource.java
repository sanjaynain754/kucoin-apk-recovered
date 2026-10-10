package com.kubi.payment.kucard.data.source.remote;

import com.kubi.payment.kucard.data.entities.KuCardEntranceConfig;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCardRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;", "", "webService", "Lcom/kubi/payment/kucard/data/source/remote/KuCardWebService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/kucard/data/source/remote/KuCardWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadKuCardEntranceConfig", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCardRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KuCardWebService f39572a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f39573b;

    public KuCardRemoteDataSource(@NotNull KuCardWebService webService, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f39572a = webService;
        this.f39573b = ioDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m48291b(@NotNull Continuation<? super BaseEntity<KuCardEntranceConfig>> continuation) {
        return C41686h.m91049g(this.f39573b, new KuCardRemoteDataSource$loadKuCardEntranceConfig$2(this, null), continuation);
    }
}
