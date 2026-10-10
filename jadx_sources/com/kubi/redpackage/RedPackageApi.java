package com.kubi.redpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CheckCodeParamsEntity;
import com.kubi.data.entity.CheckCodeResultEntity;
import com.kubi.redpackage.entity.RedConfig;
import com.kubi.redpackage.entity.RedPackageRecord;
import com.kubi.redpackage.entity.RedPackageResponse;
import com.kubi.redpackage.entity.RedPackageTotal;
import com.kubi.redpackage.entity.RedPacketErrorResourceEntity;
import com.kubi.redpackage.entity.RedpacketDetailEntity;
import com.kubi.redpackage.entity.RedpacketInfoEntity;
import com.kubi.redpackage.entity.RedpacketItemEntity;
import com.kubi.redpackage.entity.RedpacketReceiveEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.redpackage.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RedPackageApi.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u0007H'J.\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\f\u001a\u00020\u0007H'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u0014H'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u0007H'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u0007H'J.\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u001c\u001a\u00020\u0014H'J.\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u001c\u001a\u00020\u0014H'Jp\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010!\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\"\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\u00072\b\b\u0003\u0010$\u001a\u00020%2\b\b\u0001\u0010\u0013\u001a\u00020\u00142\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0007H'J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0001\u0010*\u001a\u00020\u0007H'J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020,0(2\b\b\u0001\u0010-\u001a\u00020\u00072\b\b\u0001\u0010*\u001a\u00020\u0007H'J0\u0010.\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/0\u00040\u00032\b\b\u0001\u0010*\u001a\u00020\u0007H'J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00040\u00032\b\b\u0001\u00104\u001a\u00020\u0007H'J?\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001a0\u00040\u00032\n\b\u0001\u00107\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u00104\u001a\u00020\u0007H'¢\u0006\u0002\u00108ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00069À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/redpackage/RedPackageApi;", "", "getCheckRequiredValidation", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "", "", "bizType", "loginToken", FirebaseAnalytics.Param.CURRENCY, "sendAmount", "header", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "getSupportCoin", "Lcom/kubi/redpackage/entity/RedConfig;", "type", "", "getReceivedTotal", "Lcom/kubi/redpackage/entity/RedPackageTotal;", "size", "getSendTotal", "getSendRecord", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/redpackage/entity/RedPackageRecord;", "page", "getReceivedRecord", "sendRedPackage", "Lcom/kubi/redpackage/entity/RedPackageResponse;", "accountType", "bestWishes", "nickName", "sendNum", "isNewBee", "", "extendId", "getRedpacket", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/redpackage/entity/RedpacketInfoEntity;", "code", "receiveRedPacket", "Lcom/kubi/redpackage/entity/RedpacketReceiveEntity;", "receiveNickName", "fetchRedPacketErrorResource", "", "", "Lcom/kubi/redpackage/entity/RedPacketErrorResourceEntity;", "redpacketDetail", "Lcom/kubi/redpackage/entity/RedpacketDetailEntity;", "sendRecordId", "getSingleRecord", "Lcom/kubi/redpackage/entity/RedpacketItemEntity;", "index", "(Ljava/lang/Integer;ILjava/lang/String;)Lio/reactivex/Observable;", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface RedPackageApi {
    @POST("v1/auth/verify-validation-code")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<CheckCodeResultEntity>>> m53730a(@Body @NotNull CheckCodeParamsEntity checkCodeParamsEntity, @Header("X-SERVICE-PLATFORM") @NotNull String str);

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:redpack-send"})
    @POST("v1/welfare/send")
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<RedPackageResponse>> m53731c(@Field("accountType") @NotNull String str, @Field("bestWishes") @NotNull String str2, @Field(FirebaseAnalytics.Param.CURRENCY) @NotNull String str3, @Field("nickName") @NotNull String str4, @Field("sendAmount") @NotNull String str5, @Field("sendNum") @NotNull String str6, @Field("isNewBee") boolean z11, @Field("type") int i11, @Field("extendId") @Nullable String str7);

    @GET("v1/welfare/receive/records")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<BasePageEntity<RedPackageRecord>>> m53732e(@Query("size") int i11, @Query("page") int i12);

    @GET("v1/welfare/query/configs")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<RedConfig>> m53733g(@Query("type") int i11);

    @NotNull
    @FormUrlEncoded
    @Headers({"HEADER_FINGER_EVENT:redpack-receive"})
    @POST("v1/welfare/receive")
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<RedpacketReceiveEntity> m53734i(@Field("receiveNickName") @NotNull String str, @Field("code") @NotNull String str2);

    @GET("v1/welfare/get-welfare")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<RedpacketInfoEntity> m53735j(@NotNull @Query("code") String str);

    @GET("v1/welfare/welfare-detail")
    @NotNull
    /* JADX INFO: renamed from: k */
    Observable<BaseEntity<RedpacketDetailEntity>> m53736k(@NotNull @Query("sendRecordId") String str);

    @GET("v2/welfare/receive/records-for-single")
    @NotNull
    /* JADX INFO: renamed from: l */
    Observable<BaseEntity<BasePageEntity<RedpacketItemEntity>>> m53737l(@Nullable @Query("index") Integer num, @Query("size") int i11, @NotNull @Query("sendRecordId") String str);

    @FormUrlEncoded
    @POST("v1/auth/check-required-validation")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<ArrayList<String[]>>> m53738m(@Field("bizType") @NotNull String str, @Field("loginToken") @Nullable String str2, @Field(FirebaseAnalytics.Param.CURRENCY) @NotNull String str3, @Field("sendAmount") @NotNull String str4, @Header("X-SERVICE-PLATFORM") @NotNull String str5);

    @GET("v1/welfare/sent/record-total")
    @NotNull
    /* JADX INFO: renamed from: n */
    Observable<BaseEntity<RedPackageTotal>> m53739n(@NotNull @Query("targetCurrency") String str);

    @GET("v1/welfare/receive/record-total")
    @NotNull
    /* JADX INFO: renamed from: p */
    Observable<BaseEntity<RedPackageTotal>> m53740p(@NotNull @Query("targetCurrency") String str);

    @GET("v1/welfare/sent/records")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<BasePageEntity<RedPackageRecord>>> m53741q(@Query("size") int i11, @Query("page") int i12);

    @GET("v1/platform-resource-position/position")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<Map<String, List<RedPacketErrorResourceEntity>>>> m53742r(@NotNull @Query("code") String str);

    /* JADX INFO: renamed from: b */
    static /* synthetic */ Observable m53725b(RedPackageApi redPackageApi, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSupportCoin");
        }
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return redPackageApi.m53733g(i11);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Observable m53726d(RedPackageApi redPackageApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSendTotal");
        }
        if ((i11 & 1) != 0) {
            str = "BTC";
        }
        return redPackageApi.m53739n(str);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Observable m53727f(RedPackageApi redPackageApi, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCheckRequiredValidation");
        }
        if ((i11 & 16) != 0) {
            str5 = "KUCOIN";
        }
        return redPackageApi.m53738m(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Observable m53728h(RedPackageApi redPackageApi, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReceivedTotal");
        }
        if ((i11 & 1) != 0) {
            str = "BTC";
        }
        return redPackageApi.m53740p(str);
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ Observable m53729o(RedPackageApi redPackageApi, CheckCodeParamsEntity checkCodeParamsEntity, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkValidationCode");
        }
        if ((i11 & 2) != 0) {
            str = "KUCOIN";
        }
        return redPackageApi.m53730a(checkCodeParamsEntity, str);
    }
}
