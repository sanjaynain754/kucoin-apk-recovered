package p565qm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qm.a */
/* JADX INFO: compiled from: TodoDelegateAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/record/currentDelegate/adapter/OrderHistoryDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "color", "", "height", "start", "end", "<init>", "(IIII)V", "paint", "Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDrawOver", "c", "Landroid/graphics/Canvas;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43773a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final int f96782d;

    /* JADX INFO: renamed from: e */
    public final int f96783e;

    /* JADX INFO: renamed from: f */
    public final int f96784f;

    /* JADX INFO: renamed from: g */
    public final int f96785g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Paint f96786h;

    public /* synthetic */ C43773a(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? C27017c.f54310a.m66512a(R$color.emphasis8) : i11, (i15 & 2) != 0 ? (int) C27025c.m66564b(C27017c.f54310a.m66513b(), 0.5f) : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getChildAdapterPosition(view) > 0) {
            outRect.set(0, this.f96783e, 0, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[PHI: r2
      0x0067: PHI (r2v2 boolean) = (r2v1 boolean), (r2v4 boolean) binds: [B:8:0x002a, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Canvas canvas;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        if (parent.getChildCount() <= 0) {
            return;
        }
        int childCount = parent.getChildCount();
        int i11 = 0;
        boolean z11 = false;
        while (i11 < childCount) {
            View viewM66698m = C27046k.m66698m(parent, i11);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int itemViewType = adapter.getItemViewType(i11);
                if (z11) {
                    canvas = c11;
                    z11 = false;
                } else {
                    if (itemViewType == 1) {
                        z11 = true;
                    }
                    if (parent.getChildAdapterPosition(viewM66698m) > 0) {
                        canvas = c11;
                        canvas.drawRect(viewM66698m.getLeft() + this.f96784f, viewM66698m.getTop() - this.f96783e, viewM66698m.getRight() - this.f96785g, viewM66698m.getTop(), this.f96786h);
                    } else {
                        canvas = c11;
                    }
                }
            } else {
                canvas = c11;
            }
            i11++;
            c11 = canvas;
        }
    }

    public C43773a(int i11, int i12, int i13, int i14) {
        this.f96782d = i11;
        this.f96783e = i12;
        this.f96784f = i13;
        this.f96785g = i14;
        Paint paint = new Paint(1);
        paint.setColor(i11);
        this.f96786h = paint;
    }
}
