package com.sumsub.sns.internal.core.presentation.nfc;

import android.nfc.tech.IsoDep;
import com.google.firebase.messaging.Constants;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.PrimaryAction;
import com.sumsub.sns.internal.core.analytics.PrimaryActionState;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.domain.mrtd.AbstractC30268y;
import com.sumsub.sns.internal.features.domain.mrtd.C30262s;
import com.sumsub.sns.internal.features.domain.mrtd.C30264u;
import com.sumsub.sns.internal.features.domain.mrtd.C30266w;
import com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30263t;
import com.sumsub.sns.internal.features.domain.mrtd.InterfaceC30265v;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28904i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28907l f58768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IsoDep f58769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28904i(C28907l c28907l, IsoDep isoDep, Continuation continuation) {
        super(2, continuation);
        this.f58768b = c28907l;
        this.f58769c = isoDep;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69677a(C28907l c28907l, int i11) {
        KProperty[] kPropertyArr = C28907l.f58773m;
        C28936t c28936t = c28907l.f58782i;
        KProperty kProperty = C28907l.f58773m[3];
        c28936t.f58834a.set(c28936t.f58835b, Integer.valueOf(i11));
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28904i(this.f58768b, this.f58769c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28904i(this.f58768b, this.f58769c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NfcReadController$ReadingStep nfcReadController$ReadingStep;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58767a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final C28907l c28907l = this.f58768b;
            AbstractC30268y abstractC30268y = c28907l.f58775b;
            IsoDep isoDep = this.f58769c;
            Function1 function1 = new Function1() { // from class: com.sumsub.sns.internal.core.presentation.nfc.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C28904i.m69677a(c28907l, ((Integer) obj2).intValue());
                }
            };
            this.f58767a = 1;
            obj = abstractC30268y.mo70164a(isoDep, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC30265v interfaceC30265v = (InterfaceC30265v) obj;
        Pair pairM90091to = null;
        if (Intrinsics.areEqual(interfaceC30265v, C30266w.f60849a)) {
            C28907l c28907l2 = this.f58768b;
            KProperty[] kPropertyArr = C28907l.f58773m;
            C28368g c28368gM69264a = new C28368g().m69264a(PrimaryAction.NfcScan);
            c28368gM69264a.f57846b.add(PrimaryActionState.Completed);
            Pair pairM90091to2 = TuplesKt.m90091to("numberOfAttempts", Integer.valueOf(c28907l2.m69678a()));
            Pair pairM90091to3 = TuplesKt.m90091to("reader", c28907l2.f58777d);
            String str = c28907l2.f58778e;
            if (str != null) {
                pairM90091to = TuplesKt.m90091to("sessionId", str);
            }
            c28368gM69264a.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{pairM90091to2, pairM90091to3, pairM90091to}));
            c28368gM69264a.m69267a(false);
            NfcReadController$ReadingStep nfcReadController$ReadingStep2 = NfcReadController$ReadingStep.SUCCESS;
            C28936t c28936t = c28907l2.f58783j;
            KProperty kProperty = C28907l.f58773m[4];
            c28936t.f58834a.set(c28936t.f58835b, nfcReadController$ReadingStep2);
        } else if (interfaceC30265v instanceof InterfaceC30263t) {
            C28907l c28907l3 = this.f58768b;
            InterfaceC30263t interfaceC30263t = (InterfaceC30263t) interfaceC30265v;
            KProperty[] kPropertyArr2 = C28907l.f58773m;
            String strMo70169a = interfaceC30263t.mo70169a();
            C28368g c28368gM69264a2 = new C28368g().m69264a(PrimaryAction.NfcScan);
            c28368gM69264a2.f57846b.add(PrimaryActionState.Failed);
            Pair pairM90091to4 = TuplesKt.m90091to("attempt", Integer.valueOf(c28907l3.m69678a()));
            Pair pairM90091to5 = TuplesKt.m90091to(Constants.IPC_BUNDLE_KEY_SEND_ERROR, strMo70169a);
            Pair pairM90091to6 = TuplesKt.m90091to("reader", c28907l3.f58777d);
            String str2 = c28907l3.f58778e;
            if (str2 != null) {
                pairM90091to = TuplesKt.m90091to("sessionId", str2);
            }
            c28368gM69264a2.f57847c = MapsKt.toMap(ArraysKt.filterNotNull(new Pair[]{pairM90091to4, pairM90091to5, pairM90091to6, pairM90091to}));
            c28368gM69264a2.m69267a(false);
            C28936t c28936t2 = c28907l3.f58780g;
            KProperty[] kPropertyArr3 = C28907l.f58773m;
            KProperty kProperty2 = kPropertyArr3[1];
            c28936t2.f58834a.set(c28936t2.f58835b, Boolean.TRUE);
            C28936t c28936t3 = c28907l3.f58781h;
            KProperty kProperty3 = kPropertyArr3[2];
            c28936t3.f58834a.set(c28936t3.f58835b, Boolean.valueOf(interfaceC30263t instanceof C30262s));
            if (interfaceC30263t instanceof C30264u) {
                Throwable th2 = ((C30264u) interfaceC30263t).f60847a;
                if (th2 instanceof SNSException) {
                    c28907l3.f58776c.invoke(th2);
                    nfcReadController$ReadingStep = NfcReadController$ReadingStep.IDLE;
                } else {
                    nfcReadController$ReadingStep = NfcReadController$ReadingStep.ERROR;
                }
            } else {
                nfcReadController$ReadingStep = NfcReadController$ReadingStep.ERROR;
            }
            C28936t c28936t4 = c28907l3.f58783j;
            KProperty kProperty4 = kPropertyArr3[4];
            c28936t4.f58834a.set(c28936t4.f58835b, nfcReadController$ReadingStep);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
