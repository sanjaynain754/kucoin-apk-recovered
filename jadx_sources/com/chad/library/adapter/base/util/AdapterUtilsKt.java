package com.chad.library.adapter.base.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdapterUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"asStaggeredGridFullSpan", "", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getItemView", "Landroid/view/View;", "Landroid/view/ViewGroup;", "layoutResId", "", "com.github.CymChad.brvah"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AdapterUtilsKt {
    public static final void asStaggeredGridFullSpan(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @NotNull
    public static final View getItemView(@NotNull ViewGroup viewGroup, @LayoutRes int i11) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(this.context).infla…layoutResId, this, false)");
        return viewInflate;
    }
}
