package com.google.android.play.core.integrity;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public interface StandardIntegrityManager {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class PrepareIntegrityTokenRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j11);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo13211a();

        /* JADX INFO: renamed from: b */
        public abstract long mo13212b();

        public static Builder builder() {
            C7774c c7774c = new C7774c();
            c7774c.m13260a(0);
            return c7774c;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class StandardIntegrityToken {
        public abstract Task<Integer> showDialog(Activity activity, int i11);

        public abstract String token();
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
    public static abstract class StandardIntegrityTokenRequest {

        /* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(@Nullable String str);
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public abstract String mo13213a();

        public static Builder builder() {
            return new C7778f();
        }
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
