package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p355j1.C40208k;
import p355j1.InterfaceC40200c;

/* JADX INFO: renamed from: m1.j0 */
/* JADX INFO: compiled from: ShapeGroupParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42366j0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93883a = JsonReader.C5103a.m5845a("nm", "hd", "it");

    /* JADX INFO: renamed from: a */
    public static C40208k m92962a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strMo5838o = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93883a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                zMo5834k = jsonReader.mo5834k();
            } else if (iMo5841v != 2) {
                jsonReader.mo5843x();
            } else {
                jsonReader.mo5829b();
                while (jsonReader.mo5833j()) {
                    InterfaceC40200c interfaceC40200cM92953a = C42361h.m92953a(jsonReader, c5080h);
                    if (interfaceC40200cM92953a != null) {
                        arrayList.add(interfaceC40200cM92953a);
                    }
                }
                jsonReader.mo5831h();
            }
        }
        return new C40208k(strMo5838o, arrayList, zMo5834k);
    }
}
