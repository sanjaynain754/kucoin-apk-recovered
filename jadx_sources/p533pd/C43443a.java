package p533pd;

import android.content.Context;
import android.widget.TextView;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37890n;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: renamed from: pd.a */
/* JADX INFO: compiled from: MarketOrderNumCheckExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0001\u001a*\u0010\f\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0001H\u0002\u001a2\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0001H\u0002\u001a\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¨\u0006\u0014"}, m90084d2 = {"showMarketTradeErrorTip", "", "isBuyHolder", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "bboData", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "tvErrorTip", "Landroid/widget/TextView;", "amount", "", "needToast", "showErrorTipWhenBuy", "showErrorTipWhenSell", "calculateBaseLimitSize", "Ljava/math/BigDecimal;", "quoteLimitSize", "scale", "", "orderBookData", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43443a {
    /* JADX INFO: renamed from: b */
    public static final boolean m95642b(SymbolInfoEntity symbolInfoEntity, TextView textView, String str, boolean z11) {
        boolean z12;
        if (str.length() == 0) {
            ViewExtKt.m66577h(textView);
            return false;
        }
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(str, null, 1, null);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(RangesKt.coerceAtLeast(symbolInfoEntity.getQuoteMinSize(), C37890n.f85269a.m85618z(symbolInfoEntity.getQuoteCurrency()))));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(symbolInfoEntity.getQuoteMaxSize()));
        if (bigDecimalM66535e.compareTo(bigDecimal) >= 0) {
            if (bigDecimalM66535e.compareTo(bigDecimal2) > 0) {
                ViewExtKt.m66594y(textView);
                Context context = textView.getContext();
                int i11 = R$string.kc_trade_vol_less_tip;
                String strM92640e = C42180b.m92640e(new BigDecimal(String.valueOf(symbolInfoEntity.getQuoteMaxSize())), null, 20, false, false, false, 0, null, 125, null);
                String quoteCurrencyName = symbolInfoEntity.getQuoteCurrencyName();
                Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
                textView.setText(context.getString(i11, C42828b.m93906g(strM92640e, quoteCurrencyName, true, false, 4, null)));
            } else {
                ViewExtKt.m66577h(textView);
                z12 = false;
            }
            if (z11 && z12) {
                ToastCompat.m66441G(textView.getContext().getString(R$string.amount_must_range, C42180b.m92640e(bigDecimal, null, 20, false, false, false, 0, null, 125, null), C42180b.m92640e(bigDecimal2, null, 20, false, false, false, 0, null, 125, null)), new Object[0]);
            }
            return z12;
        }
        ViewExtKt.m66594y(textView);
        Context context2 = textView.getContext();
        int i12 = R$string.kc_trade_vol_morethan_tip;
        String strM92640e2 = C42180b.m92640e(bigDecimal, null, 20, false, false, false, 0, null, 125, null);
        String quoteCurrencyName2 = symbolInfoEntity.getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName2, "getQuoteCurrencyName(...)");
        textView.setText(context2.getString(i12, C42828b.m93906g(strM92640e2, quoteCurrencyName2, true, false, 4, null)));
        z12 = true;
        if (z11) {
            ToastCompat.m66441G(textView.getContext().getString(R$string.amount_must_range, C42180b.m92640e(bigDecimal, null, 20, false, false, false, 0, null, 125, null), C42180b.m92640e(bigDecimal2, null, 20, false, false, false, 0, null, 125, null)), new Object[0]);
        }
        return z12;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m95644d(boolean z11, @NotNull SymbolInfoEntity symbolInfo, @NotNull OrderBookCenterEntity bboData, @NotNull TextView tvErrorTip, @NotNull String amount, boolean z12) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Intrinsics.checkNotNullParameter(bboData, "bboData");
        Intrinsics.checkNotNullParameter(tvErrorTip, "tvErrorTip");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return z11 ? m95642b(symbolInfo, tvErrorTip, amount, z12) : m95643c(symbolInfo, bboData, tvErrorTip, amount, z12);
    }

    /* JADX INFO: renamed from: a */
    public static final BigDecimal m95641a(BigDecimal bigDecimal, int i11, OrderBookCenterEntity orderBookCenterEntity) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(orderBookCenterEntity.getPrice());
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalValueOf.compareTo(bigDecimal2) > 0) {
            BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimalValueOf, i11, RoundingMode.UP);
            C44128b.m97258b("cassie, SPOT-17843 -> 市价卖单 price -> " + bigDecimalValueOf + ", minSize -> " + bigDecimalDivide);
            return bigDecimalDivide;
        }
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(orderBookCenterEntity.getBestBid());
        if (bigDecimalValueOf2.compareTo(bigDecimal2) > 0) {
            BigDecimal bigDecimalDivide2 = bigDecimal.divide(bigDecimalValueOf2, i11, RoundingMode.UP);
            C44128b.m97258b("cassie, SPOT-17843 -> 市价卖单 bestBid -> " + bigDecimalValueOf2 + ", minSize -> " + bigDecimalDivide2);
            return bigDecimalDivide2;
        }
        C44128b.m97258b("cassie, SPOT-17843 -> 市价卖单 else null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m95643c(SymbolInfoEntity symbolInfoEntity, OrderBookCenterEntity orderBookCenterEntity, TextView textView, String str, boolean z11) {
        TextView textView2;
        if (str.length() == 0) {
            ViewExtKt.m66577h(textView);
            return false;
        }
        int baseIncrementPrecisionTrade = symbolInfoEntity.getBaseIncrementPrecisionTrade();
        BigDecimal bigDecimalM95641a = m95641a(new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(symbolInfoEntity.getQuoteCurrency()))), baseIncrementPrecisionTrade, orderBookCenterEntity);
        if (bigDecimalM95641a == null) {
            ViewExtKt.m66577h(textView);
            return false;
        }
        BigDecimal bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(new BigDecimal(String.valueOf(symbolInfoEntity.getBaseMinSize())), bigDecimalM95641a);
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(symbolInfoEntity.getBaseMaxSize()));
        boolean z12 = true;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(str, null, 1, null);
        if (bigDecimalM66535e.compareTo(bigDecimal) < 0) {
            ViewExtKt.m66594y(textView);
            Context context = textView.getContext();
            int i11 = R$string.kc_trade_keybord_min_tip;
            String strM92640e = C42180b.m92640e(bigDecimal, RoundingMode.UP, baseIncrementPrecisionTrade, false, false, false, 0, null, 124, null);
            String baseCurrencyName = symbolInfoEntity.getBaseCurrencyName();
            Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
            textView2 = textView;
            textView2.setText(context.getString(i11, C42828b.m93906g(strM92640e, baseCurrencyName, true, false, 4, null)));
        } else {
            textView2 = textView;
            if (bigDecimalM66535e.compareTo(bigDecimal2) > 0) {
                ViewExtKt.m66577h(textView2);
            } else {
                ViewExtKt.m66577h(textView2);
                z12 = false;
            }
        }
        if (z11 && z12) {
            ToastCompat.m66441G(textView2.getContext().getString(R$string.quantity_must_range, C42180b.m92640e(bigDecimal, null, baseIncrementPrecisionTrade, false, false, false, 0, null, 125, null), C42180b.m92640e(bigDecimal2, null, baseIncrementPrecisionTrade, false, false, false, 0, null, 125, null)), new Object[0]);
        }
        return z12;
    }
}
