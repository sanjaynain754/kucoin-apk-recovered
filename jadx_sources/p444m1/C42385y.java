package p444m1;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: m1.y */
/* JADX INFO: compiled from: MergePathsParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C42385y {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.C5103a f93921a = JsonReader.C5103a.m5845a("nm", "mm", "hd");

    /* JADX INFO: renamed from: a */
    public static MergePaths m93005a(JsonReader jsonReader) throws IOException {
        String strMo5838o = null;
        boolean zMo5834k = false;
        MergePaths.MergePathsMode mergePathsModeForId = null;
        while (jsonReader.mo5833j()) {
            int iMo5841v = jsonReader.mo5841v(f93921a);
            if (iMo5841v == 0) {
                strMo5838o = jsonReader.mo5838o();
            } else if (iMo5841v == 1) {
                mergePathsModeForId = MergePaths.MergePathsMode.forId(jsonReader.mo5836m());
            } else if (iMo5841v != 2) {
                jsonReader.mo5842w();
                jsonReader.mo5843x();
            } else {
                zMo5834k = jsonReader.mo5834k();
            }
        }
        return new MergePaths(strMo5838o, mergePathsModeForId, zMo5834k);
    }
}
