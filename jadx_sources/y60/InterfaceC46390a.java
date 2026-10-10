package y60;

import cm.UnifyChangeLeverageResult;
import cm.UnifyChangeMarginResult;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.unify.entity.IsolatedModifyMarginRequest;
import com.kubi.unify.entity.IsolatedModifyMarginResponse;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: y60.a */
/* JADX INFO: compiled from: IIsolatedApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J2\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H'J2\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0005H'J(\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H'J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0005H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0003\u0010\u0019\u001a\u00020\u001aH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/isolated/api/IIsolatedApi;", "", "fetchMaxReduceMargin", "Ljava/math/BigDecimal;", "symbol", "", "positionSide", "fetchReduceMarginOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeMarginResult;", ViewProps.MARGIN, "type", "fetchAddMarginOfCalResult", "fetchAdjustLeverageOfCalResult", "Lcom/kubi/kumex/data/trade/model/UnifyChangeLeverageResult;", "leverage", "submitAddMargin", "Lcom/kubi/unify/entity/IsolatedModifyMarginResponse;", "param", "Lcom/kubi/unify/entity/IsolatedModifyMarginRequest;", "fetchIsolatedAvailableBalance", "Lcom/kubi/unify/entity/UnifyBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "fetchPositionList", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "isCalcLiqAndRisk", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46390a {
    @GET("ultra-position/unified/inner/position/cal-when-adjust-margin")
    @Nullable
    /* JADX INFO: renamed from: A */
    UnifyChangeMarginResult m102305A(@NotNull @Query("symbol") String str, @NotNull @Query("marginAmount") String str2, @NotNull @Query("positionSide") String str3, @NotNull @Query("type") String str4) throws Throwable;

    @GET("ultra-position/unified/inner/position/max-withdraw-margin")
    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal m102306a(@NotNull @Query("symbol") String str, @NotNull @Query("positionSide") String str2) throws Throwable;

    @GET("ultra-position/unified/inner/position/position-list")
    @NotNull
    /* JADX INFO: renamed from: b */
    List<UnifyPositionEntity> m102307b(@Query("isCalcLiqAndRisk") boolean z11) throws Throwable;

    @POST("ultra-position/unified/inner/position/withdraw-margin")
    @NotNull
    /* JADX INFO: renamed from: d */
    IsolatedModifyMarginResponse m102308d(@Body @NotNull IsolatedModifyMarginRequest isolatedModifyMarginRequest) throws Throwable;

    @GET("ultra-position/unified/inner/position/cal-when-adjust-leverage")
    @Nullable
    /* JADX INFO: renamed from: n */
    UnifyChangeLeverageResult m102309n(@NotNull @Query("symbol") String str, @NotNull @Query("leverage") String str2, @NotNull @Query("positionSide") String str3) throws Throwable;

    @GET("ultra-order/unified/inner/orders/futures-available")
    @Nullable
    /* JADX INFO: renamed from: t */
    UnifyBalanceEntity m102310t(@NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str) throws Throwable;

    @GET("ultra-position/unified/inner/position/cal-when-adjust-margin")
    @Nullable
    /* JADX INFO: renamed from: u */
    UnifyChangeMarginResult m102311u(@NotNull @Query("symbol") String str, @NotNull @Query("marginAmount") String str2, @NotNull @Query("positionSide") String str3, @NotNull @Query("type") String str4) throws Throwable;

    /* JADX INFO: renamed from: c */
    static /* synthetic */ List m102304c(InterfaceC46390a interfaceC46390a, boolean z11, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPositionList");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return interfaceC46390a.m102307b(z11);
    }
}
