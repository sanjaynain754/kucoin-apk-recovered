package jumio.core;

import android.os.Build;
import android.os.FileObserver;
import jumio.core.C40554K2;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.ProduceKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.K2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40554K2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f90025a;

    /* JADX INFO: renamed from: b */
    public int f90026b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f90027c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C40559L2 f90028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40554K2(C40559L2 c40559l2, Continuation continuation) {
        super(2, continuation);
        this.f90028d = c40559l2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40554K2 c40554k2 = new C40554K2(this.f90028d, continuation);
        c40554k2.f90027c = obj;
        return c40554k2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40554K2 c40554k2 = new C40554K2(this.f90028d, (Continuation) obj2);
        c40554k2.f90027c = (InterfaceC41574m) obj;
        return c40554k2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final FileObserver fileObserverC40549J2;
        InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.f90027c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90026b;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Build.VERSION.SDK_INT >= 29) {
                fileObserverC40549J2 = new FileObserverC40544I2(interfaceC41574m, this.f90028d, this.f90028d.f90039a);
            } else {
                fileObserverC40549J2 = new FileObserverC40549J2(interfaceC41574m, this.f90028d, this.f90028d.f90039a.getPath());
            }
            interfaceC41574m.mo90594e(Boxing.boxBoolean(false));
            fileObserverC40549J2.startWatching();
            Function0 function0 = new Function0() { // from class: lg0.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C40554K2.m89199a(fileObserverC40549J2);
                }
            };
            this.f90027c = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
            this.f90025a = SpillingKt.nullOutSpilledVariable(fileObserverC40549J2);
            this.f90026b = 1;
            if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m89199a(FileObserver fileObserver) {
        fileObserver.stopWatching();
        return Unit.INSTANCE;
    }
}
