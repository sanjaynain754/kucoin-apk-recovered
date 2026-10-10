package com.kubi.sdk.util;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: NullGson.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/util/NullGson;", "", "<init>", "()V", "FORBIDDEN_ACCOUNT_CODE", "", "FREEZE_ACCOUNT_CODE", "nullGson", "Lcom/google/gson/Gson;", "getNullGson$annotations", "getNullGson", "()Lcom/google/gson/Gson;", "handleErrorBiz", "", JPushConstants.Analysis.KEY_JSON, "Lcom/google/gson/JsonElement;", "handleErrorBiz$LBase_googleRelease", "checkIsString", "", "typeOfT", "Ljava/lang/reflect/Type;", "checkIsString$LBase_googleRelease", "checkIsArrayListType", "checkIsArrayListType$LBase_googleRelease", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NullGson {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NullGson f48113a = new NullGson();

    /* JADX INFO: renamed from: com.kubi.sdk.util.NullGson$a */
    /* JADX INFO: compiled from: NullGson.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/sdk/util/NullGson$checkIsArrayListType$arraysListRawType$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24210a extends TypeToken<ArrayList<?>> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.NullGson$b */
    /* JADX INFO: compiled from: NullGson.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/sdk/util/NullGson$checkIsArrayListType$arraysListType$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24211b extends TypeToken<ArrayList<?>> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.NullGson$c */
    /* JADX INFO: compiled from: NullGson.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/sdk/util/NullGson$checkIsArrayListType$listRawType$1", "Lcom/google/gson/reflect/TypeToken;", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24212c extends TypeToken<List<?>> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.NullGson$d */
    /* JADX INFO: compiled from: NullGson.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/sdk/util/NullGson$checkIsArrayListType$listType$1", "Lcom/google/gson/reflect/TypeToken;", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24213d extends TypeToken<List<?>> {
    }

    /* JADX INFO: renamed from: c */
    public static final BaseEntity m58331c(final JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        String strReplace$default;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.util.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NullGson.m58332d(json);
            }
        });
        String string = json.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        JsonElement jsonElement = json.getAsJsonObject().get("data");
        if (jsonElement == null || !jsonElement.isJsonNull()) {
            return (BaseEntity) C27099x.m66914d(string, typeOfT);
        }
        NullGson nullGson = f48113a;
        if (nullGson.m58334e(typeOfT)) {
            strReplace$default = StringsKt.replace$default(string, "\"data\":null", "\"data\":[]", false, 4, (Object) null);
        } else {
            strReplace$default = nullGson.m58335f(typeOfT) ? StringsKt.replace$default(string, "\"data\":null", "\"data\":\"\"", false, 4, (Object) null) : StringsKt.replace$default(string, "\"data\":null", "\"data\":{}", false, 4, (Object) null);
        }
        return (BaseEntity) C27099x.m66914d(strReplace$default, typeOfT);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m58332d(JsonElement jsonElement) throws ApiException {
        f48113a.m58336h(jsonElement);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Gson m58333g() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setLenient();
        gsonBuilder.registerTypeAdapter(BaseEntity.class, new JsonDeserializer() { // from class: com.kubi.sdk.util.o0
            @Override // com.google.gson.JsonDeserializer
            public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                return NullGson.m58331c(jsonElement, type, jsonDeserializationContext);
            }
        });
        gsonBuilder.registerTypeAdapter(BigDecimal.class, new TypeAdapter<BigDecimal>() { // from class: com.kubi.sdk.util.NullGson$nullGson$1
            @Override // com.google.gson.TypeAdapter
            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            public BigDecimal read2(JsonReader in2) throws IOException {
                Intrinsics.checkNotNullParameter(in2, "in");
                return new BigDecimal(in2.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter out, BigDecimal value) throws IOException {
                Intrinsics.checkNotNullParameter(out, "out");
                out.value(value);
            }
        });
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return gsonCreate;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58334e(@NotNull Type typeOfT) {
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Type type = new C24211b().getType();
        Type type2 = new C24213d().getType();
        Class<? super ArrayList<?>> rawType = new C24210a().getRawType();
        Class<? super List<?>> rawType2 = new C24212c().getRawType();
        if (typeOfT instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) typeOfT).getActualTypeArguments();
            Intrinsics.checkNotNull(actualTypeArguments);
            if (!(actualTypeArguments.length == 0)) {
                Type type3 = actualTypeArguments[0];
                if (type3 instanceof ParameterizedType) {
                    Intrinsics.checkNotNull(type3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    return Intrinsics.areEqual(parameterizedType.getRawType(), type) || Intrinsics.areEqual(parameterizedType.getRawType(), type2) || Intrinsics.areEqual(parameterizedType.getRawType(), rawType) || Intrinsics.areEqual(parameterizedType.getRawType(), rawType2);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58335f(@NotNull Type typeOfT) {
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        return Intrinsics.areEqual(typeOfT.toString(), "com.kubi.sdk.base.entity.BaseEntity<java.lang.String>");
    }

    /* JADX INFO: renamed from: h */
    public final void m58336h(@NotNull JsonElement json) throws ApiException {
        Intrinsics.checkNotNullParameter(json, "json");
        JsonElement jsonElement = json.getAsJsonObject().get("code");
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        if (Intrinsics.areEqual("4111", asString)) {
            JsonElement jsonElement2 = json.getAsJsonObject().get("msg");
            String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = json.getAsJsonObject().get("data");
            throw new ApiException(asString, asString2, jsonElement3 != null ? jsonElement3.getAsString() : null);
        }
        if (Intrinsics.areEqual("4112", asString)) {
            JsonElement jsonElement4 = json.getAsJsonObject().get("msg");
            String asString3 = jsonElement4 != null ? jsonElement4.getAsString() : null;
            JsonElement jsonElement5 = json.getAsJsonObject().get("data");
            throw new ApiException(asString, asString3, jsonElement5 != null ? jsonElement5.getAsString() : null);
        }
    }
}
