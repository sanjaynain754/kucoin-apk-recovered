package com.kubi.home.main;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HomeVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$getExtraConfig$1", m90122f = "HomeVM.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class HomeVM$getExtraConfig$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.kubi.home.main.HomeVM$getExtraConfig$1$1 */
    /* JADX INFO: compiled from: HomeVM.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/home/main/HomeConfigEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$getExtraConfig$1$1", m90122f = "HomeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nHomeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM$getExtraConfig$1$1\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,292:1\n35#2,3:293\n23#3,2:296\n*S KotlinDebug\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM$getExtraConfig$1$1\n*L\n72#1:293,3\n72#1:296,2\n*E\n"})
    public static final class C146031 extends SuspendLambda implements Function2<HomeConfigEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C146031(Continuation<? super C146031> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(HomeConfigEntity homeConfigEntity, Continuation<? super Unit> continuation) {
            return ((C146031) create(homeConfigEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C146031 c146031 = new C146031(continuation);
            c146031.L$0 = obj;
            return c146031;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM66919i;
            HomeConfigEntity homeConfigEntity = (HomeConfigEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StorageId<String> storageIdM29398a = C14614f.m29398a();
            if (homeConfigEntity == null || (strM66919i = C27099x.m66919i(homeConfigEntity, false, 2, null)) == null) {
                strM66919i = "";
            }
            C46392a.m102333p(storageIdM29398a, strM66919i);
            return Unit.INSTANCE;
        }
    }

    public HomeVM$getExtraConfig$1(Continuation<? super HomeVM$getExtraConfig$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeVM$getExtraConfig$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HomeVM$getExtraConfig$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<HomeConfigEntity> interfaceC41634eM29397a = ((HomeConfigApi) RetrofitFlowExKt.m42820a(HomeConfigApi.class)).m29397a();
            C146031 c146031 = new C146031(null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM29397a, false, c146031, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
