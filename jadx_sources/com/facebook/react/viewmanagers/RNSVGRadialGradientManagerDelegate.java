package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGRadialGradientManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGRadialGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGRadialGradientManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        float fFloatValue;
        str.getClass();
        int iIntValue = 0;
        boolean zBooleanValue = false;
        int iIntValue2 = 0;
        String str2 = null;
        switch (str) {
            case "gradientUnits":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                rNSVGRadialGradientManagerInterface.setGradientUnits(t11, iIntValue);
                break;
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
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface2 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface2.setMarkerEnd(t11, str2);
                break;
            case "markerMid":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface3 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface3.setMarkerMid(t11, str2);
                break;
            case "pointerEvents":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface4 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface4.setPointerEvents(t11, str2);
                break;
            case "cx":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCx(t11, new DynamicFromObject(obj));
                break;
            case "cy":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCy(t11, new DynamicFromObject(obj));
                break;
            case "fx":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFx(t11, new DynamicFromObject(obj));
                break;
            case "fy":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFy(t11, new DynamicFromObject(obj));
                break;
            case "rx":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRx(t11, new DynamicFromObject(obj));
                break;
            case "ry":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRy(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface5 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface5.setMask(t11, str2);
                break;
            case "name":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface6 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface6.setName(t11, str2);
                break;
            case "gradient":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setGradient(t11, (ReadableArray) obj);
                break;
            case "markerStart":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface7 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface7.setMarkerStart(t11, str2);
                break;
            case "clipPath":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface8 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface8.setClipPath(t11, str2);
                break;
            case "clipRule":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface9 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue2 = ((Double) obj).intValue();
                }
                rNSVGRadialGradientManagerInterface9.setClipRule(t11, iIntValue2);
                break;
            case "display":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface10 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface10.setDisplay(t11, str2);
                break;
            case "gradientTransform":
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setGradientTransform(t11, (ReadableArray) obj);
                break;
            case "responsible":
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface11 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNSVGRadialGradientManagerInterface11.setResponsible(t11, zBooleanValue);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
