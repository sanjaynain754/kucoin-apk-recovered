package com.sumsub.sns.internal.features.data.repository.sumsubid;

import com.sumsub.sns.internal.features.data.model.sumsubid.C29844B;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29848F;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29871l;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29872m;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29875p;
import com.sumsub.sns.internal.features.data.model.sumsubid.SNSSumsubIdCheckCodeResponse$Status;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30059h implements InterfaceC30056e {

    /* JADX INFO: renamed from: a */
    public final C30055d f60399a;

    /* JADX INFO: renamed from: b */
    public final C30053b f60400b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70083a(String str, ContinuationImpl continuationImpl) {
        C30058g c30058g;
        Object value;
        if (continuationImpl instanceof C30058g) {
            c30058g = (C30058g) continuationImpl;
            int i11 = c30058g.f60398d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30058g.f60398d = i11 - Integer.MIN_VALUE;
            } else {
                c30058g = new C30058g(this, continuationImpl);
            }
        } else {
            c30058g = new C30058g(this, continuationImpl);
        }
        Object objM70084a = c30058g.f60396b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30058g.f60398d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70084a);
            C30055d c30055d = this.f60399a;
            C29844B c29844b = new C29844B(str);
            c30058g.f60395a = str;
            c30058g.f60398d = 1;
            objM70084a = c30055d.f60391a.m70084a(c29844b, c30058g);
            if (objM70084a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM70084a = (C29848F) objM70084a;
            }
            if (objM70084a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30058g.f60395a;
            ResultKt.throwOnFailure(objM70084a);
        }
        String str2 = str;
        C29848F c29848f = (C29848F) objM70084a;
        InterfaceC41669n interfaceC41669n = this.f60400b.f60387a;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, C30052a.m70080a((C30052a) value, str2, false, false, null, 14)));
        return c29848f;
    }

    public C30059h(C30055d c30055d, C30053b c30053b) {
        this.f60399a = c30055d;
        this.f60400b = c30053b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70082a(String str, String str2, ContinuationImpl continuationImpl) {
        C30057f c30057f;
        Object value;
        C29871l c29871l;
        if (continuationImpl instanceof C30057f) {
            c30057f = (C30057f) continuationImpl;
            int i11 = c30057f.f60394c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30057f.f60394c = i11 - Integer.MIN_VALUE;
            } else {
                c30057f = new C30057f(this, continuationImpl);
            }
        } else {
            c30057f = new C30057f(this, continuationImpl);
        }
        Object objM70086a = c30057f.f60392a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30057f.f60394c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70086a);
            if (str != null && !StringsKt.isBlank(str)) {
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    C30055d c30055d = this.f60399a;
                    c30057f.f60394c = 1;
                    objM70086a = c30055d.f60391a.m70086a(new C29875p(str, str2), c30057f);
                    if (objM70086a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalStateException(("Invalid code, " + str2).toString());
                }
            } else {
                throw new IllegalStateException(("Invalid id, " + str).toString());
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70086a);
        }
        C29872m c29872m = (C29872m) objM70086a;
        boolean zAreEqual = Intrinsics.areEqual(c29872m != null ? c29872m.f59952a : null, SNSSumsubIdCheckCodeResponse$Status.VERIFIED.getStatus());
        C30053b c30053b = this.f60400b;
        String str3 = c29872m != null ? c29872m.f59954c : null;
        boolean zAreEqual2 = (c29872m == null || (c29871l = c29872m.f59955d) == null) ? false : Intrinsics.areEqual(c29871l.f59951b, Boxing.boxBoolean(true));
        InterfaceC41669n interfaceC41669n = c30053b.f60387a;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, C30052a.m70080a((C30052a) value, null, zAreEqual, zAreEqual2, str3, 1)));
        return c29872m;
    }
}
