package com.kubi.payment.fasttradev2.sell.paymentmethod;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SellItemPaymentMethod.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "<init>", "()V", "ItemCategory", "ItemNormalPaymentMethod", "ItemGuideP2P", "Companion", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemCategory;", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemGuideP2P;", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemNormalPaymentMethod;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SellItemPaymentMethod implements MultiItemEntity {
    public static final int ITEM_TYPE_CATEGORY = 0;
    public static final int ITEM_TYPE_GUIDE_P2P = 2;
    public static final int ITEM_TYPE_PAYMENT_METHOD = 1;

    /* JADX INFO: compiled from: SellItemPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0017\u001a\u00020\u0006H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemCategory;", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "title", "", "quoteType", "maxCardCount", "", "canEdit", "", "needShowUnitPrice", "needHideEnd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZ)V", "getTitle", "()Ljava/lang/String;", "getQuoteType", "getMaxCardCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCanEdit", "()Z", "getNeedShowUnitPrice", "getNeedHideEnd", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZ)Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemCategory;", "equals", "other", "", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemCategory extends SellItemPaymentMethod {
        private final boolean canEdit;

        @Nullable
        private final Integer maxCardCount;
        private final boolean needHideEnd;
        private final boolean needShowUnitPrice;

        @NotNull
        private final String quoteType;

        @NotNull
        private final String title;

        public /* synthetic */ ItemCategory(String str, String str2, Integer num, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemCategory)) {
                return false;
            }
            ItemCategory itemCategory = (ItemCategory) other;
            return Intrinsics.areEqual(this.title, itemCategory.title) && Intrinsics.areEqual(this.quoteType, itemCategory.quoteType) && Intrinsics.areEqual(this.maxCardCount, itemCategory.maxCardCount) && this.canEdit == itemCategory.canEdit && this.needShowUnitPrice == itemCategory.needShowUnitPrice && this.needHideEnd == itemCategory.needHideEnd;
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemCategory(@NotNull String title, @NotNull String quoteType, @Nullable Integer num, boolean z11, boolean z12, boolean z13) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            this.title = title;
            this.quoteType = quoteType;
            this.maxCardCount = num;
            this.canEdit = z11;
            this.needShowUnitPrice = z12;
            this.needHideEnd = z13;
        }

        public static /* synthetic */ ItemCategory copy$default(ItemCategory itemCategory, String str, String str2, Integer num, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemCategory.title;
            }
            if ((i11 & 2) != 0) {
                str2 = itemCategory.quoteType;
            }
            if ((i11 & 4) != 0) {
                num = itemCategory.maxCardCount;
            }
            if ((i11 & 8) != 0) {
                z11 = itemCategory.canEdit;
            }
            if ((i11 & 16) != 0) {
                z12 = itemCategory.needShowUnitPrice;
            }
            if ((i11 & 32) != 0) {
                z13 = itemCategory.needHideEnd;
            }
            boolean z14 = z12;
            boolean z15 = z13;
            return itemCategory.copy(str, str2, num, z11, z14, z15);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getQuoteType() {
            return this.quoteType;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getMaxCardCount() {
            return this.maxCardCount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getCanEdit() {
            return this.canEdit;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getNeedShowUnitPrice() {
            return this.needShowUnitPrice;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getNeedHideEnd() {
            return this.needHideEnd;
        }

        @NotNull
        public final ItemCategory copy(@NotNull String title, @NotNull String quoteType, @Nullable Integer maxCardCount, boolean canEdit, boolean needShowUnitPrice, boolean needHideEnd) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(quoteType, "quoteType");
            return new ItemCategory(title, quoteType, maxCardCount, canEdit, needShowUnitPrice, needHideEnd);
        }

        public final boolean getCanEdit() {
            return this.canEdit;
        }

        @Nullable
        public final Integer getMaxCardCount() {
            return this.maxCardCount;
        }

        public final boolean getNeedHideEnd() {
            return this.needHideEnd;
        }

        public final boolean getNeedShowUnitPrice() {
            return this.needShowUnitPrice;
        }

        @NotNull
        public final String getQuoteType() {
            return this.quoteType;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.quoteType.hashCode()) * 31;
            Integer num = this.maxCardCount;
            return ((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Boolean.hashCode(this.needShowUnitPrice)) * 31) + Boolean.hashCode(this.needHideEnd);
        }

        @NotNull
        public String toString() {
            return "ItemCategory(title=" + this.title + ", quoteType=" + this.quoteType + ", maxCardCount=" + this.maxCardCount + ", canEdit=" + this.canEdit + ", needShowUnitPrice=" + this.needShowUnitPrice + ", needHideEnd=" + this.needHideEnd + ')';
        }
    }

    /* JADX INFO: compiled from: SellItemPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemGuideP2P;", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "<init>", "()V", "getItemType", "", "equals", "", "other", "", "hashCode", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemGuideP2P extends SellItemPaymentMethod {

        @NotNull
        public static final ItemGuideP2P INSTANCE = new ItemGuideP2P();

        private ItemGuideP2P() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ItemGuideP2P);
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 2;
        }

        @NotNull
        public String toString() {
            return "ItemGuideP2P";
        }

        public int hashCode() {
            return 640531538;
        }
    }

    /* JADX INFO: compiled from: SellItemPaymentMethod.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod$ItemNormalPaymentMethod;", "Lcom/kubi/payment/fasttradev2/sell/paymentmethod/SellItemPaymentMethod;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "value", "", FirebaseAnalytics.Param.CURRENCY, "isSelected", "", "<init>", "(Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V", "getPaymentMethod", "()Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "getValue", "()Ljava/lang/String;", "getCurrency", "()Z", "setSelected", "(Z)V", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemNormalPaymentMethod extends SellItemPaymentMethod {

        @NotNull
        private final String currency;
        private boolean isSelected;

        @NotNull
        private final SellPaymentMethod.Response.PaymentMethod paymentMethod;

        @NotNull
        private final String value;

        public /* synthetic */ ItemNormalPaymentMethod(SellPaymentMethod.Response.PaymentMethod paymentMethod, String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethod, str, str2, (i11 & 8) != 0 ? false : z11);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemNormalPaymentMethod)) {
                return false;
            }
            ItemNormalPaymentMethod itemNormalPaymentMethod = (ItemNormalPaymentMethod) other;
            return Intrinsics.areEqual(this.paymentMethod, itemNormalPaymentMethod.paymentMethod) && Intrinsics.areEqual(this.value, itemNormalPaymentMethod.value) && Intrinsics.areEqual(this.currency, itemNormalPaymentMethod.currency) && this.isSelected == itemNormalPaymentMethod.isSelected;
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemNormalPaymentMethod(@NotNull SellPaymentMethod.Response.PaymentMethod paymentMethod, @NotNull String value, @NotNull String currency, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.paymentMethod = paymentMethod;
            this.value = value;
            this.currency = currency;
            this.isSelected = z11;
        }

        public static /* synthetic */ ItemNormalPaymentMethod copy$default(ItemNormalPaymentMethod itemNormalPaymentMethod, SellPaymentMethod.Response.PaymentMethod paymentMethod, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentMethod = itemNormalPaymentMethod.paymentMethod;
            }
            if ((i11 & 2) != 0) {
                str = itemNormalPaymentMethod.value;
            }
            if ((i11 & 4) != 0) {
                str2 = itemNormalPaymentMethod.currency;
            }
            if ((i11 & 8) != 0) {
                z11 = itemNormalPaymentMethod.isSelected;
            }
            return itemNormalPaymentMethod.copy(paymentMethod, str, str2, z11);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SellPaymentMethod.Response.PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final ItemNormalPaymentMethod copy(@NotNull SellPaymentMethod.Response.PaymentMethod paymentMethod, @NotNull String value, @NotNull String currency, boolean isSelected) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new ItemNormalPaymentMethod(paymentMethod, value, currency, isSelected);
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        public final SellPaymentMethod.Response.PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((((this.paymentMethod.hashCode() * 31) + this.value.hashCode()) * 31) + this.currency.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final void setSelected(boolean z11) {
            this.isSelected = z11;
        }

        @NotNull
        public String toString() {
            return "ItemNormalPaymentMethod(paymentMethod=" + this.paymentMethod + ", value=" + this.value + ", currency=" + this.currency + ", isSelected=" + this.isSelected + ')';
        }
    }

    public /* synthetic */ SellItemPaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SellItemPaymentMethod() {
    }
}
