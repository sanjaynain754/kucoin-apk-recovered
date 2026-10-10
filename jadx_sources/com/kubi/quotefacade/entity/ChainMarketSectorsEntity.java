package com.kubi.quotefacade.entity;

import androidx.annotation.Keep;
import com.kubi.kucoin.utils.DayNightThemeManager;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainMarketSectorsEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;", "", "id", "", "conceptBlockName", "tokenPriceChange", "Ljava/math/BigDecimal;", "backgroundImg", "backgroundImgBlack", "topLogo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getConceptBlockName", "getTokenPriceChange", "()Ljava/math/BigDecimal;", "getBackgroundImg", "getBackgroundImgBlack", "getTopLogo", "()Ljava/util/List;", "bgImage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainMarketSectorsEntity {

    @Nullable
    private final String backgroundImg;

    @Nullable
    private final String backgroundImgBlack;

    @Nullable
    private final String conceptBlockName;

    @Nullable
    private final String id;

    @Nullable
    private final BigDecimal tokenPriceChange;

    @Nullable
    private final List<String> topLogo;

    public ChainMarketSectorsEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChainMarketSectorsEntity)) {
            return false;
        }
        ChainMarketSectorsEntity chainMarketSectorsEntity = (ChainMarketSectorsEntity) other;
        return Intrinsics.areEqual(this.id, chainMarketSectorsEntity.id) && Intrinsics.areEqual(this.conceptBlockName, chainMarketSectorsEntity.conceptBlockName) && Intrinsics.areEqual(this.tokenPriceChange, chainMarketSectorsEntity.tokenPriceChange) && Intrinsics.areEqual(this.backgroundImg, chainMarketSectorsEntity.backgroundImg) && Intrinsics.areEqual(this.backgroundImgBlack, chainMarketSectorsEntity.backgroundImgBlack) && Intrinsics.areEqual(this.topLogo, chainMarketSectorsEntity.topLogo);
    }

    public ChainMarketSectorsEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        this.id = str;
        this.conceptBlockName = str2;
        this.tokenPriceChange = bigDecimal;
        this.backgroundImg = str3;
        this.backgroundImgBlack = str4;
        this.topLogo = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChainMarketSectorsEntity copy$default(ChainMarketSectorsEntity chainMarketSectorsEntity, String str, String str2, BigDecimal bigDecimal, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = chainMarketSectorsEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = chainMarketSectorsEntity.conceptBlockName;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = chainMarketSectorsEntity.tokenPriceChange;
        }
        if ((i11 & 8) != 0) {
            str3 = chainMarketSectorsEntity.backgroundImg;
        }
        if ((i11 & 16) != 0) {
            str4 = chainMarketSectorsEntity.backgroundImgBlack;
        }
        if ((i11 & 32) != 0) {
            list = chainMarketSectorsEntity.topLogo;
        }
        String str5 = str4;
        List list2 = list;
        return chainMarketSectorsEntity.copy(str, str2, bigDecimal, str3, str5, list2);
    }

    @NotNull
    public final String bgImage() {
        if (DayNightThemeManager.f28592a.m33187l()) {
            String str = this.backgroundImg;
            return str == null ? "" : str;
        }
        String str2 = this.backgroundImgBlack;
        return str2 == null ? "" : str2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConceptBlockName() {
        return this.conceptBlockName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTokenPriceChange() {
        return this.tokenPriceChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundImgBlack() {
        return this.backgroundImgBlack;
    }

    @Nullable
    public final List<String> component6() {
        return this.topLogo;
    }

    @NotNull
    public final ChainMarketSectorsEntity copy(@Nullable String id2, @Nullable String conceptBlockName, @Nullable BigDecimal tokenPriceChange, @Nullable String backgroundImg, @Nullable String backgroundImgBlack, @Nullable List<String> topLogo) {
        return new ChainMarketSectorsEntity(id2, conceptBlockName, tokenPriceChange, backgroundImg, backgroundImgBlack, topLogo);
    }

    @Nullable
    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    @Nullable
    public final String getBackgroundImgBlack() {
        return this.backgroundImgBlack;
    }

    @Nullable
    public final String getConceptBlockName() {
        return this.conceptBlockName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getTokenPriceChange() {
        return this.tokenPriceChange;
    }

    @Nullable
    public final List<String> getTopLogo() {
        return this.topLogo;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conceptBlockName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.tokenPriceChange;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.backgroundImg;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundImgBlack;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.topLogo;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChainMarketSectorsEntity(id=" + this.id + ", conceptBlockName=" + this.conceptBlockName + ", tokenPriceChange=" + this.tokenPriceChange + ", backgroundImg=" + this.backgroundImg + ", backgroundImgBlack=" + this.backgroundImgBlack + ", topLogo=" + this.topLogo + ')';
    }

    public /* synthetic */ ChainMarketSectorsEntity(String str, String str2, BigDecimal bigDecimal, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : list);
    }
}
