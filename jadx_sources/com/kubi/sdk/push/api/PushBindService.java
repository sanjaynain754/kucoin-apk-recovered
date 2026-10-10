package com.kubi.sdk.push.api;

import com.kubi.sdk.push.entity.PushBindParam;
import kotlinx.coroutines.C41686h;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PushBindService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/push/api/PushBindService;", "", "<init>", "()V", "TAG", "", "api", "Lcom/kubi/sdk/push/api/PushApi;", "bindPushAnonymous", "", "param", "Lcom/kubi/sdk/push/entity/PushBindParam;", "(Lcom/kubi/sdk/push/entity/PushBindParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bind", "unbind", "LJiGuang_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PushBindService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PushBindService f47596a = new PushBindService();

    /* JADX INFO: renamed from: b */
    public final PushApi m57932b() {
        Object objCreate = C42597a.m93386b().create(PushApi.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (PushApi) objCreate;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m57933c(@NotNull PushBindParam pushBindParam, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PushBindService$bind$2(pushBindParam, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m57934d(@NotNull PushBindParam pushBindParam, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PushBindService$bindPushAnonymous$2(pushBindParam, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m57935e(@NotNull PushBindParam pushBindParam, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PushBindService$unbind$2(pushBindParam, null), continuation);
    }
}
