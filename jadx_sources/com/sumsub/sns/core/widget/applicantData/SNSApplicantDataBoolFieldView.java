package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.widget.SNSCheckGroup;
import com.sumsub.sns.core.widget.SNSLabeledCheckBox;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R@\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020&\u0018\u00010%@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R@\u0010-\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&\u0018\u00010%@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+¨\u00060"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "setLabel", "checkGroup", "Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "getCheckGroup", "()Lcom/sumsub/sns/core/widget/SNSCheckGroup;", "checkBox", "Lcom/sumsub/sns/core/widget/SNSLabeledCheckBox;", "", "isChecked", "()Z", "setChecked", "(Z)V", "isUpdating", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "setError", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "onCheckedChanged", "getOnCheckedChanged", "()Lkotlin/jvm/functions/Function1;", "setOnCheckedChanged", "(Lkotlin/jvm/functions/Function1;)V", "", "onLinkClicked", "getOnLinkClicked", "setOnLinkClicked", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataBoolFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataBoolFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,101:1\n233#2,3:102\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataBoolFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBoolFieldView\n*L\n78#1:102,3\n*E\n"})
public final class SNSApplicantDataBoolFieldView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private SNSLabeledCheckBox checkBox;
    private boolean isUpdating;

    @Nullable
    private Function1<? super Boolean, Unit> onCheckedChanged;

    @Nullable
    private Function1<? super String, Unit> onLinkClicked;

    @Nullable
    private CharSequence text;

    @JvmOverloads
    public SNSApplicantDataBoolFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _set_onCheckedChanged_$lambda$0(SNSApplicantDataBoolFieldView sNSApplicantDataBoolFieldView, Function1 function1, boolean z11) {
        sNSApplicantDataBoolFieldView.setError(null);
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        return Unit.INSTANCE;
    }

    public final void setChecked(boolean z11) {
        this.isUpdating = true;
        SNSLabeledCheckBox sNSLabeledCheckBox = this.checkBox;
        if (sNSLabeledCheckBox != null) {
            sNSLabeledCheckBox.setChecked(z11);
        }
        this.isUpdating = false;
    }

    @JvmOverloads
    public SNSApplicantDataBoolFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final SNSCheckGroup getCheckGroup() {
        return (SNSCheckGroup) findViewById(R$id.sns_data_bool);
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnCheckedChanged() {
        return this.onCheckedChanged;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public Function1<String, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Nullable
    public final CharSequence getText() {
        return this.text;
    }

    public final boolean isChecked() {
        SNSLabeledCheckBox sNSLabeledCheckBox = this.checkBox;
        return sNSLabeledCheckBox != null && sNSLabeledCheckBox.isChecked();
    }

    public final void setOnCheckedChanged(@Nullable final Function1<? super Boolean, Unit> function1) {
        SNSLabeledCheckBox sNSLabeledCheckBox = this.checkBox;
        if (sNSLabeledCheckBox != null) {
            sNSLabeledCheckBox.setOnCheckedChanged(new Function1() { // from class: com.sumsub.sns.core.widget.applicantData.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SNSApplicantDataBoolFieldView._set_onCheckedChanged_$lambda$0(this.f57541b, function1, ((Boolean) obj).booleanValue());
                }
            });
        }
        this.onCheckedChanged = function1;
    }

    public final void setText(@Nullable CharSequence charSequence) {
        this.text = charSequence;
        SNSLabeledCheckBox sNSLabeledCheckBox = this.checkBox;
        if (sNSLabeledCheckBox != null) {
            sNSLabeledCheckBox.setText(charSequence);
        }
    }

    @JvmOverloads
    public SNSApplicantDataBoolFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getError() {
        TextView tvError = getTvError();
        if (tvError != null) {
            return tvError.getText();
        }
        return null;
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
    public void setError(@Nullable CharSequence charSequence) {
        SNSStepState sNSStepState;
        TextView tvError = getTvError();
        if (tvError != null) {
            AbstractC28458h.m69341a(tvError, charSequence);
        }
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            if (charSequence != null && charSequence.length() != 0) {
                sNSStepState = SNSStepState.REJECTED;
            } else {
                sNSStepState = SNSStepState.INIT;
            }
            SNSStepViewExtensionsKt.setSnsStepState(checkGroup, sNSStepState);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28458h.m69341a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, charSequence);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setOnLinkClicked(@Nullable Function1<? super String, Unit> function1) {
        super.setOnLinkClicked(function1);
        SNSLabeledCheckBox sNSLabeledCheckBox = this.checkBox;
        if (sNSLabeledCheckBox != null) {
            sNSLabeledCheckBox.setOnLinkClicked(function1);
        }
        this.onLinkClicked = function1;
    }

    public /* synthetic */ SNSApplicantDataBoolFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataBoolFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataBoolFieldView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataBoolFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataBoolFieldView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataBoolFieldView_sns_applicantDataBoolFieldLayout, R$layout.sns_layout_applicant_data_bool_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        this.checkBox = new SNSLabeledCheckBox(context, null, 2, null);
        SNSCheckGroup checkGroup = getCheckGroup();
        if (checkGroup != null) {
            checkGroup.addView(this.checkBox, new ViewGroup.LayoutParams(-1, -2));
        }
        onInitializationFinished();
    }
}
