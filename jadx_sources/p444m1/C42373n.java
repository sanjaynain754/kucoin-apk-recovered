package p444m1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p297h1.C38072b;

/* JADX INFO: renamed from: m1.n */
/* JADX INFO: compiled from: FontParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42373n {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93898a = JsonReader.C5103a.m5845a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: renamed from: a */
    public static C38072b m92970a(JsonReader jsonReader) throws IOException {
        jsonReader.mo5830g();
        String strMo5838o = null;
        String strMo5838o2 = null;
        float fMo5835l = 0.0f;
        String strMo5838o3 = null;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93898a);
            if (iMo5841v != 0) {
                if (iMo5841v != 1) {
                    if (iMo5841v != 2) {
                        if (iMo5841v != 3) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            fMo5835l = (float) jsonReader.mo5835l();
                        }
                    } else {
                        strMo5838o2 = jsonReader.mo5838o();
                    }
                } else {
                    strMo5838o3 = jsonReader.mo5838o();
                }
            } else {
                strMo5838o = jsonReader.mo5838o();
            }
        }
        jsonReader.mo5832i();
        return new C38072b(strMo5838o, strMo5838o3, strMo5838o2, fMo5835l);
    }
}
