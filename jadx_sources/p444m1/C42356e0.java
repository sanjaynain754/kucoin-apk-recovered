package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38394b;
import p328i1.C38404l;
import p355j1.C40204g;

/* JADX INFO: renamed from: m1.e0 */
/* JADX INFO: compiled from: RepeaterParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42356e0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93867a = JsonReader.C5103a.m5845a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: renamed from: a */
    public static C40204g m92948a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        String strMo5838o = null;
        C38394b c38394bM92939f = null;
        C38394b c38394bM92939f2 = null;
        C38404l c38404lM92932g = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93867a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                c38394bM92939f = C42353d.m92939f(jsonReader, c5080h, false);
            } else if (iMo5841v == 2) {
                c38394bM92939f2 = C42353d.m92939f(jsonReader, c5080h, false);
            } else if (iMo5841v == 3) {
                c38404lM92932g = C42351c.m92932g(jsonReader, c5080h);
            } else if (iMo5841v != 4) {
                jsonReader.mo5843x();
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        return new C40204g(strMo5838o, c38394bM92939f, c38394bM92939f2, c38404lM92932g, zMo5834k);
    }
}
