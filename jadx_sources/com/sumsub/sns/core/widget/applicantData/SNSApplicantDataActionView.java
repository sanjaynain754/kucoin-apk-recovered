package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.SNSImageView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010&\u001a\u00020\u001eH\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006*"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "ctaView", "Landroid/widget/TextView;", "getCtaView", "()Landroid/widget/TextView;", "iconView", "Lcom/sumsub/sns/core/widget/SNSImageView;", "getIconView", "()Lcom/sumsub/sns/core/widget/SNSImageView;", "value", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "text", "getText", "setText", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView$Color;", "tintColor", "getTintColor", "()Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView$Color;", "setTintColor", "(Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView$Color;)V", "setActionTintColor", "", "color", "obtainTintColor", "", "Color", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataActionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataActionView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n1#2:78\n256#3,2:79\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataActionView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView\n*L\n32#1:79,2\n*E\n"})
public final class SNSApplicantDataActionView extends SNSApplicantDataBaseFieldView {

    @Nullable
    private String icon;

    @Nullable
    private CharSequence label;

    @Nullable
    private CharSequence text;

    @NotNull
    private Color tintColor;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataActionView$Color;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "CRITICAL", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum Color {
        NEUTRAL,
        CRITICAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Color> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Color.values().length];
            try {
                iArr[Color.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Color.CRITICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SNSApplicantDataActionView(@NotNull Context context) {
        super(context, null, 0, 0, 14, null);
        this.tintColor = Color.NEUTRAL;
        LayoutInflater.from(context).inflate(R$layout.sns_layout_applicant_data_action_field, (ViewGroup) this, true);
        onInitializationFinished();
    }

    private final TextView getCtaView() {
        return (TextView) findViewById(R$id.sns_action_cta);
    }

    private final SNSImageView getIconView() {
        return (SNSImageView) findViewById(R$id.sns_action_icon);
    }

    private final int obtainTintColor(Color color) {
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_CRITICAL);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : AbstractC28458h.m69328a(getContext(), R$attr.sns_colorOnRejected);
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_CONTENT);
        int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : AbstractC28458h.m69328a(getContext(), R$attr.sns_colorOnProcessing);
        int i11 = WhenMappings.$EnumSwitchMapping$0[color.ordinal()];
        if (i11 == 1) {
            return iIntValue2;
        }
        if (i11 == 2) {
            return iIntValue;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        return this.label;
    }

    @Nullable
    public final CharSequence getText() {
        return this.text;
    }

    @NotNull
    public final Color getTintColor() {
        return this.tintColor;
    }

    public final void setIcon(@Nullable String str) {
        Drawable drawableOnResolveIcon;
        this.icon = str;
        if (str != null) {
            drawableOnResolveIcon = C28468k0.f57983a.getIconHandler().onResolveIcon(getContext(), str);
        } else {
            drawableOnResolveIcon = null;
        }
        SNSImageView iconView = getIconView();
        if (iconView != null) {
            iconView.setImageDrawable(drawableOnResolveIcon);
        }
        SNSImageView iconView2 = getIconView();
        if (iconView2 != null) {
            iconView2.setVisibility(drawableOnResolveIcon != null ? 0 : 8);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void setText(@Nullable CharSequence charSequence) {
        this.text = charSequence;
        TextView ctaView = getCtaView();
        if (ctaView != null) {
            ctaView.setText(charSequence);
        }
    }

    public final void setTintColor(@NotNull Color color) {
        this.tintColor = color;
        setActionTintColor(color);
    }

    private final void setActionTintColor(Color color) {
        int iObtainTintColor = obtainTintColor(color);
        SNSImageView iconView = getIconView();
        if (iconView != null) {
            iconView.setImageTintList(ColorStateList.valueOf(iObtainTintColor));
        }
        TextView ctaView = getCtaView();
        if (ctaView != null) {
            ctaView.setTextColor(iObtainTintColor);
        }
    }
}
