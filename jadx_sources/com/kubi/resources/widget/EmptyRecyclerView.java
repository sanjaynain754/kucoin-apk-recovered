package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EmptyRecyclerView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0010\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\u0016J\u001a\u0010\u001f\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\f0 2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/resources/widget/EmptyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "selfScroll", "", "emptyList", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "nonEmptyList", "observer", "com/kubi/resources/widget/EmptyRecyclerView$observer$1", "Lcom/kubi/resources/widget/EmptyRecyclerView$observer$1;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "setAdapter", "", "_adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setSelfScroll", "addEmptyView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "existEmptyView", "addNonEmptyView", "refreshEmpty", "setVisibilityForListView", "", "visibility", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmptyRecyclerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyRecyclerView.kt\ncom/kubi/resources/widget/EmptyRecyclerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1#2:103\n1869#3,2:104\n*S KotlinDebug\n*F\n+ 1 EmptyRecyclerView.kt\ncom/kubi/resources/widget/EmptyRecyclerView\n*L\n98#1:104,2\n*E\n"})
public class EmptyRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b */
    public boolean f43790b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public ArrayList<View> f43791c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public ArrayList<View> f43792d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C22917a f43793e;

    /* JADX INFO: renamed from: com.kubi.resources.widget.EmptyRecyclerView$a */
    /* JADX INFO: compiled from: EmptyRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/resources/widget/EmptyRecyclerView$observer$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeRemoved", "positionStart", "", "itemCount", "onItemRangeInserted", "onItemRangeChanged", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22917a extends RecyclerView.AdapterDataObserver {
        public C22917a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            EmptyRecyclerView.this.m54498a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount) {
            super.onItemRangeChanged(positionStart, itemCount);
            EmptyRecyclerView.this.m54498a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            super.onItemRangeInserted(positionStart, itemCount);
            EmptyRecyclerView.this.m54498a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            super.onItemRangeRemoved(positionStart, itemCount);
            EmptyRecyclerView.this.m54498a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyRecyclerView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43791c = new ArrayList<>();
        this.f43792d = new ArrayList<>();
        this.f43793e = new C22917a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (this.f43790b) {
            if (ev2.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (ArraysKt.contains(new Integer[]{1, 3}, Integer.valueOf(ev2.getAction()))) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    public final void setSelfScroll(boolean selfScroll) {
        this.f43790b = selfScroll;
    }

    /* JADX INFO: renamed from: a */
    public final void m54498a() {
        RecyclerView.Adapter adapter;
        if (getAdapter() != null && ((adapter = getAdapter()) == null || adapter.getItemCount() != 0)) {
            setVisibility(0);
            m54499b(this.f43792d, 0);
            m54499b(this.f43791c, 8);
        } else {
            setVisibility(8);
            m54499b(this.f43792d, 8);
            m54499b(this.f43791c, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m54499b(List<? extends View> list, int i11) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<?> _adapter) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f43793e);
        }
        super.setAdapter(_adapter);
        if (_adapter != null) {
            _adapter.registerAdapterDataObserver(this.f43793e);
        }
        this.f43793e.onChanged();
    }
}
