package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGEllipseManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGEllipseManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "filter":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "propList":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "cx":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setCx(t11, new DynamicFromObject(obj));
                break;
            case "cy":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setCy(t11, new DynamicFromObject(obj));
                break;
            case "rx":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setRx(t11, new DynamicFromObject(obj));
                break;
            case "ry":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setRy(t11, new DynamicFromObject(obj));
                break;
            case "fill":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case "name":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "vectorEffect":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case "strokeDasharray":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGEllipseManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
