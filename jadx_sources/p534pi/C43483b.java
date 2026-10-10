package p534pi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.R$color;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pi.b */
/* JADX INFO: compiled from: PerpetualSwapFailedItemDecoration.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/ui/itemDecoration/PerpetualSwapFailedItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dividerPaint", "Landroid/graphics/Paint;", "dividerHeight", "", "getDividerHeight", "()I", "dividerHeight$delegate", "Lkotlin/Lazy;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onDraw", "c", "Landroid/graphics/Canvas;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43483b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Context f96004d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Paint f96005e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f96006f;

    public C43483b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f96004d = context;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f96005e = paint;
        this.f96006f = LazyKt.lazy(new Function0() { // from class: pi.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C43483b.m95718b(this.f96003b));
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final int m95718b(C43483b c43483b) {
        return (int) C27025c.m66565c(c43483b.f96004d, 33);
    }

    /* JADX INFO: renamed from: c */
    public final int m95719c() {
        return ((Number) this.f96006f.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(0, 0, 0, m95719c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c11, parent, state);
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (i11 != parent.getChildCount() - 1) {
                View childAt = parent.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                int iM95719c = m95719c() + bottom;
                this.f96005e.setColor(ContextCompat.getColor(this.f96004d, R$color.c_bulletLayer));
                float f11 = bottom;
                c11.drawRect(0.0f, f11, parent.getMeasuredWidth(), iM95719c, this.f96005e);
                this.f96005e.setColor(ContextCompat.getColor(this.f96004d, R$color.c_divider8));
                c11.drawRect(0.0f, f11 + (m95719c() / 2), parent.getMeasuredWidth(), (m95719c() / 2) + f11 + 1, this.f96005e);
            }
        }
    }
}
