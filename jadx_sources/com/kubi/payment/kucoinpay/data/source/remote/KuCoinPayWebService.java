package com.kubi.payment.kucoinpay.data.source.remote;

import com.kubi.payment.kucoinpay.data.entities.QrCode;
import com.kubi.payment.kucoinpay.qrscan.QrCodeLogoEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.kubi.payment.kucoinpay.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuCoinPayWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H§@¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/data/source/remote/KuCoinPayWebService;", "", "loadQrCode", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Response;", "request", "Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;", "(Lcom/kubi/payment/kucoinpay/data/entities/QrCode$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrPayLogoList", "Lcom/kubi/payment/kucoinpay/qrscan/QrCodeLogoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface KuCoinPayWebService {
    @GET("pmtapi/promotion/qr/pay/detail")
    @Nullable
    /* JADX INFO: renamed from: G */
    Object m48315G(@NotNull Continuation<? super BaseEntity<QrCodeLogoEntity>> continuation);

    @POST("pmtapi/preorder/init")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m48316a(@Body @NotNull QrCode.Request request, @NotNull Continuation<? super BaseEntity<QrCode.Response>> continuation);
}
