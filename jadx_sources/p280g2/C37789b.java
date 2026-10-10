package p280g2;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p581r1.InterfaceC43896a;
import p710w1.InterfaceC45684b;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: g2.b */
/* JADX INFO: compiled from: GifBitmapProvider.java */
/* JADX INFO: loaded from: classes.dex */
public final class C37789b implements InterfaceC43896a.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45686d f85114a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final InterfaceC45684b f85115b;

    @Override // p581r1.InterfaceC43896a.a
    @NonNull
    /* JADX INFO: renamed from: a */
    public byte[] mo85246a(int i11) {
        InterfaceC45684b interfaceC45684b = this.f85115b;
        return interfaceC45684b == null ? new byte[i11] : (byte[]) interfaceC45684b.mo100806d(i11, byte[].class);
    }

    @Override // p581r1.InterfaceC43896a.a
    @NonNull
    /* JADX INFO: renamed from: b */
    public Bitmap mo85247b(int i11, int i12, @NonNull Bitmap.Config config) {
        return this.f85114a.mo100814e(i11, i12, config);
    }

    @Override // p581r1.InterfaceC43896a.a
    /* JADX INFO: renamed from: c */
    public void mo85248c(@NonNull Bitmap bitmap) {
        this.f85114a.mo4893b(bitmap);
    }

    @Override // p581r1.InterfaceC43896a.a
    @NonNull
    /* JADX INFO: renamed from: d */
    public int[] mo85249d(int i11) {
        InterfaceC45684b interfaceC45684b = this.f85115b;
        return interfaceC45684b == null ? new int[i11] : (int[]) interfaceC45684b.mo100806d(i11, int[].class);
    }

    @Override // p581r1.InterfaceC43896a.a
    /* JADX INFO: renamed from: e */
    public void mo85250e(@NonNull byte[] bArr) {
        InterfaceC45684b interfaceC45684b = this.f85115b;
        if (interfaceC45684b == null) {
            return;
        }
        interfaceC45684b.put(bArr);
    }

    @Override // p581r1.InterfaceC43896a.a
    /* JADX INFO: renamed from: f */
    public void mo85251f(@NonNull int[] iArr) {
        InterfaceC45684b interfaceC45684b = this.f85115b;
        if (interfaceC45684b == null) {
            return;
        }
        interfaceC45684b.put(iArr);
    }

    public C37789b(InterfaceC45686d interfaceC45686d, @Nullable InterfaceC45684b interfaceC45684b) {
        this.f85114a = interfaceC45686d;
        this.f85115b = interfaceC45684b;
    }
}
