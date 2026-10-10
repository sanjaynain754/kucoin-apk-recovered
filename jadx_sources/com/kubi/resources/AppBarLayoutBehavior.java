package com.kubi.resources;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;
import ro.C44128b;

/* JADX INFO: loaded from: classes11.dex */
public class AppBarLayoutBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: b */
    public boolean f43470b;

    /* JADX INFO: renamed from: c */
    public boolean f43471c;

    @Override // com.google.android.material.appbar.AppBarLayout.Behavior, com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, MotionEvent motionEvent) {
        this.f43471c = this.f43470b;
        if (motionEvent.getActionMasked() == 0) {
            m54106c(appBarLayout);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15) {
        if (this.f43471c) {
            return;
        }
        super.onNestedScroll(coordinatorLayout, appBarLayout, view, i11, i12, i13, i14, i15);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 1) {
            this.f43470b = true;
        }
        if (this.f43471c) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i11, int i12) {
        m54106c(appBarLayout);
        return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i11, i12);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
        super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i11);
        this.f43470b = false;
        this.f43471c = false;
    }

    public AppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m54106c(AppBarLayout appBarLayout) {
        try {
            Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
            Field declaredField = superclass.getDeclaredField("flingRunnable");
            Field declaredField2 = superclass.getDeclaredField("scroller");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            Runnable runnable = (Runnable) declaredField.get(this);
            OverScroller overScroller = (OverScroller) declaredField2.get(this);
            if (runnable != null) {
                appBarLayout.removeCallbacks(runnable);
                declaredField.set(this, null);
            }
            if (overScroller != null && !overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
        } catch (IllegalAccessException e11) {
            C44128b.m97264h(e11);
        } catch (NoSuchFieldException e12) {
            C44128b.m97264h(e12);
        }
    }
}
