package p671uq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.monitor.duration.DurationRule;
import com.kubi.monitor.duration.DurationSession;
import com.kubi.monitor.duration.IDurationRuleSetting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: uq.a */
/* JADX INFO: compiled from: DurationSessionManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\u0013j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Luq/a;", "", "<init>", "()V", "Lcom/kubi/monitor/duration/IDurationRuleSetting;", "setting", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/monitor/duration/IDurationRuleSetting;)V", "", "eventName", "pointName", "traceId", "", "extraMap", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lcom/kubi/monitor/duration/DurationRule;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "ruleMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/kubi/monitor/duration/DurationSession;", "Ljava/util/concurrent/ConcurrentHashMap;", "sessionMap", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C45290a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45290a f101823a = new C45290a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, DurationRule> ruleMap = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, DurationSession> sessionMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m100100a(@NotNull IDurationRuleSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        for (DurationRule durationRule : setting.getRules()) {
            ruleMap.put(durationRule.getEventName(), durationRule);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m100101b(@NotNull String eventName, @NotNull String pointName, @NotNull String traceId, @Nullable Map<String, ? extends Object> extraMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(pointName, "pointName");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        String strStringPlus = Intrinsics.stringPlus(eventName, traceId);
        DurationRule durationRule = ruleMap.get(eventName);
        C44128b.m97259c("Monitor:DurationSessionManager", "point:eventName:" + eventName + ", pointName:" + pointName + ", extraMap:" + extraMap + ", rule:" + durationRule + ", traceId:" + traceId);
        if (durationRule == null) {
            C44128b.m97270n("Monitor:DurationSessionManager", "rule is null: " + eventName + ' ');
            return;
        }
        if (Intrinsics.areEqual(pointName, durationRule.getStartPointName())) {
            DurationSession durationSession = new DurationSession(durationRule);
            if (extraMap != null && !extraMap.isEmpty()) {
                durationSession.m42434b(extraMap);
            }
            sessionMap.put(strStringPlus, durationSession);
            return;
        }
        ConcurrentHashMap<String, DurationSession> concurrentHashMap = sessionMap;
        DurationSession durationSession2 = concurrentHashMap.get(strStringPlus);
        if (durationSession2 == null) {
            C44128b.m97270n("Monitor:DurationSessionManager", Intrinsics.stringPlus("session is null: ", strStringPlus));
            return;
        }
        if (extraMap != null && !extraMap.isEmpty()) {
            durationSession2.m42434b(extraMap);
        }
        if (durationRule.m42420d().contains(pointName)) {
            durationSession2.m42435c(pointName);
        }
        if (durationRule.m42417a().contains(pointName) && durationSession2.m42433a(pointName)) {
            concurrentHashMap.remove(strStringPlus);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100102c(@NotNull String eventName, @NotNull String traceId) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        String strStringPlus = Intrinsics.stringPlus(eventName, traceId);
        C44128b.m97259c("Monitor:DurationSessionManager", Intrinsics.stringPlus("cancel point", strStringPlus));
        sessionMap.remove(strStringPlus);
    }
}
