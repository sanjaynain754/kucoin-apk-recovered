package com.kubi.httpdns.request;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.httpdns.request.g */
/* JADX INFO: compiled from: RequestTaskWrapper.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/httpdns/request/g;", "Request", "Response", "", "request", "", "onStart", "(Ljava/lang/Object;)V", "response", "onSuccess", "", "e", "onFailure", "(Ljava/lang/Throwable;)V", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC15203g<Request, Response> {
    void onFailure(@NotNull Throwable e11);

    void onStart(Request request);

    void onSuccess(Response response);

    /* JADX INFO: renamed from: com.kubi.httpdns.request.g$a */
    /* JADX INFO: compiled from: RequestTaskWrapper.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <Request, Response> void m31485a(@NotNull InterfaceC15203g<Request, Response> interfaceC15203g, Request request) {
        }
    }
}
