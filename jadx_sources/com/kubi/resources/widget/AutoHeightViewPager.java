package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoHeightViewPager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/resources/widget/AutoHeightViewPager;", "Lcom/kubi/resources/widget/CustomViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "measureSpec", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "g", "(ILandroid/view/View;)I", "LUIKit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AutoHeightViewPager extends CustomViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoHeightViewPager(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX INFO: renamed from: g */
    public final int m54429g(int measureSpec, View view) {
        int measuredHeight;
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            return size;
        }
        if (view != null) {
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(measuredHeight, size);
        }
        return measuredHeight;
    }

    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View childAt = getChildAt(getCurrentItem());
        if (childAt != null) {
            childAt.measure(widthMeasureSpec, heightMeasureSpec);
        }
        setMeasuredDimension(getMeasuredWidth(), m54429g(heightMeasureSpec, childAt));
    }
}
