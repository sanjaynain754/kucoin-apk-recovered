package com.kubi.payment.fasttradev2.buy.confirm.widget;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37699v2;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: BuyFluctuationTermsView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewBuyFluctuationTermsBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewBuyFluctuationTermsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isTermsChecked", "", "refreshUI", "", "content", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyFluctuationTermsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyFluctuationTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n41#2:78\n65#2:79\n80#2,7:80\n296#3:87\n*S KotlinDebug\n*F\n+ 1 BuyFluctuationTermsView.kt\ncom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView\n*L\n33#1:78\n33#1:79\n33#1:80,7\n57#1:87\n*E\n"})
public final class BuyFluctuationTermsView extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f39221c = {Reflection.property1(new PropertyReference1Impl(BuyFluctuationTermsView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewBuyFluctuationTermsBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f39222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyFluctuationTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        KuCheckBox kuCheckBox;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39222b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37699v2>() { // from class: com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37699v2 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37699v2.m84988a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_buy_fluctuation_terms, this);
        C37699v2 binding = getBinding();
        if (binding == null || (kuCheckBox = binding.f84768b) == null) {
            return;
        }
        kuCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yt.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BuyFluctuationTermsView.m47745b(compoundButton, z11);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final void m47745b(CompoundButton compoundButton, boolean z11) {
        C43852m.m96591c("B7BuyCryIvy", "toleranceButton", z11 ? "1" : "0", null, 8, null);
    }

    private final C37699v2 getBinding() {
        return (C37699v2) this.f39222b.getValue(this, f39221c[0]);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m47746c() {
        Boolean boolValueOf;
        KuCheckBox kuCheckBox;
        if (getVisibility() != 8) {
            C37699v2 binding = getBinding();
            if (binding != null && (kuCheckBox = binding.f84768b) != null) {
                boolValueOf = Boolean.valueOf(kuCheckBox.isChecked());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m47747d(@Nullable String str) {
        BaseTextView baseTextView;
        if (C27041f.m66668h(str).length() == 0) {
            C27046k.m66700o(this);
            return;
        }
        C27046k.m66685H(this);
        C37699v2 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84769c) != null) {
            baseTextView.setText(C27041f.m66668h(str));
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.c_text))));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyFluctuationTermsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyFluctuationTermsView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
