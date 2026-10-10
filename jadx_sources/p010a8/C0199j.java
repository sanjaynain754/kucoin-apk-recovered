package p010a8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import java.io.IOException;
import p036b8.C4503a;
import p036b8.C4504b;

/* JADX INFO: renamed from: a8.j */
/* JADX INFO: compiled from: StillFrame.java */
/* JADX INFO: loaded from: classes45.dex */
public class C0199j extends AbstractC6949a<C4503a, C4504b> {
    @Override // com.github.penfeizhou.animation.decode.AbstractC6949a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i11, Bitmap bitmap, C4504b c4504b) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i11;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((C4503a) this.reader).reset();
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(((C4503a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i11;
                options2.inMutable = true;
                bitmapDecodeStream = BitmapFactory.decodeStream(((C4503a) this.reader).toInputStream(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
                return bitmapDecodeStream;
            } catch (IOException e11) {
                e = e11;
                bitmap2 = bitmapDecodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public C0199j(C4503a c4503a) {
        super(c4503a);
    }
}
