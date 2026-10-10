package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p248f1.C37313i;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.u */
/* JADX INFO: compiled from: KeyframesParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42381u {

    /* JADX INFO: renamed from: a */
    public static JsonReader.C5103a f93912a = JsonReader.C5103a.m5845a("k");

    /* JADX INFO: renamed from: a */
    public static <T> List<C43348a<T>> m92994a(JsonReader jsonReader, C5080h c5080h, float f11, InterfaceC42374n0<T> interfaceC42374n0, boolean z11) throws IOException {
        JsonReader jsonReader2;
        C5080h c5080h2;
        float f12;
        InterfaceC42374n0<T> interfaceC42374n1;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo5839q() == JsonReader.Token.STRING) {
            c5080h.m5650a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo5830g();
        while (jsonReader.mo5833j()) {
            if (jsonReader.mo5841v(f93912a) != 0) {
                jsonReader.mo5843x();
            } else if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.mo5829b();
                if (jsonReader.mo5839q() == JsonReader.Token.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    C5080h c5080h3 = c5080h;
                    float f13 = f11;
                    InterfaceC42374n0<T> interfaceC42374n2 = interfaceC42374n0;
                    boolean z13 = z11;
                    C43348a c43348aM92988c = C42380t.m92988c(jsonReader3, c5080h3, f13, interfaceC42374n2, false, z13);
                    jsonReader2 = jsonReader3;
                    c5080h2 = c5080h3;
                    f12 = f13;
                    interfaceC42374n1 = interfaceC42374n2;
                    z12 = z13;
                    arrayList.add(c43348aM92988c);
                } else {
                    jsonReader2 = jsonReader;
                    c5080h2 = c5080h;
                    f12 = f11;
                    interfaceC42374n1 = interfaceC42374n0;
                    z12 = z11;
                    while (jsonReader2.mo5833j()) {
                        arrayList.add(C42380t.m92988c(jsonReader2, c5080h2, f12, interfaceC42374n1, true, z12));
                    }
                }
                jsonReader2.mo5831h();
                jsonReader = jsonReader2;
                c5080h = c5080h2;
                f11 = f12;
                interfaceC42374n0 = interfaceC42374n1;
                z11 = z12;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(C42380t.m92988c(jsonReader4, c5080h, f11, interfaceC42374n0, false, z11));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.mo5832i();
        m92995b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m92995b(List<? extends C43348a<T>> list) {
        int i11;
        T t11;
        int size = list.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            C43348a<T> c43348a = list.get(i12);
            i12++;
            C43348a<T> c43348a2 = list.get(i12);
            c43348a.f95715h = Float.valueOf(c43348a2.f95714g);
            if (c43348a.f95710c == null && (t11 = c43348a2.f95709b) != null) {
                c43348a.f95710c = t11;
                if (c43348a instanceof C37313i) {
                    ((C37313i) c43348a).m83865j();
                }
            }
        }
        C43348a<T> c43348a3 = list.get(i11);
        if ((c43348a3.f95709b == null || c43348a3.f95710c == null) && list.size() > 1) {
            list.remove(c43348a3);
        }
    }
}
