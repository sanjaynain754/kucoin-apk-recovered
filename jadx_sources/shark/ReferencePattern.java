package shark;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReferencePattern.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m90084d2 = {"Lshark/ReferencePattern;", "Ljava/io/Serializable;", "()V", "Companion", "InstanceFieldPattern", "JavaLocalPattern", "NativeGlobalVariablePattern", "StaticFieldPattern", "Lshark/ReferencePattern$JavaLocalPattern;", "Lshark/ReferencePattern$StaticFieldPattern;", "Lshark/ReferencePattern$InstanceFieldPattern;", "Lshark/ReferencePattern$NativeGlobalVariablePattern;", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class ReferencePattern implements Serializable {
    private static final long serialVersionUID = -5113635523713591133L;

    /* JADX INFO: compiled from: ReferencePattern.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lshark/ReferencePattern$InstanceFieldPattern;", "Lshark/ReferencePattern;", "className", "", "fieldName", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getFieldName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class InstanceFieldPattern extends ReferencePattern {
        private static final long serialVersionUID = 6649791455204159802L;

        @NotNull
        private final String className;

        @NotNull
        private final String fieldName;

        public InstanceFieldPattern(@NotNull String str, @NotNull String str2) {
            super(null);
            this.className = str;
            this.fieldName = str2;
        }

        public static /* synthetic */ InstanceFieldPattern copy$default(InstanceFieldPattern instanceFieldPattern, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = instanceFieldPattern.className;
            }
            if ((i11 & 2) != 0) {
                str2 = instanceFieldPattern.fieldName;
            }
            return instanceFieldPattern.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final InstanceFieldPattern copy(@NotNull String className, @NotNull String fieldName) {
            return new InstanceFieldPattern(className, fieldName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstanceFieldPattern)) {
                return false;
            }
            InstanceFieldPattern instanceFieldPattern = (InstanceFieldPattern) other;
            return Intrinsics.areEqual(this.className, instanceFieldPattern.className) && Intrinsics.areEqual(this.fieldName, instanceFieldPattern.fieldName);
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            String str = this.className;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fieldName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "instance field " + this.className + '#' + this.fieldName;
        }
    }

    /* JADX INFO: compiled from: ReferencePattern.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lshark/ReferencePattern$JavaLocalPattern;", "Lshark/ReferencePattern;", "threadName", "", "(Ljava/lang/String;)V", "getThreadName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class JavaLocalPattern extends ReferencePattern {
        private static final long serialVersionUID = -8985446122829543654L;

        @NotNull
        private final String threadName;

        public JavaLocalPattern(@NotNull String str) {
            super(null);
            this.threadName = str;
        }

        public static /* synthetic */ JavaLocalPattern copy$default(JavaLocalPattern javaLocalPattern, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = javaLocalPattern.threadName;
            }
            return javaLocalPattern.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getThreadName() {
            return this.threadName;
        }

        @NotNull
        public final JavaLocalPattern copy(@NotNull String threadName) {
            return new JavaLocalPattern(threadName);
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof JavaLocalPattern) && Intrinsics.areEqual(this.threadName, ((JavaLocalPattern) other).threadName);
            }
            return true;
        }

        @NotNull
        public final String getThreadName() {
            return this.threadName;
        }

        public int hashCode() {
            String str = this.threadName;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "local variable on thread " + this.threadName;
        }
    }

    /* JADX INFO: compiled from: ReferencePattern.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lshark/ReferencePattern$NativeGlobalVariablePattern;", "Lshark/ReferencePattern;", "className", "", "(Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class NativeGlobalVariablePattern extends ReferencePattern {
        private static final long serialVersionUID = -2651328076202244933L;

        @NotNull
        private final String className;

        public NativeGlobalVariablePattern(@NotNull String str) {
            super(null);
            this.className = str;
        }

        public static /* synthetic */ NativeGlobalVariablePattern copy$default(NativeGlobalVariablePattern nativeGlobalVariablePattern, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = nativeGlobalVariablePattern.className;
            }
            return nativeGlobalVariablePattern.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final NativeGlobalVariablePattern copy(@NotNull String className) {
            return new NativeGlobalVariablePattern(className);
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof NativeGlobalVariablePattern) && Intrinsics.areEqual(this.className, ((NativeGlobalVariablePattern) other).className);
            }
            return true;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        public int hashCode() {
            String str = this.className;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "native global variable referencing " + this.className;
        }
    }

    /* JADX INFO: compiled from: ReferencePattern.kt */
    @Metadata(m90082bv = {1, 0, 3}, m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lshark/ReferencePattern$StaticFieldPattern;", "Lshark/ReferencePattern;", "className", "", "fieldName", "(Ljava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getFieldName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shark"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class StaticFieldPattern extends ReferencePattern {
        private static final long serialVersionUID = 7656908128775899611L;

        @NotNull
        private final String className;

        @NotNull
        private final String fieldName;

        public StaticFieldPattern(@NotNull String str, @NotNull String str2) {
            super(null);
            this.className = str;
            this.fieldName = str2;
        }

        public static /* synthetic */ StaticFieldPattern copy$default(StaticFieldPattern staticFieldPattern, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = staticFieldPattern.className;
            }
            if ((i11 & 2) != 0) {
                str2 = staticFieldPattern.fieldName;
            }
            return staticFieldPattern.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final StaticFieldPattern copy(@NotNull String className, @NotNull String fieldName) {
            return new StaticFieldPattern(className, fieldName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaticFieldPattern)) {
                return false;
            }
            StaticFieldPattern staticFieldPattern = (StaticFieldPattern) other;
            return Intrinsics.areEqual(this.className, staticFieldPattern.className) && Intrinsics.areEqual(this.fieldName, staticFieldPattern.fieldName);
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            String str = this.className;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fieldName;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "static field " + this.className + '#' + this.fieldName;
        }
    }

    private ReferencePattern() {
    }

    public /* synthetic */ ReferencePattern(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
