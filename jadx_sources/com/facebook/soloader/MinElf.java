package com.facebook.soloader;

import io.flutter.embedding.android.KeyboardMap;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import okhttp3.internal.p505ws.WebSocketProtocol;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes45.dex */
public final class MinElf {
    public static final int DT_NEEDED = 1;
    public static final int DT_NULL = 0;
    public static final int DT_STRTAB = 5;
    public static final int ELF_MAGIC = 1179403647;
    public static final int PN_XNUM = 65535;
    public static final int PT_DYNAMIC = 2;
    public static final int PT_LOAD = 1;
    private static final String TAG = "MinElf";

    public interface ISA {
        public static final String AARCH64 = "arm64-v8a";
        public static final String ARM = "armeabi-v7a";
        public static final String X86 = "x86";
        public static final String X86_64 = "x86_64";
    }

    public static String[] extract_DT_NEEDED(File file) throws IOException {
        ElfFileChannel elfFileChannel = new ElfFileChannel(file);
        try {
            String[] strArrExtract_DT_NEEDED = extract_DT_NEEDED(elfFileChannel);
            elfFileChannel.close();
            return strArrExtract_DT_NEEDED;
        } catch (Throwable th2) {
            try {
                elfFileChannel.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static String[] extract_DT_NEEDED_with_retries(ElfFileChannel elfFileChannel) throws IOException {
        int i11 = 0;
        while (true) {
            try {
                return extract_DT_NEEDED_no_retries(elfFileChannel);
            } catch (ClosedByInterruptException e11) {
                i11++;
                if (i11 > 4) {
                    throw e11;
                }
                Thread.interrupted();
                LogUtil.m10653e(TAG, "retrying extract_DT_NEEDED due to ClosedByInterruptException", e11);
                elfFileChannel.openChannel();
            }
        }
    }

    private static int getu16(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j11) throws IOException {
        read(elfByteChannel, byteBuffer, 2, j11);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    private static long getu32(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j11) throws IOException {
        read(elfByteChannel, byteBuffer, 4, j11);
        return ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
    }

    private static short getu8(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j11) throws IOException {
        read(elfByteChannel, byteBuffer, 1, j11);
        return (short) (byteBuffer.get() & 255);
    }

    private static void read(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, int i11, long j11) throws IOException {
        int i12;
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        while (byteBuffer.remaining() > 0 && (i12 = elfByteChannel.read(byteBuffer, j11)) != -1) {
            j11 += (long) i12;
        }
        if (byteBuffer.remaining() > 0) {
            throw new ElfError("ELF file truncated");
        }
        byteBuffer.position(0);
    }

    @DoNotStripAny
    public static class ElfError extends UnsatisfiedLinkError {
        public ElfError(String str) {
            super(str);
        }
    }

    private static String[] extract_DT_NEEDED_no_retries(ElfByteChannel elfByteChannel) throws IOException {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long j16 = getu32(elfByteChannel, byteBufferAllocate, 0L);
        if (j16 != 1179403647) {
            throw new ElfError("file is not ELF: magic is 0x" + Long.toHexString(j16) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z11 = getu8(elfByteChannel, byteBufferAllocate, 4L) == 1;
        long j17 = 5;
        if (getu8(elfByteChannel, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long j18 = z11 ? getu32(elfByteChannel, byteBufferAllocate, 28L) : get64(elfByteChannel, byteBufferAllocate, 32L);
        long j19 = z11 ? getu16(elfByteChannel, byteBufferAllocate, 44L) : getu16(elfByteChannel, byteBufferAllocate, 56L);
        int i11 = getu16(elfByteChannel, byteBufferAllocate, z11 ? 42L : 54L);
        boolean z12 = z11;
        long j21 = 40;
        if (j19 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            long j22 = z12 ? getu32(elfByteChannel, byteBufferAllocate, 32L) : get64(elfByteChannel, byteBufferAllocate, 40L);
            j19 = z12 ? getu32(elfByteChannel, byteBufferAllocate, j22 + 28) : getu32(elfByteChannel, byteBufferAllocate, j22 + 44);
        }
        long j23 = j18;
        long j24 = 0;
        while (true) {
            if (j24 >= j19) {
                j11 = 0;
                break;
            }
            if ((z12 ? getu32(elfByteChannel, byteBufferAllocate, j23) : getu32(elfByteChannel, byteBufferAllocate, j23)) == 2) {
                if (!z12) {
                    j11 = get64(elfByteChannel, byteBufferAllocate, j23 + 8);
                    break;
                }
                j11 = getu32(elfByteChannel, byteBufferAllocate, j23 + 4);
                break;
            }
            j23 += (long) i11;
            j24++;
            j21 = j21;
        }
        long j25 = j21;
        if (j11 == 0) {
            throw new ElfError("ELF file does not contain dynamic linking information");
        }
        long j26 = j11;
        long j27 = 0;
        int i12 = 0;
        while (true) {
            long j28 = z12 ? getu32(elfByteChannel, byteBufferAllocate, j26) : get64(elfByteChannel, byteBufferAllocate, j26);
            long j29 = j17;
            if (j28 == 1) {
                if (i12 == Integer.MAX_VALUE) {
                    throw new ElfError("malformed DT_NEEDED section");
                }
                i12++;
            } else if (j28 == j29) {
                j27 = z12 ? getu32(elfByteChannel, byteBufferAllocate, j26 + 4) : get64(elfByteChannel, byteBufferAllocate, j26 + 8);
            }
            j26 += z12 ? 8L : 16L;
            if (j28 == 0) {
                if (j27 == 0) {
                    throw new ElfError("Dynamic section string-table not found");
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= j19) {
                        j12 = 0;
                        break;
                    }
                    if (z12) {
                        j14 = j18;
                        j15 = getu32(elfByteChannel, byteBufferAllocate, j14);
                    } else {
                        j14 = j18;
                        j15 = getu32(elfByteChannel, byteBufferAllocate, j14);
                    }
                    if (j15 == 1) {
                        long j31 = z12 ? getu32(elfByteChannel, byteBufferAllocate, j14 + 8) : get64(elfByteChannel, byteBufferAllocate, j14 + 16);
                        long j32 = z12 ? getu32(elfByteChannel, byteBufferAllocate, j14 + 20) : get64(elfByteChannel, byteBufferAllocate, j14 + j25);
                        if (j31 <= j27 && j27 < j31 + j32) {
                            j12 = (z12 ? getu32(elfByteChannel, byteBufferAllocate, j14 + 4) : get64(elfByteChannel, byteBufferAllocate, j14 + 8)) + (j27 - j31);
                            break;
                        }
                    } else {
                        j19 = j19;
                    }
                    j18 = j14 + ((long) i11);
                    i13++;
                    j19 = j19;
                }
                if (j12 == 0) {
                    throw new ElfError("did not find file offset of DT_STRTAB table");
                }
                String[] strArr = new String[i12];
                int i14 = 0;
                do {
                    j13 = z12 ? getu32(elfByteChannel, byteBufferAllocate, j11) : get64(elfByteChannel, byteBufferAllocate, j11);
                    if (j13 == 1) {
                        strArr[i14] = getSz(elfByteChannel, byteBufferAllocate, (z12 ? getu32(elfByteChannel, byteBufferAllocate, j11 + 4) : get64(elfByteChannel, byteBufferAllocate, j11 + 8)) + j12);
                        if (i14 == Integer.MAX_VALUE) {
                            throw new ElfError("malformed DT_NEEDED section");
                        }
                        i14++;
                    }
                    j11 += z12 ? 8L : 16L;
                } while (j13 != 0);
                if (i14 == i12) {
                    return strArr;
                }
                throw new ElfError("malformed DT_NEEDED section");
            }
            j17 = j29;
        }
    }

    private static long get64(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j11) throws IOException {
        read(elfByteChannel, byteBuffer, 8, j11);
        return byteBuffer.getLong();
    }

    private static String getSz(ElfByteChannel elfByteChannel, ByteBuffer byteBuffer, long j11) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short u8Var = getu8(elfByteChannel, byteBuffer, j11);
            if (u8Var == 0) {
                return sb2.toString();
            }
            sb2.append((char) u8Var);
            j11 = j12;
        }
    }

    public static String[] extract_DT_NEEDED(ElfByteChannel elfByteChannel) throws IOException {
        if (elfByteChannel instanceof ElfFileChannel) {
            return extract_DT_NEEDED_with_retries((ElfFileChannel) elfByteChannel);
        }
        return extract_DT_NEEDED_no_retries(elfByteChannel);
    }
}
