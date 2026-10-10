package com.sumsub.sns.internal.core.presentation.android;

import androidx.activity.result.ActivityResultLauncher;
import com.sumsub.sns.internal.core.analytics.C28367f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28706u extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        InterfaceC28649f interfaceC28649f = (InterfaceC28649f) obj;
        C28707v c28707v = (C28707v) this.receiver;
        c28707v.getClass();
        C28643c c28643c = interfaceC28649f instanceof C28643c ? (C28643c) interfaceC28649f : null;
        if (c28643c != null) {
            Set setM69521a = c28707v.m69521a(c28643c.f58276a);
            boolean zIsEmpty = setM69521a.isEmpty();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setM69521a) {
                if (obj2 instanceof AbstractC28636K) {
                    arrayList.add(obj2);
                }
            }
            boolean zIsEmpty2 = CollectionsKt.toSet(arrayList).isEmpty();
            if (c28643c.f58278c) {
                C28367f.m69260a(c28707v.f58549a.getAnalyticsDelegate(), MapsKt.mapOf(TuplesKt.m90091to("hasAllPermissions", Boolean.valueOf(zIsEmpty))));
            }
            if (zIsEmpty || ((z11 = c28643c.f58277b) && zIsEmpty2)) {
                ((C28651g) c28707v.f58369f.getValue()).m69487a(C28647e.f58280a);
                c28707v.f58371h.invoke();
            } else if (z11) {
                c28707v.mo69598p();
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = setM69521a.iterator();
                while (it.hasNext()) {
                    String str = ((AbstractC28637L) it.next()).f58266b;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
                if (arrayList3 != null) {
                    ActivityResultLauncher activityResultLauncher = c28707v.f58375l;
                    if (activityResultLauncher != null) {
                        activityResultLauncher.launch(arrayList3.toArray(new String[0]));
                    }
                } else {
                    ((C28651g) c28707v.f58369f.getValue()).m69488a(c28707v.m69521a(c28707v.m69524t()), true);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public C28706u(C28707v c28707v) {
        super(1, c28707v, C28707v.class, "onState", "onState(Lcom/sumsub/sns/internal/core/presentation/android/PermissionController$State;)V", 0);
    }
}
