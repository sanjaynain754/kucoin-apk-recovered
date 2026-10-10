package p809yu;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.c0 */
/* JADX INFO: compiled from: RecommendSpaceItemDecoration.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/RecommendSpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mSpanCount", "", "mRowSpacing", "mColumnSpacing", "<init>", "(III)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46570c0 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    public final int f104329d;

    /* JADX INFO: renamed from: e */
    public final int f104330e;

    /* JADX INFO: renamed from: f */
    public final int f104331f;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i11 = childAdapterPosition % this.f104329d;
        if (ViewCompat.getLayoutDirection(parent) == 1) {
            int i12 = this.f104331f;
            int i13 = this.f104329d;
            outRect.right = (i11 * i12) / i13;
            outRect.left = i12 - (((i11 + 1) * i12) / i13);
        } else {
            int i14 = this.f104331f;
            int i15 = this.f104329d;
            outRect.left = (i11 * i14) / i15;
            outRect.right = i14 - (((i11 + 1) * i14) / i15);
        }
        if (childAdapterPosition >= this.f104329d) {
            outRect.top = this.f104330e;
        }
    }

    public C46570c0(int i11, int i12, int i13) {
        this.f104329d = i11;
        this.f104330e = i12;
        this.f104331f = i13;
    }
}
