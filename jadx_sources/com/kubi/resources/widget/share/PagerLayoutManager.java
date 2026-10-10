package com.kubi.resources.widget.share;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.kubi.resources.widget.share.PagerLayoutManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44127a;

/* JADX INFO: compiled from: PagerLayoutManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u000267B6\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012#\b\u0002\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010%\u001a\u00020&H\u0016J$\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u0004H\u0016J)\u0010,\u001a\u00020\u001e2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001e0\u0006J\u0006\u0010/\u001a\u00020\u0004J\u0006\u00100\u001a\u00020\u0004J\u0018\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u0002032\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u001c\u00104\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 R\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0014\u00105\u001a\u00020\u001e2\n\u0010\u001f\u001a\u00060 R\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/kubi/resources/widget/share/PagerLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$SmoothScroller$ScrollVectorProvider;", "spanCount", "", "spanSizeLookup", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", ViewProps.POSITION, "<init>", "(ILkotlin/jvm/functions/Function1;)V", "scrollDistance", "maxScrollDistance", "spanHeight", "Landroid/util/SparseIntArray;", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;", "Lkotlin/collections/ArrayList;", "getFrames", "()Ljava/util/ArrayList;", "setFrames", "(Ljava/util/ArrayList;)V", "onLayoutCompleteListener", "", "Lcom/kubi/resources/widget/share/PagerLayoutManager$LayoutCompleteListener;", "generateDefaultLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onLayoutCompleted", "canScrollHorizontally", "", "scrollHorizontallyBy", "dx", "computeScrollVectorForPosition", "Landroid/graphics/PointF;", "targetPosition", "onLayoutComplete", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "page", "nextPageItemPosition", "prePageItemPosition", "assignSpans", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "fill", "recycleViewsOutOfBounds", "LayoutCompleteListener", "VisibleRect", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPagerLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLayoutManager.kt\ncom/kubi/resources/widget/share/PagerLayoutManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n1#2:304\n*E\n"})
public final class PagerLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: b */
    public final int f45119b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function1<Integer, Integer> f45120c;

    /* JADX INFO: renamed from: d */
    public int f45121d;

    /* JADX INFO: renamed from: e */
    public int f45122e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final SparseIntArray f45123f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public ArrayList<VisibleRect> f45124g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public List<InterfaceC23138a> f45125h;

    /* JADX INFO: compiled from: PagerLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/resources/widget/share/PagerLayoutManager$VisibleRect;", "Landroid/graphics/RectF;", "<init>", "()V", ViewProps.VISIBLE, "", "getVisible", "()Z", "setVisible", "(Z)V", "page", "", "getPage", "()I", "setPage", "(I)V", "rect", "Landroid/graphics/Rect;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class VisibleRect extends RectF {
        private int page;
        private boolean visible;

        public final int getPage() {
            return this.page;
        }

        public final boolean getVisible() {
            return this.visible;
        }

        @NotNull
        public final Rect rect() {
            return new Rect((int) ((RectF) this).left, (int) ((RectF) this).top, (int) ((RectF) this).right, (int) ((RectF) this).bottom);
        }

        public final void setPage(int i11) {
            this.page = i11;
        }

        public final void setVisible(boolean z11) {
            this.visible = z11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.share.PagerLayoutManager$a */
    /* JADX INFO: compiled from: PagerLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bb\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/share/PagerLayoutManager$LayoutCompleteListener;", "", "onLayoutComplete", "", "page", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC23138a {
        /* JADX INFO: renamed from: a */
        void m55479a(int i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagerLayoutManager() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public static final int m55476b(int i11) {
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return true;
    }

    public /* synthetic */ PagerLayoutManager(int i11, Function1 function1, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 12 : i11, (i12 & 2) != 0 ? new Function1() { // from class: ex.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(PagerLayoutManager.m55476b(((Integer) obj).intValue()));
            }
        } : function1);
    }

    /* JADX INFO: renamed from: c */
    public final void m55477c(View view, int i11) {
        int iIntValue = (this.f45120c.invoke(Integer.valueOf(i11)).intValue() * getWidth()) / this.f45119b;
        view.getLayoutParams().width = View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int targetPosition) {
        VisibleRect visibleRect = this.f45124g.get(targetPosition);
        Intrinsics.checkNotNullExpressionValue(visibleRect, "get(...)");
        VisibleRect visibleRect2 = visibleRect;
        return visibleRect2.getVisible() ? new PointF(0.0f, 0.0f) : new PointF(((RectF) visibleRect2).left - this.f45121d, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m55478d(RecyclerView.Recycler recycler) {
        Rect rect = new Rect();
        int i11 = this.f45121d;
        rect.left = i11;
        rect.top = 0;
        rect.right = i11 + getWidth();
        rect.bottom = getHeight();
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13 - i12);
            if (childAt != null) {
                Rect rect2 = new Rect();
                rect2.left = getDecoratedLeft(childAt) + this.f45121d;
                rect2.top = getDecoratedTop(childAt);
                rect2.right = getDecoratedRight(childAt) + this.f45121d;
                rect2.bottom = getDecoratedBottom(childAt);
                if (!Rect.intersects(rect, rect2)) {
                    removeAndRecycleView(childAt, recycler);
                    i12++;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int i11;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        C44127a.m97250j("PagerLayoutManager", "onLayoutChildren with itemCount:" + getItemCount());
        if (getItemCount() <= 0 || state.isPreLayout()) {
            return;
        }
        if (this.f45124g.size() != getItemCount()) {
            int width = getWidth();
            int height = getHeight();
            this.f45124g.clear();
            int itemCount = getItemCount();
            int i12 = 0;
            int iMax = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < itemCount; i14++) {
                int iIntValue = (this.f45120c.invoke(Integer.valueOf(i14)).intValue() * getWidth()) / this.f45119b;
                if (this.f45123f.get(iIntValue, Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    i11 = this.f45123f.get(iIntValue);
                } else {
                    View viewForPosition = recycler.getViewForPosition(i14);
                    Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
                    m55477c(viewForPosition, i14);
                    measureChildWithMargins(viewForPosition, i12, i12);
                    this.f45123f.put(iIntValue, getDecoratedMeasuredHeight(viewForPosition));
                    removeAndRecycleView(viewForPosition, recycler);
                    i11 = this.f45123f.get(iIntValue);
                }
                if (width >= iIntValue) {
                    ArrayList<VisibleRect> arrayList = this.f45124g;
                    VisibleRect visibleRect = new VisibleRect();
                    ((RectF) visibleRect).left = ((getWidth() * i13) + getWidth()) - width;
                    float height2 = getHeight() - height;
                    ((RectF) visibleRect).top = height2;
                    ((RectF) visibleRect).right = ((RectF) visibleRect).left + iIntValue;
                    ((RectF) visibleRect).bottom = height2 + i11;
                    visibleRect.setPage(i13);
                    arrayList.add(visibleRect);
                    width -= iIntValue;
                    iMax = Math.max(iMax, i11);
                    i12 = 0;
                } else {
                    height -= iMax;
                    if (height < i11) {
                        i13++;
                        height = getHeight();
                        this.f45122e += getWidth();
                    }
                    int width2 = getWidth();
                    ArrayList<VisibleRect> arrayList2 = this.f45124g;
                    VisibleRect visibleRect2 = new VisibleRect();
                    ((RectF) visibleRect2).left = ((getWidth() * i13) + getWidth()) - width2;
                    float height3 = getHeight() - height;
                    ((RectF) visibleRect2).top = height3;
                    ((RectF) visibleRect2).right = ((RectF) visibleRect2).left + iIntValue;
                    ((RectF) visibleRect2).bottom = height3 + i11;
                    visibleRect2.setPage(i13);
                    arrayList2.add(visibleRect2);
                    i12 = 0;
                    iMax = Math.max(0, i11);
                    width = width2 - iIntValue;
                }
            }
        }
        fill(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(@Nullable RecyclerView.State state) {
        VisibleRect visibleRect;
        for (InterfaceC23138a interfaceC23138a : this.f45125h) {
            int page = 0;
            if (this.f45124g.size() > 0 && (visibleRect = (VisibleRect) CollectionsKt.lastOrNull((List) this.f45124g)) != null) {
                page = visibleRect.getPage();
            }
            interfaceC23138a.m55479a(page);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int dx2, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int i11;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        int i12 = this.f45121d;
        if ((i12 <= 0 && dx2 <= 0) || (i12 >= (i11 = this.f45122e) && dx2 >= 0)) {
            dx2 = 0;
        } else if (i12 + dx2 < 0) {
            dx2 = -i12;
        } else if (i12 + dx2 > i11) {
            dx2 = i11 - i12;
        }
        fill(recycler, state);
        offsetChildrenHorizontal(-dx2);
        this.f45121d += dx2;
        m55478d(recycler);
        return dx2;
    }

    public final void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        PagerLayoutManager pagerLayoutManager;
        if (getItemCount() > 0 && !state.isPreLayout()) {
            Rect rect = new Rect();
            int i11 = this.f45121d;
            rect.left = i11;
            rect.top = 0;
            rect.right = i11 + getWidth();
            rect.bottom = getHeight();
            int itemCount = getItemCount();
            for (int i12 = 0; i12 < itemCount; i12++) {
                if (!this.f45124g.get(i12).getVisible() && Rect.intersects(rect, this.f45124g.get(i12).rect())) {
                    View viewForPosition = recycler.getViewForPosition(i12);
                    Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
                    m55477c(viewForPosition, i12);
                    measureChildWithMargins(viewForPosition, 0, 0);
                    addView(viewForPosition);
                    VisibleRect visibleRect = this.f45124g.get(i12);
                    visibleRect.setVisible(true);
                    Rect rect2 = visibleRect.rect();
                    int i13 = rect2.left;
                    int i14 = this.f45121d;
                    pagerLayoutManager = this;
                    pagerLayoutManager.layoutDecoratedWithMargins(viewForPosition, i13 - i14, rect2.top, rect2.right - i14, rect2.bottom);
                } else {
                    pagerLayoutManager = this;
                }
                if (pagerLayoutManager.f45124g.get(i12).getVisible() && !Rect.intersects(rect, pagerLayoutManager.f45124g.get(i12).rect())) {
                    pagerLayoutManager.f45124g.get(i12).setVisible(false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagerLayoutManager(int i11, @NotNull Function1<? super Integer, Integer> spanSizeLookup) {
        Intrinsics.checkNotNullParameter(spanSizeLookup, "spanSizeLookup");
        this.f45119b = i11;
        this.f45120c = spanSizeLookup;
        this.f45122e = getWidth();
        this.f45123f = new SparseIntArray();
        this.f45124g = new ArrayList<>();
        this.f45125h = new ArrayList(0);
    }
}
