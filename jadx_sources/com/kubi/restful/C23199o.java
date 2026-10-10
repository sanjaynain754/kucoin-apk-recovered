package com.kubi.restful;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.restful.o */
/* JADX INFO: compiled from: RestfulCallFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/restful/o;", "Resp", "Lcom/kubi/restful/c;", "<init>", "()V", "Lcom/kubi/restful/m;", "request", "Lcom/kubi/restful/RestfulCall;", "b", "(Lcom/kubi/restful/m;)Lcom/kubi/restful/RestfulCall;", "Restful_release"}, m90085k = 1, m90086mv = {1, 4, 2})
public final class C23199o<Resp> implements InterfaceC23187c<Resp> {
    @Override // com.kubi.restful.InterfaceC23187c
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RestfulCall<Resp> mo55655a(@NotNull C23197m request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new RestfulCall<>(new C23202r(request));
    }
}
