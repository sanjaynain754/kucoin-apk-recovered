package com.sumsub.sns.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSVideoSelfieFrameView;", "Lcom/sumsub/sns/core/widget/SNSFrameView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVideoSelfieFrameView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVideoSelfieFrameView.kt\ncom/sumsub/sns/core/widget/SNSVideoSelfieFrameView\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,34:1\n37#2:35\n*S KotlinDebug\n*F\n+ 1 SNSVideoSelfieFrameView.kt\ncom/sumsub/sns/core/widget/SNSVideoSelfieFrameView\n*L\n28#1:35\n*E\n"})
public final class SNSVideoSelfieFrameView extends SNSFrameView {
    @JvmOverloads
    public SNSVideoSelfieFrameView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSVideoSelfieFrameView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSVideoSelfieFrameView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSVideoSelfieFrameView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_FrameViewStyle : i11, (i13 & 8) != 0 ? R$style.SNSVideoSelfieFrameViewStyle : i12);
    }

    @JvmOverloads
    public SNSVideoSelfieFrameView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Integer numM69172a;
        super(context, attributeSet, i11, i12);
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_INFO);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : context.getResources().getColor(R$color.sns_color_primary_100, context.getTheme());
        Float fM69170a = AbstractC28233a.m69170a(SNSMetricElement.VIEWPORT_BORDER_WIDTH);
        setStroke(fM69170a != null ? (int) fM69170a.floatValue() : context.getResources().getDimensionPixelSize(R$dimen.sns_viewport_border_width), iIntValue);
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a == null || (numM69172a = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) == null) {
            return;
        }
        setFillColor(numM69172a.intValue());
    }
}
