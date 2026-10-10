package com.kubi.assets.exchange.model;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExchangeRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/exchange/model/PositionParam;", "", "type", "", "tag", "currencyDetails", "", "Lcom/kubi/assets/exchange/model/CurrencyDetail;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getTag", "getCurrencyDetails", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionParam {

    @NotNull
    private final List<CurrencyDetail> currencyDetails;

    @Nullable
    private final String tag;

    @Nullable
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionParam)) {
            return false;
        }
        PositionParam positionParam = (PositionParam) other;
        return Intrinsics.areEqual(this.type, positionParam.type) && Intrinsics.areEqual(this.tag, positionParam.tag) && Intrinsics.areEqual(this.currencyDetails, positionParam.currencyDetails);
    }

    public PositionParam(@Nullable String str, @Nullable String str2, @NotNull List<CurrencyDetail> currencyDetails) {
        Intrinsics.checkNotNullParameter(currencyDetails, "currencyDetails");
        this.type = str;
        this.tag = str2;
        this.currencyDetails = currencyDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositionParam copy$default(PositionParam positionParam, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = positionParam.type;
        }
        if ((i11 & 2) != 0) {
            str2 = positionParam.tag;
        }
        if ((i11 & 4) != 0) {
            list = positionParam.currencyDetails;
        }
        return positionParam.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final List<CurrencyDetail> component3() {
        return this.currencyDetails;
    }

    @NotNull
    public final PositionParam copy(@Nullable String type, @Nullable String tag, @NotNull List<CurrencyDetail> currencyDetails) {
        Intrinsics.checkNotNullParameter(currencyDetails, "currencyDetails");
        return new PositionParam(type, tag, currencyDetails);
    }

    @NotNull
    public final List<CurrencyDetail> getCurrencyDetails() {
        return this.currencyDetails;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.currencyDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "PositionParam(type=" + this.type + ", tag=" + this.tag + ", currencyDetails=" + this.currencyDetails + ')';
    }
}
