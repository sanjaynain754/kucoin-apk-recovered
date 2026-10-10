package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.FontRes;
import androidx.annotation.GravityInt;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import k00.C40837a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: TradePairNameTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J$\u0010\u0015\u001a\u00020\u00112\b\b\u0003\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007J$\u0010\u0019\u001a\u00020\u00112\b\b\u0003\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/widget/TradePairNameTextView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/CommonLayoutTradepairNameBinding;", "getBinding", "()Lcom/kubi/sdk/res/databinding/CommonLayoutTradepairNameBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setTradePairName", "", "currencyBaseName", "", "currencyQuoteName", "setBaseCurrencyStyle", "fontId", "fontSizeSp", "textColor", "setQuoteCurrencyStyle", "setQuoteCurrencyGravity", "gravity", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradePairNameTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradePairNameTextView.kt\ncom/kubi/resources/widget/TradePairNameTextView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,88:1\n52#2:89\n80#2,7:90\n*S KotlinDebug\n*F\n+ 1 TradePairNameTextView.kt\ncom/kubi/resources/widget/TradePairNameTextView\n*L\n26#1:89\n26#1:90,7\n*E\n"})
public final class TradePairNameTextView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f44188c = {Reflection.property1(new PropertyReference1Impl(TradePairNameTextView.class, "binding", "getBinding()Lcom/kubi/sdk/res/databinding/CommonLayoutTradepairNameBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f44189b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradePairNameTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradePairNameTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m54902f(TradePairNameTextView tradePairNameTextView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = R$font.medium;
        }
        if ((i14 & 2) != 0) {
            i12 = 15;
        }
        if ((i14 & 4) != 0) {
            Context context = tradePairNameTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i13 = C27046k.m66699n(context, R$color.c_text);
        }
        tradePairNameTextView.m54908e(i11, i12, i13);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m54905j(TradePairNameTextView tradePairNameTextView, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = R$font.regular;
        }
        if ((i14 & 2) != 0) {
            i12 = 13;
        }
        if ((i14 & 4) != 0) {
            Context context = tradePairNameTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i13 = C27046k.m66699n(context, R$color.c_text40);
        }
        tradePairNameTextView.m54909i(i11, i12, i13);
    }

    /* JADX INFO: renamed from: e */
    public final void m54908e(@FontRes final int i11, final int i12, final int i13) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.q3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePairNameTextView.m54903g(this.f45025b, i11, i12, i13);
            }
        });
    }

    @Nullable
    public final C40837a getBinding() {
        return (C40837a) this.f44189b.getValue(this, f44188c[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m54909i(@FontRes final int i11, final int i12, final int i13) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.r3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePairNameTextView.m54906k(this.f45032b, i11, i12, i13);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m54910l(@NotNull final String currencyBaseName, @NotNull final String currencyQuoteName) {
        Intrinsics.checkNotNullParameter(currencyBaseName, "currencyBaseName");
        Intrinsics.checkNotNullParameter(currencyQuoteName, "currencyQuoteName");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.p3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePairNameTextView.m54907m(this.f45018b, currencyBaseName, currencyQuoteName);
            }
        });
    }

    public final void setQuoteCurrencyGravity(@GravityInt final int gravity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.o3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePairNameTextView.m54904h(this.f45012b, gravity);
            }
        });
    }

    public /* synthetic */ TradePairNameTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m54903g(TradePairNameTextView tradePairNameTextView, int i11, int i12, int i13) {
        BaseTextView baseTextView;
        C40837a binding = tradePairNameTextView.getBinding();
        if (binding != null && (baseTextView = binding.f90722c) != null) {
            baseTextView.setTypeface(ResourcesCompat.getFont(tradePairNameTextView.getContext(), i11));
            baseTextView.setTextSize(i12);
            baseTextView.setTextColor(i13);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m54904h(TradePairNameTextView tradePairNameTextView, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        C40837a binding = tradePairNameTextView.getBinding();
        if (binding != null && (linearLayoutCompat = binding.f90721b) != null) {
            linearLayoutCompat.setGravity(i11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m54906k(TradePairNameTextView tradePairNameTextView, int i11, int i12, int i13) {
        BaseTextView baseTextView;
        C40837a binding = tradePairNameTextView.getBinding();
        if (binding != null && (baseTextView = binding.f90723d) != null) {
            baseTextView.setTypeface(ResourcesCompat.getFont(tradePairNameTextView.getContext(), i11));
            baseTextView.setTextSize(i12);
            baseTextView.setTextColor(i13);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m54907m(TradePairNameTextView tradePairNameTextView, String str, String str2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        C40837a binding = tradePairNameTextView.getBinding();
        if (binding != null && (baseTextView4 = binding.f90722c) != null) {
            baseTextView4.setText(str);
        }
        C40837a binding2 = tradePairNameTextView.getBinding();
        if (binding2 != null && (baseTextView3 = binding2.f90723d) != null) {
            baseTextView3.setText('/' + str2);
        }
        if (str2.length() == 0) {
            C40837a binding3 = tradePairNameTextView.getBinding();
            if (binding3 != null && (baseTextView2 = binding3.f90723d) != null) {
                C27046k.m66700o(baseTextView2);
            }
        } else {
            C40837a binding4 = tradePairNameTextView.getBinding();
            if (binding4 != null && (baseTextView = binding4.f90723d) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradePairNameTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44189b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C40837a>() { // from class: com.kubi.resources.widget.TradePairNameTextView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C40837a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C40837a.m89370a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.common_layout_tradepair_name, (ViewGroup) this, true);
    }
}
