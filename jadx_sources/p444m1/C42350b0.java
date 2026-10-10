package p444m1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: m1.b0 */
/* JADX INFO: compiled from: PointFParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42350b0 implements InterfaceC42374n0<PointF> {

    /* JADX INFO: renamed from: a */
    public static final C42350b0 f93860a = new C42350b0();

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF mo92921a(JsonReader jsonReader, float f11) throws IOException {
        JsonReader.Token tokenMo5839q = jsonReader.mo5839q();
        if (tokenMo5839q == JsonReader.Token.BEGIN_ARRAY) {
            return C42379s.m92983e(jsonReader, f11);
        }
        if (tokenMo5839q == JsonReader.Token.BEGIN_OBJECT) {
            return C42379s.m92983e(jsonReader, f11);
        }
        if (tokenMo5839q == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo5835l()) * f11, ((float) jsonReader.mo5835l()) * f11);
            while (jsonReader.mo5833j()) {
                jsonReader.mo5843x();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenMo5839q);
    }
}
