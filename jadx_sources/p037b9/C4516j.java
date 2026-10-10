package p037b9;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.common.HybridBinarizer;

/* JADX INFO: renamed from: b9.j */
/* JADX INFO: compiled from: MixedDecoder.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4516j extends C4510d {

    /* JADX INFO: renamed from: c */
    public boolean f3943c;

    @Override // p037b9.C4510d
    /* JADX INFO: renamed from: d */
    public BinaryBitmap mo4327d(LuminanceSource luminanceSource) {
        if (this.f3943c) {
            this.f3943c = false;
            return new BinaryBitmap(new HybridBinarizer(luminanceSource.invert()));
        }
        this.f3943c = true;
        return new BinaryBitmap(new HybridBinarizer(luminanceSource));
    }

    public C4516j(Reader reader) {
        super(reader);
        this.f3943c = true;
    }
}
