package com.kubi.otc.fiat.withdraw.capitual;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatAccountExtraInfo;
import com.kubi.otc.entity.FiatBindCapitualAccount;
import com.kubi.otc.entity.FiatCapitualBank;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.fiat.withdraw.FiatWithdrawAddAccountStatusFragment;
import com.kubi.otc.view.TitleChooseView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37240b;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37661o;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0002J&\u0010'\u001a\u00020!2\u001c\b\u0002\u0010(\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*\u0012\u0004\u0012\u00020!\u0018\u00010)H\u0002J\u0016\u0010,\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0-H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualAddAccountFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "channelId", "getChannelId", "channelId$delegate", "paramsResult", "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult;", "userInfo", "Lcom/kubi/otc/entity/FiatUserInfo;", "currentType", "", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualAddAccountBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualAddAccountBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setCurrentView", "getChannelBanks", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "Lcom/kubi/otc/entity/FiatCapitualBank;", "getKycStatus", "Lkotlin/Function0;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatCapitualWithdrawAddAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatCapitualWithdrawAddAccountFragment.kt\ncom/kubi/otc/fiat/withdraw/capitual/FiatCapitualAddAccountFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n147#2,16:365\n1563#3:381\n1634#3,3:382\n1563#3:385\n1634#3,3:386\n*S KotlinDebug\n*F\n+ 1 FiatCapitualWithdrawAddAccountFragment.kt\ncom/kubi/otc/fiat/withdraw/capitual/FiatCapitualAddAccountFragment\n*L\n53#1:365,16\n98#1:381\n98#1:382,3\n129#1:385\n129#1:386,3\n*E\n"})
public final class FiatCapitualAddAccountFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: X */
    @Nullable
    public ParamsResult f37509X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public FiatUserInfo f37510Y;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f37505c0 = {Reflection.property1(new PropertyReference1Impl(FiatCapitualAddAccountFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualAddAccountBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f37504b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37506U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatCapitualAddAccountFragment.m44570I3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37507V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatCapitualAddAccountFragment.m44569H3(this.f37553b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f37508W = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.o
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatCapitualAddAccountFragment.m44568G3(this.f37559b);
        }
    });

    /* JADX INFO: renamed from: Z */
    public int f37511Z = 1;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f37512a0 = C45681e.m100799e(this, new Function1<FiatCapitualAddAccountFragment, C37661o>() { // from class: com.kubi.otc.fiat.withdraw.capitual.FiatCapitualAddAccountFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37661o invoke(@NotNull FiatCapitualAddAccountFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37661o.m84906a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37661o, Unit>() { // from class: com.kubi.otc.fiat.withdraw.capitual.FiatCapitualAddAccountFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37661o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37661o c37661o) {
            invoke(c37661o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/FiatCapitualAddAccountFragment$Companion;", "", "<init>", "()V", "ACCOUNT_TYPE_PIX", "", "ACCOUNT_TYPE_TED", "PIX_TYPE_CPF", "PIX_TYPE_BANK", "VIEW_TYPE_PIX_CPF", "", "VIEW_TYPE_PIX_BANK", "VIEW_TYPE_TED", "startFragment", "", "context", "Landroid/content/Context;", "channelId", FirebaseAnalytics.Param.CURRENCY, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.pay_capitual_withdraw_add_account_title), FiatCapitualAddAccountFragment.class.getName(), new C27051h().m66724h("data", currency).m66724h("data_1", channelId).m66717a());
        }
    }

    /* JADX INFO: renamed from: P3 */
    private final String m44575P3() {
        return (String) this.f37508W.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final String m44576Q3() {
        return (String) this.f37507V.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    private final InterfaceC37240b m44577R3() {
        return (InterfaceC37240b) this.f37506U.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m44578T3(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, Function0 function0, FiatUserInfo fiatUserInfo) {
        fiatCapitualAddAccountFragment.f37510Y = fiatUserInfo;
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m44580V3(final FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, final TitleChooseView titleChooseView) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListArrayListOf = CollectionsKt.arrayListOf("CPF", "Bank Account");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        for (String str : arrayListArrayListOf) {
            arrayList.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, Intrinsics.areEqual(str, titleChooseView.getText()), null, 3069, null));
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.c
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FiatCapitualAddAccountFragment.m44581W3(titleChooseView, fiatCapitualAddAccountFragment, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = fiatCapitualAddAccountFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "choose_pix_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m44582X3(final FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment) {
        if (fiatCapitualAddAccountFragment.f37509X == null) {
            return Unit.INSTANCE;
        }
        int i11 = fiatCapitualAddAccountFragment.f37511Z;
        FiatBindCapitualAccount fiatBindCapitualAccountBindPixCPFAccount = null;
        if (i11 == 1) {
            FiatBindCapitualAccount fiatBindCapitualAccount = new FiatBindCapitualAccount(null, null, null, null, null, null, null, null, 255, null);
            String strM44575P3 = fiatCapitualAddAccountFragment.m44575P3();
            String strM44576Q3 = fiatCapitualAddAccountFragment.m44576Q3();
            ParamsResult paramsResult = fiatCapitualAddAccountFragment.f37509X;
            fiatBindCapitualAccountBindPixCPFAccount = fiatBindCapitualAccount.bindPixCPFAccount(strM44575P3, strM44576Q3, paramsResult instanceof ParamsResult.a ? (ParamsResult.a) paramsResult : null);
        } else if (i11 == 2) {
            FiatBindCapitualAccount fiatBindCapitualAccount2 = new FiatBindCapitualAccount(null, null, null, null, null, null, null, null, 255, null);
            String strM44575P4 = fiatCapitualAddAccountFragment.m44575P3();
            String strM44576Q4 = fiatCapitualAddAccountFragment.m44576Q3();
            ParamsResult paramsResult2 = fiatCapitualAddAccountFragment.f37509X;
            fiatBindCapitualAccountBindPixCPFAccount = fiatBindCapitualAccount2.bindPixBankAccount(strM44575P4, strM44576Q4, paramsResult2 instanceof ParamsResult.b ? (ParamsResult.b) paramsResult2 : null);
        } else if (i11 == 3) {
            FiatBindCapitualAccount fiatBindCapitualAccount3 = new FiatBindCapitualAccount(null, null, null, null, null, null, null, null, 255, null);
            String strM44575P5 = fiatCapitualAddAccountFragment.m44575P3();
            String strM44576Q5 = fiatCapitualAddAccountFragment.m44576Q3();
            ParamsResult paramsResult3 = fiatCapitualAddAccountFragment.f37509X;
            fiatBindCapitualAccountBindPixCPFAccount = fiatBindCapitualAccount3.bindTedAccount(strM44575P5, strM44576Q5, paramsResult3 instanceof ParamsResult.b ? (ParamsResult.b) paramsResult3 : null);
        }
        if (fiatBindCapitualAccountBindPixCPFAccount == null) {
            return Unit.INSTANCE;
        }
        Observable<R> observableCompose = fiatCapitualAddAccountFragment.m44577R3().m83290c(fiatBindCapitualAccountBindPixCPFAccount).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualAddAccountFragment.m44583Y3(this.f37568b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatCapitualAddAccountFragment.m44584Z3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualAddAccountFragment.m44585a4(this.f37571b, (FiatWithdrawAccountInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatCapitualAddAccountFragment.m44586b4(function2, obj);
            }
        }, new C24223c1(fiatCapitualAddAccountFragment));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = fiatCapitualAddAccountFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m44587c4(final FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, final TitleChooseView titleChooseView) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListArrayListOf = CollectionsKt.arrayListOf(FiatAccountExtraInfo.ACCOUNT_PIX, FiatAccountExtraInfo.ACCOUNT_TED);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListArrayListOf, 10));
        for (String str : arrayListArrayListOf) {
            arrayList.add(new SelectEntity(null, str, null, null, null, null, null, null, null, false, Intrinsics.areEqual(str, titleChooseView.getText()), null, 3069, null));
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList, new BiConsumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.b
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FiatCapitualAddAccountFragment.m44588d4(titleChooseView, fiatCapitualAddAccountFragment, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = fiatCapitualAddAccountFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "choose_account_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m44589f4(final FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, final PixTedTypeContentView pixTedTypeContentView) {
        fiatCapitualAddAccountFragment.m44610K3(new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualAddAccountFragment.m44590g4(pixTedTypeContentView, fiatCapitualAddAccountFragment, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m44590g4(final PixTedTypeContentView pixTedTypeContentView, FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DialogFragmentHelper dialogFragmentHelperNewInstance = FiatCapitualWithdrawSelectBankDialogView.f37517u0.newInstance(pixTedTypeContentView.getBankNo(), it, new BiConsumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.n
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FiatCapitualAddAccountFragment.m44591h4(pixTedTypeContentView, (BaseViewHolder) obj, (FiatCapitualBank) obj2);
            }
        });
        FragmentManager childFragmentManager = fiatCapitualAddAccountFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance.show(childFragmentManager, "select_bank_dialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m44592i4(PixTedTypeContentView pixTedTypeContentView, FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment) {
        FiatUserInfo fiatUserInfo = fiatCapitualAddAccountFragment.f37510Y;
        pixTedTypeContentView.setAccountName(C27041f.m66668h(fiatUserInfo != null ? fiatUserInfo.getKycName() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public final C37661o m44609J3() {
        return (C37661o) this.f37512a0.getValue(this, f37505c0[0]);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m44611S3(final Function0<Unit> function0) {
        if (this.f37510Y != null) {
            function0.invoke();
            return;
        }
        Observable<R> observableCompose = m44577R3().m83306s().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualAddAccountFragment.m44578T3(this.f37543b, function0, (FiatUserInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatCapitualAddAccountFragment.m44579U3(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m44612e4() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int i11 = this.f37511Z;
        if (i11 == 1) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            PixCPFTypeContentView pixCPFTypeContentView = new PixCPFTypeContentView(mContext);
            this.f37509X = pixCPFTypeContentView;
            C37661o c37661oM44609J3 = m44609J3();
            if (c37661oM44609J3 != null && (frameLayout = c37661oM44609J3.f84345e) != null) {
                frameLayout.addView(pixCPFTypeContentView);
            }
            C37661o c37661oM44609J4 = m44609J3();
            TitleChooseView titleChooseView = c37661oM44609J4 != null ? c37661oM44609J4.f84342b : null;
            C37661o c37661oM44609J5 = m44609J3();
            pixCPFTypeContentView.m44648h(titleChooseView, c37661oM44609J5 != null ? c37661oM44609J5.f84344d : null);
            return;
        }
        if (i11 == 2 || i11 == 3) {
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            final PixTedTypeContentView pixTedTypeContentView = new PixTedTypeContentView(mContext2);
            this.f37509X = pixTedTypeContentView;
            C37661o c37661oM44609J6 = m44609J3();
            if (c37661oM44609J6 != null && (frameLayout2 = c37661oM44609J6.f84345e) != null) {
                frameLayout2.addView(pixTedTypeContentView);
            }
            C37661o c37661oM44609J7 = m44609J3();
            TitleChooseView titleChooseView2 = c37661oM44609J7 != null ? c37661oM44609J7.f84342b : null;
            C37661o c37661oM44609J8 = m44609J3();
            pixTedTypeContentView.m44664j(titleChooseView2, c37661oM44609J8 != null ? c37661oM44609J8.f84344d : null, Boolean.valueOf(this.f37511Z == 3));
            pixTedTypeContentView.setBankNoListener(new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatCapitualAddAccountFragment.m44589f4(this.f37532b, pixTedTypeContentView);
                }
            });
            m44611S3(new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatCapitualAddAccountFragment.m44592i4(pixTedTypeContentView, this);
                }
            });
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_capitual_add_account;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        final TitleChooseView titleChooseView;
        final TitleChooseView titleChooseView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m44612e4();
        C37661o c37661oM44609J3 = m44609J3();
        if (c37661oM44609J3 != null && (titleChooseView2 = c37661oM44609J3.f84343c) != null) {
            titleChooseView2.setText(FiatAccountExtraInfo.ACCOUNT_PIX);
            C27046k.m66711z(titleChooseView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatCapitualAddAccountFragment.m44587c4(this.f37561b, titleChooseView2);
                }
            }, 1, null);
        }
        C37661o c37661oM44609J4 = m44609J3();
        if (c37661oM44609J4 != null && (titleChooseView = c37661oM44609J4.f84342b) != null) {
            C27046k.m66711z(titleChooseView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatCapitualAddAccountFragment.m44580V3(this.f37564b, titleChooseView);
                }
            }, 1, null);
        }
        C37661o c37661oM44609J5 = m44609J3();
        if (c37661oM44609J5 == null || (baseTextView = c37661oM44609J5.f84344d) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatCapitualAddAccountFragment.m44582X3(this.f37567b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: G3 */
    public static final String m44568G3(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment) {
        String string;
        Bundle arguments = fiatCapitualAddAccountFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data_1");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: H3 */
    public static final String m44569H3(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment) {
        String string;
        Bundle arguments = fiatCapitualAddAccountFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public static final InterfaceC37240b m44570I3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m44571L3(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, Disposable disposable) {
        fiatCapitualAddAccountFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m44572M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m44573N3(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, Function1 function1, List list) {
        fiatCapitualAddAccountFragment.hideDialogLoading();
        if (function1 != null) {
            Intrinsics.checkNotNull(list);
            function1.invoke(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m44574O3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m44579U3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m44581W3(TitleChooseView titleChooseView, FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        FrameLayout frameLayout;
        String strM66668h = C27041f.m66668h(interfaceC24339a.getLabel().toString());
        if (Intrinsics.areEqual(strM66668h, titleChooseView.getText())) {
            return;
        }
        titleChooseView.setText(strM66668h);
        C37661o c37661oM44609J3 = fiatCapitualAddAccountFragment.m44609J3();
        if (c37661oM44609J3 != null && (frameLayout = c37661oM44609J3.f84345e) != null) {
            frameLayout.removeAllViews();
        }
        if (Intrinsics.areEqual(strM66668h, "CPF")) {
            fiatCapitualAddAccountFragment.f37511Z = 1;
        } else if (Intrinsics.areEqual(strM66668h, "Bank Account")) {
            fiatCapitualAddAccountFragment.f37511Z = 2;
        }
        fiatCapitualAddAccountFragment.m44612e4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m44583Y3(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, Disposable disposable) {
        fiatCapitualAddAccountFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m44584Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m44585a4(FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        fiatCapitualAddAccountFragment.hideDialogLoading();
        BaseFragmentActivity.m56573m0(fiatCapitualAddAccountFragment.getContext(), "", FiatWithdrawAddAccountStatusFragment.class.getName());
        fiatCapitualAddAccountFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m44586b4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m44588d4(TitleChooseView titleChooseView, FiatCapitualAddAccountFragment fiatCapitualAddAccountFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        TitleChooseView titleChooseView2;
        TitleChooseView titleChooseView3;
        FrameLayout frameLayout;
        TitleChooseView titleChooseView4;
        String strM66668h = C27041f.m66668h(interfaceC24339a.getLabel().toString());
        if (Intrinsics.areEqual(strM66668h, titleChooseView.getText())) {
            return;
        }
        titleChooseView.setText(strM66668h);
        C37661o c37661oM44609J3 = fiatCapitualAddAccountFragment.m44609J3();
        if (c37661oM44609J3 != null && (titleChooseView4 = c37661oM44609J3.f84342b) != null) {
            titleChooseView4.setText("");
        }
        C37661o c37661oM44609J4 = fiatCapitualAddAccountFragment.m44609J3();
        if (c37661oM44609J4 != null && (frameLayout = c37661oM44609J4.f84345e) != null) {
            frameLayout.removeAllViews();
        }
        if (Intrinsics.areEqual(strM66668h, FiatAccountExtraInfo.ACCOUNT_PIX)) {
            fiatCapitualAddAccountFragment.f37511Z = 1;
            C37661o c37661oM44609J5 = fiatCapitualAddAccountFragment.m44609J3();
            if (c37661oM44609J5 != null && (titleChooseView3 = c37661oM44609J5.f84342b) != null) {
                C27046k.m66685H(titleChooseView3);
            }
        } else if (Intrinsics.areEqual(strM66668h, FiatAccountExtraInfo.ACCOUNT_TED)) {
            fiatCapitualAddAccountFragment.f37511Z = 3;
            C37661o c37661oM44609J6 = fiatCapitualAddAccountFragment.m44609J3();
            if (c37661oM44609J6 != null && (titleChooseView2 = c37661oM44609J6.f84342b) != null) {
                C27046k.m66700o(titleChooseView2);
            }
        }
        fiatCapitualAddAccountFragment.m44612e4();
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m44591h4(PixTedTypeContentView pixTedTypeContentView, BaseViewHolder baseViewHolder, FiatCapitualBank fiatCapitualBank) {
        pixTedTypeContentView.setBankInfo(fiatCapitualBank);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m44610K3(final Function1<? super List<FiatCapitualBank>, Unit> function1) {
        Observable<R> observableCompose = m44577R3().m83307t(m44575P3()).compose(C24217a1.m58389m());
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualAddAccountFragment.m44571L3(this.f37547b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatCapitualAddAccountFragment.m44572M3(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatCapitualAddAccountFragment.m44573N3(this.f37551b, function1, (List) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatCapitualAddAccountFragment.m44574O3(function3, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNull(compositeDisposable);
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }
}
