package p692vh;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5276j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.data.trial.CopyTradingTrialDetailsEntity;
import com.kubi.futures.data.trial.LeadTradingActivateTrialRequest;
import com.kubi.futures.data.trial.SubmitTrialData;
import com.kubi.kumex.data.platform.model.FuturesAirdropProfitEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareComposeEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialWithDrawPopupInfoEntity;
import com.kubi.kumex.data.trade.model.UserJoinChallengeEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.bugly.proguard.C33577c3;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import io.reactivex.Observable;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: vh.a */
/* JADX INFO: compiled from: ITrialApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J \u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u000b\u001a\u00020\u0005H'J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0005H'J(\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'J*\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H'J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0016H'J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u001fH'J(\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'J4\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00132\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0005H'J\u0014\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0001\u0010\u000b\u001a\u00020\u0005H'J\u0012\u0010%\u001a\u00020&2\b\b\u0003\u0010'\u001a\u00020\u0005H'J\u0010\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030)H'J\u001e\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010,0+2\b\b\u0001\u0010-\u001a\u00020.H'J*\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010,0+2\b\b\u0001\u0010-\u001a\u00020.2\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0005H'J(\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030)2\u0016\b\u0001\u00102\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u00010\u000303H'J(\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060)2\u0016\b\u0001\u00102\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0006\u0012\u0004\u0018\u00010603H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/trial/ITrialApi;", "", "fetchTrialDetails", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "id", "", "fetchCopyTrialDetails", "Lcom/kubi/futures/data/trial/CopyTradingTrialDetailsEntity;", "submitActivateTrial", "side", "submitTrialWithdraw", "code", "fetchTrialWithDrawPopupInfo", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "popupCode", "fetchCouponList", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponEntity;", "status", "currentPage", "", "pageSize", "fetchWelfareComposeList", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", FirebaseAnalytics.Param.CURRENCY, "symbol", "prizeType", "fetchTradeProUserJoinChallenge", "Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "fetchLeadTradingWelfareComposeList", "submitLeadTradingActivateTrial", TtmlNode.TAG_BODY, "Lcom/kubi/futures/data/trial/LeadTradingActivateTrialRequest;", "fetchAirdropList", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "fetchTrialList", "airdropPopWindowInfo", "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "fetchRewardConfig", "", C33577c3.f69334H, "fetchDistributionData", "Lkotlinx/coroutines/flow/Flow;", "submitDistribution", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "submitTrialData", "Lcom/kubi/futures/data/trial/SubmitTrialData;", "submitDistributionV2", "validationToken", "obsDistributionData", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "obsAirdropRealisedData", "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45544a {
    @POST("v1/leadTrading/app/trialFund/activate")
    @Nullable
    /* JADX INFO: renamed from: A */
    Object mo100553A(@Body @NotNull LeadTradingActivateTrialRequest leadTradingActivateTrialRequest) throws Throwable;

    @GET("v1/deduction/coupon/getUserCoupons")
    @Nullable
    /* JADX INFO: renamed from: a */
    FuturesWelfareCouponEntity mo100554a(@NotNull @Query("status") String str, @Query("pageNum") int i11, @Query("pageSize") int i12) throws Throwable;

    @FormUrlEncoded
    @POST("v1/trial/couponWithDraw")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo100555b(@Field("code") @NotNull String str) throws Throwable;

    @GET("v1/km/trial/getUserAirdropPositionCouponList")
    @Nullable
    /* JADX INFO: renamed from: d */
    FuturesWelfareTrialEntity mo100556d(@NotNull @Query("status") String str, @Query("currentPage") int i11, @Query("pageSize") int i12) throws Throwable;

    @GET("v2/kumex/welfare/coupon/getUsableWelfareCoupons")
    @Nullable
    /* JADX INFO: renamed from: e */
    FuturesWelfareComposeEntity mo100557e(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("symbol") String str2, @Nullable @Query("prizeType") String str3) throws Throwable;

    @GET("v1/trial/getUserTrialCouponList")
    @Nullable
    /* JADX INFO: renamed from: f */
    FuturesWelfareTrialEntity mo100558f(@NotNull @Query("status") String str, @Query("currentPage") int i11, @Query("pageSize") int i12, @Nullable @Query("prizeType") String str2) throws Throwable;

    @Headers({"Cache-Time: 60000"})
    @GET("v1/kumex/user/open-contract/has-rewards")
    /* JADX INFO: renamed from: g */
    boolean mo100559g(@Header("X-DEVICE-FRONT-ID") @NotNull String str) throws Throwable;

    @InterfaceC38291d(topic = "/futuresTrial/campaignCoupon")
    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC41634e<FuturesWelfareTrialItemEntity> mo100560h(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, FuturesWelfareTrialItemEntity> interfaceC41975c);

    @POST("v1/trial/order")
    @NotNull
    /* JADX INFO: renamed from: i */
    Observable<BaseEntity<Object>> mo100561i(@Body @NotNull SubmitTrialData submitTrialData) throws Throwable;

    @POST("v1/trial/newUserActive")
    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC41634e<FuturesWelfareTrialItemEntity> mo100562k() throws Throwable;

    @GET("v1/km/trial/getUserJoinChallenge")
    @Nullable
    /* JADX INFO: renamed from: m */
    UserJoinChallengeEntity mo100563m(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/app/getUserTrialCouponById")
    @NotNull
    /* JADX INFO: renamed from: o */
    CopyTradingTrialDetailsEntity mo100564o(@NotNull @Query("id") String str) throws Throwable;

    @GET("v1/trial/getUserTrialCouponById")
    @NotNull
    /* JADX INFO: renamed from: p */
    FuturesWelfareTrialItemEntity mo100565p(@NotNull @Query("code") String str) throws Throwable;

    @GET("v1/km/trial/airdrop-position-pop-up-window")
    @Nullable
    /* JADX INFO: renamed from: q */
    AirdropBonusEntity mo100566q(@NotNull @Query("code") String str) throws Throwable;

    @GET("v1/kumex/popups")
    @Nullable
    /* JADX INFO: renamed from: r */
    FuturesWelfareTrialWithDrawPopupInfoEntity mo100567r(@NotNull @Query("popupCode") String str) throws Throwable;

    @InterfaceC38291d(topic = "/futuresTrial/airdropPosition")
    @NotNull
    /* JADX INFO: renamed from: t */
    InterfaceC41634e<FuturesAirdropProfitEntity> mo100568t(@InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, FuturesAirdropProfitEntity> interfaceC41975c);

    @POST("v2/trial/order")
    @NotNull
    /* JADX INFO: renamed from: w */
    Observable<BaseEntity<Object>> mo100569w(@Body @NotNull SubmitTrialData submitTrialData, @Header("X-VALIDATION-TOKEN") @Nullable String str) throws Throwable;

    @GET("v1/leadTrading/app/trialFund/getUsableWelfareCoupons")
    @Nullable
    /* JADX INFO: renamed from: x */
    FuturesWelfareComposeEntity mo100570x() throws Throwable;

    @FormUrlEncoded
    @POST("v1/trial/active")
    @Nullable
    /* JADX INFO: renamed from: z */
    Object mo100571z(@Field("code") @NotNull String str, @Field("side") @Nullable String str2) throws Throwable;

    /* JADX INFO: renamed from: j */
    static /* synthetic */ boolean m100550j(InterfaceC45544a interfaceC45544a, String str, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchRewardConfig");
        }
        if ((i11 & 1) != 0) {
            str = C5276j.m6247f();
            Intrinsics.checkNotNullExpressionValue(str, "getUniqueDeviceId(...)");
        }
        return interfaceC45544a.mo100559g(str);
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ Object m100551n(InterfaceC45544a interfaceC45544a, String str, String str2, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitActivateTrial");
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return interfaceC45544a.mo100571z(str, str2);
    }

    /* JADX INFO: renamed from: s */
    static /* synthetic */ FuturesWelfareTrialEntity m100552s(InterfaceC45544a interfaceC45544a, String str, int i11, int i12, String str2, int i13, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchTrialList");
        }
        if ((i13 & 8) != 0) {
            str2 = null;
        }
        return interfaceC45544a.mo100558f(str, i11, i12, str2);
    }
}
