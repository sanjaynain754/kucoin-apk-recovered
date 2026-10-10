package p010a8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import org.tensorflow.lite.schema.BuiltinOptions;
import p036b8.C4503a;
import p036b8.C4504b;

/* JADX INFO: renamed from: a8.c */
/* JADX INFO: compiled from: APNGFrame.java */
/* JADX INFO: loaded from: classes45.dex */
public class C0192c extends AbstractC6949a<C4503a, C4504b> {

    /* JADX INFO: renamed from: f */
    public static final byte[] f572f = {-119, BuiltinOptions.UniqueOptions, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 13, 10, 26, 10};

    /* JADX INFO: renamed from: g */
    public static final byte[] f573g = {0, 0, 0, 0, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions, -82, BuiltinOptions.SquareOptions, BuiltinOptions.NonMaxSuppressionV5Options, -126};

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<CRC32> f574h = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final byte f575a;

    /* JADX INFO: renamed from: b */
    public final byte f576b;

    /* JADX INFO: renamed from: c */
    public byte[] f577c;

    /* JADX INFO: renamed from: d */
    public List<C0193d> f578d;

    /* JADX INFO: renamed from: e */
    public List<C0193d> f579e;

    /* JADX INFO: renamed from: b */
    public final int m767b(C4504b c4504b) throws IOException {
        int i11;
        Iterator<C0193d> it = this.f579e.iterator();
        int i12 = 33;
        while (it.hasNext()) {
            i12 += it.next().f580a + 12;
        }
        for (C0193d c0193d : this.f578d) {
            if (c0193d instanceof C0196g) {
                i11 = c0193d.f580a + 12;
            } else if (c0193d instanceof C0195f) {
                i11 = c0193d.f580a + 8;
            }
            i12 += i11;
        }
        int length = i12 + f573g.length;
        c4504b.mo4313d(length);
        c4504b.m12800c(f572f);
        c4504b.m4315h(13);
        int iM12798a = c4504b.m12798a();
        c4504b.m4314g(C0198i.f598h);
        c4504b.m4315h(this.frameWidth);
        c4504b.m4315h(this.frameHeight);
        c4504b.m12800c(this.f577c);
        CRC32 crc32M768c = m768c();
        crc32M768c.reset();
        crc32M768c.update(c4504b.m12802f(), iM12798a, 17);
        c4504b.m4315h((int) crc32M768c.getValue());
        for (C0193d c0193d2 : this.f579e) {
            if (!(c0193d2 instanceof C0197h)) {
                ((C4503a) this.reader).reset();
                ((C4503a) this.reader).skip(c0193d2.f583d);
                ((C4503a) this.reader).read(c4504b.m12802f(), c4504b.m12798a(), c0193d2.f580a + 12);
                c4504b.m12801e(c0193d2.f580a + 12);
            }
        }
        for (C0193d c0193d3 : this.f578d) {
            if (c0193d3 instanceof C0196g) {
                ((C4503a) this.reader).reset();
                ((C4503a) this.reader).skip(c0193d3.f583d);
                ((C4503a) this.reader).read(c4504b.m12802f(), c4504b.m12798a(), c0193d3.f580a + 12);
                c4504b.m12801e(c0193d3.f580a + 12);
            } else if (c0193d3 instanceof C0195f) {
                c4504b.m4315h(c0193d3.f580a - 4);
                int iM12798a2 = c4504b.m12798a();
                c4504b.m4314g(C0196g.f596e);
                ((C4503a) this.reader).reset();
                ((C4503a) this.reader).skip(c0193d3.f583d + 12);
                ((C4503a) this.reader).read(c4504b.m12802f(), c4504b.m12798a(), c0193d3.f580a - 4);
                c4504b.m12801e(c0193d3.f580a - 4);
                crc32M768c.reset();
                crc32M768c.update(c4504b.m12802f(), iM12798a2, c0193d3.f580a);
                c4504b.m4315h((int) crc32M768c.getValue());
            }
        }
        c4504b.m12800c(f573g);
        return length;
    }

    /* JADX INFO: renamed from: c */
    public final CRC32 m768c() {
        ThreadLocal<CRC32> threadLocal = f574h;
        CRC32 crc32 = threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc33 = new CRC32();
        threadLocal.set(crc33);
        return crc33;
    }

    public C0192c(C4503a c4503a, C0194e c0194e) {
        super(c4503a);
        this.f578d = new ArrayList();
        this.f579e = new ArrayList();
        this.f575a = c0194e.f593m;
        this.f576b = c0194e.f592l;
        int i11 = c0194e.f590j * 1000;
        short s11 = c0194e.f591k;
        int i12 = i11 / (s11 == 0 ? (short) 100 : s11);
        this.frameDuration = i12;
        if (i12 < 10) {
            this.frameDuration = 100;
        }
        this.frameWidth = c0194e.f586f;
        this.frameHeight = c0194e.f587g;
        this.frameX = c0194e.f588h;
        this.frameY = c0194e.f589i;
    }

    @Override // com.github.penfeizhou.animation.decode.AbstractC6949a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i11, Bitmap bitmap, C4504b c4504b) {
        Bitmap bitmapDecodeByteArray;
        try {
            int iM767b = m767b(c4504b);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i11;
            options.inMutable = true;
            options.inBitmap = bitmap;
            byte[] bArrM12802f = c4504b.m12802f();
            try {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM12802f, 0, iM767b, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i11;
                options2.inMutable = true;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM12802f, 0, iM767b, options2);
            }
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmapDecodeByteArray.getWidth();
            this.srcRect.bottom = bitmapDecodeByteArray.getHeight();
            Rect rect2 = this.dstRect;
            int i12 = this.frameX;
            float f11 = i11;
            rect2.left = (int) (i12 / f11);
            rect2.top = (int) (this.frameY / f11);
            rect2.right = (int) ((i12 / f11) + bitmapDecodeByteArray.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f11) + bitmapDecodeByteArray.getHeight());
            canvas.drawBitmap(bitmapDecodeByteArray, this.srcRect, this.dstRect, paint);
            return bitmapDecodeByteArray;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
