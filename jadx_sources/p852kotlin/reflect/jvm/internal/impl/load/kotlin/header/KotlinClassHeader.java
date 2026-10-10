package p852kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

/* JADX INFO: compiled from: KotlinClassHeader.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class KotlinClassHeader {

    @Nullable
    private final String[] data;
    private final int extraInt;

    @Nullable
    private final String extraString;

    @Nullable
    private final String[] incompatibleData;

    @NotNull
    private final Kind kind;

    @NotNull
    private final MetadataVersion metadataVersion;

    @Nullable
    private final String packageName;

    @Nullable
    private final byte[] serializedIr;

    @Nullable
    private final String[] strings;

    /* JADX INFO: compiled from: KotlinClassHeader.kt */
    @SourceDebugExtension({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,75:1\n8704#2,2:76\n8964#2,4:78\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:76,2\n34#1:78,4\n*E\n"})
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        @NotNull
        private static final Map<Integer, Kind> entryById;

        /* JADX INFO: renamed from: id */
        private final int f91373id;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: KotlinClassHeader.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            @NotNull
            public final Kind getById(int i11) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i11));
                if (kind == null) {
                    return Kind.UNKNOWN;
                }
                return kind;
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f91373id), kind);
            }
            entryById = linkedHashMap;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i11) {
            return Companion.getById(i11);
        }

        Kind(int i11) {
            this.f91373id = i11;
        }
    }

    private final boolean has(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull MetadataVersion metadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i11, @Nullable String str2, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.kind = kind;
        this.metadataVersion = metadataVersion;
        this.data = strArr;
        this.incompatibleData = strArr2;
        this.strings = strArr3;
        this.extraString = str;
        this.extraInt = i11;
        this.packageName = str2;
        this.serializedIr = bArr;
    }

    @Nullable
    public final String[] getData() {
        return this.data;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.incompatibleData;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final MetadataVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    @Nullable
    public final String getMultifileClassName() {
        String str = this.extraString;
        if (this.kind == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        String[] strArr = this.data;
        if (this.kind != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listAsList = strArr != null ? ArraysKt.asList(strArr) : null;
        return listAsList == null ? CollectionsKt.emptyList() : listAsList;
    }

    @Nullable
    public final String[] getStrings() {
        return this.strings;
    }

    public final boolean isPreRelease() {
        return has(this.extraInt, 2);
    }

    public final boolean isUnstableJvmIrBinary() {
        return has(this.extraInt, 16) && !has(this.extraInt, 32);
    }

    @NotNull
    public String toString() {
        return this.kind + " version=" + this.metadataVersion;
    }
}
