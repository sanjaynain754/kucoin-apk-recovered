package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;

/* JADX INFO: loaded from: classes45.dex */
class ReactScrollViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    private final String TAG = ReactScrollViewAccessibilityDelegate.class.getSimpleName();

    private void onInitializeAccessibilityEventInternal(View view, AccessibilityEvent accessibilityEvent) {
        boolean zIsPartiallyScrolledInView;
        View childAt;
        ReadableMap readableMap;
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C5771R.id.accessibility_collection);
        if (readableMap2 == null) {
            return;
        }
        accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
        if (!(view instanceof ViewGroup)) {
            return;
        }
        View childAt2 = ((ViewGroup) view).getChildAt(0);
        if (!(childAt2 instanceof ViewGroup)) {
            return;
        }
        Integer numValueOf = null;
        int i11 = 0;
        Integer numValueOf2 = null;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) childAt2;
            if (i11 >= viewGroup.getChildCount()) {
                return;
            }
            View childAt3 = viewGroup.getChildAt(i11);
            if (view instanceof ReactScrollView) {
                zIsPartiallyScrolledInView = ((ReactScrollView) view).isPartiallyScrolledInView(childAt3);
            } else if (!(view instanceof ReactHorizontalScrollView)) {
                return;
            } else {
                zIsPartiallyScrolledInView = ((ReactHorizontalScrollView) view).isPartiallyScrolledInView(childAt3);
            }
            int i12 = C5771R.id.accessibility_collection_item;
            ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(i12);
            if (!(childAt3 instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt3;
            if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(i12)) != null) {
                readableMap3 = readableMap;
            }
            if (zIsPartiallyScrolledInView && readableMap3 != null) {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(readableMap3.getInt("itemIndex"));
                }
                numValueOf2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
            }
            if (numValueOf != null && numValueOf2 != null) {
                accessibilityEvent.setFromIndex(numValueOf.intValue());
                accessibilityEvent.setToIndex(numValueOf2.intValue());
            }
            i11++;
        }
    }

    private void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ReactAccessibilityDelegate.AccessibilityRole accessibilityRoleFromViewTag = ReactAccessibilityDelegate.AccessibilityRole.fromViewTag(view);
        if (accessibilityRoleFromViewTag != null) {
            ReactAccessibilityDelegate.setRole(accessibilityNodeInfoCompat, accessibilityRoleFromViewTag, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C5771R.id.accessibility_collection);
        if (readableMap != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof ReactScrollView) {
            accessibilityNodeInfoCompat.setScrollable(((ReactScrollView) view).getScrollEnabled());
        } else if (view instanceof ReactHorizontalScrollView) {
            accessibilityNodeInfoCompat.setScrollable(((ReactHorizontalScrollView) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof ReactScrollView) && !(view instanceof ReactHorizontalScrollView)) {
            ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
            return;
        }
        onInitializeAccessibilityEventInternal(view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!(view instanceof ReactScrollView) && !(view instanceof ReactHorizontalScrollView)) {
            ReactSoftExceptionLogger.logSoftException(this.TAG, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
            return;
        }
        onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfoCompat);
    }
}
