package i60;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.unify.api.entity.UnifyHourlyRateEntity;
import com.kubi.unify.entity.BorrowConfigEntity;
import com.kubi.unify.entity.CDRConfigEntity;
import com.kubi.unify.entity.EstimateRepay;
import com.kubi.unify.entity.ManualRepayEntity;
import com.kubi.unify.entity.PreRepayRequestBody;
import com.kubi.unify.entity.RepayAsset;
import com.kubi.unify.entity.UnifiedLoanLeverageEntity;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyAccountStatusEntity;
import com.kubi.unify.entity.UnifyAdlRankEntity;
import com.kubi.unify.entity.UnifyAdlRankRequest;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.entity.UnifyConfig;
import com.kubi.unify.entity.UnifyConvertRecordsEntity;
import com.kubi.unify.entity.UnifyInterestRecordsEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: i60.c */
/* JADX INFO: compiled from: UnifyApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J&\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003H'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\u0003H'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\u0003H'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\u00032\b\b\u0001\u0010\u0016\u001a\u00020\bH'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0003\u0010\u0019\u001a\u00020\bH'J@\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c0\u001b2$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001fj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b` H'J@\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u001c0\u001b2$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001fj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b` H'J0\u0010#\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&0\u001c0\u001b2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\bH'J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0003H'J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010+\u001a\u00020,H'J\u001a\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0001\u0010+\u001a\u00020.H'J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u000e2\b\b\u0001\u0010+\u001a\u000201H§@¢\u0006\u0002\u00102J\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u00105\u001a\u00020\bH'J\u0018\u00106\u001a\u0002042\b\b\u0001\u00105\u001a\u00020\bH§@¢\u0006\u0002\u00107J(\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u000e0\u00032\b\b\u0001\u00105\u001a\u00020\b2\b\b\u0003\u0010:\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006;À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/api/UnifyApi;", "", "fetchUnifyAccountStatus", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/unify/entity/UnifyAccountStatusEntity;", "switchUnifyAccountStatus", "map", "", "", "fetchUnifyConfig", "Lcom/kubi/unify/entity/UnifyConfig;", "fetchUnifyExam", "confirmAnswer", "fetchCdrConfig", "", "Lcom/kubi/unify/entity/CDRConfigEntity;", "fetchUserLoanLeverageConfig", "Lcom/kubi/unify/entity/UnifiedLoanLeverageEntity;", "fetchLoanCurrencyConfig", "Lcom/kubi/unify/entity/BorrowConfigEntity;", "fetchUserRiskLimits", "Lcom/kubi/unify/entity/FuturesRiskLimitsConfig;", "symbols", "fetchUnifyAccountOverview", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "balanceCurrency", "fetchConvertRecords", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/unify/entity/UnifyPageEntity;", "Lcom/kubi/unify/entity/UnifyConvertRecordsEntity;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "fetchInterestRecords", "Lcom/kubi/unify/entity/UnifyInterestRecordsEntity;", "fetchTradeDataBySymbols", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "Lkotlin/collections/ArrayList;", "fetchUnifyLiabilityAssetList", "Lcom/kubi/unify/entity/RepayAsset;", "fetchRepaySizePreCalculate", "Lcom/kubi/unify/entity/EstimateRepay;", TtmlNode.TAG_BODY, "Lcom/kubi/unify/entity/PreRepayRequestBody;", "repayManualAccount", "Lcom/kubi/unify/entity/ManualRepayEntity;", "fetchPositionAdlRank", "Lcom/kubi/unify/entity/UnifyAdlRankEntity;", "Lcom/kubi/unify/entity/UnifyAdlRankRequest;", "(Lcom/kubi/unify/entity/UnifyAdlRankRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAvailableBalance", "Lcom/kubi/unify/entity/UnifyBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "fetchAvailableBalanceSuspend", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchHourlyRates", "Lcom/kubi/unify/api/entity/UnifyHourlyRateEntity;", "granularity", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38460c {
    @GET("ultra-account/unified/inner/account/account-overview")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<UnifyAccountOverviewEntity> m86734a(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str);

    @GET("ultra-open-service/unified/inner/open/account-status")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<UnifyAccountStatusEntity> m86735b();

    @POST("ultra-loan/unified/inner/loan/manual-repay")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<Object> m86736c(@Body @NotNull ManualRepayEntity manualRepayEntity) throws Throwable;

    @GET("ultra-order/unified/inner/orders/futures-available")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m86737d(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull Continuation<? super UnifyBalanceEntity> continuation) throws Throwable;

    @GET("ultra-open-service/unified/inner/open/questions")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<String> m86738e();

    @POST("ultra-position/unified/inner/adl-rank")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m86739f(@Body @NotNull UnifyAdlRankRequest unifyAdlRankRequest, @NotNull Continuation<? super List<UnifyAdlRankEntity>> continuation) throws Throwable;

    @POST("ultra-open-service/unified/inner/open/switch")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<Object> m86740g(@Body @NotNull Map<String, String> map);

    @GET("ultra-loan/unified/inner/auto-exchange/record")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<UnifyPageEntity<UnifyConvertRecordsEntity>>> m86741h(@QueryMap @NotNull HashMap<String, String> map);

    @POST("ultra-open-service/unified/inner/open/confirm-answer")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<Object> m86742i();

    @GET("ultra-trade/unified/inner/config/common-conf")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<UnifyConfig> m86743j();

    @GET("ultra-loan/unified/inner/config/loan-currency-config")
    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC41634e<List<BorrowConfigEntity>> m86744k();

    @GET("ultra-loan/unified/inner/loan/hourly-interest-record")
    @NotNull
    /* JADX INFO: renamed from: l */
    Observable<BaseEntity<UnifyPageEntity<UnifyInterestRecordsEntity>>> m86745l(@QueryMap @NotNull HashMap<String, String> map);

    @GET("ultra-loan/unified/inner/account/loan-leverage-list")
    @NotNull
    /* JADX INFO: renamed from: m */
    InterfaceC41634e<List<UnifiedLoanLeverageEntity>> m86746m();

    @POST("ultra-loan/unified/inner/loan/repay-size-pre-calculate")
    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<EstimateRepay> m86747o(@Body @NotNull PreRepayRequestBody preRepayRequestBody) throws Throwable;

    @GET("ultra-loan/unified/inner/loan/getCurrenciesRate")
    @NotNull
    /* JADX INFO: renamed from: q */
    InterfaceC41634e<List<UnifyHourlyRateEntity>> m86748q(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str, @NotNull @Query("granularity") String str2);

    @GET("ultra-order/unified/inner/config/margin-currency-config")
    @NotNull
    /* JADX INFO: renamed from: r */
    InterfaceC41634e<List<CDRConfigEntity>> m86749r();

    @GET("ultra-loan/unified/inner/loan/query-manual-repay-info")
    @NotNull
    /* JADX INFO: renamed from: s */
    InterfaceC41634e<RepayAsset> m86750s();

    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m86751t(@Nullable @Query("symbols") String str);

    /* JADX INFO: renamed from: n */
    static /* synthetic */ InterfaceC41634e m86732n(InterfaceC38460c interfaceC38460c, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchHourlyRates");
        }
        if ((i11 & 2) != 0) {
            str2 = "hour";
        }
        return interfaceC38460c.m86748q(str, str2);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ InterfaceC41634e m86733p(InterfaceC38460c interfaceC38460c, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUnifyAccountOverview");
        }
        if ((i11 & 1) != 0) {
            str = "USD";
        }
        return interfaceC38460c.m86734a(str);
    }
}
