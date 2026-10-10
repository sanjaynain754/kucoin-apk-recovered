package com.facebook.appevents;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.appevents.C5524d;
import com.facebook.appevents.aam.MetadataRule;
import com.facebook.internal.C5760c;
import com.kubi.kyc.KycKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: com.facebook.appevents.d */
/* JADX INFO: compiled from: UserDataStore.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJs\u0010\u0015\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u0019J#\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u0019\u0010#\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b#\u0010\tJ\u001f\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00104R$\u00109\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00108R$\u0010=\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, m90084d2 = {"Lcom/facebook/appevents/d;", "", "<init>", "()V", "", "j", "Landroid/os/Bundle;", "ud", "n", "(Landroid/os/Bundle;)V", "", "email", KycKey.firstName, KycKey.lastName, HintConstants.AUTOFILL_HINT_PHONE, "dateOfBirth", HintConstants.AUTOFILL_HINT_GENDER, "city", "state", "zip", "country", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/lang/String;", "f", "", "m", "(Ljava/util/Map;)V", "key", "value", "r", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "q", "type", "data", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "k", "(Ljava/lang/String;)Z", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "sharedPreferences", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/ConcurrentHashMap;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "externalHashedUserData", "internalHashedUserData", "g", "()Ljava/util/Map;", "enabledInternalUserData", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nUserDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDataStore.kt\ncom/facebook/appevents/UserDataStore\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,270:1\n107#2:271\n79#2,22:272\n107#2:296\n79#2,22:297\n37#3,2:294\n*S KotlinDebug\n*F\n+ 1 UserDataStore.kt\ncom/facebook/appevents/UserDataStore\n*L\n211#1:271\n211#1:272,22\n242#1:296\n242#1:297,22\n214#1:294,2\n*E\n"})
public final class C5524d {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5524d f7825a = new C5524d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5524d.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i */
    public final synchronized void m8102i() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m());
            Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferen….getApplicationContext())");
            sharedPreferences = defaultSharedPreferences;
            SharedPreferences sharedPreferences2 = null;
            if (defaultSharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences3 = sharedPreferences;
            if (sharedPreferences3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            } else {
                sharedPreferences2 = sharedPreferences3;
            }
            String string2 = sharedPreferences2.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            externalHashedUserData.putAll(C5760c.m10062c0(string));
            internalHashedUserData.putAll(C5760c.m10062c0(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m8091d() {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new Runnable() { // from class: a3.e0
                @Override // java.lang.Runnable
                public final void run() {
                    C5524d.m8092e();
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8092e() {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserData");
                f7825a.m8102i();
            }
            externalHashedUserData.clear();
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences2 = null;
            }
            sharedPreferences2.edit().putString("com.facebook.appevents.UserDataStore.userData", null).apply();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m8093f() {
        if (C42757a.m93689d(C5524d.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                f7825a.m8102i();
            }
            HashMap map = new HashMap();
            map.putAll(externalHashedUserData);
            map.putAll(f7825a.m8101g());
            return C5760c.m10067f0(map);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m8094h() {
        if (C42757a.m93689d(C5524d.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserID");
                f7825a.m8102i();
            }
            return C5760c.m10067f0(externalHashedUserData);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m8095j() {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            if (initialized.get()) {
                return;
            }
            f7825a.m8102i();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m8096m(@NotNull Map<String, String> ud2) {
        String[] strArr;
        List<String> listSplit;
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            if (!initialized.get()) {
                f7825a.m8102i();
            }
            for (Map.Entry<String, String> entry : ud2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C5524d c5524d = f7825a;
                int length = value.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = Intrinsics.compare((int) value.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                String strM10086t0 = C5760c.m10086t0(c5524d.m8104l(key, value.subSequence(i11, length + 1).toString()));
                ConcurrentHashMap<String, String> concurrentHashMap = internalHashedUserData;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    if (str == null || (listSplit = new Regex(",").split(str, 0)) == null || (strArr = (String[]) listSplit.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setMutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                    if (setMutableSetOf.contains(strM10086t0)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strM10086t0);
                    } else if (strArr.length < 5) {
                        sb2.append(str);
                        sb2.append(",");
                        sb2.append(strM10086t0);
                    } else {
                        for (int i12 = 1; i12 < 5; i12++) {
                            sb2.append(strArr[i12]);
                            sb2.append(",");
                        }
                        sb2.append(strM10086t0);
                        setMutableSetOf.remove(strArr[0]);
                    }
                    internalHashedUserData.put(key, sb2.toString());
                } else {
                    concurrentHashMap.put(key, strM10086t0);
                }
            }
            f7825a.m8106r("com.facebook.appevents.UserDataStore.internalUserData", C5760c.m10067f0(internalHashedUserData));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m8097n(@Nullable final Bundle ud2) {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new Runnable() { // from class: a3.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C5524d.m8099p(ud2);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m8098o(@Nullable String email, @Nullable String firstName, @Nullable String lastName, @Nullable String phone, @Nullable String dateOfBirth, @Nullable String gender, @Nullable String city, @Nullable String state, @Nullable String zip, @Nullable String country) {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (email != null) {
                bundle.putString("em", email);
            }
            if (firstName != null) {
                bundle.putString("fn", firstName);
            }
            if (lastName != null) {
                bundle.putString("ln", lastName);
            }
            if (phone != null) {
                bundle.putString("ph", phone);
            }
            if (dateOfBirth != null) {
                bundle.putString("db", dateOfBirth);
            }
            if (gender != null) {
                bundle.putString("ge", gender);
            }
            if (city != null) {
                bundle.putString("ct", city);
            }
            if (state != null) {
                bundle.putString(CmcdConfiguration.KEY_STREAM_TYPE, state);
            }
            if (zip != null) {
                bundle.putString("zp", zip);
            }
            if (country != null) {
                bundle.putString("country", country);
            }
            m8097n(bundle);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m8099p(Bundle bundle) {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            if (!initialized.get()) {
                Log.w(TAG, "initStore should have been called before calling setUserData");
                f7825a.m8102i();
            }
            C5524d c5524d = f7825a;
            c5524d.m8105q(bundle);
            c5524d.m8106r("com.facebook.appevents.UserDataStore.userData", C5760c.m10067f0(externalHashedUserData));
            c5524d.m8106r("com.facebook.appevents.UserDataStore.internalUserData", C5760c.m10067f0(internalHashedUserData));
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8100s(String key, String value) {
        if (C42757a.m93689d(C5524d.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "$key");
            Intrinsics.checkNotNullParameter(value, "$value");
            if (!initialized.get()) {
                f7825a.m8102i();
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences2 = null;
            }
            sharedPreferences2.edit().putString(key, value).apply();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5524d.class);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, String> m8101g() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> enabledRuleNames = MetadataRule.INSTANCE.getEnabledRuleNames();
            for (String str : internalHashedUserData.keySet()) {
                if (enabledRuleNames.contains(str)) {
                    map.put(str, internalHashedUserData.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m8103k(String data) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            return new Regex("[A-Fa-f0-9]{64}").matches(data);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m8104l(String type, String data) {
        String strSubstring;
        int i11;
        boolean z11;
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            int length = data.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) data.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            String lowerCase = data.subSequence(i12, length + 1).toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (Intrinsics.areEqual("em", type)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(TAG, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (Intrinsics.areEqual("ph", type)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", type)) {
                    if (lowerCase.length() <= 0) {
                        strSubstring = "";
                    } else {
                        strSubstring = lowerCase.substring(0, 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    if (!Intrinsics.areEqual("f", strSubstring) && !Intrinsics.areEqual("m", strSubstring)) {
                        Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8105q(Bundle ud2) {
        if (!C42757a.m93689d(this) && ud2 != null) {
            try {
                for (String key : ud2.keySet()) {
                    Object obj = ud2.get(key);
                    if (obj != null) {
                        String string = obj.toString();
                        if (m8103k(string)) {
                            ConcurrentHashMap<String, String> concurrentHashMap = externalHashedUserData;
                            String lowerCase = string.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                            concurrentHashMap.put(key, lowerCase);
                        } else {
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            String strM10086t0 = C5760c.m10086t0(m8104l(key, string));
                            if (strM10086t0 != null) {
                                externalHashedUserData.put(key, strM10086t0);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8106r(final String key, final String value) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            C5501a.m7806t().execute(new Runnable() { // from class: a3.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C5524d.m8100s(key, value);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
