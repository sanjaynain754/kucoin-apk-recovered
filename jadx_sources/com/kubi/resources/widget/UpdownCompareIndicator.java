package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.resources.C22890g;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$layout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import k00.C40856t;
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
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: UpdownCompareIndicator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/resources/widget/UpdownCompareIndicator;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/ViewUpDownCompareIndicatorBinding;", "getBinding", "()Lcom/kubi/sdk/res/databinding/ViewUpDownCompareIndicatorBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "updateView", "", "up", "unchange", "down", "resetAll", "isShow", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUpdownCompareIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdownCompareIndicator.kt\ncom/kubi/resources/widget/UpdownCompareIndicator\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,91:1\n52#2:92\n80#2,7:93\n28#3:100\n28#3:101\n*S KotlinDebug\n*F\n+ 1 UpdownCompareIndicator.kt\ncom/kubi/resources/widget/UpdownCompareIndicator\n*L\n31#1:92\n31#1:93,7\n64#1:100\n77#1:101\n*E\n"})
public final class UpdownCompareIndicator extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f44203c = {Reflection.property1(new PropertyReference1Impl(UpdownCompareIndicator.class, "binding", "getBinding()Lcom/kubi/sdk/res/databinding/ViewUpDownCompareIndicatorBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f44204b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UpdownCompareIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UpdownCompareIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m54923d(UpdownCompareIndicator updownCompareIndicator, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        updownCompareIndicator.m54926c(z11);
    }

    private final C40856t getBinding() {
        return (C40856t) this.f44204b.getValue(this, f44203c[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m54926c(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.v3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdownCompareIndicator.m54924e(this.f45233b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m54927f(final int i11, final int i12, final int i13) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.resources.widget.u3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdownCompareIndicator.m54925g(this.f45224b, i11, i12, i13);
            }
        });
    }

    public /* synthetic */ UpdownCompareIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m54924e(UpdownCompareIndicator updownCompareIndicator, boolean z11) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        C40856t binding = updownCompareIndicator.getBinding();
        if (binding != null && (appCompatImageView3 = binding.f90821b) != null) {
            C27046k.m66684G(appCompatImageView3, z11);
        }
        C40856t binding2 = updownCompareIndicator.getBinding();
        if (binding2 != null && (appCompatImageView2 = binding2.f90822c) != null) {
            C27046k.m66684G(appCompatImageView2, z11);
        }
        C40856t binding3 = updownCompareIndicator.getBinding();
        if (binding3 != null && (appCompatImageView = binding3.f90823d) != null) {
            C27046k.m66684G(appCompatImageView, z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m54925g(UpdownCompareIndicator updownCompareIndicator, int i11, int i12, int i13) {
        float f11;
        float f12;
        C40856t binding = updownCompareIndicator.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        float height = binding.f90824e.getHeight() * RangesKt.coerceAtLeast(0.1f, C27040e.m66657a(6.0f));
        int i14 = i11 + i12 + i13;
        if (i14 <= 0) {
            m54923d(updownCompareIndicator, false, 1, null);
            Context context = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            updownCompareIndicator.setBackground(C22890g.m54287l(C27046k.m66699n(context, R$color.c_cover12), height));
        } else if (i11 > 0 && i12 == 0 && i13 == 0) {
            m54923d(updownCompareIndicator, false, 1, null);
            Context context2 = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            updownCompareIndicator.setBackground(C22890g.m54287l(C22890g.m54291p(context2), height));
        } else if (i11 == 0 && i12 > 0 && i13 == 0) {
            m54923d(updownCompareIndicator, false, 1, null);
            Context context3 = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            updownCompareIndicator.setBackground(C22890g.m54287l(C27046k.m66699n(context3, R$color.c_cover12), height));
        } else if (i11 == 0 && i12 == 0 && i13 > 0) {
            m54923d(updownCompareIndicator, false, 1, null);
            Context context4 = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            updownCompareIndicator.setBackground(C22890g.m54287l(C22890g.m54289n(context4), height));
        } else {
            updownCompareIndicator.setBackground(new ColorDrawable(0));
            int width = binding.f90824e.getWidth() - C27040e.m66658b(3);
            float f13 = 1.0f;
            float f14 = i14;
            int i15 = (int) (((i11 * width) * 1.0f) / f14);
            int i16 = (int) (((i13 * width) * 1.0f) / f14);
            int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (((width * 1.0f) - i15) - i16), 0);
            updownCompareIndicator.m54926c(true);
            AppCompatImageView ivLeft = binding.f90821b;
            Intrinsics.checkNotNullExpressionValue(ivLeft, "ivLeft");
            ViewExtKt.m66595z(ivLeft, i15);
            AppCompatImageView ivMiddle = binding.f90822c;
            Intrinsics.checkNotNullExpressionValue(ivMiddle, "ivMiddle");
            ViewExtKt.m66595z(ivMiddle, iCoerceAtLeast);
            AppCompatImageView ivRight = binding.f90823d;
            Intrinsics.checkNotNullExpressionValue(ivRight, "ivRight");
            ViewExtKt.m66595z(ivRight, i16);
            AppCompatImageView appCompatImageView = binding.f90821b;
            Context context5 = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(C22890g.m54291p(context5)));
            AppCompatImageView appCompatImageView2 = binding.f90823d;
            Context context6 = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            appCompatImageView2.setBackgroundTintList(ColorStateList.valueOf(C22890g.m54289n(context6)));
            AppCompatImageView appCompatImageView3 = binding.f90822c;
            Context context7 = updownCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            appCompatImageView3.setBackground(new ColorDrawable(C27046k.m66699n(context7, R$color.c_cover12)));
            binding.f90822c.setBackgroundTintList(null);
            boolean zM6511a = C5303w0.m6511a();
            AppCompatImageView appCompatImageView4 = binding.f90821b;
            if (zM6511a) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            appCompatImageView4.setScaleX(f11);
            AppCompatImageView appCompatImageView5 = binding.f90822c;
            if (zM6511a) {
                f12 = -1.0f;
            } else {
                f12 = 1.0f;
            }
            appCompatImageView5.setScaleX(f12);
            AppCompatImageView appCompatImageView6 = binding.f90823d;
            if (zM6511a) {
                f13 = -1.0f;
            }
            appCompatImageView6.setScaleX(f13);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UpdownCompareIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44204b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C40856t>() { // from class: com.kubi.resources.widget.UpdownCompareIndicator$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C40856t invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C40856t.m89413a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.view_up_down_compare_indicator, (ViewGroup) this, true);
    }
}
