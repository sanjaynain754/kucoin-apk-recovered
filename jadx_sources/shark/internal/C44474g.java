package shark.internal;

import p852kotlin.Metadata;
import shark.HprofRecordTag;

/* JADX INFO: renamed from: shark.internal.g */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 4, 1})
public final /* synthetic */ class C44474g {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[HprofRecordTag.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[HprofRecordTag.CLASS_DUMP.ordinal()] = 1;
        iArr[HprofRecordTag.INSTANCE_DUMP.ordinal()] = 2;
        iArr[HprofRecordTag.OBJECT_ARRAY_DUMP.ordinal()] = 3;
        iArr[HprofRecordTag.PRIMITIVE_ARRAY_DUMP.ordinal()] = 4;
    }
}
