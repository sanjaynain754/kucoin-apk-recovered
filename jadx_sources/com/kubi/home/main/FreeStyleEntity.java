package com.kubi.home.main;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FreeStyleEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\t¨\u0006 "}, m90084d2 = {"Lcom/kubi/home/main/FreeStyleEntity;", "", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "intervals", "", "getIntervals", "()Ljava/lang/Double;", "setIntervals", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", BridgeParamKeyKt.SHARE_KEY_LINKURL, "getLinkUrl", "setLinkUrl", "module", "getModule", "setModule", "postTitle", "getPostTitle", "setPostTitle", "resourceUrl", "getResourceUrl", "setResourceUrl", "type", "getType", "setType", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FreeStyleEntity {

    @Nullable
    private String id = "";

    @Nullable
    private Double intervals = Double.valueOf(0.0d);

    @Nullable
    private String linkUrl = "";

    @Nullable
    private String module = "";

    @Nullable
    private String postTitle = "";

    @Nullable
    private String resourceUrl = "";

    @Nullable
    private String type = "";

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Double getIntervals() {
        return this.intervals;
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
    public final String getPostTitle() {
        return this.postTitle;
    }

    @Nullable
    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setIntervals(@Nullable Double d11) {
        this.intervals = d11;
    }

    public final void setLinkUrl(@Nullable String str) {
        this.linkUrl = str;
    }

    public final void setModule(@Nullable String str) {
        this.module = str;
    }

    public final void setPostTitle(@Nullable String str) {
        this.postTitle = str;
    }

    public final void setResourceUrl(@Nullable String str) {
        this.resourceUrl = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
