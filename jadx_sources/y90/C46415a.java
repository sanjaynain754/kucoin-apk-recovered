package y90;

import androidx.annotation.NonNull;
import r90.C43959b;

/* JADX INFO: renamed from: y90.a */
/* JADX INFO: compiled from: AtMostResizer.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46415a implements InterfaceC46418d {

    /* JADX INFO: renamed from: a */
    public final int f104085a;

    /* JADX INFO: renamed from: b */
    public final int f104086b;

    public C46415a(int i11) {
        this.f104085a = i11;
        this.f104086b = Integer.MAX_VALUE;
    }

    @Override // y90.InterfaceC46418d
    @NonNull
    /* JADX INFO: renamed from: a */
    public C43959b mo102388a(@NonNull C43959b c43959b) {
        int i11;
        int i12;
        if (c43959b.m96907b() <= this.f104085a && c43959b.m96906a() <= this.f104086b) {
            return c43959b;
        }
        float fM96907b = c43959b.m96907b() / this.f104085a;
        float fM96906a = c43959b.m96906a() / this.f104086b;
        float fM96907b2 = c43959b.m96907b() / c43959b.m96906a();
        if (fM96906a >= fM96907b) {
            i12 = this.f104086b;
            i11 = (int) (i12 * fM96907b2);
        } else {
            i11 = this.f104085a;
            i12 = (int) (i11 / fM96907b2);
        }
        if (i11 % 2 != 0) {
            i11--;
        }
        if (i12 % 2 != 0) {
            i12--;
        }
        return new C43959b(i11, i12);
    }

    public C46415a(int i11, int i12) {
        this.f104085a = i11;
        this.f104086b = i12;
    }
}
