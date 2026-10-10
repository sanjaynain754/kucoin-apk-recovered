package p400kc;

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

/* JADX INFO: renamed from: kc.a */
/* JADX INFO: compiled from: ICrossApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H'J\u0012\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H'J \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\b\b\u0003\u0010\n\u001a\u00020\bH'J \u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\b\b\u0003\u0010\n\u001a\u00020\bH'J\u001e\u0010\f\u001a\u00020\r2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u001e\u0010\u000f\u001a\u00020\r2\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\bH'J\u0012\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\bH'J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\u0012\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\bH'J\u0012\u0010\u001b\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/cross/ICrossApi;", "", "fetchSelfAllContractsMarginMode", "", "Lcom/kubi/kumex/data/trade/model/QuoteEntity;", "fetchTrialAllContractsMarginMode", "fetchMarginMode", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "symbol", "fetchTrialMarginMode", "submitMarginMode", "Lcom/kubi/kumex/data/platform/model/ModifyMarginModeResultEntity;", "map", "submitTrialMarginMode", "fetchCrossModeGray", "Lcom/kubi/kumex/data/platform/model/GrayCrossModeEntity;", "fetchTrialCrossModeGray", "submitCrossLeverage", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/SubmitCrossLeverageEntity;", "submitTrialCrossLeverage", "fetchActiveOrderStatistics", "Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMarginEntity;", "symbols", "fetchTrialActiveOrderStatistics", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC40973a {
    @GET("v1/copyTrading/exchange/position/queryMarginModeV2")
    @NotNull
    /* JADX INFO: renamed from: a */
    Map<String, MarginModeInfoEntity> m89723a(@NotNull @Query("symbol") String str) throws Throwable;

    @POST("v1/copyTrading/exchange/position/changeMarginMode")
    @NotNull
    /* JADX INFO: renamed from: b */
    ModifyMarginModeResultEntity m89724b(@Body @NotNull Map<String, String> map) throws Throwable;

    @POST("v1/copyTrading/exchange/trade/configs/changeCrossUserLeverage")
    /* JADX INFO: renamed from: c */
    boolean m89725c(@Body @NotNull SubmitCrossLeverageEntity submitCrossLeverageEntity) throws Throwable;

    @GET("v1/copyTrading/exchange/position/queryTrialMarginModeV2")
    @NotNull
    /* JADX INFO: renamed from: d */
    Map<String, MarginModeInfoEntity> m89726d(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/contract/cross/gray")
    @NotNull
    /* JADX INFO: renamed from: e */
    GrayCrossModeEntity m89727e(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/position/getTrialSwitchableContracts")
    @Nullable
    /* JADX INFO: renamed from: f */
    List<QuoteEntity> m89728f() throws Throwable;

    @GET("v1/copyTrading/exchange/position/getSwitchableContracts")
    @Nullable
    /* JADX INFO: renamed from: g */
    List<QuoteEntity> m89729g() throws Throwable;

    @GET("v1/copyTrading/exchange/trade/getTrialActiveOrderStatistics")
    @NotNull
    /* JADX INFO: renamed from: h */
    CrossHedgeQtyMarginEntity m89730h(@NotNull @Query("symbols") String str);

    @GET("v1/copyTrading/exchange/trade/orders/activeOrderStatistics")
    @NotNull
    /* JADX INFO: renamed from: i */
    CrossHedgeQtyMarginEntity m89731i(@NotNull @Query("symbols") String str);

    @POST("v1/copyTrading/exchange/position/changeTrialMarginMode")
    @NotNull
    /* JADX INFO: renamed from: j */
    ModifyMarginModeResultEntity m89732j(@Body @NotNull Map<String, String> map) throws Throwable;

    @GET("v1/copyTrading/exchange/contract/cross/grayTrial")
    @NotNull
    /* JADX INFO: renamed from: k */
    GrayCrossModeEntity m89733k(@NotNull @Query("symbol") String str) throws Throwable;

    @POST("v1/copyTrading/exchange/trade/changeTrialCrossUserLeverage")
    /* JADX INFO: renamed from: l */
    boolean m89734l(@Body @NotNull SubmitCrossLeverageEntity submitCrossLeverageEntity) throws Throwable;
}
