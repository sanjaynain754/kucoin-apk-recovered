package com.kubi.payment.kucard.data.source;

import com.kubi.payment.kucard.data.entities.KuCardEntranceConfig;
import com.kubi.payment.kucard.data.source.remote.KuCardRemoteDataSource;
import com.kubi.payment.util.RepositoryExtKt;
import kotlinx.coroutines.AbstractC41697j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCardRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/kucard/data/source/KuCardRepositoryImpl;", "Lcom/kubi/payment/kucard/data/source/IKuCardRepository;", "remoteDataSource", "Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/kucard/data/source/remote/KuCardRemoteDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadKuCardEntranceConfig", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCardRepositoryImpl implements IKuCardRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KuCardRemoteDataSource f39570a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f39571b;

    public KuCardRepositoryImpl(@NotNull KuCardRemoteDataSource remoteDataSource, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(remoteDataSource, "remoteDataSource");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f39570a = remoteDataSource;
        this.f39571b = ioDispatcher;
    }

    @Override // com.kubi.payment.kucard.data.source.IKuCardRepository
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo48289a(@NotNull Continuation<? super AbstractC42878k<KuCardEntranceConfig>> continuation) {
        return RepositoryExtKt.m49807b(null, new KuCardRepositoryImpl$loadKuCardEntranceConfig$2(this, null), continuation, 1, null);
    }
}
