package com.kubi.httpdns.request;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultDecoder.kt */
/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/httpdns/request/ResponseEntity;", "", "Status", "", "Answer", "", "Lcom/kubi/httpdns/request/AnswerEntity;", "(ILjava/util/List;)V", "getAnswer", "()Ljava/util/List;", "getStatus", "()I", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
final class ResponseEntity {

    @NotNull
    private final List<AnswerEntity> Answer;
    private final int Status;

    public ResponseEntity(int i11, @NotNull List<AnswerEntity> Answer) {
        Intrinsics.checkNotNullParameter(Answer, "Answer");
        this.Status = i11;
        this.Answer = Answer;
    }

    @NotNull
    public final List<AnswerEntity> getAnswer() {
        return this.Answer;
    }

    public final int getStatus() {
        return this.Status;
    }
}
