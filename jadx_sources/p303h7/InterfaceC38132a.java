package p303h7;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: h7.a */
/* JADX INFO: compiled from: InputAccessor.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC38132a {

    /* JADX INFO: renamed from: h7.a$a */
    /* JADX INFO: compiled from: InputAccessor.java */
    public static class a implements InterfaceC38132a {

        /* JADX INFO: renamed from: a */
        public final InputStream f85804a;

        /* JADX INFO: renamed from: b */
        public final byte[] f85805b;

        /* JADX INFO: renamed from: c */
        public final int f85806c;

        /* JADX INFO: renamed from: d */
        public int f85807d;

        /* JADX INFO: renamed from: e */
        public int f85808e;

        public a(InputStream inputStream, byte[] bArr) {
            this.f85804a = inputStream;
            this.f85805b = bArr;
            this.f85806c = 0;
            this.f85808e = 0;
            this.f85807d = 0;
        }

        @Override // p303h7.InterfaceC38132a
        /* JADX INFO: renamed from: a */
        public boolean mo86052a() throws IOException {
            int i11;
            int i12 = this.f85808e;
            if (i12 < this.f85807d) {
                return true;
            }
            InputStream inputStream = this.f85804a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.f85805b;
            int length = bArr.length - i12;
            if (length < 1 || (i11 = inputStream.read(bArr, i12, length)) <= 0) {
                return false;
            }
            this.f85807d += i11;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m86053b() {
            this.f85808e = this.f85806c;
        }

        @Override // p303h7.InterfaceC38132a
        public byte nextByte() throws IOException {
            if (this.f85808e < this.f85807d || mo86052a()) {
                byte[] bArr = this.f85805b;
                int i11 = this.f85808e;
                this.f85808e = i11 + 1;
                return bArr[i11];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this.f85808e + " bytes (max buffer size: " + this.f85805b.length + ")");
        }

        public a(byte[] bArr, int i11, int i12) {
            this.f85804a = null;
            this.f85805b = bArr;
            this.f85808e = i11;
            this.f85806c = i11;
            this.f85807d = i11 + i12;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo86052a() throws IOException;

    byte nextByte() throws IOException;
}
