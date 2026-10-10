package t00;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.timpush.data.entity.TimPushBind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t00.a */
/* JADX INFO: compiled from: TimPushRemoteDataSource.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0004\b\r\u0010\u000bJ \u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/source/remote/TimPushRemoteDataSource;", "", "webService", "Lcom/kubi/sdk/timpush/data/source/remote/WebService;", "<init>", "(Lcom/kubi/sdk/timpush/data/source/remote/WebService;)V", "bindPushAnonymous", "Lcom/kubi/sdk/base/entity/BaseEntity;", "param", "Lcom/kubi/sdk/timpush/data/entity/TimPushBind;", "bindPushAnonymous$LTimPush_googleRelease", "(Lcom/kubi/sdk/timpush/data/entity/TimPushBind;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindPush", "bindPush$LTimPush_googleRelease", "unbindPush", "unbindPush$LTimPush_googleRelease", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44607a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC44608b f98906a;

    public C44607a(@NotNull InterfaceC44608b webService) {
        Intrinsics.checkNotNullParameter(webService, "webService");
        this.f98906a = webService;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m98718a(@NotNull TimPushBind timPushBind, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return this.f98906a.m98723c(timPushBind, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m98719b(@NotNull TimPushBind timPushBind, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return this.f98906a.m98722b(timPushBind, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m98720c(@NotNull TimPushBind timPushBind, @NotNull Continuation<? super BaseEntity<Object>> continuation) {
        return this.f98906a.m98721a(timPushBind, continuation);
    }
}
