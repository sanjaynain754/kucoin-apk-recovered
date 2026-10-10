package p444m1;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.C5094a;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p328i1.C38394b;
import p328i1.C38395c;
import p328i1.C38396d;
import p328i1.C38398f;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.q */
/* JADX INFO: compiled from: GradientStrokeParser.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42377q {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93902a = JsonReader.C5103a.m5845a("nm", "g", "o", "t", CmcdData.Factory.STREAMING_FORMAT_SS, "e", "w", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93903b = JsonReader.C5103a.m5845a("p", "k");

    /* JADX INFO: renamed from: c */
    public static final JsonReader.C5103a f93904c = JsonReader.C5103a.m5845a("n", "v");

    /* JADX INFO: renamed from: a */
    public static C5094a m92977a(JsonReader jsonReader, C5080h c5080h) throws IOException {
        ArrayList arrayList = new ArrayList();
        GradientType gradientType = null;
        String strMo5838o = null;
        C38395c c38395cM92940g = null;
        C38398f c38398fM92942i = null;
        C38398f c38398fM92942i2 = null;
        C38394b c38394bM92938e = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        C38394b c38394b = null;
        float fMo5835l = 0.0f;
        boolean zMo5834k = false;
        C38396d c38396dM92941h = null;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93902a)) {
                case 0:
                    strMo5838o = jsonReader.mo5838o();
                    break;
                case 1:
                    jsonReader.mo5830g();
                    int iMo5836m = -1;
                    while (jsonReader.mo5833j()) {
                        int iMo5841v = jsonReader.mo5841v(f93903b);
                        if (iMo5841v == 0) {
                            iMo5836m = jsonReader.mo5836m();
                        } else if (iMo5841v != 1) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            c38395cM92940g = C42353d.m92940g(jsonReader, c5080h, iMo5836m);
                        }
                    }
                    jsonReader.mo5832i();
                    c38396dM92941h = c38396dM92941h;
                    gradientType = gradientType;
                    break;
                case 2:
                    c38396dM92941h = C42353d.m92941h(jsonReader, c5080h);
                    break;
                case 3:
                    C38396d c38396d = c38396dM92941h;
                    gradientType = jsonReader.mo5836m() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    c38396dM92941h = c38396d;
                    break;
                case 4:
                    c38398fM92942i = C42353d.m92942i(jsonReader, c5080h);
                    break;
                case 5:
                    c38398fM92942i2 = C42353d.m92942i(jsonReader, c5080h);
                    break;
                case 6:
                    c38394bM92938e = C42353d.m92938e(jsonReader, c5080h);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo5836m() - 1];
                    c38396dM92941h = c38396dM92941h;
                    gradientType = gradientType;
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo5836m() - 1];
                    c38396dM92941h = c38396dM92941h;
                    gradientType = gradientType;
                    break;
                case 9:
                    fMo5835l = (float) jsonReader.mo5835l();
                    c38396dM92941h = c38396dM92941h;
                    gradientType = gradientType;
                    break;
                case 10:
                    gradientType = gradientType;
                    zMo5834k = jsonReader.mo5834k();
                    gradientType = gradientType;
                    break;
                case 11:
                    jsonReader.mo5829b();
                    while (jsonReader.mo5833j()) {
                        jsonReader.mo5830g();
                        String strMo5838o2 = null;
                        C38394b c38394bM92938e2 = null;
                        while (jsonReader.mo5833j()) {
                            int iMo5841v2 = jsonReader.mo5841v(f93904c);
                            if (iMo5841v2 != 0) {
                                GradientType gradientType2 = gradientType;
                                if (iMo5841v2 != 1) {
                                    jsonReader.mo5842w();
                                    jsonReader.mo5843x();
                                } else {
                                    c38394bM92938e2 = C42353d.m92938e(jsonReader, c5080h);
                                }
                                gradientType = gradientType2;
                            } else {
                                strMo5838o2 = jsonReader.mo5838o();
                            }
                        }
                        GradientType gradientType3 = gradientType;
                        jsonReader.mo5832i();
                        if (strMo5838o2.equals("o")) {
                            c38394b = c38394bM92938e2;
                        } else {
                            if (strMo5838o2.equals("d") || strMo5838o2.equals("g")) {
                                c5080h.m5670u(true);
                                arrayList.add(c38394bM92938e2);
                            }
                            gradientType = gradientType3;
                        }
                        gradientType = gradientType3;
                    }
                    gradientType = gradientType;
                    jsonReader.mo5831h();
                    if (arrayList.size() == 1) {
                        arrayList.add((C38394b) arrayList.get(0));
                    }
                    gradientType = gradientType;
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    break;
            }
        }
        GradientType gradientType4 = gradientType;
        C38396d c38396d2 = c38396dM92941h;
        if (c38396d2 == null) {
            c38396d2 = new C38396d(Collections.singletonList(new C43348a(100)));
        }
        return new C5094a(strMo5838o, gradientType4, c38395cM92940g, c38396d2, c38398fM92942i, c38398fM92942i2, c38394bM92938e, lineCapType, lineJoinType, fMo5835l, arrayList, c38394b, zMo5834k);
    }
}
