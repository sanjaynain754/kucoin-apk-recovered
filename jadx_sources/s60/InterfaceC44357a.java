package s60;

import com.kubi.futures.model.setting.KycLeverageEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: s60.a */
/* JADX INFO: compiled from: IPositionApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00012\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\u0005H'J\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0005H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/unify/unify/common/positon/api/IPositionApi;", "", "closeAllPosition", "map", "", "", "fetchFundRateFromPosition", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "symbol", "fetchKycLeverage", "Lcom/kubi/futures/model/setting/KycLeverageEntity;", "marginMode", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44357a {
    @GET("v2/km/trade/configs/kyc-guide/leverage")
    @Nullable
    /* JADX INFO: renamed from: a */
    KycLeverageEntity m97854a(@NotNull @Query("symbol") String str, @NotNull @Query("marginMode") String str2) throws Throwable;

    @GET("ultra-position/unified/inner/position/position-list")
    @NotNull
    /* JADX INFO: renamed from: b */
    List<UnifyPositionEntity> m97855b(@NotNull @Query("symbol") String str);

    @POST("ultra-trade/unified/inner/position/close-all-positions")
    @NotNull
    /* JADX INFO: renamed from: c */
    Object m97856c(@Body @NotNull Map<String, String> map) throws Throwable;
}
