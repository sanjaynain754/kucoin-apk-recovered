package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$drawable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSLottieMRTDAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSLottieMRTDAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSLottieMRTDAnimationView.kt\ncom/sumsub/sns/core/widget/SNSLottieMRTDAnimationView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class SNSLottieMRTDAnimationView extends LottieAnimationView {
    @JvmOverloads
    public SNSLottieMRTDAnimationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSLottieMRTDAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SNSLottieMRTDAnimationView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @JvmOverloads
    public SNSLottieMRTDAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_NEUTRAL);
        int iIntValue = numM69174a != null ? numM69174a.intValue() : ContextCompat.getColor(context, R$color.sns_backgroundNeutral);
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.sns_bg_mrtd_animation);
        Drawable drawable2 = null;
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(iIntValue);
            drawable2 = gradientDrawable;
        }
        setBackground(drawable2);
    }
}
