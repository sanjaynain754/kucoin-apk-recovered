package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001,\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0010H\u0016J\u000e\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u0019R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR7\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010 \u001a\u0004\u0018\u00010%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-¨\u00063"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "phoneInputLayout", "Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "getPhoneInputLayout", "()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "isValid", "", "()Z", "phoneNumberValidator", "Lkotlin/Function0;", "getPhoneNumberValidator", "()Lkotlin/jvm/functions/Function0;", "setPhoneNumberValidator", "(Lkotlin/jvm/functions/Function0;)V", "purePhoneNumber", "", "getPurePhoneNumber", "()Ljava/lang/String;", "phoneNumberPurifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "getPhoneNumberPurifier", "()Lkotlin/jvm/functions/Function1;", "setPhoneNumberPurifier", "(Lkotlin/jvm/functions/Function1;)V", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "errorCleaner", "com/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView$errorCleaner$1", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView$errorCleaner$1;", "setEnabled", "", "enabled", "updateValueSilently", "newValue", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataPhoneFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataPhoneFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,104:1\n233#2,3:105\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataPhoneFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataPhoneFieldView\n*L\n59#1:105,3\n*E\n"})
public final class SNSApplicantDataPhoneFieldView extends SNSApplicantDataBaseFieldView {

    @NotNull
    private final SNSApplicantDataPhoneFieldView$errorCleaner$1 errorCleaner;

    @Nullable
    private Function1<? super String, String> phoneNumberPurifier;

    @Nullable
    private Function0<Boolean> phoneNumberValidator;

    @JvmOverloads
    public SNSApplicantDataPhoneFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSApplicantDataPhoneFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Nullable
    public final Function1<String, String> getPhoneNumberPurifier() {
        return this.phoneNumberPurifier;
    }

    @Nullable
    public final Function0<Boolean> getPhoneNumberValidator() {
        return this.phoneNumberValidator;
    }

    @NotNull
    public final String getPurePhoneNumber() {
        String strInvoke;
        Function1<? super String, String> function1 = this.phoneNumberPurifier;
        return (function1 == null || (strInvoke = function1.invoke(getValue())) == null) ? getValue() : strInvoke;
    }

    public final boolean isValid() {
        Function0<Boolean> function0 = this.phoneNumberValidator;
        if (function0 != null) {
            return function0.invoke().booleanValue();
        }
        return !StringsKt.isBlank(getPurePhoneNumber());
    }

    public final void setPhoneNumberPurifier(@Nullable Function1<? super String, String> function1) {
        this.phoneNumberPurifier = function1;
    }

    public final void setPhoneNumberValidator(@Nullable Function0<Boolean> function0) {
        this.phoneNumberValidator = function0;
    }

    @JvmOverloads
    public SNSApplicantDataPhoneFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null && (text = tvLabel$idensic_mobile_sdk_aar_defaultRelease.getText()) != null) {
            return text;
        }
        return "";
    }

    @NotNull
    public final SNSFlaggedInputLayout getPhoneInputLayout() {
        return (SNSFlaggedInputLayout) getInputLayout();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setEnabled(enabled);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28458h.m69341a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, charSequence);
        }
    }

    public final void updateValueSilently(@NotNull String newValue) {
        Function1<String, Unit> textChangedCallback = getTextChangedCallback();
        setTextChangedCallback(null);
        EditText editText = getEditText();
        if (editText != null) {
            editText.removeTextChangedListener(this.errorCleaner);
        }
        setValue(newValue);
        setTextChangedCallback(textChangedCallback);
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(this.errorCleaner);
        }
    }

    public /* synthetic */ SNSApplicantDataPhoneFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataPhoneFieldLayout : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView_Phone : i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView$2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.text.TextWatcher, com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView$errorCleaner$1] */
    @JvmOverloads
    public SNSApplicantDataPhoneFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, 0, 8, null);
        ?? r11 = new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView$errorCleaner$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                TextInputLayout inputLayout = this.this$0.getInputLayout();
                if (inputLayout != null) {
                    inputLayout.setError(null);
                }
                TextInputLayout inputLayout2 = this.this$0.getInputLayout();
                if (inputLayout2 != null) {
                    inputLayout2.setErrorEnabled(false);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s11, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s11, int start, int before, int count) {
            }
        };
        this.errorCleaner = r11;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataPhoneFieldView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataPhoneFieldView_sns_applicantDataPhoneFieldLayout, R$layout.sns_layout_applicant_data_phone_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        setInputLayout$idensic_mobile_sdk_aar_defaultRelease((TextInputLayout) findViewById(R$id.sns_phone));
        EditText editText = getEditText();
        if (editText != null) {
            editText.setInputType(3);
        }
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setFilters(new C282572[]{new InputFilter() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataPhoneFieldView.2
                @Override // android.text.InputFilter
                public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) throws IOException {
                    StringBuilder sb2 = new StringBuilder();
                    int length = source.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        char cCharAt = source.charAt(i13);
                        if (Character.isDigit(cCharAt) || cCharAt == '+') {
                            sb2.append(cCharAt);
                        }
                    }
                    return sb2;
                }
            }});
        }
        EditText editText3 = getEditText();
        if (editText3 != 0) {
            editText3.addTextChangedListener(r11);
        }
        onInitializationFinished();
    }
}
