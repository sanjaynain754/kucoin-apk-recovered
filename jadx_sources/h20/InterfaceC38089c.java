package h20;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.spot.entity.callAuction.CallAuctionConfigEntity;
import com.kubi.spot.entity.callAuction.CallAuctionEstimateInfoEntity;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: h20.c */
/* JADX INFO: compiled from: ICallAuctionApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/api/ICallAuctionApi;", "", "requestGetConfig", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/entity/callAuction/CallAuctionConfigEntity;", "symbol", "", "requestCallAuctionInfo", "Lcom/kubi/spot/entity/callAuction/CallAuctionEstimateInfoEntity;", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38089c {
    @GET("v1/kc/call-auction/get")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<CallAuctionConfigEntity> m85993a(@Nullable @Query("symbol") String str);

    @GET("v1/kc/call-auction/info")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<CallAuctionEstimateInfoEntity> m85994b(@Nullable @Query("symbol") String str);

    @GET("v1/symbol/previewInfo")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<SymbolPreviewEntity> m85995d(@NotNull @Query("symbol") String str, @NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str2, @NotNull @Query("lang") String str3);
}
