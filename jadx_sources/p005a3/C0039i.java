package p005a3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventDiskStore;
import com.facebook.appevents.C5506b;
import com.facebook.appevents.PersistedEvents;
import com.facebook.appevents.SessionEventsState;
import org.jetbrains.annotations.NotNull;
import p357j3.C40258g;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a3.i */
/* JADX INFO: compiled from: AppEventStore.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m90084d2 = {"La3/i;", "", "<init>", "()V", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/SessionEventsState;", "appEvents", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/appevents/AccessTokenAppIdPair;Lcom/facebook/appevents/SessionEventsState;)V", "Lcom/facebook/appevents/b;", "eventsToPersist", "b", "(Lcom/facebook/appevents/b;)V", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C0039i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0039i f70a = new C0039i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C0039i.class.getName();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final synchronized void m79a(@NotNull AccessTokenAppIdPair accessTokenAppIdPair, @NotNull SessionEventsState appEvents) {
        if (C42757a.m93689d(C0039i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            C40258g.m88607b();
            PersistedEvents persistedEventsM7838a = AppEventDiskStore.m7838a();
            persistedEventsM7838a.addEvents(accessTokenAppIdPair, appEvents.m7897d());
            AppEventDiskStore.m7839b(persistedEventsM7838a);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C0039i.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final synchronized void m80b(@NotNull C5506b eventsToPersist) {
        if (C42757a.m93689d(C0039i.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
            C40258g.m88607b();
            PersistedEvents persistedEventsM7838a = AppEventDiskStore.m7838a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.m7935f()) {
                SessionEventsState sessionEventsStateM7932c = eventsToPersist.m7932c(accessTokenAppIdPair);
                if (sessionEventsStateM7932c == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                persistedEventsM7838a.addEvents(accessTokenAppIdPair, sessionEventsStateM7932c.m7897d());
            }
            AppEventDiskStore.m7839b(persistedEventsM7838a);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C0039i.class);
        }
    }
}
