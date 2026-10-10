package jumio.core;

import com.jumio.core.cdn.CDNDownloadListener;
import com.jumio.core.network.AbstractC9308b;

/* JADX INFO: renamed from: jumio.core.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C40521E extends AbstractC9308b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40541I f89952a;

    public C40521E(C40541I c40541i) {
        this.f89952a = c40541i;
    }

    @Override // com.jumio.core.network.DownloadTask.ProgressListener
    public final boolean isRateLimitExceeded() {
        CDNDownloadListener f13739d = this.f89952a.f90005a.getF13739d();
        if (f13739d != null) {
            return f13739d.isRateLimitExceeded();
        }
        return false;
    }
}
