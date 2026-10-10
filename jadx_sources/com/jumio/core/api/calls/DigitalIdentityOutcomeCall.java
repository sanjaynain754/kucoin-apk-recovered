package com.jumio.core.api.calls;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import java.io.Serializable;
import java.util.Map;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0014R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m90084d2 = {"Lcom/jumio/core/api/calls/DigitalIdentityOutcomeCall;", "Lcom/jumio/core/network/SimpleApiCall;", "Lorg/json/JSONObject;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "<init>", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V", "jwt", "", "getJwt", "()Ljava/lang/String;", "uri", "getUri$annotations", "()V", "getUri", "headers", "", "getHeaders", "()Ljava/util/Map;", "parseResponse", "plainTextAnswer", "getRequest", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDigitalIdentityOutcomeCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigitalIdentityOutcomeCall.kt\ncom/jumio/core/api/calls/DigitalIdentityOutcomeCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class DigitalIdentityOutcomeCall extends AbstractC40575O3 {

    @NotNull
    public static final String DATA_JWT = "DATA_JWT";

    /* JADX INFO: renamed from: i */
    public final String f13713i;

    /* JADX INFO: renamed from: j */
    public final Map f13714j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalIdentityOutcomeCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey("DATA_JWT")) {
            throw new IllegalArgumentException("JWT is missing in passed data");
        }
        this.f13713i = AbstractC40652e.f90249b + StringDeobfuscator.deobfuscate(new byte[]{-31, 17, -127, BuiltinOptions.HashtableOptions, -91, 2, BuiltinOptions.HashtableSizeOptions, 28, -119, 1, -117, BuiltinOptions.ExpOptions, BuiltinOptions.SplitOptions, 22, -77, 29, -80, -74, -49, BuiltinOptions.AssignVariableOptions, -113, -83, -119, -12}, 7759624741207660194L);
        Map mutableMap = MapsKt.toMutableMap(super.getHeaders());
        mutableMap.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        this.f13714j = mutableMap;
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public Map<String, String> getHeaders() {
        return this.f13714j;
    }

    @Override // jumio.core.AbstractC40575O3
    @NotNull
    public String getRequest() {
        StringBuilder sb2 = new StringBuilder("jwt=");
        Serializable serializable = getApiCallDataModel().getData().get("DATA_JWT");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) serializable);
        return sb2.toString();
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    /* JADX INFO: renamed from: getUri, reason: from getter */
    public String getF13717i() {
        return this.f13713i;
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public JSONObject parseResponse(@NotNull String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        return new JSONObject(plainTextAnswer);
    }

    public static /* synthetic */ void getUri$annotations() {
    }
}
