package com.facebook.appevents.suggestedevents;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.facebook.C5501a;
import com.facebook.GraphRequest;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.p060ml.ModelManager;
import com.facebook.appevents.suggestedevents.ViewOnClickListener;
import com.facebook.internal.C5760c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p189d3.C36605c;
import p461n3.C42718a;
import p461n3.C42719b;
import p461n3.C42720c;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: ViewOnClickListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006 "}, m90084d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "hostView", "rootView", "", "activityName", "<init>", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "onClick", "(Landroid/view/View;)V", "e", "()V", "pathID", "buttonText", "Lorg/json/JSONObject;", "viewData", "c", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "b", "Landroid/view/View$OnClickListener;", "baseListener", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "rootViewWeakReference", "d", "hostViewWeakReference", "Ljava/lang/String;", "f", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ViewOnClickListener implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Set<Integer> f8031g = new HashSet();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final View.OnClickListener baseListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<View> rootViewWeakReference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<View> hostViewWeakReference;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String activityName;

    /* JADX INFO: compiled from: ViewOnClickListener.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener$Companion;", "", "<init>", "()V", "Landroid/view/View;", "hostView", "rootView", "", "activityName", "", "attachListener$facebook_core_release", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "attachListener", "pathID", "buttonText", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", "predictedEvent", "", "dense", "b", "(Ljava/lang/String;Ljava/lang/String;[F)V", "eventToPost", "e", "API_ENDPOINT", "Ljava/lang/String;", "OTHER_EVENT", "", "", "viewsAttachedListener", "Ljava/util/Set;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: e */
        public final void m8364e(String eventToPost, String buttonText, float[] dense) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", eventToPost);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f11 : dense) {
                    sb2.append(f11);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", buttonText);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.Companion companion = GraphRequest.INSTANCE;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C5501a.m7800n()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                GraphRequest graphRequestNewPostRequest = companion.newPostRequest(null, str, null, null);
                graphRequestNewPostRequest.m7651H(bundle);
                graphRequestNewPostRequest.m7656l();
            } catch (JSONException unused) {
            }
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: d */
        public static final void m8361d(String queriedEvent, String buttonText) {
            Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            ViewOnClickListener.INSTANCE.m8362b(queriedEvent, buttonText, new float[0]);
        }

        @JvmStatic
        public final void attachListener$facebook_core_release(@NotNull View hostView, @NotNull View rootView, @NotNull String activityName) {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (ViewOnClickListener.m8356b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            C36605c.m81909r(hostView, new ViewOnClickListener(hostView, rootView, activityName, null));
            ViewOnClickListener.m8356b().add(Integer.valueOf(iHashCode));
        }

        /* JADX INFO: renamed from: b */
        public final void m8362b(String predictedEvent, String buttonText, float[] dense) {
            if (C5545a.m8369f(predictedEvent)) {
                new InternalAppEventsLogger(C5501a.m7799m()).m7883e(predictedEvent, buttonText);
            } else if (C5545a.m8368e(predictedEvent)) {
                m8364e(predictedEvent, buttonText, dense);
            }
        }

        /* JADX INFO: renamed from: c */
        public final boolean m8363c(String pathID, final String buttonText) {
            final String strM93614d = C42719b.m93614d(pathID);
            if (strM93614d == null) {
                return false;
            }
            if (!Intrinsics.areEqual(strM93614d, "other")) {
                C5760c.m10079p0(new Runnable() { // from class: n3.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListener.Companion.m8361d(strM93614d, buttonText);
                    }
                });
                return true;
            }
            return true;
        }
    }

    public /* synthetic */ ViewOnClickListener(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public ViewOnClickListener(View view, View view2, String str) {
        this.baseListener = C36605c.m81903g(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        this.activityName = StringsKt.replace$default(lowerCase, "activity", "", false, 4, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Set m8356b() {
        if (C42757a.m93689d(ViewOnClickListener.class)) {
            return null;
        }
        try {
            return f8031g;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewOnClickListener.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8357d(JSONObject viewData, String buttonText, ViewOnClickListener this$0, String pathID) {
        String[] strArrM8300q;
        if (C42757a.m93689d(ViewOnClickListener.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(viewData, "$viewData");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pathID, "$pathID");
            try {
                String lowerCase = C5760c.m10085t(C5501a.m7799m()).toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] fArrM93598a = C42718a.m93598a(viewData, lowerCase);
                String strM93599c = C42718a.m93599c(buttonText, this$0.activityName, lowerCase);
                if (fArrM93598a != null && (strArrM8300q = ModelManager.m8300q(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{fArrM93598a}, new String[]{strM93599c})) != null) {
                    String str = strArrM8300q[0];
                    C42719b.m93612a(pathID, str);
                    if (Intrinsics.areEqual(str, "other")) {
                        return;
                    }
                    INSTANCE.m8362b(str, buttonText, fArrM93598a);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, ViewOnClickListener.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8358c(final String pathID, final String buttonText, final JSONObject viewData) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            C5760c.m10079p0(new Runnable() { // from class: n3.f
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnClickListener.m8357d(viewData, buttonText, this, pathID);
                }
            });
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8359e() {
        if (!C42757a.m93689d(this)) {
            try {
                View view = this.rootViewWeakReference.get();
                View view2 = this.hostViewWeakReference.get();
                if (view != null && view2 != null) {
                    try {
                        String strM93618d = C42720c.m93618d(view2);
                        String strM93613b = C42719b.m93613b(view2, strM93618d);
                        if (strM93613b != null && !INSTANCE.m8363c(strM93613b, strM93618d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, C42720c.m93617b(view, view2));
                            jSONObject.put("screenname", this.activityName);
                            m8358c(strM93613b, strM93618d, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (!C42757a.m93689d(this)) {
            try {
                if (!C42757a.m93689d(this)) {
                    try {
                        Intrinsics.checkNotNullParameter(view, "view");
                        View.OnClickListener onClickListener = this.baseListener;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        m8359e();
                    } catch (Throwable th2) {
                        C42757a.m93687b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C42757a.m93687b(th3, this);
            }
        }
    }
}
