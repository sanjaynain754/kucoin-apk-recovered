package p444m1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: m1.l */
/* JADX INFO: compiled from: FloatParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42369l implements InterfaceC42374n0<Float> {

    /* JADX INFO: renamed from: a */
    public static final C42369l f93892a = new C42369l();

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float mo92921a(JsonReader jsonReader, float f11) throws IOException {
        return Float.valueOf(C42379s.m92985g(jsonReader) * f11);
    }
}
