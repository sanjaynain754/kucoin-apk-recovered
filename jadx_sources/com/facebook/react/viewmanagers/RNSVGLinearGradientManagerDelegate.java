package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGLinearGradientManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGLinearGradientManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGLinearGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGLinearGradientManagerDelegate(BaseViewManager baseViewManager) {
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
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                rNSVGLinearGradientManagerInterface.setGradientUnits(t11, iIntValue);
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
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface2 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface2.setMarkerEnd(t11, str2);
                break;
            case "markerMid":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface3 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface3.setMarkerMid(t11, str2);
                break;
            case "pointerEvents":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface4 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface4.setPointerEvents(t11, str2);
                break;
            case "x1":
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setX1(t11, new DynamicFromObject(obj));
                break;
            case "x2":
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setX2(t11, new DynamicFromObject(obj));
                break;
            case "y1":
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setY1(t11, new DynamicFromObject(obj));
                break;
            case "y2":
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setY2(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface5 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface5.setMask(t11, str2);
                break;
            case "name":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface6 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface6.setName(t11, str2);
                break;
            case "gradient":
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setGradient(t11, (ReadableArray) obj);
                break;
            case "markerStart":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface7 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface7.setMarkerStart(t11, str2);
                break;
            case "clipPath":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface8 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface8.setClipPath(t11, str2);
                break;
            case "clipRule":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface9 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue2 = ((Double) obj).intValue();
                }
                rNSVGLinearGradientManagerInterface9.setClipRule(t11, iIntValue2);
                break;
            case "display":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface10 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLinearGradientManagerInterface10.setDisplay(t11, str2);
                break;
            case "gradientTransform":
                ((RNSVGLinearGradientManagerInterface) this.mViewManager).setGradientTransform(t11, (ReadableArray) obj);
                break;
            case "responsible":
                RNSVGLinearGradientManagerInterface rNSVGLinearGradientManagerInterface11 = (RNSVGLinearGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNSVGLinearGradientManagerInterface11.setResponsible(t11, zBooleanValue);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
