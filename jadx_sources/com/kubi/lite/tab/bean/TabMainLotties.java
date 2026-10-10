package com.kubi.lite.tab.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabConfig.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/lite/tab/bean/TabMainLotties;", "", "lottie", "", "lottieNight", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLottie", "()Ljava/lang/String;", "getLottieNight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabMainLotties {

    @NotNull
    private final String lottie;

    @NotNull
    private final String lottieNight;

    /* JADX WARN: Multi-variable type inference failed */
    public TabMainLotties() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabMainLotties)) {
            return false;
        }
        TabMainLotties tabMainLotties = (TabMainLotties) other;
        return Intrinsics.areEqual(this.lottie, tabMainLotties.lottie) && Intrinsics.areEqual(this.lottieNight, tabMainLotties.lottieNight);
    }

    public TabMainLotties(@NotNull String lottie, @NotNull String lottieNight) {
        Intrinsics.checkNotNullParameter(lottie, "lottie");
        Intrinsics.checkNotNullParameter(lottieNight, "lottieNight");
        this.lottie = lottie;
        this.lottieNight = lottieNight;
    }

    public static /* synthetic */ TabMainLotties copy$default(TabMainLotties tabMainLotties, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabMainLotties.lottie;
        }
        if ((i11 & 2) != 0) {
            str2 = tabMainLotties.lottieNight;
        }
        return tabMainLotties.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLottie() {
        return this.lottie;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLottieNight() {
        return this.lottieNight;
    }

    @NotNull
    public final TabMainLotties copy(@NotNull String lottie, @NotNull String lottieNight) {
        Intrinsics.checkNotNullParameter(lottie, "lottie");
        Intrinsics.checkNotNullParameter(lottieNight, "lottieNight");
        return new TabMainLotties(lottie, lottieNight);
    }

    @NotNull
    public final String getLottie() {
        return this.lottie;
    }

    @NotNull
    public final String getLottieNight() {
        return this.lottieNight;
    }

    public int hashCode() {
        return (this.lottie.hashCode() * 31) + this.lottieNight.hashCode();
    }

    @NotNull
    public String toString() {
        return "TabMainLotties(lottie=" + this.lottie + ", lottieNight=" + this.lottieNight + ')';
    }

    public /* synthetic */ TabMainLotties(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
