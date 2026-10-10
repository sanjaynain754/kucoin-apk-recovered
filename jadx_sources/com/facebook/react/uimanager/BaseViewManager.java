package com.facebook.react.uimanager;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.facebook.react.C5771R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.OutlineStyle;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];

    public static class LayerEffectsHelper {
        public static void apply(@NonNull View view, @Nullable ReadableArray readableArray, @Nullable Boolean bool) {
            Paint paint;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (FilterHelper.isOnlyColorMatrixFilters(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(FilterHelper.parseColorMatrixFilters(readableArray));
            } else {
                if (i11 >= 31) {
                    view.setRenderEffect(FilterHelper.parseFilters(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }

        private LayerEffectsHelper() {
        }
    }

    public BaseViewManager() {
        super(null);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17 - i15;
        int i21 = i13 - i11;
        if (i14 - i12 == i18 - i16 && i21 == i19) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(C5771R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(C5771R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public T prepareToRecycleView(@NonNull ThemedReactContext themedReactContext, T t11) {
        t11.setTag(null);
        t11.setTag(C5771R.id.pointer_events, null);
        t11.setTag(C5771R.id.react_test_id, null);
        t11.setTag(C5771R.id.view_tag_native_id, null);
        t11.setTag(C5771R.id.labelled_by, null);
        t11.setTag(C5771R.id.accessibility_label, null);
        t11.setTag(C5771R.id.accessibility_hint, null);
        t11.setTag(C5771R.id.accessibility_role, null);
        t11.setTag(C5771R.id.accessibility_state, null);
        t11.setTag(C5771R.id.accessibility_actions, null);
        t11.setTag(C5771R.id.accessibility_value, null);
        t11.setTag(C5771R.id.accessibility_state_expanded, null);
        setTransformProperty(t11, null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            return null;
        }
        t11.resetPivot();
        t11.setTop(0);
        t11.setBottom(0);
        t11.setLeft(0);
        t11.setRight(0);
        t11.setElevation(0.0f);
        if (i11 >= 29) {
            t11.setAnimationMatrix(null);
        }
        t11.setTag(C5771R.id.transform, null);
        t11.setTag(C5771R.id.transform_origin, null);
        t11.setTag(C5771R.id.invalidate_transform, null);
        t11.removeOnLayoutChangeListener(this);
        t11.setTag(C5771R.id.use_hardware_layer, null);
        t11.setTag(C5771R.id.filter, null);
        t11.setTag(C5771R.id.mix_blend_mode, null);
        LayerEffectsHelper.apply(t11, null, null);
        if (i11 >= 28) {
            t11.setOutlineAmbientShadowColor(ViewCompat.MEASURED_STATE_MASK);
            t11.setOutlineSpotShadowColor(ViewCompat.MEASURED_STATE_MASK);
        }
        t11.setNextFocusDownId(-1);
        t11.setNextFocusForwardId(-1);
        t11.setNextFocusRightId(-1);
        t11.setNextFocusUpId(-1);
        t11.setFocusable(false);
        t11.setFocusableInTouchMode(false);
        t11.setElevation(0.0f);
        t11.setAlpha(1.0f);
        setPadding(t11, 0, 0, 0, 0);
        t11.setForeground(null);
        return t11;
    }

    public void setTransformProperty(@NonNull T t11, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2) {
        if (readableArray == null) {
            t11.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            t11.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            t11.setRotation(0.0f);
            t11.setRotationX(0.0f);
            t11.setRotationY(0.0f);
            t11.setScaleX(1.0f);
            t11.setScaleY(1.0f);
            t11.setCameraDistance(0.0f);
            return;
        }
        boolean z11 = ViewUtil.getUIManagerType(t11) == 2;
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, PixelUtil.toDIPFromPixel(t11.getWidth()), PixelUtil.toDIPFromPixel(t11.getHeight()), readableArray2, z11);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        t11.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        t11.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        t11.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        t11.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        t11.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        t11.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        t11.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f11 = (float) dArr2[2];
            if (f11 == 0.0f) {
                f11 = 7.8125E-4f;
            }
            float f12 = (-1.0f) / f11;
            float f13 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            t11.setCameraDistance(sanitizeFloatPropertyValue(f13 * f13 * f12 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    public BaseViewManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void setPointerEventsFlag(@NonNull View view, PointerEventHelper.EVENT event, boolean z11) {
        int i11 = C5771R.id.pointer_events;
        Integer num = (Integer) view.getTag(i11);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << event.ordinal();
        view.setTag(i11, Integer.valueOf(z11 ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(@NonNull T t11) {
        Dynamic dynamic;
        String str = (String) t11.getTag(C5771R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t11.getTag(C5771R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t11.getTag(C5771R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t11.getContext().getString(C5771R.string.state_mixed_description));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t11.getContext().getString(C5771R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.size() > 0) {
            t11.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ACTIONS)
    public void setAccessibilityActions(T t11, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t11.setTag(C5771R.id.accessibility_actions, readableArray);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION)
    public void setAccessibilityCollection(@NonNull T t11, @Nullable ReadableMap readableMap) {
        t11.setTag(C5771R.id.accessibility_collection, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_COLLECTION_ITEM)
    public void setAccessibilityCollectionItem(@NonNull T t11, @Nullable ReadableMap readableMap) {
        t11.setTag(C5771R.id.accessibility_collection_item, readableMap);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_HINT)
    public void setAccessibilityHint(@NonNull T t11, @Nullable String str) {
        t11.setTag(C5771R.id.accessibility_hint, str);
        updateViewContentDescription(t11);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(@NonNull T t11, @Nullable String str) {
        t11.setTag(C5771R.id.accessibility_label, str);
        updateViewContentDescription(t11);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(@NonNull T t11, @Nullable String str) {
        if (str == null || str.equals("none")) {
            ViewCompat.setAccessibilityLiveRegion(t11, 0);
        } else if (str.equals("polite")) {
            ViewCompat.setAccessibilityLiveRegion(t11, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.setAccessibilityLiveRegion(t11, 2);
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(@NonNull T t11, @Nullable String str) {
        if (str == null) {
            t11.setTag(C5771R.id.accessibility_role, null);
        } else {
            t11.setTag(C5771R.id.accessibility_role, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
        }
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_VALUE)
    public void setAccessibilityValue(T t11, ReadableMap readableMap) {
        if (readableMap == null) {
            t11.setTag(C5771R.id.accessibility_value, null);
            t11.setContentDescription(null);
        } else {
            t11.setTag(C5771R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t11);
            }
        }
    }

    public void setBorderBottomLeftRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @ReactProp(name = "onClick")
    public void setClick(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.CLICK, z11);
    }

    @ReactProp(name = "onClickCapture")
    public void setClickCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.CLICK_CAPTURE, z11);
    }

    @ReactProp(name = ViewProps.IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(@NonNull T t11, @Nullable String str) {
        if (str == null || str.equals("auto")) {
            ViewCompat.setImportantForAccessibility(t11, 0);
            return;
        }
        if (str.equals("yes")) {
            ViewCompat.setImportantForAccessibility(t11, 1);
        } else if (str.equals("no")) {
            ViewCompat.setImportantForAccessibility(t11, 2);
        } else if (str.equals("no-hide-descendants")) {
            ViewCompat.setImportantForAccessibility(t11, 4);
        }
    }

    @ReactProp(name = ViewProps.NATIVE_ID)
    public void setNativeId(@NonNull T t11, @Nullable String str) {
        t11.setTag(C5771R.id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t11);
    }

    @ReactProp(name = ViewProps.OUTLINE_STYLE)
    public void setOutlineStyle(T t11, @Nullable String str) {
        BackgroundStyleApplicator.setOutlineStyle(t11, str == null ? null : OutlineStyle.fromString(str));
    }

    @ReactProp(name = "onPointerEnter")
    public void setPointerEnter(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.ENTER, z11);
    }

    @ReactProp(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.ENTER_CAPTURE, z11);
    }

    @ReactProp(name = "onPointerLeave")
    public void setPointerLeave(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.LEAVE, z11);
    }

    @ReactProp(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.LEAVE_CAPTURE, z11);
    }

    @ReactProp(name = "onPointerMove")
    public void setPointerMove(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.MOVE, z11);
    }

    @ReactProp(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.MOVE_CAPTURE, z11);
    }

    @ReactProp(name = "onPointerOut")
    public void setPointerOut(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.OUT, z11);
    }

    @ReactProp(name = "onPointerOutCapture")
    public void setPointerOutCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.OUT_CAPTURE, z11);
    }

    @ReactProp(name = "onPointerOver")
    public void setPointerOver(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.OVER, z11);
    }

    @ReactProp(name = "onPointerOverCapture")
    public void setPointerOverCapture(@NonNull T t11, boolean z11) {
        setPointerEventsFlag(t11, PointerEventHelper.EVENT.OVER_CAPTURE, z11);
    }

    @ReactProp(name = ViewProps.RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(@NonNull T t11, boolean z11) {
        t11.setTag(C5771R.id.use_hardware_layer, Boolean.valueOf(z11));
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(@NonNull T t11, @Nullable String str) {
        if (str == null) {
            t11.setTag(C5771R.id.role, null);
        } else {
            t11.setTag(C5771R.id.role, ReactAccessibilityDelegate.Role.fromValue(str));
        }
    }

    @ReactProp(customType = "Color", defaultInt = ViewCompat.MEASURED_STATE_MASK, name = ViewProps.SHADOW_COLOR)
    public void setShadowColor(@NonNull T t11, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            t11.setOutlineAmbientShadowColor(i11);
            t11.setOutlineSpotShadowColor(i11);
        }
    }

    @ReactProp(name = ViewProps.TEST_ID)
    public void setTestId(@NonNull T t11, @Nullable String str) {
        t11.setTag(C5771R.id.react_test_id, str);
        t11.setTag(str);
    }

    @ReactProp(name = ViewProps.TRANSFORM)
    public void setTransform(@NonNull T t11, @Nullable ReadableArray readableArray) {
        int i11 = C5771R.id.transform;
        if (Objects.equals((ReadableArray) t11.getTag(i11), readableArray)) {
            return;
        }
        t11.setTag(i11, readableArray);
        t11.setTag(C5771R.id.invalidate_transform, Boolean.TRUE);
    }

    @ReactProp(name = ViewProps.TRANSFORM_ORIGIN)
    public void setTransformOrigin(@NonNull T t11, @Nullable ReadableArray readableArray) {
        int i11 = C5771R.id.transform_origin;
        if (Objects.equals((ReadableArray) t11.getTag(i11), readableArray)) {
            return;
        }
        t11.setTag(i11, readableArray);
        t11.setTag(C5771R.id.invalidate_transform, Boolean.TRUE);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_STATE)
    public void setViewState(@NonNull T t11, @Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t11.setTag(C5771R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t11.isSelected();
            boolean z11 = readableMap.getBoolean("selected");
            t11.setSelected(z11);
            if (t11.isAccessibilityFocused() && zIsSelected && !z11) {
                t11.announceForAccessibility(t11.getContext().getString(C5771R.string.state_unselected_description));
            }
        } else {
            t11.setSelected(false);
        }
        t11.setTag(C5771R.id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t11.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t11);
                return;
            } else if (t11.isAccessibilityFocused()) {
                t11.sendAccessibilityEvent(1);
            }
        }
    }

    private void logUnsupportedPropertyWarning(String str) {
        C45999a.m101490K(ReactConstants.TAG, "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f11) {
        if (f11 >= -3.4028235E38f && f11 <= Float.MAX_VALUE) {
            return f11;
        }
        if (f11 < -3.4028235E38f || f11 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f11 > Float.MAX_VALUE || f11 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f11)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f11);
    }

    private void updateViewAccessibility(@NonNull T t11) {
        ReactAccessibilityDelegate.setDelegate(t11, t11.isFocusable(), t11.getImportantForAccessibility());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        MapBuilder.Builder builderPut = MapBuilder.builder().put(PointerEventHelper.POINTER_CANCEL, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).put(PointerEventHelper.POINTER_DOWN, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onPointerDown", "captured", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        exportedCustomDirectEventTypeConstants.putAll(builderPut.put(PointerEventHelper.POINTER_ENTER, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10224of("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool))).put(PointerEventHelper.POINTER_LEAVE, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10224of("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool))).put(PointerEventHelper.POINTER_MOVE, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).put(PointerEventHelper.POINTER_UP, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).put(PointerEventHelper.POINTER_OUT, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).put(PointerEventHelper.POINTER_OVER, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).put(PointerEventHelper.CLICK, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onClick", "captured", "onClickCapture"))).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT, MapBuilder.m10222of("registrationName", "onAccessibilityAction")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull T t11) {
        super.onAfterUpdateTransaction(t11);
        updateViewAccessibility(t11);
        int i11 = C5771R.id.invalidate_transform;
        Boolean bool = (Boolean) t11.getTag(i11);
        if (bool != null && bool.booleanValue()) {
            t11.addOnLayoutChangeListener(this);
            setTransformProperty(t11, (ReadableArray) t11.getTag(C5771R.id.transform), (ReadableArray) t11.getTag(C5771R.id.transform_origin));
            t11.setTag(i11, Boolean.FALSE);
        }
        LayerEffectsHelper.apply(t11, (ReadableArray) t11.getTag(C5771R.id.filter), (Boolean) t11.getTag(C5771R.id.use_hardware_layer));
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_LABELLED_BY)
    public void setAccessibilityLabelledBy(@NonNull T t11, @Nullable Dynamic dynamic) {
        if (!dynamic.isNull()) {
            if (dynamic.getType() == ReadableType.String) {
                t11.setTag(C5771R.id.labelled_by, dynamic.asString());
            } else if (dynamic.getType() == ReadableType.Array) {
                t11.setTag(C5771R.id.labelled_by, dynamic.asArray().getString(0));
            }
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(@NonNull T t11, @ColorInt int i11) {
        BackgroundStyleApplicator.setBackgroundColor(t11, Integer.valueOf(i11));
    }

    @ReactProp(customType = "BoxShadow", name = ViewProps.BOX_SHADOW)
    public void setBoxShadow(T t11, @Nullable ReadableArray readableArray) {
        BackgroundStyleApplicator.setBoxShadow(t11, readableArray);
    }

    @ReactProp(name = "elevation")
    public void setElevation(@NonNull T t11, float f11) {
        ViewCompat.setElevation(t11, PixelUtil.toPixelFromDIP(f11));
    }

    @ReactProp(customType = "Filter", name = "filter")
    public void setFilter(@NonNull T t11, @Nullable ReadableArray readableArray) {
        if (ViewUtil.getUIManagerType(t11) == 2) {
            t11.setTag(C5771R.id.filter, readableArray);
        }
    }

    @ReactProp(name = ViewProps.MIX_BLEND_MODE)
    public void setMixBlendMode(@NonNull T t11, @Nullable String str) {
        if (ViewUtil.getUIManagerType(t11) == 2) {
            t11.setTag(C5771R.id.mix_blend_mode, BlendModeHelper.parseMixBlendMode(str));
            if (t11.getParent() instanceof View) {
                ((View) t11.getParent()).invalidate();
            }
        }
    }

    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(@NonNull T t11, float f11) {
        t11.setAlpha(f11);
    }

    @ReactProp(customType = "Color", name = ViewProps.OUTLINE_COLOR)
    public void setOutlineColor(T t11, @Nullable Integer num) {
        BackgroundStyleApplicator.setOutlineColor(t11, num);
    }

    @ReactProp(name = ViewProps.OUTLINE_OFFSET)
    public void setOutlineOffset(T t11, float f11) {
        BackgroundStyleApplicator.setOutlineOffset(t11, f11);
    }

    @ReactProp(name = ViewProps.OUTLINE_WIDTH)
    public void setOutlineWidth(T t11, float f11) {
        BackgroundStyleApplicator.setOutlineWidth(t11, f11);
    }

    @ReactProp(name = "rotation")
    @Deprecated
    public void setRotation(@NonNull T t11, float f11) {
        t11.setRotation(f11);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(@NonNull T t11, float f11) {
        t11.setScaleX(f11);
    }

    @ReactProp(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(@NonNull T t11, float f11) {
        t11.setScaleY(f11);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_X)
    @Deprecated
    public void setTranslateX(@NonNull T t11, float f11) {
        t11.setTranslationX(PixelUtil.toPixelFromDIP(f11));
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.TRANSLATE_Y)
    @Deprecated
    public void setTranslateY(@NonNull T t11, float f11) {
        t11.setTranslationY(PixelUtil.toPixelFromDIP(f11));
    }

    @ReactProp(name = ViewProps.Z_INDEX)
    public void setZIndex(@NonNull T t11, float f11) {
        ViewGroupManager.setViewZIndex(t11, Math.round(f11));
        ViewParent parent = t11.getParent();
        if (parent instanceof ReactZIndexedViewGroup) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }

    @ReactProp(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderEnd")
    public void setResponderEnd(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderGrant")
    public void setResponderGrant(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderMove")
    public void setResponderMove(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderReject")
    public void setResponderReject(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderRelease")
    public void setResponderRelease(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderStart")
    public void setResponderStart(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderTerminate")
    public void setResponderTerminate(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onTouchCancel")
    public void setTouchCancel(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onTouchEnd")
    public void setTouchEnd(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onTouchMove")
    public void setTouchMove(@NonNull T t11, boolean z11) {
    }

    @ReactProp(name = "onTouchStart")
    public void setTouchStart(@NonNull T t11, boolean z11) {
    }
}
