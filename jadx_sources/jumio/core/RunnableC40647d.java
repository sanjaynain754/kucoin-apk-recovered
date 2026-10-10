package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.network.EncryptionProvider;
import java.net.HttpURLConnection;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.d */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40647d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f90239a;

    /* JADX INFO: renamed from: b */
    public final EncryptionProvider f90240b;

    public RunnableC40647d(HttpURLConnection httpURLConnection, EncryptionProvider encryptionProvider) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "httpURLConnection");
        Intrinsics.checkNotNullParameter(encryptionProvider, "encryptionProvider");
        this.f90239a = httpURLConnection;
        this.f90240b = encryptionProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f90239a.getResponseCode();
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        } finally {
            this.f90240b.finishRequest();
            this.f90239a.disconnect();
        }
    }
}
