package com.kubi.assets.holdearn;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.event.api.C12572a;
import com.kubi.utils.ToastCompat;
import com.tencent.bugly.proguard.C33864ph;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: HoldEarnOpenDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.holdearn.HoldEarnOpenDialog$initViewModel$1", m90122f = "HoldEarnOpenDialog.kt", m90123i = {}, m90124l = {165}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HoldEarnOpenDialog$initViewModel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HoldEarnOpenDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.holdearn.HoldEarnOpenDialog$initViewModel$1$1 */
    /* JADX INFO: compiled from: HoldEarnOpenDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.holdearn.HoldEarnOpenDialog$initViewModel$1$1", m90122f = "HoldEarnOpenDialog.kt", m90123i = {}, m90124l = {166}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C101941 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ HoldEarnOpenDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.holdearn.HoldEarnOpenDialog$initViewModel$1$1$a */
        /* JADX INFO: compiled from: HoldEarnOpenDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HoldEarnOpenDialog f17734b;

            public a(HoldEarnOpenDialog holdEarnOpenDialog) {
                this.f17734b = holdEarnOpenDialog;
            }

            /* JADX INFO: renamed from: g */
            public static final Unit m17370g(Ref.BooleanRef booleanRef, final HoldEarnOpenDialog holdEarnOpenDialog, FragmentActivity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                booleanRef.element = true;
                HoldEarnOpenSuccDialog holdEarnOpenSuccDialogM17379p4 = HoldEarnOpenSuccDialog.f17735w0.create().m17379p4(new Function0() { // from class: com.kubi.assets.holdearn.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HoldEarnOpenDialog$initViewModel$1.C101941.a.m17371h(holdEarnOpenDialog);
                    }
                });
                FragmentManager supportFragmentManager = it.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                holdEarnOpenSuccDialogM17379p4.show(supportFragmentManager, "");
                C43852m.m96594f("B9HoldToEarnTurnOnNowPopup", "enableEarnResultPopup", "1", TuplesKt.m90091to("status", "success"), TuplesKt.m90091to("app_mode", AssetExKt.m15129q() ? "lite" : ""));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object emit(HoldEarnEffect holdEarnEffect, Continuation<? super Unit> continuation) {
                if (holdEarnEffect instanceof HoldEarnEffect.b) {
                    C12572a.m23695d(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, holdEarnEffect, 0L, 4, null);
                    this.f17734b.f17733x0 = true;
                    this.f17734b.dismiss();
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    final HoldEarnOpenDialog holdEarnOpenDialog = this.f17734b;
                    C42899b.m94073c(new Function1() { // from class: com.kubi.assets.holdearn.n
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HoldEarnOpenDialog$initViewModel$1.C101941.a.m17370g(booleanRef, holdEarnOpenDialog, (FragmentActivity) obj);
                        }
                    });
                    if (!booleanRef.element) {
                        this.f17734b.f17733x0 = false;
                        Function1 function1 = this.f17734b.f17732w0;
                        if (function1 != null) {
                            function1.invoke(Boxing.boxBoolean(false));
                        }
                    }
                } else {
                    if (!(holdEarnEffect instanceof HoldEarnEffect.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ToastCompat.m66441G(((HoldEarnEffect.a) holdEarnEffect).getF17749a(), new Object[0]);
                    C43852m.m96594f("B9HoldToEarnTurnOnNowPopup", "enableEarnResultPopup", "1", TuplesKt.m90091to("status", C33864ph.f71456b), TuplesKt.m90091to("app_mode", AssetExKt.m15129q() ? "lite" : ""));
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: h */
            public static final Unit m17371h(HoldEarnOpenDialog holdEarnOpenDialog) {
                Function1 function1 = holdEarnOpenDialog.f17732w0;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C101941(HoldEarnOpenDialog holdEarnOpenDialog, Continuation<? super C101941> continuation) {
            super(2, continuation);
            this.this$0 = holdEarnOpenDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C101941(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C101941) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41673r<HoldEarnEffect> interfaceC41673rM17386n = this.this$0.m17365A4().m17386n();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41673rM17386n.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldEarnOpenDialog$initViewModel$1(HoldEarnOpenDialog holdEarnOpenDialog, Continuation<? super HoldEarnOpenDialog$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = holdEarnOpenDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HoldEarnOpenDialog$initViewModel$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HoldEarnOpenDialog$initViewModel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            HoldEarnOpenDialog holdEarnOpenDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C101941 c101941 = new C101941(holdEarnOpenDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(holdEarnOpenDialog, state, c101941, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
