package p436lo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.loan.api.entity.LeverCoinConfig;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: lo.a */
/* JADX INFO: compiled from: IPlatformApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H'J \u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/loan/repo/platform/IPlatformApi;", "", "fetchLeverCoinConfig", "", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "needRate", "", "fetchLeverCoinConfigV2", "fetchReferRate", "Ljava/math/BigDecimal;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42278a {
    @GET("v1/margin/loan/order/query-refer-rate")
    @NotNull
    /* JADX INFO: renamed from: a */
    BigDecimal mo92796a(@Nullable @Query("amount") String str, @Nullable @Query(FirebaseAnalytics.Param.CURRENCY) String str2) throws Exception;

    @GET("v1/margin/currencies")
    @NotNull
    /* JADX INFO: renamed from: d */
    List<LeverCoinConfig> mo92797d(@Query("needRate") boolean z11) throws Exception;

    @GET("v2/margin/currencies")
    @NotNull
    /* JADX INFO: renamed from: h */
    List<LeverCoinConfig> mo92798h(@Query("needRate") boolean z11) throws Exception;

    /* JADX INFO: renamed from: g */
    static /* synthetic */ List m92795g(InterfaceC42278a interfaceC42278a, boolean z11, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchLeverCoinConfig");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return interfaceC42278a.mo92797d(z11);
    }
}
