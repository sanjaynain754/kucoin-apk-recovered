package com.sumsub.sns.internal.features.presentation.verification;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.autocompletePhone.PhoneKitProviderKt;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.util.AbstractC33407i;
import kotlinx.coroutines.C41696j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/verification/p;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/verification/E;", "Lcom/sumsub/sns/internal/features/presentation/verification/j0;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/verification/e", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSVerificationStepFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSVerificationStepFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 Extensions.kt\ncom/sumsub/sns/internal/core/common/ExtensionsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n106#2,15:438\n49#3:453\n65#3,16:454\n93#3,3:470\n119#4:473\n133#4,3:474\n254#5:477\n256#5,2:479\n1#6:478\n*S KotlinDebug\n*F\n+ 1 SNSVerificationStepFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepFragment\n*L\n72#1:438,15\n100#1:453\n100#1:454,16\n100#1:470,3\n110#1:473\n110#1:474,3\n127#1:477\n229#1:479,2\n*E\n"})
public final class C32730p extends AbstractC28064I<AbstractC32680E, C32720j0> {

    /* JADX INFO: renamed from: a */
    public final C28404L f66966a = new C28404L(R$id.sns_title);

    /* JADX INFO: renamed from: b */
    public final C28404L f66967b = new C28404L(R$id.sns_subtitle);

    /* JADX INFO: renamed from: c */
    public final C28404L f66968c = new C28404L(R$id.sns_footer);

    /* JADX INFO: renamed from: d */
    public final C28404L f66969d = new C28404L(R$id.sns_email);

    /* JADX INFO: renamed from: e */
    public final C28404L f66970e = new C28404L(R$id.sns_email_id);

    /* JADX INFO: renamed from: f */
    public final C28404L f66971f = new C28404L(R$id.sns_phone);

    /* JADX INFO: renamed from: g */
    public final C28404L f66972g = new C28404L(R$id.sns_phone_id);

    /* JADX INFO: renamed from: h */
    public final C28404L f66973h = new C28404L(R$id.sns_pin_code);

    /* JADX INFO: renamed from: i */
    public final C28404L f66974i = new C28404L(R$id.sns_resend_verification_code);

    /* JADX INFO: renamed from: j */
    public final C28404L f66975j = new C28404L(R$id.sns_status_icon);

    /* JADX INFO: renamed from: k */
    public final C28404L f66976k = new C28404L(R$id.sns_status_comment);

    /* JADX INFO: renamed from: l */
    public final C28404L f66977l = new C28404L(R$id.sns_primary_button);

    /* JADX INFO: renamed from: m */
    public final C28404L f66978m = new C28404L(R$id.sns_otp_error);

    /* JADX INFO: renamed from: n */
    public final Lazy f66979n;

    /* JADX INFO: renamed from: o */
    public PhoneKit f66980o;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty[] f66965q = {AbstractC28118g.m69077a(C32730p.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32730p.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32730p.class, "tvFooter", "getTvFooter()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32730p.class, "tlEmail", "getTlEmail()Lcom/google/android/material/textfield/TextInputLayout;", 0), AbstractC28118g.m69077a(C32730p.class, "etEmailId", "getEtEmailId()Lcom/google/android/material/textfield/TextInputEditText;", 0), AbstractC28118g.m69077a(C32730p.class, "tlPhone", "getTlPhone()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", 0), AbstractC28118g.m69077a(C32730p.class, "etPhone", "getEtPhone()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", 0), AbstractC28118g.m69077a(C32730p.class, "pinCode", "getPinCode()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0), AbstractC28118g.m69077a(C32730p.class, "tvResendCode", "getTvResendCode()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32730p.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0), AbstractC28118g.m69077a(C32730p.class, "tvStatus", "getTvStatus()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C32730p.class, "btnPrimary", "getBtnPrimary()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C32730p.class, "otpErrorText", "getOtpErrorText()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: p */
    public static final C32709e f66964p = new C32709e();

    /* JADX INFO: renamed from: a */
    public static final void m71313a(C32730p c32730p, View view) {
        C32720j0 c32720j0 = (C32720j0) c32730p.f66979n.getValue();
        c32720j0.getClass();
        c32720j0.m71305a(SNSVerificationStepViewModel$Step.INIT);
        C28936t c28936t = c32720j0.f66945m;
        KProperty kProperty = C32720j0.f66932t[3];
        c28936t.f58834a.set(c28936t.f58835b, null);
        c32720j0.m71307a((CharSequence) null);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m71319b(C32730p c32730p, String str) {
        AbstractC28052C.onLinkClicked$default((C32720j0) c32730p.f66979n.getValue(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final Button m71324f() {
        return (Button) this.f66977l.getValue(this, f66965q[11]);
    }

    /* JADX INFO: renamed from: g */
    public final TextInputEditText m71325g() {
        return (TextInputEditText) this.f66970e.getValue(this, f66965q[4]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_verification_step);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF65153b() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C32720j0) this.f66979n.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final SNSTextInputEditText m71326h() {
        return (SNSTextInputEditText) this.f66972g.getValue(this, f66965q[6]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C32736s) {
            SNSPinView sNSPinViewM71328j = m71328j();
            if (sNSPinViewM71328j != null) {
                sNSPinViewM71328j.setText((CharSequence) null);
            }
            SNSPinView sNSPinViewM71328j2 = m71328j();
            if (sNSPinViewM71328j2 != null) {
                AbstractC28458h.m69356f(sNSPinViewM71328j2);
            }
            SNSPinView sNSPinViewM71328j3 = m71328j();
            if (sNSPinViewM71328j3 != null) {
                sNSPinViewM71328j3.addTextChangedListener(new C32713g(sNSPinViewM71328j3, this));
                return;
            }
            return;
        }
        if (interfaceC28145r instanceof C32732q) {
            AbstractC28133l.setResult$default(this, 2, null, 2, null);
            return;
        }
        if (!(interfaceC28145r instanceof C32734r)) {
            super.handleEvent(interfaceC28145r);
        } else if (isForResult()) {
            AbstractC28133l.setResult$default(this, 1, null, 2, null);
        } else {
            AbstractC28133l.finish$idensic_mobile_sdk_aar_defaultRelease$default(this, new C28494t(), null, null, 6, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        AbstractC32680E abstractC32680E = (AbstractC32680E) interfaceC28147s;
        if (abstractC32680E instanceof C32678C) {
            m71322a((C32678C) abstractC32680E);
            return;
        }
        if (abstractC32680E instanceof C32679D) {
            m71323a((C32679D) abstractC32680E);
        } else if (abstractC32680E instanceof C32677B) {
            m71321a((C32677B) abstractC32680E);
        } else if (abstractC32680E instanceof C32676A) {
            m71320a((C32676A) abstractC32680E);
        }
    }

    /* JADX INFO: renamed from: i */
    public final ImageView m71327i() {
        return (ImageView) this.f66975j.getValue(this, f66965q[9]);
    }

    /* JADX INFO: renamed from: j */
    public final SNSPinView m71328j() {
        return (SNSPinView) this.f66973h.getValue(this, f66965q[7]);
    }

    /* JADX INFO: renamed from: k */
    public final TextInputLayout m71329k() {
        return (TextInputLayout) this.f66969d.getValue(this, f66965q[3]);
    }

    /* JADX INFO: renamed from: l */
    public final SNSFlaggedInputLayout m71330l() {
        return (SNSFlaggedInputLayout) this.f66971f.getValue(this, f66965q[5]);
    }

    /* JADX INFO: renamed from: m */
    public final TextView m71331m() {
        return (TextView) this.f66974i.getValue(this, f66965q[8]);
    }

    /* JADX INFO: renamed from: n */
    public final TextView m71332n() {
        return (TextView) this.f66967b.getValue(this, f66965q[1]);
    }

    /* JADX INFO: renamed from: o */
    public final TextView m71333o() {
        return (TextView) this.f66966a.getValue(this, f66965q[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) {
            SNSPinView sNSPinViewM71328j = m71328j();
            if (sNSPinViewM71328j != null && sNSPinViewM71328j.getVisibility() == 0) {
                C32720j0 c32720j0 = (C32720j0) this.f66979n.getValue();
                c32720j0.getClass();
                c32720j0.m71305a(SNSVerificationStepViewModel$Step.INIT);
                C28936t c28936t = c32720j0.f66945m;
                KProperty kProperty = C32720j0.f66932t[3];
                c28936t.f58834a.set(c28936t.f58835b, null);
                c32720j0.m71307a((CharSequence) null);
                SNSPinView sNSPinViewM71328j2 = m71328j();
                if (sNSPinViewM71328j2 == null) {
                    return false;
                }
                AbstractC28458h.m69339a((View) sNSPinViewM71328j2);
                return false;
            }
            AbstractC28133l.setResult$default(this, 5, null, 2, null);
        }
        m69084e();
        return true;
    }

    public C32730p() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32730p.m71311a(this.f66989b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C32723l(new C32721k(this)));
        this.f66979n = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C32720j0.class), new C32725m(lazy), new C32727n(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66111b() {
        Object obj;
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.get("ValidationIdentifier");
        } else {
            obj = null;
        }
        int i11 = AbstractC32711f.f66910a[((ValidationIdentifierType) obj).ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "PHONE_VERIFICATION";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "EMAIL_VERIFICATION";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        TextInputEditText textInputEditTextM71325g = m71325g();
        if (textInputEditTextM71325g != null) {
            textInputEditTextM71325g.addTextChangedListener(new C32715h(this));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71312a(C32730p c32730p, String str) {
        AbstractC28052C.onLinkClicked$default((C32720j0) c32730p.f66979n.getValue(), str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m71311a(C32730p c32730p) {
        Bundle arguments = c32730p.getArguments();
        ValidationIdentifierType validationIdentifierType = (ValidationIdentifierType) (arguments != null ? arguments.get("ValidationIdentifier") : null);
        Bundle arguments2 = c32730p.getArguments();
        return new C32740v(c32730p, validationIdentifierType, arguments2 != null ? arguments2.getBoolean("SendPhoneCodeImmediately", false) : false, c32730p.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c32730p.getArguments());
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX INFO: renamed from: a */
    public final void m71322a(final C32678C c32678c) {
        TextInputEditText textInputEditTextM71325g;
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "showValidateEmailForm " + c32678c, null, 4, null);
        AbstractC28458h.m69352b(m71333o(), m71332n(), m71329k(), m71325g(), m71324f());
        SNSFlaggedInputLayout sNSFlaggedInputLayoutM71330l = m71330l();
        SNSTextInputEditText sNSTextInputEditTextM71326h = m71326h();
        SNSPinView sNSPinViewM71328j = m71328j();
        C28404L c28404l = this.f66978m;
        KProperty[] kPropertyArr = f66965q;
        AbstractC28458h.m69344a(sNSFlaggedInputLayoutM71330l, sNSTextInputEditTextM71326h, sNSPinViewM71328j, (TextView) c28404l.getValue(this, kPropertyArr[12]), m71331m(), m71327i(), (TextView) this.f66976k.getValue(this, kPropertyArr[10]));
        TextView textViewM71333o = m71333o();
        if (textViewM71333o != null) {
            CharSequence charSequence = c32678c.f66717a;
            textViewM71333o.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
        }
        TextView textViewM71332n = m71332n();
        if (textViewM71332n != null) {
            CharSequence charSequence2 = c32678c.f66718b;
            textViewM71332n.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, requireContext()) : null);
        }
        TextInputLayout textInputLayoutM71329k = m71329k();
        if (textInputLayoutM71329k != null) {
            textInputLayoutM71329k.setError(c32678c.f66721e);
        }
        TextInputLayout textInputLayoutM71329k2 = m71329k();
        if (textInputLayoutM71329k2 != null) {
            textInputLayoutM71329k2.setEnabled(!c32678c.f66724h);
        }
        CharSequence charSequence3 = c32678c.f66719c;
        if (charSequence3 != null && (!StringsKt.isBlank(charSequence3))) {
            TextInputEditText textInputEditTextM71325g2 = m71325g();
            if (textInputEditTextM71325g2 != null) {
                textInputEditTextM71325g2.setText(c32678c.f66719c);
            }
            TextInputEditText textInputEditTextM71325g3 = m71325g();
            if (textInputEditTextM71325g3 != null) {
                textInputEditTextM71325g3.setSelection(c32678c.f66719c.length());
            }
        }
        TextInputEditText textInputEditTextM71325g4 = m71325g();
        if (textInputEditTextM71325g4 != null) {
            textInputEditTextM71325g4.setHint(c32678c.f66720d);
        }
        TextInputEditText textInputEditTextM71325g5 = m71325g();
        if (textInputEditTextM71325g5 != null) {
            textInputEditTextM71325g5.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sumsub.sns.internal.features.presentation.verification.k0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    return C32730p.m71317a(c32678c, this, textView, i11, keyEvent);
                }
            });
        }
        if (!c32678c.f66724h) {
            TextInputEditText textInputEditTextM71325g6 = m71325g();
            Editable text = textInputEditTextM71325g6 != null ? textInputEditTextM71325g6.getText() : null;
            if (text == null || StringsKt.isBlank(text) || c32678c.f66721e != null) {
                TextInputEditText textInputEditTextM71325g7 = m71325g();
                if (textInputEditTextM71325g7 != null) {
                    AbstractC28458h.m69356f(textInputEditTextM71325g7);
                }
            } else if (c32678c.f66724h) {
                AbstractC28458h.m69339a((View) textInputEditTextM71325g);
            }
        } else if (c32678c.f66724h && (textInputEditTextM71325g = m71325g()) != null) {
            AbstractC28458h.m69339a((View) textInputEditTextM71325g);
        }
        TextView textView = (TextView) this.f66968c.getValue(this, kPropertyArr[2]);
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c32678c.f66723g);
        }
        TextView textView2 = (TextView) this.f66968c.getValue(this, kPropertyArr[2]);
        if (textView2 != null) {
            AbstractC28485q.m69381a(textView2, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.verification.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32730p.m71312a(this.f66956b, (String) obj);
                }
            });
        }
        Button buttonM71324f = m71324f();
        if (buttonM71324f != null) {
            buttonM71324f.setText(c32678c.f66722f.f67001a);
        }
        Button buttonM71324f2 = m71324f();
        if (buttonM71324f2 != null) {
            buttonM71324f2.setEnabled(c32678c.f66722f.f67002b != null);
        }
        Button buttonM71324f3 = m71324f();
        if (buttonM71324f3 != null) {
            buttonM71324f3.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C32730p.m71315a(this.f66958b, c32678c, view);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX INFO: renamed from: a */
    public final void m71323a(final C32679D c32679d) {
        SNSTextInputEditText sNSTextInputEditTextM71326h;
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "showValidatePhoneForm " + c32679d, null, 4, null);
        AbstractC28458h.m69352b(m71333o(), m71332n(), m71330l(), m71326h(), m71324f());
        TextInputLayout textInputLayoutM71329k = m71329k();
        TextInputEditText textInputEditTextM71325g = m71325g();
        SNSPinView sNSPinViewM71328j = m71328j();
        C28404L c28404l = this.f66978m;
        KProperty[] kPropertyArr = f66965q;
        AbstractC28458h.m69344a(textInputLayoutM71329k, textInputEditTextM71325g, sNSPinViewM71328j, (TextView) c28404l.getValue(this, kPropertyArr[12]), m71331m(), m71327i(), (TextView) this.f66976k.getValue(this, kPropertyArr[10]));
        TextView textViewM71333o = m71333o();
        if (textViewM71333o != null) {
            CharSequence charSequence = c32679d.f66725a;
            textViewM71333o.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
        }
        TextView textViewM71332n = m71332n();
        if (textViewM71332n != null) {
            CharSequence charSequence2 = c32679d.f66726b;
            textViewM71332n.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, requireContext()) : null);
        }
        TextInputLayout textInputLayoutM71329k2 = m71329k();
        if (textInputLayoutM71329k2 != null) {
            textInputLayoutM71329k2.setVisibility(8);
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayoutM71330l = m71330l();
        if (sNSFlaggedInputLayoutM71330l != null) {
            sNSFlaggedInputLayoutM71330l.setError(c32679d.f66729e);
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayoutM71330l2 = m71330l();
        if (sNSFlaggedInputLayoutM71330l2 != null) {
            sNSFlaggedInputLayoutM71330l2.setEnabled(!c32679d.f66732h);
        }
        SNSTextInputEditText sNSTextInputEditTextM71326h2 = m71326h();
        if (sNSTextInputEditTextM71326h2 != null) {
            sNSTextInputEditTextM71326h2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sumsub.sns.internal.features.presentation.verification.o0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    return C32730p.m71318a(c32679d, this, textView, i11, keyEvent);
                }
            });
        }
        Button buttonM71324f = m71324f();
        if (buttonM71324f != null) {
            buttonM71324f.setText(c32679d.f66730f.f67001a);
        }
        Button buttonM71324f2 = m71324f();
        if (buttonM71324f2 != null) {
            buttonM71324f2.setEnabled(c32679d.f66730f.f67002b != null);
        }
        Button buttonM71324f3 = m71324f();
        if (buttonM71324f3 != null) {
            buttonM71324f3.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C32730p.m71316a(this.f66981b, c32679d, view);
                }
            });
        }
        if (!c32679d.f66732h) {
            SNSTextInputEditText sNSTextInputEditTextM71326h3 = m71326h();
            Editable text = sNSTextInputEditTextM71326h3 != null ? sNSTextInputEditTextM71326h3.getText() : null;
            if (text == null || StringsKt.isBlank(text)) {
                SNSTextInputEditText sNSTextInputEditTextM71326h4 = m71326h();
                if (sNSTextInputEditTextM71326h4 != null) {
                    AbstractC28458h.m69356f(sNSTextInputEditTextM71326h4);
                }
            } else if (c32679d.f66732h) {
                AbstractC28458h.m69339a((View) sNSTextInputEditTextM71326h);
            }
        } else if (c32679d.f66732h && (sNSTextInputEditTextM71326h = m71326h()) != null) {
            AbstractC28458h.m69339a((View) sNSTextInputEditTextM71326h);
        }
        TextView textView = (TextView) this.f66968c.getValue(this, kPropertyArr[2]);
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c32679d.f66731g);
        }
        TextView textView2 = (TextView) this.f66968c.getValue(this, kPropertyArr[2]);
        if (textView2 != null) {
            AbstractC28485q.m69381a(textView2, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.verification.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32730p.m71319b(this.f66984b, (String) obj);
                }
            });
        }
        if (this.f66980o != null) {
            return;
        }
        C32717i c32717i = new C32717i(this);
        SNSFlaggedInputLayout sNSFlaggedInputLayoutM71330l3 = m71330l();
        C30270n c30270n = c32679d.f66728d;
        this.f66980o = PhoneKitProviderKt.getPhoneKit(sNSFlaggedInputLayoutM71330l3, c30270n.f60856c, c30270n.f60855b, c32717i, c32679d.f66727c);
    }

    /* JADX INFO: renamed from: a */
    public final void m71321a(final C32677B c32677b) {
        SNSPinView sNSPinViewM71328j;
        CharSequence charSequence;
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "showVerifyCode " + c32677b, null, 4, null);
        SNSPinView sNSPinViewM71328j2 = m71328j();
        if ((sNSPinViewM71328j2 == null || sNSPinViewM71328j2.getVisibility() != 0) && (sNSPinViewM71328j = m71328j()) != null) {
            AbstractC28458h.m69356f(sNSPinViewM71328j);
        }
        TextView textViewM71333o = m71333o();
        TextView textViewM71332n = m71332n();
        SNSPinView sNSPinViewM71328j3 = m71328j();
        C28404L c28404l = this.f66978m;
        KProperty[] kPropertyArr = f66965q;
        AbstractC28458h.m69352b(textViewM71333o, textViewM71332n, sNSPinViewM71328j3, (TextView) c28404l.getValue(this, kPropertyArr[12]), m71331m());
        AbstractC28458h.m69344a(m71329k(), m71325g(), m71330l(), m71326h(), m71327i(), (TextView) this.f66976k.getValue(this, kPropertyArr[10]), m71324f());
        TextView textViewM71333o2 = m71333o();
        if (textViewM71333o2 != null) {
            CharSequence charSequence2 = c32677b.f66709a;
            textViewM71333o2.setText(charSequence2 != null ? AbstractC28462i0.m69364a(charSequence2, requireContext()) : null);
        }
        TextView textViewM71332n2 = m71332n();
        if (textViewM71332n2 != null) {
            CharSequence charSequence3 = c32677b.f66710b;
            textViewM71332n2.setText(charSequence3 != null ? AbstractC28462i0.m69364a(charSequence3, requireContext()) : null);
        }
        SNSPinView sNSPinViewM71328j4 = m71328j();
        if (sNSPinViewM71328j4 != null) {
            Integer num = c32677b.f66713e;
            sNSPinViewM71328j4.setItemCount(num != null ? num.intValue() : 6);
        }
        SNSPinView sNSPinViewM71328j5 = m71328j();
        if (sNSPinViewM71328j5 != null) {
            sNSPinViewM71328j5.setOnTextCompleteListener(new C32719j(this, c32677b));
        }
        TextView textView = (TextView) this.f66978m.getValue(this, kPropertyArr[12]);
        if (textView != null) {
            textView.setText(c32677b.f66714f);
        }
        SNSPinView sNSPinViewM71328j6 = m71328j();
        if (sNSPinViewM71328j6 != null) {
            sNSPinViewM71328j6.setError(c32677b.f66714f != null);
        }
        if (c32677b.f66714f != null) {
            AbstractC28133l.setResult$default(this, 4, null, 2, null);
        }
        if (c32677b.f66711c != null) {
            TextView textViewM71331m = m71331m();
            if (textViewM71331m != null) {
                textViewM71331m.setEnabled(false);
            }
            TextView textViewM71331m2 = m71331m();
            if (textViewM71331m2 != null) {
                textViewM71331m2.setOnClickListener(null);
            }
            TextView textViewM71331m3 = m71331m();
            if (textViewM71331m3 != null) {
                if (((Boolean) AbstractC33407i.f68112a.getValue()).booleanValue()) {
                    charSequence = "Test";
                } else {
                    charSequence = c32677b.f66711c;
                }
                textViewM71331m3.setText(charSequence);
            }
        } else if (c32677b.f66712d != null) {
            TextView textViewM71331m4 = m71331m();
            if (textViewM71331m4 != null) {
                textViewM71331m4.setEnabled(true);
            }
            TextView textViewM71331m5 = m71331m();
            if (textViewM71331m5 != null) {
                textViewM71331m5.setText(c32677b.f66712d);
            }
            TextView textViewM71331m6 = m71331m();
            if (textViewM71331m6 != null) {
                textViewM71331m6.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification.r0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C32730p.m71314a(this.f66986b, c32677b, view);
                    }
                });
            }
        }
        SNSPinView sNSPinViewM71328j7 = m71328j();
        if (sNSPinViewM71328j7 != null) {
            sNSPinViewM71328j7.requestFocus();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m71314a(C32730p c32730p, C32677B c32677b, View view) {
        String str;
        C28367f.m69257a(c32730p.getAnalyticsDelegate(), Screen.ConfirmationCodeScreen, c32730p.getF66111b(), Control.RetryButton, null, 24);
        C32720j0 c32720j0 = (C32720j0) c32730p.f66979n.getValue();
        String str2 = c32677b.f66715g;
        int i11 = AbstractC32681F.f66733a[c32720j0.f66933a.ordinal()];
        if (i11 == 1) {
            str = "EMAIL_VERIFICATION";
        } else if (i11 == 2) {
            str = "PHONE_VERIFICATION";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(c32720j0), null, null, new C32708d0(c32720j0, str, null, c32720j0, str2), 3, null);
        AbstractC28133l.setResult$default(c32730p, 3, null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m71320a(C32676A c32676a) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "showStatus " + c32676a, null, 4, null);
        ImageView imageViewM71327i = m71327i();
        C28404L c28404l = this.f66976k;
        KProperty[] kPropertyArr = f66965q;
        AbstractC28458h.m69352b(imageViewM71327i, (TextView) c28404l.getValue(this, kPropertyArr[10]));
        AbstractC28458h.m69344a(m71333o(), m71332n(), m71329k(), m71325g(), m71330l(), m71326h(), m71328j(), (TextView) this.f66978m.getValue(this, kPropertyArr[12]), m71331m(), m71324f());
        if (c32676a.f66708d) {
            AbstractC28133l.setResult$default(this, 4, null, 2, null);
        }
        ImageView imageViewM71327i2 = m71327i();
        if (imageViewM71327i2 != null) {
            SNSStepViewExtensionsKt.setSnsStepState(imageViewM71327i2, c32676a.f66708d ? SNSStepState.REJECTED : SNSStepState.APPROVED);
        }
        ImageView imageViewM71327i3 = m71327i();
        if (imageViewM71327i3 != null) {
            imageViewM71327i3.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c32676a.f66706b));
        }
        TextView textView = (TextView) this.f66976k.getValue(this, kPropertyArr[10]);
        if (textView != null) {
            textView.setText(c32676a.f66705a);
        }
        if (c32676a.f66707c != null) {
            Button buttonM71324f = m71324f();
            if (buttonM71324f != null) {
                buttonM71324f.setVisibility(0);
            }
            Button buttonM71324f2 = m71324f();
            if (buttonM71324f2 != null) {
                buttonM71324f2.setText(c32676a.f66707c);
            }
            Button buttonM71324f3 = m71324f();
            if (buttonM71324f3 != null) {
                buttonM71324f3.setVisibility(0);
            }
            Button buttonM71324f4 = m71324f();
            if (buttonM71324f4 != null) {
                buttonM71324f4.setEnabled(true);
            }
            Button buttonM71324f5 = m71324f();
            if (buttonM71324f5 != null) {
                buttonM71324f5.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.verification.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C32730p.m71313a(this.f66961b, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71317a(C32678C c32678c, C32730p c32730p, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        C32743y c32743y = c32678c.f66722f;
        boolean z11 = c32743y.f67002b != null;
        if (z11) {
            Button buttonM71324f = c32730p.m71324f();
            if (buttonM71324f != null) {
                buttonM71324f.setEnabled(false);
            }
            SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = c32743y.f67002b;
            if (sNSVerificationStepViewModel$ViewState$ButtonSpec$Action != null) {
                ((C32720j0) c32730p.f66979n.getValue()).m71306a(sNSVerificationStepViewModel$ViewState$ButtonSpec$Action);
            }
            SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 = c32743y.f67002b;
            int i12 = sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 == null ? -1 : AbstractC32711f.f66911b[sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2.ordinal()];
            if (i12 != -1) {
                if (i12 == 1) {
                    AbstractC28133l.setResult$default(c32730p, 2, null, 2, null);
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            TextInputEditText textInputEditTextM71325g = c32730p.m71325g();
            if (textInputEditTextM71325g != null) {
                AbstractC28458h.m69339a((View) textInputEditTextM71325g);
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71315a(C32730p c32730p, C32678C c32678c, View view) {
        C32743y c32743y = c32678c.f66722f;
        Button buttonM71324f = c32730p.m71324f();
        if (buttonM71324f != null) {
            buttonM71324f.setEnabled(false);
        }
        SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = c32743y.f67002b;
        if (sNSVerificationStepViewModel$ViewState$ButtonSpec$Action != null) {
            ((C32720j0) c32730p.f66979n.getValue()).m71306a(sNSVerificationStepViewModel$ViewState$ButtonSpec$Action);
        }
        SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 = c32743y.f67002b;
        int i11 = sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 == null ? -1 : AbstractC32711f.f66911b[sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                AbstractC28133l.setResult$default(c32730p, 2, null, 2, null);
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        TextInputEditText textInputEditTextM71325g = c32730p.m71325g();
        if (textInputEditTextM71325g != null) {
            AbstractC28458h.m69339a((View) textInputEditTextM71325g);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71318a(C32679D c32679d, C32730p c32730p, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        C32743y c32743y = c32679d.f66730f;
        boolean z11 = c32743y.f67002b != null;
        if (z11) {
            Button buttonM71324f = c32730p.m71324f();
            if (buttonM71324f != null) {
                buttonM71324f.setEnabled(false);
            }
            SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = c32743y.f67002b;
            if (sNSVerificationStepViewModel$ViewState$ButtonSpec$Action != null) {
                ((C32720j0) c32730p.f66979n.getValue()).m71306a(sNSVerificationStepViewModel$ViewState$ButtonSpec$Action);
            }
            SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 = c32743y.f67002b;
            int i12 = sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 == null ? -1 : AbstractC32711f.f66911b[sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2.ordinal()];
            if (i12 != -1) {
                if (i12 == 1) {
                    AbstractC28133l.setResult$default(c32730p, 2, null, 2, null);
                } else if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            SNSTextInputEditText sNSTextInputEditTextM71326h = c32730p.m71326h();
            if (sNSTextInputEditTextM71326h != null) {
                AbstractC28458h.m69339a((View) sNSTextInputEditTextM71326h);
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71316a(C32730p c32730p, C32679D c32679d, View view) {
        C32743y c32743y = c32679d.f66730f;
        Button buttonM71324f = c32730p.m71324f();
        if (buttonM71324f != null) {
            buttonM71324f.setEnabled(false);
        }
        SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action = c32743y.f67002b;
        if (sNSVerificationStepViewModel$ViewState$ButtonSpec$Action != null) {
            ((C32720j0) c32730p.f66979n.getValue()).m71306a(sNSVerificationStepViewModel$ViewState$ButtonSpec$Action);
        }
        SNSVerificationStepViewModel$ViewState$ButtonSpec$Action sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 = c32743y.f67002b;
        int i11 = sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2 == null ? -1 : AbstractC32711f.f66911b[sNSVerificationStepViewModel$ViewState$ButtonSpec$Action2.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                AbstractC28133l.setResult$default(c32730p, 2, null, 2, null);
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        SNSTextInputEditText sNSTextInputEditTextM71326h = c32730p.m71326h();
        if (sNSTextInputEditTextM71326h != null) {
            AbstractC28458h.m69339a((View) sNSTextInputEditTextM71326h);
        }
    }
}
