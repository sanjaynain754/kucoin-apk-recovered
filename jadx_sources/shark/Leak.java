package shark;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\tH\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, m90084d2 = {"Lshark/Leak;", "Ljava/io/Serializable;", "()V", "leakTraces", "", "Lshark/LeakTrace;", "getLeakTraces", "()Ljava/util/List;", "shortDescription", "", "getShortDescription", "()Ljava/lang/String;", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "getSignature", "totalRetainedHeapByteSize", "", "getTotalRetainedHeapByteSize", "()Ljava/lang/Integer;", "totalRetainedObjectCount", "getTotalRetainedObjectCount", "toString", "Companion", "Lshark/LibraryLeak;", "Lshark/ApplicationLeak;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class Leak implements Serializable {
    private static final long serialVersionUID = -2287572510360910916L;

    private Leak() {
    }

    @NotNull
    public abstract List<LeakTrace> getLeakTraces();

    @NotNull
    public abstract String getShortDescription();

    @NotNull
    public abstract String getSignature();

    public /* synthetic */ Leak(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (getTotalRetainedHeapByteSize() != null) {
            str = getTotalRetainedHeapByteSize() + " bytes retained by leaking objects\n";
        } else {
            str = "";
        }
        sb2.append(str);
        if (getLeakTraces().size() > 1) {
            str2 = "Displaying only 1 leak trace out of " + getLeakTraces().size() + " with the same signature\n";
        }
        sb2.append(str2);
        sb2.append("Signature: ");
        sb2.append(getSignature());
        sb2.append('\n');
        sb2.append((LeakTrace) CollectionsKt.first((List) getLeakTraces()));
        return sb2.toString();
    }

    @Nullable
    public final Integer getTotalRetainedHeapByteSize() {
        if (((LeakTrace) CollectionsKt.first((List) getLeakTraces())).getRetainedHeapByteSize() == null) {
            return null;
        }
        Iterator<T> it = getLeakTraces().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer retainedHeapByteSize = ((LeakTrace) it.next()).getRetainedHeapByteSize();
            if (retainedHeapByteSize == null) {
                Intrinsics.throwNpe();
            }
            iIntValue += retainedHeapByteSize.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Nullable
    public final Integer getTotalRetainedObjectCount() {
        if (((LeakTrace) CollectionsKt.first((List) getLeakTraces())).getRetainedObjectCount() == null) {
            return null;
        }
        Iterator<T> it = getLeakTraces().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer retainedObjectCount = ((LeakTrace) it.next()).getRetainedObjectCount();
            if (retainedObjectCount == null) {
                Intrinsics.throwNpe();
            }
            iIntValue += retainedObjectCount.intValue();
        }
        return Integer.valueOf(iIntValue);
    }
}
