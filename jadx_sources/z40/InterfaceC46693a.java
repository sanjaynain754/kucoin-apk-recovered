package z40;

import com.google.firebase.analytics.FirebaseAnalytics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: renamed from: z40.a */
/* JADX INFO: compiled from: ITradingBotSocket.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J \u0010\u0006\u001a\u00020\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005H'J(\u0010\t\u001a\u00020\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\f\u001a\u00020\u0005H'J\u0012\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/socket/ITradingBotSocket;", "", "getOrderBookCenter", "Lokhttp3/Request;", "symbol", "", "getCurrencyBalance", "accountType", FirebaseAnalytics.Param.CURRENCY, "getTradeTickerByFreshman", "symbols", "from", "header", "getTicker", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46693a {
    @FormUrlEncoded
    @POST("v1/account/currency-balance")
    @NotNull
    /* JADX INFO: renamed from: f */
    Request m102931f(@Field("accountType") @Nullable String str, @Field(FirebaseAnalytics.Param.CURRENCY) @Nullable String str2);
}
