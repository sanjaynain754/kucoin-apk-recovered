package p444m1;

import android.graphics.Path;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;
import p328i1.C38393a;
import p328i1.C38396d;
import p355j1.C40207j;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.i0 */
/* JADX INFO: compiled from: ShapeFillParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42364i0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93877a = JsonReader.C5103a.m5845a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: renamed from: a */
    public static C40207j m92956a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        C38396d c38396d = null;
        String strMo5838o = null;
        C38393a c38393aM92936c = null;
        boolean zMo5834k = false;
        boolean zMo5834k2 = false;
        int iMo5836m = 1;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93877a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                c38393aM92936c = C42353d.m92936c(jsonReader, c5080h);
            } else if (iMo5841v == 2) {
                c38396d = C42353d.m92941h(jsonReader, c5080h);
            } else if (iMo5841v == 3) {
                zMo5834k = jsonReader.mo5834k();
            } else if (iMo5841v == 4) {
                iMo5836m = jsonReader.mo5836m();
            } else if (iMo5841v != 5) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                zMo5834k2 = jsonReader.mo5834k();
            }
        }
        if (c38396d == null) {
            c38396d = new C38396d(Collections.singletonList(new C43348a(100)));
        }
        return new C40207j(strMo5838o, zMo5834k, iMo5836m == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c38393aM92936c, c38396d, zMo5834k2);
    }
}
