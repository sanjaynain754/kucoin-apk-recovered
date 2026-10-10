package com.kubi.mine.lib.p101ui.userinfo;

import com.kubi.mine.lib.entity.QueryAuditInfoResponse;
import com.kubi.mine.lib.entity.UserCommitAuditResponse;
import com.kubi.mine.lib.helper.UserInfoRequestHelper;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;

/* JADX INFO: compiled from: EditUserInfoVM.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0094@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAuditUserInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commitAuditUserInfo", "avatar", "", "nickName", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EditUserInfoVM extends AbstractC19291m<EditUserInfoContract$UIState> {

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.userinfo.EditUserInfoVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: EditUserInfoVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.EditUserInfoVM", m90122f = "EditUserInfoVM.kt", m90123i = {0, 1, 2}, m90124l = {17, 19, 21}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C191611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191611(Continuation<? super C191611> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EditUserInfoVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (m42326o(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (m42324e(r2, r8, r0) == r1) goto L32;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C191611 c191611;
        if (continuation instanceof C191611) {
            c191611 = (C191611) continuation;
            int i11 = c191611.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c191611.label = i11 - Integer.MIN_VALUE;
            } else {
                c191611 = new C191611(continuation);
            }
        } else {
            c191611 = new C191611(continuation);
        }
        Object obj = c191611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c191611.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c191611.L$0 = interfaceC19282d;
            c191611.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c191611) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c191611.L$0;
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof EditUserInfoContract$UIIntent.QueryAuditUserInfoIntent) {
            c191611.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c191611.label = 2;
        } else {
            if (!(interfaceC19282d instanceof EditUserInfoContract$UIIntent.CommitAuditUserInfoIntent)) {
                return Unit.INSTANCE;
            }
            EditUserInfoContract$UIIntent.CommitAuditUserInfoIntent commitAuditUserInfoIntent = (EditUserInfoContract$UIIntent.CommitAuditUserInfoIntent) interfaceC19282d;
            String avatar = commitAuditUserInfoIntent.getAvatar();
            String nickName = commitAuditUserInfoIntent.getNickName();
            c191611.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c191611.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m42324e(String str, String str2, Continuation<? super Unit> continuation) {
        EditUserInfoVM$commitAuditUserInfo$1 editUserInfoVM$commitAuditUserInfo$1;
        if (continuation instanceof EditUserInfoVM$commitAuditUserInfo$1) {
            editUserInfoVM$commitAuditUserInfo$1 = (EditUserInfoVM$commitAuditUserInfo$1) continuation;
            int i11 = editUserInfoVM$commitAuditUserInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                editUserInfoVM$commitAuditUserInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                editUserInfoVM$commitAuditUserInfo$1 = new EditUserInfoVM$commitAuditUserInfo$1(this, continuation);
            }
        } else {
            editUserInfoVM$commitAuditUserInfo$1 = new EditUserInfoVM$commitAuditUserInfo$1(this, continuation);
        }
        Object objM41652a = editUserInfoVM$commitAuditUserInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = editUserInfoVM$commitAuditUserInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM41652a);
            UserInfoRequestHelper userInfoRequestHelper = UserInfoRequestHelper.f35028a;
            editUserInfoVM$commitAuditUserInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            editUserInfoVM$commitAuditUserInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            editUserInfoVM$commitAuditUserInfo$1.label = 1;
            objM41652a = userInfoRequestHelper.m41652a(str, str2, editUserInfoVM$commitAuditUserInfo$1);
            if (objM41652a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM41652a);
        }
        Triple triple = (Triple) objM41652a;
        send(new C19164c(((Boolean) triple.getFirst()).booleanValue(), (UserCommitAuditResponse) triple.getSecond(), (String) triple.getThird()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.mine.lib.ui.userinfo.EditUserInfoContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public EditUserInfoContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.mine.lib.ui.userinfo.EditUserInfoContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m42326o(Continuation<? super Unit> continuation) {
        EditUserInfoVM$queryAuditUserInfo$1 editUserInfoVM$queryAuditUserInfo$1;
        if (continuation instanceof EditUserInfoVM$queryAuditUserInfo$1) {
            editUserInfoVM$queryAuditUserInfo$1 = (EditUserInfoVM$queryAuditUserInfo$1) continuation;
            int i11 = editUserInfoVM$queryAuditUserInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                editUserInfoVM$queryAuditUserInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                editUserInfoVM$queryAuditUserInfo$1 = new EditUserInfoVM$queryAuditUserInfo$1(this, continuation);
            }
        } else {
            editUserInfoVM$queryAuditUserInfo$1 = new EditUserInfoVM$queryAuditUserInfo$1(this, continuation);
        }
        Object objM41653b = editUserInfoVM$queryAuditUserInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = editUserInfoVM$queryAuditUserInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM41653b);
            UserInfoRequestHelper userInfoRequestHelper = UserInfoRequestHelper.f35028a;
            editUserInfoVM$queryAuditUserInfo$1.label = 1;
            objM41653b = userInfoRequestHelper.m41653b(editUserInfoVM$queryAuditUserInfo$1);
            if (objM41653b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM41653b);
        }
        Pair pair = (Pair) objM41653b;
        send(new C19165d(((Boolean) pair.getFirst()).booleanValue(), (QueryAuditInfoResponse) pair.getSecond()));
        return Unit.INSTANCE;
    }
}
