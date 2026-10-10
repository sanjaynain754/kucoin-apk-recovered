package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FloatFloatPair.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006 "}, m90084d2 = {"Landroidx/collection/FloatFloatPair;", "", "first", "", "second", "constructor-impl", "(FF)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)F", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
public final class FloatFloatPair {

    @JvmField
    public final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m103449constructorimpl(long j11) {
        return j11;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m103445boximpl(long j11) {
        return new FloatFloatPair(j11);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m103446component1impl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m103448constructorimpl(float f11, float f12) {
        return m103449constructorimpl((((long) Float.floatToRawIntBits(f12)) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f11) << 32));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m103450equalsimpl(long j11, Object obj) {
        return (obj instanceof FloatFloatPair) && j11 == ((FloatFloatPair) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m103451equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m103452getFirstimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m103455toStringimpl(long j11) {
        return '(' + Float.intBitsToFloat((int) (j11 >> 32)) + ", " + Float.intBitsToFloat((int) (j11 & KeyboardMap.kValueMask)) + ')';
    }

    public boolean equals(Object obj) {
        return m103450equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m103454hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m103455toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ FloatFloatPair(long j11) {
        this.packedValue = j11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m103454hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m103447component2impl(long j11) {
        return Float.intBitsToFloat((int) (j11 & KeyboardMap.kValueMask));
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m103453getSecondimpl(long j11) {
        return Float.intBitsToFloat((int) (j11 & KeyboardMap.kValueMask));
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }
}
