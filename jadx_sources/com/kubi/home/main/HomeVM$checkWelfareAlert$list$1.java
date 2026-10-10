package com.kubi.home.main;

import androidx.media3.extractor.p021ts.PsExtractor;
import com.kubi.home.entity.CmsAdEntity;
import com.kubi.home.entity.NewcomerConfigEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: HomeVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$checkWelfareAlert$list$1", m90122f = "HomeVM.kt", m90123i = {0}, m90124l = {191}, m90125m = "invokeSuspend", m90126n = {"$this$withContext"}, m90127s = {"L$0"})
public final class HomeVM$checkWelfareAlert$list$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends Object>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeVM this$0;

    /* JADX INFO: renamed from: com.kubi.home.main.HomeVM$checkWelfareAlert$list$1$1 */
    /* JADX INFO: compiled from: HomeVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/home/entity/NewcomerConfigEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$checkWelfareAlert$list$1$1", m90122f = "HomeVM.kt", m90123i = {}, m90124l = {186}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super NewcomerConfigEntity>, Object> {
        int label;
        final /* synthetic */ HomeVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146011(HomeVM homeVM, Continuation<? super C146011> continuation) {
            super(2, continuation);
            this.this$0 = homeVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146011(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super NewcomerConfigEntity> continuation) {
            return ((C146011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41634e<NewcomerConfigEntity> interfaceC41634eM29395d = this.this$0.f25745V.m29395d();
                this.label = 1;
                obj = RetrofitFlowExKt.m42826g(interfaceC41634eM29395d, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return ((C19334f) obj).m42846a();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeVM$checkWelfareAlert$list$1$2 */
    /* JADX INFO: compiled from: HomeVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a2\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u0001`\u0005*\u00020\u0006H\n"}, m90084d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lcom/kubi/home/entity/CmsAdEntity;", "Lkotlin/collections/HashMap;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.main.HomeVM$checkWelfareAlert$list$1$2", m90122f = "HomeVM.kt", m90123i = {}, m90124l = {PsExtractor.PRIVATE_STREAM_1}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146022 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super HashMap<String, List<? extends CmsAdEntity>>>, Object> {
        int label;
        final /* synthetic */ HomeVM this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super HashMap<String, List<? extends CmsAdEntity>>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super HashMap<String, List<CmsAdEntity>>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146022(HomeVM homeVM, Continuation<? super C146022> continuation) {
            super(2, continuation);
            this.this$0 = homeVM;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146022(this.this$0, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super HashMap<String, List<CmsAdEntity>>> continuation) {
            return ((C146022) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41634e<HashMap<String, List<CmsAdEntity>>> interfaceC41634eM29394c = this.this$0.f25745V.m29394c();
                this.label = 1;
                obj = RetrofitFlowExKt.m42826g(interfaceC41634eM29394c, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return ((C19334f) obj).m42846a();
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new C146011(this.this$0, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C146022(this.this$0, null), 3, null)});
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.label = 1;
        Object objM90345a = AwaitKt.m90345a(listListOf, this);
        return objM90345a == coroutine_suspended ? coroutine_suspended : objM90345a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVM$checkWelfareAlert$list$1(HomeVM homeVM, Continuation<? super HomeVM$checkWelfareAlert$list$1> continuation) {
        super(2, continuation);
        this.this$0 = homeVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeVM$checkWelfareAlert$list$1 homeVM$checkWelfareAlert$list$1 = new HomeVM$checkWelfareAlert$list$1(this.this$0, continuation);
        homeVM$checkWelfareAlert$list$1.L$0 = obj;
        return homeVM$checkWelfareAlert$list$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends Object>> continuation) {
        return ((HomeVM$checkWelfareAlert$list$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
