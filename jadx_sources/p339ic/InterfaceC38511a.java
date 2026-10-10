package p339ic;

import com.appsflyer.AppsFlyerProperties;
import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ic.a */
/* JADX INFO: compiled from: IPositionApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u0004H'J\u0012\u0010\u0005\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u0004H'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\u0004H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\u0004H'J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/position/api/IPositionApi;", "", "closeAllPosition", AppsFlyerProperties.CHANNEL, "", "closeAllTrialPosition", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "fetchTrialPositionBySymbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38511a {
    @GET("v1/copyTrading/exchange/futures/kyc-guide/leverage")
    @Nullable
    /* JADX INFO: renamed from: a */
    KycLeverageEntity m87112a(@NotNull @Query("symbol") String str, @NotNull @Query("marginMode") String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/futures/orders/closeAllPosition")
    @NotNull
    /* JADX INFO: renamed from: b */
    Object m87113b(@Field(AppsFlyerProperties.CHANNEL) @NotNull String str) throws Throwable;

    @GET("v2/copyTrading/exchange/position/position")
    @NotNull
    /* JADX INFO: renamed from: c */
    List<PositionEntity> m87114c(@NotNull @Query("symbol") String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/futures/orders/closeAllTrialPosition")
    @NotNull
    /* JADX INFO: renamed from: d */
    Object m87115d(@Field(AppsFlyerProperties.CHANNEL) @NotNull String str) throws Throwable;

    @GET("v2/copyTrading/exchange/position/trialPosition")
    @NotNull
    /* JADX INFO: renamed from: e */
    List<PositionEntity> m87116e(@NotNull @Query("symbol") String str) throws Throwable;
}
