package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeSafeCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatusMap;", "", "pk", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;", "sms", "emv", "gav", "mailWord", "(Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;)V", "getEmv", "()Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeSafeSafeGuardStatus;", "getGav", "getMailWord", "getPk", "getSms", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeSafeSafeGuardStatusMap {

    @Nullable
    private final KCHybridBridgeSafeSafeGuardStatus emv;

    @Nullable
    private final KCHybridBridgeSafeSafeGuardStatus gav;

    @Nullable
    private final KCHybridBridgeSafeSafeGuardStatus mailWord;

    @Nullable
    private final KCHybridBridgeSafeSafeGuardStatus pk;

    @Nullable
    private final KCHybridBridgeSafeSafeGuardStatus sms;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeSafeSafeGuardStatusMap)) {
            return false;
        }
        KCHybridBridgeSafeSafeGuardStatusMap kCHybridBridgeSafeSafeGuardStatusMap = (KCHybridBridgeSafeSafeGuardStatusMap) other;
        return Intrinsics.areEqual(this.pk, kCHybridBridgeSafeSafeGuardStatusMap.pk) && Intrinsics.areEqual(this.sms, kCHybridBridgeSafeSafeGuardStatusMap.sms) && Intrinsics.areEqual(this.emv, kCHybridBridgeSafeSafeGuardStatusMap.emv) && Intrinsics.areEqual(this.gav, kCHybridBridgeSafeSafeGuardStatusMap.gav) && Intrinsics.areEqual(this.mailWord, kCHybridBridgeSafeSafeGuardStatusMap.mailWord);
    }

    public static /* synthetic */ KCHybridBridgeSafeSafeGuardStatusMap copy$default(KCHybridBridgeSafeSafeGuardStatusMap kCHybridBridgeSafeSafeGuardStatusMap, KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus, KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus2, KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus3, KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus4, KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kCHybridBridgeSafeSafeGuardStatus = kCHybridBridgeSafeSafeGuardStatusMap.pk;
        }
        if ((i11 & 2) != 0) {
            kCHybridBridgeSafeSafeGuardStatus2 = kCHybridBridgeSafeSafeGuardStatusMap.sms;
        }
        if ((i11 & 4) != 0) {
            kCHybridBridgeSafeSafeGuardStatus3 = kCHybridBridgeSafeSafeGuardStatusMap.emv;
        }
        if ((i11 & 8) != 0) {
            kCHybridBridgeSafeSafeGuardStatus4 = kCHybridBridgeSafeSafeGuardStatusMap.gav;
        }
        if ((i11 & 16) != 0) {
            kCHybridBridgeSafeSafeGuardStatus5 = kCHybridBridgeSafeSafeGuardStatusMap.mailWord;
        }
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus6 = kCHybridBridgeSafeSafeGuardStatus5;
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus7 = kCHybridBridgeSafeSafeGuardStatus3;
        return kCHybridBridgeSafeSafeGuardStatusMap.copy(kCHybridBridgeSafeSafeGuardStatus, kCHybridBridgeSafeSafeGuardStatus2, kCHybridBridgeSafeSafeGuardStatus7, kCHybridBridgeSafeSafeGuardStatus4, kCHybridBridgeSafeSafeGuardStatus6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KCHybridBridgeSafeSafeGuardStatus getPk() {
        return this.pk;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KCHybridBridgeSafeSafeGuardStatus getSms() {
        return this.sms;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final KCHybridBridgeSafeSafeGuardStatus getEmv() {
        return this.emv;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final KCHybridBridgeSafeSafeGuardStatus getGav() {
        return this.gav;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final KCHybridBridgeSafeSafeGuardStatus getMailWord() {
        return this.mailWord;
    }

    @NotNull
    public final KCHybridBridgeSafeSafeGuardStatusMap copy(@Nullable KCHybridBridgeSafeSafeGuardStatus pk2, @Nullable KCHybridBridgeSafeSafeGuardStatus sms, @Nullable KCHybridBridgeSafeSafeGuardStatus emv, @Nullable KCHybridBridgeSafeSafeGuardStatus gav, @Nullable KCHybridBridgeSafeSafeGuardStatus mailWord) {
        return new KCHybridBridgeSafeSafeGuardStatusMap(pk2, sms, emv, gav, mailWord);
    }

    @Nullable
    public final KCHybridBridgeSafeSafeGuardStatus getEmv() {
        return this.emv;
    }

    @Nullable
    public final KCHybridBridgeSafeSafeGuardStatus getGav() {
        return this.gav;
    }

    @Nullable
    public final KCHybridBridgeSafeSafeGuardStatus getMailWord() {
        return this.mailWord;
    }

    @Nullable
    public final KCHybridBridgeSafeSafeGuardStatus getPk() {
        return this.pk;
    }

    @Nullable
    public final KCHybridBridgeSafeSafeGuardStatus getSms() {
        return this.sms;
    }

    public int hashCode() {
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus = this.pk;
        int iHashCode = (kCHybridBridgeSafeSafeGuardStatus == null ? 0 : kCHybridBridgeSafeSafeGuardStatus.hashCode()) * 31;
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus2 = this.sms;
        int iHashCode2 = (iHashCode + (kCHybridBridgeSafeSafeGuardStatus2 == null ? 0 : kCHybridBridgeSafeSafeGuardStatus2.hashCode())) * 31;
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus3 = this.emv;
        int iHashCode3 = (iHashCode2 + (kCHybridBridgeSafeSafeGuardStatus3 == null ? 0 : kCHybridBridgeSafeSafeGuardStatus3.hashCode())) * 31;
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus4 = this.gav;
        int iHashCode4 = (iHashCode3 + (kCHybridBridgeSafeSafeGuardStatus4 == null ? 0 : kCHybridBridgeSafeSafeGuardStatus4.hashCode())) * 31;
        KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus5 = this.mailWord;
        return iHashCode4 + (kCHybridBridgeSafeSafeGuardStatus5 != null ? kCHybridBridgeSafeSafeGuardStatus5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeSafeSafeGuardStatusMap(pk=" + this.pk + ", sms=" + this.sms + ", emv=" + this.emv + ", gav=" + this.gav + ", mailWord=" + this.mailWord + ')';
    }

    public KCHybridBridgeSafeSafeGuardStatusMap(@Nullable KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus, @Nullable KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus2, @Nullable KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus3, @Nullable KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus4, @Nullable KCHybridBridgeSafeSafeGuardStatus kCHybridBridgeSafeSafeGuardStatus5) {
        this.pk = kCHybridBridgeSafeSafeGuardStatus;
        this.sms = kCHybridBridgeSafeSafeGuardStatus2;
        this.emv = kCHybridBridgeSafeSafeGuardStatus3;
        this.gav = kCHybridBridgeSafeSafeGuardStatus4;
        this.mailWord = kCHybridBridgeSafeSafeGuardStatus5;
    }
}
