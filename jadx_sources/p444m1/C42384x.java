package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38396d;
import p328i1.C38400h;
import p484o1.C42924f;

/* JADX INFO: renamed from: m1.x */
/* JADX INFO: compiled from: MaskParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42384x {
    /* JADX INFO: renamed from: a */
    public static Mask m93004a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        jsonReader.mo5830g();
        Mask.MaskMode maskMode = null;
        C38400h c38400hM92944k = null;
        C38396d c38396dM92941h = null;
        boolean zMo5834k = false;
        while (jsonReader.mo5833j()) {
            String strMo5837n = jsonReader.mo5837n();
            strMo5837n.getClass();
            switch (strMo5837n) {
                case "o":
                    c38396dM92941h = C42353d.m92941h(jsonReader, c5080h);
                    break;
                case "pt":
                    c38400hM92944k = C42353d.m92944k(jsonReader, c5080h);
                    break;
                case "inv":
                    zMo5834k = jsonReader.mo5834k();
                    break;
                case "mode":
                    String strMo5838o = jsonReader.mo5838o();
                    strMo5838o.getClass();
                    switch (strMo5838o) {
                        case "a":
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case "i":
                            c5080h.m5650a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case "s":
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            C42924f.m94158c("Unknown mask mode " + strMo5837n + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.mo5843x();
                    break;
            }
        }
        jsonReader.mo5832i();
        return new Mask(maskMode, c38400hM92944k, c38396dM92941h, zMo5834k);
    }
}
