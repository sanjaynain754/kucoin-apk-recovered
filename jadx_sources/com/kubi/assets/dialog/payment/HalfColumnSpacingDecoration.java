package com.kubi.assets.dialog.payment;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.dialog.payment.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/HalfColumnSpacingDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "space", "", "<init>", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HalfColumnSpacingDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final int f17187d;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(0, 0, 0, 0);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null && layoutParams2.getSpanSize() == 1) {
            if (layoutParams2.getSpanIndex() == 0) {
                outRect.right = this.f17187d / 2;
            } else {
                outRect.left = this.f17187d / 2;
            }
        }
    }

    public HalfColumnSpacingDecoration(int i11) {
        this.f17187d = i11;
    }
}
