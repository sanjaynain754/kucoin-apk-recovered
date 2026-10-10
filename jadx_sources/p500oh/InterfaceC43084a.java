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

/* JADX INFO: renamed from: oh.a */
/* JADX INFO: compiled from: IIsolatedApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J2\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J(\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u0004H'J(\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u000e\u001a\u00020\u0004H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/isolated/api/IIsolatedApi;", "", "autoDepositMargin", "symbol", "", "status", "", "positionSide", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/Object;", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "submitAddMargin", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", ViewProps.MARGIN, "bizNo", "submitReduceMargin", "fetchUserRiskLimit", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;", "submitUserRiskLimit", FirebaseAnalytics.Param.LEVEL, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43084a {
    @GET("v1/km/position/maxWithdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal m94650a(@NotNull @Query("symbol") String str, @NotNull @Query("positionSide") String str2) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/position/withdrawMargin")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m94651b(@Field("symbol") @NotNull String str, @Field("withdrawAmount") @NotNull String str2, @Field("positionSide") @NotNull String str3) throws Throwable;

    @FormUrlEncoded
    @POST("v1/kumex-position/margin/auto-deposit-status")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m94652c(@Field("symbol") @NotNull String str, @Field("status") @Nullable Boolean bool, @Field("positionSide") @NotNull String str2) throws Throwable;

    @GET("v1/km/trade/configs/getUserRiskLimit")
    @NotNull
    /* JADX INFO: renamed from: d */
    ContractRiskLimitEntity m94653d(@NotNull @Query("symbol") String str) throws Throwable;

    @FormUrlEncoded
    @POST("v1/kumex-position/margin/deposit-margin")
    @NotNull
    /* JADX INFO: renamed from: e */
    PositionEntity m94654e(@Field("symbol") @NotNull String str, @Field(ViewProps.MARGIN) @NotNull String str2, @Field("bizNo") @Nullable String str3, @Field("positionSide") @NotNull String str4) throws Throwable;

    @FormUrlEncoded
    @POST("v1/km/position/risk-limit/change")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m94655f(@Field("symbol") @NotNull String str, @Field(FirebaseAnalytics.Param.LEVEL) int i11, @Field("bizNo") @NotNull String str2) throws Throwable;
}
