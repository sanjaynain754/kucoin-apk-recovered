package com.kubi.tradingbotkit.entity.asset;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: AssetsTotalEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001c\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\t¨\u0006'"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/asset/TemplateInfo;", "", "<init>", "()V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", TUIConstants.TUIChat.INPUT_MORE_ICON, "getIcon", "setIcon", "id", "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "jumpLink1", "getJumpLink1", "setJumpLink1", "jumpLink2", "getJumpLink2", "setJumpLink2", "orderNum", "", "getOrderNum", "()Ljava/lang/Integer;", "setOrderNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "templateId", "getTemplateId", "setTemplateId", "title", "getTitle", "setTitle", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TemplateInfo {

    @Nullable
    private String desc;

    @Nullable
    private String icon;

    @Nullable
    private Long id;

    @Nullable
    private String jumpLink1;

    @Nullable
    private String jumpLink2;

    @Nullable
    private Integer orderNum;

    @Nullable
    private Long templateId;

    @Nullable
    private String title;

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpLink1() {
        return this.jumpLink1;
    }

    @Nullable
    public final String getJumpLink2() {
        return this.jumpLink2;
    }

    @Nullable
    public final Integer getOrderNum() {
        return this.orderNum;
    }

    @Nullable
    public final Long getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(@Nullable Long l11) {
        this.id = l11;
    }

    public final void setJumpLink1(@Nullable String str) {
        this.jumpLink1 = str;
    }

    public final void setJumpLink2(@Nullable String str) {
        this.jumpLink2 = str;
    }

    public final void setOrderNum(@Nullable Integer num) {
        this.orderNum = num;
    }

    public final void setTemplateId(@Nullable Long l11) {
        this.templateId = l11;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
