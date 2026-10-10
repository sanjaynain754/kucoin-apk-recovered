package p304h8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.gif.decode.C6951b;
import com.github.penfeizhou.animation.gif.decode.GifFrame;
import com.github.penfeizhou.animation.gif.decode.GifParser;
import com.github.penfeizhou.animation.gif.p064io.GifReader;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import p335i8.C38483a;
import p396k8.InterfaceC40939b;

/* JADX INFO: renamed from: h8.f */
/* JADX INFO: compiled from: GifDecoder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38144f extends FrameSeqDecoder<GifReader, C38483a> {

    /* JADX INFO: renamed from: A */
    public int f85816A;

    /* JADX INFO: renamed from: w */
    public C38483a f85817w;

    /* JADX INFO: renamed from: x */
    public final Paint f85818x;

    /* JADX INFO: renamed from: y */
    public int f85819y;

    /* JADX INFO: renamed from: z */
    public final b f85820z;

    /* JADX INFO: renamed from: h8.f$b */
    /* JADX INFO: compiled from: GifDecoder.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public ByteBuffer f85821a;

        public b() {
        }
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: M */
    public void mo761M(AbstractC6949a<GifReader, C38483a> abstractC6949a) {
        GifFrame gifFrame = (GifFrame) abstractC6949a;
        Bitmap bitmapM12769H = m12769H(this.f11585p.width() / this.f11580k, this.f11585p.height() / this.f11580k);
        Canvas canvas = this.f11583n.get(bitmapM12769H);
        if (canvas == null) {
            canvas = new Canvas(bitmapM12769H);
            this.f11583n.put(bitmapM12769H, canvas);
        }
        this.f11584o.rewind();
        bitmapM12769H.copyPixelsFromBuffer(this.f11584o);
        int i11 = !gifFrame.transparencyFlag() ? this.f85819y : 0;
        int i12 = this.f11574e;
        if (i12 == 0) {
            bitmapM12769H.eraseColor(i11);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f11573d.get(i12 - 1);
            canvas.save();
            int i13 = gifFrame2.frameX;
            int i14 = this.f11580k;
            int i15 = gifFrame2.frameY;
            canvas.clipRect(i13 / i14, i15 / i14, (i13 + gifFrame2.frameWidth) / i14, (i15 + gifFrame2.frameHeight) / i14);
            int i16 = gifFrame2.disposalMethod;
            if (i16 == 2) {
                canvas.drawColor(this.f85819y, PorterDuff.Mode.CLEAR);
            } else if (i16 == 3) {
                this.f85820z.f85821a.rewind();
                canvas.drawColor(this.f85819y, PorterDuff.Mode.CLEAR);
                Bitmap bitmapM12769H2 = m12769H(this.f11585p.width() / this.f11580k, this.f11585p.height() / this.f11580k);
                bitmapM12769H2.copyPixelsFromBuffer(this.f85820z.f85821a);
                canvas.drawBitmap(bitmapM12769H2, 0.0f, 0.0f, this.f85818x);
                m12770J(bitmapM12769H2);
            }
            canvas.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f11584o.rewind();
                this.f85820z.f85821a.rewind();
                this.f85820z.f85821a.put(this.f11584o);
            }
        }
        int i17 = abstractC6949a.frameWidth;
        int i18 = this.f11580k;
        Bitmap bitmapM12769H3 = m12769H(i17 / i18, abstractC6949a.frameHeight / i18);
        gifFrame.draw(canvas, this.f85818x, this.f11580k, bitmapM12769H3, mo758C());
        canvas.drawColor(i11, PorterDuff.Mode.DST_OVER);
        m12770J(bitmapM12769H3);
        this.f11584o.rewind();
        bitmapM12769H.copyPixelsToBuffer(this.f11584o);
        m12770J(bitmapM12769H);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: t */
    public int mo12782t(int i11, int i12) {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: K */
    public void mo760K() {
        this.f85820z.f85821a = null;
        this.f85817w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public GifReader mo757A(Reader reader) {
        return new GifReader(reader);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C38483a mo758C() {
        if (this.f85817w == null) {
            this.f85817w = new C38483a();
        }
        return this.f85817w;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: x */
    public int mo765x() {
        return this.f85816A;
    }

    public C38144f(InterfaceC40939b interfaceC40939b, FrameSeqDecoder.InterfaceC6948j interfaceC6948j) {
        super(interfaceC40939b, interfaceC6948j);
        this.f85817w = new C38483a();
        Paint paint = new Paint();
        this.f85818x = paint;
        this.f85819y = 0;
        this.f85820z = new b();
        this.f85816A = 1;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect mo759I(GifReader gifReader) throws IOException {
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        C38141c c38141c = null;
        C6951b c6951b = null;
        for (InterfaceC38140b interfaceC38140b : GifParser.m12793c(gifReader)) {
            if (interfaceC38140b instanceof C38146h) {
                C38146h c38146h = (C38146h) interfaceC38140b;
                i12 = c38146h.f85830a;
                i13 = c38146h.f85831b;
                if (c38146h.m86069b()) {
                    i11 = c38146h.f85833d & 255;
                }
            } else if (interfaceC38140b instanceof C38141c) {
                c38141c = (C38141c) interfaceC38140b;
            } else if (interfaceC38140b instanceof C6951b) {
                c6951b = (C6951b) interfaceC38140b;
            } else if (interfaceC38140b instanceof C38145g) {
                this.f11573d.add(new GifFrame(gifReader, c38141c, c6951b, (C38145g) interfaceC38140b));
            } else if (interfaceC38140b instanceof C38139a) {
                C38139a c38139a = (C38139a) interfaceC38140b;
                if ("NETSCAPE2.0".equals(c38139a.f85810b)) {
                    int i14 = c38139a.f85809a;
                    if (i14 == 0) {
                        this.f85816A = 0;
                    } else if (i14 > 0) {
                        this.f85816A = i14 + 1;
                    }
                }
            }
        }
        int i15 = this.f11580k;
        long j11 = (((((long) i12) * ((long) i13)) / (((long) i15) * ((long) i15))) + 1) * 4;
        int i16 = (int) j11;
        try {
            this.f11584o = ByteBuffer.allocate(i16);
            this.f85820z.f85821a = ByteBuffer.allocate(i16);
            if (c38141c != null && i11 >= 0 && i11 < c38141c.m86060b().length) {
                int i17 = c38141c.m86060b()[i11];
                this.f85819y = Color.rgb(i17 & 255, (i17 >> 8) & 255, (i17 >> 16) & 255);
            }
            return new Rect(0, 0, i12, i13);
        } catch (OutOfMemoryError e11) {
            Log.e("GifDecoder", String.format("OutOfMemoryError in GifDecoder: Buffer needed: %.2fMB (%,d bytes)", Double.valueOf(j11 / 1048576.0d), Long.valueOf(j11)));
            this.f11584o = null;
            this.f85820z.f85821a = null;
            throw e11;
        }
    }
}
