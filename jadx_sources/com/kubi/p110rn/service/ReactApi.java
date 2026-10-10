package com.kubi.p110rn.service;

import com.kubi.data.entity.TradeItemBean;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: compiled from: ReactApi.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u0007H'J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/rn/service/ReactApi;", "", "getMarketSymbol", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/data/entity/TradeItemBean;", "quotes", "", "from", "addFavorSymbol", "symbol", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ReactApi {
    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/spot")
    @NotNull
    InterfaceC41634e<Object> addFavorSymbol(@Field("symbols") @Nullable String str);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    InterfaceC41634e<List<TradeItemBean>> getMarketSymbol(@Nullable @Query("quote") String str, @Header("User-Agent") @NotNull String str2);

    static /* synthetic */ InterfaceC41634e getMarketSymbol$default(ReactApi reactApi, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketSymbol");
        }
        if ((i11 & 2) != 0) {
            str2 = "RN";
        }
        return reactApi.getMarketSymbol(str, str2);
    }
}
