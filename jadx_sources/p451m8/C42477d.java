package p451m8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import com.jumio.core.constants.ConstantsKt;
import java.io.IOException;
import p466n8.C42774a;
import p466n8.C42775b;

/* JADX INFO: renamed from: m8.d */
/* JADX INFO: compiled from: AnimationFrame.java */
/* JADX INFO: loaded from: classes.dex */
public class C42477d extends AbstractC6949a<C42774a, C42775b> {

    /* JADX INFO: renamed from: f */
    public static final PorterDuffXfermode f94113f = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);

    /* JADX INFO: renamed from: g */
    public static final PorterDuffXfermode f94114g = new PorterDuffXfermode(PorterDuff.Mode.SRC);

    /* JADX INFO: renamed from: a */
    public final int f94115a;

    /* JADX INFO: renamed from: b */
    public final int f94116b;

    /* JADX INFO: renamed from: c */
    public final boolean f94117c;

    /* JADX INFO: renamed from: d */
    public final boolean f94118d;

    /* JADX INFO: renamed from: e */
    public final boolean f94119e;

    @Override // com.github.penfeizhou.animation.decode.AbstractC6949a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i11, Bitmap bitmap, C42775b c42775b) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i11;
        options.inMutable = true;
        options.inBitmap = bitmap;
        int iM93166b = m93166b(c42775b);
        byte[] bArrM12802f = c42775b.m12802f();
        try {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM12802f, 0, iM93166b, options);
        } catch (IllegalArgumentException unused) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = false;
            options2.inSampleSize = i11;
            options2.inMutable = true;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM12802f, 0, iM93166b, options2);
        }
        if (bitmapDecodeByteArray == null) {
            return bitmap;
        }
        if (this.f94117c) {
            paint.setXfermode(f94114g);
        } else {
            paint.setXfermode(f94113f);
        }
        Rect rect = this.srcRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = bitmapDecodeByteArray.getWidth();
        this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
        Rect rect2 = this.dstRect;
        int i12 = this.frameX;
        float f11 = i11;
        rect2.left = (int) ((i12 * 2.0f) / f11);
        rect2.top = (int) ((this.frameY * 2.0f) / f11);
        rect2.right = (int) (((i12 * 2.0f) / f11) + bitmapDecodeByteArray.getWidth());
        this.dstRect.bottom = (int) (((this.frameY * 2.0f) / f11) + bitmapDecodeByteArray.getHeight());
        canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
        return bitmapDecodeByteArray;
    }

    /* JADX INFO: renamed from: b */
    public final int m93166b(C42775b c42775b) {
        int i11 = 30 + this.f94116b;
        c42775b.mo4313d(i11);
        c42775b.m93729h("RIFF");
        c42775b.m93731j(i11);
        c42775b.m93729h(ConstantsKt.FILE_TYPE_WEBP);
        c42775b.m93731j(C42484k.f94127g);
        c42775b.m93731j(10);
        c42775b.m12799b((byte) (this.f94119e ? 16 : 0));
        c42775b.m93730i(0);
        c42775b.m93728g(this.frameWidth);
        c42775b.m93728g(this.frameHeight);
        try {
            ((C42774a) this.reader).reset();
            ((C42774a) this.reader).skip(this.f94115a);
            ((C42774a) this.reader).read(c42775b.m12802f(), c42775b.m12798a(), this.f94116b);
            return i11;
        } catch (IOException e11) {
            e11.printStackTrace();
            return i11;
        }
    }

    public C42477d(C42774a c42774a, C42476c c42476c) {
        super(c42774a);
        this.frameWidth = c42476c.f94106f;
        this.frameHeight = c42476c.f94107g;
        this.frameX = c42476c.f94104d;
        this.frameY = c42476c.f94105e;
        int i11 = c42476c.f94108h;
        this.frameDuration = i11;
        if (i11 == 0) {
            this.frameDuration = 100;
        }
        this.f94117c = c42476c.m93163d();
        this.f94118d = c42476c.m93164e();
        this.f94115a = c42476c.f94122c + 24;
        int i12 = c42476c.f94121b;
        this.f94116b = (i12 - 16) + (i12 & 1);
        this.f94119e = c42476c.f94110j != null;
    }
}
