package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class SessionParametersLegacy {
    private final Map<CaptureRequest.Key<?>, Object> mKeyVal;

    public static final class Builder {
        private final HashMap<CaptureRequest.Key<?>, Object> mKeyVal = new HashMap<>();

        public SessionParametersLegacy build() {
            return new SessionParametersLegacy(C1243d.m2098a(this.mKeyVal));
        }

        public <T> Builder set(CaptureRequest.Key<T> key, T t11) {
            this.mKeyVal.put(key, t11);
            return this;
        }
    }

    private SessionParametersLegacy(Map<CaptureRequest.Key<?>, Object> map) {
        this.mKeyVal = map;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<CaptureRequest.Key<?>, Object> asMap() {
        return Collections.unmodifiableMap(this.mKeyVal);
    }

    public <T> T get(CaptureRequest.Key<T> key) {
        return (T) this.mKeyVal.get(key);
    }

    public Set<CaptureRequest.Key<?>> getKeys() {
        return C1242c.m2097a(this.mKeyVal.keySet());
    }
}
