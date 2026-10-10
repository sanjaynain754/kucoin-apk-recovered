package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.internal.C5760c;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.tencent.bugly.proguard.C33590cg;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessTokenManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\u00020\u0001:\u00053\u001e \"&B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u0019\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010-\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, m90084d2 = {"Lcom/facebook/AccessTokenManager;", "", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lcom/facebook/AccessTokenCache;", "accessTokenCache", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V", "", "j", "()Z", "", "g", "()V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/AccessToken$b;", TUIConstants.TUIChat.CALL_BACK, "k", "(Lcom/facebook/AccessToken$b;)V", "Lcom/facebook/AccessToken;", "currentAccessToken", "saveToCache", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/facebook/AccessToken;Z)V", "oldAccessToken", "q", "(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V", "t", "u", "m", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "b", "Lcom/facebook/AccessTokenCache;", "c", "Lcom/facebook/AccessToken;", "currentAccessTokenField", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tokenRefreshInProgress", "Ljava/util/Date;", "e", "Ljava/util/Date;", "lastAttemptedTokenExtendDate", "value", "i", "()Lcom/facebook/AccessToken;", "r", "(Lcom/facebook/AccessToken;)V", "f", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AccessTokenManager {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @Nullable
    public static AccessTokenManager f7526g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AccessTokenCache accessTokenCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AccessToken currentAccessTokenField;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean tokenRefreshInProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Date lastAttemptedTokenExtendDate;

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lcom/facebook/AccessTokenManager$Companion;", "", "<init>", "()V", "Lcom/facebook/AccessTokenManager;", "getInstance", "()Lcom/facebook/AccessTokenManager;", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$b;", TUIConstants.TUIChat.CALL_BACK, "Lcom/facebook/GraphRequest;", "b", "(Lcom/facebook/AccessToken;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "Lcom/facebook/AccessTokenManager$d;", "c", "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessTokenManager$d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "", "TOKEN_EXTEND_RETRY_SECONDS", "I", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lcom/facebook/AccessTokenManager;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public final GraphRequest m7597b(AccessToken accessToken, GraphRequest.InterfaceC5490b callback) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(accessToken, "me/permissions", callback);
            graphRequestNewGraphPathRequest.m7651H(bundle);
            graphRequestNewGraphPathRequest.m7650G(HttpMethod.GET);
            return graphRequestNewGraphPathRequest;
        }

        /* JADX INFO: renamed from: a */
        public final GraphRequest m7596a(AccessToken accessToken, GraphRequest.InterfaceC5490b callback) {
            InterfaceC5480d interfaceC5480dM7598c = m7598c(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", interfaceC5480dM7598c.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(accessToken, interfaceC5480dM7598c.getGraphPath(), callback);
            graphRequestNewGraphPathRequest.m7651H(bundle);
            graphRequestNewGraphPathRequest.m7650G(HttpMethod.GET);
            return graphRequestNewGraphPathRequest;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC5480d m7598c(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = AccessToken.DEFAULT_GRAPH_DOMAIN;
            }
            if (Intrinsics.areEqual(graphDomain, "instagram")) {
                return new C5478b();
            }
            return new C5477a();
        }

        @JvmStatic
        @NotNull
        public final AccessTokenManager getInstance() {
            AccessTokenManager accessTokenManager;
            AccessTokenManager accessTokenManager2 = AccessTokenManager.f7526g;
            if (accessTokenManager2 == null) {
                synchronized (this) {
                    accessTokenManager = AccessTokenManager.f7526g;
                    if (accessTokenManager == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(C5501a.m7799m());
                        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                        AccessTokenManager accessTokenManager3 = new AccessTokenManager(localBroadcastManager, new AccessTokenCache());
                        AccessTokenManager.f7526g = accessTokenManager3;
                        accessTokenManager = accessTokenManager3;
                    }
                }
                return accessTokenManager;
            }
            return accessTokenManager2;
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessTokenManager$a */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/AccessTokenManager$a;", "Lcom/facebook/AccessTokenManager$d;", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "graphPath", "grantType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5477a implements InterfaceC5480d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String graphPath = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String grantType = "fb_extend_sso_token";

        @Override // com.facebook.AccessTokenManager.InterfaceC5480d
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.InterfaceC5480d
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessTokenManager$b */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/AccessTokenManager$b;", "Lcom/facebook/AccessTokenManager$d;", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "graphPath", "grantType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5478b implements InterfaceC5480d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String graphPath = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String grantType = "ig_refresh_token";

        @Override // com.facebook.AccessTokenManager.InterfaceC5480d
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.InterfaceC5480d
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessTokenManager$c */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\f\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m90084d2 = {"Lcom/facebook/AccessTokenManager$c;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "accessToken", "", "b", "I", "c", "()I", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)V", "expiresAt", "d", "i", "expiresIn", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "g", "(Ljava/lang/Long;)V", "dataAccessExpirationTime", "e", "j", "graphDomain", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5479c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String accessToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int expiresAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int expiresIn;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public Long dataAccessExpirationTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public String graphDomain;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getExpiresAt() {
            return this.expiresAt;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getExpiresIn() {
            return this.expiresIn;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getGraphDomain() {
            return this.graphDomain;
        }

        /* JADX INFO: renamed from: f */
        public final void m7606f(@Nullable String str) {
            this.accessToken = str;
        }

        /* JADX INFO: renamed from: g */
        public final void m7607g(@Nullable Long l11) {
            this.dataAccessExpirationTime = l11;
        }

        /* JADX INFO: renamed from: h */
        public final void m7608h(int i11) {
            this.expiresAt = i11;
        }

        /* JADX INFO: renamed from: i */
        public final void m7609i(int i11) {
            this.expiresIn = i11;
        }

        /* JADX INFO: renamed from: j */
        public final void m7610j(@Nullable String str) {
            this.graphDomain = str;
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessTokenManager$d */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, m90084d2 = {"Lcom/facebook/AccessTokenManager$d;", "", "", "b", "()Ljava/lang/String;", "graphPath", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "grantType", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5480d {
        @NotNull
        /* JADX INFO: renamed from: a */
        String getGrantType();

        @NotNull
        /* JADX INFO: renamed from: b */
        String getGraphPath();
    }

    /* JADX INFO: renamed from: r */
    public final void m7592r(@Nullable AccessToken accessToken) {
        m7593s(accessToken, true);
    }

    public AccessTokenManager(@NotNull LocalBroadcastManager localBroadcastManager, @NotNull AccessTokenCache accessTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(accessTokenCache, "accessTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.accessTokenCache = accessTokenCache;
        this.tokenRefreshInProgress = new AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00a5, please report this as an issue */
    /* JADX INFO: renamed from: n */
    public static final void m7582n(AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, GraphResponse response) {
        JSONArray jSONArrayOptJSONArray;
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null || (jSONArrayOptJSONArray = jsonObject.optJSONArray("data")) == null) {
            return;
        }
        permissionsCallSucceeded.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String status = jSONObjectOptJSONObject.optString("status");
                if (!C5760c.m10057Z(strOptString) && !C5760c.m10057Z(status)) {
                    Intrinsics.checkNotNullExpressionValue(status, "status");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String status2 = status.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(status2, "this as java.lang.String).toLowerCase(locale)");
                    Intrinsics.checkNotNullExpressionValue(status2, "status");
                    int iHashCode = status2.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && status2.equals("declined")) {
                                declinedPermissions.add(strOptString);
                            } else {
                                Log.w("AccessTokenManager", "Unexpected status: " + status2);
                            }
                        } else if (status2.equals("granted")) {
                            permissions.add(strOptString);
                        } else {
                            Log.w("AccessTokenManager", "Unexpected status: " + status2);
                        }
                    } else if (status2.equals(C33590cg.f69441k)) {
                        expiredPermissions.add(strOptString);
                    } else {
                        Log.w("AccessTokenManager", "Unexpected status: " + status2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m7583o(C5479c refreshResult, GraphResponse response) {
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jsonObject = response.getJsonObject();
        if (jsonObject == null) {
            return;
        }
        refreshResult.m7606f(jsonObject.optString(AccessToken.ACCESS_TOKEN_KEY));
        refreshResult.m7608h(jsonObject.optInt("expires_at"));
        refreshResult.m7609i(jsonObject.optInt(AccessToken.EXPIRES_IN_KEY));
        refreshResult.m7607g(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
        refreshResult.m7610j(jsonObject.optString(AccessToken.GRAPH_DOMAIN, null));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0114 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0121 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149 A[Catch: all -> 0x0060, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0045, B:5:0x0051, B:7:0x005b, B:11:0x0065, B:14:0x006d, B:19:0x0079, B:22:0x0089, B:24:0x0095, B:29:0x00ca, B:31:0x00ce, B:32:0x00d2, B:36:0x00eb, B:40:0x00fa, B:44:0x0109, B:46:0x0114, B:50:0x0128, B:51:0x012c, B:48:0x0121, B:43:0x0103, B:39:0x00f4, B:35:0x00e5, B:26:0x00a6, B:28:0x00ae, B:61:0x0149), top: B:68:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static final void m7584p(C5479c refreshResult, AccessToken accessToken, AccessToken.InterfaceC5473b interfaceC5473b, AtomicBoolean permissionsCallSucceeded, Set permissions, Set declinedPermissions, Set expiredPermissions, AccessTokenManager this$0, GraphRequestBatch it) throws Throwable {
        AccessToken accessToken2;
        Companion companion;
        Date date;
        long j11;
        Set permissions2;
        Set declinedPermissions2;
        Set expiredPermissions2;
        Date dataAccessExpirationTime;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(permissionsCallSucceeded, "$permissionsCallSucceeded");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        Intrinsics.checkNotNullParameter(declinedPermissions, "$declinedPermissions");
        Intrinsics.checkNotNullParameter(expiredPermissions, "$expiredPermissions");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String accessToken3 = refreshResult.getAccessToken();
        int expiresAt = refreshResult.getExpiresAt();
        Long dataAccessExpirationTime2 = refreshResult.getDataAccessExpirationTime();
        String graphDomain = refreshResult.getGraphDomain();
        try {
            Companion companion2 = INSTANCE;
            if (companion2.getInstance().getCurrentAccessTokenField() != null) {
                AccessToken currentAccessTokenField = companion2.getInstance().getCurrentAccessTokenField();
                if ((currentAccessTokenField != null ? currentAccessTokenField.getUserId() : null) != accessToken.getUserId()) {
                    if (interfaceC5473b != null) {
                        interfaceC5473b.m7562a(new FacebookException("No current access token to refresh"));
                    }
                } else if (permissionsCallSucceeded.get() || accessToken3 != null || expiresAt != 0) {
                    Date expires = accessToken.getExpires();
                    try {
                        if (refreshResult.getExpiresAt() == 0) {
                            companion = companion2;
                            if (refreshResult.getExpiresIn() != 0) {
                                date = new Date((((long) refreshResult.getExpiresIn()) * 1000) + new Date().getTime());
                                j11 = 1000;
                            }
                            if (accessToken3 == null) {
                                accessToken3 = accessToken.getToken();
                            }
                            String str = accessToken3;
                            String applicationId = accessToken.getApplicationId();
                            String userId = accessToken.getUserId();
                            if (permissionsCallSucceeded.get()) {
                                permissions2 = permissions;
                            } else {
                                permissions2 = accessToken.getPermissions();
                            }
                            if (permissionsCallSucceeded.get()) {
                                declinedPermissions2 = declinedPermissions;
                            } else {
                                declinedPermissions2 = accessToken.getDeclinedPermissions();
                            }
                            if (permissionsCallSucceeded.get()) {
                                expiredPermissions2 = expiredPermissions;
                            } else {
                                expiredPermissions2 = accessToken.getExpiredPermissions();
                            }
                            AccessTokenSource source = accessToken.getSource();
                            Date date2 = new Date();
                            if (dataAccessExpirationTime2 != null) {
                                dataAccessExpirationTime = new Date(dataAccessExpirationTime2.longValue() * j11);
                            } else {
                                dataAccessExpirationTime = accessToken.getDataAccessExpirationTime();
                            }
                            Date date3 = dataAccessExpirationTime;
                            if (graphDomain == null) {
                                graphDomain = accessToken.getGraphDomain();
                            }
                            accessToken2 = new AccessToken(str, applicationId, userId, permissions2, declinedPermissions2, expiredPermissions2, source, date, date2, date3, graphDomain);
                            companion.getInstance().m7592r(accessToken2);
                            this$0.tokenRefreshInProgress.set(false);
                            if (interfaceC5473b != null) {
                                interfaceC5473b.m7563b(accessToken2);
                                return;
                            }
                            return;
                        }
                        companion = companion2;
                        expires = new Date(((long) refreshResult.getExpiresAt()) * 1000);
                        companion.getInstance().m7592r(accessToken2);
                        this$0.tokenRefreshInProgress.set(false);
                        if (interfaceC5473b != null) {
                            interfaceC5473b.m7563b(accessToken2);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        this$0.tokenRefreshInProgress.set(false);
                        if (interfaceC5473b != null && accessToken2 != null) {
                            interfaceC5473b.m7563b(accessToken2);
                        }
                        throw th;
                    }
                    date = expires;
                    j11 = 1000;
                    if (accessToken3 == null) {
                        accessToken3 = accessToken.getToken();
                    }
                    String str2 = accessToken3;
                    String applicationId2 = accessToken.getApplicationId();
                    String userId2 = accessToken.getUserId();
                    if (permissionsCallSucceeded.get()) {
                        permissions2 = permissions;
                    } else {
                        permissions2 = accessToken.getPermissions();
                    }
                    if (permissionsCallSucceeded.get()) {
                        declinedPermissions2 = declinedPermissions;
                    } else {
                        declinedPermissions2 = accessToken.getDeclinedPermissions();
                    }
                    if (permissionsCallSucceeded.get()) {
                        expiredPermissions2 = expiredPermissions;
                    } else {
                        expiredPermissions2 = accessToken.getExpiredPermissions();
                    }
                    AccessTokenSource source2 = accessToken.getSource();
                    Date date4 = new Date();
                    if (dataAccessExpirationTime2 != null) {
                        dataAccessExpirationTime = new Date(dataAccessExpirationTime2.longValue() * j11);
                    } else {
                        dataAccessExpirationTime = accessToken.getDataAccessExpirationTime();
                    }
                    Date date5 = dataAccessExpirationTime;
                    if (graphDomain == null) {
                        graphDomain = accessToken.getGraphDomain();
                    }
                    accessToken2 = new AccessToken(str2, applicationId2, userId2, permissions2, declinedPermissions2, expiredPermissions2, source2, date, date4, date5, graphDomain);
                } else if (interfaceC5473b != null) {
                    interfaceC5473b.m7562a(new FacebookException("Failed to refresh access token"));
                }
            } else if (interfaceC5473b != null) {
                interfaceC5473b.m7562a(new FacebookException("No current access token to refresh"));
            }
            this$0.tokenRefreshInProgress.set(false);
        } catch (Throwable th3) {
            th = th3;
            accessToken2 = null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final AccessToken getCurrentAccessTokenField() {
        return this.currentAccessTokenField;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m7588j() {
        AccessToken accessTokenM7571f = this.accessTokenCache.m7571f();
        if (accessTokenM7571f == null) {
            return false;
        }
        m7593s(accessTokenM7571f, false);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m7591q(AccessToken oldAccessToken, AccessToken currentAccessToken) {
        Intent intent = new Intent(C5501a.m7799m(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", oldAccessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", currentAccessToken);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: s */
    public final void m7593s(AccessToken currentAccessToken, boolean saveToCache) {
        AccessToken accessToken = this.currentAccessTokenField;
        this.currentAccessTokenField = currentAccessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (saveToCache) {
            if (currentAccessToken != null) {
                this.accessTokenCache.m7572g(currentAccessToken);
            } else {
                this.accessTokenCache.m7566a();
                C5760c.m10069h(C5501a.m7799m());
            }
        }
        if (C5760c.m10064e(accessToken, currentAccessToken)) {
            return;
        }
        m7591q(accessToken, currentAccessToken);
        m7594t();
    }

    /* JADX INFO: renamed from: l */
    public static final void m7581l(AccessTokenManager this$0, AccessToken.InterfaceC5473b interfaceC5473b) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m7590m(interfaceC5473b);
    }

    /* JADX INFO: renamed from: g */
    public final void m7585g() {
        m7591q(getCurrentAccessTokenField(), getCurrentAccessTokenField());
    }

    /* JADX INFO: renamed from: h */
    public final void m7586h() {
        if (!m7595u()) {
            return;
        }
        m7589k(null);
    }

    /* JADX INFO: renamed from: k */
    public final void m7589k(@Nullable final AccessToken.InterfaceC5473b callback) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            m7590m(callback);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(callback) { // from class: z2.a
                @Override // java.lang.Runnable
                public final void run() {
                    AccessTokenManager.m7581l(this.f104470b, null);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7590m(final AccessToken.InterfaceC5473b callback) {
        final AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            if (callback != null) {
                callback.m7562a(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (callback != null) {
                callback.m7562a(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.lastAttemptedTokenExtendDate = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final C5479c c5479c = new C5479c();
        Companion companion = INSTANCE;
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch(companion.m7597b(currentAccessTokenField, new GraphRequest.InterfaceC5490b() { // from class: z2.b
            @Override // com.facebook.GraphRequest.InterfaceC5490b
            /* JADX INFO: renamed from: a */
            public final void mo78a(GraphResponse graphResponse) {
                AccessTokenManager.m7582n(atomicBoolean, hashSet, hashSet2, hashSet3, graphResponse);
            }
        }), companion.m7596a(currentAccessTokenField, new GraphRequest.InterfaceC5490b() { // from class: z2.c
            @Override // com.facebook.GraphRequest.InterfaceC5490b
            /* JADX INFO: renamed from: a */
            public final void mo78a(GraphResponse graphResponse) {
                AccessTokenManager.m7583o(c5479c, graphResponse);
            }
        }));
        graphRequestBatch.m7722c(new GraphRequestBatch.InterfaceC5497a(currentAccessTokenField, callback, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: z2.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AccessToken f104477b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ AtomicBoolean f104478c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Set f104479d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ Set f104480e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Set f104481f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ AccessTokenManager f104482g;

            @Override // com.facebook.GraphRequestBatch.InterfaceC5497a
            /* JADX INFO: renamed from: a */
            public final void mo7738a(GraphRequestBatch graphRequestBatch2) throws Throwable {
                AccessTokenManager.m7584p(this.f104476a, this.f104477b, null, this.f104478c, this.f104479d, this.f104480e, this.f104481f, this.f104482g, graphRequestBatch2);
            }

            {
                this.f104478c = atomicBoolean;
                this.f104479d = hashSet;
                this.f104480e = hashSet2;
                this.f104481f = hashSet3;
                this.f104482g = this;
            }
        });
        graphRequestBatch.m7726g();
    }

    /* JADX INFO: renamed from: t */
    public final void m7594t() {
        Date expires;
        Context contextM7799m = C5501a.m7799m();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) contextM7799m.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (companion.isCurrentAccessTokenActive()) {
            if (currentAccessToken != null) {
                expires = currentAccessToken.getExpires();
            } else {
                expires = null;
            }
            if (expires != null && alarmManager != null) {
                Intent intent = new Intent(contextM7799m, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, currentAccessToken.getExpires().getTime(), PendingIntent.getBroadcast(contextM7799m, 0, intent, 67108864));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7595u() {
        AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!currentAccessTokenField.getSource().getCanExtendToken() || time - this.lastAttemptedTokenExtendDate.getTime() <= FundingRateEntity.MILLIS_PER_HOUR || time - currentAccessTokenField.getLastRefresh().getTime() <= 86400000) {
            return false;
        }
        return true;
    }
}
