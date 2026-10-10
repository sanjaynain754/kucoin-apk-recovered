package p844zu;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.quotefacade.entity.ChanceDiscoverConfig;
import com.kubi.quotefacade.entity.ChanceMarketChangeEntity;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.entity.ChanceWhaleEntity;
import com.kubi.quotefacade.entity.QuoteWSEntity;
import hr.InterfaceC38288a;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: zu.c */
/* JADX INFO: compiled from: ITradeChanceApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H'J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003H'J,\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH'J\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n0\u00032\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000eH'J\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000eH'J\u001a\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u000eH&J\u001a\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u000eH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/api/ITradeChanceApi;", "", "config", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;", "plateRate", "Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "gembox", "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "marketChange", "", "Lcom/kubi/quotefacade/entity/ChanceMarketChangeEntity;", TtmlNode.TAG_BODY, "", "", "whale", "Lcom/kubi/quotefacade/entity/ChanceWhaleEntity;", "includes", "hotRank", "Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;", "type", "quoteWs", "Lcom/kubi/quotefacade/entity/QuoteWSEntity;", "topic", "gemboxWs", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46926c {
    @GET("v1/discover/plate/rate")
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<ChancePlateEntity> m103385a();

    @GET("v2/whale/message/list")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<ChanceWhaleEntity>> m103386b(@Nullable @Query("excludes") String str);

    @POST("v1/discover/market-change/message/list")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<ChanceMarketChangeEntity>> m103387c(@Body @NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<QuoteWSEntity> m103388d(@InterfaceC38288a @NotNull String str);

    @Headers({"Cache-Time: 60000"})
    @GET("v1/discover/config/main")
    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC41634e<ChanceDiscoverConfig> m103389e();
}
