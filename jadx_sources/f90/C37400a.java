package f90;

import com.meituan.android.walle.SignatureNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.p505ws.WebSocketProtocol;

/* JADX INFO: renamed from: f90.a */
/* JADX INFO: compiled from: ApkUtil.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C37400a {
    /* JADX INFO: renamed from: e */
    public static long m84120e(FileChannel fileChannel, long j11) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j11) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    /* JADX INFO: renamed from: c */
    public static C37403d<ByteBuffer, Long> m84118c(FileChannel fileChannel, long j11) throws SignatureNotFoundException, IOException {
        if (j11 < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j11);
        }
        fileChannel.position(j11 - 24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j12 = byteBufferAllocate.getLong(0);
        if (j12 < byteBufferAllocate.capacity() || j12 > 2147483639) {
            throw new SignatureNotFoundException("APK Signing Block size out of range: " + j12);
        }
        int i11 = (int) (8 + j12);
        long j13 = j11 - ((long) i11);
        if (j13 < 0) {
            throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j13);
        }
        fileChannel.position(j13);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
        fileChannel.read(byteBufferAllocate2);
        byteBufferAllocate2.order(byteOrder);
        long j14 = byteBufferAllocate2.getLong(0);
        if (j14 == j12) {
            return C37403d.m84129b(byteBufferAllocate2, Long.valueOf(j13));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j14 + " vs " + j12);
    }

    /* JADX INFO: renamed from: g */
    public static ByteBuffer m84122g(ByteBuffer byteBuffer, int i11) throws BufferUnderflowException {
        if (i11 < 0) {
            throw new IllegalArgumentException("size: " + i11);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (i12 < iPosition || i12 > iLimit) {
            throw new BufferUnderflowException();
        }
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
        }
    }

    /* JADX INFO: renamed from: i */
    public static ByteBuffer m84124i(ByteBuffer byteBuffer, int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("start: " + i11);
        }
        if (i12 < i11) {
            throw new IllegalArgumentException("end < start: " + i12 + " < " + i11);
        }
        int iCapacity = byteBuffer.capacity();
        if (i12 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i12 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m84116a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        } else {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    /* JADX INFO: renamed from: b */
    public static C37403d<ByteBuffer, Long> m84117b(FileChannel fileChannel) throws SignatureNotFoundException, IOException {
        return m84118c(fileChannel, m84119d(fileChannel));
    }

    /* JADX INFO: renamed from: d */
    public static long m84119d(FileChannel fileChannel) throws IOException {
        return m84120e(fileChannel, m84123h(fileChannel));
    }

    /* JADX INFO: renamed from: f */
    public static Map<Integer, ByteBuffer> m84121f(ByteBuffer byteBuffer) throws SignatureNotFoundException {
        m84116a(byteBuffer);
        ByteBuffer byteBufferM84124i = m84124i(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        while (byteBufferM84124i.hasRemaining()) {
            i11++;
            if (byteBufferM84124i.remaining() >= 8) {
                long j11 = byteBufferM84124i.getLong();
                if (j11 >= 4 && j11 <= 2147483647L) {
                    int i12 = (int) j11;
                    int iPosition = byteBufferM84124i.position() + i12;
                    if (i12 <= byteBufferM84124i.remaining()) {
                        linkedHashMap.put(Integer.valueOf(byteBufferM84124i.getInt()), m84122g(byteBufferM84124i, i12 - 4));
                    } else {
                        throw new SignatureNotFoundException("APK Signing Block entry #" + i11 + " size out of range: " + i12 + ", available: " + byteBufferM84124i.remaining());
                    }
                } else {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i11 + " size out of range: " + j11);
                }
            } else {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i11);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: h */
    public static long m84123h(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size >= 22) {
            long j11 = size - 22;
            long jMin = Math.min(j11, WebSocketProtocol.PAYLOAD_SHORT_MAX);
            int i11 = 0;
            while (true) {
                long j12 = i11;
                if (j12 <= jMin) {
                    long j13 = j11 - j12;
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                    fileChannel.position(j13);
                    fileChannel.read(byteBufferAllocate);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    byteBufferAllocate.order(byteOrder);
                    if (byteBufferAllocate.getInt(0) == 101010256) {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j13 + 20);
                        fileChannel.read(byteBufferAllocate2);
                        byteBufferAllocate2.order(byteOrder);
                        short s11 = byteBufferAllocate2.getShort(0);
                        if (s11 == i11) {
                            return s11;
                        }
                    }
                    i11++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }
}
