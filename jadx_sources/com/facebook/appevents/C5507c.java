package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C5507c;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.cloudbridge.C5514b;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import p005a3.C0029b0;
import p005a3.C0039i;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.facebook.appevents.c */
/* JADX INFO: compiled from: AppEventQueue.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010)R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00108\u001a\n +*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>¨\u0006@"}, m90084d2 = {"Lcom/facebook/appevents/c;", "", "<init>", "()V", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Lcom/facebook/appevents/FlushReason;", "reason", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/facebook/appevents/FlushReason;)V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Lcom/facebook/appevents/AppEvent;", "appEvent", "g", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", "p", "()Ljava/util/Set;", "n", "Lcom/facebook/appevents/b;", "appEventCollection", "La3/b0;", "u", "(Lcom/facebook/appevents/FlushReason;Lcom/facebook/appevents/b;)La3/b0;", "flushResults", "", "Lcom/facebook/GraphRequest;", "k", "(Lcom/facebook/appevents/b;La3/b0;)Ljava/util/List;", "Lcom/facebook/appevents/SessionEventsState;", "appEvents", "", "limitEventUsage", "flushState", "i", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/SessionEventsState;ZLa3/b0;)Lcom/facebook/GraphRequest;", "request", "Lcom/facebook/GraphResponse;", "response", "q", "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/GraphRequest;Lcom/facebook/GraphResponse;Lcom/facebook/appevents/SessionEventsState;La3/b0;)V", "", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "", "c", "I", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "d", "Lcom/facebook/appevents/b;", "Ljava/util/concurrent/ScheduledExecutorService;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "f", "Ljava/util/concurrent/ScheduledFuture;", "scheduledFuture", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "flushRunnable", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5507c {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static ScheduledFuture<?> scheduledFuture;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5507c f7704a = new C5507c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C5507c.class.getName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static volatile C5506b appEventCollection = new C5506b();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Runnable flushRunnable = new Runnable() { // from class: a3.e
        @Override // java.lang.Runnable
        public final void run() {
            C5507c.m7950o();
        }
    };

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7942g(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final AppEvent appEvent) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            singleThreadExecutor.execute(new Runnable() { // from class: a3.f
                @Override // java.lang.Runnable
                public final void run() {
                    C5507c.m7943h(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m7943h(AccessTokenAppIdPair accessTokenAppId, AppEvent appEvent) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
            appEventCollection.m7930a(accessTokenAppId, appEvent);
            if (AppEventsLogger.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && appEventCollection.m7933d() > NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER) {
                m7949n(FlushReason.EVENT_THRESHOLD);
            } else if (scheduledFuture == null) {
                scheduledFuture = singleThreadExecutor.schedule(flushRunnable, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final GraphRequest m7944i(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull final SessionEventsState appEvents, boolean limitEventUsage, @NotNull final C0029b0 flushState) {
        if (C42757a.m93689d(C5507c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String applicationId = accessTokenAppId.getApplicationId();
            FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(applicationId, false);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            final GraphRequest graphRequestNewPostRequest = companion.newPostRequest(null, str, null, null);
            graphRequestNewPostRequest.m7648E(true);
            Bundle parameters = graphRequestNewPostRequest.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString(AccessToken.ACCESS_TOKEN_KEY, accessTokenAppId.getAccessTokenString());
            String pushNotificationsRegistrationId = InternalAppEventsLogger.INSTANCE.getPushNotificationsRegistrationId();
            if (pushNotificationsRegistrationId != null) {
                parameters.putString("device_token", pushNotificationsRegistrationId);
            }
            String installReferrer = AppEventsLoggerImpl.INSTANCE.getInstallReferrer();
            if (installReferrer != null) {
                parameters.putString("install_referrer", installReferrer);
            }
            graphRequestNewPostRequest.m7651H(parameters);
            int iM7898e = appEvents.m7898e(graphRequestNewPostRequest, C5501a.m7799m(), fetchedAppSettingsM9982u != null ? fetchedAppSettingsM9982u.getSupportsImplicitLogging() : false, limitEventUsage);
            if (iM7898e == 0) {
                return null;
            }
            flushState.m76c(flushState.getNumEvents() + iM7898e);
            graphRequestNewPostRequest.m7647D(new GraphRequest.InterfaceC5490b() { // from class: a3.g
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    C5507c.m7945j(accessTokenAppId, graphRequestNewPostRequest, appEvents, flushState, graphResponse);
                }
            });
            return graphRequestNewPostRequest;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m7945j(AccessTokenAppIdPair accessTokenAppId, GraphRequest postRequest, SessionEventsState appEvents, C0029b0 flushState, GraphResponse response) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Intrinsics.checkNotNullParameter(flushState, "$flushState");
            Intrinsics.checkNotNullParameter(response, "response");
            m7952q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final List<GraphRequest> m7946k(@NotNull C5506b appEventCollection2, @NotNull C0029b0 flushResults) {
        if (C42757a.m93689d(C5507c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection2, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean zM7810x = C5501a.m7810x(C5501a.m7799m());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection2.m7935f()) {
                SessionEventsState sessionEventsStateM7932c = appEventCollection2.m7932c(accessTokenAppIdPair);
                if (sessionEventsStateM7932c == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest graphRequestM7944i = m7944i(accessTokenAppIdPair, sessionEventsStateM7932c, zM7810x, flushResults);
                if (graphRequestM7944i != null) {
                    arrayList.add(graphRequestM7944i);
                    if (C5514b.f7739a.m8007f()) {
                        AppEventsConversionsAPITransformerWebRequests.m7980l(graphRequestM7944i);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m7947l(@NotNull final FlushReason reason) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            singleThreadExecutor.execute(new Runnable() { // from class: a3.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5507c.m7948m(reason);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m7948m(FlushReason reason) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "$reason");
            m7949n(reason);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m7949n(@NotNull FlushReason reason) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            appEventCollection.m7931b(AppEventDiskStore.m7838a());
            try {
                C0029b0 c0029b0M7956u = m7956u(reason, appEventCollection);
                if (c0029b0M7956u != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", c0029b0M7956u.getNumEvents());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", c0029b0M7956u.getCom.sensorsdata.analytics.android.sdk.data.adapter.DbParams.KEY_CHANNEL_RESULT java.lang.String());
                    LocalBroadcastManager.getInstance(C5501a.m7799m()).sendBroadcast(intent);
                }
            } catch (Exception e11) {
                Log.w(TAG, "Caught unexpected exception while flushing app events: ", e11);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m7950o() {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            scheduledFuture = null;
            if (AppEventsLogger.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                m7949n(FlushReason.TIMER);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final Set<AccessTokenAppIdPair> m7951p() {
        if (C42757a.m93689d(C5507c.class)) {
            return null;
        }
        try {
            return appEventCollection.m7935f();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m7952q(@NotNull final AccessTokenAppIdPair accessTokenAppId, @NotNull GraphRequest request, @NotNull GraphResponse response, @NotNull final SessionEventsState appEvents, @NotNull C0029b0 flushState) {
        String string;
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError facebookRequestError = response.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String();
            String str = "Success";
            FlushResult flushResult = FlushResult.SUCCESS;
            if (facebookRequestError != null) {
                if (facebookRequestError.getErrorCode() == -1) {
                    str = "Failed: No Connectivity";
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), facebookRequestError.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
            }
            if (C5501a.m7770F(LoggingBehavior.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.getTag()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                Logger.Companion companion = Logger.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, TAG2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.getGraphObject()), str, string);
            }
            appEvents.m7895b(facebookRequestError != null);
            FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult2) {
                C5501a.m7806t().execute(new Runnable() { // from class: a3.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5507c.m7953r(accessTokenAppId, appEvents);
                    }
                });
            }
            if (flushResult == FlushResult.SUCCESS || flushState.getCom.sensorsdata.analytics.android.sdk.data.adapter.DbParams.KEY_CHANNEL_RESULT java.lang.String() == flushResult2) {
                return;
            }
            flushState.m77d(flushResult);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m7953r(AccessTokenAppIdPair accessTokenAppId, SessionEventsState appEvents) {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            C0039i.m79a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m7954s() {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            singleThreadExecutor.execute(new Runnable() { // from class: a3.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5507c.m7955t();
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m7955t() {
        if (C42757a.m93689d(C5507c.class)) {
            return;
        }
        try {
            C0039i.m80b(appEventCollection);
            appEventCollection = new C5506b();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @Nullable
    /* JADX INFO: renamed from: u */
    public static final C0029b0 m7956u(@NotNull FlushReason reason, @NotNull C5506b appEventCollection2) {
        if (C42757a.m93689d(C5507c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection2, "appEventCollection");
            C0029b0 c0029b0 = new C0029b0();
            List<GraphRequest> listM7946k = m7946k(appEventCollection2, c0029b0);
            if (listM7946k.isEmpty()) {
                return null;
            }
            Logger.Companion companion = Logger.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.log(loggingBehavior, TAG2, "Flushing %d events due to %s.", Integer.valueOf(c0029b0.getNumEvents()), reason.toString());
            Iterator<GraphRequest> it = listM7946k.iterator();
            while (it.hasNext()) {
                it.next().m7656l();
            }
            return c0029b0;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5507c.class);
            return null;
        }
    }
}
