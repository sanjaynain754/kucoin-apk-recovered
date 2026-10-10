package p852kotlin.coroutines.jvm.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.JvmName;

/* JADX INFO: compiled from: boxing.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\fH\u0001\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0012H\u0001\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0015H\u0001\u001a\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0018H\u0001¨\u0006\u0019"}, m90084d2 = {"boxBoolean", "Ljava/lang/Boolean;", "primitive", "", "boxByte", "Ljava/lang/Byte;", "", "boxShort", "Ljava/lang/Short;", "", "boxInt", "Ljava/lang/Integer;", "", "boxLong", "Ljava/lang/Long;", "", "boxFloat", "Ljava/lang/Float;", "", "boxDouble", "Ljava/lang/Double;", "", "boxChar", "Ljava/lang/Character;", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "Boxing")
public final class Boxing {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Character boxChar(char c11) {
        return new Character(c11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Double boxDouble(double d11) {
        return new Double(d11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Float boxFloat(float f11) {
        return new Float(f11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Integer boxInt(int i11) {
        return new Integer(i11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Long boxLong(long j11) {
        return new Long(j11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Short boxShort(short s11) {
        return new Short(s11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Boolean boxBoolean(boolean z11) {
        return Boolean.valueOf(z11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Byte boxByte(byte b11) {
        return Byte.valueOf(b11);
    }
}
