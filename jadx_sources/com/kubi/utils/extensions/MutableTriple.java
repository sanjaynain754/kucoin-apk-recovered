package com.kubi.utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionsEx.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0002¢\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u00028\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u00028\u0002X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/utils/extensions/MutableTriple;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "Ljava/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "setFirst", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getSecond", "setSecond", "getThird", "setThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/kubi/utils/extensions/MutableTriple;", "equals", "", "other", "", "hashCode", "", "toString", "", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class MutableTriple<A, B, C> implements Serializable {
    private A first;
    private B second;
    private C third;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutableTriple)) {
            return false;
        }
        MutableTriple mutableTriple = (MutableTriple) other;
        return Intrinsics.areEqual(this.first, mutableTriple.first) && Intrinsics.areEqual(this.second, mutableTriple.second) && Intrinsics.areEqual(this.third, mutableTriple.third);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableTriple copy$default(MutableTriple mutableTriple, Object obj, Object obj2, Object obj3, int i11, Object obj4) {
        if ((i11 & 1) != 0) {
            obj = mutableTriple.first;
        }
        if ((i11 & 2) != 0) {
            obj2 = mutableTriple.second;
        }
        if ((i11 & 4) != 0) {
            obj3 = mutableTriple.third;
        }
        return mutableTriple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    @NotNull
    public final MutableTriple<A, B, C> copy(A first, B second, C third2) {
        return new MutableTriple<>(first, second, third2);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public int hashCode() {
        A a11 = this.first;
        int iHashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.second;
        int iHashCode2 = (iHashCode + (b11 == null ? 0 : b11.hashCode())) * 31;
        C c11 = this.third;
        return iHashCode2 + (c11 != null ? c11.hashCode() : 0);
    }

    public final void setFirst(A a11) {
        this.first = a11;
    }

    public final void setSecond(B b11) {
        this.second = b11;
    }

    public final void setThird(C c11) {
        this.third = c11;
    }

    @NotNull
    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }

    public MutableTriple(A a11, B b11, C c11) {
        this.first = a11;
        this.second = b11;
        this.third = c11;
    }
}
