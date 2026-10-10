package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38400h;
import p355j1.C40209l;

/* JADX INFO: renamed from: m1.k0 */
/* JADX INFO: compiled from: ShapePathParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42368k0 {

    /* JADX INFO: renamed from: a */
    public static JsonReader.C5103a f93891a = JsonReader.C5103a.m5845a("nm", "ind", "ks", "hd");

    /* JADX INFO: renamed from: a */
    public static C40209l m92965a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        String strMo5838o = null;
        int iMo5836m = 0;
        boolean zMo5834k = false;
        C38400h c38400hM92944k = null;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93891a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                iMo5836m = jsonReader.mo5836m();
            } else if (iMo5841v == 2) {
                c38400hM92944k = C42353d.m92944k(jsonReader, c5080h);
            } else if (iMo5841v != 3) {
                jsonReader.mo5843x();
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        return new C40209l(strMo5838o, iMo5836m, c38400hM92944k, zMo5834k);
    }
}
