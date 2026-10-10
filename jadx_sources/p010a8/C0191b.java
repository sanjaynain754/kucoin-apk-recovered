package p010a8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.apng.decode.APNGParser;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p036b8.C4503a;
import p036b8.C4504b;
import p396k8.InterfaceC40939b;

/* JADX INFO: renamed from: a8.b */
/* JADX INFO: compiled from: APNGDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C0191b extends FrameSeqDecoder<C4503a, C4504b> {

    /* JADX INFO: renamed from: A */
    public static final String f564A = "b";

    /* JADX INFO: renamed from: w */
    public C4504b f565w;

    /* JADX INFO: renamed from: x */
    public int f566x;

    /* JADX INFO: renamed from: y */
    public final Paint f567y;

    /* JADX INFO: renamed from: z */
    public final b f568z;

    /* JADX INFO: renamed from: a8.b$b */
    /* JADX INFO: compiled from: APNGDecoder.java */
    /* JADX INFO: loaded from: classes45.dex */
    public static class b {

        /* JADX INFO: renamed from: a */
        public byte f569a;

        /* JADX INFO: renamed from: b */
        public Rect f570b;

        /* JADX INFO: renamed from: c */
        public ByteBuffer f571c;

        public b() {
            this.f570b = new Rect();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: K */
    public void mo760K() {
        this.f568z.f571c = null;
        this.f565w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: M */
    public void mo761M(AbstractC6949a<C4503a, C4504b> abstractC6949a) {
        if (abstractC6949a == null || this.f11585p == null) {
            return;
        }
        try {
            Bitmap bitmapM12769H = m12769H(this.f11585p.width() / this.f11580k, this.f11585p.height() / this.f11580k);
            Canvas canvas = this.f11583n.get(bitmapM12769H);
            if (canvas == null) {
                canvas = new Canvas(bitmapM12769H);
                this.f11583n.put(bitmapM12769H, canvas);
            }
            Canvas canvas2 = canvas;
            if (abstractC6949a instanceof C0192c) {
                this.f11584o.rewind();
                bitmapM12769H.copyPixelsFromBuffer(this.f11584o);
                if (this.f11574e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.f568z.f570b);
                    b bVar = this.f568z;
                    byte b11 = bVar.f569a;
                    if (b11 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b11 == 2) {
                        bVar.f571c.rewind();
                        bitmapM12769H.copyPixelsFromBuffer(this.f568z.f571c);
                    }
                    canvas2.restore();
                }
                if (((C0192c) abstractC6949a).f576b == 2) {
                    b bVar2 = this.f568z;
                    if (bVar2.f569a != 2) {
                        bVar2.f571c.rewind();
                        bitmapM12769H.copyPixelsToBuffer(this.f568z.f571c);
                    }
                }
                this.f568z.f569a = ((C0192c) abstractC6949a).f576b;
                canvas2.save();
                if (((C0192c) abstractC6949a).f575a == 0) {
                    int i11 = abstractC6949a.frameX;
                    int i12 = this.f11580k;
                    int i13 = abstractC6949a.frameY;
                    canvas2.clipRect(i11 / i12, i13 / i12, (i11 + abstractC6949a.frameWidth) / i12, (i13 + abstractC6949a.frameHeight) / i12);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.f568z.f570b;
                int i14 = abstractC6949a.frameX;
                int i15 = this.f11580k;
                int i16 = abstractC6949a.frameY;
                rect.set(i14 / i15, i16 / i15, (i14 + abstractC6949a.frameWidth) / i15, (i16 + abstractC6949a.frameHeight) / i15);
                canvas2.restore();
            }
            Bitmap bitmapM12769H2 = m12769H(abstractC6949a.frameWidth, abstractC6949a.frameHeight);
            m12770J(abstractC6949a.draw(canvas2, this.f567y, this.f11580k, bitmapM12769H2, mo758C()));
            m12770J(bitmapM12769H2);
            this.f11584o.rewind();
            bitmapM12769H.copyPixelsToBuffer(this.f11584o);
            m12770J(bitmapM12769H);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C4503a mo757A(Reader reader) {
        return new C4503a(reader);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C4504b mo758C() {
        if (this.f565w == null) {
            this.f565w = new C4504b();
        }
        return this.f565w;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: x */
    public int mo765x() {
        return this.f566x;
    }

    public C0191b(InterfaceC40939b interfaceC40939b, FrameSeqDecoder.InterfaceC6948j interfaceC6948j) {
        super(interfaceC40939b, interfaceC6948j);
        Paint paint = new Paint();
        this.f567y = paint;
        this.f568z = new b();
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect mo759I(C4503a c4503a) throws IOException {
        List<C0193d> listM12747b = APNGParser.m12747b(c4503a);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        C0192c c0192c = null;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        for (C0193d c0193d : listM12747b) {
            boolean z12 = c0193d instanceof C0197h;
            if (z12) {
                Log.e(f564A, "chunk read reach to end");
                break;
            }
            if (c0193d instanceof C0190a) {
                this.f566x = ((C0190a) c0193d).f563f;
                z11 = true;
            } else if (c0193d instanceof C0194e) {
                c0192c = new C0192c(c4503a, (C0194e) c0193d);
                c0192c.f579e = arrayList;
                c0192c.f577c = bArr;
                this.f11573d.add(c0192c);
            } else if (c0193d instanceof C0195f) {
                if (c0192c != null) {
                    c0192c.f578d.add(c0193d);
                }
            } else if (c0193d instanceof C0196g) {
                if (!z11) {
                    C0199j c0199j = new C0199j(c4503a);
                    c0199j.frameWidth = i11;
                    c0199j.frameHeight = i12;
                    this.f11573d.add(c0199j);
                    this.f566x = 1;
                    break;
                }
                if (c0192c != null) {
                    c0192c.f578d.add(c0193d);
                }
            } else if (c0193d instanceof C0198i) {
                C0198i c0198i = (C0198i) c0193d;
                i11 = c0198i.f599e;
                i12 = c0198i.f600f;
                bArr = c0198i.f601g;
            } else if (!z12) {
                arrayList.add(c0193d);
            }
        }
        int i13 = i11 * i12;
        int i14 = this.f11580k;
        this.f11584o = ByteBuffer.allocate(((i13 / (i14 * i14)) + 1) * 4);
        b bVar = this.f568z;
        int i15 = this.f11580k;
        bVar.f571c = ByteBuffer.allocate(((i13 / (i15 * i15)) + 1) * 4);
        return new Rect(0, 0, i11, i12);
    }
}
