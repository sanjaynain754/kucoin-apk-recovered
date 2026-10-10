package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.view.View;
import android.widget.Button;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.widget.SNSSecondaryButton;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28787t;
import com.sumsub.sns.internal.core.presentation.common.C28778k;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31905w extends AbstractC28787t {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty[] f64840q = {AbstractC28118g.m69077a(C31905w.class, "groupIntro", "getGroupIntro()Landroid/view/View;", 0), AbstractC28118g.m69077a(C31905w.class, "groupReading", "getGroupReading()Landroidx/constraintlayout/widget/Group;", 0), AbstractC28118g.m69077a(C31905w.class, "groupResult", "getGroupResult()Landroidx/constraintlayout/widget/Group;", 0), AbstractC28118g.m69077a(C31905w.class, "btnPrimary", "getBtnPrimary()Landroid/widget/Button;", 0), AbstractC28118g.m69077a(C31905w.class, "btnSecondary", "getBtnSecondary()Lcom/sumsub/sns/core/widget/SNSSecondaryButton;", 0)};

    /* JADX INFO: renamed from: e */
    public final Function0 f64841e;

    /* JADX INFO: renamed from: f */
    public final String f64842f;

    /* JADX INFO: renamed from: g */
    public final Lazy f64843g;

    /* JADX INFO: renamed from: h */
    public final C28778k f64844h;

    /* JADX INFO: renamed from: i */
    public final C28778k f64845i;

    /* JADX INFO: renamed from: j */
    public final C28778k f64846j;

    /* JADX INFO: renamed from: k */
    public final C28778k f64847k;

    /* JADX INFO: renamed from: l */
    public final C28778k f64848l;

    /* JADX INFO: renamed from: m */
    public final C31885m f64849m;

    /* JADX INFO: renamed from: n */
    public final C31909y f64850n;

    /* JADX INFO: renamed from: o */
    public final C31858c f64851o;

    /* JADX INFO: renamed from: p */
    public MrtdLayoutHandler$LayoutState f64852p;

    public C31905w(C31832F c31832f, Function0 function0, Function0 function1) {
        super(c31832f, null);
        this.f64841e = function1;
        this.f64842f = "MrtdLayoutHandler";
        this.f64843g = LazyKt.lazy(function0);
        this.f64844h = m69602a(R$id.sns_intro_group);
        this.f64845i = m69602a(R$id.sns_reading_group);
        this.f64846j = m69602a(R$id.sns_result_group);
        this.f64847k = m69602a(R$id.sns_primary_button);
        this.f64848l = m69602a(R$id.sns_secondary_button);
        this.f64849m = new C31885m(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.x0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31905w.m70931b(this.f64855b);
            }
        });
        this.f64850n = new C31909y(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31905w.m70933c(this.f64870b);
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31905w.m70935d(this.f64872b);
            }
        });
        this.f64851o = new C31858c(this, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31905w.m70928a(this.f64737b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m70929a(C31905w c31905w, View view) {
        ((C31862d0) c31905w.f64843g.getValue()).f64750b.intent(C31836J.f64699a);
    }

    /* JADX INFO: renamed from: b */
    public static final C31883l m70931b(C31905w c31905w) {
        return ((C31899t) c31905w.f64841e.invoke()).f64834e;
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m70933c(C31905w c31905w) {
        c31905w.f64849m.m69553r();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final C31907x m70935d(C31905w c31905w) {
        return ((C31899t) c31905w.f64841e.invoke()).f64833d;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        this.f64852p = null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m70934c(C31905w c31905w, View view) {
        C28367f.m69257a(c31905w.f58549a.getAnalyticsDelegate(), c31905w.f58549a.getScreen(), c31905w.f58549a.getIdDocSetType(), Control.CancelButton, null, 24);
        ((C31862d0) c31905w.f64843g.getValue()).f64750b.intent(C31835I.f64698a);
    }

    /* JADX INFO: renamed from: e */
    public static final void m70937e(C31905w c31905w, View view) {
        C28367f.m69257a(c31905w.f58549a.getAnalyticsDelegate(), c31905w.f58549a.getScreen(), c31905w.f58549a.getIdDocSetType(), Control.SkipButton, null, 24);
        ((C31862d0) c31905w.f64843g.getValue()).f64750b.intent(C31837K.f64700a);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f64842f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69605a((C31862d0) this.f64843g.getValue(), new C31903v(this));
    }

    /* JADX INFO: renamed from: n */
    public final void m70939n() {
        MrtdLayoutHandler$LayoutState mrtdLayoutHandler$LayoutState = this.f64852p;
        if (mrtdLayoutHandler$LayoutState == null) {
            return;
        }
        int i11 = AbstractC31901u.f64837a[mrtdLayoutHandler$LayoutState.ordinal()];
        if (i11 == 1) {
            Button buttonM70940o = m70940o();
            if (buttonM70940o != null) {
                buttonM70940o.setVisibility(0);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p = m70941p();
            if (sNSSecondaryButtonM70941p != null) {
                sNSSecondaryButtonM70941p.setVisibility(0);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p2 = m70941p();
            if (sNSSecondaryButtonM70941p2 != null) {
                sNSSecondaryButtonM70941p2.setDrawOutline(false);
            }
            Button buttonM70940o2 = m70940o();
            if (buttonM70940o2 != null) {
                buttonM70940o2.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.e1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31905w.m70929a(this.f64758b, view);
                    }
                });
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p3 = m70941p();
            if (sNSSecondaryButtonM70941p3 != null) {
                sNSSecondaryButtonM70941p3.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.f1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31905w.m70932b(this.f64771b, view);
                    }
                });
                return;
            }
            return;
        }
        if (i11 == 2) {
            Button buttonM70940o3 = m70940o();
            if (buttonM70940o3 != null) {
                buttonM70940o3.setVisibility(8);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p4 = m70941p();
            if (sNSSecondaryButtonM70941p4 != null) {
                sNSSecondaryButtonM70941p4.setVisibility(0);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p5 = m70941p();
            if (sNSSecondaryButtonM70941p5 != null) {
                sNSSecondaryButtonM70941p5.setDrawOutline(true);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p6 = m70941p();
            if (sNSSecondaryButtonM70941p6 != null) {
                sNSSecondaryButtonM70941p6.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.d1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C31905w.m70934c(this.f64751b, view);
                    }
                });
                return;
            }
            return;
        }
        if (i11 == 3) {
            Button buttonM70940o4 = m70940o();
            if (buttonM70940o4 != null) {
                buttonM70940o4.setVisibility(8);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p7 = m70941p();
            if (sNSSecondaryButtonM70941p7 != null) {
                sNSSecondaryButtonM70941p7.setVisibility(8);
                return;
            }
            return;
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Button buttonM70940o5 = m70940o();
        if (buttonM70940o5 != null) {
            buttonM70940o5.setVisibility(0);
        }
        SNSSecondaryButton sNSSecondaryButtonM70941p8 = m70941p();
        if (sNSSecondaryButtonM70941p8 != null) {
            sNSSecondaryButtonM70941p8.setVisibility(0);
        }
        SNSSecondaryButton sNSSecondaryButtonM70941p9 = m70941p();
        if (sNSSecondaryButtonM70941p9 != null) {
            sNSSecondaryButtonM70941p9.setDrawOutline(false);
        }
        Button buttonM70940o6 = m70940o();
        if (buttonM70940o6 != null) {
            buttonM70940o6.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31905w.m70936d(this.f64741b, view);
                }
            });
        }
        SNSSecondaryButton sNSSecondaryButtonM70941p10 = m70941p();
        if (sNSSecondaryButtonM70941p10 != null) {
            sNSSecondaryButtonM70941p10.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31905w.m70937e(this.f64748b, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public final Button m70940o() {
        return (Button) this.f64847k.getValue(this, f64840q[3]);
    }

    /* JADX INFO: renamed from: p */
    public final SNSSecondaryButton m70941p() {
        return (SNSSecondaryButton) this.f64848l.getValue(this, f64840q[4]);
    }

    /* JADX INFO: renamed from: b */
    public static final void m70932b(C31905w c31905w, View view) {
        C28367f.m69257a(c31905w.f58549a.getAnalyticsDelegate(), c31905w.f58549a.getScreen(), c31905w.f58549a.getIdDocSetType(), Control.SkipButton, null, 24);
        ((C31862d0) c31905w.f64843g.getValue()).f64750b.intent(C31837K.f64700a);
    }

    /* JADX INFO: renamed from: d */
    public static final void m70936d(C31905w c31905w, View view) {
        C28367f.m69257a(c31905w.f58549a.getAnalyticsDelegate(), c31905w.f58549a.getScreen(), c31905w.f58549a.getIdDocSetType(), Control.RetryButton, null, 24);
        ((C31862d0) c31905w.f64843g.getValue()).f64750b.intent(C31836J.f64699a);
    }

    /* JADX INFO: renamed from: a */
    public static final C31855b m70928a(C31905w c31905w) {
        return ((C31899t) c31905w.f64841e.invoke()).f64835f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m70930a(C31905w c31905w, AbstractC28978A2 abstractC28978A2, View view) {
        C28367f.m69257a(c31905w.f58549a.getAnalyticsDelegate(), c31905w.f58549a.getScreen(), c31905w.f58549a.getIdDocSetType(), Control.RetryButton, null, 24);
        InterfaceC28498u0 appListener$idensic_mobile_sdk_aar_defaultRelease = c31905w.f58549a.getAppListener$idensic_mobile_sdk_aar_defaultRelease();
        if (appListener$idensic_mobile_sdk_aar_defaultRelease != null) {
            ((SNSAppActivity) appListener$idensic_mobile_sdk_aar_defaultRelease).m70607a(abstractC28978A2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70938a(AbstractC31897s abstractC31897s) {
        Button buttonM70940o;
        if (abstractC31897s instanceof C31891p) {
            Button buttonM70940o2 = m70940o();
            if (buttonM70940o2 != null) {
                buttonM70940o2.setText(((C31891p) abstractC31897s).f64818d);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p = m70941p();
            if (sNSSecondaryButtonM70941p != null) {
                AbstractC28458h.m69341a(sNSSecondaryButtonM70941p, ((C31891p) abstractC31897s).f64819e);
                return;
            }
            return;
        }
        if (abstractC31897s instanceof C31893q) {
            SNSSecondaryButton sNSSecondaryButtonM70941p2 = m70941p();
            if (sNSSecondaryButtonM70941p2 != null) {
                sNSSecondaryButtonM70941p2.setText(((C31893q) abstractC31897s).f64823c);
                return;
            }
            return;
        }
        if (abstractC31897s instanceof C31895r) {
            SNSSecondaryButton sNSSecondaryButtonM70941p3 = m70941p();
            if (sNSSecondaryButtonM70941p3 != null) {
                sNSSecondaryButtonM70941p3.setText(((C31895r) abstractC31897s).f64827c);
                return;
            }
            return;
        }
        if (abstractC31897s instanceof C31889o) {
            Button buttonM70940o3 = m70940o();
            if (buttonM70940o3 != null) {
                AbstractC28458h.m69341a(buttonM70940o3, ((C31889o) abstractC31897s).f64810b);
            }
            SNSSecondaryButton sNSSecondaryButtonM70941p4 = m70941p();
            if (sNSSecondaryButtonM70941p4 != null) {
                AbstractC28458h.m69341a(sNSSecondaryButtonM70941p4, ((C31889o) abstractC31897s).f64811c);
            }
            final AbstractC28978A2 abstractC28978A2 = ((C31889o) abstractC31897s).f64812d;
            if (abstractC28978A2 == null || (buttonM70940o = m70940o()) == null) {
                return;
            }
            buttonM70940o.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C31905w.m70930a(this.f64777b, abstractC28978A2, view);
                }
            });
            return;
        }
        if (!(abstractC31897s instanceof C31887n)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
