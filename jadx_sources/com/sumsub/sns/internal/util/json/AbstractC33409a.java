package com.sumsub.sns.internal.util.json;

import com.tencent.bugly.proguard.C33978va;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.HttpUrl;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import xg0.C46163a0;
import xg0.C46164b;
import xg0.C46173h;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.json.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33409a {
    /* JADX INFO: renamed from: a */
    public static final JsonElement m71694a(JsonElement jsonElement, Set set, String str) {
        if (jsonElement instanceof JsonArray) {
            return m71693a((JsonArray) jsonElement, set, str);
        }
        if (jsonElement instanceof JsonObject) {
            return m71695a((JsonObject) jsonElement, set, str);
        }
        if ((jsonElement instanceof JsonPrimitive) || Intrinsics.areEqual(jsonElement, C41910a.INSTANCE)) {
            return jsonElement;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static final JsonObject m71695a(JsonObject jsonObject, Set set, String str) {
        C46163a0 c46163a0 = new C46163a0();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            String str2 = str + C33978va.f72339h + key;
            if (set == null || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (StringsKt.endsWith$default(str2, (String) it.next(), false, 2, (Object) null)) {
                            C46173h.m101809g(c46163a0, key, "██");
                            break;
                        }
                    }
                }
            }
            c46163a0.m101769b(key, m71694a(value, set, str2));
        }
        return c46163a0.m101768a();
    }

    /* JADX INFO: renamed from: a */
    public static final JsonArray m71693a(JsonArray jsonArray, Set set, String str) {
        C46164b c46164b = new C46164b();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            c46164b.m101770a(m71694a(it.next(), set, str + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        }
        return c46164b.m101771b();
    }
}
