package p444m1;

import android.graphics.PointF;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tencent.bugly.proguard.C33556b3;
import java.io.IOException;
import p328i1.C38394b;
import p328i1.InterfaceC38405m;

/* JADX INFO: renamed from: m1.c0 */
/* JADX INFO: compiled from: PolystarShapeParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42352c0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93863a = JsonReader.C5103a.m5845a("nm", "sy", "pt", "p", "r", "or", C33556b3.f69078o2, "ir", "is", "hd", "d");

    /* JADX INFO: renamed from: a */
    public static PolystarShape m92933a(JsonReader jsonReader, C5080h c5080h, int i11) throws IOException {
        boolean zMo5834k = false;
        boolean z11 = i11 == 3;
        String strMo5838o = null;
        PolystarShape.Type typeForValue = null;
        C38394b c38394bM92939f = null;
        InterfaceC38405m<PointF, PointF> interfaceC38405mM92920b = null;
        C38394b c38394bM92939f2 = null;
        C38394b c38394bM92938e = null;
        C38394b c38394bM92938e2 = null;
        C38394b c38394bM92939f3 = null;
        C38394b c38394bM92939f4 = null;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93863a)) {
                case 0:
                    strMo5838o = jsonReader.mo5838o();
                    break;
                case 1:
                    typeForValue = PolystarShape.Type.forValue(jsonReader.mo5836m());
                    break;
                case 2:
                    c38394bM92939f = C42353d.m92939f(jsonReader, c5080h, false);
                    break;
                case 3:
                    interfaceC38405mM92920b = C42347a.m92920b(jsonReader, c5080h);
                    break;
                case 4:
                    c38394bM92939f2 = C42353d.m92939f(jsonReader, c5080h, false);
                    break;
                case 5:
                    c38394bM92938e2 = C42353d.m92938e(jsonReader, c5080h);
                    break;
                case 6:
                    c38394bM92939f4 = C42353d.m92939f(jsonReader, c5080h, false);
                    break;
                case 7:
                    c38394bM92938e = C42353d.m92938e(jsonReader, c5080h);
                    break;
                case 8:
                    c38394bM92939f3 = C42353d.m92939f(jsonReader, c5080h, false);
                    break;
                case 9:
                    zMo5834k = jsonReader.mo5834k();
                    break;
                case 10:
                    z11 = jsonReader.mo5836m() == 3;
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    break;
            }
        }
        return new PolystarShape(strMo5838o, typeForValue, c38394bM92939f, interfaceC38405mM92920b, c38394bM92939f2, c38394bM92938e, c38394bM92938e2, c38394bM92939f3, c38394bM92939f4, zMo5834k, z11);
    }
}
