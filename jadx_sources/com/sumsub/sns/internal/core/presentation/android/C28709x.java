package com.sumsub.sns.internal.core.presentation.android;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28461i;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.geo.C31087g;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28709x extends AbstractC28775h {

    /* JADX INFO: renamed from: f */
    public final String f58380f;

    /* JADX INFO: renamed from: g */
    public final Lazy f58381g;

    /* JADX INFO: renamed from: h */
    public ActivityResultLauncher f58382h;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m69526a(AbstractC28637L abstractC28637L) {
        return abstractC28637L.f58265a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m69530b(C28709x c28709x, DialogInterface dialogInterface, int i11) {
        C28705t c28705t = (C28705t) c28709x.f58381g.getValue();
        c28705t.m69508a("cancelled by user");
        c28705t.m69507a(C28653h.f58285a);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        AbstractC28636K abstractC28636K;
        Object value = ((C28705t) this.f58381g.getValue()).f58362e.getValue();
        C28695o c28695o = value instanceof C28695o ? (C28695o) value : null;
        if (c28695o == null || (abstractC28636K = c28695o.f58343a) == null) {
            return null;
        }
        return new SNSAlertDialogBuilder(this.f58549a.requireContext()).setMessage((CharSequence) c29983l.m70061a(abstractC28636K.f58264d)).setCancelable(false).setPositiveButton((CharSequence) c29983l.m70061a("sns_alert_action_settings"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.o0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28709x.m69528a(this.f58344b, dialogInterface, i11);
            }
        }).setNegativeButton((CharSequence) c29983l.m70061a("sns_alert_action_cancel"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28709x.m69530b(this.f58345b, dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.sumsub.sns.internal.core.presentation.android.q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C28709x.m69527a(this.f58349b, dialogInterface);
            }
        }).create();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58380f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: i */
    public final void mo69531i() {
        ((C28705t) this.f58381g.getValue()).m69510b(m69533q());
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: j */
    public final void mo69481j() {
        ((C28705t) this.f58381g.getValue()).m69510b(m69533q());
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: k */
    public final void mo69532k() {
        ((C28705t) this.f58381g.getValue()).f58363f.setValue(null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        String strJoinToString$default = CollectionsKt.joinToString$default(((C28705t) this.f58381g.getValue()).f58358a, "_", null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.android.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28709x.m69526a((AbstractC28637L) obj);
            }
        }, 30, null);
        this.f58382h = this.f58549a.requireActivity().getActivityResultRegistry().register(m69603a(strJoinToString$default), this.f58549a.getViewLifecycleOwner(), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.sumsub.sns.internal.core.presentation.android.n0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C28709x.m69529a(this.f58342a, (Map) obj);
            }
        });
        AbstractC28421U.m69304a(((C28705t) this.f58381g.getValue()).f58362e, this.f58549a.getViewLifecycleOwner(), new C28708w(this, null));
    }

    /* JADX INFO: renamed from: q */
    public final Set m69533q() {
        boolean zM69362a;
        Set set = ((C28705t) this.f58381g.getValue()).f58358a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            AbstractC28637L abstractC28637L = (AbstractC28637L) obj;
            if (abstractC28637L instanceof C28634I) {
                zM69362a = AbstractC28461i.m69362a(this.f58549a.requireContext(), ((C28634I) abstractC28637L).f58263d);
            } else {
                String str = abstractC28637L.f58266b;
                zM69362a = str == null || ContextCompat.checkSelfPermission(this.f58549a.requireContext(), str) == 0;
            }
            if (!zM69362a) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public C28709x(C31087g c31087g, Function0 function0) {
        super(c31087g);
        this.f58380f = "PermissionsHandler";
        this.f58381g = LazyKt.lazy(function0);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h, com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        super.mo69522m();
        ActivityResultLauncher activityResultLauncher = this.f58382h;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f58382h = null;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69528a(C28709x c28709x, DialogInterface dialogInterface, int i11) {
        C28705t c28705t = (C28705t) c28709x.f58381g.getValue();
        c28705t.m69508a("opened app settings");
        c28705t.f58361d.setValue(C28661l.f58291a);
        FragmentActivity fragmentActivityRequireActivity = c28709x.f58549a.requireActivity();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(TPDownloadProxyEnum.DLPARAM_PACKAGE, fragmentActivityRequireActivity.getPackageName(), null));
        fragmentActivityRequireActivity.startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69527a(C28709x c28709x, DialogInterface dialogInterface) {
        C28705t c28705t = (C28705t) c28709x.f58381g.getValue();
        c28705t.m69508a("cancelled by user");
        c28705t.m69507a(C28653h.f58285a);
    }

    /* JADX INFO: renamed from: a */
    public static final void m69529a(C28709x c28709x, Map map) {
        ((C28705t) c28709x.f58381g.getValue()).m69511c(c28709x.m69533q());
    }
}
