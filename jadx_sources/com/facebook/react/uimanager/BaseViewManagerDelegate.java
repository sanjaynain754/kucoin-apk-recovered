package com.facebook.react.uimanager;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseViewManagerDelegate.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0016\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0012J)\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0007\u001a\u00028\u00018\u0004X\u0085\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/react/uimanager/BaseViewManagerDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/View;", "U", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "mViewManager", "<init>", "(Lcom/facebook/react/uimanager/BaseViewManager;)V", "Lcom/facebook/react/uimanager/BaseViewManager;", "setProperty", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "propName", "", "value", "", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V", "receiveCommand", "commandName", "args", "Lcom/facebook/react/bridge/ReadableArray;", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class BaseViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode>> implements ViewManagerDelegate<T> {

    @JvmField
    @NotNull
    protected final U mViewManager;

    public BaseViewManagerDelegate(@NotNull U mViewManager) {
        Intrinsics.checkNotNullParameter(mViewManager, "mViewManager");
        this.mViewManager = mViewManager;
    }

    @Override // com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(@NotNull T view, @Nullable String commandName, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(@NotNull T view, @Nullable String propName, @Nullable Object value) {
        Integer color;
        Integer color2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (propName != null) {
            float fDoubleValue = 1.0f;
            float fDoubleValue2 = 0.0f;
            float fDoubleValue3 = Float.NaN;
            boolean zBooleanValue = false;
            switch (propName.hashCode()) {
                case -2018402664:
                    if (propName.equals(ViewProps.MIX_BLEND_MODE)) {
                        this.mViewManager.setMixBlendMode(view, (String) value);
                        break;
                    }
                    break;
                case -1898517556:
                    if (propName.equals("onPointerEnterCapture")) {
                        U u11 = this.mViewManager;
                        Boolean bool = (Boolean) value;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        u11.setPointerEnterCapture(view, zBooleanValue);
                        break;
                    }
                    break;
                case -1721943862:
                    if (propName.equals(ViewProps.TRANSLATE_X)) {
                        U u12 = this.mViewManager;
                        Double d11 = (Double) value;
                        if (d11 != null) {
                            fDoubleValue2 = (float) d11.doubleValue();
                        }
                        u12.setTranslateX(view, fDoubleValue2);
                        break;
                    }
                    break;
                case -1721943861:
                    if (propName.equals(ViewProps.TRANSLATE_Y)) {
                        U u13 = this.mViewManager;
                        Double d12 = (Double) value;
                        if (d12 != null) {
                            fDoubleValue2 = (float) d12.doubleValue();
                        }
                        u13.setTranslateY(view, fDoubleValue2);
                        break;
                    }
                    break;
                case -1589741021:
                    if (propName.equals(ViewProps.SHADOW_COLOR)) {
                        U u14 = this.mViewManager;
                        if (value == null) {
                            color = 0;
                        } else {
                            color = ColorPropConverter.getColor(value, view.getContext());
                        }
                        Intrinsics.checkNotNull(color);
                        u14.setShadowColor(view, color.intValue());
                        break;
                    }
                    break;
                case -1489432511:
                    if (propName.equals(ViewProps.OUTLINE_COLOR)) {
                        this.mViewManager.setOutlineColor(view, (Integer) value);
                        break;
                    }
                    break;
                case -1474494833:
                    if (propName.equals(ViewProps.OUTLINE_STYLE)) {
                        this.mViewManager.setOutlineStyle(view, (String) value);
                        break;
                    }
                    break;
                case -1471148380:
                    if (propName.equals(ViewProps.OUTLINE_WIDTH)) {
                        U u15 = this.mViewManager;
                        Double d13 = (Double) value;
                        if (d13 != null) {
                            fDoubleValue3 = (float) d13.doubleValue();
                        }
                        u15.setOutlineWidth(view, fDoubleValue3);
                        break;
                    }
                    break;
                case -1351902487:
                    if (propName.equals("onClick")) {
                        U u16 = this.mViewManager;
                        Boolean bool2 = (Boolean) value;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        }
                        u16.setClick(view, zBooleanValue);
                        break;
                    }
                    break;
                case -1274492040:
                    if (propName.equals("filter")) {
                        this.mViewManager.setFilter(view, (ReadableArray) value);
                        break;
                    }
                    break;
                case -1267206133:
                    if (propName.equals(ViewProps.OPACITY)) {
                        U u17 = this.mViewManager;
                        Double d14 = (Double) value;
                        if (d14 != null) {
                            fDoubleValue = (float) d14.doubleValue();
                        }
                        u17.setOpacity(view, fDoubleValue);
                        break;
                    }
                    break;
                case -1247970794:
                    if (propName.equals("onPointerOutCapture")) {
                        U u18 = this.mViewManager;
                        Boolean bool3 = (Boolean) value;
                        if (bool3 != null) {
                            zBooleanValue = bool3.booleanValue();
                        }
                        u18.setPointerOutCapture(view, zBooleanValue);
                        break;
                    }
                    break;
                case -1228066334:
                    if (propName.equals("borderTopLeftRadius")) {
                        U u19 = this.mViewManager;
                        Double d15 = (Double) value;
                        if (d15 != null) {
                            fDoubleValue3 = (float) d15.doubleValue();
                        }
                        u19.setBorderTopLeftRadius(view, fDoubleValue3);
                        break;
                    }
                    break;
                case -1219666915:
                    if (propName.equals("onClickCapture")) {
                        U u21 = this.mViewManager;
                        Boolean bool4 = (Boolean) value;
                        if (bool4 != null) {
                            zBooleanValue = bool4.booleanValue();
                        }
                        u21.setClickCapture(view, zBooleanValue);
                        break;
                    }
                    break;
                case -1036769289:
                    if (propName.equals("onPointerMoveCapture")) {
                        U u22 = this.mViewManager;
                        Boolean bool5 = (Boolean) value;
                        if (bool5 != null) {
                            zBooleanValue = bool5.booleanValue();
                        }
                        u22.setPointerMoveCapture(view, zBooleanValue);
                        break;
                    }
                    break;
                case -908189618:
                    if (propName.equals("scaleX")) {
                        U u23 = this.mViewManager;
                        Double d16 = (Double) value;
                        if (d16 != null) {
                            fDoubleValue = (float) d16.doubleValue();
                        }
                        u23.setScaleX(view, fDoubleValue);
                        break;
                    }
                    break;
                case -908189617:
                    if (propName.equals("scaleY")) {
                        U u24 = this.mViewManager;
                        Double d17 = (Double) value;
                        if (d17 != null) {
                            fDoubleValue = (float) d17.doubleValue();
                        }
                        u24.setScaleY(view, fDoubleValue);
                        break;
                    }
                    break;
                case -877170387:
                    if (propName.equals(ViewProps.TEST_ID)) {
                        this.mViewManager.setTestId(view, (String) value);
                        break;
                    }
                    break;
                case -781597262:
                    if (propName.equals(ViewProps.TRANSFORM_ORIGIN)) {
                        this.mViewManager.setTransformOrigin(view, (ReadableArray) value);
                        break;
                    }
                    break;
                case -731417480:
                    if (propName.equals(ViewProps.Z_INDEX)) {
                        U u25 = this.mViewManager;
                        Double d18 = (Double) value;
                        if (d18 != null) {
                            fDoubleValue2 = (float) d18.doubleValue();
                        }
                        u25.setZIndex(view, fDoubleValue2);
                        break;
                    }
                    break;
                case -112141555:
                    if (propName.equals("onPointerLeaveCapture")) {
                        U u26 = this.mViewManager;
                        Boolean bool6 = (Boolean) value;
                        if (bool6 != null) {
                            zBooleanValue = bool6.booleanValue();
                        }
                        u26.setPointerLeaveCapture(view, zBooleanValue);
                        break;
                    }
                    break;
                case -101663499:
                    if (propName.equals(ViewProps.ACCESSIBILITY_HINT)) {
                        this.mViewManager.setAccessibilityHint(view, (String) value);
                        break;
                    }
                    break;
                case -101359900:
                    if (propName.equals(ViewProps.ACCESSIBILITY_ROLE)) {
                        this.mViewManager.setAccessibilityRole(view, (String) value);
                        break;
                    }
                    break;
                case -80891667:
                    if (propName.equals(ViewProps.RENDER_TO_HARDWARE_TEXTURE)) {
                        U u27 = this.mViewManager;
                        Boolean bool7 = (Boolean) value;
                        if (bool7 != null) {
                            zBooleanValue = bool7.booleanValue();
                        }
                        u27.setRenderToHardwareTexture(view, zBooleanValue);
                        break;
                    }
                    break;
                case -40300674:
                    if (propName.equals("rotation")) {
                        U u28 = this.mViewManager;
                        Double d19 = (Double) value;
                        if (d19 != null) {
                            fDoubleValue2 = (float) d19.doubleValue();
                        }
                        u28.setRotation(view, fDoubleValue2);
                        break;
                    }
                    break;
                case -4379043:
                    if (propName.equals("elevation")) {
                        U u29 = this.mViewManager;
                        Double d21 = (Double) value;
                        if (d21 != null) {
                            fDoubleValue2 = (float) d21.doubleValue();
                        }
                        u29.setElevation(view, fDoubleValue2);
                        break;
                    }
                    break;
                case 3506294:
                    if (propName.equals(ViewProps.ROLE)) {
                        this.mViewManager.setRole(view, (String) value);
                        break;
                    }
                    break;
                case 17941018:
                    if (propName.equals("onPointerEnter")) {
                        U u31 = this.mViewManager;
                        Boolean bool8 = (Boolean) value;
                        if (bool8 != null) {
                            zBooleanValue = bool8.booleanValue();
                        }
                        u31.setPointerEnter(view, zBooleanValue);
                        break;
                    }
                    break;
                case 24119801:
                    if (propName.equals("onPointerLeave")) {
                        U u32 = this.mViewManager;
                        Boolean bool9 = (Boolean) value;
                        if (bool9 != null) {
                            zBooleanValue = bool9.booleanValue();
                        }
                        u32.setPointerLeave(view, zBooleanValue);
                        break;
                    }
                    break;
                case 36255470:
                    if (propName.equals(ViewProps.ACCESSIBILITY_LIVE_REGION)) {
                        this.mViewManager.setAccessibilityLiveRegion(view, (String) value);
                        break;
                    }
                    break;
                case 132353428:
                    if (propName.equals("onPointerOverCapture")) {
                        U u33 = this.mViewManager;
                        Boolean bool10 = (Boolean) value;
                        if (bool10 != null) {
                            zBooleanValue = bool10.booleanValue();
                        }
                        u33.setPointerOverCapture(view, zBooleanValue);
                        break;
                    }
                    break;
                case 317346576:
                    if (propName.equals("onPointerOut")) {
                        U u34 = this.mViewManager;
                        Boolean bool11 = (Boolean) value;
                        if (bool11 != null) {
                            zBooleanValue = bool11.booleanValue();
                        }
                        u34.setPointerOut(view, zBooleanValue);
                        break;
                    }
                    break;
                case 333432965:
                    if (propName.equals("borderTopRightRadius")) {
                        U u35 = this.mViewManager;
                        Double d22 = (Double) value;
                        if (d22 != null) {
                            fDoubleValue3 = (float) d22.doubleValue();
                        }
                        u35.setBorderTopRightRadius(view, fDoubleValue3);
                        break;
                    }
                    break;
                case 581268560:
                    if (propName.equals("borderBottomLeftRadius")) {
                        U u36 = this.mViewManager;
                        Double d23 = (Double) value;
                        if (d23 != null) {
                            fDoubleValue3 = (float) d23.doubleValue();
                        }
                        u36.setBorderBottomLeftRadius(view, fDoubleValue3);
                        break;
                    }
                    break;
                case 588239831:
                    if (propName.equals("borderBottomRightRadius")) {
                        U u37 = this.mViewManager;
                        Double d24 = (Double) value;
                        if (d24 != null) {
                            fDoubleValue3 = (float) d24.doubleValue();
                        }
                        u37.setBorderBottomRightRadius(view, fDoubleValue3);
                        break;
                    }
                    break;
                case 743055051:
                    if (propName.equals(ViewProps.BOX_SHADOW)) {
                        this.mViewManager.setBoxShadow(view, (ReadableArray) value);
                        break;
                    }
                    break;
                case 746986311:
                    if (propName.equals(ViewProps.IMPORTANT_FOR_ACCESSIBILITY)) {
                        this.mViewManager.setImportantForAccessibility(view, (String) value);
                        break;
                    }
                    break;
                case 1052666732:
                    if (propName.equals(ViewProps.TRANSFORM)) {
                        this.mViewManager.setTransform(view, (ReadableArray) value);
                        break;
                    }
                    break;
                case 1146842694:
                    if (propName.equals(ViewProps.ACCESSIBILITY_LABEL)) {
                        this.mViewManager.setAccessibilityLabel(view, (String) value);
                        break;
                    }
                    break;
                case 1153872867:
                    if (propName.equals(ViewProps.ACCESSIBILITY_STATE)) {
                        this.mViewManager.setViewState(view, (ReadableMap) value);
                        break;
                    }
                    break;
                case 1156088003:
                    if (propName.equals(ViewProps.ACCESSIBILITY_VALUE)) {
                        this.mViewManager.setAccessibilityValue(view, (ReadableMap) value);
                        break;
                    }
                    break;
                case 1247744079:
                    if (propName.equals("onPointerMove")) {
                        U u38 = this.mViewManager;
                        Boolean bool12 = (Boolean) value;
                        if (bool12 != null) {
                            zBooleanValue = bool12.booleanValue();
                        }
                        u38.setPointerMove(view, zBooleanValue);
                        break;
                    }
                    break;
                case 1247809874:
                    if (propName.equals("onPointerOver")) {
                        U u39 = this.mViewManager;
                        Boolean bool13 = (Boolean) value;
                        if (bool13 != null) {
                            zBooleanValue = bool13.booleanValue();
                        }
                        u39.setPointerOver(view, zBooleanValue);
                        break;
                    }
                    break;
                case 1287124693:
                    if (propName.equals("backgroundColor")) {
                        U u41 = this.mViewManager;
                        if (value == null) {
                            color2 = 0;
                        } else {
                            color2 = ColorPropConverter.getColor(value, view.getContext());
                        }
                        Intrinsics.checkNotNull(color2);
                        u41.setBackgroundColor(view, color2.intValue());
                        break;
                    }
                    break;
                case 1349188574:
                    if (propName.equals("borderRadius")) {
                        U u42 = this.mViewManager;
                        Double d25 = (Double) value;
                        if (d25 != null) {
                            fDoubleValue3 = (float) d25.doubleValue();
                        }
                        u42.setBorderRadius(view, fDoubleValue3);
                        break;
                    }
                    break;
                case 1407295349:
                    if (propName.equals(ViewProps.OUTLINE_OFFSET)) {
                        U u43 = this.mViewManager;
                        Double d26 = (Double) value;
                        if (d26 != null) {
                            fDoubleValue3 = (float) d26.doubleValue();
                        }
                        u43.setOutlineOffset(view, fDoubleValue3);
                        break;
                    }
                    break;
                case 1505602511:
                    if (propName.equals(ViewProps.ACCESSIBILITY_ACTIONS)) {
                        this.mViewManager.setAccessibilityActions(view, (ReadableArray) value);
                        break;
                    }
                    break;
                case 1761903244:
                    if (propName.equals(ViewProps.ACCESSIBILITY_COLLECTION)) {
                        this.mViewManager.setAccessibilityCollection(view, (ReadableMap) value);
                        break;
                    }
                    break;
                case 1865277756:
                    if (propName.equals(ViewProps.ACCESSIBILITY_LABELLED_BY)) {
                        this.mViewManager.setAccessibilityLabelledBy(view, new DynamicFromObject(value));
                        break;
                    }
                    break;
                case 1993034687:
                    if (propName.equals(ViewProps.ACCESSIBILITY_COLLECTION_ITEM)) {
                        this.mViewManager.setAccessibilityCollectionItem(view, (ReadableMap) value);
                        break;
                    }
                    break;
                case 2045685618:
                    if (propName.equals(ViewProps.NATIVE_ID)) {
                        this.mViewManager.setNativeId(view, (String) value);
                        break;
                    }
                    break;
            }
        }
    }
}
