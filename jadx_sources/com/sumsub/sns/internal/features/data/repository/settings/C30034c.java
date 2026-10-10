package com.sumsub.sns.internal.features.data.repository.settings;

import android.content.SharedPreferences;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.settings.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30034c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28584k f60332a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f60333b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70074a(ContinuationImpl continuationImpl) {
        C30032a c30032a;
        C29118g c29118g;
        if (continuationImpl instanceof C30032a) {
            c30032a = (C30032a) continuationImpl;
            int i11 = c30032a.f60328c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30032a.f60328c = i11 - Integer.MIN_VALUE;
            } else {
                c30032a = new C30032a(this, continuationImpl);
            }
        } else {
            c30032a = new C30032a(this, continuationImpl);
        }
        Object objMo69411a = c30032a.f60326a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30032a.f60328c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo69411a);
            InterfaceC28584k interfaceC28584k = this.f60332a;
            c30032a.f60328c = 1;
            objMo69411a = interfaceC28584k.mo69411a(c30032a);
            if (objMo69411a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo69411a);
        }
        C29124h c29124h = (C29124h) objMo69411a;
        return (c29124h == null || (c29118g = c29124h.f59091x) == null) ? "" : c29118g.f59062a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m70075b(ContinuationImpl continuationImpl) {
        C30033b c30033b;
        String str;
        if (continuationImpl instanceof C30033b) {
            c30033b = (C30033b) continuationImpl;
            int i11 = c30033b.f60331c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30033b.f60331c = i11 - Integer.MIN_VALUE;
            } else {
                c30033b = new C30033b(this, continuationImpl);
            }
        } else {
            c30033b = new C30033b(this, continuationImpl);
        }
        Object objMo69411a = c30033b.f60329a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30033b.f60331c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo69411a);
            InterfaceC28584k interfaceC28584k = this.f60332a;
            c30033b.f60331c = 1;
            objMo69411a = interfaceC28584k.mo69411a(c30033b);
            if (objMo69411a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo69411a);
        }
        C29124h c29124h = (C29124h) objMo69411a;
        return (c29124h == null || (str = c29124h.f59068a) == null) ? "" : str;
    }

    public C30034c(InterfaceC28584k interfaceC28584k, SharedPreferences sharedPreferences) {
        this.f60332a = interfaceC28584k;
        this.f60333b = sharedPreferences;
    }
}
