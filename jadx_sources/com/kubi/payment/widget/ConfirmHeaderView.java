package com.kubi.payment.widget;

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
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37625g3;
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

/* JADX INFO: compiled from: ConfirmHeaderView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/widget/ConfirmHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastConfirmHeaderBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastConfirmHeaderBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "showAmount", "", "amount", "", FirebaseAnalytics.Param.CURRENCY, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfirmHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmHeaderView.kt\ncom/kubi/payment/widget/ConfirmHeaderView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,73:1\n41#2:74\n65#2:75\n80#2,7:76\n*S KotlinDebug\n*F\n+ 1 ConfirmHeaderView.kt\ncom/kubi/payment/widget/ConfirmHeaderView\n*L\n31#1:74\n31#1:75\n31#1:76,7\n*E\n"})
public final class ConfirmHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f40396o = {Reflection.property1(new PropertyReference1Impl(ConfirmHeaderView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastConfirmHeaderBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f40397n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40397n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37625g3>() { // from class: com.kubi.payment.widget.ConfirmHeaderView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37625g3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37625g3.m84832a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_confirm_header, this);
    }

    private final C37625g3 getBinding() {
        return (C37625g3) this.f40397n.getValue(this, f40396o[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m49863a(@Nullable String str, @Nullable String str2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C37625g3 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f83933b) != null) {
            Context context = getContext();
            int i11 = R$string.payment_quick_input;
            String strM92640e = null;
            BigDecimal bigDecimalM92637b = C42180b.m92637b(str, null, 1, null);
            if (bigDecimalM92637b != null) {
                strM92640e = C42180b.m92640e(bigDecimalM92637b, null, 0, false, true, true, 0, null, 103, null);
            }
            baseTextView2.setText(context.getString(i11, C42180b.m92647l(strM92640e), str2));
        }
        C37625g3 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f83933b) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
                HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
                Pair pair = new Pair(textTagEnum, new AbsoluteSizeSpan(14, true));
                com.kubi.payment.fast.buy.p2p.a.a();
                Typeface font = ResourcesCompat.getFont(getContext(), R$font.medium);
                if (font == null) {
                    font = Typeface.DEFAULT;
                }
                highlightTextHelper.m54120f(baseTextView, pair, new Pair(textTagEnum, C14439y.m28811a(font)));
                return;
            }
            HighlightTextHelper highlightTextHelper2 = HighlightTextHelper.f43497a;
            HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper2.m54120f(baseTextView, new Pair(textTagEnum2, new AbsoluteSizeSpan(14, true)), new Pair(textTagEnum2, new TypefaceSpan("monospace")));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmHeaderView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
