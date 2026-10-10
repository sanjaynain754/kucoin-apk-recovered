package shark.internal;

import p852kotlin.Metadata;
import shark.HprofRecordTag;

/* JADX INFO: renamed from: shark.internal.f */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90085k = 3, m90086mv = {1, 4, 1})
public final /* synthetic */ class C44473f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[HprofRecordTag.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[HprofRecordTag.STRING_IN_UTF8.ordinal()] = 1;
        iArr[HprofRecordTag.LOAD_CLASS.ordinal()] = 2;
        iArr[HprofRecordTag.ROOT_UNKNOWN.ordinal()] = 3;
        iArr[HprofRecordTag.ROOT_JNI_GLOBAL.ordinal()] = 4;
        iArr[HprofRecordTag.ROOT_JNI_LOCAL.ordinal()] = 5;
        iArr[HprofRecordTag.ROOT_JAVA_FRAME.ordinal()] = 6;
        iArr[HprofRecordTag.ROOT_NATIVE_STACK.ordinal()] = 7;
        iArr[HprofRecordTag.ROOT_STICKY_CLASS.ordinal()] = 8;
        iArr[HprofRecordTag.ROOT_THREAD_BLOCK.ordinal()] = 9;
        iArr[HprofRecordTag.ROOT_MONITOR_USED.ordinal()] = 10;
        iArr[HprofRecordTag.ROOT_THREAD_OBJECT.ordinal()] = 11;
        iArr[HprofRecordTag.ROOT_INTERNED_STRING.ordinal()] = 12;
        iArr[HprofRecordTag.ROOT_FINALIZING.ordinal()] = 13;
        iArr[HprofRecordTag.ROOT_DEBUGGER.ordinal()] = 14;
        iArr[HprofRecordTag.ROOT_REFERENCE_CLEANUP.ordinal()] = 15;
        iArr[HprofRecordTag.ROOT_VM_INTERNAL.ordinal()] = 16;
        iArr[HprofRecordTag.ROOT_JNI_MONITOR.ordinal()] = 17;
        iArr[HprofRecordTag.ROOT_UNREACHABLE.ordinal()] = 18;
        iArr[HprofRecordTag.CLASS_DUMP.ordinal()] = 19;
        iArr[HprofRecordTag.INSTANCE_DUMP.ordinal()] = 20;
        iArr[HprofRecordTag.OBJECT_ARRAY_DUMP.ordinal()] = 21;
        iArr[HprofRecordTag.PRIMITIVE_ARRAY_DUMP.ordinal()] = 22;
    }
}
