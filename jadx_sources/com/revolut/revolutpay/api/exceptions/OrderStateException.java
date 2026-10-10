package com.revolut.revolutpay.api.exceptions;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m90084d2 = {"Lcom/revolut/revolutpay/api/exceptions/OrderStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class OrderStateException extends Exception {

    @NotNull
    private final String message;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderStateException) && Intrinsics.areEqual(getMessage(), ((OrderStateException) other).getMessage());
    }

    public static /* synthetic */ OrderStateException copy$default(OrderStateException orderStateException, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderStateException.getMessage();
        }
        return orderStateException.copy(str);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "OrderStateException(message=" + getMessage() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStateException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    @NotNull
    public final String component1() {
        return getMessage();
    }

    @NotNull
    public final OrderStateException copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new OrderStateException(message);
    }

    public int hashCode() {
        return getMessage().hashCode();
    }
}
