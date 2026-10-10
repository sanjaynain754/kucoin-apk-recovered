package com.facebook.react.uimanager;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.touch.ReactHitSlopView;
import com.facebook.react.uimanager.common.ViewUtil;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class TouchTargetHelper {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f9925a = 0;
    private static final float[] mEventCoords = new float[2];
    private static final PointF mTempPoint = new PointF();
    private static final float[] mMatrixTransformCoords = new float[2];
    private static final Matrix mInverseMatrix = new Matrix();

    public enum TouchTargetReturnType {
        SELF,
        CHILD
    }

    public static class ViewTarget {

        @Nullable
        private final View mView;
        private final int mViewId;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ViewTarget) && ((ViewTarget) obj).getViewId() == this.mViewId;
        }

        private ViewTarget(int i11, @Nullable View view) {
            this.mViewId = i11;
            this.mView = view;
        }

        @Nullable
        public View getView() {
            return this.mView;
        }

        public int getViewId() {
            return this.mViewId;
        }

        public int hashCode() {
            return Integer.valueOf(this.mViewId).hashCode();
        }
    }

    public static int findTargetTagForTouch(float f11, float f12, ViewGroup viewGroup) {
        return findTargetTagAndCoordinatesForTouch(f11, f12, viewGroup, mEventCoords, null);
    }

    @SuppressLint({"ResourceType"})
    private static View findClosestReactAncestor(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static int findTargetTagForTouch(float f11, float f12, ViewGroup viewGroup, @Nullable int[] iArr) {
        return findTargetTagAndCoordinatesForTouch(f11, f12, viewGroup, mEventCoords, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View findTouchTargetView(float[] fArr, View view, EnumSet<TouchTargetReturnType> enumSet, List<ViewTarget> list) {
        if (enumSet.contains(TouchTargetReturnType.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!isTouchPointInView(fArr[0], fArr[1], view)) {
                if (view instanceof ReactOverflowViewWithInset) {
                    if (ViewUtil.getUIManagerType(view.getId()) == 2 && !isTouchPointInViewWithOverflowInset(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((ReactOverflowViewWithInset) view).getOverflow();
                    if (ViewProps.HIDDEN.equals(overflow) || ViewProps.SCROLL.equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            ReactZIndexedViewGroup reactZIndexedViewGroup = viewGroup instanceof ReactZIndexedViewGroup ? (ReactZIndexedViewGroup) viewGroup : null;
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = viewGroup.getChildAt(reactZIndexedViewGroup != null ? reactZIndexedViewGroup.getZIndexMappedChildIndex(i11) : i11);
                PointF pointF = mTempPoint;
                getChildPoint(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f11 = fArr[0];
                float f12 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, childAt, list);
                if (viewFindTouchTargetViewWithPointerEvents != null) {
                    return viewFindTouchTargetViewWithPointerEvents;
                }
                fArr[0] = f11;
                fArr[1] = f12;
            }
        }
        if (enumSet.contains(TouchTargetReturnType.SELF) && isTouchPointInView(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    private static View findTouchTargetViewWithPointerEvents(float[] fArr, View view, @Nullable List<ViewTarget> list) {
        PointerEvents pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : PointerEvents.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                pointerEvents = PointerEvents.BOX_NONE;
            } else if (pointerEvents == PointerEvents.BOX_ONLY) {
                pointerEvents = PointerEvents.NONE;
            }
        }
        if (pointerEvents == PointerEvents.NONE) {
            return null;
        }
        if (pointerEvents == PointerEvents.BOX_ONLY) {
            View viewFindTouchTargetView = findTouchTargetView(fArr, view, EnumSet.of(TouchTargetReturnType.SELF), list);
            if (viewFindTouchTargetView != null && list != null) {
                list.add(new ViewTarget(view.getId(), view));
            }
            return viewFindTouchTargetView;
        }
        if (pointerEvents == PointerEvents.BOX_NONE) {
            View viewFindTouchTargetView2 = findTouchTargetView(fArr, view, EnumSet.of(TouchTargetReturnType.CHILD), list);
            if (viewFindTouchTargetView2 != null) {
                if (list != null) {
                    list.add(new ViewTarget(view.getId(), view));
                }
                return viewFindTouchTargetView2;
            }
            if (!(view instanceof ReactCompoundView) || !isTouchPointInView(fArr[0], fArr[1], view) || ((ReactCompoundView) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (list != null) {
                list.add(new ViewTarget(view.getId(), view));
                return view;
            }
        } else {
            if (pointerEvents != PointerEvents.AUTO) {
                C45999a.m101488I(ReactConstants.TAG, "Unknown pointer event type: " + pointerEvents.toString());
            }
            if (!(view instanceof ReactCompoundViewGroup) || !isTouchPointInView(fArr[0], fArr[1], view) || !((ReactCompoundViewGroup) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                View viewFindTouchTargetView3 = findTouchTargetView(fArr, view, EnumSet.of(TouchTargetReturnType.SELF, TouchTargetReturnType.CHILD), list);
                if (viewFindTouchTargetView3 != null && list != null) {
                    list.add(new ViewTarget(view.getId(), view));
                }
                return viewFindTouchTargetView3;
            }
            if (list != null) {
                list.add(new ViewTarget(view.getId(), view));
            }
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int getTouchTargetForView(View view, float f11, float f12) {
        return view instanceof ReactCompoundView ? ((ReactCompoundView) view).reactTagForTouch(f11, f12) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isTouchPointInView(float f11, float f12, View view) {
        if (view instanceof ReactHitSlopView) {
            ReactHitSlopView reactHitSlopView = (ReactHitSlopView) view;
            if (reactHitSlopView.getHitSlopRect() != null) {
                Rect hitSlopRect = reactHitSlopView.getHitSlopRect();
                return f11 >= ((float) (-hitSlopRect.left)) && f11 < ((float) (view.getWidth() + hitSlopRect.right)) && f12 >= ((float) (-hitSlopRect.top)) && f12 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f11 >= 0.0f && f11 < ((float) view.getWidth()) && f12 >= 0.0f && f12 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isTouchPointInViewWithOverflowInset(float f11, float f12, View view) {
        if (!(view instanceof ReactOverflowViewWithInset)) {
            return false;
        }
        Rect overflowInset = ((ReactOverflowViewWithInset) view).getOverflowInset();
        return f11 >= ((float) overflowInset.left) && f11 < ((float) (view.getWidth() - overflowInset.right)) && f12 >= ((float) overflowInset.top) && f12 < ((float) (view.getHeight() - overflowInset.bottom));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceType"})
    public static List<ViewTarget> findTargetPathAndCoordinatesForTouch(float f11, float f12, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        fArr[0] = f11;
        fArr[1] = f12;
        List<ViewTarget> arrayList = new ArrayList<>();
        View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, viewGroup, arrayList);
        if (viewFindTouchTargetViewWithPointerEvents != null) {
            int i11 = 0;
            while (viewFindTouchTargetViewWithPointerEvents != null && viewFindTouchTargetViewWithPointerEvents.getId() <= 0) {
                viewFindTouchTargetViewWithPointerEvents = (View) viewFindTouchTargetViewWithPointerEvents.getParent();
                i11++;
            }
            if (i11 > 0 && i11 <= arrayList.size()) {
                arrayList = arrayList.subList(i11, arrayList.size());
            }
            int touchTargetForView = getTouchTargetForView(viewFindTouchTargetViewWithPointerEvents, fArr[0], fArr[1]);
            if (touchTargetForView != viewFindTouchTargetViewWithPointerEvents.getId()) {
                arrayList.add(0, new ViewTarget(touchTargetForView, null));
            }
        }
        return arrayList;
    }

    public static int findTargetTagAndCoordinatesForTouch(float f11, float f12, ViewGroup viewGroup, float[] fArr, @Nullable int[] iArr) {
        View viewFindClosestReactAncestor;
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        fArr[0] = f11;
        fArr[1] = f12;
        View viewFindTouchTargetViewWithPointerEvents = findTouchTargetViewWithPointerEvents(fArr, viewGroup, null);
        if (viewFindTouchTargetViewWithPointerEvents != null && (viewFindClosestReactAncestor = findClosestReactAncestor(viewFindTouchTargetViewWithPointerEvents)) != null) {
            if (iArr != null) {
                iArr[0] = viewFindClosestReactAncestor.getId();
            }
            return getTouchTargetForView(viewFindClosestReactAncestor, fArr[0], fArr[1]);
        }
        return id2;
    }

    private static void getChildPoint(float f11, float f12, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f11 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f12 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f13 = fArr[0];
            scrollY = fArr[1];
            scrollX = f13;
        }
        pointF.set(scrollX, scrollY);
    }
}
