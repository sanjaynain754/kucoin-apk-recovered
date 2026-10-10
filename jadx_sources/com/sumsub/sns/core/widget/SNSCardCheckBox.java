package com.sumsub.sns.core.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.CheckBox;
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
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\fR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSCardCheckBox;", "Landroid/widget/CheckBox;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "checkBoxDrawable", "Landroid/graphics/drawable/Drawable;", "getCheckBoxDrawable", "()Landroid/graphics/drawable/Drawable;", "checkBoxDrawable$delegate", "Lkotlin/Lazy;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "setCardStyle", "", "cardStyle", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "setBackground", "", "setStartDrawable", "drawable", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SuppressLint({"AppCompatCustomView"})
@SourceDebugExtension({"SMAP\nSNSCardCheckBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCardCheckBox.kt\ncom/sumsub/sns/core/widget/SNSCardCheckBox\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n*L\n1#1,182:1\n172#2,2:183\n233#3,3:185\n22#4:188\n1#5:189\n37#6:190\n*S KotlinDebug\n*F\n+ 1 SNSCardCheckBox.kt\ncom/sumsub/sns/core/widget/SNSCardCheckBox\n*L\n54#1:183,2\n61#1:185,3\n104#1:188\n104#1:189\n111#1:190\n*E\n"})
public final class SNSCardCheckBox extends CheckBox {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    /* JADX INFO: renamed from: checkBoxDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkBoxDrawable;

    @JvmOverloads
    public SNSCardCheckBox(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSCardCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final Drawable getCheckBoxDrawable() {
        return (Drawable) this.checkBoxDrawable.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
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
        setBackground(this.backgroundDrawable);
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
    public SNSCardCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable checkBoxDrawable_delegate$lambda$0(SNSCardCheckBox sNSCardCheckBox, Context context) {
        Resources resources = sNSCardCheckBox.getResources();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.listChoiceIndicatorMultiple, typedValue, true);
        return ResourcesCompat.getDrawable(resources, typedValue.resourceId, context.getTheme());
    }

    public final void setStartDrawable(@Nullable Drawable drawable) {
        setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, getCheckBoxDrawable(), (Drawable) null);
    }

    public /* synthetic */ SNSCardCheckBox(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_cardCheckBoxViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSCardCheckBox : i12);
    }

    @JvmOverloads
    public SNSCardCheckBox(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Integer numM69172a;
        String string;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11, i12);
        this.checkBoxDrawable = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.core.widget.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSCardCheckBox.checkBoxDrawable_delegate$lambda$0(this.f57584b, context);
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        setButtonDrawable((Drawable) null);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.sns_margin_medium);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setStartDrawable(null);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
        setBackground(gradientDrawable);
        String value = SNSMetricElement.AGREEMENT_CARD_STYLE.getValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSCardCheckBox, i11, i12);
        int i13 = R$styleable.SNSCardCheckBox_sns_cardCheckBoxBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            gradientDrawable.setColor(typedArrayObtainStyledAttributes.getColor(i13, ContextCompat.getColor(context, R.color.transparent)));
        }
        int i14 = R$styleable.SNSCardCheckBox_sns_cardCheckBoxStrokeColor;
        Integer numValueOf = typedArrayObtainStyledAttributes.hasValue(i14) ? Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i14, ContextCompat.getColor(context, R.color.transparent))) : null;
        int i15 = R$styleable.SNSCardCheckBox_sns_cardCheckBoxStrokeWidth;
        Integer numValueOf2 = typedArrayObtainStyledAttributes.hasValue(i15) ? Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(i15, 0)) : null;
        if (numValueOf != null && numValueOf2 != null) {
            gradientDrawable.setStroke(numValueOf2.intValue(), numValueOf.intValue());
        }
        int i16 = R$styleable.SNSCardCheckBox_sns_cardCheckBoxCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            gradientDrawable.setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(i16, 0));
        }
        int i17 = R$styleable.SNSCardCheckBox_sns_cardCheckBoxCardStyle;
        if (typedArrayObtainStyledAttributes.hasValue(i17) && (string = typedArrayObtainStyledAttributes.getString(i17)) != null) {
            value = string;
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null) {
            AbstractC28234b.m69176a(this, SNSTypographyElement.SUBTITLE2, SNSColorElement.CONTENT_STRONG);
            Map map = c28966pM69169a.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(value) : null;
            C28960h c28960h = abstractC28962j instanceof C28960h ? (C28960h) abstractC28962j : null;
            String str = c28960h != null ? c28960h.f58868a : null;
            if (str != null) {
                setBackground(str);
            }
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
            C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
            if (c28966pM69169a2 == null || (numM69172a = AbstractC28233a.m69172a(c28966pM69169a2, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) == null) {
                return;
            }
            int iIntValue = numM69172a.intValue();
            int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
            Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_TINT);
            int[] iArr2 = {iIntValue, numM69174a != null ? numM69174a.intValue() : iIntValue};
            Drawable checkBoxDrawable = getCheckBoxDrawable();
            if (checkBoxDrawable != null) {
                checkBoxDrawable.setTintList(new ColorStateList(iArr, iArr2));
            }
        }
    }
}
