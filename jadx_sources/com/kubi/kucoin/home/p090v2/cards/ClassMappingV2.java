package com.kubi.kucoin.home.p090v2.cards;

import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.f, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: ClassMappingV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "", C33954u6.f72238i, "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getHolder", "()Ljava/lang/Class;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClassMappingV2 {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final Class<?> holder;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClassMappingV2) && Intrinsics.areEqual(this.holder, ((ClassMappingV2) other).holder);
    }

    public ClassMappingV2(@NotNull Class<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.holder = holder;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Class<?> m32263a() {
        return this.holder;
    }

    public int hashCode() {
        return this.holder.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassMappingV2(holder=" + this.holder + ')';
    }
}
