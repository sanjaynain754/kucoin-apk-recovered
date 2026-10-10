package shark;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TypeCastException;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import shark.internal.C44486l;

/* JADX INFO: compiled from: LeakTraceObject.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u0000 32\u00020\u0001:\u0003345BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\b\u0010.\u001a\u00020\u0005H\u0016J/\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020*2\b\b\u0002\u0010\u001e\u001a\u00020\u0005H\u0000¢\u0006\u0002\b2R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010¨\u00066"}, m90084d2 = {"Lshark/LeakTraceObject;", "Ljava/io/Serializable;", "type", "Lshark/LeakTraceObject$ObjectType;", "className", "", "labels", "", "leakingStatus", "Lshark/LeakTraceObject$LeakingStatus;", "leakingStatusReason", "retainedHeapByteSize", "", "retainedObjectCount", "(Lshark/LeakTraceObject$ObjectType;Ljava/lang/String;Ljava/util/Set;Lshark/LeakTraceObject$LeakingStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getClassName", "()Ljava/lang/String;", "classSimpleName", "getClassSimpleName", "getLabels", "()Ljava/util/Set;", "getLeakingStatus", "()Lshark/LeakTraceObject$LeakingStatus;", "getLeakingStatusReason", "getRetainedHeapByteSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRetainedObjectCount", "getType", "()Lshark/LeakTraceObject$ObjectType;", "typeName", "getTypeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lshark/LeakTraceObject$ObjectType;Ljava/lang/String;Ljava/util/Set;Lshark/LeakTraceObject$LeakingStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lshark/LeakTraceObject;", "equals", "", "other", "", "hashCode", "toString", "firstLinePrefix", "additionalLinesPrefix", "showLeakingStatus", "toString$shark", "Companion", "LeakingStatus", "ObjectType", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class LeakTraceObject implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = -3616216391305196341L;

    @NotNull
    private final String className;

    @NotNull
    private final Set<String> labels;

    @NotNull
    private final LeakingStatus leakingStatus;

    @NotNull
    private final String leakingStatusReason;

    @Nullable
    private final Integer retainedHeapByteSize;

    @Nullable
    private final Integer retainedObjectCount;

    @NotNull
    private final ObjectType type;

    /* JADX INFO: compiled from: LeakTraceObject.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lshark/LeakTraceObject$Companion;", "", "<init>", "()V", "", "bytes", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(J)Ljava/lang/String;", "serialVersionUID", "J", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m98151a(long bytes) {
            if (bytes < 1000) {
                return bytes + " B";
            }
            double d11 = bytes;
            double d12 = 1000;
            int iLog = (int) (Math.log(d11) / Math.log(d12));
            char cCharAt = "kMGTPE".charAt(iLog - 1);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.1f %sB", Arrays.copyOf(new Object[]{Double.valueOf(d11 / Math.pow(d12, iLog)), Character.valueOf(cCharAt)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
            return str;
        }
    }

    /* JADX INFO: compiled from: LeakTraceObject.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lshark/LeakTraceObject$LeakingStatus;", "", "(Ljava/lang/String;I)V", "NOT_LEAKING", "LEAKING", "UNKNOWN", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public enum LeakingStatus {
        NOT_LEAKING,
        LEAKING,
        UNKNOWN
    }

    /* JADX INFO: compiled from: LeakTraceObject.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lshark/LeakTraceObject$ObjectType;", "", "(Ljava/lang/String;I)V", "CLASS", "ARRAY", "INSTANCE", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public enum ObjectType {
        CLASS,
        ARRAY,
        INSTANCE
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeakTraceObject copy$default(LeakTraceObject leakTraceObject, ObjectType objectType, String str, Set set, LeakingStatus leakingStatus, String str2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            objectType = leakTraceObject.type;
        }
        if ((i11 & 2) != 0) {
            str = leakTraceObject.className;
        }
        if ((i11 & 4) != 0) {
            set = leakTraceObject.labels;
        }
        if ((i11 & 8) != 0) {
            leakingStatus = leakTraceObject.leakingStatus;
        }
        if ((i11 & 16) != 0) {
            str2 = leakTraceObject.leakingStatusReason;
        }
        if ((i11 & 32) != 0) {
            num = leakTraceObject.retainedHeapByteSize;
        }
        if ((i11 & 64) != 0) {
            num2 = leakTraceObject.retainedObjectCount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str3 = str2;
        Set set2 = set;
        return leakTraceObject.copy(objectType, str, set2, leakingStatus, str3, num3, num4);
    }

    public static /* synthetic */ String toString$shark$default(LeakTraceObject leakTraceObject, String str, String str2, boolean z11, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str3 = leakTraceObject.getTypeName();
        }
        return leakTraceObject.toString$shark(str, str2, z11, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ObjectType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final Set<String> component3() {
        return this.labels;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LeakingStatus getLeakingStatus() {
        return this.leakingStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeakingStatusReason() {
        return this.leakingStatusReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getRetainedHeapByteSize() {
        return this.retainedHeapByteSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getRetainedObjectCount() {
        return this.retainedObjectCount;
    }

    @NotNull
    public final LeakTraceObject copy(@NotNull ObjectType type, @NotNull String className, @NotNull Set<String> labels, @NotNull LeakingStatus leakingStatus, @NotNull String leakingStatusReason, @Nullable Integer retainedHeapByteSize, @Nullable Integer retainedObjectCount) {
        return new LeakTraceObject(type, className, labels, leakingStatus, leakingStatusReason, retainedHeapByteSize, retainedObjectCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeakTraceObject)) {
            return false;
        }
        LeakTraceObject leakTraceObject = (LeakTraceObject) other;
        return Intrinsics.areEqual(this.type, leakTraceObject.type) && Intrinsics.areEqual(this.className, leakTraceObject.className) && Intrinsics.areEqual(this.labels, leakTraceObject.labels) && Intrinsics.areEqual(this.leakingStatus, leakTraceObject.leakingStatus) && Intrinsics.areEqual(this.leakingStatusReason, leakTraceObject.leakingStatusReason) && Intrinsics.areEqual(this.retainedHeapByteSize, leakTraceObject.retainedHeapByteSize) && Intrinsics.areEqual(this.retainedObjectCount, leakTraceObject.retainedObjectCount);
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final String getClassSimpleName() {
        return C44486l.m98414d(this.className, '.');
    }

    @NotNull
    public final Set<String> getLabels() {
        return this.labels;
    }

    @NotNull
    public final LeakingStatus getLeakingStatus() {
        return this.leakingStatus;
    }

    @NotNull
    public final String getLeakingStatusReason() {
        return this.leakingStatusReason;
    }

    @Nullable
    public final Integer getRetainedHeapByteSize() {
        return this.retainedHeapByteSize;
    }

    @Nullable
    public final Integer getRetainedObjectCount() {
        return this.retainedObjectCount;
    }

    @NotNull
    public final ObjectType getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeName() {
        String strName = this.type.name();
        Locale locale = Locale.US;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
        if (strName == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = strName.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public int hashCode() {
        ObjectType objectType = this.type;
        int iHashCode = (objectType != null ? objectType.hashCode() : 0) * 31;
        String str = this.className;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Set<String> set = this.labels;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        LeakingStatus leakingStatus = this.leakingStatus;
        int iHashCode4 = (iHashCode3 + (leakingStatus != null ? leakingStatus.hashCode() : 0)) * 31;
        String str2 = this.leakingStatusReason;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.retainedHeapByteSize;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.retainedObjectCount;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return toString$shark$default(this, "", "\u200b  ", true, null, 8, null);
    }

    @NotNull
    public final String toString$shark(@NotNull String firstLinePrefix, @NotNull String additionalLinesPrefix, boolean showLeakingStatus, @NotNull String typeName) {
        String str;
        int i11 = C44492n.$EnumSwitchMapping$0[this.leakingStatus.ordinal()];
        if (i11 == 1) {
            str = "UNKNOWN";
        } else if (i11 == 2) {
            str = "NO (" + this.leakingStatusReason + ')';
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "YES (" + this.leakingStatusReason + ')';
        }
        String str2 = "" + firstLinePrefix + this.className + ' ' + typeName;
        if (showLeakingStatus) {
            str2 = str2 + '\n' + additionalLinesPrefix + "Leaking: " + str;
        }
        Integer num = this.retainedHeapByteSize;
        if (num != null) {
            str2 = str2 + '\n' + additionalLinesPrefix + "Retaining " + INSTANCE.m98151a(num.intValue()) + " in " + this.retainedObjectCount + " objects";
        }
        Iterator<String> it = this.labels.iterator();
        while (it.hasNext()) {
            str2 = str2 + '\n' + additionalLinesPrefix + it.next();
        }
        return str2;
    }

    public LeakTraceObject(@NotNull ObjectType objectType, @NotNull String str, @NotNull Set<String> set, @NotNull LeakingStatus leakingStatus, @NotNull String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.type = objectType;
        this.className = str;
        this.labels = set;
        this.leakingStatus = leakingStatus;
        this.leakingStatusReason = str2;
        this.retainedHeapByteSize = num;
        this.retainedObjectCount = num2;
    }
}
