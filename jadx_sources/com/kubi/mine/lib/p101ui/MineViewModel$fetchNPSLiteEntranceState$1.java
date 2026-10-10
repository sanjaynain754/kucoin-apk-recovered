package com.kubi.mine.lib.p101ui;

import com.kubi.mine.lib.entity.NPSQuestionEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.user.config.UserInfo;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p319hq.InterfaceC38286c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchNPSLiteEntranceState$1", m90122f = "MineViewModel.kt", m90123i = {}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineViewModel.kt\ncom/kubi/mine/lib/ui/MineViewModel$fetchNPSLiteEntranceState$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n25#2:206\n26#2:208\n1#3:207\n*S KotlinDebug\n*F\n+ 1 MineViewModel.kt\ncom/kubi/mine/lib/ui/MineViewModel$fetchNPSLiteEntranceState$1\n*L\n196#1:206\n196#1:208\n196#1:207\n*E\n"})
public final class MineViewModel$fetchNPSLiteEntranceState$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MineViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.MineViewModel$fetchNPSLiteEntranceState$1$1 */
    /* JADX INFO: compiled from: MineViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/mine/lib/entity/NPSQuestionEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchNPSLiteEntranceState$1$1", m90122f = "MineViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C190241 extends SuspendLambda implements Function2<NPSQuestionEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MineViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(NPSQuestionEntity nPSQuestionEntity, Continuation<? super Unit> continuation) {
            return ((C190241) create(nPSQuestionEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190241(MineViewModel mineViewModel, Continuation<? super C190241> continuation) {
            super(2, continuation);
            this.this$0 = mineViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190241 c190241 = new C190241(this.this$0, continuation);
            c190241.L$0 = obj;
            return c190241;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NPSQuestionEntity nPSQuestionEntity = (NPSQuestionEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m42147D().postValue(nPSQuestionEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineViewModel$fetchNPSLiteEntranceState$1(MineViewModel mineViewModel, Continuation<? super MineViewModel$fetchNPSLiteEntranceState$1> continuation) {
        super(2, continuation);
        this.this$0 = mineViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MineViewModel$fetchNPSLiteEntranceState$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MineViewModel$fetchNPSLiteEntranceState$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (!UserInfo.a.n()) {
                this.this$0.m42147D().postValue(null);
                return Unit.INSTANCE;
            }
            InterfaceC41634e<NPSQuestionEntity> interfaceC41634eM86417b = ((InterfaceC38286c) RetrofitFlowExKt.m42820a(InterfaceC38286c.class)).m86417b();
            C190241 c190241 = new C190241(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM86417b, false, c190241, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MineViewModel mineViewModel = this.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            mineViewModel.m42147D().postValue(null);
        }
        return Unit.INSTANCE;
    }
}
