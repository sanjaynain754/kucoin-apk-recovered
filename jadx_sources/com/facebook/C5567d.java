package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5567d;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.d */
/* JADX INFO: compiled from: UserSettingsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J#\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u0011\u0010#\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b#\u0010\u000fJ\u0011\u0010$\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b$\u0010\u000fR\u001c\u0010(\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010.\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010/\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u00100\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0014\u00101\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0014\u00103\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u00105¨\u00068"}, m90084d2 = {"Lcom/facebook/d;", "", "<init>", "()V", "", "n", "", "flag", "t", "(Z)V", "e", "()Z", "u", "f", "q", "()Ljava/lang/Boolean;", CmcdData.Factory.STREAMING_FORMAT_SS, "d", "g", "j", "", "Lcom/facebook/d$a;", "userSettings", "k", "([Lcom/facebook/d$a;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "userSetting", "w", "(Lcom/facebook/d$a;)V", "r", "m", "p", "o", "v", "b", "c", CmcdData.Factory.STREAM_TYPE_LIVE, "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "isFetchingCodelessStatus", "Lcom/facebook/d$a;", "autoInitEnabled", "autoLogAppEventsEnabledLocally", "advertiserIDCollectionEnabled", "codelessSetupEnabled", "i", "monitorEnabled", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "userSettingPref", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5567d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5567d f8168a = new C5567d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5567d.class.getName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final a autoInitEnabled = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final a autoLogAppEventsEnabledLocally = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final a advertiserIDCollectionEnabled = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final a codelessSetupEnabled = new a(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final a monitorEnabled = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static SharedPreferences userSettingPref;

    /* JADX INFO: renamed from: com.facebook.d$a */
    /* JADX INFO: compiled from: UserSettingsManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\t\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/facebook/d$a;", "", "", "defaultVal", "", "key", "<init>", "(ZLjava/lang/String;)V", "e", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "setDefaultVal", "(Z)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "g", "(Ljava/lang/Boolean;)V", "value", "", "J", "()J", "f", "(J)V", "lastTS", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean defaultVal;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String key;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Boolean value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long lastTS;

        public a(boolean z11, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.defaultVal = z11;
            this.key = key;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getLastTS() {
            return this.lastTS;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m8584e() {
            Boolean bool = this.value;
            return bool != null ? bool.booleanValue() : this.defaultVal;
        }

        /* JADX INFO: renamed from: f */
        public final void m8585f(long j11) {
            this.lastTS = j11;
        }

        /* JADX INFO: renamed from: g */
        public final void m8586g(@Nullable Boolean bool) {
            this.value = bool;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8575o() {
        int i11;
        int i12;
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (isInitialized.get() && C5501a.m7768D()) {
                Context contextM7799m = C5501a.m7799m();
                int i13 = 0;
                int i14 = (autoInitEnabled.m8584e() ? 1 : 0) | ((autoLogAppEventsEnabledLocally.m8584e() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.m8584e() ? 1 : 0) << 2) | ((monitorEnabled.m8584e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = userSettingPref;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                int i15 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i15 != i14) {
                    SharedPreferences sharedPreferences3 = userSettingPref;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i14).apply();
                    try {
                        ApplicationInfo applicationInfo = contextM7799m.getPackageManager().getApplicationInfo(contextM7799m.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i12 = 0;
                            i11 = 0;
                            while (i13 < 4) {
                                try {
                                    i11 |= (applicationInfo.metaData.containsKey(strArr[i13]) ? 1 : 0) << i13;
                                    i12 |= (applicationInfo.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                                    i13++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i13 = i12;
                                    i12 = i13;
                                    i13 = i11;
                                    InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(contextM7799m);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i13);
                                    bundle.putInt("initial", i12);
                                    bundle.putInt("previous", i15);
                                    bundle.putInt("current", i14);
                                    internalAppEventsLogger.m7880b(bundle);
                                }
                            }
                            i13 = i11;
                        } else {
                            i12 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i11 = 0;
                    }
                    InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(contextM7799m);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i13);
                    bundle2.putInt("initial", i12);
                    bundle2.putInt("previous", i15);
                    bundle2.putInt("current", i14);
                    internalAppEventsLogger2.m7880b(bundle2);
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m8558d() {
        if (C42757a.m93689d(C5567d.class)) {
            return false;
        }
        try {
            f8168a.m8571j();
            return advertiserIDCollectionEnabled.m8584e();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m8559e() {
        if (C42757a.m93689d(C5567d.class)) {
            return false;
        }
        try {
            f8168a.m8571j();
            return autoInitEnabled.m8584e();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m8560f() {
        if (C42757a.m93689d(C5567d.class)) {
            return false;
        }
        try {
            C5567d c5567d = f8168a;
            c5567d.m8571j();
            return c5567d.m8568b();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m8561g() {
        if (C42757a.m93689d(C5567d.class)) {
            return false;
        }
        try {
            f8168a.m8571j();
            return codelessSetupEnabled.m8584e();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8562i(long j11) {
        FetchedAppSettings fetchedAppSettingsM9982u;
        if (C42757a.m93689d(C5567d.class)) {
            return;
        }
        try {
            if (advertiserIDCollectionEnabled.m8584e() && (fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false)) != null && fetchedAppSettingsM9982u.getCodelessEventsEnabled()) {
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(C5501a.m7799m());
                String strM9905h = (attributionIdentifiers == null || attributionIdentifiers.m9905h() == null) ? null : attributionIdentifiers.m9905h();
                if (strM9905h != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strM9905h);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(null, "app", null);
                    graphRequestNewGraphPathRequest.m7651H(bundle);
                    JSONObject graphObject = graphRequestNewGraphPathRequest.m7656l().getGraphObject();
                    if (graphObject != null) {
                        a aVar = codelessSetupEnabled;
                        aVar.m8586g(Boolean.valueOf(graphObject.optBoolean("auto_event_setup_enabled", false)));
                        aVar.m8585f(j11);
                        f8168a.m8579w(aVar);
                    }
                }
            }
            isFetchingCodelessStatus.set(false);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m8563n() {
        if (C42757a.m93689d(C5567d.class)) {
            return;
        }
        try {
            Context contextM7799m = C5501a.m7799m();
            ApplicationInfo applicationInfo = contextM7799m.getPackageManager().getApplicationInfo(contextM7799m.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(contextM7799m);
            Bundle bundle2 = new Bundle();
            if (!C5760c.m10052T()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(TAG, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            internalAppEventsLogger.m7882d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final Boolean m8564q() {
        String str = "";
        if (C42757a.m93689d(C5567d.class)) {
            return null;
        }
        try {
            f8168a.m8578v();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(autoLogAppEventsEnabledLocally.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e11) {
                C5760c.m10063d0(TAG, e11);
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m8565s(boolean flag) {
        if (C42757a.m93689d(C5567d.class)) {
            return;
        }
        try {
            a aVar = advertiserIDCollectionEnabled;
            aVar.m8586g(Boolean.valueOf(flag));
            aVar.m8585f(System.currentTimeMillis());
            if (isInitialized.get()) {
                f8168a.m8579w(aVar);
            } else {
                f8168a.m8571j();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final void m8566t(boolean flag) {
        if (C42757a.m93689d(C5567d.class)) {
            return;
        }
        try {
            a aVar = autoInitEnabled;
            aVar.m8586g(Boolean.valueOf(flag));
            aVar.m8585f(System.currentTimeMillis());
            if (isInitialized.get()) {
                f8168a.m8579w(aVar);
            } else {
                f8168a.m8571j();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: u */
    public static final void m8567u(boolean flag) {
        if (C42757a.m93689d(C5567d.class)) {
            return;
        }
        try {
            a aVar = autoLogAppEventsEnabledLocally;
            aVar.m8586g(Boolean.valueOf(flag));
            aVar.m8585f(System.currentTimeMillis());
            if (isInitialized.get()) {
                f8168a.m8579w(aVar);
            } else {
                f8168a.m8571j();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5567d.class);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8577r(a userSetting) {
        String str = "";
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m8578v();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(userSetting.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    userSetting.m8586g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    userSetting.m8585f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e11) {
                C5760c.m10063d0(TAG, e11);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8568b() {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            Map<String, Boolean> mapM9976g = FetchedAppSettingsManager.m9976g();
            if (mapM9976g != null && !mapM9976g.isEmpty()) {
                Boolean bool = mapM9976g.get("auto_log_app_events_enabled");
                Boolean bool2 = mapM9976g.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean boolM8569c = m8569c();
                if (boolM8569c != null) {
                    return boolM8569c.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return autoLogAppEventsEnabledLocally.m8584e();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m8569c() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Boolean boolM8564q = m8564q();
            if (boolM8564q != null) {
                return boolM8564q;
            }
            Boolean boolM8573l = m8573l();
            if (boolM8573l == null) {
                return null;
            }
            return boolM8573l;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8570h() {
        if (!C42757a.m93689d(this)) {
            try {
                a aVar = codelessSetupEnabled;
                m8577r(aVar);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (aVar.getValue() == null || jCurrentTimeMillis - aVar.getLastTS() >= 604800000) {
                    aVar.m8586g(null);
                    aVar.m8585f(0L);
                    if (!isFetchingCodelessStatus.compareAndSet(false, true)) {
                        return;
                    }
                    C5501a.m7806t().execute(new Runnable() { // from class: z2.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5567d.m8562i(jCurrentTimeMillis);
                        }
                    });
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8571j() {
        if (!C42757a.m93689d(this)) {
            try {
                if (!C5501a.m7768D() || !isInitialized.compareAndSet(false, true)) {
                    return;
                }
                SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                userSettingPref = sharedPreferences;
                m8572k(autoLogAppEventsEnabledLocally, advertiserIDCollectionEnabled, autoInitEnabled);
                m8570h();
                m8576p();
                m8575o();
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8572k(a... userSettings) {
        if (!C42757a.m93689d(this)) {
            try {
                for (a aVar : userSettings) {
                    if (aVar == codelessSetupEnabled) {
                        m8570h();
                    } else if (aVar.getValue() == null) {
                        m8577r(aVar);
                        if (aVar.getValue() == null) {
                            m8574m(aVar);
                        }
                    } else {
                        m8579w(aVar);
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final Boolean m8573l() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            m8578v();
            try {
                Context contextM7799m = C5501a.m7799m();
                ApplicationInfo applicationInfo = contextM7799m.getPackageManager().getApplicationInfo(contextM7799m.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = autoLogAppEventsEnabledLocally;
                    if (bundle.containsKey(aVar.getKey())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.getKey()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                C5760c.m10063d0(TAG, e11);
            }
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8574m(a userSetting) {
        if (!C42757a.m93689d(this)) {
            try {
                m8578v();
                try {
                    Context contextM7799m = C5501a.m7799m();
                    ApplicationInfo applicationInfo = contextM7799m.getPackageManager().getApplicationInfo(contextM7799m.getPackageName(), 128);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null && bundle.containsKey(userSetting.getKey())) {
                        userSetting.m8586g(Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
                        return;
                    }
                    return;
                } catch (PackageManager.NameNotFoundException e11) {
                    C5760c.m10063d0(TAG, e11);
                    return;
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8576p() {
        if (!C42757a.m93689d(this)) {
            try {
                Context contextM7799m = C5501a.m7799m();
                ApplicationInfo applicationInfo = contextM7799m.getPackageManager().getApplicationInfo(contextM7799m.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(TAG, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!m8558d()) {
                        Log.w(TAG, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8578v() {
        if (!C42757a.m93689d(this)) {
            try {
                if (isInitialized.get()) {
                } else {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m8579w(a userSetting) {
        if (!C42757a.m93689d(this)) {
            try {
                m8578v();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", userSetting.getValue());
                    jSONObject.put("last_timestamp", userSetting.getLastTS());
                    SharedPreferences sharedPreferences = userSettingPref;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences = null;
                    }
                    sharedPreferences.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                    m8575o();
                } catch (Exception e11) {
                    C5760c.m10063d0(TAG, e11);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
