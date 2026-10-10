package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.sdk.result.JumioIDResult;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.h1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40669h1 extends AbstractC40575O3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40669h1(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
    }

    @Override // jumio.core.AbstractC40575O3
    public final String getRequest() {
        return "";
    }

    @Override // com.jumio.core.network.ApiCall
    public final String getUri() {
        return AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.BatchMatMulOptions, -35, -99, -103, -74, BuiltinOptions.BatchMatMulOptions, -119, -9, BuiltinOptions.RandomOptions, 4, -53, 7, BuiltinOptions.SplitOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MaximumMinimumOptions, -23, 24, 5, BuiltinOptions.AddNOptions, BuiltinOptions.ArgMaxOptions}, 1493473626205255869L);
    }

    @Override // com.jumio.core.network.ApiCall
    public final Object parseResponse(String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(plainTextAnswer);
            Iterator<String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JumioIDResult.Companion companion = JumioIDResult.INSTANCE;
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                map.put(next, companion.fromJson(jSONObject2));
            }
        } catch (Exception e11) {
            Log.m14485w(getF14409e(), "Exception", e11);
        }
        return map;
    }
}
