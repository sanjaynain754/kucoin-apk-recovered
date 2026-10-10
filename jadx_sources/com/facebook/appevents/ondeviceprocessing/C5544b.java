package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p220e3.C37054a;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.ondeviceprocessing.b */
/* JADX INFO: compiled from: RemoteServiceParametersHelper.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/appevents/ondeviceprocessing/b;", "", "<init>", "()V", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "eventType", "", "applicationId", "", "Lcom/facebook/appevents/AppEvent;", "appEvents", "Landroid/os/Bundle;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;Ljava/lang/String;Ljava/util/List;)Landroid/os/Bundle;", "Lorg/json/JSONArray;", "b", "(Ljava/util/List;Ljava/lang/String;)Lorg/json/JSONArray;", "", "c", "(Ljava/lang/String;)Z", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5544b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5544b f8023a = new C5544b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Bundle m8344a(@NotNull RemoteServiceWrapper.EventType eventType, @NotNull String applicationId, @NotNull List<AppEvent> appEvents) {
        if (C42757a.m93689d(C5544b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.getEventType());
            bundle.putString("app_id", applicationId);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS != eventType) {
                return bundle;
            }
            JSONArray jSONArrayM8345b = f8023a.m8345b(appEvents, applicationId);
            if (jSONArrayM8345b.length() == 0) {
                return null;
            }
            bundle.putString("custom_events", jSONArrayM8345b.toString());
            return bundle;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C5544b.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m8345b(List<AppEvent> appEvents, String applicationId) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<AppEvent> mutableList = CollectionsKt.toMutableList((Collection) appEvents);
            C37054a.m82961d(mutableList);
            boolean zM8346c = m8346c(applicationId);
            for (AppEvent appEvent : mutableList) {
                if (appEvent.isChecksumValid()) {
                    if (!appEvent.isImplicit() || (appEvent.isImplicit() && zM8346c)) {
                        jSONArray.put(appEvent.getJsonObject());
                    }
                } else {
                    C5760c.m10065e0(TAG, "Event with invalid checksum: " + appEvent);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8346c(String applicationId) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(applicationId, false);
            if (fetchedAppSettingsM9982u == null) {
                return false;
            }
            return fetchedAppSettingsM9982u.getSupportsImplicitLogging();
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
