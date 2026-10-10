package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InternalAppEventsLogger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001-B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bB%\b\u0016\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0004\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$JA\u0010%\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b'\u0010\u0015J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,¨\u0006."}, m90084d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger;", "", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "loggerImpl", "<init>", "(Lcom/facebook/appevents/AppEventsLoggerImpl;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "", "applicationId", "(Landroid/content/Context;Ljava/lang/String;)V", "activityName", "Lcom/facebook/AccessToken;", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "Landroid/os/Bundle;", "parameters", "", "d", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "c", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Lcom/facebook/appevents/OperationalData;", "operationalData", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "buttonText", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "g", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "f", "b", "(Landroid/os/Bundle;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InternalAppEventsLogger {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AppEventsLoggerImpl loggerImpl;

    /* JADX INFO: compiled from: InternalAppEventsLogger.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0014H\u0007J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/appevents/InternalAppEventsLogger$Companion;", "", "()V", "createInstance", "Lcom/facebook/appevents/InternalAppEventsLogger;", "context", "Landroid/content/Context;", "applicationId", "", "activityName", "accessToken", "Lcom/facebook/AccessToken;", "getAnalyticsExecutor", "Ljava/util/concurrent/Executor;", "getFlushBehavior", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getPushNotificationsRegistrationId", "setInternalUserData", "", "ud", "", "setUserData", TUIConstants.TUIContact.USER_DATA, "Landroid/os/Bundle;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final InternalAppEventsLogger createInstance(@Nullable Context context) {
            return createInstance$default(this, context, null, 2, null);
        }

        public Companion() {
        }

        public static /* synthetic */ InternalAppEventsLogger createInstance$default(Companion companion, Context context, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.createInstance(context, str);
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final InternalAppEventsLogger createInstance(@Nullable Context context, @Nullable String applicationId) {
            return new InternalAppEventsLogger(context, applicationId);
        }

        @JvmStatic
        @NotNull
        public final Executor getAnalyticsExecutor() {
            return AppEventsLoggerImpl.INSTANCE.getAnalyticsExecutor();
        }

        @JvmStatic
        @NotNull
        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        @JvmStatic
        @Nullable
        public final String getPushNotificationsRegistrationId() {
            return AppEventsLoggerImpl.INSTANCE.getPushNotificationsRegistrationId();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @NotNull
        public final InternalAppEventsLogger createInstance(@NotNull String activityName, @Nullable String applicationId, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            return new InternalAppEventsLogger(activityName, applicationId, accessToken);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        public final void setInternalUserData(@NotNull Map<String, String> ud2) {
            Intrinsics.checkNotNullParameter(ud2, "ud");
            C5524d.m8096m(ud2);
        }

        @JvmStatic
        public final void setUserData(@Nullable Bundle userData) {
            C5524d.m8097n(userData);
        }
    }

    public InternalAppEventsLogger(@NotNull AppEventsLoggerImpl loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.loggerImpl = loggerImpl;
    }

    /* JADX INFO: renamed from: a */
    public final void m7879a() {
        this.loggerImpl.m7856m();
    }

    /* JADX INFO: renamed from: e */
    public final void m7883e(@Nullable String eventName, @Nullable String buttonText) {
        this.loggerImpl.m7861s(eventName, buttonText);
    }

    public InternalAppEventsLogger(@Nullable Context context) {
        this(new AppEventsLoggerImpl(context, (String) null, (AccessToken) null));
    }

    /* JADX INFO: renamed from: b */
    public final void m7880b(@NotNull Bundle parameters) {
        boolean z11;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if ((parameters.getInt("previous") & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && !C5501a.m7803q()) {
            return;
        }
        this.loggerImpl.m7862t("fb_sdk_settings_changed", null, parameters);
    }

    /* JADX INFO: renamed from: c */
    public final void m7881c(@Nullable String eventName, double valueToSum, @Nullable Bundle parameters) {
        if (C5501a.m7803q()) {
            this.loggerImpl.m7858o(eventName, valueToSum, parameters);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7882d(@Nullable String eventName, @Nullable Bundle parameters) {
        if (C5501a.m7803q()) {
            this.loggerImpl.m7859p(eventName, parameters);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7884f(@Nullable String eventName, @Nullable Bundle parameters) {
        if (C5501a.m7803q()) {
            this.loggerImpl.m7862t(eventName, null, parameters);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7885g(@Nullable String eventName, @Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable OperationalData operationalData) {
        if (C5501a.m7803q()) {
            this.loggerImpl.m7863u(eventName, purchaseAmount, currency, parameters, operationalData);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7886h(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable OperationalData operationalData) {
        if (C5501a.m7803q()) {
            this.loggerImpl.m7865w(purchaseAmount, currency, parameters, operationalData);
        }
    }

    public InternalAppEventsLogger(@Nullable Context context, @Nullable String str) {
        this(new AppEventsLoggerImpl(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAppEventsLogger(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
        this(new AppEventsLoggerImpl(activityName, str, accessToken));
        Intrinsics.checkNotNullParameter(activityName, "activityName");
    }
}
