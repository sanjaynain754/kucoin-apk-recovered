package com.kubi.margin.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginPermission;", "", "allowed", "", "msg", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getAllowed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/margin/entity/MarginPermission;", "equals", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginPermission {

    @Nullable
    private final Boolean allowed;

    @Nullable
    private final String msg;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginPermission)) {
            return false;
        }
        MarginPermission marginPermission = (MarginPermission) other;
        return Intrinsics.areEqual(this.allowed, marginPermission.allowed) && Intrinsics.areEqual(this.msg, marginPermission.msg);
    }

    public static /* synthetic */ MarginPermission copy$default(MarginPermission marginPermission, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = marginPermission.allowed;
        }
        if ((i11 & 2) != 0) {
            str = marginPermission.msg;
        }
        return marginPermission.copy(bool, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAllowed() {
        return this.allowed;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final MarginPermission copy(@Nullable Boolean allowed, @Nullable String msg) {
        return new MarginPermission(allowed, msg);
    }

    @Nullable
    public final Boolean getAllowed() {
        return this.allowed;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        Boolean bool = this.allowed;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.msg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginPermission(allowed=" + this.allowed + ", msg=" + this.msg + ')';
    }

    public MarginPermission(@Nullable Boolean bool, @Nullable String str) {
        this.allowed = bool;
        this.msg = str;
    }
}
