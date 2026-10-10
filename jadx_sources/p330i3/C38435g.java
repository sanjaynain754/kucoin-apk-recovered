package p330i3;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: i3.g */
/* JADX INFO: compiled from: StdParamsEnforcementManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR2\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00120\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R2\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00120\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 ¨\u0006#"}, m90084d2 = {"Li3/g;", "", "<init>", "()V", "", "b", "Landroid/os/Bundle;", "parameters", "g", "(Landroid/os/Bundle;)V", "e", "Lorg/json/JSONArray;", "schema", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONArray;)V", "paramValues", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "f", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "value", "", "expressions", "", "d", "(Ljava/lang/String;Ljava/util/Set;)Z", "enumValues", "c", "Z", "enabled", "", "Ljava/util/Map;", "regexRestrictionsConfig", "enumRestrictionsConfig", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStdParamsEnforcementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StdParamsEnforcementManager.kt\ncom/facebook/appevents/integrity/StdParamsEnforcementManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1#2:130\n1855#3,2:131\n1747#3,3:133\n1747#3,3:136\n*S KotlinDebug\n*F\n+ 1 StdParamsEnforcementManager.kt\ncom/facebook/appevents/integrity/StdParamsEnforcementManager\n*L\n115#1:131,2\n121#1:133,3\n125#1:136,3\n*E\n"})
public final class C38435g {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38435g f86249a = new C38435g();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> regexRestrictionsConfig = new HashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> enumRestrictionsConfig = new HashMap();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m86688b() {
        if (C42757a.m93689d(C38435g.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            f86249a.m86693e();
            enabled = (regexRestrictionsConfig.isEmpty() && enumRestrictionsConfig.isEmpty()) ? false : true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38435g.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m86689g(@Nullable Bundle parameters) {
        if (C42757a.m93689d(C38435g.class)) {
            return;
        }
        try {
            if (enabled && parameters != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : parameters.keySet()) {
                    String strValueOf = String.valueOf(parameters.get(key));
                    boolean z11 = regexRestrictionsConfig.get(key) != null;
                    boolean z12 = enumRestrictionsConfig.get(key) != null;
                    if (z11 || z12) {
                        C38435g c38435g = f86249a;
                        boolean zM86692d = c38435g.m86692d(strValueOf, regexRestrictionsConfig.get(key));
                        boolean zM86691c = c38435g.m86691c(strValueOf, enumRestrictionsConfig.get(key));
                        if (!zM86692d && !zM86691c) {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    parameters.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38435g.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m86690a(JSONArray schema) {
        if (C42757a.m93689d(this) || schema == null) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            int length = schema.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = schema.getJSONObject(i11);
                String key = jSONObject.getString("key");
                if (key != null && key.length() != 0) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length2 = jSONArray.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            boolean z11 = jSONArray.getJSONObject(i12).getBoolean("require_exact_match");
                            HashSet<String> hashSetM86694f = m86694f(jSONArray.getJSONObject(i12).getJSONArray("potential_matches"));
                            if (z11) {
                                Map<String, HashSet<String>> map = enumRestrictionsConfig;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet<String> hashSet = enumRestrictionsConfig.get(key);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetM86694f);
                                    hashSetM86694f = hashSet;
                                }
                                map.put(key, hashSetM86694f);
                            } else {
                                Map<String, HashSet<String>> map2 = regexRestrictionsConfig;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                HashSet<String> hashSet2 = regexRestrictionsConfig.get(key);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetM86694f);
                                    hashSetM86694f = hashSet2;
                                }
                                map2.put(key, hashSetM86694f);
                            }
                        }
                    } catch (Exception unused) {
                        enumRestrictionsConfig.remove(key);
                        regexRestrictionsConfig.remove(key);
                    }
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86691c(String value, Set<String> enumValues) {
        if (!C42757a.m93689d(this) && enumValues != null) {
            try {
                if (enumValues.isEmpty()) {
                    return false;
                }
                for (String str : enumValues) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String lowerCase2 = value.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m86692d(String value, Set<String> expressions) {
        if (!C42757a.m93689d(this) && expressions != null) {
            try {
                if (expressions.isEmpty()) {
                    return false;
                }
                Iterator<T> it = expressions.iterator();
                while (it.hasNext()) {
                    if (new Regex((String) it.next()).matches(value)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m86693e() {
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u == null) {
                    return;
                }
                m86690a(fetchedAppSettingsM9982u.getSchemaRestrictions());
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final HashSet<String> m86694f(JSONArray paramValues) {
        try {
            if (C42757a.m93689d(this)) {
                return null;
            }
            try {
                HashSet<String> hashSetM10074l = C5760c.m10074l(paramValues);
                if (hashSetM10074l == null) {
                    return new HashSet<>();
                }
                return hashSetM10074l;
            } catch (Exception unused) {
                return new HashSet<>();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
