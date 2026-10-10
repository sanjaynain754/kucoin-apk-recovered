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
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGTextManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGTextManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1603134955:
                if (str.equals("lengthAdjust")) {
                    b11 = 0;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b11 = 1;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b11 = 2;
                }
                break;
            case -1171891896:
                if (str.equals("alignmentBaseline")) {
                    b11 = 3;
                }
                break;
            case -1139902161:
                if (str.equals("verticalAlign")) {
                    b11 = 4;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b11 = 5;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b11 = 6;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b11 = 7;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b11 = 8;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    b11 = 9;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b11 = 10;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b11 = 11;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b11 = 12;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b11 = 13;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b11 = 14;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b11 = 15;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b11 = 16;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b11 = 17;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b11 = 18;
                }
                break;
            case 3220:
                if (str.equals("dx")) {
                    b11 = 19;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    b11 = 20;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b11 = 21;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b11 = 22;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = 23;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 24;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b11 = 25;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 26;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b11 = 27;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b11 = 28;
                }
                break;
            case 275888445:
                if (str.equals("baselineShift")) {
                    b11 = 29;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    b11 = 30;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b11 = 31;
                }
                break;
            case 778043962:
                if (str.equals("inlineSize")) {
                    b11 = 32;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b11 = BuiltinOptions.ExpOptions;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b11 = BuiltinOptions.TopKV2Options;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b11 = BuiltinOptions.SplitOptions;
                }
                break;
            case 1637488243:
                if (str.equals("textLength")) {
                    b11 = BuiltinOptions.LogSoftmaxOptions;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b11 = BuiltinOptions.CastOptions;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b11 = BuiltinOptions.DequantizeOptions;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = BuiltinOptions.MaximumMinimumOptions;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b11 = BuiltinOptions.ArgMaxOptions;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((RNSVGTextManagerInterface) this.mViewManager).setLengthAdjust(t11, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNSVGTextManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case 2:
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGTextManagerInterface) this.mViewManager).setAlignmentBaseline(t11, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNSVGTextManagerInterface) this.mViewManager).setVerticalAlign(t11, new DynamicFromObject(obj));
                break;
            case 5:
                ((RNSVGTextManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 6:
                ((RNSVGTextManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case 7:
                ((RNSVGTextManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSVGTextManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSVGTextManagerInterface) this.mViewManager).setRotate(t11, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGTextManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case 11:
                ((RNSVGTextManagerInterface) this.mViewManager).setFontWeight(t11, new DynamicFromObject(obj));
                break;
            case 12:
                ((RNSVGTextManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 13:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((RNSVGTextManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNSVGTextManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 16:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 17:
                ((RNSVGTextManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case 18:
                ((RNSVGTextManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGTextManagerInterface) this.mViewManager).setDx(t11, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGTextManagerInterface) this.mViewManager).setDy(t11, new DynamicFromObject(obj));
                break;
            case 21:
                ((RNSVGTextManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGTextManagerInterface) this.mViewManager).setFont(t11, new DynamicFromObject(obj));
                break;
            case 23:
                ((RNSVGTextManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 24:
                ((RNSVGTextManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 26:
                ((RNSVGTextManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 27:
                ((RNSVGTextManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((RNSVGTextManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGTextManagerInterface) this.mViewManager).setBaselineShift(t11, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNSVGTextManagerInterface) this.mViewManager).setFontSize(t11, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGTextManagerInterface) this.mViewManager).setInlineSize(t11, new DynamicFromObject(obj));
                break;
            case 33:
                ((RNSVGTextManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 34:
                ((RNSVGTextManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 36:
                ((RNSVGTextManagerInterface) this.mViewManager).setTextLength(t11, new DynamicFromObject(obj));
                break;
            case 37:
                ((RNSVGTextManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 38:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 39:
                ((RNSVGTextManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 40:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGTextManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
