package ht;

import android.R;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.data.entity.CheckCodeParamsEntity;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.otc.view.PaymentPassWordGridView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27052h0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37241c;
import f00.C37304a;
import g00.InterfaceC37758j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: ht.b1 */
/* JADX INFO: compiled from: TradePwdHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0002\u001aT\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002\u001aN\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u001a(\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a¨\u0006\u001b"}, m90084d2 = {"checkPwd", "", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "observable", "Lio/reactivex/Observable;", "", "bizType", "", "pwd", "consumer", "Lio/reactivex/functions/Consumer;", "errorCallBack", "", "header", "showWithdrawDialog", "validationBizEnum", "Lcom/kubi/data/constance/ValidationBizEnum;", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "checkTradePwd", "showTradeToastNotice", "fragment", "e", "Lcom/kubi/network/retrofit/exception/ApiException;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38301b1 {

    /* JADX INFO: renamed from: ht.b1$a */
    /* JADX INFO: compiled from: TradePwdHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/TradePwdHelperKt$checkPwd$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends C24223c1 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Consumer<Throwable> f86038d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Consumer<Throwable> consumer) {
            super(null, false);
            this.f86038d = consumer;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws Exception {
            super.accept(th2);
            this.f86038d.accept(th2);
        }
    }

    /* JADX INFO: renamed from: ht.b1$b */
    /* JADX INFO: compiled from: TradePwdHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/TradePwdHelperKt$checkTradePwd$4", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends C24223c1 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseFragment f86039d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Consumer<Throwable> f86040e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BaseFragment baseFragment, Consumer<Throwable> consumer) {
            super(null, false);
            this.f86039d = baseFragment;
            this.f86040e = consumer;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws Exception {
            super.accept(th2);
            this.f86039d.hideLoadingDialog(true);
            this.f86040e.accept(th2);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m86467g0(PaymentPassWordGridView paymentPassWordGridView) {
        KeyboardUtils.m6041m(paymentPassWordGridView.getChildAt(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m86430C(BaseFragment baseFragment, final Observable<Object> observable, String str, String str2, final Consumer<Object> consumer, Consumer<Throwable> consumer2, String str3) {
        CheckCodeParamsEntity checkCodeParamsEntity = new CheckCodeParamsEntity();
        checkCodeParamsEntity.setBizType(str);
        HashMap<String, String> validations = checkCodeParamsEntity.getValidations();
        Intrinsics.checkNotNullExpressionValue(validations, "getValidations(...)");
        validations.put("WITHDRAW_PASSWORD", C27052h0.m66729d(str2, 2));
        Observable<R> observableCompose = ((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class)).m83323a(checkCodeParamsEntity, str3).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: ht.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38301b1.m86431D(observable, (ArrayList) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.flatMap(new Function() { // from class: ht.r0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38301b1.m86432E(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: ht.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C38301b1.m86433F(consumer, obj);
            }
        }, new a(consumer2));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, baseFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: D */
    public static final ObservableSource m86431D(Observable observable, ArrayList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return observable;
    }

    /* JADX INFO: renamed from: E */
    public static final ObservableSource m86432E(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: G */
    public static final void m86434G(@NotNull final BaseFragment baseFragment, @NotNull final ValidationBizEnum validationBizEnum, @NotNull final Observable<Object> observable, @NotNull final Consumer<Object> consumer, @NotNull final Consumer<Throwable> errorCallBack, @Nullable final DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Intrinsics.checkNotNullParameter(validationBizEnum, "validationBizEnum");
        Intrinsics.checkNotNullParameter(observable, "observable");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(errorCallBack, "errorCallBack");
        final String str = validationBizEnum == ValidationBizEnum.CONTRACT_TRADE ? "KUMEX" : "KUCOIN";
        Observable<R> observableCompose = ((InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class)).m83324b(validationBizEnum.name(), "", str).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: ht.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38301b1.m86436I(baseFragment, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: ht.k0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38301b1.m86437J(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: ht.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38301b1.m86438K(observable, (ArrayList) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.flatMap(new Function() { // from class: ht.u0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C38301b1.m86439L(function2, obj);
            }
        }).subscribe(new Consumer() { // from class: ht.v0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C38301b1.m86440M(baseFragment, observable, validationBizEnum, consumer, errorCallBack, str, onDismissListener, obj);
            }
        }, new b(baseFragment, errorCallBack));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, baseFragment.getDestroyDisposable());
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m86435H(BaseFragment baseFragment, ValidationBizEnum validationBizEnum, Observable observable, Consumer consumer, Consumer consumer2, DialogInterface.OnDismissListener onDismissListener, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            observable = Observable.just(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(observable, "just(...)");
        }
        Observable observable2 = observable;
        if ((i11 & 32) != 0) {
            onDismissListener = null;
        }
        m86434G(baseFragment, validationBizEnum, observable2, consumer, consumer2, onDismissListener);
    }

    /* JADX INFO: renamed from: K */
    public static final ObservableSource m86438K(Observable observable, ArrayList t11) {
        Intrinsics.checkNotNullParameter(t11, "t");
        if (t11.isEmpty()) {
            return observable;
        }
        Observable observableJust = Observable.just(-1);
        Intrinsics.checkNotNull(observableJust);
        return observableJust;
    }

    /* JADX INFO: renamed from: L */
    public static final ObservableSource m86439L(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (ObservableSource) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: M */
    public static final void m86440M(BaseFragment baseFragment, Observable observable, ValidationBizEnum validationBizEnum, Consumer consumer, Consumer consumer2, String str, DialogInterface.OnDismissListener onDismissListener, Object obj) throws Exception {
        if (!(obj instanceof Integer)) {
            consumer.accept(obj);
        } else {
            baseFragment.hideLoadingDialog(true);
            m86455a0(baseFragment, observable, validationBizEnum, consumer, consumer2, str, onDismissListener);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r0.equals("618054") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0.equals("618017") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r0.equals("618016") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r0.equals("618013") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r0.equals("618012") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        com.kubi.resources.dialog.AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(com.kubi.otc.R$string.notice_prompt).m54156M4(r5.getMessage()).m54162S4(com.kubi.otc.R$string.i_already_know, null).m54172c5(r4.getChildFragmentManager());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d8, code lost:
    
        if (r0.equals("618002") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        if (r0.equals("618001") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        com.kubi.resources.dialog.AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(com.kubi.otc.R$string.notice_prompt).m54156M4(r5.getMessage()).m54162S4(com.kubi.otc.R$string.go_view, new ht.DialogInterfaceOnClickListenerC38345x0()).m54159P4(com.kubi.otc.R$string.cancel, null).m54172c5(r4.getChildFragmentManager());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m86441N(@NotNull final BaseFragment fragment, @NotNull final ApiException e11, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(e11, "e");
        String str = e11.code;
        if (str != null) {
            switch (str.hashCode()) {
                case 1477264190:
                    if (str.equals("200000")) {
                        final AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(e11.getMessage()).m54162S4(R$string.already_know, null);
                        Object obj = e11.data;
                        if (obj != null && obj.toString().length() > 0) {
                            C27100x0.m66923d(new Function0() { // from class: ht.w0
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C38301b1.m86443P(e11, alertDialogFragmentHelperM54162S4);
                                }
                            });
                        }
                        alertDialogFragmentHelperM54162S4.m54172c5(fragment.getChildFragmentManager());
                    }
                    break;
                case 1592942644:
                    break;
                case 1592942645:
                    break;
                case 1592942646:
                    if (str.equals("618003")) {
                        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(fragment.getStringRes(R$string.otc_no_payment_alert, new Object[0])).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: ht.y0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                C38301b1.m86453Z(fragment, dialogInterface, i11);
                            }
                        }).m54159P4(R$string.cancel, null).m54172c5(fragment.getChildFragmentManager());
                    }
                    break;
                case 1592942676:
                    break;
                case 1592942677:
                    break;
                case 1592942680:
                    break;
                case 1592942681:
                    break;
                case 1592942802:
                    break;
                case 1592944568:
                    if (str.equals("618203")) {
                        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54153J4(R$string.payment_order_risk_refused).m54162S4(R$string.i_already_know, null).m54172c5(fragment.getChildFragmentManager());
                    }
                    break;
            }
            return;
        }
        ToastCompat.m66441G(e11.getMessage(), new Object[0]);
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m86442O(BaseFragment baseFragment, ApiException apiException, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        m86441N(baseFragment, apiException, function0);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m86443P(ApiException apiException, AlertDialogFragmentHelper alertDialogFragmentHelper) {
        final long jM66546p = DowngradeExKt.m66546p(apiException.data.toString(), 0L, 1, null);
        alertDialogFragmentHelper.m54148E4(R$layout.kucoin_item_simple_textview, new DialogFragmentHelper.InterfaceC22882b() { // from class: ht.a1
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                C38301b1.m86444Q(jM66546p, baseViewHolder, dialogFragmentHelper);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m86444Q(final long j11, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        final TextView textView = (TextView) viewHolder.getView(R.id.text1);
        textView.setTextColor(C27017c.f54310a.m66512a(R$color.primary));
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(12.0f);
        Observable<Long> observableObserveOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: ht.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C38301b1.m86445R(j11, (Long) obj));
            }
        };
        Observable<Long> observableTakeWhile = observableObserveOn.takeWhile(new Predicate() { // from class: ht.f0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C38301b1.m86446S(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: ht.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38301b1.m86447T(textView, j11, (Long) obj);
            }
        };
        Consumer<? super Long> consumer = new Consumer() { // from class: ht.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38301b1.m86448U(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: ht.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38301b1.m86449V((Throwable) obj);
            }
        };
        observableTakeWhile.subscribe(consumer, new Consumer() { // from class: ht.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38301b1.m86450W(function3, obj);
            }
        }, new Action() { // from class: ht.l0
            @Override // io.reactivex.functions.Action
            public final void run() {
                C38301b1.m86451X();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m86445R(long j11, Long aLong) {
        Intrinsics.checkNotNullParameter(aLong, "aLong");
        return aLong.longValue() < j11;
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m86446S(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m86447T(TextView textView, long j11, Long l11) {
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.countdown;
        Intrinsics.checkNotNull(l11);
        textView.setText(c27017c.m66516f(i11, TimeUtils.m66415b(Long.valueOf(j11 - l11.longValue()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m86452Y(DialogInterface dialogInterface, int i11) {
        InterfaceC37758j.a.m85165n(C37304a.f82764a, 1L, null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m86455a0(final BaseFragment baseFragment, final Observable<Object> observable, final ValidationBizEnum validationBizEnum, final Consumer<Object> consumer, final Consumer<Throwable> consumer2, final String str, DialogInterface.OnDismissListener onDismissListener) {
        BaseDialogFragment baseDialogFragmentM54192r3 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.botc_dialog_check_withdraw, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: ht.z0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C38301b1.m86457b0(baseFragment, observable, validationBizEnum, str, consumer, consumer2, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54192r3(onDismissListener);
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "check_withdraw");
    }

    /* JADX INFO: renamed from: b0 */
    public static final Unit m86457b0(final BaseFragment baseFragment, final Observable observable, final ValidationBizEnum validationBizEnum, final String str, final Consumer consumer, final Consumer consumer2, final BaseViewHolder viewHolder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        viewHolder.setOnClickListener(R$id.tv_forget_pwd, new View.OnClickListener() { // from class: ht.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C38301b1.m86469h0(dialog, view);
            }
        }).setOnClickListener(R$id.iv_close, new View.OnClickListener() { // from class: ht.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C38301b1.m86471i0(dialog, view);
            }
        });
        final View view = viewHolder.getView(R$id.loadingView);
        final PaymentPassWordGridView paymentPassWordGridView = (PaymentPassWordGridView) viewHolder.getView(R$id.password_toggle_view);
        paymentPassWordGridView.postDelayed(new Runnable() { // from class: ht.c0
            @Override // java.lang.Runnable
            public final void run() {
                C38301b1.m86465f0(paymentPassWordGridView);
            }
        }, 100L);
        paymentPassWordGridView.setCompleteCallBack(new Consumer() { // from class: ht.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38301b1.m86459c0(view, baseFragment, observable, validationBizEnum, str, paymentPassWordGridView, dialog, consumer, viewHolder, consumer2, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m86459c0(final View view, BaseFragment baseFragment, Observable observable, ValidationBizEnum validationBizEnum, String str, final PaymentPassWordGridView paymentPassWordGridView, final DialogFragmentHelper dialogFragmentHelper, final Consumer consumer, final BaseViewHolder baseViewHolder, final Consumer consumer2, String str2) {
        if (view == null) {
            return;
        }
        ViewExtKt.m66594y(view);
        m86430C(baseFragment, observable, validationBizEnum.name(), str2, new Consumer() { // from class: ht.n0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C38301b1.m86461d0(view, paymentPassWordGridView, dialogFragmentHelper, consumer, obj);
            }
        }, new Consumer() { // from class: ht.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C38301b1.m86463e0(view, paymentPassWordGridView, baseViewHolder, consumer2, (Throwable) obj);
            }
        }, str);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m86465f0(final PaymentPassWordGridView paymentPassWordGridView) {
        if (paymentPassWordGridView == null || paymentPassWordGridView.getChildCount() <= 0) {
            return;
        }
        C27100x0.m66923d(new Function0() { // from class: ht.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38301b1.m86467g0(paymentPassWordGridView);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m86471i0(DialogFragmentHelper dialogFragmentHelper, final View view) {
        C27100x0.m66923d(new Function0() { // from class: ht.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38301b1.m86473j0(view);
            }
        });
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static final void m86433F(Consumer consumer, Object obj) throws Exception {
        consumer.accept(obj);
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m86436I(BaseFragment baseFragment, Disposable disposable) {
        baseFragment.showLoadingDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final void m86437J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U */
    public static final void m86448U(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m86449V(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final void m86450W(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static final void m86453Z(BaseFragment baseFragment, DialogInterface dialogInterface, int i11) {
        C38346y.m86509T(baseFragment);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m86461d0(View view, PaymentPassWordGridView paymentPassWordGridView, DialogFragmentHelper dialogFragmentHelper, Consumer consumer, Object obj) throws Exception {
        ViewExtKt.m66577h(view);
        paymentPassWordGridView.m45558d();
        dialogFragmentHelper.dismiss();
        consumer.accept(obj);
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m86463e0(View view, PaymentPassWordGridView paymentPassWordGridView, BaseViewHolder baseViewHolder, Consumer consumer, Throwable th2) throws Exception {
        ViewExtKt.m66577h(view);
        paymentPassWordGridView.m45558d();
        baseViewHolder.setGone(R$id.tipTextView, true);
        consumer.accept(th2);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m86469h0(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
        OtcDepend.f38138a.m45464m().B0();
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m86473j0(View view) {
        KeyboardUtils.m6034f(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final void m86451X() {
    }
}
