package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "homeIndicatorHidden":
                ((RNSScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "gestureEnabled":
                ((RNSScreenManagerInterface) this.mViewManager).setGestureEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "hideKeyboardOnSwipe":
                ((RNSScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetCornerRadius":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t11, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case "navigationBarHidden":
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarTranslucent":
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "stackPresentation":
                ((RNSScreenManagerInterface) this.mViewManager).setStackPresentation(t11, (String) obj);
                break;
            case "activityState":
                ((RNSScreenManagerInterface) this.mViewManager).setActivityState(t11, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case "statusBarColor":
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "statusBarStyle":
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarStyle(t11, obj != null ? (String) obj : null);
                break;
            case "fullScreenSwipeShadowEnabled":
                ((RNSScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "stackAnimation":
                ((RNSScreenManagerInterface) this.mViewManager).setStackAnimation(t11, (String) obj);
                break;
            case "navigationBarColor":
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "sheetInitialDetent":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "sheetAllowedDetents":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t11, (ReadableArray) obj);
                break;
            case "replaceAnimation":
                ((RNSScreenManagerInterface) this.mViewManager).setReplaceAnimation(t11, (String) obj);
                break;
            case "preventNativeDismiss":
                ((RNSScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarHidden":
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "fullScreenSwipeEnabled":
                ((RNSScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "gestureResponseDistance":
                ((RNSScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t11, (ReadableMap) obj);
                break;
            case "screenOrientation":
                ((RNSScreenManagerInterface) this.mViewManager).setScreenOrientation(t11, obj != null ? (String) obj : null);
                break;
            case "sheetLargestUndimmedDetent":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t11, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case "transitionDuration":
                ((RNSScreenManagerInterface) this.mViewManager).setTransitionDuration(t11, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case "swipeDirection":
                ((RNSScreenManagerInterface) this.mViewManager).setSwipeDirection(t11, (String) obj);
                break;
            case "customAnimationOnSwipe":
                ((RNSScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetElevation":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetElevation(t11, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case "sheetGrabberVisible":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarAnimation":
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t11, obj != null ? (String) obj : null);
                break;
            case "nativeBackButtonDismissalEnabled":
                ((RNSScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetExpandsWhenScrolledToEdge":
                ((RNSScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
