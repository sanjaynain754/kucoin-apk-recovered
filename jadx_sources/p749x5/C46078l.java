package p749x5;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: renamed from: x5.l */
/* JADX INFO: compiled from: ImageInfoImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46078l implements InterfaceC46077k {

    /* JADX INFO: renamed from: b */
    public final int f103522b;

    /* JADX INFO: renamed from: c */
    public final int f103523c;

    /* JADX INFO: renamed from: d */
    public final int f103524d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC46080n f103525e;

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> f103526f;

    @Override // p749x5.InterfaceC46076j, com.facebook.fresco.middleware.HasExtraData
    @NonNull
    public Map<String, Object> getExtras() {
        return this.f103526f;
    }

    @Override // p749x5.InterfaceC46077k
    public int getHeight() {
        return this.f103523c;
    }

    @Override // p749x5.InterfaceC46077k
    public int getWidth() {
        return this.f103522b;
    }

    public C46078l(int i11, int i12, int i13, InterfaceC46080n interfaceC46080n, Map<String, Object> map) {
        this.f103522b = i11;
        this.f103523c = i12;
        this.f103524d = i13;
        this.f103525e = interfaceC46080n;
        this.f103526f = map;
    }
}
