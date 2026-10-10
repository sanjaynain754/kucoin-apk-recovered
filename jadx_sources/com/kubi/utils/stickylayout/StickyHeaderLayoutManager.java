package com.kubi.utils.stickylayout;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.sdk.utils.R$id;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes54.dex */
public class StickyHeaderLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: b */
    public C27089a f54424b;

    /* JADX INFO: renamed from: e */
    public int f54427e;

    /* JADX INFO: renamed from: f */
    public int f54428f;

    /* JADX INFO: renamed from: h */
    public SavedState f54430h;

    /* JADX INFO: renamed from: c */
    public HashSet<View> f54425c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    public HashMap<Integer, HeaderPosition> f54426d = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public int f54429g = -1;

    public enum HeaderPosition {
        NONE,
        NATURAL,
        STICKY,
        TRAILING
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C27087a();
        int firstViewAdapterPosition;
        int firstViewTop;

        /* JADX INFO: renamed from: com.kubi.utils.stickylayout.StickyHeaderLayoutManager$SavedState$a */
        public class C27087a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState() {
            this.firstViewAdapterPosition = -1;
            this.firstViewTop = 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void invalidate() {
            this.firstViewAdapterPosition = -1;
        }

        public boolean isValid() {
            return this.firstViewAdapterPosition >= 0;
        }

        public String toString() {
            return "<" + getClass().getCanonicalName() + " firstViewAdapterPosition: " + this.firstViewAdapterPosition + " firstViewTop: " + this.firstViewTop + ">";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.firstViewAdapterPosition);
            parcel.writeInt(this.firstViewTop);
        }

        public SavedState(Parcel parcel) {
            this.firstViewAdapterPosition = -1;
            this.firstViewTop = 0;
            this.firstViewAdapterPosition = parcel.readInt();
            this.firstViewTop = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.firstViewAdapterPosition = -1;
            this.firstViewTop = 0;
            this.firstViewAdapterPosition = savedState.firstViewAdapterPosition;
            this.firstViewTop = savedState.firstViewTop;
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.stickylayout.StickyHeaderLayoutManager$a */
    public class C27088a extends LinearSmoothScroller {

        /* JADX INFO: renamed from: a */
        public final float f54432a;

        /* JADX INFO: renamed from: b */
        public final float f54433b;

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i11) {
            return (int) (this.f54433b * (i11 / this.f54432a));
        }

        public C27088a(Context context, int i11) {
            super(context);
            this.f54432a = i11;
            this.f54433b = i11 < 10000 ? (int) (Math.abs(i11) * calculateSpeedPerPixel(context.getResources().getDisplayMetrics())) : 1000.0f;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i11) {
            return new PointF(0.0f, StickyHeaderLayoutManager.this.m66844b(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final View m66845c(RecyclerView.Recycler recycler, int i11) {
        if (!this.f54424b.m66871i(i11)) {
            throw new IllegalStateException("createSectionHeaderIfNeeded should not be called for a section which does not have a header");
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (m66850h(childAt) == 0 && m66851i(childAt) == i11) {
                return childAt;
            }
        }
        View viewForPosition = recycler.getViewForPosition(this.f54424b.m66873k(i11));
        this.f54425c.add(viewForPosition);
        addView(viewForPosition);
        measureChildWithMargins(viewForPosition, 0, 0);
        return viewForPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    /* JADX INFO: renamed from: j */
    public final C27089a.g m66852j(View view) {
        return (C27089a.g) view.getTag(R$id.sectioning_adapter_tag_key_view_viewholder);
    }

    /* JADX INFO: renamed from: l */
    public final void m66854l(int i11, View view, HeaderPosition headerPosition) {
        if (!this.f54426d.containsKey(Integer.valueOf(i11))) {
            this.f54426d.put(Integer.valueOf(i11), headerPosition);
        } else if (this.f54426d.get(Integer.valueOf(i11)) != headerPosition) {
            this.f54426d.put(Integer.valueOf(i11), headerPosition);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m66856o(RecyclerView.Recycler recycler) {
        int decoratedTop;
        int decoratedTop2;
        int iM66850h;
        HashSet hashSet = new HashSet();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            int iM66851i = m66851i(getChildAt(i11));
            if (hashSet.add(Integer.valueOf(iM66851i)) && this.f54424b.m66871i(iM66851i)) {
                m66845c(recycler, iM66851i);
            }
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        for (View view : this.f54425c) {
            int iM66851i2 = m66851i(view);
            int childCount2 = getChildCount();
            View view2 = null;
            View view3 = null;
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt = getChildAt(i12);
                if (!m66853k(childAt) && (iM66850h = m66850h(childAt)) != 0) {
                    int iM66851i3 = m66851i(childAt);
                    if (iM66851i3 == iM66851i2) {
                        if (iM66850h == 1) {
                            view2 = childAt;
                        }
                    } else if (iM66851i3 == iM66851i2 + 1 && view3 == null) {
                        view3 = childAt;
                    }
                }
            }
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
            int paddingTop = getPaddingTop();
            HeaderPosition headerPosition = HeaderPosition.STICKY;
            if (view2 != null && (decoratedTop2 = getDecoratedTop(view2)) >= paddingTop) {
                headerPosition = HeaderPosition.NATURAL;
                paddingTop = decoratedTop2;
            }
            if (view3 != null && (decoratedTop = getDecoratedTop(view3) - decoratedMeasuredHeight) < paddingTop) {
                headerPosition = HeaderPosition.TRAILING;
                paddingTop = decoratedTop;
            }
            view.bringToFront();
            layoutDecorated(view, paddingLeft, paddingTop, width, paddingTop + decoratedMeasuredHeight);
            m66854l(iM66851i2, view, headerPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        View view;
        int decoratedMeasuredHeight;
        try {
            C27089a c27089a = this.f54424b;
            if (c27089a == null) {
                return;
            }
            if (c27089a.getItemCount() == 0) {
                removeAndRecycleAllViews(recycler);
                return;
            }
            int i11 = this.f54429g;
            if (i11 >= 0) {
                this.f54427e = i11;
                this.f54428f = 0;
                this.f54429g = -1;
            } else {
                SavedState savedState = this.f54430h;
                if (savedState == null || !savedState.isValid()) {
                    m66855n();
                } else {
                    SavedState savedState2 = this.f54430h;
                    this.f54427e = savedState2.firstViewAdapterPosition;
                    this.f54428f = savedState2.firstViewTop;
                    this.f54430h = null;
                }
            }
            int i12 = this.f54428f;
            this.f54425c.clear();
            this.f54426d.clear();
            detachAndScrapAttachedViews(recycler);
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            if (this.f54427e >= state.getItemCount()) {
                this.f54427e = state.getItemCount() - 1;
            }
            int i13 = this.f54427e;
            int i14 = 0;
            int i15 = i12;
            while (i13 < state.getItemCount()) {
                View viewForPosition = recycler.getViewForPosition(i13);
                addView(viewForPosition);
                measureChildWithMargins(viewForPosition, 0, 0);
                int iM66850h = m66850h(viewForPosition);
                if (iM66850h == 0) {
                    this.f54425c.add(viewForPosition);
                    decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
                    int i16 = i15 + decoratedMeasuredHeight;
                    layoutDecorated(viewForPosition, paddingLeft, i15, width, i16);
                    i13++;
                    View viewForPosition2 = recycler.getViewForPosition(i13);
                    addView(viewForPosition2);
                    layoutDecorated(viewForPosition2, paddingLeft, i15, width, i16);
                    view = viewForPosition;
                } else if (iM66850h == 1) {
                    View viewForPosition3 = recycler.getViewForPosition(i13 - 1);
                    this.f54425c.add(viewForPosition3);
                    addView(viewForPosition3);
                    measureChildWithMargins(viewForPosition3, 0, 0);
                    decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition3);
                    int i17 = i15 + decoratedMeasuredHeight;
                    layoutDecorated(viewForPosition3, paddingLeft, i15, width, i17);
                    view = viewForPosition;
                    layoutDecorated(view, paddingLeft, i15, width, i17);
                } else {
                    view = viewForPosition;
                    decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
                    layoutDecorated(view, paddingLeft, i15, width, i15 + decoratedMeasuredHeight);
                }
                i15 += decoratedMeasuredHeight;
                i14 += decoratedMeasuredHeight;
                if (view.getBottom() >= height) {
                    break;
                } else {
                    i13++;
                }
            }
            int height2 = getHeight() - (getPaddingTop() + getPaddingBottom());
            if (i14 < height2) {
                scrollVerticallyBy(i14 - height2, recycler, null);
            } else {
                m66856o(recycler);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null && (parcelable instanceof SavedState)) {
            this.f54430h = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.f54430h;
        if (savedState != null) {
            return savedState;
        }
        if (this.f54424b != null) {
            m66855n();
        }
        SavedState savedState2 = new SavedState();
        savedState2.firstViewAdapterPosition = this.f54427e;
        savedState2.firstViewTop = this.f54428f;
        return savedState2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i11) {
        if (i11 < 0 || i11 > getItemCount()) {
            throw new IndexOutOfBoundsException("adapter position out of range");
        }
        this.f54429g = i11;
        this.f54430h = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i12;
        int decoratedMeasuredHeight;
        try {
            if (getChildCount() == 0) {
                return 0;
            }
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            if (i11 < 0) {
                View viewM66848f = m66848f();
                if (viewM66848f != null) {
                    i12 = 0;
                    while (i12 > i11) {
                        int iMin = Math.min(i12 - i11, Math.max(-getDecoratedTop(viewM66848f), 0));
                        int i13 = i12 - iMin;
                        offsetChildrenVertical(iMin);
                        int i14 = this.f54427e;
                        if (i14 > 0 && i13 > i11) {
                            int i15 = i14 - 1;
                            this.f54427e = i15;
                            int iM66874l = this.f54424b.m66874l(i15);
                            if (iM66874l == 0) {
                                int i16 = this.f54427e - 1;
                                this.f54427e = i16;
                                if (i16 >= 0) {
                                    iM66874l = this.f54424b.m66874l(i16);
                                    if (iM66874l == 0) {
                                    }
                                }
                            }
                            View viewForPosition = recycler.getViewForPosition(this.f54427e);
                            addView(viewForPosition, 0);
                            int decoratedTop = getDecoratedTop(viewM66848f);
                            if (iM66874l == 1) {
                                decoratedMeasuredHeight = getDecoratedMeasuredHeight(m66845c(recycler, this.f54424b.m66880r(this.f54427e)));
                            } else {
                                measureChildWithMargins(viewForPosition, 0, 0);
                                decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
                            }
                            int i17 = decoratedTop - decoratedMeasuredHeight;
                            viewM66848f = viewForPosition;
                            layoutDecorated(viewM66848f, paddingLeft, i17, width, decoratedTop);
                            i12 = i13;
                        }
                        i12 = i13;
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                int height = getHeight();
                View viewM66846d = m66846d();
                if (viewM66846d == null) {
                    return 0;
                }
                i12 = 0;
                while (i12 < i11) {
                    int i18 = -Math.min(i11 - i12, Math.max(getDecoratedBottom(viewM66846d) - height, 0));
                    int i19 = i12 - i18;
                    offsetChildrenVertical(i18);
                    int iM66849g = m66849g(viewM66846d);
                    int i21 = iM66849g + 1;
                    if (i19 >= i11 || i21 >= state.getItemCount()) {
                        i12 = i19;
                        break;
                    }
                    int decoratedBottom = getDecoratedBottom(viewM66846d);
                    int iM66874l2 = this.f54424b.m66874l(i21);
                    if (iM66874l2 == 0) {
                        View viewM66845c = m66845c(recycler, this.f54424b.m66880r(i21));
                        int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM66845c);
                        layoutDecorated(viewM66845c, paddingLeft, 0, width, decoratedMeasuredHeight2);
                        viewM66846d = recycler.getViewForPosition(iM66849g + 2);
                        addView(viewM66846d);
                        layoutDecorated(viewM66846d, paddingLeft, decoratedBottom, width, decoratedMeasuredHeight2 + decoratedBottom);
                    } else if (iM66874l2 == 1) {
                        View viewM66845c2 = m66845c(recycler, this.f54424b.m66880r(i21));
                        int decoratedMeasuredHeight3 = getDecoratedMeasuredHeight(viewM66845c2);
                        layoutDecorated(viewM66845c2, paddingLeft, 0, width, decoratedMeasuredHeight3);
                        viewM66846d = recycler.getViewForPosition(i21);
                        addView(viewM66846d);
                        layoutDecorated(viewM66846d, paddingLeft, decoratedBottom, width, decoratedMeasuredHeight3 + decoratedBottom);
                    } else {
                        viewM66846d = recycler.getViewForPosition(i21);
                        addView(viewM66846d);
                        measureChildWithMargins(viewM66846d, 0, 0);
                        layoutDecorated(viewM66846d, paddingLeft, decoratedBottom, width, getDecoratedMeasuredHeight(viewM66846d) + decoratedBottom);
                    }
                    i12 = i19;
                }
            }
            View viewM66848f2 = m66848f();
            if (viewM66848f2 != null) {
                this.f54428f = getDecoratedTop(viewM66848f2);
            }
            m66856o(recycler);
            m66843m(recycler);
            return i12;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
        if (i11 < 0 || i11 > getItemCount()) {
            throw new IndexOutOfBoundsException("adapter position out of range");
        }
        this.f54430h = null;
        View childAt = recyclerView.getChildAt(0);
        int iAbs = Math.abs((recyclerView.getChildAdapterPosition(childAt) - i11) * m66847e(recyclerView));
        if (iAbs == 0) {
            iAbs = (int) Math.abs(childAt.getY());
        }
        C27088a c27088a = new C27088a(recyclerView.getContext(), iAbs);
        c27088a.setTargetPosition(i11);
        startSmoothScroll(c27088a);
    }

    /* JADX INFO: renamed from: m */
    private void m66843m(RecyclerView.Recycler recycler) {
        int height = getHeight();
        int childCount = getChildCount();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!m66853k(childAt) && m66850h(childAt) != 0) {
                if (getDecoratedBottom(childAt) >= 0 && getDecoratedTop(childAt) <= height) {
                    hashSet.add(Integer.valueOf(m66851i(childAt)));
                } else {
                    hashSet2.add(childAt);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (!m66853k(childAt2)) {
                int iM66851i = m66851i(childAt2);
                if (m66850h(childAt2) == 0 && !hashSet.contains(Integer.valueOf(iM66851i))) {
                    float translationY = childAt2.getTranslationY();
                    if (getDecoratedBottom(childAt2) + translationY < 0.0f || getDecoratedTop(childAt2) + translationY > height) {
                        hashSet2.add(childAt2);
                        this.f54425c.remove(childAt2);
                        this.f54426d.remove(Integer.valueOf(iM66851i));
                    }
                }
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            removeAndRecycleView((View) it.next(), recycler);
        }
        m66855n();
    }

    /* JADX INFO: renamed from: b */
    public final int m66844b(int i11) {
        m66855n();
        int i12 = this.f54427e;
        if (i11 > i12) {
            return 1;
        }
        if (i11 < i12) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public View m66846d() {
        int decoratedBottom;
        View view = null;
        if (getChildCount() == 0) {
            return null;
        }
        int childCount = getChildCount();
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (m66849g(childAt) != -1 && m66850h(childAt) != 0 && (decoratedBottom = getDecoratedBottom(childAt)) > i11) {
                view = childAt;
                i11 = decoratedBottom;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: e */
    public final int m66847e(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int iMax = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            iMax = Math.max(getDecoratedMeasuredHeight(recyclerView.getChildAt(i11)), iMax);
        }
        return iMax;
    }

    /* JADX INFO: renamed from: f */
    public final View m66848f() {
        int decoratedTop;
        View view = null;
        if (getChildCount() == 0) {
            return null;
        }
        int childCount = getChildCount();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (m66849g(childAt) != -1 && m66850h(childAt) != 0 && (decoratedTop = getDecoratedTop(childAt)) < i11) {
                view = childAt;
                i11 = decoratedTop;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: g */
    public int m66849g(View view) {
        return m66852j(view).getAdapterPosition();
    }

    /* JADX INFO: renamed from: h */
    public final int m66850h(View view) {
        return this.f54424b.m66874l(m66849g(view));
    }

    /* JADX INFO: renamed from: i */
    public final int m66851i(View view) {
        return this.f54424b.m66880r(m66849g(view));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m66853k(View view) {
        if (m66849g(view) == -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final int m66855n() {
        if (getChildCount() == 0) {
            this.f54427e = 0;
            int paddingTop = getPaddingTop();
            this.f54428f = paddingTop;
            return paddingTop;
        }
        View viewM66848f = m66848f();
        if (viewM66848f != null) {
            this.f54427e = m66849g(viewM66848f);
            int iMin = Math.min(viewM66848f.getTop(), getPaddingTop());
            this.f54428f = iMin;
            return iMin;
        }
        return this.f54428f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        try {
            this.f54424b = (C27089a) adapter2;
            removeAllViews();
            this.f54425c.clear();
            this.f54426d.clear();
        } catch (ClassCastException unused) {
            throw new ClassCastException("StickyHeaderLayoutManager must be used with a RecyclerView where the adapter is a kind of SectioningAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        try {
            this.f54424b = (C27089a) recyclerView.getAdapter();
        } catch (ClassCastException unused) {
            throw new ClassCastException("StickyHeaderLayoutManager must be used with a RecyclerView where the adapter is a kind of SectioningAdapter");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        m66855n();
    }
}
