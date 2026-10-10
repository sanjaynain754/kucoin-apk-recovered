package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29107e0;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31059O extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62792a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f62793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28075O f62794c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C31120v0 f62795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31059O(C28075O c28075o, C31120v0 c31120v0, Continuation continuation) {
        super(2, continuation);
        this.f62794c = c28075o;
        this.f62795d = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31059O c31059o = new C31059O(this.f62794c, this.f62795d, continuation);
        c31059o.f62793b = obj;
        return c31059o;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31059O) create((InterfaceC41635f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean zM69793g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62792a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.f62793b;
            C28075O c28075o = this.f62794c;
            AbstractC29172p abstractC29172p = c28075o.f57269a;
            if (abstractC29172p == null) {
                C31120v0 c31120v0 = this.f62795d;
                C31070a.m70567a("buildViewStateFlow: applicant null");
                AbstractC28052C.throwError$default(c31120v0, new C29107e0(new SNSGeneralException("Geo PoA error. Applicant null", null, null, 6, null), null, null, 6), c31120v0.f62921g.getType().f59014a, false, null, 12, null);
                return Unit.INSTANCE;
            }
            C29124h c29124h = c28075o.f57270b;
            if (c29124h == null) {
                C31120v0 c31120v1 = this.f62795d;
                C31070a.m70567a("buildViewStateFlow: config null");
                AbstractC28052C.throwError$default(c31120v1, new C29107e0(new SNSGeneralException("Geo PoA error. Config null", null, null, 6, null), null, null, 6), c31120v1.f62921g.getType().f59014a, false, null, 12, null);
                return Unit.INSTANCE;
            }
            Iterator it = abstractC29172p.mo69760k().f59151a.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!((C29154m) next).f59132a.m69748e());
            C29154m c29154m = (C29154m) next;
            C31120v0 c31120v2 = this.f62795d;
            if (c29154m != null) {
                zM69793g = c29154m.m69793g();
            } else {
                zM69793g = false;
            }
            c31120v2.f62933s = zM69793g;
            C31120v0 c31120v3 = this.f62795d;
            Map mapEmptyMap = c29124h.f59077j;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            c31120v3.f62936v = mapEmptyMap;
            C29983l c29983l = this.f62794c.f57271c;
            if (c29983l == null) {
                c29983l = new C29983l();
            }
            C31120v0 c31120v4 = this.f62795d;
            InterfaceC41634e interfaceC41634eM90930n0 = C41636g.m90930n0(c31120v4.f62934t, new C31058N(c29983l, c31120v4, null));
            this.f62792a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90930n0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
