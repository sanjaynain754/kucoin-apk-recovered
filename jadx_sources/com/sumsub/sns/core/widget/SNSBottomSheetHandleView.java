package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ImageViewCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28959g;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0014¨\u0006\u000e"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSBottomSheetHandleView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSBottomSheetHandleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSBottomSheetHandleView.kt\ncom/sumsub/sns/core/widget/SNSBottomSheetHandleView\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,54:1\n37#2:55\n*S KotlinDebug\n*F\n+ 1 SNSBottomSheetHandleView.kt\ncom/sumsub/sns/core/widget/SNSBottomSheetHandleView\n*L\n31#1:55\n*E\n"})
public final class SNSBottomSheetHandleView extends AppCompatImageView {
    @JvmOverloads
    public SNSBottomSheetHandleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSBottomSheetHandleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        C28959g c28959g;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.BOTTOM_SHEET_HANDLE_SIZE;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            if (abstractC28962j instanceof C28959g) {
                c28959g = (C28959g) abstractC28962j;
            } else {
                c28959g = null;
            }
        } else {
            c28959g = null;
        }
        Float f11 = c28959g != null ? c28959g.f58866a : null;
        Float f12 = c28959g != null ? c28959g.f58867b : null;
        if (f11 == null || f12 == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(View.resolveSizeAndState((int) f11.floatValue(), widthMeasureSpec, 0), View.resolveSizeAndState((int) f12.floatValue(), heightMeasureSpec, 0));
        }
    }

    public /* synthetic */ SNSBottomSheetHandleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R$attr.sns_BottomSheetHandleStyle : i11);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    @JvmOverloads
    public SNSBottomSheetHandleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        C28959g c28959g;
        C28955c c28955c;
        Float f11;
        super(context, attributeSet, i11);
        SNSMetricElement sNSMetricElement = SNSMetricElement.BOTTOM_SHEET_HANDLE_SIZE;
        C28468k0 c28468k0 = C28468k0.f57983a;
        SNSJsonCustomization customization = c28468k0.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p == null) {
            c28959g = null;
        } else {
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            if (abstractC28962j instanceof C28959g) {
                c28959g = (C28959g) abstractC28962j;
            } else {
                c28959g = null;
            }
        }
        if (c28959g != null && (f11 = c28959g.f58867b) != null) {
            float fFloatValue = f11.floatValue();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(fFloatValue / 2.0f);
            setImageDrawable(gradientDrawable);
        }
        SNSColorElement sNSColorElement = SNSColorElement.BOTTOM_SHEET_HANDLE;
        SNSJsonCustomization customization2 = c28468k0.getCustomization();
        SNSCustomizationTheme theme2 = customization2 != null ? customization2.getTheme() : null;
        C28966p c28966p2 = theme2 instanceof C28966p ? (C28966p) theme2 : null;
        if (c28966p2 != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map2 = c28966p2.f58877c;
            if (map2 != null && (c28955c = (C28955c) map2.get(sNSColorElement.getValue())) != null) {
                if (zM69346a) {
                    num = c28955c.f58858a;
                } else {
                    num = c28955c.f58859b;
                }
            }
            if (num != null) {
                ImageViewCompat.setImageTintList(this, ColorStateList.valueOf(num.intValue()));
            }
        }
    }
}
