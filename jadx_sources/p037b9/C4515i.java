package p037b9;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.common.HybridBinarizer;

/* JADX INFO: renamed from: b9.i */
/* JADX INFO: compiled from: InvertedDecoder.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4515i extends C4510d {
    @Override // p037b9.C4510d
    /* JADX INFO: renamed from: d */
    public BinaryBitmap mo4327d(LuminanceSource luminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(luminanceSource.invert()));
    }

    public C4515i(Reader reader) {
        super(reader);
    }
}
