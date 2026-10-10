package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.C5760c;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p333i6.C38457p;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessToken.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\b\u001a\u0018\u0000 N2\u00020\u0001:\u0003OPNB\u008b\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010)J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b1\u00102R\u0017\u00103\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b;\u0010:R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002078\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b<\u0010:R\u0017\u0010=\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u0017R\u0017\u0010@\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010D\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u00106R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\bF\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bG\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\bH\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bI\u0010\u0017R\u0011\u0010J\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010L\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bL\u0010KR\u0011\u0010M\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006Q"}, m90084d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "accessToken", "applicationId", "userId", "", AccessToken.PERMISSIONS_KEY, "declinedPermissions", "expiredPermissions", "Lcom/facebook/AccessTokenSource;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "tokenToString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "appendPermissions", "(Ljava/lang/StringBuilder;)V", "tokenSource", "convertTokenSourceForGraphDomain", "(Lcom/facebook/AccessTokenSource;Ljava/lang/String;)Lcom/facebook/AccessTokenSource;", "toString", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "()Lorg/json/JSONObject;", "toJSONObject", "describeContents", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "expires", "Ljava/util/Date;", "getExpires", "()Ljava/util/Date;", "", "Ljava/util/Set;", "getPermissions", "()Ljava/util/Set;", "getDeclinedPermissions", "getExpiredPermissions", "token", "Ljava/lang/String;", "getToken", "source", "Lcom/facebook/AccessTokenSource;", "getSource", "()Lcom/facebook/AccessTokenSource;", "lastRefresh", "getLastRefresh", "getApplicationId", "getUserId", "getDataAccessExpirationTime", "getGraphDomain", "isExpired", "()Z", "isDataAccessExpired", "isInstagramToken", "Companion", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AccessToken implements Parcelable {

    @NotNull
    public static final String ACCESS_TOKEN_KEY = "access_token";

    @NotNull
    private static final String APPLICATION_ID_KEY = "application_id";

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";

    @NotNull
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";

    @NotNull
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;

    @NotNull
    private static final Date DEFAULT_EXPIRATION_TIME;

    @NotNull
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";

    @NotNull
    private static final Date DEFAULT_LAST_REFRESH_TIME;

    @NotNull
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";

    @NotNull
    private static final String EXPIRES_AT_KEY = "expires_at";

    @NotNull
    public static final String EXPIRES_IN_KEY = "expires_in";

    @NotNull
    public static final String GRAPH_DOMAIN = "graph_domain";

    @NotNull
    private static final String LAST_REFRESH_KEY = "last_refresh";

    @NotNull
    private static final Date MAX_DATE;

    @NotNull
    private static final String PERMISSIONS_KEY = "permissions";

    @NotNull
    private static final String SOURCE_KEY = "source";

    @NotNull
    private static final String TOKEN_KEY = "token";

    @NotNull
    public static final String USER_ID_KEY = "user_id";

    @NotNull
    private static final String VERSION_KEY = "version";

    @NotNull
    private final String applicationId;

    @NotNull
    private final Date dataAccessExpirationTime;

    @NotNull
    private final Set<String> declinedPermissions;

    @NotNull
    private final Set<String> expiredPermissions;

    @NotNull
    private final Date expires;

    @Nullable
    private final String graphDomain;

    @NotNull
    private final Date lastRefresh;

    @NotNull
    private final Set<String> permissions;

    @NotNull
    private final AccessTokenSource source;

    @NotNull
    private final String token;

    @NotNull
    private final String userId;

    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0011\u0010\u0014J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b&\u0010'J)\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170*2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b+\u0010,J\u0017\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b0\u00101JC\u00108\u001a\u0004\u0018\u00010\u00042\u0010\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u0010;R\u0014\u0010D\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010E\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010;R\u0014\u0010J\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010K\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010;R\u0014\u0010L\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010;R\u0014\u0010M\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010;R\u0014\u0010N\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010;R\u0014\u0010O\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010;R\u0014\u0010P\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010HR\u0014\u0010Q\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010;R\u0014\u0010R\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010;R\u0014\u0010S\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010;R\u0014\u0010T\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010;R\u0014\u0010U\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010;¨\u0006V"}, m90084d2 = {"Lcom/facebook/AccessToken$Companion;", "", "<init>", "()V", "Lcom/facebook/AccessToken;", "getCurrentAccessToken", "()Lcom/facebook/AccessToken;", "accessToken", "", "setCurrentAccessToken", "(Lcom/facebook/AccessToken;)V", "", "isCurrentAccessTokenActive", "()Z", "isDataAccessActive", "isLoggedInWithInstagram", "expireCurrentAccessToken", "refreshCurrentAccessTokenAsync", "Lcom/facebook/AccessToken$b;", TUIConstants.TUIChat.CALL_BACK, "(Lcom/facebook/AccessToken$b;)V", "Landroid/content/Intent;", "intent", "", "applicationId", "Lcom/facebook/AccessToken$a;", "accessTokenCallback", "createFromNativeLinkingIntent", "(Landroid/content/Intent;Ljava/lang/String;Lcom/facebook/AccessToken$a;)V", "current", "Landroid/os/Bundle;", "bundle", "createFromRefresh$facebook_core_release", "(Lcom/facebook/AccessToken;Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "createFromRefresh", "createExpired$facebook_core_release", "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;", "createExpired", "createFromLegacyCache$facebook_core_release", "(Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "createFromLegacyCache", "key", "", "getPermissionsFromBundle$facebook_core_release", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getPermissionsFromBundle", "Lorg/json/JSONObject;", "jsonObject", "createFromJSONObject$facebook_core_release", "(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;", "createFromJSONObject", "requestedPermissions", "Lcom/facebook/AccessTokenSource;", "source", "Ljava/util/Date;", "expirationBase", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/List;Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/lang/String;)Lcom/facebook/AccessToken;", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "APPLICATION_ID_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CURRENT_JSON_FORMAT", "I", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.AccessToken$Companion$a */
        /* JADX INFO: compiled from: AccessToken.kt */
        @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/facebook/AccessToken$Companion$a", "Lcom/facebook/internal/c$a;", "Lorg/json/JSONObject;", "userInfo", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lorg/json/JSONObject;)V", "Lcom/facebook/FacebookException;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "b", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C5471a implements C5760c.a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Bundle f7519a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f7520b;

            @Override // com.facebook.internal.C5760c.a
            /* JADX INFO: renamed from: a */
            public void mo7558a(@Nullable JSONObject userInfo) {
                String string;
                if (userInfo != null) {
                    try {
                        string = userInfo.getString("id");
                    } catch (Exception unused) {
                        new FacebookException("Unable to generate access token due to missing user id");
                        throw null;
                    }
                } else {
                    string = null;
                }
                if (string == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.f7519a.putString("user_id", string);
                AccessToken.INSTANCE.m7557a(null, this.f7519a, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), this.f7520b);
                throw null;
            }

            @Override // com.facebook.internal.C5760c.a
            /* JADX INFO: renamed from: b */
            public void mo7559b(@Nullable FacebookException error) {
                throw null;
            }

            public C5471a(Bundle bundle, InterfaceC5472a interfaceC5472a, String str) {
                this.f7519a = bundle;
                this.f7520b = str;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.INSTANCE.getInstance().m7589k(null);
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final AccessToken m7557a(List<String> requestedPermissions, Bundle bundle, AccessTokenSource source, Date expirationBase, String applicationId) {
            Date dateM10089w;
            String string;
            String string2 = bundle.getString(AccessToken.ACCESS_TOKEN_KEY);
            if (string2 == null || (dateM10089w = C5760c.m10089w(bundle, AccessToken.EXPIRES_IN_KEY, expirationBase)) == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, requestedPermissions, null, null, source, dateM10089w, new Date(), C5760c.m10089w(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L)), null, 1024, null);
        }

        @NotNull
        public final AccessToken createExpired$facebook_core_release(@NotNull AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @JvmStatic
        @NotNull
        public final AccessToken createFromJSONObject$facebook_core_release(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String token = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong(AccessToken.EXPIRES_AT_KEY));
            JSONArray permissionsArray = jsonObject.getJSONArray(AccessToken.PERMISSIONS_KEY);
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
            Date date2 = new Date(jsonObject.getLong(AccessToken.LAST_REFRESH_KEY));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
            String applicationId = jsonObject.getString(AccessToken.APPLICATION_ID_KEY);
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
            String strOptString = jsonObject.optString(AccessToken.GRAPH_DOMAIN, null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            List<String> listM10061b0 = C5760c.m10061b0(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            return new AccessToken(token, applicationId, userId, listM10061b0, C5760c.m10061b0(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : C5760c.m10061b0(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        @JvmStatic
        @Nullable
        public final AccessToken createFromLegacyCache$facebook_core_release(@NotNull Bundle bundle) {
            String string;
            AccessToken accessToken;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            LegacyTokenHelper.Companion companion = LegacyTokenHelper.INSTANCE;
            String applicationId = companion.getApplicationId(bundle);
            if (C5760c.m10057Z(applicationId)) {
                applicationId = C5501a.m7800n();
            }
            String str = applicationId;
            String token = companion.getToken(bundle);
            if (token == null) {
                return null;
            }
            JSONObject jSONObjectM10066f = C5760c.m10066f(token);
            if (jSONObjectM10066f != null) {
                try {
                    string = jSONObjectM10066f.getString("id");
                    accessToken = null;
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
                accessToken = null;
            }
            if (str == null || string == null) {
                return accessToken;
            }
            return new AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, companion.getSource(bundle), companion.getExpirationDate(bundle), companion.getLastRefreshDate(bundle), null, null, 1024, null);
        }

        @JvmStatic
        public final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull String applicationId, @NotNull InterfaceC5472a accessTokenCallback) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(accessTokenCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCallback.m7561b(new FacebookException("No extras found on intent"));
                return;
            }
            Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString(AccessToken.ACCESS_TOKEN_KEY);
            if (string == null || string.length() == 0) {
                accessTokenCallback.m7561b(new FacebookException("No access token found on intent"));
                return;
            }
            String string2 = bundle.getString("user_id");
            if (string2 == null || string2.length() == 0) {
                C5760c.m10044F(string, new C5471a(bundle, accessTokenCallback, applicationId));
            } else {
                accessTokenCallback.m7560a(m7557a(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
            }
        }

        @JvmStatic
        @SuppressLint({"FieldGetter"})
        @Nullable
        public final AccessToken createFromRefresh$facebook_core_release(@NotNull AccessToken current, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_WEB && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new FacebookException("Invalid token source: " + current.getSource());
            }
            Date dateM10089w = C5760c.m10089w(bundle, AccessToken.EXPIRES_IN_KEY, new Date(0L));
            String string = bundle.getString(AccessToken.ACCESS_TOKEN_KEY);
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString(AccessToken.GRAPH_DOMAIN);
            Date dateM10089w2 = C5760c.m10089w(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (C5760c.m10057Z(string)) {
                return null;
            }
            return new AccessToken(string, current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), dateM10089w, new Date(), dateM10089w2, string2);
        }

        @JvmStatic
        public final void expireCurrentAccessToken() {
            AccessToken accessTokenM7587i = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            if (accessTokenM7587i != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(accessTokenM7587i));
            }
        }

        @JvmStatic
        @Nullable
        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
        }

        @JvmStatic
        @NotNull
        public final List<String> getPermissionsFromBundle$facebook_core_release(@NotNull Bundle bundle, @Nullable String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
            if (stringArrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n            Collection…Permissions))\n          }");
            return listUnmodifiableList;
        }

        @JvmStatic
        public final boolean isCurrentAccessTokenActive() {
            AccessToken accessTokenM7587i = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (accessTokenM7587i == null || accessTokenM7587i.isExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isDataAccessActive() {
            AccessToken accessTokenM7587i = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (accessTokenM7587i == null || accessTokenM7587i.isDataAccessExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isLoggedInWithInstagram() {
            AccessToken accessTokenM7587i = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (accessTokenM7587i == null || accessTokenM7587i.isExpired() || !accessTokenM7587i.isInstagramToken()) ? false : true;
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync(@Nullable InterfaceC5473b callback) {
            AccessTokenManager.INSTANCE.getInstance().m7589k(callback);
        }

        @JvmStatic
        public final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
            AccessTokenManager.INSTANCE.getInstance().m7592r(accessToken);
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$a */
    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/AccessToken$a;", "", "Lcom/facebook/AccessToken;", "token", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/AccessToken;)V", "Lcom/facebook/FacebookException;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "b", "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5472a {
        /* JADX INFO: renamed from: a */
        void m7560a(@Nullable AccessToken token);

        /* JADX INFO: renamed from: b */
        void m7561b(@Nullable FacebookException error);
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$b */
    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/AccessToken$b;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "b", "(Lcom/facebook/AccessToken;)V", "Lcom/facebook/FacebookException;", "exception", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/FacebookException;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface InterfaceC5473b {
        /* JADX INFO: renamed from: a */
        void m7562a(@Nullable FacebookException exception);

        /* JADX INFO: renamed from: b */
        void m7563b(@Nullable AccessToken accessToken);
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$c */
    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/AccessToken$c", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "Landroid/os/Parcel;", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Parcel;)Lcom/facebook/AccessToken;", "", "size", "", "b", "(I)[Lcom/facebook/AccessToken;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5474c implements Parcelable.Creator<AccessToken> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int size) {
            return new AccessToken[size];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AccessToken(source);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AccessToken(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        this(accessToken, applicationId, userId, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync() {
        INSTANCE.refreshCurrentAccessTokenAsync();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        boolean zAreEqual;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (Intrinsics.areEqual(this.expires, accessToken.expires) && Intrinsics.areEqual(this.permissions, accessToken.permissions) && Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && Intrinsics.areEqual(this.userId, accessToken.userId) && Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                zAreEqual = str2 == null;
            } else {
                zAreEqual = Intrinsics.areEqual(str, str2);
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$d */
    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class C5475d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            try {
                iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C5474c();
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i11 & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    private final void appendPermissions(StringBuilder builder) {
        builder.append(" permissions:");
        builder.append("[");
        builder.append(TextUtils.join(", ", this.permissions));
        builder.append("]");
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals("instagram")) {
            return tokenSource;
        }
        int i11 = C5475d.$EnumSwitchMapping$0[tokenSource.ordinal()];
        if (i11 == 1) {
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i11 != 2) {
            return i11 != 3 ? tokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW;
        }
        return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    @JvmStatic
    public static final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull String str, @NotNull InterfaceC5472a interfaceC5472a) {
        INSTANCE.createFromNativeLinkingIntent(intent, str, interfaceC5472a);
    }

    @JvmStatic
    public static final void expireCurrentAccessToken() {
        INSTANCE.expireCurrentAccessToken();
    }

    @JvmStatic
    @Nullable
    public static final AccessToken getCurrentAccessToken() {
        return INSTANCE.getCurrentAccessToken();
    }

    @JvmStatic
    public static final boolean isCurrentAccessTokenActive() {
        return INSTANCE.isCurrentAccessTokenActive();
    }

    @JvmStatic
    public static final boolean isDataAccessActive() {
        return INSTANCE.isDataAccessActive();
    }

    @JvmStatic
    public static final boolean isLoggedInWithInstagram() {
        return INSTANCE.isLoggedInWithInstagram();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync(@Nullable InterfaceC5473b interfaceC5473b) {
        INSTANCE.refreshCurrentAccessTokenAsync(interfaceC5473b);
    }

    @JvmStatic
    public static final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
        INSTANCE.setCurrentAccessToken(accessToken);
    }

    private final String tokenToString() {
        return C5501a.m7770F(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    @NotNull
    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    @NotNull
    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    @NotNull
    public final Date getExpires() {
        return this.expires;
    }

    @Nullable
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    @NotNull
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    @NotNull
    public final Set<String> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final AccessTokenSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals("instagram");
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put(PERMISSIONS_KEY, new JSONArray((Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put(GRAPH_DOMAIN, str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(tokenToString());
        appendPermissions(sb2);
        sb2.append("}");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    @JvmOverloads
    public AccessToken(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        C38457p.m86725d(accessToken, "accessToken");
        C38457p.m86725d(applicationId, "applicationId");
        C38457p.m86725d(userId, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.permissions = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.declinedPermissions = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = accessToken;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str == null ? DEFAULT_GRAPH_DOMAIN : str;
    }

    public AccessToken(@NotNull Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = C38457p.m86729h(parcel.readString(), "token");
        String string = parcel.readString();
        if (string != null) {
            accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
        } else {
            accessTokenSourceValueOf = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSourceValueOf;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = C38457p.m86729h(parcel.readString(), "applicationId");
        this.userId = C38457p.m86729h(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
