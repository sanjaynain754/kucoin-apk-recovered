package q20;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.spot.business.discover.entity.MarketChangesItemEntity;
import com.kubi.spot.business.discover.entity.MarketChangesRequestEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: q20.a */
/* JADX INFO: compiled from: IMarketChangeApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/marketChanges/api/IMarketChangeApi;", "", "getMarketChangeData", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/spot/business/discover/entity/MarketChangesItemEntity;", TtmlNode.TAG_BODY, "Lcom/kubi/spot/business/discover/entity/MarketChangesRequestEntity;", "getSymbolSupport", "", "symbol", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC43594a {
    @GET("v1/discover/market-change/support")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<Boolean> m95948a(@NotNull @Query("symbol") String str);

    @POST("v1/discover/market-change/message/detail-list")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<MarketChangesItemEntity>> m95949b(@Body @NotNull MarketChangesRequestEntity marketChangesRequestEntity);
}
