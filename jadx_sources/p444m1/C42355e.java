package p444m1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p355j1.C40198a;

/* JADX INFO: renamed from: m1.e */
/* JADX INFO: compiled from: BlurEffectParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42355e {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93865a = JsonReader.C5103a.m5845a("ef");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93866b = JsonReader.C5103a.m5845a("ty", "v");

    @Nullable
    /* JADX INFO: renamed from: b */
    public static C40198a m92947b(JsonReader jsonReader, C5080h c5080h) throws IOException {
        C40198a c40198a = null;
        while (jsonReader.mo5833j()) {
            if (jsonReader.mo5841v(f93865a) != 0) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                jsonReader.mo5829b();
                while (jsonReader.mo5833j()) {
                    C40198a c40198aM92946a = m92946a(jsonReader, c5080h);
                    if (c40198aM92946a != null) {
                        c40198a = c40198aM92946a;
                    }
                }
                jsonReader.mo5831h();
            }
        }
        return c40198a;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static C40198a m92946a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        jsonReader.mo5830g();
        C40198a c40198a = null;
        while (true) {
            boolean z11 = false;
            while (true) {
                if (jsonReader.mo5833j()) {
                    int iMo5841v = jsonReader.mo5841v(f93866b);
                    if (iMo5841v != 0) {
                        if (iMo5841v != 1) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else if (z11) {
                            c40198a = new C40198a(C42353d.m92938e(jsonReader, c5080h));
                        } else {
                            jsonReader.mo5843x();
                        }
                    } else if (jsonReader.mo5836m() == 0) {
                        z11 = true;
                    }
                } else {
                    jsonReader.mo5832i();
                    return c40198a;
                }
            }
        }
    }
}
