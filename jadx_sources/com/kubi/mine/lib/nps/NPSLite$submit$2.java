package com.kubi.mine.lib.nps;

import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.mine.lib.entity.NPSCollectParam;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.utils.C27100x0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NPSLite.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.nps.NPSLite$submit$2", m90122f = "NPSLite.kt", m90123i = {}, m90124l = {229}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NPSLite$submit$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ KcPrimaryButton $btn;
    final /* synthetic */ DialogFragmentHelper $dialogFragmentHelper;
    final /* synthetic */ NPSCollectParam $param;
    int label;
    final /* synthetic */ NPSLite this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.nps.NPSLite$submit$2$1 */
    /* JADX INFO: compiled from: NPSLite.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.nps.NPSLite$submit$2$1", m90122f = "NPSLite.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C189901 extends SuspendLambda implements Function2<InterfaceC41635f<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ KcPrimaryButton $btn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189901(KcPrimaryButton kcPrimaryButton, Continuation<? super C189901> continuation) {
            super(2, continuation);
            this.$btn = kcPrimaryButton;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C189901(this.$btn, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41635f<? super Boolean> interfaceC41635f, Continuation<? super Unit> continuation) {
            return ((C189901) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$btn.m55043o();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.nps.NPSLite$submit$2$2 */
    /* JADX INFO: compiled from: NPSLite.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.nps.NPSLite$submit$2$2", m90122f = "NPSLite.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C189912 extends SuspendLambda implements Function3<InterfaceC41635f<? super Boolean>, Throwable, Continuation<? super Unit>, Object> {
        final /* synthetic */ KcPrimaryButton $btn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189912(KcPrimaryButton kcPrimaryButton, Continuation<? super C189912> continuation) {
            super(3, continuation);
            this.$btn = kcPrimaryButton;
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super Boolean> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            return new C189912(this.$btn, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$btn.mo28851l();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.nps.NPSLite$submit$2$3 */
    /* JADX INFO: compiled from: NPSLite.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "success", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.nps.NPSLite$submit$2$3", m90122f = "NPSLite.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nNPSLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NPSLite.kt\ncom/kubi/mine/lib/nps/NPSLite$submit$2$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
    public static final class C189923 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ DialogFragmentHelper $dialogFragmentHelper;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ NPSLite this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189923(NPSLite nPSLite, DialogFragmentHelper dialogFragmentHelper, Continuation<? super C189923> continuation) {
            super(2, continuation);
            this.this$0 = nPSLite;
            this.$dialogFragmentHelper = dialogFragmentHelper;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189923 c189923 = new C189923(this.this$0, this.$dialogFragmentHelper, continuation);
            c189923.Z$0 = ((Boolean) obj).booleanValue();
            return c189923;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C189923) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!z11) {
                return Unit.INSTANCE;
            }
            Function0 function0 = this.this$0.f35133d;
            if (function0 != null) {
                function0.invoke();
            }
            this.this$0.m41803m();
            final NPSLite nPSLite = this.this$0;
            final DialogFragmentHelper dialogFragmentHelper = this.$dialogFragmentHelper;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.nps.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NPSLite$submit$2.C189923.m41815f(nPSLite, dialogFragmentHelper);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m41815f(NPSLite nPSLite, DialogFragmentHelper dialogFragmentHelper) {
            FragmentActivity activity = nPSLite.f35130a.getActivity();
            if (activity != null) {
                KeyboardUtils.m6033e(activity);
            }
            dialogFragmentHelper.dismissAllowingStateLoss();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPSLite$submit$2(NPSLite nPSLite, NPSCollectParam nPSCollectParam, KcPrimaryButton kcPrimaryButton, DialogFragmentHelper dialogFragmentHelper, Continuation<? super NPSLite$submit$2> continuation) {
        super(2, continuation);
        this.this$0 = nPSLite;
        this.$param = nPSCollectParam;
        this.$btn = kcPrimaryButton;
        this.$dialogFragmentHelper = dialogFragmentHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NPSLite$submit$2(this.this$0, this.$param, this.$btn, this.$dialogFragmentHelper, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((NPSLite$submit$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(C41636g.m90897U(this.this$0.f35131b.m86416a(this.$param), new C189901(this.$btn, null)), new C189912(this.$btn, null));
            C189923 c189923 = new C189923(this.this$0, this.$dialogFragmentHelper, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM90895S, false, c189923, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
