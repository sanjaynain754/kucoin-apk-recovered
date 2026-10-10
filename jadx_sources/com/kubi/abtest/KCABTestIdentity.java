package com.kubi.abtest;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.abtest.c, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: KCABTestService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/abtest/KCABTestIdentity;", "", "site", "", "distinctId", "isLoginId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSite", "()Ljava/lang/String;", "getDistinctId", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ABTest_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCABTestIdentity {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String site;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String distinctId;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isLoginId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCABTestIdentity)) {
            return false;
        }
        KCABTestIdentity kCABTestIdentity = (KCABTestIdentity) other;
        return Intrinsics.areEqual(this.site, kCABTestIdentity.site) && Intrinsics.areEqual(this.distinctId, kCABTestIdentity.distinctId) && this.isLoginId == kCABTestIdentity.isLoginId;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDistinctId() {
        return this.distinctId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSite() {
        return this.site;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsLoginId() {
        return this.isLoginId;
    }

    public int hashCode() {
        return (((this.site.hashCode() * 31) + this.distinctId.hashCode()) * 31) + Boolean.hashCode(this.isLoginId);
    }

    @NotNull
    public String toString() {
        return "KCABTestIdentity(site=" + this.site + ", distinctId=" + this.distinctId + ", isLoginId=" + this.isLoginId + ')';
    }

    public KCABTestIdentity(@NotNull String site, @NotNull String distinctId, boolean z11) {
        Intrinsics.checkNotNullParameter(site, "site");
        Intrinsics.checkNotNullParameter(distinctId, "distinctId");
        this.site = site;
        this.distinctId = distinctId;
        this.isLoginId = z11;
    }
}
