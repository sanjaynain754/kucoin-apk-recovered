package com.kubi.assets.dialog;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.WithdrawHintInfoEntity;
import com.kubi.assets.finance.EarnUrlConfig;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.redpackage.api.IRedPackageService;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import gf.C37885i;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: AssetHelperDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\fH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/dialog/AssetHelperDialog;", "", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "getKcsFeeRebateDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/assets/entity/WithdrawHintInfoEntity;", "getKcsReturnStatusTipDialog", "getSendRedPacketDialog", "(Landroidx/fragment/app/FragmentManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumpToRedPacket", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetHelperDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetHelperDialog.kt\ncom/kubi/assets/dialog/AssetHelperDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class AssetHelperDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetHelperDialog f16924a = new AssetHelperDialog();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f16925b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetHelperDialog.m15970i();
        }
    });

    /* JADX INFO: renamed from: l */
    public static final Unit m15971l(final WithdrawHintInfoEntity withdrawHintInfoEntity, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        BigDecimal returnLimitation;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tvContent;
        String hintText = withdrawHintInfoEntity != null ? withdrawHintInfoEntity.getHintText() : null;
        C27017c c27017c = C27017c.f54310a;
        BaseViewHolder text = viewHolder.setText(i11, C27041f.m66669i(hintText, c27017c.m66516f(R$string.kc_asset_kcs_return_tip, new Object[0])));
        int i12 = R$id.tvReturnNumber;
        int i13 = R$string.kc_asset_kcs_return_max_amount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((withdrawHintInfoEntity == null || (returnLimitation = withdrawHintInfoEntity.getReturnLimitation()) == null) ? null : C37885i.m85563b(returnLimitation, C38184b.f85884a.m86146a(), 0, 2, null));
        sb2.append(' ');
        sb2.append(C27041f.m66669i(withdrawHintInfoEntity != null ? withdrawHintInfoEntity.getReturnLimitationCurrency() : null, C38184b.f85884a.m86146a()));
        BaseViewHolder gone = text.setText(i12, c27017c.m66516f(i13, sb2.toString())).setGone(i12, (withdrawHintInfoEntity != null ? withdrawHintInfoEntity.getReturnLimitation() : null) != null);
        int i14 = R$id.tvViewMore;
        gone.setGone(i14, (withdrawHintInfoEntity != null ? withdrawHintInfoEntity.getAppDetailLink() : null) != null).setOnClickListener(R$id.tvConfirm, new View.OnClickListener() { // from class: com.kubi.assets.dialog.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AssetHelperDialog.m15972m(dialogFragmentHelper, view);
            }
        }).setOnClickListener(i14, new View.OnClickListener() { // from class: com.kubi.assets.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AssetHelperDialog.m15973n(dialogFragmentHelper, withdrawHintInfoEntity, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m15974p(BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setText(R$id.tvContent, R$string.asset_return_tip1).setOnClickListener(R$id.tvConfirm, new View.OnClickListener() { // from class: com.kubi.assets.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AssetHelperDialog.m15975q(dialogFragmentHelper, view);
            }
        }).setOnClickListener(R$id.tvViewMore, new View.OnClickListener() { // from class: com.kubi.assets.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AssetHelperDialog.m15976r(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m15977t(DialogInterface dialogInterface, int i11) {
        f16924a.m15982u();
    }

    /* JADX INFO: renamed from: j */
    public final AssetV2Api m15978j() {
        return (AssetV2Api) f16925b.getValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m15979k(@NotNull FragmentManager childFragmentManager, @Nullable final WithdrawHintInfoEntity withdrawHintInfoEntity) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.asset_dialog_kcs_fee_rebate, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.assets.dialog.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AssetHelperDialog.m15971l(withdrawHintInfoEntity, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(childFragmentManager, "getKcsFeeRebateDialog");
    }

    /* JADX INFO: renamed from: o */
    public final void m15980o(@NotNull FragmentManager childFragmentManager) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.asset_dialog_kcs_return_status, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.assets.dialog.d
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AssetHelperDialog.m15974p((BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(childFragmentManager, "getKcsFeeRebateDialog");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m15981s(@NotNull FragmentManager fragmentManager, @NotNull Continuation<? super Unit> continuation) {
        AssetHelperDialog$getSendRedPacketDialog$1 assetHelperDialog$getSendRedPacketDialog$1;
        if (continuation instanceof AssetHelperDialog$getSendRedPacketDialog$1) {
            assetHelperDialog$getSendRedPacketDialog$1 = (AssetHelperDialog$getSendRedPacketDialog$1) continuation;
            int i11 = assetHelperDialog$getSendRedPacketDialog$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetHelperDialog$getSendRedPacketDialog$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetHelperDialog$getSendRedPacketDialog$1 = new AssetHelperDialog$getSendRedPacketDialog$1(this, continuation);
            }
        } else {
            assetHelperDialog$getSendRedPacketDialog$1 = new AssetHelperDialog$getSendRedPacketDialog$1(this, continuation);
        }
        Object objM42830k = assetHelperDialog$getSendRedPacketDialog$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetHelperDialog$getSendRedPacketDialog$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42830k);
            InterfaceC41634e<String> interfaceC41634eM17141k = m15978j().m17141k();
            assetHelperDialog$getSendRedPacketDialog$1.L$0 = fragmentManager;
            assetHelperDialog$getSendRedPacketDialog$1.label = 1;
            objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM17141k, assetHelperDialog$getSendRedPacketDialog$1);
            if (objM42830k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fragmentManager = (FragmentManager) assetHelperDialog$getSendRedPacketDialog$1.L$0;
            ResultKt.throwOnFailure(objM42830k);
        }
        String str = (String) objM42830k;
        if (str != null) {
            if (DowngradeExKt.m66535e(str, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.asset_redpacket_tip_title);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format(C27017c.f54310a.m66516f(R$string.asset_redpacket_tip_content, new Object[0]), Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                alertDialogFragmentHelperM54167X4.m54156M4(str2).m54162S4(R$string.asset_redpacket_tip_continue, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.dialog.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i13) {
                        AssetHelperDialog.m15977t(dialogInterface, i13);
                    }
                }).show(fragmentManager, "AssetHelperDialog");
            } else {
                f16924a.m15982u();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public final void m15982u() {
        IRedPackageService.f43051a.get().mo53745c();
    }

    /* JADX INFO: renamed from: i */
    public static final AssetV2Api m15970i() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: m */
    public static final void m15972m(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: n */
    public static final void m15973n(DialogFragmentHelper dialogFragmentHelper, WithdrawHintInfoEntity withdrawHintInfoEntity, View view) {
        String appDetailLink;
        dialogFragmentHelper.dismissAllowingStateLoss();
        if (withdrawHintInfoEntity != null && (appDetailLink = withdrawHintInfoEntity.getAppDetailLink()) != null) {
            if (appDetailLink.length() == 0) {
                appDetailLink = null;
            }
            if (appDetailLink != null) {
                Router.f46192a.m56184f(appDetailLink).m4048k();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m15975q(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: r */
    public static final void m15976r(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        Router.f46192a.m56184f(EarnUrlConfig.f17409a.m16752b() + "?category=KCS_STAKING&currency=KCS&biz_type=LOCK&appNeedLang=true&isBanner=1&needLogin=true&loading=2").m4048k();
    }
}
