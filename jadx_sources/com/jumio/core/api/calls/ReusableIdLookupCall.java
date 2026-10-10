package com.jumio.core.api.calls;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.ReusableIdLookupResult;
import java.io.Serializable;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
public final class ReusableIdLookupCall extends AbstractC40575O3 {

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/api/calls/ReusableIdLookupCall$Companion;", "", "<init>", "()V", "KEY_LOOKUP_ID", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReusableIdLookupCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey("KEY_LOOKUP_ID")) {
            throw new IllegalArgumentException("Lookup ID is missing");
        }
    }

    @Override // jumio.core.AbstractC40575O3
    public final String getRequest() {
        return "";
    }

    @Override // com.jumio.core.network.ApiCall
    /* JADX INFO: renamed from: getUri */
    public final String getF13717i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC40652e.f90248a);
        sb2.append(StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.AssignVariableOptions, -1, -5, BuiltinOptions.RangeOptions, -9, 10, -90, -4, 32, BuiltinOptions.Conv3DOptions, BuiltinOptions.SquareOptions, -93, -23, BuiltinOptions.MatrixSetDiagOptions}, 675461163752837440L));
        Serializable serializable = getApiCallDataModel().getData().get("KEY_LOOKUP_ID");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) serializable);
        return sb2.toString();
    }

    @Override // com.jumio.core.network.ApiCall
    public final Object parseResponse(String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        return ReusableIdLookupResult.f14310b.fromJson(new JSONObject(plainTextAnswer));
    }
}
