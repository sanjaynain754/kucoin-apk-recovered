package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarView;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputLayoutStartIconWorkaround;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "startIconView", "Lcom/sumsub/sns/core/widget/SNSImageView;", "getStartIconView", "()Lcom/sumsub/sns/core/widget/SNSImageView;", "iconMarginStart", "getIconMarginStart", "()I", "setIconMarginStart", "(I)V", "setStartIconDrawable", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "Landroid/graphics/drawable/Drawable;", "addView", "child", "Landroid/view/View;", "index", ReportDataTable.COLUMN_PARAMS, "Landroid/view/ViewGroup$LayoutParams;", "updateEditTextPadding", "editText", "Landroid/widget/EditText;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTextInputLayoutStartIconWorkaround.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTextInputLayoutStartIconWorkaround.kt\ncom/sumsub/sns/core/widget/SNSTextInputLayoutStartIconWorkaround\n+ 2 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n37#2:95\n142#3,8:96\n375#3,2:104\n142#3,8:106\n*S KotlinDebug\n*F\n+ 1 SNSTextInputLayoutStartIconWorkaround.kt\ncom/sumsub/sns/core/widget/SNSTextInputLayoutStartIconWorkaround\n*L\n45#1:95\n66#1:96,8\n83#1:104,2\n89#1:106,8\n*E\n"})
public class SNSTextInputLayoutStartIconWorkaround extends SNSTextInputLayout {
    private int iconMarginStart;

    @NotNull
    private final SNSImageView startIconView;

    @JvmOverloads
    public SNSTextInputLayoutStartIconWorkaround(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSTextInputLayoutStartIconWorkaround(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final void updateEditTextPadding(EditText editText) {
        int marginStart;
        int iAbs = Math.abs(this.startIconView.getRight() - this.startIconView.getLeft());
        if (this.startIconView.getDrawable() != null) {
            ViewGroup.LayoutParams layoutParams = this.startIconView.getLayoutParams();
            marginStart = (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0) + this.iconMarginStart + iAbs;
        } else {
            marginStart = this.iconMarginStart;
        }
        editText.setPaddingRelative(marginStart, editText.getPaddingTop(), editText.getPaddingEnd(), editText.getPaddingBottom());
    }

    public final int getIconMarginStart() {
        return this.iconMarginStart;
    }

    @NotNull
    public final SNSImageView getStartIconView() {
        return this.startIconView;
    }

    public final void setIconMarginStart(int i11) {
        this.iconMarginStart = i11;
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout
    public void setStartIconDrawable(@Nullable Drawable icon) {
        this.startIconView.setImageDrawable(icon);
    }

    @JvmOverloads
    public SNSTextInputLayoutStartIconWorkaround(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addView$lambda$3$lambda$2(SNSTextInputLayoutStartIconWorkaround sNSTextInputLayoutStartIconWorkaround, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        EditText editText = sNSTextInputLayoutStartIconWorkaround.getEditText();
        if (editText != null) {
            sNSTextInputLayoutStartIconWorkaround.updateEditTextPadding(editText);
        }
    }

    @Override // com.sumsub.sns.core.widget.SNSTextInputLayout, com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        ViewParent parent;
        super.addView(child, index, params);
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
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
                frameLayout.addView(this.startIconView, layoutParams);
                SNSImageView sNSImageView = this.startIconView;
                sNSImageView.setPaddingRelative(this.iconMarginStart, sNSImageView.getPaddingTop(), sNSImageView.getPaddingEnd(), sNSImageView.getPaddingBottom());
                this.startIconView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sumsub.sns.core.widget.i0
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        SNSTextInputLayoutStartIconWorkaround.addView$lambda$3$lambda$2(this.f57589b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                    }
                });
            }
        }
    }

    public /* synthetic */ SNSTextInputLayoutStartIconWorkaround(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_TextInputLayoutStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSTextInputLayout : i12);
    }

    @JvmOverloads
    public SNSTextInputLayoutStartIconWorkaround(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Integer num;
        C28955c c28955c;
        super(context, attributeSet, i11, i12);
        SNSImageView sNSImageView = new SNSImageView(context, null, 0, 0, 14, null);
        this.startIconView = sNSImageView;
        sNSImageView.setImageTintList(ColorStateList.valueOf(context.getResources().getColor(R$color.sns_fieldContent, context.getTheme())));
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else if (zM69346a) {
                num = c28955c.f58858a;
            } else {
                num = c28955c.f58859b;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                sNSImageView.setImageTintList(null);
                sNSImageView.setImageTintList(ColorStateList.valueOf(iIntValue));
            }
        }
    }
}
