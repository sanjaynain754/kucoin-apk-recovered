package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$font;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import lt.C42300e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37640j3;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: BuyConfirmLivePriceExplainView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\"\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastLivePriceExplainBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastLivePriceExplainBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onFinishInflate", "", "showText", "fiatCurrency", "", "cryptoCurrency", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyConfirmLivePriceExplainView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyConfirmLivePriceExplainView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,80:1\n41#2:81\n65#2:82\n80#2,7:83\n*S KotlinDebug\n*F\n+ 1 BuyConfirmLivePriceExplainView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView\n*L\n31#1:81\n31#1:82\n31#1:83,7\n*E\n"})
public final class BuyConfirmLivePriceExplainView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f39213o = {Reflection.property1(new PropertyReference1Impl(BuyConfirmLivePriceExplainView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastLivePriceExplainBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f39214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyConfirmLivePriceExplainView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39214n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37640j3>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37640j3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37640j3.m84864a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_live_price_explain, this);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m47738d(BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(buyConfirmLivePriceExplainView.getContext(), R$font.medium));
        ds2.setColor(ContextCompat.getColor(buyConfirmLivePriceExplainView.getContext(), R$color.brandGreen));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final void m47739e(FragmentManager fragmentManager, BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainView, String str, String str2, View view) {
        C42300e c42300e = C42300e.f93799a;
        String string = buyConfirmLivePriceExplainView.getContext().getString(R$string.payment_price_is_live, C45148b.m99794d(str));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = buyConfirmLivePriceExplainView.getContext().getString(R$string.payment_price_is_live_explain, C45148b.m99794d(str), C45148b.m99794d(str2), C45148b.m99794d(str));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C42300e.m92839e(c42300e, fragmentManager, "payment_fast_buy_confirm_learn_more", string, string2, null, null, null, 112, null);
    }

    private final C37640j3 getBinding() {
        return (C37640j3) this.f39214n.getValue(this, f39213o[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m47740c(@Nullable final String str, @Nullable final String str2, @NotNull final FragmentManager fragmentManager) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        C37640j3 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f84102c) != null) {
            baseTextView2.setText(getContext().getString(R$string.payment_estimated_price_tip, C45148b.m99794d(str2)));
        }
        C37640j3 binding2 = getBinding();
        if (binding2 == null || (baseTextView = binding2.f84102c) == null) {
            return;
        }
        HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: yt.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyConfirmLivePriceExplainView.m47738d(this.f104320b, (TextPaint) obj);
            }
        }, new View.OnClickListener() { // from class: yt.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuyConfirmLivePriceExplainView.m47739e(fragmentManager, this, str2, str, view);
            }
        })));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        BaseTextView baseTextView;
        super.onFinishInflate();
        C37640j3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84102c) != null) {
            baseTextView.setTextColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text40));
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmLivePriceExplainView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyConfirmLivePriceExplainView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
