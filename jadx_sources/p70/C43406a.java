package p70;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.kubi.core.base.order.data.C11623a;
import com.kubi.core.spot.business.holder.C12340f3;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.utaspotlib.R$layout;
import java.math.BigDecimal;
import ne.LimitTradeInputData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import q70.C43659f;
import q70.C43661h;
import q70.C43664k;

/* JADX INFO: renamed from: p70.a */
/* JADX INFO: compiled from: LimitOrderDetailLayout.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, m90084d2 = {"createLimitOrderDetailView", "Landroid/view/View;", "context", "Landroid/content/Context;", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "bindLimitLayoutInfo", "binding", "Lcom/kubi/utaspotlib/databinding/UtaOrderLimitLayoutBinding;", "bindStopLimitLayoutInfo", "Lcom/kubi/utaspotlib/databinding/UtaOrderStopLimitLayoutBinding;", "bindAdvancedLimitLayoutInfo", "Lcom/kubi/utaspotlib/databinding/UtaOrderAdvancedLimitLayoutBinding;", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43406a {

    /* JADX INFO: renamed from: p70.a$a */
    /* JADX INFO: compiled from: LimitOrderDetailLayout.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.LIMIT_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.ADVANCED_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final View m95587a(C43659f c43659f, LimitTradeInputData limitTradeInputData) {
        c43659f.f96379g.setText(C11623a.m21083b(limitTradeInputData.m93852p(), limitTradeInputData.getInputLimitPrice()));
        c43659f.f96378f.setText(limitTradeInputData.getQuoteCurrencyName());
        c43659f.f96382j.setText(C11623a.m21082a(limitTradeInputData.m93852p(), limitTradeInputData.getEtNumber()));
        c43659f.f96381i.setText(limitTradeInputData.getBaseCurrencyName());
        c43659f.f96374b.setText(C11623a.m21084c(limitTradeInputData.m93852p(), limitTradeInputData.getEtDealAmount()));
        c43659f.f96376d.setText(limitTradeInputData.getQuoteCurrencyName());
        LinearLayout root = c43659f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: b */
    public static final View m95588b(C43661h c43661h, LimitTradeInputData limitTradeInputData) {
        c43661h.f96411g.setText(C11623a.m21083b(limitTradeInputData.m93852p(), limitTradeInputData.getInputLimitPrice()));
        c43661h.f96410f.setText(limitTradeInputData.getQuoteCurrencyName());
        c43661h.f96414j.setText(C11623a.m21082a(limitTradeInputData.m93852p(), limitTradeInputData.getEtNumber()));
        c43661h.f96413i.setText(limitTradeInputData.getBaseCurrencyName());
        BaseTextView baseTextView = c43661h.f96406b;
        SymbolInfoEntity symbolInfoEntityM93852p = limitTradeInputData.m93852p();
        BigDecimal bigDecimalMultiply = limitTradeInputData.getInputLimitPrice().multiply(limitTradeInputData.getEtNumber());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        baseTextView.setText(C11623a.m21084c(symbolInfoEntityM93852p, bigDecimalMultiply));
        c43661h.f96408d.setText(limitTradeInputData.getQuoteCurrencyName());
        LinearLayout root = c43661h.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: renamed from: c */
    public static final View m95589c(C43664k c43664k, LimitTradeInputData limitTradeInputData) {
        c43664k.f96462m.setText(C11623a.m21085d(C12340f3.m23272a(new BigDecimal(String.valueOf(limitTradeInputData.getParentBehavior().mo22356G().getPrice())), limitTradeInputData.getEtTriggerPrice()), limitTradeInputData.m93852p(), limitTradeInputData.getEtTriggerPrice()));
        c43664k.f96461l.setText(limitTradeInputData.getQuoteCurrencyName());
        c43664k.f96456g.setText(C11623a.m21083b(limitTradeInputData.m93852p(), limitTradeInputData.getInputLimitPrice()));
        c43664k.f96455f.setText(limitTradeInputData.getQuoteCurrencyName());
        c43664k.f96459j.setText(C11623a.m21082a(limitTradeInputData.m93852p(), limitTradeInputData.getEtNumber()));
        c43664k.f96458i.setText(limitTradeInputData.getBaseCurrencyName());
        c43664k.f96451b.setText(C11623a.m21084c(limitTradeInputData.m93852p(), limitTradeInputData.getEtDealAmount()));
        c43664k.f96453d.setText(limitTradeInputData.getQuoteCurrencyName());
        LinearLayout root = c43664k.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final View m95590d(@NotNull Context context, @NotNull LimitTradeInputData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        int i11 = a.$EnumSwitchMapping$0[data.mo93835a().ordinal()];
        if (i11 == 1) {
            C43661h c43661hM96083a = C43661h.m96083a(View.inflate(context, R$layout.uta_order_limit_layout, null));
            Intrinsics.checkNotNullExpressionValue(c43661hM96083a, "bind(...)");
            return m95588b(c43661hM96083a, data);
        }
        if (i11 == 2) {
            C43664k c43664kM96089a = C43664k.m96089a(View.inflate(context, R$layout.uta_order_stop_limit_layout, null));
            Intrinsics.checkNotNullExpressionValue(c43664kM96089a, "bind(...)");
            return m95589c(c43664kM96089a, data);
        }
        if (i11 != 3) {
            return null;
        }
        C43659f c43659fM96079a = C43659f.m96079a(View.inflate(context, R$layout.uta_order_advanced_limit_layout, null));
        Intrinsics.checkNotNullExpressionValue(c43659fM96079a, "bind(...)");
        return m95587a(c43659fM96079a, data);
    }
}
