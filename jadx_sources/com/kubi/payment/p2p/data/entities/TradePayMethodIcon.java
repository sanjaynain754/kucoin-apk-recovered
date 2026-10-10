package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PTrade.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/TradePayMethodIcon;", "", "typeCode", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTypeCode", "()Ljava/lang/String;", "getIcon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradePayMethodIcon {

    @Nullable
    private final String icon;

    @Nullable
    private final String typeCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradePayMethodIcon)) {
            return false;
        }
        TradePayMethodIcon tradePayMethodIcon = (TradePayMethodIcon) other;
        return Intrinsics.areEqual(this.typeCode, tradePayMethodIcon.typeCode) && Intrinsics.areEqual(this.icon, tradePayMethodIcon.icon);
    }

    public static /* synthetic */ TradePayMethodIcon copy$default(TradePayMethodIcon tradePayMethodIcon, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tradePayMethodIcon.typeCode;
        }
        if ((i11 & 2) != 0) {
            str2 = tradePayMethodIcon.icon;
        }
        return tradePayMethodIcon.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTypeCode() {
        return this.typeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final TradePayMethodIcon copy(@Nullable String typeCode, @Nullable String icon) {
        return new TradePayMethodIcon(typeCode, icon);
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getTypeCode() {
        return this.typeCode;
    }

    public int hashCode() {
        String str = this.typeCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TradePayMethodIcon(typeCode=" + this.typeCode + ", icon=" + this.icon + ')';
    }

    public TradePayMethodIcon(@Nullable String str, @Nullable String str2) {
        this.typeCode = str;
        this.icon = str2;
    }
}
