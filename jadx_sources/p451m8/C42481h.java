package p451m8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import java.io.IOException;
import p466n8.C42774a;
import p466n8.C42775b;

/* JADX INFO: renamed from: m8.h */
/* JADX INFO: compiled from: StillFrame.java */
/* JADX INFO: loaded from: classes45.dex */
public class C42481h extends AbstractC6949a<C42774a, C42775b> {
    @Override // com.github.penfeizhou.animation.decode.AbstractC6949a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i11, Bitmap bitmap, C42775b c42775b) {
        Bitmap bitmapDecodeStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i11;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(((C42774a) this.reader).toInputStream(), null, options);
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i11;
                options2.inMutable = true;
                bitmapDecodeStream = BitmapFactory.decodeStream(((C42774a) this.reader).toInputStream(), null, options2);
            }
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
                return bitmapDecodeStream;
            } catch (IOException e12) {
                e = e12;
                bitmap2 = bitmapDecodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e13) {
            e = e13;
            e.printStackTrace();
            return bitmap2;
        }
    }

    public C42481h(C42774a c42774a, int i11, int i12) {
        super(c42774a);
        this.frameWidth = i11;
        this.frameHeight = i12;
    }
}
