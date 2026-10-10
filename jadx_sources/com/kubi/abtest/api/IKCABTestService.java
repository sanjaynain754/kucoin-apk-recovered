package com.kubi.abtest.api;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: IKCABTestService.kt */
/* JADX INFO: loaded from: classes23.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/abtest/api/IKCABTestService;", "", "fastFetchABTest", "", RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID, "defaultValue", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ABTestApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKCABTestService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f14850a = Companion.f14851a;

    /* JADX INFO: compiled from: IKCABTestService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/abtest/api/IKCABTestService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/abtest/api/IKCABTestService;", "ABTestApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f14851a = new Companion();

        @NotNull
        public final IKCABTestService get() {
            return (IKCABTestService) Router.f46192a.m56192n(IKCABTestService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo14634a(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super String> continuation);
}
