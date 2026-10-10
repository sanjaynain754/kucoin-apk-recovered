package com.kubi.mine.lib.p101ui;

import com.kubi.mine.lib.service.MineDepend;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import f00.C37304a;
import g00.InterfaceC37754f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AccountMoveActivity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.AccountMoveActivity$setOk$1", m90122f = "AccountMoveActivity.kt", m90123i = {}, m90124l = {97}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AccountMoveActivity$setOk$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public AccountMoveActivity$setOk$1(Continuation<? super AccountMoveActivity$setOk$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountMoveActivity$setOk$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AccountMoveActivity$setOk$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            IUserService iUserServiceM41834m = MineDepend.f35159a.m41834m();
            if (iUserServiceM41834m != null) {
                LoginUserEntity loginUserEntityC = UserInfo.c();
                this.label = 1;
                if (iUserServiceM41834m.I(loginUserEntityC, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        MultiLanguageManager.m56981n(UserInfo.c().language);
        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boxing.boxBoolean(true), null, null, null, 59, null);
        return Unit.INSTANCE;
    }
}
