package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PConfigInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/P2PConfigInfo;", "", "needFraudRemind", "", "<init>", "(Ljava/lang/Boolean;)V", "getNeedFraudRemind", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/kubi/payment/p2p/data/entities/P2PConfigInfo;", "equals", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class P2PConfigInfo {

    @SerializedName("appFraudRemind")
    @Nullable
    private final Boolean needFraudRemind;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof P2PConfigInfo) && Intrinsics.areEqual(this.needFraudRemind, ((P2PConfigInfo) other).needFraudRemind);
    }

    public static /* synthetic */ P2PConfigInfo copy$default(P2PConfigInfo p2PConfigInfo, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = p2PConfigInfo.needFraudRemind;
        }
        return p2PConfigInfo.copy(bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getNeedFraudRemind() {
        return this.needFraudRemind;
    }

    @NotNull
    public final P2PConfigInfo copy(@Nullable Boolean needFraudRemind) {
        return new P2PConfigInfo(needFraudRemind);
    }

    @Nullable
    public final Boolean getNeedFraudRemind() {
        return this.needFraudRemind;
    }

    public int hashCode() {
        Boolean bool = this.needFraudRemind;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "P2PConfigInfo(needFraudRemind=" + this.needFraudRemind + ')';
    }

    public P2PConfigInfo(@Nullable Boolean bool) {
        this.needFraudRemind = bool;
    }
}
