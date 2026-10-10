package p692vh;

import androidx.media3.extractor.text.ttml.TtmlNode;
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
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.restful.C19321b;
import com.kubi.restful.C23198n;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27100x0;
import com.tencent.bugly.proguard.C33577c3;
import er.C37237b;
import gr.C38000b;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41975c;
import mr.C42597a;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import th.InterfaceC44978c;

/* JADX INFO: renamed from: vh.h */
/* JADX INFO: compiled from: TrialServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J$\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020!H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020!0%H\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160(H\u0016J&\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0*2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010\u001c0,H\u0016J\u0010\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0*H\u0016J\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000(2\u0006\u00102\u001a\u000203H\u0016J&\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050*2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u0001050,H\u0016J\f\u00106\u001a\u00020\u001c*\u000207H\u0002J\u0010\u00108\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u0018H\u0002J\u0015\u00109\u001a\u0004\u0018\u00010:2\b\b\u0001\u0010;\u001a\u00020\u0018H\u0097\u0001J)\u0010<\u001a\u0004\u0018\u00010=2\b\b\u0001\u0010>\u001a\u00020\u00182\b\b\u0001\u0010?\u001a\u00020@2\b\b\u0001\u0010A\u001a\u00020@H\u0097\u0001J\u0013\u0010B\u001a\u0002072\b\b\u0001\u0010\u001d\u001a\u00020\u0018H\u0097\u0001J)\u0010C\u001a\u0004\u0018\u00010D2\b\b\u0001\u0010>\u001a\u00020\u00182\b\b\u0001\u0010?\u001a\u00020@2\b\b\u0001\u0010A\u001a\u00020@H\u0097\u0001J\u000b\u0010E\u001a\u0004\u0018\u00010\u0016H\u0097\u0001J\u0015\u0010F\u001a\u0004\u0018\u00010G2\b\b\u0001\u0010\u0019\u001a\u00020\u0018H\u0097\u0001J5\u0010H\u001a\u0004\u0018\u00010=2\b\b\u0001\u0010>\u001a\u00020\u00182\b\b\u0001\u0010?\u001a\u00020@2\b\b\u0001\u0010A\u001a\u00020@2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0097\u0001J\u0015\u0010I\u001a\u0004\u0018\u00010J2\b\b\u0001\u0010K\u001a\u00020\u0018H\u0097\u0001J!\u0010L\u001a\u0004\u0018\u0001012\b\b\u0001\u0010\u001d\u001a\u00020\u00182\n\b\u0001\u0010M\u001a\u0004\u0018\u00010\u0018H\u0097\u0001J+\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000(2\b\b\u0001\u00102\u001a\u0002032\n\b\u0001\u0010O\u001a\u0004\u0018\u00010\u0018H\u0097\u0001J\u0015\u0010P\u001a\u0004\u0018\u0001012\b\b\u0001\u0010Q\u001a\u00020RH\u0097\u0001J\u0015\u0010S\u001a\u0004\u0018\u0001012\b\b\u0001\u0010;\u001a\u00020\u0018H\u0097\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0012\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\f¨\u0006T"}, m90084d2 = {"Lcom/kubi/futures/data/trial/TrialServiceImpl;", "Lcom/kubi/futures/data/trial/ITrialService;", "Lcom/kubi/futures/data/trial/ITrialApi;", "tradeBaseApi", "<init>", "(Lcom/kubi/futures/data/trial/ITrialApi;)V", "()V", "platformMemory", "Lcom/kubi/futures/data/platform/IPlatformMemory;", "flowApi", "kotlin.jvm.PlatformType", "getFlowApi", "()Lcom/kubi/futures/data/trial/ITrialApi;", "flowApi$delegate", "Lkotlin/Lazy;", "defaultApi", "getDefaultApi", "defaultApi$delegate", "wsApi", "getWsApi", "wsApi$delegate", "fetchWelfareComposeList", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeEntity;", FirebaseAnalytics.Param.CURRENCY, "", "symbol", "prizeType", "fetchTrialDetails", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "id", "loadRewardConfig", "", "fetchRewardConfig", "", C33577c3.f69334H, "getRewardConfig", "observeRewardConfig", "Lio/reactivex/Flowable;", "getFuturesWelfare2", "observeFuturesWelfare2", "Lio/reactivex/Observable;", "obsDistributionData", "Lkotlinx/coroutines/flow/Flow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "fetchDistributionData", "submitDistribution", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "submitTrialData", "Lcom/kubi/futures/data/trial/SubmitTrialData;", "obsAirdropRealisedData", "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "toTrialEntity", "Lcom/kubi/futures/data/trial/CopyTradingTrialDetailsEntity;", "toTrialStatus", "airdropPopWindowInfo", "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "code", "fetchAirdropList", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialEntity;", "status", "currentPage", "", "pageSize", "fetchCopyTrialDetails", "fetchCouponList", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponEntity;", "fetchLeadTradingWelfareComposeList", "fetchTradeProUserJoinChallenge", "Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;", "fetchTrialList", "fetchTrialWithDrawPopupInfo", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "popupCode", "submitActivateTrial", "side", "submitDistributionV2", "validationToken", "submitLeadTradingActivateTrial", TtmlNode.TAG_BODY, "Lcom/kubi/futures/data/trial/LeadTradingActivateTrialRequest;", "submitTrialWithdraw", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45551h implements InterfaceC45545b, InterfaceC45544a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC45544a f102638a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC44978c f102639b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f102640c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f102641d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f102642e;

    public C45551h(@NotNull InterfaceC45544a tradeBaseApi) {
        Intrinsics.checkNotNullParameter(tradeBaseApi, "tradeBaseApi");
        this.f102638a = tradeBaseApi;
        this.f102639b = (InterfaceC44978c) new C23198n.a().m55669a().m55665b(InterfaceC44978c.class);
        this.f102640c = LazyKt.lazy(new Function0() { // from class: vh.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45551h.m100583H();
            }
        });
        this.f102641d = LazyKt.lazy(new Function0() { // from class: vh.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45551h.m100582G();
            }
        });
        this.f102642e = LazyKt.lazy(new Function0() { // from class: vh.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45551h.m100586P();
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m100585M(C45551h c45551h) throws Throwable {
        InterfaceC45544a.m100550j(c45551h, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m100584L(final C45551h c45551h) {
        C27100x0.m66923d(new Function0() { // from class: vh.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45551h.m100585M(this.f102637b);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static final InterfaceC45544a m100586P() {
        return (InterfaceC45544a) new C19321b.a().m42777b(new C38000b(C37237b.m83279b())).m42776a().m42772b(InterfaceC45544a.class);
    }

    @Override // p692vh.InterfaceC45544a
    @POST("v1/leadTrading/app/trialFund/activate")
    @Nullable
    /* JADX INFO: renamed from: A */
    public Object mo100553A(@Body @NotNull LeadTradingActivateTrialRequest body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return this.f102638a.mo100553A(body);
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC45544a m100587I() {
        return (InterfaceC45544a) this.f102641d.getValue();
    }

    /* JADX INFO: renamed from: J */
    public final InterfaceC45544a m100588J() {
        return (InterfaceC45544a) this.f102640c.getValue();
    }

    /* JADX INFO: renamed from: K */
    public final InterfaceC45544a m100589K() {
        return (InterfaceC45544a) this.f102642e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00aa A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: O */
    public final String m100591O(String str) {
        String upperCase;
        if (str != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            upperCase = str.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        if (upperCase == null) {
            return str;
        }
        switch (upperCase.hashCode()) {
            case -1836143820:
                if (upperCase.equals("SWITCH")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case -1617199657:
                if (upperCase.equals("INVALID")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case -1303979599:
                return !upperCase.equals("ACTIVATED") ? str : "ACTIVATE_FINISHED";
            case -917017009:
                return !upperCase.equals("FINISHING") ? str : "USE_FINISHED";
            case -873347853:
                return !upperCase.equals("ACTIVATE") ? str : "ACTIVATE_FINISHED";
            case -591252731:
                if (upperCase.equals("EXPIRED")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case -7811023:
                if (upperCase.equals("RECYCLED")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case 68795:
                return !upperCase.equals("END") ? str : "USE_FINISHED";
            case 72642:
                return !upperCase.equals("ING") ? str : "USE_FINISHED";
            case 2252048:
                return !upperCase.equals("INIT") ? str : "SEND_FINISHED";
            case 2614205:
                return !upperCase.equals("USED") ? str : "USE_FINISHED";
            case 1800863347:
                if (upperCase.equals("RECYCLE")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            case 1925346054:
                return !upperCase.equals("ACTIVE") ? str : "ACTIVATE_FINISHED";
            case 2059137311:
                if (upperCase.equals("EXPIRE")) {
                    return "RECYCLE_FINISHED";
                }
                return str;
            default:
                return str;
        }
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/deduction/coupon/getUserCoupons")
    @Nullable
    /* JADX INFO: renamed from: a */
    public FuturesWelfareCouponEntity mo100554a(@NotNull @Query("status") String status, @Query("pageNum") int i11, @Query("pageSize") int i12) {
        Intrinsics.checkNotNullParameter(status, "status");
        return this.f102638a.mo100554a(status, i11, i12);
    }

    @Override // p692vh.InterfaceC45544a
    @FormUrlEncoded
    @POST("v1/trial/couponWithDraw")
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo100555b(@Field("code") @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f102638a.mo100555b(code);
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/km/trial/getUserAirdropPositionCouponList")
    @Nullable
    /* JADX INFO: renamed from: d */
    public FuturesWelfareTrialEntity mo100556d(@NotNull @Query("status") String status, @Query("currentPage") int i11, @Query("pageSize") int i12) {
        Intrinsics.checkNotNullParameter(status, "status");
        return this.f102638a.mo100556d(status, i11, i12);
    }

    @Override // p692vh.InterfaceC45544a
    @Nullable
    /* JADX INFO: renamed from: e */
    public FuturesWelfareComposeEntity mo100557e(@NotNull String currency, @NotNull String symbol, @Nullable String str) throws Throwable {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        FuturesWelfareComposeEntity futuresWelfareComposeEntityMo100557e = this.f102638a.mo100557e(currency, symbol, str);
        if (futuresWelfareComposeEntityMo100557e == null) {
            return null;
        }
        InterfaceC44978c.m99468e0(this.f102639b, futuresWelfareComposeEntityMo100557e, null, null, 6, null);
        return futuresWelfareComposeEntityMo100557e;
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/trial/getUserTrialCouponList")
    @Nullable
    /* JADX INFO: renamed from: f */
    public FuturesWelfareTrialEntity mo100558f(@NotNull @Query("status") String status, @Query("currentPage") int i11, @Query("pageSize") int i12, @Nullable @Query("prizeType") String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        return this.f102638a.mo100558f(status, i11, i12, str);
    }

    @Override // p692vh.InterfaceC45544a
    /* JADX INFO: renamed from: g */
    public boolean mo100559g(@NotNull String deviceId) throws Throwable {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        boolean zMo100559g = (!kuMexDepend.m35905g().c() || kuMexDepend.m35906h()) ? false : this.f102638a.mo100559g(deviceId);
        InterfaceC44978c.m99465Z(this.f102639b, zMo100559g, null, null, 6, null);
        return zMo100559g;
    }

    @Override // p692vh.InterfaceC45544a
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC41634e<FuturesWelfareTrialItemEntity> mo100560h(@NotNull InterfaceC41975c<SubscribeMessage, FuturesWelfareTrialItemEntity> convert) {
        Intrinsics.checkNotNullParameter(convert, "convert");
        return m100589K().mo100560h(convert);
    }

    @Override // p692vh.InterfaceC45544a
    @NotNull
    /* JADX INFO: renamed from: i */
    public Observable<BaseEntity<Object>> mo100561i(@NotNull SubmitTrialData submitTrialData) {
        Intrinsics.checkNotNullParameter(submitTrialData, "submitTrialData");
        String validationToken = submitTrialData.getValidationToken();
        return (validationToken == null || validationToken.length() == 0) ? m100587I().mo100561i(submitTrialData) : m100587I().mo100569w(submitTrialData, submitTrialData.getValidationToken());
    }

    @Override // p692vh.InterfaceC45545b
    /* JADX INFO: renamed from: l */
    public boolean mo100573l() {
        return InterfaceC44978c.m99481o(this.f102639b, null, null, 3, null);
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/km/trial/getUserJoinChallenge")
    @Nullable
    /* JADX INFO: renamed from: m */
    public UserJoinChallengeEntity mo100563m(@NotNull @Query("symbol") String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return this.f102638a.mo100563m(symbol);
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/copyTrading/app/getUserTrialCouponById")
    @NotNull
    /* JADX INFO: renamed from: o */
    public CopyTradingTrialDetailsEntity mo100564o(@NotNull @Query("id") String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f102638a.mo100564o(id2);
    }

    @Override // p692vh.InterfaceC45544a
    @NotNull
    /* JADX INFO: renamed from: p */
    public FuturesWelfareTrialItemEntity mo100565p(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return KuMexDepend.f30378a.m35900b().mo20635p() ? m100590N(this.f102638a.mo100564o(id2)) : this.f102638a.mo100565p(id2);
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/km/trial/airdrop-position-pop-up-window")
    @Nullable
    /* JADX INFO: renamed from: q */
    public AirdropBonusEntity mo100566q(@NotNull @Query("code") String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.f102638a.mo100566q(code);
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/kumex/popups")
    @Nullable
    /* JADX INFO: renamed from: r */
    public FuturesWelfareTrialWithDrawPopupInfoEntity mo100567r(@NotNull @Query("popupCode") String popupCode) {
        Intrinsics.checkNotNullParameter(popupCode, "popupCode");
        return this.f102638a.mo100567r(popupCode);
    }

    @Override // p692vh.InterfaceC45544a
    @NotNull
    /* JADX INFO: renamed from: t */
    public InterfaceC41634e<FuturesAirdropProfitEntity> mo100568t(@NotNull InterfaceC41975c<SubscribeMessage, FuturesAirdropProfitEntity> convert) {
        Intrinsics.checkNotNullParameter(convert, "convert");
        return m100589K().mo100568t(convert);
    }

    @Override // p692vh.InterfaceC45545b
    @NotNull
    /* JADX INFO: renamed from: u */
    public FuturesWelfareComposeEntity mo100574u() {
        return InterfaceC44978c.m99467d0(this.f102639b, null, null, 3, null);
    }

    @Override // p692vh.InterfaceC45545b
    @NotNull
    /* JADX INFO: renamed from: v */
    public Observable<FuturesWelfareComposeEntity> mo100575v() {
        return InterfaceC44978c.m99474i0(this.f102639b, null, null, 3, null);
    }

    @Override // p692vh.InterfaceC45544a
    @POST("v2/trial/order")
    @NotNull
    /* JADX INFO: renamed from: w */
    public Observable<BaseEntity<Object>> mo100569w(@Body @NotNull SubmitTrialData submitTrialData, @Header("X-VALIDATION-TOKEN") @Nullable String str) {
        Intrinsics.checkNotNullParameter(submitTrialData, "submitTrialData");
        return this.f102638a.mo100569w(submitTrialData, str);
    }

    @Override // p692vh.InterfaceC45544a
    @GET("v1/leadTrading/app/trialFund/getUsableWelfareCoupons")
    @Nullable
    /* JADX INFO: renamed from: x */
    public FuturesWelfareComposeEntity mo100570x() {
        return this.f102638a.mo100570x();
    }

    @Override // p692vh.InterfaceC45545b
    @NotNull
    /* JADX INFO: renamed from: y */
    public Flowable<Boolean> mo100576y() {
        return InterfaceC44978c.m99462W(this.f102639b, null, null, 3, null);
    }

    @Override // p692vh.InterfaceC45544a
    @FormUrlEncoded
    @POST("v1/trial/active")
    @Nullable
    /* JADX INFO: renamed from: z */
    public Object mo100571z(@Field("code") @NotNull String id2, @Field("side") @Nullable String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f102638a.mo100571z(id2, str);
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC45544a m100582G() {
        return (InterfaceC45544a) C42597a.m93386b().create(InterfaceC45544a.class);
    }

    /* JADX INFO: renamed from: H */
    public static final InterfaceC45544a m100583H() {
        return (InterfaceC45544a) C42597a.m93388d().create(InterfaceC45544a.class);
    }

    /* JADX INFO: renamed from: N */
    public final FuturesWelfareTrialItemEntity m100590N(CopyTradingTrialDetailsEntity copyTradingTrialDetailsEntity) {
        String rewardId;
        String string;
        Long id2 = copyTradingTrialDetailsEntity.getId();
        if (id2 == null || (rewardId = id2.toString()) == null) {
            rewardId = copyTradingTrialDetailsEntity.getRewardId();
        }
        String str = rewardId;
        String strM100591O = m100591O(copyTradingTrialDetailsEntity.getStatus());
        Long expireTime = copyTradingTrialDetailsEntity.getExpireTime();
        Long expireTime2 = copyTradingTrialDetailsEntity.getExpireTime();
        Long expireTime3 = copyTradingTrialDetailsEntity.getExpireTime();
        BigDecimal amount = copyTradingTrialDetailsEntity.getAmount();
        String trialFundType = copyTradingTrialDetailsEntity.getTrialFundType();
        BigDecimal withdrawThresholdTrade = copyTradingTrialDetailsEntity.getWithdrawThresholdTrade();
        BigDecimal maxWithdrawAmount = copyTradingTrialDetailsEntity.getMaxWithdrawAmount();
        BigDecimal maxLeverage = copyTradingTrialDetailsEntity.getMaxLeverage();
        BigDecimal amount2 = copyTradingTrialDetailsEntity.getAmount();
        BigDecimal withdrawThresholdProfit = copyTradingTrialDetailsEntity.getWithdrawThresholdProfit();
        BigDecimal profitAmount = copyTradingTrialDetailsEntity.getProfitAmount();
        BigDecimal tradeAmount = copyTradingTrialDetailsEntity.getTradeAmount();
        Integer useDurition = copyTradingTrialDetailsEntity.getUseDurition();
        List<String> supportContract = copyTradingTrialDetailsEntity.getSupportContract();
        Long id3 = copyTradingTrialDetailsEntity.getId();
        if (id3 != null) {
            string = id3.toString();
        } else {
            string = null;
        }
        return new FuturesWelfareTrialItemEntity(str, strM100591O, expireTime, expireTime2, expireTime3, "USDT", amount, null, null, profitAmount, trialFundType, withdrawThresholdTrade, tradeAmount, null, null, maxWithdrawAmount, null, supportContract, null, maxLeverage, amount2, null, null, null, withdrawThresholdProfit, false, null, null, null, useDurition, null, string, copyTradingTrialDetailsEntity.getRewardId(), null, null, null, null, null, 1592091008, 62, null);
    }

    @Override // p692vh.InterfaceC45545b
    /* JADX INFO: renamed from: c */
    public void mo100572c() {
        C42916f.m94127f().scheduleDirect(new Runnable() { // from class: vh.f
            @Override // java.lang.Runnable
            public final void run() {
                C45551h.m100584L(this.f102636b);
            }
        });
    }

    @Override // p692vh.InterfaceC45544a
    @NotNull
    /* JADX INFO: renamed from: k */
    public InterfaceC41634e<FuturesWelfareTrialItemEntity> mo100562k() {
        return m100588J().mo100562k();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C45551h() {
        Object objCreate = C42597a.m93391g().create(InterfaceC45544a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC45544a) objCreate);
    }
}
