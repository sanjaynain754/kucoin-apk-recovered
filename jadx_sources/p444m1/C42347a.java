package p444m1;

import android.graphics.PointF;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p328i1.C38394b;
import p328i1.C38397e;
import p328i1.C38401i;
import p328i1.InterfaceC38405m;
import p484o1.C42930l;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: compiled from: AnimatablePathValueParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42347a {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93856a = JsonReader.C5103a.m5845a("k", "x", "y");

    /* JADX INFO: renamed from: a */
    public static C38397e m92919a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo5829b();
            while (jsonReader.mo5833j()) {
                arrayList.add(C42386z.m93006a(jsonReader, c5080h));
            }
            jsonReader.mo5831h();
            C42381u.m92995b(arrayList);
        } else {
            arrayList.add(new C43348a(C42379s.m92983e(jsonReader, C42930l.m94202e())));
        }
        return new C38397e(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC38405m<PointF, PointF> m92920b(JsonReader jsonReader, C5080h c5080h) throws IOException {
        jsonReader.mo5830g();
        C38397e c38397eM92919a = null;
        C38394b c38394bM92938e = null;
        boolean z11 = false;
        C38394b c38394bM92938e2 = null;
        while (jsonReader.mo5839q() != JsonReader.Token.END_OBJECT) {
            int iMo5841v = jsonReader.mo5841v(f93856a);
            if (iMo5841v != 0) {
                if (iMo5841v != 1) {
                    if (iMo5841v != 2) {
                        jsonReader.mo5842w();
                        jsonReader.mo5843x();
                    } else if (jsonReader.mo5839q() == JsonReader.Token.STRING) {
                        jsonReader.mo5843x();
                        z11 = true;
                    } else {
                        c38394bM92938e = C42353d.m92938e(jsonReader, c5080h);
                    }
                } else if (jsonReader.mo5839q() == JsonReader.Token.STRING) {
                    jsonReader.mo5843x();
                    z11 = true;
                } else {
                    c38394bM92938e2 = C42353d.m92938e(jsonReader, c5080h);
                }
            } else {
                c38397eM92919a = m92919a(jsonReader, c5080h);
            }
        }
        jsonReader.mo5832i();
        if (z11) {
            c5080h.m5650a("Lottie doesn't support expressions.");
        }
        if (c38397eM92919a != null) {
            return c38397eM92919a;
        }
        return new C38401i(c38394bM92938e2, c38394bM92938e);
    }
}
