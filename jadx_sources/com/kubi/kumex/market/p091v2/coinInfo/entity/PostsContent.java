package com.kubi.kumex.market.p091v2.coinInfo.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00061"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/PostsContent;", "", "href", "", "id", "projectId", "remark", "spliceOne", "spliceTwo", TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY, "status", "subHref", "subText", "text", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "getId", "getProjectId", "getRemark", "getSpliceOne", "getSpliceTwo", "getSrc", "getStatus", "getSubHref", "getSubText", "getText", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PostsContent {

    @Nullable
    private final String href;

    @Nullable
    private final String id;

    @Nullable
    private final String projectId;

    @Nullable
    private final String remark;

    @Nullable
    private final String spliceOne;

    @Nullable
    private final String spliceTwo;

    @Nullable
    private final String src;

    @Nullable
    private final String status;

    @Nullable
    private final String subHref;

    @Nullable
    private final String subText;

    @Nullable
    private final String text;

    @Nullable
    private final String type;

    public PostsContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostsContent)) {
            return false;
        }
        PostsContent postsContent = (PostsContent) other;
        return Intrinsics.areEqual(this.href, postsContent.href) && Intrinsics.areEqual(this.id, postsContent.id) && Intrinsics.areEqual(this.projectId, postsContent.projectId) && Intrinsics.areEqual(this.remark, postsContent.remark) && Intrinsics.areEqual(this.spliceOne, postsContent.spliceOne) && Intrinsics.areEqual(this.spliceTwo, postsContent.spliceTwo) && Intrinsics.areEqual(this.src, postsContent.src) && Intrinsics.areEqual(this.status, postsContent.status) && Intrinsics.areEqual(this.subHref, postsContent.subHref) && Intrinsics.areEqual(this.subText, postsContent.subText) && Intrinsics.areEqual(this.text, postsContent.text) && Intrinsics.areEqual(this.type, postsContent.type);
    }

    public PostsContent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.href = str;
        this.id = str2;
        this.projectId = str3;
        this.remark = str4;
        this.spliceOne = str5;
        this.spliceTwo = str6;
        this.src = str7;
        this.status = str8;
        this.subHref = str9;
        this.subText = str10;
        this.text = str11;
        this.type = str12;
    }

    public static /* synthetic */ PostsContent copy$default(PostsContent postsContent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = postsContent.href;
        }
        if ((i11 & 2) != 0) {
            str2 = postsContent.id;
        }
        if ((i11 & 4) != 0) {
            str3 = postsContent.projectId;
        }
        if ((i11 & 8) != 0) {
            str4 = postsContent.remark;
        }
        if ((i11 & 16) != 0) {
            str5 = postsContent.spliceOne;
        }
        if ((i11 & 32) != 0) {
            str6 = postsContent.spliceTwo;
        }
        if ((i11 & 64) != 0) {
            str7 = postsContent.src;
        }
        if ((i11 & 128) != 0) {
            str8 = postsContent.status;
        }
        if ((i11 & 256) != 0) {
            str9 = postsContent.subHref;
        }
        if ((i11 & 512) != 0) {
            str10 = postsContent.subText;
        }
        if ((i11 & 1024) != 0) {
            str11 = postsContent.text;
        }
        if ((i11 & 2048) != 0) {
            str12 = postsContent.type;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return postsContent.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHref() {
        return this.href;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSpliceOne() {
        return this.spliceOne;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSpliceTwo() {
        return this.spliceTwo;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubHref() {
        return this.subHref;
    }

    @NotNull
    public final PostsContent copy(@Nullable String href, @Nullable String id2, @Nullable String projectId, @Nullable String remark, @Nullable String spliceOne, @Nullable String spliceTwo, @Nullable String src, @Nullable String status, @Nullable String subHref, @Nullable String subText, @Nullable String text, @Nullable String type) {
        return new PostsContent(href, id2, projectId, remark, spliceOne, spliceTwo, src, status, subHref, subText, text, type);
    }

    @Nullable
    public final String getHref() {
        return this.href;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getProjectId() {
        return this.projectId;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getSpliceOne() {
        return this.spliceOne;
    }

    @Nullable
    public final String getSpliceTwo() {
        return this.spliceTwo;
    }

    @Nullable
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubHref() {
        return this.subHref;
    }

    @Nullable
    public final String getSubText() {
        return this.subText;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.href;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.projectId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.remark;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.spliceOne;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spliceTwo;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.src;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.subHref;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.subText;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.text;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.type;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PostsContent(href=" + this.href + ", id=" + this.id + ", projectId=" + this.projectId + ", remark=" + this.remark + ", spliceOne=" + this.spliceOne + ", spliceTwo=" + this.spliceTwo + ", src=" + this.src + ", status=" + this.status + ", subHref=" + this.subHref + ", subText=" + this.subText + ", text=" + this.text + ", type=" + this.type + ')';
    }

    public /* synthetic */ PostsContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12);
    }
}
