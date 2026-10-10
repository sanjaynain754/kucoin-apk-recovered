package com.appsflyer.internal.components.queue.exceptions;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"Lcom/appsflyer/internal/components/queue/exceptions/CreateHttpCallException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "", "msg", "<init>", "(Ljava/lang/String;)V"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CreateHttpCallException extends NoSuchElementException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHttpCallException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
