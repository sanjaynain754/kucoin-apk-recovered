package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.DeprecationLevel;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: VersionRequirement.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class VersionRequirement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Integer errorCode;

    @NotNull
    private final ProtoBuf.VersionRequirement.VersionKind kind;

    @NotNull
    private final DeprecationLevel level;

    @Nullable
    private final String message;

    @NotNull
    private final Version version;

    /* JADX INFO: compiled from: VersionRequirement.kt */
    @SourceDebugExtension({"SMAP\nVersionRequirement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionRequirement.kt\norg/jetbrains/kotlin/metadata/deserialization/VersionRequirement$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1617#2,9:120\n1869#2:129\n1870#2:131\n1626#2:132\n1#3:130\n*S KotlinDebug\n*F\n+ 1 VersionRequirement.kt\norg/jetbrains/kotlin/metadata/deserialization/VersionRequirement$Companion\n*L\n94#1:120,9\n94#1:129\n94#1:131\n94#1:132\n94#1:130\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: VersionRequirement.kt */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProtoBuf.VersionRequirement.Level.values().length];
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        @Nullable
        public final VersionRequirement create(int i11, @NotNull NameResolver nameResolver, @NotNull VersionRequirementTable table) {
            DeprecationLevel deprecationLevel;
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(table, "table");
            ProtoBuf.VersionRequirement versionRequirement = table.get(i11);
            if (versionRequirement == null) {
                return null;
            }
            Version versionDecode = Version.Companion.decode(versionRequirement.hasVersion() ? Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? Integer.valueOf(versionRequirement.getVersionFull()) : null);
            ProtoBuf.VersionRequirement.Level level = versionRequirement.getLevel();
            Intrinsics.checkNotNull(level);
            int i12 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i12 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i12 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer numValueOf = versionRequirement.hasErrorCode() ? Integer.valueOf(versionRequirement.getErrorCode()) : null;
            String string = versionRequirement.hasMessage() ? nameResolver.getString(versionRequirement.getMessage()) : null;
            ProtoBuf.VersionRequirement.VersionKind versionKind = versionRequirement.getVersionKind();
            Intrinsics.checkNotNullExpressionValue(versionKind, "getVersionKind(...)");
            return new VersionRequirement(versionDecode, versionKind, deprecationLevel2, numValueOf, string);
        }
    }

    /* JADX INFO: compiled from: VersionRequirement.kt */
    public static final class Version {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @JvmField
        @NotNull
        public static final Version INFINITY = new Version(256, 256, 256);
        private final int major;
        private final int minor;
        private final int patch;

        /* JADX INFO: compiled from: VersionRequirement.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @NotNull
            public final Version decode(@Nullable Integer num, @Nullable Integer num2) {
                if (num2 != null) {
                    return new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                return num != null ? new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127) : Version.INFINITY;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return false;
            }
            Version version = (Version) obj;
            return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
        }

        @NotNull
        public final String asString() {
            StringBuilder sb2;
            int i11;
            if (this.patch == 0) {
                sb2 = new StringBuilder();
                sb2.append(this.major);
                sb2.append('.');
                i11 = this.minor;
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.major);
                sb2.append('.');
                sb2.append(this.minor);
                sb2.append('.');
                i11 = this.patch;
            }
            sb2.append(i11);
            return sb2.toString();
        }

        public final int component1() {
            return this.major;
        }

        public final int component2() {
            return this.minor;
        }

        public final int component3() {
            return this.patch;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch);
        }

        public Version(int i11, int i12, int i13) {
            this.major = i11;
            this.minor = i12;
            this.patch = i13;
        }

        public final void encode(@NotNull Function1<? super Integer, Unit> writeVersion, @NotNull Function1<? super Integer, Unit> writeVersionFull) {
            int i11;
            int i12;
            Intrinsics.checkNotNullParameter(writeVersion, "writeVersion");
            Intrinsics.checkNotNullParameter(writeVersionFull, "writeVersionFull");
            if (!Intrinsics.areEqual(this, INFINITY)) {
                int i13 = this.major;
                if (i13 <= 7 && (i11 = this.minor) <= 15 && (i12 = this.patch) <= 127) {
                    writeVersion.invoke(Integer.valueOf((i11 << 3) | i13 | (i12 << 7)));
                } else {
                    writeVersionFull.invoke(Integer.valueOf((this.minor << 8) | i13 | (this.patch << 16)));
                }
            }
        }

        @NotNull
        public String toString() {
            return asString();
        }
    }

    @Nullable
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final ProtoBuf.VersionRequirement.VersionKind getKind() {
        return this.kind;
    }

    @NotNull
    public final DeprecationLevel getLevel() {
        return this.level;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Version getVersion() {
        return this.version;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("since ");
        sb2.append(this.version);
        sb2.append(' ');
        sb2.append(this.level);
        String str2 = "";
        if (this.errorCode != null) {
            str = " error " + this.errorCode;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.message != null) {
            str2 = ": " + this.message;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public VersionRequirement(@NotNull Version version, @NotNull ProtoBuf.VersionRequirement.VersionKind kind, @NotNull DeprecationLevel level, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(level, "level");
        this.version = version;
        this.kind = kind;
        this.level = level;
        this.errorCode = num;
        this.message = str;
    }
}
