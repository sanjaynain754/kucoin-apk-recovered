package jumio.core;

import android.graphics.Color;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.jumio.analytics.MetaInfo;
import com.jumio.core.data.scan.ByteArrayData;
import com.jumio.core.extraction.result.DataExtractionResult;
import com.jumio.core.extraction.result.ExtractionResult;
import com.jumio.core.extraction.result.ExtractionResultProvider;
import com.jumio.core.model.StaticModel;
import com.jumio.core.util.GzipUtilKt;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.u1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40734u1 implements StaticModel, ExtractionResultProvider {

    /* JADX INFO: renamed from: a */
    public final ArrayList f90441a;

    /* JADX INFO: renamed from: b */
    public long f90442b;

    /* JADX INFO: renamed from: c */
    public long f90443c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40734u1)) {
            return false;
        }
        C40734u1 c40734u1 = (C40734u1) obj;
        return Intrinsics.areEqual(this.f90441a, c40734u1.f90441a) && this.f90442b == c40734u1.f90442b && this.f90443c == c40734u1.f90443c;
    }

    public C40734u1() {
        ArrayList frames = new ArrayList();
        Intrinsics.checkNotNullParameter(frames, "frames");
        this.f90441a = frames;
        this.f90442b = 0L;
        this.f90443c = 0L;
    }

    public final int hashCode() {
        return Long.hashCode(this.f90443c) + AbstractC40749x1.m89269a(this.f90442b, this.f90441a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlashProcessingResult(frames=" + this.f90441a + ", flashColorShiftDuration=" + this.f90442b + ", flashLuxAdaptionDuration=" + this.f90443c + ')';
    }

    @Override // com.jumio.core.extraction.result.ExtractionResultProvider
    public final ExtractionResult getExtractionResult(String side, String classifier, String str) throws JSONException {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        String str2 = classifier + "_GZIP";
        ByteArrayData byteArrayData = new ByteArrayData();
        JSONObject jSONObject = new JSONObject();
        ArrayList<C40724s1> arrayList = this.f90441a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C40724s1 c40724s1 : arrayList) {
            c40724s1.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", c40724s1.f90398d.getTimestamp());
            jSONObject2.put("red", Color.red(c40724s1.f90395a));
            jSONObject2.put("green", Color.green(c40724s1.f90395a));
            jSONObject2.put("blue", Color.blue(c40724s1.f90395a));
            jSONObject2.put("fNumber", AbstractC40514C2.m89155a(c40724s1.f90398d.getAperture(), 3));
            jSONObject2.put(JAnalysisConstants.TYPE_EXPOSURE, AbstractC40514C2.m89155a(c40724s1.f90398d.getShutterSpeed() / 1.0E9d, 5));
            jSONObject2.put("iso", c40724s1.f90398d.getIso());
            arrayList2.add(jSONObject2);
        }
        jSONObject.put("images", new JSONArray((Collection) arrayList2));
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        byteArrayData.setData(GzipUtilKt.toGzip(string));
        byteArrayData.setMimeType("application/x-gzip-compressed");
        MetaInfo metaInfo = new MetaInfo();
        metaInfo.put("flashColorShiftDuration", Double.valueOf(this.f90442b / 1000.0d));
        metaInfo.put("flashLuxAdaptionDuration", Double.valueOf(this.f90443c / 1000.0d));
        Unit unit = Unit.INSTANCE;
        return new DataExtractionResult(side, str2, str, byteArrayData, metaInfo);
    }
}
