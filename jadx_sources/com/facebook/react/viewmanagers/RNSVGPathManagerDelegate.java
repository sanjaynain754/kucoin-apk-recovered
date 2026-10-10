package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGPathManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGPathManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "filter":
                ((RNSVGPathManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((RNSVGPathManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "propList":
                ((RNSVGPathManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((RNSVGPathManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((RNSVGPathManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((RNSVGPathManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((RNSVGPathManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((RNSVGPathManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((RNSVGPathManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "d":
                ((RNSVGPathManagerInterface) this.mViewManager).setD(t11, obj != null ? (String) obj : null);
                break;
            case "fill":
                ((RNSVGPathManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                ((RNSVGPathManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case "name":
                ((RNSVGPathManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((RNSVGPathManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "vectorEffect":
                ((RNSVGPathManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((RNSVGPathManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((RNSVGPathManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((RNSVGPathManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((RNSVGPathManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((RNSVGPathManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGPathManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
