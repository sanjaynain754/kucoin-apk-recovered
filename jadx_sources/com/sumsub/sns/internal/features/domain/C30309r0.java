package com.sumsub.sns.internal.features.domain;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.documents.C30124S;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30309r0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60927a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30227m0 f60929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30311s0 f60930d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f60931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30309r0(C30227m0 c30227m0, C30311s0 c30311s0, String str, Continuation continuation) {
        super(2, continuation);
        this.f60929c = c30227m0;
        this.f60930d = c30311s0;
        this.f60931e = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30309r0 c30309r0 = new C30309r0(this.f60929c, this.f60930d, this.f60931e, continuation);
        c30309r0.f60928b = obj;
        return c30309r0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30309r0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60927a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f60928b;
        List list = this.f60929c.f60759d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((C29054T) obj2).f58999f) {
                arrayList.add(obj2);
            }
        }
        C30311s0 c30311s0 = this.f60930d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj3 = arrayList.get(i12);
            i12++;
            C29054T c29054t = (C29054T) obj3;
            InterfaceC30271n0 interfaceC30271n0 = c30311s0.f60936d;
            if (interfaceC30271n0 != null) {
                interfaceC30271n0.mo70170a(c29054t, new C30124S(0), 0);
            }
        }
        List list2 = this.f60929c.f60759d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list2) {
            if (!((C29054T) obj4).f58999f) {
                arrayList2.add(obj4);
            }
        }
        C30311s0 c30311s1 = this.f60930d;
        String str = this.f60931e;
        C30227m0 c30227m0 = this.f60929c;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList3.add(C41696j.m91102b(interfaceC41709m0, C41782z0.m91392b(), null, new C30307q0(c30311s1, str, (C29054T) arrayList2.get(i13), c30227m0, null), 2, null));
            size2 = size2;
        }
        this.f60927a = 1;
        Object objM90345a = AwaitKt.m90345a(arrayList3, this);
        return objM90345a == coroutine_suspended ? coroutine_suspended : objM90345a;
    }
}
