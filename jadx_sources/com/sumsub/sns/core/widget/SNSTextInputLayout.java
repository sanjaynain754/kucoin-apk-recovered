package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.C7090R;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.presentation.helper.AbstractC28233a;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.core.theme.SNSTypographyElement;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.AbstractC28962j;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28956d;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u000602R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/sumsub/sns/internal/core/presentation/widget/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "setStartIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "setEndIconDrawable", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", ReportDataTable.COLUMN_PARAMS, "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "", "errorText", "setError", "(Ljava/lang/CharSequence;)V", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "getSNSStepState", "()Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "state", "setSNSStepState", "(Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "stepState", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "hintColor", "Ljava/lang/Integer;", "Landroid/content/res/ColorStateList;", "errorColor", "Landroid/content/res/ColorStateList;", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;", "boxBackgroundColorResolver", "Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;", "BoxBackgroundColorResolver", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTextInputLayout.kt\ncom/sumsub/sns/core/widget/SNSTextInputLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 4 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n*L\n1#1,233:1\n59#2,2:234\n37#3:236\n37#3:237\n37#3:239\n37#3:240\n37#3:241\n54#4:238\n*S KotlinDebug\n*F\n+ 1 SNSTextInputLayout.kt\ncom/sumsub/sns/core/widget/SNSTextInputLayout\n*L\n51#1:234,2\n65#1:236\n94#1:237\n122#1:239\n131#1:240\n142#1:241\n98#1:238\n*E\n"})
public class SNSTextInputLayout extends TextInputLayout implements InterfaceC28973a {

    @NotNull
    private final BoxBackgroundColorResolver boxBackgroundColorResolver;

    @NotNull
    private final ColorStateList errorColor;

    @Nullable
    private Integer hintColor;

    @Nullable
    private SNSStepState stepState;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSTextInputLayout$BoxBackgroundColorResolver;", "", "<init>", "(Lcom/sumsub/sns/core/widget/SNSTextInputLayout;)V", "editorBackgroundColorList", "Landroid/content/res/ColorStateList;", "initStateColor", "", "Ljava/lang/Integer;", "invalidStateColor", "init", "", "styledAttributes", "Landroid/content/res/TypedArray;", "context", "Landroid/content/Context;", "getBoxBackgroundColor", "state", "Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public final class BoxBackgroundColorResolver {

        @Nullable
        private ColorStateList editorBackgroundColorList;

        @Nullable
        private Integer initStateColor;

        @Nullable
        private Integer invalidStateColor;

        public BoxBackgroundColorResolver() {
        }

        public final int getBoxBackgroundColor(@NotNull SNSStepState state) {
            Integer num = this.initStateColor;
            Integer num2 = this.invalidStateColor;
            ColorStateList colorStateList = this.editorBackgroundColorList;
            if (state == SNSStepState.INIT && num != null) {
                return num.intValue();
            }
            if (state != SNSStepState.REJECTED || num2 == null) {
                return colorStateList != null ? colorStateList.getColorForState(SNSStepViewExtensionsKt.getSnsStepDrawableState(SNSTextInputLayout.this), SNSTextInputLayout.this.getBoxBackgroundColor()) : SNSTextInputLayout.this.getBoxBackgroundColor();
            }
            return num2.intValue();
        }

        public final void init(@NotNull TypedArray styledAttributes, @NotNull Context context) {
            int i11 = R$styleable.SNSTextInputLayout_sns_editorBackgroundColor;
            this.editorBackgroundColorList = styledAttributes.hasValue(i11) ? AbstractC28458h.m69329a(styledAttributes, context, i11) : ColorStateList.valueOf(SNSTextInputLayout.this.getBoxBackgroundColor());
            this.initStateColor = AbstractC28234b.m69174a(SNSTextInputLayout.this, SNSColorElement.FIELD_BACKGROUND);
            Integer numM69174a = AbstractC28234b.m69174a(SNSTextInputLayout.this, SNSColorElement.FIELD_BACKGROUND_INVALID);
            if (numM69174a == null) {
                numM69174a = AbstractC28234b.m69174a(SNSTextInputLayout.this, SNSColorElement.BACKGROUND_CRITICAL);
            }
            this.invalidStateColor = numM69174a;
        }
    }

    @JvmOverloads
    public SNSTextInputLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        return View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + 1), this.stepState != null ? SNSStepViewExtensionsKt.getSnsStepDrawableState(this) : new int[]{R$attr.sns_stateInit});
    }

    @JvmOverloads
    public SNSTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    @NotNull
    public SNSStepState getSNSStepState() {
        SNSStepState sNSStepState = this.stepState;
        return sNSStepState == null ? SNSStepState.INIT : sNSStepState;
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Float f11 = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_HEIGHT;
            Map map = c28966p.f58878d;
            AbstractC28962j abstractC28962j = map != null ? (AbstractC28962j) map.get(sNSMetricElement.getValue()) : null;
            C28956d c28956d = abstractC28962j instanceof C28956d ? (C28956d) abstractC28962j : null;
            if (c28956d != null) {
                f11 = c28956d.f58860a;
            }
        }
        if (f11 == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        EditText editText = getEditText();
        if (editText != null) {
            editText.setHeight((int) f11.floatValue());
        }
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) f11.floatValue(), 0));
    }

    @Override // com.sumsub.sns.internal.core.presentation.widget.InterfaceC28973a
    public void setSNSStepState(@NotNull SNSStepState state) {
        if (state != this.stepState) {
            this.stepState = state;
            setBoxBackgroundColor(this.boxBackgroundColorResolver.getBoxBackgroundColor(state));
            refreshDrawableState();
        }
    }

    @JvmOverloads
    public SNSTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        EditText editText;
        Drawable textCursorDrawable;
        C28955c c28955c;
        super.addView(child, index, params);
        if (child instanceof EditText) {
            EditText editText2 = getEditText();
            if (editText2 != null) {
                AbstractC28234b.m69176a(editText2, SNSTypographyElement.SUBTITLE2, SNSColorElement.FIELD_CONTENT);
            }
            SNSColorElement sNSColorElement = SNSColorElement.FIELD_TINT;
            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
            Integer num = null;
            if (customization != null) {
                theme = customization.getTheme();
            } else {
                theme = null;
            }
            if (theme instanceof C28966p) {
                c28966p = (C28966p) theme;
            } else {
                c28966p = null;
            }
            if (c28966p != null) {
                boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
                Map map = c28966p.f58877c;
                if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                    num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (Build.VERSION.SDK_INT >= 29 && (editText = getEditText()) != null && (textCursorDrawable = editText.getTextCursorDrawable()) != null) {
                        textCursorDrawable.setTint(iIntValue);
                    }
                    EditText editText3 = getEditText();
                    if (editText3 != null) {
                        editText3.setHighlightColor(iIntValue);
                    }
                }
            }
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setEndIconDrawable(@Nullable Drawable icon) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        Integer num;
        C28955c c28955c;
        super.setEndIconDrawable(icon);
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        if (customization != null) {
            theme = customization.getTheme();
        } else {
            theme = null;
        }
        if (theme instanceof C28966p) {
            c28966p = (C28966p) theme;
        } else {
            c28966p = null;
        }
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                if (zM69346a) {
                    num = c28955c.f58858a;
                } else {
                    num = c28955c.f58859b;
                }
            } else {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                setEndIconTintList(null);
                setEndIconTintList(ColorStateList.valueOf(iIntValue));
            }
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setError(@Nullable CharSequence errorText) {
        SNSStepState sNSStepState;
        super.setError(errorText);
        if (errorText != null && !StringsKt.isBlank(errorText)) {
            sNSStepState = SNSStepState.REJECTED;
        } else {
            sNSStepState = SNSStepState.INIT;
        }
        setSNSStepState(sNSStepState);
        setErrorTextColor(this.errorColor);
        Integer num = this.hintColor;
        if (num != null) {
            int iIntValue = num.intValue();
            EditText editText = getEditText();
            if (editText != null) {
                editText.setHintTextColor(iIntValue);
            }
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void setStartIconDrawable(@Nullable Drawable icon) {
        SNSCustomizationTheme theme;
        C28966p c28966p;
        Integer num;
        C28955c c28955c;
        super.setStartIconDrawable(icon);
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        if (customization != null) {
            theme = customization.getTheme();
        } else {
            theme = null;
        }
        if (theme instanceof C28966p) {
            c28966p = (C28966p) theme;
        } else {
            c28966p = null;
        }
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                if (zM69346a) {
                    num = c28955c.f58858a;
                } else {
                    num = c28955c.f58859b;
                }
            } else {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                setStartIconTintList(null);
                setStartIconTintList(ColorStateList.valueOf(iIntValue));
            }
        }
    }

    public /* synthetic */ SNSTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_TextInputLayoutStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSTextInputLayout : i12);
    }

    @JvmOverloads
    public SNSTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        Float fM69171a;
        Integer numM69172a;
        Integer numM69172a2;
        super(context, attributeSet, i11);
        SNSStepState sNSStepState = SNSStepState.INIT;
        this.stepState = sNSStepState;
        BoxBackgroundColorResolver boxBackgroundColorResolver = new BoxBackgroundColorResolver();
        this.boxBackgroundColorResolver = boxBackgroundColorResolver;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSTextInputLayout, i11, i12);
        boxBackgroundColorResolver.init(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        this.errorColor = ColorStateList.valueOf(AbstractC28458h.m69328a(context, C7090R.attr.colorOnError));
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_WEAK;
        C28966p c28966pM69169a = AbstractC28233a.m69169a();
        if (c28966pM69169a != null && (numM69172a2 = AbstractC28233a.m69172a(c28966pM69169a, sNSColorElement, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            int iIntValue = numM69172a2.intValue();
            setEndIconTintList(ColorStateList.valueOf(iIntValue));
            setStartIconTintList(ColorStateList.valueOf(iIntValue));
        }
        Integer numM69174a = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_BORDER);
        Float fM69170a = AbstractC28233a.m69170a(SNSMetricElement.FIELD_BORDER_WIDTH);
        int iFloatValue = fM69170a != null ? (int) fM69170a.floatValue() : 0;
        if (numM69174a != null && iFloatValue > 0) {
            Integer numM69174a2 = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_BORDER_FOCUSED);
            int iIntValue2 = numM69174a2 != null ? numM69174a2.intValue() : numM69174a.intValue();
            Integer numM69174a3 = AbstractC28234b.m69174a(this, SNSColorElement.FIELD_BORDER_DISABLED);
            setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_focused}, new int[0]}, new int[]{numM69174a3 != null ? numM69174a3.intValue() : numM69174a.intValue(), iIntValue2, numM69174a.intValue()}));
            setBoxStrokeWidth(iFloatValue);
            setBoxStrokeWidthFocused(iFloatValue);
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.FIELD_PLACEHOLDER;
        C28966p c28966pM69169a2 = AbstractC28233a.m69169a();
        if (c28966pM69169a2 != null && (numM69172a = AbstractC28233a.m69172a(c28966pM69169a2, sNSColorElement2, AbstractC28458h.m69346a(getResources().getConfiguration()))) != null) {
            this.hintColor = Integer.valueOf(numM69172a.intValue());
        }
        SNSMetricElement sNSMetricElement = SNSMetricElement.FIELD_CORNER_RADIUS;
        C28966p c28966pM69169a3 = AbstractC28233a.m69169a();
        if (c28966pM69169a3 != null && (fM69171a = AbstractC28233a.m69171a(c28966pM69169a3, sNSMetricElement)) != null) {
            float fFloatValue = fM69171a.floatValue();
            setBoxCornerRadii(fFloatValue, fFloatValue, fFloatValue, fFloatValue);
        }
        addOnEditTextAttachedListener(new TextInputLayout.OnEditTextAttachedListener() { // from class: com.sumsub.sns.core.widget.SNSTextInputLayout.5
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(TextInputLayout layout) {
                if (TextUtils.getLayoutDirectionFromLocale(C28468k0.f57987e) == 1) {
                    SNSTextInputLayout.this.setLayoutDirection(1);
                    EditText editText = layout.getEditText();
                    if (editText != null) {
                        editText.setLayoutDirection(1);
                    }
                    EditText editText2 = layout.getEditText();
                    if (editText2 != null) {
                        editText2.setTextDirection(1);
                    }
                    EditText editText3 = layout.getEditText();
                    if (editText3 != null) {
                        editText3.setTextAlignment(5);
                    }
                }
                layout.removeOnEditTextAttachedListener(this);
            }
        });
        setBoxBackgroundColor(boxBackgroundColorResolver.getBoxBackgroundColor(sNSStepState));
    }
}
