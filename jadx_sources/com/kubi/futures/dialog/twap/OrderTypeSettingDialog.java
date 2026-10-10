package com.kubi.futures.dialog.twap;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.dialog.twap.OrderTypeSettingDialog;
import com.kubi.futures.trade.submit.panel.view.twap.CustomPriceWithPercentView;
import com.kubi.futures.trade.submit.panel.view.twap.CustomPriceWithValueView;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36765g1;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\tR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogTwapOrderTypeSettingBinding;", "curMarketPrice", "", "getCurMarketPrice", "()Ljava/lang/String;", "curMarketPrice$delegate", "Lkotlin/Lazy;", "symbol", "getSymbol", "symbol$delegate", "reqKey", "getReqKey", "reqKey$delegate", "priceSettingView", "Landroid/view/View;", "percentTv", "Lcom/kubi/resources/widget/BaseTextView;", "valueDeltaTv", "customPriceWithPercentView", "Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithPercentView;", "customPriceWithValueView", "Lcom/kubi/futures/trade/submit/panel/view/twap/CustomPriceWithValueView;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initType", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setSelected", "orderPriceType", "Lcom/kubi/futures/dialog/twap/OrderPriceType;", "switchPriceType", "setCustomPriceSelected", "isSelected", "", "initPriceSettingViewStub", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderTypeSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderTypeSettingDialog.kt\ncom/kubi/futures/dialog/twap/OrderTypeSettingDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,272:1\n1#2:273\n254#3:274\n*S KotlinDebug\n*F\n+ 1 OrderTypeSettingDialog.kt\ncom/kubi/futures/dialog/twap/OrderTypeSettingDialog\n*L\n106#1:274\n*E\n"})
public final class OrderTypeSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public static final Companion f22912z0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public C36765g1 f22913q0;

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f22914r0 = LazyKt.lazy(new Function0() { // from class: zh.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderTypeSettingDialog.m25387s4(this.f104689b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f22915s0 = LazyKt.lazy(new Function0() { // from class: zh.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderTypeSettingDialog.m25377H4(this.f104690b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f22916t0 = LazyKt.lazy(new Function0() { // from class: zh.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OrderTypeSettingDialog.m25376D4(this.f104691b);
        }
    });

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public View f22917u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public BaseTextView f22918v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public BaseTextView f22919w0;

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public CustomPriceWithPercentView f22920x0;

    /* JADX INFO: renamed from: y0 */
    @Nullable
    public CustomPriceWithValueView f22921y0;

    /* JADX INFO: compiled from: OrderTypeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog$Companion;", "", "<init>", "()V", "TAG", "", "EXTRA_CUR_MARKET_PRICE", "EXTRA_RES_ORDER_PRICE_TYPE", "newInstance", "Lcom/kubi/futures/dialog/twap/OrderTypeSettingDialog;", "reqKey", "curMarketPrice", "Ljava/math/BigDecimal;", "symbol", "curOrderPriceType", "Lcom/kubi/futures/dialog/twap/OrderPriceType;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OrderTypeSettingDialog newInstance(@NotNull String reqKey, @Nullable BigDecimal curMarketPrice, @NotNull String symbol, @Nullable OrderPriceType curOrderPriceType) {
            Intrinsics.checkNotNullParameter(reqKey, "reqKey");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            OrderTypeSettingDialog orderTypeSettingDialog = new OrderTypeSettingDialog();
            Bundle bundle = new Bundle();
            bundle.putString("data_1", reqKey);
            bundle.putString("cur_market_price", curMarketPrice != null ? curMarketPrice.toPlainString() : null);
            bundle.putString("symbol", symbol);
            bundle.putParcelable("data", curOrderPriceType);
            orderTypeSettingDialog.setArguments(bundle);
            return orderTypeSettingDialog;
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m25373A4(OrderTypeSettingDialog orderTypeSettingDialog) {
        orderTypeSettingDialog.m25394F4(OrderPriceType.MarketPrice.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    private final String m25388u4() {
        return (String) this.f22916t0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    private final String m25389v4() {
        return (String) this.f22915s0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m25390x4(OrderTypeSettingDialog orderTypeSettingDialog) {
        BaseTextView baseTextView = orderTypeSettingDialog.f22918v0;
        if (baseTextView != null) {
            baseTextView.setSelected(true);
        }
        BaseTextView baseTextView2 = orderTypeSettingDialog.f22919w0;
        if (baseTextView2 != null) {
            baseTextView2.setSelected(false);
        }
        BaseTextView baseTextView3 = orderTypeSettingDialog.f22918v0;
        if (baseTextView3 != null) {
            baseTextView3.setBackgroundResource(R$drawable.shape_darkoverlay_6r);
        }
        BaseTextView baseTextView4 = orderTypeSettingDialog.f22919w0;
        if (baseTextView4 != null) {
            baseTextView4.setBackground(null);
        }
        BaseTextView baseTextView5 = orderTypeSettingDialog.f22918v0;
        if (baseTextView5 != null) {
            baseTextView5.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        }
        BaseTextView baseTextView6 = orderTypeSettingDialog.f22919w0;
        if (baseTextView6 != null) {
            baseTextView6.setTextColor(C27017c.f54310a.m66512a(R$color.c_text60));
        }
        CustomPriceWithPercentView customPriceWithPercentView = orderTypeSettingDialog.f22920x0;
        if (customPriceWithPercentView != null) {
            C27046k.m66685H(customPriceWithPercentView);
        }
        CustomPriceWithValueView customPriceWithValueView = orderTypeSettingDialog.f22921y0;
        if (customPriceWithValueView != null) {
            C27046k.m66700o(customPriceWithValueView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m25391y4(OrderTypeSettingDialog orderTypeSettingDialog) {
        BaseTextView baseTextView = orderTypeSettingDialog.f22918v0;
        if (baseTextView != null) {
            baseTextView.setSelected(false);
        }
        BaseTextView baseTextView2 = orderTypeSettingDialog.f22919w0;
        if (baseTextView2 != null) {
            baseTextView2.setSelected(true);
        }
        BaseTextView baseTextView3 = orderTypeSettingDialog.f22919w0;
        if (baseTextView3 != null) {
            baseTextView3.setBackgroundResource(R$drawable.shape_darkoverlay_6r);
        }
        BaseTextView baseTextView4 = orderTypeSettingDialog.f22918v0;
        if (baseTextView4 != null) {
            baseTextView4.setBackground(null);
        }
        BaseTextView baseTextView5 = orderTypeSettingDialog.f22918v0;
        if (baseTextView5 != null) {
            baseTextView5.setTextColor(C27017c.f54310a.m66512a(R$color.c_text60));
        }
        BaseTextView baseTextView6 = orderTypeSettingDialog.f22919w0;
        if (baseTextView6 != null) {
            baseTextView6.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
        }
        CustomPriceWithPercentView customPriceWithPercentView = orderTypeSettingDialog.f22920x0;
        if (customPriceWithPercentView != null) {
            C27046k.m66700o(customPriceWithPercentView);
        }
        CustomPriceWithValueView customPriceWithValueView = orderTypeSettingDialog.f22921y0;
        if (customPriceWithValueView != null) {
            C27046k.m66685H(customPriceWithValueView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m25392z4(OrderTypeSettingDialog orderTypeSettingDialog) {
        FragmentManager supportFragmentManager;
        C36765g1 c36765g1 = orderTypeSettingDialog.f22913q0;
        Parcelable parcelableJ = null;
        parcelableJ = null;
        if (c36765g1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g1 = null;
        }
        if (c36765g1.f80112f.isSelected()) {
            parcelableJ = OrderPriceType.MarketPrice.INSTANCE;
        } else {
            CustomPriceWithPercentView customPriceWithPercentView = orderTypeSettingDialog.f22920x0;
            if (customPriceWithPercentView == null || customPriceWithPercentView.getVisibility() != 0) {
                CustomPriceWithValueView customPriceWithValueView = orderTypeSettingDialog.f22921y0;
                if (customPriceWithValueView != null) {
                    String strM25396t4 = orderTypeSettingDialog.m25396t4();
                    parcelableJ = customPriceWithValueView.j(strM25396t4 != null ? StringsKt.toBigDecimalOrNull(strM25396t4) : null);
                }
            } else {
                CustomPriceWithPercentView customPriceWithPercentView2 = orderTypeSettingDialog.f22920x0;
                if (customPriceWithPercentView2 != null) {
                    parcelableJ = customPriceWithPercentView2.h();
                }
            }
        }
        if (parcelableJ != null) {
            FragmentActivity activity = orderTypeSettingDialog.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                String strM25388u4 = orderTypeSettingDialog.m25388u4();
                Bundle bundle = new Bundle();
                bundle.putParcelable("order_price_type", parcelableJ);
                Unit unit = Unit.INSTANCE;
                supportFragmentManager.setFragmentResult(strM25388u4, bundle);
            }
            orderTypeSettingDialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public final void m25393E4(boolean z11) {
        C36765g1 c36765g1 = this.f22913q0;
        C36765g1 c36765g2 = null;
        if (c36765g1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g1 = null;
        }
        c36765g1.f80112f.setSelected(!z11);
        C36765g1 c36765g3 = this.f22913q0;
        if (c36765g3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36765g2 = c36765g3;
        }
        c36765g2.f80109c.setSelected(z11);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m25394F4(OrderPriceType orderPriceType) {
        if (orderPriceType instanceof OrderPriceType.CustomPriceWithPercent) {
            m25393E4(true);
            View view = this.f22917u0;
            if (view == null) {
                m25397w4();
            } else if (view != null) {
                C27046k.m66685H(view);
            }
            BaseTextView baseTextView = this.f22918v0;
            if (baseTextView != null) {
                baseTextView.performClick();
            }
            CustomPriceWithPercentView customPriceWithPercentView = this.f22920x0;
            if (customPriceWithPercentView != null) {
                customPriceWithPercentView.setInputPercent(((OrderPriceType.CustomPriceWithPercent) orderPriceType).getPercent());
                return;
            }
            return;
        }
        if (!(orderPriceType instanceof OrderPriceType.CustomPriceWithValueDelta)) {
            if (!(orderPriceType instanceof OrderPriceType.MarketPrice)) {
                throw new NoWhenBranchMatchedException();
            }
            m25393E4(false);
            View view2 = this.f22917u0;
            if (view2 != null) {
                C27046k.m66700o(view2);
            }
            View view3 = this.f22917u0;
            if (view3 != null) {
                KeyboardUtils.m6034f(view3);
                return;
            }
            return;
        }
        m25393E4(true);
        View view4 = this.f22917u0;
        if (view4 == null) {
            m25397w4();
        } else if (view4 != null) {
            C27046k.m66685H(view4);
        }
        BaseTextView baseTextView2 = this.f22919w0;
        if (baseTextView2 != null) {
            baseTextView2.performClick();
        }
        CustomPriceWithValueView customPriceWithValueView = this.f22921y0;
        if (customPriceWithValueView != null) {
            customPriceWithValueView.setInputDelta(((OrderPriceType.CustomPriceWithValueDelta) orderPriceType).getValueDelta());
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m25395G4() {
        C36765g1 c36765g1 = this.f22913q0;
        if (c36765g1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g1 = null;
        }
        if (!c36765g1.f80112f.isSelected()) {
            m25393E4(false);
            View view = this.f22917u0;
            if (view != null) {
                C27046k.m66700o(view);
                return;
            }
            return;
        }
        m25393E4(true);
        View view2 = this.f22917u0;
        if (view2 == null) {
            m25397w4();
        } else if (view2 != null) {
            C27046k.m66685H(view2);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C36765g1 c36765g1M82384c = C36765g1.m82384c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c36765g1M82384c, "inflate(...)");
        this.f22913q0 = c36765g1M82384c;
        if (c36765g1M82384c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g1M82384c = null;
        }
        return c36765g1M82384c.getRoot();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        OrderPriceType orderPriceType;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (orderPriceType = (OrderPriceType) BundleCompat.getParcelable(arguments, "data", OrderPriceType.class)) == null) {
            orderPriceType = OrderPriceType.MarketPrice.INSTANCE;
        }
        m25394F4(orderPriceType);
        C36765g1 c36765g1 = this.f22913q0;
        C36765g1 c36765g2 = null;
        if (c36765g1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g1 = null;
        }
        ConstraintLayout marketPriceCl = c36765g1.f80111e;
        Intrinsics.checkNotNullExpressionValue(marketPriceCl, "marketPriceCl");
        C27046k.m66711z(marketPriceCl, 0L, new Function0() { // from class: zh.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeSettingDialog.m25373A4(this.f104692b);
            }
        }, 1, null);
        C36765g1 c36765g3 = this.f22913q0;
        if (c36765g3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g3 = null;
        }
        BaseTextView customPriceTv = c36765g3.f80109c;
        Intrinsics.checkNotNullExpressionValue(customPriceTv, "customPriceTv");
        C27046k.m66711z(customPriceTv, 0L, new Function0() { // from class: zh.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeSettingDialog.m25374B4(this.f104693b);
            }
        }, 1, null);
        C36765g1 c36765g4 = this.f22913q0;
        if (c36765g4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g4 = null;
        }
        ImageView ivClose = c36765g4.f80110d;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: zh.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeSettingDialog.m25375C4(this.f104694b);
            }
        }, 1, null);
        C36765g1 c36765g5 = this.f22913q0;
        if (c36765g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c36765g2 = c36765g5;
        }
        KcPrimaryButton confirmTv = c36765g2.f80108b;
        Intrinsics.checkNotNullExpressionValue(confirmTv, "confirmTv");
        C27046k.m66711z(confirmTv, 0L, new Function0() { // from class: zh.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTypeSettingDialog.m25392z4(this.f104695b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t4 */
    public final String m25396t4() {
        return (String) this.f22914r0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final void m25397w4() {
        C36765g1 c36765g1 = this.f22913q0;
        if (c36765g1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c36765g1 = null;
        }
        View viewInflate = c36765g1.f80113g.inflate();
        this.f22917u0 = viewInflate;
        BaseTextView baseTextView = viewInflate != null ? (BaseTextView) viewInflate.findViewById(R$id.percentTv) : null;
        this.f22918v0 = baseTextView;
        if (baseTextView != null) {
            baseTextView.setSelected(true);
        }
        View view = this.f22917u0;
        this.f22919w0 = view != null ? (BaseTextView) view.findViewById(R$id.valueDeltaTv) : null;
        View view2 = this.f22917u0;
        this.f22920x0 = view2 != null ? (CustomPriceWithPercentView) view2.findViewById(R$id.customPriceWithPercentView) : null;
        View view3 = this.f22917u0;
        CustomPriceWithValueView customPriceWithValueView = view3 != null ? (CustomPriceWithValueView) view3.findViewById(R$id.customPriceWithValueView) : null;
        this.f22921y0 = customPriceWithValueView;
        if (customPriceWithValueView != null) {
            String strM25396t4 = m25396t4();
            customPriceWithValueView.k(C41014a.m89922G(strM25396t4 != null ? StringsKt.toBigDecimalOrNull(strM25396t4) : null, null, 1, null), InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(m25389v4()), false, 2, null));
        }
        BaseTextView baseTextView2 = this.f22918v0;
        if (baseTextView2 != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: zh.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTypeSettingDialog.m25390x4(this.f104696b);
                }
            }, 1, null);
        }
        BaseTextView baseTextView3 = this.f22919w0;
        if (baseTextView3 != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: zh.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTypeSettingDialog.m25391y4(this.f104697b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m25374B4(OrderTypeSettingDialog orderTypeSettingDialog) {
        orderTypeSettingDialog.m25395G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m25375C4(OrderTypeSettingDialog orderTypeSettingDialog) {
        orderTypeSettingDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final String m25376D4(OrderTypeSettingDialog orderTypeSettingDialog) {
        String string;
        Bundle arguments = orderTypeSettingDialog.getArguments();
        if (arguments != null && (string = arguments.getString("data_1")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: H4 */
    public static final String m25377H4(OrderTypeSettingDialog orderTypeSettingDialog) {
        Bundle arguments = orderTypeSettingDialog.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "symbol");
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static final String m25387s4(OrderTypeSettingDialog orderTypeSettingDialog) {
        Bundle arguments = orderTypeSettingDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("cur_market_price");
        }
        return null;
    }
}
