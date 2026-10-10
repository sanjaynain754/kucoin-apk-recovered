package jumio.core;

import com.jumio.core.network.DownloadTask;
import java.io.File;
import java.io.InputStream;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.o1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40704o1 extends DownloadTask {

    /* JADX INFO: renamed from: e */
    public final File f90342e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C40704o1(String url, File output, int i11) {
        AbstractC41586e2 callbackDispatcher = C41782z0.m91393c();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(callbackDispatcher, "callbackDispatcher");
        super(url, i11, callbackDispatcher);
        this.f90342e = output;
    }

    @Override // com.jumio.core.network.DownloadTask
    public final Object processInputStream(InputStream inputStream, int i11, Continuation continuation) {
        return C41686h.m91049g(C41782z0.m91392b(), new C40699n1(inputStream, this, null), continuation);
    }
}
