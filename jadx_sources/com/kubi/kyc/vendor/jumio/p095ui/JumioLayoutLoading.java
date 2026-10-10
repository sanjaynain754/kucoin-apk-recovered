package com.kubi.kyc.vendor.jumio.p095ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.kyc.R$layout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205dn.C36896p;
import p205dn.C36900t;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: JumioLayoutLoading.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0016R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioLayoutLoading;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/kubi/kyc/databinding/LayoutJumioLoadingBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/LayoutJumioLoadingBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "buttonBack", "Landroid/widget/ImageView;", TIMPushProvider.f75062n, "", TIMPushProvider.f75063o, "displayTitle", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioLayoutLoading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioLayoutLoading.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutLoading\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,60:1\n52#2:61\n80#2,7:62\n*S KotlinDebug\n*F\n+ 1 JumioLayoutLoading.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutLoading\n*L\n28#1:61\n28#1:62,7\n*E\n"})
public final class JumioLayoutLoading extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f31609c = {Reflection.property1(new PropertyReference1Impl(JumioLayoutLoading.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/LayoutJumioLoadingBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f31610b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutLoading(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutLoading(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final C36896p getViewBinding() {
        return (C36896p) this.f31610b.getValue(this, f31609c[0]);
    }

    public /* synthetic */ JumioLayoutLoading(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ImageView m37328a() {
        C36900t c36900t;
        C36896p viewBinding = getViewBinding();
        if (viewBinding != null && (c36900t = viewBinding.f81511c) != null) {
            return c36900t.f81552b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m37329b(boolean z11) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        LinearLayout linearLayout;
        TextView textView;
        int i12;
        C36900t c36900t;
        TextView textView2;
        C36900t c36900t2;
        ImageView imageView;
        int i13;
        C36896p viewBinding = getViewBinding();
        int i14 = 4;
        int i15 = 0;
        if (viewBinding != null && (c36900t2 = viewBinding.f81511c) != null && (imageView = c36900t2.f81552b) != null) {
            if (z11) {
                i13 = 0;
            } else {
                i13 = 4;
            }
            imageView.setVisibility(i13);
        }
        C36896p viewBinding2 = getViewBinding();
        if (viewBinding2 != null && (c36900t = viewBinding2.f81511c) != null && (textView2 = c36900t.f81553c) != null) {
            if (z11) {
                i14 = 0;
            }
            textView2.setVisibility(i14);
        }
        C36896p viewBinding3 = getViewBinding();
        if (viewBinding3 != null && (textView = viewBinding3.f81513e) != null) {
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            textView.setVisibility(i12);
        }
        int iM66601d = C27029c.m66601d(this, 46);
        if (!z11) {
            i11 = 17;
        } else {
            i11 = 1;
            i15 = iM66601d;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            C36896p viewBinding4 = getViewBinding();
            if (viewBinding4 != null && (linearLayout = viewBinding4.f81512d) != null) {
                linearLayout.setGravity(i11);
            }
            C36896p viewBinding5 = getViewBinding();
            if (viewBinding5 != null && (lottieAnimationView2 = viewBinding5.f81510b) != null) {
                layoutParams = lottieAnimationView2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = i15;
            C36896p viewBinding6 = getViewBinding();
            if (viewBinding6 != null && (lottieAnimationView = viewBinding6.f81510b) != null) {
                lottieAnimationView.setLayoutParams(layoutParams2);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m37330c() {
        ViewExtKt.m66577h(this);
    }

    /* JADX INFO: renamed from: d */
    public final void m37331d() {
        ViewExtKt.m66594y(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutLoading(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31610b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36896p>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioLayoutLoading$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36896p invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36896p.m82661a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.layout_jumio_loading, (ViewGroup) this, true);
    }
}
