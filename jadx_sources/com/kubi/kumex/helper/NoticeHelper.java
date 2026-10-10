package com.kubi.kumex.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.PreferencesEntity;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37752d;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import p294gz.C38057a;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kumex.helper.s0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NoticeHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/helper/NoticeHelper;", "", "<init>", "()V", "QUOTES_NOTICE", "", "PRO_GUIDE_NOTICE", "TOP_RIGHT_NOTICE", "hasQuotesNotice", "", "checkQuotesNotice", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "checkNaviNotice", "checkTopRightNotice", "hasSwitchNotice", "inflaterProNoticeGuide", "settings", "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;", "isPro", "submitPreferences", "noticeView", "Landroid/view/View;", "hideProNoticeGuide", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoticeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeHelper.kt\ncom/kubi/kumex/helper/NoticeHelper\n+ 2 NoticeConfig.kt\ncom/kubi/kumex/data/platform/model/NoticeConfig\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,236:1\n29#2:237\n21#2:238\n22#2:241\n23#2:243\n24#2:247\n30#2:250\n774#3:239\n865#3:240\n866#3:242\n1563#3:244\n1634#3,2:245\n1636#3:249\n149#4:248\n84#5:251\n*S KotlinDebug\n*F\n+ 1 NoticeHelper.kt\ncom/kubi/kumex/helper/NoticeHelper\n*L\n131#1:237\n131#1:238\n131#1:241\n131#1:243\n131#1:247\n131#1:250\n131#1:239\n131#1:240\n131#1:242\n131#1:244\n131#1:245,2\n131#1:249\n131#1:248\n137#1:251\n*E\n"})
public final class NoticeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NoticeHelper f29301a = new NoticeHelper();

    /* JADX INFO: renamed from: M */
    public static final void m34015M(BaseFragment baseFragment, PreferencesEntity preferencesEntity, View view, Object obj) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        RepositoryServiceLocator.f19236a.m20290i().mo99986i(preferencesEntity);
        f29301a.m34044G(baseFragment, view);
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m34016N(BaseFragment baseFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m34007A(View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DataMapUtil.f54245a.m66377l("kumex_quotes_notice", true);
        C43852m.m96591c("B6FuturesMarkets", "ContractOpenGuide", "2", null, 8, null);
        Intrinsics.checkNotNull(view);
        C27046k.m66700o(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m34008B(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("B6FuturesMarkets", "ContractOpenGuide", null, null, 12, null);
        InterfaceC37752d.a.m85123b(C37304a.f82764a, "B6FuturesMarkets", Boolean.FALSE, null, null, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m34012I(BaseFragment baseFragment, View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "OpenAllGuide", "2", null, 8, null);
        NoticeHelper noticeHelper = f29301a;
        Intrinsics.checkNotNull(view);
        noticeHelper.m34044G(baseFragment, view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m34013J(BaseFragment baseFragment, View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "OpenAllGuide", null, null, 12, null);
        NoticeHelper noticeHelper = f29301a;
        Intrinsics.checkNotNull(view);
        noticeHelper.m34046K(baseFragment, view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Object m34014L(PreferencesEntity preferencesEntity) {
        Boolean bool = Boolean.TRUE;
        preferencesEntity.setSeniorPosition(bool);
        preferencesEntity.setSeniorOrder(bool);
        preferencesEntity.setConditionalOrder(bool);
        preferencesEntity.setStopProfitAndLoss(bool);
        preferencesEntity.setIndexPrice(bool);
        preferencesEntity.setFundingRate(bool);
        return RepositoryServiceLocator.f19236a.m20290i().mo99992r(preferencesEntity);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m34036t(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !DataMapUtil.m66366b(DataMapUtil.f54245a, "kumex_quotes_notice", false, 2, null);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m34037u(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m34038v(LoginUserEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        return kuMexDepend.m35905g().c() && kuMexDepend.m35906h();
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m34039w(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m34040x(BaseFragment baseFragment, LoginUserEntity loginUserEntity) {
        View viewFindViewById = baseFragment.findViewById(R$id.quotesBubble);
        if (viewFindViewById != null) {
            C27046k.m66700o(viewFindViewById);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m34042z(BaseFragment baseFragment, Boolean bool) {
        AppCompatTextView appCompatTextView;
        final View viewFindViewById = baseFragment.findViewById(R$id.quotesBubble);
        if (viewFindViewById == null && baseFragment.getContext() != null) {
            viewFindViewById = LayoutInflater.from(baseFragment.getContext()).inflate(R$layout.bkumex_include_quotes_notice, (ViewGroup) null);
            View viewFindViewById2 = viewFindViewById.findViewById(R$id.quotesClose);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.helper.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NoticeHelper.m34007A(viewFindViewById, (View) obj);
                }
            });
            View viewFindViewById3 = viewFindViewById.findViewById(R$id.quotesOpen);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ViewExtKt.m66575f(viewFindViewById3, new Function1() { // from class: com.kubi.kumex.helper.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NoticeHelper.m34008B((View) obj);
                }
            });
            View viewFindViewById4 = baseFragment.findViewById(R$id.content);
            LinearLayout linearLayout = viewFindViewById4 instanceof LinearLayout ? (LinearLayout) viewFindViewById4 : null;
            if (linearLayout != null) {
                linearLayout.addView(viewFindViewById, 2, new LinearLayout.LayoutParams(-1, -2));
            }
        } else if (viewFindViewById != null) {
            C27046k.m66685H(viewFindViewById);
        }
        if (viewFindViewById != null && (appCompatTextView = (AppCompatTextView) viewFindViewById.findViewById(R$id.quotesContent)) != null) {
            appCompatTextView.setText((bool.booleanValue() || !C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.maxLeverage", true)) ? baseFragment.getStringRes(R$string.open_contract_get_new_comer_reward, new Object[0]) : baseFragment.getStringRes(R$string.bkumex_open_contract_support_100_times_trade, Integer.valueOf(C46527h0.f104291a.m102675K())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m34043F() {
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        return (!kuMexDepend.m35905g().c() || kuMexDepend.m35906h() || DataMapUtil.m66366b(DataMapUtil.f54245a, "kumex_quotes_notice", false, 2, null)) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public final void m34045H(@NotNull final BaseFragment fragment, @NotNull PreferencesEntity settings, boolean z11) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(settings, "settings");
        boolean z12 = true;
        boolean z13 = !(settings.getSeniorOrder() == null && settings.getSeniorPosition() == null && settings.getConditionalOrder() == null && settings.getStopProfitAndLoss() == null && settings.getIndexPrice() == null) ? C27025c.m66566d(settings.getConditionalOrder()) || C27025c.m66566d(settings.getSeniorOrder()) || C27025c.m66566d(settings.getSeniorPosition()) || C27025c.m66566d(settings.getStopProfitAndLoss()) || C27025c.m66566d(settings.getIndexPrice()) : z11;
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        boolean z14 = dataMapUtil.m66371c("kumex_pro_guide_notice", 0) >= 1;
        if (z13 || z14) {
            z12 = z14;
        } else {
            dataMapUtil.m66378m("kumex_pro_guide_notice", 1);
        }
        if (z12 || !z13) {
            return;
        }
        ViewStub viewStub = (ViewStub) fragment.findViewById(R$id.guideNoticeViewStub);
        try {
            Intrinsics.checkNotNull(viewStub);
            final View viewInflate = viewStub.inflate();
            View viewFindViewById = viewInflate.findViewById(R$id.iv_notice_close);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.helper.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NoticeHelper.m34012I(fragment, viewInflate, (View) obj);
                }
            });
            View viewFindViewById2 = viewInflate.findViewById(R$id.tv_notice_action);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.helper.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NoticeHelper.m34013J(fragment, viewInflate, (View) obj);
                }
            });
        } catch (Throwable th2) {
            C44128b.m97259c("inflaterProNoticeGuide", String.valueOf(th2.getMessage()));
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m34046K(final BaseFragment baseFragment, final View view) {
        final PreferencesEntity preferencesEntityMo99988m = RepositoryServiceLocator.f19236a.m20290i().mo99988m();
        baseFragment.showLoadingDialog();
        Flowable flowableObserveOn = FlowableCompat.f54248a.m66385b(new Function0() { // from class: com.kubi.kumex.helper.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NoticeHelper.m34014L(preferencesEntityMo99988m);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        Consumer consumer = new Consumer() { // from class: com.kubi.kumex.helper.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeHelper.m34015M(baseFragment, preferencesEntityMo99988m, view, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.helper.f0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoticeHelper.m34016N(baseFragment, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.helper.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeHelper.m34017O(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, baseFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: s */
    public final void m34047s(@NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c() && kuMexDepend.m35906h()) {
            View viewFindViewById = fragment.findViewById(R$id.quotesBubble);
            if (viewFindViewById != null) {
                C27046k.m66700o(viewFindViewById);
                return;
            }
            return;
        }
        if (!kuMexDepend.m35905g().c() || kuMexDepend.m35906h() || DataMapUtil.m66366b(DataMapUtil.f54245a, "kumex_quotes_notice", false, 2, null)) {
            View viewFindViewById2 = fragment.findViewById(R$id.quotesBubble);
            if (viewFindViewById2 != null) {
                C27046k.m66700o(viewFindViewById2);
                return;
            }
            return;
        }
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Flowable<Boolean> flowableMo100576y = repositoryServiceLocator.m20292k().mo100576y();
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.helper.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NoticeHelper.m34036t((Boolean) obj));
            }
        };
        Flowable<Boolean> flowableObserveOn = flowableMo100576y.filter(new Predicate() { // from class: com.kubi.kumex.helper.j0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return NoticeHelper.m34037u(function1, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.kumex.helper.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoticeHelper.m34042z(fragment, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.kumex.helper.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeHelper.m34009C(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.kumex.helper.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoticeHelper.m34010D((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kumex.helper.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeHelper.m34011E(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, fragment.getVisibleDisposable());
        Observable observableM = kuMexDepend.m35905g().m();
        final Function1 function4 = new Function1() { // from class: com.kubi.kumex.helper.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NoticeHelper.m34038v((LoginUserEntity) obj));
            }
        };
        Observable observableObserveOn = observableM.filter(new Predicate() { // from class: com.kubi.kumex.helper.p0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return NoticeHelper.m34039w(function4, obj);
            }
        }).observeOn(C42916f.m94128g());
        final Function1 function5 = new Function1() { // from class: com.kubi.kumex.helper.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NoticeHelper.m34040x(fragment, (LoginUserEntity) obj);
            }
        };
        Disposable disposableSubscribe2 = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.helper.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NoticeHelper.m34041y(function5, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, fragment.getVisibleDisposable());
        repositoryServiceLocator.m20292k().mo100572c();
    }

    /* JADX INFO: renamed from: C */
    public static final void m34009C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m34010D(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final void m34011E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    public static final void m34017O(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final void m34041y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public final void m34044G(BaseFragment baseFragment, View view) {
        ViewExtKt.m66577h(view);
    }
}
