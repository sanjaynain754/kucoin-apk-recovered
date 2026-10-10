package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: NoticeEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/NoticeEntity;", "", "start", "", "end", "title", "", "content", "directUrl", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStart", "()Ljava/lang/Long;", "setStart", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEnd", "setEnd", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getContent", "setContent", "getDirectUrl", "setDirectUrl", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoticeEntity {

    @Nullable
    private String content;

    @Nullable
    private String directUrl;

    @Nullable
    private Long end;

    @Nullable
    private Long start;

    @Nullable
    private String title;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDirectUrl() {
        return this.directUrl;
    }

    @Nullable
    public final Long getEnd() {
        return this.end;
    }

    @Nullable
    public final Long getStart() {
        return this.start;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDirectUrl(@Nullable String str) {
        this.directUrl = str;
    }

    public final void setEnd(@Nullable Long l11) {
        this.end = l11;
    }

    public final void setStart(@Nullable Long l11) {
        this.start = l11;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public NoticeEntity(@Nullable Long l11, @Nullable Long l12, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.start = l11;
        this.end = l12;
        this.title = str;
        this.content = str2;
        this.directUrl = str3;
    }
}
