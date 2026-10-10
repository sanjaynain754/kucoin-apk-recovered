package com.kubi.unify.account;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.api.entity.UnifyAccountType;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: UnifyAccountViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$requestToggle$1", m90122f = "UnifyAccountViewModel.kt", m90123i = {0}, m90124l = {59}, m90125m = "invokeSuspend", m90126n = {"trackKey"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nUnifyAccountViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$requestToggle$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n25#2:121\n26#2:123\n1#3:122\n*S KotlinDebug\n*F\n+ 1 UnifyAccountViewModel.kt\ncom/kubi/unify/account/UnifyAccountViewModel$requestToggle$1\n*L\n66#1:121\n66#1:123\n66#1:122\n*E\n"})
public final class UnifyAccountViewModel$requestToggle$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountType;
    Object L$0;
    int label;
    final /* synthetic */ UnifyAccountViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountViewModel$requestToggle$1$1 */
    /* JADX INFO: compiled from: UnifyAccountViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.account.UnifyAccountViewModel$requestToggle$1$1", m90122f = "UnifyAccountViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C264721 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountType;
        final /* synthetic */ String $trackKey;
        int label;
        final /* synthetic */ UnifyAccountViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C264721(String str, String str2, UnifyAccountViewModel unifyAccountViewModel, Continuation<? super C264721> continuation) {
            super(2, continuation);
            this.$trackKey = str;
            this.$accountType = str2;
            this.this$0 = unifyAccountViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264721(this.$trackKey, this.$accountType, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C264721) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C43852m.m96591c("B6UnifiedPage", "toggleAccount", '3' + this.$trackKey, null, 8, null);
                UnifyGlobalDataManager.m64868l(UnifyGlobalDataManager.f53084a, this.$accountType, null, null, 6, null);
                this.this$0.f53108W.setValue(Boxing.boxBoolean(false));
                this.this$0.f53110Y.setValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyAccountViewModel$requestToggle$1(String str, UnifyAccountViewModel unifyAccountViewModel, Continuation<? super UnifyAccountViewModel$requestToggle$1> continuation) {
        super(2, continuation);
        this.$accountType = str;
        this.this$0 = unifyAccountViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifyAccountViewModel$requestToggle$1(this.$accountType, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifyAccountViewModel$requestToggle$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(this.$accountType, UnifyAccountType.UNIFIED.getValue())) {
                str = "2";
            } else {
                str = "1";
            }
            InterfaceC41634e<Object> interfaceC41634eM86740g = this.this$0.m64946w().m86740g(MapsKt.mapOf(TuplesKt.m90091to("accountType", this.$accountType)));
            C264721 c264721 = new C264721(str, this.$accountType, this.this$0, null);
            this.L$0 = str;
            this.label = 1;
            Object objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM86740g, false, c264721, this);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            obj = objM42823d;
        }
        UnifyAccountViewModel unifyAccountViewModel = this.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C43852m.m96591c("B6UnifiedPage", "toggleAccount", '4' + str2, null, 8, null);
            unifyAccountViewModel.f53108W.setValue(Boxing.boxBoolean(false));
            if (throwable instanceof ApiException) {
                String str3 = ((ApiException) throwable).code;
                if (Intrinsics.areEqual(str3, "109011")) {
                    unifyAccountViewModel.f53112a0.setValue(throwable.getMessage());
                } else if (Intrinsics.areEqual(str3, "109004")) {
                    unifyAccountViewModel.m64945v();
                } else {
                    C19331c.m42836c(throwable, null, 2, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
