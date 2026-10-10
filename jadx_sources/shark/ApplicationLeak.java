package shark;

import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lshark/ApplicationLeak;", "Lshark/Leak;", "leakTraces", "", "Lshark/LeakTrace;", "(Ljava/util/List;)V", "getLeakTraces", "()Ljava/util/List;", "shortDescription", "", "getShortDescription", "()Ljava/lang/String;", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "getSignature", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class ApplicationLeak extends Leak {
    private static final long serialVersionUID = 524928276700576863L;

    @NotNull
    private final List<LeakTrace> leakTraces;

    public ApplicationLeak(@NotNull List<LeakTrace> list) {
        super(null);
        this.leakTraces = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplicationLeak copy$default(ApplicationLeak applicationLeak, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = applicationLeak.getLeakTraces();
        }
        return applicationLeak.copy(list);
    }

    @NotNull
    public final ApplicationLeak copy(@NotNull List<LeakTrace> leakTraces) {
        return new ApplicationLeak(leakTraces);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof ApplicationLeak) && Intrinsics.areEqual(getLeakTraces(), ((ApplicationLeak) other).getLeakTraces());
        }
        return true;
    }

    @Override // shark.Leak
    @NotNull
    public List<LeakTrace> getLeakTraces() {
        return this.leakTraces;
    }

    @NotNull
    public final List<LeakTrace> component1() {
        return getLeakTraces();
    }

    @Override // shark.Leak
    @NotNull
    public String getShortDescription() {
        LeakTrace leakTrace = (LeakTrace) CollectionsKt.first((List) getLeakTraces());
        LeakTraceReference leakTraceReference = (LeakTraceReference) SequencesKt.firstOrNull(leakTrace.getSuspectReferenceSubpath());
        if (leakTraceReference != null) {
            String str = leakTraceReference.getOriginObject().getClassSimpleName() + C33978va.f72339h + leakTraceReference.getReferenceGenericName();
            if (str != null) {
                return str;
            }
        }
        return leakTrace.getLeakingObject().getClassName();
    }

    @Override // shark.Leak
    @NotNull
    public String getSignature() {
        return ((LeakTrace) CollectionsKt.first((List) getLeakTraces())).getSignature();
    }

    public int hashCode() {
        List<LeakTrace> leakTraces = getLeakTraces();
        if (leakTraces != null) {
            return leakTraces.hashCode();
        }
        return 0;
    }

    @Override // shark.Leak
    @NotNull
    public String toString() {
        return super.toString();
    }
}
