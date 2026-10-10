package p581r1;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: r1.d */
/* JADX INFO: compiled from: GifHeaderParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43899d {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f97010b;

    /* JADX INFO: renamed from: c */
    public C43898c f97011c;

    /* JADX INFO: renamed from: a */
    public final byte[] f97009a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f97012d = 0;

    /* JADX INFO: renamed from: a */
    public void m96684a() {
        this.f97010b = null;
        this.f97011c = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m96692i(int i11) {
        boolean z11 = false;
        while (!z11 && !m96685b() && this.f97011c.f96998c <= i11) {
            int iM96687d = m96687d();
            if (iM96687d == 33) {
                int iM96687d2 = m96687d();
                if (iM96687d2 == 1) {
                    m96700q();
                } else if (iM96687d2 == 249) {
                    this.f97011c.f96999d = new C43897b();
                    m96693j();
                } else if (iM96687d2 == 254) {
                    m96700q();
                } else if (iM96687d2 != 255) {
                    m96700q();
                } else {
                    m96689f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i12 = 0; i12 < 11; i12++) {
                        sb2.append((char) this.f97009a[i12]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m96696m();
                    } else {
                        m96700q();
                    }
                }
            } else if (iM96687d == 44) {
                C43898c c43898c = this.f97011c;
                if (c43898c.f96999d == null) {
                    c43898c.f96999d = new C43897b();
                }
                m96688e();
            } else if (iM96687d != 59) {
                this.f97011c.f96997b = 1;
            } else {
                z11 = true;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m96698o() {
        this.f97010b = null;
        Arrays.fill(this.f97009a, (byte) 0);
        this.f97011c = new C43898c();
        this.f97012d = 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m96685b() {
        return this.f97011c.f96997b != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C43898c m96686c() {
        if (this.f97010b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m96685b()) {
            return this.f97011c;
        }
        m96694k();
        if (!m96685b()) {
            m96691h();
            C43898c c43898c = this.f97011c;
            if (c43898c.f96998c < 0) {
                c43898c.f96997b = 1;
            }
        }
        return this.f97011c;
    }

    /* JADX INFO: renamed from: d */
    public final int m96687d() {
        try {
            return this.f97010b.get() & 255;
        } catch (Exception unused) {
            this.f97011c.f96997b = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m96688e() {
        this.f97011c.f96999d.f96985a = m96697n();
        this.f97011c.f96999d.f96986b = m96697n();
        this.f97011c.f96999d.f96987c = m96697n();
        this.f97011c.f96999d.f96988d = m96697n();
        int iM96687d = m96687d();
        boolean z11 = (iM96687d & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iM96687d & 7) + 1);
        C43897b c43897b = this.f97011c.f96999d;
        c43897b.f96989e = (iM96687d & 64) != 0;
        if (z11) {
            c43897b.f96995k = m96690g(iPow);
        } else {
            c43897b.f96995k = null;
        }
        this.f97011c.f96999d.f96994j = this.f97010b.position();
        m96701r();
        if (m96685b()) {
            return;
        }
        C43898c c43898c = this.f97011c;
        c43898c.f96998c++;
        c43898c.f97000e.add(c43898c.f96999d);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final int[] m96690g(int i11) {
        byte[] bArr = new byte[i11 * 3];
        int[] iArr = null;
        try {
            this.f97010b.get(bArr);
            iArr = new int[256];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = bArr[i13] & 255;
                int i15 = i13 + 2;
                int i16 = bArr[i13 + 1] & 255;
                i13 += 3;
                int i17 = i12 + 1;
                iArr[i12] = (i16 << 8) | (i14 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i15] & 255);
                i12 = i17;
            }
            return iArr;
        } catch (BufferUnderflowException e11) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e11);
            }
            this.f97011c.f96997b = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m96694k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 6; i11++) {
            sb2.append((char) m96687d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f97011c.f96997b = 1;
            return;
        }
        m96695l();
        if (!this.f97011c.f97003h || m96685b()) {
            return;
        }
        C43898c c43898c = this.f97011c;
        c43898c.f96996a = m96690g(c43898c.f97004i);
        C43898c c43898c2 = this.f97011c;
        c43898c2.f97007l = c43898c2.f96996a[c43898c2.f97005j];
    }

    /* JADX INFO: renamed from: l */
    public final void m96695l() {
        this.f97011c.f97001f = m96697n();
        this.f97011c.f97002g = m96697n();
        int iM96687d = m96687d();
        C43898c c43898c = this.f97011c;
        c43898c.f97003h = (iM96687d & 128) != 0;
        c43898c.f97004i = (int) Math.pow(2.0d, (iM96687d & 7) + 1);
        this.f97011c.f97005j = m96687d();
        this.f97011c.f97006k = m96687d();
    }

    /* JADX INFO: renamed from: n */
    public final int m96697n() {
        return this.f97010b.getShort();
    }

    /* JADX INFO: renamed from: f */
    public final void m96689f() {
        int iM96687d = m96687d();
        this.f97012d = iM96687d;
        if (iM96687d > 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                try {
                    int i13 = this.f97012d;
                    if (i11 < i13) {
                        i12 = i13 - i11;
                        this.f97010b.get(this.f97009a, i11, i12);
                        i11 += i12;
                    } else {
                        return;
                    }
                } catch (Exception e11) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i11 + " count: " + i12 + " blockSize: " + this.f97012d, e11);
                    }
                    this.f97011c.f96997b = 1;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m96691h() {
        m96692i(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: j */
    public final void m96693j() {
        m96687d();
        int iM96687d = m96687d();
        C43897b c43897b = this.f97011c.f96999d;
        int i11 = (iM96687d & 28) >> 2;
        c43897b.f96991g = i11;
        boolean z11 = true;
        if (i11 == 0) {
            c43897b.f96991g = 1;
        }
        if ((iM96687d & 1) == 0) {
            z11 = false;
        }
        c43897b.f96990f = z11;
        int iM96697n = m96697n();
        if (iM96697n < 2) {
            iM96697n = 10;
        }
        C43897b c43897b2 = this.f97011c.f96999d;
        c43897b2.f96993i = iM96697n * 10;
        c43897b2.f96992h = m96687d();
        m96687d();
    }

    /* JADX INFO: renamed from: m */
    public final void m96696m() {
        do {
            m96689f();
            byte[] bArr = this.f97009a;
            if (bArr[0] == 1) {
                this.f97011c.f97008m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f97012d <= 0) {
                return;
            }
        } while (!m96685b());
    }

    /* JADX INFO: renamed from: p */
    public C43899d m96699p(@NonNull ByteBuffer byteBuffer) {
        m96698o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f97010b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f97010b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final void m96700q() {
        int iM96687d;
        do {
            iM96687d = m96687d();
            this.f97010b.position(Math.min(this.f97010b.position() + iM96687d, this.f97010b.limit()));
        } while (iM96687d > 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m96701r() {
        m96687d();
        m96700q();
    }
}
