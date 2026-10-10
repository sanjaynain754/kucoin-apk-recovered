package p852kotlin;

import p852kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0002\u0010\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0087\b¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0087\b¢\u0006\u0002\u0010\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"toUInt", "Lkotlin/UInt;", "", "(B)I", "", "(S)I", "", "(I)I", "", "(J)I", "", "(F)I", "", "(D)I", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UIntKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(byte b11) {
        return UInt.m103939constructorimpl(b11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(short s11) {
        return UInt.m103939constructorimpl(s11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(int i11) {
        return UInt.m103939constructorimpl(i11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(long j11) {
        return UInt.m103939constructorimpl((int) j11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(float f11) {
        return UnsignedKt.doubleToUInt(f11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(double d11) {
        return UnsignedKt.doubleToUInt(d11);
    }
}
