package com.sumsub.sns.internal.core.presentation.nfc;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Popup;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.AbstractC28489r0;
import com.sumsub.sns.internal.core.common.C28480o0;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31606b;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31609c;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.C31626i;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28897b extends AbstractC28775h {

    /* JADX INFO: renamed from: f */
    public final Function1 f58757f;

    /* JADX INFO: renamed from: g */
    public final Function0 f58758g;

    /* JADX INFO: renamed from: h */
    public final String f58759h;

    /* JADX INFO: renamed from: i */
    public final C28896a f58760i;

    /* JADX INFO: renamed from: j */
    public Boolean f58761j;

    public C28897b(C31626i c31626i, C31606b c31606b, C31609c c31609c) {
        super(c31626i);
        this.f58759h = "NfcDialog";
        this.f58760i = new C28896a(this);
        this.f58757f = c31606b;
        this.f58758g = c31609c;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69674a(C28897b c28897b, DialogInterface dialogInterface, int i11) {
        C28367f analyticsDelegate = c28897b.f58549a.getAnalyticsDelegate();
        Screen f66530b = c28897b.f58549a.getF66530b();
        String f66531c = c28897b.f58549a.getF66531c();
        Control control = Control.SettingsButton;
        Popup popup = Popup.NfcRequestPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", c28897b.f58549a.getF66530b()));
        analyticsDelegate.getClass();
        C28367f.m69253a(f66530b, f66531c, control, mapMapOf, popup);
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        intent.setFlags(268435456);
        c28897b.f58549a.requireActivity().startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    public static final void m69675b(C28897b c28897b, DialogInterface dialogInterface, int i11) {
        c28897b.m69608b("MRTD screen: canceled - NFC disabled");
        C28367f analyticsDelegate = c28897b.f58549a.getAnalyticsDelegate();
        Screen f66530b = c28897b.f58549a.getF66530b();
        String f66531c = c28897b.f58549a.getF66531c();
        Control control = Control.DismissButton;
        Popup popup = Popup.NfcRequestPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", c28897b.f58549a.getF66530b()));
        analyticsDelegate.getClass();
        C28367f.m69253a(f66530b, f66531c, control, mapMapOf, popup);
        c28897b.f58758g.invoke();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58759h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: j */
    public final void mo69481j() {
        AlertDialog alertDialog;
        AbstractC28489r0 abstractC28489r0M69348b = AbstractC28458h.m69348b(this.f58549a.requireContext());
        C28480o0 c28480o0 = C28480o0.f58016b;
        m69676a(Boolean.valueOf(Intrinsics.areEqual(abstractC28489r0M69348b, c28480o0)));
        if (Intrinsics.areEqual(AbstractC28458h.m69348b(this.f58549a.requireContext()), c28480o0) || (alertDialog = this.f58525e) == null || alertDialog.isShowing()) {
            return;
        }
        super.mo69598p();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        m69676a(Boolean.valueOf(Intrinsics.areEqual(AbstractC28458h.m69348b(this.f58549a.requireContext()), C28480o0.f58016b)));
        try {
            m69608b("Registering NFC receiver.");
            ContextCompat.registerReceiver(this.f58549a.requireContext().getApplicationContext(), this.f58760i, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"), 2);
            m69608b("NFC receiver registered successfully.");
        } catch (Throwable th2) {
            m69606a("Receiver registering error", th2);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: n */
    public final void mo69596n() {
        C28367f analyticsDelegate = this.f58549a.getAnalyticsDelegate();
        Screen f66530b = this.f58549a.getF66530b();
        String f66531c = this.f58549a.getF66531c();
        Popup popup = Popup.NfcRequestPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", this.f58549a.getF66530b()));
        analyticsDelegate.getClass();
        C28367f.m69254a(f66530b, f66531c, mapMapOf, popup);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: o */
    public final void mo69597o() {
        C28367f analyticsDelegate = this.f58549a.getAnalyticsDelegate();
        Screen f66530b = this.f58549a.getF66530b();
        String f66531c = this.f58549a.getF66531c();
        Popup popup = Popup.NfcRequestPopup;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("fromScreen", this.f58549a.getF66530b()));
        analyticsDelegate.getClass();
        C28367f.m69261b(f66530b, f66531c, mapMapOf, popup);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h, com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        super.mo69522m();
        try {
            m69608b("Unregistering NFC receiver.");
            this.f58549a.requireContext().getApplicationContext().unregisterReceiver(this.f58760i);
            m69608b("NFC receiver unregistered successfully.");
        } catch (Throwable th2) {
            m69606a("Receiver unregistering error", th2);
        }
    }

    public C28897b(C28908m c28908m, Function1 function1, Function0 function0) {
        super(c28908m);
        this.f58759h = "NfcDialog";
        this.f58760i = new C28896a(this);
        this.f58757f = function1;
        this.f58758g = function0;
    }

    /* JADX INFO: renamed from: a */
    public final void m69676a(Boolean bool) {
        AlertDialog alertDialog;
        if (Intrinsics.areEqual(bool, Boolean.TRUE) && (alertDialog = this.f58525e) != null) {
            alertDialog.dismiss();
        }
        if (Intrinsics.areEqual(this.f58761j, bool)) {
            return;
        }
        this.f58761j = bool;
        this.f58757f.invoke(bool);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        SNSAlertDialogBuilder sNSAlertDialogBuilder = new SNSAlertDialogBuilder(this.f58549a.requireActivity());
        sNSAlertDialogBuilder.setCancelable(false);
        sNSAlertDialogBuilder.setTitle((CharSequence) c29983l.m70061a("sns_dialog_nfc_title"));
        sNSAlertDialogBuilder.setMessage((CharSequence) c29983l.m70061a("sns_dialog_nfc_message"));
        sNSAlertDialogBuilder.setPositiveButton((CharSequence) c29983l.m70061a("sns_dialog_nfc_action_settings"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.nfc.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28897b.m69674a(this.f58795b, dialogInterface, i11);
            }
        });
        sNSAlertDialogBuilder.setNegativeButton((CharSequence) c29983l.m70061a("sns_alert_action_dismiss"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.nfc.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28897b.m69675b(this.f58796b, dialogInterface, i11);
            }
        });
        return sNSAlertDialogBuilder.create();
    }
}
