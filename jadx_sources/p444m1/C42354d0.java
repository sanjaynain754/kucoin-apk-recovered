package p444m1;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38394b;
import p328i1.C38398f;
import p328i1.InterfaceC38405m;
import p355j1.C40203f;

/* JADX INFO: renamed from: m1.d0 */
/* JADX INFO: compiled from: RectangleShapeParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42354d0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93864a = JsonReader.C5103a.m5845a("nm", "p", CmcdData.Factory.STREAMING_FORMAT_SS, "r", "hd");

    /* JADX INFO: renamed from: a */
    public static C40203f m92945a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        String strMo5838o = null;
        InterfaceC38405m<PointF, PointF> interfaceC38405mM92920b = null;
        C38398f c38398fM92942i = null;
        C38394b c38394bM92938e = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93864a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                interfaceC38405mM92920b = C42347a.m92920b(jsonReader, c5080h);
            } else if (iMo5841v == 2) {
                c38398fM92942i = C42353d.m92942i(jsonReader, c5080h);
            } else if (iMo5841v == 3) {
                c38394bM92938e = C42353d.m92938e(jsonReader, c5080h);
            } else if (iMo5841v != 4) {
                jsonReader.mo5843x();
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        return new C40203f(strMo5838o, interfaceC38405mM92920b, c38398fM92942i, c38394bM92938e, zMo5834k);
    }
}
