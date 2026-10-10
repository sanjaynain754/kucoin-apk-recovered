package com.kubi.kumex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StubRecyclerView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000*\u0001\u000f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/view/StubRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emptyView", "Landroid/view/View;", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "observer", "com/kubi/kumex/view/StubRecyclerView$observer$1", "Lcom/kubi/kumex/view/StubRecyclerView$observer$1;", "addEmptyView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setAdapter", "_adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "refreshEmpty", "onVisibilityChanged", "changedView", "visibility", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StubRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public View f30918b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C17080a f30919c;

    /* JADX INFO: renamed from: com.kubi.kumex.view.StubRecyclerView$a */
    /* JADX INFO: compiled from: StubRecyclerView.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/view/StubRecyclerView$observer$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeRemoved", "positionStart", "", "itemCount", "onItemRangeInserted", "onItemRangeChanged", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17080a extends RecyclerView.AdapterDataObserver {
        public C17080a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            StubRecyclerView.this.m36712a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount) {
            super.onItemRangeChanged(positionStart, itemCount);
            StubRecyclerView.this.m36712a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            super.onItemRangeInserted(positionStart, itemCount);
            StubRecyclerView.this.m36712a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            super.onItemRangeRemoved(positionStart, itemCount);
            StubRecyclerView.this.m36712a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubRecyclerView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30919c = new C17080a();
    }

    @Nullable
    /* JADX INFO: renamed from: getEmptyView, reason: from getter */
    public final View getF30918b() {
        return this.f30918b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        m36712a();
    }

    public final void setEmptyView(@Nullable View view) {
        this.f30918b = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m36712a() {
        RecyclerView.Adapter adapter;
        if (!C27046k.m66704s(this)) {
            View view = this.f30918b;
            if (view != null) {
                ViewExtKt.m66577h(view);
                return;
            }
            return;
        }
        if (getAdapter() != null && ((adapter = getAdapter()) == null || adapter.getItemCount() != 0)) {
            View view2 = this.f30918b;
            if (view2 != null) {
                ViewExtKt.m66577h(view2);
                return;
            }
            return;
        }
        View view3 = this.f30918b;
        if (view3 != null) {
            C27046k.m66685H(view3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@Nullable RecyclerView.Adapter<?> _adapter) {
        super.setAdapter(_adapter);
        if (_adapter != null) {
            _adapter.registerAdapterDataObserver(this.f30919c);
        }
    }
}
