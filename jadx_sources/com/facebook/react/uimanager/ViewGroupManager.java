package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, LayoutShadowNode> implements IViewGroupManager<T> {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public ViewGroupManager() {
        super(null);
    }

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t11, Object obj) {
    }

    public ViewGroupManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nullable
    public static Integer getViewZIndex(@Nullable View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i11) {
        mZIndexHash.put(view, Integer.valueOf(i11));
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(T t11, View view, int i11) {
        t11.addView(view, i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    @Nullable
    public View getChildAt(T t11, int i11) {
        return t11.getChildAt(i11);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(T t11) {
        return t11.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(T t11, int i11) {
        UiThreadUtil.assertOnUiThread();
        t11.removeViewAt(i11);
    }

    public void addViews(T t11, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            addView((ViewGroup) t11, list.get(i11), i11);
        }
    }

    public void removeView(T t11, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i11 = 0; i11 < getChildCount((ViewGroup) t11); i11++) {
            if (getChildAt((ViewGroup) t11, i11) == view) {
                removeViewAt((ViewGroup) t11, i11);
                return;
            }
        }
    }
}
