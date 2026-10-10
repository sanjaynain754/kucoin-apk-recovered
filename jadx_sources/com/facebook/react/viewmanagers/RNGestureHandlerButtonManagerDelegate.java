package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNGestureHandlerButtonManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNGestureHandlerButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerButtonManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        String str2;
        float fFloatValue;
        str.getClass();
        boolean zBooleanValue = true;
        int iIntValue = 0;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        switch (str) {
            case "rippleRadius":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                rNGestureHandlerButtonManagerInterface.setRippleRadius(t11, iIntValue);
                break;
            case "enabled":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface2 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface2.setEnabled(t11, zBooleanValue);
                break;
            case "rippleColor":
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setRippleColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "borderColor":
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setBorderColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "borderStyle":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface3 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj == null) {
                    str2 = "solid";
                } else {
                    str2 = (String) obj;
                }
                rNGestureHandlerButtonManagerInterface3.setBorderStyle(t11, str2);
                break;
            case "borderWidth":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface4 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj == null) {
                    fFloatValue = 0.0f;
                } else {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNGestureHandlerButtonManagerInterface4.setBorderWidth(t11, fFloatValue);
                break;
            case "touchSoundDisabled":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface5 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue4 = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface5.setTouchSoundDisabled(t11, zBooleanValue4);
                break;
            case "exclusive":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface6 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface6.setExclusive(t11, zBooleanValue);
                break;
            case "borderless":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface7 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface7.setBorderless(t11, zBooleanValue3);
                break;
            case "foreground":
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface8 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface8.setForeground(t11, zBooleanValue2);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
