package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes60.dex */
class SingleViewFakeWindowViewGroup extends ViewGroup {
    private final Rect childRect;
    private final Rect viewBounds;

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.viewBounds.set(i11, i12, i13, i14);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.viewBounds, layoutParams.x, layoutParams.y, this.childRect);
            Rect rect = this.childRect;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            getChildAt(i13).measure(atMost(i11), atMost(i12));
        }
        super.onMeasure(i11, i12);
    }

    public SingleViewFakeWindowViewGroup(Context context) {
        super(context);
        this.viewBounds = new Rect();
        this.childRect = new Rect();
    }

    private static int atMost(int i11) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE);
    }
}
