package com.kubi.kumex.trade;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5275i0;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import fm.C37567b;
import io.chad.library.adapter.base.BaseViewHolder;
import java.lang.reflect.Type;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p569qq.C43846g;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.kumex.trade.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ContractsOfflineManager.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J,\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u001c\u001a\u00020\u000b*\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0002J\f\u0010\u001f\u001a\u00020\u001e*\u0004\u0018\u00010\u0013R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/trade/ContractsOfflineManager;", "", "<init>", "()V", "DAY_TIPS_CONFIG", "", "getDAY_TIPS_CONFIG", "()I", "DAY_TIPS_CONFIG$delegate", "Lkotlin/Lazy;", "TRADE_DIALOG_SHOW_TIPS_KEY", "", "checkPositionOfflineStatus", "", "viewGroup", "Landroid/view/ViewGroup;", "tvOfflineTips", "Landroid/widget/TextView;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "checkTradeOfflineStatus", "offlineTipsLayout", "Landroid/view/View;", "offlineTipsView", "ivCloseTips", "checkTradeOfflineDialog", "fragment", "Lcom/kubi/sdk/BaseFragment;", "formatSettleDateTime", "noYear", "", "checkShowOffline", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContractsOfflineManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContractsOfflineManager.kt\ncom/kubi/kumex/trade/ContractsOfflineManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,146:1\n136#2:147\n136#2:148\n126#2,2:156\n126#2,2:158\n35#3,4:149\n39#3:155\n44#4,2:153\n*S KotlinDebug\n*F\n+ 1 ContractsOfflineManager.kt\ncom/kubi/kumex/trade/ContractsOfflineManager\n*L\n83#1:147\n104#1:148\n81#1:156,2\n118#1:158,2\n37#1:149,4\n37#1:155\n37#1:153,2\n*E\n"})
public final class ContractsOfflineManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ContractsOfflineManager f30505a = new ContractsOfflineManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f30506b = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.trade.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(ContractsOfflineManager.m36289e());
        }
    });

    /* JADX INFO: renamed from: com.kubi.kumex.trade.g$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Integer> {
    }

    /* JADX INFO: renamed from: g */
    public final boolean m36295g(@Nullable ContractEntity contractEntity) {
        boolean z11 = (contractEntity == null || !C37567b.m84625o(contractEntity) || contractEntity.getSettleDate() == null) ? false : true;
        int iM36299o = m36299o() * 86400;
        long jM66652l = (C27039d.m66652l(contractEntity != null ? contractEntity.getSettleDate() : null) - System.currentTimeMillis()) / ((long) 1000);
        return z11 && jM66652l > 0 && jM66652l <= ((long) iM36299o);
    }

    /* JADX INFO: renamed from: e */
    public static final int m36289e() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("futures_offline_reminder_time", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27039d.m66651k((Integer) objM20457a, 5);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m36290i(BaseFragment baseFragment, ContractEntity contractEntity, final StorageId storageId, final BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setText(R$id.tvTipsContent, baseFragment.getString(R$string.kumex_offline_trade_dialog_tips, "KuCoin", m36293n(f30505a, contractEntity, false, 1, null), FuturesDisplayNameUtils.f22525a.m24440e(contractEntity)));
        viewHolder.setOnClickListener(R$id.tvIKnow, new View.OnClickListener() { // from class: com.kubi.kumex.trade.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContractsOfflineManager.m36291j(dialogFragmentHelper, storageId, viewHolder, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m36292l(View view, StorageId storageId) {
        if (view != null) {
            ViewExtKt.m66577h(view);
        }
        C46392a.m102328k(storageId, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m36293n(ContractsOfflineManager contractsOfflineManager, ContractEntity contractEntity, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return contractsOfflineManager.m36298m(contractEntity, z11);
    }

    /* JADX INFO: renamed from: f */
    public final void m36294f(@NotNull ViewGroup viewGroup, @NotNull TextView tvOfflineTips, @Nullable ContractEntity contractEntity) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(tvOfflineTips, "tvOfflineTips");
        if (!m36295g(contractEntity)) {
            viewGroup.setPadding(viewGroup.getPaddingStart(), C5275i0.m6236a(6.0f), viewGroup.getPaddingEnd(), viewGroup.getPaddingBottom());
            ViewExtKt.m66577h(tvOfflineTips);
        } else {
            viewGroup.setPadding(viewGroup.getPaddingStart(), 0, viewGroup.getPaddingEnd(), viewGroup.getPaddingBottom());
            ViewExtKt.m66594y(tvOfflineTips);
            tvOfflineTips.setText(tvOfflineTips.getContext().getString(R$string.kumex_offline_time, contractEntity != null ? m36298m(contractEntity, true) : null));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m36296h(@NotNull final BaseFragment fragment, @NotNull final ContractEntity contract) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(contract, "contract");
        if (fragment.isShowing()) {
            C46894j c46894j = C46894j.f104736a;
            StorageId<Boolean> storageIdM103282u = c46894j.m103282u();
            String symbol = contract.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            final StorageId storageIdM103262a0 = c46894j.m103262a0(storageIdM103282u, symbol);
            if (!C46392a.m102322d(storageIdM103262a0, false)) {
                if (m36295g(contract)) {
                    DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bkumex_dialog_offline_tips, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.kumex.trade.d
                        @Override // p852kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ContractsOfflineManager.m36290i(fragment, contract, storageIdM103262a0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                        }
                    });
                    FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    dialogFragmentHelperM54237f4.show(childFragmentManager, "trade_dialog_show_tips_key");
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m36297k(@Nullable final View view, @Nullable TextView textView, @Nullable View view2, @NotNull ContractEntity contract) {
        View view3;
        Context context;
        Intrinsics.checkNotNullParameter(contract, "contract");
        C46894j c46894j = C46894j.f104736a;
        StorageId<Boolean> storageIdM103283v = c46894j.m103283v();
        String symbol = contract.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        final StorageId storageIdM103262a0 = c46894j.m103262a0(storageIdM103283v, symbol);
        if (view2 != null) {
            view3 = view2;
            C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.kumex.trade.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractsOfflineManager.m36292l(view, storageIdM103262a0);
                }
            }, 1, null);
        } else {
            view3 = view2;
        }
        if (C46392a.m102322d(storageIdM103262a0, false) || !m36295g(contract)) {
            if (view != null) {
                ViewExtKt.m66577h(view);
                return;
            }
            return;
        }
        if (view != null) {
            ViewExtKt.m66594y(view);
        }
        if (textView != null) {
            String string = null;
            if (view3 != null && (context = view3.getContext()) != null) {
                string = context.getString(R$string.kumex_offline_trade_tips, "KuCoin", m36293n(this, contract, false, 1, null), FuturesDisplayNameUtils.f22525a.m24440e(contract));
            }
            textView.setText(string);
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m36299o() {
        return ((Number) f30506b.getValue()).intValue();
    }

    /* JADX INFO: renamed from: j */
    public static final void m36291j(DialogFragmentHelper dialogFragmentHelper, StorageId storageId, BaseViewHolder baseViewHolder, View view) {
        dialogFragmentHelper.dismiss();
        C46392a.m102328k(storageId, ((CheckBox) baseViewHolder.getView(R$id.rbNotAgain)).isChecked());
    }

    /* JADX INFO: renamed from: m */
    public final String m36298m(ContractEntity contractEntity, boolean z11) {
        String str;
        Long settleDate;
        int rawOffset = ((TimeZone.getDefault().getRawOffset() / 1000) / 60) / 60;
        StringBuilder sb2 = new StringBuilder();
        if (rawOffset >= 0) {
            str = "+";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(rawOffset);
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        if (contractEntity != null) {
            settleDate = contractEntity.getSettleDate();
        } else {
            settleDate = null;
        }
        sb3.append(C42179a.m92633f(C27039d.m66652l(settleDate), null, z11, false, null, 13, null));
        sb3.append(" (UTC");
        sb3.append(string);
        sb3.append(')');
        return sb3.toString();
    }
}
