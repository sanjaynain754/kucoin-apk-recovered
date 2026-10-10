package com.facebook.appevents.codeless;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.internal.C5760c;
import com.facebook.internal.Logger;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p189d3.C36604b;
import p189d3.C36605c;
import p333i6.C38449h;
import p357j3.C40258g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: ViewIndexer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m90084d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "i", "()V", "m", "Lcom/facebook/GraphRequest;", "request", "", "currentDigest", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/facebook/GraphRequest;Ljava/lang/String;)V", "tree", "k", "(Ljava/lang/String;)V", "Landroid/os/Handler;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityReference", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "indexingTimer", "d", "Ljava/lang/String;", "previousDigest", "e", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ViewIndexer {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final String f7762f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static ViewIndexer f7763g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityReference;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Timer indexingTimer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String previousDigest;

    /* JADX INFO: compiled from: ViewIndexer.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$Companion;", "", "()V", "APP_VERSION_PARAM", "", "PLATFORM_PARAM", CredentialProviderBaseController.REQUEST_TAG, AppConstants.AB_TEST_SUCCESS, "TAG", "TREE_PARAM", "instance", "Lcom/facebook/appevents/codeless/ViewIndexer;", "buildAppIndexingRequest", "Lcom/facebook/GraphRequest;", "appIndex", "accessToken", "Lcom/facebook/AccessToken;", RemoteConfigConstants.RequestFieldKey.APP_ID, "requestType", "sendToServerUnityInstance", "", "tree", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m8043b(GraphResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, ViewIndexer.m8033e(), "App index sent to FB!");
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Nullable
        public final GraphRequest buildAppIndexingRequest(@Nullable String appIndex, @Nullable AccessToken accessToken, @Nullable String appId, @NotNull String requestType) {
            Intrinsics.checkNotNullParameter(requestType, "requestType");
            if (appIndex == null) {
                return null;
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{appId}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            GraphRequest graphRequestNewPostRequest = companion.newPostRequest(accessToken, str, null, null);
            Bundle parameters = graphRequestNewPostRequest.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("tree", appIndex);
            parameters.putString("app_version", C40258g.m88609d());
            parameters.putString("platform", "android");
            parameters.putString("request_type", requestType);
            if (Intrinsics.areEqual(requestType, "app_indexing")) {
                parameters.putString("device_session_id", C5522b.m8058g());
            }
            graphRequestNewPostRequest.m7651H(parameters);
            graphRequestNewPostRequest.m7647D(new GraphRequest.InterfaceC5490b() { // from class: c3.g
                @Override // com.facebook.GraphRequest.InterfaceC5490b
                /* JADX INFO: renamed from: a */
                public final void mo78a(GraphResponse graphResponse) {
                    ViewIndexer.Companion.m8043b(graphResponse);
                }
            });
            return graphRequestNewPostRequest;
        }

        @JvmStatic
        public final void sendToServerUnityInstance(@NotNull String tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            ViewIndexer viewIndexerM8032d = ViewIndexer.m8032d();
            if (viewIndexerM8032d != null) {
                ViewIndexer.m8035g(viewIndexerM8032d, tree);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.ViewIndexer$a */
    /* JADX INFO: compiled from: ViewIndexer.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$a;", "Ljava/util/concurrent/Callable;", "", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class CallableC5518a implements Callable<String> {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        @Override // java.util.concurrent.Callable
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.rootView.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }

        public CallableC5518a(@NotNull View rootView) {
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            this.rootView = new WeakReference<>(rootView);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.ViewIndexer$b */
    /* JADX INFO: compiled from: ViewIndexer.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"com/facebook/appevents/codeless/ViewIndexer$b", "Ljava/util/TimerTask;", "", "run", "()V", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5519b extends TimerTask {
        public C5519b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) ViewIndexer.m8031c(ViewIndexer.this).get();
                View viewM88610e = C40258g.m88610e(activity);
                if (activity != null && viewM88610e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (C5522b.m8059h()) {
                        if (C38449h.m86714b()) {
                            C36604b.m81895a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new CallableC5518a(viewM88610e));
                        ViewIndexer.m8034f(ViewIndexer.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e11) {
                            Log.e(ViewIndexer.m8033e(), "Failed to take screenshot.", e11);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(C36605c.m81902d(viewM88610e));
                            jSONObject.put(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(ViewIndexer.m8033e(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                        ViewIndexer.m8035g(ViewIndexer.this, string);
                    }
                }
            } catch (Exception e12) {
                Log.e(ViewIndexer.m8033e(), "UI Component tree indexing failure!", e12);
            }
        }
    }

    static {
        String canonicalName = ViewIndexer.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f7762f = canonicalName;
    }

    public ViewIndexer(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activityReference = new WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        f7763g = this;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ WeakReference m8031c(ViewIndexer viewIndexer) {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.activityReference;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ViewIndexer m8032d() {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return null;
        }
        try {
            return f7763g;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ String m8033e() {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return null;
        }
        try {
            return f7762f;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ Handler m8034f(ViewIndexer viewIndexer) {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return null;
        }
        try {
            return viewIndexer.uiThreadHandler;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m8035g(ViewIndexer viewIndexer, String str) {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return;
        }
        try {
            viewIndexer.m8040k(str);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8036j(ViewIndexer this$0, TimerTask indexingTask) {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.previousDigest = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.indexingTimer = timer2;
            } catch (Exception e11) {
                Log.e(f7762f, "Error scheduling indexing job", e11);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8037l(String tree, ViewIndexer this$0) {
        if (C42757a.m93689d(ViewIndexer.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(tree, "$tree");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            String strM10068g0 = C5760c.m10068g0(tree);
            AccessToken currentAccessToken = AccessToken.INSTANCE.getCurrentAccessToken();
            if (strM10068g0 == null || !Intrinsics.areEqual(strM10068g0, this$0.previousDigest)) {
                this$0.m8038h(INSTANCE.buildAppIndexingRequest(tree, currentAccessToken, C5501a.m7800n(), "app_indexing"), strM10068g0);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewIndexer.class);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8038h(@Nullable GraphRequest request, @Nullable String currentDigest) {
        if (C42757a.m93689d(this) || request == null) {
            return;
        }
        try {
            GraphResponse graphResponseM7656l = request.m7656l();
            try {
                JSONObject graphObject = graphResponseM7656l.getGraphObject();
                if (graphObject == null) {
                    Log.e(f7762f, "Error sending UI component tree to Facebook: " + graphResponseM7656l.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String());
                    return;
                }
                if (Intrinsics.areEqual(CredentialEntry.TRUE_STRING, graphObject.optString("success"))) {
                    Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, f7762f, "Successfully send UI component tree to server");
                    this.previousDigest = currentDigest;
                }
                if (graphObject.has("is_app_indexing_enabled")) {
                    C5522b.m8064n(graphObject.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e11) {
                Log.e(f7762f, "Error decoding server response.", e11);
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8039i() {
        if (!C42757a.m93689d(this)) {
            try {
                final C5519b c5519b = new C5519b();
                try {
                    C5501a.m7806t().execute(new Runnable() { // from class: c3.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewIndexer.m8036j(this.f4844b, c5519b);
                        }
                    });
                } catch (RejectedExecutionException e11) {
                    Log.e(f7762f, "Error scheduling indexing job", e11);
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8040k(final String tree) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            C5501a.m7806t().execute(new Runnable() { // from class: c3.e
                @Override // java.lang.Runnable
                public final void run() {
                    ViewIndexer.m8037l(tree, this);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8041m() {
        if (!C42757a.m93689d(this)) {
            try {
                if (this.activityReference.get() != null) {
                    try {
                        Timer timer = this.indexingTimer;
                        if (timer != null) {
                            timer.cancel();
                        }
                        this.indexingTimer = null;
                    } catch (Exception e11) {
                        Log.e(f7762f, "Error unscheduling indexing job", e11);
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
