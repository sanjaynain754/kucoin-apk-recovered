package p852kotlin.reflect.jvm.internal.impl.name;

import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: CallableId.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nCallableId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableId.kt\norg/jetbrains/kotlin/name/CallableId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class CallableId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Name LOCAL_NAME;

    @NotNull
    private static final FqName PACKAGE_FQ_NAME_FOR_LOCAL;

    @NotNull
    private final Name callableName;

    @Nullable
    private final ClassId classId;

    @Nullable
    private final FqName className;

    @NotNull
    private final FqName packageName;

    @Nullable
    private final FqName pathToLocal;

    /* JADX INFO: compiled from: CallableId.kt */
    @SourceDebugExtension({"SMAP\nCallableId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallableId.kt\norg/jetbrains/kotlin/name/CallableId$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private CallableId(FqName fqName, FqName fqName2, Name name, ClassId classId, FqName fqName3) {
        this.packageName = fqName;
        this.className = fqName2;
        this.callableName = name;
        this.classId = classId;
        this.pathToLocal = fqName3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.areEqual(this.packageName, callableId.packageName) && Intrinsics.areEqual(this.className, callableId.className) && Intrinsics.areEqual(this.callableName, callableId.callableName);
    }

    static {
        Name name = SpecialNames.LOCAL;
        LOCAL_NAME = name;
        PACKAGE_FQ_NAME_FOR_LOCAL = FqName.Companion.topLevel(name);
    }

    public int hashCode() {
        int iHashCode = (527 + this.packageName.hashCode()) * 31;
        FqName fqName = this.className;
        return ((iHashCode + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.callableName.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringsKt.replace$default(this.packageName.asString(), '.', '/', false, 4, (Object) null));
        sb2.append("/");
        FqName fqName = this.className;
        if (fqName != null) {
            sb2.append(fqName);
            sb2.append(C33978va.f72339h);
        }
        sb2.append(this.callableName);
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(@NotNull FqName packageName, @NotNull Name callableName) {
        this(packageName, null, callableName, null, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }
}
