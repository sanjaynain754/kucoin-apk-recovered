package oc0;

import com.tencentcloudapi.cls.android.producer.common.LogException;
import net.jpountz.lz4.LZ4Compressor;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;

/* JADX INFO: renamed from: oc0.c */
/* JADX INFO: compiled from: LZ4Encoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C43016c {
    /* JADX INFO: renamed from: a */
    public static byte[] m94486a(byte[] bArr) throws LogException {
        int length = bArr.length;
        LZ4Compressor lZ4CompressorFastCompressor = LZ4Factory.fastestInstance().fastCompressor();
        int iMaxCompressedLength = lZ4CompressorFastCompressor.maxCompressedLength(length);
        byte[] bArr2 = new byte[iMaxCompressedLength];
        try {
            int iCompress = lZ4CompressorFastCompressor.compress(bArr, 0, length, bArr2, 0, iMaxCompressedLength);
            if (iCompress <= 0) {
                throw new LogException("CompressException", "Invalid encoding size");
            }
            byte[] bArr3 = new byte[iCompress];
            System.arraycopy(bArr2, 0, bArr3, 0, iCompress);
            return bArr3;
        } catch (LZ4Exception e11) {
            throw new LogException("CompressException", e11.getMessage());
        }
    }
}
