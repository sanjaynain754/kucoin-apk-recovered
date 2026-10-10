package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNCViewPagerManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNCViewPagerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCViewPagerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "layoutDirection":
                ((RNCViewPagerManagerInterface) this.mViewManager).setLayoutDirection(t11, (String) obj);
                break;
            case "offscreenPageLimit":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOffscreenPageLimit(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "orientation":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOrientation(t11, (String) obj);
                break;
            case "overScrollMode":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOverScrollMode(t11, (String) obj);
                break;
            case "scrollEnabled":
                ((RNCViewPagerManagerInterface) this.mViewManager).setScrollEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "keyboardDismissMode":
                ((RNCViewPagerManagerInterface) this.mViewManager).setKeyboardDismissMode(t11, (String) obj);
                break;
            case "overdrag":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOverdrag(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "pageMargin":
                ((RNCViewPagerManagerInterface) this.mViewManager).setPageMargin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "initialPage":
                ((RNCViewPagerManagerInterface) this.mViewManager).setInitialPage(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNCViewPagerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "setPageWithoutAnimation":
                ((RNCViewPagerManagerInterface) this.mViewManager).setPageWithoutAnimation(t11, readableArray.getInt(0));
                break;
            case "setScrollEnabledImperatively":
                ((RNCViewPagerManagerInterface) this.mViewManager).setScrollEnabledImperatively(t11, readableArray.getBoolean(0));
                break;
            case "setPage":
                ((RNCViewPagerManagerInterface) this.mViewManager).setPage(t11, readableArray.getInt(0));
                break;
        }
    }
}
