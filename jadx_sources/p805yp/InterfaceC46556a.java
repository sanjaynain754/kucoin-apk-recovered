package p805yp;

import androidx.credentials.provider.CredentialEntry;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.ArrayList;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: yp.a */
/* JADX INFO: compiled from: MarketMonitorApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H'JD\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\nH'J(\u0010\u000e\u001a\u00020\u000f2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\nH'J0\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'J0\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u00032\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/api/MarketMonitorApi;", "", "getQuotes", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/spot/entity/MarketsEntity;", "getTradeTicker", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "", "from", "header", "ignore", "getTradeTickerFloatingWindowVM", "Lokhttp3/Request;", "getTradeDataBySymbols", "getMarketSymbol", "quotes", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46556a {
    @Headers({"Cache-Time: 3000", "SELF-UA: true"})
    @GET("v1/market/tickers")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m102702b(@Nullable @Query("symbol") String str, @Header("User-Agent") @NotNull String str2, @Header("noNeedToken") @NotNull String str3, @Header("Ignore-Stage") @NotNull String str4);

    @Headers({"Cache-Time: 3000", "SELF-UA: true"})
    @GET("v1/market/tickers")
    @NotNull
    /* JADX INFO: renamed from: d */
    Request m102703d(@Nullable @Query("symbol") String str, @Header("User-Agent") @NotNull String str2, @Header("noNeedToken") @NotNull String str3);

    /* JADX INFO: renamed from: a */
    static /* synthetic */ Request m102700a(InterfaceC46556a interfaceC46556a, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeTickerFloatingWindowVM");
        }
        if ((i11 & 4) != 0) {
            str3 = CredentialEntry.TRUE_STRING;
        }
        return interfaceC46556a.m102703d(str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Observable m102701c(InterfaceC46556a interfaceC46556a, String str, String str2, String str3, String str4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeTicker");
        }
        if ((i11 & 4) != 0) {
            str3 = CredentialEntry.TRUE_STRING;
        }
        if ((i11 & 8) != 0) {
            str4 = CredentialEntry.FALSE_STRING;
        }
        return interfaceC46556a.m102702b(str, str2, str3, str4);
    }
}
