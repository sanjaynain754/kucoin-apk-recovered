package p188d2;

import androidx.annotation.NonNull;
import p523p2.C43363j;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: compiled from: BytesResource.java */
/* JADX INFO: loaded from: classes34.dex */
public class C36595b implements InterfaceC45359j<byte[]> {

    /* JADX INFO: renamed from: b */
    public final byte[] f79401b;

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<byte[]> mo4266a() {
        return byte[].class;
    }

    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f79401b;
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return this.f79401b.length;
    }

    public C36595b(byte[] bArr) {
        this.f79401b = (byte[]) C43363j.m95506d(bArr);
    }

    @Override // p680v1.InterfaceC45359j
    public void recycle() {
    }
}
