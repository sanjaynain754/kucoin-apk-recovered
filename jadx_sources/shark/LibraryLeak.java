package shark;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import shark.internal.C44486l;

/* JADX INFO: compiled from: HeapAnalysis.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J-\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\bH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006 "}, m90084d2 = {"Lshark/LibraryLeak;", "Lshark/Leak;", "leakTraces", "", "Lshark/LeakTrace;", "pattern", "Lshark/ReferencePattern;", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", "(Ljava/util/List;Lshark/ReferencePattern;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getLeakTraces", "()Ljava/util/List;", "getPattern", "()Lshark/ReferencePattern;", "shortDescription", "getShortDescription", TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "getSignature", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public final /* data */ class LibraryLeak extends Leak {
    private static final long serialVersionUID = 3943636164568681903L;

    @NotNull
    private final String description;

    @NotNull
    private final List<LeakTrace> leakTraces;

    @NotNull
    private final ReferencePattern pattern;

    public LibraryLeak(@NotNull List<LeakTrace> list, @NotNull ReferencePattern referencePattern, @NotNull String str) {
        super(null);
        this.leakTraces = list;
        this.pattern = referencePattern;
        this.description = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LibraryLeak copy$default(LibraryLeak libraryLeak, List list, ReferencePattern referencePattern, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = libraryLeak.getLeakTraces();
        }
        if ((i11 & 2) != 0) {
            referencePattern = libraryLeak.pattern;
        }
        if ((i11 & 4) != 0) {
            str = libraryLeak.description;
        }
        return libraryLeak.copy(list, referencePattern, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReferencePattern getPattern() {
        return this.pattern;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final LibraryLeak copy(@NotNull List<LeakTrace> leakTraces, @NotNull ReferencePattern pattern, @NotNull String description) {
        return new LibraryLeak(leakTraces, pattern, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LibraryLeak)) {
            return false;
        }
        LibraryLeak libraryLeak = (LibraryLeak) other;
        return Intrinsics.areEqual(getLeakTraces(), libraryLeak.getLeakTraces()) && Intrinsics.areEqual(this.pattern, libraryLeak.pattern) && Intrinsics.areEqual(this.description, libraryLeak.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Override // shark.Leak
    @NotNull
    public List<LeakTrace> getLeakTraces() {
        return this.leakTraces;
    }

    @NotNull
    public final ReferencePattern getPattern() {
        return this.pattern;
    }

    @Override // shark.Leak
    @NotNull
    public String getShortDescription() {
        return this.pattern.toString();
    }

    @Override // shark.Leak
    @NotNull
    public String getSignature() {
        return C44486l.m98412b(this.pattern.toString());
    }

    @Override // shark.Leak
    @NotNull
    public String toString() {
        return "Leak pattern: " + this.pattern + "\nDescription: " + this.description + '\n' + super.toString() + '\n';
    }

    @NotNull
    public final List<LeakTrace> component1() {
        return getLeakTraces();
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        List<LeakTrace> leakTraces = getLeakTraces();
        int iHashCode3 = 0;
        if (leakTraces != null) {
            iHashCode = leakTraces.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = iHashCode * 31;
        ReferencePattern referencePattern = this.pattern;
        if (referencePattern != null) {
            iHashCode2 = referencePattern.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i12 = (i11 + iHashCode2) * 31;
        String str = this.description;
        if (str != null) {
            iHashCode3 = str.hashCode();
        }
        return i12 + iHashCode3;
    }
}
