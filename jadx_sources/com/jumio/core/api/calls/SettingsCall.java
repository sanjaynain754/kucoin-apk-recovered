package com.jumio.core.api.calls;

import com.jumio.commons.log.Log;
import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40591S0;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
public final class SettingsCall extends AbstractC40575O3 {

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/api/calls/SettingsCall$Companion;", "", "<init>", "()V", "DATA_AVAILABLE_PLUGIN_NAMES", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey("DATA_AVAILABLE_PLUGIN_NAMES")) {
            throw new IllegalArgumentException("Available Plugin Names are missing");
        }
    }

    @Override // jumio.core.AbstractC40575O3
    public final String getRequest() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Object obj = getApiCallDataModel().getData().get("DATA_AVAILABLE_PLUGIN_NAMES");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        for (String str : (String[]) obj) {
            jSONArray.put(str);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("linkedModules", jSONArray);
        jSONObject.put("deviceDetails", AbstractC40591S0.m89236a());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.jumio.core.network.ApiCall
    /* JADX INFO: renamed from: getUri */
    public final String getF13717i() {
        return AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{-22, -121, -25, BuiltinOptions.FloorDivOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMinOptions, BuiltinOptions.SelectV2Options, -73}, -3991709031461092330L);
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
