package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.internal.C5758a;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p360j6.C40335b;
import p360j6.GateKeeper;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.facebook.internal.a */
/* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u00012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u00182\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010.R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100¨\u00063"}, m90084d2 = {"Lcom/facebook/internal/a;", "", "<init>", "()V", "Lcom/facebook/internal/a$a;", TUIConstants.TUIChat.CALL_BACK, "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/facebook/internal/a$a;)V", "", "applicationId", "", "forceRequery", "Lorg/json/JSONObject;", "m", "(Ljava/lang/String;Z)Lorg/json/JSONObject;", "name", "defaultValue", "d", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "gateKeepersJSON", "j", "(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "g", "", "e", "(Ljava/lang/String;)Ljava/util/Map;", "k", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "timestamp", "f", "(Ljava/lang/Long;)Z", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "callbacks", "", "Ljava/util/Map;", "fetchedAppGateKeepers", "Ljava/lang/Long;", "Lj6/b;", "Lj6/b;", "gateKeeperRuntimeCache", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nFetchedAppGateKeepersManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchedAppGateKeepersManager.kt\ncom/facebook/internal/FetchedAppGateKeepersManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,261:1\n1855#2,2:262\n125#3:264\n152#3,3:265\n*S KotlinDebug\n*F\n+ 1 FetchedAppGateKeepersManager.kt\ncom/facebook/internal/FetchedAppGateKeepersManager\n*L\n158#1:262,2\n169#1:264\n169#1:265,3\n*E\n"})
public final class C5758a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5758a f9640a = new C5758a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static final String TAG = Reflection.getOrCreateKotlinClass(C5758a.class).getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isLoading = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentLinkedQueue<a> callbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static Long timestamp;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static C40335b gateKeeperRuntimeCache;

    /* JADX INFO: renamed from: com.facebook.internal.a$a */
    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/internal/a$a;", "", "", "onCompleted", "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface a {
        void onCompleted();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10034f(Long timestamp2) {
        return timestamp2 != null && System.currentTimeMillis() - timestamp2.longValue() < FundingRateEntity.MILLIS_PER_HOUR;
    }

    /* JADX INFO: renamed from: g */
    public final void m10035g() {
        m10027h(null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m10026d(@NotNull String name, @Nullable String applicationId, boolean defaultValue) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Boolean> mapM10033e = f9640a.m10033e(applicationId);
        return (mapM10033e.containsKey(name) && (bool = mapM10033e.get(name)) != null) ? bool.booleanValue() : defaultValue;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final synchronized void m10027h(@Nullable a callback) {
        if (callback != null) {
            try {
                callbacks.add(callback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final String strM7800n = C5501a.m7800n();
        C5758a c5758a = f9640a;
        if (c5758a.m10034f(timestamp) && fetchedAppGateKeepers.containsKey(strM7800n)) {
            c5758a.m10036k();
            return;
        }
        final Context contextM7799m = C5501a.m7799m();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM7800n}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        if (contextM7799m == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextM7799m.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!C5760c.m10057Z(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e11) {
                C5760c.m10063d0("FacebookSDK", e11);
            }
            if (jSONObject != null) {
                m10029j(strM7800n, jSONObject);
            }
        }
        Executor executorM7806t = C5501a.m7806t();
        if (executorM7806t == null) {
            return;
        }
        if (isLoading.compareAndSet(false, true)) {
            executorM7806t.execute(new Runnable() { // from class: i6.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5758a.m10028i(strM7800n, contextM7799m, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m10028i(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        C5758a c5758a = f9640a;
        JSONObject jSONObjectM10032c = c5758a.m10032c(applicationId);
        if (jSONObjectM10032c.length() != 0) {
            m10029j(applicationId, jSONObjectM10032c);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, jSONObjectM10032c.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        c5758a.m10036k();
        isLoading.set(false);
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final synchronized JSONObject m10029j(@NotNull String applicationId, @Nullable JSONObject gateKeepersJSON) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            jSONObject = fetchedAppGateKeepers.get(applicationId);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject = (gateKeepersJSON == null || (jSONArrayOptJSONArray = gateKeepersJSON.optJSONArray("data")) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i11);
                    jSONObject.put(jSONObject2.getString("key"), jSONObject2.getBoolean("value"));
                } catch (JSONException e11) {
                    C5760c.m10063d0("FacebookSDK", e11);
                }
            }
            fetchedAppGateKeepers.put(applicationId, jSONObject);
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final JSONObject m10031m(@NotNull String applicationId, boolean forceRequery) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!forceRequery) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectM10032c = f9640a.m10032c(applicationId);
        Context contextM7799m = C5501a.m7799m();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        contextM7799m.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectM10032c.toString()).apply();
        return m10029j(applicationId, jSONObjectM10032c);
    }

    /* JADX INFO: renamed from: c */
    public final JSONObject m10032c(String applicationId) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C5501a.m7812z());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.Companion companion = GraphRequest.INSTANCE;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        GraphRequest graphRequestNewGraphPathRequest = companion.newGraphPathRequest(null, str, null);
        graphRequestNewGraphPathRequest.m7651H(bundle);
        JSONObject jsonObject = graphRequestNewGraphPathRequest.m7656l().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    /* JADX INFO: renamed from: k */
    public final void m10036k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new Runnable() { // from class: i6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5758a.m10030l(aVarPoll);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m10030l(a aVar) {
        aVar.onCompleted();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Map<String, Boolean> m10033e(@Nullable String applicationId) {
        List<GateKeeper> listM88835a;
        m10035g();
        if (applicationId != null) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                C40335b c40335b = gateKeeperRuntimeCache;
                if (c40335b != null) {
                    listM88835a = c40335b.m88835a(applicationId);
                } else {
                    listM88835a = null;
                }
                if (listM88835a != null) {
                    HashMap map2 = new HashMap();
                    for (GateKeeper gateKeeper : listM88835a) {
                        map2.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(applicationId);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map3.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                C40335b c40335b2 = gateKeeperRuntimeCache;
                if (c40335b2 == null) {
                    c40335b2 = new C40335b();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                c40335b2.m88836b(applicationId, arrayList);
                gateKeeperRuntimeCache = c40335b2;
                return map3;
            }
        }
        return new HashMap();
    }
}
