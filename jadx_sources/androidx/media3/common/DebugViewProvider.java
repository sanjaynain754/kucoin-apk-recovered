package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.e
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i11, int i12) {
            return DebugViewProvider.m2882a(i11, i12);
        }
    };

    /* JADX INFO: renamed from: a */
    static /* synthetic */ SurfaceView m2882a(int i11, int i12) {
        return null;
    }

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i11, int i12);
}
