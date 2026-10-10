package com.kubi.notice.notice;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoticeEntity.kt */
/* JADX INFO: loaded from: classes30.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/notice/notice/NoticeDialogEntity;", "", "appUri", "", "content", "id", "linkText", BridgeParamKeyKt.SHARE_KEY_LINKURL, "module", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppUri", "()Ljava/lang/String;", "getContent", "getId", "getLinkText", "getLinkUrl", "getModule", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NoticeDialogEntity {

    @Nullable
    private final String appUri;

    @Nullable
    private final String content;

    @Nullable
    private final String id;

    @Nullable
    private final String linkText;

    @Nullable
    private final String linkUrl;

    @Nullable
    private final String module;

    @Nullable
    private final String title;

    public static /* synthetic */ NoticeDialogEntity copy$default(NoticeDialogEntity noticeDialogEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = noticeDialogEntity.appUri;
        }
        if ((i11 & 2) != 0) {
            str2 = noticeDialogEntity.content;
        }
        if ((i11 & 4) != 0) {
            str3 = noticeDialogEntity.id;
        }
        if ((i11 & 8) != 0) {
            str4 = noticeDialogEntity.linkText;
        }
        if ((i11 & 16) != 0) {
            str5 = noticeDialogEntity.linkUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = noticeDialogEntity.module;
        }
        if ((i11 & 64) != 0) {
            str7 = noticeDialogEntity.title;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return noticeDialogEntity.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeDialogEntity)) {
            return false;
        }
        NoticeDialogEntity noticeDialogEntity = (NoticeDialogEntity) other;
        return Intrinsics.areEqual(this.appUri, noticeDialogEntity.appUri) && Intrinsics.areEqual(this.content, noticeDialogEntity.content) && Intrinsics.areEqual(this.id, noticeDialogEntity.id) && Intrinsics.areEqual(this.linkText, noticeDialogEntity.linkText) && Intrinsics.areEqual(this.linkUrl, noticeDialogEntity.linkUrl) && Intrinsics.areEqual(this.module, noticeDialogEntity.module) && Intrinsics.areEqual(this.title, noticeDialogEntity.title);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppUri() {
        return this.appUri;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLinkText() {
        return this.linkText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final NoticeDialogEntity copy(@Nullable String appUri, @Nullable String content, @Nullable String id2, @Nullable String linkText, @Nullable String linkUrl, @Nullable String module, @Nullable String title) {
        return new NoticeDialogEntity(appUri, content, id2, linkText, linkUrl, module, title);
    }

    @Nullable
    public final String getAppUri() {
        return this.appUri;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLinkText() {
        return this.linkText;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getModule() {
        return this.module;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.appUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.module;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NoticeDialogEntity(appUri=" + this.appUri + ", content=" + this.content + ", id=" + this.id + ", linkText=" + this.linkText + ", linkUrl=" + this.linkUrl + ", module=" + this.module + ", title=" + this.title + ')';
    }

    public NoticeDialogEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.appUri = str;
        this.content = str2;
        this.id = str3;
        this.linkText = str4;
        this.linkUrl = str5;
        this.module = str6;
        this.title = str7;
    }
}
