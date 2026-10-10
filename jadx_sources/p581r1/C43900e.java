package p581r1;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: r1.e */
/* JADX INFO: compiled from: StandardGifDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43900e implements InterfaceC43896a {

    /* JADX INFO: renamed from: u */
    public static final String f97013u = "e";

    /* JADX INFO: renamed from: a */
    @ColorInt
    public int[] f97014a;

    /* JADX INFO: renamed from: b */
    @ColorInt
    public final int[] f97015b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC43896a.a f97016c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f97017d;

    /* JADX INFO: renamed from: e */
    public byte[] f97018e;

    /* JADX INFO: renamed from: f */
    public short[] f97019f;

    /* JADX INFO: renamed from: g */
    public byte[] f97020g;

    /* JADX INFO: renamed from: h */
    public byte[] f97021h;

    /* JADX INFO: renamed from: i */
    public byte[] f97022i;

    /* JADX INFO: renamed from: j */
    @ColorInt
    public int[] f97023j;

    /* JADX INFO: renamed from: k */
    public int f97024k;

    /* JADX INFO: renamed from: l */
    public C43898c f97025l;

    /* JADX INFO: renamed from: m */
    public Bitmap f97026m;

    /* JADX INFO: renamed from: n */
    public boolean f97027n;

    /* JADX INFO: renamed from: o */
    public int f97028o;

    /* JADX INFO: renamed from: p */
    public int f97029p;

    /* JADX INFO: renamed from: q */
    public int f97030q;

    /* JADX INFO: renamed from: r */
    public int f97031r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public Boolean f97032s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public Bitmap.Config f97033t;

    public C43900e(@NonNull InterfaceC43896a.a aVar, C43898c c43898c, ByteBuffer byteBuffer, int i11) {
        this(aVar);
        m96710r(c43898c, byteBuffer, i11);
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: c */
    public void mo96673c() {
        this.f97024k = -1;
    }

    @Override // p581r1.InterfaceC43896a
    public void clear() {
        this.f97025l = null;
        byte[] bArr = this.f97022i;
        if (bArr != null) {
            this.f97016c.mo85250e(bArr);
        }
        int[] iArr = this.f97023j;
        if (iArr != null) {
            this.f97016c.mo85251f(iArr);
        }
        Bitmap bitmap = this.f97026m;
        if (bitmap != null) {
            this.f97016c.mo85248c(bitmap);
        }
        this.f97026m = null;
        this.f97017d = null;
        this.f97032s = null;
        byte[] bArr2 = this.f97018e;
        if (bArr2 != null) {
            this.f97016c.mo85250e(bArr2);
        }
    }

    @Override // p581r1.InterfaceC43896a
    @Nullable
    /* JADX INFO: renamed from: f */
    public synchronized Bitmap mo96676f() {
        try {
            if (this.f97025l.f96998c <= 0 || this.f97024k < 0) {
                String str = f97013u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.f97025l.f96998c + ", framePointer=" + this.f97024k);
                }
                this.f97028o = 1;
            }
            int i11 = this.f97028o;
            if (i11 != 1 && i11 != 2) {
                this.f97028o = 0;
                if (this.f97018e == null) {
                    this.f97018e = this.f97016c.mo85246a(255);
                }
                C43897b c43897b = this.f97025l.f97000e.get(this.f97024k);
                int i12 = this.f97024k - 1;
                C43897b c43897b2 = i12 >= 0 ? this.f97025l.f97000e.get(i12) : null;
                int[] iArr = c43897b.f96995k;
                if (iArr == null) {
                    iArr = this.f97025l.f96996a;
                }
                this.f97014a = iArr;
                if (iArr == null) {
                    String str2 = f97013u;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f97024k);
                    }
                    this.f97028o = 1;
                    return null;
                }
                if (c43897b.f96990f) {
                    System.arraycopy(iArr, 0, this.f97015b, 0, iArr.length);
                    int[] iArr2 = this.f97015b;
                    this.f97014a = iArr2;
                    iArr2[c43897b.f96992h] = 0;
                    if (c43897b.f96991g == 2 && this.f97024k == 0) {
                        this.f97032s = Boolean.TRUE;
                    }
                }
                return m96711s(c43897b, c43897b2);
            }
            String str3 = f97013u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f97028o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: j */
    public final int m96702j(int i11, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = i11; i19 < this.f97029p + i11; i19++) {
            byte[] bArr = this.f97022i;
            if (i19 >= bArr.length || i19 >= i12) {
                break;
            }
            int i21 = this.f97014a[bArr[i19] & 255];
            if (i21 != 0) {
                i14 += (i21 >> 24) & 255;
                i15 += (i21 >> 16) & 255;
                i16 += (i21 >> 8) & 255;
                i17 += i21 & 255;
                i18++;
            }
        }
        int i22 = i11 + i13;
        for (int i23 = i22; i23 < this.f97029p + i22; i23++) {
            byte[] bArr2 = this.f97022i;
            if (i23 >= bArr2.length || i23 >= i12) {
                break;
            }
            int i24 = this.f97014a[bArr2[i23] & 255];
            if (i24 != 0) {
                i14 += (i24 >> 24) & 255;
                i15 += (i24 >> 16) & 255;
                i16 += (i24 >> 8) & 255;
                i17 += i24 & 255;
                i18++;
            }
        }
        if (i18 == 0) {
            return 0;
        }
        return ((i14 / i18) << 24) | ((i15 / i18) << 16) | ((i16 / i18) << 8) | (i17 / i18);
    }

    /* JADX INFO: renamed from: r */
    public synchronized void m96710r(@NonNull C43898c c43898c, @NonNull ByteBuffer byteBuffer, int i11) {
        try {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
            }
            int iHighestOneBit = Integer.highestOneBit(i11);
            this.f97028o = 0;
            this.f97025l = c43898c;
            this.f97024k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f97017d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f97017d.order(ByteOrder.LITTLE_ENDIAN);
            this.f97027n = false;
            Iterator<C43897b> it = c43898c.f97000e.iterator();
            while (it.hasNext()) {
                if (it.next().f96991g == 3) {
                    this.f97027n = true;
                    break;
                }
            }
            this.f97029p = iHighestOneBit;
            int i12 = c43898c.f97001f;
            this.f97031r = i12 / iHighestOneBit;
            int i13 = c43898c.f97002g;
            this.f97030q = i13 / iHighestOneBit;
            this.f97022i = this.f97016c.mo85246a(i12 * i13);
            this.f97023j = this.f97016c.mo85249d(this.f97031r * this.f97030q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: a */
    public int mo96671a() {
        return this.f97025l.f96998c;
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: b */
    public void mo96672b(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f97033t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: d */
    public int mo96674d() {
        return this.f97024k;
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: e */
    public int mo96675e() {
        return this.f97017d.limit() + this.f97022i.length + (this.f97023j.length * 4);
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: g */
    public void mo96677g() {
        this.f97024k = (this.f97024k + 1) % this.f97025l.f96998c;
    }

    @Override // p581r1.InterfaceC43896a
    @NonNull
    public ByteBuffer getData() {
        return this.f97017d;
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: h */
    public int mo96678h() {
        int i11 = this.f97025l.f97008m;
        if (i11 == -1) {
            return 1;
        }
        if (i11 == 0) {
            return 0;
        }
        return i11 + 1;
    }

    @Override // p581r1.InterfaceC43896a
    /* JADX INFO: renamed from: i */
    public int mo96679i() {
        int i11;
        if (this.f97025l.f96998c <= 0 || (i11 = this.f97024k) < 0) {
            return 0;
        }
        return m96706n(i11);
    }

    /* JADX INFO: renamed from: k */
    public final void m96703k(C43897b c43897b) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f97023j;
        int i15 = c43897b.f96988d;
        int i16 = this.f97029p;
        int i17 = i15 / i16;
        int i18 = c43897b.f96986b / i16;
        int i19 = c43897b.f96987c / i16;
        int i21 = c43897b.f96985a / i16;
        boolean z11 = this.f97024k == 0;
        int i22 = this.f97031r;
        int i23 = this.f97030q;
        byte[] bArr = this.f97022i;
        int[] iArr2 = this.f97014a;
        Boolean bool = this.f97032s;
        int i24 = 8;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1;
        while (i26 < i17) {
            int[] iArr3 = iArr;
            if (c43897b.f96989e) {
                if (i25 >= i17) {
                    int i28 = i27 + 1;
                    i11 = i17;
                    if (i28 == 2) {
                        i27 = i28;
                        i25 = 4;
                    } else if (i28 == 3) {
                        i27 = i28;
                        i24 = 4;
                        i25 = 2;
                    } else if (i28 != 4) {
                        i27 = i28;
                    } else {
                        i27 = i28;
                        i25 = 1;
                        i24 = 2;
                    }
                } else {
                    i11 = i17;
                }
                i12 = i25 + i24;
            } else {
                i11 = i17;
                i12 = i25;
                i25 = i26;
            }
            int i29 = i25 + i18;
            boolean z12 = i16 == 1;
            if (i29 < i23) {
                int i31 = i29 * i22;
                int i32 = i31 + i21;
                int i33 = i32 + i19;
                int i34 = i31 + i22;
                if (i34 < i33) {
                    i33 = i34;
                }
                i13 = i12;
                int i35 = i26 * i16 * c43897b.f96987c;
                if (z12) {
                    int i36 = i32;
                    while (i36 < i33) {
                        int i37 = i36;
                        int i38 = iArr2[bArr[i35] & 255];
                        if (i38 != 0) {
                            iArr3[i37] = i38;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i16;
                        i36 = i37 + 1;
                    }
                } else {
                    int i39 = ((i33 - i32) * i16) + i35;
                    i14 = i16;
                    int i41 = i32;
                    while (i41 < i33) {
                        int i42 = i33;
                        int iM96702j = m96702j(i35, i39, c43897b.f96987c);
                        if (iM96702j != 0) {
                            iArr3[i41] = iM96702j;
                        } else if (z11 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i35 += i14;
                        i41++;
                        i33 = i42;
                    }
                }
                i26++;
                i16 = i14;
                iArr = iArr3;
                i17 = i11;
                i25 = i13;
            } else {
                i13 = i12;
            }
            i14 = i16;
            i26++;
            i16 = i14;
            iArr = iArr3;
            i17 = i11;
            i25 = i13;
        }
        if (this.f97032s == null) {
            this.f97032s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m96704l(C43897b c43897b) {
        C43897b c43897b2 = c43897b;
        int[] iArr = this.f97023j;
        int i11 = c43897b2.f96988d;
        int i12 = c43897b2.f96986b;
        int i13 = c43897b2.f96987c;
        int i14 = c43897b2.f96985a;
        boolean z11 = this.f97024k == 0;
        int i15 = this.f97031r;
        byte[] bArr = this.f97022i;
        int[] iArr2 = this.f97014a;
        int i16 = 0;
        byte b11 = -1;
        while (i16 < i11) {
            int i17 = (i16 + i12) * i15;
            int i18 = i17 + i14;
            int i19 = i18 + i13;
            int i21 = i17 + i15;
            if (i21 < i19) {
                i19 = i21;
            }
            int i22 = c43897b2.f96987c * i16;
            int i23 = i18;
            while (i23 < i19) {
                byte b12 = bArr[i22];
                int[] iArr3 = iArr;
                int i24 = b12 & 255;
                if (i24 != b11) {
                    int i25 = iArr2[i24];
                    if (i25 != 0) {
                        iArr3[i23] = i25;
                    } else {
                        b11 = b12;
                    }
                }
                i22++;
                i23++;
                iArr = iArr3;
            }
            i16++;
            c43897b2 = c43897b;
        }
        Boolean bool = this.f97032s;
        this.f97032s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f97032s == null && z11 && b11 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: m */
    public final void m96705m(C43897b c43897b) {
        int i11;
        int i12;
        short s11;
        C43900e c43900e = this;
        if (c43897b != null) {
            c43900e.f97017d.position(c43897b.f96994j);
        }
        if (c43897b == null) {
            C43898c c43898c = c43900e.f97025l;
            i11 = c43898c.f97001f;
            i12 = c43898c.f97002g;
        } else {
            i11 = c43897b.f96987c;
            i12 = c43897b.f96988d;
        }
        int i13 = i11 * i12;
        byte[] bArr = c43900e.f97022i;
        if (bArr == null || bArr.length < i13) {
            c43900e.f97022i = c43900e.f97016c.mo85246a(i13);
        }
        byte[] bArr2 = c43900e.f97022i;
        if (c43900e.f97019f == null) {
            c43900e.f97019f = new short[4096];
        }
        short[] sArr = c43900e.f97019f;
        if (c43900e.f97020g == null) {
            c43900e.f97020g = new byte[4096];
        }
        byte[] bArr3 = c43900e.f97020g;
        if (c43900e.f97021h == null) {
            c43900e.f97021h = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr4 = c43900e.f97021h;
        int iM96709q = c43900e.m96709q();
        int i14 = 1 << iM96709q;
        int i15 = i14 + 1;
        int i16 = i14 + 2;
        int i17 = iM96709q + 1;
        int i18 = (1 << i17) - 1;
        byte b11 = 0;
        for (int i19 = 0; i19 < i14; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = c43900e.f97018e;
        int i21 = i17;
        int i22 = i16;
        int i23 = i18;
        int i24 = 0;
        int iM96708p = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = -1;
        while (i24 < i13) {
            if (iM96708p == 0) {
                iM96708p = c43900e.m96708p();
                if (iM96708p <= 0) {
                    c43900e.f97028o = 3;
                    break;
                }
                i25 = b11;
            }
            i27 += (bArr5[i25] & 255) << i26;
            i25++;
            iM96708p--;
            int i33 = i26 + 8;
            i22 = i22;
            int i34 = i32;
            int i35 = i21;
            short[] sArr2 = sArr;
            int i36 = i31;
            while (true) {
                bArr3 = bArr3;
                if (i33 < i35) {
                    i31 = i36;
                    break;
                }
                int i37 = i27 & i23;
                i27 >>= i35;
                i33 -= i35;
                if (i37 == i14) {
                    i35 = i17;
                    i22 = i16;
                    i23 = i18;
                    i34 = -1;
                } else {
                    if (i37 == i15) {
                        i31 = i36;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i34 == -1) {
                        bArr2[i28] = bArr3[i37];
                        i28++;
                        i24++;
                        i34 = i37;
                        i36 = i34;
                        bArr4 = bArr6;
                    } else {
                        if (i37 >= i22) {
                            bArr6[i29] = (byte) i36;
                            i29++;
                            s11 = i34;
                        } else {
                            s11 = i37;
                        }
                        while (s11 >= i14) {
                            bArr6[i29] = bArr3[s11];
                            i29++;
                            s11 = sArr2[s11];
                        }
                        int i38 = bArr3[s11] & 255;
                        byte b12 = (byte) i38;
                        bArr2[i28] = b12;
                        while (true) {
                            i28++;
                            i24++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr2[i28] = bArr6[i29];
                        }
                        if (i22 < 4096) {
                            sArr2[i22] = (short) i34;
                            bArr3[i22] = b12;
                            i22++;
                            if ((i22 & i23) == 0 && i22 < 4096) {
                                i35++;
                                i23 += i22;
                            }
                        }
                        i34 = i37;
                        bArr4 = bArr6;
                        i36 = i38;
                    }
                }
            }
            i26 = i33;
            sArr = sArr2;
            bArr3 = bArr3;
            b11 = 0;
            i32 = i34;
            i21 = i35;
            c43900e = this;
        }
        Arrays.fill(bArr2, i28, i13, b11);
    }

    /* JADX INFO: renamed from: n */
    public int m96706n(int i11) {
        if (i11 < 0) {
            return -1;
        }
        C43898c c43898c = this.f97025l;
        if (i11 < c43898c.f96998c) {
            return c43898c.f97000e.get(i11).f96993i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public final Bitmap m96707o() {
        Boolean bool = this.f97032s;
        Bitmap bitmapMo85247b = this.f97016c.mo85247b(this.f97031r, this.f97030q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f97033t);
        bitmapMo85247b.setHasAlpha(true);
        return bitmapMo85247b;
    }

    /* JADX INFO: renamed from: q */
    public final int m96709q() {
        return this.f97017d.get() & 255;
    }

    /* JADX INFO: renamed from: s */
    public final Bitmap m96711s(C43897b c43897b, C43897b c43897b2) {
        int i11;
        int i12;
        Bitmap bitmap;
        int[] iArr = this.f97023j;
        int i13 = 0;
        if (c43897b2 == null) {
            Bitmap bitmap2 = this.f97026m;
            if (bitmap2 != null) {
                this.f97016c.mo85248c(bitmap2);
            }
            this.f97026m = null;
            Arrays.fill(iArr, 0);
        }
        if (c43897b2 != null && c43897b2.f96991g == 3 && this.f97026m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c43897b2 != null && (i12 = c43897b2.f96991g) > 0) {
            if (i12 == 2) {
                if (!c43897b.f96990f) {
                    C43898c c43898c = this.f97025l;
                    int i14 = c43898c.f97007l;
                    if (c43897b.f96995k == null || c43898c.f97005j != c43897b.f96992h) {
                        i13 = i14;
                    }
                }
                int i15 = c43897b2.f96988d;
                int i16 = this.f97029p;
                int i17 = i15 / i16;
                int i18 = c43897b2.f96986b / i16;
                int i19 = c43897b2.f96987c / i16;
                int i21 = c43897b2.f96985a / i16;
                int i22 = this.f97031r;
                int i23 = (i18 * i22) + i21;
                int i24 = (i17 * i22) + i23;
                while (i23 < i24) {
                    int i25 = i23 + i19;
                    for (int i26 = i23; i26 < i25; i26++) {
                        iArr[i26] = i13;
                    }
                    i23 += this.f97031r;
                }
            } else if (i12 == 3 && (bitmap = this.f97026m) != null) {
                int i27 = this.f97031r;
                bitmap.getPixels(iArr, 0, i27, 0, 0, i27, this.f97030q);
            }
        }
        m96705m(c43897b);
        if (c43897b.f96989e || this.f97029p != 1) {
            m96703k(c43897b);
        } else {
            m96704l(c43897b);
        }
        if (this.f97027n && ((i11 = c43897b.f96991g) == 0 || i11 == 1)) {
            if (this.f97026m == null) {
                this.f97026m = m96707o();
            }
            Bitmap bitmap3 = this.f97026m;
            int i28 = this.f97031r;
            bitmap3.setPixels(iArr, 0, i28, 0, 0, i28, this.f97030q);
        }
        Bitmap bitmapM96707o = m96707o();
        int i29 = this.f97031r;
        bitmapM96707o.setPixels(iArr, 0, i29, 0, 0, i29, this.f97030q);
        return bitmapM96707o;
    }

    public C43900e(@NonNull InterfaceC43896a.a aVar) {
        this.f97015b = new int[256];
        this.f97033t = Bitmap.Config.ARGB_8888;
        this.f97016c = aVar;
        this.f97025l = new C43898c();
    }

    /* JADX INFO: renamed from: p */
    public final int m96708p() {
        int iM96709q = m96709q();
        if (iM96709q <= 0) {
            return iM96709q;
        }
        ByteBuffer byteBuffer = this.f97017d;
        byteBuffer.get(this.f97018e, 0, Math.min(iM96709q, byteBuffer.remaining()));
        return iM96709q;
    }
}
