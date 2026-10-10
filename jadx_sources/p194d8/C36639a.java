package p194d8;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.github.penfeizhou.animation.decode.AbstractC6949a;
import com.github.penfeizhou.animation.decode.FrameSeqDecoder;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;
import p225e8.C37096a;
import p225e8.C37097b;
import p396k8.InterfaceC40939b;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: compiled from: AVIFDecoder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C36639a extends FrameSeqDecoder<C37096a, C37097b> {

    /* JADX INFO: renamed from: w */
    public AvifDecoder f79441w;

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: B */
    public int mo12764B() {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public C37097b mo758C() {
        return null;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: K */
    public void mo760K() {
        AvifDecoder avifDecoder = this.f79441w;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f79441w = null;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: M */
    public void mo761M(AbstractC6949a<C37096a, C37097b> abstractC6949a) {
        Bitmap bitmapM12769H = m12769H(this.f79441w.getWidth(), this.f79441w.getHeight());
        AvifDecoder avifDecoder = this.f79441w;
        if (avifDecoder == null) {
            return;
        }
        int i11 = this.f11574e;
        int i12 = ((C36640b) abstractC6949a).f79442a;
        if (i11 != i12) {
            avifDecoder.nthFrame(i12, bitmapM12769H);
        } else if (i11 == 0) {
            avifDecoder.nthFrame(0, bitmapM12769H);
        } else {
            avifDecoder.nextFrame(bitmapM12769H);
        }
        this.f11584o.rewind();
        try {
            bitmapM12769H.copyPixelsToBuffer(this.f11584o);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        m12770J(bitmapM12769H);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C37096a mo757A(Reader reader) {
        return new C37096a(reader);
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: u */
    public AbstractC6949a<C37096a, C37097b> mo12783u(int i11) {
        C36640b c36640b = new C36640b(null);
        c36640b.f79442a = i11;
        c36640b.frameDuration = (int) (this.f79441w.getFrameDurations()[i11] * 1000.0d);
        return c36640b;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: v */
    public Bitmap mo12784v(int i11) throws IOException {
        if (this.f79441w == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(m12781s().width() / mo12764B(), m12781s().height() / mo12764B(), Bitmap.Config.ARGB_8888);
        this.f79441w.nthFrame(i11, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: w */
    public int mo12785w() {
        AvifDecoder avifDecoder = this.f79441w;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: x */
    public int mo765x() {
        AvifDecoder avifDecoder = this.f79441w;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f79441w.getRepetitionCount();
    }

    public C36639a(InterfaceC40939b interfaceC40939b, @Nullable FrameSeqDecoder.InterfaceC6948j interfaceC6948j) {
        super(interfaceC40939b, interfaceC6948j);
        this.f79441w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.FrameSeqDecoder
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public Rect mo759I(C37096a c37096a) throws IOException {
        this.f79441w = AvifDecoder.create(c37096a.m83025a());
        return new Rect(0, 0, this.f79441w.getWidth(), this.f79441w.getHeight());
    }
}
