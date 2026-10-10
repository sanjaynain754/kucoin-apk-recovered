package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.form.C28165b;
import com.sumsub.sns.core.presentation.form.C28169f;
import com.sumsub.sns.core.widget.SNSBottomSheetView;
import com.sumsub.sns.core.widget.SNSErrorBottomSheetView;
import com.sumsub.sns.core.widget.SNSLinkButton;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.core.widget.pincode.SNSPinView;
import com.sumsub.sns.databinding.C28359x;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29503S;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31603a;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31626i;
import com.sumsub.sns.internal.log.C33272c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;", "Lcom/sumsub/sns/internal/features/presentation/preview/a;", "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/B;", "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/h0;", "Lcom/sumsub/sns/internal/core/presentation/form/d;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/preview/ekyc/c", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSEkycFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEkycFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/SNSEkycFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 6 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,520:1\n106#2,15:521\n27#3,4:536\n27#3,4:591\n1#4:540\n49#5:541\n65#5,16:542\n93#5,3:558\n50#6,12:561\n50#6,12:579\n298#7,2:573\n256#7,2:575\n256#7,2:577\n*S KotlinDebug\n*F\n+ 1 SNSEkycFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/SNSEkycFragment\n*L\n61#1:521,15\n71#1:536,4\n63#1:591,4\n190#1:541\n190#1:542,16\n190#1:558,3\n275#1:561,12\n382#1:579,12\n328#1:573,2\n376#1:575,2\n377#1:577,2\n*E\n"})
public final class C31715m extends AbstractC31475a<AbstractC31514B, C31707h0> implements InterfaceC28797d {

    /* JADX INFO: renamed from: a */
    public final Lazy f64393a;

    /* JADX INFO: renamed from: b */
    public final C28404L f64394b;

    /* JADX INFO: renamed from: c */
    public final C28404L f64395c;

    /* JADX INFO: renamed from: d */
    public final C28404L f64396d;

    /* JADX INFO: renamed from: e */
    public final C28404L f64397e;

    /* JADX INFO: renamed from: f */
    public final C28404L f64398f;

    /* JADX INFO: renamed from: g */
    public final C28404L f64399g;

    /* JADX INFO: renamed from: h */
    public final C28404L f64400h;

    /* JADX INFO: renamed from: i */
    public final C28404L f64401i;

    /* JADX INFO: renamed from: j */
    public final C28404L f64402j;

    /* JADX INFO: renamed from: k */
    public final C28404L f64403k;

    /* JADX INFO: renamed from: l */
    public final C28404L f64404l;

    /* JADX INFO: renamed from: m */
    public final C28404L f64405m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f64406n;

    /* JADX INFO: renamed from: o */
    public final C28404L f64407o;

    /* JADX INFO: renamed from: p */
    public final C28404L f64408p;

    /* JADX INFO: renamed from: q */
    public final C28404L f64409q;

    /* JADX INFO: renamed from: r */
    public final C31717n f64410r;

    /* JADX INFO: renamed from: s */
    public String f64411s;

    /* JADX INFO: renamed from: t */
    public String f64412t;

    /* JADX INFO: renamed from: u */
    public Screen f64413u;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ KProperty[] f64392w = {AbstractC28118g.m69077a(C31715m.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C31715m.class, "btnSkip", "getBtnSkip()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C31715m.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31715m.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31715m.class, "formContainer", "getFormContainer()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C31715m.class, "pinField", "getPinField()Lcom/sumsub/sns/core/widget/pincode/SNSPinView;", 0), AbstractC28118g.m69077a(C31715m.class, "pinError", "getPinError()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31715m.class, "btnResendCode", "getBtnResendCode()Lcom/sumsub/sns/core/widget/SNSLinkButton;", 0), AbstractC28118g.m69077a(C31715m.class, "errorBottomSheet", "getErrorBottomSheet()Lcom/sumsub/sns/core/widget/SNSErrorBottomSheetView;", 0), AbstractC28118g.m69077a(C31715m.class, "webView", "getWebView()Landroid/webkit/WebView;", 0), AbstractC28118g.m69077a(C31715m.class, "bottomSheet", "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSBottomSheetView;", 0), AbstractC28118g.m69077a(C31715m.class, "externalBrowserStub", "getExternalBrowserStub()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C31715m.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0), AbstractC28118g.m69077a(C31715m.class, "tvStatusTitle", "getTvStatusTitle()Landroid/widget/TextView;", 0), AbstractC28118g.m69077a(C31715m.class, "tvStatusComment", "getTvStatusComment()Landroid/widget/TextView;", 0)};

    /* JADX INFO: renamed from: v */
    public static final C31542c f64391v = new C31542c();

    /* JADX INFO: renamed from: b */
    public static final void m70831b(C31715m c31715m, View view) {
        C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
        c31707h0.getClass();
        Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "onTryAgainClick", null, 4, null);
        c31707h0.m70811a(c31707h0.m70823f(), CollectionsKt.emptyList());
    }

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider.Factory m70832c(C31715m c31715m) {
        Bundle arguments = c31715m.getArguments();
        return new C31731u(arguments != null ? (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null) : null, c31715m, c31715m.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31715m.getArguments(), c31715m.isForResult());
    }

    @Override // com.sumsub.sns.internal.core.presentation.form.InterfaceC28797d
    /* JADX INFO: renamed from: a */
    public final InterfaceC28804k mo69614a() {
        return (C31707h0) this.f64393a.getValue();
    }

    /* JADX INFO: renamed from: a */
    public static final C31540b m70826a(C31715m c31715m) {
        InterfaceC28147s interfaceC28147sCurrentState = ((C31707h0) c31715m.f64393a.getValue()).currentState();
        C31732v c31732v = interfaceC28147sCurrentState instanceof C31732v ? (C31732v) interfaceC28147sCurrentState : null;
        if (c31732v != null) {
            return c31732v.f64456i;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final void m70834d(C31715m c31715m, View view) {
        C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
        c31707h0.getClass();
        Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "onCloseOAuthClick", null, 4, null);
        c31707h0.m70811a(c31707h0.m70823f(), CollectionsKt.emptyList());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_ekyc);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31707h0) this.f64393a.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final SNSBottomSheetView m70839h() {
        return (SNSBottomSheetView) this.f64404l.getValue(this, f64392w[10]);
    }

    @Override // com.sumsub.sns.internal.features.presentation.preview.AbstractC31475a, com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        if (interfaceC28145r instanceof C31723q) {
            SNSErrorBottomSheetView sNSErrorBottomSheetView = (SNSErrorBottomSheetView) this.f64402j.getValue(this, f64392w[8]);
            if (sNSErrorBottomSheetView != null) {
                C31723q c31723q = (C31723q) interfaceC28145r;
                SNSErrorBottomSheetView.show$default(sNSErrorBottomSheetView, c31723q.f64434a, null, c31723q.f64435b, null, null, 26, null);
                return;
            }
            return;
        }
        if (!(interfaceC28145r instanceof C31721p)) {
            super.handleEvent(interfaceC28145r);
            return;
        }
        C31603a c31603a = C31626i.f64222k;
        C31721p c31721p = (C31721p) interfaceC28145r;
        String str = c31721p.f64429a;
        String str2 = c31721p.f64430b;
        String str3 = c31721p.f64431c;
        String str4 = c31721p.f64432d;
        c31603a.getClass();
        C31626i c31626i = new C31626i();
        Bundle bundle = new Bundle();
        bundle.putString("eid_mobile_token", str);
        bundle.putString("eid_certificate_pem", str3);
        bundle.putString("eid_url", str2);
        bundle.putString("ekyc_confirmation_id", str4);
        c31626i.setArguments(bundle);
        AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31626i.forResult("eid_request_key"), "SNSEidMainFragment", false, 4, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void handleState(InterfaceC28147s interfaceC28147s, InterfaceC28147s interfaceC28147s2, Bundle bundle) {
        char c11;
        WebView webViewM70850s;
        WebSettings settings;
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2;
        AbstractC31514B abstractC31514B = (AbstractC31514B) interfaceC28147s;
        AbstractC31514B abstractC31514B2 = (AbstractC31514B) interfaceC28147s2;
        m70836a(abstractC31514B);
        boolean z11 = abstractC31514B instanceof C31735y;
        if (!z11 && (bottomSheetBehavior = this.f64406n) != null && bottomSheetBehavior.getState() == 3 && (bottomSheetBehavior2 = this.f64406n) != null) {
            bottomSheetBehavior2.setState(4);
        }
        boolean z12 = abstractC31514B instanceof C31732v;
        if (z12) {
            c11 = 6;
        } else {
            c11 = 6;
            Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.sns_form_container);
            C28169f c28169f = fragmentFindFragmentById instanceof C28169f ? (C28169f) fragmentFindFragmentById : null;
            if (c28169f != null) {
                FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.remove(c28169f);
                fragmentTransactionBeginTransaction.commitNow();
            }
        }
        if (abstractC31514B instanceof C31734x) {
            Button buttonM70847p = m70847p();
            Button buttonM70841j = m70841j();
            TextView textViewM70849r = m70849r();
            TextView textViewM70848q = m70848q();
            TextView textViewM70845n = m70845n();
            SNSPinView sNSPinViewM70846o = m70846o();
            SNSLinkButton sNSLinkButtonM70840i = m70840i();
            WebView webViewM70850s2 = m70850s();
            ImageView imageViewM70844m = m70844m();
            C28404L c28404l = this.f64408p;
            KProperty[] kPropertyArr = f64392w;
            TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[13]);
            TextView textView2 = (TextView) this.f64409q.getValue(this, kPropertyArr[14]);
            SNSBottomSheetView sNSBottomSheetViewM70839h = m70839h();
            ViewGroup viewGroupM70843l = m70843l();
            View[] viewArr = new View[13];
            viewArr[0] = buttonM70847p;
            viewArr[1] = buttonM70841j;
            viewArr[2] = textViewM70849r;
            viewArr[3] = textViewM70848q;
            viewArr[4] = textViewM70845n;
            viewArr[5] = sNSPinViewM70846o;
            viewArr[c11] = sNSLinkButtonM70840i;
            viewArr[7] = webViewM70850s2;
            viewArr[8] = imageViewM70844m;
            viewArr[9] = textView;
            viewArr[10] = textView2;
            viewArr[11] = sNSBottomSheetViewM70839h;
            viewArr[12] = viewGroupM70843l;
            AbstractC28458h.m69344a(viewArr);
            View view = getView();
            if (view != null) {
                AbstractC28458h.m69339a(view);
                return;
            }
            return;
        }
        if (!z11) {
            if (z12) {
                m70837a((C31732v) abstractC31514B);
                return;
            } else if (abstractC31514B instanceof C31736z) {
                m70838a((C31736z) abstractC31514B, abstractC31514B2);
                return;
            } else {
                if (abstractC31514B instanceof C31513A) {
                    m70835a((C31513A) abstractC31514B);
                    return;
                }
                return;
            }
        }
        C31735y c31735y = (C31735y) abstractC31514B;
        Button buttonM70847p2 = m70847p();
        Button buttonM70841j2 = m70841j();
        TextView textViewM70849r2 = m70849r();
        TextView textViewM70848q2 = m70848q();
        TextView textViewM70845n2 = m70845n();
        SNSPinView sNSPinViewM70846o2 = m70846o();
        SNSLinkButton sNSLinkButtonM70840i2 = m70840i();
        ImageView imageViewM70844m2 = m70844m();
        C28404L c28404l2 = this.f64408p;
        KProperty[] kPropertyArr2 = f64392w;
        TextView textView3 = (TextView) c28404l2.getValue(this, kPropertyArr2[13]);
        TextView textView4 = (TextView) this.f64409q.getValue(this, kPropertyArr2[14]);
        ViewGroup viewGroupM70843l2 = m70843l();
        View[] viewArr2 = new View[11];
        viewArr2[0] = buttonM70847p2;
        viewArr2[1] = buttonM70841j2;
        viewArr2[2] = textViewM70849r2;
        viewArr2[3] = textViewM70848q2;
        viewArr2[4] = textViewM70845n2;
        viewArr2[5] = sNSPinViewM70846o2;
        viewArr2[c11] = sNSLinkButtonM70840i2;
        viewArr2[7] = imageViewM70844m2;
        viewArr2[8] = textView3;
        viewArr2[9] = textView4;
        viewArr2[10] = viewGroupM70843l2;
        AbstractC28458h.m69344a(viewArr2);
        View view2 = getView();
        if (view2 != null) {
            AbstractC28458h.m69339a(view2);
        }
        if (c31735y.f64461c) {
            ViewGroup viewGroupM70843l3 = m70843l();
            if (viewGroupM70843l3 == null) {
                return;
            }
            C28359x c28359xM69251a = C28359x.m69251a(viewGroupM70843l3);
            AbstractC28458h.m69352b(c28359xM69251a.f57815a);
            AbstractC28458h.m69341a(c28359xM69251a.f57817c, c31735y.f64462d);
            c28359xM69251a.f57816b.setVisibility(8);
            return;
        }
        AbstractC28458h.m69352b(m70839h());
        View view3 = getView();
        if (view3 != null) {
            AbstractC28458h.m69339a(view3);
        }
        WebView webViewM70850s3 = m70850s();
        if (webViewM70850s3 != null) {
            Boolean bool = Boolean.TRUE;
            webViewM70850s3.setVisibility(Intrinsics.areEqual(bool, bool) ? 0 : 4);
        }
        WebView webViewM70850s4 = m70850s();
        if (webViewM70850s4 != null) {
            webViewM70850s4.setWebViewClient(new C31704g(this, c31735y));
        }
        WebView webViewM70850s5 = m70850s();
        if (webViewM70850s5 != null && (settings = webViewM70850s5.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
        }
        String str = c31735y.f64459a;
        if (str != null && (webViewM70850s = m70850s()) != null) {
            webViewM70850s.loadUrl(str);
        }
        BottomSheetBehavior bottomSheetBehavior3 = this.f64406n;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setState(3);
        }
    }

    /* JADX INFO: renamed from: i */
    public final SNSLinkButton m70840i() {
        return (SNSLinkButton) this.f64401i.getValue(this, f64392w[7]);
    }

    /* JADX INFO: renamed from: j */
    public final Button m70841j() {
        return (Button) this.f64395c.getValue(this, f64392w[1]);
    }

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap m70842k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f64411s;
        if (str != null) {
            linkedHashMap.put(GlobalStatePayload.Country.getText(), str);
        }
        String str2 = this.f64412t;
        if (str2 != null) {
            linkedHashMap.put("sourceId", str2);
        }
        if (this.f64413u == Screen.EkycFinishScreen) {
            linkedHashMap.put(DbParams.KEY_CHANNEL_RESULT, "failure");
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l */
    public final ViewGroup m70843l() {
        return (ViewGroup) this.f64405m.getValue(this, f64392w[11]);
    }

    /* JADX INFO: renamed from: m */
    public final ImageView m70844m() {
        return (ImageView) this.f64407o.getValue(this, f64392w[12]);
    }

    /* JADX INFO: renamed from: n */
    public final TextView m70845n() {
        return (TextView) this.f64400h.getValue(this, f64392w[6]);
    }

    /* JADX INFO: renamed from: o */
    public final SNSPinView m70846o() {
        return (SNSPinView) this.f64399g.getValue(this, f64392w[5]);
    }

    /* JADX INFO: renamed from: p */
    public final Button m70847p() {
        return (Button) this.f64394b.getValue(this, f64392w[0]);
    }

    /* JADX INFO: renamed from: q */
    public final TextView m70848q() {
        return (TextView) this.f64397e.getValue(this, f64392w[3]);
    }

    /* JADX INFO: renamed from: r */
    public final TextView m70849r() {
        return (TextView) this.f64396d.getValue(this, f64392w[2]);
    }

    /* JADX INFO: renamed from: s */
    public final WebView m70850s() {
        return (WebView) this.f64403k.getValue(this, f64392w[9]);
    }

    public C31715m() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31715m.m70832c(this.f64433b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31708i(new C31706h(this)));
        this.f64393a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31707h0.class), new C31710j(lazy), new C31712k(lazy), function0);
        this.f64394b = new C28404L(R$id.sns_primary_button);
        this.f64395c = new C28404L(R$id.sns_secondary_button);
        this.f64396d = new C28404L(R$id.sns_title);
        this.f64397e = new C28404L(R$id.sns_subtitle);
        this.f64398f = new C28404L(R$id.sns_form_container);
        this.f64399g = new C28404L(R$id.sns_pin_code);
        this.f64400h = new C28404L(R$id.sns_pin_error);
        this.f64401i = new C28404L(R$id.sns_resend_verification_code);
        this.f64402j = new C28404L(R$id.sns_error_bottom_sheet);
        this.f64403k = new C28404L(R$id.sns_webview);
        this.f64404l = new C28404L(R$id.sns_web_view_bottom_sheet);
        this.f64405m = new C28404L(R$id.sns_external_browser_stub);
        this.f64407o = new C28404L(R$id.sns_status_icon);
        this.f64408p = new C28404L(R$id.sns_status_title);
        this.f64409q = new C28404L(R$id.sns_status_comment);
        this.f64410r = new C31717n(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31715m.m70826a(this.f64436b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31715m.m70830b(this.f64437b);
            }
        });
        this.f64413u = Screen.Other;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        return m70842k();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF65006c() {
        C29070X type;
        String str;
        Bundle arguments = getArguments();
        Document document = null;
        if (arguments != null) {
            document = (Document) AbstractC28437b.m69320a(arguments, "ARGS_DOCUMENT", Document.class, null);
        }
        if (document != null && (type = document.getType()) != null && (str = type.f59014a) != null) {
            return str;
        }
        return "TYPE_UNKNOWN";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return m70842k();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WebView webViewM70850s = m70850s();
        if (webViewM70850s != null) {
            webViewM70850s.destroy();
        }
        super.onDestroyView();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        SNSPinView sNSPinViewM70846o = m70846o();
        if (sNSPinViewM70846o != null) {
            AbstractC28458h.m69339a((View) sNSPinViewM70846o);
        }
        C31707h0 c31707h0 = (C31707h0) this.f64393a.getValue();
        if (abstractC28503w instanceof C28494t) {
            c31707h0.getClass();
        } else {
            InterfaceC41775x1 interfaceC41775x1 = c31707h0.f64370p;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            AbstractC31514B abstractC31514B = (AbstractC31514B) c31707h0.currentState();
            if ((abstractC31514B instanceof C31735y) || (abstractC31514B instanceof C31736z)) {
                c31707h0.m70820d(true);
                c31707h0.m70811a(c31707h0.m70823f(), CollectionsKt.emptyList());
                return false;
            }
        }
        m69084e();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C31707h0 c31707h0 = (C31707h0) this.f64393a.getValue();
        c31707h0.getClass();
        Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "On Pause", null, 4, null);
        c31707h0.m70820d(false);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        String str2;
        super.onResume();
        C31707h0 c31707h0 = (C31707h0) this.f64393a.getValue();
        c31707h0.getClass();
        C33272c c33272c = C33272c.f67812a;
        Logger.DefaultImpls.v$default(c33272c, "EKyc", "On Resume", null, 4, null);
        C28936t c28936t = c31707h0.f64378x;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        KProperty kProperty = kPropertyArr[3];
        if (((C31727s) c28936t.m69705a()) == null) {
            return;
        }
        Logger.DefaultImpls.v$default(c33272c, "EKyc", "Starting oAuth polling", null, 4, null);
        InterfaceC41775x1 interfaceC41775x1 = c31707h0.f64371q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        C28936t c28936t2 = c31707h0.f64378x;
        KProperty kProperty2 = kPropertyArr[3];
        C31727s c31727s = (C31727s) c28936t2.m69705a();
        if (c31727s != null) {
            str = c31727s.f64438a;
        } else {
            str = null;
        }
        C28936t c28936t3 = c31707h0.f64378x;
        KProperty kProperty3 = kPropertyArr[3];
        C31727s c31727s2 = (C31727s) c28936t3.m69705a();
        if (c31727s2 != null) {
            str2 = c31727s2.f64439b;
        } else {
            str2 = null;
        }
        if (str != null && !StringsKt.isBlank(str) && str2 != null && !StringsKt.isBlank(str2)) {
            c31707h0.f64371q = C41696j.m91104d(ViewModelKt.getViewModelScope(c31707h0), null, null, new C31539a0(c31707h0, str, str2, null), 3, null);
        } else {
            Logger.DefaultImpls.v$default(c33272c, "EKyc", "Polling for oAuth result failed. applicantId or confirmationId is null", null, 4, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SNSToolbarView sNSToolbarView;
        super.onViewCreated(view, bundle);
        SNSBottomSheetView sNSBottomSheetViewM70839h = m70839h();
        if (sNSBottomSheetViewM70839h != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(sNSBottomSheetViewM70839h);
            bottomSheetBehaviorFrom.setState(4);
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setDraggable(false);
            bottomSheetBehaviorFrom.setPeekHeight(0);
            bottomSheetBehaviorFrom.setFitToContents(false);
            bottomSheetBehaviorFrom.setExpandedOffset(0);
            bottomSheetBehaviorFrom.addBottomSheetCallback(new C31546e(this));
            bottomSheetBehaviorFrom.setState(4);
            this.f64406n = bottomSheetBehaviorFrom;
        }
        SNSBottomSheetView sNSBottomSheetViewM70839h2 = m70839h();
        if (sNSBottomSheetViewM70839h2 != null) {
            sNSToolbarView = (SNSToolbarView) sNSBottomSheetViewM70839h2.findViewById(R$id.sns_bottomsheet_toolbar);
        } else {
            sNSToolbarView = null;
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setCloseButtonDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSCommonIcons.CLOSE.getImageName()));
        }
        if (sNSToolbarView != null) {
            sNSToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31715m.m70834d(this.f64389b, view2);
                }
            });
        }
        Button buttonM70841j = m70841j();
        if (buttonM70841j != null) {
            buttonM70841j.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31715m.m70833c(this.f64390b, view2);
                }
            });
        }
        SNSPinView sNSPinViewM70846o = m70846o();
        if (sNSPinViewM70846o != null) {
            sNSPinViewM70846o.addTextChangedListener(new C31544d(this));
        }
        SNSPinView sNSPinViewM70846o2 = m70846o();
        if (sNSPinViewM70846o2 != null) {
            sNSPinViewM70846o2.setOnTextCompleteListener(new C31702f());
        }
    }

    @Override // com.sumsub.sns.internal.features.presentation.common.AbstractC30809H, com.sumsub.sns.core.presentation.base.AbstractC28064I
    public final void onViewModelPrepared(Bundle bundle) {
        super.onViewModelPrepared(bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("eid_request_key", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.m0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C31715m.m70829a(this.f64414a, str, bundle2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m70829a(C31715m c31715m, String str, Bundle bundle) {
        AbstractC28133l.Companion.getClass();
        int i11 = bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY);
        if (bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY) == -1) {
            String string = bundle.getString("result_token");
            if (string != null) {
                C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
                c31707h0.getClass();
                c31707h0.m70814a((Function1) new C31519G(c31707h0, string, null));
                return;
            } else {
                C31707h0 c31707h1 = (C31707h0) c31715m.f64393a.getValue();
                c31707h1.getClass();
                Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "E-ID confirm cancelled", null, 4, null);
                c31707h1.m70811a(c31707h1.m70823f(), CollectionsKt.emptyList());
                AbstractC28458h.m69352b((ViewGroup) c31715m.f64398f.getValue(c31715m, f64392w[4]));
                return;
            }
        }
        if (i11 == 1) {
            C31707h0 c31707h2 = (C31707h0) c31715m.f64393a.getValue();
            c31707h2.getClass();
            Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "Restart eID", null, 4, null);
            c31707h2.m70814a((Function1) new C31533V(c31707h2, null));
            return;
        }
        C31707h0 c31707h3 = (C31707h0) c31715m.f64393a.getValue();
        c31707h3.getClass();
        Logger.DefaultImpls.v$default(C33272c.f67812a, "EKyc", "E-ID confirm cancelled", null, 4, null);
        c31707h3.m70811a(c31707h3.m70823f(), CollectionsKt.emptyList());
        AbstractC28458h.m69352b((ViewGroup) c31715m.f64398f.getValue(c31715m, f64392w[4]));
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70830b(C31715m c31715m) {
        C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
        c31707h0.getClass();
        c31707h0.m70814a((Function1) new C31533V(c31707h0, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final void m70833c(C31715m c31715m, View view) {
        C28367f.m69257a(c31715m.getAnalyticsDelegate(), c31715m.f64413u, c31715m.getF65006c(), Control.SkipButton, c31715m.m70842k(), 16);
        C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
        c31707h0.getClass();
        c31707h0.m70814a((Function1) new C31537Z(c31707h0, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m70838a(C31736z c31736z, AbstractC31514B abstractC31514B) {
        C29503S c29503s;
        Integer num;
        Button buttonM70847p = m70847p();
        Button buttonM70841j = m70841j();
        TextView textViewM70849r = m70849r();
        TextView textViewM70848q = m70848q();
        WebView webViewM70850s = m70850s();
        ImageView imageViewM70844m = m70844m();
        C28404L c28404l = this.f64408p;
        KProperty[] kPropertyArr = f64392w;
        AbstractC28458h.m69344a(buttonM70847p, buttonM70841j, textViewM70849r, textViewM70848q, webViewM70850s, imageViewM70844m, (TextView) c28404l.getValue(this, kPropertyArr[13]), (TextView) this.f64409q.getValue(this, kPropertyArr[14]), m70839h(), m70843l());
        AbstractC28458h.m69352b(m70845n(), m70846o());
        TextView textViewM70849r2 = m70849r();
        if (textViewM70849r2 != null) {
            AbstractC28458h.m69341a(textViewM70849r2, c31736z.f64463a);
        }
        TextView textViewM70848q2 = m70848q();
        if (textViewM70848q2 != null) {
            AbstractC28458h.m69341a(textViewM70848q2, c31736z.f64464b);
        }
        if (c31736z.f64467e > 0) {
            SNSLinkButton sNSLinkButtonM70840i = m70840i();
            if (sNSLinkButtonM70840i != null) {
                sNSLinkButtonM70840i.setEnabled(false);
            }
            SNSLinkButton sNSLinkButtonM70840i2 = m70840i();
            if (sNSLinkButtonM70840i2 != null) {
                sNSLinkButtonM70840i2.setOnClickListener(null);
            }
        } else {
            SNSLinkButton sNSLinkButtonM70840i3 = m70840i();
            if (sNSLinkButtonM70840i3 != null) {
                sNSLinkButtonM70840i3.setEnabled(true);
            }
            SNSLinkButton sNSLinkButtonM70840i4 = m70840i();
            if (sNSLinkButtonM70840i4 != null) {
                sNSLinkButtonM70840i4.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.n0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31715m.m70827a(this.f64424b, view);
                    }
                });
            }
        }
        SNSLinkButton sNSLinkButtonM70840i5 = m70840i();
        if (sNSLinkButtonM70840i5 != null) {
            AbstractC28458h.m69341a(sNSLinkButtonM70840i5, c31736z.f64465c);
        }
        if (abstractC31514B instanceof C31736z) {
            return;
        }
        SNSPinView sNSPinViewM70846o = m70846o();
        if (sNSPinViewM70846o != null) {
            sNSPinViewM70846o.setText((CharSequence) null);
        }
        TextView textViewM70845n = m70845n();
        if (textViewM70845n != null) {
            textViewM70845n.setText(c31736z.f64466d);
        }
        C29456A0 c29456a0 = c31736z.f64468f;
        if (c29456a0 != null && (c29503s = c29456a0.f59446e) != null && (num = c29503s.f59523a) != null) {
            int iIntValue = num.intValue();
            SNSPinView sNSPinViewM70846o2 = m70846o();
            if (sNSPinViewM70846o2 != null) {
                sNSPinViewM70846o2.setItemCount(iIntValue);
            }
        }
        SNSPinView sNSPinViewM70846o3 = m70846o();
        if (sNSPinViewM70846o3 != null) {
            AbstractC28458h.m69356f(sNSPinViewM70846o3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70827a(C31715m c31715m, View view) {
        C28367f.m69257a(c31715m.getAnalyticsDelegate(), c31715m.f64413u, c31715m.getF65006c(), Control.RetryButton, c31715m.m70842k(), 16);
        C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
        c31707h0.getClass();
        c31707h0.m70814a((Function1) new C31533V(c31707h0, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m70837a(final C31732v c31732v) {
        c31732v.getClass();
        TextView textViewM70849r = m70849r();
        if (textViewM70849r != null) {
            textViewM70849r.setVisibility(8);
        }
        TextView textViewM70848q = m70848q();
        if (textViewM70848q != null) {
            textViewM70848q.setVisibility(8);
        }
        Button buttonM70847p = m70847p();
        if (buttonM70847p != null) {
            AbstractC28458h.m69341a(buttonM70847p, c31732v.f64450c);
        }
        Button buttonM70841j = m70841j();
        if (buttonM70841j != null) {
            AbstractC28458h.m69341a(buttonM70841j, c31732v.f64451d);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i11 = R$id.sns_form_container;
        Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(i11);
        if ((fragmentFindFragmentById instanceof C28169f ? (C28169f) fragmentFindFragmentById : null) == null) {
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            C28165b c28165b = C28169f.f57420o;
            String f64319b = getF65006c();
            c28165b.getClass();
            fragmentTransactionBeginTransaction.replace(i11, C28165b.m69096a("EKyc", f64319b));
            fragmentTransactionBeginTransaction.commitNow();
        }
        C28404L c28404l = this.f64398f;
        KProperty[] kPropertyArr = f64392w;
        AbstractC28458h.m69352b((ViewGroup) c28404l.getValue(this, kPropertyArr[4]));
        AbstractC28458h.m69344a(m70845n(), m70846o(), m70840i(), m70850s(), m70844m(), (TextView) this.f64408p.getValue(this, kPropertyArr[13]), (TextView) this.f64409q.getValue(this, kPropertyArr[14]), m70839h(), m70843l());
        Button buttonM70847p2 = m70847p();
        if (buttonM70847p2 != null) {
            buttonM70847p2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31715m.m70828a(this.f64427b, c31732v, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m70828a(C31715m c31715m, C31732v c31732v, View view) {
        C28367f.m69257a(c31715m.getAnalyticsDelegate(), c31715m.f64413u, c31715m.getF65006c(), Control.ContinueButton, c31715m.m70842k(), 16);
        if (c31732v.f64456i != null) {
            c31715m.f64410r.m69553r();
            return;
        }
        C31707h0 c31707h0 = (C31707h0) c31715m.f64393a.getValue();
        c31707h0.getClass();
        c31707h0.m70814a((Function1) new C31533V(c31707h0, null));
    }

    /* JADX INFO: renamed from: a */
    public final void m70835a(C31513A c31513a) {
        AbstractC28458h.m69344a(m70847p(), m70841j(), m70849r(), m70848q(), m70845n(), m70846o(), m70840i(), m70839h(), m70843l());
        View view = getView();
        if (view != null) {
            AbstractC28458h.m69339a(view);
        }
        ImageView imageViewM70844m = m70844m();
        if (imageViewM70844m != null) {
            Boolean bool = Boolean.TRUE;
            imageViewM70844m.setVisibility(Intrinsics.areEqual(bool, bool) ? 0 : 4);
        }
        ImageView imageViewM70844m2 = m70844m();
        if (imageViewM70844m2 != null) {
            c31513a.getClass();
            SNSStepViewExtensionsKt.setSnsStepState(imageViewM70844m2, SNSStepState.REJECTED);
        }
        ImageView imageViewM70844m3 = m70844m();
        if (imageViewM70844m3 != null) {
            imageViewM70844m3.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c31513a.f63938c));
        }
        C28404L c28404l = this.f64408p;
        KProperty[] kPropertyArr = f64392w;
        TextView textView = (TextView) c28404l.getValue(this, kPropertyArr[13]);
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c31513a.f63936a);
        }
        TextView textView2 = (TextView) this.f64409q.getValue(this, kPropertyArr[14]);
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31513a.f63937b);
        }
        Button buttonM70847p = m70847p();
        if (buttonM70847p != null) {
            AbstractC28458h.m69341a(buttonM70847p, c31513a.f63939d);
        }
        Button buttonM70847p2 = m70847p();
        if (buttonM70847p2 != null) {
            buttonM70847p2.setEnabled(true);
        }
        Button buttonM70847p3 = m70847p();
        if (buttonM70847p3 != null) {
            buttonM70847p3.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C31715m.m70831b(this.f64440b, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70836a(AbstractC31514B abstractC31514B) {
        Screen screen;
        if (!(abstractC31514B instanceof C31733w) && !(abstractC31514B instanceof C31732v)) {
            if (abstractC31514B instanceof C31736z) {
                screen = Screen.EkycOtpConfirmationScreen;
            } else if (abstractC31514B instanceof C31735y) {
                screen = Screen.EkycOauthConfirmationScreen;
            } else if (!(abstractC31514B instanceof C31513A) || (screen = Screen.EkycFinishScreen) == null) {
                screen = Screen.Other;
            }
        } else {
            screen = Screen.EkycFormScreen;
        }
        if (screen == Screen.Other) {
            return;
        }
        C33272c c33272c = C33272c.f67812a;
        Logger.DefaultImpls.v$default(c33272c, "EKyc", "handleAnalyticsScreenChange: nextScreen=" + screen, null, 4, null);
        if (abstractC31514B instanceof C31732v) {
            C31732v c31732v = (C31732v) abstractC31514B;
            String str = c31732v.f64453f;
            this.f64411s = str;
            String str2 = c31732v.f64454g;
            this.f64412t = str2;
            Logger.DefaultImpls.v$default(c33272c, "EKyc", "handleAnalyticsScreenChange: country=" + str + ", sourceId=" + str2, null, 4, null);
        }
        if (screen == this.f64413u) {
            return;
        }
        this.f64413u = screen;
        C28367f.m69259a(getAnalyticsDelegate(), this.f64413u, getF65006c(), (Map) m70842k(), 8);
    }
}
