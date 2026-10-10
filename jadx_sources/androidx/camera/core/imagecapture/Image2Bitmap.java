package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.jumio.core.constants.ConstantsKt;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public class Image2Bitmap implements Operation<Packet<ImageProxy>, Bitmap> {
    @Override // androidx.camera.core.processing.Operation
    public Bitmap apply(Packet<ImageProxy> packet) throws Throwable {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        Bitmap bitmapRotateBitmap;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = null;
        try {
            try {
                int format = packet.getFormat();
                if (format == 35) {
                    ImageProxy data = packet.getData();
                    boolean z11 = packet.getRotationDegrees() % 180 != 0;
                    safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(z11 ? data.getHeight() : data.getWidth(), z11 ? data.getWidth() : data.getHeight(), 1, 2));
                    try {
                        ImageProxy imageProxyConvertYUVToRGB = ImageProcessingUtil.convertYUVToRGB(data, safeCloseImageReaderProxy, ByteBuffer.allocateDirect(data.getWidth() * data.getHeight() * 4), packet.getRotationDegrees(), false);
                        data.close();
                        if (imageProxyConvertYUVToRGB == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapRotateBitmap = ImageUtil.createBitmapFromImageProxy(imageProxyConvertYUVToRGB);
                        imageProxyConvertYUVToRGB.close();
                    } catch (UnsupportedOperationException e11) {
                        e = e11;
                        throw new ImageCaptureException(0, "Can't convert " + (packet.getFormat() == 35 ? "YUV" : ConstantsKt.FILE_TYPE_JPEG) + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        safeCloseImageReaderProxy2 = safeCloseImageReaderProxy;
                        if (safeCloseImageReaderProxy2 != null) {
                            safeCloseImageReaderProxy2.close();
                        }
                        throw th;
                    }
                } else {
                    if (format != 256 && format != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + packet.getFormat());
                    }
                    ImageProxy data2 = packet.getData();
                    Bitmap bitmapCreateBitmapFromImageProxy = ImageUtil.createBitmapFromImageProxy(data2);
                    data2.close();
                    safeCloseImageReaderProxy = null;
                    bitmapRotateBitmap = ImageUtil.rotateBitmap(bitmapCreateBitmapFromImageProxy, packet.getRotationDegrees());
                }
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.close();
                }
                return bitmapRotateBitmap;
            } catch (UnsupportedOperationException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
