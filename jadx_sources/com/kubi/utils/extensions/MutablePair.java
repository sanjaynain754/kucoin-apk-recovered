package com.kubi.utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionsEx.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\u0004\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u00028\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/utils/extensions/MutablePair;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Ljava/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "setFirst", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getSecond", "setSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/kubi/utils/extensions/MutablePair;", "equals", "", "other", "", "hashCode", "", "toString", "", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class MutablePair<A, B> implements Serializable {
    private A first;
    private B second;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutablePair)) {
            return false;
        }
        MutablePair mutablePair = (MutablePair) other;
        return Intrinsics.areEqual(this.first, mutablePair.first) && Intrinsics.areEqual(this.second, mutablePair.second);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutablePair copy$default(MutablePair mutablePair, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = mutablePair.first;
        }
        if ((i11 & 2) != 0) {
            obj2 = mutablePair.second;
        }
        return mutablePair.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    @NotNull
    public final MutablePair<A, B> copy(A first, B second) {
        return new MutablePair<>(first, second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a11 = this.first;
        int iHashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.second;
        return iHashCode + (b11 != null ? b11.hashCode() : 0);
    }

    public final void setFirst(A a11) {
        this.first = a11;
    }

    public final void setSecond(B b11) {
        this.second = b11;
    }

    @NotNull
    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }

    public MutablePair(A a11, B b11) {
        this.first = a11;
        this.second = b11;
    }
}
