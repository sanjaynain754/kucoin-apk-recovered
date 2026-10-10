package p330i3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import com.facebook.internal.C5760c;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i3.b */
/* JADX INFO: compiled from: BlocklistEventsManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Li3/b;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "eventName", "", "b", "(Ljava/lang/String;)Z", "c", "Z", "enabled", "", "Ljava/util/Set;", "blocklist", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38430b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38430b f86232a = new C38430b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Set<String> blocklist = new HashSet();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m86663a() {
        if (C42757a.m93689d(C38430b.class)) {
            return;
        }
        try {
            f86232a.m86665c();
            Set<String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38430b.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m86664b(@NotNull String eventName) {
        if (C42757a.m93689d(C38430b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (enabled) {
                return blocklist.contains(eventName);
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C38430b.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m86665c() {
        HashSet<String> hashSetM10074l;
        if (!C42757a.m93689d(this)) {
            try {
                FetchedAppSettings fetchedAppSettingsM9982u = FetchedAppSettingsManager.m9982u(C5501a.m7800n(), false);
                if (fetchedAppSettingsM9982u != null && (hashSetM10074l = C5760c.m10074l(fetchedAppSettingsM9982u.getBlocklistEvents())) != null) {
                    blocklist = hashSetM10074l;
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }
}
