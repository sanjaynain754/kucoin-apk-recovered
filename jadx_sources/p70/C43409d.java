package p70;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.kubi.core.base.order.data.C11623a;
import com.kubi.core.spot.business.holder.C12340f3;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.R$string;
import java.math.BigDecimal;
import ne.MarketTradeInputData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import q70.C43662i;
import q70.C43665l;

/* JADX INFO: renamed from: p70.d */
/* JADX INFO: compiled from: MarketOrderDetailLayout.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, m90084d2 = {"createMarketOrderDetailView", "Landroid/view/View;", "context", "Landroid/content/Context;", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/MarketTradeInputData;", "bindMarketLayoutInfo", "binding", "Lcom/kubi/utaspotlib/databinding/UtaOrderMarketLayoutBinding;", "bindStopMarketLayoutInfo", "Lcom/kubi/utaspotlib/databinding/UtaOrderStopMarketLayoutBinding;", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43409d {

    /* JADX INFO: renamed from: p70.d$a */
    /* JADX INFO: compiled from: MarketOrderDetailLayout.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.MARKET_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final View m95596b(C43665l c43665l, MarketTradeInputData marketTradeInputData) {
        c43665l.f96476n.setText(C11623a.m21085d(C12340f3.m23272a(new BigDecimal(String.valueOf(marketTradeInputData.getParentBehavior().mo22356G().getPrice())), marketTradeInputData.getEtTriggerPrice()), marketTradeInputData.m93865o(), marketTradeInputData.getEtTriggerPrice()));
        c43665l.f96475m.setText(marketTradeInputData.getQuoteCurrencyName());
        MarketOrderConfirmationDisplay marketOrderConfirmationDisplayM95594a = C43408c.m95594a(marketTradeInputData.getDisplayInputNumber(), marketTradeInputData.getAmountUnit(), marketTradeInputData.getBaseCurrencyName(), marketTradeInputData.getQuoteCurrencyName());
        if (marketOrderConfirmationDisplayM95594a.getShowQuantity()) {
            c43665l.f96473k.setText(C11623a.m21082a(marketTradeInputData.m93865o(), marketOrderConfirmationDisplayM95594a.getValue()));
            c43665l.f96472j.setText(marketOrderConfirmationDisplayM95594a.getCurrencyName());
            c43665l.f96464b.setVisibility(8);
            c43665l.f96465c.setVisibility(0);
        } else {
            c43665l.f96466d.setText(C11623a.m21084c(marketTradeInputData.m93865o(), marketOrderConfirmationDisplayM95594a.getValue()));
            c43665l.f96468f.setText(marketOrderConfirmationDisplayM95594a.getCurrencyName());
            c43665l.f96464b.setVisibility(0);
            c43665l.f96465c.setVisibility(8);
        }
        LinearLayout root = c43665l.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final View m95597c(@NotNull Context context, @NotNull MarketTradeInputData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = a.$EnumSwitchMapping$0[data.mo93835a().ordinal()];
        if (i11 == 1) {
            C43662i c43662iM96085a = C43662i.m96085a(View.inflate(context, R$layout.uta_order_market_layout, null));
            Intrinsics.checkNotNullExpressionValue(c43662iM96085a, "bind(...)");
            c43662iM96085a.f96422h.setText(R$string.market_price);
            return m95595a(c43662iM96085a, data);
        }
        if (i11 != 2) {
            return null;
        }
        C43665l c43665lM96091a = C43665l.m96091a(View.inflate(context, R$layout.uta_order_stop_market_layout, null));
        Intrinsics.checkNotNullExpressionValue(c43665lM96091a, "bind(...)");
        c43665lM96091a.f96470h.setText(R$string.market_price);
        return m95596b(c43665lM96091a, data);
    }

    /* JADX INFO: renamed from: a */
    public static final View m95595a(C43662i c43662i, MarketTradeInputData marketTradeInputData) {
        MarketOrderConfirmationDisplay marketOrderConfirmationDisplayM95594a = C43408c.m95594a(marketTradeInputData.getDisplayInputNumber(), marketTradeInputData.getAmountUnit(), marketTradeInputData.getBaseCurrencyName(), marketTradeInputData.getQuoteCurrencyName());
        if (marketOrderConfirmationDisplayM95594a.getShowQuantity()) {
            c43662i.f96425k.setText(C11623a.m21082a(marketTradeInputData.m93865o(), marketOrderConfirmationDisplayM95594a.getValue()));
            c43662i.f96424j.setText(marketOrderConfirmationDisplayM95594a.getCurrencyName());
            c43662i.f96416b.setVisibility(8);
            c43662i.f96417c.setVisibility(0);
        } else {
            c43662i.f96418d.setText(C11623a.m21084c(marketTradeInputData.m93865o(), marketOrderConfirmationDisplayM95594a.getValue()));
            c43662i.f96420f.setText(marketOrderConfirmationDisplayM95594a.getCurrencyName());
            c43662i.f96416b.setVisibility(0);
            c43662i.f96417c.setVisibility(8);
        }
        LinearLayout root = c43662i.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
