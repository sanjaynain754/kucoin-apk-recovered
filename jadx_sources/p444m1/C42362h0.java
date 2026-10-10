package p444m1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p297h1.C38071a;
import p355j1.C40206i;
import p484o1.C42929k;

/* JADX INFO: renamed from: m1.h0 */
/* JADX INFO: compiled from: ShapeDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42362h0 implements InterfaceC42374n0<C40206i> {

    /* JADX INFO: renamed from: a */
    public static final C42362h0 f93873a = new C42362h0();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93874b = JsonReader.C5103a.m5845a("c", "v", "i", "o");

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C40206i mo92921a(JsonReader jsonReader, float f11) throws IOException {
        if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo5829b();
        }
        jsonReader.mo5830g();
        List<PointF> listM92984f = null;
        List<PointF> listM92984f2 = null;
        List<PointF> listM92984f3 = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93874b);
            if (iMo5841v != 0) {
                if (iMo5841v != 1) {
                    if (iMo5841v != 2) {
                        if (iMo5841v != 3) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            listM92984f3 = C42379s.m92984f(jsonReader, f11);
                        }
                    } else {
                        listM92984f2 = C42379s.m92984f(jsonReader, f11);
                    }
                } else {
                    listM92984f = C42379s.m92984f(jsonReader, f11);
                }
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        jsonReader.mo5832i();
        if (jsonReader.mo5839q() == JsonReader.Token.END_ARRAY) {
            jsonReader.mo5831h();
        }
        if (listM92984f != null && listM92984f2 != null && listM92984f3 != null) {
            if (listM92984f.isEmpty()) {
                return new C40206i(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = listM92984f.size();
            PointF pointF = listM92984f.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 1; i11 < size; i11++) {
                PointF pointF2 = listM92984f.get(i11);
                int i12 = i11 - 1;
                arrayList.add(new C38071a(C42929k.m94187a(listM92984f.get(i12), listM92984f3.get(i12)), C42929k.m94187a(pointF2, listM92984f2.get(i11)), pointF2));
            }
            if (zMo5834k) {
                PointF pointF3 = listM92984f.get(0);
                int i13 = size - 1;
                arrayList.add(new C38071a(C42929k.m94187a(listM92984f.get(i13), listM92984f3.get(i13)), C42929k.m94187a(pointF3, listM92984f2.get(0)), pointF3));
            }
            return new C40206i(pointF, zMo5834k, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
