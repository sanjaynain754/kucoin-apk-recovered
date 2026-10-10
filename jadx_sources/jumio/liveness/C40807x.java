package jumio.liveness;

import com.jumio.core.extraction.ExtractionUpdateInterface;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.x */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40807x extends FunctionReferenceImpl implements Function1 {
    public C40807x(C40809z c40809z) {
        super(1, c40809z, C40809z.class, "publishUpdate", "publishUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ExtractionUpdateInterface<?> p11 = (ExtractionUpdateInterface) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        ((C40809z) this.receiver).publishUpdate(p11);
        return Unit.INSTANCE;
    }
}
