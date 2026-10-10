package p444m1;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p355j1.InterfaceC40200c;
import p484o1.C42924f;

/* JADX INFO: renamed from: m1.h */
/* JADX INFO: compiled from: ContentModelParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42361h {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93872a = JsonReader.C5103a.m5845a("ty", "d");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static InterfaceC40200c m92953a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        InterfaceC40200c interfaceC40200cM92949a;
        String strMo5838o;
        byte b11 = 1;
        jsonReader.mo5830g();
        int iMo5836m = 2;
        while (true) {
            interfaceC40200cM92949a = null;
            if (!jsonReader.mo5833j()) {
                strMo5838o = null;
                break;
            }
            int iMo5841v = jsonReader.mo5841v(f93872a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
                break;
            }
            if (iMo5841v != 1) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                iMo5836m = jsonReader.mo5836m();
            }
        }
        if (strMo5838o == null) {
            return null;
        }
        switch (strMo5838o.hashCode()) {
            case 3239:
                b11 = !strMo5838o.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                if (!strMo5838o.equals("fl")) {
                    b11 = -1;
                }
                break;
            case 3295:
                b11 = !strMo5838o.equals("gf") ? (byte) -1 : (byte) 2;
                break;
            case 3307:
                b11 = !strMo5838o.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b11 = !strMo5838o.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b11 = !strMo5838o.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b11 = !strMo5838o.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b11 = !strMo5838o.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b11 = !strMo5838o.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b11 = !strMo5838o.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b11 = !strMo5838o.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b11 = !strMo5838o.equals(CmcdConfiguration.KEY_STREAM_TYPE) ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b11 = !strMo5838o.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b11 = !strMo5838o.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                interfaceC40200cM92949a = C42357f.m92949a(jsonReader, c5080h, iMo5836m);
                break;
            case 1:
                interfaceC40200cM92949a = C42364i0.m92956a(jsonReader, c5080h);
                break;
            case 2:
                interfaceC40200cM92949a = C42376p.m92976a(jsonReader, c5080h);
                break;
            case 3:
                interfaceC40200cM92949a = C42366j0.m92962a(jsonReader, c5080h);
                break;
            case 4:
                interfaceC40200cM92949a = C42377q.m92977a(jsonReader, c5080h);
                break;
            case 5:
                interfaceC40200cM92949a = C42385y.m93005a(jsonReader);
                c5080h.m5650a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                interfaceC40200cM92949a = C42354d0.m92945a(jsonReader, c5080h);
                break;
            case 7:
                interfaceC40200cM92949a = C42358f0.m92950a(jsonReader, c5080h);
                break;
            case 8:
                interfaceC40200cM92949a = C42356e0.m92948a(jsonReader, c5080h);
                break;
            case 9:
                interfaceC40200cM92949a = C42368k0.m92965a(jsonReader, c5080h);
                break;
            case 10:
                interfaceC40200cM92949a = C42352c0.m92933a(jsonReader, c5080h, iMo5836m);
                break;
            case 11:
                interfaceC40200cM92949a = C42370l0.m92967a(jsonReader, c5080h);
                break;
            case 12:
                interfaceC40200cM92949a = C42372m0.m92969a(jsonReader, c5080h);
                break;
            case 13:
                interfaceC40200cM92949a = C42351c.m92932g(jsonReader, c5080h);
                break;
            default:
                C42924f.m94158c("Unknown shape type " + strMo5838o);
                break;
        }
        while (jsonReader.mo5833j()) {
            jsonReader.mo5843x();
        }
        jsonReader.mo5832i();
        return interfaceC40200cM92949a;
    }
}
