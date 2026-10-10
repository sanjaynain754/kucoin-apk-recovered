package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import hb0.InterfaceC38162f;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import ro.C44128b;

/* JADX INFO: loaded from: classes12.dex */
public class KuCoinRefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: b */
    public boolean f43893b;

    public KuCoinRefreshLayout(Context context) {
        super(context);
        setTag(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public void m54650b(@NotNull final Function0<Unit> function0) {
        setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.resources.widget.h1
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                function0.invoke();
            }
        });
    }

    public void setRefreshing(boolean z11) {
        this.f43893b = z11;
        if (z11) {
            autoRefreshAnimationOnly();
        } else {
            finishRefresh();
        }
    }

    public KuCoinRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTag(Boolean.FALSE);
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout
    public boolean isRefreshing() {
        if (!super.isRefreshing() && !this.f43893b) {
            return false;
        }
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        try {
            super.onMeasure(i11, i12);
        } catch (Throwable th2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            C44128b.m97264h(th2);
        }
    }
}
