package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BinaryVersion.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5343#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;

    @NotNull
    private final int[] numbers;
    private final int patch;

    @NotNull
    private final List<Integer> rest;

    /* JADX INFO: compiled from: BinaryVersion.kt */
    @SourceDebugExtension({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1563#2:102\n1634#2,3:103\n37#3:106\n36#3,3:107\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106\n98#1:107,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public BinaryVersion(@NotNull int... numbers) {
        List<Integer> listEmptyList;
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        this.numbers = numbers;
        Integer orNull = ArraysKt.getOrNull(numbers, 0);
        this.major = orNull != null ? orNull.intValue() : -1;
        Integer orNull2 = ArraysKt.getOrNull(numbers, 1);
        this.minor = orNull2 != null ? orNull2.intValue() : -1;
        Integer orNull3 = ArraysKt.getOrNull(numbers, 2);
        this.patch = orNull3 != null ? orNull3.intValue() : -1;
        if (numbers.length <= 3) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + '.');
            }
            listEmptyList = CollectionsKt.toList(ArraysKt.asList(numbers).subList(3, numbers.length));
        }
        this.rest = listEmptyList;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && Intrinsics.areEqual(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i11 = this.major;
        int i12 = i11 + (i11 * 31) + this.minor;
        int i13 = i12 + (i12 * 31) + this.patch;
        return i13 + (i13 * 31) + this.rest.hashCode();
    }

    public final boolean isAtLeast(int i11, int i12, int i13) {
        int i14 = this.major;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        int i15 = this.minor;
        if (i15 > i12) {
            return true;
        }
        return i15 >= i12 && this.patch >= i13;
    }

    public final boolean isAtMost(int i11, int i12, int i13) {
        int i14 = this.major;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        int i15 = this.minor;
        if (i15 < i12) {
            return true;
        }
        return i15 <= i12 && this.patch <= i13;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion ourVersion) {
        Intrinsics.checkNotNullParameter(ourVersion, "ourVersion");
        int i11 = this.major;
        if (i11 == 0) {
            return ourVersion.major == 0 && this.minor == ourVersion.minor;
        }
        return i11 == ourVersion.major && this.minor <= ourVersion.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i11 : array) {
            if (i11 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return CollectionsKt.joinToString$default(arrayList, C33978va.f72339h, null, null, 0, null, null, 62, null);
    }
}
