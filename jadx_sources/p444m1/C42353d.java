package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;
import p328i1.C38393a;
import p328i1.C38394b;
import p328i1.C38395c;
import p328i1.C38396d;
import p328i1.C38398f;
import p328i1.C38399g;
import p328i1.C38400h;
import p328i1.C38402j;
import p484o1.C42930l;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: compiled from: AnimatableValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42353d {
    /* JADX INFO: renamed from: a */
    public static <T> List<C43348a<T>> m92934a(JsonReader jsonReader, float f11, C5080h c5080h, InterfaceC42374n0<T> interfaceC42374n0) throws IOException {
        return C42381u.m92994a(jsonReader, c5080h, f11, interfaceC42374n0, false);
    }

    /* JADX INFO: renamed from: e */
    public static C38394b m92938e(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return m92939f(jsonReader, c5080h, true);
    }

    /* JADX INFO: renamed from: b */
    public static <T> List<C43348a<T>> m92935b(JsonReader jsonReader, C5080h c5080h, InterfaceC42374n0<T> interfaceC42374n0) throws IOException {
        return C42381u.m92994a(jsonReader, c5080h, 1.0f, interfaceC42374n0, false);
    }

    /* JADX INFO: renamed from: c */
    public static C38393a m92936c(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return new C38393a(m92935b(jsonReader, c5080h, C42359g.f93870a));
    }

    /* JADX INFO: renamed from: d */
    public static C38402j m92937d(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return new C38402j(m92934a(jsonReader, C42930l.m94202e(), c5080h, C42363i.f93875a));
    }

    /* JADX INFO: renamed from: f */
    public static C38394b m92939f(JsonReader jsonReader, C5080h c5080h, boolean z11) throws IOException {
        return new C38394b(m92934a(jsonReader, z11 ? C42930l.m94202e() : 1.0f, c5080h, C42369l.f93892a));
    }

    /* JADX INFO: renamed from: g */
    public static C38395c m92940g(JsonReader jsonReader, C5080h c5080h, int i11) throws IOException {
        return new C38395c(m92935b(jsonReader, c5080h, new C42375o(i11)));
    }

    /* JADX INFO: renamed from: h */
    public static C38396d m92941h(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return new C38396d(m92935b(jsonReader, c5080h, C42378r.f93905a));
    }

    /* JADX INFO: renamed from: i */
    public static C38398f m92942i(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return new C38398f(C42381u.m92994a(jsonReader, c5080h, C42930l.m94202e(), C42350b0.f93860a, true));
    }

    /* JADX INFO: renamed from: j */
    public static C38399g m92943j(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return new C38399g(m92935b(jsonReader, c5080h, C42360g0.f93871a));
    }

    /* JADX INFO: renamed from: k */
    public static C38400h m92944k(JsonReader jsonReader, C5080h c5080h) throws IOException {
        return new C38400h(m92934a(jsonReader, C42930l.m94202e(), c5080h, C42362h0.f93873a));
    }
}
