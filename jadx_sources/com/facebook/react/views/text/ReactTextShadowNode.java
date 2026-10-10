package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.AbstractC6262a;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.Map;
import p193d7.C36633f;
import p193d7.C36635h;
import p193d7.InterfaceC36628a;
import p193d7.InterfaceC36634g;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    private static final TextPaint sTextPaintInstance = new TextPaint(1);

    @Nullable
    private Spannable mPreparedSpannableText;
    private boolean mShouldNotifyOnTextLayout;
    private final InterfaceC36628a mTextBaselineFunction;
    private final InterfaceC36634g mTextMeasureFunction;

    public ReactTextShadowNode() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        this.mPreparedSpannableText = spannedFromShadowNode(this, null, true, nativeViewHierarchyOptimizer);
        markUpdated();
    }

    public ReactTextShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mTextMeasureFunction = new InterfaceC36634g() { // from class: com.facebook.react.views.text.ReactTextShadowNode.1
            /* JADX WARN: Code duplicated, block: B:58:0x0171  */
            @Override // p193d7.InterfaceC36634g
            public long measure(AbstractC6262a abstractC6262a, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2) {
                float lineBottom;
                float fCeil = f11;
                Spannable spannable = (Spannable) C38115a.m86048d(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
                Layout layoutMeasureSpannedText = ReactTextShadowNode.this.measureSpannedText(spannable, fCeil, yogaMeasureMode);
                ReactTextShadowNode reactTextShadowNode = ReactTextShadowNode.this;
                int i11 = -1;
                int i12 = 0;
                int i13 = 1;
                if (reactTextShadowNode.mAdjustsFontSizeToFit) {
                    int effectiveFontSize = reactTextShadowNode.mTextAttributes.getEffectiveFontSize();
                    int effectiveFontSize2 = ReactTextShadowNode.this.mTextAttributes.getEffectiveFontSize();
                    float f13 = effectiveFontSize;
                    int iMax = (int) Math.max(ReactTextShadowNode.this.mMinimumFontScale * f13, PixelUtil.toPixelFromDIP(4.0f));
                    while (effectiveFontSize2 > iMax && ((ReactTextShadowNode.this.mNumberOfLines != i11 && layoutMeasureSpannedText.getLineCount() > ReactTextShadowNode.this.mNumberOfLines) || (yogaMeasureMode2 != YogaMeasureMode.UNDEFINED && layoutMeasureSpannedText.getHeight() > f12))) {
                        effectiveFontSize2 -= Math.max(i13, (int) PixelUtil.toPixelFromDIP(1.0f));
                        float f14 = effectiveFontSize2 / f13;
                        ReactAbsoluteSizeSpan[] reactAbsoluteSizeSpanArr = (ReactAbsoluteSizeSpan[]) spannable.getSpans(i12, spannable.length(), ReactAbsoluteSizeSpan.class);
                        int length = reactAbsoluteSizeSpanArr.length;
                        int i14 = i12;
                        while (i14 < length) {
                            ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = reactAbsoluteSizeSpanArr[i14];
                            spannable.setSpan(new ReactAbsoluteSizeSpan((int) Math.max(reactAbsoluteSizeSpan.getSize() * f14, iMax)), spannable.getSpanStart(reactAbsoluteSizeSpan), spannable.getSpanEnd(reactAbsoluteSizeSpan), spannable.getSpanFlags(reactAbsoluteSizeSpan));
                            spannable.removeSpan(reactAbsoluteSizeSpan);
                            i14++;
                            i13 = i13;
                            f14 = f14;
                        }
                        layoutMeasureSpannedText = ReactTextShadowNode.this.measureSpannedText(spannable, fCeil, yogaMeasureMode);
                        i11 = -1;
                        i12 = 0;
                    }
                }
                if (ReactTextShadowNode.this.mShouldNotifyOnTextLayout) {
                    ThemedReactContext themedContext = ReactTextShadowNode.this.getThemedContext();
                    WritableArray fontMetrics = FontMetricsUtil.getFontMetrics(spannable, layoutMeasureSpannedText, ReactTextShadowNode.sTextPaintInstance, themedContext);
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putArray("lines", fontMetrics);
                    if (themedContext.hasActiveReactInstance()) {
                        ((RCTEventEmitter) themedContext.getJSModule(RCTEventEmitter.class)).receiveEvent(ReactTextShadowNode.this.getReactTag(), "topTextLayout", writableMapCreateMap);
                    } else {
                        ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
                    }
                }
                int i15 = ReactTextShadowNode.this.mNumberOfLines;
                int lineCount = i15 == -1 ? layoutMeasureSpannedText.getLineCount() : Math.min(i15, layoutMeasureSpannedText.getLineCount());
                if (yogaMeasureMode != YogaMeasureMode.EXACTLY) {
                    float f15 = 0.0f;
                    for (int i16 = 0; i16 < lineCount; i16++) {
                        float lineWidth = (spannable.length() <= 0 || spannable.charAt(layoutMeasureSpannedText.getLineEnd(i16) + (-1)) != '\n') ? layoutMeasureSpannedText.getLineWidth(i16) : layoutMeasureSpannedText.getLineMax(i16);
                        if (lineWidth > f15) {
                            f15 = lineWidth;
                        }
                    }
                    if (yogaMeasureMode != YogaMeasureMode.AT_MOST || f15 <= fCeil) {
                        fCeil = f15;
                    }
                }
                if (Build.VERSION.SDK_INT > 29) {
                    fCeil = (float) Math.ceil(fCeil);
                }
                if (yogaMeasureMode2 != YogaMeasureMode.EXACTLY) {
                    lineBottom = layoutMeasureSpannedText.getLineBottom(lineCount - 1);
                    if (yogaMeasureMode2 == YogaMeasureMode.AT_MOST && lineBottom > f12) {
                        lineBottom = f12;
                    }
                } else {
                    lineBottom = f12;
                }
                return C36635h.m81966a(fCeil, lineBottom);
            }
        };
        this.mTextBaselineFunction = new InterfaceC36628a() { // from class: com.facebook.react.views.text.ReactTextShadowNode.2
            @Override // p193d7.InterfaceC36628a
            public float baseline(AbstractC6262a abstractC6262a, float f11, float f12) {
                Layout layoutMeasureSpannedText = ReactTextShadowNode.this.measureSpannedText((Spannable) C38115a.m86048d(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout"), f11, YogaMeasureMode.EXACTLY);
                return layoutMeasureSpannedText.getLineBaseline(layoutMeasureSpannedText.getLineCount() - 1);
            }
        };
        initMeasureFunction();
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

    /* JADX INFO: Access modifiers changed from: private */
    public Layout measureSpannedText(Spannable spannable, float f11, YogaMeasureMode yogaMeasureMode) {
        TextPaint textPaint = sTextPaintInstance;
        textPaint.setTextSize(this.mTextAttributes.getEffectiveFontSize());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z11 = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f11 < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int textAlign = getTextAlign();
        if (textAlign == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (textAlign != 3 && textAlign == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (metricsIsBoring == null && (z11 || (!C36633f.m81965a(desiredWidth) && desiredWidth <= f11))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                hyphenationFrequency.setJustificationMode(this.mJustificationMode);
            }
            if (i11 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
        if (metricsIsBoring != null && (z11 || metricsIsBoring.width <= f11)) {
            return BoringLayout.make(spannable, textPaint, Math.max(metricsIsBoring.width, 0), alignment, 1.0f, 0.0f, metricsIsBoring, this.mIncludeFontPadding);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 29) {
            f11 = (float) Math.ceil(f11);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f11).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
        if (i12 >= 26) {
            hyphenationFrequency2.setJustificationMode(this.mJustificationMode);
        }
        if (i12 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        return hyphenationFrequency2.build();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @Nullable
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        Map<Integer, ReactShadowNode> map = this.mInlineViews;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spanned spanned = (Spanned) C38115a.m86048d(this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spanned.getSpans(0, spanned.length(), TextInlineViewPlaceholderSpan.class);
        ArrayList arrayList = new ArrayList(textInlineViewPlaceholderSpanArr.length);
        for (TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan : textInlineViewPlaceholderSpanArr) {
            ReactShadowNode reactShadowNode = this.mInlineViews.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
            reactShadowNode.calculateLayout();
            arrayList.add(reactShadowNode);
        }
        return arrayList;
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z11) {
        this.mShouldNotifyOnTextLayout = z11;
    }

    private void initMeasureFunction() {
        if (!isVirtual()) {
            setMeasureFunction(this.mTextMeasureFunction);
            setBaselineFunction(this.mTextBaselineFunction);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mPreparedSpannableText != null) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(this.mPreparedSpannableText, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy, this.mJustificationMode));
        }
    }
}
