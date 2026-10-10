package com.sumsub.sns.internal.core.presentation.android.location;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.geo.C31087g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28686v extends AbstractC28775h {

    /* JADX INFO: renamed from: f */
    public final String f58334f;

    /* JADX INFO: renamed from: g */
    public final Lazy f58335g;

    /* JADX INFO: renamed from: a */
    public static final void m69502a(C28686v c28686v, DialogInterface dialogInterface, int i11) {
        C28683s c28683s = (C28683s) c28686v.f58335g.getValue();
        c28683s.m69496a("opened location settings");
        c28683s.f58329c.setValue(LocationServiceController$Phase.AwaitingSettingsReturn);
        c28686v.f58549a.requireActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* JADX INFO: renamed from: b */
    public static final void m69503b(C28686v c28686v, DialogInterface dialogInterface, int i11) {
        ((C28683s) c28686v.f58335g.getValue()).m69497a(false);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58334f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: j */
    public final void mo69481j() {
        if (((C28683s) this.f58335g.getValue()).f58330d.getValue() == LocationServiceController$Phase.AwaitingSettingsReturn) {
            ((C28683s) this.f58335g.getValue()).m69498b(((Boolean) AbstractC28684t.m69499a(this.f58549a.requireContext()).invoke()).booleanValue());
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        AbstractC28421U.m69304a(((C28683s) this.f58335g.getValue()).f58330d, this.f58549a.getViewLifecycleOwner(), new C28685u(this, null));
    }

    public C28686v(C31087g c31087g, Function0 function0) {
        super(c31087g);
        this.f58334f = "LocationService";
        this.f58335g = LazyKt.lazy(function0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69501a(C28686v c28686v, DialogInterface dialogInterface) {
        ((C28683s) c28686v.f58335g.getValue()).m69497a(false);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        return new SNSAlertDialogBuilder(this.f58549a.requireContext()).setMessage((CharSequence) c29983l.m70061a("sns_alert_lackOfLocationPermissions")).setCancelable(false).setPositiveButton((CharSequence) c29983l.m70061a("sns_alert_action_settings"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.location.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28686v.m69502a(this.f58339b, dialogInterface, i11);
            }
        }).setNegativeButton((CharSequence) c29983l.m70061a("sns_alert_action_cancel"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.location.a0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28686v.m69503b(this.f58294b, dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sumsub.sns.internal.core.presentation.android.location.b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C28686v.m69501a(this.f58296b, dialogInterface);
            }
        }).create();
    }
}
