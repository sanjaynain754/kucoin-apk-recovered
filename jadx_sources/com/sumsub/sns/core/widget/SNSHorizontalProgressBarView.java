package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.google.android.material.C7090R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
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
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSHorizontalProgressBarView;", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSHorizontalProgressBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSHorizontalProgressBarView.kt\ncom/sumsub/sns/core/widget/SNSHorizontalProgressBarView\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,22:1\n37#2:23\n*S KotlinDebug\n*F\n+ 1 SNSHorizontalProgressBarView.kt\ncom/sumsub/sns/core/widget/SNSHorizontalProgressBarView\n*L\n17#1:23\n*E\n"})
public final class SNSHorizontalProgressBarView extends LinearProgressIndicator {
    @JvmOverloads
    public SNSHorizontalProgressBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSHorizontalProgressBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SNSHorizontalProgressBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? C7090R.attr.linearProgressIndicatorStyle : i11);
    }

    @JvmOverloads
    public SNSHorizontalProgressBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        C28955c c28955c;
        super(context, attributeSet, i11);
        SNSColorElement sNSColorElement = SNSColorElement.PROGRESS_BAR_TINT;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                if (zM69346a) {
                    num = c28955c.f58858a;
                } else {
                    num = c28955c.f58859b;
                }
            }
            if (num != null) {
                setProgressTintList(ColorStateList.valueOf(num.intValue()));
            }
        }
    }
}
