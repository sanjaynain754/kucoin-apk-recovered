package z90;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.sink.InvalidOutputFormatException;
import w90.C45762a;
import w90.C45763b;
import w90.C45770i;

/* JADX INFO: renamed from: z90.c */
/* JADX INFO: compiled from: DefaultDataSinkChecks.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46737c {

    /* JADX INFO: renamed from: a */
    public static final C45770i f104560a = new C45770i("DefaultDataSinkChecks");

    /* JADX INFO: renamed from: b */
    public void m102989b(@NonNull TrackType trackType, @NonNull MediaFormat mediaFormat) {
        if (trackType == TrackType.VIDEO) {
            m102990c(mediaFormat);
        } else if (trackType == TrackType.AUDIO) {
            m102988a(mediaFormat);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m102988a(@NonNull MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if ("audio/mp4a-latm".equals(string)) {
            return;
        }
        throw new InvalidOutputFormatException("Audio codecs other than AAC is not supported, actual mime type: " + string);
    }

    /* JADX INFO: renamed from: c */
    public final void m102990c(@NonNull MediaFormat mediaFormat) {
        String string = mediaFormat.getString("mime");
        if ("video/avc".equals(string)) {
            byte bM101047a = C45763b.m101047a(C45762a.m101045a(mediaFormat));
            String strM101048b = C45763b.m101048b(bM101047a);
            if (bM101047a == 66) {
                f104560a.m101066c("Output H.264 profile: " + strM101048b);
                return;
            }
            f104560a.m101072j("Output H.264 profile: " + strM101048b + ". This might not be supported.");
            return;
        }
        throw new InvalidOutputFormatException("Video codecs other than AVC is not supported, actual mime type: " + string);
    }
}
