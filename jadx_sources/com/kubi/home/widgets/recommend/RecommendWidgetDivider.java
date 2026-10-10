package com.kubi.home.widgets.recommend;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.widgets.recommend.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecommendWidgetDivider.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/widgets/recommend/RecommendWidgetDivider;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "<init>", "()V", "spanCount", "", "dividerSize", "", "paint", "Landroid/graphics/Paint;", "onDrawOver", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecommendWidgetDivider extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final int f26787d = 2;

    /* JADX INFO: renamed from: e */
    public final float f26788e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Paint f26789f;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        RecyclerView.Adapter adapter = parent.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View viewM66698m = C27046k.m66698m(parent, i11);
                ViewGroup.LayoutParams layoutParams = viewM66698m.getLayoutParams();
                RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    return;
                }
                int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
                int i12 = this.f26787d;
                boolean z11 = (viewLayoutPosition + 1) % i12 == 0;
                if (itemCount % i12 != 0) {
                    i12 = itemCount % i12;
                }
                boolean z12 = viewLayoutPosition >= itemCount - i12;
                if (!z11) {
                    float right = viewM66698m.getRight();
                    c11.drawRect(right, viewM66698m.getTop(), this.f26788e + right, viewM66698m.getBottom(), this.f26789f);
                }
                if (!z12) {
                    float left = viewM66698m.getLeft();
                    float bottom = viewM66698m.getBottom();
                    c11.drawRect(left, bottom, viewM66698m.getRight(), bottom + this.f26788e, this.f26789f);
                }
            }
        }
    }

    public RecommendWidgetDivider() {
        float fM66657a = C27040e.m66657a(0.5f);
        this.f26788e = fM66657a;
        Paint paint = new Paint();
        this.f26789f = paint;
        paint.setColor(C27017c.f54310a.m66512a(R$color.c_divider8));
        paint.setStrokeWidth(fM66657a);
        paint.setStyle(Paint.Style.FILL);
    }
}
