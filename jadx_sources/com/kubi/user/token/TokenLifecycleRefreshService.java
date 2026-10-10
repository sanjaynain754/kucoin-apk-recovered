package com.kubi.user.token;

import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.kucoin.token.TokenLifecycleRefreshContext;
import com.kubi.kucoin.token.TokenLifecycleRefreshResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.user.token.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: TokenLifecycleRefreshService.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/user/token/TokenLifecycleRefreshService;", "Lcom/kubi/kucoin/token/ITokenLifecycleRefreshSPI;", "<init>", "()V", "refreshToken", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "triggerPath", "", "context", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;", "source", "refreshTimeLimit", "", "(Ljava/lang/String;Lcom/kubi/kucoin/token/TokenLifecycleRefreshContext;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TokenLifecycleRefreshService implements ITokenLifecycleRefreshSPI {
    @Override // com.kubi.kucoin.token.ITokenLifecycleRefreshSPI
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo32883a(@NotNull String str, @NotNull TokenLifecycleRefreshContext tokenLifecycleRefreshContext, @NotNull String str2, long j11, @NotNull Continuation<? super TokenLifecycleRefreshResult> continuation) {
        return TokenLifecycleRefreshExecutor.f53847a.m65852A(str, tokenLifecycleRefreshContext, str2, j11, continuation);
    }
}
