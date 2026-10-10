package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.Logger;
import com.tencent.bugly.proguard.C33590cg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LegacyTokenHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0016B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/LegacyTokenHelper;", "", "Landroid/content/Context;", "context", "", "cacheKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "key", "bundle", "b", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", C33590cg.f69440j, "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LegacyTokenHelper {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final String f7605d = LegacyTokenHelper.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences cache;

    /* JADX INFO: compiled from: LegacyTokenHelper.kt */
    @Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0007¢\u0006\u0004\b \u0010\u001fJ%\u0010!\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0007¢\u0006\u0004\b!\u0010\u001fJ\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\u0012J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010\u0014J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010\u0017J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0015H\u0007¢\u0006\u0004\b*\u0010\u0019J\u0019\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010\u000bJ!\u0010,\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b,\u0010\u000fJ%\u0010.\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b.\u0010/J)\u00101\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\t2\u0006\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00106\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00107\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u00104R\u0014\u00108\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u00104R\u0014\u00109\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00104R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00104R\u0014\u0010=\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00104R\u0014\u0010>\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00104R\u0014\u0010?\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b?\u00104R\u0014\u0010@\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u00104R\u001c\u0010B\u001a\n A*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00104R\u0014\u0010C\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bC\u00104R\u0014\u0010D\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u00104R\u0014\u0010E\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00104R\u0014\u0010F\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u00104R\u0014\u0010G\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00104R\u0014\u0010H\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u00104R\u0014\u0010I\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u00104R\u0014\u0010J\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u00104R\u0014\u0010K\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u00104R\u0014\u0010L\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u00104R\u0014\u0010M\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u00104R\u0014\u0010N\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u00104R\u0014\u0010O\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u00104R\u0014\u0010P\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u00104R\u0014\u0010Q\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u00104R\u0014\u0010R\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u00104R\u0014\u0010S\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u00104R\u0014\u0010T\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u00104R\u0014\u0010U\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u00104R\u0014\u0010V\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u00104R\u0014\u0010W\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u00104¨\u0006X"}, m90084d2 = {"Lcom/facebook/LegacyTokenHelper$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "hasTokenInformation", "(Landroid/os/Bundle;)Z", "", "getToken", "(Landroid/os/Bundle;)Ljava/lang/String;", "value", "", "putToken", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Ljava/util/Date;", "getExpirationDate", "(Landroid/os/Bundle;)Ljava/util/Date;", "putExpirationDate", "(Landroid/os/Bundle;Ljava/util/Date;)V", "", "getExpirationMilliseconds", "(Landroid/os/Bundle;)J", "putExpirationMilliseconds", "(Landroid/os/Bundle;J)V", "", "getPermissions", "(Landroid/os/Bundle;)Ljava/util/Set;", "", "putPermissions", "(Landroid/os/Bundle;Ljava/util/Collection;)V", "putDeclinedPermissions", "putExpiredPermissions", "Lcom/facebook/AccessTokenSource;", "getSource", "(Landroid/os/Bundle;)Lcom/facebook/AccessTokenSource;", "putSource", "(Landroid/os/Bundle;Lcom/facebook/AccessTokenSource;)V", "getLastRefreshDate", "putLastRefreshDate", "getLastRefreshMilliseconds", "putLastRefreshMilliseconds", "getApplicationId", "putApplicationId", "key", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;", "date", "b", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)V", "APPLICATION_ID_KEY", "Ljava/lang/String;", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "INVALID_BUNDLE_MILLISECONDS", "J", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "kotlin.jvm.PlatformType", "TAG", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Date m7750a(Bundle bundle, String key) {
            if (bundle == null) {
                return null;
            }
            long j11 = bundle.getLong(key, Long.MIN_VALUE);
            if (j11 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j11);
        }

        @JvmStatic
        public final boolean hasTokenInformation(@Nullable Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final String getApplicationId(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        @JvmStatic
        @Nullable
        public final Date getExpirationDate(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return m7750a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        @JvmStatic
        public final long getExpirationMilliseconds(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        @JvmStatic
        @Nullable
        public final Date getLastRefreshDate(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return m7750a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        @JvmStatic
        public final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong("com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        @JvmStatic
        @Nullable
        public final Set<String> getPermissions(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.TokenCachingStrategy.Permissions");
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        @JvmStatic
        @Nullable
        public final AccessTokenSource getSource(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (AccessTokenSource) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        @JvmStatic
        @Nullable
        public final String getToken(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        @JvmStatic
        public final void putApplicationId(@NotNull Bundle bundle, @Nullable String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString("com.facebook.TokenCachingStrategy.ApplicationId", value);
        }

        @JvmStatic
        public final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList("com.facebook.TokenCachingStrategy.DeclinedPermissions", new ArrayList<>(value));
        }

        @JvmStatic
        public final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            m7751b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate", value);
        }

        @JvmStatic
        public final void putExpirationMilliseconds(@NotNull Bundle bundle, long value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong("com.facebook.TokenCachingStrategy.ExpirationDate", value);
        }

        @JvmStatic
        public final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList("com.facebook.TokenCachingStrategy.ExpiredPermissions", new ArrayList<>(value));
        }

        @JvmStatic
        public final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            m7751b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate", value);
        }

        @JvmStatic
        public final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong("com.facebook.TokenCachingStrategy.LastRefreshDate", value);
        }

        @JvmStatic
        public final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList("com.facebook.TokenCachingStrategy.Permissions", new ArrayList<>(value));
        }

        @JvmStatic
        public final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource", value);
        }

        @JvmStatic
        public final void putToken(@NotNull Bundle bundle, @NotNull String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString("com.facebook.TokenCachingStrategy.Token", value);
        }

        /* JADX INFO: renamed from: b */
        public final void m7751b(Bundle bundle, String key, Date date) {
            bundle.putLong(key, date.getTime());
        }
    }

    @JvmOverloads
    public LegacyTokenHelper(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.cacheKey = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.cache = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final void m7747a() {
        this.cache.edit().clear().apply();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m7748b(String key, Bundle bundle) throws JSONException {
        String str;
        String string;
        String string2 = this.cache.getString(key, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.checkNotNullExpressionValue(string2, "checkNotNull(cache.getString(key, \"{}\"))");
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i11 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals("stringList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        while (i11 < length) {
                            Object obj = jSONArray.get(i11);
                            if (obj == JSONObject.NULL) {
                                str = null;
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                                str = (String) obj;
                            }
                            arrayList.add(i11, str);
                            i11++;
                        }
                        bundle.putStringArrayList(key, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        while (i11 < length2) {
                            zArr[i11] = jSONArray2.getBoolean(i11);
                            i11++;
                        }
                        bundle.putBooleanArray(key, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        while (i11 < length3) {
                            bArr[i11] = (byte) jSONArray3.getInt(i11);
                            i11++;
                        }
                        bundle.putByteArray(key, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        for (int i12 = 0; i12 < length4; i12++) {
                            String string4 = jSONArray4.getString(i12);
                            if (string4 != null && string4.length() == 1) {
                                cArr[i12] = string4.charAt(0);
                            }
                        }
                        bundle.putCharArray(key, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals("double")) {
                        bundle.putDouble(key, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        while (i11 < length5) {
                            jArr[i11] = jSONArray5.getLong(i11);
                            i11++;
                        }
                        bundle.putLongArray(key, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals(TypedValues.Custom.S_STRING)) {
                        bundle.putString(key, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        while (i11 < length6) {
                            fArr[i11] = (float) jSONArray6.getDouble(i11);
                            i11++;
                        }
                        bundle.putFloatArray(key, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(key, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(key, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(key, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals("char") && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(key, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            Class<?> cls = Class.forName(jSONObject.getString("enumType"));
                            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                            bundle.putSerializable(key, Enum.valueOf(cls, jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(key, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals(TypedValues.Custom.S_FLOAT)) {
                        bundle.putFloat(key, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        while (i11 < length7) {
                            iArr[i11] = jSONArray7.getInt(i11);
                            i11++;
                        }
                        bundle.putIntArray(key, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals("short")) {
                        bundle.putShort(key, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        while (i11 < length8) {
                            dArr[i11] = jSONArray8.getDouble(i11);
                            i11++;
                        }
                        bundle.putDoubleArray(key, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        while (i11 < length9) {
                            sArr[i11] = (short) jSONArray9.getInt(i11);
                            i11++;
                        }
                        bundle.putShortArray(key, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Bundle m7749c() {
        Bundle bundle = new Bundle();
        for (String key : this.cache.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                m7748b(key, bundle);
            } catch (JSONException e11) {
                Logger.Companion companion = Logger.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG = f7605d;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                companion.log(loggingBehavior, 5, TAG, "Error reading cached value for key: '" + key + "' -- " + e11);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : str);
    }
}
