package p444m1;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: m1.g */
/* JADX INFO: compiled from: ColorParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42359g implements InterfaceC42374n0<Integer> {

    /* JADX INFO: renamed from: a */
    public static final C42359g f93870a = new C42359g();

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo92921a(JsonReader jsonReader, float f11) throws IOException {
        boolean z11;
        double dMo5835l;
        if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            jsonReader.mo5829b();
        }
        double dMo5835l2 = jsonReader.mo5835l();
        double dMo5835l3 = jsonReader.mo5835l();
        double dMo5835l4 = jsonReader.mo5835l();
        if (jsonReader.mo5839q() == JsonReader.Token.NUMBER) {
            dMo5835l = jsonReader.mo5835l();
        } else {
            dMo5835l = 1.0d;
        }
        if (z11) {
            jsonReader.mo5831h();
        }
        if (dMo5835l2 <= 1.0d && dMo5835l3 <= 1.0d && dMo5835l4 <= 1.0d) {
            dMo5835l2 *= 255.0d;
            dMo5835l3 *= 255.0d;
            dMo5835l4 *= 255.0d;
            if (dMo5835l <= 1.0d) {
                dMo5835l *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo5835l, (int) dMo5835l2, (int) dMo5835l3, (int) dMo5835l4));
    }
}
