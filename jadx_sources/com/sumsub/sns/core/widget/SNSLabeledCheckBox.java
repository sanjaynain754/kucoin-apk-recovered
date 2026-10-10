package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.CompoundButtonCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R@\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R@\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u0006%"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSLabeledCheckBox;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "checkBox", "Landroid/widget/CheckBox;", "textView", "Landroid/widget/TextView;", "isUpdating", "", "value", "isChecked", "()Z", "setChecked", "(Z)V", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", "onCheckedChanged", "getOnCheckedChanged", "()Lkotlin/jvm/functions/Function1;", "setOnCheckedChanged", "(Lkotlin/jvm/functions/Function1;)V", "", "onLinkClicked", "getOnLinkClicked", "setOnLinkClicked", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSLabeledCheckBox extends LinearLayout {

    @NotNull
    private final CheckBox checkBox;
    private boolean isUpdating;

    @Nullable
    private Function1<? super Boolean, Unit> onCheckedChanged;

    @Nullable
    private Function1<? super String, Unit> onLinkClicked;

    @NotNull
    private final TextView textView;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SNSLabeledCheckBox(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public final void setChecked(boolean z11) {
        this.isUpdating = true;
        this.checkBox.setChecked(z11);
        this.isUpdating = false;
    }

    public /* synthetic */ SNSLabeledCheckBox(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SNSLabeledCheckBox sNSLabeledCheckBox, View view) {
        sNSLabeledCheckBox.checkBox.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_onCheckedChanged_$lambda$0(SNSLabeledCheckBox sNSLabeledCheckBox, Function1 function1, CompoundButton compoundButton, boolean z11) {
        if (sNSLabeledCheckBox.isUpdating || function1 == null) {
            return;
        }
        function1.invoke(Boolean.valueOf(z11));
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnCheckedChanged() {
        return this.onCheckedChanged;
    }

    @Nullable
    public final Function1<String, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Nullable
    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final boolean isChecked() {
        return this.checkBox.isChecked();
    }

    public final void setOnCheckedChanged(@Nullable final Function1<? super Boolean, Unit> function1) {
        this.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.sumsub.sns.core.widget.a0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SNSLabeledCheckBox._set_onCheckedChanged_$lambda$0(this.f57538b, function1, compoundButton, z11);
            }
        });
        this.onCheckedChanged = function1;
    }

    public final void setOnLinkClicked(@Nullable Function1<? super String, Unit> function1) {
        AbstractC28485q.m69381a(this.textView, function1);
        this.onLinkClicked = function1;
    }

    public final void setText(@Nullable CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @JvmOverloads
    public SNSLabeledCheckBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R$layout.sns_layout_labeled_checkbox, (ViewGroup) this, true);
        CheckBox checkBox = (CheckBox) findViewById(R$id.sns_checkbox);
        this.checkBox = checkBox;
        TextView textView = (TextView) findViewById(R$id.sns_checkbox_text);
        this.textView = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.core.widget.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SNSLabeledCheckBox._init_$lambda$1(this.f57619b, view);
            }
        });
        Integer numM69174a = AbstractC28234b.m69174a(checkBox, SNSColorElement.CONTENT_WEAK);
        if (numM69174a != null) {
            int iIntValue = numM69174a.intValue();
            Integer numM69174a2 = AbstractC28234b.m69174a(checkBox, SNSColorElement.FIELD_TINT);
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{iIntValue, numM69174a2 != null ? numM69174a2.intValue() : iIntValue});
            CompoundButtonCompat.setButtonTintList(checkBox, colorStateList);
            TextViewCompat.setCompoundDrawableTintList(checkBox, colorStateList);
        }
        checkBox.setCompoundDrawablePadding(getResources().getDimensionPixelSize(R$dimen.sns_margin_small));
    }
}
