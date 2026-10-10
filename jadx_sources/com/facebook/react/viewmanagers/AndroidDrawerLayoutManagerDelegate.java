package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;

/* JADX INFO: loaded from: classes45.dex */
public class AndroidDrawerLayoutManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidDrawerLayoutManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidDrawerLayoutManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        if (!str.equals(ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER)) {
            if (!str.equals(ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER)) {
                return;
            }
            ((AndroidDrawerLayoutManagerInterface) this.mViewManager).openDrawer(t11);
            return;
        }
        ((AndroidDrawerLayoutManagerInterface) this.mViewManager).closeDrawer(t11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        Float fValueOf;
        str.getClass();
        switch (str) {
            case "statusBarBackgroundColor":
                ((AndroidDrawerLayoutManagerInterface) this.mViewManager).setStatusBarBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "drawerBackgroundColor":
                ((AndroidDrawerLayoutManagerInterface) this.mViewManager).setDrawerBackgroundColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "keyboardDismissMode":
                ((AndroidDrawerLayoutManagerInterface) this.mViewManager).setKeyboardDismissMode(t11, (String) obj);
                break;
            case "drawerWidth":
                AndroidDrawerLayoutManagerInterface androidDrawerLayoutManagerInterface = (AndroidDrawerLayoutManagerInterface) this.mViewManager;
                if (obj == null) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(((Double) obj).floatValue());
                }
                androidDrawerLayoutManagerInterface.setDrawerWidth(t11, fValueOf);
                break;
            case "drawerPosition":
                ((AndroidDrawerLayoutManagerInterface) this.mViewManager).setDrawerPosition(t11, (String) obj);
                break;
            case "drawerLockMode":
                ((AndroidDrawerLayoutManagerInterface) this.mViewManager).setDrawerLockMode(t11, (String) obj);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
