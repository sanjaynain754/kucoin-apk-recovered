package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.r1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40719r1 extends AbstractC40575O3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40719r1(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
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
        return AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{-93, -42, BuiltinOptions.SplitOptions, -54, -66, -128, -40, 22}, 3486798841543688390L);
    }

    @Override // com.jumio.core.network.ApiCall
    public final Object parseResponse(String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        try {
            return new JSONObject(plainTextAnswer);
        } catch (Exception e11) {
            Log.m14485w(getF14409e(), "Exception", e11);
            return new JSONObject();
        }
    }
}
