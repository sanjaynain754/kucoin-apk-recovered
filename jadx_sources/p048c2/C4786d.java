package p048c2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import p030b2.AbstractC4465k;
import p680v1.InterfaceC45359j;
import p710w1.C45687e;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.d */
/* JADX INFO: compiled from: BitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(api = 28)
public final class C4786d extends AbstractC4465k<Bitmap> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC45686d f4806b = new C45687e();

    @Override // p030b2.AbstractC4465k
    /* JADX INFO: renamed from: c */
    public InterfaceC45359j<Bitmap> mo4263c(ImageDecoder.Source source, int i11, int i12, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, imageDecoder$OnHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i11 + "x" + i12 + "]");
        }
        return new C4788e(bitmapDecodeBitmap, this.f4806b);
    }
}
