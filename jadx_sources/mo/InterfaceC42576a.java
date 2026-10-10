package mo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.loan.repo.trade.model.LeverManualBorrow;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: renamed from: mo.a */
/* JADX INFO: compiled from: ITradeApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/loan/repo/trade/ITradeApi;", "", "submitLeverManualBorrow", "Lcom/kubi/loan/repo/trade/model/LeverManualBorrow;", FirebaseAnalytics.Param.CURRENCY, "", "amount", "maxRate", "strategy", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42576a {
    @FormUrlEncoded
    @POST("v1/borrow/loan")
    @NotNull
    /* JADX INFO: renamed from: a */
    LeverManualBorrow mo93340a(@Field(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @Field("size") @NotNull String str2, @Field("maxRate") @Nullable String str3, @Field("borrowStrategy") @NotNull String str4) throws Exception;

    /* JADX INFO: renamed from: b */
    static /* synthetic */ LeverManualBorrow m93339b(InterfaceC42576a interfaceC42576a, String str, String str2, String str3, String str4, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitLeverManualBorrow");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        if ((i11 & 8) != 0) {
            str4 = AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC;
        }
        return interfaceC42576a.mo93340a(str, str2, str3, str4);
    }
}
