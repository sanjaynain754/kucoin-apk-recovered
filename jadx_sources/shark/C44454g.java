package shark;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.g */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 4, 1})
public final /* synthetic */ class C44454g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[LeakTraceObject.LeakingStatus.values().length];
        $EnumSwitchMapping$0 = iArr;
        LeakTraceObject.LeakingStatus leakingStatus = LeakTraceObject.LeakingStatus.LEAKING;
        iArr[leakingStatus.ordinal()] = 1;
        LeakTraceObject.LeakingStatus leakingStatus2 = LeakTraceObject.LeakingStatus.UNKNOWN;
        iArr[leakingStatus2.ordinal()] = 2;
        LeakTraceObject.LeakingStatus leakingStatus3 = LeakTraceObject.LeakingStatus.NOT_LEAKING;
        iArr[leakingStatus3.ordinal()] = 3;
        int[] iArr2 = new int[LeakTraceObject.LeakingStatus.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[leakingStatus.ordinal()] = 1;
        iArr2[leakingStatus2.ordinal()] = 2;
        iArr2[leakingStatus3.ordinal()] = 3;
        int[] iArr3 = new int[LeakTraceObject.LeakingStatus.values().length];
        $EnumSwitchMapping$2 = iArr3;
        iArr3[leakingStatus2.ordinal()] = 1;
        iArr3[leakingStatus3.ordinal()] = 2;
        iArr3[leakingStatus.ordinal()] = 3;
        int[] iArr4 = new int[LeakTraceObject.LeakingStatus.values().length];
        $EnumSwitchMapping$3 = iArr4;
        iArr4[leakingStatus2.ordinal()] = 1;
        iArr4[leakingStatus.ordinal()] = 2;
        iArr4[leakingStatus3.ordinal()] = 3;
    }
}
