package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0017\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00102\u001a\u0002002\u0006\u00101\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00066"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/EditText;", "text", "", "updateFlagDummyDrawable", "(Landroid/widget/EditText;)V", "Landroid/view/View;", "child", "Landroid/view/ViewGroup$LayoutParams;", ReportDataTable.COLUMN_PARAMS, "addView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "resId", "setStartIconDrawable", "(I)V", "Landroid/graphics/drawable/Drawable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "(Landroid/graphics/drawable/Drawable;)V", "Landroid/widget/LinearLayout;", "flagTouchInterceptor", "Landroid/widget/LinearLayout;", "getFlagTouchInterceptor", "()Landroid/widget/LinearLayout;", "Lcom/sumsub/sns/core/widget/SNSFlagView;", "flagView", "Lcom/sumsub/sns/core/widget/SNSFlagView;", "getFlagView", "()Lcom/sumsub/sns/core/widget/SNSFlagView;", "Landroid/graphics/drawable/ColorDrawable;", "flagDummyDrawable", "Landroid/graphics/drawable/ColorDrawable;", "flagMarginStart", "I", "flagMarginEnd", "flagHorizontalSpacing", "Lcom/sumsub/sns/core/widget/SNSImageView;", "flagDropDownView", "Lcom/sumsub/sns/core/widget/SNSImageView;", "", "value", "isFlagDropDownVisible", "()Z", "setFlagDropDownVisible", "(Z)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSFlaggedInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFlaggedInputLayout.kt\ncom/sumsub/sns/core/widget/SNSFlaggedInputLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n256#2,2:143\n142#2,8:145\n254#2:153\n256#2,2:154\n*S KotlinDebug\n*F\n+ 1 SNSFlaggedInputLayout.kt\ncom/sumsub/sns/core/widget/SNSFlaggedInputLayout\n*L\n42#1:143,2\n79#1:145,8\n45#1:153\n47#1:154,2\n*E\n"})
public final class SNSFlaggedInputLayout extends SNSTextInputLayout {

    @NotNull
    private final SNSImageView flagDropDownView;

    @NotNull
    private final ColorDrawable flagDummyDrawable;
    private final int flagHorizontalSpacing;
    private final int flagMarginEnd;
    private final int flagMarginStart;

    @NotNull
    private final LinearLayout flagTouchInterceptor;

    @NotNull
    private final SNSFlagView flagView;

    @JvmOverloads
    public SNSFlaggedInputLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setStartIconDrawable(int resId) {
        throw new IllegalStateException("Start icon is not available for SNSFlaggedInputLayout.");
    }

    @JvmOverloads
    public SNSFlaggedInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void updateFlagDummyDrawable(EditText text) {
        int measuredWidth = this.flagView.getDrawable() != null ? this.flagTouchInterceptor.getMeasuredWidth() - text.getPaddingStart() : 0;
        if (measuredWidth != this.flagDummyDrawable.getBounds().width()) {
            this.flagDummyDrawable.setBounds(0, 0, measuredWidth, 1);
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(text);
            TextViewCompat.setCompoundDrawablesRelative(text, this.flagDummyDrawable, (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 1), (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 2), (Drawable) ArraysKt.getOrNull(compoundDrawablesRelative, 3));
        }
    }

    @NotNull
    public final LinearLayout getFlagTouchInterceptor() {
        return this.flagTouchInterceptor;
    }

    @NotNull
    public final SNSFlagView getFlagView() {
        return this.flagView;
    }

    public final void setFlagDropDownVisible(boolean z11) {
        this.flagDropDownView.setVisibility(z11 ? 0 : 8);
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout
    public void setStartIconDrawable(@Nullable Drawable icon) {
        throw new IllegalStateException("Start icon is not available for SNSFlaggedInputLayout.");
    }

    @JvmOverloads
    public SNSFlaggedInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addView$lambda$4$lambda$3(SNSFlaggedInputLayout sNSFlaggedInputLayout, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        EditText editText = sNSFlaggedInputLayout.getEditText();
        if (editText != null) {
            sNSFlaggedInputLayout.updateFlagDummyDrawable(editText);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View child, @Nullable ViewGroup.LayoutParams params) {
        ViewParent parent;
        super.addView(child, params);
        if (child instanceof EditText) {
            EditText editText = getEditText();
            FrameLayout frameLayout = null;
            if (editText != null) {
                parent = editText.getParent();
            } else {
                parent = null;
            }
            if (parent instanceof FrameLayout) {
                frameLayout = (FrameLayout) parent;
            }
            if (frameLayout != null) {
                this.flagTouchInterceptor.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                frameLayout.addView(this.flagTouchInterceptor);
                this.flagTouchInterceptor.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sumsub.sns.core.widget.y
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        SNSFlaggedInputLayout.addView$lambda$4$lambda$3(this.f57618b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                    }
                });
            }
        }
    }

    public /* synthetic */ SNSFlaggedInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_FlaggedInputLayoutStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSFlaggedInputLayout : i12);
    }

    @JvmOverloads
    public SNSFlaggedInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        LinearLayout linearLayout = new LinearLayout(context);
        this.flagTouchInterceptor = linearLayout;
        SNSFlagView sNSFlagView = new SNSFlagView(context, null, 0, 0, 14, null);
        this.flagView = sNSFlagView;
        this.flagDummyDrawable = new ColorDrawable();
        SNSImageView sNSImageView = new SNSImageView(context, null, 0, 0, 14, null);
        sNSImageView.setVisibility(8);
        this.flagDropDownView = sNSImageView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFlaggedInputLayout, i11, i12);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSFlaggedInputLayout_sns_flagMarginStart, 0);
        this.flagMarginStart = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSFlaggedInputLayout_sns_flagMarginEnd, 0);
        this.flagMarginEnd = dimensionPixelSize2;
        typedArrayObtainStyledAttributes.recycle();
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_PLACEHOLDER);
        int color = ContextCompat.getColor(context, R$color.sns_fieldPlaceholder);
        Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.CONTENT_WEAK);
        sNSImageView.setImageTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{numM69174a != null ? numM69174a.intValue() : color, numM69174a2 != null ? numM69174a2.intValue() : ContextCompat.getColor(context, R$color.sns_contentWeak)}));
        sNSImageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.DROPDOWN.getImageName()));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPaddingRelative(dimensionPixelSize, linearLayout.getPaddingTop(), dimensionPixelSize2, linearLayout.getPaddingBottom());
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R$dimen.sns_margin_tiny);
        this.flagHorizontalSpacing = dimensionPixelSize3;
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R$dimen.sns_icon_size_small);
        sNSImageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize4, dimensionPixelSize4));
        linearLayout.addView(sNSImageView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(dimensionPixelSize3);
        sNSFlagView.setLayoutParams(layoutParams);
        linearLayout.addView(sNSFlagView);
    }
}
