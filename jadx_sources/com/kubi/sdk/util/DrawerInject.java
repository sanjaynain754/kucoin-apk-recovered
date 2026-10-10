package com.kubi.sdk.util;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.resources.widget.FullDrawerLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.R$id;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.C27032f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DrawerInject.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u0002J\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0011J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/util/DrawerInject;", "", "host", "Landroidx/fragment/app/FragmentActivity;", "attachFragment", "Lcom/kubi/sdk/BaseFragment;", "containerId", "", "isFull", "", "pTag", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/kubi/sdk/BaseFragment;IZLjava/lang/String;)V", "mDrawerLayout", "Lcom/kubi/resources/widget/FullDrawerLayout;", "mListener", "Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;", ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER, ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER, "hideFragment", "", "inject", "activity", "id", "isDrawerOpen", "setDrawerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "createDrawerLayout", "target", "Landroid/view/View;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawerInject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerInject.kt\ncom/kubi/sdk/util/DrawerInject\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class DrawerInject {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FragmentActivity f48186a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final BaseFragment f48187b;

    /* JADX INFO: renamed from: c */
    public final int f48188c;

    /* JADX INFO: renamed from: d */
    public final boolean f48189d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f48190e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public FullDrawerLayout f48191f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public DrawerLayout.SimpleDrawerListener f48192g;

    /* JADX INFO: renamed from: com.kubi.sdk.util.j$a */
    /* JADX INFO: compiled from: DrawerInject.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, m90084d2 = {"com/kubi/sdk/util/DrawerInject$2", "Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;", "onDrawerClosed", "", "drawerView", "Landroid/view/View;", "onDrawerOpened", "onDrawerStateChanged", "newState", "", "onDrawerSlide", "slideOffset", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends DrawerLayout.SimpleDrawerListener {
        public a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            final DrawerInject drawerInject = DrawerInject.this;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.util.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DrawerInject.a.m58440b(drawerInject);
                }
            });
            DrawerInject.this.m58434h();
            DrawerLayout.SimpleDrawerListener simpleDrawerListener = DrawerInject.this.f48192g;
            if (simpleDrawerListener != null) {
                simpleDrawerListener.onDrawerClosed(drawerView);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            DrawerLayout.SimpleDrawerListener simpleDrawerListener = DrawerInject.this.f48192g;
            if (simpleDrawerListener != null) {
                simpleDrawerListener.onDrawerOpened(drawerView);
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View drawerView, float slideOffset) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            super.onDrawerSlide(drawerView, slideOffset);
            DrawerLayout.SimpleDrawerListener simpleDrawerListener = DrawerInject.this.f48192g;
            if (simpleDrawerListener != null) {
                simpleDrawerListener.onDrawerSlide(drawerView, slideOffset);
            }
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m58440b(DrawerInject drawerInject) {
            KeyboardUtils.m6033e(drawerInject.f48186a);
            return Unit.INSTANCE;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int newState) {
            super.onDrawerStateChanged(newState);
            DrawerLayout.SimpleDrawerListener simpleDrawerListener = DrawerInject.this.f48192g;
            if (simpleDrawerListener != null) {
                simpleDrawerListener.onDrawerStateChanged(newState);
            }
        }
    }

    public DrawerInject(@NotNull FragmentActivity host, @NotNull BaseFragment attachFragment, int i11, boolean z11, @NotNull String pTag) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(attachFragment, "attachFragment");
        Intrinsics.checkNotNullParameter(pTag, "pTag");
        this.f48186a = host;
        this.f48187b = attachFragment;
        this.f48188c = i11;
        this.f48189d = z11;
        this.f48190e = pTag;
        if (this.f48191f == null) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.sdk.util.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DrawerInject.m58427c(this.f48174b);
                }
            });
        }
        FullDrawerLayout fullDrawerLayout = this.f48191f;
        if (fullDrawerLayout != null) {
            fullDrawerLayout.setDrawerLockMode(1);
        }
        FullDrawerLayout fullDrawerLayout2 = this.f48191f;
        if (fullDrawerLayout2 != null) {
            fullDrawerLayout2.addDrawerListener(new a());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m58427c(DrawerInject drawerInject) {
        drawerInject.f48191f = m58430j(drawerInject, drawerInject.f48186a, 0, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ FullDrawerLayout m58430j(DrawerInject drawerInject, FragmentActivity fragmentActivity, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$id.drawer;
        }
        return drawerInject.m58435i(fragmentActivity, i11);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58432f() {
        FullDrawerLayout fullDrawerLayout = this.f48191f;
        if (fullDrawerLayout == null) {
            return false;
        }
        boolean zIsDrawerOpen = fullDrawerLayout.isDrawerOpen(GravityCompat.START);
        if (zIsDrawerOpen) {
            fullDrawerLayout.closeDrawer(GravityCompat.START);
        }
        return zIsDrawerOpen;
    }

    /* JADX INFO: renamed from: g */
    public final FullDrawerLayout m58433g(View view, int i11) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FullDrawerLayout fullDrawerLayout = new FullDrawerLayout(context, null, 0, 6, null);
        fullDrawerLayout.addView(view, new DrawerLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(fullDrawerLayout.getContext());
        frameLayout.setId(i11);
        fullDrawerLayout.addView(frameLayout, new DrawerLayout.LayoutParams(-1, -1, GravityCompat.START));
        return fullDrawerLayout;
    }

    /* JADX INFO: renamed from: h */
    public final void m58434h() {
        if (!this.f48187b.isAdded()) {
            C44128b.m97266j("DrawerInject", "Fragment is not added");
        } else {
            C27032f.m66616g(this.f48186a, this.f48187b);
            this.f48187b.setUserVisibleHint(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m58436k() {
        FullDrawerLayout fullDrawerLayout = this.f48191f;
        return C27025c.m66566d(fullDrawerLayout != null ? Boolean.valueOf(fullDrawerLayout.isDrawerOpen(GravityCompat.START)) : null);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m58437l() {
        FullDrawerLayout fullDrawerLayout = this.f48191f;
        if (fullDrawerLayout != null) {
            fullDrawerLayout.m54522d(this.f48189d);
        }
        final FullDrawerLayout fullDrawerLayout2 = this.f48191f;
        if (fullDrawerLayout2 == null) {
            return false;
        }
        boolean zIsDrawerOpen = fullDrawerLayout2.isDrawerOpen(GravityCompat.START);
        boolean z11 = !zIsDrawerOpen;
        if (!zIsDrawerOpen) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.util.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DrawerInject.m58431m(fullDrawerLayout2);
                }
            });
        }
        if (!this.f48187b.isAdded() && this.f48186a.getSupportFragmentManager().findFragmentByTag(this.f48190e) == null) {
            FragmentManager supportFragmentManager = this.f48186a.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            if (!C24245k.m58464a(supportFragmentManager)) {
                C27032f.m66613d(this.f48186a, this.f48188c, this.f48187b, null, 4, null);
                return z11;
            }
        }
        if (this.f48187b.isHidden()) {
            C27032f.m66628s(this.f48186a, this.f48187b);
        }
        this.f48187b.setUserVisibleHint(true);
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public final void m58438n(@NotNull DrawerLayout.SimpleDrawerListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f48192g = listener;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m58431m(FullDrawerLayout fullDrawerLayout) {
        fullDrawerLayout.openDrawer(GravityCompat.START);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final FullDrawerLayout m58435i(FragmentActivity fragmentActivity, int i11) {
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        ViewParent parent = viewFindViewById.getParent();
        if (parent instanceof FullDrawerLayout) {
            C44128b.m97266j("DrawerInject", "has injected");
            return (FullDrawerLayout) parent;
        }
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
            viewGroup.removeView(viewFindViewById);
            Intrinsics.checkNotNull(viewFindViewById);
            FullDrawerLayout fullDrawerLayoutM58433g = m58433g(viewFindViewById, i11);
            viewGroup.addView(fullDrawerLayoutM58433g, iIndexOfChild, layoutParams);
            return fullDrawerLayoutM58433g;
        }
        throw new RuntimeException("target must be child of viewGroup");
    }

    public /* synthetic */ DrawerInject(FragmentActivity fragmentActivity, BaseFragment baseFragment, int i11, boolean z11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, baseFragment, (i12 & 4) != 0 ? R$id.drawer : i11, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? "tag" : str);
    }
}
