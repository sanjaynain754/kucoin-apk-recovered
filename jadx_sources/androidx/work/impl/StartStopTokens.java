package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StartStopToken.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Landroidx/work/impl/StartStopTokens;", "", "()V", "lock", "runs", "", "Landroidx/work/impl/model/WorkGenerationalId;", "Landroidx/work/impl/StartStopToken;", "contains", "", "id", "remove", "spec", "Landroidx/work/impl/model/WorkSpec;", "", "workSpecId", "", "tokenFor", "work-runtime_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class StartStopTokens {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    @Nullable
    public final StartStopToken remove(@NotNull WorkGenerationalId id2) {
        StartStopToken startStopTokenRemove;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            startStopTokenRemove = this.runs.remove(id2);
        }
        return startStopTokenRemove;
    }

    @NotNull
    public final StartStopToken tokenFor(@NotNull WorkGenerationalId id2) {
        StartStopToken startStopToken;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            try {
                Map<WorkGenerationalId, StartStopToken> map = this.runs;
                StartStopToken startStopToken2 = map.get(id2);
                if (startStopToken2 == null) {
                    startStopToken2 = new StartStopToken(id2);
                    map.put(id2, startStopToken2);
                }
                startStopToken = startStopToken2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return startStopToken;
    }

    public final boolean contains(@NotNull WorkGenerationalId id2) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id2, "id");
        synchronized (this.lock) {
            zContainsKey = this.runs.containsKey(id2);
        }
        return zContainsKey;
    }

    @NotNull
    public final List<StartStopToken> remove(@NotNull String workSpecId) {
        List<StartStopToken> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            try {
                Map<WorkGenerationalId, StartStopToken> map = this.runs;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
                    if (Intrinsics.areEqual(entry.getKey().getWorkSpecId(), workSpecId)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.runs.remove((WorkGenerationalId) it.next());
                }
                list = CollectionsKt.toList(linkedHashMap.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @NotNull
    public final StartStopToken tokenFor(@NotNull WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return tokenFor(WorkSpecKt.generationalId(spec));
    }

    @Nullable
    public final StartStopToken remove(@NotNull WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        return remove(WorkSpecKt.generationalId(spec));
    }
}
