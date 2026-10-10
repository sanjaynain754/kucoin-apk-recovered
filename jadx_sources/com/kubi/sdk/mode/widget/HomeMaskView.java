package com.kubi.sdk.mode.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.R$layout;
import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p610rz.C44200a;
import p742wz.C45962c;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: HomeMaskView.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017J\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/sdk/mode/widget/HomeMaskView;", "Landroid/widget/FrameLayout;", "activity", "Landroid/app/Activity;", "appMode", "Lcom/kubi/sdk/mode/AppMode;", "anim", "", "<init>", "(Landroid/app/Activity;Lcom/kubi/sdk/mode/AppMode;Z)V", "binding", "Lcom/kubi/sdk/mode/databinding/HomeMaskBinding;", "getBinding", "()Lcom/kubi/sdk/mode/databinding/HomeMaskBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getSharedView", "Lcom/kubi/sdk/mode/widget/SwitchLayout;", "fadeBackView", "", "durationTime", "", "onFinish", "Lkotlin/Function0;", "removeMask", "Companion", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeMaskView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMaskView.kt\ncom/kubi/sdk/mode/widget/HomeMaskView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,98:1\n52#2:99\n80#2,7:100\n91#3,14:107\n*S KotlinDebug\n*F\n+ 1 HomeMaskView.kt\ncom/kubi/sdk/mode/widget/HomeMaskView\n*L\n24#1:99\n24#1:100,7\n56#1:107,14\n*E\n"})
public final class HomeMaskView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Activity f47145b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC24293a f47146c;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f47144e = {Reflection.property1(new PropertyReference1Impl(HomeMaskView.class, "binding", "getBinding()Lcom/kubi/sdk/mode/databinding/HomeMaskBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f47143d = new Companion(null);

    /* JADX INFO: compiled from: HomeMaskView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/mode/widget/HomeMaskView$Companion;", "", "<init>", "()V", "setMaskView", "Lcom/kubi/sdk/mode/widget/HomeMaskView;", "activity", "Landroid/app/Activity;", "appMode", "Lcom/kubi/sdk/mode/AppMode;", "anim", "", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m57280b(ViewGroup viewGroup, HomeMaskView homeMaskView) {
            viewGroup.addView(homeMaskView, new ViewGroup.LayoutParams(-1, -1));
        }

        public static /* synthetic */ HomeMaskView setMaskView$default(Companion companion, Activity activity, AppMode appMode, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return companion.setMaskView(activity, appMode, z11);
        }

        @Nullable
        public final HomeMaskView setMaskView(@Nullable Activity activity, @NotNull AppMode appMode, boolean anim) {
            Window window;
            Intrinsics.checkNotNullParameter(appMode, "appMode");
            C44128b.m97266j("LiteTag", "HomeMaskView companion setMaskView");
            View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
            final ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null) {
                return null;
            }
            final HomeMaskView homeMaskView = new HomeMaskView(activity, appMode, anim);
            activity.runOnUiThread(new Runnable() { // from class: xz.a
                @Override // java.lang.Runnable
                public final void run() {
                    HomeMaskView.Companion.m57280b(viewGroup, homeMaskView);
                }
            });
            C44128b.m97266j("LiteTag", "HomeMaskView decorView add maskView!!!, appMode:" + appMode + ", activity:" + activity);
            C45962c.m101397c(C45962c.f103401a, "checkTransition: add markView", null, 1, null);
            return homeMaskView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeMaskView(@NotNull Activity activity, @NotNull AppMode appMode, boolean z11) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        this.f47145b = activity;
        this.f47146c = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44200a>() { // from class: com.kubi.sdk.mode.widget.HomeMaskView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44200a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44200a.m97422a(C45682f.m100800a(viewGroup));
            }
        });
        C44128b.m97266j("LiteTag", "HomeMaskView init");
        LayoutInflater.from(getContext()).inflate(R$layout.home_mask, (ViewGroup) this, true);
    }

    private final C44200a getBinding() {
        return (C44200a) this.f47146c.getValue(this, f47144e[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m57278a() {
        ViewGroup viewGroup;
        try {
            ViewExtKt.m66577h(this);
            View decorView = this.f47145b.getWindow().getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView(this);
                C45962c.m101397c(C45962c.f103401a, "checkTransition: remove markView", null, 1, null);
            }
        } catch (Exception unused) {
        }
    }

    @Nullable
    public final SwitchLayout getSharedView() {
        C44200a binding = getBinding();
        if (binding != null) {
            return binding.f97543d;
        }
        return null;
    }
}
