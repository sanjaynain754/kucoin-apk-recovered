package com.sumsub.sns.internal.core.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28622g extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58243a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f58244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28624i f58245c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Thread f58246d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Throwable f58247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28622g(C28624i c28624i, Thread thread, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f58245c = c28624i;
        this.f58246d = thread;
        this.f58247e = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28622g c28622g = new C28622g(this.f58245c, this.f58246d, this.f58247e, continuation);
        c28622g.f58244b = obj;
        return c28622g;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28622g) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[LOOP:0: B:20:0x0063->B:22:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r4 == r0) goto L25;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        String str;
        Object objInvokeSuspend;
        InterfaceC41709m0 interfaceC41709m1;
        Thread thread;
        Throwable th2;
        ArrayList arrayList;
        Iterator it;
        Object objM90345a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58243a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41709m0 = (InterfaceC41709m0) this.f58244b;
            ResultKt.throwOnFailure(obj);
            objInvokeSuspend = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC41709m0 = (InterfaceC41709m0) this.f58244b;
            C28617b c28617b = this.f58245c.f58254c;
            if (c28617b != null) {
                this.f58244b = interfaceC41709m0;
                this.f58243a = 1;
                objInvokeSuspend = new C28617b(c28617b.f58232b, this).invokeSuspend(Unit.INSTANCE);
            } else {
                str = null;
                interfaceC41709m1 = interfaceC41709m0;
                List list = this.f58245c.f58253b;
                thread = this.f58246d;
                th2 = this.f58247e;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C41696j.m91102b(interfaceC41709m1, null, null, new C28621f((InterfaceC28620e) it.next(), thread, th2, str, null), 3, null));
                    str = str;
                    thread = thread;
                    th2 = th2;
                }
                this.f58244b = null;
                this.f58243a = 2;
                objM90345a = AwaitKt.m90345a(arrayList, this);
                if (objM90345a != coroutine_suspended) {
                    return objM90345a;
                }
            }
            return coroutine_suspended;
        }
        str = (String) objInvokeSuspend;
        interfaceC41709m1 = interfaceC41709m0;
        List list2 = this.f58245c.f58253b;
        thread = this.f58246d;
        th2 = this.f58247e;
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C41696j.m91102b(interfaceC41709m1, null, null, new C28621f((InterfaceC28620e) it.next(), thread, th2, str, null), 3, null));
            str = str;
            thread = thread;
            th2 = th2;
        }
        this.f58244b = null;
        this.f58243a = 2;
        objM90345a = AwaitKt.m90345a(arrayList, this);
        if (objM90345a != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90345a;
    }
}
