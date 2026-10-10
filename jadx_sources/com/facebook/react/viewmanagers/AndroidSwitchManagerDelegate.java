package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidSwitchManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class AndroidSwitchManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidSwitchManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "thumbColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setThumbColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "enabled":
                ((AndroidSwitchManagerInterface) this.mViewManager).setEnabled(t11, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "on":
                ((AndroidSwitchManagerInterface) this.mViewManager).setOn(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((AndroidSwitchManagerInterface) this.mViewManager).setValue(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((AndroidSwitchManagerInterface) this.mViewManager).setDisabled(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackColorForFalse(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "thumbTintColor":
                ((AndroidSwitchManagerInterface) this.mViewManager).setThumbTintColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "trackColorForTrue":
                ((AndroidSwitchManagerInterface) this.mViewManager).setTrackColorForTrue(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidSwitchManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        if (!str.equals("setNativeValue")) {
            return;
        }
        ((AndroidSwitchManagerInterface) this.mViewManager).setNativeValue(t11, readableArray.getBoolean(0));
    }
}
