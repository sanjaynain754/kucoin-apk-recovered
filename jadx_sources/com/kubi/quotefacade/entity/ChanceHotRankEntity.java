package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeChanceEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006-"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;", "", "title", "", "downNum", "", "upNum", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/quotefacade/entity/ChanceHotRankItem;", "config", "Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getDownNum", "()Ljava/lang/Integer;", "setDownNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUpNum", "setUpNum", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getConfig", "()Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;", "setConfig", "(Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/kubi/quotefacade/entity/ChanceDiscoverConfig;)Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;", "equals", "", "other", "hashCode", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChanceHotRankEntity {

    @Nullable
    private ChanceDiscoverConfig config;

    @Nullable
    private Integer downNum;

    @Nullable
    private List<ChanceHotRankItem> items;

    @Nullable
    private String title;

    @Nullable
    private Integer upNum;

    public ChanceHotRankEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanceHotRankEntity)) {
            return false;
        }
        ChanceHotRankEntity chanceHotRankEntity = (ChanceHotRankEntity) other;
        return Intrinsics.areEqual(this.title, chanceHotRankEntity.title) && Intrinsics.areEqual(this.downNum, chanceHotRankEntity.downNum) && Intrinsics.areEqual(this.upNum, chanceHotRankEntity.upNum) && Intrinsics.areEqual(this.items, chanceHotRankEntity.items) && Intrinsics.areEqual(this.config, chanceHotRankEntity.config);
    }

    public ChanceHotRankEntity(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<ChanceHotRankItem> list, @Nullable ChanceDiscoverConfig chanceDiscoverConfig) {
        this.title = str;
        this.downNum = num;
        this.upNum = num2;
        this.items = list;
        this.config = chanceDiscoverConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChanceHotRankEntity copy$default(ChanceHotRankEntity chanceHotRankEntity, String str, Integer num, Integer num2, List list, ChanceDiscoverConfig chanceDiscoverConfig, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chanceHotRankEntity.title;
        }
        if ((i11 & 2) != 0) {
            num = chanceHotRankEntity.downNum;
        }
        if ((i11 & 4) != 0) {
            num2 = chanceHotRankEntity.upNum;
        }
        if ((i11 & 8) != 0) {
            list = chanceHotRankEntity.items;
        }
        if ((i11 & 16) != 0) {
            chanceDiscoverConfig = chanceHotRankEntity.config;
        }
        ChanceDiscoverConfig chanceDiscoverConfig2 = chanceDiscoverConfig;
        Integer num3 = num2;
        return chanceHotRankEntity.copy(str, num, num3, list, chanceDiscoverConfig2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDownNum() {
        return this.downNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getUpNum() {
        return this.upNum;
    }

    @Nullable
    public final List<ChanceHotRankItem> component4() {
        return this.items;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChanceDiscoverConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final ChanceHotRankEntity copy(@Nullable String title, @Nullable Integer downNum, @Nullable Integer upNum, @Nullable List<ChanceHotRankItem> items, @Nullable ChanceDiscoverConfig config) {
        return new ChanceHotRankEntity(title, downNum, upNum, items, config);
    }

    @Nullable
    public final ChanceDiscoverConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final Integer getDownNum() {
        return this.downNum;
    }

    @Nullable
    public final List<ChanceHotRankItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getUpNum() {
        return this.upNum;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.downNum;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.upNum;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<ChanceHotRankItem> list = this.items;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ChanceDiscoverConfig chanceDiscoverConfig = this.config;
        return iHashCode4 + (chanceDiscoverConfig != null ? chanceDiscoverConfig.hashCode() : 0);
    }

    public final void setConfig(@Nullable ChanceDiscoverConfig chanceDiscoverConfig) {
        this.config = chanceDiscoverConfig;
    }

    public final void setDownNum(@Nullable Integer num) {
        this.downNum = num;
    }

    public final void setItems(@Nullable List<ChanceHotRankItem> list) {
        this.items = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUpNum(@Nullable Integer num) {
        this.upNum = num;
    }

    @NotNull
    public String toString() {
        return "ChanceHotRankEntity(title=" + this.title + ", downNum=" + this.downNum + ", upNum=" + this.upNum + ", items=" + this.items + ", config=" + this.config + ')';
    }

    public /* synthetic */ ChanceHotRankEntity(String str, Integer num, Integer num2, List list, ChanceDiscoverConfig chanceDiscoverConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : chanceDiscoverConfig);
    }
}
