package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSModalScreenManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSModalScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSModalScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "homeIndicatorHidden":
                ((RNSModalScreenManagerInterface) this.mViewManager).setHomeIndicatorHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "gestureEnabled":
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "hideKeyboardOnSwipe":
                ((RNSModalScreenManagerInterface) this.mViewManager).setHideKeyboardOnSwipe(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetCornerRadius":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetCornerRadius(t11, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case "navigationBarHidden":
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarTranslucent":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "stackPresentation":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackPresentation(t11, (String) obj);
                break;
            case "activityState":
                ((RNSModalScreenManagerInterface) this.mViewManager).setActivityState(t11, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case "statusBarColor":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "statusBarStyle":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarStyle(t11, obj != null ? (String) obj : null);
                break;
            case "fullScreenSwipeShadowEnabled":
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeShadowEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "stackAnimation":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStackAnimation(t11, (String) obj);
                break;
            case "navigationBarColor":
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "sheetInitialDetent":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetInitialDetent(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "sheetAllowedDetents":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t11, (ReadableArray) obj);
                break;
            case "replaceAnimation":
                ((RNSModalScreenManagerInterface) this.mViewManager).setReplaceAnimation(t11, (String) obj);
                break;
            case "preventNativeDismiss":
                ((RNSModalScreenManagerInterface) this.mViewManager).setPreventNativeDismiss(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarHidden":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarHidden(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "fullScreenSwipeEnabled":
                ((RNSModalScreenManagerInterface) this.mViewManager).setFullScreenSwipeEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "gestureResponseDistance":
                ((RNSModalScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t11, (ReadableMap) obj);
                break;
            case "screenOrientation":
                ((RNSModalScreenManagerInterface) this.mViewManager).setScreenOrientation(t11, obj != null ? (String) obj : null);
                break;
            case "sheetLargestUndimmedDetent":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t11, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case "transitionDuration":
                ((RNSModalScreenManagerInterface) this.mViewManager).setTransitionDuration(t11, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case "swipeDirection":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSwipeDirection(t11, (String) obj);
                break;
            case "customAnimationOnSwipe":
                ((RNSModalScreenManagerInterface) this.mViewManager).setCustomAnimationOnSwipe(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((RNSModalScreenManagerInterface) this.mViewManager).setNavigationBarTranslucent(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetElevation":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetElevation(t11, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case "sheetGrabberVisible":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetGrabberVisible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarAnimation":
                ((RNSModalScreenManagerInterface) this.mViewManager).setStatusBarAnimation(t11, obj != null ? (String) obj : null);
                break;
            case "nativeBackButtonDismissalEnabled":
                ((RNSModalScreenManagerInterface) this.mViewManager).setNativeBackButtonDismissalEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "sheetExpandsWhenScrolledToEdge":
                ((RNSModalScreenManagerInterface) this.mViewManager).setSheetExpandsWhenScrolledToEdge(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSModalScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
