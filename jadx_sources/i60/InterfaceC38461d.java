package i60;

import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyLeverageEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.entity.UnifyPriceEntity;
import hr.C38293f;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: i60.d */
/* JADX INFO: compiled from: UnifyPeriodApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0003\u0010\f\u001a\u00020\rH'J$\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u0010H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/api/UnifyPeriodApi;", "", "fetchUnifyIndexPrices", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "", "Lcom/kubi/unify/entity/UnifyPriceEntity;", "fetchUnifyFundsInfo", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "fetchFuturesLeverageList", "Lcom/kubi/unify/entity/UnifyLeverageEntity;", "fetchFuturesPositionList", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "isCalcLiqAndRisk", "", "fetchMarginModes", "", "", "symbol", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38461d {
    @GET("ultra-account/unified/inner/account/account-list")
    @NotNull
    /* JADX INFO: renamed from: a */
    C38293f<List<UnifyFundsInfoEntity>> m86754a();

    @GET("ultra-position/unified/inner/position/leverage-list")
    @NotNull
    /* JADX INFO: renamed from: b */
    C38293f<List<UnifyLeverageEntity>> m86755b();

    @GET("ultra-order/unified/inner/query-margin-currency-indexprice")
    @NotNull
    /* JADX INFO: renamed from: c */
    C38293f<List<UnifyPriceEntity>> m86756c();

    @GET("ultra-position/unified/inner/position/query-margin-mode")
    @NotNull
    /* JADX INFO: renamed from: f */
    C38293f<Map<String, String>> m86757f(@NotNull @Query("symbol") String str);

    @GET("ultra-position/unified/inner/position/position-list")
    @NotNull
    /* JADX INFO: renamed from: g */
    C38293f<List<UnifyPositionEntity>> m86758g(@Query("isCalcLiqAndRisk") boolean z11);

    /* JADX INFO: renamed from: d */
    static /* synthetic */ C38293f m86752d(InterfaceC38461d interfaceC38461d, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchFuturesPositionList");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return interfaceC38461d.m86758g(z11);
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ C38293f m86753e(InterfaceC38461d interfaceC38461d, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchMarginModes");
        }
        if ((i11 & 1) != 0) {
            str = "ALL";
        }
        return interfaceC38461d.m86757f(str);
    }
}
