package com.jumio.core.api.calls;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import com.jumio.core.models.automation.AutomationModel;
import java.io.Serializable;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0014R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/core/api/calls/UsabilityCall;", "Lcom/jumio/core/network/SimpleApiCall;", "Lcom/jumio/core/models/automation/AutomationModel;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "<init>", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V", "resultKey", "", "getResultKey", "()Ljava/lang/String;", "uri", "getUri", "parseResponse", "plainTextAnswer", "getRequest", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUsabilityCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UsabilityCall.kt\ncom/jumio/core/api/calls/UsabilityCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class UsabilityCall extends AbstractC40575O3 {

    @NotNull
    public static final String DATA_RESULT_KEY = "DATA_RESULT_KEY";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsabilityCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey(DATA_RESULT_KEY)) {
            throw new IllegalArgumentException("Result Key is missing");
        }
    }

    @Override // jumio.core.AbstractC40575O3
    @NotNull
    public String getRequest() throws Exception {
        return "";
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    /* JADX INFO: renamed from: getUri */
    public String getF13717i() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC40652e.f90248a);
        sb2.append(StringDeobfuscator.deobfuscate(new byte[]{-86, 61, 12, -53, BuiltinOptions.HashtableSizeOptions, -44, -89, BuiltinOptions.RangeOptions, BuiltinOptions.Conv3DOptions, -87, -85, 16, BuiltinOptions.PowOptions, -49, -6, -36, BuiltinOptions.HashtableFindOptions}, -4685996733232977611L));
        Serializable serializable = getApiCallDataModel().getData().get(DATA_RESULT_KEY);
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) serializable);
        return sb2.toString();
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public AutomationModel parseResponse(@NotNull String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        return AutomationModel.INSTANCE.fromString(plainTextAnswer);
    }
}
