package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.ImageViewCompat;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSThemeMetric$CardStyle;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0016\u00103\u001a\u0004\u0018\u00010&8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(R(\u0010:\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010=\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00107\"\u0004\b<\u00109R(\u0010C\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010F\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR(\u0010I\u001a\u0004\u0018\u00010>2\b\u00105\u001a\u0004\u0018\u00010>8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010@\"\u0004\bH\u0010B¨\u0006J"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSStepView;", "Lcom/google/android/material/card/MaterialCardView;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lcom/sumsub/sns/core/theme/SNSMetricElement;", "cardStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSMetricElement;)V", "", "applyTheme", "(Lcom/sumsub/sns/core/theme/SNSMetricElement;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "Landroid/content/res/ColorStateList;", "tintColor", "setIconTintColor", "(Landroid/content/res/ColorStateList;)V", "getIconTintColor", "()Landroid/content/res/ColorStateList;", "colorStateList", "setTitleTextColor", "setSubtitleTextColor", "stepState", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "Landroid/widget/ImageView;", "getIconStartView", "()Landroid/widget/ImageView;", "iconStartView", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "getTitlePlaceholderView", "titlePlaceholderView", "getSubtitleView", "subtitleView", "getIconEndView", "iconEndView", "Landroid/graphics/drawable/Drawable;", "value", "getIconStart", "()Landroid/graphics/drawable/Drawable;", "setIconStart", "(Landroid/graphics/drawable/Drawable;)V", "iconStart", "getIconEnd", "setIconEnd", "iconEnd", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getPlaceholder", "setPlaceholder", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getSubtitle", "setSubtitle", "subtitle", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSStepView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSStepView.kt\ncom/sumsub/sns/core/widget/SNSStepView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n233#2,3:260\n256#3,2:263\n1#4:265\n*S KotlinDebug\n*F\n+ 1 SNSStepView.kt\ncom/sumsub/sns/core/widget/SNSStepView\n*L\n50#1:260,3\n117#1:263,2\n*E\n"})
public class SNSStepView extends MaterialCardView implements InterfaceC28973a {

    @Nullable
    private SNSStepState stepState;

    @JvmOverloads
    public SNSStepView(@NotNull Context context) {
        this(context, null, 0, 0, null, 30, null);
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepDrawableState(this) : new int[]{R$attr.sns_stateInit});
    }

    @JvmOverloads
    public SNSStepView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
    }

    private final void applyTheme(SNSMetricElement cardStyle) {
        C28966p c28966pM69169a;
        if (cardStyle == null || (c28966pM69169a = AbstractC28233a.m69169a()) == null) {
            return;
        }
        int i11 = R$attr.sns_stateInit;
        int i12 = R$attr.sns_statePending;
        int i13 = R$attr.sns_stateApproved;
        int i14 = R$attr.sns_stateRejected;
        int i15 = R$attr.sns_stateProcessing;
        int[][] iArr = {new int[]{i11}, new int[]{i12}, new int[]{i13}, new int[]{i14}, new int[]{i15}, new int[0]};
        ColorStateList iconTintColor = getIconTintColor();
        if (iconTintColor == null) {
            iconTintColor = ColorStateList.valueOf(-65281);
        }
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WEAK);
        ColorStateList colorStateListM69167a = AbstractC28233a.m69167a(AbstractC28458h.m69346a(getResources().getConfiguration()), Integer.valueOf(numM69174a != null ? numM69174a.intValue() : iconTintColor.getColorForState(new int[]{i11}, -65281)), iconTintColor);
        if (colorStateListM69167a != null) {
            setIconTintColor(colorStateListM69167a);
        }
        ColorStateList cardBackgroundColor = getCardBackgroundColor();
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_NEUTRAL;
        Integer numM69174a2 = AbstractC28234b.m69174a(this, sNSColorElement);
        int iIntValue = numM69174a2 != null ? numM69174a2.intValue() : cardBackgroundColor.getColorForState(new int[]{i11}, -65281);
        SNSColorElement sNSColorElement2 = SNSColorElement.BACKGROUND_WARNING;
        Integer numM69174a3 = AbstractC28234b.m69174a(this, sNSColorElement2);
        int iIntValue2 = numM69174a3 != null ? numM69174a3.intValue() : cardBackgroundColor.getColorForState(new int[]{i12}, -65281);
        Integer numM69174a4 = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_SUCCESS);
        int iIntValue3 = numM69174a4 != null ? numM69174a4.intValue() : cardBackgroundColor.getColorForState(new int[]{i13}, -65281);
        Integer numM69174a5 = AbstractC28234b.m69174a(this, SNSColorElement.BACKGROUND_CRITICAL);
        int iIntValue4 = numM69174a5 != null ? numM69174a5.intValue() : cardBackgroundColor.getColorForState(new int[]{i14}, -65281);
        Integer numM69174a6 = AbstractC28234b.m69174a(this, sNSColorElement2);
        int iIntValue5 = numM69174a6 != null ? numM69174a6.intValue() : cardBackgroundColor.getColorForState(new int[]{i15}, -65281);
        Integer numM69174a7 = AbstractC28234b.m69174a(this, sNSColorElement);
        int[] iArr2 = {iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, numM69174a7 != null ? numM69174a7.intValue() : cardBackgroundColor.getDefaultColor()};
        Float fM69171a = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.CARD_CORNER_RADIUS);
        if (fM69171a != null) {
            setRadius(fM69171a.floatValue());
        }
        Integer numM69174a8 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_STRONG);
        if (numM69174a8 != null) {
            int iIntValue6 = numM69174a8.intValue();
            TextView titleView = getTitleView();
            if (titleView != null) {
                titleView.setTextColor(iIntValue6);
            }
        }
        String strM69173b = AbstractC28233a.m69173b(c28966pM69169a, cardStyle);
        if (Intrinsics.areEqual(strM69173b, SNSThemeMetric$CardStyle.BORDERED.getValue())) {
            Float fM69171a2 = AbstractC28233a.m69171a(c28966pM69169a, SNSMetricElement.CARD_BORDER_WIDTH);
            setStrokeWidth((int) (fM69171a2 != null ? fM69171a2.floatValue() : 1 * Resources.getSystem().getDisplayMetrics().density));
            setStrokeColor(colorStateListM69167a);
            Integer numM69174a9 = AbstractC28234b.m69174a(this, SNSColorElement.CARD_BORDERED_BACKGROUND);
            if (numM69174a9 != null) {
                int iIntValue7 = numM69174a9.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(getRadius());
                gradientDrawable.setColor(iIntValue7);
                setBackground(gradientDrawable);
            } else {
                setBackgroundColor(0);
            }
            TextView subtitleView = getSubtitleView();
            if (subtitleView != null) {
                AbstractC28234b.m69175a(subtitleView, iconTintColor);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(strM69173b, SNSThemeMetric$CardStyle.PLAIN.getValue())) {
            setStrokeWidth(0);
            setCardBackgroundColor(new ColorStateList(iArr, iArr2));
            Integer numM69174a10 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_NEUTRAL);
            if (numM69174a10 != null) {
                int iIntValue8 = numM69174a10.intValue();
                TextView subtitleView2 = getSubtitleView();
                if (subtitleView2 != null) {
                    subtitleView2.setTextColor(iIntValue8);
                    return;
                }
                return;
            }
            return;
        }
        setStrokeWidth(0);
        Integer numM69174a11 = AbstractC28234b.m69174a(this, SNSColorElement.CARD_PLAIN_BACKGROUND);
        if (numM69174a11 != null) {
            int iIntValue9 = numM69174a11.intValue();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(getRadius());
            gradientDrawable2.setColor(iIntValue9);
            setBackground(gradientDrawable2);
        } else {
            setBackgroundColor(0);
        }
        Integer numM69174a12 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_NEUTRAL);
        if (numM69174a12 != null) {
            int iIntValue10 = numM69174a12.intValue();
            TextView subtitleView3 = getSubtitleView();
            if (subtitleView3 != null) {
                subtitleView3.setTextColor(iIntValue10);
            }
        }
    }

    private final ImageView getIconStartView() {
        return (ImageView) findViewById(R$id.sns_item_start_icon);
    }

    private final TextView getSubtitleView() {
        return (TextView) findViewById(R$id.sns_item_subtitle);
    }

    private final TextView getTitlePlaceholderView() {
        return (TextView) findViewById(R$id.sns_item_title_placeholder);
    }

    private final TextView getTitleView() {
        return (TextView) findViewById(R$id.sns_item_title);
    }

    @Nullable
    public final ImageView getIconEndView() {
        return (ImageView) findViewById(R$id.sns_item_end_icon);
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    @NotNull
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    public void setSNSStepState(@NotNull SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            refreshDrawableState();
            TextView titleView = getTitleView();
            if (titleView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(titleView, state);
            }
            TextView subtitleView = getSubtitleView();
            if (subtitleView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(subtitleView, state);
            }
            ImageView iconStartView = getIconStartView();
            if (iconStartView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(iconStartView, state);
            }
            ImageView iconEndView = getIconEndView();
            if (iconEndView != null) {
                SNSStepViewExtensionsKt.setSnsStepState(iconEndView, state);
            }
        }
    }

    @JvmOverloads
    public SNSStepView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, null, 24, null);
    }

    @Nullable
    public final Drawable getIconEnd() {
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            return iconEndView.getDrawable();
        }
        return null;
    }

    @Nullable
    public final Drawable getIconStart() {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            return iconStartView.getDrawable();
        }
        return null;
    }

    @Nullable
    public ColorStateList getIconTintColor() {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            return iconStartView.getImageTintList();
        }
        return null;
    }

    @Nullable
    public final CharSequence getPlaceholder() {
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            return titlePlaceholderView.getText();
        }
        return null;
    }

    @Nullable
    public final CharSequence getSubtitle() {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            return subtitleView.getText();
        }
        return null;
    }

    @Nullable
    public final CharSequence getTitle() {
        TextView titleView = getTitleView();
        if (titleView != null) {
            return titleView.getText();
        }
        return null;
    }

    public final void setIconEnd(@Nullable Drawable drawable) {
        int i11;
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            iconEndView.setImageDrawable(drawable);
        }
        ImageView iconEndView2 = getIconEndView();
        if (iconEndView2 != null) {
            if (drawable == null) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            iconEndView2.setVisibility(i11);
        }
    }

    public final void setIconStart(@Nullable Drawable drawable) {
        int i11;
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            iconStartView.setImageDrawable(drawable);
        }
        ImageView iconStartView2 = getIconStartView();
        if (iconStartView2 != null) {
            if (drawable == null) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            iconStartView2.setVisibility(i11);
        }
    }

    public void setIconTintColor(@NotNull ColorStateList tintColor) {
        ImageView iconStartView = getIconStartView();
        if (iconStartView != null) {
            ImageViewCompat.setImageTintList(iconStartView, tintColor);
        }
        ImageView iconEndView = getIconEndView();
        if (iconEndView != null) {
            ImageViewCompat.setImageTintList(iconEndView, tintColor);
        }
    }

    public final void setPlaceholder(@Nullable CharSequence charSequence) {
        int i11;
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            titlePlaceholderView.setText(charSequence);
        }
        TextView titlePlaceholderView2 = getTitlePlaceholderView();
        if (titlePlaceholderView2 != null) {
            CharSequence title = getTitle();
            if (title != null && title.length() != 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            titlePlaceholderView2.setVisibility(i11);
        }
    }

    public final void setSubtitle(@Nullable CharSequence charSequence) {
        int i11;
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setText(charSequence);
        }
        TextView subtitleView2 = getSubtitleView();
        if (subtitleView2 != null) {
            if (charSequence != null && !StringsKt.isBlank(charSequence)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            subtitleView2.setVisibility(i11);
        }
    }

    public final void setSubtitleTextColor(@NotNull ColorStateList colorStateList) {
        TextView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setTextColor(colorStateList);
        }
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        int i11;
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(charSequence);
        }
        TextView titleView2 = getTitleView();
        int i12 = 8;
        if (titleView2 != null) {
            if (charSequence != null && charSequence.length() != 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            titleView2.setVisibility(i11);
        }
        TextView titlePlaceholderView = getTitlePlaceholderView();
        if (titlePlaceholderView != null) {
            if (charSequence == null || charSequence.length() == 0) {
                i12 = 0;
            }
            titlePlaceholderView.setVisibility(i12);
        }
    }

    public final void setTitleTextColor(@NotNull ColorStateList colorStateList) {
        TextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setTextColor(colorStateList);
        }
    }

    @JvmOverloads
    public SNSStepView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, null, 16, null);
    }

    public /* synthetic */ SNSStepView(Context context, AttributeSet attributeSet, int i11, int i12, SNSMetricElement sNSMetricElement, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_StepViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSStepView : i12, (i13 & 16) != 0 ? SNSMetricElement.VERIFICATION_STEP_CARD_STYLE : sNSMetricElement);
    }

    @JvmOverloads
    public SNSStepView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12, @Nullable SNSMetricElement sNSMetricElement) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.stepState = SNSStepState.INIT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSStepView, i11, i12);
        int i13 = R$styleable.SNSStepView_sns_stepBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setCardBackgroundColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i13));
        }
        int i14 = R$styleable.SNSStepView_sns_stepStrokeColor;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setStrokeColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i14));
        }
        setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSStepView_sns_stepStrokeWidth, 0));
        int i15 = R$styleable.SNSStepView_elevation;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setCardElevation(typedArrayObtainStyledAttributes.getDimension(i15, 0.0f));
        }
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build());
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSStepView_sns_stepViewLayout, 0), (ViewGroup) this, true);
        int i16 = R$styleable.SNSStepView_sns_stepIconTintColor;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setIconTintColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i16));
        }
        int i17 = R$styleable.SNSStepView_sns_stepTitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setTitleTextColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i17));
        }
        int i18 = R$styleable.SNSStepView_sns_stepSubtitleTextColor;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setSubtitleTextColor(AbstractC28458h.m69329a(typedArrayObtainStyledAttributes, context, i18));
        }
        setIconStart(typedArrayObtainStyledAttributes.getDrawable(R$styleable.SNSStepView_sns_iconStart));
        setIconEnd(typedArrayObtainStyledAttributes.getDrawable(R$styleable.SNSStepView_sns_iconEnd));
        setTitle(typedArrayObtainStyledAttributes.getText(R$styleable.SNSStepView_sns_title));
        setSubtitle(typedArrayObtainStyledAttributes.getText(R$styleable.SNSStepView_sns_subtitle));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
        applyTheme(sNSMetricElement);
    }
}
