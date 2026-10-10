package com.sumsub.sns.internal.core.presentation.screen.base;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28949f;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31276a;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31277b;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31278c;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.main.instructions.InterfaceC31279d;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.screen.base.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28922f {
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public static final Object m69687a(C31283h c31283h, C28075O c28075o, C29697t2 c29697t2, ContinuationImpl continuationImpl) {
        C28921e c28921e;
        C29697t2 c29697t3;
        if (continuationImpl instanceof C28921e) {
            c28921e = (C28921e) continuationImpl;
            int i11 = c28921e.f58809c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28921e.f58809c = i11 - Integer.MIN_VALUE;
            } else {
                c28921e = new C28921e(continuationImpl);
            }
        } else {
            c28921e = new C28921e(continuationImpl);
        }
        C28921e c28921e2 = c28921e;
        Object objM70670a = c28921e2.f58808b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28921e2.f58809c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70670a);
            C29983l c29983l = c28075o.f57271c;
            if (c29983l == null) {
                C29107e0 c29107e0 = new C29107e0(new SNSGeneralException("Strings unavailable for instructions: " + c29697t2, null, null, 6, null), null, null, 6);
                String str = c29697t2.f59744c;
                if (str == null) {
                    str = "TYPE_UNKNOWN";
                }
                return new C28923g(c29107e0, str);
            }
            c28921e2.f58807a = c29697t2;
            c28921e2.f58809c = 1;
            objM70670a = c31283h.m70670a(c29983l, c29697t2, null, null, c28921e2);
            if (objM70670a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c29697t3 = c29697t2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29697t3 = c28921e2.f58807a;
            ResultKt.throwOnFailure(objM70670a);
        }
        InterfaceC31279d interfaceC31279d = (InterfaceC31279d) objM70670a;
        if (Intrinsics.areEqual(interfaceC31279d, C31278c.f63373a)) {
            return C28924h.f58812a;
        }
        if (interfaceC31279d instanceof C31276a) {
            C31276a c31276a = (C31276a) interfaceC31279d;
            return new C28923g(c31276a.f63370a, c31276a.f63371b);
        }
        if (interfaceC31279d instanceof C31277b) {
            return new C28925i(new C28949f(c29697t3.f59742a, c29697t3.f59743b, c29697t3.f59744c, c29697t3.f59746e));
        }
        throw new NoWhenBranchMatchedException();
    }
}
