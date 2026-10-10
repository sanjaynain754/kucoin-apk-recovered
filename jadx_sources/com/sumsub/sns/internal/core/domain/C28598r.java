package com.sumsub.sns.internal.core.domain;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28598r implements InterfaceC28584k {

    /* JADX INFO: renamed from: d */
    public static final Preferences.Key f58212d = PreferencesKeys.stringKey("auth_token");

    /* JADX INFO: renamed from: a */
    public final Context f58213a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41709m0 f58214b;

    /* JADX INFO: renamed from: c */
    public volatile String f58215c;

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: a */
    public final Object mo69410a() throws InterruptedException {
        Object objMo69412b = mo69412b();
        if (objMo69412b == null) {
            objMo69412b = C41690i.m91067b(null, new C28582j(this, null), 1, null);
        }
        return (String) objMo69412b;
    }

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: b */
    public final Object mo69412b() {
        return this.f58215c;
    }

    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    public final void put(Object obj) {
        String str = (String) obj;
        this.f58215c = str;
        C41696j.m91104d(this.f58214b, null, null, new C28596q(this, str, null), 3, null);
    }

    public C28598r(Context context, InterfaceC41709m0 interfaceC41709m0) {
        this.f58213a = context;
        this.f58214b = C41713n0.m91125a(interfaceC41709m0.getCoroutineContext().plus(C41782z0.m91392b()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.core.domain.InterfaceC28584k
    /* JADX INFO: renamed from: a */
    public final Object mo69411a(ContinuationImpl continuationImpl) {
        C28592o c28592o;
        if (continuationImpl instanceof C28592o) {
            c28592o = (C28592o) continuationImpl;
            int i11 = c28592o.f58204c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28592o.f58204c = i11 - Integer.MIN_VALUE;
            } else {
                c28592o = new C28592o(this, continuationImpl);
            }
        } else {
            c28592o = new C28592o(this, continuationImpl);
        }
        Object objM90882F = c28592o.f58202a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28592o.f58204c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90882F);
            String str = this.f58215c;
            if (str != null) {
                return str;
            }
            C28590n c28590n = new C28590n(((DataStore) AbstractC28580i.f58191b.getValue(this.f58213a, AbstractC28580i.f58190a[0])).getData());
            c28592o.f58204c = 1;
            objM90882F = C41636g.m90882F(c28590n, c28592o);
            if (objM90882F == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM90882F);
        }
        String str2 = (String) objM90882F;
        if (str2 != null) {
            this.f58215c = str2;
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }
}
