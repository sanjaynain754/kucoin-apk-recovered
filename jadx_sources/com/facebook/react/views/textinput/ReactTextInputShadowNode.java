package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import androidx.room.FtsOptions;
import com.facebook.react.C5771R;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.AbstractC6262a;
import com.facebook.yoga.YogaMeasureMode;
import p193d7.C36635h;
import p193d7.InterfaceC36634g;
import p302h6.C38115a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@VisibleForTesting
public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements InterfaceC36634g {

    @VisibleForTesting
    public static final String PROP_PLACEHOLDER = "placeholder";

    @VisibleForTesting
    public static final String PROP_TEXT = "text";

    @Nullable
    private EditText mInternalEditText;

    @Nullable
    private ReactTextInputLocalData mLocalData;
    private int mMostRecentEventCount;

    @Nullable
    private String mPlaceholder;

    @Nullable
    private String mText;

    public ReactTextInputShadowNode(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mMostRecentEventCount = -1;
        this.mText = null;
        this.mPlaceholder = null;
        this.mTextBreakStrategy = 1;
        initMeasureFunction();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    public void setTextBreakStrategy(@Nullable String str) {
        if (str == null || FtsOptions.TOKENIZER_SIMPLE.equals(str)) {
            this.mTextBreakStrategy = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.mTextBreakStrategy = 1;
            return;
        }
        if ("balanced".equals(str)) {
            this.mTextBreakStrategy = 2;
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid textBreakStrategy: " + str);
        this.mTextBreakStrategy = 0;
    }

    public EditText createInternalEditText() {
        return new EditText(new ContextThemeWrapper(getThemedContext(), C5771R.style.Theme_ReactNative_TextInput_DefaultBackground));
    }

    @Nullable
    public String getPlaceholder() {
        return this.mPlaceholder;
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    @Override // p193d7.InterfaceC36634g
    public long measure(AbstractC6262a abstractC6262a, float f11, YogaMeasureMode yogaMeasureMode, float f12, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) C38115a.m86047c(this.mInternalEditText);
        ReactTextInputLocalData reactTextInputLocalData = this.mLocalData;
        if (reactTextInputLocalData != null) {
            reactTextInputLocalData.apply(editText);
        } else {
            editText.setTextSize(0, this.mTextAttributes.getEffectiveFontSize());
            int i11 = this.mNumberOfLines;
            if (i11 != -1) {
                editText.setLines(i11);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i12 = this.mTextBreakStrategy;
            if (breakStrategy != i12) {
                editText.setBreakStrategy(i12);
            }
        }
        editText.setHint(getPlaceholder());
        editText.measure(MeasureUtil.getMeasureSpec(f11, yogaMeasureMode), MeasureUtil.getMeasureSpec(f12, yogaMeasureMode2));
        return C36635h.m81967b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
        C38115a.m86045a(obj instanceof ReactTextInputLocalData);
        this.mLocalData = (ReactTextInputLocalData) obj;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i11) {
        this.mMostRecentEventCount = i11;
    }

    @ReactProp(name = PROP_PLACEHOLDER)
    public void setPlaceholder(@Nullable String str) {
        this.mPlaceholder = str;
        markUpdated();
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        this.mText = str;
        markUpdated();
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannedFromShadowNode(this, getText(), false, null), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i11, float f11) {
        super.setPadding(i11, f11);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        EditText editTextCreateInternalEditText = createInternalEditText();
        setDefaultPadding(4, ViewCompat.getPaddingStart(editTextCreateInternalEditText));
        setDefaultPadding(1, editTextCreateInternalEditText.getPaddingTop());
        setDefaultPadding(5, ViewCompat.getPaddingEnd(editTextCreateInternalEditText));
        setDefaultPadding(3, editTextCreateInternalEditText.getPaddingBottom());
        this.mInternalEditText = editTextCreateInternalEditText;
        editTextCreateInternalEditText.setPadding(0, 0, 0, 0);
        this.mInternalEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public ReactTextInputShadowNode() {
        this(null);
    }
}
