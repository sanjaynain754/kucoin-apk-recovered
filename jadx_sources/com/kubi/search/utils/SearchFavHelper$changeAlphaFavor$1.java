package com.kubi.search.utils;

import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.user.config.UserInfo;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SearchFavHelper.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.utils.SearchFavHelper$changeAlphaFavor$1", m90122f = "SearchFavHelper.kt", m90123i = {0, 0, 1, 1, 2}, m90124l = {77, 82, 85}, m90125m = "invokeSuspend", m90126n = {"currentToken", "isFavor", "currentToken", "isFavor", "currentToken"}, m90127s = {"L$0", "Z$0", "L$0", "Z$0", "L$0"})
public final class SearchFavHelper$changeAlphaFavor$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ SearchItemData $item;
    final /* synthetic */ Function0<Unit> $success;
    Object L$0;
    boolean Z$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.search.utils.SearchFavHelper$changeAlphaFavor$1$1 */
    /* JADX INFO: compiled from: SearchFavHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.utils.SearchFavHelper$changeAlphaFavor$1$1", m90122f = "SearchFavHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C245011(Function0<Unit> function0, Continuation<? super C245011> continuation) {
            super(2, continuation);
            this.$success = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245011(this.$success, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$success.invoke();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.search.utils.SearchFavHelper$changeAlphaFavor$1$2 */
    /* JADX INFO: compiled from: SearchFavHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.utils.SearchFavHelper$changeAlphaFavor$1$2", m90122f = "SearchFavHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245022 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C245022(Function0<Unit> function0, Continuation<? super C245022> continuation) {
            super(2, continuation);
            this.$success = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245022(this.$success, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245022) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.$success.invoke();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFavHelper$changeAlphaFavor$1(SearchItemData searchItemData, Function0<Unit> function0, Continuation<? super SearchFavHelper$changeAlphaFavor$1> continuation) {
        super(1, continuation);
        this.$item = searchItemData;
        this.$success = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SearchFavHelper$changeAlphaFavor$1(this.$item, this.$success, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SearchFavHelper$changeAlphaFavor$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r15, r3, r14) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r15, r1, r14) == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String token;
        String aveChainName;
        SearchFavHelper$changeAlphaFavor$1 searchFavHelper$changeAlphaFavor$1;
        String str;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                z11 = this.Z$0;
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                searchFavHelper$changeAlphaFavor$1 = this;
                SearchFavHelper.f49141a.m59566C(str, z11);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                C245011 c245011 = new C245011(searchFavHelper$changeAlphaFavor$1.$success, null);
                searchFavHelper$changeAlphaFavor$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                searchFavHelper$changeAlphaFavor$1.Z$0 = z11;
                searchFavHelper$changeAlphaFavor$1.label = 2;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        StringBuilder sb2 = new StringBuilder();
        ExtendEntity beanWeb3 = this.$item.getBeanWeb3();
        if (beanWeb3 != null) {
            token = beanWeb3.getToken();
        } else {
            token = null;
        }
        sb2.append(token);
        sb2.append('-');
        ExtendEntity beanWeb4 = this.$item.getBeanWeb3();
        if (beanWeb4 != null) {
            aveChainName = beanWeb4.getAveChainName();
        } else {
            aveChainName = null;
        }
        sb2.append(aveChainName);
        String string = sb2.toString();
        if (UserInfo.a.n()) {
            boolean zContains = SearchFavHelper.f49142b.contains(string);
            IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
            this.L$0 = string;
            this.Z$0 = zContains;
            this.label = 1;
            searchFavHelper$changeAlphaFavor$1 = this;
            if (IQuoteFacadeService.m50673V(iQuoteFacadeService, string, zContains, true, null, searchFavHelper$changeAlphaFavor$1, 8, null) != coroutine_suspended) {
                str = string;
                z11 = zContains;
                SearchFavHelper.f49141a.m59566C(str, z11);
                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                C245011 c245012 = new C245011(searchFavHelper$changeAlphaFavor$1.$success, null);
                searchFavHelper$changeAlphaFavor$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                searchFavHelper$changeAlphaFavor$1.Z$0 = z11;
                searchFavHelper$changeAlphaFavor$1.label = 2;
            }
        } else {
            IQuoteFacadeService.m50671I(IQuoteFacadeService.f41383a.get(), string, null, 2, null);
            AbstractC41697j0 abstractC41697j0M94121c3 = C42911a.m94121c();
            C245022 c245022 = new C245022(this.$success, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(string);
            this.label = 3;
        }
        return coroutine_suspended;
    }
}
