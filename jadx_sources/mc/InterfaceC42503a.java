package mc;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: mc.a */
/* JADX INFO: compiled from: IIsolatedApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0002\u0010\bJ/\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0002\u0010\bJ\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J2\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J2\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J(\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J(\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0004H'J\u0012\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0004H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/isolated/api/IIsolatedApi;", "", "autoDepositMargin", "symbol", "", "status", "", "positionSide", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "autoTrialDepositMargin", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "fetchTrialMaxReduceMargin", "submitAddMargin", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ViewProps.MARGIN, "bizNo", "submitTrialAddMargin", "submitReduceMargin", "submitTrialReduceMargin", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "fetchTrialUserRiskLimit", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42503a {
    @GET("v1/copyTrading/exchange/position/maxWithdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal m93189a(@NotNull @Query("symbol") String str, @NotNull @Query("positionSide") String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/position/withdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m93190b(@Field("symbol") @NotNull String str, @Field("withdrawAmount") @NotNull String str2, @Field("positionSide") @NotNull String str3) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/position/margin/auto-deposit-status")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m93191c(@Field("symbol") @NotNull String str, @Field("status") @Nullable Boolean bool, @Field("positionSide") @NotNull String str2) throws Throwable;

    @GET("v1/copyTrading/exchange/km/trade/configs/getUserRiskLimit")
    @NotNull
    /* JADX INFO: renamed from: d */
    ContractRiskLimitEntity m93192d(@NotNull @Query("symbol") String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/position/margin/deposit-margin")
    @NotNull
    /* JADX INFO: renamed from: e */
    PositionEntity m93193e(@Field("symbol") @NotNull String str, @Field(ViewProps.MARGIN) @NotNull String str2, @Field("bizNo") @Nullable String str3, @Field("positionSide") @NotNull String str4) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/position/margin/deposit-margin-trial")
    @NotNull
    /* JADX INFO: renamed from: f */
    PositionEntity m93194f(@Field("symbol") @NotNull String str, @Field(ViewProps.MARGIN) @NotNull String str2, @Field("bizNo") @Nullable String str3, @Field("positionSide") @NotNull String str4) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/position/trialWithdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m93195g(@Field("symbol") @NotNull String str, @Field("withdrawAmount") @NotNull String str2, @Field("positionSide") @NotNull String str3) throws Throwable;

    @FormUrlEncoded
    @POST("v1/copyTrading/exchange/position/auto-trial-deposit-status")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m93196h(@Field("symbol") @NotNull String str, @Field("status") @Nullable Boolean bool, @Field("positionSide") @NotNull String str2) throws Throwable;

    @GET("v1/copyTrading/exchange/km/trade/getTrialUserRiskLimit")
    @NotNull
    /* JADX INFO: renamed from: i */
    ContractRiskLimitEntity m93197i(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/copyTrading/exchange/position/trialMaxWithdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: j */
    BigDecimal m93198j(@NotNull @Query("symbol") String str, @NotNull @Query("positionSide") String str2) throws Throwable;
}
