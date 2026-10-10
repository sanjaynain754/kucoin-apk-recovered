package com.kubi.sdk.web.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.web.util.c */
/* JADX INFO: compiled from: HybridUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001`\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/web/util/c;", "", "<init>", "()V", "Lorg/json/JSONObject;", JPushConstants.Analysis.KEY_JSON, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)Ljava/util/HashMap;", "jsonObject", "c", "Lorg/json/JSONArray;", "array", "", "b", "(Lorg/json/JSONArray;)Ljava/util/List;", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C24330c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C24330c f48559a = new C24330c();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final HashMap<String, Object> m58865a(@NotNull JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return json != JSONObject.NULL ? m58867c(json) : new HashMap<>();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final List<Object> m58866b(JSONArray array) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = array.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object objM58867c = array.get(i11);
            Intrinsics.checkNotNullExpressionValue(objM58867c, "array.get(i)");
            if (!Intrinsics.areEqual(objM58867c, JSONObject.NULL)) {
                if (objM58867c instanceof JSONArray) {
                    objM58867c = m58866b((JSONArray) objM58867c);
                } else if (objM58867c instanceof JSONObject) {
                    objM58867c = m58867c((JSONObject) objM58867c);
                }
                arrayList.add(objM58867c);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final HashMap<String, Object> m58867c(JSONObject jsonObject) throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        Iterator<String> itKeys = jsonObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objM58867c = jsonObject.get(next);
            Intrinsics.checkNotNullExpressionValue(objM58867c, "jsonObject.get(key)");
            if (!Intrinsics.areEqual(objM58867c, JSONObject.NULL)) {
                if (objM58867c instanceof JSONArray) {
                    objM58867c = m58866b((JSONArray) objM58867c);
                } else if (objM58867c instanceof JSONObject) {
                    objM58867c = m58867c((JSONObject) objM58867c);
                }
                map.put(next, objM58867c);
            }
        }
        return map;
    }
}
