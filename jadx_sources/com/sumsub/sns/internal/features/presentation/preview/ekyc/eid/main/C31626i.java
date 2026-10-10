package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28121h;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.widget.SNSCommonBottomSheetView;
import com.sumsub.sns.core.widget.SNSDotsProgressView;
import com.sumsub.sns.core.widget.SNSStepViewExtensionsKt;
import com.sumsub.sns.core.widget.SNSToolbarView;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28427X;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28467k;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.nfc.C28897b;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.AbstractC31555h;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31548a;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31549b;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31550c;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31551d;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31552e;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31553f;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31554g;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31558k;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31559l;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31560m;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.C31662p;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.InterfaceC31556i;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.InterfaceC31557j;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.AbstractC31686k;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31677b;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31679d;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31681f;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31683h;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31685j;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31688m;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31689n;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.C31696u;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33627eb;
import de.authada.library.api.AuthadaAuthenticationLibrary;
import de.authada.library.api.AuthadaAuthenticationLibraryConfig;
import de.authada.library.api.Can;
import de.authada.library.api.analytics.AnalyticsCallback;
import de.authada.library.api.authentication.Authentication;
import de.authada.library.api.authentication.Pin;
import de.authada.library.api.authentication.StartCallback;
import de.authada.library.api.network.Certificate;
import de.authada.library.api.pinChanger.PinChanger;
import de.authada.library.api.pinChanger.TPin;
import de.authada.library.api.unblock.Puk;
import de.authada.library.api.unblock.Unblocker;
import de.authada.library.api.unblock.UnblockerCallback;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/T0;", "Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/a", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSEidMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEidMainFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/SNSEidMainFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 CommonExtensions.kt\ncom/sumsub/sns/internal/core/common/CommonExtensionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,537:1\n106#2,15:538\n500#3:553\n298#4,2:554\n256#4,2:556\n256#4,2:558\n256#4,2:560\n256#4,2:562\n256#4,2:564\n*S KotlinDebug\n*F\n+ 1 SNSEidMainFragment.kt\ncom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/SNSEidMainFragment\n*L\n47#1:538,15\n136#1:553\n225#1:554,2\n270#1:556,2\n278#1:558,2\n350#1:560,2\n352#1:562,2\n471#1:564,2\n*E\n"})
public final class C31626i extends AbstractC28064I<AbstractC31596T0, C31583M0> {

    /* JADX INFO: renamed from: a */
    public final Lazy f64224a;

    /* JADX INFO: renamed from: b */
    public final String f64225b;

    /* JADX INFO: renamed from: c */
    public final C28404L f64226c;

    /* JADX INFO: renamed from: d */
    public final C28404L f64227d;

    /* JADX INFO: renamed from: e */
    public final C28404L f64228e;

    /* JADX INFO: renamed from: f */
    public final C28897b f64229f;

    /* JADX INFO: renamed from: g */
    public AbstractC31596T0 f64230g;

    /* JADX INFO: renamed from: h */
    public C31560m f64231h;

    /* JADX INFO: renamed from: i */
    public boolean f64232i;

    /* JADX INFO: renamed from: j */
    public C31629j f64233j;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ KProperty[] f64223l = {AbstractC28118g.m69077a(C31626i.class, "content", "getContent()Landroid/view/ViewGroup;", 0), AbstractC28118g.m69077a(C31626i.class, "toolbarView", "getToolbarView()Lcom/sumsub/sns/core/widget/SNSToolbarView;", 0), AbstractC28118g.m69077a(C31626i.class, "bottomSheet", "getBottomSheet()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;", 0)};

    /* JADX INFO: renamed from: k */
    public static final C31603a f64222k = new C31603a();

    /* JADX INFO: renamed from: b */
    public static final Unit m70782b(C31626i c31626i, C31587O0 c31587o0) {
        ((C31583M0) c31626i.f64224a.getValue()).m70764a(c31587o0.f64164f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static final ViewModelProvider.Factory m70784c(C31626i c31626i) {
        return new C31600X(c31626i, c31626i.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease(), c31626i.getArguments());
    }

    /* JADX INFO: renamed from: a */
    public final void m70792a(AbstractC31596T0 abstractC31596T0) {
        ViewGroup viewGroupM70796g;
        LayoutTransition layoutTransition;
        SNSToolbarView sNSToolbarView = (SNSToolbarView) this.f64227d.getValue(this, f64223l[1]);
        if (sNSToolbarView != null) {
            sNSToolbarView.setOptionButtonVisible(false);
        }
        ViewGroup viewGroupM70796g2 = m70796g();
        if (viewGroupM70796g2 != null) {
            AbstractC28458h.m69340a(viewGroupM70796g2, 4);
        }
        if (abstractC31596T0 instanceof C31585N0) {
            m70787a((C31585N0) abstractC31596T0);
        } else if (abstractC31596T0 instanceof C31592R0) {
            if ((this.f64230g instanceof C31592R0) && (viewGroupM70796g = m70796g()) != null && (layoutTransition = viewGroupM70796g.getLayoutTransition()) != null) {
                layoutTransition.setDuration(0L);
            }
            m70790a((C31592R0) abstractC31596T0);
        } else if (abstractC31596T0 instanceof C31594S0) {
            m70791a((C31594S0) abstractC31596T0);
        } else if (abstractC31596T0 instanceof C31591Q0) {
            m70789a((C31591Q0) abstractC31596T0);
        } else if (abstractC31596T0 instanceof C31587O0) {
            m70788a((C31587O0) abstractC31596T0);
        } else if (!(abstractC31596T0 instanceof C31589P0)) {
            throw new NoWhenBranchMatchedException();
        }
        C31629j c31629j = this.f64233j;
        Screen screen = c31629j != null ? c31629j.f64236a : null;
        C31629j c31629j2 = abstractC31596T0.f64190a;
        if (screen != (c31629j2 != null ? c31629j2.f64236a : null)) {
            if (c31629j != null) {
                Logger.DefaultImpls.i$default(C33272c.f67812a, "SNSEidMainFragment", "Screen closed " + c31629j.f64236a + C33627eb.f69716f + c31629j.f64237b, null, 4, null);
                C31629j c31629j3 = abstractC31596T0.f64190a;
                if (c31629j3 != null) {
                    C33272c.f67816e.f67810a.mo68955d("SNSEidMainFragment", "Screen changed " + c31629j3.f64236a + C33627eb.f69716f + c31629j3.f64237b, null);
                    C28367f.m69259a(getAnalyticsDelegate(), c31629j3.f64236a, this.f64225b, c31629j3.f64237b, 8);
                }
            }
            this.f64233j = abstractC31596T0.f64190a;
        }
        this.f64230g = abstractC31596T0;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m70785c(C31626i c31626i, C31591Q0 c31591q0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.EidChangeTransportPinButton, null, 24);
        C31583M0 c31583m0 = (C31583M0) c31626i.f64224a.getValue();
        c31591q0.getClass();
        c31583m0.m70764a(C31654x.f64257a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final SNSCommonBottomSheetView m70795f() {
        return (SNSCommonBottomSheetView) this.f64228e.getValue(this, f64223l[2]);
    }

    /* JADX INFO: renamed from: g */
    public final ViewGroup m70796g() {
        return (ViewGroup) this.f64226c.getValue(this, f64223l[0]);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getClosePayload() {
        C28936t c28936t = ((C31583M0) this.f64224a.getValue()).f64143f;
        KProperty kProperty = C31583M0.f64136p[1];
        return ((AbstractC31640o0) c28936t.m69705a()) instanceof C31602Z ? MapsKt.mapOf(TuplesKt.m90091to("reason", "eidCanRequired")) : MapsKt.emptyMap();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType, reason: from getter */
    public final String getF64319b() {
        return this.f64225b;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_eid);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final String getLogTag() {
        return "SNSEidMainFragment";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        C28936t c28936t = ((C31583M0) this.f64224a.getValue()).f64143f;
        KProperty kProperty = C31583M0.f64136p[1];
        return ((AbstractC31640o0) c28936t.m69705a()) instanceof C31602Z ? MapsKt.mapOf(TuplesKt.m90091to("reason", "eidCanRequired")) : MapsKt.emptyMap();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getScreen */
    public final Screen getF64324g() {
        return C31583M0.m70763b((C31583M0) this.f64224a.getValue());
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31583M0) this.f64224a.getValue();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleEvent(InterfaceC28145r interfaceC28145r) {
        PinChanger pinChanger;
        int[] can;
        String strJoinToString$default = null;
        if (interfaceC28145r instanceof C31642p0) {
            ViewGroup viewGroupM70796g = m70796g();
            if (viewGroupM70796g != null) {
                viewGroupM70796g.removeAllViews();
            }
            Bundle bundle = new Bundle();
            bundle.putString("result_token", ((C31642p0) interfaceC28145r).f64249a);
            Unit unit = Unit.INSTANCE;
            AbstractC28133l.finishWithResult$idensic_mobile_sdk_aar_defaultRelease$default(this, 0, bundle, 1, null);
            return;
        }
        if (interfaceC28145r instanceof C31637n) {
            C31637n c31637n = (C31637n) interfaceC28145r;
            String str = c31637n.f64243a;
            String str2 = c31637n.f64244b;
            String str3 = c31637n.f64245c;
            C31689n c31689n = C31696u.f64316i;
            C31679d c31679d = new C31679d(str, str2, str3);
            c31689n.getClass();
            C31696u c31696u = new C31696u();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("pin_mode", c31679d);
            c31696u.setArguments(bundle2);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31696u.forResult("request_key_pin"), null, false, 6, null);
            return;
        }
        if (interfaceC28145r instanceof C31635m) {
            String str4 = ((C31635m) interfaceC28145r).f64242a;
            C31689n c31689n2 = C31696u.f64316i;
            C31677b c31677b = new C31677b(str4);
            c31689n2.getClass();
            C31696u c31696u2 = new C31696u();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("pin_mode", c31677b);
            c31696u2.setArguments(bundle3);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31696u2.forResult("request_key_pin"), null, false, 6, null);
            return;
        }
        if (interfaceC28145r instanceof C31633l) {
            C31689n c31689n3 = C31696u.f64316i;
            C31685j c31685j = C31685j.f64304a;
            c31689n3.getClass();
            C31696u c31696u3 = new C31696u();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("pin_mode", c31685j);
            c31696u3.setArguments(bundle4);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31696u3.forResult("request_key_pin"), null, false, 6, null);
            return;
        }
        if (interfaceC28145r instanceof C31639o) {
            boolean z11 = ((C31639o) interfaceC28145r).f64247a;
            C31689n c31689n4 = C31696u.f64316i;
            C31681f c31681f = new C31681f(z11);
            c31689n4.getClass();
            C31696u c31696u4 = new C31696u();
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable("pin_mode", c31681f);
            c31696u4.setArguments(bundle5);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31696u4.forResult("request_key_pin"), null, false, 6, null);
            return;
        }
        if (interfaceC28145r instanceof C31641p) {
            C31689n c31689n5 = C31696u.f64316i;
            C31683h c31683h = C31683h.f64303a;
            c31689n5.getClass();
            C31696u c31696u5 = new C31696u();
            Bundle bundle6 = new Bundle();
            bundle6.putParcelable("pin_mode", c31683h);
            c31696u5.setArguments(bundle6);
            AbstractC28133l.navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(this, c31696u5.forResult("request_key_pin"), null, false, 6, null);
            return;
        }
        if (interfaceC28145r instanceof C31599W) {
            m70794a((C31599W) interfaceC28145r);
            return;
        }
        if (interfaceC28145r instanceof C31597U) {
            m70793a((C31597U) interfaceC28145r);
            return;
        }
        if (!(interfaceC28145r instanceof C31631k)) {
            if (interfaceC28145r instanceof C31598V) {
                this.f64229f.mo69598p();
                return;
            } else {
                super.handleEvent(interfaceC28145r);
                return;
            }
        }
        if (this.f64231h == null) {
            this.f64231h = new C31560m(requireActivity());
        }
        C31560m c31560m = this.f64231h;
        if (c31560m != null) {
            AbstractC31555h abstractC31555h = ((C31631k) interfaceC28145r).f64239a;
            if (abstractC31555h instanceof C31554g) {
                C31554g c31554g = (C31554g) abstractC31555h;
                String str5 = c31554g.f64076a;
                URL url = c31554g.f64077b;
                String str6 = c31554g.f64078c;
                StartCallback startCallback = c31554g.f64079d;
                Function1 function1 = c31554g.f64080e;
                c31560m.m70757a();
                c31560m.m70758b();
                c31560m.m70759c();
                try {
                    Activity activity = (Activity) c31560m.f64089a.get();
                    if (activity == null) {
                        throw new IllegalStateException("Activity is null");
                    }
                    Authentication authenticationAuthenticate = AuthadaAuthenticationLibrary.INSTANCE.authenticate(AuthadaAuthenticationLibraryConfig.Companion.newInstance(activity, url, CollectionsKt.listOf(Certificate.box-impl(Certificate.constructor-impl(str6)))));
                    c31560m.f64090b = authenticationAuthenticate;
                    if (authenticationAuthenticate != null) {
                        Authentication.DefaultImpls.start$default(authenticationAuthenticate, str5, startCallback, (AnalyticsCallback) null, 4, (Object) null);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    function1.invoke(th2);
                    return;
                }
            }
            if (abstractC31555h instanceof C31551d) {
                C31551d c31551d = (C31551d) abstractC31555h;
                Pin pin = c31551d.f64063a;
                Can can2 = c31551d.f64064b;
                InterfaceC31556i interfaceC31556i = c31551d.f64065c;
                Function1 function2 = c31551d.f64066d;
                Authentication authentication = c31560m.f64090b;
                if (authentication == null) {
                    String strJoinToString$default2 = ArraysKt.joinToString$default(pin.getPin(), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    if (can2 != null && (can = can2.getCan()) != null) {
                        strJoinToString$default = ArraysKt.joinToString$default(can, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                    }
                    function2.invoke(new C31662p(strJoinToString$default2, strJoinToString$default));
                    return;
                }
                C31558k c31558k = new C31558k(interfaceC31556i, pin);
                if (can2 != null) {
                    try {
                        authentication.setCan(can2);
                    } catch (Throwable th3) {
                        function2.invoke(th3);
                        return;
                    }
                }
                Authentication authentication2 = c31560m.f64090b;
                if (authentication2 != null) {
                    authentication2.pinAuthentication(pin, c31558k);
                    return;
                }
                return;
            }
            if (abstractC31555h instanceof C31552e) {
                C31552e c31552e = (C31552e) abstractC31555h;
                TPin tPin = c31552e.f64067a;
                Pin pin2 = c31552e.f64068b;
                Can can3 = c31552e.f64069c;
                Integer num = c31552e.f64070d;
                InterfaceC31557j interfaceC31557j = c31552e.f64071e;
                Function1 function3 = c31552e.f64072f;
                C31559l c31559l = new C31559l(interfaceC31557j, tPin, pin2, num);
                try {
                    Activity activity2 = (Activity) c31560m.f64089a.get();
                    if (activity2 == null) {
                        throw new IllegalStateException("Activity is null");
                    }
                    PinChanger pinChanger2 = AuthadaAuthenticationLibrary.INSTANCE.pinChanger();
                    c31560m.f64091c = pinChanger2;
                    if (can3 != null && pinChanger2 != null) {
                        pinChanger2.setCan(can3);
                    }
                    if (num != null && (pinChanger = c31560m.f64091c) != null) {
                        pinChanger._useForTestingOnlySetSixthDigitOfOldPin(num.intValue());
                    }
                    PinChanger pinChanger3 = c31560m.f64091c;
                    if (pinChanger3 != null) {
                        pinChanger3.changeFiveDigitPin(tPin, pin2, activity2, c31559l);
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    function3.invoke(th4);
                    return;
                }
            }
            if (!(abstractC31555h instanceof C31553f)) {
                if (abstractC31555h instanceof C31548a) {
                    c31560m.m70758b();
                    return;
                } else if (abstractC31555h instanceof C31549b) {
                    c31560m.m70759c();
                    return;
                } else {
                    if (!(abstractC31555h instanceof C31550c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c31560m.m70757a();
                    return;
                }
            }
            C31553f c31553f = (C31553f) abstractC31555h;
            Puk puk = c31553f.f64073a;
            UnblockerCallback unblockerCallback = c31553f.f64074b;
            Function1 function4 = c31553f.f64075c;
            try {
                Activity activity3 = (Activity) c31560m.f64089a.get();
                if (activity3 == null) {
                    throw new IllegalStateException("Activity is null");
                }
                Unblocker unblocker = AuthadaAuthenticationLibrary.INSTANCE.unblocker();
                c31560m.f64092d = unblocker;
                if (unblocker != null) {
                    unblocker.unblock(puk, activity3, unblockerCallback);
                }
            } catch (Throwable th5) {
                function4.invoke(th5);
            }
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final /* bridge */ /* synthetic */ void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        m70792a((AbstractC31596T0) interfaceC28147s);
    }

    public C31626i() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31626i.m70784c(this.f64203b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31615e(new C31612d(this)));
        this.f64224a = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31583M0.class), new C31618f(lazy), new C31621g(lazy), function0);
        this.f64225b = "E_KYC";
        this.f64226c = new C28404L(R$id.sns_content);
        this.f64227d = new C28404L(R$id.sns_toolbar);
        this.f64228e = new C28404L(R$id.sns_eid_bottom_sheet);
        this.f64229f = new C28897b(this, new C31606b(this), new C31609c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C31583M0 c31583m0 = (C31583M0) this.f64224a.getValue();
        c31583m0.getClass();
        C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "Reset", null);
        c31583m0.m70771b(C31583M0.f64137q);
        C31560m c31560m = this.f64231h;
        if (c31560m != null) {
            c31560m.m70757a();
            c31560m.m70758b();
            c31560m.m70759c();
        }
        this.f64231h = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f64230g = null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f = m70795f();
        if (sNSCommonBottomSheetViewM70795f != null && !sNSCommonBottomSheetViewM70795f.isHidden()) {
            SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f2 = m70795f();
            if (sNSCommonBottomSheetViewM70795f2 != null) {
                sNSCommonBottomSheetViewM70795f2.hide();
            }
            return false;
        }
        if (!this.f64232i && !((C31583M0) this.f64224a.getValue()).m70770a(abstractC28503w)) {
            return false;
        }
        m69084e();
        return true;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28064I, com.sumsub.sns.core.presentation.base.AbstractC28133l, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getSupportFragmentManager().setFragmentResultListener("request_key_pin", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.c1
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                C31626i.m70780a(this.f64204a, str, bundle2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70783b(C31626i c31626i, C31591Q0 c31591q0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.EidProceedToIdentButton, null, 24);
        C31583M0 c31583m0 = (C31583M0) c31626i.f64224a.getValue();
        c31591q0.getClass();
        c31583m0.m70764a(C31565D.f64095a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m70781b(C31626i c31626i) {
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f = c31626i.m70795f();
        if (sNSCommonBottomSheetViewM70795f != null) {
            sNSCommonBottomSheetViewM70795f.hide();
        }
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.DismissButton, null, 24);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70780a(C31626i c31626i, String str, Bundle bundle) {
        Can can;
        AbstractC28133l.Companion.getClass();
        if (C28121h.m69079a(bundle)) {
            C31688m c31688m = (C31688m) bundle.getParcelable("DOCUMENT_RESULT");
            if (c31688m == null) {
                return;
            }
            AbstractC31686k abstractC31686k = c31688m.f64305a;
            if (abstractC31686k instanceof C31681f) {
                ((C31583M0) c31626i.f64224a.getValue()).m70768a(c31688m.f64306b, ((C31681f) c31688m.f64305a).f64302a);
                return;
            }
            if (abstractC31686k instanceof C31677b) {
                ((C31583M0) c31626i.f64224a.getValue()).m70767a(c31688m.f64306b, c31688m.f64308d);
                return;
            }
            int i11 = 0;
            if (!(abstractC31686k instanceof C31685j) && !(abstractC31686k instanceof C31679d)) {
                if (abstractC31686k instanceof C31683h) {
                    C31583M0 c31583m0 = (C31583M0) c31626i.f64224a.getValue();
                    String str2 = c31688m.f64306b;
                    c31583m0.getClass();
                    C33270a c33270a = C33272c.f67816e;
                    c33270a.f67810a.mo68955d("SNSEidMain", "On puk entered", null);
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        c31583m0.f64144g.setValue(null);
                        c31583m0.m70771b(C31634l0.f64241a);
                        try {
                            ArrayList arrayList = new ArrayList(str2.length());
                            while (i11 < str2.length()) {
                                arrayList.add(Integer.valueOf(CharsKt.digitToInt(str2.charAt(i11))));
                                i11++;
                            }
                            c31583m0.fireEvent(new C31631k(new C31553f(new Puk(CollectionsKt.toIntArray(arrayList)), c31583m0.f64151n, c31583m0.f64152o)));
                            return;
                        } catch (Exception e11) {
                            AbstractC28052C.throwError$default(c31583m0, e11, "E_KYC", null, 4, null);
                            return;
                        }
                    }
                    c33270a.f67810a.mo68955d("SNSEidMain", "PUK is null or blank", null);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            C31583M0 c31583m1 = (C31583M0) c31626i.f64224a.getValue();
            String str3 = c31688m.f64307c;
            String str4 = c31688m.f64306b;
            String str5 = c31688m.f64308d;
            String str6 = c31688m.f64309e;
            c31583m1.getClass();
            C33272c.f67816e.f67810a.mo68955d("SNSEidMain", "On pin change ready", null);
            if (str3 == null || StringsKt.isBlank(str3) || str4 == null || StringsKt.isBlank(str4)) {
                return;
            }
            c31583m1.m70773c(false);
            c31583m1.f64144g.setValue(null);
            c31583m1.m70771b(C31619f0.f64213a);
            try {
                ArrayList arrayList2 = new ArrayList(str3.length());
                for (int i12 = 0; i12 < str3.length(); i12++) {
                    arrayList2.add(Integer.valueOf(CharsKt.digitToInt(str3.charAt(i12))));
                }
                TPin tPin = new TPin(CollectionsKt.toIntArray(arrayList2));
                ArrayList arrayList3 = new ArrayList(str4.length());
                for (int i13 = 0; i13 < str4.length(); i13++) {
                    arrayList3.add(Integer.valueOf(CharsKt.digitToInt(str4.charAt(i13))));
                }
                Pin pin = new Pin(CollectionsKt.toIntArray(arrayList3));
                if (str5 != null) {
                    ArrayList arrayList4 = new ArrayList(str5.length());
                    while (i11 < str5.length()) {
                        arrayList4.add(Integer.valueOf(CharsKt.digitToInt(str5.charAt(i11))));
                        i11++;
                    }
                    can = new Can(CollectionsKt.toIntArray(arrayList4));
                } else {
                    can = null;
                }
                c31583m1.fireEvent(new C31631k(new C31552e(tPin, pin, can, str6 != null ? StringsKt.toIntOrNull(str6) : null, c31583m1.f64150m, c31583m1.f64152o)));
                return;
            } catch (Exception e12) {
                AbstractC28052C.throwError$default(c31583m1, e12, "E_KYC", null, 4, null);
                return;
            }
        }
        if (c31626i.f64230g instanceof C31591Q0) {
            return;
        }
        ((C31583M0) c31626i.f64224a.getValue()).m70770a(C28497u.f58029b);
    }

    /* JADX INFO: renamed from: a */
    public final void m70788a(final C31587O0 c31587o0) {
        ViewGroup viewGroupM70786a = m70786a(c31587o0, R$layout.sns_eid_pin_selector);
        TextView textView = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_subtitle) : null;
        Button button = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_button_option) : null;
        Button button2 = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_primary_button) : null;
        Button button3 = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_secondary_button) : null;
        ImageView imageView = viewGroupM70786a != null ? (ImageView) viewGroupM70786a.findViewById(R$id.sns_image) : null;
        if (imageView != null) {
            imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSEidIcons.PIN.getImageName()));
        }
        if (textView != null) {
            textView.setText(c31587o0.f64160b);
        }
        if (textView2 != null) {
            textView2.setText(c31587o0.f64161c);
        }
        if (button3 != null) {
            button3.setVisibility(8);
        }
        if (button != null) {
            button.setText(c31587o0.f64162d);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70776a(this.f64258b, c31587o0);
                }
            }, button);
        }
        if (button2 != null) {
            button2.setText(c31587o0.f64163e);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.y0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70782b(this.f64260b, c31587o0);
                }
            }, button2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70776a(C31626i c31626i, C31587O0 c31587o0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.InfoButton, null, 24);
        C31583M0 c31583m0 = (C31583M0) c31626i.f64224a.getValue();
        c31587o0.getClass();
        c31583m0.m70764a(C31584N.f64153a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70787a(final C31585N0 c31585n0) {
        ViewGroup viewGroupM70786a = m70786a(c31585n0, R$layout.sns_eid_info);
        TextView textView = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_subtitle) : null;
        Button button = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_continue) : null;
        ImageView imageView = viewGroupM70786a != null ? (ImageView) viewGroupM70786a.findViewById(R$id.sns_image) : null;
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c31585n0.f64154b);
        }
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31585n0.f64155c);
        }
        if (button != null) {
            button.setText(c31585n0.f64156d);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.i1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70775a(this.f64234b, c31585n0);
                }
            }, button);
        }
        if (c31585n0.f64157e == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), c31585n0.f64157e.getImageName()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70775a(C31626i c31626i, C31585N0 c31585n0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.ContinueButton, null, 24);
        ((C31583M0) c31626i.f64224a.getValue()).m70764a(c31585n0.f64158f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70791a(final C31594S0 c31594s0) {
        ViewGroup viewGroupM70786a = m70786a(c31594s0, R$layout.sns_eid_status);
        TextView textView = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_subtitle) : null;
        Button button = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_button) : null;
        ImageView imageView = viewGroupM70786a != null ? (ImageView) viewGroupM70786a.findViewById(R$id.sns_status) : null;
        c31594s0.getClass();
        if (imageView != null) {
            SNSStepViewExtensionsKt.setSnsStepState(imageView, SNSStepState.PROCESSING);
        }
        String str = c31594s0.f64186d;
        if (str != null && imageView != null) {
            imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), str));
        }
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c31594s0.f64184b);
        }
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31594s0.f64185c);
        }
        if (button != null) {
            AbstractC28458h.m69341a(button, c31594s0.f64187e);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.d1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70779a(this.f64207b, c31594s0);
                }
            }, button);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70779a(C31626i c31626i, C31594S0 c31594s0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.ContinueButton, null, 24);
        ((C31583M0) c31626i.f64224a.getValue()).m70764a(c31594s0.f64188f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70790a(final C31592R0 c31592r0) {
        ViewGroup viewGroupM70786a = m70786a(c31592r0, R$layout.sns_eid_scanning);
        TextView textView = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_subtitle) : null;
        TextView textView3 = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_status) : null;
        LottieAnimationView lottieAnimationView = viewGroupM70786a != null ? (LottieAnimationView) viewGroupM70786a.findViewById(R$id.sns_instructions) : null;
        SNSDotsProgressView sNSDotsProgressView = viewGroupM70786a != null ? (SNSDotsProgressView) viewGroupM70786a.findViewById(R$id.sns_reading_progress) : null;
        AbstractC31596T0 abstractC31596T0 = this.f64230g;
        if (abstractC31596T0 == null || !Intrinsics.areEqual(abstractC31596T0.getClass(), c31592r0.getClass())) {
            View view = getView();
            Button button = view != null ? (Button) view.findViewById(R$id.sns_button) : null;
            if (button != null) {
                button.setText(c31592r0.f64178f);
                AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.e1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C31626i.m70778a(this.f64210b, c31592r0);
                    }
                }, button);
            }
            if (lottieAnimationView != null) {
                CharSequence charSequence = c31592r0.f64180h;
                CharSequence charSequence2 = c31592r0.f64181i;
                if (charSequence != null) {
                    AbstractC28427X.m69313a(lottieAnimationView, "Chip area", charSequence);
                }
                if (charSequence2 != null) {
                    AbstractC28427X.m69313a(lottieAnimationView, "Phone sensor", charSequence2);
                }
            }
        }
        if (textView != null) {
            AbstractC28458h.m69341a(textView, c31592r0.f64174b);
        }
        if (textView2 != null) {
            AbstractC28458h.m69341a(textView2, c31592r0.f64175c);
        }
        if (textView3 != null) {
            AbstractC28458h.m69341a(textView3, c31592r0.f64176d);
        }
        Integer num = c31592r0.f64177e;
        if (num == null) {
            if (sNSDotsProgressView != null) {
                sNSDotsProgressView.setVisibility(8);
            }
        } else {
            if (sNSDotsProgressView != null) {
                sNSDotsProgressView.setProgress(num.intValue());
            }
            if (sNSDotsProgressView != null) {
                sNSDotsProgressView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70778a(C31626i c31626i, C31592R0 c31592r0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.CancelButton, null, 24);
        ((C31583M0) c31626i.f64224a.getValue()).m70764a(c31592r0.f64179g);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final void m70789a(final C31591Q0 c31591q0) {
        ViewGroup viewGroupM70786a = m70786a(c31591q0, R$layout.sns_eid_pin_selector);
        TextView textView = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewGroupM70786a != null ? (TextView) viewGroupM70786a.findViewById(R$id.sns_subtitle) : null;
        Button button = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_button_option) : null;
        Button button2 = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_primary_button) : null;
        Button button3 = viewGroupM70786a != null ? (Button) viewGroupM70786a.findViewById(R$id.sns_secondary_button) : null;
        ImageView imageView = viewGroupM70786a != null ? (ImageView) viewGroupM70786a.findViewById(R$id.sns_image) : null;
        if (textView != null) {
            textView.setText(c31591q0.f64168b);
        }
        if (textView2 != null) {
            CharSequence charSequence = c31591q0.f64169c;
            textView2.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
        }
        if (button != null) {
            button.setText(c31591q0.f64170d);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.f1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70777a(this.f64214b, c31591q0);
                }
            }, button);
        }
        if (button2 != null) {
            button2.setText(c31591q0.f64171e);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.g1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70783b(this.f64217b, c31591q0);
                }
            }, button2);
        }
        if (button3 != null) {
            button3.setText(c31591q0.f64172f);
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.h1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70785c(this.f64220b, c31591q0);
                }
            }, button3);
        }
        if (imageView != null) {
            imageView.setImageDrawable(C28468k0.f57983a.getIconHandler().onResolveIcon(requireContext(), SNSIconHandler.SNSEidIcons.ID_CARD.getImageName()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70777a(C31626i c31626i, C31591Q0 c31591q0) {
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.InfoButton, null, 24);
        C31583M0 c31583m0 = (C31583M0) c31626i.f64224a.getValue();
        c31591q0.getClass();
        c31583m0.m70764a(C31588P.f64166a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final ViewGroup m70786a(AbstractC31596T0 abstractC31596T0, int i11) {
        AbstractC31596T0 abstractC31596T1 = this.f64230g;
        if (abstractC31596T1 != null && Intrinsics.areEqual(abstractC31596T1.getClass(), abstractC31596T0.getClass())) {
            return m70796g();
        }
        ViewGroup viewGroupM70796g = m70796g();
        if (viewGroupM70796g != null) {
            viewGroupM70796g.removeAllViews();
        }
        LayoutInflater.from(requireContext()).inflate(i11, m70796g());
        return m70796g();
    }

    /* JADX INFO: renamed from: a */
    public final void m70794a(C31599W c31599w) {
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f = m70795f();
        View viewInflate = sNSCommonBottomSheetViewM70795f != null ? sNSCommonBottomSheetViewM70795f.inflate(R$layout.sns_eid_pin_bottom_sheet) : null;
        Button button = viewInflate != null ? (Button) viewInflate.findViewById(R$id.sns_button) : null;
        TextView textView = viewInflate != null ? (TextView) viewInflate.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewInflate != null ? (TextView) viewInflate.findViewById(R$id.sns_text) : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView2 != null) {
            CharSequence charSequence = c31599w.f64195a;
            textView2.setText(charSequence != null ? AbstractC28462i0.m69364a(charSequence, requireContext()) : null);
        }
        if (button != null) {
            button.setText(c31599w.f64196b);
        }
        if (button != null) {
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.w0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70781b(this.f64256b);
                }
            }, button);
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f2 = m70795f();
        if (sNSCommonBottomSheetViewM70795f2 != null) {
            sNSCommonBottomSheetViewM70795f2.show();
        }
        C28367f.m69259a(getAnalyticsDelegate(), Screen.EidPinInfo, this.f64225b, (Map) null, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m70793a(C31597U c31597u) {
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f = m70795f();
        View viewInflate = sNSCommonBottomSheetViewM70795f != null ? sNSCommonBottomSheetViewM70795f.inflate(R$layout.sns_eid_pin_bottom_sheet) : null;
        Button button = viewInflate != null ? (Button) viewInflate.findViewById(R$id.sns_button) : null;
        TextView textView = viewInflate != null ? (TextView) viewInflate.findViewById(R$id.sns_title) : null;
        TextView textView2 = viewInflate != null ? (TextView) viewInflate.findViewById(R$id.sns_text) : null;
        if (textView != null) {
            textView.setText(c31597u.f64191a);
        }
        if (textView2 != null) {
            textView2.setText(c31597u.f64192b);
        }
        if (button != null) {
            button.setText(c31597u.f64193c);
        }
        if (button != null) {
            AbstractC28467k.m69368a(new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C31626i.m70774a(this.f64201b);
                }
            }, button);
        }
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f2 = m70795f();
        if (sNSCommonBottomSheetViewM70795f2 != null) {
            sNSCommonBottomSheetViewM70795f2.show();
        }
        C28367f.m69259a(getAnalyticsDelegate(), Screen.EidServiceInfo, this.f64225b, (Map) null, 12);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70774a(C31626i c31626i) {
        SNSCommonBottomSheetView sNSCommonBottomSheetViewM70795f = c31626i.m70795f();
        if (sNSCommonBottomSheetViewM70795f != null) {
            sNSCommonBottomSheetViewM70795f.hide();
        }
        C28367f.m69257a(c31626i.getAnalyticsDelegate(), C31583M0.m70763b((C31583M0) c31626i.f64224a.getValue()), c31626i.f64225b, Control.DismissButton, null, 24);
        return Unit.INSTANCE;
    }
}
