package com.kubi.assets.freeze.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeAgreementContentEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/freeze/entity/TradeAgreementContentEntity;", "", "articleId", "", "content", "tag", "title", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "getContent", "getTag", "getTitle", "getVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeAgreementContentEntity {

    @Nullable
    private final String articleId;

    @Nullable
    private final String content;

    @Nullable
    private final String tag;

    @Nullable
    private final String title;

    @Nullable
    private final String version;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeAgreementContentEntity)) {
            return false;
        }
        TradeAgreementContentEntity tradeAgreementContentEntity = (TradeAgreementContentEntity) other;
        return Intrinsics.areEqual(this.articleId, tradeAgreementContentEntity.articleId) && Intrinsics.areEqual(this.content, tradeAgreementContentEntity.content) && Intrinsics.areEqual(this.tag, tradeAgreementContentEntity.tag) && Intrinsics.areEqual(this.title, tradeAgreementContentEntity.title) && Intrinsics.areEqual(this.version, tradeAgreementContentEntity.version);
    }

    public static /* synthetic */ TradeAgreementContentEntity copy$default(TradeAgreementContentEntity tradeAgreementContentEntity, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tradeAgreementContentEntity.articleId;
        }
        if ((i11 & 2) != 0) {
            str2 = tradeAgreementContentEntity.content;
        }
        if ((i11 & 4) != 0) {
            str3 = tradeAgreementContentEntity.tag;
        }
        if ((i11 & 8) != 0) {
            str4 = tradeAgreementContentEntity.title;
        }
        if ((i11 & 16) != 0) {
            str5 = tradeAgreementContentEntity.version;
        }
        String str6 = str5;
        String str7 = str3;
        return tradeAgreementContentEntity.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final TradeAgreementContentEntity copy(@Nullable String articleId, @Nullable String content, @Nullable String tag, @Nullable String title, @Nullable String version) {
        return new TradeAgreementContentEntity(articleId, content, tag, title, version);
    }

    @Nullable
    public final String getArticleId() {
        return this.articleId;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.articleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tag;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.version;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TradeAgreementContentEntity(articleId=" + this.articleId + ", content=" + this.content + ", tag=" + this.tag + ", title=" + this.title + ", version=" + this.version + ')';
    }

    public TradeAgreementContentEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.articleId = str;
        this.content = str2;
        this.tag = str3;
        this.title = str4;
        this.version = str5;
    }
}
