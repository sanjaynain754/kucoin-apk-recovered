package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes45.dex */
public class RNSVGSvgViewAndroidManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGSvgViewAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGSvgViewAndroidManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        str.getClass();
        float fFloatValue = 0.0f;
        String str2 = null;
        boolean zBooleanValue = false;
        int iIntValue = 0;
        int iIntValue2 = 0;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        boolean zBooleanValue4 = false;
        int iIntValue5 = 0;
        int iIntValue6 = 0;
        boolean zBooleanValue5 = false;
        byte b11 = -1;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    b11 = 0;
                }
                break;
            case -1989576717:
                if (str.equals(ViewProps.BORDER_RIGHT_COLOR)) {
                    b11 = 1;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    b11 = 2;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b11 = 3;
                }
                break;
            case -1470826662:
                if (str.equals(ViewProps.BORDER_TOP_COLOR)) {
                    b11 = 4;
                }
                break;
            case -1308858324:
                if (str.equals(ViewProps.BORDER_BOTTOM_COLOR)) {
                    b11 = 5;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b11 = 6;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    b11 = 7;
                }
                break;
            case -1122140597:
                if (str.equals(ViewProps.BORDER_TOP_START_RADIUS)) {
                    b11 = 8;
                }
                break;
            case -867333731:
                if (str.equals(ViewProps.BORDER_BOTTOM_START_RADIUS)) {
                    b11 = 9;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    b11 = 10;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    b11 = 11;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    b11 = 12;
                }
                break;
            case -483490364:
                if (str.equals(ViewProps.BORDER_TOP_END_RADIUS)) {
                    b11 = 13;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    b11 = 14;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b11 = 15;
                }
                break;
            case -252105751:
                if (str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
                    b11 = 16;
                }
                break;
            case -242276144:
                if (str.equals(ViewProps.BORDER_LEFT_COLOR)) {
                    b11 = 17;
                }
                break;
            case -223134121:
                if (str.equals(ViewProps.BORDER_START_END_RADIUS)) {
                    b11 = 18;
                }
                break;
            case -148030058:
                if (str.equals(ViewProps.BORDER_BOTTOM_END_RADIUS)) {
                    b11 = 19;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    b11 = 20;
                }
                break;
            case -27894242:
                if (str.equals(ViewProps.BORDER_START_START_RADIUS)) {
                    b11 = 21;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b11 = 22;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
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
            case 240482938:
                if (str.equals("vbWidth")) {
                    b11 = 26;
                }
                break;
            case 306963138:
                if (str.equals(ViewProps.BORDER_BLOCK_START_COLOR)) {
                    b11 = 27;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b11 = 28;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    b11 = 29;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b11 = 30;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b11 = 31;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    b11 = 32;
                }
                break;
            case 684610594:
                if (str.equals(ViewProps.BORDER_BLOCK_COLOR)) {
                    b11 = BuiltinOptions.ExpOptions;
                }
                break;
            case 722830999:
                if (str.equals(ViewProps.BORDER_COLOR)) {
                    b11 = BuiltinOptions.TopKV2Options;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b11 = BuiltinOptions.SplitOptions;
                }
                break;
            case 762983977:
                if (str.equals(ViewProps.BORDER_BLOCK_END_COLOR)) {
                    b11 = BuiltinOptions.LogSoftmaxOptions;
                }
                break;
            case 910681861:
                if (str.equals(ViewProps.BORDER_END_START_RADIUS)) {
                    b11 = BuiltinOptions.CastOptions;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    b11 = BuiltinOptions.DequantizeOptions;
                }
                break;
            case 1220735892:
                if (str.equals(ViewProps.BORDER_END_COLOR)) {
                    b11 = BuiltinOptions.MaximumMinimumOptions;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b11 = BuiltinOptions.ArgMaxOptions;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    b11 = BuiltinOptions.LessOptions;
                }
                break;
            case 1667773924:
                if (str.equals(ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)) {
                    b11 = BuiltinOptions.NegOptions;
                }
                break;
            case 1735382270:
                if (str.equals(ViewProps.BORDER_END_END_RADIUS)) {
                    b11 = BuiltinOptions.PadV2Options;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    b11 = BuiltinOptions.GreaterOptions;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b11 = BuiltinOptions.GreaterEqualOptions;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    b11 = BuiltinOptions.LessEqualOptions;
                }
                break;
            case 2119889261:
                if (str.equals(ViewProps.BORDER_START_COLOR)) {
                    b11 = BuiltinOptions.SelectOptions;
                }
                break;
        }
        switch (b11) {
            case 0:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbHeight(t11, new DynamicFromObject(obj));
                break;
            case 1:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRightColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 2:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface.setBackfaceVisibility(t11, str2);
                break;
            case 3:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface2 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface2.setVbHeight(t11, fFloatValue);
                break;
            case 4:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 5:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 6:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopLeftRadius(t11, new DynamicFromObject(obj));
                break;
            case 7:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface3 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface3.setAccessible(t11, zBooleanValue);
                break;
            case 8:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 9:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 10:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface4 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue5 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface4.setHasTVPreferredFocus(t11, zBooleanValue5);
                break;
            case 11:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface5 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue6 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface5.setNextFocusDown(t11, iIntValue6);
                break;
            case 12:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface6 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue5 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface6.setNextFocusLeft(t11, iIntValue5);
                break;
            case 13:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 14:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbWidth(t11, new DynamicFromObject(obj));
                break;
            case 15:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface7 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface7.setPointerEvents(t11, str2);
                break;
            case 16:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface8 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue4 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface8.setRemoveClippedSubviews(t11, zBooleanValue4);
                break;
            case 17:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderLeftColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 18:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 19:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 20:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeForegroundAndroid(t11, (ReadableMap) obj);
                break;
            case 21:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 22:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface9 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface9.setMinX(t11, fFloatValue);
                break;
            case 23:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface10 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface10.setMinY(t11, fFloatValue);
                break;
            case 24:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface11 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface11.setAlign(t11, str2);
                break;
            case 25:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 26:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface12 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    fFloatValue = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface12.setVbWidth(t11, fFloatValue);
                break;
            case 27:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockStartColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 28:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopRightRadius(t11, new DynamicFromObject(obj));
                break;
            case 29:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface13 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue4 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface13.setNextFocusForward(t11, iIntValue4);
                break;
            case 30:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomLeftRadius(t11, new DynamicFromObject(obj));
                break;
            case 31:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomRightRadius(t11, new DynamicFromObject(obj));
                break;
            case 32:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface14 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue3 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface14.setNextFocusUp(t11, iIntValue3);
                break;
            case 33:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 34:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 35:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface15 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface15.setBorderStyle(t11, str2);
                break;
            case 36:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBlockEndColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 37:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndStartRadius(t11, new DynamicFromObject(obj));
                break;
            case 38:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setHitSlop(t11, new DynamicFromObject(obj));
                break;
            case 39:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            case 40:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRadius(t11, new DynamicFromObject(obj));
                break;
            case 41:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface16 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface16.setFocusable(t11, zBooleanValue3);
                break;
            case 42:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface17 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface17.setNeedsOffscreenAlphaCompositing(t11, zBooleanValue2);
                break;
            case 43:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndEndRadius(t11, new DynamicFromObject(obj));
                break;
            case 44:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeBackgroundAndroid(t11, (ReadableMap) obj);
                break;
            case 45:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface18 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue2 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface18.setMeetOrSlice(t11, iIntValue2);
                break;
            case 46:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface19 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface19.setNextFocusRight(t11, iIntValue);
                break;
            case 47:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartColor(t11, ColorPropConverter.getColor(obj, t11.getContext()));
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
