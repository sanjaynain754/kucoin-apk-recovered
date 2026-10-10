package com.kubi.kucoin.token;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: ITokenLifecycleRefreshSPI.kt */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/token/ITokenLifecycleRefreshSPI;", "", "refreshToken", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "triggerPath", "", "context", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;", "source", "refreshTimeLimit", "", "(Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ITokenLifecycleRefreshSPI {

    /* JADX INFO: compiled from: ITokenLifecycleRefreshSPI.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/token/ITokenLifecycleRefreshSPI$Companion;", "", "<init>", "()V", "SOURCE_FLUTTER", "", "SOURCE_MANUAL", "SOURCE_PREFLIGHT", "SOURCE_HOME_5000007", "SOURCE_401", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        @NotNull
        public static final String SOURCE_401 = "401";

        @NotNull
        public static final String SOURCE_FLUTTER = "flutter";

        @NotNull
        public static final String SOURCE_HOME_5000007 = "home_5000007";

        @NotNull
        public static final String SOURCE_MANUAL = "manual";

        @NotNull
        public static final String SOURCE_PREFLIGHT = "preflight";

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f28422a = new Companion();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo32883a(@NotNull String str, @NotNull TokenLifecycleRefreshContext tokenLifecycleRefreshContext, @NotNull String str2, long j11, @NotNull Continuation<? super TokenLifecycleRefreshResult> continuation);
}
