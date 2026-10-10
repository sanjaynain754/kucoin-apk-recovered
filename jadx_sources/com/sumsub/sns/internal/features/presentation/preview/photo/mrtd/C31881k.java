package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31881k extends AbstractC28775h {

    /* JADX INFO: renamed from: f */
    public final String f64791f;

    /* JADX INFO: renamed from: g */
    public final Lazy f64792g;

    /* JADX INFO: renamed from: a */
    public static final Unit m70922a(C31881k c31881k, InterfaceC31861d interfaceC31861d) {
        if (Intrinsics.areEqual(interfaceC31861d, C31867f.f64759a)) {
            super.mo69598p();
        } else {
            if (!Intrinsics.areEqual(interfaceC31861d, C31864e.f64752a)) {
                throw new NoWhenBranchMatchedException();
            }
            AlertDialog alertDialog = c31881k.f58525e;
            if (alertDialog != null) {
                if (!alertDialog.isShowing()) {
                    alertDialog = null;
                }
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: p */
    public final void mo69598p() {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final void m70924b(C31881k c31881k, DialogInterface dialogInterface, int i11) {
        C28367f analyticsDelegate = c31881k.f58549a.getAnalyticsDelegate();
        Screen f63626a = c31881k.f58549a.getF63626a();
        String f62316b = c31881k.f58549a.getF66519e();
        Control control = Control.CancelButton;
        Popup popup = Popup.MrtdExitPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", c31881k.f58549a.getF63626a()));
        analyticsDelegate.getClass();
        C28367f.m69253a(f63626a, f62316b, control, mapMapOf, popup);
        C31879j c31879j = (C31879j) c31881k.f64792g.getValue();
        C28936t c28936t = c31879j.f64788c;
        KProperty kProperty = C31879j.f64785e[0];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.FALSE);
        c31879j.f64787b.invoke();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f64791f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69605a((C31879j) this.f64792g.getValue(), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C31881k.m70922a(this.f64829b, (InterfaceC31861d) obj);
            }
        });
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: n */
    public final void mo69596n() {
        C28367f analyticsDelegate = this.f58549a.getAnalyticsDelegate();
        Screen f63626a = this.f58549a.getF63626a();
        String f62316b = this.f58549a.getF66519e();
        Popup popup = Popup.MrtdExitPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", this.f58549a.getF63626a()));
        analyticsDelegate.getClass();
        C28367f.m69254a(f63626a, f62316b, mapMapOf, popup);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: o */
    public final void mo69597o() {
        C28367f analyticsDelegate = this.f58549a.getAnalyticsDelegate();
        Screen f63626a = this.f58549a.getF63626a();
        String f62316b = this.f58549a.getF66519e();
        Popup popup = Popup.MrtdExitPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", this.f58549a.getF63626a()));
        analyticsDelegate.getClass();
        C28367f.m69261b(f63626a, f62316b, mapMapOf, popup);
    }

    public C31881k(C31832F c31832f, Function0 function0) {
        super(c31832f);
        this.f64791f = "MrtdExitConfirmation";
        this.f64792g = LazyKt.lazy(function0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70923a(C31881k c31881k, DialogInterface dialogInterface, int i11) {
        C28367f analyticsDelegate = c31881k.f58549a.getAnalyticsDelegate();
        Screen f63626a = c31881k.f58549a.getF63626a();
        String f62316b = c31881k.f58549a.getF66519e();
        Control control = Control.ConfirmButton;
        Popup popup = Popup.MrtdExitPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", c31881k.f58549a.getF63626a()));
        analyticsDelegate.getClass();
        C28367f.m69253a(f63626a, f62316b, control, mapMapOf, popup);
        C31879j c31879j = (C31879j) c31881k.f64792g.getValue();
        C28936t c28936t = c31879j.f64788c;
        KProperty kProperty = C31879j.f64785e[0];
        c28936t.f58834a.set(c28936t.f58835b, Boolean.FALSE);
        c31879j.f64786a.invoke();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        return new SNSAlertDialogBuilder(this.f58549a.requireActivity()).setMessage((CharSequence) c29983l.m70061a("sns_mrtdscan_alert_aboutToExit")).setPositiveButton((CharSequence) c29983l.m70061a("sns_alert_action_confirm"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.t0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C31881k.m70923a(this.f64836b, dialogInterface, i11);
            }
        }).setNegativeButton((CharSequence) c29983l.m70061a("sns_alert_action_cancel"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.u0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C31881k.m70924b(this.f64838b, dialogInterface, i11);
            }
        }).setCancelable(false).create();
    }
}
