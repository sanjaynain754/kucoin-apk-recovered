package aa0;

import androidx.annotation.NonNull;
import com.otaliastudios.transcoder.common.TrackType;
import w90.C45770i;

/* JADX INFO: renamed from: aa0.e */
/* JADX INFO: compiled from: TrimDataSource.java */
/* JADX INFO: loaded from: classes59.dex */
public class C0217e extends C0215c {

    /* JADX INFO: renamed from: g */
    public static final C45770i f647g = new C45770i("TrimDataSource");

    /* JADX INFO: renamed from: b */
    public final long f648b;

    /* JADX INFO: renamed from: c */
    public final long f649c;

    /* JADX INFO: renamed from: d */
    public long f650d;

    /* JADX INFO: renamed from: e */
    public long f651e;

    /* JADX INFO: renamed from: f */
    public boolean f652f;

    @Override // aa0.C0215c, aa0.InterfaceC0214b
    /* JADX INFO: renamed from: a */
    public boolean mo788a(@NonNull TrackType trackType) {
        if (!this.f652f) {
            long j11 = this.f648b;
            if (j11 > 0) {
                this.f650d = j11 - m795h().seekTo(this.f648b);
                f647g.m101066c("canReadTrack(): extraDurationUs=" + this.f650d + " trimStartUs=" + this.f648b + " source.seekTo(trimStartUs)=" + (this.f650d - this.f648b));
                this.f652f = true;
            }
        }
        return super.mo788a(trackType);
    }

    @Override // aa0.InterfaceC0214b
    public long getDurationUs() {
        return this.f651e + this.f650d;
    }

    @Override // aa0.InterfaceC0214b
    public long seekTo(long j11) {
        return m795h().seekTo(this.f648b + j11) - this.f648b;
    }

    public C0217e(@NonNull InterfaceC0214b interfaceC0214b, long j11, long j12) {
        super(interfaceC0214b);
        this.f650d = 0L;
        this.f651e = Long.MIN_VALUE;
        this.f652f = false;
        if (j11 >= 0 && j12 >= 0) {
            this.f648b = j11;
            this.f649c = j12;
            return;
        }
        throw new IllegalArgumentException("Trim values cannot be negative.");
    }

    @Override // aa0.C0215c, aa0.InterfaceC0214b
    /* JADX INFO: renamed from: b */
    public boolean mo789b() {
        if (!super.mo789b() && getPositionUs() < getDurationUs()) {
            return false;
        }
        return true;
    }

    @Override // aa0.C0215c, aa0.InterfaceC0214b
    /* JADX INFO: renamed from: g */
    public void mo794g() {
        super.mo794g();
        this.f651e = Long.MIN_VALUE;
        this.f652f = false;
    }

    @Override // aa0.C0215c, aa0.InterfaceC0214b
    public long getPositionUs() {
        return (super.getPositionUs() - this.f648b) + this.f650d;
    }

    @Override // aa0.C0215c, aa0.InterfaceC0214b
    public void initialize() {
        super.initialize();
        long durationUs = m795h().getDurationUs();
        if (this.f648b + this.f649c < durationUs) {
            f647g.m101066c("initialize(): duration=" + durationUs + " trimStart=" + this.f648b + " trimEnd=" + this.f649c + " trimDuration=" + ((durationUs - this.f648b) - this.f649c));
            this.f651e = (durationUs - this.f648b) - this.f649c;
            return;
        }
        f647g.m101072j("Trim values are too large! start=" + this.f648b + ", end=" + this.f649c + ", duration=" + durationUs);
        throw new IllegalArgumentException("Trim values cannot be greater than media duration.");
    }

    @Override // aa0.C0215c, aa0.InterfaceC0214b
    public boolean isInitialized() {
        if (super.isInitialized() && this.f651e != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }
}
