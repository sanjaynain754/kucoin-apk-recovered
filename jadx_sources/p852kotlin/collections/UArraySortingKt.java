package p852kotlin.collections;

import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.UByteArray;
import p852kotlin.UIntArray;
import p852kotlin.ULongArray;
import p852kotlin.UShort;
import p852kotlin.UShortArray;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m90084d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m104299partitionnroSd4(long[] jArr, int i11, int i12) {
        long jM104078getsVKNKU = ULongArray.m104078getsVKNKU(jArr, (i11 + i12) / 2);
        while (i11 <= i12) {
            while (Long.compare(ULongArray.m104078getsVKNKU(jArr, i11) ^ Long.MIN_VALUE, jM104078getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i11++;
            }
            while (Long.compare(ULongArray.m104078getsVKNKU(jArr, i12) ^ Long.MIN_VALUE, jM104078getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i12--;
            }
            if (i11 <= i12) {
                long jM104078getsVKNKU2 = ULongArray.m104078getsVKNKU(jArr, i11);
                ULongArray.m104083setk8EXiF4(jArr, i11, ULongArray.m104078getsVKNKU(jArr, i12));
                ULongArray.m104083setk8EXiF4(jArr, i12, jM104078getsVKNKU2);
                i11++;
                i12--;
            }
        }
        return i11;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m104300partition4UcCI2c(byte[] bArr, int i11, int i12) {
        int i13;
        byte bM103920getw2LRezQ = UByteArray.m103920getw2LRezQ(bArr, (i11 + i12) / 2);
        while (i11 <= i12) {
            while (true) {
                i13 = bM103920getw2LRezQ & 255;
                if (Intrinsics.compare(UByteArray.m103920getw2LRezQ(bArr, i11) & 255, i13) >= 0) {
                    break;
                }
                i11++;
            }
            while (Intrinsics.compare(UByteArray.m103920getw2LRezQ(bArr, i12) & 255, i13) > 0) {
                i12--;
            }
            if (i11 <= i12) {
                byte bM103920getw2LRezQ2 = UByteArray.m103920getw2LRezQ(bArr, i11);
                UByteArray.m103925setVurrAj0(bArr, i11, UByteArray.m103920getw2LRezQ(bArr, i12));
                UByteArray.m103925setVurrAj0(bArr, i12, bM103920getw2LRezQ2);
                i11++;
                i12--;
            }
        }
        return i11;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m104301partitionAa5vz7o(short[] sArr, int i11, int i12) {
        int i13;
        short sM104183getMh2AYeg = UShortArray.m104183getMh2AYeg(sArr, (i11 + i12) / 2);
        while (i11 <= i12) {
            while (true) {
                int iM104183getMh2AYeg = UShortArray.m104183getMh2AYeg(sArr, i11) & UShort.MAX_VALUE;
                i13 = sM104183getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM104183getMh2AYeg, i13) >= 0) {
                    break;
                }
                i11++;
            }
            while (Intrinsics.compare(UShortArray.m104183getMh2AYeg(sArr, i12) & UShort.MAX_VALUE, i13) > 0) {
                i12--;
            }
            if (i11 <= i12) {
                short sM104183getMh2AYeg2 = UShortArray.m104183getMh2AYeg(sArr, i11);
                UShortArray.m104188set01HTLdE(sArr, i11, UShortArray.m104183getMh2AYeg(sArr, i12));
                UShortArray.m104188set01HTLdE(sArr, i12, sM104183getMh2AYeg2);
                i11++;
                i12--;
            }
        }
        return i11;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m104302partitionoBK06Vg(int[] iArr, int i11, int i12) {
        int iM103999getpVg5ArA = UIntArray.m103999getpVg5ArA(iArr, (i11 + i12) / 2);
        while (i11 <= i12) {
            while (Integer.compare(UIntArray.m103999getpVg5ArA(iArr, i11) ^ Integer.MIN_VALUE, iM103999getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i11++;
            }
            while (Integer.compare(UIntArray.m103999getpVg5ArA(iArr, i12) ^ Integer.MIN_VALUE, iM103999getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i12--;
            }
            if (i11 <= i12) {
                int iM103999getpVg5ArA2 = UIntArray.m103999getpVg5ArA(iArr, i11);
                UIntArray.m104004setVXSXFK8(iArr, i11, UIntArray.m103999getpVg5ArA(iArr, i12));
                UIntArray.m104004setVXSXFK8(iArr, i12, iM103999getpVg5ArA2);
                i11++;
                i12--;
            }
        }
        return i11;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m104307sortArraynroSd4(@NotNull long[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        m104303quickSortnroSd4(array, i11, i12 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m104308sortArray4UcCI2c(@NotNull byte[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        m104304quickSort4UcCI2c(array, i11, i12 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m104309sortArrayAa5vz7o(@NotNull short[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        m104305quickSortAa5vz7o(array, i11, i12 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m104310sortArrayoBK06Vg(@NotNull int[] array, int i11, int i12) {
        Intrinsics.checkNotNullParameter(array, "array");
        m104306quickSortoBK06Vg(array, i11, i12 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m104303quickSortnroSd4(long[] jArr, int i11, int i12) {
        int iM104299partitionnroSd4 = m104299partitionnroSd4(jArr, i11, i12);
        int i13 = iM104299partitionnroSd4 - 1;
        if (i11 < i13) {
            m104303quickSortnroSd4(jArr, i11, i13);
        }
        if (iM104299partitionnroSd4 < i12) {
            m104303quickSortnroSd4(jArr, iM104299partitionnroSd4, i12);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m104304quickSort4UcCI2c(byte[] bArr, int i11, int i12) {
        int iM104300partition4UcCI2c = m104300partition4UcCI2c(bArr, i11, i12);
        int i13 = iM104300partition4UcCI2c - 1;
        if (i11 < i13) {
            m104304quickSort4UcCI2c(bArr, i11, i13);
        }
        if (iM104300partition4UcCI2c < i12) {
            m104304quickSort4UcCI2c(bArr, iM104300partition4UcCI2c, i12);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m104305quickSortAa5vz7o(short[] sArr, int i11, int i12) {
        int iM104301partitionAa5vz7o = m104301partitionAa5vz7o(sArr, i11, i12);
        int i13 = iM104301partitionAa5vz7o - 1;
        if (i11 < i13) {
            m104305quickSortAa5vz7o(sArr, i11, i13);
        }
        if (iM104301partitionAa5vz7o < i12) {
            m104305quickSortAa5vz7o(sArr, iM104301partitionAa5vz7o, i12);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m104306quickSortoBK06Vg(int[] iArr, int i11, int i12) {
        int iM104302partitionoBK06Vg = m104302partitionoBK06Vg(iArr, i11, i12);
        int i13 = iM104302partitionoBK06Vg - 1;
        if (i11 < i13) {
            m104306quickSortoBK06Vg(iArr, i11, i13);
        }
        if (iM104302partitionoBK06Vg < i12) {
            m104306quickSortoBK06Vg(iArr, iM104302partitionoBK06Vg, i12);
        }
    }
}
