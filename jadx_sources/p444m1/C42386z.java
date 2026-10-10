package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p248f1.C37313i;
import p484o1.C42930l;

/* JADX INFO: renamed from: m1.z */
/* JADX INFO: compiled from: PathKeyframeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42386z {
    /* JADX INFO: renamed from: a */
    public static C37313i m93006a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        boolean z11;
        if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_OBJECT) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new C37313i(c5080h, C42380t.m92988c(jsonReader, c5080h, C42930l.m94202e(), C42348a0.f93857a, z11, false));
    }
}
