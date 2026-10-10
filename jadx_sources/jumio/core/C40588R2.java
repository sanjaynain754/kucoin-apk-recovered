package jumio.core;

import com.jumio.core.data.scan.ByteArrayData;
import com.jumio.core.data.scan.ByteArrayDataKt;
import com.jumio.core.data.scan.ByteArrayResult;
import com.jumio.core.data.scan.DataInterface;
import com.jumio.core.data.scan.ScanResult;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.R2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40588R2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ScanResult f90109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DataInterface f90110b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40588R2(ScanResult scanResult, DataInterface dataInterface, Continuation continuation) {
        super(2, continuation);
        this.f90109a = scanResult;
        this.f90110b = dataInterface;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40588R2(this.f90109a, this.f90110b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40588R2(this.f90109a, this.f90110b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ByteArrayResult byteArrayResult;
        ByteArrayData data;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ScanResult scanResult = this.f90109a;
        if (scanResult instanceof ByteArrayResult) {
            byteArrayResult = (ByteArrayResult) scanResult;
        } else {
            byteArrayResult = null;
        }
        if (byteArrayResult != null && (data = byteArrayResult.getData()) != null) {
            ByteArrayDataKt.copyFrom(data, (ByteArrayData) this.f90110b);
        }
        return Unit.INSTANCE;
    }
}
