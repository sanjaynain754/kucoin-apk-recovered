package p444m1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38393a;
import p328i1.C38394b;

/* JADX INFO: renamed from: m1.k */
/* JADX INFO: compiled from: DropShadowEffectParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42367k {

    /* JADX INFO: renamed from: f */
    public static final JsonReader.C5103a f93884f = JsonReader.C5103a.m5845a("ef");

    /* JADX INFO: renamed from: g */
    public static final JsonReader.C5103a f93885g = JsonReader.C5103a.m5845a("nm", "v");

    /* JADX INFO: renamed from: a */
    public C38393a f93886a;

    /* JADX INFO: renamed from: b */
    public C38394b f93887b;

    /* JADX INFO: renamed from: c */
    public C38394b f93888c;

    /* JADX INFO: renamed from: d */
    public C38394b f93889d;

    /* JADX INFO: renamed from: e */
    public C38394b f93890e;

    /* JADX INFO: renamed from: a */
    public final void m92963a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        jsonReader.mo5830g();
        String strMo5838o = "";
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93885g);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                strMo5838o.getClass();
                switch (strMo5838o) {
                    case "Distance":
                        this.f93889d = C42353d.m92938e(jsonReader, c5080h);
                        break;
                    case "Opacity":
                        this.f93887b = C42353d.m92939f(jsonReader, c5080h, false);
                        break;
                    case "Direction":
                        this.f93888c = C42353d.m92939f(jsonReader, c5080h, false);
                        break;
                    case "Shadow Color":
                        this.f93886a = C42353d.m92936c(jsonReader, c5080h);
                        break;
                    case "Softness":
                        this.f93890e = C42353d.m92938e(jsonReader, c5080h);
                        break;
                    default:
                        jsonReader.mo5843x();
                        break;
                }
            } else {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            }
        }
        jsonReader.mo5832i();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public C42365j m92964b(JsonReader jsonReader, C5080h c5080h) throws IOException {
        C38394b c38394b;
        C38394b c38394b2;
        C38394b c38394b3;
        C38394b c38394b4;
        while (jsonReader.mo5833j()) {
            if (jsonReader.mo5841v(f93884f) != 0) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                jsonReader.mo5829b();
                while (jsonReader.mo5833j()) {
                    m92963a(jsonReader, c5080h);
                }
                jsonReader.mo5831h();
            }
        }
        C38393a c38393a = this.f93886a;
        if (c38393a != null && (c38394b = this.f93887b) != null && (c38394b2 = this.f93888c) != null && (c38394b3 = this.f93889d) != null && (c38394b4 = this.f93890e) != null) {
            return new C42365j(c38393a, c38394b, c38394b2, c38394b3, c38394b4);
        }
        return null;
    }
}
