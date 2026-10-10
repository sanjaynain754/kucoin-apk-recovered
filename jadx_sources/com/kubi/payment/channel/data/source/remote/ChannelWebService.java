package com.kubi.payment.channel.data.source.remote;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.ChannelKycStatus;
import com.kubi.payment.channel.data.entities.ChannelUserInfo;
import com.kubi.payment.channel.data.entities.CreateIvyOrderEntity;
import com.kubi.payment.channel.data.entities.FiatInfoEntity;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.channel.data.entities.IvyConfirmPageEntity;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.data.entities.Refund;
import com.kubi.payment.channel.data.entities.WhiteListEntity;
import com.kubi.payment.channel.data.entities.Withdraw;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: renamed from: com.kubi.payment.channel.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChannelWebService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H§@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H§@¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0014\b\u0001\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001aH§@¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u001eH§@¢\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\"H§@¢\u0006\u0002\u0010#J4\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010&\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020'2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010)J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u000b\u001a\u00020,H§@¢\u0006\u0002\u0010-J\u001c\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00040\u0003H§@¢\u0006\u0002\u0010\u0011J\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u000b\u001a\u000202H§@¢\u0006\u0002\u00103J(\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u00106\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u000207H§@¢\u0006\u0002\u00108ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00069À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/channel/data/source/remote/ChannelWebService;", "", "loadRechargePaymentMethodList", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "fiatCurrency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRechargeGuidePaymentMethod", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "request", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;", "(Lcom/kubi/payment/channel/data/entities/GuidePayment$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithdrawPaymentMethodList", "loadChannelUserInfo", "Lcom/kubi/payment/channel/data/entities/ChannelUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCapitualKycStatus", "Lcom/kubi/payment/channel/data/entities/ChannelKycStatus;", "channelKycRequest", "Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;", "(Lcom/kubi/payment/channel/data/entities/ChannelKycRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentFee", "Lcom/kubi/otc/entity/FiatFee;", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFiatList", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Response;", "Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/FiatInfoEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewWithdrawOrder", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;", "(Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ChannelKycRequest.SCENE_WITHDRAW, "Lcom/kubi/payment/channel/data/entities/Withdraw$Response;", "url", "Lcom/kubi/payment/channel/data/entities/Withdraw$Request;", "validationToken", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/Withdraw$Request;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Event.REFUND, "Lcom/kubi/payment/channel/data/entities/Refund$Response;", "Lcom/kubi/payment/channel/data/entities/Refund$Request;", "(Lcom/kubi/payment/channel/data/entities/Refund$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchQrCodeWhiteList", "Lcom/kubi/payment/channel/data/entities/WhiteListEntity;", "loadIvyConfirmPage", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Response;", "Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;", "(Lcom/kubi/payment/channel/data/entities/IvyConfirmPageEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIvyOrder", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Response;", "colorTheme", "Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;", "(Ljava/lang/String;Lcom/kubi/payment/channel/data/entities/CreateIvyOrderEntity$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ChannelWebService {
    @GET("pmtapi/preorder/allRoute")
    @Nullable
    /* JADX INFO: renamed from: A */
    Object m45764A(@NotNull Continuation<? super BaseEntity<List<WhiteListEntity>>> continuation);

    @POST("pmtapi/v1/payin/orderConfirm")
    @Nullable
    /* JADX INFO: renamed from: F */
    Object m45765F(@Body @NotNull IvyConfirmPageEntity.Request request, @NotNull Continuation<? super BaseEntity<IvyConfirmPageEntity.Response>> continuation);

    @Headers({"HEADER_FINGER_EVENT:pay-fiat-withdraw"})
    @POST
    @Nullable
    /* JADX INFO: renamed from: N */
    Object m45766N(@Url @NotNull String str, @Body @NotNull Withdraw.Request request, @Header("X-VALIDATION-TOKEN") @Nullable String str2, @NotNull Continuation<? super BaseEntity<Withdraw.Response>> continuation);

    @POST("pmtapi/v3/refund/customerRefund")
    @Nullable
    /* JADX INFO: renamed from: V */
    Object m45767V(@Body @NotNull Refund.Request request, @NotNull Continuation<? super BaseEntity<Refund.Response>> continuation);

    @POST("v1/payment/api/payin_account/extra")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m45768c(@Body @NotNull ChannelKycRequest channelKycRequest, @NotNull Continuation<? super BaseEntity<ChannelKycStatus>> continuation);

    @GET("pmtapi/withdraw/list")
    @Nullable
    /* JADX INFO: renamed from: c0 */
    Object m45769c0(@NotNull @Query("fiatCurrency") String str, @NotNull Continuation<? super BaseEntity<List<PaymentMethod>>> continuation);

    @GET("pmtapi/recharge/list")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m45770g(@NotNull @Query("fiatCurrency") String str, @NotNull Continuation<? super BaseEntity<List<PaymentMethod>>> continuation);

    @POST("pmtapi/v1/order/withdraw/confirm")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m45771h(@Body @NotNull PreviewWithdrawOrder.Request request, @NotNull Continuation<? super BaseEntity<PreviewWithdrawOrder.Response>> continuation);

    @POST("pmtapi/fiat/currency/list")
    @Nullable
    /* JADX INFO: renamed from: o */
    Object m45772o(@Body @NotNull FiatInfoEntity.Request request, @NotNull Continuation<? super BaseEntity<FiatInfoEntity.Response>> continuation);

    @Headers({"HEADER_FINGER_EVENT:fiat-deposit-create-v3"})
    @POST("pmtapi/v3/payinOrder/create")
    @Nullable
    /* JADX INFO: renamed from: q */
    Object m45773q(@Header("X-COLOR-THEME") @NotNull String str, @Body @NotNull CreateIvyOrderEntity.Request request, @NotNull Continuation<? super BaseEntity<CreateIvyOrderEntity.Response>> continuation);

    @POST("pmtapi/payment/method/guide")
    @Nullable
    /* JADX INFO: renamed from: w */
    Object m45774w(@Body @NotNull GuidePayment.Request request, @NotNull Continuation<? super BaseEntity<GuidePayment.Response>> continuation);

    @GET("payment_mobile_gateway/v1/api/user/kyc-info")
    @Nullable
    /* JADX INFO: renamed from: z */
    Object m45775z(@NotNull Continuation<? super BaseEntity<ChannelUserInfo>> continuation);
}
