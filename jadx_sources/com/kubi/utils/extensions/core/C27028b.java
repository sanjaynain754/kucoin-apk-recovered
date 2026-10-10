package com.kubi.utils.extensions.core;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.core.b */
/* JADX INFO: compiled from: ViewPagerExt.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/utils/extensions/core/b;", "Landroidx/viewpager/widget/ViewPager$PageTransformer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", ViewProps.POSITION, "", "transformPage", "(Landroid/view/View;F)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "maxTranslateOffsetX", "Landroidx/viewpager/widget/ViewPager;", "b", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27028b implements ViewPager.PageTransformer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxTranslateOffsetX;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ViewPager viewPager;

    public C27028b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxTranslateOffsetX = C27029c.m66598a(context, 180.0f);
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(@NotNull View view, float position) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.viewPager == null) {
            ViewParent parent = view.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
            this.viewPager = (ViewPager) parent;
        }
        int left = view.getLeft();
        ViewPager viewPager = this.viewPager;
        Intrinsics.checkNotNull(viewPager);
        int scrollX = (left - viewPager.getScrollX()) + (view.getMeasuredWidth() / 2);
        ViewPager viewPager2 = this.viewPager;
        Intrinsics.checkNotNull(viewPager2);
        float measuredWidth = (scrollX - (viewPager2.getMeasuredWidth() / 2)) * 0.38f;
        ViewPager viewPager3 = this.viewPager;
        Intrinsics.checkNotNull(viewPager3);
        float measuredWidth2 = measuredWidth / viewPager3.getMeasuredWidth();
        float fAbs = 1 - Math.abs(measuredWidth2);
        if (fAbs > 0.0f) {
            view.setScaleX(fAbs);
            view.setScaleY(fAbs);
            view.setTranslationX((-this.maxTranslateOffsetX) * measuredWidth2);
        }
    }
}
