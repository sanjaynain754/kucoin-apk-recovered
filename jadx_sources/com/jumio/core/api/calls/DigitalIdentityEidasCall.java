package com.jumio.core.api.calls;

import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.DigitalIdentityEidasModel;
import java.io.Serializable;
import java.util.Map;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
public final class DigitalIdentityEidasCall extends AbstractC40575O3 {

    /* JADX INFO: renamed from: i */
    public final String f13711i;

    /* JADX INFO: renamed from: j */
    public final Map f13712j;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/api/calls/DigitalIdentityEidasCall$Companion;", "", "<init>", "()V", "DATA_JWT", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalIdentityEidasCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey("DATA_JWT")) {
            throw new IllegalArgumentException("JWT is missing in passed data");
        }
        this.f13711i = AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{-6, -93, 26, -104, -63, BuiltinOptions.FloorModOptions, -52, -113, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.VarHandleOptions, -127, -29, 13, -80, BuiltinOptions.BroadcastToOptions, -26, BuiltinOptions.WhileOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ArgMaxOptions, -47, 28}, -5200821544876730208L);
        Map mutableMap = MapsKt.toMutableMap(super.getHeaders());
        mutableMap.put("Content-Type", "application/json");
        StringBuilder sb2 = new StringBuilder("Bearer ");
        Serializable serializable = getApiCallDataModel().getData().get("DATA_JWT");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) serializable);
        mutableMap.put("Authorization", sb2.toString());
        this.f13712j = mutableMap;
    }

    @Override // com.jumio.core.network.ApiCall
    public final Map getHeaders() {
        return this.f13712j;
    }

    @Override // jumio.core.AbstractC40575O3
    public final String getRequest() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("redirectUrl", "eidas://jumio-digital-identity");
        jSONObject.put("shouldAppendToken", false);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.jumio.core.network.ApiCall
    /* JADX INFO: renamed from: getUri */
    public final String getF13717i() {
        return this.f13711i;
    }

    @Override // com.jumio.core.network.ApiCall
    public final Object parseResponse(String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        try {
            return DigitalIdentityEidasModel.INSTANCE.fromJson(new JSONObject(plainTextAnswer));
        } catch (Exception e11) {
            Log.m14485w(getF14409e(), "Exception", e11);
            return new DigitalIdentityEidasModel(null, 1, null);
        }
    }
}
