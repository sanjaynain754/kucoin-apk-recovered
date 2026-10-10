package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import java.util.Iterator;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30803B extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30808G f62230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f62231b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30803B(AbstractC30808G abstractC30808G, int i11, Continuation continuation) {
        super(2, continuation);
        this.f62230a = abstractC30808G;
        this.f62231b = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30803B(this.f62230a, this.f62231b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30803B(this.f62230a, this.f62231b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30316a.m70183b(this.f62230a.f62237b, "SNSImageDocumentsAwareViewModel", "showImageSourcePicker");
        if (this.f62230a.f62236a.m71250c().isEmpty()) {
            this.f62230a.fireEvent(new C30833l(this.f62231b));
        } else {
            List listM71250c = this.f62230a.f62236a.m71250c();
            if (listM71250c == null || !listM71250c.isEmpty()) {
                Iterator it = listM71250c.iterator();
                while (it.hasNext()) {
                    if (((C29054T) it.next()).f59002i) {
                        this.f62230a.fireEvent(C30840q.f62286a);
                    }
                }
                this.f62230a.mo70469b(false);
            } else {
                this.f62230a.mo70469b(false);
            }
        }
        return Unit.INSTANCE;
    }
}
