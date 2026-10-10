package mt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.otc.R$color;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mt.e0 */
/* JADX INFO: compiled from: StickySectionDecoration.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010!\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/kubi/otc/view/StickySectionDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "list", "", "Lcom/kubi/otc/view/StickySection;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getList", "()Ljava/util/List;", "mBounds", "Landroid/graphics/Rect;", "fontColor", "", "bgColor", "mSectionHeight", "mPaint", "Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "c", "Landroid/graphics/Canvas;", "onDrawOver", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42620e0 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Context f94342d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<InterfaceC42618d0> f94343e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public Rect f94344f;

    /* JADX INFO: renamed from: g */
    public int f94345g;

    /* JADX INFO: renamed from: h */
    public int f94346h;

    /* JADX INFO: renamed from: i */
    public int f94347i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public Paint f94348j;

    /* JADX WARN: Multi-variable type inference failed */
    public C42620e0(@NotNull Context context, @NotNull List<? extends InterfaceC42618d0> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f94342d = context;
        this.f94343e = list;
        this.f94344f = new Rect();
        this.f94345g = ContextCompat.getColor(context, R$color.emphasis);
        this.f94346h = ContextCompat.getColor(context, R$color.c_background);
        this.f94347i = C5275i0.m6236a(28.0f);
        Paint paint = new Paint();
        paint.setTextSize(C5275i0.m6241f(12.0f));
        paint.setAntiAlias(true);
        this.f94348j = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
        List<InterfaceC42618d0> list = this.f94343e;
        if (list == null || list.isEmpty() || viewLayoutPosition < 0 || viewLayoutPosition >= this.f94343e.size() || !this.f94343e.get(viewLayoutPosition).isTitle()) {
            return;
        }
        outRect.set(0, this.f94347i, 0, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c11, parent, state);
        int paddingLeft = parent.getPaddingLeft();
        int width = parent.getWidth() - parent.getPaddingRight();
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition();
            List<InterfaceC42618d0> list = this.f94343e;
            if (list != null && !list.isEmpty() && viewLayoutPosition >= 0 && viewLayoutPosition < this.f94343e.size() && this.f94343e.get(viewLayoutPosition).isTitle()) {
                this.f94348j.setColor(this.f94346h);
                c11.drawRect(paddingLeft, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - this.f94347i, width, childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, this.f94348j);
                this.f94348j.setColor(this.f94345g);
                this.f94348j.getTextBounds(this.f94343e.get(viewLayoutPosition).getTitle(), 0, this.f94343e.get(viewLayoutPosition).getTitle().length(), this.f94344f);
                c11.drawText(this.f94343e.get(viewLayoutPosition).getTitle(), childAt.getPaddingLeft(), (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((this.f94347i / 2.0f) - (this.f94344f.height() / 2.0f)), this.f94348j);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) parent.getLayoutManager();
        Intrinsics.checkNotNull(linearLayoutManager);
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        List<InterfaceC42618d0> list = this.f94343e;
        if (list == null || list.isEmpty() || iFindFirstVisibleItemPosition < 0 || iFindFirstVisibleItemPosition >= this.f94343e.size()) {
            return;
        }
        String title = this.f94343e.get(iFindFirstVisibleItemPosition).getTitle();
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = parent.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
        Intrinsics.checkNotNull(viewHolderFindViewHolderForLayoutPosition);
        View itemView = viewHolderFindViewHolderForLayoutPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        boolean z11 = true;
        if (Intrinsics.areEqual(title, this.f94343e.get(iFindFirstVisibleItemPosition + 1).getTitle()) || itemView.getHeight() + itemView.getTop() >= this.f94347i) {
            z11 = false;
        } else {
            c11.save();
            c11.translate(0.0f, (itemView.getHeight() + itemView.getTop()) - this.f94347i);
        }
        this.f94348j.setColor(this.f94346h);
        c11.drawRect(parent.getPaddingLeft(), parent.getPaddingTop(), parent.getRight() - parent.getPaddingRight(), parent.getPaddingTop() + this.f94347i, this.f94348j);
        this.f94348j.setColor(this.f94345g);
        this.f94348j.getTextBounds(title, 0, title.length(), this.f94344f);
        float paddingLeft = itemView.getPaddingLeft();
        int paddingTop = parent.getPaddingTop();
        int i11 = this.f94347i;
        c11.drawText(title, paddingLeft, (paddingTop + i11) - ((i11 / 2.0f) - (this.f94344f.height() / 2.0f)), this.f94348j);
        if (z11) {
            c11.restore();
        }
    }
}
