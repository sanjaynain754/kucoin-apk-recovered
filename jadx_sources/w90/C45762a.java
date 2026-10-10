package w90;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.encoder.EncoderConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: w90.a */
/* JADX INFO: compiled from: AvcCsdUtils.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45762a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f103192a = {0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final byte[] f103193b = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static void m101046b(@NonNull ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr);
        if (Arrays.equals(bArr, f103192a)) {
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 4);
        bArrCopyOf[3] = byteBuffer.get();
        if (!Arrays.equals(bArrCopyOf, f103193b)) {
            throw new IllegalStateException("AVC NAL start code not found in csd.");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m101045a(@NonNull MediaFormat mediaFormat) {
        ByteBuffer byteBufferAsReadOnlyBuffer = mediaFormat.getByteBuffer(EncoderConfig.KEY_CSD_0).asReadOnlyBuffer();
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(byteBufferAsReadOnlyBuffer.limit()).order(byteBufferAsReadOnlyBuffer.order());
        byteBufferOrder.put(byteBufferAsReadOnlyBuffer);
        byteBufferOrder.flip();
        m101046b(byteBufferOrder);
        byte b11 = byteBufferOrder.get();
        if (b11 == 103 || b11 == 39 || b11 == 71) {
            return byteBufferOrder.slice();
        }
        throw new IllegalStateException("Got non SPS NAL data.");
    }
}
