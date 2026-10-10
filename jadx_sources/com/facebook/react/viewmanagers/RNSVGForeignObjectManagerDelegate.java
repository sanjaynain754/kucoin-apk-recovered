package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGForeignObjectManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGForeignObjectManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1274492040:
                if (str.equals("filter")) {
                    b11 = 0;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b11 = 1;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b11 = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b11 = 3;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b11 = 4;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b11 = 5;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b11 = 6;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b11 = 7;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b11 = 8;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b11 = 9;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b11 = 10;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b11 = 11;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b11 = 12;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b11 = 13;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b11 = 14;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b11 = 15;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b11 = 16;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b11 = 17;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = 18;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 19;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b11 = 20;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 21;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b11 = 22;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b11 = 23;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b11 = 24;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    b11 = 25;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b11 = 26;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b11 = 27;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b11 = 28;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b11 = 29;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b11 = 30;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b11 = 31;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = 32;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b11 = BuiltinOptions.ExpOptions;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case 1:
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case 5:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case 8:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontWeight(t11, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 10:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 11:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 13:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 14:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case 17:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFont(t11, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 20:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 21:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 22:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 23:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            case 24:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontSize(t11, new DynamicFromObject(obj));
                break;
            case 26:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case 27:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 28:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 31:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 32:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 33:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGForeignObjectManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
