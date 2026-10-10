package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class PathInterpolatorCompat {

    @RequiresApi(21)
    public static class Api21Impl {
        public static Interpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }

        public static Interpolator createPathInterpolator(float f11, float f12) {
            return new PathInterpolator(f11, f12);
        }

        private Api21Impl() {
        }

        public static Interpolator createPathInterpolator(float f11, float f12, float f13, float f14) {
            return new PathInterpolator(f11, f12, f13, f14);
        }
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return Api21Impl.createPathInterpolator(path);
    }

    @NonNull
    public static Interpolator create(float f11, float f12) {
        return Api21Impl.createPathInterpolator(f11, f12);
    }

    private PathInterpolatorCompat() {
    }

    @NonNull
    public static Interpolator create(float f11, float f12, float f13, float f14) {
        return Api21Impl.createPathInterpolator(f11, f12, f13, f14);
    }
}
