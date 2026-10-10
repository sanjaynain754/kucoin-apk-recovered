package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeConfig.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/TradeConfig;", "", "lockLimit", "", "<init>", "(Ljava/lang/String;)V", "getLockLimit", "()Ljava/lang/String;", "isLockLimit", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradeConfig {

    @NotNull
    public static final String LOCK_TRUE = "1";

    @SerializedName("LOCK_24_HOURS")
    @Nullable
    private final String lockLimit;

    @Nullable
    public final String getLockLimit() {
        return this.lockLimit;
    }

    public final boolean isLockLimit() {
        return Intrinsics.areEqual(this.lockLimit, "1");
    }

    public TradeConfig(@Nullable String str) {
        this.lockLimit = str;
    }
}
