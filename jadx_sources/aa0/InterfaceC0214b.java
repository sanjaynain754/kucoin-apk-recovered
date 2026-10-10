package aa0;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.transcoder.common.TrackType;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: aa0.b */
/* JADX INFO: compiled from: DataSource.java */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC0214b {

    /* JADX INFO: renamed from: aa0.b$a */
    /* JADX INFO: compiled from: DataSource.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f630a;

        /* JADX INFO: renamed from: b */
        public boolean f631b;

        /* JADX INFO: renamed from: c */
        public long f632c;

        /* JADX INFO: renamed from: d */
        public boolean f633d;
    }

    /* JADX INFO: renamed from: a */
    boolean mo788a(@NonNull TrackType trackType);

    /* JADX INFO: renamed from: b */
    boolean mo789b();

    /* JADX INFO: renamed from: c */
    void mo790c(@NonNull TrackType trackType);

    @Nullable
    /* JADX INFO: renamed from: d */
    MediaFormat mo791d(@NonNull TrackType trackType);

    /* JADX INFO: renamed from: e */
    void mo792e(@NonNull TrackType trackType);

    /* JADX INFO: renamed from: f */
    void mo793f(@NonNull a aVar);

    /* JADX INFO: renamed from: g */
    void mo794g();

    long getDurationUs();

    @Nullable
    double[] getLocation();

    int getOrientation();

    long getPositionUs();

    void initialize();

    boolean isInitialized();

    long seekTo(long j11);
}
