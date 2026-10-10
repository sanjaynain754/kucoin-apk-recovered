package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.AndroidBlurViewManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class AndroidBlurViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & AndroidBlurViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidBlurViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        int iIntValue;
        str.getClass();
        boolean zBooleanValue = false;
        int iIntValue2 = 0;
        boolean zBooleanValue2 = false;
        int iIntValue3 = 0;
        switch (str) {
            case "blurAmount":
                AndroidBlurViewManagerInterface androidBlurViewManagerInterface = (AndroidBlurViewManagerInterface) this.mViewManager;
                if (obj == null) {
                    iIntValue = 10;
                } else {
                    iIntValue = ((Double) obj).intValue();
                }
                androidBlurViewManagerInterface.setBlurAmount(t11, iIntValue);
                break;
            case "enabled":
                AndroidBlurViewManagerInterface androidBlurViewManagerInterface2 = (AndroidBlurViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                androidBlurViewManagerInterface2.setEnabled(t11, zBooleanValue);
                break;
            case "blurRadius":
                AndroidBlurViewManagerInterface androidBlurViewManagerInterface3 = (AndroidBlurViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue3 = ((Double) obj).intValue();
                }
                androidBlurViewManagerInterface3.setBlurRadius(t11, iIntValue3);
                break;
            case "blurType":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setBlurType(t11, (String) obj);
                break;
            case "autoUpdate":
                AndroidBlurViewManagerInterface androidBlurViewManagerInterface4 = (AndroidBlurViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                }
                androidBlurViewManagerInterface4.setAutoUpdate(t11, zBooleanValue2);
                break;
            case "overlayColor":
                ((AndroidBlurViewManagerInterface) this.mViewManager).setOverlayColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "downsampleFactor":
                AndroidBlurViewManagerInterface androidBlurViewManagerInterface5 = (AndroidBlurViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue2 = ((Double) obj).intValue();
                }
                androidBlurViewManagerInterface5.setDownsampleFactor(t11, iIntValue2);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
