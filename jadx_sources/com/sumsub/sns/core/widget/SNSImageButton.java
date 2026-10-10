package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSImageButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSImageButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSImageButton.kt\ncom/sumsub/sns/core/widget/SNSImageButton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n233#2,3:65\n22#3:68\n1#4:69\n*S KotlinDebug\n*F\n+ 1 SNSImageButton.kt\ncom/sumsub/sns/core/widget/SNSImageButton\n*L\n26#1:65,3\n44#1:68\n44#1:69\n*E\n"})
public final class SNSImageButton extends AppCompatImageButton {
    @JvmOverloads
    public SNSImageButton(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSImageButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @JvmOverloads
    public SNSImageButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSImageButton(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_ImageButtonStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSImageButton : i12);
    }

    @JvmOverloads
    public SNSImageButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSImageButton, i11, i12);
        int i13 = R$styleable.SNSImageButton_android_tint;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            ImageViewCompat.setImageTintList(this, AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSImageButton_android_backgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            ViewCompat.setBackgroundTintList(this, AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i14));
        }
        int i15 = R$styleable.SNSImageButton_android_background;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(i15));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        if ((theme instanceof C28966p ? (C28966p) theme : null) != null) {
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT);
            int iIntValue = numM69174a != null ? numM69174a.intValue() : 0;
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_DISABLED);
            int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : 0;
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.SECONDARY_BUTTON_CONTENT_HIGHLIGHTED);
            ImageViewCompat.setImageTintList(this, new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{iIntValue2, numM69174a3 != null ? numM69174a3.intValue() : 0, iIntValue}));
        }
    }
}
