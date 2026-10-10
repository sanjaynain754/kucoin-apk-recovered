package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.tencent.qcloud.tuicore.TUIConstants;
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
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015RB\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSectionView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "tvDescription", "Landroid/widget/TextView;", "getTvDescription", "()Landroid/widget/TextView;", "value", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "getDescription", "setDescription", "Lkotlin/Function1;", "", "", "onLinkClicked", "getOnLinkClicked", "()Lkotlin/jvm/functions/Function1;", "setOnLinkClicked", "(Lkotlin/jvm/functions/Function1;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataSectionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataSectionView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSectionView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,66:1\n233#2,3:67\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataSectionView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataSectionView\n*L\n52#1:67,3\n*E\n"})
public final class SNSApplicantDataSectionView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private Function1<? super String, Unit> onLinkClicked;

    @JvmOverloads
    public SNSApplicantDataSectionView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSApplicantDataSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final TextView getTvDescription() {
        return (TextView) findViewById(R$id.sns_description);
    }

    @JvmOverloads
    public SNSApplicantDataSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Nullable
    public final CharSequence getDescription() {
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            return tvDescription.getText();
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
    @Nullable
    public Function1<String, Unit> getOnLinkClicked() {
        return super.getOnLinkClicked();
    }

    public final void setDescription(@Nullable CharSequence charSequence) {
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            AbstractC28458h.m69341a(tvDescription, charSequence);
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
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28485q.m69381a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, function1);
        }
        TextView tvDescription = getTvDescription();
        if (tvDescription != null) {
            AbstractC28485q.m69381a(tvDescription, function1);
        }
        this.onLinkClicked = function1;
    }

    public /* synthetic */ SNSApplicantDataSectionView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataSectionViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataSectionView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataSectionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, 0, 8, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataSectionView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataSectionView_sns_applicantDataSectionLayout, R$layout.sns_layout_applicant_data_section), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        onInitializationFinished();
    }
}
