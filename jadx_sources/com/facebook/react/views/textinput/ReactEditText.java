package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.util.Predicate;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributes;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.LegacyLineHeightSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTextPaintHolderSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33675gh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
public class ReactEditText extends AppCompatEditText {
    public static final boolean DEBUG_MODE;
    private static final KeyListener sKeyListener;
    private final String TAG;
    private boolean mAutoFocus;
    protected boolean mContainsImages;

    @Nullable
    private ContentSizeWatcher mContentSizeWatcher;
    private boolean mContextMenuHidden;
    private final int mDefaultGravityHorizontal;
    private final int mDefaultGravityVertical;
    private boolean mDetectScrollMovement;
    private boolean mDidAttachToWindow;
    private boolean mDisableFullscreen;
    protected boolean mDisableTextDiffing;

    @Nullable
    private EventDispatcher mEventDispatcher;

    @Nullable
    private String mFontFamily;
    private int mFontStyle;
    private int mFontWeight;
    private final InputMethodManager mInputMethodManager;
    protected boolean mIsSettingTextFromJS;
    protected boolean mIsSettingTextFromState;
    private InternalKeyListener mKeyListener;

    @Nullable
    private ArrayList<TextWatcher> mListeners;
    protected int mNativeEventCount;
    private boolean mOnKeyPress;
    private Overflow mOverflow;

    @Nullable
    private String mPlaceholder;

    @Nullable
    private String mReturnKeyType;

    @Nullable
    private ScrollWatcher mScrollWatcher;
    private boolean mSelectTextOnFocus;

    @Nullable
    private SelectionWatcher mSelectionWatcher;
    private int mStagedInputType;
    private StateWrapper mStateWrapper;

    @Nullable
    private String mSubmitBehavior;
    private TextAttributes mTextAttributes;

    @Nullable
    private TextWatcherDelegator mTextWatcherDelegator;
    private boolean mTypefaceDirty;

    public static class InternalKeyListener implements KeyListener {
        private int mInputType = 0;

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.mInputType;
        }

        public void setInputType(int i11) {
            this.mInputType = i11;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i11) {
            ReactEditText.sKeyListener.clearMetaKeyState(view, editable, i11);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyDown(view, editable, i11, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyUp(view, editable, i11, keyEvent);
        }
    }

    public class TextWatcherDelegator implements TextWatcher {
        private TextWatcherDelegator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ReactEditText reactEditText = ReactEditText.this;
            if (reactEditText.mIsSettingTextFromJS || reactEditText.mListeners == null) {
                return;
            }
            Iterator it = ReactEditText.this.mListeners.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            ReactEditText reactEditText = ReactEditText.this;
            if (reactEditText.mIsSettingTextFromJS || reactEditText.mListeners == null) {
                return;
            }
            Iterator it = ReactEditText.this.mListeners.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i11, i12, i13);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (ReactEditText.DEBUG_MODE) {
                C45999a.m101507m(ReactEditText.this.TAG, "onTextChanged[" + ReactEditText.this.getId() + "]: " + ((Object) charSequence) + C33627eb.f69716f + i11 + C33627eb.f69716f + i12 + C33627eb.f69716f + i13);
            }
            ReactEditText reactEditText = ReactEditText.this;
            if (!reactEditText.mIsSettingTextFromJS && reactEditText.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i11, i12, i13);
                }
            }
            ReactEditText.this.updateCachedSpannable();
            ReactEditText.this.onContentSizeChange();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean requestFocusInternal() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            showSoftKeyboard();
        }
        return zRequestFocus;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void updateImeOptions() {
        int i11 = 5;
        String str = this.mReturnKeyType;
        if (str != null) {
            str.getClass();
            byte b11 = -1;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        b11 = 0;
                    }
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        b11 = 1;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        b11 = 2;
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        b11 = 3;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        b11 = 4;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        b11 = 5;
                    }
                    break;
                case 3526536:
                    if (str.equals(C33675gh.f70005k)) {
                        b11 = 6;
                    }
                    break;
            }
            switch (b11) {
                case 0:
                    i11 = 7;
                    break;
                case 1:
                    i11 = 3;
                    break;
                case 2:
                    i11 = 2;
                    break;
                case 3:
                default:
                    i11 = 6;
                    break;
                case 4:
                    break;
                case 5:
                    i11 = 1;
                    break;
                case 6:
                    i11 = 4;
                    break;
            }
        } else {
            i11 = 6;
        }
        if (this.mDisableFullscreen) {
            setImeOptions(i11 | 33554432);
        } else {
            setImeOptions(i11);
        }
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        hideSoftKeyboard();
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    public void maybeSetSelection(int i11, int i12, int i13) {
        if (canUpdateWithEventCount(i11)) {
            maybeSetSelection(i12, i13);
        }
    }

    public void maybeSetTextFromJS(ReactTextUpdate reactTextUpdate) {
        this.mIsSettingTextFromJS = true;
        maybeSetText(reactTextUpdate);
        this.mIsSettingTextFromJS = false;
    }

    public void maybeSetTextFromState(ReactTextUpdate reactTextUpdate) {
        this.mIsSettingTextFromState = true;
        maybeSetText(reactTextUpdate);
        this.mIsSettingTextFromState = false;
    }

    public void setBorderRadius(float f11) {
        setBorderRadius(f11, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    static {
        ReactBuildConfig reactBuildConfig = ReactBuildConfig.INSTANCE;
        DEBUG_MODE = false;
        sKeyListener = QwertyKeyListener.getInstanceForFullKeyboard();
    }

    private void addSpansFromStyleAttributes(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new ReactAbsoluteSizeSpan(this.mTextAttributes.getEffectiveFontSize()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new ReactForegroundColorSpan(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer backgroundColor = BackgroundStyleApplicator.getBackgroundColor(this);
        if (backgroundColor != null && backgroundColor.intValue() != 0) {
            spannableStringBuilder.setSpan(new ReactBackgroundColorSpan(backgroundColor.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new ReactStrikethroughSpan(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new ReactUnderlineSpan(), 0, spannableStringBuilder.length(), 16711698);
        }
        float effectiveLetterSpacing = this.mTextAttributes.getEffectiveLetterSpacing();
        if (!Float.isNaN(effectiveLetterSpacing)) {
            spannableStringBuilder.setSpan(new CustomLetterSpacingSpan(effectiveLetterSpacing), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.mFontStyle != -1 || this.mFontWeight != -1 || this.mFontFamily != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new CustomStyleSpan(this.mFontStyle, this.mFontWeight, getFontFeatureSettings(), this.mFontFamily, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float effectiveLineHeight = this.mTextAttributes.getEffectiveLineHeight();
        if (Float.isNaN(effectiveLineHeight)) {
            return;
        }
        if (ReactNativeFeatureFlags.enableAndroidLineHeightCentering()) {
            spannableStringBuilder.setSpan(new CustomLineHeightSpan(effectiveLineHeight), 0, spannableStringBuilder.length(), 16711698);
        } else {
            spannableStringBuilder.setSpan(new LegacyLineHeightSpan(effectiveLineHeight), 0, spannableStringBuilder.length(), 16711698);
        }
    }

    private TextWatcherDelegator getTextWatcherDelegator() {
        if (this.mTextWatcherDelegator == null) {
            this.mTextWatcherDelegator = new TextWatcherDelegator();
        }
        return this.mTextWatcherDelegator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onContentSizeChange() {
        ContentSizeWatcher contentSizeWatcher = this.mContentSizeWatcher;
        if (contentSizeWatcher != null) {
            contentSizeWatcher.onLayout();
        }
        setIntrinsicContentSize();
    }

    private void stripStyleEquivalentSpans(SpannableStringBuilder spannableStringBuilder) {
        stripSpansOfKind(spannableStringBuilder, ReactAbsoluteSizeSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.a
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9948a.lambda$stripStyleEquivalentSpans$0((ReactAbsoluteSizeSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactBackgroundColorSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.b
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9949a.lambda$stripStyleEquivalentSpans$1((ReactBackgroundColorSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactForegroundColorSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.c
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9950a.lambda$stripStyleEquivalentSpans$2((ReactForegroundColorSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactStrikethroughSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.d
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9951a.lambda$stripStyleEquivalentSpans$3((ReactStrikethroughSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactUnderlineSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.e
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9952a.lambda$stripStyleEquivalentSpans$4((ReactUnderlineSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, CustomLetterSpacingSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.f
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9953a.lambda$stripStyleEquivalentSpans$5((CustomLetterSpacingSpan) obj);
            }
        });
        stripSpansOfKind(spannableStringBuilder, CustomStyleSpan.class, new Predicate() { // from class: com.facebook.react.views.textinput.g
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return this.f9954a.lambda$stripStyleEquivalentSpans$6((CustomStyleSpan) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCachedSpannable() {
        if (this.mStateWrapper == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z11 = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z11) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e11) {
                ReactSoftExceptionLogger.logSoftException(this.TAG, e11);
            }
        }
        if (!z11) {
            if (getHint() != null && getHint().length() > 0) {
                spannableStringBuilder.append(getHint());
            } else if (ViewUtil.getUIManagerType(this) != 2) {
                spannableStringBuilder.append("I");
            }
        }
        addSpansFromStyleAttributes(spannableStringBuilder);
        spannableStringBuilder.setSpan(new ReactTextPaintHolderSpan(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        TextLayoutManager.setCachedSpannableForTag(getId(), spannableStringBuilder);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.mListeners.add(textWatcher);
    }

    public void applyTextAttributes() {
        setTextSize(0, this.mTextAttributes.getEffectiveFontSize());
        float effectiveLetterSpacing = this.mTextAttributes.getEffectiveLetterSpacing();
        if (Float.isNaN(effectiveLetterSpacing)) {
            return;
        }
        setLetterSpacing(effectiveLetterSpacing);
    }

    public boolean canUpdateWithEventCount(int i11) {
        return i11 >= this.mNativeEventCount;
    }

    public void finalize() {
        if (DEBUG_MODE) {
            C45999a.m101507m(this.TAG, "finalize[" + getId() + "] delete cached spannable");
        }
        TextLayoutManager.deleteCachedSpannableForTag(getId());
    }

    public boolean getDisableFullscreenUI() {
        return this.mDisableFullscreen;
    }

    public String getReturnKeyType() {
        return this.mReturnKeyType;
    }

    public int getStagedInputType() {
        return this.mStagedInputType;
    }

    @Nullable
    public StateWrapper getStateWrapper() {
        return this.mStateWrapper;
    }

    public String getSubmitBehavior() {
        return this.mSubmitBehavior;
    }

    public void hideSoftKeyboard() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int incrementAndGetEventCounter() {
        int i11 = this.mNativeEventCount + 1;
        this.mNativeEventCount = i11;
        return i11;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public void maybeUpdateTypeface() {
        if (this.mTypefaceDirty) {
            this.mTypefaceDirty = false;
            setTypeface(ReactTypefaceUtils.applyStyles(getTypeface(), this.mFontStyle, this.mFontWeight, this.mFontFamily, getContext().getAssets()));
            if (this.mFontStyle == -1 && this.mFontWeight == -1 && this.mFontFamily == null && getFontFeatureSettings() == null) {
                setPaintFlags(getPaintFlags() & (-129));
            } else {
                setPaintFlags(getPaintFlags() | 128);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mOverflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 66 || isMultiline()) {
            return super.onKeyUp(i11, keyEvent);
        }
        hideSoftKeyboard();
        return true;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i11, int i12) {
        if (DEBUG_MODE) {
            C45999a.m101507m(this.TAG, "onSelectionChanged[" + getId() + "]: " + i11 + C33627eb.f69716f + i12);
        }
        super.onSelectionChanged(i11, i12);
        if (this.mSelectionWatcher == null || !hasFocus()) {
            return;
        }
        this.mSelectionWatcher.onSelectionChanged(i11, i12);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.mListeners.isEmpty()) {
                this.mListeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public void setAllowFontScaling(boolean z11) {
        if (this.mTextAttributes.getAllowFontScaling() != z11) {
            this.mTextAttributes.setAllowFontScaling(z11);
            applyTextAttributes();
        }
    }

    public void setAutoFocus(boolean z11) {
        this.mAutoFocus = z11;
    }

    public void setBorderRadius(float f11, int i11) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f11), LengthPercentageType.POINT));
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setContentSizeWatcher(@Nullable ContentSizeWatcher contentSizeWatcher) {
        this.mContentSizeWatcher = contentSizeWatcher;
    }

    public void setContextMenuHidden(boolean z11) {
        this.mContextMenuHidden = z11;
    }

    public void setDisableFullscreenUI(boolean z11) {
        this.mDisableFullscreen = z11;
        updateImeOptions();
    }

    public void setEventDispatcher(@Nullable EventDispatcher eventDispatcher) {
        this.mEventDispatcher = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.mFontFamily = str;
        this.mTypefaceDirty = true;
    }

    public void setFontSize(float f11) {
        this.mTextAttributes.setFontSize(f11);
        applyTextAttributes();
    }

    public void setGravityHorizontal(int i11) {
        if (i11 == 0) {
            i11 = this.mDefaultGravityHorizontal;
        }
        setGravity(i11 | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i11) {
        if (i11 == 0) {
            i11 = this.mDefaultGravityVertical;
        }
        setGravity(i11 | (getGravity() & (-113)));
    }

    public void setLetterSpacingPt(float f11) {
        this.mTextAttributes.setLetterSpacing(f11);
        applyTextAttributes();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        this.mTextAttributes.setLineHeight(i11);
    }

    public void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f11);
            applyTextAttributes();
        }
    }

    public void setOnKeyPress(boolean z11) {
        this.mOnKeyPress = z11;
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

    public void setPlaceholder(@Nullable String str) {
        if (Objects.equals(str, this.mPlaceholder)) {
            return;
        }
        this.mPlaceholder = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.mReturnKeyType = str;
        updateImeOptions();
    }

    public void setScrollWatcher(@Nullable ScrollWatcher scrollWatcher) {
        this.mScrollWatcher = scrollWatcher;
    }

    @Override // android.widget.EditText
    public void setSelection(int i11, int i12) {
        if (DEBUG_MODE) {
            C45999a.m101507m(this.TAG, "setSelection[" + getId() + "]: " + i11 + C33627eb.f69716f + i12);
        }
        super.setSelection(i11, i12);
    }

    public void setSelectionWatcher(@Nullable SelectionWatcher selectionWatcher) {
        this.mSelectionWatcher = selectionWatcher;
    }

    public void setStagedInputType(int i11) {
        this.mStagedInputType = i11;
    }

    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    public void setSubmitBehavior(@Nullable String str) {
        this.mSubmitBehavior = str;
    }

    public boolean showSoftKeyboard() {
        return this.mInputMethodManager.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public ReactEditText(Context context) {
        super(context);
        this.TAG = ReactEditText.class.getSimpleName();
        this.mSubmitBehavior = null;
        this.mDetectScrollMovement = false;
        this.mOnKeyPress = false;
        this.mTypefaceDirty = false;
        this.mFontFamily = null;
        this.mFontWeight = -1;
        this.mFontStyle = -1;
        this.mAutoFocus = false;
        this.mContextMenuHidden = false;
        this.mDidAttachToWindow = false;
        this.mSelectTextOnFocus = false;
        this.mPlaceholder = null;
        this.mOverflow = Overflow.VISIBLE;
        this.mStateWrapper = null;
        this.mDisableTextDiffing = false;
        this.mIsSettingTextFromState = false;
        setFocusableInTouchMode(false);
        this.mInputMethodManager = (InputMethodManager) C38115a.m86047c(context.getSystemService("input_method"));
        this.mDefaultGravityHorizontal = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        this.mDefaultGravityVertical = getGravity() & 112;
        this.mNativeEventCount = 0;
        this.mIsSettingTextFromJS = false;
        this.mDisableFullscreen = false;
        this.mListeners = null;
        this.mTextWatcherDelegator = null;
        this.mStagedInputType = getInputType();
        if (this.mKeyListener == null) {
            this.mKeyListener = new InternalKeyListener();
        }
        this.mScrollWatcher = null;
        this.mTextAttributes = new TextAttributes();
        applyTextAttributes();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i11 <= 27) {
            setLayerType(1, null);
        }
        ViewCompat.setAccessibilityDelegate(this, new ReactAccessibilityDelegate(this, isFocusable(), getImportantForAccessibility()) { // from class: com.facebook.react.views.textinput.ReactEditText.1
            @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view, int i12, Bundle bundle) {
                if (i12 != 16) {
                    return super.performAccessibilityAction(view, i12, bundle);
                }
                int length = ReactEditText.this.getText().length();
                if (length > 0) {
                    ReactEditText.this.setSelection(length);
                }
                return ReactEditText.this.requestFocusInternal();
            }
        });
        ActionMode.Callback callback = new ActionMode.Callback() { // from class: com.facebook.react.views.textinput.ReactEditText.2
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                if (ReactEditText.this.mContextMenuHidden) {
                    return false;
                }
                menu.removeItem(R.id.pasteAsPlainText);
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode actionMode) {
            }
        };
        setCustomSelectionActionModeCallback(callback);
        setCustomInsertionActionModeCallback(callback);
    }

    private int clampToTextLength(int i11) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            length = getText().length();
        }
        return Math.max(0, Math.min(i11, length));
    }

    private boolean isSecureText() {
        if ((getInputType() & 144) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$0(ReactAbsoluteSizeSpan reactAbsoluteSizeSpan) {
        if (reactAbsoluteSizeSpan.getSize() == this.mTextAttributes.getEffectiveFontSize()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$1(ReactBackgroundColorSpan reactBackgroundColorSpan) {
        return Integer.valueOf(reactBackgroundColorSpan.getBackgroundColor()).equals(BackgroundStyleApplicator.getBackgroundColor(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$2(ReactForegroundColorSpan reactForegroundColorSpan) {
        if (reactForegroundColorSpan.getForegroundColor() == getCurrentTextColor()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$3(ReactStrikethroughSpan reactStrikethroughSpan) {
        if ((getPaintFlags() & 16) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$4(ReactUnderlineSpan reactUnderlineSpan) {
        if ((getPaintFlags() & 8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$5(CustomLetterSpacingSpan customLetterSpacingSpan) {
        if (customLetterSpacingSpan.getSpacing() == this.mTextAttributes.getEffectiveLetterSpacing()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$stripStyleEquivalentSpans$6(CustomStyleSpan customStyleSpan) {
        if (customStyleSpan.getStyle() == this.mFontStyle && Objects.equals(customStyleSpan.getFontFamily(), this.mFontFamily) && customStyleSpan.getWeight() == this.mFontWeight && Objects.equals(customStyleSpan.getFontFeatureSettings(), getFontFeatureSettings())) {
            return true;
        }
        return false;
    }

    private void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        boolean z11;
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            if ((spanFlags & 33) == 33) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (obj instanceof ReactSpan) {
                getText().removeSpan(obj);
            }
            if (z11) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (sameTextForSpan(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private void maybeSetSelection(int i11, int i12) {
        if (i11 == -1 || i12 == -1) {
            return;
        }
        setSelection(clampToTextLength(i11), clampToTextLength(i12));
    }

    private static boolean sameTextForSpan(Editable editable, SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
        if (i11 > spannableStringBuilder.length() || i12 > spannableStringBuilder.length()) {
            return false;
        }
        while (i11 < i12) {
            if (editable.charAt(i11) != spannableStringBuilder.charAt(i11)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    private void setIntrinsicContentSize() {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        if (this.mStateWrapper == null && !reactContext.isBridgeless()) {
            ReactTextInputLocalData reactTextInputLocalData = new ReactTextInputLocalData(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), reactTextInputLocalData);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void stripSpansOfKind(SpannableStringBuilder spannableStringBuilder, Class<T> cls, Predicate<T> predicate) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (predicate.test(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    public void clearFocusFromJS() {
        clearFocus();
    }

    public void commitStagedInputType() {
        if (getInputType() != this.mStagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.mStagedInputType);
            maybeSetSelection(selectionStart, selectionEnd);
        }
    }

    public int getBorderColor(int i11) {
        Integer borderColor = BackgroundStyleApplicator.getBorderColor(this, LogicalEdge.values()[i11]);
        if (borderColor == null) {
            return 0;
        }
        return borderColor.intValue();
    }

    public int getGravityHorizontal() {
        return getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
    }

    public boolean isMultiline() {
        if ((getInputType() & 131072) != 0) {
            return true;
        }
        return false;
    }

    public void maybeSetText(ReactTextUpdate reactTextUpdate) {
        if ((isSecureText() && TextUtils.equals(getText(), reactTextUpdate.getText())) || !canUpdateWithEventCount(reactTextUpdate.getJsEventCounter())) {
            return;
        }
        if (DEBUG_MODE) {
            C45999a.m101507m(this.TAG, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) reactTextUpdate.getText()));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
        manageSpans(spannableStringBuilder);
        stripStyleEquivalentSpans(spannableStringBuilder);
        this.mContainsImages = reactTextUpdate.getContainsImages();
        this.mDisableTextDiffing = true;
        if (reactTextUpdate.getText().length() == 0) {
            setText((CharSequence) null);
        } else {
            getText().replace(0, length(), spannableStringBuilder);
        }
        this.mDisableTextDiffing = false;
        if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
            setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
        }
        updateCachedSpannable();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        maybeSetSelection(selectionStart, selectionEnd);
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
        if (this.mAutoFocus && !this.mDidAttachToWindow) {
            requestFocusInternal();
        }
        this.mDidAttachToWindow = true;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.mOnKeyPress) {
            inputConnectionOnCreateInputConnection = new ReactEditTextInputConnectionWrapper(inputConnectionOnCreateInputConnection, reactContext, this, this.mEventDispatcher);
        }
        if (isMultiline() && (shouldBlurOnReturn() || shouldSubmitOnReturn())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z11, int i11, Rect rect) {
        SelectionWatcher selectionWatcher;
        super.onFocusChanged(z11, i11, rect);
        if (z11 && (selectionWatcher = this.mSelectionWatcher) != null) {
            selectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        onContentSizeChange();
        if (this.mSelectTextOnFocus && isFocused()) {
            selectAll();
            this.mSelectTextOnFocus = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        ScrollWatcher scrollWatcher = this.mScrollWatcher;
        if (scrollWatcher != null) {
            scrollWatcher.onScrollChanged(i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        if (i11 == 16908322) {
            i11 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i11);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && this.mDetectScrollMovement) {
                if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.mDetectScrollMovement = false;
            }
        } else {
            this.mDetectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean requestFocus(int i11, Rect rect) {
        return isFocused();
    }

    public void requestFocusFromJS() {
        requestFocusInternal();
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
    public void setFontFeatureSettings(String str) {
        if (!Objects.equals(str, getFontFeatureSettings())) {
            super.setFontFeatureSettings(str);
            this.mTypefaceDirty = true;
        }
    }

    public void setFontStyle(String str) {
        int fontStyle = ReactTypefaceUtils.parseFontStyle(str);
        if (fontStyle != this.mFontStyle) {
            this.mFontStyle = fontStyle;
            this.mTypefaceDirty = true;
        }
    }

    public void setFontWeight(String str) {
        int fontWeight = ReactTypefaceUtils.parseFontWeight(str);
        if (fontWeight != this.mFontWeight) {
            this.mFontWeight = fontWeight;
            this.mTypefaceDirty = true;
        }
    }

    @Override // android.widget.TextView
    public void setInputType(int i11) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i11);
        this.mStagedInputType = i11;
        super.setTypeface(typeface);
        if (isMultiline()) {
            setSingleLine(false);
        }
        if (this.mKeyListener == null) {
            this.mKeyListener = new InternalKeyListener();
        }
        this.mKeyListener.setInputType(i11);
        setKeyListener(this.mKeyListener);
    }

    public void setSelectTextOnFocus(boolean z11) {
        super.setSelectAllOnFocus(z11);
        this.mSelectTextOnFocus = z11;
    }

    public boolean shouldBlurOnReturn() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (!isMultiline()) {
                return true;
            }
            return false;
        }
        return submitBehavior.equals("blurAndSubmit");
    }

    public boolean shouldSubmitOnReturn() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (isMultiline()) {
                return false;
            }
            return true;
        }
        if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }
}
