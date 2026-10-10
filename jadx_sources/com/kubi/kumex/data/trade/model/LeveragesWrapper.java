package com.kubi.kumex.data.trade.model;

import com.kubi.kumex.data.trade.model.LeveragesWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ComposeUserEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0000J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;", "", "leverages", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "throwable", "", "<init>", "(Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;Ljava/lang/Throwable;)V", "getLeverages", "()Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "getThrowable", "()Ljava/lang/Throwable;", "deepCopy", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeveragesWrapper {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f28839c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<LeveragesWrapper> f28840d = LazyKt.lazy(new Function0() { // from class: cm.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeveragesWrapper.m33463b();
        }
    });

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final SymbolsCrossLeverage leverages;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final Throwable throwable;

    /* JADX INFO: compiled from: ComposeUserEntity.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/LeveragesWrapper$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;", "getDEFAULT", "()Lcom/kubi/kumex/data/trade/model/LeveragesWrapper;", "DEFAULT$delegate", "Lkotlin/Lazy;", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final LeveragesWrapper getDEFAULT() {
            return (LeveragesWrapper) LeveragesWrapper.f28840d.getValue();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeveragesWrapper)) {
            return false;
        }
        LeveragesWrapper leveragesWrapper = (LeveragesWrapper) other;
        return Intrinsics.areEqual(this.leverages, leveragesWrapper.leverages) && Intrinsics.areEqual(this.throwable, leveragesWrapper.throwable);
    }

    public LeveragesWrapper(@NotNull SymbolsCrossLeverage leverages, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(leverages, "leverages");
        this.leverages = leverages;
        this.throwable = th2;
    }

    /* JADX INFO: renamed from: b */
    public static final LeveragesWrapper m33463b() {
        return new LeveragesWrapper(new SymbolsCrossLeverage(), null);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SymbolsCrossLeverage getLeverages() {
        return this.leverages;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = this.leverages.hashCode() * 31;
        Throwable th2 = this.throwable;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @NotNull
    public String toString() {
        return "LeveragesWrapper(leverages=" + this.leverages + ", throwable=" + this.throwable + ')';
    }
}
