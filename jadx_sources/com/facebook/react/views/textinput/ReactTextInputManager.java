package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C6184u;
import com.facebook.react.uimanager.C6185v;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.facebook.react.views.text.DefaultStyleValuesUtil;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.text.TextTransform;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.tencent.bugly.proguard.C33627eb;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import p302h6.C38115a;
import p747x3.C45999a;
import p852kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = ReactTextInputManager.REACT_CLASS)
public class ReactTextInputManager extends BaseViewManager<ReactEditText, LayoutShadowNode> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;

    @Nullable
    protected ReactTextViewManagerCallback mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new HashMap<String, String>() { // from class: com.facebook.react.views.textinput.ReactTextInputManager.1
        {
            put("birthdate-day", HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY);
            put("birthdate-full", HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL);
            put("birthdate-month", HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH);
            put("birthdate-year", HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR);
            put("cc-csc", HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE);
            put("cc-exp", HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE);
            put("cc-exp-day", HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY);
            put("cc-exp-month", HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH);
            put("cc-exp-year", HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR);
            put("cc-number", HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER);
            put("email", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
            put(HintConstants.AUTOFILL_HINT_GENDER, HintConstants.AUTOFILL_HINT_GENDER);
            put("name", HintConstants.AUTOFILL_HINT_PERSON_NAME);
            put("name-family", HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY);
            put("name-given", HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN);
            put("name-middle", HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE);
            put("name-middle-initial", HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL);
            put("name-prefix", HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX);
            put("name-suffix", HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX);
            put("password", "password");
            put("password-new", HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
            put("postal-address", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS);
            put("postal-address-country", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY);
            put("postal-address-extended", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS);
            put("postal-address-extended-postal-code", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);
            put("postal-address-locality", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY);
            put("postal-address-region", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION);
            put("postal-code", HintConstants.AUTOFILL_HINT_POSTAL_CODE);
            put("street-address", HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS);
            put("sms-otp", HintConstants.AUTOFILL_HINT_SMS_OTP);
            put("tel", HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
            put("tel-country-code", HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE);
            put("tel-national", HintConstants.AUTOFILL_HINT_PHONE_NATIONAL);
            put("tel-device", HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE);
            put("username", "username");
            put("username-new", HintConstants.AUTOFILL_HINT_NEW_USERNAME);
        }
    };
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    public static class ReactContentSizeWatcher implements ContentSizeWatcher {
        private final ReactEditText mEditText;
        private final EventDispatcher mEventDispatcher;
        private final int mSurfaceId;
        private int mPreviousContentWidth = 0;
        private int mPreviousContentHeight = 0;

        @Override // com.facebook.react.views.textinput.ContentSizeWatcher
        public void onLayout() {
            if (this.mEventDispatcher == null) {
                return;
            }
            int width = this.mEditText.getWidth();
            int height = this.mEditText.getHeight();
            if (this.mEditText.getLayout() != null) {
                width = this.mEditText.getCompoundPaddingLeft() + this.mEditText.getLayout().getWidth() + this.mEditText.getCompoundPaddingRight();
                height = this.mEditText.getCompoundPaddingTop() + this.mEditText.getLayout().getHeight() + this.mEditText.getCompoundPaddingBottom();
            }
            if (width == this.mPreviousContentWidth && height == this.mPreviousContentHeight) {
                return;
            }
            this.mPreviousContentHeight = height;
            this.mPreviousContentWidth = width;
            this.mEventDispatcher.dispatchEvent(new ReactContentSizeChangedEvent(this.mSurfaceId, this.mEditText.getId(), PixelUtil.toDIPFromPixel(width), PixelUtil.toDIPFromPixel(height)));
        }

        public ReactContentSizeWatcher(ReactEditText reactEditText) {
            this.mEditText = reactEditText;
            ReactContext reactContext = UIManagerHelper.getReactContext(reactEditText);
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }
    }

    public static class ReactScrollWatcher implements ScrollWatcher {
        private final EventDispatcher mEventDispatcher;
        private int mPreviousHorizontal;
        private int mPreviousVert;
        private final ReactEditText mReactEditText;
        private final int mSurfaceId;

        @Override // com.facebook.react.views.textinput.ScrollWatcher
        public void onScrollChanged(int i11, int i12, int i13, int i14) {
            if (this.mPreviousHorizontal == i11 && this.mPreviousVert == i12) {
                return;
            }
            this.mEventDispatcher.dispatchEvent(ScrollEvent.obtain(this.mSurfaceId, this.mReactEditText.getId(), ScrollEventType.SCROLL, i11, i12, 0.0f, 0.0f, 0, 0, this.mReactEditText.getWidth(), this.mReactEditText.getHeight()));
            this.mPreviousHorizontal = i11;
            this.mPreviousVert = i12;
        }

        public ReactScrollWatcher(ReactEditText reactEditText) {
            this.mReactEditText = reactEditText;
            ReactContext reactContext = UIManagerHelper.getReactContext(reactEditText);
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }
    }

    public final class ReactTextInputTextWatcher implements TextWatcher {
        private final ReactEditText mEditText;
        private final EventDispatcher mEventDispatcher;

        @Nullable
        private String mPreviousText = null;
        private final int mSurfaceId;

        public ReactTextInputTextWatcher(ReactContext reactContext, ReactEditText reactEditText) {
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mEditText = reactEditText;
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (this.mEditText.mDisableTextDiffing) {
                return;
            }
            if (i13 == 0 && i12 == 0) {
                return;
            }
            C38115a.m86047c(this.mPreviousText);
            String strSubstring = charSequence.toString().substring(i11, i11 + i13);
            String strSubstring2 = this.mPreviousText.substring(i11, i11 + i12);
            if (i13 == i12 && strSubstring.equals(strSubstring2)) {
                return;
            }
            StateWrapper stateWrapper = this.mEditText.getStateWrapper();
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", this.mEditText.incrementAndGetEventCounter());
                writableNativeMap.putInt("opaqueCacheId", this.mEditText.getId());
                stateWrapper.updateState(writableNativeMap);
            }
            this.mEventDispatcher.dispatchEvent(new ReactTextChangedEvent(this.mSurfaceId, this.mEditText.getId(), charSequence.toString(), this.mEditText.incrementAndGetEventCounter()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.mPreviousText = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }
    }

    private ReactTextUpdate getReactTextUpdate(String str, int i11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) TextTransform.apply(str, TextTransform.UNSET));
        return new ReactTextUpdate(spannableStringBuilder, i11, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m10223of("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.m10222of("AutoCapitalizationType", MapBuilder.m10225of("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = "autoCapitalize")
    public void setAutoCapitalize(ReactEditText reactEditText, Dynamic dynamic) {
        int iAsInt = 0;
        if (dynamic.getType() == ReadableType.Number) {
            iAsInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String strAsString = dynamic.asString();
            strAsString.getClass();
            byte b11 = -1;
            switch (strAsString.hashCode()) {
                case 3387192:
                    if (strAsString.equals("none")) {
                        b11 = 0;
                    }
                    break;
                case 113318569:
                    if (strAsString.equals("words")) {
                        b11 = 1;
                    }
                    break;
                case 490141296:
                    if (strAsString.equals("sentences")) {
                        b11 = 2;
                    }
                    break;
                case 1245424234:
                    if (strAsString.equals("characters")) {
                        b11 = 3;
                    }
                    break;
            }
            switch (b11) {
                case 0:
                    break;
                case 1:
                    iAsInt = 8192;
                    break;
                case 2:
                default:
                    iAsInt = 16384;
                    break;
                case 3:
                    iAsInt = 4096;
                    break;
            }
        } else {
            iAsInt = 16384;
        }
        updateStagedInputTypeFlag(reactEditText, AUTOCAPITALIZE_FLAGS, iAsInt);
    }

    @ReactProp(name = "importantForAutofill")
    public void setImportantForAutofill(ReactEditText reactEditText, @Nullable String str) {
        int i11;
        if ("no".equals(str)) {
            i11 = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i11 = 8;
        } else if ("yes".equals(str)) {
            i11 = 1;
        } else {
            i11 = "yesExcludeDescendants".equals(str) ? 4 : 0;
        }
        setImportantForAutofill(reactEditText, i11);
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    public void setTextAlignVertical(ReactEditText reactEditText, @Nullable String str) {
        if (str == null || "auto".equals(str)) {
            reactEditText.setGravityVertical(0);
            return;
        }
        if (ViewProps.TOP.equals(str)) {
            reactEditText.setGravityVertical(48);
            return;
        }
        if (ViewProps.BOTTOM.equals(str)) {
            reactEditText.setGravityVertical(80);
            return;
        }
        if (TtmlNode.CENTER.equals(str)) {
            reactEditText.setGravityVertical(16);
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid textAlignVertical: " + str);
        reactEditText.setGravityVertical(0);
    }

    @ReactProp(name = "autoComplete")
    public void setTextContentType(ReactEditText reactEditText, @Nullable String str) {
        if (str == null) {
            setImportantForAutofill(reactEditText, 2);
            return;
        }
        if ("off".equals(str)) {
            setImportantForAutofill(reactEditText, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (map.containsKey(str)) {
            setAutofillHints(reactEditText, map.get(str));
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid autoComplete: " + str);
        setImportantForAutofill(reactEditText, 2);
    }

    public static class ReactSelectionWatcher implements SelectionWatcher {
        private final EventDispatcher mEventDispatcher;
        private int mPreviousSelectionEnd;
        private int mPreviousSelectionStart;
        private final ReactEditText mReactEditText;
        private final int mSurfaceId;

        public ReactSelectionWatcher(ReactEditText reactEditText) {
            this.mReactEditText = reactEditText;
            ReactContext reactContext = UIManagerHelper.getReactContext(reactEditText);
            this.mEventDispatcher = ReactTextInputManager.getEventDispatcher(reactContext, reactEditText);
            this.mSurfaceId = UIManagerHelper.getSurfaceId(reactContext);
        }

        @Override // com.facebook.react.views.textinput.SelectionWatcher
        public void onSelectionChanged(int i11, int i12) {
            int iMin = Math.min(i11, i12);
            int iMax = Math.max(i11, i12);
            if (this.mPreviousSelectionStart == iMin && this.mPreviousSelectionEnd == iMax) {
                return;
            }
            this.mEventDispatcher.dispatchEvent(new ReactTextInputSelectionEvent(this.mSurfaceId, this.mReactEditText.getId(), iMin, iMax));
            this.mPreviousSelectionStart = iMin;
            this.mPreviousSelectionEnd = iMax;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10624a(ReactEditText reactEditText, ThemedReactContext themedReactContext, TextView textView, int i11, KeyEvent keyEvent) {
        if ((i11 & 255) == 0 && i11 != 0) {
            return true;
        }
        boolean zIsMultiline = reactEditText.isMultiline();
        boolean zShouldSubmitOnReturn = reactEditText.shouldSubmitOnReturn();
        boolean zShouldBlurOnReturn = reactEditText.shouldBlurOnReturn();
        if (zShouldSubmitOnReturn) {
            getEventDispatcher(themedReactContext, reactEditText).dispatchEvent(new ReactTextInputSubmitEditingEvent(themedReactContext.getSurfaceId(), reactEditText.getId(), reactEditText.getText().toString()));
        }
        if (zShouldBlurOnReturn) {
            reactEditText.clearFocus();
        }
        return zShouldBlurOnReturn || zShouldSubmitOnReturn || !zIsMultiline || i11 == 5 || i11 == 7;
    }

    private void setAutofillHints(ReactEditText reactEditText, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        reactEditText.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase(Locale.ROOT).contains(JPushConstants.Manufacturer.XIAOMI);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ThemedReactContext themedReactContext, final ReactEditText reactEditText) {
        reactEditText.setEventDispatcher(getEventDispatcher(themedReactContext, reactEditText));
        reactEditText.addTextChangedListener(new ReactTextInputTextWatcher(themedReactContext, reactEditText));
        reactEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.u
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ReactTextInputManager.m10625b(themedReactContext, reactEditText, view, z11);
            }
        });
        reactEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.v
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                return ReactTextInputManager.m10624a(reactEditText, themedReactContext, textView, i11, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactBaseTextShadowNode createShadowNodeInstance() {
        return new ReactTextInputShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactEditText createViewInstance(ThemedReactContext themedReactContext) {
        ReactEditText reactEditText = new ReactEditText(themedReactContext);
        reactEditText.setInputType(reactEditText.getInputType() & (-131073));
        reactEditText.setReturnKeyType("done");
        reactEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return reactEditText;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ReactTextInputShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactEditText reactEditText) {
        super.onAfterUpdateTransaction(reactEditText);
        reactEditText.maybeUpdateTypeface();
        reactEditText.commitStagedInputType();
    }

    @ReactProp(name = "autoCorrect")
    public void setAutoCorrect(ReactEditText reactEditText, @Nullable Boolean bool) {
        int i11;
        if (bool != null) {
            i11 = bool.booleanValue() ? 32768 : 524288;
        } else {
            i11 = 0;
        }
        updateStagedInputTypeFlag(reactEditText, 557056, i11);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactEditText reactEditText, int i11, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(reactEditText, LogicalEdge.ALL, num);
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactEditText reactEditText, @Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(reactEditText, str == null ? null : BorderStyle.fromString(str));
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num != null) {
            reactEditText.setTextColor(num.intValue());
            return;
        }
        ColorStateList defaultTextColor = DefaultStyleValuesUtil.getDefaultTextColor(reactEditText.getContext());
        if (defaultTextColor != null) {
            reactEditText.setTextColor(defaultTextColor);
            return;
        }
        Context context = reactEditText.getContext();
        String str = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Could not get default text color from View Context: ");
        sb2.append(context != null ? context.getClass().getCanonicalName() : "null");
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb2.toString()));
    }

    @ReactProp(customType = "Color", name = "cursorColor")
    public void setCursorColor(ReactEditText reactEditText, @Nullable Integer num) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable textCursorDrawable = reactEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    C6185v.m10570a();
                    textCursorDrawable.setColorFilter(C6184u.m10569a(num.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                reactEditText.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i11 == 28) {
            return;
        }
        try {
            Field declaredField = reactEditText.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i12 = declaredField.getInt(reactEditText);
            if (i12 == 0) {
                return;
            }
            Drawable drawableMutate = ContextCompat.getDrawable(reactEditText.getContext(), i12).mutate();
            if (num != null) {
                drawableMutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(reactEditText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @ReactProp(name = "keyboardType")
    public void setKeyboardType(ReactEditText reactEditText, @Nullable String str) {
        int i11;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i11 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i11 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i11 = 8194;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                reactEditText.setCursorVisible(false);
            }
            i11 = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i11 = 3;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i11 = 144;
        } else {
            i11 = "url".equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(reactEditText, 15, i11);
        checkPasswordType(reactEditText);
    }

    @ReactProp(defaultBoolean = false, name = "multiline")
    public void setMultiline(ReactEditText reactEditText, boolean z11) {
        updateStagedInputTypeFlag(reactEditText, z11 ? 0 : 131072, z11 ? 131072 : 0);
    }

    @ReactProp(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(ReactEditText reactEditText, boolean z11) {
        if (z11) {
            reactEditText.setContentSizeWatcher(new ReactContentSizeWatcher(reactEditText));
        } else {
            reactEditText.setContentSizeWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(ReactEditText reactEditText, boolean z11) {
        if (z11) {
            reactEditText.setScrollWatcher(new ReactScrollWatcher(reactEditText));
        } else {
            reactEditText.setScrollWatcher(null);
        }
    }

    @ReactProp(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(ReactEditText reactEditText, boolean z11) {
        if (z11) {
            reactEditText.setSelectionWatcher(new ReactSelectionWatcher(reactEditText));
        } else {
            reactEditText.setSelectionWatcher(null);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(ReactEditText reactEditText, int i11, int i12, int i13, int i14) {
        reactEditText.setPadding(i11, i12, i13, i14);
    }

    @ReactProp(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num == null) {
            reactEditText.setHintTextColor(DefaultStyleValuesUtil.getDefaultTextColorHint(reactEditText.getContext()));
        } else {
            reactEditText.setHintTextColor(num.intValue());
        }
    }

    @ReactProp(name = "returnKeyLabel")
    public void setReturnKeyLabel(ReactEditText reactEditText, String str) {
        reactEditText.setImeActionLabel(str, IME_ACTION_ID);
    }

    @ReactProp(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(ReactEditText reactEditText, boolean z11) {
        updateStagedInputTypeFlag(reactEditText, 144, z11 ? 128 : 0);
        checkPasswordType(reactEditText);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactEditText reactEditText, @Nullable Integer num) {
        if (num == null) {
            reactEditText.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactEditText.getContext()));
        } else {
            reactEditText.setHighlightColor(num.intValue());
        }
    }

    @ReactProp(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(ReactEditText reactEditText, @Nullable Integer num) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            Drawable drawableMutate = reactEditText.getTextSelectHandle().mutate();
            Drawable drawableMutate2 = reactEditText.getTextSelectHandleLeft().mutate();
            Drawable drawableMutate3 = reactEditText.getTextSelectHandleRight().mutate();
            if (num != null) {
                C6185v.m10570a();
                BlendModeColorFilter blendModeColorFilterM10569a = C6184u.m10569a(num.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterM10569a);
                drawableMutate2.setColorFilter(blendModeColorFilterM10569a);
                drawableMutate3.setColorFilter(blendModeColorFilterM10569a);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            reactEditText.setTextSelectHandle(drawableMutate);
            reactEditText.setTextSelectHandleLeft(drawableMutate2);
            reactEditText.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i11 == 28) {
            return;
        }
        int i12 = 0;
        while (true) {
            String[] strArr = DRAWABLE_HANDLE_RESOURCES;
            if (i12 >= strArr.length) {
                return;
            }
            try {
                Field declaredField = reactEditText.getClass().getDeclaredField(strArr[i12]);
                declaredField.setAccessible(true);
                int i13 = declaredField.getInt(reactEditText);
                if (i13 == 0) {
                    return;
                }
                Drawable drawableMutate4 = ContextCompat.getDrawable(reactEditText.getContext(), i13).mutate();
                if (num != null) {
                    drawableMutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                } else {
                    drawableMutate4.clearColorFilter();
                }
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(reactEditText);
                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i12]);
                declaredField3.setAccessible(true);
                declaredField3.set(obj, drawableMutate4);
                i12++;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
    }

    @ReactProp(name = "textAlign")
    public void setTextAlign(ReactEditText reactEditText, @Nullable String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                reactEditText.setJustificationMode(1);
            }
            reactEditText.setGravityHorizontal(3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            reactEditText.setJustificationMode(0);
        }
        if (str == null || "auto".equals(str)) {
            reactEditText.setGravityHorizontal(0);
            return;
        }
        if ("left".equals(str)) {
            reactEditText.setGravityHorizontal(3);
            return;
        }
        if ("right".equals(str)) {
            reactEditText.setGravityHorizontal(5);
            return;
        }
        if (TtmlNode.CENTER.equals(str)) {
            reactEditText.setGravityHorizontal(1);
            return;
        }
        C45999a.m101488I(ReactConstants.TAG, "Invalid textAlign: " + str);
        reactEditText.setGravityHorizontal(0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(ReactEditText reactEditText, Object obj) {
        if (obj instanceof ReactTextUpdate) {
            ReactTextUpdate reactTextUpdate = (ReactTextUpdate) obj;
            int paddingLeft = (int) reactTextUpdate.getPaddingLeft();
            int paddingTop = (int) reactTextUpdate.getPaddingTop();
            int paddingRight = (int) reactTextUpdate.getPaddingRight();
            int paddingBottom = (int) reactTextUpdate.getPaddingBottom();
            int length = -1;
            if (paddingLeft != -1 || paddingTop != -1 || paddingRight != -1 || paddingBottom != -1) {
                if (paddingLeft == -1) {
                    paddingLeft = reactEditText.getPaddingLeft();
                }
                if (paddingTop == -1) {
                    paddingTop = reactEditText.getPaddingTop();
                }
                if (paddingRight == -1) {
                    paddingRight = reactEditText.getPaddingRight();
                }
                if (paddingBottom == -1) {
                    paddingBottom = reactEditText.getPaddingBottom();
                }
                reactEditText.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            }
            if (reactTextUpdate.getContainsImages()) {
                TextInlineImageSpan.possiblyUpdateInlineImageSpans(reactTextUpdate.getText(), reactEditText);
            }
            if (reactEditText.getSelectionStart() == reactEditText.getSelectionEnd()) {
                length = reactTextUpdate.getText().length() - ((reactEditText.getText() != null ? reactEditText.getText().length() : 0) - reactEditText.getSelectionStart());
            }
            reactEditText.maybeSetTextFromState(reactTextUpdate);
            reactEditText.maybeSetSelection(reactTextUpdate.getJsEventCounter(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactEditText reactEditText, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        if (ReactEditText.DEBUG_MODE) {
            C45999a.m101507m(TAG, "updateState: [" + reactEditText.getId() + "]");
        }
        if (reactEditText.getStateWrapper() == null) {
            reactEditText.setPadding(0, 0, 0, 0);
        }
        reactEditText.setStateWrapper(stateWrapper);
        ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(reactEditText, reactStylesDiffMap, stateDataMapBuffer);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10625b(ThemedReactContext themedReactContext, ReactEditText reactEditText, View view, boolean z11) {
        int surfaceId = themedReactContext.getSurfaceId();
        EventDispatcher eventDispatcher = getEventDispatcher(themedReactContext, reactEditText);
        if (z11) {
            eventDispatcher.dispatchEvent(new ReactTextInputFocusEvent(surfaceId, reactEditText.getId()));
        } else {
            eventDispatcher.dispatchEvent(new ReactTextInputBlurEvent(surfaceId, reactEditText.getId()));
            eventDispatcher.dispatchEvent(new ReactTextInputEndEditingEvent(surfaceId, reactEditText.getId(), reactEditText.getText().toString()));
        }
    }

    private static void checkPasswordType(ReactEditText reactEditText) {
        if ((reactEditText.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) != 0 && (reactEditText.getStagedInputType() & 128) != 0) {
            updateStagedInputTypeFlag(reactEditText, 128, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EventDispatcher getEventDispatcher(ReactContext reactContext, ReactEditText reactEditText) {
        return UIManagerHelper.getEventDispatcherForReactTag(reactContext, reactEditText.getId());
    }

    private static void updateStagedInputTypeFlag(ReactEditText reactEditText, int i11, int i12) {
        reactEditText.setStagedInputType(((~i11) & reactEditText.getStagedInputType()) | i12);
    }

    public ReactBaseTextShadowNode createShadowNodeInstance(@Nullable ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return new ReactTextInputShadowNode(reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(MapBuilder.builder().put("topSubmitEditing", MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).put("topEndEditing", MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).put("topFocus", MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onFocus", "captured", "onFocusCapture"))).put("topBlur", MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onBlur", "captured", "onBlurCapture"))).put(ReactTextInputKeyPressEvent.EVENT_NAME, MapBuilder.m10222of("phasedRegistrationNames", MapBuilder.m10223of("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).build());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m10222of("registrationName", "onScroll")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, int i11, @Nullable ReadableArray readableArray) {
        if (i11 == 1) {
            receiveCommand(reactEditText, "focus", readableArray);
        } else if (i11 == 2) {
            receiveCommand(reactEditText, "blur", readableArray);
        } else {
            if (i11 != 4) {
                return;
            }
            receiveCommand(reactEditText, "setTextAndSelection", readableArray);
        }
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public void setAllowFontScaling(ReactEditText reactEditText, boolean z11) {
        reactEditText.setAllowFontScaling(z11);
    }

    @ReactProp(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(ReactEditText reactEditText, boolean z11) {
        reactEditText.setAutoFocus(z11);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(ReactEditText reactEditText, int i11, float f11) {
        LengthPercentage lengthPercentage;
        if (Float.isNaN(f11)) {
            lengthPercentage = null;
        } else {
            lengthPercentage = new LengthPercentage(f11, LengthPercentageType.POINT);
        }
        BackgroundStyleApplicator.setBorderRadius(reactEditText, BorderRadiusProp.values()[i11], lengthPercentage);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public void setBorderWidth(ReactEditText reactEditText, int i11, float f11) {
        BackgroundStyleApplicator.setBorderWidth(reactEditText, LogicalEdge.values()[i11], Float.valueOf(f11));
    }

    @ReactProp(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(ReactEditText reactEditText, boolean z11) {
        if (reactEditText.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        reactEditText.setCursorVisible(!z11);
    }

    @ReactProp(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(ReactEditText reactEditText, boolean z11) {
        reactEditText.setContextMenuHidden(z11);
    }

    @ReactProp(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(ReactEditText reactEditText, boolean z11) {
        reactEditText.setDisableFullscreenUI(z11);
    }

    @ReactProp(defaultBoolean = true, name = "editable")
    public void setEditable(ReactEditText reactEditText, boolean z11) {
        reactEditText.setEnabled(z11);
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(ReactEditText reactEditText, String str) {
        reactEditText.setFontFamily(str);
    }

    @ReactProp(defaultFloat = ViewDefaults.FONT_SIZE_SP, name = "fontSize")
    public void setFontSize(ReactEditText reactEditText, float f11) {
        reactEditText.setFontSize(f11);
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setFontStyle(str);
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public void setFontVariant(ReactEditText reactEditText, @Nullable ReadableArray readableArray) {
        reactEditText.setFontFeatureSettings(ReactTypefaceUtils.parseFontVariant(readableArray));
    }

    @ReactProp(name = "fontWeight")
    public void setFontWeight(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setFontWeight(str);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(ReactEditText reactEditText, boolean z11) {
        reactEditText.setIncludeFontPadding(z11);
    }

    @ReactProp(name = "inlineImageLeft")
    public void setInlineImageLeft(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setCompoundDrawablesWithIntrinsicBounds(ResourceDrawableIdHelper.getInstance().getResourceDrawableId(reactEditText.getContext(), str), 0, 0, 0);
    }

    @ReactProp(name = "inlineImagePadding")
    public void setInlineImagePadding(ReactEditText reactEditText, int i11) {
        reactEditText.setCompoundDrawablePadding(i11);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public void setLetterSpacing(ReactEditText reactEditText, float f11) {
        reactEditText.setLetterSpacingPt(f11);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LINE_HEIGHT)
    public void setLineHeight(ReactEditText reactEditText, int i11) {
        reactEditText.setLineHeight(i11);
    }

    @ReactProp(defaultFloat = FloatCompanionObject.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public void setMaxFontSizeMultiplier(ReactEditText reactEditText, float f11) {
        reactEditText.setMaxFontSizeMultiplier(f11);
    }

    @ReactProp(name = "maxLength")
    public void setMaxLength(ReactEditText reactEditText, @Nullable Integer num) {
        InputFilter[] filters = reactEditText.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z11 = false;
            for (int i11 = 0; i11 < filters.length; i11++) {
                if (filters[i11] instanceof InputFilter.LengthFilter) {
                    filters[i11] = new InputFilter.LengthFilter(num.intValue());
                    z11 = true;
                }
            }
            if (!z11) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        reactEditText.setFilters(inputFilterArr);
    }

    @ReactProp(defaultInt = 1, name = ViewProps.NUMBER_OF_LINES)
    public void setNumLines(ReactEditText reactEditText, int i11) {
        reactEditText.setLines(i11);
    }

    @ReactProp(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(ReactEditText reactEditText, boolean z11) {
        reactEditText.setOnKeyPress(z11);
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setOverflow(str);
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceholder(ReactEditText reactEditText, String str) {
        reactEditText.setPlaceholder(str);
    }

    @ReactProp(name = "returnKeyType")
    public void setReturnKeyType(ReactEditText reactEditText, String str) {
        reactEditText.setReturnKeyType(str);
    }

    @ReactProp(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(ReactEditText reactEditText, boolean z11) {
        reactEditText.setSelectTextOnFocus(z11);
    }

    @ReactProp(name = "submitBehavior")
    public void setSubmitBehavior(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setSubmitBehavior(str);
    }

    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    public void setTextDecorationLine(ReactEditText reactEditText, @Nullable String str) {
        reactEditText.setPaintFlags(reactEditText.getPaintFlags() & (-25));
        if (str != null) {
            for (String str2 : str.split(C33627eb.f69716f)) {
                if (str2.equals(TtmlNode.UNDERLINE)) {
                    reactEditText.setPaintFlags(reactEditText.getPaintFlags() | 8);
                } else if (str2.equals("line-through")) {
                    reactEditText.setPaintFlags(reactEditText.getPaintFlags() | 16);
                }
            }
        }
    }

    @ReactProp(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(ReactEditText reactEditText, @Nullable Integer num) {
        Drawable background = reactEditText.getBackground();
        if (background != null) {
            if (background.getConstantState() != null) {
                try {
                    background = background.mutate();
                } catch (NullPointerException e11) {
                    C45999a.m101508n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e11);
                }
            }
            if (num == null) {
                background.clearColorFilter();
            } else {
                background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(ReactEditText reactEditText, boolean z11) {
        reactEditText.setShowSoftInputOnFocus(z11);
    }

    @Nullable
    public Object getReactTextUpdate(ReactEditText reactEditText, ReactStylesDiffMap reactStylesDiffMap, MapBuffer mapBuffer) {
        if (mapBuffer.getCount() == 0) {
            return null;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(0);
        return ReactTextUpdate.buildReactTextUpdateFromState(TextLayoutManager.getOrCreateSpannableForText(reactEditText.getContext(), mapBuffer2, this.mReactTextViewManagerCallback), mapBuffer.getInt(3), TextAttributeProps.getTextAlignment(reactStylesDiffMap, TextLayoutManager.isRTL(mapBuffer2), reactEditText.getGravityHorizontal()), TextAttributeProps.getTextBreakStrategy(mapBuffer.getMapBuffer(1).getString(2)), TextAttributeProps.getJustificationMode(reactStylesDiffMap, Build.VERSION.SDK_INT >= 26 ? reactEditText.getJustificationMode() : 0));
    }

    private void setImportantForAutofill(ReactEditText reactEditText, int i11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        reactEditText.setImportantForAutofill(i11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactEditText reactEditText, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "blurTextInput":
            case "blur":
                reactEditText.clearFocusFromJS();
                break;
            case "focus":
            case "focusTextInput":
                reactEditText.requestFocusFromJS();
                break;
            case "setTextAndSelection":
                int i11 = readableArray.getInt(0);
                if (i11 != -1) {
                    int i12 = readableArray.getInt(2);
                    int i13 = readableArray.getInt(3);
                    if (i13 == -1) {
                        i13 = i12;
                    }
                    if (!readableArray.isNull(1)) {
                        reactEditText.maybeSetTextFromJS(getReactTextUpdate(readableArray.getString(1), i11));
                    }
                    reactEditText.maybeSetSelection(i11, i12, i13);
                    break;
                }
                break;
        }
    }
}
