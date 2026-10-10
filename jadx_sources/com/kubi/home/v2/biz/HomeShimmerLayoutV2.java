package com.kubi.home.v2.biz;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.kubi.home.v2.card.HomeCardsRepositoryV2;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import fj.C37549v;
import fj.C37551w;
import fj.C37553x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.InterfaceC36986b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeShimmerLayoutV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/home/v2/biz/HomeShimmerLayoutV2;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/home/databinding/HomeShimmerV2Binding;", "showMe", "", "hideMe", "showHasLoginOnce", "showNotHasLogin", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeShimmerLayoutV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeShimmerLayoutV2.kt\ncom/kubi/home/v2/biz/HomeShimmerLayoutV2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n2756#2:94\n2756#2:96\n1#3:95\n1#3:97\n*S KotlinDebug\n*F\n+ 1 HomeShimmerLayoutV2.kt\ncom/kubi/home/v2/biz/HomeShimmerLayoutV2\n*L\n71#1:94\n73#1:96\n71#1:95\n73#1:97\n*E\n"})
public final class HomeShimmerLayoutV2 extends NestedScrollView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C37551w f26366b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerLayoutV2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerLayoutV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m30506h(HomeShimmerLayoutV2 homeShimmerLayoutV2) {
        C37551w c37551w = homeShimmerLayoutV2.f26366b;
        if (c37551w == null) {
            return Unit.INSTANCE;
        }
        LinearLayoutCompat layoutUserStatus = c37551w.f83468n;
        Intrinsics.checkNotNullExpressionValue(layoutUserStatus, "layoutUserStatus");
        C27046k.m66685H(layoutUserStatus);
        LinearLayoutCompat layoutGrid = c37551w.f83464j;
        Intrinsics.checkNotNullExpressionValue(layoutGrid, "layoutGrid");
        C27046k.m66685H(layoutGrid);
        LinearLayoutCompat layoutBannerGembox = c37551w.f83463i;
        Intrinsics.checkNotNullExpressionValue(layoutBannerGembox, "layoutBannerGembox");
        C27046k.m66685H(layoutBannerGembox);
        LinearLayoutCompat layoutRankinglist = c37551w.f83467m;
        Intrinsics.checkNotNullExpressionValue(layoutRankinglist, "layoutRankinglist");
        C27046k.m66685H(layoutRankinglist);
        LinearLayoutCompat layoutNewUser = c37551w.f83466l;
        Intrinsics.checkNotNullExpressionValue(layoutNewUser, "layoutNewUser");
        C27046k.m66700o(layoutNewUser);
        LinearLayoutCompat layoutLearn = c37551w.f83465k;
        Intrinsics.checkNotNullExpressionValue(layoutLearn, "layoutLearn");
        C27046k.m66700o(layoutLearn);
        View vSearch = c37551w.f83454D;
        Intrinsics.checkNotNullExpressionValue(vSearch, "vSearch");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(vSearch, Float.valueOf(24.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        View view = c37551w.f83469o;
        View view2 = c37551w.f83476v;
        View view3 = c37551w.f83477w;
        C37549v c37549v = c37551w.f83456b;
        View view4 = c37549v.f83431b;
        View view5 = c37549v.f83432c;
        View view6 = c37549v.f83433d;
        C37549v c37549v2 = c37551w.f83457c;
        View view7 = c37549v2.f83431b;
        View view8 = c37549v2.f83432c;
        View view9 = c37549v2.f83433d;
        C37553x c37553x = c37551w.f83458d;
        View view10 = c37553x.f83486b;
        View view11 = c37553x.f83487c;
        View view12 = c37553x.f83488d;
        C37553x c37553x2 = c37551w.f83459e;
        View view13 = c37553x2.f83486b;
        View view14 = c37553x2.f83487c;
        View view15 = c37553x2.f83488d;
        C37553x c37553x3 = c37551w.f83460f;
        View view16 = c37553x3.f83486b;
        View view17 = c37553x3.f83487c;
        View view18 = c37553x3.f83488d;
        C37553x c37553x4 = c37551w.f83461g;
        View view19 = c37553x4.f83486b;
        View view20 = c37553x4.f83487c;
        View view21 = c37553x4.f83488d;
        C37553x c37553x5 = c37551w.f83462h;
        C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{view, view2, view3, view4, view5, view6, view7, view8, view9, view10, view11, view12, view13, view14, view15, view16, view17, view18, view19, view20, view21, c37553x5.f83486b, c37553x5.f83487c, c37553x5.f83488d}), false, 1, null);
        for (View view22 : CollectionsKt.listOf((Object[]) new View[]{c37551w.f83458d.f83489e, c37551w.f83459e.f83489e, c37551w.f83460f.f83489e, c37551w.f83461g.f83489e, c37551w.f83462h.f83489e})) {
            Intrinsics.checkNotNull(view22);
            InterfaceC36986b interfaceC36986bM54400e2 = C22911a.m54400e(view22, Float.valueOf(6.0f));
            if (interfaceC36986bM54400e2 != null) {
                interfaceC36986bM54400e2.mo54393a();
            }
        }
        for (View view23 : CollectionsKt.listOf((Object[]) new View[]{c37551w.f83478x, c37551w.f83479y, c37551w.f83480z, c37551w.f83451A})) {
            Intrinsics.checkNotNull(view23);
            InterfaceC36986b interfaceC36986bM54400e3 = C22911a.m54400e(view23, Float.valueOf(12.0f));
            if (interfaceC36986bM54400e3 != null) {
                interfaceC36986bM54400e3.mo54393a();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m30508l(HomeShimmerLayoutV2 homeShimmerLayoutV2) {
        C37551w c37551w = homeShimmerLayoutV2.f26366b;
        if (c37551w == null) {
            return Unit.INSTANCE;
        }
        LinearLayoutCompat layoutUserStatus = c37551w.f83468n;
        Intrinsics.checkNotNullExpressionValue(layoutUserStatus, "layoutUserStatus");
        C27046k.m66700o(layoutUserStatus);
        LinearLayoutCompat layoutGrid = c37551w.f83464j;
        Intrinsics.checkNotNullExpressionValue(layoutGrid, "layoutGrid");
        C27046k.m66700o(layoutGrid);
        LinearLayoutCompat layoutBannerGembox = c37551w.f83463i;
        Intrinsics.checkNotNullExpressionValue(layoutBannerGembox, "layoutBannerGembox");
        C27046k.m66700o(layoutBannerGembox);
        LinearLayoutCompat layoutRankinglist = c37551w.f83467m;
        Intrinsics.checkNotNullExpressionValue(layoutRankinglist, "layoutRankinglist");
        C27046k.m66700o(layoutRankinglist);
        LinearLayoutCompat layoutNewUser = c37551w.f83466l;
        Intrinsics.checkNotNullExpressionValue(layoutNewUser, "layoutNewUser");
        C27046k.m66685H(layoutNewUser);
        LinearLayoutCompat layoutLearn = c37551w.f83465k;
        Intrinsics.checkNotNullExpressionValue(layoutLearn, "layoutLearn");
        C27046k.m66685H(layoutLearn);
        View vSearch = c37551w.f83454D;
        Intrinsics.checkNotNullExpressionValue(vSearch, "vSearch");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(vSearch, Float.valueOf(24.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        View v11 = c37551w.f83452B;
        Intrinsics.checkNotNullExpressionValue(v11, "v8");
        InterfaceC36986b interfaceC36986bM54400e2 = C22911a.m54400e(v11, Float.valueOf(100.0f));
        if (interfaceC36986bM54400e2 != null) {
            interfaceC36986bM54400e2.mo54393a();
        }
        C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c37551w.f83453C, c37551w.f83470p, c37551w.f83471q, c37551w.f83473s, c37551w.f83474t}), false, 1, null);
        View v12 = c37551w.f83472r;
        Intrinsics.checkNotNullExpressionValue(v12, "v12");
        InterfaceC36986b interfaceC36986bM54400e3 = C22911a.m54400e(v12, Float.valueOf(24.0f));
        if (interfaceC36986bM54400e3 != null) {
            interfaceC36986bM54400e3.mo54393a();
        }
        View v15 = c37551w.f83475u;
        Intrinsics.checkNotNullExpressionValue(v15, "v15");
        InterfaceC36986b interfaceC36986bM54400e4 = C22911a.m54400e(v15, Float.valueOf(12.0f));
        if (interfaceC36986bM54400e4 != null) {
            interfaceC36986bM54400e4.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m30509e() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayoutV2.m30505f(this.f26370b);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m30510g() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayoutV2.m30506h(this.f26371b);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m30511i() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayoutV2.m30507j(this.f26369b);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m30512k() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayoutV2.m30508l(this.f26372b);
            }
        });
    }

    public /* synthetic */ HomeShimmerLayoutV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m30505f(HomeShimmerLayoutV2 homeShimmerLayoutV2) {
        C27046k.m66700o(homeShimmerLayoutV2);
        homeShimmerLayoutV2.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m30507j(HomeShimmerLayoutV2 homeShimmerLayoutV2) {
        C27046k.m66685H(homeShimmerLayoutV2);
        homeShimmerLayoutV2.removeAllViews();
        C37551w c37551wM84575c = C37551w.m84575c(LayoutInflater.from(homeShimmerLayoutV2.getContext()), homeShimmerLayoutV2, false);
        homeShimmerLayoutV2.f26366b = c37551wM84575c;
        homeShimmerLayoutV2.addView(c37551wM84575c.getRoot(), new FrameLayout.LayoutParams(-1, -1));
        if (HomeCardsRepositoryV2.f26494a.m30800r()) {
            homeShimmerLayoutV2.m30510g();
        } else {
            homeShimmerLayoutV2.m30512k();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerLayoutV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
