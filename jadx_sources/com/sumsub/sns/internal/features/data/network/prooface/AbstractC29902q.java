package com.sumsub.sns.internal.features.data.network.prooface;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p852kotlin.collections.IntIterator;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29902q {

    /* JADX INFO: renamed from: a */
    public static AtomicLong f60022a = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public static byte[] m69947a(byte[] bArr, int i11, byte b11, long j11) {
        int i12 = i11 - 1;
        for (int i13 = 0; i13 <= i12; i13++) {
            long j12 = ((long) i13) * j11;
            long j13 = (j12 * j12) + j12;
            long j14 = (j13 << 32) | (j13 >>> 32);
            long j15 = (j14 * j14) + j12 + j11;
            long j16 = (j15 >>> 32) | (j15 << 32);
            int iAbs = Math.abs((int) (((j16 * j16) + j12) >>> 32));
            if (i13 < i12) {
                int i14 = (iAbs % (i11 - i13)) + i13;
                byte b12 = bArr[i13];
                bArr[i13] = bArr[i14];
                bArr[i14] = b12;
            }
            bArr[i13] = (byte) (bArr[i13] ^ (((b11 + i13) + iAbs) + 1));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m69946a(long j11) {
        long j12;
        long j13;
        f60022a = new AtomicLong(j11);
        Integer[] numArr = new Integer[15];
        int i11 = 0;
        for (int i12 = 0; i12 < 15; i12++) {
            AtomicLong atomicLong = f60022a;
            do {
                j12 = atomicLong.get();
                j13 = ((25214903917L * j12) + 11) & 281474976710655L;
            } while (!atomicLong.compareAndSet(j12, j13));
            numArr[i12] = Integer.valueOf((int) (j13 >>> 16));
        }
        int iIntValue = numArr[0].intValue();
        Iterator<Integer> it = RangesKt.until(1, 5).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt() * 3;
            if (numArr[iNextInt].intValue() > iIntValue) {
                iIntValue = numArr[iNextInt].intValue();
                i11 = iNextInt;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(numArr[i11].intValue());
        byteBufferAllocate.putInt(numArr[i11 + 1].intValue());
        byteBufferAllocate.putInt(numArr[i11 + 2].intValue());
        return byteBufferAllocate.array();
    }
}
