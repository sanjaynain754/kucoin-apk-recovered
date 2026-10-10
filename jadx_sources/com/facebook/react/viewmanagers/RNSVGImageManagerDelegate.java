package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGImageManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGImageManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
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
            case -729118945:
                if (str.equals("fillRule")) {
                    b11 = 8;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b11 = 9;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b11 = 10;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b11 = 11;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b11 = 12;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b11 = 13;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b11 = 14;
                }
                break;
            case 114148:
                if (str.equals(TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY)) {
                    b11 = 15;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b11 = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b11 = 17;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b11 = 18;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b11 = 19;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
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
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b11 = 25;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b11 = 26;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b11 = 27;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b11 = 28;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b11 = 29;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b11 = 30;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b11 = 31;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
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
                ((RNSVGImageManagerInterface) this.mViewManager).setFilter(t11, obj != null ? (String) obj : null);
                break;
            case 1:
                this.mViewManager.setOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((RNSVGImageManagerInterface) this.mViewManager).setHeight(t11, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGImageManagerInterface) this.mViewManager).setMatrix(t11, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGImageManagerInterface) this.mViewManager).setPropList(t11, (ReadableArray) obj);
                break;
            case 5:
                ((RNSVGImageManagerInterface) this.mViewManager).setMarkerEnd(t11, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGImageManagerInterface) this.mViewManager).setMarkerMid(t11, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGImageManagerInterface) this.mViewManager).setStroke(t11, new DynamicFromObject(obj));
                break;
            case 8:
                ((RNSVGImageManagerInterface) this.mViewManager).setFillRule(t11, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 9:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 10:
                ((RNSVGImageManagerInterface) this.mViewManager).setPointerEvents(t11, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSVGImageManagerInterface) this.mViewManager).setFillOpacity(t11, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeDashoffset(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 13:
                ((RNSVGImageManagerInterface) this.mViewManager).setX(t11, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGImageManagerInterface) this.mViewManager).setY(t11, new DynamicFromObject(obj));
                break;
            case 15:
                ((RNSVGImageManagerInterface) this.mViewManager).setSrc(t11, (ReadableMap) obj);
                break;
            case 16:
                ((RNSVGImageManagerInterface) this.mViewManager).setFill(t11, new DynamicFromObject(obj));
                break;
            case 17:
                ((RNSVGImageManagerInterface) this.mViewManager).setMask(t11, obj != null ? (String) obj : null);
                break;
            case 18:
                ((RNSVGImageManagerInterface) this.mViewManager).setName(t11, obj != null ? (String) obj : null);
                break;
            case 19:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeMiterlimit(t11, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((RNSVGImageManagerInterface) this.mViewManager).setAlign(t11, obj != null ? (String) obj : null);
                break;
            case 21:
                ((RNSVGImageManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 22:
                ((RNSVGImageManagerInterface) this.mViewManager).setVectorEffect(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 23:
                ((RNSVGImageManagerInterface) this.mViewManager).setWidth(t11, new DynamicFromObject(obj));
                break;
            case 24:
                ((RNSVGImageManagerInterface) this.mViewManager).setMarkerStart(t11, obj != null ? (String) obj : null);
                break;
            case 25:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeDasharray(t11, new DynamicFromObject(obj));
                break;
            case 26:
                ((RNSVGImageManagerInterface) this.mViewManager).setClipPath(t11, obj != null ? (String) obj : null);
                break;
            case 27:
                ((RNSVGImageManagerInterface) this.mViewManager).setClipRule(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 28:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeLinecap(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((RNSVGImageManagerInterface) this.mViewManager).setDisplay(t11, obj != null ? (String) obj : null);
                break;
            case 30:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeLinejoin(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 31:
                ((RNSVGImageManagerInterface) this.mViewManager).setResponsible(t11, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 32:
                ((RNSVGImageManagerInterface) this.mViewManager).setMeetOrSlice(t11, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeWidth(t11, new DynamicFromObject(obj));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGImageManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }
}
