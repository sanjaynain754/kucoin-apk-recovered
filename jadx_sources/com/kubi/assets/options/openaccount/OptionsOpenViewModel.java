package com.kubi.assets.options.openaccount;

import com.kubi.mvi.state.BaseStateVM;
import com.kubi.router.core.Router;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OptionsOpenViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/options/openaccount/OptionsOpenViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent;", "Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiState;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/assets/options/openaccount/OptionsOpenContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OptionsOpenViewModel extends BaseStateVM<OptionsOpenContract$UiIntent, UiState> {

    /* JADX INFO: renamed from: com.kubi.assets.options.openaccount.OptionsOpenViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: OptionsOpenViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.openaccount.OptionsOpenViewModel", m90122f = "OptionsOpenViewModel.kt", m90123i = {0}, m90124l = {19}, m90125m = "dispatchIntentOnIO", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C105521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C105521(Continuation<? super C105521> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OptionsOpenViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.options.openaccount.OptionsOpenViewModel$dispatchIntentOnIO$2 */
    /* JADX INFO: compiled from: OptionsOpenViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.openaccount.OptionsOpenViewModel$dispatchIntentOnIO$2", m90122f = "OptionsOpenViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nOptionsOpenViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OptionsOpenViewModel.kt\ncom/kubi/assets/options/openaccount/OptionsOpenViewModel$dispatchIntentOnIO$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
    public static final class C105532 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionsOpenContract$UiIntent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105532(OptionsOpenContract$UiIntent optionsOpenContract$UiIntent, Continuation<? super C105532> continuation) {
            super(2, continuation);
            this.$intent = optionsOpenContract$UiIntent;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C105532(this.$intent, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C105532) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String path = ((OptionsOpenContract$UiIntent.JumpToOpen) this.$intent).getPath();
                if (path != null) {
                    Router.f46192a.m56184f(path).m4048k();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object dispatchIntentOnIO(@NotNull OptionsOpenContract$UiIntent optionsOpenContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C105521 c105521;
        if (continuation instanceof C105521) {
            c105521 = (C105521) continuation;
            int i11 = c105521.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c105521.label = i11 - Integer.MIN_VALUE;
            } else {
                c105521 = new C105521(continuation);
            }
        } else {
            c105521 = new C105521(continuation);
        }
        Object obj = c105521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c105521.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c105521.L$0 = optionsOpenContract$UiIntent;
            c105521.label = 1;
            if (super.dispatchIntentOnIO(optionsOpenContract$UiIntent, c105521) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            optionsOpenContract$UiIntent = (OptionsOpenContract$UiIntent) c105521.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!(optionsOpenContract$UiIntent instanceof OptionsOpenContract$UiIntent.JumpToOpen)) {
            throw new NoWhenBranchMatchedException();
        }
        launchOnMain(new C105532(optionsOpenContract$UiIntent, null));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UiState getInitState() {
        return new UiState(null, 1, null);
    }
}
