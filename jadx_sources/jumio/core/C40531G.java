package jumio.core;

import com.jumio.core.cdn.CDNCache;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.G */
/* JADX INFO: loaded from: classes61.dex */
public final class C40531G extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40541I f89967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40551K f89968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40531G(C40541I c40541i, C40551K c40551k, Continuation continuation) {
        super(2, continuation);
        this.f89967a = c40541i;
        this.f89968b = c40551k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40531G(this.f89967a, this.f89968b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40531G(this.f89967a, this.f89968b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(CDNCache.loadSync$default(this.f89967a.f90005a, this.f89968b, 0, 2, null));
    }
}
