package com.facebook;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfileManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 \t2\u00020\u0001:\u0001\u001fB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/facebook/ProfileManager;", "", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lcom/facebook/ProfileCache;", "profileCache", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/ProfileCache;)V", "", "d", "()Z", "Lcom/facebook/Profile;", "currentProfile", "writeToCache", "", "g", "(Lcom/facebook/Profile;Z)V", "oldProfile", "e", "(Lcom/facebook/Profile;Lcom/facebook/Profile;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "b", "Lcom/facebook/ProfileCache;", "c", "Lcom/facebook/Profile;", "currentProfileField", "value", "()Lcom/facebook/Profile;", "f", "(Lcom/facebook/Profile;)V", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ProfileManager {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static volatile ProfileManager f7613e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ProfileCache profileCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Profile currentProfileField;

    /* JADX INFO: compiled from: ProfileManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/facebook/ProfileManager$Companion;", "", "()V", "ACTION_CURRENT_PROFILE_CHANGED", "", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", "instance", "Lcom/facebook/ProfileManager;", "getInstance", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final synchronized ProfileManager getInstance() {
            ProfileManager profileManager;
            try {
                if (ProfileManager.f7613e == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(C5501a.m7799m());
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    ProfileManager.f7613e = new ProfileManager(localBroadcastManager, new ProfileCache());
                }
                profileManager = ProfileManager.f7613e;
                if (profileManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("instance");
                    profileManager = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return profileManager;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7763f(@Nullable Profile profile) {
        m7764g(profile, true);
    }

    public ProfileManager(@NotNull LocalBroadcastManager localBroadcastManager, @NotNull ProfileCache profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.localBroadcastManager = localBroadcastManager;
        this.profileCache = profileCache;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Profile getCurrentProfileField() {
        return this.currentProfileField;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7761d() {
        Profile profileM7756b = this.profileCache.m7756b();
        if (profileM7756b == null) {
            return false;
        }
        m7764g(profileM7756b, false);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m7762e(Profile oldProfile, Profile currentProfile) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", oldProfile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", currentProfile);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: g */
    public final void m7764g(Profile currentProfile, boolean writeToCache) {
        Profile profile = this.currentProfileField;
        this.currentProfileField = currentProfile;
        if (writeToCache) {
            if (currentProfile != null) {
                this.profileCache.m7757c(currentProfile);
            } else {
                this.profileCache.m7755a();
            }
        }
        if (C5760c.m10064e(profile, currentProfile)) {
            return;
        }
        m7762e(profile, currentProfile);
    }
}
