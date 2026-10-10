package jumio.core;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.api.calls.AnalyticsCall;
import com.jumio.core.models.ApiCallDataModel;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.k3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40686k3 extends AnalyticsCall {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40686k3(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
    }

    @Override // com.jumio.core.api.calls.AnalyticsCall, com.jumio.core.network.ApiCall
    public final String getUri() {
        return AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.AbsOptions, -100, 31, -124, -58, 18, -45, 0, -42, -18, BuiltinOptions.ShapeOptions, 32, -45, 63}, -8890451435662554744L);
    }
}
