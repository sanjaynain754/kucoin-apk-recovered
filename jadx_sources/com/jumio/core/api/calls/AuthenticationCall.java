package com.jumio.core.api.calls;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.AuthenticationModel;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0014R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/core/api/calls/AuthenticationCall;", "Lcom/jumio/core/network/SimpleApiCall;", "Lcom/jumio/core/models/AuthenticationModel;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "<init>", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V", "uri", "", "getUri", "()Ljava/lang/String;", "parseResponse", "plainTextAnswer", "getRequest", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AuthenticationCall extends AbstractC40575O3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
    }

    @Override // jumio.core.AbstractC40575O3
    @NotNull
    public String getRequest() throws Exception {
        return "";
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public String getUri() {
        return AbstractC40652e.f90248a + StringDeobfuscator.deobfuscate(new byte[]{BuiltinOptions.LogicalOrOptions, BuiltinOptions.MatrixDiagOptions, -26, 30, -26, BuiltinOptions.PowOptions, 6, -57, -6, -82, -66, BuiltinOptions.ReadVariableOptions, -88, -4, -100, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AbsOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ZerosLikeOptions, -77, 64}, -3282894363905964772L);
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public AuthenticationModel parseResponse(@NotNull String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        return AuthenticationModel.INSTANCE.fromString(plainTextAnswer);
    }
}
