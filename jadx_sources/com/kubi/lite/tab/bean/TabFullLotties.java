package com.kubi.lite.tab.bean;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TabConfig.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/lite/tab/bean/TabFullLotties;", "", "lottie", "", "lottieNight", "reverseLottie", "reverseLottieNight", "switchLottie", "switchLottieNight", "switchReverseLottie", "switchReverseLottieNight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLottie", "()Ljava/lang/String;", "getLottieNight", "getReverseLottie", "getReverseLottieNight", "getSwitchLottie", "getSwitchLottieNight", "getSwitchReverseLottie", "getSwitchReverseLottieNight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TabFullLotties {

    @NotNull
    private final String lottie;

    @NotNull
    private final String lottieNight;

    @NotNull
    private final String reverseLottie;

    @NotNull
    private final String reverseLottieNight;

    @NotNull
    private final String switchLottie;

    @NotNull
    private final String switchLottieNight;

    @NotNull
    private final String switchReverseLottie;

    @NotNull
    private final String switchReverseLottieNight;

    public TabFullLotties() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ TabFullLotties copy$default(TabFullLotties tabFullLotties, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabFullLotties.lottie;
        }
        if ((i11 & 2) != 0) {
            str2 = tabFullLotties.lottieNight;
        }
        if ((i11 & 4) != 0) {
            str3 = tabFullLotties.reverseLottie;
        }
        if ((i11 & 8) != 0) {
            str4 = tabFullLotties.reverseLottieNight;
        }
        if ((i11 & 16) != 0) {
            str5 = tabFullLotties.switchLottie;
        }
        if ((i11 & 32) != 0) {
            str6 = tabFullLotties.switchLottieNight;
        }
        if ((i11 & 64) != 0) {
            str7 = tabFullLotties.switchReverseLottie;
        }
        if ((i11 & 128) != 0) {
            str8 = tabFullLotties.switchReverseLottieNight;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return tabFullLotties.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @NotNull
    public final TabFullLotties copy(@NotNull String lottie, @NotNull String lottieNight, @NotNull String reverseLottie, @NotNull String reverseLottieNight, @NotNull String switchLottie, @NotNull String switchLottieNight, @NotNull String switchReverseLottie, @NotNull String switchReverseLottieNight) {
        Intrinsics.checkNotNullParameter(lottie, "lottie");
        Intrinsics.checkNotNullParameter(lottieNight, "lottieNight");
        Intrinsics.checkNotNullParameter(reverseLottie, "reverseLottie");
        Intrinsics.checkNotNullParameter(reverseLottieNight, "reverseLottieNight");
        Intrinsics.checkNotNullParameter(switchLottie, "switchLottie");
        Intrinsics.checkNotNullParameter(switchLottieNight, "switchLottieNight");
        Intrinsics.checkNotNullParameter(switchReverseLottie, "switchReverseLottie");
        Intrinsics.checkNotNullParameter(switchReverseLottieNight, "switchReverseLottieNight");
        return new TabFullLotties(lottie, lottieNight, reverseLottie, reverseLottieNight, switchLottie, switchLottieNight, switchReverseLottie, switchReverseLottieNight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabFullLotties)) {
            return false;
        }
        TabFullLotties tabFullLotties = (TabFullLotties) other;
        return Intrinsics.areEqual(this.lottie, tabFullLotties.lottie) && Intrinsics.areEqual(this.lottieNight, tabFullLotties.lottieNight) && Intrinsics.areEqual(this.reverseLottie, tabFullLotties.reverseLottie) && Intrinsics.areEqual(this.reverseLottieNight, tabFullLotties.reverseLottieNight) && Intrinsics.areEqual(this.switchLottie, tabFullLotties.switchLottie) && Intrinsics.areEqual(this.switchLottieNight, tabFullLotties.switchLottieNight) && Intrinsics.areEqual(this.switchReverseLottie, tabFullLotties.switchReverseLottie) && Intrinsics.areEqual(this.switchReverseLottieNight, tabFullLotties.switchReverseLottieNight);
    }

    public TabFullLotties(@NotNull String lottie, @NotNull String lottieNight, @NotNull String reverseLottie, @NotNull String reverseLottieNight, @NotNull String switchLottie, @NotNull String switchLottieNight, @NotNull String switchReverseLottie, @NotNull String switchReverseLottieNight) {
        Intrinsics.checkNotNullParameter(lottie, "lottie");
        Intrinsics.checkNotNullParameter(lottieNight, "lottieNight");
        Intrinsics.checkNotNullParameter(reverseLottie, "reverseLottie");
        Intrinsics.checkNotNullParameter(reverseLottieNight, "reverseLottieNight");
        Intrinsics.checkNotNullParameter(switchLottie, "switchLottie");
        Intrinsics.checkNotNullParameter(switchLottieNight, "switchLottieNight");
        Intrinsics.checkNotNullParameter(switchReverseLottie, "switchReverseLottie");
        Intrinsics.checkNotNullParameter(switchReverseLottieNight, "switchReverseLottieNight");
        this.lottie = lottie;
        this.lottieNight = lottieNight;
        this.reverseLottie = reverseLottie;
        this.reverseLottieNight = reverseLottieNight;
        this.switchLottie = switchLottie;
        this.switchLottieNight = switchLottieNight;
        this.switchReverseLottie = switchReverseLottie;
        this.switchReverseLottieNight = switchReverseLottieNight;
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
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReverseLottie() {
        return this.reverseLottie;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReverseLottieNight() {
        return this.reverseLottieNight;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSwitchLottie() {
        return this.switchLottie;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSwitchLottieNight() {
        return this.switchLottieNight;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSwitchReverseLottie() {
        return this.switchReverseLottie;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSwitchReverseLottieNight() {
        return this.switchReverseLottieNight;
    }

    @NotNull
    public final String getLottie() {
        return this.lottie;
    }

    @NotNull
    public final String getLottieNight() {
        return this.lottieNight;
    }

    @NotNull
    public final String getReverseLottie() {
        return this.reverseLottie;
    }

    @NotNull
    public final String getReverseLottieNight() {
        return this.reverseLottieNight;
    }

    @NotNull
    public final String getSwitchLottie() {
        return this.switchLottie;
    }

    @NotNull
    public final String getSwitchLottieNight() {
        return this.switchLottieNight;
    }

    @NotNull
    public final String getSwitchReverseLottie() {
        return this.switchReverseLottie;
    }

    @NotNull
    public final String getSwitchReverseLottieNight() {
        return this.switchReverseLottieNight;
    }

    public int hashCode() {
        return (((((((((((((this.lottie.hashCode() * 31) + this.lottieNight.hashCode()) * 31) + this.reverseLottie.hashCode()) * 31) + this.reverseLottieNight.hashCode()) * 31) + this.switchLottie.hashCode()) * 31) + this.switchLottieNight.hashCode()) * 31) + this.switchReverseLottie.hashCode()) * 31) + this.switchReverseLottieNight.hashCode();
    }

    @NotNull
    public String toString() {
        return "TabFullLotties(lottie=" + this.lottie + ", lottieNight=" + this.lottieNight + ", reverseLottie=" + this.reverseLottie + ", reverseLottieNight=" + this.reverseLottieNight + ", switchLottie=" + this.switchLottie + ", switchLottieNight=" + this.switchLottieNight + ", switchReverseLottie=" + this.switchReverseLottie + ", switchReverseLottieNight=" + this.switchReverseLottieNight + ')';
    }

    public /* synthetic */ TabFullLotties(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? "" : str8);
    }
}
