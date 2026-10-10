package com.revolut.revolutpay.data;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m90084d2 = {"Lcom/revolut/revolutpay/data/OrderStateDto;", "", "state", "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class OrderStateDto {

    @SerializedName("state")
    @NotNull
    private final String state;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderStateDto) && Intrinsics.areEqual(this.state, ((OrderStateDto) other).state);
    }

    public static /* synthetic */ OrderStateDto copy$default(OrderStateDto orderStateDto, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderStateDto.state;
        }
        return orderStateDto.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrderStateDto(state=" + this.state + ')';
    }

    public OrderStateDto(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @NotNull
    public final OrderStateDto copy(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new OrderStateDto(state);
    }
}
