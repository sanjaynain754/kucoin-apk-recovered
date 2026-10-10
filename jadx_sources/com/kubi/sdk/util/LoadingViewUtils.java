package com.kubi.sdk.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import com.blankj.utilcode.util.ReflectUtils;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.n0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LoadingViewUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bJ\f\u0010\u0004\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/util/LoadingViewUtils;", "", "<init>", "()V", "injectScrollView", "", "target", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "Landroidx/core/widget/NestedScrollView;", "Landroid/view/View;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LoadingViewUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LoadingViewUtils f48255a = new LoadingViewUtils();

    /* JADX INFO: renamed from: b */
    public final void m58509b(@NotNull BaseFragment target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Object objM6079f = ReflectUtils.m6074o(target).m6077d("loadingView").m6079f();
        Intrinsics.checkNotNullExpressionValue(objM6079f, "get(...)");
        m58510c((WrapperLoadingView) objM6079f);
    }

    /* JADX INFO: renamed from: c */
    public final void m58510c(@NotNull WrapperLoadingView target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Object objM6079f = ReflectUtils.m6074o(target).m6077d("mLoadingView").m6079f();
        Intrinsics.checkNotNullExpressionValue(objM6079f, "get(...)");
        ReflectUtils.m6074o(target).m6078e("mLoadingView", m58508a((View) objM6079f));
        Object objM6079f2 = ReflectUtils.m6074o(target).m6077d("mErrorView").m6079f();
        Intrinsics.checkNotNullExpressionValue(objM6079f2, "get(...)");
        ReflectUtils.m6074o(target).m6078e("mErrorView", m58508a((View) objM6079f2));
        Object objM6079f3 = ReflectUtils.m6074o(target).m6077d("mEmptyView").m6079f();
        Intrinsics.checkNotNullExpressionValue(objM6079f3, "get(...)");
        ReflectUtils.m6074o(target).m6078e("mEmptyView", m58508a((View) objM6079f3));
    }

    /* JADX INFO: renamed from: a */
    public final NestedScrollView m58508a(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
            viewGroup.removeView(view);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InjectScrollView injectScrollView = new InjectScrollView(context);
            viewGroup.addView(injectScrollView, iIndexOfChild, layoutParams);
            C27046k.m66684G(injectScrollView, C27046k.m66704s(view));
            injectScrollView.addView(view, new ViewGroup.LayoutParams(-1, -1));
            C27046k.m66684G(view, true);
            return injectScrollView;
        }
        throw new RuntimeException("target must be child of viewGroup");
    }
}
