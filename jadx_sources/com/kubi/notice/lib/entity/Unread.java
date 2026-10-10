package com.kubi.notice.lib.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Unread.kt */
/* JADX INFO: loaded from: classes30.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/notice/lib/entity/Unread;", "", "subject", "", "count", "", "<init>", "(Ljava/lang/String;I)V", "getSubject", "()Ljava/lang/String;", "getCount", "()I", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Unread {
    private final int count;

    @NotNull
    private final String subject;

    /* JADX WARN: Multi-variable type inference failed */
    public Unread() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public Unread(@NotNull String subject, int i11) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        this.subject = subject;
        this.count = i11;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getSubject() {
        return this.subject;
    }

    public /* synthetic */ Unread(String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 0 : i11);
    }
}
