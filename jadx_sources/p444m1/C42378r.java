package p444m1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: m1.r */
/* JADX INFO: compiled from: IntegerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42378r implements InterfaceC42374n0<Integer> {

    /* JADX INFO: renamed from: a */
    public static final C42378r f93905a = new C42378r();

    @Override // p444m1.InterfaceC42374n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo92921a(JsonReader jsonReader, float f11) throws IOException {
        return Integer.valueOf(Math.round(C42379s.m92985g(jsonReader) * f11));
    }
}
