package com.kubi.profit.loss.analysis.lib;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DynamicSpacingItemDecoration.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/DynamicSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemWidth", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DynamicSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final RecyclerView f40750d;

    /* JADX INFO: renamed from: e */
    public final int f40751e;

    public DynamicSpacingItemDecoration(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f40750d = recyclerView;
        this.f40751e = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int itemCount = state.getItemCount();
        if (itemCount == 0) {
            return;
        }
        int width = itemCount > 1 ? (this.f40750d.getWidth() - (this.f40751e * itemCount)) / (itemCount - 1) : 0;
        if (childAdapterPosition == 0) {
            outRect.left = 0;
            outRect.right = width / 2;
        } else if (childAdapterPosition == itemCount - 1) {
            outRect.left = width / 2;
            outRect.right = 0;
        } else {
            int i11 = width / 2;
            outRect.left = i11;
            outRect.right = i11;
        }
    }
}
