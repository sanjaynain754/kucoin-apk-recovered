package p444m1;

import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p328i1.C38393a;
import p328i1.C38394b;
import p328i1.C38396d;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.l0 */
/* JADX INFO: compiled from: ShapeStrokeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42370l0 {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93893a = JsonReader.C5103a.m5845a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93894b = JsonReader.C5103a.m5845a("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX INFO: renamed from: a */
    public static ShapeStroke m92967a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        ArrayList arrayList = new ArrayList();
        float fMo5835l = 0.0f;
        boolean zMo5834k = false;
        C38396d c38396d = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        String strMo5838o = null;
        C38394b c38394b = null;
        C38393a c38393aM92936c = null;
        C38394b c38394bM92938e = null;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93893a)) {
                case 0:
                    strMo5838o = jsonReader.mo5838o();
                    break;
                case 1:
                    c38393aM92936c = C42353d.m92936c(jsonReader, c5080h);
                    break;
                case 2:
                    c38394bM92938e = C42353d.m92938e(jsonReader, c5080h);
                    break;
                case 3:
                    c38396d = C42353d.m92941h(jsonReader, c5080h);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo5836m() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo5836m() - 1];
                    break;
                case 6:
                    fMo5835l = (float) jsonReader.mo5835l();
                    break;
                case 7:
                    zMo5834k = jsonReader.mo5834k();
                    break;
                case 8:
                    jsonReader.mo5829b();
                    while (jsonReader.mo5833j()) {
                        jsonReader.mo5830g();
                        String strMo5838o2 = null;
                        C38394b c38394bM92938e2 = null;
                        while (jsonReader.mo5833j()) {
                            int iMo5841v = jsonReader.mo5841v(f93894b);
                            if (iMo5841v == 0) {
                                strMo5838o2 = jsonReader.mo5838o();
                            } else if (iMo5841v != 1) {
                                jsonReader.mo5842w();
                                jsonReader.mo5843x();
                            } else {
                                c38394bM92938e2 = C42353d.m92938e(jsonReader, c5080h);
                            }
                        }
                        jsonReader.mo5832i();
                        strMo5838o2.getClass();
                        switch (strMo5838o2) {
                            case "d":
                            case "g":
                                c5080h.m5670u(true);
                                arrayList.add(c38394bM92938e2);
                                break;
                            case "o":
                                c38394b = c38394bM92938e2;
                                break;
                        }
                    }
                    jsonReader.mo5831h();
                    if (arrayList.size() == 1) {
                        arrayList.add((C38394b) arrayList.get(0));
                    }
                    break;
                default:
                    jsonReader.mo5843x();
                    break;
            }
        }
        if (c38396d == null) {
            c38396d = new C38396d(Collections.singletonList(new C43348a(100)));
        }
        if (lineCapType == null) {
            lineCapType = ShapeStroke.LineCapType.BUTT;
        }
        if (lineJoinType == null) {
            lineJoinType = ShapeStroke.LineJoinType.MITER;
        }
        C38394b c38394b2 = c38394b;
        ShapeStroke.LineCapType lineCapType2 = lineCapType;
        return new ShapeStroke(strMo5838o, c38394b2, arrayList, c38393aM92936c, c38396d, c38394bM92938e, lineCapType2, lineJoinType, fMo5835l, zMo5834k);
    }
}
