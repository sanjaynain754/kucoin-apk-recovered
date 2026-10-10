package com.sumsub.sns.internal.features.presentation.otp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.util.AbstractC33407i;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/otp/j;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/otp/k;", "Lcom/sumsub/sns/internal/features/presentation/otp/q;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/otp/c", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSOtpInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSOtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/otp/SNSOtpInputFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n106#2,15:150\n27#3,4:165\n1#4:169\n256#5,2:170\n*S KotlinDebug\n*F\n+ 1 SNSOtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/otp/SNSOtpInputFragment\n*L\n33#1:150,15\n42#1:165,4\n93#1:170,2\n*E\n"})
public final class C31382j extends AbstractC28064I<C31383k, C31389q> {

    /* JADX INFO: renamed from: a */
    public final Lazy f63583a;

    /* JADX INFO: renamed from: b */
    public final C28404L f63584b;

    /* JADX INFO: renamed from: c */
    public final C28404L f63585c;

    /* JADX INFO: renamed from: d */
    public final C28404L f63586d;

    /* JADX INFO: renamed from: e */
    public final C28404L f63587e;

    /* JADX INFO: renamed from: f */
    public final C28404L f63588f;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ KProperty[] f63582h = {AbstractC28118g.m69077a(C31382j.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31382j.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31382j.class, "pinCode", "getPinCode()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0), AbstractC28118g.m69077a(C31382j.class, "tvResendCode", "getTvResendCode()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31382j.class, "tvPidError", "getTvPidError()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: g */
    public static final C31375c f63581g = new C31375c();

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70698a(C31382j c31382j) {
        return new C31373a(c31382j, c31382j.getArguments(), c31382j.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }

    /* JADX INFO: renamed from: f */
    public final SNSPinView m70701f() {
        return (SNSPinView) this.f63586d.getValue(this, f63582h[2]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_otp_input);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31389q) this.f63583a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70700a((C31383k) interfaceC28147s);
    }

    public C31382j() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.otp.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31382j.m70698a(this.f63580b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31378f(new C31377e(this)));
        this.f63583a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31389q.class), new C31379g(lazy), new C31380h(lazy), function0);
        this.f63584b = new C28404L(R$id.sns_title);
        this.f63585c = new C28404L(R$id.sns_subtitle);
        this.f63586d = new C28404L(R$id.sns_pin_code);
        this.f63587e = new C28404L(R$id.sns_resend_verification_code);
        this.f63588f = new C28404L(R$id.sns_pin_error);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF64225b() {
        Document document;
        C29070X type;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null && (document = (Document) AbstractC28437b.m69320a(arguments, "arg_doc", Document.class, null)) != null && (type = document.getType()) != null && (str = type.f59014a) != null) {
            return str;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getLogTag() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("arg_client_tag");
        } else {
            string = null;
        }
        return "SNSOtpInputFragment." + string;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF64324g() {
        String string;
        Screen screen;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("arg_screen_name")) != null) {
            Screen.Companion.getClass();
            Screen[] screenArrValues = Screen.values();
            int length = screenArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    screen = screenArrValues[i11];
                    if (Intrinsics.areEqual(screen.getText(), string)) {
                        break;
                    }
                    i11++;
                } else {
                    screen = null;
                    break;
                }
            }
            if (screen != null) {
                return screen;
            }
        }
        return Screen.OtpConfirmationScreen;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.DefaultImpls.v$default(C33272c.f67812a, getLogTag(), "onCreate", null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m70700a(C31383k c31383k) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, getLogTag(), "handleState: " + c31383k, null, 4, null);
        C28404L c28404l = this.f63584b;
        KProperty[] kPropertyArr = f63582h;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[0]);
        String str = null;
        if (textView != null) {
            String str2 = c31383k.f63589a;
            AbstractC28458h.m69341a(textView, str2 != null ? AbstractC28462i0.m69364a(str2, requireContext()) : null);
        }
        TextView textView2 = (TextView) this.f63585c.getValue(this, kPropertyArr[1]);
        if (textView2 != null) {
            String str3 = c31383k.f63590b;
            AbstractC28458h.m69341a(textView2, str3 != null ? AbstractC28462i0.m69364a(str3, requireContext()) : null);
        }
        String str4 = c31383k.f63592d;
        if (str4 != null) {
            str = (((Boolean) AbstractC33407i.f68112a.getValue()).booleanValue() && StringsKt.startsWith$default(str4, "Resend code in", false, 2, (Object) null)) ? "Resend code in TEST_PLACEHOLDER" : str4;
        }
        TextView textView3 = (TextView) this.f63587e.getValue(this, kPropertyArr[3]);
        if (textView3 != null) {
            AbstractC28458h.m69341a(textView3, str);
        }
        TextView textView4 = (TextView) this.f63587e.getValue(this, kPropertyArr[3]);
        if (textView4 != null) {
            textView4.setEnabled(c31383k.f63593e);
        }
        TextView textView5 = (TextView) this.f63587e.getValue(this, kPropertyArr[3]);
        if (textView5 != null) {
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.otp.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31382j.m70699a(this.f63616b, view);
                }
            });
        }
        SNSPinView sNSPinViewM70701f = m70701f();
        boolean z11 = sNSPinViewM70701f != null && sNSPinViewM70701f.getVisibility() == 0;
        SNSPinView sNSPinViewM70701f2 = m70701f();
        if (sNSPinViewM70701f2 != null) {
            sNSPinViewM70701f2.setVisibility(0);
        }
        if (!z11) {
            SNSPinView sNSPinViewM70701f3 = m70701f();
            if (sNSPinViewM70701f3 != null) {
                AbstractC28458h.m69356f(sNSPinViewM70701f3);
            }
            SNSPinView sNSPinViewM70701f4 = m70701f();
            if (sNSPinViewM70701f4 != null) {
                sNSPinViewM70701f4.setItemCount(c31383k.f63591c);
            }
            SNSPinView sNSPinViewM70701f5 = m70701f();
            if (sNSPinViewM70701f5 != null) {
                sNSPinViewM70701f5.setOnTextCompleteListener(new C31376d(this));
            }
            SNSPinView sNSPinViewM70701f6 = m70701f();
            if (sNSPinViewM70701f6 != null) {
                sNSPinViewM70701f6.requestFocus();
            }
        }
        TextView textView6 = (TextView) this.f63588f.getValue(this, kPropertyArr[4]);
        if (textView6 != null) {
            textView6.setText(c31383k.f63594f);
        }
        SNSPinView sNSPinViewM70701f7 = m70701f();
        if (sNSPinViewM70701f7 != null) {
            sNSPinViewM70701f7.setError(c31383k.f63594f != null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70699a(C31382j c31382j, View view) {
        C28367f.m69257a(c31382j.getAnalyticsDelegate(), Screen.ConfirmationCodeScreen, c31382j.getF64225b(), Control.RetryButton, null, 24);
        C31389q c31389q = (C31389q) c31382j.f63583a.getValue();
        c31389q.getClass();
        Logger.DefaultImpls.v$default(C33272c.f67812a, c31389q.m70703e(), "onResentCodeClick", null, 4, null);
        AbstractC28052C.finishWithResult$default(c31389q, 11, null, 2, null);
    }
}
