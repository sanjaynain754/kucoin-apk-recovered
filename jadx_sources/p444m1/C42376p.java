package p444m1;

import android.graphics.Path;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;
import p328i1.C38395c;
import p328i1.C38396d;
import p328i1.C38398f;
import p355j1.C40202e;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.p */
/* JADX INFO: compiled from: GradientFillParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42376p {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93900a = JsonReader.C5103a.m5845a("nm", "g", "o", "t", CmcdData.Factory.STREAMING_FORMAT_SS, "e", "r", "hd");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93901b = JsonReader.C5103a.m5845a("p", "k");

    /* JADX INFO: renamed from: a */
    public static C40202e m92976a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        C38396d c38396d = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strMo5838o = null;
        GradientType gradientType = null;
        C38395c c38395cM92940g = null;
        C38398f c38398fM92942i = null;
        C38398f c38398fM92942i2 = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93900a)) {
                case 0:
                    strMo5838o = jsonReader.mo5838o();
                    break;
                case 1:
                    jsonReader.mo5830g();
                    int iMo5836m = -1;
                    while (jsonReader.mo5833j()) {
                        int iMo5841v = jsonReader.mo5841v(f93901b);
                        if (iMo5841v == 0) {
                            iMo5836m = jsonReader.mo5836m();
                        } else if (iMo5841v != 1) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            c38395cM92940g = C42353d.m92940g(jsonReader, c5080h, iMo5836m);
                        }
                    }
                    jsonReader.mo5832i();
                    break;
                case 2:
                    c38396d = C42353d.m92941h(jsonReader, c5080h);
                    break;
                case 3:
                    gradientType = jsonReader.mo5836m() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    c38398fM92942i = C42353d.m92942i(jsonReader, c5080h);
                    break;
                case 5:
                    c38398fM92942i2 = C42353d.m92942i(jsonReader, c5080h);
                    break;
                case 6:
                    fillType = jsonReader.mo5836m() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zMo5834k = jsonReader.mo5834k();
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    break;
            }
        }
        if (c38396d == null) {
            c38396d = new C38396d(Collections.singletonList(new C43348a(100)));
        }
        return new C40202e(strMo5838o, gradientType, fillType, c38395cM92940g, c38396d, c38398fM92942i, c38398fM92942i2, null, null, zMo5834k);
    }
}
