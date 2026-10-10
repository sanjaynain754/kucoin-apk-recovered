package lc;

import com.kubi.kumex.data.trade.model.AutoDepositStatusEntity;
import com.kubi.kumex.data.trade.model.ClosePositionSizeEntity;
import com.kubi.kumex.data.trade.model.PositionModeEntity;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: lc.k */
/* JADX INFO: compiled from: IHedgeApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\b\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0012\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'J\u0012\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'J\b\u0010\u0013\u001a\u00020\u0010H'J\b\u0010\u0014\u001a\u00020\u0010H'J\u001c\u0010\u0015\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0006H'J\u001c\u0010\u0019\u001a\u00020\u00162\b\b\u0003\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/hedge/IHedgeApi;", "", "fetchSelfClosePositionSize", "", "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "symbol", "", "fetchTrialClosePositionSize", "submitHedgeAutoDepositMargin", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;", "submitTrialHedgeAutoDepositMargin", "fetchHedgeAutoDepositMargin", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "fetchTrialHedgeAutoDepositMargin", "submitPositionMode", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "positionMode", "submitTrialPositionMode", "fetchPositionModeInternal", "fetchTrialPositionModeInternal", "fetchFeatureAvailable", "", "featureType", "subUid", "fetchTrialFeatureAvailable", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42166k {
    @POST("v1/copyTrading/exchange/position/switchPositionMode")
    @NotNull
    /* JADX INFO: renamed from: a */
    PositionModeEntity m92571a(@Body @NotNull PositionModeEntity positionModeEntity) throws Throwable;

    @POST("v1/copyTrading/exchange/position/margin/changeAutoDepositStatus")
    @NotNull
    /* JADX INFO: renamed from: b */
    Object m92572b(@Body @NotNull SubmitAutoDepositEntity submitAutoDepositEntity) throws Throwable;

    @GET("v1/copyTrading/exchange/position/margin/autoDepositStatusInfo")
    @NotNull
    /* JADX INFO: renamed from: c */
    List<AutoDepositStatusEntity> m92573c(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/position/queryPositionMode")
    @NotNull
    /* JADX INFO: renamed from: d */
    PositionModeEntity m92574d() throws Throwable;

    @GET("v1/copyTrading/exchange/feature/available")
    /* JADX INFO: renamed from: e */
    boolean m92575e(@NotNull @Query("featureType") String str, @Header("X-SUB-UID") @NotNull String str2) throws Throwable;

    @GET("v1/copyTrading/exchange/position/trialMaxCloseSize")
    @NotNull
    /* JADX INFO: renamed from: f */
    List<ClosePositionSizeEntity> m92576f(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/position/maxCloseSize")
    @NotNull
    /* JADX INFO: renamed from: g */
    List<ClosePositionSizeEntity> m92577g(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/position/queryTrialPositionMode")
    @NotNull
    /* JADX INFO: renamed from: h */
    PositionModeEntity m92578h() throws Throwable;

    @GET("v1/copyTrading/exchange/position/autoTrialDepositStatusInfo")
    @NotNull
    /* JADX INFO: renamed from: i */
    List<AutoDepositStatusEntity> m92579i(@NotNull @Query("symbol") String str) throws Throwable;

    @POST("v1/copyTrading/exchange/position/switchTrialPositionMode")
    @NotNull
    /* JADX INFO: renamed from: j */
    PositionModeEntity m92580j(@Body @NotNull PositionModeEntity positionModeEntity) throws Throwable;

    @POST("v1/copyTrading/exchange/position/changeAutoTrialDepositStatus")
    @NotNull
    /* JADX INFO: renamed from: k */
    Object m92581k(@Body @NotNull SubmitAutoDepositEntity submitAutoDepositEntity) throws Throwable;
}
