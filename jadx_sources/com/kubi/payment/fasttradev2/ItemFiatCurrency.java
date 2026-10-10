package com.kubi.payment.fasttradev2;

import androidx.annotation.Keep;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \n2\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "fiatCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "<init>", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;)V", "getFiatCurrency", "()Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "ItemHeader", "ItemNormal", "Companion", "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemHeader;", "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemNormal;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ItemFiatCurrency implements MultiItemEntity {
    public static final int ITEM_TYPE_HEADER = 0;
    public static final int ITEM_TYPE_NORMAL = 1;

    @NotNull
    private final FastTradeFiatCurrency.Response fiatCurrency;

    /* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemHeader;", "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;", "fiatCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "<init>", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;)V", "getFiatCurrency", "()Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "getItemType", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemHeader extends ItemFiatCurrency {

        @NotNull
        private final FastTradeFiatCurrency.Response fiatCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemHeader) && Intrinsics.areEqual(this.fiatCurrency, ((ItemHeader) other).fiatCurrency);
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemHeader(@NotNull FastTradeFiatCurrency.Response fiatCurrency) {
            super(fiatCurrency, null);
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            this.fiatCurrency = fiatCurrency;
        }

        public static /* synthetic */ ItemHeader copy$default(ItemHeader itemHeader, FastTradeFiatCurrency.Response response, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                response = itemHeader.fiatCurrency;
            }
            return itemHeader.copy(response);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FastTradeFiatCurrency.Response getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        public final ItemHeader copy(@NotNull FastTradeFiatCurrency.Response fiatCurrency) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            return new ItemHeader(fiatCurrency);
        }

        @Override // com.kubi.payment.fasttradev2.ItemFiatCurrency
        @NotNull
        public FastTradeFiatCurrency.Response getFiatCurrency() {
            return this.fiatCurrency;
        }

        public int hashCode() {
            return this.fiatCurrency.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemHeader(fiatCurrency=" + this.fiatCurrency + ')';
        }
    }

    /* JADX INFO: compiled from: FastTradeFiatCurrencySelectAdapter.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/ItemFiatCurrency$ItemNormal;", "Lcom/kubi/payment/fasttradev2/ItemFiatCurrency;", "fiatCurrency", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "<init>", "(Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;)V", "getFiatCurrency", "()Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "getItemType", "", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ItemNormal extends ItemFiatCurrency {

        @NotNull
        private final FastTradeFiatCurrency.Response fiatCurrency;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ItemNormal) && Intrinsics.areEqual(this.fiatCurrency, ((ItemNormal) other).fiatCurrency);
        }

        @Override // io.chad.library.adapter.base.entity.MultiItemEntity
        /* JADX INFO: renamed from: getItemType */
        public int getF42794b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemNormal(@NotNull FastTradeFiatCurrency.Response fiatCurrency) {
            super(fiatCurrency, null);
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            this.fiatCurrency = fiatCurrency;
        }

        public static /* synthetic */ ItemNormal copy$default(ItemNormal itemNormal, FastTradeFiatCurrency.Response response, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                response = itemNormal.fiatCurrency;
            }
            return itemNormal.copy(response);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FastTradeFiatCurrency.Response getFiatCurrency() {
            return this.fiatCurrency;
        }

        @NotNull
        public final ItemNormal copy(@NotNull FastTradeFiatCurrency.Response fiatCurrency) {
            Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
            return new ItemNormal(fiatCurrency);
        }

        @Override // com.kubi.payment.fasttradev2.ItemFiatCurrency
        @NotNull
        public FastTradeFiatCurrency.Response getFiatCurrency() {
            return this.fiatCurrency;
        }

        public int hashCode() {
            return this.fiatCurrency.hashCode();
        }

        @NotNull
        public String toString() {
            return "ItemNormal(fiatCurrency=" + this.fiatCurrency + ')';
        }
    }

    public /* synthetic */ ItemFiatCurrency(FastTradeFiatCurrency.Response response, DefaultConstructorMarker defaultConstructorMarker) {
        this(response);
    }

    private ItemFiatCurrency(FastTradeFiatCurrency.Response response) {
        this.fiatCurrency = response;
    }

    @NotNull
    public FastTradeFiatCurrency.Response getFiatCurrency() {
        return this.fiatCurrency;
    }
}
