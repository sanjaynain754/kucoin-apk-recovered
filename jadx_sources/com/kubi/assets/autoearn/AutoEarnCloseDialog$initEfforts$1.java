package com.kubi.assets.autoearn;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.kubi.assets.exception.AssetsMessage;
import com.kubi.utils.ToastCompat;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41673r;
import p569qq.C43846g;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AutoEarnCloseDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnCloseDialog$initEfforts$1", m90122f = "AutoEarnCloseDialog.kt", m90123i = {}, m90124l = {65}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AutoEarnCloseDialog$initEfforts$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AutoEarnCloseDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.autoearn.AutoEarnCloseDialog$initEfforts$1$1 */
    /* JADX INFO: compiled from: AutoEarnCloseDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnCloseDialog$initEfforts$1$1", m90122f = "AutoEarnCloseDialog.kt", m90123i = {}, m90124l = {66}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C95011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AutoEarnCloseDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.autoearn.AutoEarnCloseDialog$initEfforts$1$1$a */
        /* JADX INFO: compiled from: AutoEarnCloseDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nAutoEarnCloseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnCloseDialog.kt\ncom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$1\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,102:1\n48#2,2:103\n*S KotlinDebug\n*F\n+ 1 AutoEarnCloseDialog.kt\ncom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$1\n*L\n78#1:103,2\n*E\n"})
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AutoEarnCloseDialog f16549b;

            public a(AutoEarnCloseDialog autoEarnCloseDialog) {
                this.f16549b = autoEarnCloseDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC9516f abstractC9516f, Continuation<? super Unit> continuation) {
                if (abstractC9516f instanceof AbstractC9516f.b) {
                    this.f16549b.dismiss();
                } else if (abstractC9516f instanceof AbstractC9516f.a) {
                    ToastCompat.m66441G(((AbstractC9516f.a) abstractC9516f).getF16578a(), new Object[0]);
                    this.f16549b.dismiss();
                } else {
                    C43846g.m96568c(new AssetsMessage("AutoEarnCloseDialog 关闭状态错误", "AutoEarnCloseDialog", false, 4, null), null, 2, null);
                    this.f16549b.dismiss();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95011(AutoEarnCloseDialog autoEarnCloseDialog, Continuation<? super C95011> continuation) {
            super(2, continuation);
            this.this$0 = autoEarnCloseDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C95011(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C95011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41673r<AbstractC9516f> interfaceC41673rM15427n = this.this$0.m15375u4().m15427n();
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
    public AutoEarnCloseDialog$initEfforts$1(AutoEarnCloseDialog autoEarnCloseDialog, Continuation<? super AutoEarnCloseDialog$initEfforts$1> continuation) {
        super(2, continuation);
        this.this$0 = autoEarnCloseDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoEarnCloseDialog$initEfforts$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AutoEarnCloseDialog$initEfforts$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AutoEarnCloseDialog autoEarnCloseDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C95011 c95011 = new C95011(autoEarnCloseDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(autoEarnCloseDialog, state, c95011, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
