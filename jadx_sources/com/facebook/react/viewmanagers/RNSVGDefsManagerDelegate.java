package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGDefsManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGDefsManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGDefsManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        float fFloatValue;
        str.getClass();
        int iIntValue = 0;
        boolean zBooleanValue = false;
        String str2 = null;
        switch (str) {
            case "opacity":
                U u11 = this.mViewManager;
                if (obj == null) {
                    fFloatValue = 1.0f;
                } else {
                    fFloatValue = ((Double) obj).floatValue();
                }
                u11.setOpacity(t11, fFloatValue);
                break;
            case "matrix":
                ((RNSVGDefsManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface.setMarkerEnd(t11, str2);
                break;
            case "markerMid":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface2 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface2.setMarkerMid(t11, str2);
                break;
            case "pointerEvents":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface3 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface3.setPointerEvents(t11, str2);
                break;
            case "mask":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface4 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface4.setMask(t11, str2);
                break;
            case "name":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface5 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface5.setName(t11, str2);
                break;
            case "markerStart":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface6 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface6.setMarkerStart(t11, str2);
                break;
            case "clipPath":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface7 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface7.setClipPath(t11, str2);
                break;
            case "clipRule":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface8 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                rNSVGDefsManagerInterface8.setClipRule(t11, iIntValue);
                break;
            case "display":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface9 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface9.setDisplay(t11, str2);
                break;
            case "responsible":
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface10 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNSVGDefsManagerInterface10.setResponsible(t11, zBooleanValue);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
