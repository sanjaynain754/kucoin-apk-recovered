package ba0;

import android.media.MediaFormat;
import android.os.Build;
import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.util.Iterator;
import java.util.List;
import r90.C43958a;
import r90.C43959b;
import w90.C45764c;
import w90.C45770i;
import y90.C46415a;
import y90.C46416b;
import y90.C46417c;
import y90.InterfaceC46418d;

/* JADX INFO: renamed from: ba0.c */
/* JADX INFO: compiled from: DefaultVideoStrategy.java */
/* JADX INFO: loaded from: classes59.dex */
public class C4526c implements InterfaceC4528e {

    /* JADX INFO: renamed from: b */
    public static final C45770i f3967b = new C45770i("DefaultVideoStrategy");

    /* JADX INFO: renamed from: a */
    public final c f3968a;

    /* JADX INFO: renamed from: ba0.c$b */
    /* JADX INFO: compiled from: DefaultVideoStrategy.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public C46417c f3969a;

        /* JADX INFO: renamed from: b */
        public int f3970b;

        /* JADX INFO: renamed from: c */
        public long f3971c;

        /* JADX INFO: renamed from: d */
        public float f3972d;

        /* JADX INFO: renamed from: e */
        public String f3973e;

        public b() {
            this.f3969a = new C46417c();
            this.f3970b = 30;
            this.f3971c = Long.MIN_VALUE;
            this.f3972d = 3.0f;
            this.f3973e = "video/avc";
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public b m4389a(long j11) {
            this.f3971c = j11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C4526c m4390b() {
            return new C4526c(m4393e());
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m4391c(int i11) {
            this.f3970b = i11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m4392d(float f11) {
            this.f3972d = f11;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public c m4393e() {
            c cVar = new c();
            cVar.f3974a = this.f3969a;
            cVar.f3976c = this.f3970b;
            cVar.f3975b = this.f3971c;
            cVar.f3977d = this.f3972d;
            cVar.f3978e = this.f3973e;
            return cVar;
        }

        public b(@NonNull InterfaceC46418d interfaceC46418d) {
            C46417c c46417c = new C46417c();
            this.f3969a = c46417c;
            this.f3970b = 30;
            this.f3971c = Long.MIN_VALUE;
            this.f3972d = 3.0f;
            this.f3973e = "video/avc";
            c46417c.m102389b(interfaceC46418d);
        }
    }

    /* JADX INFO: renamed from: ba0.c$c */
    /* JADX INFO: compiled from: DefaultVideoStrategy.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public InterfaceC46418d f3974a;

        /* JADX INFO: renamed from: b */
        public long f3975b;

        /* JADX INFO: renamed from: c */
        public int f3976c;

        /* JADX INFO: renamed from: d */
        public float f3977d;

        /* JADX INFO: renamed from: e */
        public String f3978e;

        public c() {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static b m4382b(int i11) {
        return new b(new C46415a(i11));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static b m4383c(int i11, int i12) {
        return new b(new C46415a(i11, i12));
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static b m4384e(int i11, int i12) {
        return new b(new C46416b(i11, i12));
    }

    @Override // ba0.InterfaceC4528e
    @NonNull
    /* JADX INFO: renamed from: a */
    public TrackStatus mo4366a(@NonNull List<MediaFormat> list, @NonNull MediaFormat mediaFormat) {
        int iM96907b;
        int iM96906a;
        boolean zM4385d = m4385d(list);
        C43958a c43958aM4387g = m4387g(list);
        int iM96905d = c43958aM4387g.m96905d();
        int iM96904c = c43958aM4387g.m96904c();
        C45770i c45770i = f3967b;
        c45770i.m101066c("Input width&height: " + iM96905d + "x" + iM96904c);
        try {
            C43959b c43959bMo102388a = this.f3968a.f3974a.mo102388a(c43958aM4387g);
            if (c43959bMo102388a instanceof C43958a) {
                C43958a c43958a = (C43958a) c43959bMo102388a;
                iM96907b = c43958a.m96905d();
                iM96906a = c43958a.m96904c();
            } else if (iM96905d >= iM96904c) {
                iM96907b = c43959bMo102388a.m96906a();
                iM96906a = c43959bMo102388a.m96907b();
            } else {
                iM96907b = c43959bMo102388a.m96907b();
                iM96906a = c43959bMo102388a.m96906a();
            }
            c45770i.m101066c("Output width&height: " + iM96907b + "x" + iM96906a);
            boolean z11 = c43958aM4387g.m96907b() <= c43959bMo102388a.m96907b();
            int iM4388h = m4388h(list);
            int iMin = iM4388h > 0 ? Math.min(iM4388h, this.f3968a.f3976c) : this.f3968a.f3976c;
            boolean z12 = iM4388h <= iMin;
            int iM4386f = m4386f(list);
            boolean z13 = ((float) iM4386f) >= this.f3968a.f3977d;
            if (list.size() != 1 || !zM4385d || !z11 || !z12 || !z13) {
                mediaFormat.setString("mime", this.f3968a.f3978e);
                mediaFormat.setInteger("width", iM96907b);
                mediaFormat.setInteger("height", iM96906a);
                mediaFormat.setInteger(MediaUtils.KEY_ROTATION, 0);
                mediaFormat.setInteger("frame-rate", iMin);
                if (Build.VERSION.SDK_INT >= 25) {
                    mediaFormat.setFloat("i-frame-interval", this.f3968a.f3977d);
                } else {
                    mediaFormat.setInteger("i-frame-interval", (int) Math.ceil(this.f3968a.f3977d));
                }
                mediaFormat.setInteger("color-format", 2130708361);
                mediaFormat.setInteger("bitrate", (int) (this.f3968a.f3975b == Long.MIN_VALUE ? C45764c.m101050b(iM96907b, iM96906a, iMin) : this.f3968a.f3975b));
                return TrackStatus.COMPRESSING;
            }
            c45770i.m101066c("Input minSize: " + c43958aM4387g.m96907b() + ", desired minSize: " + c43959bMo102388a.m96907b() + "\nInput frameRate: " + iM4388h + ", desired frameRate: " + iMin + "\nInput iFrameInterval: " + iM4386f + ", desired iFrameInterval: " + this.f3968a.f3977d);
            return TrackStatus.PASS_THROUGH;
        } catch (Exception e11) {
            throw new RuntimeException("Resizer error:", e11);
        }
    }

    public C4526c(@NonNull c cVar) {
        this.f3968a = cVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4385d(@NonNull List<MediaFormat> list) {
        Iterator<MediaFormat> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().getString("mime").equalsIgnoreCase(this.f3968a.f3978e)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m4386f(@NonNull List<MediaFormat> list) {
        int i11 = 0;
        int integer = 0;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("i-frame-interval")) {
                i11++;
                integer += mediaFormat.getInteger("i-frame-interval");
            }
        }
        if (i11 > 0) {
            return Math.round(integer / i11);
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final C43958a m4387g(@NonNull List<MediaFormat> list) {
        int i11;
        int integer;
        boolean z11;
        float f11;
        int size = list.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f12 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            MediaFormat mediaFormat = list.get(i12);
            float integer2 = mediaFormat.getInteger("width");
            float integer3 = mediaFormat.getInteger("height");
            if (mediaFormat.containsKey(MediaUtils.KEY_ROTATION)) {
                integer = mediaFormat.getInteger(MediaUtils.KEY_ROTATION);
            } else {
                integer = 0;
            }
            if (integer % 180 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr[i12] = z11;
            if (z11) {
                f11 = integer3 / integer2;
            } else {
                f11 = integer2 / integer3;
            }
            fArr[i12] = f11;
            f12 += f11;
        }
        float f13 = f12 / size;
        float f14 = Float.MAX_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            float fAbs = Math.abs(fArr[i14] - f13);
            if (fAbs < f14) {
                i13 = i14;
                f14 = fAbs;
            }
        }
        MediaFormat mediaFormat2 = list.get(i13);
        int integer4 = mediaFormat2.getInteger("width");
        int integer5 = mediaFormat2.getInteger("height");
        boolean z12 = zArr[i13];
        if (z12) {
            i11 = integer5;
        } else {
            i11 = integer4;
        }
        if (!z12) {
            integer4 = integer5;
        }
        return new C43958a(i11, integer4);
    }

    /* JADX INFO: renamed from: h */
    public final int m4388h(@NonNull List<MediaFormat> list) {
        int iMin = Integer.MAX_VALUE;
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("frame-rate")) {
                iMin = Math.min(iMin, mediaFormat.getInteger("frame-rate"));
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return -1;
        }
        return iMin;
    }
}
