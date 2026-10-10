package ba0;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackStatus;
import java.util.Iterator;
import java.util.List;
import w90.C45764c;

/* JADX INFO: renamed from: ba0.a */
/* JADX INFO: compiled from: DefaultAudioStrategy.java */
/* JADX INFO: loaded from: classes59.dex */
public class C4524a implements InterfaceC4528e {

    /* JADX INFO: renamed from: a */
    public c f3958a;

    /* JADX INFO: renamed from: ba0.a$b */
    /* JADX INFO: compiled from: DefaultAudioStrategy.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f3959a = -1;

        /* JADX INFO: renamed from: b */
        public int f3960b = -1;

        /* JADX INFO: renamed from: c */
        public long f3961c = Long.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        public String f3962d = "audio/mp4a-latm";

        @NonNull
        /* JADX INFO: renamed from: a */
        public C4524a m4369a() {
            return new C4524a(m4371c());
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public b m4370b(int i11) {
            this.f3959a = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public c m4371c() {
            c cVar = new c();
            cVar.f3963a = this.f3959a;
            cVar.f3964b = this.f3960b;
            cVar.f3966d = this.f3962d;
            cVar.f3965c = this.f3961c;
            return cVar;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m4372d(int i11) {
            this.f3960b = i11;
            return this;
        }
    }

    /* JADX INFO: renamed from: ba0.a$c */
    /* JADX INFO: compiled from: DefaultAudioStrategy.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public int f3963a;

        /* JADX INFO: renamed from: b */
        public int f3964b;

        /* JADX INFO: renamed from: c */
        public long f3965c;

        /* JADX INFO: renamed from: d */
        public String f3966d;

        public c() {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static b m4365b() {
        return new b();
    }

    @Override // ba0.InterfaceC4528e
    @NonNull
    /* JADX INFO: renamed from: a */
    public TrackStatus mo4366a(@NonNull List<MediaFormat> list, @NonNull MediaFormat mediaFormat) {
        long jM101049a;
        int iM4367c = this.f3958a.f3963a == -1 ? m4367c(list) : this.f3958a.f3963a;
        int iM4368d = this.f3958a.f3964b == -1 ? m4368d(list) : this.f3958a.f3964b;
        if (list.size() == 1 && this.f3958a.f3963a == -1 && this.f3958a.f3964b == -1 && this.f3958a.f3965c == Long.MIN_VALUE && list.get(0).containsKey("bitrate")) {
            jM101049a = list.get(0).getInteger("bitrate");
        } else {
            jM101049a = this.f3958a.f3965c == Long.MIN_VALUE ? C45764c.m101049a(iM4367c, iM4368d) : this.f3958a.f3965c;
        }
        mediaFormat.setString("mime", this.f3958a.f3966d);
        mediaFormat.setInteger("sample-rate", iM4368d);
        mediaFormat.setInteger("channel-count", iM4367c);
        mediaFormat.setInteger("bitrate", (int) jM101049a);
        if ("audio/mp4a-latm".equalsIgnoreCase(this.f3958a.f3966d)) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        return TrackStatus.COMPRESSING;
    }

    public C4524a(@NonNull c cVar) {
        this.f3958a = cVar;
    }

    /* JADX INFO: renamed from: c */
    public final int m4367c(@NonNull List<MediaFormat> list) {
        Iterator<MediaFormat> it = list.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getInteger("channel-count"));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: d */
    public final int m4368d(@NonNull List<MediaFormat> list) {
        Iterator<MediaFormat> it = list.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it.hasNext()) {
            iMin = Math.min(iMin, it.next().getInteger("sample-rate"));
        }
        return iMin;
    }
}
