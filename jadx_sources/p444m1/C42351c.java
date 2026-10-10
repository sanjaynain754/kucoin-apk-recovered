package p444m1;

import android.graphics.PointF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p328i1.C38394b;
import p328i1.C38396d;
import p328i1.C38397e;
import p328i1.C38399g;
import p328i1.C38401i;
import p328i1.C38404l;
import p328i1.InterfaceC38405m;
import p522p1.C43348a;
import p522p1.C43351d;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: compiled from: AnimatableTransformParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42351c {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93861a = JsonReader.C5103a.m5845a(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "p", CmcdData.Factory.STREAMING_FORMAT_SS, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93862b = JsonReader.C5103a.m5845a("k");

    /* JADX INFO: renamed from: a */
    public static boolean m92926a(C38397e c38397e) {
        if (c38397e != null) {
            return c38397e.isStatic() && c38397e.mo86575b().get(0).f95709b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m92927b(InterfaceC38405m<PointF, PointF> interfaceC38405m) {
        if (interfaceC38405m != null) {
            return !(interfaceC38405m instanceof C38401i) && interfaceC38405m.isStatic() && interfaceC38405m.mo86575b().get(0).f95709b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m92928c(C38394b c38394b) {
        if (c38394b != null) {
            return c38394b.isStatic() && ((Float) ((C43348a) c38394b.mo86575b().get(0)).f95709b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static boolean m92929d(C38399g c38399g) {
        if (c38399g != null) {
            return c38399g.isStatic() && ((C43351d) ((C43348a) c38399g.mo86575b().get(0)).f95709b).m95469a(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static boolean m92930e(C38394b c38394b) {
        if (c38394b != null) {
            return c38394b.isStatic() && ((Float) ((C43348a) c38394b.mo86575b().get(0)).f95709b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static boolean m92931f(C38394b c38394b) {
        if (c38394b != null) {
            return c38394b.isStatic() && ((Float) ((C43348a) c38394b.mo86575b().get(0)).f95709b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX INFO: renamed from: g */
    public static C38404l m92932g(JsonReader jsonReader, C5080h c5080h) throws IOException {
        C38394b c38394bM92939f;
        C5080h c5080h2 = c5080h;
        boolean z11 = jsonReader.mo5839q() == JsonReader.Token.BEGIN_OBJECT;
        if (z11) {
            jsonReader.mo5830g();
        }
        C38394b c38394b = null;
        C38397e c38397eM92919a = null;
        InterfaceC38405m<PointF, PointF> interfaceC38405mM92920b = null;
        C38399g c38399gM92943j = null;
        C38394b c38394bM92939f2 = null;
        C38394b c38394bM92939f3 = null;
        C38396d c38396dM92941h = null;
        C38394b c38394bM92939f4 = null;
        C38394b c38394bM92939f5 = null;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93861a)) {
                case 0:
                    jsonReader.mo5830g();
                    while (jsonReader.mo5833j()) {
                        if (jsonReader.mo5841v(f93862b) != 0) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            c38397eM92919a = C42347a.m92919a(jsonReader, c5080h);
                        }
                    }
                    jsonReader.mo5832i();
                    c5080h2 = c5080h;
                    break;
                case 1:
                    interfaceC38405mM92920b = C42347a.m92920b(jsonReader, c5080h);
                    c5080h2 = c5080h;
                    break;
                case 2:
                    c38399gM92943j = C42353d.m92943j(jsonReader, c5080h);
                    c5080h2 = c5080h;
                    break;
                case 3:
                    c5080h2.m5650a("Lottie doesn't support 3D layers.");
                    c38394bM92939f = C42353d.m92939f(jsonReader, c5080h2, false);
                    if (c38394bM92939f.mo86575b().isEmpty()) {
                        c38394bM92939f.mo86575b().add(new C43348a(c5080h2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c5080h2.m5655f())));
                    } else if (((C43348a) c38394bM92939f.mo86575b().get(0)).f95709b == 0) {
                        c38394bM92939f.mo86575b().set(0, new C43348a(c5080h, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c5080h.m5655f())));
                    }
                    c5080h2 = c5080h;
                    c38394b = c38394bM92939f;
                    break;
                case 4:
                    c38394bM92939f = C42353d.m92939f(jsonReader, c5080h2, false);
                    if (c38394bM92939f.mo86575b().isEmpty()) {
                        c38394bM92939f.mo86575b().add(new C43348a(c5080h2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c5080h2.m5655f())));
                    } else if (((C43348a) c38394bM92939f.mo86575b().get(0)).f95709b == 0) {
                        c38394bM92939f.mo86575b().set(0, new C43348a(c5080h, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c5080h.m5655f())));
                    }
                    c5080h2 = c5080h;
                    c38394b = c38394bM92939f;
                    break;
                case 5:
                    c38396dM92941h = C42353d.m92941h(jsonReader, c5080h);
                    break;
                case 6:
                    c38394bM92939f4 = C42353d.m92939f(jsonReader, c5080h2, false);
                    break;
                case 7:
                    c38394bM92939f5 = C42353d.m92939f(jsonReader, c5080h2, false);
                    break;
                case 8:
                    c38394bM92939f2 = C42353d.m92939f(jsonReader, c5080h2, false);
                    break;
                case 9:
                    c38394bM92939f3 = C42353d.m92939f(jsonReader, c5080h2, false);
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    break;
            }
        }
        if (z11) {
            jsonReader.mo5832i();
        }
        C38397e c38397e = m92926a(c38397eM92919a) ? null : c38397eM92919a;
        if (m92927b(interfaceC38405mM92920b)) {
            interfaceC38405mM92920b = null;
        }
        return new C38404l(c38397e, interfaceC38405mM92920b, m92929d(c38399gM92943j) ? null : c38399gM92943j, m92928c(c38394b) ? null : c38394b, c38396dM92941h, c38394bM92939f4, c38394bM92939f5, m92931f(c38394bM92939f2) ? null : c38394bM92939f2, m92930e(c38394bM92939f3) ? null : c38394bM92939f3);
    }
}
