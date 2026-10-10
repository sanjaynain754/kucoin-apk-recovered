package p444m1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p522p1.C43351d;

/* JADX INFO: renamed from: m1.g0 */
/* JADX INFO: compiled from: ScaleXYParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42360g0 implements InterfaceC42374n0<C43351d> {

    /* JADX INFO: renamed from: a */
    public static final C42360g0 f93871a = new C42360g0();

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C43351d mo92921a(JsonReader jsonReader, float f11) throws IOException {
        boolean z11;
        if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            jsonReader.mo5829b();
        }
        float fMo5835l = (float) jsonReader.mo5835l();
        float fMo5835l2 = (float) jsonReader.mo5835l();
        while (jsonReader.mo5833j()) {
            jsonReader.mo5843x();
        }
        if (z11) {
            jsonReader.mo5831h();
        }
        return new C43351d((fMo5835l / 100.0f) * f11, (fMo5835l2 / 100.0f) * f11);
    }
}
