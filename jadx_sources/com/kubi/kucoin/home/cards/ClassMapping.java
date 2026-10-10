package com.kubi.kucoin.home.cards;

import com.tencent.bugly.proguard.C33954u6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.cards.h, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: ClassMapping.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\r\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\r\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kucoin/home/cards/ClassMapping;", "", C33954u6.f72238i, "Ljava/lang/Class;", "card", "data", "interceptor", "Lcom/kubi/kucoin/home/cards/CardInterceptor;", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/kubi/kucoin/home/cards/CardInterceptor;)V", "getHolder", "()Ljava/lang/Class;", "getCard", "getData", "getInterceptor", "()Lcom/kubi/kucoin/home/cards/CardInterceptor;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ClassMapping {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final Class<?> holder;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final Class<?> card;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final Class<?> data;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final CardInterceptor interceptor;

    public ClassMapping(@NotNull Class<?> holder, @NotNull Class<?> card, @NotNull Class<?> data, @Nullable CardInterceptor cardInterceptor) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        this.holder = holder;
        this.card = card;
        this.data = data;
        this.interceptor = cardInterceptor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassMapping)) {
            return false;
        }
        ClassMapping classMapping = (ClassMapping) other;
        return Intrinsics.areEqual(this.holder, classMapping.holder) && Intrinsics.areEqual(this.card, classMapping.card) && Intrinsics.areEqual(this.data, classMapping.data) && Intrinsics.areEqual(this.interceptor, classMapping.interceptor);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Class<?> m32216a() {
        return this.card;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Class<?> m32217b() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Class<?> m32218c() {
        return this.holder;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final CardInterceptor getInterceptor() {
        return this.interceptor;
    }

    public int hashCode() {
        int iHashCode = ((((this.holder.hashCode() * 31) + this.card.hashCode()) * 31) + this.data.hashCode()) * 31;
        CardInterceptor cardInterceptor = this.interceptor;
        return iHashCode + (cardInterceptor == null ? 0 : cardInterceptor.hashCode());
    }

    @NotNull
    public String toString() {
        return "ClassMapping(holder=" + this.holder + ", card=" + this.card + ", data=" + this.data + ", interceptor=" + this.interceptor + ')';
    }

    public /* synthetic */ ClassMapping(Class cls, Class cls2, Class cls3, CardInterceptor cardInterceptor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, cls2, cls3, (i11 & 8) != 0 ? null : cardInterceptor);
    }
}
