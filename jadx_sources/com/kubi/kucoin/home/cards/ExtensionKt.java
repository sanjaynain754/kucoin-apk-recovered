package com.kubi.kucoin.home.cards;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.cardflow.R$id;
import com.kubi.kucoin.home.cards.exception.CardFlowException;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import lb0.InterpolatorC42155b;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: Extension.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022'\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u001a8\u0010\u0012\u001a\u00020\u0001*\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015\u001aA\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00172 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001c\u0018\u00010\u001b¢\u0006\u0002\u0010\u001d\u001a\u0012\u0010\u001e\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017\u001a\n\u0010\u001f\u001a\u00020 *\u00020!\u001a\n\u0010\"\u001a\u00020\u0011*\u00020\u0011¨\u0006#"}, m90084d2 = {"launchIO", "", "Landroidx/lifecycle/ViewModel;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/ViewModel;Lkotlin/jvm/functions/Function2;)V", "checkExposure", "Landroid/view/View;", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/kucoin/home/cards/IExposureCallback;", "ratio", "", "time", "", "expose", "tag", "", "Lkotlin/Function0;", "replaceNow", "Landroidx/fragment/app/Fragment;", "layoutId", "f", "bundle", "", "Lkotlin/Pair;", "(Landroidx/fragment/app/Fragment;ILandroidx/fragment/app/Fragment;[Lkotlin/Pair;)V", "removeNow", "isShow", "", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "validPx", "LCardFlow_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extension.kt\ncom/kubi/kucoin/home/cards/ExtensionKt\n+ 2 CardFlowIssue.kt\ncom/kubi/kucoin/home/cards/exception/CardFlowIssueKt\n*L\n1#1,160:1\n44#2,2:161\n44#2,2:163\n*S KotlinDebug\n*F\n+ 1 Extension.kt\ncom/kubi/kucoin/home/cards/ExtensionKt\n*L\n131#1:161,2\n142#1:163,2\n*E\n"})
public final class ExtensionKt {

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.ExtensionKt$a */
    /* JADX INFO: compiled from: Extension.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/home/cards/ExtensionKt$checkExposure$1$1$2", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15377a implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IExposureCallback f27857a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExposureHandler f27858b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f27859c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ViewOnAttachStateChangeListenerC15378b f27860d;

        public C15377a(IExposureCallback iExposureCallback, ExposureHandler exposureHandler, View view, ViewOnAttachStateChangeListenerC15378b viewOnAttachStateChangeListenerC15378b) {
            this.f27857a = iExposureCallback;
            this.f27858b = exposureHandler;
            this.f27859c = view;
            this.f27860d = viewOnAttachStateChangeListenerC15378b;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() {
            this.f27857a.show();
            this.f27858b.m32224e();
            this.f27859c.removeOnAttachStateChangeListener(this.f27860d);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.ExtensionKt$b */
    /* JADX INFO: compiled from: Extension.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/home/cards/ExtensionKt$checkExposure$1$1$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnAttachStateChangeListenerC15378b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExposureHandler f27861b;

        public ViewOnAttachStateChangeListenerC15378b(ExposureHandler exposureHandler) {
            this.f27861b = exposureHandler;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            this.f27861b.m32222c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            this.f27861b.m32223d();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.ExtensionKt$c */
    /* JADX INFO: compiled from: Extension.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kucoin/home/cards/ExtensionKt$expose$1$1", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15379c implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f27862a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0<Unit> f27863b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ExposureHandler f27864c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f27865d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewOnAttachStateChangeListenerC15380d f27866e;

        public C15379c(String str, Function0<Unit> function0, ExposureHandler exposureHandler, View view, ViewOnAttachStateChangeListenerC15380d viewOnAttachStateChangeListenerC15380d) {
            this.f27862a = str;
            this.f27863b = function0;
            this.f27864c = exposureHandler;
            this.f27865d = view;
            this.f27866e = viewOnAttachStateChangeListenerC15380d;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() {
            C44128b.m97258b(this.f27862a + "->曝光");
            this.f27863b.invoke();
            this.f27864c.m32225f(null);
            this.f27865d.removeOnAttachStateChangeListener(this.f27866e);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.home.cards.ExtensionKt$d */
    /* JADX INFO: compiled from: Extension.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/kucoin/home/cards/ExtensionKt$expose$1$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewOnAttachStateChangeListenerC15380d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExposureHandler f27867b;

        public ViewOnAttachStateChangeListenerC15380d(ExposureHandler exposureHandler) {
            this.f27867b = exposureHandler;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            this.f27867b.m32222c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            this.f27867b.m32223d();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m32177c(@NotNull final View view, @NotNull IExposureCallback callback, float f11, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i12 = R$id.start_exposure_check;
        Object tag = view.getTag(i12);
        if ((tag instanceof ExposureHandler ? (ExposureHandler) tag : null) == null) {
            final ExposureHandler exposureHandler = new ExposureHandler(view);
            view.setTag(i12, exposureHandler);
            exposureHandler.m32226g(f11);
            exposureHandler.m32227h(i11);
            ViewOnAttachStateChangeListenerC15378b viewOnAttachStateChangeListenerC15378b = new ViewOnAttachStateChangeListenerC15378b(exposureHandler);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15378b);
            view.postDelayed(new Runnable() { // from class: com.kubi.kucoin.home.cards.j
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionKt.m32179e(view, exposureHandler);
                }
            }, 1000L);
            exposureHandler.m32225f(new C15377a(callback, exposureHandler, view, viewOnAttachStateChangeListenerC15378b));
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m32178d(View view, IExposureCallback iExposureCallback, float f11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f11 = 0.3f;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        m32177c(view, iExposureCallback, f11, i11);
    }

    /* JADX INFO: renamed from: f */
    public static final void m32180f(@NotNull View view, @Nullable String str, float f11, int i11, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        final ExposureHandler exposureHandler = new ExposureHandler(view);
        exposureHandler.m32226g(f11);
        exposureHandler.m32227h(i11);
        ViewOnAttachStateChangeListenerC15380d viewOnAttachStateChangeListenerC15380d = new ViewOnAttachStateChangeListenerC15380d(exposureHandler);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15380d);
        exposureHandler.m32225f(new C15379c(str, block, exposureHandler, view, viewOnAttachStateChangeListenerC15380d));
        view.postDelayed(new Runnable() { // from class: com.kubi.kucoin.home.cards.k
            @Override // java.lang.Runnable
            public final void run() {
                ExtensionKt.m32182h(exposureHandler);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m32181g(View view, String str, float f11, int i11, Function0 function0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        if ((i12 & 2) != 0) {
            f11 = 0.3f;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        m32180f(view, str, f11, i11, function0);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m32183i(@NotNull CardListRsp.Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        return (card.isFixed() || card.getUserVisible() == 1 || (card.getUserVisible() == -1 && !card.isDefaultHidden())) && card.getCode().length() > 0;
    }

    /* JADX INFO: renamed from: j */
    public static final void m32184j(@NotNull ViewModel viewModel, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        C41696j.m91104d(ViewModelKt.getViewModelScope(viewModel), C42911a.m94120b(), null, new ExtensionKt$launchIO$1(block, null), 2, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m32185k(@NotNull Fragment fragment, @NotNull Fragment f11) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        try {
            Result.Companion companion = Result.INSTANCE;
            fragment.getChildFragmentManager().beginTransaction().remove(f11).commitNowAllowingStateLoss();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g("card_flow", thM103847exceptionOrNullimpl);
            C43846g.m96568c(new CardFlowException(thM103847exceptionOrNullimpl, "card_flow_ex", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m32186l(@NotNull Fragment fragment, int i11, @NotNull Fragment f11, @Nullable Pair<String, ? extends Object>[] pairArr) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(f11, "f");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (pairArr != null) {
                f11.setArguments(C27029c.m66605h(pairArr));
            }
            fragment.getChildFragmentManager().beginTransaction().replace(i11, f11).commitNowAllowingStateLoss();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97263g("card_flow", thM103847exceptionOrNullimpl);
            C43846g.m96568c(new CardFlowException(thM103847exceptionOrNullimpl, "card_flow_ex", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m32187m(Fragment fragment, int i11, Fragment fragment2, Pair[] pairArr, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            pairArr = null;
        }
        m32186l(fragment, i11, fragment2, pairArr);
    }

    /* JADX INFO: renamed from: n */
    public static final int m32188n(int i11) {
        return i11 < 0 ? i11 : InterpolatorC42155b.m92540c(i11);
    }

    /* JADX INFO: renamed from: e */
    public static final void m32179e(View view, ExposureHandler exposureHandler) {
        if (view.isAttachedToWindow()) {
            exposureHandler.m32222c();
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m32182h(ExposureHandler exposureHandler) {
        if (!exposureHandler.getF27897c()) {
            exposureHandler.m32222c();
            exposureHandler.m32220a();
        } else {
            exposureHandler.m32223d();
        }
    }
}
