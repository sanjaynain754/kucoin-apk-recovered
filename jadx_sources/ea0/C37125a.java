package ea0;

import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackStatus;

/* JADX INFO: renamed from: ea0.a */
/* JADX INFO: compiled from: DefaultValidator.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37125a implements InterfaceC37126b {
    @Override // ea0.InterfaceC37126b
    /* JADX INFO: renamed from: a */
    public boolean mo83041a(@NonNull TrackStatus trackStatus, @NonNull TrackStatus trackStatus2) {
        TrackStatus trackStatus3;
        TrackStatus trackStatus4 = TrackStatus.COMPRESSING;
        return trackStatus == trackStatus4 || trackStatus2 == trackStatus4 || trackStatus == (trackStatus3 = TrackStatus.REMOVING) || trackStatus2 == trackStatus3;
    }
}
