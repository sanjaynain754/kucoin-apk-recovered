package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGGroupManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGGroupManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "filter":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((RNSVGGroupManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "propList":
                ((RNSVGGroupManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((RNSVGGroupManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((RNSVGGroupManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFontWeight(t11, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((RNSVGGroupManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case "font":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFont(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                ((RNSVGGroupManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case "name":
                ((RNSVGGroupManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((RNSVGGroupManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "vectorEffect":
                ((RNSVGGroupManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((RNSVGGroupManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((RNSVGGroupManagerInterface) this.mViewManager).setFontSize(t11, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((RNSVGGroupManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((RNSVGGroupManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((RNSVGGroupManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((RNSVGGroupManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGGroupManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
