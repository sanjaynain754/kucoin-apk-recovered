package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.Quirk;
import com.tencent.bugly.proguard.C33556b3;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class IncorrectJpegMetadataQuirk implements Quirk {
    private static final Set<String> SAMSUNG_DEVICES = new HashSet(Arrays.asList(C33556b3.f68993R0, "BEYOND0", "BEYOND2"));

    private boolean canParseSosMarker(byte[] bArr) {
        byte b11;
        int i11 = 2;
        while (i11 + 4 <= bArr.length && (b11 = bArr[i11]) == -1) {
            if (b11 == -1 && bArr[i11 + 1] == -38) {
                return true;
            }
            i11 += (((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255)) + 2;
        }
        return false;
    }

    private int findSecondFfd8Position(byte[] bArr) {
        int i11 = 2;
        while (true) {
            int i12 = i11 + 1;
            if (i12 > bArr.length) {
                return -1;
            }
            if (bArr[i11] == -1 && bArr[i12] == -40) {
                return i11;
            }
            i11 = i12;
        }
    }

    private static boolean isSamsungProblematicDevice() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DEVICES.contains(Build.DEVICE.toUpperCase(Locale.US));
    }

    public static boolean load() {
        return isSamsungProblematicDevice();
    }

    public byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        int iFindSecondFfd8Position = 0;
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        if (!canParseSosMarker(bArr) && (iFindSecondFfd8Position = findSecondFfd8Position(bArr)) == -1) {
            return bArr;
        }
        return Arrays.copyOfRange(bArr, iFindSecondFfd8Position, buffer.limit());
    }
}
