package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: IntIntPair.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006\u001e"}, m90084d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
public final class IntIntPair {

    @JvmField
    public final long packedValue;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m103461constructorimpl(long j11) {
        return j11;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m103457boximpl(long j11) {
        return new IntIntPair(j11);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m103458component1impl(long j11) {
        return (int) (j11 >> 32);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m103460constructorimpl(int i11, int i12) {
        return m103461constructorimpl((((long) i12) & KeyboardMap.kValueMask) | (((long) i11) << 32));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m103462equalsimpl(long j11, Object obj) {
        return (obj instanceof IntIntPair) && j11 == ((IntIntPair) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m103463equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m103464getFirstimpl(long j11) {
        return (int) (j11 >> 32);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m103467toStringimpl(long j11) {
        return '(' + m103464getFirstimpl(j11) + ", " + m103465getSecondimpl(j11) + ')';
    }

    public boolean equals(Object obj) {
        return m103462equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m103466hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m103467toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ IntIntPair(long j11) {
        this.packedValue = j11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m103466hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m103459component2impl(long j11) {
        return (int) (j11 & KeyboardMap.kValueMask);
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m103465getSecondimpl(long j11) {
        return (int) (j11 & KeyboardMap.kValueMask);
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }
}
