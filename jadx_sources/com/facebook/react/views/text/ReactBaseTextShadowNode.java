package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.FtsOptions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.LegacyLineHeightSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaValue;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p302h6.C38115a;
import p747x3.C45999a;
import p852kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";

    @Nullable
    protected ReactAccessibilityDelegate.AccessibilityRole mAccessibilityRole;
    protected boolean mAdjustsFontSizeToFit;
    protected int mBackgroundColor;
    protected int mColor;
    protected boolean mContainsImages;

    @Nullable
    protected String mFontFamily;

    @Nullable
    protected String mFontFeatureSettings;
    protected int mFontStyle;
    protected int mFontWeight;
    protected int mHyphenationFrequency;
    protected boolean mIncludeFontPadding;
    protected Map<Integer, ReactShadowNode> mInlineViews;
    protected boolean mIsBackgroundColorSet;
    protected boolean mIsColorSet;
    protected boolean mIsLineThroughTextDecorationSet;
    protected boolean mIsUnderlineTextDecorationSet;
    protected int mJustificationMode;
    protected float mMinimumFontScale;
    protected int mNumberOfLines;

    @Nullable
    protected ReactTextViewManagerCallback mReactTextViewManagerCallback;

    @Nullable
    protected ReactAccessibilityDelegate.Role mRole;
    protected int mTextAlign;
    protected TextAttributes mTextAttributes;
    protected int mTextBreakStrategy;
    protected int mTextShadowColor;
    protected float mTextShadowOffsetDx;
    protected float mTextShadowOffsetDy;
    protected float mTextShadowRadius;

    public ReactBaseTextShadowNode() {
        this(null);
    }

    @ReactProp(name = ViewProps.TEXT_BREAK_STRATEGY)
    public void setTextBreakStrategy(@Nullable String str) {
        if (str == null || "highQuality".equals(str)) {
            this.mTextBreakStrategy = 1;
        } else if (FtsOptions.TOKENIZER_SIMPLE.equals(str)) {
            this.mTextBreakStrategy = 0;
        } else if ("balanced".equals(str)) {
            this.mTextBreakStrategy = 2;
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Invalid textBreakStrategy: " + str);
            this.mTextBreakStrategy = 1;
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public void setTextDecorationLine(@Nullable String str) {
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(C33627eb.f69716f)) {
                if (TtmlNode.UNDERLINE.equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("line-through".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
        markUpdated();
    }

    @ReactProp(name = PROP_SHADOW_OFFSET)
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    public Spannable spannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, @Nullable String str, boolean z11, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        int height;
        C38115a.m86046b((z11 && nativeViewHierarchyOptimizer == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z11 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.apply(str, reactBaseTextShadowNode.mTextAttributes.getTextTransform()));
        }
        buildSpannedFromShadowNode(reactBaseTextShadowNode, spannableStringBuilder, arrayList, null, z11, map, 0);
        reactBaseTextShadowNode.mContainsImages = false;
        reactBaseTextShadowNode.mInlineViews = map;
        float f11 = Float.NaN;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            SetSpanOperation setSpanOperation = (SetSpanOperation) arrayList.get((arrayList.size() - i11) - 1);
            ReactSpan reactSpan = setSpanOperation.what;
            boolean z12 = reactSpan instanceof TextInlineImageSpan;
            if (z12 || (reactSpan instanceof TextInlineViewPlaceholderSpan)) {
                if (z12) {
                    height = ((TextInlineImageSpan) reactSpan).getHeight();
                    reactBaseTextShadowNode.mContainsImages = true;
                } else {
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) reactSpan;
                    int height2 = textInlineViewPlaceholderSpan.getHeight();
                    ReactShadowNode reactShadowNode = (ReactShadowNode) map.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
                    nativeViewHierarchyOptimizer.handleForceViewToBeNonLayoutOnly(reactShadowNode);
                    reactShadowNode.setLayoutParent(reactBaseTextShadowNode);
                    height = height2;
                }
                if (Float.isNaN(f11) || height > f11) {
                    f11 = height;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i11);
        }
        reactBaseTextShadowNode.mTextAttributes.setHeightOfTallestInlineViewOrImage(f11);
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.mReactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public ReactBaseTextShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.mIsColorSet = false;
        this.mIsBackgroundColorSet = false;
        this.mAccessibilityRole = null;
        this.mRole = null;
        this.mNumberOfLines = -1;
        this.mTextAlign = 0;
        this.mTextBreakStrategy = 1;
        this.mHyphenationFrequency = 0;
        this.mJustificationMode = 0;
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        this.mTextShadowRadius = 0.0f;
        this.mTextShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        this.mIncludeFontPadding = true;
        this.mAdjustsFontSizeToFit = false;
        this.mMinimumFontScale = 0.0f;
        this.mFontStyle = -1;
        this.mFontWeight = -1;
        this.mFontFamily = null;
        this.mFontFeatureSettings = null;
        this.mContainsImages = false;
        this.mTextAttributes = new TextAttributes();
        this.mReactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    private static void buildSpannedFromShadowNode(ReactBaseTextShadowNode reactBaseTextShadowNode, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list, @Nullable TextAttributes textAttributes, boolean z11, @Nullable Map<Integer, ReactShadowNode> map, int i11) {
        float layoutWidth;
        float layoutHeight;
        TextAttributes textAttributesApplyChild = textAttributes != null ? textAttributes.applyChild(reactBaseTextShadowNode.mTextAttributes) : reactBaseTextShadowNode.mTextAttributes;
        int childCount = reactBaseTextShadowNode.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ReactShadowNodeImpl childAt = reactBaseTextShadowNode.getChildAt(i12);
            if (childAt instanceof ReactRawTextShadowNode) {
                spannableStringBuilder.append((CharSequence) TextTransform.apply(((ReactRawTextShadowNode) childAt).getText(), textAttributesApplyChild.getTextTransform()));
            } else {
                if (childAt instanceof ReactBaseTextShadowNode) {
                    buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, spannableStringBuilder, list, textAttributesApplyChild, z11, map, spannableStringBuilder.length());
                } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                    spannableStringBuilder.append("0");
                    list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
                } else {
                    if (!z11) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    YogaValue styleWidth = childAt.getStyleWidth();
                    YogaValue styleHeight = childAt.getStyleHeight();
                    YogaUnit yogaUnit = styleWidth.f9990b;
                    YogaUnit yogaUnit2 = YogaUnit.POINT;
                    if (yogaUnit == yogaUnit2 && styleHeight.f9990b == yogaUnit2) {
                        layoutWidth = styleWidth.f9989a;
                        layoutHeight = styleHeight.f9989a;
                    } else {
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    spannableStringBuilder.append("0");
                    list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new TextInlineViewPlaceholderSpan(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    map.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i11) {
            if (reactBaseTextShadowNode.mIsColorSet) {
                list.add(new SetSpanOperation(i11, length, new ReactForegroundColorSpan(reactBaseTextShadowNode.mColor)));
            }
            if (reactBaseTextShadowNode.mIsBackgroundColorSet) {
                list.add(new SetSpanOperation(i11, length, new ReactBackgroundColorSpan(reactBaseTextShadowNode.mBackgroundColor)));
            }
            ReactAccessibilityDelegate.Role role = reactBaseTextShadowNode.mRole;
            if (role == null ? reactBaseTextShadowNode.mAccessibilityRole == ReactAccessibilityDelegate.AccessibilityRole.LINK : role == ReactAccessibilityDelegate.Role.LINK) {
                list.add(new SetSpanOperation(i11, length, new ReactClickableSpan(reactBaseTextShadowNode.getReactTag())));
            }
            float effectiveLetterSpacing = textAttributesApplyChild.getEffectiveLetterSpacing();
            if (!Float.isNaN(effectiveLetterSpacing) && (textAttributes == null || textAttributes.getEffectiveLetterSpacing() != effectiveLetterSpacing)) {
                list.add(new SetSpanOperation(i11, length, new CustomLetterSpacingSpan(effectiveLetterSpacing)));
            }
            int effectiveFontSize = textAttributesApplyChild.getEffectiveFontSize();
            if (textAttributes == null || textAttributes.getEffectiveFontSize() != effectiveFontSize) {
                list.add(new SetSpanOperation(i11, length, new ReactAbsoluteSizeSpan(effectiveFontSize)));
            }
            if (reactBaseTextShadowNode.mFontStyle != -1 || reactBaseTextShadowNode.mFontWeight != -1 || reactBaseTextShadowNode.mFontFamily != null) {
                list.add(new SetSpanOperation(i11, length, new CustomStyleSpan(reactBaseTextShadowNode.mFontStyle, reactBaseTextShadowNode.mFontWeight, reactBaseTextShadowNode.mFontFeatureSettings, reactBaseTextShadowNode.mFontFamily, reactBaseTextShadowNode.getThemedContext().getAssets())));
            }
            if (reactBaseTextShadowNode.mIsUnderlineTextDecorationSet) {
                list.add(new SetSpanOperation(i11, length, new ReactUnderlineSpan()));
            }
            if (reactBaseTextShadowNode.mIsLineThroughTextDecorationSet) {
                list.add(new SetSpanOperation(i11, length, new ReactStrikethroughSpan()));
            }
            if ((reactBaseTextShadowNode.mTextShadowOffsetDx != 0.0f || reactBaseTextShadowNode.mTextShadowOffsetDy != 0.0f || reactBaseTextShadowNode.mTextShadowRadius != 0.0f) && Color.alpha(reactBaseTextShadowNode.mTextShadowColor) != 0) {
                list.add(new SetSpanOperation(i11, length, new ShadowStyleSpan(reactBaseTextShadowNode.mTextShadowOffsetDx, reactBaseTextShadowNode.mTextShadowOffsetDy, reactBaseTextShadowNode.mTextShadowRadius, reactBaseTextShadowNode.mTextShadowColor)));
            }
            float effectiveLineHeight = textAttributesApplyChild.getEffectiveLineHeight();
            if (!Float.isNaN(effectiveLineHeight) && (textAttributes == null || textAttributes.getEffectiveLineHeight() != effectiveLineHeight)) {
                if (ReactNativeFeatureFlags.enableAndroidLineHeightCentering()) {
                    list.add(new SetSpanOperation(i11, length, new CustomLineHeightSpan(effectiveLineHeight)));
                } else {
                    list.add(new SetSpanOperation(i11, length, new LegacyLineHeightSpan(effectiveLineHeight)));
                }
            }
            list.add(new SetSpanOperation(i11, length, new ReactTagSpan(reactBaseTextShadowNode.getReactTag())));
        }
    }

    private int getTextAlign() {
        int i11 = this.mTextAlign;
        if (getLayoutDirection() == YogaDirection.RTL) {
            if (i11 == 5) {
                return 3;
            }
            if (i11 == 3) {
                return 5;
            }
        }
        return i11;
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public void setAdjustFontSizeToFit(boolean z11) {
        if (z11 != this.mAdjustsFontSizeToFit) {
            this.mAdjustsFontSizeToFit = z11;
            markUpdated();
        }
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(boolean z11) {
        if (z11 != this.mTextAttributes.getAllowFontScaling()) {
            this.mTextAttributes.setAllowFontScaling(z11);
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(@Nullable Integer num) {
        boolean z11 = num != null;
        this.mIsColorSet = z11;
        if (z11) {
            this.mColor = num.intValue();
        }
        markUpdated();
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(@Nullable String str) {
        this.mFontFamily = str;
        markUpdated();
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = "fontSize")
    public void setFontSize(float f11) {
        this.mTextAttributes.setFontSize(f11);
        markUpdated();
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(boolean z11) {
        this.mIncludeFontPadding = z11;
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(float f11) {
        this.mTextAttributes.setLetterSpacing(f11);
        markUpdated();
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(float f11) {
        this.mTextAttributes.setLineHeight(f11);
        markUpdated();
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f11);
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.MINIMUM_FONT_SCALE)
    public void setMinimumFontScale(float f11) {
        if (f11 != this.mMinimumFontScale) {
            this.mMinimumFontScale = f11;
            markUpdated();
        }
    }

    @ReactProp(defaultInt = -1, name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = -1;
        }
        this.mNumberOfLines = i11;
        markUpdated();
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(@Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 1;
            }
            this.mTextAlign = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mJustificationMode = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.mTextAlign = 0;
            } else if ("left".equals(str)) {
                this.mTextAlign = 3;
            } else if ("right".equals(str)) {
                this.mTextAlign = 5;
            } else if (TtmlNode.CENTER.equals(str)) {
                this.mTextAlign = 1;
            } else {
                C45999a.m101488I(ReactConstants.TAG, "Invalid textAlign: " + str);
                this.mTextAlign = 0;
            }
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = DEFAULT_TEXT_SHADOW_COLOR, name = PROP_SHADOW_COLOR)
    public void setTextShadowColor(int i11) {
        if (i11 != this.mTextShadowColor) {
            this.mTextShadowColor = i11;
            markUpdated();
        }
    }

    @ReactProp(defaultInt = 1, name = PROP_SHADOW_RADIUS)
    public void setTextShadowRadius(float f11) {
        if (f11 != this.mTextShadowRadius) {
            this.mTextShadowRadius = f11;
            markUpdated();
        }
    }

    @ReactProp(name = PROP_TEXT_TRANSFORM)
    public void setTextTransform(@Nullable String str) {
        if (str == null) {
            this.mTextAttributes.setTextTransform(TextTransform.UNSET);
        } else if ("none".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.NONE);
        } else if ("uppercase".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.mTextAttributes.setTextTransform(TextTransform.CAPITALIZE);
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Invalid textTransform: " + str);
            this.mTextAttributes.setTextTransform(TextTransform.UNSET);
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public void setAccessibilityRole(@Nullable String str) {
        if (isVirtual()) {
            this.mAccessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.fromValue(str);
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(@Nullable Integer num) {
        boolean z11;
        if (isVirtual()) {
            if (num != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.mIsBackgroundColorSet = z11;
            if (z11) {
                this.mBackgroundColor = num.intValue();
            }
            markUpdated();
        }
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(@Nullable String str) {
        int fontStyle = ReactTypefaceUtils.parseFontStyle(str);
        if (fontStyle != this.mFontStyle) {
            this.mFontStyle = fontStyle;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public void setFontVariant(@Nullable ReadableArray readableArray) {
        String fontVariant = ReactTypefaceUtils.parseFontVariant(readableArray);
        if (!TextUtils.equals(fontVariant, this.mFontFeatureSettings)) {
            this.mFontFeatureSettings = fontVariant;
            markUpdated();
        }
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(@Nullable String str) {
        int fontWeight = ReactTypefaceUtils.parseFontWeight(str);
        if (fontWeight != this.mFontWeight) {
            this.mFontWeight = fontWeight;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.ROLE)
    public void setRole(@Nullable String str) {
        if (isVirtual()) {
            this.mRole = ReactAccessibilityDelegate.Role.fromValue(str);
            markUpdated();
        }
    }
}
