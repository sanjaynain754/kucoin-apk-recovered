package p444m1;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p297h1.C38073c;
import p355j1.C40208k;

/* JADX INFO: renamed from: m1.m */
/* JADX INFO: compiled from: FontCharacterParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42371m {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93895a = JsonReader.C5103a.m5845a("ch", "size", "w", TtmlNode.TAG_STYLE, "fFamily", "data");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93896b = JsonReader.C5103a.m5845a("shapes");

    /* JADX INFO: renamed from: a */
    public static C38073c m92968a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo5830g();
        double dMo5835l = 0.0d;
        String strMo5838o = null;
        String strMo5838o2 = null;
        char cCharAt = 0;
        double dMo5835l2 = 0.0d;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93895a);
            if (iMo5841v == 0) {
                cCharAt = jsonReader.mo5838o().charAt(0);
            } else if (iMo5841v == 1) {
                dMo5835l2 = jsonReader.mo5835l();
            } else if (iMo5841v == 2) {
                dMo5835l = jsonReader.mo5835l();
            } else if (iMo5841v == 3) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 4) {
                strMo5838o2 = jsonReader.mo5838o();
            } else if (iMo5841v != 5) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                jsonReader.mo5830g();
                while (jsonReader.mo5833j()) {
                    if (jsonReader.mo5841v(f93896b) != 0) {
                        jsonReader.mo5842w();
                        jsonReader.mo5843x();
                    } else {
                        jsonReader.mo5829b();
                        while (jsonReader.mo5833j()) {
                            arrayList.add((C40208k) C42361h.m92953a(jsonReader, c5080h));
                        }
                        jsonReader.mo5831h();
                    }
                }
                jsonReader.mo5832i();
            }
        }
        jsonReader.mo5832i();
        return new C38073c(arrayList, cCharAt, dMo5835l2, dMo5835l, strMo5838o, strMo5838o2);
    }
}
