package com.kubi.tradingbotkit.model;

import androidx.annotation.Keep;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: GridTradingItemModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001e\u0010)\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/GridTradingItemModel;", "", "<init>", "()V", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "labelIcon", "getLabelIcon", "setLabelIcon", "name", "getName", "setName", "path", "getPath", "setPath", "subTitle", "getSubTitle", "setSubTitle", "type", "getType", "setType", TUIConstants.TIMPush.NOTIFICATION.ACTION, "getAction", "setAction", "totalRunNumber", "", "getTotalRunNumber", "()Ljava/lang/Long;", "setTotalRunNumber", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "isSelected", "", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "canSelect", "getCanSelect", "setCanSelect", "labelIconVisible", "", "getLabelIconVisible", "()I", "setLabelIconVisible", "(I)V", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GridTradingItemModel {

    @Nullable
    private String action;

    @Nullable
    private String icon;

    @Nullable
    private String labelIcon;
    private int labelIconVisible;

    @Nullable
    private String name;

    @Nullable
    private String path;

    @Nullable
    private String subTitle;

    @Nullable
    private Long totalRunNumber;

    @Nullable
    private String type;

    @Nullable
    private Boolean isSelected = Boolean.FALSE;

    @Nullable
    private Boolean canSelect = Boolean.TRUE;

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Boolean getCanSelect() {
        return this.canSelect;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getLabelIcon() {
        return this.labelIcon;
    }

    public final int getLabelIconVisible() {
        return this.labelIconVisible;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final Long getTotalRunNumber() {
        return this.totalRunNumber;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setCanSelect(@Nullable Boolean bool) {
        this.canSelect = bool;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLabelIcon(@Nullable String str) {
        this.labelIcon = str;
    }

    public final void setLabelIconVisible(int i11) {
        this.labelIconVisible = i11;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setSelected(@Nullable Boolean bool) {
        this.isSelected = bool;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTotalRunNumber(@Nullable Long l11) {
        this.totalRunNumber = l11;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
