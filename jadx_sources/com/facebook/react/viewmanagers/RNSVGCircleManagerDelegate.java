package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGCircleManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGCircleManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "filter":
                ((RNSVGCircleManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((RNSVGCircleManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "propList":
                ((RNSVGCircleManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((RNSVGCircleManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((RNSVGCircleManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((RNSVGCircleManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((RNSVGCircleManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((RNSVGCircleManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "r":
                ((RNSVGCircleManagerInterface) this.mViewManager).setR(t11, new DynamicFromObject(obj));
                break;
            case "cx":
                ((RNSVGCircleManagerInterface) this.mViewManager).setCx(t11, new DynamicFromObject(obj));
                break;
            case "cy":
                ((RNSVGCircleManagerInterface) this.mViewManager).setCy(t11, new DynamicFromObject(obj));
                break;
            case "fill":
                ((RNSVGCircleManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                ((RNSVGCircleManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case "name":
                ((RNSVGCircleManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((RNSVGCircleManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "vectorEffect":
                ((RNSVGCircleManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((RNSVGCircleManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((RNSVGCircleManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((RNSVGCircleManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((RNSVGCircleManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((RNSVGCircleManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGCircleManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
