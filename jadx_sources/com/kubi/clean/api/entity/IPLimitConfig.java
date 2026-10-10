package com.kubi.clean.api.entity;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IPLimitConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/clean/api/entity/IPLimitConfig;", "", "<init>", "()V", "dismiss", "", "getDismiss", "()Ljava/lang/Boolean;", "setDismiss", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", TUIConstants.TUIChat.NOTICE, "Lcom/kubi/clean/api/entity/NoticeConfig;", "getNotice", "()Lcom/kubi/clean/api/entity/NoticeConfig;", "setNotice", "(Lcom/kubi/clean/api/entity/NoticeConfig;)V", "bizType", "", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "equals", "other", "hashCode", "", "AutoCleanUserApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IPLimitConfig {

    @Nullable
    private String bizType;

    @Nullable
    private Boolean dismiss = Boolean.FALSE;

    @Nullable
    private NoticeConfig notice;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(IPLimitConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.clean.api.entity.IPLimitConfig");
        IPLimitConfig iPLimitConfig = (IPLimitConfig) other;
        return Intrinsics.areEqual(this.dismiss, iPLimitConfig.dismiss) && Intrinsics.areEqual(this.notice, iPLimitConfig.notice) && Intrinsics.areEqual(this.bizType, iPLimitConfig.bizType);
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final Boolean getDismiss() {
        return this.dismiss;
    }

    @Nullable
    public final NoticeConfig getNotice() {
        return this.notice;
    }

    public int hashCode() {
        Boolean bool = this.dismiss;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        NoticeConfig noticeConfig = this.notice;
        int iHashCode2 = (iHashCode + (noticeConfig != null ? noticeConfig.hashCode() : 0)) * 31;
        String str = this.bizType;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setBizType(@Nullable String str) {
        this.bizType = str;
    }

    public final void setDismiss(@Nullable Boolean bool) {
        this.dismiss = bool;
    }

    public final void setNotice(@Nullable NoticeConfig noticeConfig) {
        this.notice = noticeConfig;
    }
}
