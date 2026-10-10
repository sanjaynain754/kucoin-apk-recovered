package p444m1;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.C5083i0;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p297h1.C38072b;
import p297h1.C38073c;
import p297h1.C38077g;
import p484o1.C42924f;
import p484o1.C42930l;

/* JADX INFO: renamed from: m1.w */
/* JADX INFO: compiled from: LottieCompositionMoshiParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42383w {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93917a = JsonReader.C5103a.m5845a("w", CmcdData.Factory.STREAMING_FORMAT_HLS, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static JsonReader.C5103a f93918b = JsonReader.C5103a.m5845a("id", "layers", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "p", "u");

    /* JADX INFO: renamed from: c */
    public static final JsonReader.C5103a f93919c = JsonReader.C5103a.m5845a("list");

    /* JADX INFO: renamed from: d */
    public static final JsonReader.C5103a f93920d = JsonReader.C5103a.m5845a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static C5080h m92998a(JsonReader jsonReader) throws IOException {
        jsonReader = jsonReader;
        float fM94202e = C42930l.m94202e();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArrayCompat<C38073c> sparseArrayCompat = new SparseArrayCompat<>();
        C5080h c5080h = new C5080h();
        jsonReader.mo5830g();
        float fMo5835l = 0.0f;
        float fMo5835l2 = 0.0f;
        float fMo5835l3 = 0.0f;
        int iMo5836m = 0;
        int iMo5836m2 = 0;
        while (jsonReader.mo5833j()) {
            switch (jsonReader.mo5841v(f93917a)) {
                case 0:
                    iMo5836m = jsonReader.mo5836m();
                    break;
                case 1:
                    iMo5836m2 = jsonReader.mo5836m();
                    break;
                case 2:
                    fMo5835l = (float) jsonReader.mo5835l();
                    fM94202e = fM94202e;
                    break;
                case 3:
                    fMo5835l2 = ((float) jsonReader.mo5835l()) - 0.01f;
                    fM94202e = fM94202e;
                    break;
                case 4:
                    fMo5835l3 = (float) jsonReader.mo5835l();
                    fM94202e = fM94202e;
                    break;
                case 5:
                    String[] strArrSplit = jsonReader.mo5838o().split("\\.");
                    if (!C42930l.m94207j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        c5080h.m5650a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    m93002e(jsonReader, c5080h, arrayList, longSparseArray);
                    break;
                case 7:
                    m92999b(jsonReader, c5080h, map, map2);
                    break;
                case 8:
                    m93001d(jsonReader, map3);
                    break;
                case 9:
                    m93000c(jsonReader, c5080h, sparseArrayCompat);
                    break;
                case 10:
                    m93003f(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                    break;
            }
        }
        float f11 = fM94202e;
        c5080h.m5668s(new Rect(0, 0, (int) (iMo5836m * f11), (int) (iMo5836m2 * f11)), fMo5835l, fMo5835l2, fMo5835l3, arrayList, longSparseArray, map, map2, C42930l.m94202e(), sparseArrayCompat, map3, arrayList2);
        return c5080h;
    }

    /* JADX INFO: renamed from: b */
    public static void m92999b(JsonReader jsonReader, C5080h c5080h, Map<String, List<Layer>> map, Map<String, C5083i0> map2) throws IOException {
        jsonReader.mo5829b();
        while (jsonReader.mo5833j()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.mo5830g();
            int iMo5836m = 0;
            int iMo5836m2 = 0;
            String strMo5838o = null;
            String strMo5838o2 = null;
            String strMo5838o3 = null;
            while (jsonReader.mo5833j()) {
                int iMo5841v = jsonReader.mo5841v(f93918b);
                if (iMo5841v != 0) {
                    if (iMo5841v != 1) {
                        if (iMo5841v != 2) {
                            if (iMo5841v != 3) {
                                if (iMo5841v != 4) {
                                    if (iMo5841v != 5) {
                                        jsonReader.mo5842w();
                                        jsonReader.mo5843x();
                                    } else {
                                        strMo5838o3 = jsonReader.mo5838o();
                                    }
                                } else {
                                    strMo5838o2 = jsonReader.mo5838o();
                                }
                            } else {
                                iMo5836m2 = jsonReader.mo5836m();
                            }
                        } else {
                            iMo5836m = jsonReader.mo5836m();
                        }
                    } else {
                        jsonReader.mo5829b();
                        while (jsonReader.mo5833j()) {
                            Layer layerM92997b = C42382v.m92997b(jsonReader, c5080h);
                            longSparseArray.put(layerM92997b.m5745e(), layerM92997b);
                            arrayList.add(layerM92997b);
                        }
                        jsonReader.mo5831h();
                    }
                } else {
                    strMo5838o = jsonReader.mo5838o();
                }
            }
            jsonReader.mo5832i();
            if (strMo5838o2 != null) {
                C5083i0 c5083i0 = new C5083i0(iMo5836m, iMo5836m2, strMo5838o, strMo5838o2, strMo5838o3);
                map2.put(c5083i0.m5676e(), c5083i0);
            } else {
                map.put(strMo5838o, arrayList);
            }
        }
        jsonReader.mo5831h();
    }

    /* JADX INFO: renamed from: c */
    public static void m93000c(JsonReader jsonReader, C5080h c5080h, SparseArrayCompat<C38073c> sparseArrayCompat) throws IOException {
        jsonReader.mo5829b();
        while (jsonReader.mo5833j()) {
            C38073c c38073cM92968a = C42371m.m92968a(jsonReader, c5080h);
            sparseArrayCompat.put(c38073cM92968a.hashCode(), c38073cM92968a);
        }
        jsonReader.mo5831h();
    }

    /* JADX INFO: renamed from: d */
    public static void m93001d(JsonReader jsonReader, Map<String, C38072b> map) throws IOException {
        jsonReader.mo5830g();
        while (jsonReader.mo5833j()) {
            if (jsonReader.mo5841v(f93919c) != 0) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                jsonReader.mo5829b();
                while (jsonReader.mo5833j()) {
                    C38072b c38072bM92970a = C42373n.m92970a(jsonReader);
                    map.put(c38072bM92970a.m85958b(), c38072bM92970a);
                }
                jsonReader.mo5831h();
            }
        }
        jsonReader.mo5832i();
    }

    /* JADX INFO: renamed from: e */
    public static void m93002e(JsonReader jsonReader, C5080h c5080h, List<Layer> list, LongSparseArray<Layer> longSparseArray) throws IOException {
        jsonReader.mo5829b();
        int i11 = 0;
        while (jsonReader.mo5833j()) {
            Layer layerM92997b = C42382v.m92997b(jsonReader, c5080h);
            if (layerM92997b.m5747g() == Layer.LayerType.IMAGE) {
                i11++;
            }
            list.add(layerM92997b);
            longSparseArray.put(layerM92997b.m5745e(), layerM92997b);
            if (i11 > 4) {
                C42924f.m94158c("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.mo5831h();
    }

    /* JADX INFO: renamed from: f */
    public static void m93003f(JsonReader jsonReader, List<C38077g> list) throws IOException {
        jsonReader.mo5829b();
        while (jsonReader.mo5833j()) {
            jsonReader.mo5830g();
            float fMo5835l = 0.0f;
            String strMo5838o = null;
            float fMo5835l2 = 0.0f;
            while (jsonReader.mo5833j()) {
                int iMo5841v = jsonReader.mo5841v(f93920d);
                if (iMo5841v != 0) {
                    if (iMo5841v != 1) {
                        if (iMo5841v != 2) {
                            jsonReader.mo5842w();
                            jsonReader.mo5843x();
                        } else {
                            fMo5835l2 = (float) jsonReader.mo5835l();
                        }
                    } else {
                        fMo5835l = (float) jsonReader.mo5835l();
                    }
                } else {
                    strMo5838o = jsonReader.mo5838o();
                }
            }
            jsonReader.mo5832i();
            list.add(new C38077g(strMo5838o, fMo5835l, fMo5835l2));
        }
        jsonReader.mo5831h();
    }
}
