package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes23.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id */
    private final int f86744id;

    @NonNull
    private final Surface surface;

    public int getId() {
        return this.f86744id;
    }

    public Surface getSurface() {
        return this.surface;
    }

    public FlutterOverlaySurface(int i11, @NonNull Surface surface) {
        this.f86744id = i11;
        this.surface = surface;
    }
}
