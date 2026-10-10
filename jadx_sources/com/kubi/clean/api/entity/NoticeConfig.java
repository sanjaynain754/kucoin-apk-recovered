package com.kubi.clean.api.entity;

import androidx.annotation.Keep;
import com.reactnativecommunity.webview.events.TopMessageEvent;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IPLimitConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010F\u001a\u00020$2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010H\u001a\u00020+H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00101\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001c\u00104\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001c\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001c\u0010:\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u001c\u0010=\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR\u001c\u0010@\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001c\u0010C\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\t¨\u0006I"}, m90084d2 = {"Lcom/kubi/clean/api/entity/NoticeConfig;", "", "<init>", "()V", "buttonAgree", "", "getButtonAgree", "()Ljava/lang/String;", "setButtonAgree", "(Ljava/lang/String;)V", "buttonRefuse", "getButtonRefuse", "setButtonRefuse", "buttonAgreeAppUrl", "getButtonAgreeAppUrl", "setButtonAgreeAppUrl", "buttonRefuseAppUrl", "getButtonRefuseAppUrl", "setButtonRefuseAppUrl", TopMessageEvent.EVENT_NAME, "getTopMessage", "setTopMessage", "content", "getContent", "setContent", "title", "getTitle", "setTitle", "durationTime", "", "getDurationTime", "()Ljava/lang/Long;", "setDurationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "closable", "", "getClosable", "()Ljava/lang/Boolean;", "setClosable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "kycClearStatus", "", "getKycClearStatus", "()Ljava/lang/Integer;", "setKycClearStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "kycClearAt", "getKycClearAt", "setKycClearAt", "displayType", "getDisplayType", "setDisplayType", "welfareTaskId", "getWelfareTaskId", "setWelfareTaskId", "privacy", "getPrivacy", "setPrivacy", "privacyUrl", "getPrivacyUrl", "setPrivacyUrl", "configCode", "getConfigCode", "setConfigCode", DropFrameTable.COLUMN_SCENE, "getScene", "setScene", "equals", "other", "hashCode", "AutoCleanUserApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoticeConfig {

    @Nullable
    private String configCode;

    @Nullable
    private String displayType;

    @Nullable
    private Long durationTime;

    @Nullable
    private String privacy;

    @Nullable
    private String privacyUrl;

    @Nullable
    private String scene;

    @Nullable
    private String welfareTaskId;

    @Nullable
    private String buttonAgree = "";

    @Nullable
    private String buttonRefuse = "";

    @Nullable
    private String buttonAgreeAppUrl = "";

    @Nullable
    private String buttonRefuseAppUrl = "";

    @Nullable
    private String topMessage = "";

    @Nullable
    private String content = "";

    @Nullable
    private String title = "";

    @Nullable
    private Boolean closable = Boolean.TRUE;

    @Nullable
    private Integer kycClearStatus = -1;

    @Nullable
    private Long kycClearAt = -1L;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(NoticeConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.clean.api.entity.NoticeConfig");
        NoticeConfig noticeConfig = (NoticeConfig) other;
        return Intrinsics.areEqual(this.buttonAgree, noticeConfig.buttonAgree) && Intrinsics.areEqual(this.buttonRefuse, noticeConfig.buttonRefuse) && Intrinsics.areEqual(this.buttonAgreeAppUrl, noticeConfig.buttonAgreeAppUrl) && Intrinsics.areEqual(this.buttonRefuseAppUrl, noticeConfig.buttonRefuseAppUrl) && Intrinsics.areEqual(this.topMessage, noticeConfig.topMessage) && Intrinsics.areEqual(this.content, noticeConfig.content) && Intrinsics.areEqual(this.title, noticeConfig.title) && Intrinsics.areEqual(this.durationTime, noticeConfig.durationTime) && Intrinsics.areEqual(this.closable, noticeConfig.closable) && Intrinsics.areEqual(this.kycClearStatus, noticeConfig.kycClearStatus) && Intrinsics.areEqual(this.kycClearAt, noticeConfig.kycClearAt) && Intrinsics.areEqual(this.displayType, noticeConfig.displayType) && Intrinsics.areEqual(this.privacy, noticeConfig.privacy) && Intrinsics.areEqual(this.privacyUrl, noticeConfig.privacyUrl) && Intrinsics.areEqual(this.configCode, noticeConfig.configCode) && Intrinsics.areEqual(this.scene, noticeConfig.scene);
    }

    @Nullable
    public final String getButtonAgree() {
        return this.buttonAgree;
    }

    @Nullable
    public final String getButtonAgreeAppUrl() {
        return this.buttonAgreeAppUrl;
    }

    @Nullable
    public final String getButtonRefuse() {
        return this.buttonRefuse;
    }

    @Nullable
    public final String getButtonRefuseAppUrl() {
        return this.buttonRefuseAppUrl;
    }

    @Nullable
    public final Boolean getClosable() {
        return this.closable;
    }

    @Nullable
    public final String getConfigCode() {
        return this.configCode;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final Long getDurationTime() {
        return this.durationTime;
    }

    @Nullable
    public final Long getKycClearAt() {
        return this.kycClearAt;
    }

    @Nullable
    public final Integer getKycClearStatus() {
        return this.kycClearStatus;
    }

    @Nullable
    public final String getPrivacy() {
        return this.privacy;
    }

    @Nullable
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    @Nullable
    public final String getScene() {
        return this.scene;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTopMessage() {
        return this.topMessage;
    }

    @Nullable
    public final String getWelfareTaskId() {
        return this.welfareTaskId;
    }

    public int hashCode() {
        String str = this.buttonAgree;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.buttonRefuse;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buttonAgreeAppUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buttonRefuseAppUrl;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.topMessage;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.content;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.title;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Long l11 = this.durationTime;
        int iHashCode8 = (iHashCode7 + (l11 != null ? l11.hashCode() : 0)) * 31;
        Boolean bool = this.closable;
        int iHashCode9 = (iHashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.kycClearStatus;
        int iIntValue = (iHashCode9 + (num != null ? num.intValue() : 0)) * 31;
        Long l12 = this.kycClearAt;
        int iHashCode10 = (iIntValue + (l12 != null ? l12.hashCode() : 0)) * 31;
        String str8 = this.displayType;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.privacy;
        int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.privacyUrl;
        int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.configCode;
        int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.scene;
        return iHashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setButtonAgree(@Nullable String str) {
        this.buttonAgree = str;
    }

    public final void setButtonAgreeAppUrl(@Nullable String str) {
        this.buttonAgreeAppUrl = str;
    }

    public final void setButtonRefuse(@Nullable String str) {
        this.buttonRefuse = str;
    }

    public final void setButtonRefuseAppUrl(@Nullable String str) {
        this.buttonRefuseAppUrl = str;
    }

    public final void setClosable(@Nullable Boolean bool) {
        this.closable = bool;
    }

    public final void setConfigCode(@Nullable String str) {
        this.configCode = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDisplayType(@Nullable String str) {
        this.displayType = str;
    }

    public final void setDurationTime(@Nullable Long l11) {
        this.durationTime = l11;
    }

    public final void setKycClearAt(@Nullable Long l11) {
        this.kycClearAt = l11;
    }

    public final void setKycClearStatus(@Nullable Integer num) {
        this.kycClearStatus = num;
    }

    public final void setPrivacy(@Nullable String str) {
        this.privacy = str;
    }

    public final void setPrivacyUrl(@Nullable String str) {
        this.privacyUrl = str;
    }

    public final void setScene(@Nullable String str) {
        this.scene = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTopMessage(@Nullable String str) {
        this.topMessage = str;
    }

    public final void setWelfareTaskId(@Nullable String str) {
        this.welfareTaskId = str;
    }
}
