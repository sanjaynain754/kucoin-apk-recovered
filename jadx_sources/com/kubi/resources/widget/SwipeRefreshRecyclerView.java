package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes13.dex */
public class SwipeRefreshRecyclerView extends SmartRefreshLayout {

    /* JADX INFO: renamed from: b */
    public RecyclerView f44083b;

    /* JADX INFO: renamed from: c */
    public boolean f44084c;

    public SwipeRefreshRecyclerView(@NonNull Context context) {
        super(context);
        m54795a();
    }

    /* JADX INFO: renamed from: a */
    private void m54795a() {
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f44083b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        addView(this.f44083b, -1, -1);
        setTag(Boolean.FALSE);
    }

    public RecyclerView getRecyclerView() {
        return this.f44083b;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        this.f44083b.setAdapter(adapter);
    }

    public void setRefreshing(boolean z11) {
        this.f44084c = z11;
        if (z11) {
            autoRefreshAnimationOnly();
        } else {
            finishRefresh();
        }
    }

    public SwipeRefreshRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m54795a();
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
        if (!super.isRefreshing() && !this.f44084c) {
            return false;
        }
        return true;
    }
}
