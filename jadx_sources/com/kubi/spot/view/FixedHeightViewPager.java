package com.kubi.spot.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.resources.widget.CustomViewPager;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FixedHeightViewPager.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0014¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/spot/view/FixedHeightViewPager;", "Lcom/kubi/resources/widget/CustomViewPager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FixedHeightViewPager extends CustomViewPager {
    public FixedHeightViewPager(@Nullable Context context) {
        super(context);
    }

    public FixedHeightViewPager(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z11;
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            childAt.measure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getTag() != null) {
                Object tag = childAt.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) tag).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (measuredHeight > i11 && !z11) {
                i11 = measuredHeight;
            }
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
    }
}
