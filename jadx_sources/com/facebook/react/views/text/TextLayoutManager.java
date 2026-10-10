package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.LegacyLineHeightSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactOpacitySpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p193d7.C36633f;
import p193d7.C36635h;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class TextLayoutManager {
    public static final short AS_KEY_BASE_ATTRIBUTES = 4;
    public static final short AS_KEY_CACHE_ID = 3;
    public static final short AS_KEY_FRAGMENTS = 2;
    public static final short AS_KEY_HASH = 0;
    public static final short AS_KEY_STRING = 1;
    private static final boolean DEFAULT_ADJUST_FONT_SIZE_TO_FIT = false;
    private static final boolean DEFAULT_INCLUDE_FONT_PADDING = true;
    private static final boolean ENABLE_MEASURE_LOGGING;
    public static final short FR_KEY_HEIGHT = 4;
    public static final short FR_KEY_IS_ATTACHMENT = 2;
    public static final short FR_KEY_REACT_TAG = 1;
    public static final short FR_KEY_STRING = 0;
    public static final short FR_KEY_TEXT_ATTRIBUTES = 5;
    public static final short FR_KEY_WIDTH = 3;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final short PA_KEY_ADJUST_FONT_SIZE_TO_FIT = 3;
    public static final short PA_KEY_ELLIPSIZE_MODE = 1;
    public static final short PA_KEY_HYPHENATION_FREQUENCY = 5;
    public static final short PA_KEY_INCLUDE_FONT_PADDING = 4;
    public static final short PA_KEY_MAXIMUM_FONT_SIZE = 7;
    public static final short PA_KEY_MAX_NUMBER_OF_LINES = 0;
    public static final short PA_KEY_MINIMUM_FONT_SIZE = 6;
    public static final short PA_KEY_TEXT_BREAK_STRATEGY = 2;
    private static final String TAG;
    private static final ConcurrentHashMap<Integer, Spannable> sTagToSpannableCache;
    private static final ThreadLocal<TextPaint> sTextPaintInstance;

    public static void adjustSpannableFontToFit(Spannable spannable, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2, double d11, int i11, boolean z11, int i12, int i13, Layout.Alignment alignment, int i14, TextPaint textPaint) {
        Spannable spannable2 = spannable;
        TextPaint textPaint2 = textPaint;
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable2, textPaint2);
        Layout layoutCreateLayout = createLayout(spannable2, metricsIsBoring, f11, yogaMeasureMode, z11, i12, i13, alignment, i14, textPaint2);
        int pixelFromDIP = (int) (Double.isNaN(d11) ? PixelUtil.toPixelFromDIP(4.0f) : d11);
        int i15 = 0;
        int iMax = pixelFromDIP;
        for (ReactAbsoluteSizeSpan reactAbsoluteSizeSpan : (ReactAbsoluteSizeSpan[]) spannable2.getSpans(0, spannable2.length(), ReactAbsoluteSizeSpan.class)) {
            iMax = Math.max(iMax, reactAbsoluteSizeSpan.getSize());
        }
        int i16 = iMax;
        while (i16 > pixelFromDIP) {
            if ((i11 == -1 || i11 == 0 || layoutCreateLayout.getLineCount() <= i11) && (yogaMeasureMode2 == YogaMeasureMode.UNDEFINED || layoutCreateLayout.getHeight() <= f12)) {
                return;
            }
            int iMax2 = i16 - Math.max(1, (int) PixelUtil.toPixelFromDIP(1.0f));
            float f13 = iMax2 / iMax;
            float f14 = pixelFromDIP;
            textPaint2.setTextSize(Math.max(textPaint2.getTextSize() * f13, f14));
            ReactAbsoluteSizeSpan[] reactAbsoluteSizeSpanArr = (ReactAbsoluteSizeSpan[]) spannable2.getSpans(i15, spannable2.length(), ReactAbsoluteSizeSpan.class);
            int length = reactAbsoluteSizeSpanArr.length;
            int i17 = i15;
            while (i17 < length) {
                ReactAbsoluteSizeSpan reactAbsoluteSizeSpan2 = reactAbsoluteSizeSpanArr[i17];
                spannable2.setSpan(new ReactAbsoluteSizeSpan((int) Math.max(reactAbsoluteSizeSpan2.getSize() * f13, f14)), spannable2.getSpanStart(reactAbsoluteSizeSpan2), spannable2.getSpanEnd(reactAbsoluteSizeSpan2), spannable2.getSpanFlags(reactAbsoluteSizeSpan2));
                spannable2.removeSpan(reactAbsoluteSizeSpan2);
                i17++;
                reactAbsoluteSizeSpanArr = reactAbsoluteSizeSpanArr;
                metricsIsBoring = metricsIsBoring;
            }
            Layout layoutCreateLayout2 = createLayout(spannable2, metricsIsBoring, f11, yogaMeasureMode, z11, i12, i13, alignment, i14, textPaint2);
            spannable2 = spannable;
            textPaint2 = textPaint;
            i16 = iMax2;
            layoutCreateLayout = layoutCreateLayout2;
            i15 = 0;
        }
    }

    private static Layout createLayout(Spannable spannable, BoringLayout.Metrics metrics, float f11, YogaMeasureMode yogaMeasureMode, boolean z11, int i11, int i12, Layout.Alignment alignment, int i13, TextPaint textPaint) {
        int i14;
        int length = spannable.length();
        boolean z12 = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f11 < 0.0f;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        if (metrics == null && (z12 || (!C36633f.m81965a(desiredWidth) && desiredWidth <= f11))) {
            if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
                desiredWidth = f11;
            }
            StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z11).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (Build.VERSION.SDK_INT >= 28) {
                textDirection.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection.build();
        }
        if (metrics == null || (!z12 && metrics.width > f11)) {
            StaticLayout.Builder textDirection2 = StaticLayout.Builder.obtain(spannable, 0, length, textPaint, (int) Math.ceil(f11)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z11).setBreakStrategy(i11).setHyphenationFrequency(i12).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 26) {
                textDirection2.setJustificationMode(i13);
            }
            if (i15 >= 28) {
                textDirection2.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection2.build();
        }
        int iCeil = metrics.width;
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            iCeil = (int) Math.ceil(f11);
        }
        if (metrics.width < 0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
            i14 = 0;
        } else {
            i14 = iCeil;
        }
        return BoringLayout.make(spannable, textPaint, i14, alignment, 1.0f, 0.0f, metrics, z11);
    }

    public static Spannable getOrCreateSpannableForText(Context context, MapBuffer mapBuffer, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        if (!mapBuffer.contains(3)) {
            return createSpannableFromAttributedString(context, mapBuffer, reactTextViewManagerCallback);
        }
        return sTagToSpannableCache.get(Integer.valueOf(mapBuffer.getInt(3)));
    }

    @Nullable
    private static String getTextAlignmentAttr(MapBuffer mapBuffer) {
        if (!mapBuffer.contains(2)) {
            return null;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(2);
        if (mapBuffer2.getCount() != 0) {
            MapBuffer mapBuffer3 = mapBuffer2.getMapBuffer(0).getMapBuffer(5);
            if (mapBuffer3.contains(12)) {
                return mapBuffer3.getString(12);
            }
        }
        return null;
    }

    public static boolean isRTL(MapBuffer mapBuffer) {
        if (!mapBuffer.contains(2)) {
            return false;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(2);
        if (mapBuffer2.getCount() == 0) {
            return false;
        }
        MapBuffer mapBuffer3 = mapBuffer2.getMapBuffer(0).getMapBuffer(5);
        return mapBuffer3.contains(23) && TextAttributeProps.getLayoutDirection(mapBuffer3.getString(23)) == 1;
    }

    public static WritableArray measureLines(@NonNull Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, float f11, float f12) {
        Layout layoutCreateLayout = createLayout(context, mapBuffer, mapBuffer2, f11, f12, null);
        return FontMetricsUtil.getFontMetrics(layoutCreateLayout.getText(), layoutCreateLayout, (TextPaint) Preconditions.checkNotNull(sTextPaintInstance.get()), context);
    }

    static {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        ENABLE_MEASURE_LOGGING = false;
        TAG = TextLayoutManager.class.getSimpleName();
        sTextPaintInstance = new ThreadLocal<TextPaint>() { // from class: com.facebook.react.views.text.TextLayoutManager.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public TextPaint initialValue() {
                return new TextPaint(1);
            }
        };
        sTagToSpannableCache = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r21.add(new com.facebook.react.views.text.internal.span.SetSpanOperation(r6, r8, new com.facebook.react.views.text.internal.span.ReactClickableSpan(r11)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void buildSpannableFromFragments(Context context, MapBuffer mapBuffer, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list) {
        int count = mapBuffer.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(i11);
            int length = spannableStringBuilder.length();
            TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.fromMapBuffer(mapBuffer2.getMapBuffer(5));
            spannableStringBuilder.append((CharSequence) TextTransform.apply(mapBuffer2.getString(0), textAttributePropsFromMapBuffer.mTextTransform));
            int length2 = spannableStringBuilder.length();
            int i12 = mapBuffer2.contains(1) ? mapBuffer2.getInt(1) : -1;
            if (mapBuffer2.contains(2) && mapBuffer2.getBoolean(2)) {
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new TextInlineViewPlaceholderSpan(i12, (int) PixelUtil.toPixelFromSP(mapBuffer2.getDouble(3)), (int) PixelUtil.toPixelFromSP(mapBuffer2.getDouble(4)))));
            } else if (length2 >= length) {
                if ((r5 = textAttributePropsFromMapBuffer.mRole) != null) {
                }
                if (textAttributePropsFromMapBuffer.mIsColorSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactForegroundColorSpan(textAttributePropsFromMapBuffer.mColor)));
                }
                if (textAttributePropsFromMapBuffer.mIsBackgroundColorSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactBackgroundColorSpan(textAttributePropsFromMapBuffer.mBackgroundColor)));
                }
                if (!Float.isNaN(textAttributePropsFromMapBuffer.getOpacity())) {
                    list.add(new SetSpanOperation(length, length2, new ReactOpacitySpan(textAttributePropsFromMapBuffer.getOpacity())));
                }
                if (!Float.isNaN(textAttributePropsFromMapBuffer.getLetterSpacing())) {
                    list.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(textAttributePropsFromMapBuffer.getLetterSpacing())));
                }
                list.add(new SetSpanOperation(length, length2, new ReactAbsoluteSizeSpan(textAttributePropsFromMapBuffer.mFontSize)));
                if (textAttributePropsFromMapBuffer.mFontStyle != -1 || textAttributePropsFromMapBuffer.mFontWeight != -1 || textAttributePropsFromMapBuffer.mFontFamily != null) {
                    list.add(new SetSpanOperation(length, length2, new CustomStyleSpan(textAttributePropsFromMapBuffer.mFontStyle, textAttributePropsFromMapBuffer.mFontWeight, textAttributePropsFromMapBuffer.mFontFeatureSettings, textAttributePropsFromMapBuffer.mFontFamily, context.getAssets())));
                }
                if (textAttributePropsFromMapBuffer.mIsUnderlineTextDecorationSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactUnderlineSpan()));
                }
                if (textAttributePropsFromMapBuffer.mIsLineThroughTextDecorationSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactStrikethroughSpan()));
                }
                if ((textAttributePropsFromMapBuffer.mTextShadowOffsetDx != 0.0f || textAttributePropsFromMapBuffer.mTextShadowOffsetDy != 0.0f || textAttributePropsFromMapBuffer.mTextShadowRadius != 0.0f) && Color.alpha(textAttributePropsFromMapBuffer.mTextShadowColor) != 0) {
                    list.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(textAttributePropsFromMapBuffer.mTextShadowOffsetDx, textAttributePropsFromMapBuffer.mTextShadowOffsetDy, textAttributePropsFromMapBuffer.mTextShadowRadius, textAttributePropsFromMapBuffer.mTextShadowColor)));
                }
                if (!Float.isNaN(textAttributePropsFromMapBuffer.getEffectiveLineHeight())) {
                    if (ReactNativeFeatureFlags.enableAndroidLineHeightCentering()) {
                        list.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(textAttributePropsFromMapBuffer.getEffectiveLineHeight())));
                    } else {
                        list.add(new SetSpanOperation(length, length2, new LegacyLineHeightSpan(textAttributePropsFromMapBuffer.getEffectiveLineHeight())));
                    }
                }
                list.add(new SetSpanOperation(length, length2, new ReactTagSpan(i12)));
            }
        }
    }

    private static Spannable createSpannableFromAttributedString(Context context, MapBuffer mapBuffer, @Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        buildSpannableFromFragments(context, mapBuffer.getMapBuffer(2), spannableStringBuilder, arrayList);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((SetSpanOperation) arrayList.get((arrayList.size() - i11) - 1)).execute(spannableStringBuilder, i11);
        }
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void deleteCachedSpannableForTag(int i11) {
        if (ENABLE_MEASURE_LOGGING) {
            C45999a.m101507m(TAG, "Delete cached spannable for tag[" + i11 + "]");
        }
        sTagToSpannableCache.remove(Integer.valueOf(i11));
    }

    private static int getTextJustificationMode(@Nullable String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        return (str == null || !str.equals("justified")) ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130  */
    /* JADX WARN: Code duplicated, block: B:80:0x0133  */
    public static long measureText(Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2, ReactTextViewManagerCallback reactTextViewManagerCallback, @Nullable float[] fArr) {
        float fCeil;
        float lineBottom;
        boolean z11;
        char c11;
        float lineRight;
        char c12;
        float lineWidth;
        Layout layoutCreateLayout = createLayout(context, mapBuffer, mapBuffer2, f11, f12, reactTextViewManagerCallback);
        Spannable spannable = (Spannable) layoutCreateLayout.getText();
        if (spannable == null) {
            return 0L;
        }
        int i11 = 0;
        int i12 = -1;
        int i13 = mapBuffer2.contains(0) ? mapBuffer2.getInt(0) : -1;
        int lineCount = (i13 == -1 || i13 == 0) ? layoutCreateLayout.getLineCount() : Math.min(i13, layoutCreateLayout.getLineCount());
        char c13 = '\n';
        boolean z12 = true;
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            fCeil = f11;
        } else {
            fCeil = 0.0f;
            for (int i14 = 0; i14 < lineCount; i14++) {
                boolean z13 = spannable.length() > 0 && spannable.charAt(layoutCreateLayout.getLineEnd(i14) - 1) == '\n';
                if (!z13 && i14 + 1 < layoutCreateLayout.getLineCount()) {
                    fCeil = f11;
                    break;
                }
                float lineMax = z13 ? layoutCreateLayout.getLineMax(i14) : layoutCreateLayout.getLineWidth(i14);
                if (lineMax > fCeil) {
                    fCeil = lineMax;
                }
            }
            if (yogaMeasureMode == YogaMeasureMode.AT_MOST && fCeil > f11) {
                fCeil = f11;
            }
        }
        if (Build.VERSION.SDK_INT > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        if (yogaMeasureMode2 != YogaMeasureMode.EXACTLY) {
            lineBottom = layoutCreateLayout.getLineBottom(lineCount - 1);
            if (yogaMeasureMode2 == YogaMeasureMode.AT_MOST && lineBottom > f12) {
                lineBottom = f12;
            }
        } else {
            lineBottom = f12;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < spannable.length()) {
            int iNextSpanTransition = spannable.nextSpanTransition(i15, spannable.length(), TextInlineViewPlaceholderSpan.class);
            TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spannable.getSpans(i15, iNextSpanTransition, TextInlineViewPlaceholderSpan.class);
            int length = textInlineViewPlaceholderSpanArr.length;
            int i17 = i11;
            while (i17 < length) {
                TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr[i17];
                int spanStart = spannable.getSpanStart(textInlineViewPlaceholderSpan);
                int lineForOffset = layoutCreateLayout.getLineForOffset(spanStart);
                if (layoutCreateLayout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layoutCreateLayout.getLineStart(lineForOffset) + layoutCreateLayout.getEllipsisStart(lineForOffset) || spanStart >= layoutCreateLayout.getLineEnd(lineForOffset)) {
                    float width = textInlineViewPlaceholderSpan.getWidth();
                    float height = textInlineViewPlaceholderSpan.getHeight();
                    z11 = z12;
                    boolean zIsRtlCharAt = layoutCreateLayout.isRtlCharAt(spanStart);
                    boolean z14 = layoutCreateLayout.getParagraphDirection(lineForOffset) == i12 ? z11 : false;
                    if (spanStart == spannable.length() - 1) {
                        if (spannable.length() > 0) {
                            c12 = '\n';
                            if (spannable.charAt(layoutCreateLayout.getLineEnd(lineForOffset) - 1) == '\n') {
                                lineWidth = layoutCreateLayout.getLineMax(lineForOffset);
                            }
                            if (z14) {
                                lineRight = fCeil - lineWidth;
                            } else {
                                lineRight = layoutCreateLayout.getLineRight(lineForOffset) - width;
                            }
                            c11 = c12;
                        } else {
                            c12 = '\n';
                        }
                        lineWidth = layoutCreateLayout.getLineWidth(lineForOffset);
                        if (z14) {
                            lineRight = fCeil - lineWidth;
                        } else {
                            lineRight = layoutCreateLayout.getLineRight(lineForOffset) - width;
                        }
                        c11 = c12;
                    } else {
                        c11 = '\n';
                        float primaryHorizontal = z14 == zIsRtlCharAt ? layoutCreateLayout.getPrimaryHorizontal(spanStart) : layoutCreateLayout.getSecondaryHorizontal(spanStart);
                        float lineRight2 = (!z14 || zIsRtlCharAt) ? primaryHorizontal : fCeil - (layoutCreateLayout.getLineRight(lineForOffset) - primaryHorizontal);
                        lineRight = zIsRtlCharAt ? lineRight2 - width : lineRight2;
                    }
                    int i18 = i16 * 2;
                    fArr[i18] = PixelUtil.toDIPFromPixel(layoutCreateLayout.getLineBaseline(lineForOffset) - height);
                    fArr[i18 + 1] = PixelUtil.toDIPFromPixel(lineRight);
                    i16++;
                } else {
                    c11 = c13;
                    z11 = z12;
                }
                i17++;
                z12 = z11;
                c13 = c11;
                i11 = 0;
                i12 = -1;
            }
            i15 = iNextSpanTransition;
        }
        float dIPFromPixel = PixelUtil.toDIPFromPixel(fCeil);
        float dIPFromPixel2 = PixelUtil.toDIPFromPixel(lineBottom);
        if (ENABLE_MEASURE_LOGGING) {
            C45999a.m101507m(TAG, "TextMeasure call ('" + ((Object) spannable) + "'): w: " + fCeil + " px - h: " + lineBottom + " px - w : " + dIPFromPixel + " sp - h: " + dIPFromPixel2 + " sp");
        }
        return C36635h.m81966a(dIPFromPixel, dIPFromPixel2);
    }

    public static void setCachedSpannableForTag(int i11, @NonNull Spannable spannable) {
        if (ENABLE_MEASURE_LOGGING) {
            C45999a.m101507m(TAG, "Set cached spannable for tag[" + i11 + "]: " + spannable.toString());
        }
        sTagToSpannableCache.put(Integer.valueOf(i11), spannable);
    }

    private static Layout.Alignment getTextAlignment(MapBuffer mapBuffer, Spannable spannable, @Nullable String str) {
        Layout.Alignment alignment;
        boolean z11 = false;
        if (isRTL(mapBuffer) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length())) {
            z11 = true;
        }
        if (z11) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        if (str != null) {
            if (str.equals(TtmlNode.CENTER)) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (str.equals("right")) {
                if (z11) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return alignment;
        }
        return alignment;
    }

    public static int getTextGravity(MapBuffer mapBuffer, Spannable spannable, int i11) {
        Layout.Alignment textAlignment = getTextAlignment(mapBuffer, spannable, getTextAlignmentAttr(mapBuffer));
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        if (textAlignment == Layout.Alignment.ALIGN_NORMAL) {
            if (!zIsRtl) {
                return 3;
            }
            return 5;
        }
        if (textAlignment == Layout.Alignment.ALIGN_OPPOSITE) {
            if (zIsRtl) {
                return 3;
            }
            return 5;
        }
        if (textAlignment == Layout.Alignment.ALIGN_CENTER) {
            return 1;
        }
        return i11;
    }

    private static void updateTextPaint(TextPaint textPaint, TextAttributeProps textAttributeProps, Context context) {
        float f11;
        textPaint.reset();
        boolean z11 = true;
        textPaint.setAntiAlias(true);
        if (textAttributeProps.getEffectiveFontSize() != -1) {
            textPaint.setTextSize(textAttributeProps.getEffectiveFontSize());
        }
        if (textAttributeProps.getFontStyle() == -1 && textAttributeProps.getFontWeight() == -1 && textAttributeProps.getFontFamily() == null) {
            textPaint.setTypeface(null);
            return;
        }
        Typeface typefaceApplyStyles = ReactTypefaceUtils.applyStyles(null, textAttributeProps.getFontStyle(), textAttributeProps.getFontWeight(), textAttributeProps.getFontFamily(), context.getAssets());
        textPaint.setTypeface(typefaceApplyStyles);
        if (textAttributeProps.getFontStyle() != -1 && textAttributeProps.getFontStyle() != typefaceApplyStyles.getStyle()) {
            int fontStyle = textAttributeProps.getFontStyle() & (~typefaceApplyStyles.getStyle());
            if ((fontStyle & 1) == 0) {
                z11 = false;
            }
            textPaint.setFakeBoldText(z11);
            if ((fontStyle & 2) != 0) {
                f11 = -0.25f;
            } else {
                f11 = 0.0f;
            }
            textPaint.setTextSkewX(f11);
        }
    }

    private static Layout createLayout(@NonNull Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, float f11, float f12, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        TextPaint textPaint;
        Spannable spannable;
        boolean z11;
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(context, mapBuffer, reactTextViewManagerCallback);
        if (mapBuffer.contains(3)) {
            textPaint = ((ReactTextPaintHolderSpan[]) orCreateSpannableForText.getSpans(0, 0, ReactTextPaintHolderSpan.class))[0].getTextPaint();
        } else {
            TextAttributeProps textAttributePropsFromMapBuffer = TextAttributeProps.fromMapBuffer(mapBuffer.getMapBuffer(4));
            TextPaint textPaint2 = (TextPaint) Preconditions.checkNotNull(sTextPaintInstance.get());
            updateTextPaint(textPaint2, textAttributePropsFromMapBuffer, context);
            textPaint = textPaint2;
        }
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(orCreateSpannableForText, textPaint);
        int textBreakStrategy = TextAttributeProps.getTextBreakStrategy(mapBuffer2.getString(2));
        boolean z12 = mapBuffer2.contains(4) ? mapBuffer2.getBoolean(4) : true;
        int hyphenationFrequency = TextAttributeProps.getHyphenationFrequency(mapBuffer2.getString(5));
        boolean z13 = mapBuffer2.contains(3) ? mapBuffer2.getBoolean(3) : false;
        int i11 = mapBuffer2.contains(0) ? mapBuffer2.getInt(0) : -1;
        String textAlignmentAttr = getTextAlignmentAttr(mapBuffer);
        Layout.Alignment textAlignment = getTextAlignment(mapBuffer, orCreateSpannableForText, textAlignmentAttr);
        int textJustificationMode = getTextJustificationMode(textAlignmentAttr);
        if (z13) {
            spannable = orCreateSpannableForText;
            z11 = z12;
            adjustSpannableFontToFit(spannable, f11, YogaMeasureMode.EXACTLY, f12, YogaMeasureMode.UNDEFINED, mapBuffer2.contains(6) ? mapBuffer2.getDouble(6) : Double.NaN, i11, z11, textBreakStrategy, hyphenationFrequency, textAlignment, textJustificationMode, textPaint);
        } else {
            spannable = orCreateSpannableForText;
            z11 = z12;
        }
        return createLayout(spannable, metricsIsBoring, f11, YogaMeasureMode.EXACTLY, z11, textBreakStrategy, hyphenationFrequency, textAlignment, textJustificationMode, textPaint);
    }
}
