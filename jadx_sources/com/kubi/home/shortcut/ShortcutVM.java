package com.kubi.home.shortcut;

import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.SyncIntent;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.core.C27029c;
import dj.C36719d;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: ShortcutVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u0016\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u000e\u0010\u001a\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020!H\u0094@¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006'"}, m90084d2 = {"Lcom/kubi/home/shortcut/ShortcutVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/shortcut/ShortCutCardMviContract$UIState;", "<init>", "()V", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "updateMenu", "", "shortcutData", "Lcom/kubi/home/shortcut/ShortcutData;", "shortcutCardApi", "Lcom/kubi/home/shortcut/ShortcutApi;", "listenUserConfig", "", "onCleared", "getMenuList", "handleServerData", "it", "Lcom/kubi/home/shortcut/ShortcutResponse;", "getInitMenuList", "getCacheMenuList", "saveServerHomeMenuList", "functions", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "drawAllEncourage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchSyncIntent", "intent", "Lcom/kubi/mvi/state/SyncIntent;", "(Lcom/kubi/mvi/state/SyncIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchIntent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRemoteData", "initState", "getInitState", "()Lcom/kubi/home/shortcut/ShortCutCardMviContract$UIState;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShortcutVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutVM.kt\ncom/kubi/home/shortcut/ShortcutVM\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,220:1\n23#2,2:221\n473#3,4:223\n*S KotlinDebug\n*F\n+ 1 ShortcutVM.kt\ncom/kubi/home/shortcut/ShortcutVM\n*L\n136#1:221,2\n153#1:223,4\n*E\n"})
public final class ShortcutVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: Y */
    public boolean f26235Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public ShortcutData f26236Z;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final CompositeDisposable f26234X = new CompositeDisposable();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final ShortcutApi f26237a0 = (ShortcutApi) RetrofitFlowExKt.m42820a(ShortcutApi.class);

    /* JADX INFO: renamed from: com.kubi.home.shortcut.ShortcutVM$dispatchSyncIntent$1 */
    /* JADX INFO: compiled from: ShortcutVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.shortcut.ShortcutVM", m90122f = "ShortcutVM.kt", m90123i = {0}, m90124l = {152}, m90125m = "dispatchSyncIntent", m90126n = {"intent"}, m90127s = {"L$0"})
    public static final class C148621 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C148621(Continuation<? super C148621> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShortcutVM.this.dispatchSyncIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final UIState m30289o(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        ShortCutDataParser shortCutDataParser = ShortCutDataParser.f26308a;
        return updateState.copy(shortCutDataParser.m30395c(shortCutDataParser.m30398f()));
    }

    /* JADX INFO: renamed from: s */
    public static final UIState m30290s(ShortcutResponse shortcutResponse, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        ShortCutDataParser shortCutDataParser = ShortCutDataParser.f26308a;
        List<FunctionEntity> navigationList = shortcutResponse.getNavigationList();
        if (navigationList == null) {
            navigationList = CollectionsKt.emptyList();
        }
        return updateState.copy(shortCutDataParser.m30395c(navigationList));
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m30291u(ShortcutVM shortcutVM, Boolean bool) {
        shortcutVM.launchOnIO(new ShortcutVM$listenUserConfig$1$1(shortcutVM, null));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        ShortcutResponse data;
        if (interfaceC19282d instanceof ShortCutCardMviContract$UiIntent.EnCourageIntent) {
            Object objM30293j = m30293j(continuation);
            return objM30293j == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM30293j : Unit.INSTANCE;
        }
        if (interfaceC19282d instanceof ShortCutCardMviContract$UiIntent.GetMenuListIntent) {
            m30297q();
        } else if (interfaceC19282d instanceof ShortCutCardMviContract$UiIntent.SetServerMenuResponseIntent) {
            ShortcutData data2 = ((ShortCutCardMviContract$UiIntent.SetServerMenuResponseIntent) interfaceC19282d).getData();
            this.f26236Z = data2;
            if (data2 != null && (data = data2.getData()) != null) {
                m30298r(data);
            }
        } else {
            if (interfaceC19282d instanceof ShortCutCardMviContract$UiIntent.UpdateServerIntent) {
                Object objM30294k = m30294k(continuation);
                return objM30294k == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM30294k : Unit.INSTANCE;
            }
            if (interfaceC19282d instanceof ShortCutCardMviContract$UiIntent.UpdateMenuIntent) {
                this.f26235Y = ((ShortCutCardMviContract$UiIntent.UpdateMenuIntent) interfaceC19282d).getUpdateMenu();
            } else if ((interfaceC19282d instanceof ShortCutCardMviContract$UiIntent.CheckNeedGetCacheMenuListIntent) && this.f26235Y) {
                logData("刷新八宫格");
                m30295n();
                this.f26235Y = false;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchSyncIntent(@NotNull SyncIntent<UIState> syncIntent, @NotNull Continuation<? super Unit> continuation) {
        C148621 c148621;
        if (continuation instanceof C148621) {
            c148621 = (C148621) continuation;
            int i11 = c148621.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c148621.label = i11 - Integer.MIN_VALUE;
            } else {
                c148621 = new C148621(continuation);
            }
        } else {
            c148621 = new C148621(continuation);
        }
        Object obj = c148621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c148621.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c148621.L$0 = syncIntent;
            c148621.label = 1;
            if (super.dispatchSyncIntent(syncIntent, c148621) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            syncIntent = (SyncIntent) c148621.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (syncIntent.getIntent() instanceof ShortCutCardMviContract$UiIntent.UpdateServerIntent) {
            syncIntent.result(getState());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final Object m30293j(Continuation<? super Unit> continuation) {
        Object objM42824e = RetrofitFlowExKt.m42824e(this.f26237a0.m30402c(), false, new ShortcutVM$drawAllEncourage$2(this, null), continuation, 1, null);
        return objM42824e == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM42824e : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final Object m30294k(Continuation<? super Unit> continuation) {
        ShortcutData shortcutData = this.f26236Z;
        if (shortcutData != null) {
            Object objM42824e = RetrofitFlowExKt.m42824e(HomeCardsRepository.InterfaceC14527a.m29084a((HomeCardsRepository.InterfaceC14527a) C42597a.m93387c().create(HomeCardsRepository.InterfaceC14527a.class), shortcutData.getCode(), null, 2, null), false, new ShortcutVM$fetchRemoteData$2$1(this, null), continuation, 1, null);
            if (objM42824e == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objM42824e;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public final void m30295n() {
        updateState(new Function1() { // from class: com.kubi.home.shortcut.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortcutVM.m30289o((UIState) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m30297q() {
        ShortcutResponse data;
        ShortcutData shortcutData = this.f26236Z;
        if (shortcutData == null || (data = shortcutData.getData()) == null) {
            m30295n();
        } else {
            m30298r(data);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m30299t() {
        Observable observableObserveOn = UserInfo.a.e().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.home.shortcut.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortcutVM.m30291u(this.f26312b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.home.shortcut.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ShortcutVM.m30292v(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f26234X);
    }

    /* JADX INFO: renamed from: w */
    public final void m30300w(List<FunctionEntity> list) {
        StorageId<String> storageIdM82276u = C36719d.f79632a.m82276u();
        String strM66606i = C27029c.m66606i(list);
        Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
        C46392a.m102333p(storageIdM82276u, strM66606i);
    }

    public ShortcutVM() {
        m30299t();
    }

    /* JADX INFO: renamed from: v */
    public static final void m30292v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f26234X.dispose();
    }

    /* JADX INFO: renamed from: r */
    public final void m30298r(final ShortcutResponse shortcutResponse) {
        List<FunctionEntity> navigationList = shortcutResponse.getNavigationList();
        if (navigationList == null) {
            navigationList = CollectionsKt.emptyList();
        }
        m30300w(navigationList);
        ShortCutDataParser.f26308a.m30401i(shortcutResponse.getIconResponse());
        updateState(new Function1() { // from class: com.kubi.home.shortcut.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortcutVM.m30290s(shortcutResponse, (UIState) obj);
            }
        });
    }
}
