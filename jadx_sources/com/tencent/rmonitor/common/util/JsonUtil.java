package com.tencent.rmonitor.common.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/JsonUtil;", "", "()V", "safeGetJsonValue", "", "jsonObject", "Lorg/json/JSONObject;", "key", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class JsonUtil {

    @NotNull
    public static final JsonUtil INSTANCE = new JsonUtil();

    @NotNull
    public final String safeGetJsonValue(@Nullable JSONObject jsonObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (jsonObject == null) {
            return "";
        }
        String strOptString = jsonObject.optString(key);
        Intrinsics.checkNotNullExpressionValue(strOptString, "it.optString(key)");
        return strOptString;
    }

    private JsonUtil() {
    }
}
