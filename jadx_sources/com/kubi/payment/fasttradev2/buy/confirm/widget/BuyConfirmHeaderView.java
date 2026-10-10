package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.trade.welfare.C14439y;
import com.kubi.otc.R$font;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.buy.p2p.a;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37605c3;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: BuyConfirmHeaderView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmHeaderBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "showAmount", "", "amount", "", FirebaseAnalytics.Param.CURRENCY, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyConfirmHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmHeaderView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,75:1\n41#2:76\n65#2:77\n80#2,7:78\n*S KotlinDebug\n*F\n+ 1 BuyConfirmHeaderView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView\n*L\n32#1:76\n32#1:77\n32#1:78,7\n*E\n"})
public final class BuyConfirmHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f39208o = {Reflection.property1(new PropertyReference1Impl(BuyConfirmHeaderView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastBuyConfirmHeaderBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f39209n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyConfirmHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39209n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37605c3>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37605c3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37605c3.m84793a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_buy_confirm_header, this);
    }

    private final C37605c3 getBinding() {
        return (C37605c3) this.f39209n.getValue(this, f39208o[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m47729a(@NotNull String amount, @NotNull String currency) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        int iM48248b = PrecisionHelper.f39545a.m48248b(currency);
        C37605c3 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f83756b) != null) {
            Context context = getContext();
            int i11 = R$string.payment_quick_input;
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(amount);
            baseTextView2.setText(context.getString(i11, C42180b.m92647l(bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, iM48248b, false, true, false, 0, null, 117, null) : null), currency));
        }
        C37605c3 binding2 = getBinding();
        if (binding2 == null || (baseTextView = binding2.f83756b) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(baseTextView, new Pair(textTagEnum, new AbsoluteSizeSpan(14, true)), new Pair(textTagEnum, new TypefaceSpan("monospace")));
            return;
        }
        HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
        Pair pair = new Pair(textTagEnum2, new AbsoluteSizeSpan(14, true));
        a.a();
        Typeface font = ResourcesCompat.getFont(getContext(), R$font.regular);
        if (font == null) {
            font = Typeface.DEFAULT;
        }
        highlightTextHelper2.m54120f(baseTextView, pair, new Pair(textTagEnum2, C14439y.m28811a(font)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmHeaderView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
