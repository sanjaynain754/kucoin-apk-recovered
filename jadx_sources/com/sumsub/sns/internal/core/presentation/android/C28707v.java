package com.sumsub.sns.internal.core.presentation.android;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.common.AbstractC28461i;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.core.presentation.common.C28776i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.camera.C30749s;
import com.sumsub.sns.internal.features.presentation.camera.C30751t;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28707v extends AbstractC28775h {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty[] f58368o = {AbstractC28639a.m69485a(C28707v.class, "waitingForReturnFromSettings", "getWaitingForReturnFromSettings()Z", 0)};

    /* JADX INFO: renamed from: f */
    public final Lazy f58369f;

    /* JADX INFO: renamed from: g */
    public final Set f58370g;

    /* JADX INFO: renamed from: h */
    public final Function0 f58371h;

    /* JADX INFO: renamed from: i */
    public final Function0 f58372i;

    /* JADX INFO: renamed from: j */
    public final Function0 f58373j;

    /* JADX INFO: renamed from: k */
    public final Function1 f58374k;

    /* JADX INFO: renamed from: l */
    public ActivityResultLauncher f58375l;

    /* JADX INFO: renamed from: m */
    public final C28776i f58376m;

    /* JADX INFO: renamed from: n */
    public final String f58377n;

    public /* synthetic */ C28707v(AbstractC28133l abstractC28133l, Set set, Function0 function0, Function0 function1, Function0 function2, int i11) {
        this(abstractC28133l, set, function0, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.android.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C28707v.m69516a((AbstractC28637L) obj));
            }
        }, (i11 & 16) != 0 ? new Function0() { // from class: com.sumsub.sns.internal.core.presentation.android.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28707v.m69519q();
            }
        } : function1, function2);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69516a(AbstractC28637L abstractC28637L) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m69517b(AbstractC28637L abstractC28637L) {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69513a(AbstractC28636K abstractC28636K, C28707v c28707v, DialogInterface dialogInterface, int i11) {
        String str = abstractC28636K.f58266b;
        if (str != null) {
            if (!c28707v.f58549a.shouldShowRequestPermissionRationale(str)) {
                str = null;
            }
            if (str != null) {
                ActivityResultLauncher activityResultLauncher = c28707v.f58375l;
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(new String[]{str});
                    return;
                }
                return;
            }
        }
        C28776i c28776i = c28707v.f58376m;
        KProperty kProperty = f58368o[0];
        c28776i.getClass();
        Bundle arguments = c28707v.f58549a.getArguments();
        if (arguments != null) {
            arguments.putBoolean(c28707v.m69603a(c28776i.f58526a), true);
        }
        FragmentActivity fragmentActivityRequireActivity = c28707v.f58549a.requireActivity();
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(TPDownloadProxyEnum.DLPARAM_PACKAGE, fragmentActivityRequireActivity.getPackageName(), null));
        fragmentActivityRequireActivity.startActivity(intent);
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m69518c(AbstractC28637L abstractC28637L) {
        return abstractC28637L.f58265a;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m69519q() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m69520r() {
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58377n;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: j */
    public final void mo69481j() {
        C28776i c28776i = this.f58376m;
        KProperty[] kPropertyArr = f58368o;
        KProperty kProperty = kPropertyArr[0];
        if (c28776i.m69599a(this)) {
            C28776i c28776i2 = this.f58376m;
            KProperty kProperty2 = kPropertyArr[0];
            c28776i2.getClass();
            Bundle arguments = this.f58549a.getArguments();
            if (arguments != null) {
                arguments.putBoolean(m69603a(c28776i2.f58526a), false);
            }
            ((C28651g) this.f58369f.getValue()).m69488a(m69521a(m69524t()), false);
        }
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        String strJoinToString$default = CollectionsKt.joinToString$default(this.f58370g, "_", null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.android.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C28707v.m69518c((AbstractC28637L) obj);
            }
        }, 30, null);
        this.f58375l = this.f58549a.requireActivity().getActivityResultRegistry().register(m69603a(strJoinToString$default), this.f58549a.getViewLifecycleOwner(), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.sumsub.sns.internal.core.presentation.android.j0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C28707v.m69515a(this.f58287a, (Map) obj);
            }
        });
        m69605a((C28651g) this.f58369f.getValue(), new C28706u(this));
    }

    /* JADX INFO: renamed from: s */
    public final void m69523s() {
        C28776i c28776i = this.f58376m;
        KProperty kProperty = f58368o[0];
        if (c28776i.m69599a(this)) {
            return;
        }
        ((C28651g) this.f58369f.getValue()).m69487a(C28647e.f58280a);
        Set setM69521a = m69521a(m69524t());
        if (setM69521a.isEmpty()) {
            this.f58371h.invoke();
            return;
        }
        C28651g c28651g = (C28651g) this.f58369f.getValue();
        c28651g.getClass();
        c28651g.m69487a(new C28643c(setM69521a, false, false, 0));
    }

    /* JADX INFO: renamed from: t */
    public final Set m69524t() {
        Set set = this.f58370g;
        Function1 function1 = this.f58374k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* JADX INFO: renamed from: u */
    public final Map m69525u() {
        boolean zM69362a;
        if (this.f58549a.getContext() == null) {
            return MapsKt.emptyMap();
        }
        Set set = this.f58370g;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String value = ((AbstractC28637L) obj).f58267c.getValue();
            Object arrayList = linkedHashMap.get(value);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(value, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List<AbstractC28637L> list = (List) entry.getValue();
            boolean z11 = true;
            if (list == null || !list.isEmpty()) {
                for (AbstractC28637L abstractC28637L : list) {
                    if (abstractC28637L instanceof C28634I) {
                        zM69362a = AbstractC28461i.m69362a(this.f58549a.requireContext(), ((C28634I) abstractC28637L).f58263d);
                    } else {
                        String str = abstractC28637L.f58266b;
                        zM69362a = str == null || ContextCompat.checkSelfPermission(this.f58549a.requireContext(), str) == 0;
                    }
                    if (!zM69362a) {
                        z11 = false;
                        break;
                    }
                }
            }
            linkedHashMap2.put(key, Boolean.valueOf(z11));
        }
        return linkedHashMap2;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h, com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        super.mo69522m();
        ActivityResultLauncher activityResultLauncher = this.f58375l;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f58375l = null;
    }

    public C28707v(AbstractC28133l abstractC28133l, Set set, Function0 function0, Function1 function1, Function0 function2, Function0 function3) {
        super(abstractC28133l);
        this.f58369f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.presentation.android.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28707v.m69512a(this.f58281b);
            }
        });
        this.f58376m = new C28776i("PERMISSION_WAITING_FOR_SETTINGS", false);
        this.f58377n = "Permission";
        this.f58370g = set;
        this.f58373j = function0;
        this.f58374k = function1;
        this.f58371h = function2;
        this.f58372i = function3;
    }

    public /* synthetic */ C28707v(C30751t c30751t, Set set, Function0 function0, C30749s c30749s) {
        this(c30751t, set, function0, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.android.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C28707v.m69517b((AbstractC28637L) obj));
            }
        }, new Function0() { // from class: com.sumsub.sns.internal.core.presentation.android.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28707v.m69520r();
            }
        }, c30749s);
    }

    /* JADX INFO: renamed from: a */
    public static final C28651g m69512a(C28707v c28707v) {
        return (C28651g) c28707v.f58373j.invoke();
    }

    public C28707v(C30751t c30751t, Set set, Function0 function0, Function1 function1, Function0 function2, C30749s c30749s) {
        super(c30751t);
        this.f58369f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.presentation.android.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C28707v.m69512a(this.f58281b);
            }
        });
        this.f58376m = new C28776i("PERMISSION_WAITING_FOR_SETTINGS", false);
        this.f58377n = "Permission";
        this.f58370g = set;
        this.f58373j = function0;
        this.f58374k = function1;
        this.f58371h = function2;
        this.f58372i = c30749s;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        Object value = ((C28651g) this.f58369f.getValue()).f58284b.getValue();
        C28643c c28643c = value instanceof C28643c ? (C28643c) value : null;
        if (c28643c == null) {
            return null;
        }
        Set set = c28643c.f58276a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof AbstractC28636K) {
                arrayList.add(obj);
            }
        }
        final AbstractC28636K abstractC28636K = (AbstractC28636K) CollectionsKt.firstOrNull(CollectionsKt.toSet(arrayList));
        if (abstractC28636K == null) {
            return null;
        }
        return new SNSAlertDialogBuilder(this.f58549a.requireContext()).setMessage((CharSequence) c29983l.m70061a(abstractC28636K.f58264d)).setCancelable(false).setPositiveButton((CharSequence) c29983l.m70061a("sns_alert_action_settings"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28707v.m69513a(abstractC28636K, this, dialogInterface, i11);
            }
        }).setNegativeButton((CharSequence) c29983l.m70061a("sns_alert_action_cancel"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.core.presentation.android.l0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C28707v.m69514a(this.f58292b, dialogInterface, i11);
            }
        }).create();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69514a(C28707v c28707v, DialogInterface dialogInterface, int i11) {
        ((C28651g) c28707v.f58369f.getValue()).m69487a(C28647e.f58280a);
        c28707v.f58372i.invoke();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69515a(C28707v c28707v, Map map) {
        ((C28651g) c28707v.f58369f.getValue()).m69488a(c28707v.m69521a(c28707v.m69524t()), true);
    }

    /* JADX INFO: renamed from: a */
    public final Set m69521a(Set set) {
        boolean zM69362a;
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
}
