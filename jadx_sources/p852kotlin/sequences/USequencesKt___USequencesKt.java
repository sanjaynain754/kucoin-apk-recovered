package p852kotlin.sequences;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: _USequences.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m90084d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "sumOfUInt", "(Lkotlin/sequences/Sequence;)I", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UByte;", "sumOfUByte", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/sequences/USequencesKt")
class USequencesKt___USequencesKt {
    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUByte")
    public static final int sumOfUByte(@NotNull Sequence<UByte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UByte> it = sequence.iterator();
        int iM103939constructorimpl = 0;
        while (it.hasNext()) {
            iM103939constructorimpl = UInt.m103939constructorimpl(iM103939constructorimpl + UInt.m103939constructorimpl(it.next().getData() & 255));
        }
        return iM103939constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUInt")
    public static final int sumOfUInt(@NotNull Sequence<UInt> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UInt> it = sequence.iterator();
        int iM103939constructorimpl = 0;
        while (it.hasNext()) {
            iM103939constructorimpl = UInt.m103939constructorimpl(iM103939constructorimpl + it.next().getData());
        }
        return iM103939constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfULong")
    public static final long sumOfULong(@NotNull Sequence<ULong> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<ULong> it = sequence.iterator();
        long jM104018constructorimpl = 0;
        while (it.hasNext()) {
            jM104018constructorimpl = ULong.m104018constructorimpl(jM104018constructorimpl + it.next().getData());
        }
        return jM104018constructorimpl;
    }

    @SinceKotlin(version = "1.5")
    @JvmName(name = "sumOfUShort")
    public static final int sumOfUShort(@NotNull Sequence<UShort> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<UShort> it = sequence.iterator();
        int iM103939constructorimpl = 0;
        while (it.hasNext()) {
            iM103939constructorimpl = UInt.m103939constructorimpl(iM103939constructorimpl + UInt.m103939constructorimpl(it.next().getData() & UShort.MAX_VALUE));
        }
        return iM103939constructorimpl;
    }
}
