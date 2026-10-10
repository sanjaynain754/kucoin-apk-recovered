package com.kubi.mine.lib.p101ui;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mine.api.service.IMineService;
import com.kubi.sdk.util.DrawerInject;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DrawerProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/DrawerProxy;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "mineFragment", "Lcom/kubi/mine/lib/ui/MineFragment;", "getMineFragment", "()Lcom/kubi/mine/lib/ui/MineFragment;", "mineFragment$delegate", "Lkotlin/Lazy;", "homeDrawer", "Lcom/kubi/sdk/util/DrawerInject;", "getHomeDrawer", "()Lcom/kubi/sdk/util/DrawerInject;", "homeDrawer$delegate", "initDrawer", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawerProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerProxy.kt\ncom/kubi/mine/lib/ui/DrawerProxy\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,52:1\n81#2,2:53\n*S KotlinDebug\n*F\n+ 1 DrawerProxy.kt\ncom/kubi/mine/lib/ui/DrawerProxy\n*L\n31#1:53,2\n*E\n"})
public final class DrawerProxy {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FragmentActivity f35182a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f35183b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f35184c;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.DrawerProxy$a */
    /* JADX INFO: compiled from: DrawerProxy.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/mine/lib/ui/DrawerProxy$initDrawer$2", "Landroidx/drawerlayout/widget/DrawerLayout$SimpleDrawerListener;", "onDrawerClosed", "", "drawerView", "Landroid/view/View;", "onDrawerOpened", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19017a extends DrawerLayout.SimpleDrawerListener {
        public C19017a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            C12572a.m23695d("com.kubi.home.event.HomeEvent:updateAvatar", null, 0L, 6, null);
            DrawerProxy.this.m41934f().m42112X5();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View drawerView) {
            Intrinsics.checkNotNullParameter(drawerView, "drawerView");
            if (DrawerProxy.this.m41934f().isVisible()) {
                DrawerProxy.this.m41934f().m42113Y5(DrawerProxy.this.m41933e());
                IMineService.f35025a.get().mo41627j(DrawerProxy.this.m41934f());
            }
        }
    }

    public DrawerProxy(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f35182a = activity;
        this.f35183b = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawerProxy.m41932i();
            }
        });
        this.f35184c = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawerProxy.m41931g(this.f35296b);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final DrawerInject m41931g(DrawerProxy drawerProxy) {
        return new DrawerInject(drawerProxy.f35182a, drawerProxy.m41934f(), 0, true, "mine", 4, null);
    }

    /* JADX INFO: renamed from: i */
    public static final MineFragment m41932i() {
        return MineFragment.f35191f0.newInstance();
    }

    /* JADX INFO: renamed from: e */
    public final DrawerInject m41933e() {
        return (DrawerInject) this.f35184c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final MineFragment m41934f() {
        return (MineFragment) this.f35183b.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m41935h() {
        FragmentActivity fragmentActivity = this.f35182a;
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:switchDrawer".length();
        }
        C12572a.m23692a(fragmentActivity, false, new DrawerProxy$initDrawer$$inlined$bindFlowEvent$1("com.kubi.home.event.HomeEvent:switchDrawer", null, this));
        m41933e().m58438n(new C19017a());
    }
}
