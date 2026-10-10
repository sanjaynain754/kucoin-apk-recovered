package com.revolut.revolutpay.ui_kit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import bb0.C4544a;
import bb0.C4546c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.revolut.revolutpay.R$drawable;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.ui_kit.params.C27595c;
import com.revolut.revolutpay.ui_kit.params.EnumC27596d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import wa0.C45784e;
import ya0.AbstractC46424c;
import ya0.C46422a;
import ya0.C46423b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0!¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m90084d2 = {"Lcom/revolut/revolutpay/ui_kit/widget/PhoneInputWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Landroid/view/View$OnKeyListener;", "getKeyListener", "()Landroid/view/View$OnKeyListener;", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCountryCodeClickListener", "(Landroid/view/View$OnClickListener;)V", "", "text", "setPhoneText", "(Ljava/lang/String;)V", "Lcom/revolut/revolutpay/ui_kit/params/d;", "phoneInputState", "setPhoneInputState", "(Lcom/revolut/revolutpay/ui_kit/params/d;)V", "Lya0/c;", "variant", "setTextColorVariant", "(Lya0/c;)V", "Lcom/revolut/revolutpay/ui_kit/params/c;", "getPhoneInputData", "()Lcom/revolut/revolutpay/ui_kit/params/c;", "Lkotlin/Function1;", "setPhoneNumberListener", "(Lkotlin/jvm/functions/Function1;)V", "", "enabled", "setEnabled", "(Z)V", "Landroid/widget/EditText;", "n", "Landroid/widget/EditText;", "phoneEditText", "Landroidx/appcompat/widget/AppCompatTextView;", "o", "Landroidx/appcompat/widget/AppCompatTextView;", "countryCodeText", "Landroidx/appcompat/widget/AppCompatImageView;", "p", "Landroidx/appcompat/widget/AppCompatImageView;", "countryFlagImageView", "Landroid/view/ViewGroup;", "q", "Landroid/view/ViewGroup;", "countryCodeLayout", "Landroid/view/View;", "r", "Landroid/view/View;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lbb0/a;", CmcdData.Factory.STREAMING_FORMAT_SS, "Lbb0/a;", "countryCodePhoneNumberFormattingTextWatcher", "t", "Lya0/c;", "textColorVariant", "u", "Z", "hasInvalidNumber", "v", "Lkotlin/jvm/functions/Function1;", "phoneNumberChangedListener", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class PhoneInputWidget extends ConstraintLayout {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final EditText phoneEditText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final AppCompatTextView countryCodeText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final AppCompatImageView countryFlagImageView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final ViewGroup countryCodeLayout;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final View error;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final C4544a countryCodePhoneNumberFormattingTextWatcher;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public AbstractC46424c textColorVariant;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean hasInvalidNumber;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public Function1<? super C27595c, Unit> phoneNumberChangedListener;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.widget.PhoneInputWidget$a */
    public static final class C27597a extends Lambda implements Function1<String, Unit> {
        public C27597a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m68544a(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Function1 function1 = PhoneInputWidget.this.phoneNumberChangedListener;
            if (function1 != null) {
                function1.invoke(new C27595c(PhoneInputWidget.this.countryCodeText.getText().toString(), it));
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            m68544a(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PhoneInputWidget(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PhoneInputWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C46422a c46422a = C46422a.f104092d;
        this.textColorVariant = c46422a;
        View.inflate(context, R$layout.internal_phone_input, this);
        View viewFindViewById = findViewById(R$id.internal_phone_input_phoneEditText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.intern…hone_input_phoneEditText)");
        EditText editText = (EditText) viewFindViewById;
        this.phoneEditText = editText;
        View viewFindViewById2 = findViewById(R$id.internal_phone_input_countryCodeText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.intern…ne_input_countryCodeText)");
        this.countryCodeText = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.internal_phone_input_countryImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.intern…phone_input_countryImage)");
        this.countryFlagImageView = (AppCompatImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.internal_phone_input_countryCodeLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.intern…_input_countryCodeLayout)");
        this.countryCodeLayout = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.internal_phone_input_error);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.internal_phone_input_error)");
        this.error = viewFindViewById5;
        C4544a c4544a = new C4544a(new C4546c());
        this.countryCodePhoneNumberFormattingTextWatcher = c4544a;
        c4544a.m4425a(new C27597a());
        editText.addTextChangedListener(c4544a);
        editText.setOnKeyListener(getKeyListener());
        setTextColorVariant(c46422a);
    }

    /* JADX INFO: renamed from: a */
    private final void m68539a() {
        int i11;
        boolean z11 = this.textColorVariant instanceof C46423b;
        if (z11 && this.hasInvalidNumber) {
            i11 = R$drawable.internal_revolut_pay_input_background_error_dark;
        } else if (z11) {
            i11 = R$drawable.internal_revolut_pay_input_background_dark;
        } else {
            i11 = this.hasInvalidNumber ? R$drawable.internal_revolut_pay_input_background_error : R$drawable.internal_revolut_pay_input_background;
        }
        this.phoneEditText.setBackground(AppCompatResources.getDrawable(getContext(), i11));
        this.countryCodeLayout.setBackground(AppCompatResources.getDrawable(getContext(), i11));
    }

    private final View.OnKeyListener getKeyListener() {
        return new View.OnKeyListener() { // from class: com.revolut.revolutpay.ui_kit.widget.b
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                return PhoneInputWidget.m68542c(this.f56411b, view, i11, keyEvent);
            }
        };
    }

    @NotNull
    public final C27595c getPhoneInputData() {
        return new C27595c(this.countryCodeText.getText().toString(), this.phoneEditText.getText().toString());
    }

    public final void setCountryCodeClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.countryCodeLayout.setOnClickListener(listener);
    }

    public final void setPhoneNumberListener(@NotNull Function1<? super C27595c, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.phoneNumberChangedListener = listener;
    }

    public /* synthetic */ PhoneInputWidget(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m68542c(PhoneInputWidget this$0, View view, int i11, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (keyEvent.getAction() == 0 && i11 == 66) {
            this$0.phoneEditText.clearFocus();
            C45784e.m101110a(this$0);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.countryCodeLayout.setEnabled(enabled);
        this.phoneEditText.setEnabled(enabled);
    }

    public final void setPhoneInputState(@NotNull EnumC27596d phoneInputState) {
        boolean z11;
        Intrinsics.checkNotNullParameter(phoneInputState, "phoneInputState");
        if (phoneInputState == EnumC27596d.INVALID) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.hasInvalidNumber = z11;
        if (z11) {
            this.error.setVisibility(0);
        } else {
            this.error.setVisibility(8);
        }
        m68539a();
    }

    public final void setPhoneText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.phoneEditText.setText(text);
    }

    public final void setTextColorVariant(@NotNull AbstractC46424c variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.textColorVariant = variant;
        this.phoneEditText.setTextColor(variant.m102390a());
        this.countryCodeText.setTextColor(variant.m102390a());
        this.phoneEditText.setHintTextColor(variant.m102391b());
        m68539a();
    }
}
