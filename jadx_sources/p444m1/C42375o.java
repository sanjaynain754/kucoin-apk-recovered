package p444m1;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p355j1.C40201d;
import p484o1.C42922d;
import p484o1.C42929k;

/* JADX INFO: renamed from: m1.o */
/* JADX INFO: compiled from: GradientColorParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42375o implements InterfaceC42374n0<C40201d> {

    /* JADX INFO: renamed from: a */
    public int f93899a;

    /* JADX INFO: renamed from: e */
    public static float[] m92971e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            float f11 = i12 < fArr.length ? fArr[i12] : Float.NaN;
            float f12 = i13 < fArr2.length ? fArr2[i13] : Float.NaN;
            if (Float.isNaN(f12) || f11 < f12) {
                fArr3[i14] = f11;
                i12++;
            } else if (Float.isNaN(f11) || f12 < f11) {
                fArr3[i14] = f12;
                i13++;
            } else {
                fArr3[i14] = f11;
                i12++;
                i13++;
                i11++;
            }
        }
        return i11 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i11);
    }

    /* JADX INFO: renamed from: c */
    public int m92973c(float f11, float f12, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f11 == fArr[0]) {
            return iArr[0];
        }
        for (int i11 = 1; i11 < fArr.length; i11++) {
            float f13 = fArr[i11];
            if (f13 >= f11 || i11 == fArr.length - 1) {
                if (i11 == fArr.length - 1 && f11 >= f13) {
                    return Color.argb((int) (f12 * 255.0f), Color.red(iArr[i11]), Color.green(iArr[i11]), Color.blue(iArr[i11]));
                }
                int i12 = i11 - 1;
                float f14 = fArr[i12];
                int iM94154c = C42922d.m94154c((f11 - f14) / (f13 - f14), iArr[i12], iArr[i11]);
                return Color.argb((int) (f12 * 255.0f), Color.red(iM94154c), Color.green(iM94154c), Color.blue(iM94154c));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX INFO: renamed from: d */
    public final int m92974d(float f11, int i11, float[] fArr, float[] fArr2) {
        float fM94195i;
        if (fArr2.length < 2 || f11 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i11), Color.green(i11), Color.blue(i11));
        }
        for (int i12 = 1; i12 < fArr.length; i12++) {
            float f12 = fArr[i12];
            if (f12 >= f11 || i12 == fArr.length - 1) {
                if (f12 <= f11) {
                    fM94195i = fArr2[i12];
                } else {
                    int i13 = i12 - 1;
                    float f13 = fArr[i13];
                    fM94195i = C42929k.m94195i(fArr2[i13], fArr2[i12], (f11 - f13) / (f12 - f13));
                }
                return Color.argb((int) (fM94195i * 255.0f), Color.red(i11), Color.green(i11), Color.blue(i11));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX INFO: renamed from: b */
    public final C40201d m92972b(C40201d c40201d, List<Float> list) {
        int i11 = this.f93899a * 4;
        if (list.size() <= i11) {
            return c40201d;
        }
        float[] fArrM88561e = c40201d.m88561e();
        int[] iArrM88560d = c40201d.m88560d();
        int size = (list.size() - i11) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i12 = 0;
        while (i11 < list.size()) {
            if (i11 % 2 == 0) {
                fArr[i12] = list.get(i11).floatValue();
            } else {
                fArr2[i12] = list.get(i11).floatValue();
                i12++;
            }
            i11++;
        }
        float[] fArrM92971e = m92971e(c40201d.m88561e(), fArr);
        int length = fArrM92971e.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            float f11 = fArrM92971e[i13];
            int iBinarySearch = Arrays.binarySearch(fArrM88561e, f11);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f11);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i13] = m92973c(f11, fArr2[iBinarySearch2], fArrM88561e, iArrM88560d);
            } else {
                iArr[i13] = m92974d(f11, iArrM88560d[iBinarySearch], fArr, fArr2);
            }
        }
        return new C40201d(fArrM92971e, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C40201d mo92921a(JsonReader jsonReader, float f11) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z11 = jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY;
        if (z11) {
            jsonReader.mo5829b();
        }
        while (jsonReader.mo5833j()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo5835l()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f93899a = 2;
        }
        if (z11) {
            jsonReader.mo5831h();
        }
        if (this.f93899a == -1) {
            this.f93899a = arrayList.size() / 4;
        }
        int i11 = this.f93899a;
        float[] fArr = new float[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f93899a * 4; i14++) {
            int i15 = i14 / 4;
            double dFloatValue = arrayList.get(i14).floatValue();
            int i16 = i14 % 4;
            if (i16 != 0) {
                if (i16 == 1) {
                    i12 = (int) (dFloatValue * 255.0d);
                } else if (i16 == 2) {
                    i13 = (int) (dFloatValue * 255.0d);
                } else if (i16 == 3) {
                    iArr[i15] = Color.argb(255, i12, i13, (int) (dFloatValue * 255.0d));
                }
            } else if (i15 > 0) {
                float f12 = (float) dFloatValue;
                if (fArr[i15 - 1] >= f12) {
                    fArr[i15] = f12 + 0.01f;
                } else {
                    fArr[i15] = (float) dFloatValue;
                }
            } else {
                fArr[i15] = (float) dFloatValue;
            }
        }
        return m92972b(new C40201d(fArr, iArr), arrayList);
    }

    public C42375o(int i11) {
        this.f93899a = i11;
    }
}
