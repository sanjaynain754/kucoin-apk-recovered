package gf;

import com.kubi.data.entity.AlphaCurrencyEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfCoinEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: gf.h */
/* JADX INFO: compiled from: CoinApi.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC37884h {
    @GET("v2/currencies-balance-sorted")
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<ArrayList<CoinInfoEntity>>> m85557d();

    @GET("v1/mobile/alpha/currencies")
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<AlphaCurrencyEntity> m85558e(@Query("timeline") Long l11);

    @GET("v1/margin-fund/fund/currency/condition/list")
    /* JADX INFO: renamed from: f */
    Observable<BaseEntity<ArrayList<EtfCoinEntity>>> m85559f();

    @GET("v1/symbols")
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<ArrayList<SymbolInfoEntity>>> m85560g(@Query("timeline") Long l11, @Query("containsOff") Boolean bool, @Header("Ignore-Stage") boolean z11);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    Observable<BaseEntity<ArrayList<TradeItemBean>>> getMarketSymbol(@Query("quote") String str, @Header("User-Agent") String str2);

    @GET("v1/kc/order/minimum-funds")
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<Map<String, BigDecimal>>> m85561h();
}
