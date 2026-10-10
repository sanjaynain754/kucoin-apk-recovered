package com.facebook;

import android.content.SharedPreferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AuthenticationTokenCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/AuthenticationTokenCache;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "()V", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "b", "(Lcom/facebook/AuthenticationToken;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/SharedPreferences;", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AuthenticationTokenCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    public AuthenticationTokenCache(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthenticationTokenCache() {
        SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }

    /* JADX INFO: renamed from: a */
    public final void m7614a() {
        this.sharedPreferences.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    /* JADX INFO: renamed from: b */
    public final void m7615b(@NotNull AuthenticationToken authenticationToken) {
        Intrinsics.checkNotNullParameter(authenticationToken, "authenticationToken");
        try {
            this.sharedPreferences.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.toJSONObject$facebook_core_release().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
