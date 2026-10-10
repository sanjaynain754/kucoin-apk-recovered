package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.FtsOptions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Iterator;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class TextAttributeProps {
    private static final int DEFAULT_BREAK_STRATEGY = 1;
    private static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    private static final int DEFAULT_JUSTIFICATION_MODE = 0;
    private static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String PROP_SHADOW_COLOR = "textShadowColor";
    private static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    private static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    private static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    private static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    private static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final short TA_KEY_ACCESSIBILITY_ROLE = 24;
    public static final short TA_KEY_ALIGNMENT = 12;
    public static final short TA_KEY_ALLOW_FONT_SCALING = 9;
    public static final short TA_KEY_BACKGROUND_COLOR = 1;
    public static final short TA_KEY_BEST_WRITING_DIRECTION = 13;
    public static final short TA_KEY_FONT_FAMILY = 3;
    public static final short TA_KEY_FONT_SIZE = 4;
    public static final short TA_KEY_FONT_SIZE_MULTIPLIER = 5;
    public static final short TA_KEY_FONT_STYLE = 7;
    public static final short TA_KEY_FONT_VARIANT = 8;
    public static final short TA_KEY_FONT_WEIGHT = 6;
    public static final short TA_KEY_FOREGROUND_COLOR = 0;
    public static final short TA_KEY_IS_HIGHLIGHTED = 22;
    public static final short TA_KEY_LAYOUT_DIRECTION = 23;
    public static final short TA_KEY_LETTER_SPACING = 10;
    public static final short TA_KEY_LINE_BREAK_STRATEGY = 25;
    public static final short TA_KEY_LINE_HEIGHT = 11;
    public static final short TA_KEY_MAX_FONT_SIZE_MULTIPLIER = 29;
    public static final short TA_KEY_OPACITY = 2;
    public static final short TA_KEY_ROLE = 26;
    public static final short TA_KEY_TEXT_DECORATION_COLOR = 14;
    public static final short TA_KEY_TEXT_DECORATION_LINE = 15;
    public static final short TA_KEY_TEXT_DECORATION_STYLE = 16;
    public static final short TA_KEY_TEXT_SHADOW_COLOR = 19;
    public static final short TA_KEY_TEXT_SHADOW_OFFSET_DX = 20;
    public static final short TA_KEY_TEXT_SHADOW_OFFSET_DY = 21;
    public static final short TA_KEY_TEXT_SHADOW_RADIUS = 18;
    public static final short TA_KEY_TEXT_TRANSFORM = 27;
    public static final int UNSET = -1;
    protected int mBackgroundColor;
    protected int mColor;
    protected float mLineHeight = Float.NaN;
    protected boolean mIsColorSet = false;
    protected boolean mAllowFontScaling = true;
    protected float mMaxFontSizeMultiplier = Float.NaN;
    protected boolean mIsBackgroundColorSet = false;
    protected float mOpacity = Float.NaN;
    protected int mNumberOfLines = -1;
    protected int mFontSize = -1;
    protected float mFontSizeInput = -1.0f;
    protected float mLineHeightInput = -1.0f;
    protected float mLetterSpacingInput = Float.NaN;
    protected int mTextAlign = 0;
    protected int mLayoutDirection = -1;

    @NonNull
    protected TextTransform mTextTransform = TextTransform.NONE;
    protected float mTextShadowOffsetDx = 0.0f;
    protected float mTextShadowOffsetDy = 0.0f;
    protected float mTextShadowRadius = 0.0f;
    protected int mTextShadowColor = 1426063360;
    protected boolean mIsUnderlineTextDecorationSet = false;
    protected boolean mIsLineThroughTextDecorationSet = false;
    protected boolean mIncludeFontPadding = true;

    @Nullable
    protected ReactAccessibilityDelegate.AccessibilityRole mAccessibilityRole = null;

    @Nullable
    protected ReactAccessibilityDelegate.Role mRole = null;
    protected int mFontStyle = -1;
    protected int mFontWeight = -1;

    @Nullable
    protected String mFontFamily = null;

    @Nullable
    protected String mFontFeatureSettings = null;
    protected boolean mContainsImages = false;
    protected float mHeightOfTallestInlineImage = Float.NaN;

    public static int getHyphenationFrequency(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals(C33789m5.f70921k)) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int getLayoutDirection(@Nullable String str) {
        if (str != null && !"undefined".equals(str)) {
            if ("rtl".equals(str)) {
                return 1;
            }
            if ("ltr".equals(str)) {
                return 0;
            }
            C45999a.m101488I(ReactConstants.TAG, "Invalid layoutDirection: " + str);
        }
        return -1;
    }

    public static int getTextBreakStrategy(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals(FtsOptions.TOKENIZER_SIMPLE) ? 1 : 0;
    }

    private void setFontVariant(@Nullable ReadableArray readableArray) {
        this.mFontFeatureSettings = ReactTypefaceUtils.parseFontVariant(readableArray);
    }

    private void setRole(@Nullable String str) {
        if (str == null) {
            this.mRole = null;
        } else {
            this.mRole = ReactAccessibilityDelegate.Role.fromValue(str);
        }
    }

    private void setTextDecorationLine(@Nullable String str) {
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split(C33820nf.f71144W)) {
                if (TtmlNode.UNDERLINE.equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("strikethrough".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
    }

    private void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (!readableMap.hasKey("height") || readableMap.isNull("height")) {
                return;
            }
            this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
        }
    }

    public static TextAttributeProps fromMapBuffer(MapBuffer mapBuffer) {
        TextAttributeProps textAttributeProps = new TextAttributeProps();
        for (MapBuffer.Entry entry : mapBuffer) {
            switch (entry.getKey()) {
                case 0:
                    textAttributeProps.setColor(Integer.valueOf(entry.getIntValue()));
                    break;
                case 1:
                    textAttributeProps.setBackgroundColor(Integer.valueOf(entry.getIntValue()));
                    break;
                case 2:
                    textAttributeProps.setOpacity((float) entry.getDoubleValue());
                    break;
                case 3:
                    textAttributeProps.setFontFamily(entry.getStringValue());
                    break;
                case 4:
                    textAttributeProps.setFontSize((float) entry.getDoubleValue());
                    break;
                case 6:
                    textAttributeProps.setFontWeight(entry.getStringValue());
                    break;
                case 7:
                    textAttributeProps.setFontStyle(entry.getStringValue());
                    break;
                case 8:
                    textAttributeProps.setFontVariant(entry.getMapBufferValue());
                    break;
                case 9:
                    textAttributeProps.setAllowFontScaling(entry.getBooleanValue());
                    break;
                case 10:
                    textAttributeProps.setLetterSpacing((float) entry.getDoubleValue());
                    break;
                case 11:
                    textAttributeProps.setLineHeight((float) entry.getDoubleValue());
                    break;
                case 15:
                    textAttributeProps.setTextDecorationLine(entry.getStringValue());
                    break;
                case 18:
                    textAttributeProps.setTextShadowRadius((float) entry.getDoubleValue());
                    break;
                case 19:
                    textAttributeProps.setTextShadowColor(entry.getIntValue());
                    break;
                case 20:
                    textAttributeProps.setTextShadowOffsetDx((float) entry.getDoubleValue());
                    break;
                case 21:
                    textAttributeProps.setTextShadowOffsetDy((float) entry.getDoubleValue());
                    break;
                case 23:
                    textAttributeProps.setLayoutDirection(entry.getStringValue());
                    break;
                case 24:
                    textAttributeProps.setAccessibilityRole(entry.getStringValue());
                    break;
                case 26:
                    textAttributeProps.setRole(ReactAccessibilityDelegate.Role.values()[entry.getIntValue()]);
                    break;
                case 27:
                    textAttributeProps.setTextTransform(entry.getStringValue());
                    break;
                case 29:
                    textAttributeProps.setMaxFontSizeMultiplier((float) entry.getDoubleValue());
                    break;
            }
        }
        return textAttributeProps;
    }

    public static TextAttributeProps fromReadableMap(ReactStylesDiffMap reactStylesDiffMap) {
        TextAttributeProps textAttributeProps = new TextAttributeProps();
        textAttributeProps.setNumberOfLines(getIntProp(reactStylesDiffMap, ViewProps.NUMBER_OF_LINES, -1));
        textAttributeProps.setLineHeight(getFloatProp(reactStylesDiffMap, ViewProps.LINE_HEIGHT, -1.0f));
        textAttributeProps.setLetterSpacing(getFloatProp(reactStylesDiffMap, ViewProps.LETTER_SPACING, Float.NaN));
        textAttributeProps.setAllowFontScaling(getBooleanProp(reactStylesDiffMap, ViewProps.ALLOW_FONT_SCALING, true));
        textAttributeProps.setMaxFontSizeMultiplier(getFloatProp(reactStylesDiffMap, ViewProps.MAX_FONT_SIZE_MULTIPLIER, Float.NaN));
        textAttributeProps.setFontSize(getFloatProp(reactStylesDiffMap, "fontSize", -1.0f));
        textAttributeProps.setColor(reactStylesDiffMap.hasKey("color") ? Integer.valueOf(reactStylesDiffMap.getInt("color", 0)) : null);
        textAttributeProps.setColor(reactStylesDiffMap.hasKey(ViewProps.FOREGROUND_COLOR) ? Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.FOREGROUND_COLOR, 0)) : null);
        textAttributeProps.setBackgroundColor(reactStylesDiffMap.hasKey("backgroundColor") ? Integer.valueOf(reactStylesDiffMap.getInt("backgroundColor", 0)) : null);
        textAttributeProps.setOpacity(getFloatProp(reactStylesDiffMap, ViewProps.OPACITY, Float.NaN));
        textAttributeProps.setFontFamily(getStringProp(reactStylesDiffMap, "fontFamily"));
        textAttributeProps.setFontWeight(getStringProp(reactStylesDiffMap, "fontWeight"));
        textAttributeProps.setFontStyle(getStringProp(reactStylesDiffMap, "fontStyle"));
        textAttributeProps.setFontVariant(getArrayProp(reactStylesDiffMap, ViewProps.FONT_VARIANT));
        textAttributeProps.setIncludeFontPadding(getBooleanProp(reactStylesDiffMap, ViewProps.INCLUDE_FONT_PADDING, true));
        textAttributeProps.setTextDecorationLine(getStringProp(reactStylesDiffMap, ViewProps.TEXT_DECORATION_LINE));
        textAttributeProps.setTextShadowOffset(reactStylesDiffMap.hasKey("textShadowOffset") ? reactStylesDiffMap.getMap("textShadowOffset") : null);
        textAttributeProps.setTextShadowRadius(getFloatProp(reactStylesDiffMap, "textShadowRadius", 1.0f));
        textAttributeProps.setTextShadowColor(getIntProp(reactStylesDiffMap, "textShadowColor", 1426063360));
        textAttributeProps.setTextTransform(getStringProp(reactStylesDiffMap, "textTransform"));
        textAttributeProps.setLayoutDirection(getStringProp(reactStylesDiffMap, ViewProps.LAYOUT_DIRECTION));
        textAttributeProps.setAccessibilityRole(getStringProp(reactStylesDiffMap, ViewProps.ACCESSIBILITY_ROLE));
        textAttributeProps.setRole(getStringProp(reactStylesDiffMap, ViewProps.ROLE));
        return textAttributeProps;
    }

    private void setAccessibilityRole(@Nullable String str) {
        if (str == null) {
            this.mAccessibilityRole = null;
        } else {
            this.mAccessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.fromValue(str);
        }
    }

    private void setAllowFontScaling(boolean z11) {
        if (z11 != this.mAllowFontScaling) {
            this.mAllowFontScaling = z11;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
        }
    }

    private void setBackgroundColor(Integer num) {
        boolean z11 = num != null;
        this.mIsBackgroundColorSet = z11;
        if (z11) {
            this.mBackgroundColor = num.intValue();
        }
    }

    private void setColor(@Nullable Integer num) {
        boolean z11 = num != null;
        this.mIsColorSet = z11;
        if (z11) {
            this.mColor = num.intValue();
        }
    }

    private void setFontFamily(@Nullable String str) {
        this.mFontFamily = str;
    }

    private void setFontSize(float f11) {
        this.mFontSizeInput = f11;
        if (f11 != -1.0f) {
            f11 = (float) (this.mAllowFontScaling ? Math.ceil(PixelUtil.toPixelFromSP(f11, this.mMaxFontSizeMultiplier)) : Math.ceil(PixelUtil.toPixelFromDIP(f11)));
        }
        this.mFontSize = (int) f11;
    }

    private void setFontVariant(@Nullable MapBuffer mapBuffer) {
        if (mapBuffer == null || mapBuffer.getCount() == 0) {
            this.mFontFeatureSettings = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MapBuffer.Entry> it = mapBuffer.iterator();
        while (it.hasNext()) {
            String stringValue = it.next().getStringValue();
            if (stringValue != null) {
                switch (stringValue) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.mFontFeatureSettings = TextUtils.join(", ", arrayList);
    }

    private void setIncludeFontPadding(boolean z11) {
        this.mIncludeFontPadding = z11;
    }

    private void setLetterSpacing(float f11) {
        this.mLetterSpacingInput = f11;
    }

    private void setLineHeight(float f11) {
        this.mLineHeightInput = f11;
        if (f11 == -1.0f) {
            this.mLineHeight = Float.NaN;
        } else {
            this.mLineHeight = this.mAllowFontScaling ? PixelUtil.toPixelFromSP(f11) : PixelUtil.toPixelFromDIP(f11);
        }
    }

    private void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.mMaxFontSizeMultiplier) {
            this.mMaxFontSizeMultiplier = f11;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
        }
    }

    private void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = -1;
        }
        this.mNumberOfLines = i11;
    }

    private void setOpacity(float f11) {
        this.mOpacity = f11;
    }

    private void setTextShadowColor(int i11) {
        if (i11 != this.mTextShadowColor) {
            this.mTextShadowColor = i11;
        }
    }

    private void setTextShadowRadius(float f11) {
        if (f11 != this.mTextShadowRadius) {
            this.mTextShadowRadius = f11;
        }
    }

    private void setTextTransform(@Nullable String str) {
        if (str == null || "none".equals(str)) {
            this.mTextTransform = TextTransform.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.mTextTransform = TextTransform.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.mTextTransform = TextTransform.LOWERCASE;
            return;
        }
        if ("capitalize".equals(str)) {
            this.mTextTransform = TextTransform.CAPITALIZE;
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid textTransform: " + str);
        this.mTextTransform = TextTransform.NONE;
    }

    public ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.mAccessibilityRole;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getEffectiveFontSize() {
        return this.mFontSize;
    }

    public float getEffectiveLineHeight() {
        if (!Float.isNaN(this.mLineHeight) && !Float.isNaN(this.mHeightOfTallestInlineImage)) {
            float f11 = this.mHeightOfTallestInlineImage;
            if (f11 > this.mLineHeight) {
                return f11;
            }
        }
        return this.mLineHeight;
    }

    public String getFontFamily() {
        return this.mFontFamily;
    }

    public String getFontFeatureSettings() {
        return this.mFontFeatureSettings;
    }

    public int getFontStyle() {
        return this.mFontStyle;
    }

    public int getFontWeight() {
        return this.mFontWeight;
    }

    public float getLetterSpacing() {
        float pixelFromSP = this.mAllowFontScaling ? PixelUtil.toPixelFromSP(this.mLetterSpacingInput) : PixelUtil.toPixelFromDIP(this.mLetterSpacingInput);
        int i11 = this.mFontSize;
        if (i11 > 0) {
            return pixelFromSP / i11;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.mFontSize);
    }

    public float getOpacity() {
        return this.mOpacity;
    }

    @Nullable
    public ReactAccessibilityDelegate.Role getRole() {
        return this.mRole;
    }

    public int getTextShadowColor() {
        return this.mTextShadowColor;
    }

    public float getTextShadowOffsetDx() {
        return this.mTextShadowOffsetDx;
    }

    public float getTextShadowOffsetDy() {
        return this.mTextShadowOffsetDy;
    }

    public float getTextShadowRadius() {
        return this.mTextShadowRadius;
    }

    @NonNull
    public TextTransform getTextTransform() {
        return this.mTextTransform;
    }

    public boolean isBackgroundColorSet() {
        return this.mIsBackgroundColorSet;
    }

    public boolean isColorSet() {
        return this.mIsColorSet;
    }

    public boolean isLineThroughTextDecorationSet() {
        return this.mIsLineThroughTextDecorationSet;
    }

    public boolean isUnderlineTextDecorationSet() {
        return this.mIsUnderlineTextDecorationSet;
    }

    private TextAttributeProps() {
    }

    @Nullable
    private static ReadableArray getArrayProp(ReactStylesDiffMap reactStylesDiffMap, String str) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getArray(str);
        }
        return null;
    }

    private static boolean getBooleanProp(ReactStylesDiffMap reactStylesDiffMap, String str, boolean z11) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getBoolean(str, z11);
        }
        return z11;
    }

    private static float getFloatProp(ReactStylesDiffMap reactStylesDiffMap, String str, float f11) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getFloat(str, f11);
        }
        return f11;
    }

    private static int getIntProp(ReactStylesDiffMap reactStylesDiffMap, String str, int i11) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getInt(str, i11);
        }
        return i11;
    }

    public static int getJustificationMode(ReactStylesDiffMap reactStylesDiffMap, int i11) {
        if (!reactStylesDiffMap.hasKey("textAlign")) {
            return i11;
        }
        if ("justify".equals(reactStylesDiffMap.getString("textAlign")) && Build.VERSION.SDK_INT >= 26) {
            return 1;
        }
        return DEFAULT_JUSTIFICATION_MODE;
    }

    private static String getStringProp(ReactStylesDiffMap reactStylesDiffMap, String str) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getString(str);
        }
        return null;
    }

    public static int getTextAlignment(ReactStylesDiffMap reactStylesDiffMap, boolean z11, int i11) {
        if (!reactStylesDiffMap.hasKey("textAlign")) {
            return i11;
        }
        String string = reactStylesDiffMap.getString("textAlign");
        if ("justify".equals(string)) {
            return 3;
        }
        if (string != null && !"auto".equals(string)) {
            if ("left".equals(string)) {
                if (!z11) {
                    return 3;
                }
                return 5;
            }
            if ("right".equals(string)) {
                if (z11) {
                    return 3;
                }
                return 5;
            }
            if (TtmlNode.CENTER.equals(string)) {
                return 1;
            }
            C45999a.m101488I(ReactConstants.TAG, "Invalid textAlign: " + string);
        }
        return 0;
    }

    private void setFontStyle(@Nullable String str) {
        this.mFontStyle = ReactTypefaceUtils.parseFontStyle(str);
    }

    private void setFontWeight(@Nullable String str) {
        this.mFontWeight = ReactTypefaceUtils.parseFontWeight(str);
    }

    private void setLayoutDirection(@Nullable String str) {
        this.mLayoutDirection = getLayoutDirection(str);
    }

    private void setRole(ReactAccessibilityDelegate.Role role) {
        this.mRole = role;
    }

    private void setTextShadowOffsetDx(float f11) {
        this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(f11);
    }

    private void setTextShadowOffsetDy(float f11) {
        this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(f11);
    }

    public float getEffectiveLetterSpacing() {
        return getLetterSpacing();
    }
}
