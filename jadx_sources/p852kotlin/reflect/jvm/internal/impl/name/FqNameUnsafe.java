package p852kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: FqNameUnsafe.kt */
/* JADX INFO: loaded from: classes23.dex */
@SourceDebugExtension({"SMAP\nFqNameUnsafe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNameUnsafe.kt\norg/jetbrains/kotlin/name/FqNameUnsafe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
public final class FqNameUnsafe {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Name ROOT_NAME;

    @NotNull
    private static final Pattern SPLIT_BY_DOTS;

    @NotNull
    private final String fqName;

    @Nullable
    private transient FqNameUnsafe parent;

    @Nullable
    private transient FqName safe;

    @Nullable
    private transient Name shortName;

    /* JADX INFO: compiled from: FqNameUnsafe.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final FqNameUnsafe topLevel(@NotNull Name shortName) {
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            String strAsString = shortName.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            return new FqNameUnsafe(strAsString, FqName.ROOT.toUnsafe(), shortName, null);
        }
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && Intrinsics.areEqual(this.fqName, ((FqNameUnsafe) obj).fqName);
    }

    static {
        Name nameSpecial = Name.special("<root>");
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(...)");
        ROOT_NAME = nameSpecial;
        Pattern patternCompile = Pattern.compile("\\.");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        SPLIT_BY_DOTS = patternCompile;
    }

    public FqNameUnsafe(@NotNull String fqName, @NotNull FqName safe) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(safe, "safe");
        this.fqName = fqName;
        this.safe = safe;
    }

    private final void compute() {
        int iIndexOfLastDotWithBackticksSupport = indexOfLastDotWithBackticksSupport(this.fqName);
        if (iIndexOfLastDotWithBackticksSupport < 0) {
            this.shortName = Name.guessByFirstCharacter(this.fqName);
            this.parent = FqName.ROOT.toUnsafe();
            return;
        }
        String strSubstring = this.fqName.substring(iIndexOfLastDotWithBackticksSupport + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        this.shortName = Name.guessByFirstCharacter(strSubstring);
        String strSubstring2 = this.fqName.substring(0, iIndexOfLastDotWithBackticksSupport);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        this.parent = new FqNameUnsafe(strSubstring2);
    }

    @NotNull
    public final String asString() {
        return this.fqName;
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.length() == 0;
    }

    public final boolean isSafe() {
        return this.safe != null || StringsKt.indexOf$default((CharSequence) asString(), Typography.less, 0, false, 6, (Object) null) < 0;
    }

    @NotNull
    public final FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.parent;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        FqNameUnsafe fqNameUnsafe2 = this.parent;
        Intrinsics.checkNotNull(fqNameUnsafe2);
        return fqNameUnsafe2;
    }

    @NotNull
    public final Name shortName() {
        Name name = this.shortName;
        if (name != null) {
            return name;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        compute();
        Name name2 = this.shortName;
        Intrinsics.checkNotNull(name2);
        return name2;
    }

    @NotNull
    public final FqName toSafe() {
        FqName fqName = this.safe;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.safe = fqName2;
        return fqName2;
    }

    private final int indexOfLastDotWithBackticksSupport(String str) {
        int length = str.length() - 1;
        boolean z11 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z11) {
                return length;
            }
            if (cCharAt == '`') {
                z11 = !z11;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List<Name> pathSegments$collectSegmentsOf(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.isRoot()) {
            return new ArrayList();
        }
        List<Name> listPathSegments$collectSegmentsOf = pathSegments$collectSegmentsOf(fqNameUnsafe.parent());
        listPathSegments$collectSegmentsOf.add(fqNameUnsafe.shortName());
        return listPathSegments$collectSegmentsOf;
    }

    @NotNull
    public final FqNameUnsafe child(@NotNull Name name) {
        String strAsString;
        Intrinsics.checkNotNullParameter(name, "name");
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.fqName + '.' + name.asString();
        }
        Intrinsics.checkNotNull(strAsString);
        return new FqNameUnsafe(strAsString, this, name);
    }

    @NotNull
    public final List<Name> pathSegments() {
        return pathSegments$collectSegmentsOf(this);
    }

    @NotNull
    public final Name shortNameOrSpecial() {
        if (isRoot()) {
            return ROOT_NAME;
        }
        return shortName();
    }

    public final boolean startsWith(@NotNull Name segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (isRoot()) {
            return false;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.fqName, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            iIndexOf$default = this.fqName.length();
        }
        int i11 = iIndexOf$default;
        String strAsString = segment.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        if (i11 != strAsString.length() || !StringsKt.regionMatches$default(this.fqName, 0, strAsString, 0, i11, false, 16, (Object) null)) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        if (isRoot()) {
            String strAsString = ROOT_NAME.asString();
            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
            return strAsString;
        }
        return this.fqName;
    }

    public FqNameUnsafe(@NotNull String fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.fqName = fqName;
    }

    private FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.fqName = str;
        this.parent = fqNameUnsafe;
        this.shortName = name;
    }
}
