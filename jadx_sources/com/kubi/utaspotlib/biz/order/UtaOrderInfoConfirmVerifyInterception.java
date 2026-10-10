package com.kubi.utaspotlib.biz.order;

import com.google.firebase.messaging.Constants;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.biz.order.g, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: UtaOrderInfoConfirmVerifyIntercept.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/utaspotlib/biz/order/UtaOrderInfoConfirmVerifyInterception;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "source", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;Ljava/lang/String;)V", "getSource", "()Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UtaOrderInfoConfirmVerifyInterception implements InterfaceC42809b {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final InterfaceC42808a source;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String error;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtaOrderInfoConfirmVerifyInterception)) {
            return false;
        }
        UtaOrderInfoConfirmVerifyInterception utaOrderInfoConfirmVerifyInterception = (UtaOrderInfoConfirmVerifyInterception) other;
        return Intrinsics.areEqual(this.source, utaOrderInfoConfirmVerifyInterception.source) && Intrinsics.areEqual(this.error, utaOrderInfoConfirmVerifyInterception.error);
    }

    public UtaOrderInfoConfirmVerifyInterception(@NotNull InterfaceC42808a source, @Nullable String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.error = str;
    }

    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        String str = this.error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UtaOrderInfoConfirmVerifyInterception(source=" + this.source + ", error=" + this.error + ')';
    }
}
