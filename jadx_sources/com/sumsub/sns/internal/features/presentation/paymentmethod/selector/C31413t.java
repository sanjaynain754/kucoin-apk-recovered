package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29006G2;
import com.sumsub.sns.internal.features.data.model.common.C29018J2;
import com.sumsub.sns.internal.features.data.model.common.C29022K2;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.sumsub.sns.internal.features.presentation.paymentmethod.C31391a;
import com.sumsub.sns.internal.features.presentation.paymentmethod.InterfaceC31392b;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31413t extends AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f63654V = 0;

    /* JADX INFO: renamed from: a */
    public final Document f63655a;

    /* JADX INFO: renamed from: b */
    public final C30317b f63656b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f63657c;

    /* JADX INFO: renamed from: d */
    public final C31415v f63658d;

    /* JADX INFO: renamed from: e */
    public final C28367f f63659e;

    /* JADX INFO: renamed from: a */
    public static final Unit m70713a(C31413t c31413t) {
        AbstractC28052C.finish$default(c31413t, C28497u.f58029b, null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    public C31413t(Document document, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(3));
        this.f63655a = document;
        C30317b c30317b = new C30317b("SNSPaymentMethodSelector", new C30316a(0));
        this.f63656b = c30317b;
        this.f63657c = C41679x.m91009a(null);
        this.f63658d = new C31415v(new C31412s(this), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31413t.m70713a(this.f63618b);
            }
        }, c30317b);
        this.f63659e = new C28367f(Screen.PaymentMethodsSelectorScreen, document.getType().f59014a);
    }

    /* JADX INFO: renamed from: a */
    public final List m70714a(C28075O c28075o) {
        List listEmptyList;
        AbstractC29172p abstractC29172p;
        C29154m c29154mM69794a;
        C31391a c31391a = null;
        C29022K2 c29022k2 = (c28075o == null || (abstractC29172p = c28075o.f57269a) == null || (c29154mM69794a = abstractC29172p.m69794a(this.f63655a.getType())) == null) ? null : c29154mM69794a.f59148q;
        if (c29022k2 != null) {
            C29018J2 c29018j2 = c29022k2.f58965a;
            if (c29018j2 == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                C29006G2 c29006g2 = c29018j2.f58960a;
                if (c29006g2 != null) {
                    if (!c29006g2.f58951a) {
                        c29006g2 = null;
                    }
                    if (c29006g2 != null) {
                        c31391a = new C31391a(c29006g2.f58952b);
                    }
                }
                if (c31391a != null) {
                    arrayList.add(c31391a);
                }
                listEmptyList = arrayList;
            }
            if (listEmptyList != null) {
                return listEmptyList;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: e */
    public final void m70715e() {
        String str = (String) this.f63657c.getValue();
        if (str == null) {
            return;
        }
        C30317b.m70184a(this.f63656b, "onContinueClicked, selected=" + str);
        C28367f.m69256a(this.f63659e, Control.ContinueButton, MapsKt.mapOf(TuplesKt.m90091to("selected", str)), (Popup) null, 4);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C31411r(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m70716f() {
        C30317b.m70184a(this.f63656b, "onItemSelected, typeKey=bankCard");
        C28367f.m69256a(this.f63659e, Control.ListItem, MapsKt.mapOf(TuplesKt.m90091to("selected", "bankCard")), (Popup) null, 4);
        this.f63657c.setValue("bankCard");
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "PAYMENT_METHODS";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        if (!(interfaceC28077Q instanceof C31404k)) {
            if (interfaceC28077Q instanceof C31403j) {
                m70716f();
                return;
            } else {
                if (interfaceC28077Q instanceof C31402i) {
                    m70715e();
                    return;
                }
                return;
            }
        }
        C31415v c31415v = this.f63658d;
        c31415v.f63665d = true;
        if (!c31415v.f63667f) {
            c31415v.m70717a();
            return;
        }
        C33272c.f67816e.f67810a.mo68955d(c31415v.f63664c.f60947a, "onResumed after open → finishAfterReturn", null);
        c31415v.f63663b.invoke();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        C31413t c31413t;
        List listM70714a = m70714a(c28075o);
        if (listM70714a.isEmpty()) {
            C30317b.m70184a(this.f63656b, "buildViewStateFlow: 0 options → throwError");
            c31413t = this;
            AbstractC28052C.throwError$default(c31413t, new IllegalStateException("No payment methods available for applicant"), "PAYMENT_METHODS", null, 4, null);
        } else {
            c31413t = this;
            if (listM70714a.size() == 1) {
                C30317b.m70184a(c31413t.f63656b, "buildViewStateFlow: 1 options → requestAutoOpen");
                c31413t.f63658d.m70718a((InterfaceC31392b) CollectionsKt.first(listM70714a));
            }
        }
        if (c31413t.f63657c.getValue() == null && ((InterfaceC31392b) CollectionsKt.firstOrNull(listM70714a)) != null) {
            c31413t.f63657c.setValue("bankCard");
        }
        return new C31410q(c31413t.f63657c, c28075o.f57271c, listM70714a);
    }
}
