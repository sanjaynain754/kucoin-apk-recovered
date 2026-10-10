package com.kubi.payment.fasttradev2.coupon;

import androidx.annotation.Keep;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "title", "", "couponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "<init>", "(Ljava/lang/String;Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;)V", "getTitle", "()Ljava/lang/String;", "getCouponInfo", "()Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "ItemHeader", "ItemAvailable", "ItemUnAvailable", "Companion", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemAvailable;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemHeader;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemUnAvailable;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ItemFiatCouponInfo implements MultiItemEntity {
    public static final int ITEM_TYPE_AVAILABLE = 1;
    public static final int ITEM_TYPE_HEADER = 0;
    public static final int ITEM_TYPE_UNAVAILABLE = 2;

    @Nullable
    private final FiatCouponListInfo.CouponInfo couponInfo;

    @Nullable
    private final String title;

    /* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemAvailable;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;", "couponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "<init>", "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;)V", "getCouponInfo", "()Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "getItemType", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemAvailable extends ItemFiatCouponInfo {

        @NotNull
        private final FiatCouponListInfo.CouponInfo couponInfo;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemAvailable) && Intrinsics.areEqual(this.couponInfo, ((ItemAvailable) other).couponInfo);
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ItemAvailable(@NotNull FiatCouponListInfo.CouponInfo couponInfo) {
            super(null, couponInfo, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(couponInfo, "couponInfo");
            this.couponInfo = couponInfo;
        }

        public static /* synthetic */ ItemAvailable copy$default(ItemAvailable itemAvailable, FiatCouponListInfo.CouponInfo couponInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                couponInfo = itemAvailable.couponInfo;
            }
            return itemAvailable.copy(couponInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FiatCouponListInfo.CouponInfo getCouponInfo() {
            return this.couponInfo;
        }

        @NotNull
        public final ItemAvailable copy(@NotNull FiatCouponListInfo.CouponInfo couponInfo) {
            Intrinsics.checkNotNullParameter(couponInfo, "couponInfo");
            return new ItemAvailable(couponInfo);
        }

        @Override // com.kubi.payment.fasttradev2.coupon.ItemFiatCouponInfo
        @NotNull
        public FiatCouponListInfo.CouponInfo getCouponInfo() {
            return this.couponInfo;
        }

        public int hashCode() {
            return this.couponInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemAvailable(couponInfo=" + this.couponInfo + ')';
        }
    }

    /* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemHeader;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;", "title", "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getItemType", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemHeader extends ItemFiatCouponInfo {

        @Nullable
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemHeader(@Nullable String str) {
            super(str, null, 0 == true ? 1 : 0);
            this.title = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemHeader) && Intrinsics.areEqual(this.title, ((ItemHeader) other).title);
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 0;
        }

        public static /* synthetic */ ItemHeader copy$default(ItemHeader itemHeader, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemHeader.title;
            }
            return itemHeader.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ItemHeader copy(@Nullable String title) {
            return new ItemHeader(title);
        }

        @Override // com.kubi.payment.fasttradev2.coupon.ItemFiatCouponInfo
        @Nullable
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemHeader(title=" + this.title + ')';
        }
    }

    /* JADX INFO: compiled from: MarketingCouponListAdapter.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo$ItemUnAvailable;", "Lcom/kubi/payment/fasttradev2/coupon/ItemFiatCouponInfo;", "couponInfo", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "<init>", "(Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;)V", "getCouponInfo", "()Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "getItemType", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemUnAvailable extends ItemFiatCouponInfo {

        @NotNull
        private final FiatCouponListInfo.CouponInfo couponInfo;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemUnAvailable) && Intrinsics.areEqual(this.couponInfo, ((ItemUnAvailable) other).couponInfo);
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ItemUnAvailable(@NotNull FiatCouponListInfo.CouponInfo couponInfo) {
            super(null, couponInfo, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(couponInfo, "couponInfo");
            this.couponInfo = couponInfo;
        }

        public static /* synthetic */ ItemUnAvailable copy$default(ItemUnAvailable itemUnAvailable, FiatCouponListInfo.CouponInfo couponInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                couponInfo = itemUnAvailable.couponInfo;
            }
            return itemUnAvailable.copy(couponInfo);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FiatCouponListInfo.CouponInfo getCouponInfo() {
            return this.couponInfo;
        }

        @NotNull
        public final ItemUnAvailable copy(@NotNull FiatCouponListInfo.CouponInfo couponInfo) {
            Intrinsics.checkNotNullParameter(couponInfo, "couponInfo");
            return new ItemUnAvailable(couponInfo);
        }

        @Override // com.kubi.payment.fasttradev2.coupon.ItemFiatCouponInfo
        @NotNull
        public FiatCouponListInfo.CouponInfo getCouponInfo() {
            return this.couponInfo;
        }

        public int hashCode() {
            return this.couponInfo.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemUnAvailable(couponInfo=" + this.couponInfo + ')';
        }
    }

    public /* synthetic */ ItemFiatCouponInfo(String str, FiatCouponListInfo.CouponInfo couponInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, couponInfo);
    }

    private ItemFiatCouponInfo(String str, FiatCouponListInfo.CouponInfo couponInfo) {
        this.title = str;
        this.couponInfo = couponInfo;
    }

    @Nullable
    public FiatCouponListInfo.CouponInfo getCouponInfo() {
        return this.couponInfo;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    public /* synthetic */ ItemFiatCouponInfo(String str, FiatCouponListInfo.CouponInfo couponInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, couponInfo, null);
    }
}
