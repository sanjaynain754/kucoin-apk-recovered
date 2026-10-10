package jumio.core;

import com.jumio.commons.log.Log;
import java.io.FileOutputStream;
import java.io.InputStream;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.p407io.ByteStreamsKt;

/* JADX INFO: renamed from: jumio.core.n1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40699n1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputStream f90336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40704o1 f90337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40699n1(InputStream inputStream, C40704o1 c40704o1, Continuation continuation) {
        super(2, continuation);
        this.f90336a = inputStream;
        this.f90337b = c40704o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40699n1(this.f90336a, this.f90337b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40699n1(this.f90336a, this.f90337b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        boolean z11 = false;
        try {
            ByteStreamsKt.copyTo$default(this.f90336a, new FileOutputStream(this.f90337b.f90342e), 0, 2, null);
            z11 = true;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        return Boxing.boxBoolean(z11);
    }
}
