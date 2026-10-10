package p444m1;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: m1.s */
/* JADX INFO: compiled from: JsonUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C42379s {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93906a = JsonReader.C5103a.m5845a("x", "y");

    /* JADX INFO: renamed from: m1.s$a */
    /* JADX INFO: compiled from: JsonUtils.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93907a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f93907a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93907a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93907a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static PointF m92983e(JsonReader jsonReader, float f11) throws IOException {
        int i11 = a.f93907a[jsonReader.mo5839q().ordinal()];
        if (i11 == 1) {
            return m92980b(jsonReader, f11);
        }
        if (i11 == 2) {
            return m92979a(jsonReader, f11);
        }
        if (i11 == 3) {
            return m92981c(jsonReader, f11);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.mo5839q());
    }

    /* JADX INFO: renamed from: f */
    public static List<PointF> m92984f(JsonReader jsonReader, float f11) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo5829b();
        while (jsonReader.mo5839q() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo5829b();
            arrayList.add(m92983e(jsonReader, f11));
            jsonReader.mo5831h();
        }
        jsonReader.mo5831h();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static PointF m92979a(JsonReader jsonReader, float f11) throws IOException {
        jsonReader.mo5829b();
        float fMo5835l = (float) jsonReader.mo5835l();
        float fMo5835l2 = (float) jsonReader.mo5835l();
        while (jsonReader.mo5839q() != JsonReader.Token.END_ARRAY) {
            jsonReader.mo5843x();
        }
        jsonReader.mo5831h();
        return new PointF(fMo5835l * f11, fMo5835l2 * f11);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m92980b(JsonReader jsonReader, float f11) throws IOException {
        float fMo5835l = (float) jsonReader.mo5835l();
        float fMo5835l2 = (float) jsonReader.mo5835l();
        while (jsonReader.mo5833j()) {
            jsonReader.mo5843x();
        }
        return new PointF(fMo5835l * f11, fMo5835l2 * f11);
    }

    /* JADX INFO: renamed from: c */
    public static PointF m92981c(JsonReader jsonReader, float f11) throws IOException {
        jsonReader.mo5830g();
        float fM92985g = 0.0f;
        float fM92985g2 = 0.0f;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93906a);
            if (iMo5841v != 0) {
                if (iMo5841v != 1) {
                    jsonReader.mo5842w();
                    jsonReader.mo5843x();
                } else {
                    fM92985g2 = m92985g(jsonReader);
                }
            } else {
                fM92985g = m92985g(jsonReader);
            }
        }
        jsonReader.mo5832i();
        return new PointF(fM92985g * f11, fM92985g2 * f11);
    }

    @ColorInt
    /* JADX INFO: renamed from: d */
    public static int m92982d(JsonReader jsonReader) throws IOException {
        jsonReader.mo5829b();
        int iMo5835l = (int) (jsonReader.mo5835l() * 255.0d);
        int iMo5835l2 = (int) (jsonReader.mo5835l() * 255.0d);
        int iMo5835l3 = (int) (jsonReader.mo5835l() * 255.0d);
        while (jsonReader.mo5833j()) {
            jsonReader.mo5843x();
        }
        jsonReader.mo5831h();
        return Color.argb(255, iMo5835l, iMo5835l2, iMo5835l3);
    }

    /* JADX INFO: renamed from: g */
    public static float m92985g(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenMo5839q = jsonReader.mo5839q();
        int i11 = a.f93907a[tokenMo5839q.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                jsonReader.mo5829b();
                float fMo5835l = (float) jsonReader.mo5835l();
                while (jsonReader.mo5833j()) {
                    jsonReader.mo5843x();
                }
                jsonReader.mo5831h();
                return fMo5835l;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + tokenMo5839q);
        }
        return (float) jsonReader.mo5835l();
    }
}
