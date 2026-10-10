package com.kubi.resources.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.res.R$id;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.resources.widget.c2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: StrictDividerItemDecoration.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/resources/widget/StrictDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "dividerColor", "", "dividerHeight", ViewProps.PADDING_HORIZONTAL, "<init>", "(III)V", "paint", "Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "itemPosition", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "onDraw", "c", "Landroid/graphics/Canvas;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StrictDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final int f44424d;

    /* JADX INFO: renamed from: e */
    public final int f44425e;

    /* JADX INFO: renamed from: f */
    public final int f44426f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Paint f44427g;

    public /* synthetic */ StrictDividerItemDecoration(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i14 & 2) != 0 ? 1 : i12, (i14 & 4) != 0 ? 0 : i13);
    }

    public StrictDividerItemDecoration(int i11, int i12, int i13) {
        this.f44424d = i11;
        this.f44425e = i12;
        this.f44426f = i13;
        Paint paint = new Paint();
        paint.setColor(i11);
        paint.setStyle(Paint.Style.FILL);
        this.f44427g = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, int itemPosition, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter == null || itemPosition >= adapter.getItemCount() - 1) {
            return;
        }
        outRect.set(0, 0, 0, this.f44425e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Canvas canvas;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int i11 = 0;
            while (i11 < itemCount) {
                View childAt = parent.getChildAt(i11);
                if (childAt != null && childAt.getTag(R$id.rc_hide_divider) == null) {
                    canvas = c11;
                    canvas.drawRect(parent.getPaddingStart() + this.f44426f, childAt.getBottom(), (parent.getMeasuredWidth() - parent.getPaddingEnd()) - this.f44426f, childAt.getBottom() + this.f44425e, this.f44427g);
                } else {
                    canvas = c11;
                }
                i11++;
                c11 = canvas;
            }
        }
    }
}
