package com.sumsub.sns.internal.log.cacher.strategy;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.cacher.C33281i;
import com.sumsub.sns.internal.log.cacher.C33282j;
import kotlinx.coroutines.C41685g2;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.cacher.strategy.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33291f implements InterfaceC33292g {

    /* JADX INFO: renamed from: a */
    public static final C33291f f67870a = new C33291f();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C33291f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r11, r12, r0) == r1) goto L26;
     */
    @Override // com.sumsub.sns.internal.log.cacher.strategy.InterfaceC33292g
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo71622a(String str, C33281i c33281i, C33282j c33282j, ContinuationImpl continuationImpl) {
        C33289d c33289d;
        if (continuationImpl instanceof C33289d) {
            c33289d = (C33289d) continuationImpl;
            int i11 = c33289d.f67867e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33289d.f67867e = i11 - Integer.MIN_VALUE;
            } else {
                c33289d = new C33289d(this, continuationImpl);
            }
        } else {
            c33289d = new C33289d(this, continuationImpl);
        }
        Object objInvoke = c33289d.f67865c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33289d.f67867e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            c33289d.f67863a = str;
            c33289d.f67864b = c33282j;
            c33289d.f67867e = 1;
            objInvoke = c33281i.invoke(c33289d);
            if (objInvoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            c33282j = c33289d.f67864b;
            str = c33289d.f67863a;
            ResultKt.throwOnFailure(objInvoke);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        return Unit.INSTANCE;
        String str2 = str;
        if (((Boolean) objInvoke).booleanValue()) {
            return Unit.INSTANCE;
        }
        Logger.DefaultImpls.i$default(C33272c.f67812a, str2, "Send failed, caching value ...", null, 4, null);
        C41685g2 c41685g2 = C41685g2.f91735b;
        C33290e c33290e = new C33290e(c33282j, null);
        c33289d.f67863a = null;
        c33289d.f67864b = null;
        c33289d.f67867e = 2;
    }

    public final String toString() {
        return "SendThenCacheSinkStrategy";
    }

    public final int hashCode() {
        return 1569159437;
    }
}
