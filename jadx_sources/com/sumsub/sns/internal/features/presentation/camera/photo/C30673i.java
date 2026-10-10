package com.sumsub.sns.internal.features.presentation.camera.photo;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.features.domain.C30270n;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30673i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61983a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30736v0 f61985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30673i(C30736v0 c30736v0, Continuation continuation) {
        super(2, continuation);
        this.f61985c = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30673i c30673i = new C30673i(this.f61985c, continuation);
        c30673i.f61984b = obj;
        return c30673i;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30673i c30673i = new C30673i(this.f61985c, (Continuation) obj2);
        c30673i.f61984b = (List) obj;
        return c30673i.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30877b c30877b;
        Object next;
        String str;
        String str2;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61983a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.f61984b;
            String str3 = this.f61985c.f62089b;
            if (str3 != null) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = it.next();
                    } else {
                        next2 = null;
                        break;
                    }
                } while (!Intrinsics.areEqual(((C30877b) next2).f62373a, str3));
                c30877b = (C30877b) next2;
            } else {
                c30877b = null;
            }
            C30736v0 c30736v0 = this.f61985c;
            Iterator it2 = list.iterator();
            do {
                if (it2.hasNext()) {
                    next = it2.next();
                    str = ((C30877b) next).f62373a;
                    C30270n c30270n = (C30270n) c30736v0.f62096i.getValue();
                    if (c30270n != null) {
                        str2 = c30270n.f60858e;
                    } else {
                        str2 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(str, str2));
            C30877b c30877b2 = (C30877b) next;
            C30877b c30877b3 = (C30877b) CollectionsKt.singleOrNull(list);
            if (c30877b == null) {
                if (c30877b2 == null) {
                    c30877b = c30877b3;
                } else {
                    c30877b = c30877b2;
                }
            }
            this.f61985c.f62099l.setValue(c30877b);
            if (c30877b != null) {
                CoroutineContext f53495b = ViewModelKt.getViewModelScope(this.f61985c).getF50326b();
                C30671h c30671h = new C30671h(c30877b, null);
                this.f61983a = 1;
                if (C41686h.m91049g(f53495b, c30671h, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
