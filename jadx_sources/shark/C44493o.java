package shark;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: shark.o */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 4, 1})
public final /* synthetic */ class C44493o {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[LeakTraceReference.ReferenceType.values().length];
        $EnumSwitchMapping$0 = iArr;
        LeakTraceReference.ReferenceType referenceType = LeakTraceReference.ReferenceType.ARRAY_ENTRY;
        iArr[referenceType.ordinal()] = 1;
        LeakTraceReference.ReferenceType referenceType2 = LeakTraceReference.ReferenceType.STATIC_FIELD;
        iArr[referenceType2.ordinal()] = 2;
        LeakTraceReference.ReferenceType referenceType3 = LeakTraceReference.ReferenceType.INSTANCE_FIELD;
        iArr[referenceType3.ordinal()] = 3;
        LeakTraceReference.ReferenceType referenceType4 = LeakTraceReference.ReferenceType.LOCAL;
        iArr[referenceType4.ordinal()] = 4;
        int[] iArr2 = new int[LeakTraceReference.ReferenceType.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[referenceType.ordinal()] = 1;
        iArr2[referenceType2.ordinal()] = 2;
        iArr2[referenceType3.ordinal()] = 3;
        iArr2[referenceType4.ordinal()] = 4;
    }
}
