package com.kubi.otc.otc.merchant;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.otc.view.EditTextWithTitleView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import p270ft.C37601c;
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

/* JADX INFO: compiled from: OtcAdEditDownFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcAdEditDownFragment;", "Lcom/kubi/otc/otc/merchant/OtcAdPublishFragment;", "<init>", "()V", "initView", "", "isPublish", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcAdEditDownFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcAdEditDownFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdEditDownFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public final class OtcAdEditDownFragment extends OtcAdPublishFragment {

    /* JADX INFO: renamed from: com.kubi.otc.otc.merchant.OtcAdEditDownFragment$a */
    /* JADX INFO: compiled from: OtcAdEditDownFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/merchant/OtcAdEditDownFragment$initView$1$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOtcAdEditDownFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcAdEditDownFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdEditDownFragment$initView$1$3\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,81:1\n48#2,2:82\n*S KotlinDebug\n*F\n+ 1 OtcAdEditDownFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdEditDownFragment$initView$1$3\n*L\n43#1:82,2\n*E\n"})
    public static final class C19958a extends C24223c1 {
        public C19958a() {
            super(OtcAdEditDownFragment.this, false);
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
                if (Intrinsics.areEqual(apiException.code, "600000")) {
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
            Pair pairM90091to = TuplesKt.m90091to("source", "edit");
            OtcAd f37662y = OtcAdEditDownFragment.this.getF37662Y();
            if (f37662y != null) {
                legal = f37662y.getLegal();
            } else {
                legal = null;
            }
            Pair pairM90091to2 = TuplesKt.m90091to("fiat", C27041f.m66668h(legal));
            OtcAd f37662y2 = OtcAdEditDownFragment.this.getF37662Y();
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

    @Override // com.kubi.otc.otc.merchant.OtcAdPublishFragment
    /* JADX INFO: renamed from: W6 */
    public boolean mo44865W6() {
        return false;
    }

    /* JADX INFO: renamed from: U6 */
    public static final void m44857U6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b7 */
    public static final Unit m44862b7(final OtcAdEditDownFragment otcAdEditDownFragment) {
        String legal;
        if (!otcAdEditDownFragment.m44827J4()) {
            return Unit.INSTANCE;
        }
        Observable<R> observableCompose = otcAdEditDownFragment.m44833P4().m83316F(otcAdEditDownFragment.mo44834Q4()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcAdEditDownFragment.m44863c7(this.f37807b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcAdEditDownFragment.m44857U6(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.w1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcAdEditDownFragment.m44864d7(this.f37815b, obj);
            }
        }, otcAdEditDownFragment.new C19958a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = otcAdEditDownFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        Pair pairM90091to = TuplesKt.m90091to("source", "edit");
        OtcAd f37662y = otcAdEditDownFragment.getF37662Y();
        String currency = null;
        if (f37662y != null) {
            legal = f37662y.getLegal();
        } else {
            legal = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("fiat", C27041f.m66668h(legal));
        OtcAd f37662y2 = otcAdEditDownFragment.getF37662Y();
        if (f37662y2 != null) {
            currency = f37662y2.getCurrency();
        }
        C43852m.m96590b("B7P2PPostAdvertisements", "button", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("coin", C27041f.m66668h(currency)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c7 */
    public static final Unit m44863c7(OtcAdEditDownFragment otcAdEditDownFragment, Disposable disposable) {
        otcAdEditDownFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d7 */
    public static final void m44864d7(OtcAdEditDownFragment otcAdEditDownFragment, Object obj) {
        otcAdEditDownFragment.hideDialogLoading();
        ToastCompat.m66437C(R$string.save_success);
        otcAdEditDownFragment.preformBackPressed();
    }

    @Override // com.kubi.otc.otc.merchant.OtcAdPublishFragment, com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    public void initView() {
        OtcAd otcAd;
        OtcSymbol otcSymbol;
        Boolean boolValueOf;
        C37601c c37601cM44829L4;
        EditTextWithTitleView editTextWithTitleView;
        String plainString;
        BigDecimal limitPrice;
        EditTextWithTitleView editTextWithTitleView2;
        String plainString2;
        BigDecimal limitMaxQuote;
        EditTextWithTitleView editTextWithTitleView3;
        String plainString3;
        BigDecimal limitMinQuote;
        FilterEmojiEditText filterEmojiEditText;
        String plainString4;
        BigDecimal currencyQuantity;
        AppCompatEditText appCompatEditText;
        String remarks;
        Object next;
        String currency;
        String currency2;
        Button button;
        Button button2;
        BaseTextView baseTextView;
        super.initView();
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (baseTextView = c37601cM44829L5.f83685b0) != null) {
            baseTextView.setText(getString(R$string.fast_sell_currency_title));
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 != null && (button2 = c37601cM44829L6.f83686c) != null) {
            button2.setText(getString(R$string.otc_ad_confirm_edit));
        }
        C37601c c37601cM44829L7 = m44829L4();
        if (c37601cM44829L7 != null && (button = c37601cM44829L7.f83686c) != null) {
            C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.t1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcAdEditDownFragment.m44862b7(this.f37801b);
                }
            }, 1, null);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            otcAd = (OtcAd) arguments.getParcelable("item");
        } else {
            otcAd = null;
        }
        m44820D6(otcAd);
        ArrayList<OtcSymbol> arrayListM44838X4 = m44838X4();
        if (arrayListM44838X4 != null) {
            Iterator<T> it = arrayListM44838X4.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    currency = ((OtcSymbol) next).getCurrency();
                    OtcAd f37662y = getF37662Y();
                    if (f37662y != null) {
                        currency2 = f37662y.getCurrency();
                    } else {
                        currency2 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(currency, currency2));
            otcSymbol = (OtcSymbol) next;
        } else {
            otcSymbol = null;
        }
        m44821E6(otcSymbol);
        C37601c c37601cM44829L8 = m44829L4();
        if (c37601cM44829L8 != null && (appCompatEditText = c37601cM44829L8.f83690e) != null) {
            OtcAd f37662y2 = getF37662Y();
            if (f37662y2 != null) {
                remarks = f37662y2.getRemarks();
            } else {
                remarks = null;
            }
            appCompatEditText.setText(C27041f.m66668h(remarks));
        }
        C37601c c37601cM44829L9 = m44829L4();
        if (c37601cM44829L9 != null && (filterEmojiEditText = c37601cM44829L9.f83688d) != null) {
            OtcAd f37662y3 = getF37662Y();
            if (f37662y3 != null && (currencyQuantity = f37662y3.getCurrencyQuantity()) != null) {
                plainString4 = currencyQuantity.toPlainString();
            } else {
                plainString4 = null;
            }
            filterEmojiEditText.setText(C27041f.m66668h(plainString4));
        }
        C37601c c37601cM44829L10 = m44829L4();
        if (c37601cM44829L10 != null && (editTextWithTitleView3 = c37601cM44829L10.f83700j) != null) {
            OtcAd f37662y4 = getF37662Y();
            if (f37662y4 != null && (limitMinQuote = f37662y4.getLimitMinQuote()) != null) {
                plainString3 = limitMinQuote.toPlainString();
            } else {
                plainString3 = null;
            }
            editTextWithTitleView3.setContent(C27041f.m66668h(plainString3));
        }
        C37601c c37601cM44829L11 = m44829L4();
        if (c37601cM44829L11 != null && (editTextWithTitleView2 = c37601cM44829L11.f83698i) != null) {
            OtcAd f37662y5 = getF37662Y();
            if (f37662y5 != null && (limitMaxQuote = f37662y5.getLimitMaxQuote()) != null) {
                plainString2 = limitMaxQuote.toPlainString();
            } else {
                plainString2 = null;
            }
            editTextWithTitleView2.setContent(C27041f.m66668h(plainString2));
        }
        OtcAd f37662y6 = getF37662Y();
        if (f37662y6 != null) {
            boolValueOf = Boolean.valueOf(f37662y6.isFloatType());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf) && (c37601cM44829L4 = m44829L4()) != null && (editTextWithTitleView = c37601cM44829L4.f83692f) != null) {
            OtcAd f37662y7 = getF37662Y();
            if (f37662y7 != null && (limitPrice = f37662y7.getLimitPrice()) != null) {
                plainString = limitPrice.toPlainString();
            } else {
                plainString = null;
            }
            editTextWithTitleView.setContent(C27041f.m66668h(plainString));
        }
        m44853q6();
        AbsOtcAdBaseFragment.m44722S4(this, null, 1, null);
    }
}
