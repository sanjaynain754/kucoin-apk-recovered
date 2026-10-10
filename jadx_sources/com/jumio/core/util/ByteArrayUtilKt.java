package com.jumio.core.util;

import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00020\u0003\"\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u0018\u0010\b\u001a\u00020\u0006*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¨\u0006\u000f"}, m90084d2 = {"byteArrayOfInts", "", "ints", "", "", "startsWith", "", JPushConstants.Operation.KEY_SEQUENCE, "startsWithAny", "sequenceList", "", "trim", "size", "findSequence", "startFrom", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nByteArrayUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArrayUtil.kt\ncom/jumio/core/util/ByteArrayUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class ByteArrayUtilKt {
    @NotNull
    public static final byte[] byteArrayOfInts(@NotNull int... ints) {
        Intrinsics.checkNotNullParameter(ints, "ints");
        int length = ints.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) ints[i11];
        }
        return bArr;
    }

    public static final int findSequence(@NotNull byte[] bArr, @NotNull byte[] sequence, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        if (sequence.length == 0) {
            throw new IllegalArgumentException("non-empty byte sequence is required");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("startFrom must be non-negative");
        }
        int i12 = i11;
        int i13 = 0;
        while (i11 < bArr.length) {
            if (bArr[i11] == sequence[i13]) {
                int i14 = i13 + 1;
                if (i13 == 0) {
                    i12 = i11;
                }
                if (i14 == sequence.length) {
                    return i12;
                }
                i13 = i14;
            } else {
                i13 = 0;
            }
            i11++;
        }
        return -1;
    }

    public static /* synthetic */ int findSequence$default(byte[] bArr, byte[] bArr2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return findSequence(bArr, bArr2, i11);
    }

    public static final boolean startsWith(@NotNull byte[] bArr, @NotNull byte[] sequence) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        if (sequence.length == 0) {
            throw new IllegalArgumentException("non-empty byte sequence is required");
        }
        if (bArr.length < sequence.length) {
            throw new IllegalArgumentException("sequence exceeds array length");
        }
        int length = sequence.length;
        boolean z11 = true;
        for (int i11 = 0; i11 < length; i11++) {
            z11 = z11 && bArr[i11] == sequence[i11];
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[RETURN] */
    public static final boolean startsWithAny(@NotNull byte[] bArr, @NotNull List<byte[]> sequenceList) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(sequenceList, "sequenceList");
        for (Object obj : sequenceList) {
            if (startsWith(bArr, (byte[]) obj)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final byte[] trim(@NotNull byte[] bArr, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i11);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }
}
