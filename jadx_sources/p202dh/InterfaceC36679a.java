package p202dh;

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

/* JADX INFO: renamed from: dh.a */
/* JADX INFO: compiled from: ISelfPositionApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u0004H'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\u0004H'J\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/common/positon/api/ISelfPositionApi;", "", "closeAllPosition", AppsFlyerProperties.CHANNEL, "", "fetchPositionBySymbol", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "symbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC36679a {
    @GET("v2/km/trade/configs/kyc-guide/leverage")
    @Nullable
    /* JADX INFO: renamed from: a */
    KycLeverageEntity m82104a(@NotNull @Query("symbol") String str, @NotNull @Query("marginMode") String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v2/km/orders/closeAllPosition")
    @NotNull
    /* JADX INFO: renamed from: b */
    Object m82105b(@Field(AppsFlyerProperties.CHANNEL) @NotNull String str) throws Throwable;

    @GET("v2/km/position")
    @NotNull
    /* JADX INFO: renamed from: c */
    List<PositionEntity> m82106c(@NotNull @Query("symbol") String str) throws Throwable;
}
