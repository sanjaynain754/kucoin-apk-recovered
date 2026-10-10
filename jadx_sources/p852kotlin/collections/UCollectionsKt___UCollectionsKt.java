package p852kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UByte;
import p852kotlin.UByteArray;
import p852kotlin.UInt;
import p852kotlin.UIntArray;
import p852kotlin.ULong;
import p852kotlin.ULongArray;
import p852kotlin.UShort;
import p852kotlin.UShortArray;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _UCollections.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, m90084d2 = {"toUByteArray", "Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "Lkotlin/UInt;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "(Ljava/util/Collection;)[S", "sum", "", "sumOfUInt", "(Ljava/lang/Iterable;)I", "sumOfULong", "(Ljava/lang/Iterable;)J", "sumOfUByte", "sumOfUShort", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/collections/UCollectionsKt")
class UCollectionsKt___UCollectionsKt {
    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Iterable<UByte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UByte> it = iterable.iterator();
        int iM103939constructorimpl = 0;
        while (it.hasNext()) {
            iM103939constructorimpl = UInt.m103939constructorimpl(iM103939constructorimpl + UInt.m103939constructorimpl(it.next().getData() & 255));
        }
        return iM103939constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Iterable<UInt> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UInt> it = iterable.iterator();
        int iM103939constructorimpl = 0;
        while (it.hasNext()) {
            iM103939constructorimpl = UInt.m103939constructorimpl(iM103939constructorimpl + it.next().getData());
        }
        return iM103939constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Iterable<ULong> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<ULong> it = iterable.iterator();
        long jM104018constructorimpl = 0;
        while (it.hasNext()) {
            jM104018constructorimpl = ULong.m104018constructorimpl(jM104018constructorimpl + it.next().getData());
        }
        return jM104018constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Iterable<UShort> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<UShort> it = iterable.iterator();
        int iM103939constructorimpl = 0;
        while (it.hasNext()) {
            iM103939constructorimpl = UInt.m103939constructorimpl(iM103939constructorimpl + UInt.m103939constructorimpl(it.next().getData() & UShort.MAX_VALUE));
        }
        return iM103939constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final byte[] toUByteArray(@NotNull Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArrM103914constructorimpl = UByteArray.m103914constructorimpl(collection.size());
        Iterator<UByte> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            UByteArray.m103925setVurrAj0(bArrM103914constructorimpl, i11, it.next().getData());
            i11++;
        }
        return bArrM103914constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final int[] toUIntArray(@NotNull Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArrM103993constructorimpl = UIntArray.m103993constructorimpl(collection.size());
        Iterator<UInt> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            UIntArray.m104004setVXSXFK8(iArrM103993constructorimpl, i11, it.next().getData());
            i11++;
        }
        return iArrM103993constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final long[] toULongArray(@NotNull Collection<ULong> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArrM104072constructorimpl = ULongArray.m104072constructorimpl(collection.size());
        Iterator<ULong> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            ULongArray.m104083setk8EXiF4(jArrM104072constructorimpl, i11, it.next().getData());
            i11++;
        }
        return jArrM104072constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @NotNull
    public static final short[] toUShortArray(@NotNull Collection<UShort> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArrM104177constructorimpl = UShortArray.m104177constructorimpl(collection.size());
        Iterator<UShort> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            UShortArray.m104188set01HTLdE(sArrM104177constructorimpl, i11, it.next().getData());
            i11++;
        }
        return sArrM104177constructorimpl;
    }
}
