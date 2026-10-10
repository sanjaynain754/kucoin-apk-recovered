package p037b9;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.HybridBinarizer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b9.d */
/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4510d implements ResultPointCallback {

    /* JADX INFO: renamed from: a */
    public Reader f3923a;

    /* JADX INFO: renamed from: b */
    public List<ResultPoint> f3924b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public Result m4324a(BinaryBitmap binaryBitmap) {
        this.f3924b.clear();
        try {
            Reader reader = this.f3923a;
            return reader instanceof MultiFormatReader ? ((MultiFormatReader) reader).decodeWithState(binaryBitmap) : reader.decode(binaryBitmap);
        } catch (Exception unused) {
            return null;
        } finally {
            this.f3923a.reset();
        }
    }

    /* JADX INFO: renamed from: c */
    public List<ResultPoint> m4326c() {
        return new ArrayList(this.f3924b);
    }

    /* JADX INFO: renamed from: d */
    public BinaryBitmap mo4327d(LuminanceSource luminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(luminanceSource));
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.f3924b.add(resultPoint);
    }

    public C4510d(Reader reader) {
        this.f3923a = reader;
    }

    /* JADX INFO: renamed from: b */
    public Result m4325b(LuminanceSource luminanceSource) {
        return m4324a(mo4327d(luminanceSource));
    }
}
