package p809yu;

import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.FutureTradeItemBean;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.resources.widget.BaseTextView;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: yu.a0 */
/* JADX INFO: compiled from: ItemBeanEx.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0004*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0004*\u00020\u0010\u001a\u0010\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¨\u0006\u0015"}, m90084d2 = {"configTradePair", "", "Lcom/kubi/data/entity/TradeItemBean;", "isSpotType", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "updateTradePairUI", "isFuture", "showQuote", "getFutureSymbolShow", "Lcom/kubi/utils/StyledText;", "itemBean", "fontSize", "", "showNewTag", "Lcom/kubi/quotefacade/entity/FutureTradeItemBean;", "showHotTag", "isShowFutureSymbolTag", "symbol", "", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46566a0 {
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX INFO: renamed from: a */
    public static final void m102719a(@NotNull TradeItemBean tradeItemBean, boolean z11, @NotNull BaseViewHolder helper) {
        boolean z12;
        boolean z13;
        int i11;
        String strMo33264M;
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        BaseTextView baseTextView = (BaseTextView) helper.getView(R$id.tv_trade_pair);
        BaseTextView baseTextView2 = (BaseTextView) helper.getView(R$id.tv_quote);
        View view = helper.getView(R$id.label_prep_group);
        boolean z14 = tradeItemBean instanceof FutureTradeItemBean;
        boolean z15 = true;
        boolean z16 = (z14 ? (FutureTradeItemBean) tradeItemBean : null) != null;
        AllTradeItemBean allTradeItemBean = tradeItemBean instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean : null;
        boolean z17 = allTradeItemBean != null && allTradeItemBean.isFuture();
        if (z11) {
            String quoteCurrencyName = tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName();
            Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
            if (StringsKt.isBlank(quoteCurrencyName)) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else {
            z12 = false;
        }
        if (baseTextView != null) {
            if (z16 || z17) {
                IKuMexService iKuMexService = IKuMexService.f28731a.get();
                String symbol = tradeItemBean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                strMo33264M = iKuMexService.mo33264M(symbol);
            } else {
                strMo33264M = z12 ? tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName() : "";
            }
            baseTextView.setText(strMo33264M);
        }
        if (baseTextView2 != null) {
            if (z12) {
                baseTextView2.setText('/' + tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName());
                i11 = 0;
            } else {
                i11 = 8;
            }
            baseTextView2.setVisibility(i11);
        }
        if (z11) {
            z13 = false;
        } else {
            FutureTradeItemBean futureTradeItemBean = z14 ? (FutureTradeItemBean) tradeItemBean : null;
            if ((futureTradeItemBean == null || !futureTradeItemBean.isForeverContract()) && !m102720b(tradeItemBean.getSymbol())) {
                z13 = false;
            } else {
                z13 = true;
            }
        }
        if (view != null) {
            view.setVisibility(z13 ? 0 : 8);
        }
        if (!z16 && !z17) {
            z15 = false;
        }
        m102723e(helper, z15, z12);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m102720b(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        return Intrinsics.areEqual(BQuoteFacadeDepend.f42592a.m53023c().mo33295y(str).getType(), "FFWCSX");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m102721c(@NotNull FutureTradeItemBean futureTradeItemBean) {
        Intrinsics.checkNotNullParameter(futureTradeItemBean, "<this>");
        return StringsKt.equals(futureTradeItemBean.getStatusIcon(), "HOT", true);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m102722d(@NotNull FutureTradeItemBean futureTradeItemBean) {
        Intrinsics.checkNotNullParameter(futureTradeItemBean, "<this>");
        return StringsKt.equals(futureTradeItemBean.getStatusIcon(), "New", true);
    }

    /* JADX INFO: renamed from: e */
    public static final void m102723e(BaseViewHolder baseViewHolder, boolean z11, boolean z12) {
        View view = baseViewHolder.getView(R$id.ll_trade_pair);
        if (view == null) {
            return;
        }
        if (z11) {
            view.setLayoutDirection(3);
        } else if (z12) {
            view.setLayoutDirection(0);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (C5303w0.m6511a() && z12) {
                marginLayoutParams.setMarginStart(C43881b.m96650a(3));
                marginLayoutParams.setMarginEnd(0);
            } else {
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(C43881b.m96650a(3));
            }
        }
    }
}
