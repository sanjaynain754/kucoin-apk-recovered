package ht;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.otc.paytype.PayTypeWayFragment;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.service.IPaymentSiteService;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.P2PTrackData;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27099x;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.C37242d;
import et.InterfaceC37241c;
import f00.C37304a;
import g00.InterfaceC37755g;
import g00.InterfaceC37759k;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lt.C42305j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p402kf.C41016c;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;

/* JADX INFO: renamed from: ht.y */
/* JADX INFO: compiled from: OtcEx.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u0006H\u0007\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u001a\u0016\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016\u001aN\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u00162\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010$\u001a\u0010\u0010'\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040(\u001a\n\u0010)\u001a\u00020\u0004*\u00020\u0004\u001a\f\u0010*\u001a\u00020+*\u0004\u0018\u00010\u0004¨\u0006,"}, m90084d2 = {"getSupportSymbols", "", "Lcom/kubi/sdk/base/ui/IView;", "legal", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Consumer;", "Ljava/util/ArrayList;", "Lcom/kubi/otc/entity/OtcSymbol;", "Lkotlin/collections/ArrayList;", "toWayList", "fragment", "Landroidx/fragment/app/Fragment;", "toOtcBuyOrSell", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "item", "Lcom/kubi/otc/entity/OtcInfoEntity;", "callBack", "Lio/reactivex/functions/Action;", "toPublishOrManage", "Lcom/kubi/sdk/BaseFragment;", "isManage", "", "getPrecisionPrice", "double", "", "precision", "", "checkRegisterGuide", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fromRegister", "alertChooseBuyOrDepiosit", "fm", "trackEvent", "onBuyClick", "Lkotlin/Function0;", "onDepositClick", "onCloseClick", "getDefaultLegal", "", "addColon", "parseBigDecimal", "Ljava/math/BigDecimal;", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcEx.kt\ncom/kubi/otc/otc/OtcExKt\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 6 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,424:1\n160#2,4:425\n1#3:429\n35#4,4:430\n39#4:436\n44#5,2:434\n29#6:437\n*S KotlinDebug\n*F\n+ 1 OtcEx.kt\ncom/kubi/otc/otc/OtcExKt\n*L\n80#1:425,4\n104#1:430,4\n104#1:436\n104#1:434,2\n105#1:437\n*E\n"})
public final class C38346y {

    /* JADX INFO: renamed from: ht.y$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<ArrayList<OtcSymbol>> {
    }

    /* JADX INFO: renamed from: ht.y$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: J */
    public static final void m86499J(Ref.BooleanRef booleanRef, View view) {
        booleanRef.element = true;
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83351d() + "?lang=" + MultiLanguageManager.f46811g.getLocalString(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: O */
    public static final void m86504O(BaseFragment baseFragment, Action action, Object obj) throws Exception {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        action.run();
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m86505P(BaseFragment baseFragment, Throwable th2) {
        BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public static final BigDecimal m86490A(@Nullable String str) {
        return (str == null || str.length() == 0) ? new BigDecimal(BigInteger.ZERO) : DowngradeExKt.m66535e(StringsKt.trim((CharSequence) str).toString(), null, 1, null);
    }

    /* JADX INFO: renamed from: B */
    public static final void m86491B(@NotNull final OldBaseFragment fragment, @NotNull final OtcInfoEntity item, @NotNull Action callBack) throws Exception {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        if (C27039d.m66651k(Integer.valueOf(item.getKycLevel()), -1) >= 1) {
            OtcUserManager otcUserManager = OtcUserManager.f38144a;
            if (!otcUserManager.m45490j().getKyc() || C27039d.m66651k(Integer.valueOf(item.getKycLevel()), -1) > otcUserManager.m45490j().getKycLevel()) {
                IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
                P2PTrackData p2PTrackData = new P2PTrackData(item.getSide());
                p2PTrackData.setFiatCurrency(item.getLegal());
                Unit unit = Unit.INSTANCE;
                track.mo49801g("CHECK_KYC", false, "-10002:CHECK_KYC", p2PTrackData);
                fragment.hideDialogLoading();
                AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54153J4(C27025c.m66566d(Boolean.valueOf(item.needHighKyc())) ? R$string.go_personal_verify_before_trade : R$string.go_info_verify_before_trade).m54159P4(R$string.cancel, null).m54162S4(C27025c.m66566d(Boolean.valueOf(item.needHighKyc())) ? R$string.go_personal_verify : R$string.go_supplement_info, new DialogInterface.OnClickListener() { // from class: ht.g
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        C38346y.m86495F(dialogInterface, i11);
                    }
                }).m54172c5(fragment.getChildFragmentManager());
                return;
            }
        }
        OtcUserManager otcUserManager2 = OtcUserManager.f38144a;
        if (!otcUserManager2.m45490j().isSupportLegal(C27041f.m66668h(item.getLegal()))) {
            fragment.hideDialogLoading();
            ToastCompat.m66441G(fragment.getString(R$string.unable_trade_by_country), new Object[0]);
            IPaymentTrack track2 = IPaymentTrack.f40346a.getTrack();
            P2PTrackData p2PTrackData2 = new P2PTrackData(item.getSide());
            p2PTrackData2.setFiatCurrency(item.getLegal());
            Unit unit2 = Unit.INSTANCE;
            track2.mo49801g("CHECK_FIAT", false, "-10003:CHECK_FIAT", p2PTrackData2);
            return;
        }
        final boolean zIsBuy = item.isBuy();
        if (!zIsBuy) {
            boolean zM66566d = C27025c.m66566d(otcUserManager2.m45490j().getBindTradePassword());
            if (!zM66566d) {
                IPaymentTrack track3 = IPaymentTrack.f40346a.getTrack();
                P2PTrackData p2PTrackData3 = new P2PTrackData(item.getSide());
                p2PTrackData3.setFiatCurrency(item.getLegal());
                Unit unit3 = Unit.INSTANCE;
                track3.mo49801g("CHECK_SELL_PASSWORD_SET", false, "-10009:CHECK_SELL_PASSWORD_SET", p2PTrackData3);
            }
            boolean zM66566d2 = C27025c.m66566d(Boolean.valueOf(otcUserManager2.m45490j().isSupportPayWay(item)));
            if (!zM66566d2) {
                IPaymentTrack track4 = IPaymentTrack.f40346a.getTrack();
                P2PTrackData p2PTrackData4 = new P2PTrackData(item.getSide());
                p2PTrackData4.setFiatCurrency(item.getLegal());
                Unit unit4 = Unit.INSTANCE;
                track4.mo49801g("CHECK_SELL_PAYS", false, "-10010:CHECK_SELL_PAYS", p2PTrackData4);
            }
            if (!zM66566d || !zM66566d2) {
                fragment.hideDialogLoading();
                if (!zIsBuy && !C27025c.m66566d(Boolean.valueOf(otcUserManager2.m45490j().isSupportPayWay(item)))) {
                    AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(fragment.getStringRes(R$string.otc_no_payment_alert, new Object[0])).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: ht.h
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            C38346y.m86492C(fragment, dialogInterface, i11);
                        }
                    }).m54159P4(R$string.cancel, null).m54172c5(fragment.getChildFragmentManager());
                    return;
                }
                AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(fragment.getString(R$string.rule_limit)).m54156M4(fragment.getString(R$string.otc_deal_tips)).m54148E4(R$layout.botc_view_otc_received_way_error, new DialogFragmentHelper.InterfaceC22882b() { // from class: ht.i
                    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                    /* JADX INFO: renamed from: b3 */
                    public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                        C38346y.m86493D(zIsBuy, baseViewHolder, dialogFragmentHelper);
                    }
                }).m54160Q4(fragment.getString(R$string.cancel), null).m54163T4(fragment.getString(R$string.go_set), new DialogInterface.OnClickListener() { // from class: ht.j
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        C38346y.m86494E(zIsBuy, item, fragment, dialogInterface, i11);
                    }
                });
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                alertDialogFragmentHelperM54163T4.show(childFragmentManager, "buyOrSellDialog");
                return;
            }
        }
        callBack.run();
    }

    /* JADX INFO: renamed from: D */
    public static final void m86493D(boolean z11, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        boolean z12 = false;
        BaseViewHolder gone = helper.setGone(R$id.tv_error_one, false);
        int i11 = R$id.tv_error_two;
        OtcUserManager otcUserManager = OtcUserManager.f38144a;
        BaseViewHolder gone2 = gone.setGone(i11, (C27025c.m66566d(otcUserManager.m45490j().getBindTradePassword()) || z11) ? false : true).setText(i11, R$string.withdraw_pwd).setGone(R$id.tv_error_three, false);
        int i12 = R$id.tv_error_four;
        List<String> supportPayWay = otcUserManager.m45490j().getSupportPayWay();
        if ((supportPayWay == null || supportPayWay.isEmpty()) && !z11) {
            z12 = true;
        }
        gone2.setGone(i12, z12).setText(i12, R$string.set_curency_receivce_account);
    }

    /* JADX INFO: renamed from: E */
    public static final void m86494E(boolean z11, OtcInfoEntity otcInfoEntity, OldBaseFragment oldBaseFragment, DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        OtcUserManager otcUserManager = OtcUserManager.f38144a;
        if (!C27025c.m66566d(otcUserManager.m45490j().getBindTradePassword()) && !z11) {
            InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
        } else {
            if (C27025c.m66566d(Boolean.valueOf(otcUserManager.m45490j().isSupportPayWay(otcInfoEntity))) || z11) {
                return;
            }
            m86509T(oldBaseFragment);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m86495F(DialogInterface dialogInterface, int i11) {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: G */
    public static final void m86496G(@NotNull final BaseFragment fragment, final boolean z11, @NotNull final Action callBack) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        OtcDepend.m45451d(OtcDepend.f38138a, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: ht.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38346y.m86497H(callBack, z11, fragment);
            }
        }), 1, null);
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m86497H(final Action action, boolean z11, final BaseFragment baseFragment) throws Exception {
        OtcUserManager otcUserManager = OtcUserManager.f38144a;
        if (C27025c.m66566d(otcUserManager.m45490j().getBindPhone()) && C27025c.m66566d(otcUserManager.m45490j().getBindTradePassword()) && otcUserManager.m45490j().isHighKycLevel() && !otcUserManager.m45490j().getSupportPayWay().isEmpty()) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            boolean zM66566d = C27025c.m66566d(otcUserManager.m45490j().getSignedPact());
            booleanRef2.element = zM66566d;
            if (zM66566d) {
                action.run();
            } else {
                AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.rule_limit).m54153J4(R$string.merchant_limit_desc).m54148E4(R$layout.botc_view_merchant_precondition, new DialogFragmentHelper.InterfaceC22882b() { // from class: ht.u
                    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                    /* JADX INFO: renamed from: b3 */
                    public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                        C38346y.m86498I(baseFragment, booleanRef, booleanRef2, baseViewHolder, dialogFragmentHelper);
                    }
                }).m54159P4(R$string.cancel, null).m54162S4(z11 ? R$string.advertise_manage : R$string.start_to_publish, new DialogInterface.OnClickListener() { // from class: ht.v
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        C38346y.m86501L(baseFragment, action, dialogInterface, i11);
                    }
                });
                FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                alertDialogFragmentHelperM54162S4.show(childFragmentManager, "publishOrManageDialog");
            }
        } else {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S5 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.rule_limit).m54153J4(R$string.merchant_limit_desc).m54148E4(R$layout.botc_view_otc_received_way_error, new DialogFragmentHelper.InterfaceC22882b() { // from class: ht.w
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    C38346y.m86507R(baseViewHolder, dialogFragmentHelper);
                }
            }).m54159P4(R$string.cancel, null).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: ht.x
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C38346y.m86508S(baseFragment, dialogInterface, i11);
                }
            });
            FragmentManager childFragmentManager2 = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54162S5.show(childFragmentManager2, "publishOrManageDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final void m86498I(BaseFragment baseFragment, final Ref.BooleanRef booleanRef, final Ref.BooleanRef booleanRef2, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        final TextView textView = (TextView) helper.getView(R$id.tv_right_btn);
        textView.setEnabled(false);
        final AlignTopTextView alignTopTextView = (AlignTopTextView) helper.getView(R$id.tv_agree);
        String string = baseFragment.getString(R$string.login_read_agree);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string + baseFragment.getString(R$string.otc_protocol));
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: ht.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C38346y.m86499J(booleanRef, view);
            }
        }), string.length(), spannableString.length(), 17);
        alignTopTextView.setMovementMethod(LinkMovementMethod.getInstance());
        alignTopTextView.setText(spannableString);
        Intrinsics.checkNotNull(alignTopTextView);
        C27046k.m66679B(alignTopTextView, new Function0() { // from class: ht.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38346y.m86500K(booleanRef, booleanRef2, alignTopTextView, textView);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m86500K(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, AlignTopTextView alignTopTextView, TextView textView) {
        if (!booleanRef.element) {
            ToastCompat.m66437C(R$string.otc_protocol_toast);
            return Unit.INSTANCE;
        }
        boolean z11 = !booleanRef2.element;
        booleanRef2.element = z11;
        alignTopTextView.setSelected(z11);
        textView.setEnabled(booleanRef2.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final void m86501L(final BaseFragment baseFragment, final Action action, DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        Observable<R> observableCompose = ((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class)).m83345x().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: ht.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38346y.m86502M(baseFragment, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: ht.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38346y.m86503N(function1, obj);
            }
        });
        Consumer consumer = new Consumer() { // from class: ht.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C38346y.m86504O(baseFragment, action, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ht.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38346y.m86505P(baseFragment, (Throwable) obj);
            }
        };
        observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: ht.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38346y.m86506Q(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static final void m86507R(BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        int i11 = R$id.tv_error_one;
        OtcUserManager otcUserManager = OtcUserManager.f38144a;
        BaseViewHolder text = helper.setGone(i11, !C27025c.m66566d(otcUserManager.m45490j().getBindPhone())).setText(i11, R$string.bind_phone);
        int i12 = R$id.tv_error_two;
        BaseViewHolder text2 = text.setGone(i12, !C27025c.m66566d(otcUserManager.m45490j().getBindTradePassword())).setText(i12, R$string.open_trade_pwd);
        int i13 = R$id.tv_error_three;
        BaseViewHolder text3 = text2.setGone(i13, !otcUserManager.m45490j().isHighKycLevel()).setText(i13, R$string.complete_kyc);
        int i14 = R$id.tv_error_four;
        text3.setGone(i14, otcUserManager.m45490j().getSupportPayWay().isEmpty()).setText(i14, R$string.complete_receive_way);
    }

    /* JADX INFO: renamed from: S */
    public static final void m86508S(BaseFragment baseFragment, DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        OtcUserManager otcUserManager = OtcUserManager.f38144a;
        if (!C27025c.m66566d(otcUserManager.m45490j().getBindPhone())) {
            Context context = baseFragment.getContext();
            if (context != null) {
                OtcDepend.f38138a.m45470t().m56316j(context);
                return;
            }
            return;
        }
        if (!C27025c.m66566d(otcUserManager.m45490j().getBindTradePassword())) {
            InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
        } else if (!otcUserManager.m45490j().isHighKycLevel()) {
            InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        } else if (otcUserManager.m45490j().getSupportPayWay().isEmpty()) {
            m86509T(baseFragment);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final void m86509T(@NotNull final Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        OtcDepend.m45451d(OtcDepend.f38138a, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: ht.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38346y.m86510U(fragment);
            }
        }), 1, null);
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m86510U(final Fragment fragment) {
        OtcUserManager.f38144a.m45491k(new Action() { // from class: ht.q
            @Override // io.reactivex.functions.Action
            public final void run() {
                C38346y.m86511V(fragment);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final void m86511V(Fragment fragment) {
        Object objM20457a;
        if (!C27025c.m66566d(OtcUserManager.f38144a.m45490j().getBindTradePassword())) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(fragment.getString(R$string.rule_limit)).m54156M4(fragment.getString(R$string.bind_received_condition)).m54148E4(R$layout.botc_view_otc_received_way_error, new DialogFragmentHelper.InterfaceC22882b() { // from class: ht.r
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    C38346y.m86512W(baseViewHolder, dialogFragmentHelper);
                }
            }).m54146C4(R$drawable.ic2_close_withcircle_24).m54161R4(0).m54160Q4(fragment.getString(R$string.cancel), null).m54163T4(fragment.getString(R$string.go_set), new DialogInterface.OnClickListener() { // from class: ht.s
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C38346y.m86513X(dialogInterface, i11);
                }
            });
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54163T4.show(childFragmentManager, "otcDialog");
            return;
        }
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_p2p_rn", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (C27025c.m66566d((Boolean) objM20457a)) {
            C42305j.m92852a(new C4400a(Uri.parse("kucoin://krn/router"), null, 2, null), "otc/user/payments");
        } else {
            BaseFragmentActivity.m56573m0(fragment.getContext(), fragment.getString(R$string.payment_p2p_menu_payment), PayTypeWayFragment.class.getName());
        }
    }

    /* JADX INFO: renamed from: W */
    public static final void m86512W(BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        BaseViewHolder gone = helper.setGone(R$id.tv_error_one, false);
        int i11 = R$id.tv_error_two;
        gone.setGone(i11, !C27025c.m66566d(OtcUserManager.f38144a.m45490j().getBindTradePassword())).setText(i11, R$string.withdraw_pwd).setGone(R$id.tv_error_three, false);
    }

    /* JADX INFO: renamed from: X */
    public static final void m86513X(DialogInterface dialogInterface, int i11) {
        Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
        if (C27025c.m66566d(OtcUserManager.f38144a.m45490j().getBindTradePassword())) {
            return;
        }
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m86535v(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(MultiLanguageManager.m56979h() ? "：" : C33844oi.f71346o);
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m86536w(@NotNull List<String> list) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((String) next, C41016c.m89965c()));
        String str = (String) next;
        if (str != null) {
            return str;
        }
        for (Object obj2 : list) {
            if (Intrinsics.areEqual((String) obj2, IPaymentSiteService.Companion.EUR)) {
                obj = obj2;
                break;
            }
        }
        String str2 = (String) obj;
        return str2 == null ? C27041f.m66668h((String) CollectionsKt.firstOrNull((List) list)) : str2;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public static final String m86537x(double d11, int i11) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        numberFormat.setGroupingUsed(false);
        numberFormat.setMaximumFractionDigits(i11);
        String str = numberFormat.format(new BigDecimal(String.valueOf(d11)));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: y */
    public static final void m86538y(@NotNull InterfaceC23686g interfaceC23686g, @NotNull final String legal, @NotNull final Consumer<ArrayList<OtcSymbol>> action) throws Exception {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(interfaceC23686g, "<this>");
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(action, "action");
        String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49848z(legal), "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (!TextUtils.isEmpty(strM102326h)) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM102326h, new a().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            ArrayList<OtcSymbol> arrayList = (ArrayList) objM66914d;
            if (arrayList != null && !arrayList.isEmpty()) {
                action.accept(arrayList);
                booleanRef.element = true;
            }
        }
        Disposable disposableSubscribe = ((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class)).m83332j(legal).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: ht.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C38346y.m86539z(booleanRef, action, legal, (ArrayList) obj);
            }
        }, new C24223c1(interfaceC23686g));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = interfaceC23686g.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: z */
    public static final void m86539z(Ref.BooleanRef booleanRef, Consumer consumer, String str, ArrayList arrayList) throws Exception {
        if (!booleanRef.element) {
            consumer.accept(arrayList);
        }
        C46392a.m102333p(PaymentStorageId.f40364a.m49848z(str), C27099x.m66919i(arrayList, false, 2, null));
    }

    /* JADX INFO: renamed from: C */
    public static final void m86492C(OldBaseFragment oldBaseFragment, DialogInterface dialogInterface, int i11) {
        m86509T(oldBaseFragment);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m86502M(BaseFragment baseFragment, Disposable disposable) {
        baseFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final void m86503N(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m86506Q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
