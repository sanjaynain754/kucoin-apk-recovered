package com.kubi.network.socket.utils;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.socket.utils.b */
/* JADX INFO: compiled from: BinaryUtils.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/network/socket/utils/b;", "", "<init>", "()V", "obj", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Z", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C19386b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19386b f36148a = new C19386b();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m43047a(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof byte[]) {
            return true;
        }
        if (obj instanceof JSONArray) {
            int length = ((JSONArray) obj).length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    if (m43047a(((JSONArray) obj).isNull(i11) ? null : ((JSONArray) obj).get(i11))) {
                        return true;
                    }
                } catch (JSONException e11) {
                    C44128b.m97263g("An error occured while retrieving data from JSONArray", e11);
                    return false;
                }
            }
        } else if (obj instanceof JSONObject) {
            Iterator<String> itKeys = ((JSONObject) obj).keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "obj.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                try {
                    if (m43047a(((JSONObject) obj).get(next))) {
                        return true;
                    }
                } catch (JSONException e12) {
                    C44128b.m97263g("An error occured while retrieving data from JSONObject", e12);
                }
            }
        }
        return false;
    }
}
