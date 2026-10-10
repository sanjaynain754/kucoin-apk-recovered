package jumio.core;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: jumio.core.K3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40555K3 {
    /* JADX INFO: renamed from: a */
    public static final void m89200a(JSONObject jSONObject, C40675i2 c40675i2) throws JSONException {
        Object objFirstOrNull;
        String str = c40675i2.f90292a;
        List list = c40675i2.f90293b;
        if (list.size() > 1) {
            objFirstOrNull = new JSONArray((Collection) list);
        } else {
            objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
            if (objFirstOrNull == null) {
                objFirstOrNull = "";
            }
        }
        jSONObject.put(str, objFirstOrNull);
    }
}
