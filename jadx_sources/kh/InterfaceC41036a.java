package kh;

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
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: kh.a */
/* JADX INFO: compiled from: IHedgeApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0012\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\f\u001a\u00020\rH'J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH'J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/classic/hedge/api/IHedgeApi;", "", "fetchSelfClosePositionSize", "", "Lcom/kubi/kumex/data/trade/model/ClosePositionSizeEntity;", "symbol", "", "submitHedgeAutoDepositMargin", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/trade/model/SubmitAutoDepositEntity;", "fetchHedgeAutoDepositMargin", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "fetchPositionModeInternal", "Lcom/kubi/kumex/data/trade/model/PositionModeEntity;", "submitPositionMode", "positionMode", "fetchFeatureAvailable", "", "featureType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC41036a {
    @POST("v2/km/position/switchPositionMode")
    @NotNull
    /* JADX INFO: renamed from: a */
    PositionModeEntity m89982a(@Body @NotNull PositionModeEntity positionModeEntity) throws Throwable;

    @POST("v1/km/margin/changeAutoDepositStatus")
    @NotNull
    /* JADX INFO: renamed from: b */
    Object m89983b(@Body @NotNull SubmitAutoDepositEntity submitAutoDepositEntity) throws Throwable;

    @GET("v1/km/margin/autoDepositStatusInfo")
    @NotNull
    /* JADX INFO: renamed from: c */
    List<AutoDepositStatusEntity> m89984c(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v2/km/position/queryPositionMode")
    @NotNull
    /* JADX INFO: renamed from: d */
    PositionModeEntity m89985d() throws Throwable;

    @GET("v1/km/maxCloseSize")
    @NotNull
    /* JADX INFO: renamed from: g */
    List<ClosePositionSizeEntity> m89986g(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/km/feature/available")
    /* JADX INFO: renamed from: h */
    boolean m89987h(@NotNull @Query("featureType") String str) throws Throwable;
}
