package com.kubi.home.message.card;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: NoticeConfigEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/message/card/NoticeConfigEntity;", "", "id", "", "content", "", "state", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/lang/String;", "getState", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NoticeConfigEntity {

    @Nullable
    private final String content;

    @Nullable
    private final Integer id;

    @Nullable
    private final Boolean state;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Boolean getState() {
        return this.state;
    }

    public NoticeConfigEntity(@Nullable Integer num, @Nullable String str, @Nullable Boolean bool) {
        this.id = num;
        this.content = str;
        this.state = bool;
    }
}
