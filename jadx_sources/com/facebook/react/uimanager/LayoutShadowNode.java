package com.facebook.react.uimanager;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import p747x3.C45999a;
import p852kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes45.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    boolean mCollapsable;
    private final MutableYogaValue mTempYogaValue = new MutableYogaValue();

    public static class MutableYogaValue {
        YogaUnit unit;
        float value;

        private MutableYogaValue() {
        }

        private MutableYogaValue(MutableYogaValue mutableYogaValue) {
            this.value = mutableYogaValue.value;
            this.unit = mutableYogaValue.unit;
        }

        public void setFromDynamic(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.unit = YogaUnit.UNDEFINED;
                this.value = Float.NaN;
                return;
            }
            if (dynamic.getType() == ReadableType.String) {
                String strAsString = dynamic.asString();
                if (strAsString.equals("auto")) {
                    this.unit = YogaUnit.AUTO;
                    this.value = Float.NaN;
                    return;
                } else {
                    if (strAsString.endsWith("%")) {
                        this.unit = YogaUnit.PERCENT;
                        this.value = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                        return;
                    }
                    C45999a.m101488I(ReactConstants.TAG, "Unknown value: " + strAsString);
                    this.unit = YogaUnit.UNDEFINED;
                    this.value = Float.NaN;
                    return;
                }
            }
            if (dynamic.getType() == ReadableType.Number) {
                this.unit = YogaUnit.POINT;
                this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
            } else {
                this.unit = YogaUnit.UNDEFINED;
                this.value = Float.NaN;
            }
        }
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", ViewProps.TOP, ViewProps.BOTTOM})
    public void setPositionValues(int i11, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i11]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i12 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i12 == 1 || i12 == 2) {
            setPosition(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        } else if (i12 == 4) {
            setPositionPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.LayoutShadowNode$1 */
    public static /* synthetic */ class C60971 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[YogaUnit.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(boolean z11) {
        this.mCollapsable = z11;
    }

    private int maybeTransformLeftRightToStartEnd(int i11) {
        if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(getThemedContext())) {
            if (i11 != 0) {
                if (i11 == 2) {
                    return 5;
                }
            } else {
                return 4;
            }
        }
        return i11;
    }

    @ReactProp(name = ViewProps.ALIGN_CONTENT)
    public void setAlignContent(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignContent(YogaAlign.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignContent(YogaAlign.STRETCH);
                break;
            case "baseline":
                setAlignContent(YogaAlign.BASELINE);
                break;
            case "center":
                setAlignContent(YogaAlign.CENTER);
                break;
            case "flex-start":
                setAlignContent(YogaAlign.FLEX_START);
                break;
            case "auto":
                setAlignContent(YogaAlign.AUTO);
                break;
            case "space-between":
                setAlignContent(YogaAlign.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignContent(YogaAlign.FLEX_END);
                break;
            case "space-around":
                setAlignContent(YogaAlign.SPACE_AROUND);
                break;
            case "space-evenly":
                setAlignContent(YogaAlign.SPACE_EVENLY);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for alignContent: " + str);
                setAlignContent(YogaAlign.FLEX_START);
                break;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_ITEMS)
    public void setAlignItems(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignItems(YogaAlign.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignItems(YogaAlign.STRETCH);
                break;
            case "baseline":
                setAlignItems(YogaAlign.BASELINE);
                break;
            case "center":
                setAlignItems(YogaAlign.CENTER);
                break;
            case "flex-start":
                setAlignItems(YogaAlign.FLEX_START);
                break;
            case "auto":
                setAlignItems(YogaAlign.AUTO);
                break;
            case "space-between":
                setAlignItems(YogaAlign.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignItems(YogaAlign.FLEX_END);
                break;
            case "space-around":
                setAlignItems(YogaAlign.SPACE_AROUND);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for alignItems: " + str);
                setAlignItems(YogaAlign.STRETCH);
                break;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_SELF)
    public void setAlignSelf(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setAlignSelf(YogaAlign.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                setAlignSelf(YogaAlign.STRETCH);
                break;
            case "baseline":
                setAlignSelf(YogaAlign.BASELINE);
                break;
            case "center":
                setAlignSelf(YogaAlign.CENTER);
                break;
            case "flex-start":
                setAlignSelf(YogaAlign.FLEX_START);
                break;
            case "auto":
                setAlignSelf(YogaAlign.AUTO);
                break;
            case "space-between":
                setAlignSelf(YogaAlign.SPACE_BETWEEN);
                break;
            case "flex-end":
                setAlignSelf(YogaAlign.FLEX_END);
                break;
            case "space-around":
                setAlignSelf(YogaAlign.SPACE_AROUND);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for alignSelf: " + str);
                setAlignSelf(YogaAlign.AUTO);
                break;
        }
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.ASPECT_RATIO)
    public void setAspectRatio(float f11) {
        setStyleAspectRatio(f11);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
    public void setBorderWidths(int i11, float f11) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[i11]), PixelUtil.toPixelFromDIP(f11));
    }

    @ReactProp(name = ViewProps.COLUMN_GAP)
    public void setColumnGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                setColumnGapPercent(this.mTempYogaValue.value);
            }
        } else {
            setColumnGap(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "display")
    public void setDisplay(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(YogaDisplay.FLEX);
            return;
        }
        if (!str.equals(ViewProps.FLEX)) {
            if (!str.equals("none")) {
                C45999a.m101488I(ReactConstants.TAG, "invalid value for display: " + str);
                setDisplay(YogaDisplay.FLEX);
                return;
            }
            setDisplay(YogaDisplay.NONE);
            return;
        }
        setDisplay(YogaDisplay.FLEX);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX)
    public void setFlex(float f11) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f11);
    }

    @ReactProp(name = ViewProps.FLEX_BASIS)
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    setFlexBasisPercent(this.mTempYogaValue.value);
                }
            } else {
                setFlexBasisAuto();
            }
        } else {
            setFlexBasis(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.FLEX_DIRECTION)
    public void setFlexDirection(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexDirection(YogaFlexDirection.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                break;
            case "column":
                setFlexDirection(YogaFlexDirection.COLUMN);
                break;
            case "row":
                setFlexDirection(YogaFlexDirection.ROW);
                break;
            case "column-reverse":
                setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for flexDirection: " + str);
                setFlexDirection(YogaFlexDirection.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_GROW)
    public void setFlexGrow(float f11) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f11);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_SHRINK)
    public void setFlexShrink(float f11) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f11);
    }

    @ReactProp(name = ViewProps.FLEX_WRAP)
    public void setFlexWrap(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setFlexWrap(YogaWrap.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                setFlexWrap(YogaWrap.NO_WRAP);
                break;
            case "wrap-reverse":
                setFlexWrap(YogaWrap.WRAP_REVERSE);
                break;
            case "wrap":
                setFlexWrap(YogaWrap.WRAP);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for flexWrap: " + str);
                setFlexWrap(YogaWrap.NO_WRAP);
                break;
        }
    }

    @ReactProp(name = ViewProps.GAP)
    public void setGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                setGapPercent(this.mTempYogaValue.value);
            }
        } else {
            setGap(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    setStyleHeightPercent(this.mTempYogaValue.value);
                }
            } else {
                setStyleHeightAuto();
            }
        } else {
            setStyleHeight(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.JUSTIFY_CONTENT)
    public void setJustifyContent(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setJustifyContent(YogaJustify.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                setJustifyContent(YogaJustify.CENTER);
                break;
            case "flex-start":
                setJustifyContent(YogaJustify.FLEX_START);
                break;
            case "space-between":
                setJustifyContent(YogaJustify.SPACE_BETWEEN);
                break;
            case "flex-end":
                setJustifyContent(YogaJustify.FLEX_END);
                break;
            case "space-around":
                setJustifyContent(YogaJustify.SPACE_AROUND);
                break;
            case "space-evenly":
                setJustifyContent(YogaJustify.SPACE_EVENLY);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for justifyContent: " + str);
                setJustifyContent(YogaJustify.FLEX_START);
                break;
        }
    }

    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i11, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i11]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i12 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                if (i12 == 4) {
                    setMarginPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
                }
            } else {
                setMarginAuto(iMaybeTransformLeftRightToStartEnd);
            }
        } else {
            setMargin(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_HEIGHT)
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                setStyleMaxHeightPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMaxHeight(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_WIDTH)
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                setStyleMaxWidthPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMaxWidth(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_HEIGHT)
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                setStyleMinHeightPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMinHeight(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_WIDTH)
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                setStyleMinWidthPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMinWidth(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(@Nullable String str) {
        if (isVirtual()) {
        }
        if (str == null) {
            setOverflow(YogaOverflow.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                setOverflow(YogaOverflow.HIDDEN);
                break;
            case "scroll":
                setOverflow(YogaOverflow.SCROLL);
                break;
            case "visible":
                setOverflow(YogaOverflow.VISIBLE);
                break;
            default:
                C45999a.m101488I(ReactConstants.TAG, "invalid value for overflow: " + str);
                setOverflow(YogaOverflow.VISIBLE);
                break;
        }
    }

    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i11, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int iMaybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i11]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i12 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 == 4) {
                setPaddingPercent(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
            }
        } else {
            setPadding(iMaybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.POSITION)
    public void setPosition(@Nullable String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(YogaPositionType.RELATIVE);
            return;
        }
        if (!str.equals("relative")) {
            if (!str.equals("absolute")) {
                C45999a.m101488I(ReactConstants.TAG, "invalid value for position: " + str);
                setPositionType(YogaPositionType.RELATIVE);
                return;
            }
            setPositionType(YogaPositionType.ABSOLUTE);
            return;
        }
        setPositionType(YogaPositionType.RELATIVE);
    }

    @ReactProp(name = ViewProps.ROW_GAP)
    public void setRowGap(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (i11 == 4) {
                setRowGapPercent(this.mTempYogaValue.value);
            }
        } else {
            setRowGap(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(name = ViewProps.ON_LAYOUT)
    public void setShouldNotifyOnLayout(boolean z11) {
        super.setShouldNotifyOnLayout(z11);
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i11 = C60971.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    setStyleWidthPercent(this.mTempYogaValue.value);
                }
            } else {
                setStyleWidthAuto();
            }
        } else {
            setStyleWidth(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.COLLAPSABLE_CHILDREN)
    public void setCollapsableChildren(boolean z11) {
    }

    @ReactProp(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @ReactProp(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @ReactProp(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z11) {
    }

    @ReactProp(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z11) {
    }

    @ReactProp(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z11) {
    }

    @ReactPropGroup(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i11, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i11, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i11, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i11, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i11, Dynamic dynamic) {
    }

    @ReactPropGroup(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i11, Dynamic dynamic) {
    }
}
