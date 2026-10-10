package jumio.core;

import com.jumio.core.extraction.manual.ManualPictureClient;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.r2 */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40720r2 extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p11 = (String) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        ManualPictureClient.access$skipImage((ManualPictureClient) this.receiver, p11);
        return Unit.INSTANCE;
    }

    public C40720r2(Object obj) {
        super(1, obj, ManualPictureClient.class, "skipImage", "skipImage(Ljava/lang/String;)V", 0);
    }
}
