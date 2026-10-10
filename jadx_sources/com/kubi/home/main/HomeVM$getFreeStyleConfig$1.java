package com.kubi.home.main;

import com.kubi.home.exception.HomeException;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mvi.common.C19241c;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.user.config.UserInfo;
import dj.C36716a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p058cj.C4988a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HomeVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$getFreeStyleConfig$1", m90122f = "HomeVM.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m90124l = {139}, m90125m = "invokeSuspend", m90126n = {"bizType$iv", "methodName$iv", "reportName$iv", "it", "uid", "needCatch$iv", "$i$f$safeCall", "$i$a$-runCatching-MviExKt$safeCall$1$iv", "$i$a$-safeCall$default-HomeVM$getFreeStyleConfig$1$1", "$i$a$-let-HomeVM$getFreeStyleConfig$1$1$1"}, m90127s = {"L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "I$4"})
@SourceDebugExtension({"SMAP\nHomeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM$getFreeStyleConfig$1\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,292:1\n50#2,17:293\n1#3:310\n47#4,2:311\n*S KotlinDebug\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM$getFreeStyleConfig$1\n*L\n130#1:293,17\n158#1:311,2\n*E\n"})
public final class HomeVM$getFreeStyleConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ HomeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVM$getFreeStyleConfig$1(HomeVM homeVM, Continuation<? super HomeVM$getFreeStyleConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVM;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m29391f(HomeVM homeVM, FreeStyleEntity freeStyleEntity) {
        C4988a.m5286a("getFreeStyleConfig-alertFreestyle", "HomeVM");
        if (!GlobalDialogManager.f43651a.m54344i() && homeVM.m29384I()) {
            homeVM.m29385J(FreeStyleDialog.f25706r0.newInstance(freeStyleEntity), "FreeStyleDialog");
            ExtensionKt.m32184j(homeVM, new HomeVM$getFreeStyleConfig$1$1$1$1$1$1(homeVM, freeStyleEntity, null));
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVM$getFreeStyleConfig$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeVM$getFreeStyleConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final HomeVM homeVM;
        String str;
        int i11;
        String str2;
        Long lBoxLong;
        Object objM42826g;
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 == 1) {
                i11 = this.I$0;
                HomeVM homeVM2 = (HomeVM) this.L$3;
                str2 = (String) this.L$2;
                str = (String) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    homeVM = homeVM2;
                    objM42826g = obj;
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            homeVM = this.this$0;
            int i13 = !C19241c.f35620a.m42528a() ? 1 : 0;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                C4988a.m5286a("getFreeStyleConfig-queryAppNotice uid:" + UserInfo.c().uid, "HomeVM");
                String str3 = UserInfo.c().uid;
                if (str3 != null && str3.length() != 0) {
                    lBoxLong = Boxing.boxLong(Long.parseLong(str3));
                } else {
                    lBoxLong = null;
                }
                InterfaceC41634e<FreeStyleEntity> interfaceC41634eM29393b = homeVM.f25745V.m29393b(lBoxLong);
                this.L$0 = "queryAppNotice";
                this.L$1 = SpillingKt.nullOutSpilledVariable("NONE");
                this.L$2 = "crash_issue";
                this.L$3 = homeVM;
                this.L$4 = SpillingKt.nullOutSpilledVariable(str3);
                this.L$5 = SpillingKt.nullOutSpilledVariable(lBoxLong);
                this.I$0 = i13;
                this.I$1 = 0;
                this.I$2 = 0;
                this.I$3 = 0;
                this.I$4 = 0;
                this.label = 1;
                objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM29393b, false, null, this, 2, null);
                if (objM42826g != coroutine_suspended) {
                    str = "queryAppNotice";
                    i11 = i13;
                    str2 = "crash_issue";
                } else {
                    return coroutine_suspended;
                }
            } catch (Throwable th3) {
                th = th3;
                str = "queryAppNotice";
                i11 = i13;
                str2 = "crash_issue";
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
            }
        }
        final FreeStyleEntity freeStyleEntity = (FreeStyleEntity) ((C19334f) objM42826g).m42846a();
        if (freeStyleEntity != null) {
            if (Intrinsics.areEqual(freeStyleEntity.getModule(), "MAIN") && Intrinsics.areEqual(freeStyleEntity.getType(), "PICTURE")) {
                C36716a.m82239b(freeStyleEntity.getResourceUrl());
                homeVM.m29386K(new Function0() { // from class: com.kubi.home.main.o0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeVM$getFreeStyleConfig$1.m29391f(homeVM, freeStyleEntity);
                    }
                });
            }
        } else {
            freeStyleEntity = null;
        }
        objM103844constructorimpl = Result.m103844constructorimpl(freeStyleEntity);
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (i11 != 0 && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("->【");
                sb2.append(str);
                sb2.append(" 发生错误:needCatch->");
                if (i11 == 0) {
                    z11 = false;
                }
                sb2.append(z11);
                sb2.append((char) 12305);
                C44128b.m97262f(str2, sb2.toString(), thM103847exceptionOrNullimpl);
            } else {
                throw thM103847exceptionOrNullimpl;
            }
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new HomeException(thM103847exceptionOrNullimpl2, "HomeVM", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
