package p485o2;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p523p2.C43364k;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: o2.a */
/* JADX INFO: compiled from: AndroidResourceSignature.java */
/* JADX INFO: loaded from: classes.dex */
public final class C42947a implements InterfaceC44610b {

    /* JADX INFO: renamed from: b */
    public final int f95055b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC44610b f95056c;

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        this.f95056c.mo4268a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f95055b).array());
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C42947a) {
            C42947a c42947a = (C42947a) obj;
            if (this.f95055b == c42947a.f95055b && this.f95056c.equals(c42947a.f95056c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        return C43364k.m95523p(this.f95056c, this.f95055b);
    }

    public C42947a(int i11, InterfaceC44610b interfaceC44610b) {
        this.f95055b = i11;
        this.f95056c = interfaceC44610b;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC44610b m94278c(@NonNull Context context) {
        return new C42947a(context.getResources().getConfiguration().uiMode & 48, C42948b.m94281c(context));
    }
}
