package af0;

import okhttp3.RequestBody;

/* JADX INFO: renamed from: af0.b */
/* JADX INFO: compiled from: ProgressHelper.java */
/* JADX INFO: loaded from: classes60.dex */
public class C0302b {
    /* JADX INFO: renamed from: a */
    public static RequestBody m1050a(RequestBody requestBody, AbstractC0303c abstractC0303c) {
        if (requestBody == null) {
            throw new IllegalArgumentException("requestBody == null");
        }
        if (abstractC0303c != null) {
            return new C0305e(requestBody, abstractC0303c);
        }
        throw new IllegalArgumentException("progressListener == null");
    }
}
