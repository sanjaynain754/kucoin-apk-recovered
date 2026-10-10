package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycUpgradeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/entity/KycInfoEntity;", "", "linkDoc", "", BridgeParamKeyKt.SHARE_KEY_LINKURL, "msg", "status", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getLinkDoc", "()Ljava/lang/String;", "setLinkDoc", "(Ljava/lang/String;)V", "getLinkUrl", "setLinkUrl", "getMsg", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/assets/entity/KycInfoEntity;", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycInfoEntity {

    @Nullable
    private String linkDoc;

    @Nullable
    private String linkUrl;

    @Nullable
    private final String msg;

    @Nullable
    private final Integer status;

    @Nullable
    private final String title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycInfoEntity)) {
            return false;
        }
        KycInfoEntity kycInfoEntity = (KycInfoEntity) other;
        return Intrinsics.areEqual(this.linkDoc, kycInfoEntity.linkDoc) && Intrinsics.areEqual(this.linkUrl, kycInfoEntity.linkUrl) && Intrinsics.areEqual(this.msg, kycInfoEntity.msg) && Intrinsics.areEqual(this.status, kycInfoEntity.status) && Intrinsics.areEqual(this.title, kycInfoEntity.title);
    }

    public static /* synthetic */ KycInfoEntity copy$default(KycInfoEntity kycInfoEntity, String str, String str2, String str3, Integer num, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kycInfoEntity.linkDoc;
        }
        if ((i11 & 2) != 0) {
            str2 = kycInfoEntity.linkUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = kycInfoEntity.msg;
        }
        if ((i11 & 8) != 0) {
            num = kycInfoEntity.status;
        }
        if ((i11 & 16) != 0) {
            str4 = kycInfoEntity.title;
        }
        String str5 = str4;
        String str6 = str3;
        return kycInfoEntity.copy(str, str2, str6, num, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLinkDoc() {
        return this.linkDoc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final KycInfoEntity copy(@Nullable String linkDoc, @Nullable String linkUrl, @Nullable String msg, @Nullable Integer status, @Nullable String title) {
        return new KycInfoEntity(linkDoc, linkUrl, msg, status, title);
    }

    @Nullable
    public final String getLinkDoc() {
        return this.linkDoc;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.linkDoc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.linkUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.msg;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setLinkDoc(@Nullable String str) {
        this.linkDoc = str;
    }

    public final void setLinkUrl(@Nullable String str) {
        this.linkUrl = str;
    }

    @NotNull
    public String toString() {
        return "KycInfoEntity(linkDoc=" + this.linkDoc + ", linkUrl=" + this.linkUrl + ", msg=" + this.msg + ", status=" + this.status + ", title=" + this.title + ')';
    }

    public KycInfoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4) {
        this.linkDoc = str;
        this.linkUrl = str2;
        this.msg = str3;
        this.status = num;
        this.title = str4;
    }
}
