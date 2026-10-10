package jumio.p381df;

import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.df.e */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40766e extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p11 = (String) obj;
        Intrinsics.checkNotNullParameter(p11, "p0");
        DocFinderClient.access$skipImage((DocFinderClient) this.receiver, p11);
        return Unit.INSTANCE;
    }

    public C40766e(Object obj) {
        super(1, obj, DocFinderClient.class, "skipImage", "skipImage(Ljava/lang/String;)V", 0);
    }
}
