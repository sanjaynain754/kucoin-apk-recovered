package com.kubi.payment.third.data.source.remote;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdOrderItem;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.payment.third.data.source.remote.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ThirdWebService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005JF\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0014H§@¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0001\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0014H§@¢\u0006\u0002\u0010\u0015JX\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00030\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\u001d\u001a\u00020\u000b2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020\u001f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/third/data/source/remote/ThirdWebService;", "", "loadUserInfo", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCheckKycExist", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "loadQuoteThirdInfo", "Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "fiat", "", "crypto", "fiatAmount", "payMethodId", "colorTheme", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCreateOrder", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", ReportDataTable.COLUMN_PARAMS, "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCompleteKycInfo", "thirdOrderList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/payment/third/data/entities/ThirdOrderItem;", "channelId", "side", "status", "page", "", "size", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ThirdWebService {
    @GET("v1/common/get/userInfo")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m49552a(@NotNull Continuation<? super BaseEntity<FiatUserInfo>> continuation);

    @GET("v1/otc/third-party/simplex/check-kyc-exist")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m49553b(@NotNull Continuation<? super BaseEntity<ThirdKycInfo>> continuation);

    @FormUrlEncoded
    @POST("v1/otc/third-party/simplex/kyc-info-completion")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m49554c(@FieldMap @NotNull Map<String, String> map, @NotNull Continuation<? super BaseEntity<Object>> continuation);

    @GET("payment_mobile_gateway/v1/thirdparty/channel/order/list")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<BasePageEntity<ThirdOrderItem>>> m49555d(@NotNull @Query("channelId") String str, @NotNull @Query("side") String str2, @NotNull @Query("status") String str3, @Query("page") int i11, @Query("size") int i12, @Nullable @Query("colorTheme") String str4);

    @FormUrlEncoded
    @POST("payment_mobile_gateway/v1/channels/trade/order")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m49556e(@FieldMap @NotNull Map<String, String> map, @NotNull Continuation<? super BaseEntity<ThirdOrder>> continuation);

    @GET("payment_mobile_gateway/v1/channels/trade/info")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m49557g(@NotNull @Query("fiat") String str, @NotNull @Query("crypto") String str2, @NotNull @Query("fiatAmount") String str3, @NotNull @Query("payMethodId") String str4, @NotNull @Query("colorTheme") String str5, @NotNull Continuation<? super BaseEntity<ThirdQuoteInfo>> continuation);

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Observable m49551f(ThirdWebService thirdWebService, String str, String str2, String str3, int i11, int i12, String str4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: thirdOrderList");
        }
        if ((i13 & 32) != 0) {
            str4 = OtcDepend.f38138a.m45467p() ? "dark" : "bright";
        }
        return thirdWebService.m49555d(str, str2, str3, i11, i12, str4);
    }
}
