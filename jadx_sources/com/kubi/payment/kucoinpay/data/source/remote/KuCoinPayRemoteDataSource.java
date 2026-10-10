package com.kubi.payment.kucoinpay.data.source.remote;

import com.kubi.payment.kucoinpay.data.entities.QrCode;
import com.kubi.payment.kucoinpay.qrscan.QrCodeLogoEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KuCoinPayRemoteDataSource.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayRemoteDataSource;", "", "webService", "Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayWebService;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "loadQrCode", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;", "content", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrPayLogoList", "Lcom/kubi/payment/kucoinpay/qrscan/QrCodeLogoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCoinPayRemoteDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KuCoinPayWebService f39587a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AbstractC41697j0 f39588b;

    public KuCoinPayRemoteDataSource(@NotNull KuCoinPayWebService webService, @NotNull AbstractC41697j0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f39587a = webService;
        this.f39588b = ioDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m48313b(@NotNull Continuation<? super BaseEntity<QrCodeLogoEntity>> continuation) {
        return C41686h.m91049g(this.f39588b, new KuCoinPayRemoteDataSource$fetchQrPayLogoList$2(this, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m48314c(@NotNull String str, @NotNull Continuation<? super BaseEntity<QrCode.Response>> continuation) {
        return C41686h.m91049g(this.f39588b, new KuCoinPayRemoteDataSource$loadQrCode$2(this, str, null), continuation);
    }
}
