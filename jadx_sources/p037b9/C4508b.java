package p037b9;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: renamed from: b9.b */
/* JADX INFO: compiled from: BarcodeEncoder.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4508b {
    /* JADX INFO: renamed from: a */
    public Bitmap m4319a(BitMatrix bitMatrix) {
        int i11;
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int[] iArr = new int[width * height];
        for (int i12 = 0; i12 < height; i12++) {
            int i13 = i12 * width;
            for (int i14 = 0; i14 < width; i14++) {
                int i15 = i13 + i14;
                if (bitMatrix.get(i14, i12)) {
                    i11 = ViewCompat.MEASURED_STATE_MASK;
                } else {
                    i11 = -1;
                }
                iArr[i15] = i11;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }
}
