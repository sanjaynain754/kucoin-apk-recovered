package com.kubi.assets.overview;

import android.graphics.Rect;
import android.view.View;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.resources.guideview.C22896d;
import com.kubi.resources.guideview.ViewOnKeyListenerC22895c;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.assets.overview.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetGuideHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetGuideHelper;", "", "<init>", "()V", "guide", "", "tabLayout", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "fragment", "Lcom/kubi/assets/overview/AssetOverviewFragment;", "guideBuilder", "Lcom/kubi/resources/guideview/GuideBuilder;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetGuideHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetGuideHelper.kt\ncom/kubi/assets/overview/AssetGuideHelper\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n*L\n1#1,63:1\n254#2,2:64\n236#2,2:66\n*S KotlinDebug\n*F\n+ 1 AssetGuideHelper.kt\ncom/kubi/assets/overview/AssetGuideHelper\n*L\n29#1:64,2\n44#1:66,2\n*E\n"})
public final class AssetGuideHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetGuideHelper f18389a = new AssetGuideHelper();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.kubi.resources.guideview.c] */
    /* JADX INFO: renamed from: d */
    public static final void m18644d(SlidingTabLayout slidingTabLayout, AssetOverviewFragment assetOverviewFragment) {
        View viewM55288r;
        if (slidingTabLayout == null || (viewM55288r = slidingTabLayout.m55288r(2)) == null) {
            return;
        }
        Rect rect = new Rect();
        if (viewM55288r.getGlobalVisibleRect(rect)) {
            rect.inset(C5275i0.m6236a(10.0f), C5275i0.m6236a(10.0f));
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = f18389a.m18647f().m54332p(rect).m54317a(new DetailComponent(rect, new View.OnClickListener() { // from class: com.kubi.assets.overview.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetGuideHelper.m18645e(objectRef, view);
                }
            })).m54318b();
            if (assetOverviewFragment == null || !assetOverviewFragment.isShowing() || AssetsProfitLossAnalysisManager.f40608a.m49942d() < 3) {
                return;
            }
            C46396e.m102354k("asset", "key_overview_tab_ongoing_guide", true);
            ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) objectRef.element;
            if (viewOnKeyListenerC22895c != null) {
                viewOnKeyListenerC22895c.m54315m(assetOverviewFragment);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m18645e(Ref.ObjectRef objectRef, View view) {
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895c = (ViewOnKeyListenerC22895c) objectRef.element;
        if (viewOnKeyListenerC22895c != null) {
            viewOnKeyListenerC22895c.m54306d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m18646c(@Nullable final SlidingTabLayout slidingTabLayout, @Nullable final AssetOverviewFragment assetOverviewFragment) {
        if (C46396e.m102347d("asset", "key_overview_tab_ongoing_guide", false) || slidingTabLayout == null) {
            return;
        }
        slidingTabLayout.postDelayed(new Runnable() { // from class: com.kubi.assets.overview.e
            @Override // java.lang.Runnable
            public final void run() {
                AssetGuideHelper.m18644d(slidingTabLayout, assetOverviewFragment);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: f */
    public final C22896d m18647f() {
        C22896d c22896dM54320d = new C22896d().m54319c(150).m54321e(C5275i0.m6236a(6.0f)).m54323g(0).m54331o(false).m54330n(false).m54326j(C5275i0.m6236a(2.0f)).m54327k(C5275i0.m6236a(2.0f)).m54324h(C5275i0.m6236a(1.0f)).m54320d(true);
        Intrinsics.checkNotNullExpressionValue(c22896dM54320d, "setAutoDismiss(...)");
        return c22896dM54320d;
    }
}
