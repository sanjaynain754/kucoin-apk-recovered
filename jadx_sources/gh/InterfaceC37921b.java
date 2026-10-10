package gh;

import com.kubi.kumex.data.platform.model.AllContractLeverageUpdateRequest;
import com.kubi.kumex.data.platform.model.GrayCrossModeEntity;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
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

/* JADX INFO: renamed from: gh.b */
/* JADX INFO: compiled from: ISelfCrossApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H'J \u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\b\u0003\u0010\t\u001a\u00020\u0007H'J\u001e\u0010\n\u001a\u00020\u000b2\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H'J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\u0007H'J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H'J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0011\u001a\u00020\u0014H'J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\u0007H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/cross/api/ISelfCrossApi;", "", "fetchSelfAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchMarginMode", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "symbol", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "submitCrossLeverage", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "submitAllContractsLeverage", "Lcom/kubi/kumex/data/platform/model/AllContractLeverageUpdateRequest;", "fetchSelfActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37921b {
    @POST("v1/km/contract/all/leverage/update")
    @Nullable
    /* JADX INFO: renamed from: D */
    Object m85761D(@Body @NotNull AllContractLeverageUpdateRequest allContractLeverageUpdateRequest) throws Throwable;

    @GET("v2/km/trade/orders/activeOrderStatistics")
    @NotNull
    /* JADX INFO: renamed from: E */
    CrossHedgeQtyMarginEntity m85762E(@NotNull @Query("symbols") String str);

    @GET("v2/km/position/queryMarginModeV2")
    @NotNull
    /* JADX INFO: renamed from: a */
    Map<String, MarginModeInfoEntity> m85763a(@NotNull @Query("symbol") String str) throws Throwable;

    @POST("v2/km/position/changeMarginMode")
    @NotNull
    /* JADX INFO: renamed from: b */
    ModifyMarginModeResultEntity m85764b(@Body @NotNull Map<String, String> map) throws Throwable;

    @POST("v2/km/trade/configs/changeCrossUserLeverage")
    /* JADX INFO: renamed from: c */
    boolean m85765c(@Body @NotNull SubmitCrossLeverageEntity submitCrossLeverageEntity) throws Throwable;

    @GET("v1/km/contract/cross/gray")
    @NotNull
    /* JADX INFO: renamed from: e */
    GrayCrossModeEntity m85766e(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v2/km/position/getSwitchableContracts")
    @Nullable
    /* JADX INFO: renamed from: g */
    List<QuoteEntity> m85767g() throws Throwable;
}
