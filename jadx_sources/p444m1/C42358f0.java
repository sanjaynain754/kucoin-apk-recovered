package p444m1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38394b;
import p355j1.C40205h;

/* JADX INFO: renamed from: m1.f0 */
/* JADX INFO: compiled from: RoundedCornersParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42358f0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93869a = JsonReader.C5103a.m5845a("nm", "r", "hd");

    @Nullable
    /* JADX INFO: renamed from: a */
    public static C40205h m92950a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        boolean zMo5834k = false;
        String strMo5838o = null;
        C38394b c38394bM92939f = null;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93869a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                c38394bM92939f = C42353d.m92939f(jsonReader, c5080h, true);
            } else if (iMo5841v != 2) {
                jsonReader.mo5843x();
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        if (zMo5834k) {
            return null;
        }
        return new C40205h(strMo5838o, c38394bM92939f);
    }
}
