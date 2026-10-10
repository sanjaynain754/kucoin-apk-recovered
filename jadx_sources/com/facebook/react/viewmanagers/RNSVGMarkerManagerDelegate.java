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
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGMarkerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGMarkerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
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
            case -1081239615:
                if (str.equals("matrix")) {
                    b11 = 3;
                }
                break;
            case -1008621499:
                if (str.equals("orient")) {
                    b11 = 4;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b11 = 5;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b11 = 6;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b11 = 7;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b11 = 8;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b11 = 9;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b11 = 10;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b11 = 11;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b11 = 12;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b11 = 13;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b11 = 14;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b11 = 15;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b11 = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = 17;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b11 = 18;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b11 = 19;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 20;
                }
                break;
            case 3496485:
                if (str.equals("refX")) {
                    b11 = 21;
                }
                break;
            case 3496486:
                if (str.equals("refY")) {
                    b11 = 22;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b11 = 23;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b11 = 24;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b11 = 25;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b11 = 26;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b11 = 27;
                }
                break;
            case 218785621:
                if (str.equals("markerUnits")) {
                    b11 = 28;
                }
                break;
            case 220478892:
                if (str.equals("markerWidth")) {
                    b11 = 29;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b11 = 30;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    b11 = 31;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
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
            case 1671764162:
                if (str.equals("display")) {
                    b11 = BuiltinOptions.LogSoftmaxOptions;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b11 = BuiltinOptions.CastOptions;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = BuiltinOptions.DequantizeOptions;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b11 = BuiltinOptions.MaximumMinimumOptions;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b11 = BuiltinOptions.ArgMaxOptions;
                }
                break;
            case 2106883585:
                if (str.equals("markerHeight")) {
                    b11 = BuiltinOptions.LessOptions;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setVbHeight(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 1:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case 2:
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setOrient(t11, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case 6:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFontWeight(t11, new DynamicFromObject(obj));
                break;
            case 10:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 11:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 13:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 15:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFont(t11, new DynamicFromObject(obj));
                break;
            case 17:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 18:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMinX(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 19:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMinY(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setRefX(t11, new DynamicFromObject(obj));
                break;
            case 22:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setRefY(t11, new DynamicFromObject(obj));
                break;
            case 23:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 24:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setAlign(t11, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 26:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 28:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerUnits(t11, obj != null ? (String) obj : null);
                break;
            case 29:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerWidth(t11, new DynamicFromObject(obj));
                break;
            case 30:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setVbWidth(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 31:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFontSize(t11, new DynamicFromObject(obj));
                break;
            case 32:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case 33:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 34:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 36:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 37:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 38:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 39:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMeetOrSlice(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 40:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            case 41:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerHeight(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGMarkerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
