package androidx.camera.video.internal.compat;

import android.media.MediaMuxer;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(26)
public final class Api26Impl {
    public static MediaMuxer createMediaMuxer(FileDescriptor fileDescriptor, int i11) throws IOException {
        return new MediaMuxer(fileDescriptor, i11);
    }

    private Api26Impl() {
    }
}
