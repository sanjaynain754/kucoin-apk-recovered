package com.kubi.fingerprint.entity;

import androidx.annotation.Keep;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FingerRequest.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, m90084d2 = {"Lcom/kubi/fingerprint/entity/Item;", "", "id", "", "c", "", "sv", "", "ts", "uid", "info", "(Ljava/lang/String;Ljava/lang/Long;IJLjava/lang/String;Ljava/lang/String;)V", "getC", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()Ljava/lang/String;", "getInfo", "getSv", "()I", "getTs", "()J", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;IJLjava/lang/String;Ljava/lang/String;)Lcom/kubi/fingerprint/entity/Item;", "equals", "", "other", "hashCode", "toString", "Fingerprint_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class Item {

    @Nullable
    private final Long c;

    @Nullable
    private final String id;

    @NotNull
    private final String info;
    private final int sv;
    private final long ts;

    @Nullable
    private final String uid;

    public Item(@Nullable String str, @Nullable Long l11, int i11, long j11, @Nullable String str2, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.id = str;
        this.c = l11;
        this.sv = i11;
        this.ts = j11;
        this.uid = str2;
        this.info = info;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.areEqual(this.id, item.id) && Intrinsics.areEqual(this.c, item.c) && this.sv == item.sv && this.ts == item.ts && Intrinsics.areEqual(this.uid, item.uid) && Intrinsics.areEqual(this.info, item.info);
    }

    public static /* synthetic */ Item copy$default(Item item, String str, Long l11, int i11, long j11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = item.id;
        }
        if ((i12 & 2) != 0) {
            l11 = item.c;
        }
        if ((i12 & 4) != 0) {
            i11 = item.sv;
        }
        if ((i12 & 8) != 0) {
            j11 = item.ts;
        }
        if ((i12 & 16) != 0) {
            str2 = item.uid;
        }
        if ((i12 & 32) != 0) {
            str3 = item.info;
        }
        long j12 = j11;
        int i13 = i11;
        return item.copy(str, l11, i13, j12, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSv() {
        return this.sv;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final Item copy(@Nullable String id2, @Nullable Long c11, int sv2, long ts2, @Nullable String uid, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new Item(id2, c11, sv2, ts2, uid, info);
    }

    @Nullable
    public final Long getC() {
        return this.c;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    public final int getSv() {
        return this.sv;
    }

    public final long getTs() {
        return this.ts;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.c;
        int iHashCode2 = (((((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Integer.hashCode(this.sv)) * 31) + Long.hashCode(this.ts)) * 31;
        String str2 = this.uid;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return "Item(id=" + this.id + ", c=" + this.c + ", sv=" + this.sv + ", ts=" + this.ts + ", uid=" + this.uid + ", info=" + this.info + ')';
    }

    public /* synthetic */ Item(String str, Long l11, int i11, long j11, String str2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, (i12 & 2) != 0 ? 20051203L : l11, (i12 & 4) != 0 ? 1 : i11, (i12 & 8) != 0 ? System.currentTimeMillis() : j11, str2, str3);
    }
}
