package shark;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.n */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 4, 1})
public final /* synthetic */ class C44492n {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LeakTraceObject.LeakingStatus.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[LeakTraceObject.LeakingStatus.UNKNOWN.ordinal()] = 1;
        iArr[LeakTraceObject.LeakingStatus.NOT_LEAKING.ordinal()] = 2;
        iArr[LeakTraceObject.LeakingStatus.LEAKING.ordinal()] = 3;
    }
}
