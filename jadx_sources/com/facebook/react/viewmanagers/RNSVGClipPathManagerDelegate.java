package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSVGClipPathManagerInterface;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGClipPathManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGClipPathManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        switch (str) {
            case "filter":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case "opacity":
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "matrix":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case "propList":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case "markerEnd":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case "markerMid":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case "stroke":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case "fontWeight":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFontWeight(t11, new DynamicFromObject(obj));
                break;
            case "fillRule":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case "strokeOpacity":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "pointerEvents":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case "fillOpacity":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "strokeDashoffset":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "fill":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case "font":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFont(t11, new DynamicFromObject(obj));
                break;
            case "mask":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case "name":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case "strokeMiterlimit":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "color":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case "vectorEffect":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "markerStart":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case "fontSize":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setFontSize(t11, new DynamicFromObject(obj));
                break;
            case "strokeDasharray":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case "clipPath":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case "clipRule":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "strokeLinecap":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "display":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case "strokeLinejoin":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "responsible":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "strokeWidth":
                ((RNSVGClipPathManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGClipPathManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
