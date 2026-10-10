package p444m1;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p328i1.C38394b;
import p328i1.C38402j;
import p328i1.C38403k;
import p328i1.C38404l;
import p355j1.C40198a;
import p355j1.InterfaceC40200c;
import p484o1.C42930l;
import p522p1.C43348a;

/* JADX INFO: renamed from: m1.v */
/* JADX INFO: compiled from: LayerParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42382v {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93913a = JsonReader.C5103a.m5845a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", CmcdConfiguration.KEY_STREAM_TYPE, "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b */
    public static final JsonReader.C5103a f93914b = JsonReader.C5103a.m5845a("d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);

    /* JADX INFO: renamed from: c */
    public static final JsonReader.C5103a f93915c = JsonReader.C5103a.m5845a("ty", "nm");

    /* JADX INFO: renamed from: m1.v$a */
    /* JADX INFO: compiled from: LayerParser.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93916a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f93916a = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93916a[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Layer m92997b(JsonReader jsonReader, C5080h c5080h) throws IOException {
        boolean z11;
        float f11;
        float f12;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        LBlendMode lBlendMode = LBlendMode.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.mo5830g();
        boolean z12 = false;
        float f13 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        float fMo5835l = 1.0f;
        Float fValueOf2 = Float.valueOf(1.0f);
        LBlendMode lBlendMode2 = lBlendMode;
        C38402j c38402jM92937d = null;
        C38403k c38403kM92923a = null;
        C38394b c38394bM92939f = null;
        C40198a c40198aM92947b = null;
        C42365j c42365jM92964b = null;
        boolean z13 = false;
        int iMo5836m = 0;
        int iMo5836m2 = 0;
        int color = 0;
        boolean zMo5834k = false;
        long jMo5836m = 0;
        float fMo5835l2 = 0.0f;
        float fM5655f = 0.0f;
        float fMo5835l3 = 0.0f;
        float fMo5835l4 = 0.0f;
        Layer.MatteType matteType2 = matteType;
        long jMo5836m2 = -1;
        String strMo5838o = "UNSET";
        String strMo5838o2 = null;
        C38404l c38404l = null;
        Layer.LayerType layerType = null;
        String strMo5838o3 = null;
        float fMo5835l5 = 0.0f;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93913a)) {
                case 0:
                    strMo5838o = jsonReader.mo5838o();
                    z12 = false;
                    break;
                case 1:
                    jMo5836m = jsonReader.mo5836m();
                    z12 = false;
                    break;
                case 2:
                    strMo5838o3 = jsonReader.mo5838o();
                    z12 = false;
                    break;
                case 3:
                    f11 = f13;
                    int iMo5836m3 = jsonReader.mo5836m();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (iMo5836m3 < layerType.ordinal()) {
                        layerType = Layer.LayerType.values()[iMo5836m3];
                    }
                    f13 = f11;
                    z12 = false;
                    break;
                case 4:
                    jMo5836m2 = jsonReader.mo5836m();
                    z12 = false;
                    break;
                case 5:
                    iMo5836m = (int) (jsonReader.mo5836m() * C42930l.m94202e());
                    z12 = false;
                    break;
                case 6:
                    iMo5836m2 = (int) (jsonReader.mo5836m() * C42930l.m94202e());
                    z12 = false;
                    break;
                case 7:
                    color = Color.parseColor(jsonReader.mo5838o());
                    z12 = false;
                    break;
                case 8:
                    c38404l = C42351c.m92932g(jsonReader, c5080h);
                    z12 = false;
                    break;
                case 9:
                    f11 = f13;
                    int iMo5836m4 = jsonReader.mo5836m();
                    if (iMo5836m4 >= Layer.MatteType.values().length) {
                        c5080h.m5650a("Unsupported matte type: " + iMo5836m4);
                    } else {
                        matteType2 = Layer.MatteType.values()[iMo5836m4];
                        int i11 = a.f93916a[matteType2.ordinal()];
                        if (i11 == 1) {
                            c5080h.m5650a("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            c5080h.m5650a("Unsupported matte type: Luma Inverted");
                        }
                        c5080h.m5667r(1);
                    }
                    f13 = f11;
                    z12 = false;
                    break;
                case 10:
                    f11 = f13;
                    jsonReader.mo5829b();
                    while (jsonReader.mo5833j()) {
                        arrayList.add(C42384x.m93004a(jsonReader, c5080h));
                    }
                    c5080h.m5667r(arrayList.size());
                    jsonReader.mo5831h();
                    f13 = f11;
                    z12 = false;
                    break;
                case 11:
                    ArrayList arrayList3 = arrayList2;
                    f11 = f13;
                    jsonReader.mo5829b();
                    while (jsonReader.mo5833j()) {
                        InterfaceC40200c interfaceC40200cM92953a = C42361h.m92953a(jsonReader, c5080h);
                        ArrayList arrayList4 = arrayList3;
                        if (interfaceC40200cM92953a != null) {
                            arrayList4.add(interfaceC40200cM92953a);
                        }
                        arrayList3 = arrayList4;
                    }
                    arrayList2 = arrayList3;
                    jsonReader.mo5831h();
                    f13 = f11;
                    z12 = false;
                    break;
                case 12:
                    jsonReader.mo5830g();
                    while (jsonReader.mo5833j()) {
                        int iMo5841v = jsonReader.mo5841v(f93914b);
                        if (iMo5841v == 0) {
                            c38402jM92937d = C42353d.m92937d(jsonReader, c5080h);
                        } else if (iMo5841v != 1) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            jsonReader.mo5829b();
                            if (jsonReader.mo5833j()) {
                                c38403kM92923a = C42349b.m92923a(jsonReader, c5080h);
                            }
                            while (jsonReader.mo5833j()) {
                                jsonReader.mo5843x();
                            }
                            jsonReader.mo5831h();
                        }
                    }
                    jsonReader.mo5832i();
                    f13 = f13;
                    arrayList2 = arrayList2;
                    z12 = false;
                    break;
                case 13:
                    jsonReader.mo5829b();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.mo5833j()) {
                        jsonReader.mo5830g();
                        while (jsonReader.mo5833j()) {
                            int iMo5841v2 = jsonReader.mo5841v(f93915c);
                            if (iMo5841v2 == 0) {
                                int iMo5836m5 = jsonReader.mo5836m();
                                if (iMo5836m5 == 29) {
                                    c40198aM92947b = C42355e.m92947b(jsonReader, c5080h);
                                } else if (iMo5836m5 == 25) {
                                    c42365jM92964b = new C42367k().m92964b(jsonReader, c5080h);
                                }
                            } else if (iMo5841v2 != 1) {
                                jsonReader.mo5842w();
                                jsonReader.mo5843x();
                            } else {
                                arrayList5.add(jsonReader.mo5838o());
                            }
                        }
                        jsonReader.mo5832i();
                    }
                    jsonReader.mo5831h();
                    c5080h.m5650a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    f13 = f13;
                    arrayList2 = arrayList2;
                    z12 = false;
                    break;
                case 14:
                    fMo5835l = (float) jsonReader.mo5835l();
                    z12 = false;
                    break;
                case 15:
                    fMo5835l5 = (float) jsonReader.mo5835l();
                    z12 = false;
                    break;
                case 16:
                    arrayList2 = arrayList2;
                    fMo5835l3 = (float) (jsonReader.mo5835l() * ((double) C42930l.m94202e()));
                    arrayList2 = arrayList2;
                    z12 = false;
                    break;
                case 17:
                    fMo5835l4 = (float) (jsonReader.mo5835l() * ((double) C42930l.m94202e()));
                    f13 = f13;
                    arrayList2 = arrayList2;
                    z12 = false;
                    break;
                case 18:
                    fMo5835l2 = (float) jsonReader.mo5835l();
                    break;
                case 19:
                    fM5655f = (float) jsonReader.mo5835l();
                    break;
                case 20:
                    c38394bM92939f = C42353d.m92939f(jsonReader, c5080h, z12);
                    break;
                case 21:
                    strMo5838o2 = jsonReader.mo5838o();
                    break;
                case 22:
                    zMo5834k = jsonReader.mo5834k();
                    break;
                case 23:
                    f12 = f13;
                    z13 = jsonReader.mo5836m() == 1 ? true : z12;
                    f13 = f12;
                    break;
                case 24:
                    int iMo5836m6 = jsonReader.mo5836m();
                    if (iMo5836m6 < LBlendMode.values().length) {
                        lBlendMode2 = LBlendMode.values()[iMo5836m6];
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        f12 = f13;
                        sb2.append("Unsupported Blend Mode: ");
                        sb2.append(iMo5836m6);
                        c5080h.m5650a(sb2.toString());
                        lBlendMode2 = LBlendMode.NORMAL;
                        f13 = f12;
                    }
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    f11 = f13;
                    f13 = f11;
                    z12 = false;
                    break;
            }
        }
        float f14 = f13;
        jsonReader.mo5832i();
        ArrayList arrayList6 = new ArrayList();
        if (fMo5835l2 > f14) {
            z11 = z13;
            arrayList6.add(new C43348a(c5080h, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fMo5835l2)));
        } else {
            z11 = z13;
        }
        if (fM5655f <= f14) {
            fM5655f = c5080h.m5655f();
        }
        arrayList6.add(new C43348a(c5080h, fValueOf2, fValueOf2, null, fMo5835l2, Float.valueOf(fM5655f)));
        arrayList6.add(new C43348a(c5080h, fValueOf, fValueOf, null, fM5655f, Float.valueOf(Float.MAX_VALUE)));
        if (strMo5838o.endsWith(".ai") || "ai".equals(strMo5838o2)) {
            c5080h.m5650a("Convert your Illustrator layers to shape layers.");
        }
        if (z11) {
            if (c38404l == null) {
                c38404l = new C38404l();
            }
            c38404l.m86592m(z11);
        }
        return new Layer(arrayList2, c5080h, strMo5838o, jMo5836m, layerType, jMo5836m2, strMo5838o3, arrayList, c38404l, iMo5836m, iMo5836m2, color, fMo5835l, fMo5835l5, fMo5835l3, fMo5835l4, c38402jM92937d, c38403kM92923a, arrayList6, matteType2, c38394bM92939f, zMo5834k, c40198aM92947b, c42365jM92964b, lBlendMode2);
    }

    /* JADX INFO: renamed from: a */
    public static Layer m92996a(C5080h c5080h) {
        Rect rectM5651b = c5080h.m5651b();
        List list = Collections.EMPTY_LIST;
        return new Layer(list, c5080h, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, list, new C38404l(), 0, 0, 0, 0.0f, 0.0f, rectM5651b.width(), rectM5651b.height(), null, null, list, Layer.MatteType.NONE, null, false, null, null, LBlendMode.NORMAL);
    }
}
