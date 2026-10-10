package com.kubi.home.mood;

import com.kubi.mvi.common.MviExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MoodCardVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.mood.MoodCardVM$startLoadData$1$1", m90122f = "MoodCardVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MoodCardVM$startLoadData$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MoodCardVM this$0;

    /* JADX INFO: renamed from: com.kubi.home.mood.MoodCardVM$startLoadData$1$1$1 */
    /* JADX INFO: compiled from: MoodCardVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.mood.MoodCardVM$startLoadData$1$1$1", m90122f = "MoodCardVM.kt", m90123i = {}, m90124l = {47}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146771 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MoodCardVM this$0;

        public final Object invoke(int i11, Continuation<? super Unit> continuation) {
            return ((C146771) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146771(MoodCardVM moodCardVM, Continuation<? super C146771> continuation) {
            super(2, continuation);
            this.this$0 = moodCardVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146771(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
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
                MoodCardVM moodCardVM = this.this$0;
                this.label = 1;
                if (moodCardVM.m29604o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoodCardVM$startLoadData$1$1(MoodCardVM moodCardVM, Continuation<? super MoodCardVM$startLoadData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = moodCardVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MoodCardVM$startLoadData$1$1 moodCardVM$startLoadData$1$1 = new MoodCardVM$startLoadData$1$1(this.this$0, continuation);
        moodCardVM$startLoadData$1$1.L$0 = obj;
        return moodCardVM$startLoadData$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MoodCardVM$startLoadData$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MoodCardVM moodCardVM = this.this$0;
        moodCardVM.f25854Y = MviExKt.m42522r(interfaceC41709m0, Integer.MAX_VALUE, 5000L, null, null, null, new C146771(moodCardVM, null), 28, null);
        return Unit.INSTANCE;
    }
}
