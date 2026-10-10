package com.kubi.spot.helper;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.business.saving.SavingAvailableDialogHelper;
import com.kubi.spot.business.saving.SavingConfig;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import f30.C37340k;
import g00.InterfaceC37749a;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.helper.e, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DepositTransferDialogHelper.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/helper/DepositTransferDialogHelper;", "", "<init>", "()V", "showDepositTransferDialog", "", "from", "Lcom/kubi/data/coin/AccountType;", TypedValues.TransitionType.S_TO, "targetCurrency", "", "isSpotNormalLimitOrder", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "itemClickListener", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemClickListener;", "ItemType", "ItemClickListener", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DepositTransferDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DepositTransferDialogHelper f50572a = new DepositTransferDialogHelper();

    /* JADX INFO: renamed from: com.kubi.spot.helper.e$a */
    /* JADX INFO: compiled from: DepositTransferDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemClickListener;", "", "onItemClick", "", "type", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void m61803a(@NotNull b bVar);
    }

    /* JADX INFO: renamed from: com.kubi.spot.helper.e$b */
    /* JADX INFO: compiled from: DepositTransferDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType;", "", "Transfer", "Deposit", "Cancel", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType$Cancel;", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType$Deposit;", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType$Transfer;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.kubi.spot.helper.e$b$a */
        /* JADX INFO: compiled from: DepositTransferDialogHelper.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType$Deposit;", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType;", "<init>", "()V", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f50573a = new a();
        }

        /* JADX INFO: renamed from: com.kubi.spot.helper.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DepositTransferDialogHelper.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType$Transfer;", "Lcom/kubi/spot/helper/DepositTransferDialogHelper$ItemType;", "<init>", "()V", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C46982b implements b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C46982b f50574a = new C46982b();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m61799f(final String str, boolean z11, SymbolInfoEntity symbolInfoEntity, final a aVar, final AccountType accountType, final AccountType accountType2, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        final CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        if (SavingConfig.f50323a.m61340h()) {
            SavingAvailableDialogHelper.f50315a.m61318f(str, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, z11, symbolInfoEntity, viewHolder, dialogFragmentHelper);
        }
        View view = viewHolder.getView(R$id.layoutTransfer);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        ViewExtKt.m66575f(view, new Function1(aVar, str, accountType, accountType2, dialogFragmentHelper) { // from class: com.kubi.spot.helper.c

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f50557b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ AccountType f50558c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AccountType f50559d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DialogFragmentHelper f50560e;

            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositTransferDialogHelper.m61800g(null, this.f50557b, this.f50558c, this.f50559d, this.f50560e, (View) obj);
            }

            {
                this.f50557b = str;
                this.f50558c = accountType;
                this.f50559d = accountType2;
                this.f50560e = dialogFragmentHelper;
            }
        });
        boolean z12 = true;
        if ((!C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit) || coinInfoEntityM85613u == null || coinInfoEntityM85613u.isDigital()) && (coinInfoEntityM85613u == null || !coinInfoEntityM85613u.isDigital())) {
            z12 = false;
        }
        viewHolder.setGone(R$id.tvDeposit, z12);
        View view2 = viewHolder.getView(R$id.layoutDeposit);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        ViewExtKt.m66575f(view2, new Function1(aVar, coinInfoEntityM85613u, str, dialogFragmentHelper) { // from class: com.kubi.spot.helper.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CoinInfoEntity f50561b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f50562c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ DialogFragmentHelper f50563d;

            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DepositTransferDialogHelper.m61801h(null, this.f50561b, this.f50562c, this.f50563d, (View) obj);
            }

            {
                this.f50561b = coinInfoEntityM85613u;
                this.f50562c = str;
                this.f50563d = dialogFragmentHelper;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m61800g(a aVar, String str, AccountType accountType, AccountType accountType2, DialogFragmentHelper dialogFragmentHelper, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (aVar != null) {
            aVar.m61803a(b.C46982b.f50574a);
        }
        InterfaceC37749a.a.m85117l(C37304a.f82764a, C27041f.m66668h(str), accountType.name(), accountType2.name(), null, null, null, null, 120, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m61801h(a aVar, CoinInfoEntity coinInfoEntity, String str, DialogFragmentHelper dialogFragmentHelper, View it) {
        String code;
        Intrinsics.checkNotNullParameter(it, "it");
        if (aVar != null) {
            aVar.m61803a(b.a.f50573a);
        }
        C37340k c37340k = C37340k.f82854a;
        if (coinInfoEntity != null && (code = coinInfoEntity.getCode()) != null) {
            str = code;
        }
        c37340k.m83929f(str);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m61802d(@NotNull final AccountType from, @NotNull final AccountType to2, @Nullable final String str, final boolean z11, @NotNull final SymbolInfoEntity symbolInfo, @NotNull FragmentManager fragmentManager, @Nullable final a aVar) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to2, "to");
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.kc_dialog_deposit_transfer, true).m54237f4(new Function2(str, z11, symbolInfo, aVar, from, to2) { // from class: com.kubi.spot.helper.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f50551b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f50552c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ SymbolInfoEntity f50553d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ AccountType f50554e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ AccountType f50555f;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DepositTransferDialogHelper.m61799f(this.f50551b, this.f50552c, this.f50553d, null, this.f50554e, this.f50555f, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }

            {
                this.f50554e = from;
                this.f50555f = to2;
            }
        });
        dialogFragmentHelperM54237f4.setCancelable(true);
        dialogFragmentHelperM54237f4.show(fragmentManager, "DepositTransferDialog");
    }
}
