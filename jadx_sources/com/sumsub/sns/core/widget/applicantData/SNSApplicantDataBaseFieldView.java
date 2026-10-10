package com.sumsub.sns.core.widget.applicantData;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b&\u0018\u00002\u00020\u0001:\u0001QB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010M\u001a\u00020\u0013H\u0004J\b\u0010N\u001a\u00020\u0013H\u0014J\b\u0010O\u001a\u00020\u0013H\u0017J\b\u0010P\u001a\u00020\u0013H\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R$\u0010\u001c\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020+8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u0004\u0018\u000101X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00106\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u0013\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010<\u001a\u0004\u0018\u0001012\b\u0010\u001c\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u0016\u0010?\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010&R\u0016\u0010A\u001a\u0004\u0018\u00010$8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bB\u0010&R(\u0010C\u001a\u0004\u0018\u0001012\b\u0010\u001c\u001a\u0004\u0018\u0001018V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u00103\"\u0004\bE\u00105R(\u0010F\u001a\u0004\u0018\u0001012\b\u0010\u001c\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u00103\"\u0004\bH\u00105R@\u0010I\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0013\u0018\u0001072\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0013\u0018\u000107@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00109\"\u0004\bK\u0010;R\u000e\u0010L\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleIcon", "Landroid/graphics/drawable/Drawable;", "getTitleIcon", "()Landroid/graphics/drawable/Drawable;", "setTitleIcon", "(Landroid/graphics/drawable/Drawable;)V", "onTitleClickCallback", "Lkotlin/Function0;", "", "getOnTitleClickCallback", "()Lkotlin/jvm/functions/Function0;", "setOnTitleClickCallback", "(Lkotlin/jvm/functions/Function0;)V", "setEndSelectionOnSetValue", "", "getSetEndSelectionOnSetValue", "()Z", "value", "Lcom/google/android/material/textfield/TextInputLayout;", "inputLayout", "getInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setInputLayout$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "tvLabel", "Landroid/widget/TextView;", "getTvLabel$idensic_mobile_sdk_aar_defaultRelease", "()Landroid/widget/TextView;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", Constants.ScionAnalytics.PARAM_LABEL, "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "textChangedCallback", "Lkotlin/Function1;", "getTextChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setTextChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "example", "getExample", "setExample", "tvExample", "getTvExample", "tvError", "getTvError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "getError", "setError", "hint", "getHint", "setHint", "onLinkClicked", "getOnLinkClicked", "setOnLinkClicked", "initizationFinishedCalled", "onInitializationFinished", "onAttachedToWindow", "reset", "clear", "Selectable", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataBaseFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataBaseFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n65#2,16:139\n93#2,3:155\n1#3:158\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataBaseFieldView.kt\ncom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView\n*L\n102#1:139,16\n102#1:155,3\n*E\n"})
public abstract class SNSApplicantDataBaseFieldView extends ConstraintLayout {
    private boolean initizationFinishedCalled;

    @Nullable
    private TextInputLayout inputLayout;

    @Nullable
    private Function1<? super String, Unit> onLinkClicked;

    @Nullable
    private Function0<Unit> onTitleClickCallback;
    private final boolean setEndSelectionOnSetValue;

    @Nullable
    private Function1<? super String, Unit> textChangedCallback;

    @Nullable
    private Drawable titleIcon;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView$Selectable;", "", "openSelector", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface Selectable {
        void openSelector();
    }

    @JvmOverloads
    public SNSApplicantDataBaseFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @CallSuper
    public void clear() {
        setOnLinkClicked(null);
        this.textChangedCallback = null;
    }

    @Nullable
    public abstract CharSequence getLabel();

    public final void onInitializationFinished() {
        this.initizationFinishedCalled = true;
        EditText editText = getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView$onInitializationFinished$$inlined$addTextChangedListener$default$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s11) {
                    Function1<String, Unit> textChangedCallback = this.this$0.getTextChangedCallback();
                    if (textChangedCallback != null) {
                        textChangedCallback.invoke(s11 != null ? s11.toString() : null);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                }
            });
        }
        if (TextUtils.getLayoutDirectionFromLocale(C28468k0.f57987e) == 1) {
            TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
            if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
                tvLabel$idensic_mobile_sdk_aar_defaultRelease.setTextDirection(1);
            }
            TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease2 = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
            if (tvLabel$idensic_mobile_sdk_aar_defaultRelease2 != null) {
                tvLabel$idensic_mobile_sdk_aar_defaultRelease2.setTextAlignment(5);
            }
            TextView tvExample = getTvExample();
            if (tvExample != null) {
                tvExample.setTextDirection(1);
            }
            TextView tvExample2 = getTvExample();
            if (tvExample2 != null) {
                tvExample2.setTextAlignment(5);
            }
        }
    }

    public abstract void setLabel(@Nullable CharSequence charSequence);

    @JvmOverloads
    public SNSApplicantDataBaseFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final TextView getTvExample() {
        return (TextView) findViewById(R$id.sns_example);
    }

    @Nullable
    public final EditText getEditText() {
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null) {
            return textInputLayout.getEditText();
        }
        return null;
    }

    @Nullable
    public CharSequence getError() {
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout != null) {
            return textInputLayout.getError();
        }
        return null;
    }

    @Nullable
    public final CharSequence getHint() {
        EditText editText;
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
            return null;
        }
        return editText.getHint();
    }

    @Nullable
    public final TextInputLayout getInputLayout() {
        return this.inputLayout;
    }

    @Nullable
    public Function1<String, Unit> getOnLinkClicked() {
        return this.onLinkClicked;
    }

    @Nullable
    public Function0<Unit> getOnTitleClickCallback() {
        return this.onTitleClickCallback;
    }

    public boolean getSetEndSelectionOnSetValue() {
        return this.setEndSelectionOnSetValue;
    }

    @Nullable
    public final Function1<String, Unit> getTextChangedCallback() {
        return this.textChangedCallback;
    }

    @Nullable
    public Drawable getTitleIcon() {
        return this.titleIcon;
    }

    @Nullable
    public final TextView getTvError() {
        return (TextView) findViewById(R$id.sns_error);
    }

    @Nullable
    public final TextView getTvLabel$idensic_mobile_sdk_aar_defaultRelease() {
        return (TextView) findViewById(R$id.sns_label);
    }

    @NotNull
    public String getValue() {
        String rawText;
        TextInputLayout textInputLayout = this.inputLayout;
        EditText editText = textInputLayout != null ? textInputLayout.getEditText() : null;
        SNSTextInputEditText sNSTextInputEditText = editText instanceof SNSTextInputEditText ? (SNSTextInputEditText) editText : null;
        if (sNSTextInputEditText == null || (rawText = sNSTextInputEditText.getRawText()) == null) {
            return String.valueOf(editText != null ? editText.getText() : null);
        }
        return rawText;
    }

    public void setError(@Nullable CharSequence charSequence) {
        EditText editText;
        TextInputLayout textInputLayout;
        EditText editText2;
        Editable text;
        TextInputLayout textInputLayout2 = this.inputLayout;
        if (textInputLayout2 != null) {
            textInputLayout2.setError(charSequence);
        }
        TextInputLayout textInputLayout3 = this.inputLayout;
        if (textInputLayout3 == null || (editText = textInputLayout3.getEditText()) == null) {
            return;
        }
        editText.setSelection((!getSetEndSelectionOnSetValue() || (textInputLayout = this.inputLayout) == null || (editText2 = textInputLayout.getEditText()) == null || (text = editText2.getText()) == null) ? 0 : text.length());
    }

    public final void setHint(@Nullable CharSequence charSequence) {
        EditText editText;
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
            return;
        }
        editText.setHint(charSequence);
    }

    public final void setInputLayout$idensic_mobile_sdk_aar_defaultRelease(@Nullable TextInputLayout textInputLayout) {
        this.inputLayout = textInputLayout;
    }

    public void setOnTitleClickCallback(@Nullable Function0<Unit> function0) {
        this.onTitleClickCallback = function0;
    }

    public final void setTextChangedCallback(@Nullable Function1<? super String, Unit> function1) {
        this.textChangedCallback = function1;
    }

    public void setTitleIcon(@Nullable Drawable drawable) {
        this.titleIcon = drawable;
    }

    public void setValue(@NotNull String str) {
        EditText editText;
        TextInputLayout textInputLayout = this.inputLayout;
        if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
            return;
        }
        editText.setText(str);
        editText.setSelection(getSetEndSelectionOnSetValue() ? editText.getText().length() : 0);
    }

    @JvmOverloads
    public SNSApplicantDataBaseFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Nullable
    public final CharSequence getExample() {
        TextView tvExample = getTvExample();
        if (tvExample != null) {
            return tvExample.getText();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.initizationFinishedCalled) {
            return;
        }
        throw new IllegalStateException(("onInitializationFinished not called for " + AbstractC28458h.m69333a((Object) this)).toString());
    }

    @CallSuper
    public void reset() {
        EditText editText = getEditText();
        if (editText != null) {
            editText.setInputType(1);
            editText.setFilters(new InputFilter[0]);
        }
    }

    public final void setExample(@Nullable CharSequence charSequence) {
        TextView tvExample = getTvExample();
        if (tvExample != null) {
            AbstractC28458h.m69341a(tvExample, charSequence);
        }
    }

    public void setOnLinkClicked(@Nullable Function1<? super String, Unit> function1) {
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28485q.m69381a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, function1);
        }
        TextView tvExample = getTvExample();
        if (tvExample != null) {
            AbstractC28485q.m69381a(tvExample, function1);
        }
        this.onLinkClicked = function1;
    }

    public /* synthetic */ SNSApplicantDataBaseFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataBaseFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.setEndSelectionOnSetValue = true;
    }
}
