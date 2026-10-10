package p852kotlin.uuid;

import io.flutter.plugin.editing.SpellCheckPlugin;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UuidJVM.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001\u001a,\u0010\n\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0001\u001a\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0001\u001a\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0014H\u0001\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0001H\u0087\b\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0007\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\r\u0010\u001d\u001a\u00020\u0006*\u00020\u0006H\u0080\b¨\u0006\u001e"}, m90084d2 = {"secureRandomUuid", "Lkotlin/uuid/Uuid;", "serializedUuid", "", "uuid", "getLongAt", "", "", "index", "", "formatBytesInto", "", "dst", "dstOffset", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "setLongAt", "value", "uuidParseHexDash", "hexDashString", "", "uuidParseHex", "hexString", "toKotlinUuid", "Ljava/util/UUID;", "toJavaUuid", "getUuid", "Ljava/nio/ByteBuffer;", "putUuid", "reverseBytes", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,277:1\n277#1:278\n277#1:279\n277#1:280\n277#1:281\n277#1:282\n277#1:283\n277#1:284\n277#1:285\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n139#1:278\n140#1:279\n184#1:280\n185#1:281\n224#1:282\n225#1:283\n271#1:284\n272#1:285\n*E\n"})
class UuidKt__UuidJVMKt {
    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid getUuid(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long jReverseBytes = byteBuffer.getLong();
        long jReverseBytes2 = byteBuffer.getLong();
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        return Uuid.INSTANCE.fromLongs(jReverseBytes, jReverseBytes2);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final ByteBuffer putUuid(@NotNull ByteBuffer byteBuffer, @NotNull Uuid uuid) {
        ByteBuffer byteBufferPutLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            byteBufferPutLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            byteBufferPutLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
        return byteBufferPutLong;
    }

    @ExperimentalUuidApi
    public static final void formatBytesInto(long j11, @NotNull byte[] dst, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        UuidKt__UuidKt.formatBytesIntoCommonImpl(j11, dst, i11, i12, i13);
    }

    @ExperimentalUuidApi
    public static final long getLongAt(@NotNull byte[] bArr, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return UuidKt__UuidKt.getLongAtCommonImpl(bArr, i11);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid secureRandomUuid() {
        byte[] bArr = new byte[16];
        SecureRandomHolder.INSTANCE.getInstance().nextBytes(bArr);
        return UuidKt__UuidKt.uuidFromRandomBytes(bArr);
    }

    @ExperimentalUuidApi
    public static final void setLongAt(@NotNull byte[] bArr, int i11, long j11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        UuidKt__UuidKt.setLongAtCommonImpl(bArr, i11, j11);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final UUID toJavaUuid(@NotNull Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return new UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid toKotlinUuid(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return Uuid.INSTANCE.fromLongs(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHex(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return UuidKt__UuidKt.uuidParseHexCommonImpl(hexString);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexDash(@NotNull String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        return UuidKt__UuidKt.uuidParseHexDashCommonImpl(hexDashString);
    }

    public static final long reverseBytes(long j11) {
        return Long.reverseBytes(j11);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Object serializedUuid(@NotNull Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid getUuid(@NotNull ByteBuffer byteBuffer, int i11) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i11 >= 0) {
            if (i11 + 15 < byteBuffer.limit()) {
                long jReverseBytes = byteBuffer.getLong(i11);
                long jReverseBytes2 = byteBuffer.getLong(i11 + 8);
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                    jReverseBytes = Long.reverseBytes(jReverseBytes);
                    jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
                }
                return Uuid.INSTANCE.fromLongs(jReverseBytes, jReverseBytes2);
            }
            throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i11 + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i11);
    }

    @SinceKotlin(version = "2.0")
    @ExperimentalUuidApi
    @NotNull
    public static final ByteBuffer putUuid(@NotNull ByteBuffer byteBuffer, int i11, @NotNull Uuid uuid) {
        ByteBuffer byteBufferPutLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i11 >= 0) {
            if (i11 + 15 < byteBuffer.limit()) {
                if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                    byteBuffer.putLong(i11, mostSignificantBits);
                    byteBufferPutLong = byteBuffer.putLong(i11 + 8, leastSignificantBits);
                } else {
                    byteBuffer.putLong(i11, Long.reverseBytes(mostSignificantBits));
                    byteBufferPutLong = byteBuffer.putLong(i11 + 8, Long.reverseBytes(leastSignificantBits));
                }
                Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
                return byteBufferPutLong;
            }
            throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i11 + ", with limit: " + byteBuffer.limit() + ' ');
        }
        throw new IndexOutOfBoundsException("Negative index: " + i11);
    }
}
