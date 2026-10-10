package com.kubi.home.gembox;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GemboxCardPushData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/gembox/GemboxCardPushData;", "", "currencyList", "", "Lcom/kubi/home/gembox/GemboxCardData$Data;", "<init>", "(Ljava/util/List;)V", "getCurrencyList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GemboxCardPushData {

    @NotNull
    private final List<GemboxCardData.Data> currencyList;

    /* JADX WARN: Multi-variable type inference failed */
    public GemboxCardPushData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GemboxCardPushData) && Intrinsics.areEqual(this.currencyList, ((GemboxCardPushData) other).currencyList);
    }

    public GemboxCardPushData(@NotNull List<GemboxCardData.Data> currencyList) {
        Intrinsics.checkNotNullParameter(currencyList, "currencyList");
        this.currencyList = currencyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GemboxCardPushData copy$default(GemboxCardPushData gemboxCardPushData, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gemboxCardPushData.currencyList;
        }
        return gemboxCardPushData.copy(list);
    }

    @NotNull
    public final List<GemboxCardData.Data> component1() {
        return this.currencyList;
    }

    @NotNull
    public final GemboxCardPushData copy(@NotNull List<GemboxCardData.Data> currencyList) {
        Intrinsics.checkNotNullParameter(currencyList, "currencyList");
        return new GemboxCardPushData(currencyList);
    }

    @NotNull
    public final List<GemboxCardData.Data> getCurrencyList() {
        return this.currencyList;
    }

    public int hashCode() {
        return this.currencyList.hashCode();
    }

    @NotNull
    public String toString() {
        return "GemboxCardPushData(currencyList=" + this.currencyList + ')';
    }

    public /* synthetic */ GemboxCardPushData(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
