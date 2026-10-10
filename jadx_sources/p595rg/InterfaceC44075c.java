package p595rg;

import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: rg.c */
/* JADX INFO: compiled from: IMultiMarketApi.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0002\u0010\f\u001a\u00020\rH&J\u0014\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/function/common/IMultiMarketApi;", "Lcom/kubi/function/IMultiFunction;", "fetchQuotesListFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "tradingArea", "", "fetchQuotesList", "fetchRecommendList", "fetchAvailableTradeAreaPlus", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "isRobot", "", "getQuotesListRequestForWs", "Lokhttp3/Request;", "getRecommendListRequestForWs", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC44075c extends InterfaceC43729a {
    @Nullable
    /* JADX INFO: renamed from: b */
    List<QuotesEntity> mo84209b(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<List<AvailableTradeAreaEntity>> mo84210d(boolean z11);

    @Nullable
    /* JADX INFO: renamed from: e */
    List<QuotesEntity> mo84211e();

    @NotNull
    /* JADX INFO: renamed from: e0 */
    Request mo84212e0(@Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: u0 */
    Request mo84213u0();
}
