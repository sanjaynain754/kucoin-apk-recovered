package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C29035O;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32457z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66170a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66171b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32403L f66172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32457z(C32403L c32403l, Continuation continuation) {
        super(2, continuation);
        this.f66172c = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32457z c32457z = new C32457z(this.f66172c, continuation);
        c32457z.f66171b = obj;
        return c32457z;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32457z c32457z = new C32457z(this.f66172c, (Continuation) obj2);
        c32457z.f66171b = (C29980i) obj;
        return c32457z.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (r5.m71117a(r6, r7, r8, r9, r14) == r0) goto L46;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C29980i c29980i;
        Throwable th2;
        C29140j3 c29140j3Mo69761l;
        List listSortedWith;
        C28984B3 c28984b3;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66170a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                c29980i = (C29980i) this.f66171b;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        c29980i = (C29980i) this.f66171b;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d("SNSApplicantStatusViewModel", "Data repo updated", null);
        if (c29980i != null) {
            Throwable thMo70049a = c29980i.f60239a.mo70049a();
            if (thMo70049a == null && (thMo70049a = c29980i.f60240b.mo70049a()) == null) {
                thMo70049a = c29980i.f60242d.mo70049a();
            }
            th2 = thMo70049a;
        } else {
            th2 = null;
        }
        if (th2 != null) {
            if (this.f66172c.currentState() instanceof C32406O) {
                C32403L c32403l = this.f66172c;
                c33270a.f67810a.mo68956e("SNSApplicantStatusViewModel", "Error when getting data...", th2);
                AbstractC28052C.throwError$default(c32403l, th2, "TYPE_UNKNOWN", null, 4, null);
            }
            return Unit.INSTANCE;
        }
        if (c29980i == null) {
            return Unit.INSTANCE;
        }
        InterfaceC29984m interfaceC29984m = this.f66172c.f66045d;
        this.f66171b = c29980i;
        this.f66170a = 1;
        obj = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) obj).m70051c();
        if (abstractC29172p != null) {
            c29140j3Mo69761l = abstractC29172p.mo69761l();
        } else {
            c29140j3Mo69761l = null;
        }
        C32403L c32403l2 = this.f66172c;
        C29124h c29124h = (C29124h) c29980i.f60240b.m70051c();
        if (c29140j3Mo69761l != null && (list = c29140j3Mo69761l.f59118b) != null) {
            listSortedWith = CollectionsKt.sortedWith(list, new C29035O(abstractC29172p));
        } else {
            listSortedWith = null;
        }
        if (c29140j3Mo69761l != null) {
            c28984b3 = c29140j3Mo69761l.f59120d;
        } else {
            c28984b3 = null;
        }
        this.f66171b = null;
        this.f66170a = 2;
        KProperty[] kPropertyArr = C32403L.f66041o;
    }
}
