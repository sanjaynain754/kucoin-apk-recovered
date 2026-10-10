package com.sumsub.sns.internal.core.presentation.android;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.analytics.PermissionPayload;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.core.presentation.common.C28776i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28638M extends AbstractC28775h {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty[] f58268k = {AbstractC28639a.m69485a(C28638M.class, "hasShownInSession", "getHasShownInSession()Z", 0), AbstractC28639a.m69485a(C28638M.class, "waitingForReturnFromSettings", "getWaitingForReturnFromSettings()Z", 0)};

    /* JADX INFO: renamed from: f */
    public final Function0 f58269f;

    /* JADX INFO: renamed from: g */
    public final Function0 f58270g;

    /* JADX INFO: renamed from: h */
    public final String f58271h;

    /* JADX INFO: renamed from: i */
    public final C28776i f58272i;

    /* JADX INFO: renamed from: j */
    public final C28776i f58273j;

    /* JADX INFO: renamed from: a */
    public static final void m69476a(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: a */
    public static final void m69477a(C28638M c28638m, DialogInterface dialogInterface, int i11) {
        C28776i c28776i = c28638m.f58273j;
        KProperty kProperty = f58268k[1];
        c28776i.getClass();
        Bundle arguments = c28638m.f58549a.getArguments();
        if (arguments != null) {
            arguments.putBoolean(c28638m.m69603a(c28776i.f58526a), true);
        }
        c28638m.f58549a.requireActivity().startActivity(new Intent("android.settings.action.MANAGE_WRITE_SETTINGS").addFlags(268435456));
    }

    /* JADX INFO: renamed from: b */
    public static final void m69478b(C28638M c28638m, DialogInterface dialogInterface, int i11) {
        c28638m.f58270g.invoke();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58271h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: j */
    public final void mo69481j() {
        C28776i c28776i = this.f58273j;
        KProperty[] kPropertyArr = f58268k;
        KProperty kProperty = kPropertyArr[1];
        if (c28776i.m69599a(this)) {
            C28776i c28776i2 = this.f58273j;
            KProperty kProperty2 = kPropertyArr[1];
            c28776i2.getClass();
            Bundle arguments = this.f58549a.getArguments();
            if (arguments != null) {
                arguments.putBoolean(m69603a(c28776i2.f58526a), false);
            }
            if (Settings.System.canWrite(this.f58549a.requireContext())) {
                this.f58269f.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m69482q() {
        if (Settings.System.canWrite(this.f58549a.requireContext())) {
            this.f58269f.invoke();
            return;
        }
        C28776i c28776i = this.f58272i;
        KProperty[] kPropertyArr = f58268k;
        KProperty kProperty = kPropertyArr[0];
        if (c28776i.m69599a(this)) {
            return;
        }
        C28776i c28776i2 = this.f58272i;
        KProperty kProperty2 = kPropertyArr[0];
        c28776i2.getClass();
        Bundle arguments = this.f58549a.getArguments();
        if (arguments != null) {
            arguments.putBoolean(m69603a(c28776i2.f58526a), true);
        }
        mo69598p();
    }

    /* JADX INFO: renamed from: r */
    public final Map m69483r() {
        Map mapMapOf;
        return (this.f58549a.getContext() == null || (mapMapOf = MapsKt.mapOf(TuplesKt.m90091to(PermissionPayload.WRITE_SYSTEM_SETTINGS.getValue(), Boolean.valueOf(Settings.System.canWrite(this.f58549a.requireContext()))))) == null) ? MapsKt.emptyMap() : mapMapOf;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m69484s() {
        return Settings.System.canWrite(this.f58549a.requireContext());
    }

    public C28638M(AbstractC28133l abstractC28133l, Function0 function0, Function0 function1) {
        super(abstractC28133l);
        this.f58269f = function0;
        this.f58270g = function1;
        this.f58271h = "SystemSettings";
        this.f58272i = new C28776i("SYSTEM_SETTINGS_HAS_SHOWN", false);
        this.f58273j = new C28776i("SYSTEM_SETTINGS_WAITING_FOR_RETURN", false);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        return new SNSAlertDialogBuilder(this.f58549a.requireContext()).setMessage((CharSequence) c29983l.m70061a("sns_alert_lackOfSettingsPermissions")).setPositiveButton((CharSequence) c29983l.m70061a("sns_alert_action_ok"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28638M.m69477a(this.f58274b, dialogInterface, i11);
            }
        }).setNegativeButton((CharSequence) c29983l.m70061a("sns_alert_action_dont_show"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.b0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28638M.m69478b(this.f58275b, dialogInterface, i11);
            }
        }).setNeutralButton((CharSequence) c29983l.m70061a("sns_alert_action_cancel"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.c0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28638M.m69476a(dialogInterface, i11);
            }
        }).create();
    }
}
