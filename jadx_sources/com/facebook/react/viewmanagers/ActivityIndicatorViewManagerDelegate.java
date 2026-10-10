package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.ActivityIndicatorViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class ActivityIndicatorViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & ActivityIndicatorViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ActivityIndicatorViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        boolean zBooleanValue = true;
        switch (str) {
            case "size":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setSize(t11, (String) obj);
                break;
            case "color":
                ((ActivityIndicatorViewManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "hidesWhenStopped":
                ActivityIndicatorViewManagerInterface activityIndicatorViewManagerInterface = (ActivityIndicatorViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                activityIndicatorViewManagerInterface.setHidesWhenStopped(t11, zBooleanValue);
                break;
            case "animating":
                ActivityIndicatorViewManagerInterface activityIndicatorViewManagerInterface2 = (ActivityIndicatorViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                activityIndicatorViewManagerInterface2.setAnimating(t11, zBooleanValue);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
