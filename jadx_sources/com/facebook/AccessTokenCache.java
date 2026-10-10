package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessTokenCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002!\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0016\u0010 \u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b¨\u0006\""}, m90084d2 = {"Lcom/facebook/AccessTokenCache;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/facebook/AccessTokenCache$a;", "tokenCachingStrategyFactory", "<init>", "(Landroid/content/SharedPreferences;Lcom/facebook/AccessTokenCache$a;)V", "()V", "Lcom/facebook/AccessToken;", "f", "()Lcom/facebook/AccessToken;", "accessToken", "", "g", "(Lcom/facebook/AccessToken;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "e", "()Z", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/content/SharedPreferences;", "b", "Lcom/facebook/AccessTokenCache$a;", "Lcom/facebook/LegacyTokenHelper;", "c", "Lcom/facebook/LegacyTokenHelper;", "tokenCachingStrategyField", "d", "()Lcom/facebook/LegacyTokenHelper;", "tokenCachingStrategy", "cachedAccessToken", "legacyAccessToken", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AccessTokenCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C5476a tokenCachingStrategyFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public LegacyTokenHelper tokenCachingStrategyField;

    /* JADX INFO: renamed from: com.facebook.AccessTokenCache$a */
    /* JADX INFO: compiled from: AccessTokenCache.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/facebook/AccessTokenCache$a;", "", "<init>", "()V", "Lcom/facebook/LegacyTokenHelper;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/LegacyTokenHelper;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5476a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final LegacyTokenHelper m7574a() {
            return new LegacyTokenHelper(C5501a.m7799m(), null, 2, null);
        }
    }

    public AccessTokenCache(@NotNull SharedPreferences sharedPreferences, @NotNull C5476a tokenCachingStrategyFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.sharedPreferences = sharedPreferences;
        this.tokenCachingStrategyFactory = tokenCachingStrategyFactory;
    }

    /* JADX INFO: renamed from: a */
    public final void m7566a() {
        this.sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m7573h()) {
            m7569d().m7747a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final AccessToken m7567b() {
        String string = this.sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.createFromJSONObject$facebook_core_release(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7570e() {
        return this.sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* JADX INFO: renamed from: g */
    public final void m7572g(@NotNull AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        try {
            this.sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.toJSONObject$facebook_core_release().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final AccessToken m7568c() {
        Bundle bundleM7749c = m7569d().m7749c();
        if (bundleM7749c != null && LegacyTokenHelper.INSTANCE.hasTokenInformation(bundleM7749c)) {
            return AccessToken.INSTANCE.createFromLegacyCache$facebook_core_release(bundleM7749c);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final LegacyTokenHelper m7569d() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            if (this.tokenCachingStrategyField == null) {
                synchronized (this) {
                    try {
                        if (this.tokenCachingStrategyField == null) {
                            this.tokenCachingStrategyField = this.tokenCachingStrategyFactory.m7574a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            LegacyTokenHelper legacyTokenHelper = this.tokenCachingStrategyField;
            if (legacyTokenHelper != null) {
                return legacyTokenHelper;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th3) {
            C42757a.m93687b(th3, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final AccessToken m7571f() {
        if (m7570e()) {
            return m7567b();
        }
        if (m7573h()) {
            AccessToken accessTokenM7568c = m7568c();
            if (accessTokenM7568c != null) {
                m7572g(accessTokenM7568c);
                m7569d().m7747a();
            }
            return accessTokenM7568c;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7573h() {
        return C5501a.m7769E();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccessTokenCache() {
        SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new C5476a());
    }
}
