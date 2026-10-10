package com.kubi.assets.autoearn;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.event.api.C12572a;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p481ny.C42899b;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoEarnOpenDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnOpenDialog$initViewModel$1", m90122f = "AutoEarnOpenDialog.kt", m90123i = {}, m90124l = {121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AutoEarnOpenDialog$initViewModel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AutoEarnOpenDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.autoearn.AutoEarnOpenDialog$initViewModel$1$1 */
    /* JADX INFO: compiled from: AutoEarnOpenDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnOpenDialog$initViewModel$1$1", m90122f = "AutoEarnOpenDialog.kt", m90123i = {}, m90124l = {122}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95061 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AutoEarnOpenDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.autoearn.AutoEarnOpenDialog$initViewModel$1$1$a */
        /* JADX INFO: compiled from: AutoEarnOpenDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AutoEarnOpenDialog f16564b;

            public a(AutoEarnOpenDialog autoEarnOpenDialog) {
                this.f16564b = autoEarnOpenDialog;
            }

            /* JADX INFO: renamed from: f */
            public static final Unit m15414f(FragmentActivity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AutoEarnOpenSuccDialog autoEarnOpenSuccDialogCreate = AutoEarnOpenSuccDialog.f16565v0.create();
                FragmentManager supportFragmentManager = it.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                autoEarnOpenSuccDialogCreate.show(supportFragmentManager, "");
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC9516f abstractC9516f, Continuation<? super Unit> continuation) {
                if (abstractC9516f instanceof AbstractC9516f.d) {
                    C12572a.m23695d("AUTO_EARN_STATE_REFRESH", abstractC9516f, 0L, 4, null);
                    this.f16564b.dismiss();
                    C42899b.m94073c(new Function1() { // from class: com.kubi.assets.autoearn.r
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AutoEarnOpenDialog$initViewModel$1.C95061.a.m15414f((FragmentActivity) obj);
                        }
                    });
                } else if (abstractC9516f instanceof AbstractC9516f.c) {
                    ToastCompat.m66441G(((AbstractC9516f.c) abstractC9516f).getF16579a(), new Object[0]);
                } else {
                    this.f16564b.dismiss();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95061(AutoEarnOpenDialog autoEarnOpenDialog, Continuation<? super C95061> continuation) {
            super(2, continuation);
            this.this$0 = autoEarnOpenDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95061(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95061) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41673r<AbstractC9516f> interfaceC41673rM15427n = this.this$0.m15389B4().m15427n();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41673rM15427n.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnOpenDialog$initViewModel$1(AutoEarnOpenDialog autoEarnOpenDialog, Continuation<? super AutoEarnOpenDialog$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = autoEarnOpenDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoEarnOpenDialog$initViewModel$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AutoEarnOpenDialog$initViewModel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AutoEarnOpenDialog autoEarnOpenDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C95061 c95061 = new C95061(autoEarnOpenDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(autoEarnOpenDialog, state, c95061, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
