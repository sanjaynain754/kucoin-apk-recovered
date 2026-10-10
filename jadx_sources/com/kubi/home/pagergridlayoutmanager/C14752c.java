package com.kubi.home.pagergridlayoutmanager;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.c */
/* JADX INFO: compiled from: PagerGridSnapHelper.java */
/* JADX INFO: loaded from: classes15.dex */
public class C14752c extends SnapHelper {

    /* JADX INFO: renamed from: a */
    public RecyclerView f25988a;

    /* JADX INFO: renamed from: b */
    public final List<View> f25989b = new ArrayList(2);

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int iM29808a;
        int iM29813b;
        int iM29810c;
        int[] iArr = new int[2];
        int position = layoutManager.getPosition(view);
        if (layoutManager instanceof PagerGridLayoutManager) {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
            int iM29814c = m29814c(pagerGridLayoutManager);
            Rect rect = new Rect();
            layoutManager.getDecoratedBoundsWithMargins(view, rect);
            if (pagerGridLayoutManager.m29769R()) {
                if (m29818g(pagerGridLayoutManager, view) >= iM29814c) {
                    Rect rectM29797z = pagerGridLayoutManager.m29797z();
                    iM29808a = C14751b.m29808a(pagerGridLayoutManager, rectM29797z, rect);
                    iM29810c = C14751b.m29810c(pagerGridLayoutManager, rectM29797z, rect);
                } else {
                    iM29808a = -m29812a(pagerGridLayoutManager, rect);
                    iM29813b = m29813b(pagerGridLayoutManager, rect);
                    iM29810c = -iM29813b;
                }
            } else if (m29819h(pagerGridLayoutManager, view) <= iM29814c) {
                Rect rectM29797z2 = pagerGridLayoutManager.m29797z();
                iM29808a = C14751b.m29808a(pagerGridLayoutManager, rectM29797z2, rect);
                iM29810c = C14751b.m29810c(pagerGridLayoutManager, rectM29797z2, rect);
            } else {
                iM29808a = -m29812a(pagerGridLayoutManager, rect);
                iM29813b = m29813b(pagerGridLayoutManager, rect);
                iM29810c = -iM29813b;
            }
            iArr[0] = iM29808a;
            iArr[1] = iM29810c;
            if (iM29808a == 0 && iM29810c == 0) {
                pagerGridLayoutManager.m29773b(position);
            }
            if (PagerGridLayoutManager.f25941B) {
                Log.i("PagerGridSnapHelper", "calculateDistanceToFinalSnap-targetView: " + position + ",snapDistance: " + Arrays.toString(iArr));
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if ((layoutManager instanceof PagerGridLayoutManager) && (recyclerView = this.f25988a) != null) {
            return new C14751b(recyclerView, (PagerGridLayoutManager) layoutManager);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        View view = null;
        if (layoutManager instanceof PagerGridLayoutManager) {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
            m29821j(pagerGridLayoutManager);
            int size = this.f25989b.size();
            if (size == 1) {
                view = this.f25989b.get(0);
            } else if (size == 2) {
                int iM29814c = m29814c(pagerGridLayoutManager);
                View view2 = this.f25989b.get(0);
                View view3 = this.f25989b.get(1);
                pagerGridLayoutManager.getDecoratedBoundsWithMargins(view3, new Rect());
                if (pagerGridLayoutManager.m29769R()) {
                    if (m29818g(pagerGridLayoutManager, view3) > iM29814c) {
                        view2 = view3;
                    }
                } else if (m29819h(pagerGridLayoutManager, view3) <= iM29814c) {
                    view = view3;
                }
                view = view2;
            } else if (size == 3) {
                view = this.f25989b.get(1);
            } else if (PagerGridLayoutManager.f25941B) {
                Log.w("PagerGridSnapHelper", "findSnapView wrong -> snapList.size: " + this.f25989b.size());
            }
            if (PagerGridLayoutManager.f25941B) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("findSnapView: position:");
                sb2.append(view != null ? layoutManager.getPosition(view) : -1);
                sb2.append(", snapList.size:");
                sb2.append(this.f25989b.size());
                Log.i("PagerGridSnapHelper", sb2.toString());
            }
            this.f25989b.clear();
        }
        return view;
    }

    /* JADX INFO: renamed from: j */
    public final void m29821j(PagerGridLayoutManager pagerGridLayoutManager) {
        if (!this.f25989b.isEmpty()) {
            this.f25989b.clear();
        }
        int childCount = pagerGridLayoutManager.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = pagerGridLayoutManager.getChildAt(i11);
            if (childAt != null && pagerGridLayoutManager.getPosition(childAt) % pagerGridLayoutManager.m29789r() == 0) {
                this.f25989b.add(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m29812a(PagerGridLayoutManager pagerGridLayoutManager, Rect rect) {
        if (!pagerGridLayoutManager.canScrollHorizontally()) {
            return 0;
        }
        return m29815d(pagerGridLayoutManager) - rect.left;
    }

    /* JADX INFO: renamed from: b */
    public static int m29813b(PagerGridLayoutManager pagerGridLayoutManager, Rect rect) {
        if (!pagerGridLayoutManager.canScrollVertically()) {
            return 0;
        }
        return m29815d(pagerGridLayoutManager) - rect.top;
    }

    /* JADX INFO: renamed from: c */
    public static int m29814c(RecyclerView.LayoutManager layoutManager) {
        return m29816e(layoutManager) + (m29817f(layoutManager) / 2);
    }

    /* JADX INFO: renamed from: d */
    public static int m29815d(RecyclerView.LayoutManager layoutManager) {
        int height;
        int paddingBottom;
        if (layoutManager.canScrollHorizontally()) {
            height = layoutManager.getWidth();
            paddingBottom = layoutManager.getPaddingEnd();
        } else {
            height = layoutManager.getHeight();
            paddingBottom = layoutManager.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    /* JADX INFO: renamed from: e */
    public static int m29816e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollHorizontally()) {
            return layoutManager.getPaddingStart();
        }
        return layoutManager.getPaddingTop();
    }

    /* JADX INFO: renamed from: f */
    public static int m29817f(RecyclerView.LayoutManager layoutManager) {
        int height;
        int paddingBottom;
        if (layoutManager.canScrollHorizontally()) {
            height = layoutManager.getWidth() - layoutManager.getPaddingStart();
            paddingBottom = layoutManager.getPaddingEnd();
        } else {
            height = layoutManager.getHeight() - layoutManager.getPaddingTop();
            paddingBottom = layoutManager.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    /* JADX INFO: renamed from: g */
    public static int m29818g(RecyclerView.LayoutManager layoutManager, View view) {
        int decoratedBottom;
        int i11;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutManager.canScrollHorizontally()) {
            decoratedBottom = layoutManager.getDecoratedRight(view);
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            decoratedBottom = layoutManager.getDecoratedBottom(view);
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return decoratedBottom - i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m29819h(RecyclerView.LayoutManager layoutManager, View view) {
        int decoratedTop;
        int i11;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutManager.canScrollHorizontally()) {
            decoratedTop = layoutManager.getDecoratedLeft(view);
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        } else {
            decoratedTop = layoutManager.getDecoratedTop(view);
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return decoratedTop - i11;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
        this.f25988a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i11, int i12) {
        int i13;
        int position = -1;
        if (layoutManager.getItemCount() == 0 || layoutManager.getChildCount() == 0 || !(layoutManager instanceof PagerGridLayoutManager)) {
            return -1;
        }
        PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
        if (pagerGridLayoutManager.m29785n().f25976g == 0) {
            return -1;
        }
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i11, i12);
        if (pagerGridLayoutManager.canScrollHorizontally()) {
            i13 = iArrCalculateScrollDistance[0];
        } else {
            i13 = iArrCalculateScrollDistance[1];
        }
        if (pagerGridLayoutManager.m29769R()) {
            i13 = -i13;
        }
        boolean zM29820i = m29820i(pagerGridLayoutManager, i11, i12);
        int iM29814c = m29814c(pagerGridLayoutManager);
        m29821j(pagerGridLayoutManager);
        int size = this.f25989b.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    if (PagerGridLayoutManager.f25941B) {
                        Log.w("PagerGridSnapHelper", "findTargetSnapPosition-snapList.size: " + this.f25989b.size());
                    }
                } else {
                    position = pagerGridLayoutManager.getPosition(this.f25989b.get(1));
                }
            } else {
                View view = this.f25989b.get(0);
                pagerGridLayoutManager.getPosition(view);
                View view2 = this.f25989b.get(1);
                int position2 = pagerGridLayoutManager.getPosition(view2);
                if (!pagerGridLayoutManager.m29769R() ? !zM29820i ? Math.abs(i13) < iM29814c ? m29818g(pagerGridLayoutManager, view) + Math.abs(i13) < iM29814c || (position2 = position2 - 1) >= 0 : (position2 = position2 - 1) >= 0 : i13 >= iM29814c || m29819h(pagerGridLayoutManager, view2) - i13 <= iM29814c || (position2 = position2 - 1) >= 0 : !zM29820i ? Math.abs(i13) < iM29814c ? m29819h(pagerGridLayoutManager, view) - Math.abs(i13) > iM29814c || (position2 = position2 - 1) >= 0 : (position2 = position2 - 1) >= 0 : i13 >= iM29814c || m29818g(pagerGridLayoutManager, view2) + i13 >= iM29814c || (position2 = position2 - 1) >= 0) {
                    position = position2;
                }
            }
        } else {
            View view3 = this.f25989b.get(0);
            int position3 = pagerGridLayoutManager.getPosition(view3);
            if (!zM29820i ? Math.abs(i13) < iM29814c ? !pagerGridLayoutManager.m29769R() ? m29818g(pagerGridLayoutManager, view3) + Math.abs(i13) <= iM29814c || (position3 = position3 - 1) >= 0 : m29819h(pagerGridLayoutManager, view3) - Math.abs(i13) >= iM29814c || (position3 = position3 - 1) >= 0 : (position3 = position3 - 1) >= 0 : i13 >= iM29814c || (!pagerGridLayoutManager.m29769R() ? !(m29819h(pagerGridLayoutManager, view3) - i13 > iM29814c && (position3 = position3 - 1) < 0) : !(m29818g(pagerGridLayoutManager, view3) + i13 < iM29814c && (position3 = position3 - 1) < 0))) {
                position = position3;
            }
        }
        if (PagerGridLayoutManager.f25941B) {
            Log.d("PagerGridSnapHelper", "findTargetSnapPosition->forwardDirection:" + zM29820i + ",targetPosition:" + position + ",velocityX: " + i11 + ",velocityY: " + i12 + ",scrollDistance:" + i13 + ",snapList:" + this.f25989b.size());
        }
        this.f25989b.clear();
        return position;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m29820i(PagerGridLayoutManager pagerGridLayoutManager, int i11, int i12) {
        if (pagerGridLayoutManager.canScrollHorizontally()) {
            if (pagerGridLayoutManager.m29795x()) {
                if (i11 >= 0) {
                    return false;
                }
                return true;
            }
            if (i11 <= 0) {
                return false;
            }
            return true;
        }
        if (i12 <= 0) {
            return false;
        }
        return true;
    }
}
