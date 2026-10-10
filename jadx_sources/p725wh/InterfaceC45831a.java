package p725wh;

import com.kubi.kumex.data.market.model.DistributionPageEntity;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: wh.a */
/* JADX INFO: compiled from: IWelfareApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/welfare/IWelfareApi;", "", "fetchTrialOrderPopup", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/kumex/data/market/model/DistributionPageEntity;", "code", "", "currentPage", "", "pageSize", "fetchDistributionRetention", "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45831a {
    @GET("v1/trial/order/pop-up-window")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<DistributionPageEntity> mo101248a(@NotNull @Query("code") String str, @Query("currentPage") int i11, @Query("pageSize") int i12) throws Throwable;

    @GET("v1/trial/getTrialRewardRetentionPopUpWindow")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<DistributionRetentionEntity> mo101249b(@NotNull @Query("code") String str) throws Throwable;
}
