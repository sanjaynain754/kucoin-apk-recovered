package com.jumio.core.api.calls;

import com.jumio.commons.obfuscate.StringDeobfuscator;
import com.jumio.core.models.ApiCallDataModel;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import jumio.core.AbstractC40575O3;
import jumio.core.AbstractC40652e;
import jumio.core.InterfaceC40657f;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOptions;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0014R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\fR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001aX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, m90084d2 = {"Lcom/jumio/core/api/calls/DigitalIdentityWebViewCall;", "Lcom/jumio/core/network/SimpleApiCall;", "Lcom/jumio/core/api/calls/DigitalIdentityWebContentResult;", "apiCallSettings", "Lcom/jumio/core/network/ApiCallSettings;", "apiCallDataModel", "Lcom/jumio/core/models/ApiCallDataModel;", "<init>", "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V", "jwt", "", "getJwt", "()Ljava/lang/String;", "diSubtype", "getDiSubtype", "locale", "getLocale", "darkMode", "", "getDarkMode", "()Z", "uri", "getUri$annotations", "()V", "getUri", "headers", "", "getHeaders", "()Ljava/util/Map;", "parseResponse", "plainTextAnswer", "getRequest", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDigitalIdentityWebViewCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigitalIdentityWebViewCall.kt\ncom/jumio/core/api/calls/DigitalIdentityWebViewCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
public final class DigitalIdentityWebViewCall extends AbstractC40575O3 {

    @NotNull
    public static final String DATA_DARK_MODE = "DATA_DARK_MODE";

    @NotNull
    public static final String DATA_DI_SUBTYPE = "DATA_DI_SUBTYPE";

    @NotNull
    public static final String DATA_JWT = "DATA_JWT";

    @NotNull
    public static final String DATA_LOCALE = "DATA_LOCALE";

    /* JADX INFO: renamed from: i */
    public final String f13717i;

    /* JADX INFO: renamed from: j */
    public final Map f13718j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalIdentityWebViewCall(@NotNull InterfaceC40657f apiCallSettings, @NotNull ApiCallDataModel<?> apiCallDataModel) {
        super(apiCallSettings, apiCallDataModel);
        Intrinsics.checkNotNullParameter(apiCallSettings, "apiCallSettings");
        Intrinsics.checkNotNullParameter(apiCallDataModel, "apiCallDataModel");
        if (!apiCallDataModel.getData().containsKey("DATA_JWT")) {
            throw new IllegalArgumentException("JWT is missing in passed data");
        }
        if (!apiCallDataModel.getData().containsKey(DATA_DI_SUBTYPE)) {
            throw new IllegalArgumentException("Digital ID subtype is missing in passed data");
        }
        this.f13717i = AbstractC40652e.f90249b + StringDeobfuscator.deobfuscate(new byte[]{-7, -71, -2, BuiltinOptions.GreaterOptions, 127, BuiltinOptions.DensifyOptions, BuiltinOptions.AddNOptions, -83, -128, BuiltinOptions.TopKV2Options, BuiltinOptions.ExpandDimsOptions, -15, -81, -79, -15, BuiltinOptions.SplitOptions, -70, -101, -45, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CumsumOptions, -113, -20, BuiltinOptions.UnsortedSegmentMinOptions}, -19653549658805721L);
        Map mutableMap = MapsKt.toMutableMap(super.getHeaders());
        mutableMap.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        mutableMap.put("Accept", "text/html");
        this.f13718j = mutableMap;
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public Map<String, String> getHeaders() {
        return this.f13718j;
    }

    @Override // jumio.core.AbstractC40575O3
    @NotNull
    public String getRequest() {
        StringBuilder sb2 = new StringBuilder("jwt=");
        Serializable serializable = getApiCallDataModel().getData().get("DATA_JWT");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type kotlin.String");
        sb2.append((String) serializable);
        sb2.append("&di-subtype=");
        Serializable serializable2 = getApiCallDataModel().getData().get(DATA_DI_SUBTYPE);
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type kotlin.String");
        String upperCase = ((String) serializable2).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        sb2.append(upperCase);
        sb2.append("&locale=");
        Serializable serializable3 = getApiCallDataModel().getData().get(DATA_LOCALE);
        String str = serializable3 instanceof String ? (String) serializable3 : null;
        if (str == null) {
            str = "en-US";
        }
        sb2.append(str);
        sb2.append("&darkmode=");
        Serializable serializable4 = getApiCallDataModel().getData().get(DATA_DARK_MODE);
        Boolean bool = serializable4 instanceof Boolean ? (Boolean) serializable4 : null;
        sb2.append(bool != null ? bool.booleanValue() : false);
        return sb2.toString();
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    /* JADX INFO: renamed from: getUri, reason: from getter */
    public String getF13717i() {
        return this.f13717i;
    }

    @Override // com.jumio.core.network.ApiCall
    @NotNull
    public DigitalIdentityWebContentResult parseResponse(@NotNull String plainTextAnswer) {
        Intrinsics.checkNotNullParameter(plainTextAnswer, "plainTextAnswer");
        return new DigitalIdentityWebContentResult(getF14407c().getF13694k() + getF13717i(), plainTextAnswer);
    }

    public static /* synthetic */ void getUri$annotations() {
    }
}
