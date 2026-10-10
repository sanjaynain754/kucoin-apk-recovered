package com.kubi.unify.account;

import com.kubi.unify.entity.UnifyNotEmptyErrorEntity;
import com.kubi.utils.C27099x;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AccountDialogHelper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/unify/entity/UnifyNotEmptyErrorEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.account.AccountDialogHelper$showToggleNotEmptyDialog$result$1", m90122f = "AccountDialogHelper.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_SUM}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$completion$iv", "$i$a$-runCatching-AccountDialogHelper$showToggleNotEmptyDialog$result$1$1", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "I$1"})
@SourceDebugExtension({"SMAP\nAccountDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountDialogHelper.kt\ncom/kubi/unify/account/AccountDialogHelper$showToggleNotEmptyDialog$result$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,152:1\n196#2,3:153\n*S KotlinDebug\n*F\n+ 1 AccountDialogHelper.kt\ncom/kubi/unify/account/AccountDialogHelper$showToggleNotEmptyDialog$result$1\n*L\n82#1:153,3\n*E\n"})
public final class AccountDialogHelper$showToggleNotEmptyDialog$result$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends UnifyNotEmptyErrorEntity>>, Object> {
    final /* synthetic */ String $errorMsg;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends UnifyNotEmptyErrorEntity>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<UnifyNotEmptyErrorEntity>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDialogHelper$showToggleNotEmptyDialog$result$1(String str, Continuation<? super AccountDialogHelper$showToggleNotEmptyDialog$result$1> continuation) {
        super(2, continuation);
        this.$errorMsg = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountDialogHelper$showToggleNotEmptyDialog$result$1(this.$errorMsg, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<UnifyNotEmptyErrorEntity>> continuation) {
        return ((AccountDialogHelper$showToggleNotEmptyDialog$result$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String str = this.$errorMsg;
                Result.Companion companion = Result.INSTANCE;
                C27099x c27099x = C27099x.f54458a;
                Intrinsics.checkNotNull(str);
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26463x3cdc7c1f(str, null)), C42911a.m94120b());
                this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$1 = SpillingKt.nullOutSpilledVariable(str);
                this.L$2 = SpillingKt.nullOutSpilledVariable(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl((List) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return objM103844constructorimpl;
    }
}
