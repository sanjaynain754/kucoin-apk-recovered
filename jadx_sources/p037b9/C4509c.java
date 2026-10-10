package p037b9;

import android.graphics.Bitmap;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import java.util.Map;

/* JADX INFO: renamed from: b9.c */
/* JADX INFO: compiled from: BarcodeResult.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4509c {

    /* JADX INFO: renamed from: a */
    public Result f3920a;

    /* JADX INFO: renamed from: b */
    public C4520n f3921b;

    /* JADX INFO: renamed from: c */
    public final int f3922c = 2;

    /* JADX INFO: renamed from: a */
    public BarcodeFormat m4320a() {
        return this.f3920a.getBarcodeFormat();
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m4321b() {
        return this.f3921b.m4359b(2);
    }

    /* JADX INFO: renamed from: c */
    public byte[] m4322c() {
        return this.f3920a.getRawBytes();
    }

    /* JADX INFO: renamed from: d */
    public Map<ResultMetadataType, Object> m4323d() {
        return this.f3920a.getResultMetadata();
    }

    public String toString() {
        return this.f3920a.getText();
    }

    public C4509c(Result result, C4520n c4520n) {
        this.f3920a = result;
        this.f3921b = c4520n;
    }
}
