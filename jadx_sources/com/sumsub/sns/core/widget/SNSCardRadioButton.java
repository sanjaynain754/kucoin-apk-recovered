package com.sumsub.sns.core.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RadioButton;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28960h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nJ\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\f\u0010\u001e\u001a\u00020\u0010*\u00020\u0010H\u0002R\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSCardRadioButton;", "Landroid/widget/RadioButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "cardStyleMetric", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSMetricElement;)V", "startDrawableTintColor", "Ljava/lang/Integer;", "radioDrawable", "Landroid/graphics/drawable/Drawable;", "getRadioDrawable", "()Landroid/graphics/drawable/Drawable;", "radioDrawable$delegate", "Lkotlin/Lazy;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "setCardStyle", "", "cardStyle", "setBackground", "", "setStartDrawable", "drawable", "tinted", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"AppCompatCustomView"})
@SourceDebugExtension({"SMAP\nSNSCardRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCardRadioButton.kt\ncom/sumsub/sns/core/widget/SNSCardRadioButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,204:1\n172#2,2:205\n233#3,3:207\n22#4:210\n1#5:211\n37#6:212\n*S KotlinDebug\n*F\n+ 1 SNSCardRadioButton.kt\ncom/sumsub/sns/core/widget/SNSCardRadioButton\n*L\n59#1:205,2\n66#1:207,3\n108#1:210\n108#1:211\n115#1:212\n*E\n"})
public final class SNSCardRadioButton extends RadioButton {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    /* JADX INFO: renamed from: radioDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy radioDrawable;

    @Nullable
    private Integer startDrawableTintColor;

    @JvmOverloads
    public SNSCardRadioButton(@NotNull Context context) {
        this(context, null, 0, 0, null, 30, null);
    }

    public final void setStartDrawable(@Nullable Drawable drawable, boolean tinted) {
        if (tinted) {
            drawable = drawable != null ? tinted(drawable) : null;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, getRadioDrawable(), (Drawable) null);
    }

    @JvmOverloads
    public SNSCardRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
    }

    private final Drawable getRadioDrawable() {
        return (Drawable) this.radioDrawable.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    private final void setBackground(String cardStyle) {
        float dimension;
        Float fM69171a;
        Float fM69171a2;
        if (Intrinsics.areEqual(cardStyle, SNSThemeMetric$CardStyle.BORDERED.getValue())) {
            GradientDrawable gradientDrawable = this.backgroundDrawable;
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CARD_BORDERED_BACKGROUND);
            gradientDrawable.setColor(numM69174a != null ? numM69174a.intValue() : 0);
            C28966p c28966pM69169a = AbstractC28233a.m69169a();
            int dimension2 = (int) ((c28966pM69169a == null || (fM69171a2 = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.CARD_BORDER_WIDTH)) == null) ? getResources().getDimension(R$dimen.sns_agreement_card_stroke_width) : fM69171a2.floatValue());
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WEAK);
            gradientDrawable.setStroke(dimension2, numM69174a2 != null ? numM69174a2.intValue() : getResources().getColor(R$color.sns_color_neutral_20));
            C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
            gradientDrawable.setCornerRadius((c28966pM69169a2 == null || (fM69171a = AbstractC28233a.m69171a(c28966pM69169a2, SNSMetricElement.CARD_CORNER_RADIUS)) == null) ? getResources().getDimension(R$dimen.sns_agreement_card_corner_radius) : fM69171a.floatValue());
            setBackground(this.backgroundDrawable);
            return;
        }
        if (!Intrinsics.areEqual(cardStyle, SNSThemeMetric$CardStyle.PLAIN.getValue())) {
            setBackground((Drawable) null);
            return;
        }
        GradientDrawable gradientDrawable2 = this.backgroundDrawable;
        Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.CARD_PLAIN_BACKGROUND);
        gradientDrawable2.setColor(numM69174a3 != null ? numM69174a3.intValue() : 0);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.CARD_CORNER_RADIUS;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            Float f11 = c28956d != null ? c28956d.f58860a : null;
            if (f11 != null) {
                dimension = f11.floatValue();
            } else {
                dimension = getResources().getDimension(R$dimen.sns_agreement_card_corner_radius);
            }
        } else {
            dimension = getResources().getDimension(R$dimen.sns_agreement_card_corner_radius);
        }
        gradientDrawable2.setCornerRadius(dimension);
        gradientDrawable2.setStroke(0, 0);
        setBackground(this.backgroundDrawable);
    }

    public static /* synthetic */ void setStartDrawable$default(SNSCardRadioButton sNSCardRadioButton, Drawable drawable, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        sNSCardRadioButton.setStartDrawable(drawable, z11);
    }

    private final Drawable tinted(Drawable drawable) {
        Integer num = this.startDrawableTintColor;
        if (num != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
        return drawable;
    }

    public final void setCardStyle(@NotNull SNSMetricElement cardStyle) {
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(cardStyle.getValue()) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            String str = c28960h != null ? c28960h.f58868a : null;
            if (str != null) {
                setBackground(str);
            }
        }
    }

    @JvmOverloads
    public SNSCardRadioButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable radioDrawable_delegate$lambda$0(SNSCardRadioButton sNSCardRadioButton, Context context) {
        Resources resources = sNSCardRadioButton.getResources();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.listChoiceIndicatorSingle, typedValue, true);
        return ResourcesCompat.getDrawable(resources, typedValue.resourceId, context.getTheme());
    }

    public /* synthetic */ SNSCardRadioButton(Context context, AttributeSet attributeSet, int i11, int i12, SNSMetricElement sNSMetricElement, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_cardRadioButtonViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSCardRadioButton : i12, (i13 & 16) != 0 ? SNSMetricElement.AGREEMENT_CARD_STYLE : sNSMetricElement);
    }

    @JvmOverloads
    public SNSCardRadioButton(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i11, int i12, @NotNull SNSMetricElement sNSMetricElement) {
        Integer numM69172a;
        String string;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11, i12);
        this.radioDrawable = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.core.widget.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSCardRadioButton.radioDrawable_delegate$lambda$0(this.f57587b, context);
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        setButtonDrawable((Drawable) null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_small_plus);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setStartDrawable$default(this, null, false, 2, null);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
        setBackground(gradientDrawable);
        String value = sNSMetricElement.getValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSCardRadioButton, i11, i12);
        int i13 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            gradientDrawable.setColor(typedArrayObtainStyledAttributes.getColor(i13, ContextCompat.getColor(context, R.color.transparent)));
        }
        int i14 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonStrokeColor;
        Integer numValueOf = typedArrayObtainStyledAttributes.hasValue(i14) ? Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i14, ContextCompat.getColor(context, R.color.transparent))) : null;
        int i15 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonStrokeWidth;
        Integer numValueOf2 = typedArrayObtainStyledAttributes.hasValue(i15) ? Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, 0)) : null;
        if (numValueOf != null && numValueOf2 != null) {
            gradientDrawable.setStroke(numValueOf2.intValue(), numValueOf.intValue());
        }
        int i16 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            gradientDrawable.setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, 0));
        }
        int i17 = R$styleable.SNSCardRadioButton_sns_cardRadioButtonCardStyle;
        if (typedArrayObtainStyledAttributes.hasValue(i17) && (string = typedArrayObtainStyledAttributes.getString(i17)) != null) {
            value = string;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null) {
            AbstractC28234b.m69176a(this, SNSTypographyElement.SUBTITLE1, SNSColorElement.CONTENT_STRONG);
            Map map = c28966pM69169a.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(value) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            String str = c28960h != null ? c28960h.f58868a : null;
            if (str != null) {
                setBackground(str);
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
            C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
            if (c28966pM69169a2 != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a2, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
                int iIntValue = numM69172a.intValue();
                int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
                Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_TINT);
                int[] iArr2 = {iIntValue, numM69174a != null ? numM69174a.intValue() : iIntValue};
                Drawable radioDrawable = getRadioDrawable();
                if (radioDrawable != null) {
                    radioDrawable.setTintList(new ColorStateList(iArr, iArr2));
                }
            }
        }
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WEAK);
        this.startDrawableTintColor = numM69174a2 == null ? Integer.valueOf(ContextCompat.getColor(context, R$color.sns_contentWeak)) : numM69174a2;
    }
}
