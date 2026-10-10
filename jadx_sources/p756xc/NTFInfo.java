package p756xc;

import com.kubi.core.spot.entity.NFTEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xc.b, reason: from toString */
/* JADX INFO: compiled from: SymbolQuoteData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/base/arch/api/data/NTFInfo;", "", "symbol", "", "baseCurrencyName", "isNft", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/spot/entity/NFTEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/kubi/core/spot/entity/NFTEntity;)V", "getSymbol", "()Ljava/lang/String;", "getBaseCurrencyName", "()Z", "getEntity", "()Lcom/kubi/core/spot/entity/NFTEntity;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NTFInfo {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String baseCurrencyName;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isNft;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final NFTEntity entity;

    public NTFInfo() {
        this(null, null, false, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NTFInfo)) {
            return false;
        }
        NTFInfo nTFInfo = (NTFInfo) other;
        return Intrinsics.areEqual(this.symbol, nTFInfo.symbol) && Intrinsics.areEqual(this.baseCurrencyName, nTFInfo.baseCurrencyName) && this.isNft == nTFInfo.isNft && Intrinsics.areEqual(this.entity, nTFInfo.entity);
    }

    public NTFInfo(@NotNull String symbol, @NotNull String baseCurrencyName, boolean z11, @Nullable NFTEntity nFTEntity) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        this.symbol = symbol;
        this.baseCurrencyName = baseCurrencyName;
        this.isNft = z11;
        this.entity = nFTEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final NFTEntity getEntity() {
        return this.entity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsNft() {
        return this.isNft;
    }

    public int hashCode() {
        int iHashCode = ((((this.symbol.hashCode() * 31) + this.baseCurrencyName.hashCode()) * 31) + Boolean.hashCode(this.isNft)) * 31;
        NFTEntity nFTEntity = this.entity;
        return iHashCode + (nFTEntity == null ? 0 : nFTEntity.hashCode());
    }

    @NotNull
    public String toString() {
        return "NTFInfo(symbol=" + this.symbol + ", baseCurrencyName=" + this.baseCurrencyName + ", isNft=" + this.isNft + ", entity=" + this.entity + ')';
    }

    public /* synthetic */ NTFInfo(String str, String str2, boolean z11, NFTEntity nFTEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : nFTEntity);
    }
}
