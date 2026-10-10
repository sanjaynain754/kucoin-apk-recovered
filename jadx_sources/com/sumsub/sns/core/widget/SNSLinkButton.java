package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.button.MaterialButton;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28961i;
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
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSLinkButton;", "Lcom/google/android/material/button/MaterialButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSLinkButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSLinkButton.kt\ncom/sumsub/sns/core/widget/SNSLinkButton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n233#2,3:153\n22#3:156\n1#4:157\n1#4:158\n*S KotlinDebug\n*F\n+ 1 SNSLinkButton.kt\ncom/sumsub/sns/core/widget/SNSLinkButton\n*L\n32#1:153,3\n90#1:156\n90#1:157\n*E\n"})
public final class SNSLinkButton extends MaterialButton {
    @JvmOverloads
    public SNSLinkButton(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSLinkButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Float f11 = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.BUTTON_HEIGHT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            if (c28956d != null) {
                f11 = c28956d.f58860a;
            }
        }
        if (f11 != null) {
            super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) f11.floatValue(), 1073741824));
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @JvmOverloads
    public SNSLinkButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    public /* synthetic */ SNSLinkButton(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_LinkButtonStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSTextView_LinkButton : i12);
    }

    @JvmOverloads
    public SNSLinkButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        C28961i c28961i;
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSLinkButton, i11, i12);
        int i13 = R$styleable.SNSLinkButton_android_textAppearance;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            TextViewCompat.setTextAppearance(this, typedArrayObtainStyledAttributes.getResourceId(i13, 0));
        }
        int i14 = R$styleable.SNSLinkButton_android_gravity;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setGravity(typedArrayObtainStyledAttributes.getInteger(i14, 17));
        }
        int i15 = R$styleable.SNSLinkButton_android_minHeight;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setMinHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, 0));
        }
        int i16 = R$styleable.SNSLinkButton_rippleColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setRippleColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i16));
        }
        int i17 = R$styleable.SNSLinkButton_android_paddingLeft;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(i17, getPaddingLeft()), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        int i18 = R$styleable.SNSLinkButton_android_paddingRight;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setPadding(getPaddingLeft(), getPaddingTop(), typedArrayObtainStyledAttributes.getDimensionPixelSize(i18, getPaddingRight()), getPaddingBottom());
        }
        int i19 = R$styleable.SNSLinkButton_android_textColor;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setTextColor(typedArrayObtainStyledAttributes.getColor(i19, ContextCompat.getColor(context, R.color.white)));
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Map map = c28966p.f58876b;
            if (map != null && (c28961i = (C28961i) map.get(SNSTypographyElement.SUBTITLE2.getValue())) != null) {
                Typeface typeface = c28961i.f58872d;
                if (typeface != null) {
                    setTypeface(typeface);
                }
                setTextSize(c28961i.f58870b);
            }
            int[][] iArr = {new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[0]};
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.LINK_BUTTON_CONTENT);
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.LINK_BUTTON_CONTENT_DISABLED);
            if (numM69174a != null || numM69174a2 != null) {
                setTextColor(new ColorStateList(iArr, new int[]{numM69174a2 != null ? numM69174a2.intValue() : 0, 0, numM69174a != null ? numM69174a.intValue() : 0}));
            }
            setElevation(0.0f);
            setStateListAnimator(null);
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.LINK_BUTTON_BACKGROUND_HIGHLIGHTED);
            if (numM69174a3 != null) {
                setBackgroundTintList(new ColorStateList(iArr, new int[]{0, numM69174a3.intValue(), 0}));
            }
            SNSMetricElement sNSMetricElement = SNSMetricElement.BUTTON_CORNER_RADIUS;
            Map map2 = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map2 != null ? (AbstractC28962j) map2.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                setCornerRadius((int) f11.floatValue());
            }
        }
    }
}
