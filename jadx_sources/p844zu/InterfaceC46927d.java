package p844zu;

import com.kubi.quotefacade.entity.ChanceGemBoxEntity;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.entity.WidgetFearGreedEntity;
import hr.InterfaceC38288a;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: renamed from: zu.d */
/* JADX INFO: compiled from: QuoteWidgetApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/api/QuoteWidgetApi;", "", "gembox", "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gemboxWs", "Lkotlinx/coroutines/flow/Flow;", "topic", "", "riseFall", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "fearGreedSummary", "Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hotSectors", "Lcom/kubi/quotefacade/entity/ChancePlateEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46927d {
    @GET("discover-new/advance_decline_distribution/home_page_summary")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m103390a(@NotNull Continuation<? super RiseFallEntity> continuation) throws Exception;

    @GET("v1/discover/plate/rate")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m103391b(@NotNull Continuation<? super ChancePlateEntity> continuation) throws Exception;

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<ChanceGemBoxEntity> m103392c(@InterfaceC38288a @NotNull String str);

    @GET("discover-new/fear_greed_index/home_page_summary")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m103393d(@Header("Cache-Time") @Nullable Long l11, @NotNull Continuation<? super WidgetFearGreedEntity> continuation) throws Exception;

    @GET("v2/gem-box/currency/list")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m103394e(@NotNull Continuation<? super ChanceGemBoxEntity> continuation) throws Exception;
}
