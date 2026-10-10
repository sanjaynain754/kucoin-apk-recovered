package com.kubi.home.rank.impl;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RankFragmentContext.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u000201R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020&X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015¨\u00065"}, m90084d2 = {"Lcom/kubi/home/rank/impl/RankFragmentContext;", "", "<init>", "()V", TtmlNode.RUBY_CONTAINER, "Landroidx/fragment/app/Fragment;", "getContainer", "()Landroidx/fragment/app/Fragment;", "setContainer", "(Landroidx/fragment/app/Fragment;)V", "rankTabLayout", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "getRankTabLayout", "()Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "setRankTabLayout", "(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;)V", "layoutHeader", "Landroid/view/ViewGroup;", "getLayoutHeader", "()Landroid/view/ViewGroup;", "setLayoutHeader", "(Landroid/view/ViewGroup;)V", "coinName", "Lcom/kubi/resources/widget/DashTextView;", "getCoinName", "()Lcom/kubi/resources/widget/DashTextView;", "setCoinName", "(Lcom/kubi/resources/widget/DashTextView;)V", FirebaseAnalytics.Param.PRICE, "Landroid/widget/TextView;", "getPrice", "()Landroid/widget/TextView;", "setPrice", "(Landroid/widget/TextView;)V", "changeRate", "getChangeRate", "setChangeRate", "viewPager", "Lcom/kubi/resources/widget/CustomViewPager;", "getViewPager", "()Lcom/kubi/resources/widget/CustomViewPager;", "setViewPager", "(Lcom/kubi/resources/widget/CustomViewPager;)V", "layoutExpandMore", "getLayoutExpandMore", "setLayoutExpandMore", "getString", "", "strId", "", "getDrawable", "Landroid/graphics/drawable/Drawable;", "resId", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RankFragmentContext {

    /* JADX INFO: renamed from: a */
    public Fragment f26048a;

    /* JADX INFO: renamed from: b */
    public SlidingTabLayout f26049b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f26050c;

    /* JADX INFO: renamed from: d */
    public DashTextView f26051d;

    /* JADX INFO: renamed from: e */
    public TextView f26052e;

    /* JADX INFO: renamed from: f */
    public DashTextView f26053f;

    /* JADX INFO: renamed from: g */
    public CustomViewPager f26054g;

    /* JADX INFO: renamed from: h */
    public ViewGroup f26055h;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final DashTextView m29971a() {
        DashTextView dashTextView = this.f26053f;
        if (dashTextView != null) {
            return dashTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("changeRate");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final DashTextView m29972b() {
        DashTextView dashTextView = this.f26051d;
        if (dashTextView != null) {
            return dashTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coinName");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Fragment m29973c() {
        Fragment fragment = this.f26048a;
        if (fragment != null) {
            return fragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException(TtmlNode.RUBY_CONTAINER);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final ViewGroup m29975e() {
        ViewGroup viewGroup = this.f26055h;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutExpandMore");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ViewGroup m29976f() {
        ViewGroup viewGroup = this.f26050c;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutHeader");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final TextView m29977g() {
        TextView textView = this.f26052e;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FirebaseAnalytics.Param.PRICE);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final SlidingTabLayout m29978h() {
        SlidingTabLayout slidingTabLayout = this.f26049b;
        if (slidingTabLayout != null) {
            return slidingTabLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rankTabLayout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final CustomViewPager m29980j() {
        CustomViewPager customViewPager = this.f26054g;
        if (customViewPager != null) {
            return customViewPager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m29981k(@NotNull DashTextView dashTextView) {
        Intrinsics.checkNotNullParameter(dashTextView, "<set-?>");
        this.f26053f = dashTextView;
    }

    /* JADX INFO: renamed from: l */
    public final void m29982l(@NotNull DashTextView dashTextView) {
        Intrinsics.checkNotNullParameter(dashTextView, "<set-?>");
        this.f26051d = dashTextView;
    }

    /* JADX INFO: renamed from: m */
    public final void m29983m(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<set-?>");
        this.f26048a = fragment;
    }

    /* JADX INFO: renamed from: n */
    public final void m29984n(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.f26055h = viewGroup;
    }

    /* JADX INFO: renamed from: o */
    public final void m29985o(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.f26050c = viewGroup;
    }

    /* JADX INFO: renamed from: p */
    public final void m29986p(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f26052e = textView;
    }

    /* JADX INFO: renamed from: q */
    public final void m29987q(@NotNull SlidingTabLayout slidingTabLayout) {
        Intrinsics.checkNotNullParameter(slidingTabLayout, "<set-?>");
        this.f26049b = slidingTabLayout;
    }

    /* JADX INFO: renamed from: r */
    public final void m29988r(@NotNull CustomViewPager customViewPager) {
        Intrinsics.checkNotNullParameter(customViewPager, "<set-?>");
        this.f26054g = customViewPager;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Drawable m29974d(int i11) {
        Drawable drawable = m29973c().getResources().getDrawable(i11);
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        return drawable;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final String m29979i(int i11) {
        String string = m29973c().getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
