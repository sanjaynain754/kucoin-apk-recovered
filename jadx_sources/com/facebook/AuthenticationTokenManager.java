package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
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

/* JADX INFO: compiled from: AuthenticationTokenManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u0000 \u00102\u00020\u0001:\u0002\u001d\u001eB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/AuthenticationTokenManager;", "", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lcom/facebook/AuthenticationTokenCache;", "authenticationTokenCache", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AuthenticationTokenCache;)V", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationToken", "", "saveToCache", "", "f", "(Lcom/facebook/AuthenticationToken;Z)V", "oldAuthenticationToken", "d", "(Lcom/facebook/AuthenticationToken;Lcom/facebook/AuthenticationToken;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "b", "Lcom/facebook/AuthenticationTokenCache;", "c", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationTokenField", "value", "()Lcom/facebook/AuthenticationToken;", "e", "(Lcom/facebook/AuthenticationToken;)V", "Companion", "CurrentAuthenticationTokenChangedBroadcastReceiver", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @Nullable
    public static AuthenticationTokenManager f7545e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AuthenticationTokenCache authenticationTokenCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AuthenticationToken currentAuthenticationTokenField;

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/facebook/AuthenticationTokenManager$Companion;", "", "()V", "ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED", "", "EXTRA_NEW_AUTHENTICATION_TOKEN", "EXTRA_OLD_AUTHENTICATION_TOKEN", "SHARED_PREFERENCES_NAME", "TAG", "instanceField", "Lcom/facebook/AuthenticationTokenManager;", "getInstance", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final AuthenticationTokenManager getInstance() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f7545e;
            if (authenticationTokenManager2 == null) {
                synchronized (this) {
                    authenticationTokenManager = AuthenticationTokenManager.f7545e;
                    if (authenticationTokenManager == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(C5501a.m7799m());
                        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                        AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(localBroadcastManager, new AuthenticationTokenCache());
                        AuthenticationTokenManager.f7545e = authenticationTokenManager3;
                        authenticationTokenManager = authenticationTokenManager3;
                    }
                }
                return authenticationTokenManager;
            }
            return authenticationTokenManager2;
        }
    }

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7624e(@Nullable AuthenticationToken authenticationToken) {
        m7625f(authenticationToken, true);
    }

    public AuthenticationTokenManager(@NotNull LocalBroadcastManager localBroadcastManager, @NotNull AuthenticationTokenCache authenticationTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.authenticationTokenCache = authenticationTokenCache;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AuthenticationToken getCurrentAuthenticationTokenField() {
        return this.currentAuthenticationTokenField;
    }

    /* JADX INFO: renamed from: d */
    public final void m7623d(AuthenticationToken oldAuthenticationToken, AuthenticationToken currentAuthenticationToken) {
        Intent intent = new Intent(C5501a.m7799m(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", oldAuthenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", currentAuthenticationToken);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: f */
    public final void m7625f(AuthenticationToken currentAuthenticationToken, boolean saveToCache) {
        AuthenticationToken currentAuthenticationTokenField = getCurrentAuthenticationTokenField();
        this.currentAuthenticationTokenField = currentAuthenticationToken;
        if (saveToCache) {
            if (currentAuthenticationToken != null) {
                this.authenticationTokenCache.m7615b(currentAuthenticationToken);
            } else {
                this.authenticationTokenCache.m7614a();
                C5760c.m10069h(C5501a.m7799m());
            }
        }
        if (!C5760c.m10064e(currentAuthenticationTokenField, currentAuthenticationToken)) {
            m7623d(currentAuthenticationTokenField, currentAuthenticationToken);
        }
    }
}
