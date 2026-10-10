package com.facebook;

import android.content.SharedPreferences;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.common.Scopes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfileCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/facebook/ProfileCache;", "", "<init>", "()V", "Lcom/facebook/Profile;", "b", "()Lcom/facebook/Profile;", Scopes.PROFILE, "", "c", "(Lcom/facebook/Profile;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ProfileCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: a */
    public final void m7755a() {
        this.sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Profile m7756b() {
        String string = this.sharedPreferences.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public ProfileCache() {
        SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: renamed from: c */
    public final void m7757c(@NotNull Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        JSONObject jSONObject = profile.toJSONObject();
        if (jSONObject != null) {
            this.sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
        }
    }
}
