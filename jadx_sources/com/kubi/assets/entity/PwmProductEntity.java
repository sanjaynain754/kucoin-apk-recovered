package com.kubi.assets.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinanceEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/entity/PwmProductEntity;", "", "pwmFixedProdList", "", "Lcom/kubi/assets/entity/PwmFixedProd;", "quantFundProdList", "Lcom/kubi/assets/entity/QuantFundProd;", "viewMoreJumpUrl", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getPwmFixedProdList", "()Ljava/util/List;", "getQuantFundProdList", "getViewMoreJumpUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PwmProductEntity {

    @Nullable
    private final List<PwmFixedProd> pwmFixedProdList;

    @Nullable
    private final List<QuantFundProd> quantFundProdList;

    @Nullable
    private final String viewMoreJumpUrl;

    public PwmProductEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PwmProductEntity)) {
            return false;
        }
        PwmProductEntity pwmProductEntity = (PwmProductEntity) other;
        return Intrinsics.areEqual(this.pwmFixedProdList, pwmProductEntity.pwmFixedProdList) && Intrinsics.areEqual(this.quantFundProdList, pwmProductEntity.quantFundProdList) && Intrinsics.areEqual(this.viewMoreJumpUrl, pwmProductEntity.viewMoreJumpUrl);
    }

    public PwmProductEntity(@Nullable List<PwmFixedProd> list, @Nullable List<QuantFundProd> list2, @Nullable String str) {
        this.pwmFixedProdList = list;
        this.quantFundProdList = list2;
        this.viewMoreJumpUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PwmProductEntity copy$default(PwmProductEntity pwmProductEntity, List list, List list2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pwmProductEntity.pwmFixedProdList;
        }
        if ((i11 & 2) != 0) {
            list2 = pwmProductEntity.quantFundProdList;
        }
        if ((i11 & 4) != 0) {
            str = pwmProductEntity.viewMoreJumpUrl;
        }
        return pwmProductEntity.copy(list, list2, str);
    }

    @Nullable
    public final List<PwmFixedProd> component1() {
        return this.pwmFixedProdList;
    }

    @Nullable
    public final List<QuantFundProd> component2() {
        return this.quantFundProdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getViewMoreJumpUrl() {
        return this.viewMoreJumpUrl;
    }

    @NotNull
    public final PwmProductEntity copy(@Nullable List<PwmFixedProd> pwmFixedProdList, @Nullable List<QuantFundProd> quantFundProdList, @Nullable String viewMoreJumpUrl) {
        return new PwmProductEntity(pwmFixedProdList, quantFundProdList, viewMoreJumpUrl);
    }

    @Nullable
    public final List<PwmFixedProd> getPwmFixedProdList() {
        return this.pwmFixedProdList;
    }

    @Nullable
    public final List<QuantFundProd> getQuantFundProdList() {
        return this.quantFundProdList;
    }

    @Nullable
    public final String getViewMoreJumpUrl() {
        return this.viewMoreJumpUrl;
    }

    public int hashCode() {
        List<PwmFixedProd> list = this.pwmFixedProdList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<QuantFundProd> list2 = this.quantFundProdList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.viewMoreJumpUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PwmProductEntity(pwmFixedProdList=" + this.pwmFixedProdList + ", quantFundProdList=" + this.quantFundProdList + ", viewMoreJumpUrl=" + this.viewMoreJumpUrl + ')';
    }

    public /* synthetic */ PwmProductEntity(List list, List list2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : str);
    }
}
