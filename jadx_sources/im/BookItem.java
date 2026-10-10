package im;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: im.b, reason: from toString */
/* JADX INFO: compiled from: BookEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/logic/book/BookItem;", "", "direction", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "displayPrice", "", "currentAmount", "totalAmount", "<init>", "(ILjava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getDirection", "()I", "setDirection", "(I)V", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getDisplayPrice", "()Ljava/lang/String;", "setDisplayPrice", "(Ljava/lang/String;)V", "getCurrentAmount", "setCurrentAmount", "getTotalAmount", "setTotalAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BookItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    public int direction;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public BigDecimal price;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public String displayPrice;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public BigDecimal currentAmount;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public BigDecimal totalAmount;

    public BookItem() {
        this(0, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookItem)) {
            return false;
        }
        BookItem bookItem = (BookItem) other;
        return this.direction == bookItem.direction && Intrinsics.areEqual(this.price, bookItem.price) && Intrinsics.areEqual(this.displayPrice, bookItem.displayPrice) && Intrinsics.areEqual(this.currentAmount, bookItem.currentAmount) && Intrinsics.areEqual(this.totalAmount, bookItem.totalAmount);
    }

    public BookItem(int i11, @NotNull BigDecimal price, @NotNull String displayPrice, @NotNull BigDecimal currentAmount, @NotNull BigDecimal totalAmount) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(displayPrice, "displayPrice");
        Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.direction = i11;
        this.price = price;
        this.displayPrice = displayPrice;
        this.currentAmount = currentAmount;
        this.totalAmount = totalAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getCurrentAmount() {
        return this.currentAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: d */
    public final void m87432d(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.currentAmount = bigDecimal;
    }

    /* JADX INFO: renamed from: e */
    public final void m87433e(int i11) {
        this.direction = i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m87434f(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayPrice = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m87435g(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.price = bigDecimal;
    }

    /* JADX INFO: renamed from: h */
    public final void m87436h(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.totalAmount = bigDecimal;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.direction) * 31) + this.price.hashCode()) * 31) + this.displayPrice.hashCode()) * 31) + this.currentAmount.hashCode()) * 31) + this.totalAmount.hashCode();
    }

    @NotNull
    public String toString() {
        return "BookItem(direction=" + this.direction + ", price=" + this.price + ", displayPrice=" + this.displayPrice + ", currentAmount=" + this.currentAmount + ", totalAmount=" + this.totalAmount + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BookItem(int i11, BigDecimal ZERO, String str, BigDecimal ZERO2, BigDecimal ZERO3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        i11 = (i12 & 1) != 0 ? 0 : i11;
        if ((i12 & 2) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        str = (i12 & 4) != 0 ? "0" : str;
        if ((i12 & 8) != 0) {
            ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        }
        if ((i12 & 16) != 0) {
            ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
        }
        BigDecimal bigDecimal = ZERO3;
        this(i11, ZERO, str, ZERO2, bigDecimal);
    }
}
