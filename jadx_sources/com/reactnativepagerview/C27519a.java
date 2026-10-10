package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.bugly.proguard.C33954u6;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.reactnativepagerview.a */
/* JADX INFO: compiled from: ViewPagerAdapter.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0004J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/reactnativepagerview/a;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reactnativepagerview/ViewPagerViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "j", "(Landroid/view/ViewGroup;I)Lcom/reactnativepagerview/ViewPagerViewHolder;", C33954u6.f72238i, "index", "", "i", "(Lcom/reactnativepagerview/ViewPagerViewHolder;I)V", "getItemCount", "()I", "Landroid/view/View;", "child", "g", "(Landroid/view/View;I)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)Landroid/view/View;", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/view/View;)V", "k", "m", "(I)V", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "childrenViews", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C27519a extends RecyclerView.Adapter<ViewPagerViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<View> childrenViews = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final void m68165g(@NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.childrenViews.add(index, child);
        notifyItemInserted(index);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.childrenViews.size();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final View m68166h(int index) {
        View view = this.childrenViews.get(index);
        Intrinsics.checkNotNullExpressionValue(view, "get(...)");
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewPagerViewHolder holder, int index) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FrameLayout container = holder.getContainer();
        View viewM68166h = m68166h(index);
        holder.setIsRecyclable(false);
        if (container.getChildCount() > 0) {
            container.removeAllViews();
        }
        if (viewM68166h.getParent() != null) {
            ViewParent parent = viewM68166h.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(viewM68166h);
        }
        container.addView(viewM68166h);
    }

    /* JADX INFO: renamed from: k */
    public final void m68169k() {
        int size = this.childrenViews.size();
        int i11 = 1;
        if (1 <= size) {
            while (true) {
                View view = this.childrenViews.get(i11 - 1);
                Intrinsics.checkNotNullExpressionValue(view, "get(...)");
                View view2 = view;
                ViewParent parent = view2.getParent();
                if ((parent != null ? parent.getParent() : null) != null) {
                    ViewParent parent2 = view2.getParent().getParent();
                    Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    Object parent3 = view2.getParent();
                    Intrinsics.checkNotNull(parent3, "null cannot be cast to non-null type android.view.View");
                    ((ViewGroup) parent2).removeView((View) parent3);
                }
                if (i11 == size) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        int size2 = this.childrenViews.size();
        this.childrenViews.clear();
        notifyItemRangeRemoved(0, size2);
    }

    /* JADX INFO: renamed from: l */
    public final void m68170l(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        int iIndexOf = this.childrenViews.indexOf(child);
        if (iIndexOf > -1) {
            m68171m(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m68171m(int index) {
        if (index < 0 || index >= this.childrenViews.size()) {
            return;
        }
        this.childrenViews.remove(index);
        notifyItemRemoved(index);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ViewPagerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewPagerViewHolder.INSTANCE.create(parent);
    }
}
