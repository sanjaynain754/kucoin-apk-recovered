package p444m1;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38393a;
import p328i1.C38394b;
import p328i1.C38403k;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: compiled from: AnimatableTextPropertiesParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42349b {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93858a = JsonReader.C5103a.m5845a(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93859b = JsonReader.C5103a.m5845a("fc", "sc", "sw", "t");

    /* JADX INFO: renamed from: a */
    public static C38403k m92923a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        jsonReader.mo5830g();
        C38403k c38403kM92924b = null;
        while (jsonReader.mo5833j()) {
            if (jsonReader.mo5841v(f93858a) != 0) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                c38403kM92924b = m92924b(jsonReader, c5080h);
            }
        }
        jsonReader.mo5832i();
        if (c38403kM92924b == null) {
            return new C38403k(null, null, null, null);
        }
        return c38403kM92924b;
    }

    /* JADX INFO: renamed from: b */
    public static C38403k m92924b(JsonReader jsonReader, C5080h c5080h) throws IOException {
        jsonReader.mo5830g();
        C38393a c38393aM92936c = null;
        C38393a c38393aM92936c2 = null;
        C38394b c38394bM92938e = null;
        C38394b c38394bM92938e2 = null;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93859b);
            if (iMo5841v != 0) {
                if (iMo5841v != 1) {
                    if (iMo5841v != 2) {
                        if (iMo5841v != 3) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            c38394bM92938e2 = C42353d.m92938e(jsonReader, c5080h);
                        }
                    } else {
                        c38394bM92938e = C42353d.m92938e(jsonReader, c5080h);
                    }
                } else {
                    c38393aM92936c2 = C42353d.m92936c(jsonReader, c5080h);
                }
            } else {
                c38393aM92936c = C42353d.m92936c(jsonReader, c5080h);
            }
        }
        jsonReader.mo5832i();
        return new C38403k(c38393aM92936c, c38393aM92936c2, c38394bM92938e, c38394bM92938e2);
    }
}
