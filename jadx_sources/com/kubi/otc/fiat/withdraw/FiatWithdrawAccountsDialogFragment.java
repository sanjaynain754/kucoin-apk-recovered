package com.kubi.otc.fiat.withdraw;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import au.InterfaceC4389a;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatUnBindWithdrawAccount;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.entity.FiatWithdrawAccountsParams;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37240b;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FiatWithdrawAccountsDialogFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001 \u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0001H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b!\u0010\"¨\u0006."}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "fatherFragment", "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;", "getFatherFragment", "()Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;", "fatherFragment$delegate", "bundleDates", "Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;", "getBundleDates", "()Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;", "bundleDates$delegate", "isDelCard", "", "currentSelectId", "", "viewDialogHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "itemSelect", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "accountsAdapter", "com/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1", "getAccountsAdapter", "()Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1;", "accountsAdapter$delegate", "setupView", "", "viewHolder", "helper", "deleteAccount", JAnalysisConstants.Account.KEY_ACCOUNT, TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "needHideAccountManage", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatWithdrawAccountsDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatWithdrawAccountsDialogFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,221:1\n17#2,2:222\n*S KotlinDebug\n*F\n+ 1 FiatWithdrawAccountsDialogFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment\n*L\n197#1:222,2\n*E\n"})
public final class FiatWithdrawAccountsDialogFragment extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public static final Companion f37446y0 = new Companion(null);

    /* JADX INFO: renamed from: t0 */
    public boolean f37450t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public String f37451u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public BaseViewHolder f37452v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public Consumer<FiatWithdrawAccountInfo> f37453w0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f37447q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawAccountsDialogFragment.m44426N4();
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f37448r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawAccountsDialogFragment.m44425M4(this.f37610b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f37449s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawAccountsDialogFragment.m44419F4(this.f37612b);
        }
    });

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final Lazy f37454x0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.q0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawAccountsDialogFragment.m44418E4(this.f37615b);
        }
    });

    /* JADX INFO: compiled from: FiatWithdrawAccountsDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$Companion;", "", "<init>", "()V", "MAX_CARD_LIMIT_NUM", "", "showDialog", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "manager", "Landroidx/fragment/app/FragmentManager;", "accountsParams", "Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;", "itemSelectListener", "Lio/reactivex/functions/Consumer;", "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BaseDialogFragment showDialog(@NotNull FragmentManager manager, @Nullable FiatWithdrawAccountsParams accountsParams, @Nullable Consumer<FiatWithdrawAccountInfo> itemSelectListener) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment = new FiatWithdrawAccountsDialogFragment();
            fiatWithdrawAccountsDialogFragment.f37453w0 = itemSelectListener;
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_dialog_withdraw_accounts);
            bundle.putParcelable("data", accountsParams);
            fiatWithdrawAccountsDialogFragment.setArguments(bundle);
            fiatWithdrawAccountsDialogFragment.show(manager, "card_dialog");
            return fiatWithdrawAccountsDialogFragment;
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 m44418E4(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment) {
        return new FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1(fiatWithdrawAccountsDialogFragment, R$layout.payment_item_withdraw_account);
    }

    /* JADX INFO: renamed from: R4 */
    private final InterfaceC37240b m44427R4() {
        return (InterfaceC37240b) this.f37447q0.getValue();
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m44428T4(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, TextView textView, BaseViewHolder baseViewHolder) {
        boolean z11 = fiatWithdrawAccountsDialogFragment.f37450t0;
        fiatWithdrawAccountsDialogFragment.f37450t0 = !z11;
        textView.setText(!z11 ? R$string.complete_done : R$string.edit);
        baseViewHolder.setText(R$id.tv_title, fiatWithdrawAccountsDialogFragment.f37450t0 ? R$string.edit : R$string.fait_account_card_select);
        fiatWithdrawAccountsDialogFragment.m44448O4().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m44429U4(DialogFragmentHelper dialogFragmentHelper, FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment) {
        if (dialogFragmentHelper != null) {
            dialogFragmentHelper.dismiss();
        }
        AbsFiatWithdrawInputFragment absFiatWithdrawInputFragmentM44450Q4 = fiatWithdrawAccountsDialogFragment.m44450Q4();
        if (absFiatWithdrawInputFragmentM44450Q4 != null) {
            absFiatWithdrawInputFragmentM44450Q4.mo44397J4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public final void m44447G4(final FiatWithdrawAccountInfo fiatWithdrawAccountInfo, final Action action) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.fiat_withdraw_manage_account_delete_title).m54156M4(getString(R$string.fiat_withdraw_manage_account_delete_msg, C27041f.m66668h(fiatWithdrawAccountInfo.getIbanLast4()))).m54162S4(R$string.delete, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.fiat.withdraw.r0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FiatWithdrawAccountsDialogFragment.m44420H4(this.f37618b, fiatWithdrawAccountInfo, action, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: O4 */
    public final FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 m44448O4() {
        return (FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1) this.f37454x0.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final FiatWithdrawAccountsParams m44449P4() {
        return (FiatWithdrawAccountsParams) this.f37449s0.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final AbsFiatWithdrawInputFragment m44450Q4() {
        return (AbsFiatWithdrawInputFragment) this.f37448r0.getValue();
    }

    /* JADX INFO: renamed from: S4 */
    public final boolean m44451S4() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC4389a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC4389a) objM56186h).m4000a();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull final BaseViewHolder viewHolder, @NotNull final DialogFragmentHelper helper) {
        List<FiatWithdrawAccountInfo> accounts;
        List<FiatWithdrawAccountInfo> accounts2;
        List<FiatWithdrawAccountInfo> accounts3;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f37452v0 = viewHolder;
        FiatWithdrawAccountsParams fiatWithdrawAccountsParamsM44449P4 = m44449P4();
        Integer numValueOf = null;
        boolean z11 = C27039d.m66650j((fiatWithdrawAccountsParamsM44449P4 == null || (accounts3 = fiatWithdrawAccountsParamsM44449P4.getAccounts()) == null) ? null : Integer.valueOf(accounts3.size())) >= 5;
        if (!m44451S4()) {
            viewHolder.setGone(R$id.tv_account_limit_tip, z11);
        }
        int i11 = R$id.iv_add;
        viewHolder.setGone(i11, !z11);
        int i12 = R$id.tv_add_account;
        viewHolder.setGone(i12, !z11);
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.view_account_recycler);
        FiatWithdrawAccountsParams fiatWithdrawAccountsParamsM44449P5 = m44449P4();
        if (fiatWithdrawAccountsParamsM44449P5 != null && (accounts2 = fiatWithdrawAccountsParamsM44449P5.getAccounts()) != null) {
            FiatWithdrawAccountsParams fiatWithdrawAccountsParamsM44449P6 = m44449P4();
            this.f37451u0 = fiatWithdrawAccountsParamsM44449P6 != null ? fiatWithdrawAccountsParamsM44449P6.getCurrentSelectId() : null;
            recyclerView.setAdapter(m44448O4());
            m44448O4().replaceData(accounts2);
        }
        final TextView textView = (TextView) viewHolder.getView(R$id.tv_manage_account);
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatWithdrawAccountsDialogFragment.m44428T4(this.f37599b, textView, viewHolder);
            }
        }, 1, null);
        textView.setText(R$string.edit);
        if (m44451S4()) {
            C27046k.m66700o(textView);
        } else {
            C27046k.m66685H(textView);
        }
        if (m44451S4()) {
            View view = viewHolder.getView(i11);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            C27046k.m66700o(view);
            View view2 = viewHolder.getView(i12);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            C27046k.m66700o(view2);
        } else {
            FiatWithdrawAccountsParams fiatWithdrawAccountsParamsM44449P7 = m44449P4();
            if (fiatWithdrawAccountsParamsM44449P7 != null && (accounts = fiatWithdrawAccountsParamsM44449P7.getAccounts()) != null) {
                numValueOf = Integer.valueOf(accounts.size());
            }
            if (C27039d.m66650j(numValueOf) >= 5) {
                View view3 = viewHolder.getView(i11);
                Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
                C27046k.m66700o(view3);
                View view4 = viewHolder.getView(i12);
                Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
                C27046k.m66700o(view4);
            } else {
                View view5 = viewHolder.getView(i11);
                Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
                C27046k.m66685H(view5);
                View view6 = viewHolder.getView(i12);
                Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
                C27046k.m66685H(view6);
            }
        }
        View view7 = viewHolder.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        View view8 = viewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
        C27046k.m66681D(new View[]{view7, view8}, new Function0() { // from class: com.kubi.otc.fiat.withdraw.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatWithdrawAccountsDialogFragment.m44429U4(helper, this);
            }
        });
    }

    public FiatWithdrawAccountsDialogFragment() {
        m54236e4(this);
    }

    /* JADX INFO: renamed from: F4 */
    public static final FiatWithdrawAccountsParams m44419F4(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment) {
        Bundle arguments = fiatWithdrawAccountsDialogFragment.getArguments();
        if (arguments != null) {
            return (FiatWithdrawAccountsParams) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m44420H4(final FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo, final Action action, DialogInterface dialogInterface, int i11) {
        CompositeDisposable compositeDisposable;
        Observable<R> observableCompose = fiatWithdrawAccountsDialogFragment.m44427R4().m83300m(new FiatUnBindWithdrawAccount(C27041f.m66668h(fiatWithdrawAccountInfo.getPayoutAccountId()))).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatWithdrawAccountsDialogFragment.m44421I4(this.f37623b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatWithdrawAccountsDialogFragment.m44422J4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatWithdrawAccountsDialogFragment.m44423K4(this.f37627b, action, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatWithdrawAccountsDialogFragment.m44424L4(function2, obj);
            }
        }, new C24223c1(fiatWithdrawAccountsDialogFragment.m44450Q4()));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        AbsFiatWithdrawInputFragment absFiatWithdrawInputFragmentM44450Q4 = fiatWithdrawAccountsDialogFragment.m44450Q4();
        if (absFiatWithdrawInputFragmentM44450Q4 != null) {
            compositeDisposable = absFiatWithdrawInputFragmentM44450Q4.getCompositeDisposable();
        } else {
            compositeDisposable = null;
        }
        Intrinsics.checkNotNull(compositeDisposable);
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m44421I4(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, Disposable disposable) {
        AbsFiatWithdrawInputFragment absFiatWithdrawInputFragmentM44450Q4 = fiatWithdrawAccountsDialogFragment.m44450Q4();
        if (absFiatWithdrawInputFragmentM44450Q4 != null) {
            absFiatWithdrawInputFragmentM44450Q4.showDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m44422J4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m44423K4(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, Action action, Boolean bool) throws Exception {
        AbsFiatWithdrawInputFragment absFiatWithdrawInputFragmentM44450Q4 = fiatWithdrawAccountsDialogFragment.m44450Q4();
        if (absFiatWithdrawInputFragmentM44450Q4 != null) {
            absFiatWithdrawInputFragmentM44450Q4.hideDialogLoading();
        }
        action.run();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m44424L4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final AbsFiatWithdrawInputFragment m44425M4(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment) {
        Fragment parentFragment = fiatWithdrawAccountsDialogFragment.getParentFragment();
        if (parentFragment instanceof AbsFiatWithdrawInputFragment) {
            return (AbsFiatWithdrawInputFragment) parentFragment;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public static final InterfaceC37240b m44426N4() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }
}
