package com.facebook.appevents;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.AttributionIdentifiers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.appevents.b */
/* JADX INFO: compiled from: AppEventCollection.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m90084d2 = {"Lcom/facebook/appevents/b;", "", "<init>", "()V", "Lcom/facebook/appevents/PersistedEvents;", "persistedEvents", "", "b", "(Lcom/facebook/appevents/PersistedEvents;)V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/AppEvent;", "appEvent", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/AppEvent;)V", "", "f", "()Ljava/util/Set;", "Lcom/facebook/appevents/SessionEventsState;", "c", "(Lcom/facebook/appevents/AccessTokenAppIdPair;)Lcom/facebook/appevents/SessionEventsState;", "accessTokenAppId", "e", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "stateMap", "", "d", "()I", "eventCount", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C5506b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<AccessTokenAppIdPair, SessionEventsState> stateMap = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final synchronized void m7930a(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull AppEvent appEvent) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        SessionEventsState sessionEventsStateM7934e = m7934e(accessTokenAppIdPair);
        if (sessionEventsStateM7934e != null) {
            sessionEventsStateM7934e.m7894a(appEvent);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7931b(@Nullable PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : persistedEvents.entrySet()) {
            SessionEventsState sessionEventsStateM7934e = m7934e(entry.getKey());
            if (sessionEventsStateM7934e != null) {
                Iterator<AppEvent> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    sessionEventsStateM7934e.m7894a(it.next());
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized SessionEventsState m7932c(@NotNull AccessTokenAppIdPair accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.stateMap.get(accessTokenAppIdPair);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m7933d() {
        int iM7896c;
        Iterator<SessionEventsState> it = this.stateMap.values().iterator();
        iM7896c = 0;
        while (it.hasNext()) {
            iM7896c += it.next().m7896c();
        }
        return iM7896c;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized SessionEventsState m7934e(AccessTokenAppIdPair accessTokenAppId) {
        Context contextM7799m;
        AttributionIdentifiers attributionIdentifiers;
        SessionEventsState sessionEventsState = this.stateMap.get(accessTokenAppId);
        if (sessionEventsState == null && (attributionIdentifiers = AttributionIdentifiers.INSTANCE.getAttributionIdentifiers((contextM7799m = C5501a.m7799m()))) != null) {
            sessionEventsState = new SessionEventsState(attributionIdentifiers, AppEventsLogger.INSTANCE.getAnonymousAppDeviceGUID(contextM7799m));
        }
        if (sessionEventsState == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppId, sessionEventsState);
        return sessionEventsState;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final synchronized Set<AccessTokenAppIdPair> m7935f() {
        Set<AccessTokenAppIdPair> setKeySet;
        setKeySet = this.stateMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
