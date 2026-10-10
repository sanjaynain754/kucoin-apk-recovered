package p830zf;

import androidx.fragment.app.Fragment;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.spot.quote.market.trade.MarketTradeFragment;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45660a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import t20.C44630b;

/* JADX INFO: renamed from: zf.w */
/* JADX INFO: compiled from: IKucoinMarketActivityFlavor.kt */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC45660a
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/flavor/IKucoinMarketActivityFlavor;", "", "flavorOnCreate", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "tradeFragment", "Lcom/kubi/spot/quote/market/trade/MarketTradeFragment;", "mTradeBean", "Lcom/kubi/data/entity/TradeItemBean;", "flavorInitNavigationHeader", "", "binding", "Lcom/kubi/spot/databinding/BkucoinActivityMarketBinding;", "flavorInitNavigationBottom", "", "", "hasContract", "hasFlashExchange", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46827w {
    /* JADX INFO: renamed from: a */
    boolean m103158a(@Nullable C44630b c44630b);

    @NotNull
    /* JADX INFO: renamed from: c */
    List<String> m103160c(boolean z11, boolean z12);

    @Nullable
    /* JADX INFO: renamed from: b */
    default ArrayList<Fragment> m103159b(@NotNull MarketTradeFragment tradeFragment, @NotNull TradeItemBean mTradeBean) {
        Intrinsics.checkNotNullParameter(tradeFragment, "tradeFragment");
        Intrinsics.checkNotNullParameter(mTradeBean, "mTradeBean");
        return null;
    }
}
