package com.kubi.search.utils;

import android.text.TextUtils;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.router.model.IRedirect;
import com.kubi.search.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SearchFavHelper.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.utils.SearchFavHelper$changeChainFavor$1", m90122f = "SearchFavHelper.kt", m90123i = {0}, m90124l = {143}, m90125m = "invokeSuspend", m90126n = {"isFavor"}, m90127s = {"Z$0"})
public final class SearchFavHelper$changeChainFavor$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentToken;
    final /* synthetic */ Function0<Unit> $success;
    boolean Z$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.search.utils.SearchFavHelper$changeChainFavor$1$2 */
    /* JADX INFO: compiled from: SearchFavHelper.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.search.utils.SearchFavHelper$changeChainFavor$1$2", m90122f = "SearchFavHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C245032 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $success;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C245032(Function0<Unit> function0, Continuation<? super C245032> continuation) {
            super(2, continuation);
            this.$success = function0;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C245032(this.$success, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C245032) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public SearchFavHelper$changeChainFavor$1(String str, Function0<Unit> function0, Continuation<? super SearchFavHelper$changeChainFavor$1> continuation) {
        super(1, continuation);
        this.$currentToken = str;
        this.$success = function0;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m59579g() {
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SearchFavHelper$changeChainFavor$1(this.$currentToken, this.$success, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SearchFavHelper$changeChainFavor$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (!TextUtils.isEmpty(UserInfo.c().id) && com.kubi.user.config.a.b()) {
                IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.search.utils.x
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchFavHelper$changeChainFavor$1.m59579g();
                    }
                }), 1, (Object) null);
            } else {
                IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
                boolean zMo50682G = companion.get().mo50682G(this.$currentToken);
                SearchFavHelper searchFavHelper = SearchFavHelper.f49141a;
                if (zMo50682G) {
                    i11 = R$string.cancel_favor_ok;
                } else {
                    i11 = R$string.add_favorites_ok;
                }
                searchFavHelper.m59569F(i11);
                IQuoteFacadeService.m50674r(companion.get(), this.$currentToken, null, 2, null);
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                C245032 c245032 = new C245032(this.$success, null);
                this.Z$0 = zMo50682G;
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, c245032, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
