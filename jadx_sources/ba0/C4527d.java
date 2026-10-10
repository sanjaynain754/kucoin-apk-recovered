package ba0;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackStatus;
import java.util.List;

/* JADX INFO: renamed from: ba0.d */
/* JADX INFO: compiled from: RemoveTrackStrategy.java */
/* JADX INFO: loaded from: classes59.dex */
public class C4527d implements InterfaceC4528e {
    @Override // ba0.InterfaceC4528e
    @NonNull
    /* JADX INFO: renamed from: a */
    public TrackStatus mo4366a(@NonNull List<MediaFormat> list, @NonNull MediaFormat mediaFormat) {
        return TrackStatus.REMOVING;
    }
}
