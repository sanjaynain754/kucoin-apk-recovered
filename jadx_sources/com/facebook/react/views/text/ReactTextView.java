package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.SystraceSection;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactTextView extends AppCompatTextView implements ReactCompoundView {
    private static final int DEFAULT_GRAVITY = 8388659;
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mAdjustsFontSizeToFit;
    private boolean mContainsImages;
    private TextUtils.TruncateAt mEllipsizeLocation;
    private float mFontSize;
    private float mLetterSpacing;
    private int mLinkifyMaskType;
    private float mMinimumFontSize;
    private boolean mNotifyOnInlineViewLayout;
    private int mNumberOfLines;
    private Overflow mOverflow;
    private boolean mShouldAdjustSpannableFontSize;
    private Spannable mSpanned;
    private boolean mTextIsSelectable;

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setBorderRadius(float f11) {
        setBorderRadius(f11, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    private void applyTextAttributes() {
        if (!Float.isNaN(this.mFontSize)) {
            setTextSize(0, this.mFontSize);
        }
        if (Float.isNaN(this.mLetterSpacing)) {
            return;
        }
        super.setLetterSpacing(this.mLetterSpacing);
    }

    public Spannable getSpanned() {
        return this.mSpanned;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onDraw");
        try {
            if (this.mAdjustsFontSizeToFit && getSpanned() != null && this.mShouldAdjustSpannableFontSize) {
                this.mShouldAdjustSpannableFontSize = false;
                Spannable spanned = getSpanned();
                float width = getWidth();
                YogaMeasureMode yogaMeasureMode = YogaMeasureMode.EXACTLY;
                TextLayoutManager.adjustSpannableFontToFit(spanned, width, yogaMeasureMode, getHeight(), yogaMeasureMode, this.mMinimumFontSize, this.mNumberOfLines, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(getSpanned());
            }
            if (this.mOverflow != Overflow.VISIBLE) {
                BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
            }
            super.onDraw(canvas);
            systraceSection.close();
        } catch (Throwable th2) {
            try {
                systraceSection.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr;
        int i15;
        Spanned spanned;
        int primaryHorizontal;
        float lineWidth;
        int id2 = getId();
        if (!(getText() instanceof Spanned) || ViewUtil.getUIManagerType(id2) == 2) {
            return;
        }
        UIManagerModule uIManagerModule = (UIManagerModule) C38115a.m86047c((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class));
        Spanned spanned2 = (Spanned) getText();
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr2 = (TextInlineViewPlaceholderSpan[]) spanned2.getSpans(0, spanned2.length(), TextInlineViewPlaceholderSpan.class);
        ArrayList arrayList = this.mNotifyOnInlineViewLayout ? new ArrayList(textInlineViewPlaceholderSpanArr2.length) : null;
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        int length = textInlineViewPlaceholderSpanArr2.length;
        int i18 = 0;
        while (i18 < length) {
            TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = textInlineViewPlaceholderSpanArr2[i18];
            View viewResolveView = uIManagerModule.resolveView(textInlineViewPlaceholderSpan.getReactTag());
            int spanStart = spanned2.getSpanStart(textInlineViewPlaceholderSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.mNumberOfLines && spanStart < layout.getLineEnd(lineForOffset)) {
                int width = textInlineViewPlaceholderSpan.getWidth();
                int height = textInlineViewPlaceholderSpan.getHeight();
                textInlineViewPlaceholderSpanArr = textInlineViewPlaceholderSpanArr2;
                boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
                i15 = length;
                boolean z12 = layout.getParagraphDirection(lineForOffset) == -1;
                if (spanStart == spanned2.length() - 1) {
                    if (spanned2.length() > 0) {
                        spanned = spanned2;
                        if (spanned2.charAt(layout.getLineEnd(lineForOffset) - 1) == '\n') {
                            lineWidth = layout.getLineMax(lineForOffset);
                        }
                        if (z12) {
                            primaryHorizontal = i16 - ((int) lineWidth);
                        } else {
                            primaryHorizontal = (int) layout.getLineRight(lineForOffset);
                            primaryHorizontal -= width;
                        }
                    } else {
                        spanned = spanned2;
                    }
                    lineWidth = layout.getLineWidth(lineForOffset);
                    if (z12) {
                        primaryHorizontal = i16 - ((int) lineWidth);
                    } else {
                        primaryHorizontal = (int) layout.getLineRight(lineForOffset);
                        primaryHorizontal -= width;
                    }
                } else {
                    spanned = spanned2;
                    primaryHorizontal = (int) (z12 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                    if (z12) {
                        primaryHorizontal = i16 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal);
                    }
                    if (zIsRtlCharAt) {
                        primaryHorizontal -= width;
                    }
                }
                int totalPaddingRight = primaryHorizontal + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                int i19 = i11 + totalPaddingRight;
                int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - height;
                int i21 = i12 + totalPaddingTop;
                int i22 = (i16 <= totalPaddingRight || i17 <= totalPaddingTop) ? 8 : 0;
                int i23 = i19 + width;
                int i24 = height + i21;
                viewResolveView.setVisibility(i22);
                viewResolveView.layout(i19, i21, i23, i24);
                if (this.mNotifyOnInlineViewLayout) {
                    arrayList.add(inlineViewJson(i22, spanStart, i19, i21, i23, i24));
                }
            } else {
                spanned = spanned2;
                textInlineViewPlaceholderSpanArr = textInlineViewPlaceholderSpanArr2;
                i15 = length;
                viewResolveView.setVisibility(8);
                if (this.mNotifyOnInlineViewLayout) {
                    arrayList.add(inlineViewJson(8, spanStart, -1, -1, -1, -1));
                }
            }
            i18++;
            textInlineViewPlaceholderSpanArr2 = textInlineViewPlaceholderSpanArr;
            length = i15;
            spanned2 = spanned;
        }
        if (this.mNotifyOnInlineViewLayout) {
            Collections.sort(arrayList, new Comparator() { // from class: com.facebook.react.views.text.ReactTextView.1
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
                }
            });
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap((WritableMap) it.next());
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("inlineViews", writableArrayCreateArray);
            if (uIManagerModule != null) {
                uIManagerModule.receiveEvent(id2, "topInlineViewLayout", writableMapCreateMap);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.onMeasure");
        try {
            super.onMeasure(i11, i12);
            systraceSection.close();
        } catch (Throwable th2) {
            try {
                systraceSection.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void setAdjustFontSizeToFit(boolean z11) {
        this.mAdjustsFontSizeToFit = z11;
    }

    public void setBorderRadius(float f11, int i11) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f11), LengthPercentageType.POINT));
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setFontSize(float f11) {
        this.mFontSize = (float) (this.mAdjustsFontSizeToFit ? Math.ceil(PixelUtil.toPixelFromSP(f11)) : Math.ceil(PixelUtil.toPixelFromDIP(f11)));
        applyTextAttributes();
    }

    public void setGravityHorizontal(int i11) {
        if (i11 == 0) {
            i11 = GravityCompat.START;
        }
        setGravity(i11 | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i11) {
        if (i11 == 0) {
            i11 = 48;
        }
        setGravity(i11 | (getGravity() & (-113)));
    }

    public void setLinkifyMask(int i11) {
        this.mLinkifyMaskType = i11;
    }

    public void setMinimumFontSize(float f11) {
        this.mMinimumFontSize = f11;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z11) {
        this.mNotifyOnInlineViewLayout = z11;
    }

    public void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i11;
        setMaxLines(i11);
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setOverflow(@Nullable String str) {
        if (str == null) {
            this.mOverflow = Overflow.VISIBLE;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.VISIBLE;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.mSpanned = spannable;
        this.mShouldAdjustSpannableFontSize = true;
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        SystraceSection systraceSection = new SystraceSection("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.mContainsImages = reactTextUpdate.getContainsImages();
            if (getLayoutParams() == null) {
                setLayoutParams(EMPTY_LAYOUT_PARAMS);
            }
            Spannable text = reactTextUpdate.getText();
            int i11 = this.mLinkifyMaskType;
            if (i11 > 0) {
                Linkify.addLinks(text, i11);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(text);
            float paddingLeft = reactTextUpdate.getPaddingLeft();
            float paddingTop = reactTextUpdate.getPaddingTop();
            float paddingRight = reactTextUpdate.getPaddingRight();
            float paddingBottom = reactTextUpdate.getPaddingBottom();
            if (paddingLeft != -1.0f && paddingTop != -1.0f && paddingRight != -1.0f && paddingBottom != -1.0f) {
                setPadding((int) Math.floor(paddingLeft), (int) Math.floor(paddingTop), (int) Math.floor(paddingRight), (int) Math.floor(paddingBottom));
            }
            int textAlign = reactTextUpdate.getTextAlign();
            if (textAlign != getGravityHorizontal()) {
                setGravityHorizontal(textAlign);
            }
            if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
                setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != reactTextUpdate.getJustificationMode()) {
                setJustificationMode(reactTextUpdate.getJustificationMode());
            }
            requestLayout();
            systraceSection.close();
        } catch (Throwable th2) {
            try {
                systraceSection.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z11) {
        this.mTextIsSelectable = z11;
        super.setTextIsSelectable(z11);
    }

    public void updateView() {
        setEllipsize((this.mNumberOfLines == Integer.MAX_VALUE || this.mAdjustsFontSizeToFit) ? null : this.mEllipsizeLocation);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public ReactTextView(Context context) {
        super(context);
        this.mOverflow = Overflow.VISIBLE;
        initView();
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof TintContextWrapper) {
            return (ReactContext) ((TintContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private void initView() {
        this.mNumberOfLines = Integer.MAX_VALUE;
        this.mAdjustsFontSizeToFit = false;
        this.mLinkifyMaskType = 0;
        this.mNotifyOnInlineViewLayout = false;
        this.mTextIsSelectable = false;
        this.mShouldAdjustSpannableFontSize = false;
        this.mEllipsizeLocation = TextUtils.TruncateAt.END;
        this.mFontSize = Float.NaN;
        this.mMinimumFontSize = Float.NaN;
        this.mLetterSpacing = 0.0f;
        this.mOverflow = Overflow.VISIBLE;
        this.mSpanned = null;
    }

    private static WritableMap inlineViewJson(int i11, int i12, int i13, int i14, int i15, int i16) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i11 == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i12);
            return writableMapCreateMap;
        }
        if (i11 == 0) {
            writableMapCreateMap.putString("visibility", ViewProps.VISIBLE);
            writableMapCreateMap.putInt("index", i12);
            writableMapCreateMap.putDouble("left", PixelUtil.toDIPFromPixel(i13));
            writableMapCreateMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(i14));
            writableMapCreateMap.putDouble("right", PixelUtil.toDIPFromPixel(i15));
            writableMapCreateMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(i16));
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("visibility", "unknown");
        writableMapCreateMap.putInt("index", i12);
        return writableMapCreateMap;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (ViewCompat.hasAccessibilityDelegate(this)) {
            AccessibilityDelegateCompat accessibilityDelegate = ViewCompat.getAccessibilityDelegate(this);
            if (accessibilityDelegate instanceof ExploreByTouchHelper) {
                if (!((ExploreByTouchHelper) accessibilityDelegate).dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public int getGravityHorizontal() {
        return getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.mTextIsSelectable);
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f11, float f12) {
        int i11;
        CharSequence text = getText();
        int id2 = getId();
        int i12 = (int) f11;
        int i13 = (int) f12;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i13);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i12 >= lineLeft && i12 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i12);
                    ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
                    if (reactTagSpanArr != null) {
                        int length = text.length();
                        for (int i14 = 0; i14 < reactTagSpanArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(reactTagSpanArr[i14]);
                            int spanEnd = spanned.getSpanEnd(reactTagSpanArr[i14]);
                            if (spanEnd >= offsetForHorizontal && (i11 = spanEnd - spanStart) <= length) {
                                id2 = reactTagSpanArr[i14].getReactTag();
                                length = i11;
                            }
                        }
                        return id2;
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    C45999a.m101507m(ReactConstants.TAG, "Crash in HorizontalMeasurementProvider: " + e11.getMessage());
                }
            }
        }
        return id2;
    }

    public void recycleView() {
        initView();
        BackgroundStyleApplicator.reset(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(EMPTY_LAYOUT_PARAMS);
        super.setText((CharSequence) null);
        applyTextAttributes();
        setGravity(8388659);
        setNumberOfLines(this.mNumberOfLines);
        setAdjustFontSizeToFit(this.mAdjustsFontSizeToFit);
        setLinkifyMask(this.mLinkifyMaskType);
        setTextIsSelectable(this.mTextIsSelectable);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.mEllipsizeLocation);
        setEnabled(true);
        if (i11 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        updateView();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i11));
    }

    public void setBorderColor(int i11, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i11], num);
    }

    public void setBorderWidth(int i11, float f11) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i11], Float.valueOf(PixelUtil.toDIPFromPixel(f11)));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i11) {
        super.setBreakStrategy(i11);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i11) {
        super.setHyphenationFrequency(i11);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z11) {
        super.setIncludeFontPadding(z11);
        this.mShouldAdjustSpannableFontSize = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        this.mLetterSpacing = PixelUtil.toPixelFromDIP(f11) / this.mFontSize;
        applyTextAttributes();
    }
}
