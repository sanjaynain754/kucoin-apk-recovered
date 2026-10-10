package p451m8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.p065io.Reader;
import com.github.penfeizhou.animation.webp.decode.WebPParser;
import java.io.IOException;
import p396k8.InterfaceC40939b;
import p466n8.C42774a;
import p466n8.C42775b;

/* JADX INFO: renamed from: m8.l */
/* JADX INFO: compiled from: WebPDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C42485l extends FrameSeqDecoder<C42774a, C42775b> {

    /* JADX INFO: renamed from: A */
    public int f94131A;

    /* JADX INFO: renamed from: B */
    public boolean f94132B;

    /* JADX INFO: renamed from: C */
    public int f94133C;

    /* JADX INFO: renamed from: D */
    public C42775b f94134D;

    /* JADX INFO: renamed from: w */
    public final Paint f94135w;

    /* JADX INFO: renamed from: x */
    public Paint f94136x;

    /* JADX INFO: renamed from: y */
    public int f94137y;

    /* JADX INFO: renamed from: z */
    public int f94138z;

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: M */
    public void mo761M(AbstractC6949a<C42774a, C42775b> abstractC6949a) {
        Bitmap bitmapM12769H;
        Bitmap bitmapM12769H2;
        int i11;
        if (abstractC6949a == null || this.f11585p == null || this.f11585p.width() <= 0 || this.f11585p.height() <= 0 || (bitmapM12769H = m12769H(this.f11585p.width() / this.f11580k, this.f11585p.height() / this.f11580k)) == null) {
            return;
        }
        Canvas canvas = this.f11583n.get(bitmapM12769H);
        if (canvas == null) {
            canvas = new Canvas(bitmapM12769H);
            this.f11583n.put(bitmapM12769H, canvas);
        }
        Canvas canvas2 = canvas;
        this.f11584o.rewind();
        bitmapM12769H.copyPixelsFromBuffer(this.f11584o);
        int i12 = this.f11574e;
        if (i12 != 0) {
            AbstractC6949a abstractC6949a2 = (AbstractC6949a) this.f11573d.get(i12 - 1);
            if ((abstractC6949a2 instanceof C42477d) && ((C42477d) abstractC6949a2).f94118d) {
                int i13 = abstractC6949a2.frameX;
                int i14 = this.f11580k;
                int i15 = abstractC6949a2.frameY;
                canvas2.drawRect((i13 * 2.0f) / i14, (i15 * 2.0f) / i14, ((i13 * 2) + abstractC6949a2.frameWidth) / i14, ((i15 * 2) + abstractC6949a2.frameHeight) / i14, this.f94135w);
            }
        } else if (this.f94132B) {
            canvas2.drawColor(0, PorterDuff.Mode.SRC);
        } else {
            canvas2.drawColor(this.f94133C, PorterDuff.Mode.SRC);
        }
        int i16 = abstractC6949a.frameWidth;
        if (i16 <= 0 || (i11 = abstractC6949a.frameHeight) <= 0) {
            bitmapM12769H2 = null;
        } else {
            int i17 = this.f11580k;
            bitmapM12769H2 = m12769H(i16 / i17, i11 / i17);
        }
        Bitmap bitmap = bitmapM12769H2;
        m12770J(abstractC6949a.draw(canvas2, this.f94136x, this.f11580k, bitmap, mo758C()));
        m12770J(bitmap);
        this.f11584o.rewind();
        bitmapM12769H.copyPixelsToBuffer(this.f11584o);
        m12770J(bitmapM12769H);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C42774a mo757A(Reader reader) {
        return new C42774a(reader);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C42775b mo758C() {
        if (this.f94134D == null) {
            this.f94134D = new C42775b();
        }
        return this.f94134D;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: x */
    public int mo765x() {
        return this.f94137y;
    }

    public C42485l(InterfaceC40939b interfaceC40939b, FrameSeqDecoder.InterfaceC6948j interfaceC6948j) {
        super(interfaceC40939b, interfaceC6948j);
        Paint paint = new Paint();
        this.f94135w = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect mo759I(C42774a c42774a) throws IOException {
        boolean z11 = false;
        boolean z12 = false;
        for (C42478e c42478e : WebPParser.m12804b(c42774a)) {
            if (c42478e instanceof C42484k) {
                C42484k c42484k = (C42484k) c42478e;
                this.f94138z = c42484k.f94129e;
                this.f94131A = c42484k.f94130f;
                this.f94132B = c42484k.m93170d();
                z12 = true;
            } else if (c42478e instanceof C42475b) {
                C42475b c42475b = (C42475b) c42478e;
                this.f94133C = c42475b.f94101d;
                this.f94137y = c42475b.f94102e;
                z11 = true;
            } else if (c42478e instanceof C42476c) {
                this.f11573d.add(new C42477d(c42774a, (C42476c) c42478e));
            }
        }
        if (!z11) {
            if (!z12) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(c42774a.toInputStream(), null, options);
                this.f94138z = options.outWidth;
                this.f94131A = options.outHeight;
            }
            this.f11573d.add(new C42481h(c42774a, this.f94138z, this.f94131A));
            this.f94137y = 1;
        }
        Paint paint = new Paint();
        this.f94136x = paint;
        paint.setAntiAlias(true);
        if (!this.f94132B) {
            this.f94135w.setColor(this.f94133C);
        }
        return new Rect(0, 0, this.f94138z, this.f94131A);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: K */
    public void mo760K() {
    }
}
