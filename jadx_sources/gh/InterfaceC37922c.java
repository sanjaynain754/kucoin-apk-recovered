package gh;

import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.ModifyMarginModeResultEntity;
import com.kubi.kumex.data.platform.model.SubmitCrossLeverageEntity;
import com.kubi.kumex.data.trade.model.CrossHedgeQtyMarginEntity;
import com.kubi.kumex.data.trade.model.QuoteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: gh.c */
/* JADX INFO: compiled from: ITrialCrossApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H'J \u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\u0007H'J\u001e\u0010\t\u001a\u00020\n2\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H'J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H'J\u0012\u0010\u0012\u001a\u00020\u00132\b\b\u0003\u0010\u0014\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/api/ITrialCrossApi;", "", "fetchTrialAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchMarginMode", "", "", "symbol", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "submitCrossLeverage", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "fetchTrialActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37922c {
    @GET("v2/km/trial/position/queryMarginMode")
    @NotNull
    /* JADX INFO: renamed from: a */
    Map<String, String> m85768a(@NotNull @Query("symbol") String str) throws Throwable;

    @POST("v2/km/trial/position/changeMarginMode")
    @NotNull
    /* JADX INFO: renamed from: b */
    ModifyMarginModeResultEntity m85769b(@Body @NotNull Map<String, String> map) throws Throwable;

    @POST("v2/km/trial/trade/configs/changeCrossUserLeverage")
    /* JADX INFO: renamed from: c */
    boolean m85770c(@Body @NotNull SubmitCrossLeverageEntity submitCrossLeverageEntity) throws Throwable;

    @GET("v1/km/contract/trial/cross/gray")
    @NotNull
    /* JADX INFO: renamed from: e */
    GrayCrossModeEntity m85771e(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/km/position/trial/getSwitchableContracts")
    @Nullable
    /* JADX INFO: renamed from: f */
    List<QuoteEntity> m85772f() throws Throwable;

    @GET("v2/km/trial/trade/orders/activeOrderStatistics")
    @NotNull
    /* JADX INFO: renamed from: h */
    CrossHedgeQtyMarginEntity m85773h(@NotNull @Query("symbols") String str) throws Throwable;
}
