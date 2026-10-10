package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.facebook.C5567d;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.iap.C5537e;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.internal.C5539a;
import com.facebook.appevents.ondeviceprocessing.C5543a;
import com.facebook.internal.C5758a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p281g3.C37801a;
import p299h3.C38101k;
import p299h3.InAppPurchase;
import p330i3.C38429a;
import p330i3.C38430b;
import p330i3.C38432d;
import p330i3.C38434f;
import p330i3.C38435g;
import p333i6.C38448g;
import p333i6.C38457p;
import p357j3.C40259h;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 82\u00020\u0001:\u00019B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010!\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b)\u0010*JA\u0010+\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b+\u0010,JI\u0010/\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m90084d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl;", "", "", "activityName", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "", "n", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "parameters", "p", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "o", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "buttonText", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Lcom/facebook/appevents/OperationalData;", "operationalData", "w", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "", "isImplicitlyLogged", "v", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;ZLcom/facebook/appevents/OperationalData;)V", "m", "()V", "t", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "u", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "Ljava/util/UUID;", "currentSessionId", "q", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;Lcom/facebook/appevents/OperationalData;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "contextName", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "b", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "c", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AppEventsLoggerImpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f7652d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public static ScheduledThreadPoolExecutor f7653e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static AppEventsLogger.FlushBehavior f7654f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Object f7655g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public static String f7656h;

    /* JADX INFO: renamed from: i */
    public static boolean f7657i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public static String f7658j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String contextName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AccessTokenAppIdPair accessTokenAppId;

    /* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
    @Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001e\u0010\u0010J!\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010\u0003J\u0011\u0010$\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b$\u0010\rJ\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b&\u0010\u0010J!\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0003J\u001f\u00106\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u00020\u000bH\u0002¢\u0006\u0004\b9\u0010\u0010R\u0014\u0010:\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010;R\u0014\u0010?\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010@\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010B\u001a\u00020A8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010E\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010;R\u0014\u0010F\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010;R\u0018\u0010G\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010;R\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0014\u0010Q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006S"}, m90084d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl$Companion;", "", "<init>", "()V", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getFlushBehavior", "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "flushBehavior", "", "setFlushBehavior", "(Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;)V", "", "getPushNotificationsRegistrationId", "()Ljava/lang/String;", "registrationId", "setPushNotificationsRegistrationId", "(Ljava/lang/String;)V", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "applicationId", "activateApp", "(Landroid/app/Application;Ljava/lang/String;)V", "Landroid/os/Bundle;", ReportDataTable.COLUMN_PARAMS, "Lcom/facebook/appevents/OperationalData;", "operationalData", "Lkotlin/Pair;", "addImplicitPurchaseParameters", "(Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)Lkotlin/Pair;", "extraMsg", "functionDEPRECATED", "Landroid/content/Context;", "context", "initializeLib", "(Landroid/content/Context;Ljava/lang/String;)V", "onContextStop", "getInstallReferrer", "referrer", "setInstallReferrer", "Landroid/webkit/WebView;", "webView", "augmentWebView", "(Landroid/webkit/WebView;Landroid/content/Context;)V", "eagerFlush", "Ljava/util/concurrent/Executor;", "getAnalyticsExecutor", "()Ljava/util/concurrent/Executor;", "getAnonymousAppDeviceGUID", "(Landroid/content/Context;)Ljava/lang/String;", "d", "Lcom/facebook/appevents/AppEvent;", "event", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "f", "(Lcom/facebook/appevents/AppEvent;Lcom/facebook/appevents/AccessTokenAppIdPair;)V", "message", "g", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "Ljava/lang/String;", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "I", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "isActivateAppEventRequested", "Z", "pushNotificationsRegistrationIdField", "staticLock", "Ljava/lang/Object;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAppEventsLoggerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsLoggerImpl.kt\ncom/facebook/appevents/AppEventsLoggerImpl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,815:1\n1#2:816\n37#3,2:817\n*S KotlinDebug\n*F\n+ 1 AppEventsLoggerImpl.kt\ncom/facebook/appevents/AppEventsLoggerImpl$Companion\n*L\n661#1:817,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.appevents.AppEventsLoggerImpl$Companion$a */
        /* JADX INFO: compiled from: AppEventsLoggerImpl.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"com/facebook/appevents/AppEventsLoggerImpl$Companion$a", "Li6/g$a;", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class C5502a implements C38448g.a {
            @Override // p333i6.C38448g.a
            /* JADX INFO: renamed from: a */
            public void mo7873a(@Nullable String s11) {
                AppEventsLoggerImpl.INSTANCE.setInstallReferrer(s11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final void m7868c(Context context, AppEventsLoggerImpl logger) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i11 = 0;
            for (int i12 = 0; i12 < 11; i12++) {
                String str = strArr[i12];
                String str2 = strArr2[i12];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i12;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                logger.m7862t("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: renamed from: e */
        public static final void m7869e() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = C5507c.m7951p().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.m9982u((String) it2.next(), true);
            }
        }

        @JvmStatic
        public final void activateApp(@NotNull Application application, @Nullable String applicationId) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (!C5501a.m7768D()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            C5504a.m7903e();
            C5524d.m8095j();
            if (applicationId == null) {
                applicationId = C5501a.m7800n();
            }
            C5501a.m7772I(application, applicationId);
            C5539a.m8278z(application, applicationId);
        }

        @JvmStatic
        public final void functionDEPRECATED(@NotNull String extraMsg) {
            Intrinsics.checkNotNullParameter(extraMsg, "extraMsg");
            Log.w(AppEventsLoggerImpl.m7848f(), "This function is deprecated. " + extraMsg);
        }

        /* JADX INFO: renamed from: g */
        public final void m7872g(String message) {
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", message);
        }

        @JvmStatic
        @NotNull
        public final String getAnonymousAppDeviceGUID(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AppEventsLoggerImpl.m7843a() == null) {
                synchronized (AppEventsLoggerImpl.m7847e()) {
                    try {
                        if (AppEventsLoggerImpl.m7843a() == null) {
                            AppEventsLoggerImpl.m7851i(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (AppEventsLoggerImpl.m7843a() == null) {
                                AppEventsLoggerImpl.m7851i("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.m7843a()).apply();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            String strM7843a = AppEventsLoggerImpl.m7843a();
            if (strM7843a != null) {
                return strM7843a;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @JvmStatic
        @Nullable
        public final String getInstallReferrer() {
            C38448g.m86709d(new C5502a());
            return C5501a.m7799m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        @JvmStatic
        public final void initializeLib(@NotNull final Context context, @Nullable String applicationId) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C5501a.m7803q()) {
                final AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, applicationId, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7844b = AppEventsLoggerImpl.m7844b();
                if (scheduledThreadPoolExecutorM7844b == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                scheduledThreadPoolExecutorM7844b.execute(new Runnable() { // from class: a3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppEventsLoggerImpl.Companion.m7868c(context, appEventsLoggerImpl);
                    }
                });
            }
        }

        @JvmStatic
        public final void setFlushBehavior(@NotNull AppEventsLogger.FlushBehavior flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            synchronized (AppEventsLoggerImpl.m7847e()) {
                AppEventsLoggerImpl.m7853k(flushBehavior);
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        @NotNull
        public final Pair<Bundle, OperationalData> addImplicitPurchaseParameters(@Nullable Bundle params, @Nullable OperationalData operationalData) {
            String str;
            String str2;
            if (!C40259h.m88615g()) {
                str = "0";
            } else {
                str = "1";
            }
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            Pair<Bundle, OperationalData> pairAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, "is_implicit_purchase_logging_enabled", str, params, operationalData);
            Bundle first = pairAddParameterAndReturn.getFirst();
            OperationalData second = pairAddParameterAndReturn.getSecond();
            if (!C5567d.m8560f()) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            Pair<Bundle, OperationalData> pairAddParameterAndReturn2 = companion.addParameterAndReturn(operationalDataEnum, "is_autolog_app_events_enabled", str2, first, second);
            return new Pair<>(pairAddParameterAndReturn2.getFirst(), pairAddParameterAndReturn2.getSecond());
        }

        @JvmStatic
        public final void augmentWebView(@NotNull WebView webView, @Nullable Context context) {
            boolean z11;
            int i11;
            Intrinsics.checkNotNullParameter(webView, "webView");
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            List listSplit$default = StringsKt.split$default((CharSequence) RELEASE, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
            int i12 = 0;
            String[] strArr = (String[]) listSplit$default.toArray(new String[0]);
            if (strArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i11 = Integer.parseInt(strArr[0]);
            } else {
                i11 = 0;
            }
            if (strArr.length > 1) {
                i12 = Integer.parseInt(strArr[1]);
            }
            if (i11 >= 4 && (i11 != 4 || i12 > 1)) {
                webView.addJavascriptInterface(new FacebookSDKJSInterface(context), "fbmq_" + C5501a.m7800n());
                return;
            }
            Logger.INSTANCE.log(LoggingBehavior.DEVELOPER_ERRORS, AppEventsLoggerImpl.m7848f(), "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
        }

        /* JADX INFO: renamed from: d */
        public final void m7870d() {
            synchronized (AppEventsLoggerImpl.m7847e()) {
                if (AppEventsLoggerImpl.m7844b() != null) {
                    return;
                }
                AppEventsLoggerImpl.m7852j(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.INSTANCE;
                Runnable runnable = new Runnable() { // from class: a3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppEventsLoggerImpl.Companion.m7869e();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7844b = AppEventsLoggerImpl.m7844b();
                if (scheduledThreadPoolExecutorM7844b != null) {
                    scheduledThreadPoolExecutorM7844b.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final void eagerFlush() {
            if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                C5507c.m7947l(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m7871f(AppEvent event, AccessTokenAppIdPair accessTokenAppId) {
            C5507c.m7942g(accessTokenAppId, event);
            if (FeatureManager.m9939g(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && C5543a.m8338d()) {
                C5543a.m8339e(accessTokenAppId.getApplicationId(), event);
            }
            if (FeatureManager.m9939g(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.f7834a.m8118i(accessTokenAppId.getApplicationId(), event);
            }
            if (FeatureManager.m9939g(FeatureManager.Feature.GPSPACAProcessing)) {
                C37801a.f85158a.m85299d(accessTokenAppId.getApplicationId(), event);
            }
            if (!event.getIsImplicit() && !AppEventsLoggerImpl.m7849g()) {
                if (Intrinsics.areEqual(event.getName(), "fb_mobile_activate_app")) {
                    AppEventsLoggerImpl.m7850h(true);
                } else {
                    Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        }

        @JvmStatic
        @NotNull
        public final Executor getAnalyticsExecutor() {
            if (AppEventsLoggerImpl.m7844b() == null) {
                m7870d();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7844b = AppEventsLoggerImpl.m7844b();
            if (scheduledThreadPoolExecutorM7844b != null) {
                return scheduledThreadPoolExecutorM7844b;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @JvmStatic
        @NotNull
        public final AppEventsLogger.FlushBehavior getFlushBehavior() {
            AppEventsLogger.FlushBehavior flushBehaviorM7845c;
            synchronized (AppEventsLoggerImpl.m7847e()) {
                flushBehaviorM7845c = AppEventsLoggerImpl.m7845c();
            }
            return flushBehaviorM7845c;
        }

        @JvmStatic
        @Nullable
        public final String getPushNotificationsRegistrationId() {
            String strM7846d;
            synchronized (AppEventsLoggerImpl.m7847e()) {
                strM7846d = AppEventsLoggerImpl.m7846d();
            }
            return strM7846d;
        }

        @JvmStatic
        public final void onContextStop() {
            C5507c.m7954s();
        }

        @JvmStatic
        public final void setInstallReferrer(@Nullable String referrer) {
            SharedPreferences sharedPreferences = C5501a.m7799m().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (referrer != null) {
                sharedPreferences.edit().putString("install_referrer", referrer).apply();
            }
        }

        @JvmStatic
        public final void setPushNotificationsRegistrationId(@Nullable String registrationId) {
            synchronized (AppEventsLoggerImpl.m7847e()) {
                try {
                    if (!C5760c.m10088u0(AppEventsLoggerImpl.m7846d(), registrationId)) {
                        AppEventsLoggerImpl.m7854l(registrationId);
                        AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(C5501a.m7799m(), (String) null, (AccessToken) null);
                        appEventsLoggerImpl.m7857n("fb_mobile_obtain_push_token");
                        if (AppEventsLoggerImpl.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                            appEventsLoggerImpl.m7856m();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public AppEventsLoggerImpl(@NotNull String activityName, @Nullable String str, @Nullable AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        C38457p.m86730i();
        this.contextName = activityName;
        accessToken = accessToken == null ? AccessToken.INSTANCE.getCurrentAccessToken() : accessToken;
        if (accessToken == null || accessToken.isExpired() || !(str == null || Intrinsics.areEqual(str, accessToken.getApplicationId()))) {
            str = str == null ? C5760c.m10046I(C5501a.m7799m()) : str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        INSTANCE.m7870d();
    }

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f7652d = canonicalName;
        f7654f = AppEventsLogger.FlushBehavior.AUTO;
        f7655g = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m7843a() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f7656h;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m7844b() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f7653e;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AppEventsLogger.FlushBehavior m7845c() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f7654f;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ String m7846d() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f7658j;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Object m7847e() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f7655g;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ String m7848f() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f7652d;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ boolean m7849g() {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return false;
        }
        try {
            return f7657i;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ void m7850h(boolean z11) {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f7657i = z11;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ void m7851i(String str) {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f7656h = str;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ void m7852j(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f7653e = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ void m7853k(AppEventsLogger.FlushBehavior flushBehavior) {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f7654f = flushBehavior;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ void m7854l(String str) {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f7658j = str;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m7855r(AppEventsLoggerImpl appEventsLoggerImpl, String str, Double d11, Bundle bundle, boolean z11, UUID uuid, OperationalData operationalData, int i11, Object obj) {
        if (C42757a.m93689d(AppEventsLoggerImpl.class)) {
            return;
        }
        if ((i11 & 32) != 0) {
            operationalData = null;
        }
        try {
            appEventsLoggerImpl.m7860q(str, d11, bundle, z11, uuid, operationalData);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX INFO: renamed from: q */
    public final void m7860q(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable UUID currentSessionId, @Nullable OperationalData operationalData) {
        Bundle bundle = parameters;
        OperationalData operationalDataComponent2 = operationalData;
        if (C42757a.m93689d(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            if (!isImplicitlyLogged && C40259h.m88615g() && (Intrinsics.areEqual(eventName, "fb_mobile_purchase") || Intrinsics.areEqual(eventName, "Subscribe") || Intrinsics.areEqual(eventName, "StartTrial"))) {
                Log.w(f7652d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                if ((FeatureManager.m9939g(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe) && Intrinsics.areEqual(eventName, "fb_mobile_purchase")) || (FeatureManager.m9939g(FeatureManager.Feature.AndroidManualImplicitSubsDedupe) && (Intrinsics.areEqual(eventName, "Subscribe") || Intrinsics.areEqual(eventName, "StartTrial")))) {
                    C38101k c38101k = C38101k.f85761a;
                    Double dM86010g = c38101k.m86010g(valueToSum, bundle);
                    Currency currencyM86005b = c38101k.m86005b(bundle);
                    if (dM86010g != null && currencyM86005b != null) {
                        Pair<Bundle, OperationalData> pairM86004a = c38101k.m86004a(C5537e.m8219f(CollectionsKt.listOf(new InAppPurchase(eventName, dM86010g.doubleValue(), currencyM86005b)), System.currentTimeMillis(), false, CollectionsKt.listOf(new Pair(bundle, operationalDataComponent2))), bundle, operationalDataComponent2);
                        Bundle bundleComponent1 = pairM86004a.component1();
                        operationalDataComponent2 = pairM86004a.component2();
                        bundle = bundleComponent1;
                    }
                }
            }
            if (C5758a.m10026d("app_events_killswitch", C5501a.m7800n(), false)) {
                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                return;
            }
            if (C38430b.m86664b(eventName)) {
                return;
            }
            Companion companion = INSTANCE;
            Pair<Bundle, OperationalData> pairAddImplicitPurchaseParameters = companion.addImplicitPurchaseParameters(bundle, operationalDataComponent2);
            Bundle bundleComponent2 = pairAddImplicitPurchaseParameters.component1();
            OperationalData operationalDataComponent3 = pairAddImplicitPurchaseParameters.component2();
            try {
                if (!ProtectedModeManager.f7948a.m8230g(bundleComponent2)) {
                    C38434f.m86685c(bundleComponent2, eventName);
                }
                C38429a.m86660d(bundleComponent2);
                C38432d.m86676h(bundleComponent2, eventName);
                C38435g.m86689g(bundleComponent2);
                ProtectedModeManager.m8226f(bundleComponent2);
                companion.m7871f(new AppEvent(this.contextName, eventName, valueToSum, bundleComponent2, isImplicitlyLogged, C5539a.m8270p(), currentSessionId, operationalDataComponent3), this.accessTokenAppId);
            } catch (FacebookException e11) {
                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
            } catch (JSONException e12) {
                Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e12.toString());
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7856m() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            C5507c.m7947l(FlushReason.EXPLICIT);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7857n(@Nullable String eventName) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m7859p(eventName, null);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7858o(@Nullable String eventName, double valueToSum, @Nullable Bundle parameters) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            try {
                m7855r(this, eventName, Double.valueOf(valueToSum), parameters, false, C5539a.m8269n(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                C42757a.m93687b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7859p(@Nullable String eventName, @Nullable Bundle parameters) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            try {
                m7855r(this, eventName, null, parameters, false, C5539a.m8269n(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                C42757a.m93687b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7861s(@Nullable String eventName, @Nullable String buttonText) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", buttonText);
            m7859p(eventName, bundle);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m7862t(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            try {
                m7855r(this, eventName, valueToSum, parameters, true, C5539a.m8269n(), null, 32, null);
            } catch (Throwable th2) {
                th = th2;
                C42757a.m93687b(th, this);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7863u(@Nullable String eventName, @Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable OperationalData operationalData) {
        Throwable th2;
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (purchaseAmount != null && currency != null) {
                if (parameters == null) {
                    try {
                        parameters = new Bundle();
                    } catch (Throwable th3) {
                        th2 = th3;
                        C42757a.m93687b(th2, this);
                        return;
                    }
                }
                Bundle bundle = parameters;
                try {
                    bundle.putString("fb_currency", currency.getCurrencyCode());
                    m7860q(eventName, Double.valueOf(purchaseAmount.doubleValue()), bundle, true, C5539a.m8269n(), operationalData);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    C42757a.m93687b(th2, this);
                    return;
                }
            }
            C5760c.m10065e0(f7652d, "purchaseAmount and currency cannot be null");
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m7864v(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable OperationalData operationalData) {
        Throwable th2;
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            if (purchaseAmount == null) {
                INSTANCE.m7872g("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.m7872g("currency cannot be null");
                return;
            }
            if (parameters == null) {
                parameters = new Bundle();
            }
            Bundle bundle = parameters;
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                try {
                    m7860q("fb_mobile_purchase", Double.valueOf(purchaseAmount.doubleValue()), bundle, isImplicitlyLogged, C5539a.m8269n(), operationalData);
                    INSTANCE.eagerFlush();
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    C42757a.m93687b(th2, this);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m7865w(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable OperationalData operationalData) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            m7864v(purchaseAmount, currency, parameters, true, operationalData);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    public AppEventsLoggerImpl(@Nullable Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        this(C5760c.m10083s(context), str, accessToken);
    }
}
