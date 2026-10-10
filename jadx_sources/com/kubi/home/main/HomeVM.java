package com.kubi.home.main;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.home.entity.CmsAdEntity;
import com.kubi.home.entity.HomeAppGuideEntity;
import com.kubi.home.entity.NewcomerConfigEntity;
import com.kubi.home.exception.HomeException;
import com.kubi.kucoin.api.IMainActivity;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.GlobalDialogManager;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.router.core.Router;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import dj.C36716a;
import dj.C36718c;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import o00.C42918h;
import org.jetbrains.annotations.NotNull;
import p058cj.C4988a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u001a\u0010\f\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0018\u0010\u0015\u001a\u00020\t*\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0016\u0010\u0019\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/home/main/HomeVM;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "api", "Lcom/kubi/home/main/FreeStyleApi;", "destroyCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "subscribeLoginState", "", "getExtraConfig", "checkOnceAlertAndConfigDialog", "checkOnceAlert", "queryFreeDialog", "Lkotlin/Function0;", "getFreeStyleConfig", "checkWelfareAlert", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkChopAlert", "isAtMainPage", "popInner", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "tag", "", "runInMainUI", "block", "onCleared", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,292:1\n47#2,4:293\n47#2,4:299\n47#3,2:297\n*S KotlinDebug\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM\n*L\n88#1:293,4\n275#1:299,4\n219#1:297,2\n*E\n"})
public final class HomeVM extends BaseVM {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f25744X = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final FreeStyleApi f25745V = (FreeStyleApi) RetrofitFlowExKt.m42820a(FreeStyleApi.class);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final CompositeDisposable f25746W = new CompositeDisposable();

    /* JADX INFO: compiled from: HomeVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/main/HomeVM$Companion;", "", "<init>", "()V", "TAG", "", "TYPE_WELFARE", "TYPE_CHOP", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeVM$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 HomeVM.kt\ncom/kubi/home/main/HomeVM\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,49:1\n89#2:50\n90#2:53\n47#3,2:51\n*S KotlinDebug\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM\n*L\n89#1:51,2\n*E\n"})
    public static final class C14599a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new HomeException(exception, "HomeVM", false, null, 8, null), null, 2, null);
        }

        public C14599a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeVM$b */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 HomeVM.kt\ncom/kubi/home/main/HomeVM\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,49:1\n276#2:50\n277#2:53\n47#3,2:51\n*S KotlinDebug\n*F\n+ 1 HomeVM.kt\ncom/kubi/home/main/HomeVM\n*L\n276#1:51,2\n*E\n"})
    public static final class C14600b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new HomeException(exception, "HomeVM", false, null, 8, null), null, 2, null);
        }

        public C14600b(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m29360F() {
        C36718c.m82255f("WelfareAlert", false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final void m29363O(HomeVM homeVM) {
        m29357A(homeVM, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m29357A(HomeVM homeVM, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        homeVM.m29389z(function0);
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m29359E(HomeVM homeVM, CmsAdEntity cmsAdEntity) {
        if (!GlobalDialogManager.f43651a.m54344i() && homeVM.m29384I()) {
            homeVM.m29385J(HomeImageAlertDialog.f25828a.m29502f(cmsAdEntity.iconUrl(), C27041f.m66668h(cmsAdEntity.getUrl()), new Function0() { // from class: com.kubi.home.main.n0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeVM.m29360F();
                }
            }), "home_image_alert_dialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m29379y(HomeVM homeVM, HomeAppGuideEntity homeAppGuideEntity) {
        homeVM.m29385J(HomeGuideDialog.f25729r0.instance(homeAppGuideEntity), "HomeGuideDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m29380B() {
        C4988a.m5286a("checkOnceAlertAndConfigDialog start", "HomeVM");
        m29389z(new Function0() { // from class: com.kubi.home.main.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeVM.m29358C(this.f25771b);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: D */
    public final Object m29381D(Continuation<? super Boolean> continuation) {
        HomeVM$checkWelfareAlert$1 homeVM$checkWelfareAlert$1;
        List list;
        final CmsAdEntity cmsAdEntity;
        if (continuation instanceof HomeVM$checkWelfareAlert$1) {
            homeVM$checkWelfareAlert$1 = (HomeVM$checkWelfareAlert$1) continuation;
            int i11 = homeVM$checkWelfareAlert$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeVM$checkWelfareAlert$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeVM$checkWelfareAlert$1 = new HomeVM$checkWelfareAlert$1(this, continuation);
            }
        } else {
            homeVM$checkWelfareAlert$1 = new HomeVM$checkWelfareAlert$1(this, continuation);
        }
        Object objM91049g = homeVM$checkWelfareAlert$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeVM$checkWelfareAlert$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM91049g);
                C4988a.m5286a("checkWelfareAlert-start", "HomeVM");
                if (!UserInfo.a.n()) {
                    C4988a.m5286a("checkWelfareAlert-not login,end", "HomeVM");
                    return Boxing.boxBoolean(false);
                }
                if (GlobalDialogManager.f43651a.m54344i() || !m29384I()) {
                    C4988a.m5286a("checkWelfareAlert-hasDialog,end", "HomeVM");
                    return Boxing.boxBoolean(false);
                }
                if (C36718c.m82253d("WelfareAlert", false, 2, null)) {
                    C4988a.m5286a("checkWelfareAlert-isAppGuideAlertDone,end", "HomeVM");
                    return Boxing.boxBoolean(false);
                }
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                HomeVM$checkWelfareAlert$list$1 homeVM$checkWelfareAlert$list$1 = new HomeVM$checkWelfareAlert$list$1(this, null);
                homeVM$checkWelfareAlert$1.label = 1;
                objM91049g = C41686h.m91049g(abstractC41697j0M94120b, homeVM$checkWelfareAlert$list$1, homeVM$checkWelfareAlert$1);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM91049g);
            }
            List list2 = (List) objM91049g;
            Object orNull = CollectionsKt.getOrNull(list2, 0);
            NewcomerConfigEntity newcomerConfigEntity = orNull instanceof NewcomerConfigEntity ? (NewcomerConfigEntity) orNull : null;
            Object orNull2 = CollectionsKt.getOrNull(list2, 1);
            HashMap map = orNull2 instanceof HashMap ? (HashMap) orNull2 : null;
            String rewardCenterUri = newcomerConfigEntity != null ? newcomerConfigEntity.getRewardCenterUri() : null;
            if (rewardCenterUri == null) {
                rewardCenterUri = "";
            }
            boolean z11 = rewardCenterUri.length() > 0;
            if (newcomerConfigEntity != null && !z11) {
                C4988a.m5286a("checkWelfareAlert-newComerEntity.rewardCenterUri.isNullOrEmpty(),end", "HomeVM");
                C36718c.m82255f("WelfareAlert", false, 2, null);
            }
            if (map != null && (list = (List) map.get("app-homepage-welfare-popup")) != null && (cmsAdEntity = (CmsAdEntity) CollectionsKt.firstOrNull(list)) != null) {
                if (!z11 || cmsAdEntity.iconUrl().length() <= 0 || GlobalDialogManager.f43651a.m54344i()) {
                    return Boxing.boxBoolean(false);
                }
                C4988a.m5286a("checkWelfareAlert-alertWelfare", "HomeVM");
                C36716a.m82239b(cmsAdEntity.iconUrl());
                m29386K(new Function0() { // from class: com.kubi.home.main.m0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeVM.m29359E(this.f25780b, cmsAdEntity);
                    }
                });
                return Boxing.boxBoolean(true);
            }
            return Boxing.boxBoolean(false);
        } catch (Throwable th2) {
            C43846g.m96568c(new HomeException(th2, "HomeVM", false, null, 8, null), null, 2, null);
            return Boxing.boxBoolean(false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m29382G() {
        ExtensionKt.m32184j(this, new HomeVM$getExtraConfig$1(null));
    }

    /* JADX INFO: renamed from: H */
    public final void m29383H() {
        C4988a.m5286a("getFreeStyleConfig-start", "HomeVM");
        if (GlobalDialogManager.f43651a.m54344i() || !m29384I()) {
            return;
        }
        ExtensionKt.m32184j(this, new HomeVM$getFreeStyleConfig$1(this, null));
    }

    /* JADX INFO: renamed from: K */
    public final void m29386K(final Function0<Unit> function0) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeVM.m29361L(function0);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final void m29387M() {
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.home.main.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeVM.m29362N(this.f25767b, (AccountEventState) obj);
            }
        };
        Disposable disposableSubscribe = observableA.subscribe(new Consumer() { // from class: com.kubi.home.main.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HomeVM.m29364P(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f25746W);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: x */
    public final Object m29388x(Continuation<? super Boolean> continuation) {
        HomeVM$checkChopAlert$1 homeVM$checkChopAlert$1;
        Integer action;
        Integer action2;
        String jumpUrl;
        if (continuation instanceof HomeVM$checkChopAlert$1) {
            homeVM$checkChopAlert$1 = (HomeVM$checkChopAlert$1) continuation;
            int i11 = homeVM$checkChopAlert$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeVM$checkChopAlert$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeVM$checkChopAlert$1 = new HomeVM$checkChopAlert$1(this, continuation);
            }
        } else {
            homeVM$checkChopAlert$1 = new HomeVM$checkChopAlert$1(this, continuation);
        }
        HomeVM$checkChopAlert$1 homeVM$checkChopAlert$2 = homeVM$checkChopAlert$1;
        Object objM42826g = homeVM$checkChopAlert$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeVM$checkChopAlert$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            C4988a.m5286a("checkChopAlert-start", "HomeVM");
            if (!UserInfo.a.n()) {
                C4988a.m5286a("checkChopAlert-not login,end", "HomeVM");
                return Boxing.boxBoolean(false);
            }
            if (GlobalDialogManager.f43651a.m54344i() || !m29384I()) {
                C4988a.m5286a("checkChopAlert-hasDialog,end", "HomeVM");
                return Boxing.boxBoolean(false);
            }
            if (C36718c.m82253d("ChopAlert", false, 2, null)) {
                C4988a.m5286a("checkChopAlert-isAppGuideAlertDone,end", "HomeVM");
                return Boxing.boxBoolean(false);
            }
            InterfaceC41634e<HomeAppGuideEntity> interfaceC41634eM29396e = this.f25745V.m29396e();
            homeVM$checkChopAlert$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM29396e, false, null, homeVM$checkChopAlert$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        final HomeAppGuideEntity homeAppGuideEntity = (HomeAppGuideEntity) ((C19334f) objM42826g).m42846a();
        if (homeAppGuideEntity != null) {
            C4988a.m5286a("checkChopAlert-hasData,setAppGuideAlertDone,end", "HomeVM");
            C36718c.m82255f("ChopAlert", false, 2, null);
        }
        if (homeAppGuideEntity != null && (action2 = homeAppGuideEntity.getAction()) != null && action2.intValue() == 1 && (jumpUrl = homeAppGuideEntity.getJumpUrl()) != null && jumpUrl.length() != 0) {
            C4988a.m5286a("checkChopAlert-go url->" + homeAppGuideEntity.getJumpUrl(), "HomeVM");
            Router.f46192a.m56184f(homeAppGuideEntity.getJumpUrl()).m4048k();
            return Boxing.boxBoolean(true);
        }
        if (homeAppGuideEntity == null || (action = homeAppGuideEntity.getAction()) == null || action.intValue() != 2 || homeAppGuideEntity.getPopUp() == null || GlobalDialogManager.f43651a.m54344i()) {
            return Boxing.boxBoolean(false);
        }
        C4988a.m5286a("checkChopAlert-alertChop->" + homeAppGuideEntity.getJumpUrl(), "HomeVM");
        m29386K(new Function0() { // from class: com.kubi.home.main.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeVM.m29379y(this.f25777b, homeAppGuideEntity);
            }
        });
        return Boxing.boxBoolean(true);
    }

    public HomeVM() {
        m29387M();
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m29358C(HomeVM homeVM) {
        homeVM.m29383H();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m29361L(Function0 function0) {
        C41696j.m91104d(C41713n0.m91125a(C42911a.m94121c().plus(new C14600b(CoroutineExceptionHandler.INSTANCE))), null, null, new HomeVM$runInMainUI$1$2(function0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m29362N(final HomeVM homeVM, AccountEventState accountEventState) {
        if (accountEventState.isLoginAccountEvent()) {
            C4988a.m5286a("subscribeLoginState-checkOnceAlert", "HomeVM");
            C42918h.m94141a(1000L, new Runnable() { // from class: com.kubi.home.main.j0
                @Override // java.lang.Runnable
                public final void run() {
                    HomeVM.m29363O(this.f25773b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final void m29364P(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m29384I() {
        return C5258a.m6125h() instanceof IMainActivity;
    }

    /* JADX INFO: renamed from: J */
    public final void m29385J(BaseDialogFragment baseDialogFragment, String str) {
        Activity activityM6125h = C5258a.m6125h();
        if ((activityM6125h instanceof FragmentActivity) && (activityM6125h instanceof IMainActivity)) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activityM6125h).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            baseDialogFragment.show(supportFragmentManager, C27041f.m66668h(str));
        }
    }

    @Override // com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f25746W.dispose();
    }

    /* JADX INFO: renamed from: z */
    public final void m29389z(Function0<Unit> function0) {
        C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b().plus(new C14599a(CoroutineExceptionHandler.INSTANCE))), null, null, new HomeVM$checkOnceAlert$2(this, function0, null), 3, null);
    }
}
