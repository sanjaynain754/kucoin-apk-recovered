package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p523p2.C43363j;
import p710w1.InterfaceC45684b;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6955a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final int[] f6956b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo6841a() throws IOException;

        /* JADX INFO: renamed from: b */
        int mo6842b(byte[] bArr, int i11) throws IOException;

        /* JADX INFO: renamed from: c */
        short mo6843c() throws IOException;

        long skip(long j11) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C5352a implements Reader {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f6957a;

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public int mo6842b(byte[] bArr, int i11) {
            int iMin = Math.min(i11, this.f6957a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f6957a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: c */
        public short mo6843c() throws Reader.EndOfFileException {
            if (this.f6957a.remaining() >= 1) {
                return (short) (this.f6957a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) {
            int iMin = (int) Math.min(this.f6957a.remaining(), j11);
            ByteBuffer byteBuffer = this.f6957a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }

        public C5352a(ByteBuffer byteBuffer) {
            this.f6957a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public int mo6841a() throws Reader.EndOfFileException {
            return (mo6843c() << 8) | mo6843c();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class C5353b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f6958a;

        /* JADX INFO: renamed from: a */
        public short m6844a(int i11) {
            if (m6846c(i11, 2)) {
                return this.f6958a.getShort(i11);
            }
            return (short) -1;
        }

        /* JADX INFO: renamed from: b */
        public int m6845b(int i11) {
            if (m6846c(i11, 4)) {
                return this.f6958a.getInt(i11);
            }
            return -1;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m6846c(int i11, int i12) {
            return this.f6958a.remaining() - i11 >= i12;
        }

        /* JADX INFO: renamed from: d */
        public int m6847d() {
            return this.f6958a.remaining();
        }

        /* JADX INFO: renamed from: e */
        public void m6848e(ByteOrder byteOrder) {
            this.f6958a.order(byteOrder);
        }

        public C5353b(byte[] bArr, int i11) {
            this.f6958a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C5354c implements Reader {

        /* JADX INFO: renamed from: a */
        public final InputStream f6959a;

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public int mo6842b(byte[] bArr, int i11) throws IOException {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11 && (i13 = this.f6959a.read(bArr, i12, i11 - i12)) != -1) {
                i12 += i13;
            }
            if (i12 == 0 && i13 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i12;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: c */
        public short mo6843c() throws IOException {
            int i11 = this.f6959a.read();
            if (i11 != -1) {
                return (short) i11;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j11) throws IOException {
            if (j11 < 0) {
                return 0L;
            }
            long j12 = j11;
            while (j12 > 0) {
                long jSkip = this.f6959a.skip(j12);
                if (jSkip <= 0) {
                    if (this.f6959a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j12 -= jSkip;
            }
            return j11 - j12;
        }

        public C5354c(InputStream inputStream) {
            this.f6959a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public int mo6841a() throws IOException {
            return (mo6843c() << 8) | mo6843c();
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m6835j(C5353b c5353b) {
        ByteOrder byteOrder;
        short sM6844a = c5353b.m6844a(6);
        if (sM6844a != 18761) {
            if (sM6844a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM6844a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c5353b.m6848e(byteOrder);
        int iM6845b = c5353b.m6845b(10) + 6;
        short sM6844a2 = c5353b.m6844a(iM6845b);
        for (int i11 = 0; i11 < sM6844a2; i11++) {
            int iM6833d = m6833d(iM6845b, i11);
            short sM6844a3 = c5353b.m6844a(iM6833d);
            if (sM6844a3 == 274) {
                short sM6844a4 = c5353b.m6844a(iM6833d + 2);
                if (sM6844a4 >= 1 && sM6844a4 <= 12) {
                    int iM6845b2 = c5353b.m6845b(iM6833d + 4);
                    if (iM6845b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i11 + " tagType=" + ((int) sM6844a3) + " formatCode=" + ((int) sM6844a4) + " componentCount=" + iM6845b2);
                        }
                        int i12 = iM6845b2 + f6956b[sM6844a4];
                        if (i12 <= 4) {
                            int i13 = iM6833d + 8;
                            if (i13 >= 0 && i13 <= c5353b.m6847d()) {
                                if (i12 >= 0 && i12 + i13 <= c5353b.m6847d()) {
                                    return c5353b.m6844a(i13);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sM6844a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i13 + " tagType=" + ((int) sM6844a3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM6844a4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sM6844a4));
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m6836e(Reader reader, InterfaceC45684b interfaceC45684b) throws IOException {
        try {
            int iMo6841a = reader.mo6841a();
            if (!m6834g(iMo6841a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo6841a);
                }
                return -1;
            }
            int iM6839i = m6839i(reader);
            if (iM6839i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC45684b.mo100806d(iM6839i, byte[].class);
            try {
                return m6840k(reader, bArr, iM6839i);
            } finally {
                interfaceC45684b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6838h(byte[] bArr, int i11) {
        boolean z11 = bArr != null && i11 > f6955a.length;
        if (z11) {
            int i12 = 0;
            while (true) {
                byte[] bArr2 = f6955a;
                if (i12 >= bArr2.length) {
                    break;
                }
                if (bArr[i12] != bArr2[i12]) {
                    return false;
                }
                i12++;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public static int m6833d(int i11, int i12) {
        return i11 + 2 + (i12 * 12);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo4896a(@NonNull InputStream inputStream) throws IOException {
        return m6837f(new C5354c((InputStream) C43363j.m95506d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public int mo4897b(@NonNull InputStream inputStream, @NonNull InterfaceC45684b interfaceC45684b) throws IOException {
        return m6836e(new C5354c((InputStream) C43363j.m95506d(inputStream)), (InterfaceC45684b) C43363j.m95506d(interfaceC45684b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    /* JADX INFO: renamed from: c */
    public ImageHeaderParser.ImageType mo4898c(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m6837f(new C5352a((ByteBuffer) C43363j.m95506d(byteBuffer)));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6834g(int i11) {
        if ((i11 & 65496) != 65496 && i11 != 19789 && i11 != 18761) {
            return false;
        }
        return true;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser.ImageType m6837f(Reader reader) throws IOException {
        try {
            int iMo6841a = reader.mo6841a();
            if (iMo6841a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo6843c = (iMo6841a << 8) | reader.mo6843c();
            if (iMo6843c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo6843c2 = (iMo6843c << 8) | reader.mo6843c();
            if (iMo6843c2 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.mo6843c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo6843c2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.mo6841a() << 16) | reader.mo6841a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo6841a2 = (reader.mo6841a() << 16) | reader.mo6841a();
            if ((iMo6841a2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i11 = iMo6841a2 & 255;
            if (i11 == 88) {
                reader.skip(4L);
                if ((reader.mo6843c() & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            if (i11 == 76) {
                reader.skip(4L);
                if ((reader.mo6843c() & 8) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m6839i(Reader reader) throws IOException {
        short sMo6843c;
        int iMo6841a;
        long j11;
        long jSkip;
        do {
            short sMo6843c2 = reader.mo6843c();
            if (sMo6843c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo6843c2));
                }
                return -1;
            }
            sMo6843c = reader.mo6843c();
            if (sMo6843c == 218) {
                return -1;
            }
            if (sMo6843c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iMo6841a = reader.mo6841a() - 2;
            if (sMo6843c != 225) {
                j11 = iMo6841a;
                jSkip = reader.skip(j11);
            } else {
                return iMo6841a;
            }
        } while (jSkip == j11);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sMo6843c) + ", wanted to skip: " + iMo6841a + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m6840k(Reader reader, byte[] bArr, int i11) throws IOException {
        int iMo6842b = reader.mo6842b(bArr, i11);
        if (iMo6842b != i11) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i11 + ", actually read: " + iMo6842b);
            }
            return -1;
        }
        if (m6838h(bArr, i11)) {
            return m6835j(new C5353b(bArr, i11));
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
