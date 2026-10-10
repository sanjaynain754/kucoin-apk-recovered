package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/u;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/D;", "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/M;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/n", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSEidPinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEidPinFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,102:1\n106#2,15:103\n49#3:118\n65#3,16:119\n93#3,3:135\n256#4,2:138\n*S KotlinDebug\n*F\n+ 1 SNSEidPinFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/pin/SNSEidPinFragment\n*L\n23#1:103,15\n61#1:118\n61#1:119,16\n61#1:135,3\n84#1:138,2\n*E\n"})
public final class C31696u extends AbstractC28064I<AbstractC31666D, C31675M> {

    /* JADX INFO: renamed from: a */
    public final Lazy f64318a;

    /* JADX INFO: renamed from: b */
    public final String f64319b;

    /* JADX INFO: renamed from: c */
    public final C28404L f64320c;

    /* JADX INFO: renamed from: d */
    public final C28404L f64321d;

    /* JADX INFO: renamed from: e */
    public final C28404L f64322e;

    /* JADX INFO: renamed from: f */
    public final C28404L f64323f;

    /* JADX INFO: renamed from: g */
    public final Screen f64324g;

    /* JADX INFO: renamed from: h */
    public Map f64325h;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ KProperty[] f64317j = {AbstractC28118g.m69077a(C31696u.class, "title", "getTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31696u.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31696u.class, "pinView", "getPinView()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0), AbstractC28118g.m69077a(C31696u.class, "errorText", "getErrorText()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: i */
    public static final C31689n f64316i = new C31689n();

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70802a(C31696u c31696u) {
        return new C31699x(c31696u, c31696u.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31696u.getArguments());
    }

    /* JADX INFO: renamed from: f */
    public final SNSPinView m70803f() {
        return (SNSPinView) this.f64322e.getValue(this, f64317j[2]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        C28936t c28936t = ((C31675M) this.f64318a.getValue()).f64296f;
        KProperty kProperty = C31675M.f64290h[4];
        return C31675M.m70798a((SNSEidPinViewModel$Step) c28936t.m69705a());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getIdDocSetType() {
        return this.f64319b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_eid_pin);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        C28936t c28936t = ((C31675M) this.f64318a.getValue()).f64296f;
        KProperty kProperty = C31675M.f64290h[4];
        return C31675M.m70798a((SNSEidPinViewModel$Step) c28936t.m69705a());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen, reason: from getter */
    public final Screen getF61439g() {
        return this.f64324g;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31675M) this.f64318a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C31697v) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DOCUMENT_RESULT", ((C31697v) interfaceC28145r).f64326a);
            bundle.putParcelable("pin_mode", ((C31675M) this.f64318a.getValue()).f64291a);
            Unit unit = Unit.INSTANCE;
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(this, 0, bundle, 1, null);
            return;
        }
        if (!(interfaceC28145r instanceof C31698w)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        SNSPinView sNSPinViewM70803f = m70803f();
        if (sNSPinViewM70803f != null) {
            sNSPinViewM70803f.setError(true);
        }
        C28404L c28404l = this.f64323f;
        KProperty[] kPropertyArr = f64317j;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[3]);
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = (TextView) this.f64323f.getValue(this, kPropertyArr[3]);
        if (textView2 != null) {
            textView2.setText(((C31698w) interfaceC28145r).f64327a);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        Editable text;
        AbstractC31666D abstractC31666D = (AbstractC31666D) interfaceC28147s;
        C28404L c28404l = this.f64320c;
        KProperty[] kPropertyArr = f64317j;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[0]);
        if (textView != null) {
            textView.setText(abstractC31666D.f64267a);
        }
        TextView textView2 = (TextView) this.f64321d.getValue(this, kPropertyArr[1]);
        if (textView2 != null) {
            textView2.setText(abstractC31666D.f64268b);
        }
        SNSPinView sNSPinViewM70803f = m70803f();
        if (sNSPinViewM70803f != null) {
            sNSPinViewM70803f.setItemCount(abstractC31666D.f64269c);
        }
        SNSPinView sNSPinViewM70803f2 = m70803f();
        if (sNSPinViewM70803f2 != null && (text = sNSPinViewM70803f2.getText()) != null) {
            text.clear();
        }
        if (Intrinsics.areEqual(this.f64325h, abstractC31666D.f64270d) || abstractC31666D.f64270d.isEmpty()) {
            return;
        }
        if (this.f64325h != null) {
            C28367f.m69259a(getAnalyticsDelegate(), this.f64324g, this.f64319b, abstractC31666D.f64270d, 8);
        }
        SNSPinView sNSPinViewM70803f3 = m70803f();
        if (sNSPinViewM70803f3 != null) {
            AbstractC28458h.m69356f(sNSPinViewM70803f3);
        }
        this.f64325h = abstractC31666D.f64270d;
    }

    public C31696u() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31696u.m70802a(this.f64315b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31692q(new C31691p(this)));
        this.f64318a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31675M.class), new C31693r(lazy), new C31694s(lazy), function0);
        this.f64319b = "E_KYC";
        this.f64320c = new C28404L(R$id.sns_title);
        this.f64321d = new C28404L(R$id.sns_subtitle);
        this.f64322e = new C28404L(R$id.sns_pin_code);
        this.f64323f = new C28404L(R$id.sns_error);
        this.f64324g = Screen.EidPinPad;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        SNSPinView sNSPinViewM70803f = m70803f();
        if (sNSPinViewM70803f != null) {
            sNSPinViewM70803f.addTextChangedListener(new C31690o(this));
        }
        SNSPinView sNSPinViewM70803f2 = m70803f();
        if (sNSPinViewM70803f2 != null) {
            sNSPinViewM70803f2.setPassword(true);
        }
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            AbstractC28458h.m69340a(viewGroup, 4);
        }
    }
}
