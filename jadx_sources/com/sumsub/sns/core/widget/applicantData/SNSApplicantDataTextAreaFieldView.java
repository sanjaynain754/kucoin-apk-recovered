package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
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
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "reset", "", "initDefaults", "setEnabled", "enabled", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataTextAreaFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataTextAreaFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,71:1\n233#2,3:72\n58#3,23:75\n93#3,3:98\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataTextAreaFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataTextAreaFieldView\n*L\n32#1:72,3\n49#1:75,23\n49#1:98,3\n*E\n"})
public final class SNSApplicantDataTextAreaFieldView extends SNSApplicantDataBaseFieldView {
    @JvmOverloads
    public SNSApplicantDataTextAreaFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSApplicantDataTextAreaFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSApplicantDataTextAreaFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    private final void initDefaults() {
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setHintEnabled(false);
        }
        EditText editText = getEditText();
        if (editText != null) {
            editText.setInputType(131073);
        }
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

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void reset() {
        super.reset();
        initDefaults();
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

    public /* synthetic */ SNSApplicantDataTextAreaFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataTextAreaFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataTextAreaFieldView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataTextAreaFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        EditText editText;
        super(context, attributeSet, i11, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataTextAreaFieldView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f57182x34b67973, R$layout.sns_layout_applicant_data_text_area_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setInputType(131073);
        }
        setInputLayout$idensic_mobile_sdk_aar_defaultRelease((TextInputLayout) findViewById(R$id.sns_editor_layout));
        initDefaults();
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataTextAreaFieldView$special$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s11) {
                    TextInputLayout inputLayout2 = this.this$0.getInputLayout();
                    if (inputLayout2 != null) {
                        inputLayout2.setError(null);
                    }
                    TextInputLayout inputLayout3 = this.this$0.getInputLayout();
                    if (inputLayout3 != null) {
                        inputLayout3.setErrorEnabled(false);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }
            });
        }
        onInitializationFinished();
    }
}
