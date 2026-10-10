package p500oh;

import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: renamed from: oh.c */
/* JADX INFO: compiled from: IIsolatedTrialApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J2\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J(\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J(\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\n\u001a\u00020\u0005H'J/\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0002\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/isolated/api/IIsolatedTrialApi;", "", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "symbol", "", "positionSide", "submitAddMargin", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ViewProps.MARGIN, "bizNo", "submitReduceMargin", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "autoDepositMargin", "status", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43086c {
    @GET("v1/km/trial/position/maxWithdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal m94666a(@NotNull @Query("symbol") String str, @NotNull @Query("positionSide") String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/trial/position/withdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m94667b(@Field("symbol") @NotNull String str, @Field("withdrawAmount") @NotNull String str2, @Field("positionSide") @NotNull String str3) throws Throwable;

    @FormUrlEncoded
    @POST("v1/kumex-position/margin/auto-deposit-status")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m94668c(@Field("symbol") @NotNull String str, @Field("status") @Nullable Boolean bool, @Field("positionSide") @NotNull String str2) throws Throwable;

    @GET("v1/km/trade/configs/trial/getUserRiskLimit")
    @NotNull
    /* JADX INFO: renamed from: d */
    ContractRiskLimitEntity m94669d(@NotNull @Query("symbol") String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/trial/position/margin/deposit-margin")
    @NotNull
    /* JADX INFO: renamed from: e */
    PositionEntity m94670e(@Field("symbol") @NotNull String str, @Field(ViewProps.MARGIN) @NotNull String str2, @Field("bizNo") @Nullable String str3, @Field("positionSide") @NotNull String str4) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/position/trial/risk-limit/change")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m94671f(@Field("symbol") @NotNull String str, @Field(FirebaseAnalytics.Param.LEVEL) int i11, @Field("bizNo") @NotNull String str2) throws Throwable;
}
