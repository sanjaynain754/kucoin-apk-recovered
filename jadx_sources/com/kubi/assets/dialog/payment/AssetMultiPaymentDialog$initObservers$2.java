package com.kubi.assets.dialog.payment;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.json.JSONException;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetMultiPaymentDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$initObservers$2", m90122f = "AssetMultiPaymentDialog.kt", m90123i = {}, m90124l = {114}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetMultiPaymentDialog$initObservers$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetMultiPaymentDialog this$0;

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$initObservers$2$1 */
    /* JADX INFO: compiled from: AssetMultiPaymentDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$initObservers$2$1", m90122f = "AssetMultiPaymentDialog.kt", m90123i = {}, m90124l = {116}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C98191 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AssetMultiPaymentDialog this$0;

        /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetMultiPaymentDialog$initObservers$2$1$a */
        /* JADX INFO: compiled from: AssetMultiPaymentDialog.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AssetMultiPaymentDialog f17163b;

            public a(AssetMultiPaymentDialog assetMultiPaymentDialog) {
                this.f17163b = assetMultiPaymentDialog;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AssetPaymentListConfig assetPaymentListConfig, Continuation<? super Unit> continuation) throws JSONException {
                if (assetPaymentListConfig != null) {
                    AssetMultiPaymentDialog assetMultiPaymentDialog = this.f17163b;
                    if (assetMultiPaymentDialog.m16340C4() != null) {
                        assetMultiPaymentDialog.showContentView();
                        assetMultiPaymentDialog.m16345y4(assetPaymentListConfig);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C98191(AssetMultiPaymentDialog assetMultiPaymentDialog, Continuation<? super C98191> continuation) {
            super(2, continuation);
            this.this$0 = assetMultiPaymentDialog;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C98191(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C98191) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41678w<AssetPaymentListConfig> interfaceC41678wM16360v = this.this$0.m16343F4().m16360v();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (interfaceC41678wM16360v.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetMultiPaymentDialog$initObservers$2(AssetMultiPaymentDialog assetMultiPaymentDialog, Continuation<? super AssetMultiPaymentDialog$initObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = assetMultiPaymentDialog;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetMultiPaymentDialog$initObservers$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetMultiPaymentDialog$initObservers$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AssetMultiPaymentDialog assetMultiPaymentDialog = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C98191 c98191 = new C98191(assetMultiPaymentDialog, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(assetMultiPaymentDialog, state, c98191, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
