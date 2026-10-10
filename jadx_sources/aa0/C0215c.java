package aa0;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.otaliastudios.transcoder.common.TrackType;

/* JADX INFO: renamed from: aa0.c */
/* JADX INFO: compiled from: DataSourceWrapper.java */
/* JADX INFO: loaded from: classes59.dex */
public class C0215c implements InterfaceC0214b {

    /* JADX INFO: renamed from: a */
    public InterfaceC0214b f634a;

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: a */
    public boolean mo788a(@NonNull TrackType trackType) {
        return this.f634a.mo788a(trackType);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: b */
    public boolean mo789b() {
        return this.f634a.mo789b();
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: c */
    public void mo790c(@NonNull TrackType trackType) {
        this.f634a.mo790c(trackType);
    }

    @Override // aa0.InterfaceC0214b
    @Nullable
    /* JADX INFO: renamed from: d */
    public MediaFormat mo791d(@NonNull TrackType trackType) {
        return this.f634a.mo791d(trackType);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: e */
    public void mo792e(@NonNull TrackType trackType) {
        this.f634a.mo792e(trackType);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: f */
    public void mo793f(@NonNull InterfaceC0214b.a aVar) {
        this.f634a.mo793f(aVar);
    }

    @Override // aa0.InterfaceC0214b
    /* JADX INFO: renamed from: g */
    public void mo794g() {
        this.f634a.mo794g();
    }

    @Override // aa0.InterfaceC0214b
    @Nullable
    public double[] getLocation() {
        return this.f634a.getLocation();
    }

    @Override // aa0.InterfaceC0214b
    public int getOrientation() {
        return this.f634a.getOrientation();
    }

    @Override // aa0.InterfaceC0214b
    public long getPositionUs() {
        return this.f634a.getPositionUs();
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public InterfaceC0214b m795h() {
        return this.f634a;
    }

    @Override // aa0.InterfaceC0214b
    public boolean isInitialized() {
        InterfaceC0214b interfaceC0214b = this.f634a;
        return interfaceC0214b != null && interfaceC0214b.isInitialized();
    }

    public C0215c(@NonNull InterfaceC0214b interfaceC0214b) {
        this.f634a = interfaceC0214b;
    }

    @Override // aa0.InterfaceC0214b
    public void initialize() {
        if (!isInitialized()) {
            InterfaceC0214b interfaceC0214b = this.f634a;
            if (interfaceC0214b != null) {
                interfaceC0214b.initialize();
                return;
            }
            throw new NullPointerException("DataSourceWrapper's source is not set!");
        }
    }
}
