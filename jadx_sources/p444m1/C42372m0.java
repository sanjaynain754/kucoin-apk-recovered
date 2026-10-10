package p444m1;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38394b;

/* JADX INFO: renamed from: m1.m0 */
/* JADX INFO: compiled from: ShapeTrimPathParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42372m0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93897a = JsonReader.C5103a.m5845a(CmcdData.Factory.STREAMING_FORMAT_SS, "e", "o", "nm", "m", "hd");

    /* JADX INFO: renamed from: a */
    public static ShapeTrimPath m92969a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        String strMo5838o = null;
        ShapeTrimPath.Type typeForId = null;
        C38394b c38394bM92939f = null;
        C38394b c38394bM92939f2 = null;
        C38394b c38394bM92939f3 = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93897a);
            if (iMo5841v == 0) {
                c38394bM92939f = C42353d.m92939f(jsonReader, c5080h, false);
            } else if (iMo5841v == 1) {
                c38394bM92939f2 = C42353d.m92939f(jsonReader, c5080h, false);
            } else if (iMo5841v == 2) {
                c38394bM92939f3 = C42353d.m92939f(jsonReader, c5080h, false);
            } else if (iMo5841v == 3) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 4) {
                typeForId = ShapeTrimPath.Type.forId(jsonReader.mo5836m());
            } else if (iMo5841v != 5) {
                jsonReader.mo5843x();
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        return new ShapeTrimPath(strMo5838o, typeForId, c38394bM92939f, c38394bM92939f2, c38394bM92939f3, zMo5834k);
    }
}
