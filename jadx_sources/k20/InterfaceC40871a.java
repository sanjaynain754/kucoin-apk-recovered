package k20;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import java.util.ArrayList;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: renamed from: k20.a */
/* JADX INFO: compiled from: AssetV2Api.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'J\u001e\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/assets/AssetV2Api;", "", "tradeBalances", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "Lkotlin/collections/ArrayList;", "digitCurrency", "", "fiatCurrency", "mainBalances", "fetchFlashTradeByCurrency", "", FirebaseAnalytics.Param.CURRENCY, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC40871a {
    @GET("v2/account/main-balances")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<ArrayList<AccountItemEntity>> m89458d();

    @GET("v1/api-reaper/flash-trade/valid-enter/{currency}")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<Boolean> m89459e(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str);

    @GET("v2/account/trade-balances")
    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41634e<ArrayList<AccountItemEntity>> m89460j(@Nullable @Query("digitCurrency") String str, @Nullable @Query("fiatCurrency") String str2);
}
