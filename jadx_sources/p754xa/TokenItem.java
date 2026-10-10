package p754xa;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.exchange.model.MarginConvertItem;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xa.f, reason: from toString */
/* JADX INFO: compiled from: MarginConvertItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/exchange/model/TokenItem;", "Lcom/kubi/assets/exchange/model/MarginConvertItem;", FirebaseAnalytics.Param.CURRENCY, "", "availableAmount", "Ljava/math/BigDecimal;", "estimatedExchangeAmount", "estimatedFee", "isSelected", "", "positionType", "positionTag", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getAvailableAmount", "()Ljava/math/BigDecimal;", "getEstimatedExchangeAmount", "getEstimatedFee", "()Z", "setSelected", "(Z)V", "getPositionType", "getPositionTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TokenItem extends MarginConvertItem {

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String currency;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final BigDecimal availableAmount;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final BigDecimal estimatedExchangeAmount;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final BigDecimal estimatedFee;

    /* JADX INFO: renamed from: h, reason: from toString */
    public boolean isSelected;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public final String positionType;

    /* JADX INFO: renamed from: j, reason: from toString */
    @Nullable
    public final String positionTag;

    public TokenItem(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, boolean z11, @Nullable String str2, @Nullable String str3) {
        super(4, null);
        this.currency = str;
        this.availableAmount = bigDecimal;
        this.estimatedExchangeAmount = bigDecimal2;
        this.estimatedFee = bigDecimal3;
        this.isSelected = z11;
        this.positionType = str2;
        this.positionTag = str3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenItem)) {
            return false;
        }
        TokenItem tokenItem = (TokenItem) other;
        return Intrinsics.areEqual(this.currency, tokenItem.currency) && Intrinsics.areEqual(this.availableAmount, tokenItem.availableAmount) && Intrinsics.areEqual(this.estimatedExchangeAmount, tokenItem.estimatedExchangeAmount) && Intrinsics.areEqual(this.estimatedFee, tokenItem.estimatedFee) && this.isSelected == tokenItem.isSelected && Intrinsics.areEqual(this.positionType, tokenItem.positionType) && Intrinsics.areEqual(this.positionTag, tokenItem.positionTag);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getEstimatedExchangeAmount() {
        return this.estimatedExchangeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getEstimatedFee() {
        return this.estimatedFee;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPositionTag() {
        return this.positionTag;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPositionType() {
        return this.positionType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: h */
    public final void m101621h(boolean z11) {
        this.isSelected = z11;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.availableAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.estimatedExchangeAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.estimatedFee;
        int iHashCode4 = (((iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        String str2 = this.positionType;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.positionTag;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TokenItem(currency=" + this.currency + ", availableAmount=" + this.availableAmount + ", estimatedExchangeAmount=" + this.estimatedExchangeAmount + ", estimatedFee=" + this.estimatedFee + ", isSelected=" + this.isSelected + ", positionType=" + this.positionType + ", positionTag=" + this.positionTag + ')';
    }
}
