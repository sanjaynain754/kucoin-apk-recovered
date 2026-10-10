package com.kubi.otc.otc.merchant;

import android.text.Editable;
import android.widget.Button;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37758j;
import ht.C38346y;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p270ft.C37601c;
import p402kf.C41014a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: OtcAdPublishFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J$\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;", "Lcom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment;", "<init>", "()V", "initView", "", "getParams", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "checkInputValid", "checkValid", "", "onChangeSide", "isPublish", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class OtcAdPublishFragment extends AbsOtcAdBaseFragment {

    /* JADX INFO: renamed from: com.kubi.otc.otc.merchant.OtcAdPublishFragment$a */
    /* JADX INFO: compiled from: OtcAdPublishFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/merchant/OtcAdPublishFragment$initView$1$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOtcAdPublishFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcAdPublishFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdPublishFragment$initView$1$3\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,143:1\n48#2,2:144\n*S KotlinDebug\n*F\n+ 1 OtcAdPublishFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdPublishFragment$initView$1$3\n*L\n70#1:144,2\n*E\n"})
    public static final class C19960a extends C24223c1 {
        public C19960a() {
            super(OtcAdPublishFragment.this, false);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            String message;
            String legal;
            String currency;
            super.accept(th2);
            String message2 = null;
            if (th2 instanceof ApiException) {
                ApiException apiException = (ApiException) th2;
                String str = apiException.code;
                if (Intrinsics.areEqual(str, "618203")) {
                    AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.payment_edit_ad_risk_refused).m54162S4(R$string.i_already_know, null).m54172c5(OtcAdPublishFragment.this.getChildFragmentManager());
                } else if (Intrinsics.areEqual(str, "600000")) {
                    C43846g.m96568c(new OtcMessage("error 600000", "payment_p2p", false, 4, null), null, 2, null);
                } else {
                    ToastCompat.m66441G(apiException.getMessage(), new Object[0]);
                }
            } else {
                if (th2 != null) {
                    message = th2.getMessage();
                } else {
                    message = null;
                }
                ToastCompat.m66441G(message, new Object[0]);
            }
            Pair pairM90091to = TuplesKt.m90091to("source", "publish");
            OtcAd f37662y = OtcAdPublishFragment.this.getF37662Y();
            if (f37662y != null) {
                legal = f37662y.getLegal();
            } else {
                legal = null;
            }
            Pair pairM90091to2 = TuplesKt.m90091to("fiat", C27041f.m66668h(legal));
            OtcAd f37662y2 = OtcAdPublishFragment.this.getF37662Y();
            if (f37662y2 != null) {
                currency = f37662y2.getCurrency();
            } else {
                currency = null;
            }
            Pair pairM90091to3 = TuplesKt.m90091to("coin", C27041f.m66668h(currency));
            if (th2 != null) {
                message2 = th2.getMessage();
            }
            C43852m.m96590b("B7P2PPostAdvertisements", "button", "1", pairM90091to, pairM90091to2, pairM90091to3, TuplesKt.m90091to("message", C27041f.m66668h(message2)));
        }
    }

    /* JADX INFO: renamed from: W6 */
    public boolean mo44865W6() {
        return true;
    }

    /* JADX INFO: renamed from: S6 */
    public static final Unit m44880S6(final OtcAdPublishFragment otcAdPublishFragment) {
        String legal;
        if (!otcAdPublishFragment.m44827J4()) {
            return Unit.INSTANCE;
        }
        Observable<R> observableCompose = otcAdPublishFragment.m44833P4().m83314D(otcAdPublishFragment.mo44834Q4()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.c2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcAdPublishFragment.m44881T6(this.f37716b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.d2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcAdPublishFragment.m44882U6(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.e2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcAdPublishFragment.m44883V6(this.f37724b, obj);
            }
        }, otcAdPublishFragment.new C19960a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = otcAdPublishFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        Pair pairM90091to = TuplesKt.m90091to("source", "publish");
        OtcAd f37662y = otcAdPublishFragment.getF37662Y();
        String currency = null;
        if (f37662y != null) {
            legal = f37662y.getLegal();
        } else {
            legal = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("fiat", C27041f.m66668h(legal));
        OtcAd f37662y2 = otcAdPublishFragment.getF37662Y();
        if (f37662y2 != null) {
            currency = f37662y2.getCurrency();
        }
        C43852m.m96590b("B7P2PPostAdvertisements", "button", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("coin", C27041f.m66668h(currency)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T6 */
    public static final Unit m44881T6(OtcAdPublishFragment otcAdPublishFragment, Disposable disposable) {
        otcAdPublishFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U6 */
    public static final void m44882U6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V6 */
    public static final void m44883V6(OtcAdPublishFragment otcAdPublishFragment, Object obj) {
        otcAdPublishFragment.hideDialogLoading();
        ToastCompat.m66437C(R$string.save_success);
        InterfaceC37758j.a.m85166o(C37304a.f82764a, 1L, otcAdPublishFragment.getString(R$string.advertise_manage), null, null, null, 28, null);
        otcAdPublishFragment.preformBackPressed();
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    /* JADX INFO: renamed from: G4 */
    public void mo44824G4() {
        Editable text;
        FilterEmojiEditText filterEmojiEditText;
        super.mo44824G4();
        OtcAd f37662y = getF37662Y();
        if (f37662y != null) {
            C37601c c37601cM44829L4 = m44829L4();
            if (c37601cM44829L4 != null && (filterEmojiEditText = c37601cM44829L4.f83688d) != null) {
                text = filterEmojiEditText.getText();
            } else {
                text = null;
            }
            f37662y.setCurrencyQuantity(C38346y.m86490A(String.valueOf(text)));
        }
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    /* JADX INFO: renamed from: K4 */
    public boolean mo44828K4() {
        Editable text;
        FilterEmojiEditText filterEmojiEditText;
        if (super.mo44828K4()) {
            C37601c c37601cM44829L4 = m44829L4();
            if (c37601cM44829L4 != null && (filterEmojiEditText = c37601cM44829L4.f83688d) != null) {
                text = filterEmojiEditText.getText();
            } else {
                text = null;
            }
            if (C38346y.m86490A(String.valueOf(text)).compareTo(new BigDecimal(BigInteger.ZERO)) > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public HashMap<String, Object> mo44834Q4() {
        String side;
        String currency;
        String legal;
        BigDecimal currencyQuantity;
        HashMap<String, Object> mapMo44834Q4 = super.mo44834Q4();
        OtcAd f37662y = getF37662Y();
        if (f37662y != null) {
            side = f37662y.getSide();
        } else {
            side = null;
        }
        mapMo44834Q4.put("side", C27041f.m66668h(side));
        OtcAd f37662y2 = getF37662Y();
        if (f37662y2 != null) {
            currency = f37662y2.getCurrency();
        } else {
            currency = null;
        }
        mapMo44834Q4.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(currency));
        OtcAd f37662y3 = getF37662Y();
        if (f37662y3 != null) {
            legal = f37662y3.getLegal();
        } else {
            legal = null;
        }
        mapMo44834Q4.put("legal", C27041f.m66668h(legal));
        OtcAd f37662y4 = getF37662Y();
        if (f37662y4 != null) {
            currencyQuantity = f37662y4.getCurrencyQuantity();
        } else {
            currencyQuantity = null;
        }
        mapMo44834Q4.put("currencyQuantity", C41014a.m89922G(currencyQuantity, null, 1, null));
        return mapMo44834Q4;
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    public void initView() {
        OtcSymbol otcSymbol;
        BaseTextView baseTextView;
        String currency;
        Button button;
        Button button2;
        BaseTextView baseTextView2;
        if (mo44865W6()) {
            C37601c c37601cM44829L4 = m44829L4();
            if (c37601cM44829L4 != null && (baseTextView2 = c37601cM44829L4.f83685b0) != null) {
                baseTextView2.setText(getString(R$string.trade_limit));
            }
            C37601c c37601cM44829L5 = m44829L4();
            if (c37601cM44829L5 != null && (button2 = c37601cM44829L5.f83686c) != null) {
                button2.setText(getString(R$string.otc_ad_confirm_publish));
            }
            C37601c c37601cM44829L6 = m44829L4();
            if (c37601cM44829L6 != null && (button = c37601cM44829L6.f83686c) != null) {
                C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.b2
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtcAdPublishFragment.m44880S6(this.f37710b);
                    }
                }, 1, null);
            }
            m44820D6(new OtcAd());
            OtcAd f37662y = getF37662Y();
            if (f37662y != null) {
                f37662y.setSide("BUY");
            }
            OtcAd f37662y2 = getF37662Y();
            if (f37662y2 != null) {
                f37662y2.setNeedKyc(OtcAd.KYC_NO);
            }
            OtcAd f37662y3 = getF37662Y();
            if (f37662y3 != null) {
                f37662y3.setKycLevel(OtcAd.KYC_NOT_PASS);
            }
            OtcAd f37662y4 = getF37662Y();
            if (f37662y4 != null) {
                f37662y4.setAdTarget("1");
            }
            OtcAd f37662y5 = getF37662Y();
            if (f37662y5 != null) {
                f37662y5.setTradeTimeLimit("30");
            }
            OtcAd f37662y6 = getF37662Y();
            if (f37662y6 != null) {
                f37662y6.setOnlineType("0");
            }
            OtcAd f37662y7 = getF37662Y();
            if (f37662y7 != null) {
                f37662y7.setOnlineTimeZone(C46392a.m102326h(PaymentStorageId.f40364a.m49838p(), ""));
            }
            OtcAd f37662y8 = getF37662Y();
            if (f37662y8 != null) {
                f37662y8.setLegalTradeTimesLimitType("none");
            }
            ArrayList<OtcSymbol> arrayListM44838X4 = m44838X4();
            String str = null;
            if (arrayListM44838X4 != null) {
                otcSymbol = arrayListM44838X4.get(0);
            } else {
                otcSymbol = null;
            }
            m44821E6(otcSymbol);
            OtcAd f37662y9 = getF37662Y();
            if (f37662y9 != null) {
                OtcSymbol f37663z = getF37663Z();
                if (f37663z != null) {
                    currency = f37663z.getCurrency();
                } else {
                    currency = null;
                }
                f37662y9.setCurrency(currency);
            }
            OtcAd f37662y10 = getF37662Y();
            if (f37662y10 != null) {
                ArrayList<String> arrayListM44830M4 = m44830M4();
                if (arrayListM44830M4 != null) {
                    str = arrayListM44830M4.get(0);
                }
                f37662y10.setLegal(str);
            }
            OtcAd f37662y11 = getF37662Y();
            if (f37662y11 != null) {
                f37662y11.setPriceType("REGULAR");
            }
            m44818A6();
            C37601c c37601cM44829L7 = m44829L4();
            if (c37601cM44829L7 != null && (baseTextView = c37601cM44829L7.f83720t) != null) {
                baseTextView.setText(getStringRes(R$string.payment_p2p_select_pay_type, new Object[0]));
            }
        }
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    /* JADX INFO: renamed from: r6 */
    public void mo44854r6() {
        BaseTextView baseTextView;
        Boolean boolValueOf;
        int i11;
        super.mo44854r6();
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83656A) != null) {
            OtcAd f37662y = getF37662Y();
            if (f37662y != null) {
                boolValueOf = Boolean.valueOf(f37662y.isBuy());
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                i11 = R$string.total_buy;
            } else {
                i11 = R$string.total_sell;
            }
            baseTextView.setText(getString(i11));
        }
    }
}
