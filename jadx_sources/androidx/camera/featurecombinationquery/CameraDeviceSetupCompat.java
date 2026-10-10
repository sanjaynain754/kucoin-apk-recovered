package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
public interface CameraDeviceSetupCompat {

    public static final class SupportQueryResult {
        public static final int RESULT_SUPPORTED = 1;
        public static final int RESULT_UNDEFINED = 0;
        public static final int RESULT_UNSUPPORTED = 2;
        public static final int SOURCE_ANDROID_FRAMEWORK = 2;
        public static final int SOURCE_PLAY_SERVICES = 1;
        public static final int SOURCE_UNDEFINED = 0;
        private final int mSource;
        private final int mSupported;
        private final long mTimestampMillis;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface Supported {
        }

        public int getSource() {
            return this.mSource;
        }

        public int getSupported() {
            return this.mSupported;
        }

        public long getTimestampMillis() {
            return this.mTimestampMillis;
        }

        public SupportQueryResult(int i11, int i12, long j11) {
            this.mSupported = i11;
            this.mSource = i12;
            this.mTimestampMillis = j11;
        }
    }

    SupportQueryResult isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) throws CameraAccessException;

    SupportQueryResult isSessionConfigurationSupportedLegacy(SessionConfigurationLegacy sessionConfigurationLegacy);
}
