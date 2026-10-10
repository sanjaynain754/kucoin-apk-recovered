package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.helper.AbstractC28234b;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28461i;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0006\u0010'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\fJ\u0010\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020&H\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSApplicantDataFieldView;", "Lcom/sumsub/sns/core/widget/applicantData/SNSApplicantDataBaseFieldView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "saveKeyListener", "Landroid/text/method/KeyListener;", "copySuccessDrawable", "Landroid/graphics/drawable/Drawable;", "getCopySuccessDrawable", "()Landroid/graphics/drawable/Drawable;", "copySuccessDrawable$delegate", "Lkotlin/Lazy;", "copySuccessTint", "Landroid/content/res/ColorStateList;", "getCopySuccessTint", "()Landroid/content/res/ColorStateList;", "copySuccessTint$delegate", "copySuccessRunnable", "Ljava/lang/Runnable;", "reset", "", "initDefaults", "setEnabled", "enabled", "", "disableInput", "enableInput", "enableCopyToClipboard", "copyAction", "setShowCheckmark", TIMPushProvider.f75062n, "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSApplicantDataFieldView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSApplicantDataFieldView.kt\ncom/sumsub/sns/core/widget/SNSApplicantDataFieldView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n233#2,3:165\n58#3,23:168\n93#3,3:191\n298#4,2:194\n1#5:196\n*S KotlinDebug\n*F\n+ 1 SNSApplicantDataFieldView.kt\ncom/sumsub/sns/core/widget/SNSApplicantDataFieldView\n*L\n65#1:165,3\n77#1:168,23\n77#1:191,3\n155#1:194,2\n*E\n"})
public class SNSApplicantDataFieldView extends SNSApplicantDataBaseFieldView {

    /* JADX INFO: renamed from: copySuccessDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy copySuccessDrawable;

    @NotNull
    private final Runnable copySuccessRunnable;

    /* JADX INFO: renamed from: copySuccessTint$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy copySuccessTint;

    @Nullable
    private KeyListener saveKeyListener;

    @JvmOverloads
    public SNSApplicantDataFieldView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m69190a(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 5) {
            return false;
        }
        View viewFocusSearch = textView.focusSearch(130);
        if (viewFocusSearch instanceof SNSApplicantDataBaseFieldView.Selectable) {
            ((SNSApplicantDataBaseFieldView.Selectable) viewFocusSearch).openSelector();
            return true;
        }
        if (!(viewFocusSearch instanceof TextInputLayout)) {
            if (viewFocusSearch == 0) {
                return true;
            }
            viewFocusSearch.requestFocus();
            return true;
        }
        EditText editText = ((TextInputLayout) viewFocusSearch).getEditText();
        if (editText == null) {
            return true;
        }
        editText.requestFocus();
        return true;
    }

    @JvmOverloads
    public SNSApplicantDataFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable copySuccessDrawable_delegate$lambda$0(Context context) {
        return C28468k0.f57983a.getIconHandler().onResolveIcon(context, SNSIconHandler.SNSCommonIcons.SUCCESS_CHECK.getImageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorStateList copySuccessTint_delegate$lambda$2(SNSApplicantDataFieldView sNSApplicantDataFieldView) {
        TextView suffixTextView;
        TextPaint paint;
        Integer numM69174a = AbstractC28234b.m69174a(sNSApplicantDataFieldView, SNSColorElement.CONTENT_LINK);
        if (numM69174a == null) {
            TextInputLayout inputLayout = sNSApplicantDataFieldView.getInputLayout();
            numM69174a = (inputLayout == null || (suffixTextView = inputLayout.getSuffixTextView()) == null || (paint = suffixTextView.getPaint()) == null) ? null : Integer.valueOf(paint.linkColor);
        }
        if (numM69174a != null) {
            return ColorStateList.valueOf(numM69174a.intValue());
        }
        return null;
    }

    private final Drawable getCopySuccessDrawable() {
        return (Drawable) this.copySuccessDrawable.getValue();
    }

    private final ColorStateList getCopySuccessTint() {
        return (ColorStateList) this.copySuccessTint.getValue();
    }

    @JvmOverloads
    public SNSApplicantDataFieldView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableCopyToClipboard$lambda$12$lambda$11(TextInputLayout textInputLayout, SNSApplicantDataFieldView sNSApplicantDataFieldView, String str) {
        Spannable spannable;
        if (textInputLayout.getSuffixTextView().getAnimation() != null) {
            return Unit.INSTANCE;
        }
        CharSequence suffixText = textInputLayout.getSuffixText();
        CharSequence hint = null;
        if (suffixText instanceof Spannable) {
            spannable = (Spannable) suffixText;
        } else {
            spannable = null;
        }
        if (spannable != null) {
            Selection.setSelection(spannable, 0);
        }
        String value = sNSApplicantDataFieldView.getValue();
        if (value.length() > 0) {
            hint = value;
        }
        if (hint == null) {
            hint = sNSApplicantDataFieldView.getHint();
        }
        if (hint != null && hint.length() != 0) {
            Context context = textInputLayout.getContext();
            CharSequence label = sNSApplicantDataFieldView.getLabel();
            if (label == null) {
                label = "";
            }
            AbstractC28461i.m69360a(context, label, hint);
            sNSApplicantDataFieldView.setShowCheckmark(true);
            textInputLayout.removeCallbacks(sNSApplicantDataFieldView.copySuccessRunnable);
            textInputLayout.postDelayed(sNSApplicantDataFieldView.copySuccessRunnable, 3000L);
        }
        return Unit.INSTANCE;
    }

    private final void initDefaults() {
        EditText editText = getEditText();
        if (editText != null) {
            editText.setInputType(1);
            editText.setMaxLines(1);
            editText.setImeOptions(5);
        }
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setHintEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCheckmark(boolean show) {
        int i11;
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            TextView suffixTextView = inputLayout.getSuffixTextView();
            int i12 = 0;
            if (show) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            suffixTextView.setVisibility(i11);
            if (show) {
                i12 = -1;
            }
            inputLayout.setEndIconMode(i12);
            if (show) {
                inputLayout.setEndIconDrawable(getCopySuccessDrawable());
                inputLayout.setEndIconTintList(getCopySuccessTint());
            }
        }
    }

    public final void disableInput() {
        KeyListener keyListener;
        EditText editText;
        KeyListener keyListener2;
        EditText editText2 = getEditText();
        if (editText2 != null) {
            keyListener = editText2.getKeyListener();
        } else {
            keyListener = null;
        }
        if (keyListener != null) {
            EditText editText3 = getEditText();
            if (editText3 != null) {
                keyListener2 = editText3.getKeyListener();
            } else {
                keyListener2 = null;
            }
            this.saveKeyListener = keyListener2;
        }
        EditText editText4 = getEditText();
        if (editText4 != null) {
            editText4.setKeyListener(null);
        }
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.setKeyListener(null);
        }
    }

    public final void enableCopyToClipboard(@NotNull CharSequence copyAction) {
        ViewGroup viewGroup;
        final TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            ViewParent parent = inputLayout.getSuffixTextView().getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                AbstractC28458h.m69340a(viewGroup, 2, 3);
            }
            setShowCheckmark(false);
            inputLayout.setSuffixText(AbstractC28462i0.m69364a("[" + ((Object) copyAction) + "](" + ((Object) copyAction) + ")", inputLayout.getContext()));
            AbstractC28485q.m69381a(inputLayout.getSuffixTextView(), new Function1() { // from class: com.sumsub.sns.core.widget.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SNSApplicantDataFieldView.enableCopyToClipboard$lambda$12$lambda$11(inputLayout, this, (String) obj);
                }
            });
        }
    }

    public final void enableInput() {
        KeyListener keyListener;
        EditText editText;
        EditText editText2 = getEditText();
        if (editText2 != null) {
            keyListener = editText2.getKeyListener();
        } else {
            keyListener = null;
        }
        if (keyListener == null && (editText = getEditText()) != null) {
            editText.setKeyListener(this.saveKeyListener);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    @Nullable
    public CharSequence getLabel() {
        CharSequence text;
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null && (text = tvLabel$idensic_mobile_sdk_aar_defaultRelease.getText()) != null) {
            return text;
        }
        return "";
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void reset() {
        super.reset();
        initDefaults();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null) {
            inputLayout.setEnabled(enabled);
        }
    }

    @Override // com.sumsub.sns.core.widget.applicantData.SNSApplicantDataBaseFieldView
    public void setLabel(@Nullable CharSequence charSequence) {
        TextView tvLabel$idensic_mobile_sdk_aar_defaultRelease = getTvLabel$idensic_mobile_sdk_aar_defaultRelease();
        if (tvLabel$idensic_mobile_sdk_aar_defaultRelease != null) {
            AbstractC28458h.m69341a(tvLabel$idensic_mobile_sdk_aar_defaultRelease, charSequence);
        }
    }

    public /* synthetic */ SNSApplicantDataFieldView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_applicantDataFieldViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSApplicantDataFieldView : i12);
    }

    @JvmOverloads
    public SNSApplicantDataFieldView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        EditText editText;
        super(context, attributeSet, i11, i12);
        this.copySuccessDrawable = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.core.widget.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSApplicantDataFieldView.copySuccessDrawable_delegate$lambda$0(context);
            }
        });
        this.copySuccessTint = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.core.widget.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSApplicantDataFieldView.copySuccessTint_delegate$lambda$2(this.f57571b);
            }
        });
        this.copySuccessRunnable = new Runnable() { // from class: com.sumsub.sns.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f57573b.setShowCheckmark(false);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSApplicantDataFieldView, i11, i12);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(R$styleable.SNSApplicantDataFieldView_sns_applicantDataFieldLayout, R$layout.sns_layout_applicant_data_field), (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        setInputLayout$idensic_mobile_sdk_aar_defaultRelease((TextInputLayout) findViewById(R$id.sns_editor_layout));
        TextInputLayout inputLayout = getInputLayout();
        if (inputLayout != null && (editText = inputLayout.getEditText()) != null) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sumsub.sns.core.widget.SNSApplicantDataFieldView$special$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(@Nullable Editable s11) {
                    TextInputLayout inputLayout2 = this.this$0.getInputLayout();
                    if (inputLayout2 != null) {
                        inputLayout2.setError(null);
                    }
                    TextInputLayout inputLayout3 = this.this$0.getInputLayout();
                    if (inputLayout3 != null) {
                        inputLayout3.setErrorEnabled(false);
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
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sumsub.sns.core.widget.f
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                    return SNSApplicantDataFieldView.m69190a(textView, i13, keyEvent);
                }
            });
        }
        initDefaults();
        onInitializationFinished();
    }
}
