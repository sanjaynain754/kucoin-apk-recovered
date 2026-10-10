package p444m1;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38398f;
import p328i1.InterfaceC38405m;
import p355j1.C40199b;

/* JADX INFO: renamed from: m1.f */
/* JADX INFO: compiled from: CircleShapeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42357f {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93868a = JsonReader.C5103a.m5845a("nm", "p", CmcdData.Factory.STREAMING_FORMAT_SS, "hd", "d");

    /* JADX INFO: renamed from: a */
    public static C40199b m92949a(JsonReader jsonReader, C5080h c5080h, int i11) throws IOException {
        boolean z11 = i11 == 3;
        boolean zMo5834k = false;
        String strMo5838o = null;
        InterfaceC38405m<PointF, PointF> interfaceC38405mM92920b = null;
        C38398f c38398fM92942i = null;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93868a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                interfaceC38405mM92920b = C42347a.m92920b(jsonReader, c5080h);
            } else if (iMo5841v == 2) {
                c38398fM92942i = C42353d.m92942i(jsonReader, c5080h);
            } else if (iMo5841v == 3) {
                zMo5834k = jsonReader.mo5834k();
            } else if (iMo5841v != 4) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                z11 = jsonReader.mo5836m() == 3;
            }
        }
        return new C40199b(strMo5838o, interfaceC38405mM92920b, c38398fM92942i, z11, zMo5834k);
    }
}
