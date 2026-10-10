package com.kubi.resources;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes11.dex */
public class TradeAppBarLayoutBehavior extends AppBarLayoutBehavior {

    /* JADX INFO: renamed from: e */
    public static final String[] f43502e = {"fl_trade_container", "submitContent"};

    /* JADX INFO: renamed from: d */
    public boolean f43503d;

    /* JADX INFO: renamed from: d */
    public final boolean m54127d(@NonNull AppBarLayout appBarLayout, @NonNull View view, float f11, float f12) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        appBarLayout.offsetDescendantRectToMyCoords(view, rect);
        return rect.contains((int) f11, (int) f12);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m54128e(@NonNull AppBarLayout appBarLayout, float f11, float f12) {
        View viewFindViewById;
        for (String str : f43502e) {
            int identifier = appBarLayout.getResources().getIdentifier(str, "id", appBarLayout.getContext().getPackageName());
            if (identifier != 0 && (viewFindViewById = appBarLayout.findViewById(identifier)) != null && viewFindViewById.isShown() && m54127d(appBarLayout, viewFindViewById, f11, f12)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, MotionEvent motionEvent) {
        if (this.f43503d) {
            return false;
        }
        return super.onTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // com.kubi.resources.AppBarLayoutBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
    }

    @Override // com.kubi.resources.AppBarLayoutBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i11, int i12) {
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i11, i12);
    }

    @Override // com.kubi.resources.AppBarLayoutBehavior, com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i11);
        this.f43503d = false;
    }

    public TradeAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kubi.resources.AppBarLayoutBehavior, com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: a */
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            boolean zM54128e = m54128e(appBarLayout, motionEvent.getX(), motionEvent.getY());
            this.f43503d = zM54128e;
            if (zM54128e) {
                super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
                return false;
            }
        } else if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            if (this.f43503d) {
                return false;
            }
        } else if (this.f43503d) {
            return false;
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }
}
