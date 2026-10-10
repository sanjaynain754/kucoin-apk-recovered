package jumio.core;

import com.jumio.core.api.calls.UploadCall;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.U3 */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40604U3 extends FunctionReferenceImpl implements Function3 {
    public C40604U3(UploadCall uploadCall) {
        super(3, uploadCall, UploadCall.class, "addPart", "addPart([Ljava/lang/String;Ljava/lang/Object;I)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object p11, Object obj2) {
        String[] p12 = (String[]) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(p12, "p0");
        Intrinsics.checkNotNullParameter(p11, "p1");
        ((UploadCall) this.receiver).addPart(p12, p11, iIntValue);
        return Unit.INSTANCE;
    }
}
