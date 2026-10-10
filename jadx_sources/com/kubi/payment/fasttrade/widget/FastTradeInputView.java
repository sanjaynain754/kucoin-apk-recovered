package com.kubi.payment.fasttrade.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.TypedValueCompat;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$layout;
import com.kubi.payment.fasttrade.widget.FastTradeInputView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37635i3;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: FastTradeInputView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0003-./B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0013J\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u001aH\u0014J0\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0014R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/widget/FastTradeInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastInputBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastInputBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradeType", "", "quoteType", "onFastInputListener", "Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$OnFastInputListener;", "defaultMargin", "", "setTradeType", "", "setQuoteType", "setCurrency", "fiatCurrency", "cryptoCurrency", "setFastInputListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "amount", "setAmount", "tvAmountView", "Lcom/kubi/payment/fasttrade/widget/FastTradeTextView;", "onFinishInflate", ViewProps.ON_LAYOUT, "changed", "", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "OnFastInputListener", "QuoteType", "FastTradeType", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeInputView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeInputView.kt\ncom/kubi/payment/fasttrade/widget/FastTradeInputView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,200:1\n41#2:201\n65#2:202\n80#2,7:203\n375#3,2:210\n*S KotlinDebug\n*F\n+ 1 FastTradeInputView.kt\ncom/kubi/payment/fasttrade/widget/FastTradeInputView\n*L\n34#1:201\n34#1:202\n34#1:203,7\n157#1:210,2\n*E\n"})
public final class FastTradeInputView extends ConstraintLayout {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ KProperty<Object>[] f38949s = {Reflection.property1(new PropertyReference1Impl(FastTradeInputView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastInputBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f38950n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public String f38951o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public String f38952p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public InterfaceC20679a f38953q;

    /* JADX INFO: renamed from: r */
    public final float f38954r;

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.widget.FastTradeInputView$a */
    /* JADX INFO: compiled from: FastTradeInputView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/widget/FastTradeInputView$OnFastInputListener;", "", "onQuoteTypeChanged", "", "quoteType", "", "onSelectFiatCurrencyClicked", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC20679a {
        /* JADX INFO: renamed from: a */
        void mo46795a();

        /* JADX INFO: renamed from: b */
        void mo46796b(@NotNull String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38950n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37635i3>() { // from class: com.kubi.payment.fasttrade.widget.FastTradeInputView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37635i3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37635i3.m84853a(C45682f.m100801b(viewGroup));
            }
        });
        this.f38954r = TypedValueCompat.dpToPx(8.0f, getResources().getDisplayMetrics()) * 2;
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_input, this);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m47151g(FastTradeInputView fastTradeInputView) {
        if (!Intrinsics.areEqual(fastTradeInputView.f38952p, "FIAT")) {
            return Unit.INSTANCE;
        }
        InterfaceC20679a interfaceC20679a = fastTradeInputView.f38953q;
        if (interfaceC20679a != null) {
            interfaceC20679a.mo46795a();
        }
        return Unit.INSTANCE;
    }

    private final C37635i3 getBinding() {
        return (C37635i3) this.f38950n.getValue(this, f38949s[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m47152h(FastTradeInputView fastTradeInputView) {
        FastTradeTextView fastTradeTextView;
        fastTradeInputView.f38952p = Intrinsics.areEqual(fastTradeInputView.f38952p, "FIAT") ? "CRYPTO" : "FIAT";
        C37635i3 binding = fastTradeInputView.getBinding();
        if (binding != null && (fastTradeTextView = binding.f84044e) != null) {
            fastTradeTextView.m47165i();
        }
        InterfaceC20679a interfaceC20679a = fastTradeInputView.f38953q;
        if (interfaceC20679a != null) {
            interfaceC20679a.mo46796b(C27041f.m66668h(fastTradeInputView.f38952p));
        }
        C43852m.m96590b("B7FastTrade", "inputMode", Intrinsics.areEqual(fastTradeInputView.f38952p, "FIAT") ? "1" : "2", TuplesKt.m90091to("type", Intrinsics.areEqual(fastTradeInputView.f38951o, "BUY") ? "buy" : "sell"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m47154i(@NotNull String fiatCurrency, @NotNull String cryptoCurrency) {
        BaseTextView baseTextView;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView2;
        FastTradeTextView fastTradeTextView;
        BaseTextView baseTextView3;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView4;
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
        if (Intrinsics.areEqual(this.f38952p, "FIAT")) {
            C37635i3 binding = getBinding();
            if (binding != null && (baseTextView4 = binding.f84045f) != null) {
                baseTextView4.setText(fiatCurrency);
            }
            C37635i3 binding2 = getBinding();
            if (binding2 != null && (appCompatImageView2 = binding2.f84041b) != null) {
                C27046k.m66685H(appCompatImageView2);
            }
            C37635i3 binding3 = getBinding();
            if (binding3 != null && (baseTextView3 = binding3.f84046g) != null) {
                baseTextView3.setText(cryptoCurrency);
            }
        } else {
            C37635i3 binding4 = getBinding();
            if (binding4 != null && (baseTextView2 = binding4.f84045f) != null) {
                baseTextView2.setText(cryptoCurrency);
            }
            C37635i3 binding5 = getBinding();
            if (binding5 != null && (appCompatImageView = binding5.f84041b) != null) {
                C27046k.m66700o(appCompatImageView);
            }
            C37635i3 binding6 = getBinding();
            if (binding6 != null && (baseTextView = binding6.f84046g) != null) {
                baseTextView.setText(fiatCurrency);
            }
        }
        C37635i3 binding7 = getBinding();
        if (binding7 == null || (fastTradeTextView = binding7.f84044e) == null) {
            return;
        }
        fastTradeTextView.m47165i();
    }

    public final void setAmount(@NotNull String amount) {
        FastTradeTextView fastTradeTextView;
        Intrinsics.checkNotNullParameter(amount, "amount");
        C37635i3 binding = getBinding();
        if (binding == null || (fastTradeTextView = binding.f84044e) == null) {
            return;
        }
        fastTradeTextView.setAmount(amount);
    }

    public final void setFastInputListener(@NotNull InterfaceC20679a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38953q = listener;
    }

    public final void setQuoteType(@NotNull String quoteType) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        Intrinsics.checkNotNullParameter(quoteType, "quoteType");
        this.f38952p = quoteType;
        if (Intrinsics.areEqual(quoteType, "FIAT")) {
            C37635i3 binding = getBinding();
            if (binding == null || (appCompatImageView2 = binding.f84041b) == null) {
                return;
            }
            C27046k.m66685H(appCompatImageView2);
            return;
        }
        C37635i3 binding2 = getBinding();
        if (binding2 == null || (appCompatImageView = binding2.f84041b) == null) {
            return;
        }
        C27046k.m66700o(appCompatImageView);
    }

    public final void setTradeType(@NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        this.f38951o = tradeType;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m47153f() {
        String f38963h;
        FastTradeTextView fastTradeTextView;
        C37635i3 binding = getBinding();
        if (binding != null && (fastTradeTextView = binding.f84044e) != null) {
            f38963h = fastTradeTextView.getF38963h();
        } else {
            f38963h = null;
        }
        return C27041f.m66669i(f38963h, "0");
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final FastTradeTextView m47155j() {
        C37635i3 binding = getBinding();
        if (binding != null) {
            return binding.f84044e;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat;
        super.onFinishInflate();
        C37635i3 binding = getBinding();
        if (binding != null && (linearLayoutCompat = binding.f84042c) != null) {
            C27046k.m66710y(linearLayoutCompat, 1000L, new Function0() { // from class: xt.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FastTradeInputView.m47151g(this.f103906b);
                }
            });
        }
        C37635i3 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f84046g) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: xt.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FastTradeInputView.m47152h(this.f103907b);
                }
            }, 1, null);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Integer numValueOf;
        Integer numValueOf2;
        C37635i3 binding;
        FastTradeTextView fastTradeTextView;
        LinearLayoutCompat linearLayoutCompat;
        int marginStart;
        LinearLayoutCompat linearLayoutCompat2;
        BaseTextView baseTextView;
        super.onLayout(changed, left, top, right, bottom);
        C37635i3 binding2 = getBinding();
        Integer numValueOf3 = null;
        if (binding2 != null && (baseTextView = binding2.f84046g) != null) {
            numValueOf = Integer.valueOf(baseTextView.getWidth());
        } else {
            numValueOf = null;
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        C37635i3 binding3 = getBinding();
        if (binding3 != null && (linearLayoutCompat2 = binding3.f84042c) != null) {
            numValueOf2 = Integer.valueOf(linearLayoutCompat2.getWidth());
        } else {
            numValueOf2 = null;
        }
        int iM66650j2 = C27039d.m66650j(numValueOf2);
        C37635i3 binding4 = getBinding();
        if (binding4 != null && (linearLayoutCompat = binding4.f84042c) != null) {
            ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            numValueOf3 = Integer.valueOf(marginStart);
        }
        int iM66650j3 = C27039d.m66650j(numValueOf3);
        C44128b.m97259c("payment", "onLayout changed:" + changed + ",left:" + left + ",right:" + right + ",width:" + getWidth() + ",tvSwitchWidth:" + iM66650j + ",layoutCurrencyWidth:" + iM66650j2 + ",layoutCurrencyMarginStartWidth:" + iM66650j3);
        if (getWidth() > 0) {
            float width = (((getWidth() - iM66650j) - this.f38954r) - iM66650j2) - iM66650j3;
            if (width > 0.0f && (binding = getBinding()) != null && (fastTradeTextView = binding.f84044e) != null) {
                fastTradeTextView.setMaxAllowedWidth(width);
            }
            C44128b.m97259c("payment", "FastTradeInputView onLayout maxAmountWidth:" + width);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FastTradeInputView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FastTradeInputView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
