package com.sumsub.sns.internal.features.presentation.verification2.phone;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28058F;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.core.widget.SNSPrimaryButton;
import com.sumsub.sns.core.widget.SNSTextInputEditText;
import com.sumsub.sns.core.widget.autocompletePhone.PhoneKitProviderKt;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.features.domain.C30270n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.phone.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32857e extends AbstractC28787t {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ KProperty[] f67230m = {AbstractC28118g.m69077a(C32857e.class, "snsPhone", "getSnsPhone()Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", 0), AbstractC28118g.m69077a(C32857e.class, "snsPhoneId", "getSnsPhoneId()Lcom/sumsub/sns/core/widget/SNSTextInputEditText;", 0), AbstractC28118g.m69077a(C32857e.class, "snsPrimaryButton", "getSnsPrimaryButton()Lcom/sumsub/sns/core/widget/SNSPrimaryButton;", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f67231e;

    /* JADX INFO: renamed from: f */
    public final String f67232f;

    /* JADX INFO: renamed from: g */
    public final C28778k f67233g;

    /* JADX INFO: renamed from: h */
    public final C28778k f67234h;

    /* JADX INFO: renamed from: i */
    public final C28778k f67235i;

    /* JADX INFO: renamed from: j */
    public PhoneKit f67236j;

    /* JADX INFO: renamed from: k */
    public final Lazy f67237k;

    /* JADX INFO: renamed from: l */
    public boolean f67238l;

    public C32857e(AbstractC28058F abstractC28058F, final Function0 function0, Function0 function1) {
        super(abstractC28058F, null);
        this.f67231e = function1;
        this.f67232f = "PhoneNumber";
        this.f67233g = m69602a(R$id.sns_phone);
        this.f67234h = m69602a(R$id.sns_phone_id);
        this.f67235i = m69602a(R$id.sns_primary_button);
        this.f67237k = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32857e.m71354a(function0);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX INFO: renamed from: a */
    public static final Unit m71355a(final C32857e c32857e, final C32851b c32851b) {
        SNSTextInputEditText sNSTextInputEditText;
        C30270n c30270n;
        C28778k c28778k = c32857e.f67233g;
        KProperty[] kPropertyArr = f67230m;
        SNSFlaggedInputLayout sNSFlaggedInputLayout = (SNSFlaggedInputLayout) c28778k.getValue(c32857e, kPropertyArr[0]);
        if (sNSFlaggedInputLayout != null) {
            sNSFlaggedInputLayout.setEnabled(!c32851b.f67219c);
        }
        SNSFlaggedInputLayout sNSFlaggedInputLayout2 = (SNSFlaggedInputLayout) c32857e.f67233g.getValue(c32857e, kPropertyArr[0]);
        if (sNSFlaggedInputLayout2 != null) {
            sNSFlaggedInputLayout2.setError(c32851b.f67218b);
        }
        SNSTextInputEditText sNSTextInputEditText2 = (SNSTextInputEditText) c32857e.f67234h.getValue(c32857e, kPropertyArr[1]);
        if (sNSTextInputEditText2 != null) {
            sNSTextInputEditText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.b0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    return C32857e.m71356a(c32851b, c32857e, textView, i11, keyEvent);
                }
            });
        }
        if (!c32851b.f67219c) {
            SNSTextInputEditText sNSTextInputEditText3 = (SNSTextInputEditText) c32857e.f67234h.getValue(c32857e, kPropertyArr[1]);
            Editable text = sNSTextInputEditText3 != null ? sNSTextInputEditText3.getText() : null;
            if ((text == null || StringsKt.isBlank(text)) && !c32857e.f67238l) {
                SNSTextInputEditText sNSTextInputEditText4 = (SNSTextInputEditText) c32857e.f67234h.getValue(c32857e, kPropertyArr[1]);
                if (sNSTextInputEditText4 != null) {
                    AbstractC28458h.m69356f(sNSTextInputEditText4);
                }
                c32857e.f67238l = true;
            } else if (c32851b.f67219c) {
                ((InputMethodManager) sNSTextInputEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(sNSTextInputEditText.getWindowToken(), 0);
            }
        } else if (c32851b.f67219c && (sNSTextInputEditText = (SNSTextInputEditText) c32857e.f67234h.getValue(c32857e, kPropertyArr[1])) != null) {
            ((InputMethodManager) sNSTextInputEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(sNSTextInputEditText.getWindowToken(), 0);
        }
        if (c32857e.f67236j == null && (c30270n = c32851b.f67220d) != null) {
            c32857e.f67236j = PhoneKitProviderKt.getPhoneKit((SNSFlaggedInputLayout) c32857e.f67233g.getValue(c32857e, kPropertyArr[0]), c30270n.f60856c, c30270n.f60855b, new C32855d(c32857e), c32851b.f67217a);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        this.f67236j = null;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f67232f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69605a((C32853c) this.f67237k.getValue(), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.verification2.phone.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32857e.m71355a(this.f67216b, (C32851b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final C32853c m71354a(Function0 function0) {
        return (C32853c) function0.invoke();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m71356a(C32851b c32851b, C32857e c32857e, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6 || !c32851b.f67221e) {
            return false;
        }
        C28778k c28778k = c32857e.f67235i;
        KProperty[] kPropertyArr = f67230m;
        SNSPrimaryButton sNSPrimaryButton = (SNSPrimaryButton) c28778k.getValue(c32857e, kPropertyArr[2]);
        if (sNSPrimaryButton != null) {
            sNSPrimaryButton.setEnabled(false);
        }
        c32857e.f67231e.invoke();
        SNSTextInputEditText sNSTextInputEditText = (SNSTextInputEditText) c32857e.f67234h.getValue(c32857e, kPropertyArr[1]);
        if (sNSTextInputEditText != null) {
            AbstractC28458h.m69339a((View) sNSTextInputEditText);
        }
        return true;
    }
}
