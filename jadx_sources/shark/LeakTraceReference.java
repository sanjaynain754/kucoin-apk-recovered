package shark;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import shark.internal.C44486l;

/* JADX INFO: compiled from: LeakTraceReference.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0002#$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m90084d2 = {"Lshark/LeakTraceReference;", "Ljava/io/Serializable;", "originObject", "Lshark/LeakTraceObject;", "referenceType", "Lshark/LeakTraceReference$ReferenceType;", "owningClassName", "", "referenceName", "(Lshark/LeakTraceObject;Lshark/LeakTraceReference$ReferenceType;Ljava/lang/String;Ljava/lang/String;)V", "getOriginObject", "()Lshark/LeakTraceObject;", "getOwningClassName", "()Ljava/lang/String;", "owningClassSimpleName", "getOwningClassSimpleName", "referenceDisplayName", "getReferenceDisplayName", "referenceGenericName", "getReferenceGenericName", "getReferenceName", "getReferenceType", "()Lshark/LeakTraceReference$ReferenceType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "ReferenceType", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class LeakTraceReference implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final LeakTraceObject originObject;

    @NotNull
    private final String owningClassName;

    @NotNull
    private final String referenceName;

    @NotNull
    private final ReferenceType referenceType;

    /* JADX INFO: compiled from: LeakTraceReference.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lshark/LeakTraceReference$ReferenceType;", "", "(Ljava/lang/String;I)V", "INSTANCE_FIELD", "STATIC_FIELD", "LOCAL", "ARRAY_ENTRY", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public enum ReferenceType {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY
    }

    public static /* synthetic */ LeakTraceReference copy$default(LeakTraceReference leakTraceReference, LeakTraceObject leakTraceObject, ReferenceType referenceType, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            leakTraceObject = leakTraceReference.originObject;
        }
        if ((i11 & 2) != 0) {
            referenceType = leakTraceReference.referenceType;
        }
        if ((i11 & 4) != 0) {
            str = leakTraceReference.owningClassName;
        }
        if ((i11 & 8) != 0) {
            str2 = leakTraceReference.referenceName;
        }
        return leakTraceReference.copy(leakTraceObject, referenceType, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LeakTraceObject getOriginObject() {
        return this.originObject;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReferenceType getReferenceType() {
        return this.referenceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOwningClassName() {
        return this.owningClassName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReferenceName() {
        return this.referenceName;
    }

    @NotNull
    public final LeakTraceReference copy(@NotNull LeakTraceObject originObject, @NotNull ReferenceType referenceType, @NotNull String owningClassName, @NotNull String referenceName) {
        return new LeakTraceReference(originObject, referenceType, owningClassName, referenceName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeakTraceReference)) {
            return false;
        }
        LeakTraceReference leakTraceReference = (LeakTraceReference) other;
        return Intrinsics.areEqual(this.originObject, leakTraceReference.originObject) && Intrinsics.areEqual(this.referenceType, leakTraceReference.referenceType) && Intrinsics.areEqual(this.owningClassName, leakTraceReference.owningClassName) && Intrinsics.areEqual(this.referenceName, leakTraceReference.referenceName);
    }

    @NotNull
    public final LeakTraceObject getOriginObject() {
        return this.originObject;
    }

    @NotNull
    public final String getOwningClassName() {
        return this.owningClassName;
    }

    @NotNull
    public final String getOwningClassSimpleName() {
        return C44486l.m98414d(this.owningClassName, '.');
    }

    @NotNull
    public final String getReferenceDisplayName() {
        int i11 = C44493o.$EnumSwitchMapping$0[this.referenceType.ordinal()];
        if (i11 == 1) {
            return '[' + this.referenceName + ']';
        }
        if (i11 == 2 || i11 == 3) {
            return this.referenceName;
        }
        if (i11 == 4) {
            return "<Java Local>";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getReferenceGenericName() {
        int i11 = C44493o.$EnumSwitchMapping$1[this.referenceType.ordinal()];
        if (i11 == 1) {
            return "[x]";
        }
        if (i11 == 2 || i11 == 3) {
            return this.referenceName;
        }
        if (i11 == 4) {
            return "<Java Local>";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getReferenceName() {
        return this.referenceName;
    }

    @NotNull
    public final ReferenceType getReferenceType() {
        return this.referenceType;
    }

    public int hashCode() {
        LeakTraceObject leakTraceObject = this.originObject;
        int iHashCode = (leakTraceObject != null ? leakTraceObject.hashCode() : 0) * 31;
        ReferenceType referenceType = this.referenceType;
        int iHashCode2 = (iHashCode + (referenceType != null ? referenceType.hashCode() : 0)) * 31;
        String str = this.owningClassName;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.referenceName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeakTraceReference(originObject=" + this.originObject + ", referenceType=" + this.referenceType + ", owningClassName=" + this.owningClassName + ", referenceName=" + this.referenceName + ")";
    }

    public LeakTraceReference(@NotNull LeakTraceObject leakTraceObject, @NotNull ReferenceType referenceType, @NotNull String str, @NotNull String str2) {
        this.originObject = leakTraceObject;
        this.referenceType = referenceType;
        this.owningClassName = str;
        this.referenceName = str2;
    }
}
