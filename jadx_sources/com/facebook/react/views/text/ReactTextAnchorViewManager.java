package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.tencent.bugly.proguard.C33789m5;
import p747x3.C45999a;
import p852kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends ReactBaseTextShadowNode> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    private static final String TAG = "ReactTextAnchorViewManager";

    @ReactProp(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(ReactTextView reactTextView, @Nullable String str) {
        if (str == null || str.equals("none")) {
            reactTextView.setHyphenationFrequency(0);
            return;
        }
        if (str.equals("full")) {
            reactTextView.setHyphenationFrequency(2);
            return;
        }
        if (str.equals(C33789m5.f70921k)) {
            reactTextView.setHyphenationFrequency(1);
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid android_hyphenationFrequency: " + str);
        reactTextView.setHyphenationFrequency(0);
    }

    @ReactProp(name = "dataDetectorType")
    public void setDataDetectorType(ReactTextView reactTextView, @Nullable String str) {
        if (str != null) {
            switch (str) {
                case "phoneNumber":
                    reactTextView.setLinkifyMask(4);
                    break;
                case "all":
                    reactTextView.setLinkifyMask(15);
                    break;
                case "link":
                    reactTextView.setLinkifyMask(1);
                    break;
                case "email":
                    reactTextView.setLinkifyMask(2);
                    break;
            }
            return;
        }
        reactTextView.setLinkifyMask(0);
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    public void setTextAlignVertical(ReactTextView reactTextView, @Nullable String str) {
        if (str == null || "auto".equals(str)) {
            reactTextView.setGravityVertical(0);
            return;
        }
        if (ViewProps.TOP.equals(str)) {
            reactTextView.setGravityVertical(48);
            return;
        }
        if (ViewProps.BOTTOM.equals(str)) {
            reactTextView.setGravityVertical(80);
            return;
        }
        if (TtmlNode.CENTER.equals(str)) {
            reactTextView.setGravityVertical(16);
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid textAlignVertical: " + str);
        reactTextView.setGravityVertical(0);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactTextView reactTextView, int i11, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(reactTextView, LogicalEdge.ALL, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactTextView reactTextView, @Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(reactTextView, str == null ? null : BorderStyle.fromString(str));
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactTextView reactTextView, boolean z11) {
        reactTextView.setEnabled(!z11);
    }

    @ReactProp(name = ViewProps.ELLIPSIZE_MODE)
    public void setEllipsizeMode(ReactTextView reactTextView, @Nullable String str) {
        if (str == null || str.equals("tail")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
            return;
        }
        if (str.equals(TtmlNode.TAG_HEAD)) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.START);
            return;
        }
        if (str.equals("middle")) {
            reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
            return;
        }
        if (str.equals("clip")) {
            reactTextView.setEllipsizeLocation(null);
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid ellipsizeMode: " + str);
        reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactTextView reactTextView, @Nullable Integer num) {
        if (num == null) {
            reactTextView.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @ReactProp(name = "accessible")
    public void setAccessible(ReactTextView reactTextView, boolean z11) {
        reactTextView.setFocusable(z11);
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public void setAdjustFontSizeToFit(ReactTextView reactTextView, boolean z11) {
        reactTextView.setAdjustFontSizeToFit(z11);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactTextView reactTextView, int i11, float f11) {
        LengthPercentage lengthPercentage;
        if (Float.isNaN(f11)) {
            lengthPercentage = null;
        } else {
            lengthPercentage = new LengthPercentage(f11, LengthPercentageType.POINT);
        }
        BackgroundStyleApplicator.setBorderRadius(reactTextView, BorderRadiusProp.values()[i11], lengthPercentage);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH})
    public void setBorderWidth(ReactTextView reactTextView, int i11, float f11) {
        BackgroundStyleApplicator.setBorderWidth(reactTextView, LogicalEdge.values()[i11], Float.valueOf(f11));
    }

    @ReactProp(name = "fontSize")
    public void setFontSize(ReactTextView reactTextView, float f11) {
        reactTextView.setFontSize(f11);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z11) {
        reactTextView.setIncludeFontPadding(z11);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(ReactTextView reactTextView, float f11) {
        reactTextView.setLetterSpacing(f11);
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(ReactTextView reactTextView, boolean z11) {
        reactTextView.setNotifyOnInlineViewLayout(z11);
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(ReactTextView reactTextView, int i11) {
        reactTextView.setNumberOfLines(i11);
    }

    @ReactProp(name = "selectable")
    public void setSelectable(ReactTextView reactTextView, boolean z11) {
        reactTextView.setTextIsSelectable(z11);
    }
}
