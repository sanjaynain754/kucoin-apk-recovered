package com.kubi.otc.fiat.withdraw.advcash;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatBindAdvcashAccount;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.fiat.withdraw.FiatWithdrawAddAccountStatusFragment;
import com.kubi.otc.view.TitleEditTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37240b;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p270ft.C37651m;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: FiatAdvcashWithdrawAddAccountFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/advcash/FiatAdvcashWithdrawAddAccountFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "channelId", "getChannelId", "channelId$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatAdvcashAddAccountBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatAdvcashAddAccountBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatAdvcashWithdrawAddAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatAdvcashWithdrawAddAccountFragment.kt\ncom/kubi/otc/fiat/withdraw/advcash/FiatAdvcashWithdrawAddAccountFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,89:1\n147#2,16:90\n*S KotlinDebug\n*F\n+ 1 FiatAdvcashWithdrawAddAccountFragment.kt\ncom/kubi/otc/fiat/withdraw/advcash/FiatAdvcashWithdrawAddAccountFragment\n*L\n36#1:90,16\n*E\n"})
public final class FiatAdvcashWithdrawAddAccountFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37471U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.advcash.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatAdvcashWithdrawAddAccountFragment.m44546y3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37472V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.advcash.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatAdvcashWithdrawAddAccountFragment.m44545x3(this.f37481b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37473W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.advcash.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatAdvcashWithdrawAddAccountFragment.m44544w3(this.f37482b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f37474X = C45681e.m100799e(this, new Function1<FiatAdvcashWithdrawAddAccountFragment, C37651m>() { // from class: com.kubi.otc.fiat.withdraw.advcash.FiatAdvcashWithdrawAddAccountFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37651m invoke(@NotNull FiatAdvcashWithdrawAddAccountFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37651m.m84885a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37651m, Unit>() { // from class: com.kubi.otc.fiat.withdraw.advcash.FiatAdvcashWithdrawAddAccountFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37651m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37651m c37651m) {
            invoke(c37651m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f37470Z = {Reflection.property1(new PropertyReference1Impl(FiatAdvcashWithdrawAddAccountFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatAdvcashAddAccountBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f37469Y = new Companion(null);

    /* JADX INFO: compiled from: FiatAdvcashWithdrawAddAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/advcash/FiatAdvcashWithdrawAddAccountFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "channelId", "", FirebaseAnalytics.Param.CURRENCY, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @NotNull String channelId, @NotNull String currency) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.fiat_withdraw_input_add), FiatAdvcashWithdrawAddAccountFragment.class.getName(), new C27051h().m66724h("data", currency).m66724h("data_1", channelId).m66717a());
        }
    }

    /* JADX INFO: renamed from: B3 */
    private final String m44521B3() {
        return (String) this.f37472V.getValue();
    }

    /* JADX INFO: renamed from: C3 */
    private final InterfaceC37240b m44522C3() {
        return (InterfaceC37240b) this.f37471U.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public final String m44547A3() {
        return (String) this.f37473W.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_advcash_add_account;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        TitleEditTextView titleEditTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37651m c37651mM44548z3 = m44548z3();
        if (c37651mM44548z3 != null && (titleEditTextView = c37651mM44548z3.f84252c) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(titleEditTextView.getEditText());
            final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.advcash.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FiatAdvcashWithdrawAddAccountFragment.m44528I3(this.f37483b, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.otc.fiat.withdraw.advcash.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FiatAdvcashWithdrawAddAccountFragment.m44529J3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.advcash.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FiatAdvcashWithdrawAddAccountFragment.m44530K3((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.fiat.withdraw.advcash.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FiatAdvcashWithdrawAddAccountFragment.m44531L3(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
        C37651m c37651mM44548z4 = m44548z3();
        if (c37651mM44548z4 == null || (baseTextView = c37651mM44548z4.f84253d) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.advcash.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatAdvcashWithdrawAddAccountFragment.m44523D3(this.f37486b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C37651m m44548z3() {
        return (C37651m) this.f37474X.getValue(this, f37470Z[0]);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m44523D3(final FiatAdvcashWithdrawAddAccountFragment fiatAdvcashWithdrawAddAccountFragment) {
        String text;
        TitleEditTextView titleEditTextView;
        TitleEditTextView titleEditTextView2;
        InterfaceC37240b interfaceC37240bM44522C3 = fiatAdvcashWithdrawAddAccountFragment.m44522C3();
        String strM44547A3 = fiatAdvcashWithdrawAddAccountFragment.m44547A3();
        String strM44521B3 = fiatAdvcashWithdrawAddAccountFragment.m44521B3();
        C37651m c37651mM44548z3 = fiatAdvcashWithdrawAddAccountFragment.m44548z3();
        String text2 = null;
        if (c37651mM44548z3 != null && (titleEditTextView2 = c37651mM44548z3.f84252c) != null) {
            text = titleEditTextView2.getText();
        } else {
            text = null;
        }
        C37651m c37651mM44548z4 = fiatAdvcashWithdrawAddAccountFragment.m44548z3();
        if (c37651mM44548z4 != null && (titleEditTextView = c37651mM44548z4.f84251b) != null) {
            text2 = titleEditTextView.getText();
        }
        Observable<R> observableCompose = interfaceC37240bM44522C3.m83309v(new FiatBindAdvcashAccount(strM44547A3, strM44521B3, text, text2)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.advcash.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatAdvcashWithdrawAddAccountFragment.m44527H3(this.f37487b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.advcash.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatAdvcashWithdrawAddAccountFragment.m44524E3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.advcash.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatAdvcashWithdrawAddAccountFragment.m44525F3(this.f37479b, (FiatWithdrawAccountInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.advcash.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatAdvcashWithdrawAddAccountFragment.m44526G3(function2, obj);
            }
        }, new C24223c1(fiatAdvcashWithdrawAddAccountFragment));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = fiatAdvcashWithdrawAddAccountFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m44524E3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m44525F3(FiatAdvcashWithdrawAddAccountFragment fiatAdvcashWithdrawAddAccountFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        fiatAdvcashWithdrawAddAccountFragment.hideDialogLoading();
        BaseFragmentActivity.m56573m0(fiatAdvcashWithdrawAddAccountFragment.getContext(), "", FiatWithdrawAddAccountStatusFragment.class.getName());
        fiatAdvcashWithdrawAddAccountFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m44526G3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m44527H3(FiatAdvcashWithdrawAddAccountFragment fiatAdvcashWithdrawAddAccountFragment, Disposable disposable) {
        fiatAdvcashWithdrawAddAccountFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m44528I3(FiatAdvcashWithdrawAddAccountFragment fiatAdvcashWithdrawAddAccountFragment, CharSequence charSequence) {
        BaseTextView baseTextView;
        boolean z11;
        C37651m c37651mM44548z3 = fiatAdvcashWithdrawAddAccountFragment.m44548z3();
        if (c37651mM44548z3 != null && (baseTextView = c37651mM44548z3.f84253d) != null) {
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            baseTextView.setEnabled(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m44529J3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m44530K3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final void m44531L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static final String m44544w3(FiatAdvcashWithdrawAddAccountFragment fiatAdvcashWithdrawAddAccountFragment) {
        String strM56284y;
        Bundle arguments = fiatAdvcashWithdrawAddAccountFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "data_1");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: x3 */
    public static final String m44545x3(FiatAdvcashWithdrawAddAccountFragment fiatAdvcashWithdrawAddAccountFragment) {
        String strM56284y;
        Bundle arguments = fiatAdvcashWithdrawAddAccountFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "data");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final InterfaceC37240b m44546y3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }
}
