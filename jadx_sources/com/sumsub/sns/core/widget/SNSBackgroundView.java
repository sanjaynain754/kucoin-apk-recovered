package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
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
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSBackgroundView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSBackgroundView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSBackgroundView.kt\ncom/sumsub/sns/core/widget/SNSBackgroundView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,34:1\n233#2,3:35\n37#3:38\n*S KotlinDebug\n*F\n+ 1 SNSBackgroundView.kt\ncom/sumsub/sns/core/widget/SNSBackgroundView\n*L\n21#1:35,3\n28#1:38\n*E\n"})
public class SNSBackgroundView extends FrameLayout {
    @JvmOverloads
    public SNSBackgroundView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSBackgroundView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_BackgroundViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSBackgroundView : i12);
    }

    @JvmOverloads
    public SNSBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        C28955c c28955c;
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSBackgroundView, i11, i12);
        int i13 = R$styleable.SNSBackgroundView_android_background;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(i13));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
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
                setBackground(new ColorDrawable(num.intValue()));
            }
        }
    }
}
