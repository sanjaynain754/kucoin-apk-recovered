package com.kubi.otc.otc.merchant;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.view.EditTextWithTitleView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import ht.C38346y;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37601c;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OtcAdEditUpFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0002J$\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcAdEditUpFragment;", "Lcom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment;", "<init>", "()V", "hasNewUserTag", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "handleNewUserTagUI", "getParams", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "checkInputValid", "updateTotalAmount", "onChangeSide", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcAdEditUpFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcAdEditUpFragment.kt\ncom/kubi/otc/otc/merchant/OtcAdEditUpFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"})
public final class OtcAdEditUpFragment extends AbsOtcAdBaseFragment {

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public static final Companion f37681t0 = new Companion(null);

    /* JADX INFO: renamed from: s0 */
    public boolean f37682s0;

    /* JADX INFO: compiled from: OtcAdEditUpFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/OtcAdEditUpFragment$Companion;", "", "<init>", "()V", "HAS_NEW_USER_TAG", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.merchant.OtcAdEditUpFragment$a */
    /* JADX INFO: compiled from: OtcAdEditUpFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/merchant/OtcAdEditUpFragment$initView$2$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19959a extends C24223c1 {
        public C19959a() {
            super(OtcAdEditUpFragment.this, false);
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
                if (Intrinsics.areEqual(apiException.code, "618203")) {
                    AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.payment_edit_ad_risk_refused).m54162S4(R$string.i_already_know, null).m54172c5(OtcAdEditUpFragment.this.getChildFragmentManager());
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
            OtcAd f37662y = OtcAdEditUpFragment.this.getF37662Y();
            if (f37662y != null) {
                legal = f37662y.getLegal();
            } else {
                legal = null;
            }
            Pair pairM90091to2 = TuplesKt.m90091to("fiat", C27041f.m66668h(legal));
            OtcAd f37662y2 = OtcAdEditUpFragment.this.getF37662Y();
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

    /* JADX INFO: renamed from: S6 */
    public final void m44874S6() {
        View view;
        AppCompatEditText appCompatEditText;
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        ConstraintLayout constraintLayout3;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        FilterEmojiEditText filterEmojiEditText;
        ConstraintLayout constraintLayout4;
        if (this.f37682s0) {
            C37601c c37601cM44829L4 = m44829L4();
            if (c37601cM44829L4 != null && (constraintLayout4 = c37601cM44829L4.f83729x0) != null) {
                constraintLayout4.setAlpha(0.3f);
            }
            C37601c c37601cM44829L5 = m44829L4();
            if (c37601cM44829L5 != null && (filterEmojiEditText = c37601cM44829L5.f83688d) != null) {
                filterEmojiEditText.setEnabled(false);
            }
            C37601c c37601cM44829L6 = m44829L4();
            if (c37601cM44829L6 != null && (editTextWithTitleView2 = c37601cM44829L6.f83698i) != null) {
                editTextWithTitleView2.setEnabled(false);
            }
            C37601c c37601cM44829L7 = m44829L4();
            if (c37601cM44829L7 != null && (editTextWithTitleView = c37601cM44829L7.f83700j) != null) {
                editTextWithTitleView.setEnabled(false);
            }
            C37601c c37601cM44829L8 = m44829L4();
            if (c37601cM44829L8 != null && (relativeLayout2 = c37601cM44829L8.f83722u) != null) {
                relativeLayout2.setAlpha(0.3f);
            }
            C37601c c37601cM44829L9 = m44829L4();
            if (c37601cM44829L9 != null && (relativeLayout = c37601cM44829L9.f83722u) != null) {
                relativeLayout.setEnabled(false);
            }
            C37601c c37601cM44829L10 = m44829L4();
            if (c37601cM44829L10 != null && (constraintLayout3 = c37601cM44829L10.f83731y0) != null) {
                constraintLayout3.setAlpha(0.3f);
            }
            C37601c c37601cM44829L11 = m44829L4();
            if (c37601cM44829L11 != null && (baseTextView7 = c37601cM44829L11.f83689d0) != null) {
                baseTextView7.setEnabled(false);
            }
            C37601c c37601cM44829L12 = m44829L4();
            if (c37601cM44829L12 != null && (baseTextView6 = c37601cM44829L12.f83687c0) != null) {
                baseTextView6.setEnabled(false);
            }
            C37601c c37601cM44829L13 = m44829L4();
            if (c37601cM44829L13 != null && (constraintLayout2 = c37601cM44829L13.f83717r0) != null) {
                constraintLayout2.setAlpha(0.3f);
            }
            C37601c c37601cM44829L14 = m44829L4();
            if (c37601cM44829L14 != null && (baseTextView5 = c37601cM44829L14.f83669N) != null) {
                baseTextView5.setEnabled(false);
            }
            C37601c c37601cM44829L15 = m44829L4();
            if (c37601cM44829L15 != null && (baseTextView4 = c37601cM44829L15.f83668M) != null) {
                baseTextView4.setEnabled(false);
            }
            C37601c c37601cM44829L16 = m44829L4();
            if (c37601cM44829L16 != null && (constraintLayout = c37601cM44829L16.f83733z0) != null) {
                constraintLayout.setAlpha(0.3f);
            }
            C37601c c37601cM44829L17 = m44829L4();
            if (c37601cM44829L17 != null && (baseTextView3 = c37601cM44829L17.f83699i0) != null) {
                baseTextView3.setEnabled(false);
            }
            C37601c c37601cM44829L18 = m44829L4();
            if (c37601cM44829L18 != null && (baseTextView2 = c37601cM44829L18.f83693f0) != null) {
                baseTextView2.setEnabled(false);
            }
            C37601c c37601cM44829L19 = m44829L4();
            if (c37601cM44829L19 != null && (baseTextView = c37601cM44829L19.f83705l0) != null) {
                baseTextView.setEnabled(false);
            }
            C37601c c37601cM44829L20 = m44829L4();
            if (c37601cM44829L20 != null && (linearLayout = c37601cM44829L20.f83723u0) != null) {
                linearLayout.setAlpha(0.3f);
            }
            C37601c c37601cM44829L21 = m44829L4();
            if (c37601cM44829L21 != null && (appCompatEditText = c37601cM44829L21.f83690e) != null) {
                appCompatEditText.setEnabled(false);
            }
            C37601c c37601cM44829L22 = m44829L4();
            if (c37601cM44829L22 == null || (view = c37601cM44829L22.f83713p0) == null) {
                return;
            }
            view.setAlpha(0.3f);
        }
    }

    /* JADX INFO: renamed from: T6 */
    public static final Unit m44870T6(final OtcAdEditUpFragment otcAdEditUpFragment) {
        String legal;
        if (!otcAdEditUpFragment.m44827J4()) {
            return Unit.INSTANCE;
        }
        Observable<R> observableCompose = otcAdEditUpFragment.m44833P4().m83339r(otcAdEditUpFragment.mo44834Q4()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.y1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcAdEditUpFragment.m44871U6(this.f37825b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.z1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcAdEditUpFragment.m44872V6(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.a2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcAdEditUpFragment.m44873W6(this.f37704b, obj);
            }
        }, otcAdEditUpFragment.new C19959a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = otcAdEditUpFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        Pair pairM90091to = TuplesKt.m90091to("source", "edit");
        OtcAd f37662y = otcAdEditUpFragment.getF37662Y();
        String currency = null;
        if (f37662y != null) {
            legal = f37662y.getLegal();
        } else {
            legal = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("fiat", C27041f.m66668h(legal));
        OtcAd f37662y2 = otcAdEditUpFragment.getF37662Y();
        if (f37662y2 != null) {
            currency = f37662y2.getCurrency();
        }
        C43852m.m96590b("B7P2PPostAdvertisements", "button", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("coin", C27041f.m66668h(currency)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U6 */
    public static final Unit m44871U6(OtcAdEditUpFragment otcAdEditUpFragment, Disposable disposable) {
        otcAdEditUpFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V6 */
    public static final void m44872V6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W6 */
    public static final void m44873W6(OtcAdEditUpFragment otcAdEditUpFragment, Object obj) {
        otcAdEditUpFragment.hideDialogLoading();
        ToastCompat.m66437C(R$string.save_success);
        otcAdEditUpFragment.preformBackPressed();
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    /* JADX INFO: renamed from: G4 */
    public void mo44824G4() {
        super.mo44824G4();
        m44875X6();
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public HashMap<String, Object> mo44834Q4() {
        Editable text;
        FilterEmojiEditText filterEmojiEditText;
        HashMap<String, Object> mapMo44834Q4 = super.mo44834Q4();
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (filterEmojiEditText = c37601cM44829L4.f83688d) != null) {
            text = filterEmojiEditText.getText();
        } else {
            text = null;
        }
        mapMo44834Q4.put("addQuantity", C38346y.m86490A(String.valueOf(text)));
        return mapMo44834Q4;
    }

    /* JADX INFO: renamed from: X6 */
    public final void m44875X6() {
        BaseTextView baseTextView;
        BigDecimal currencyBalanceQuantity;
        Editable text;
        FilterEmojiEditText filterEmojiEditText;
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83724v) != null) {
            OtcAd f37662y = getF37662Y();
            String currency = null;
            if (f37662y != null) {
                currencyBalanceQuantity = f37662y.getCurrencyBalanceQuantity();
            } else {
                currencyBalanceQuantity = null;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(currencyBalanceQuantity, null, 1, null);
            C37601c c37601cM44829L5 = m44829L4();
            if (c37601cM44829L5 != null && (filterEmojiEditText = c37601cM44829L5.f83688d) != null) {
                text = filterEmojiEditText.getText();
            } else {
                text = null;
            }
            String strM66668h = C27041f.m66668h(bigDecimalM89922G.add(C38346y.m86490A(String.valueOf(text))).toPlainString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            OtcAd f37662y2 = getF37662Y();
            if (f37662y2 != null) {
                currency = f37662y2.getCurrency();
            }
            sb2.append(C27041f.m66668h(currency));
            baseTextView.setText(m44836V4(strM66668h, sb2.toString(), R$color.emphasis, R$color.emphasis60));
        }
    }

    @Override // com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment
    public void initView() {
        OtcAd otcAd;
        OtcSymbol otcSymbol;
        Boolean boolValueOf;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Boolean boolValueOf2;
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
        BaseTextView baseTextView4;
        String plainString4;
        String currency;
        BigDecimal currencyBalanceQuantity;
        AppCompatEditText appCompatEditText;
        String remarks;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        Object next;
        String currency2;
        String currency3;
        Button button;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ConstraintLayout constraintLayout;
        ImageView imageView;
        ImageView imageView2;
        Button button2;
        BaseTextView baseTextView12;
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (baseTextView12 = c37601cM44829L5.f83685b0) != null) {
            baseTextView12.setText(getString(R$string.fast_sell_currency_title));
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 != null && (button2 = c37601cM44829L6.f83686c) != null) {
            button2.setText(getString(R$string.otc_ad_confirm_edit));
        }
        C37601c c37601cM44829L7 = m44829L4();
        if (c37601cM44829L7 != null && (imageView2 = c37601cM44829L7.f83712p) != null) {
            C27046k.m66700o(imageView2);
        }
        C37601c c37601cM44829L8 = m44829L4();
        if (c37601cM44829L8 != null && (imageView = c37601cM44829L8.f83710o) != null) {
            C27046k.m66700o(imageView);
        }
        C37601c c37601cM44829L9 = m44829L4();
        if (c37601cM44829L9 != null && (constraintLayout = c37601cM44829L9.f83727w0) != null) {
            C27046k.m66685H(constraintLayout);
        }
        C37601c c37601cM44829L10 = m44829L4();
        if (c37601cM44829L10 != null && (linearLayout2 = c37601cM44829L10.f83714q) != null) {
            linearLayout2.setClickable(false);
        }
        C37601c c37601cM44829L11 = m44829L4();
        if (c37601cM44829L11 != null && (linearLayout = c37601cM44829L11.f83718s) != null) {
            linearLayout.setClickable(false);
        }
        int colorRes = getColorRes(R$color.emphasis20);
        C37601c c37601cM44829L12 = m44829L4();
        if (c37601cM44829L12 != null && (baseTextView11 = c37601cM44829L12.f83662G) != null) {
            baseTextView11.setTextColor(colorRes);
        }
        C37601c c37601cM44829L13 = m44829L4();
        if (c37601cM44829L13 != null && (baseTextView10 = c37601cM44829L13.f83666K) != null) {
            baseTextView10.setTextColor(colorRes);
        }
        C37601c c37601cM44829L14 = m44829L4();
        if (c37601cM44829L14 != null && (baseTextView9 = c37601cM44829L14.f83661F) != null) {
            baseTextView9.setTextColor(colorRes);
        }
        C37601c c37601cM44829L15 = m44829L4();
        if (c37601cM44829L15 != null && (baseTextView8 = c37601cM44829L15.f83664I) != null) {
            baseTextView8.setTextColor(colorRes);
        }
        C37601c c37601cM44829L16 = m44829L4();
        if (c37601cM44829L16 != null && (button = c37601cM44829L16.f83686c) != null) {
            C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.x1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcAdEditUpFragment.m44870T6(this.f37821b);
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
                    currency2 = ((OtcSymbol) next).getCurrency();
                    OtcAd f37662y = getF37662Y();
                    if (f37662y != null) {
                        currency3 = f37662y.getCurrency();
                    } else {
                        currency3 = null;
                    }
                } else {
                    next = null;
                    break;
                }
            } while (!Intrinsics.areEqual(currency2, currency3));
            otcSymbol = (OtcSymbol) next;
        } else {
            otcSymbol = null;
        }
        m44821E6(otcSymbol);
        OtcAd f37662y2 = getF37662Y();
        if (f37662y2 != null) {
            boolValueOf = Boolean.valueOf(f37662y2.isBuy());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            C37601c c37601cM44829L17 = m44829L4();
            if (c37601cM44829L17 != null && (baseTextView7 = c37601cM44829L17.f83659D) != null) {
                C27046k.m66685H(baseTextView7);
            }
            C37601c c37601cM44829L18 = m44829L4();
            if (c37601cM44829L18 != null && (baseTextView6 = c37601cM44829L18.f83678W) != null) {
                C27046k.m66700o(baseTextView6);
            }
            C37601c c37601cM44829L19 = m44829L4();
            if (c37601cM44829L19 != null && (baseTextView5 = c37601cM44829L19.f83726w) != null) {
                baseTextView5.setText(getString(R$string.otc_ad_buy_amount_after_supply));
            }
        } else {
            C37601c c37601cM44829L20 = m44829L4();
            if (c37601cM44829L20 != null && (baseTextView3 = c37601cM44829L20.f83659D) != null) {
                C27046k.m66700o(baseTextView3);
            }
            C37601c c37601cM44829L21 = m44829L4();
            if (c37601cM44829L21 != null && (baseTextView2 = c37601cM44829L21.f83678W) != null) {
                C27046k.m66685H(baseTextView2);
            }
            C37601c c37601cM44829L22 = m44829L4();
            if (c37601cM44829L22 != null && (baseTextView = c37601cM44829L22.f83726w) != null) {
                baseTextView.setText(getString(R$string.otc_ad_sell_amount_after_supply));
            }
        }
        C37601c c37601cM44829L23 = m44829L4();
        if (c37601cM44829L23 != null && (appCompatEditText = c37601cM44829L23.f83690e) != null) {
            OtcAd f37662y3 = getF37662Y();
            if (f37662y3 != null) {
                remarks = f37662y3.getRemarks();
            } else {
                remarks = null;
            }
            appCompatEditText.setText(C27041f.m66668h(remarks));
        }
        C37601c c37601cM44829L24 = m44829L4();
        if (c37601cM44829L24 != null && (baseTextView4 = c37601cM44829L24.f83675T) != null) {
            OtcAd f37662y4 = getF37662Y();
            if (f37662y4 != null && (currencyBalanceQuantity = f37662y4.getCurrencyBalanceQuantity()) != null) {
                plainString4 = currencyBalanceQuantity.toPlainString();
            } else {
                plainString4 = null;
            }
            String strM66668h = C27041f.m66668h(plainString4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            OtcAd f37662y5 = getF37662Y();
            if (f37662y5 != null) {
                currency = f37662y5.getCurrency();
            } else {
                currency = null;
            }
            sb2.append(C27041f.m66668h(currency));
            baseTextView4.setText(m44836V4(strM66668h, sb2.toString(), R$color.emphasis, R$color.emphasis60));
        }
        C37601c c37601cM44829L25 = m44829L4();
        if (c37601cM44829L25 != null && (editTextWithTitleView3 = c37601cM44829L25.f83700j) != null) {
            OtcAd f37662y6 = getF37662Y();
            if (f37662y6 != null && (limitMinQuote = f37662y6.getLimitMinQuote()) != null) {
                plainString3 = limitMinQuote.toPlainString();
            } else {
                plainString3 = null;
            }
            editTextWithTitleView3.setContent(C27041f.m66668h(plainString3));
        }
        C37601c c37601cM44829L26 = m44829L4();
        if (c37601cM44829L26 != null && (editTextWithTitleView2 = c37601cM44829L26.f83698i) != null) {
            OtcAd f37662y7 = getF37662Y();
            if (f37662y7 != null && (limitMaxQuote = f37662y7.getLimitMaxQuote()) != null) {
                plainString2 = limitMaxQuote.toPlainString();
            } else {
                plainString2 = null;
            }
            editTextWithTitleView2.setContent(C27041f.m66668h(plainString2));
        }
        OtcAd f37662y8 = getF37662Y();
        if (f37662y8 != null) {
            boolValueOf2 = Boolean.valueOf(f37662y8.isFloatType());
        } else {
            boolValueOf2 = null;
        }
        if (C27025c.m66566d(boolValueOf2) && (c37601cM44829L4 = m44829L4()) != null && (editTextWithTitleView = c37601cM44829L4.f83692f) != null) {
            OtcAd f37662y9 = getF37662Y();
            if (f37662y9 != null && (limitPrice = f37662y9.getLimitPrice()) != null) {
                plainString = limitPrice.toPlainString();
            } else {
                plainString = null;
            }
            editTextWithTitleView.setContent(C27041f.m66668h(plainString));
        }
        m44853q6();
        m44875X6();
        AbsOtcAdBaseFragment.m44722S4(this, null, 1, null);
        m44874S6();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Boolean boolValueOf;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(RouteExKt.m56250h(arguments, "hasNewUserTag"));
        } else {
            boolValueOf = null;
        }
        this.f37682s0 = C27025c.m66566d(boolValueOf);
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
                i11 = R$string.otc_ad_supply_buy_amount;
            } else {
                i11 = R$string.otc_ad_supply_sell_amount;
            }
            baseTextView.setText(getString(i11));
        }
    }
}
