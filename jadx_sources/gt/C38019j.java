package gt;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: gt.j */
/* JADX INFO: compiled from: OtcHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/helper/OtcHelper;", "", "<init>", "()V", "beforeCheckSell", "", "iView", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "isBuy", "", "consumer", "Lio/reactivex/functions/Consumer;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38019j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38019j f85625a = new C38019j();

    /* JADX INFO: renamed from: gt.j$a */
    /* JADX INFO: compiled from: OtcHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/helper/OtcHelper$beforeCheckSell$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends C24223c1 {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Consumer<Boolean> f85626d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OldBaseFragment oldBaseFragment, Consumer<Boolean> consumer) {
            super(oldBaseFragment);
            this.f85626d = consumer;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws Exception {
            super.accept(th2);
            this.f85626d.accept(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m85893l(final OldBaseFragment oldBaseFragment, final long j11, final long j12, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        final TextView textView = (TextView) viewHolder.getView(R.id.text1);
        textView.setTextColor(oldBaseFragment.getColorRes(R$color.primary));
        textView.setPadding(0, 0, 0, 0);
        textView.setTextSize(12.0f);
        Observable<Long> observableObserveOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: gt.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C38019j.m85894m(j11, (Long) obj));
            }
        };
        Observable<Long> observableTakeWhile = observableObserveOn.takeWhile(new Predicate() { // from class: gt.d
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return C38019j.m85895n(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: gt.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38019j.m85896o(j11, j12, textView, oldBaseFragment, (Long) obj);
            }
        };
        Consumer<? super Long> consumer = new Consumer() { // from class: gt.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38019j.m85897p(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: gt.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C38019j.m85898q((Throwable) obj);
            }
        };
        observableTakeWhile.subscribe(consumer, new Consumer() { // from class: gt.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C38019j.m85899r(function3, obj);
            }
        }, new Action() { // from class: gt.i
            @Override // io.reactivex.functions.Action
            public final void run() {
                C38019j.m85900s();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m85894m(long j11, Long aLong) {
        Intrinsics.checkNotNullParameter(aLong, "aLong");
        return aLong.longValue() < j11;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m85895n(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: j */
    public final void m85901j(@NotNull final OldBaseFragment iView, boolean z11, @NotNull final Consumer<Boolean> consumer) throws Exception {
        Intrinsics.checkNotNullParameter(iView, "iView");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (!z11) {
            OtcDepend otcDepend = OtcDepend.f38138a;
            if (otcDepend.m45464m().c()) {
                iView.showDialogLoading();
                otcDepend.m45457f().mo15342g().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: gt.a
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) throws Exception {
                        C38019j.m85892k(iView, consumer, (BlackGroupResponse) obj);
                    }
                }, new a(iView, consumer));
                return;
            }
        }
        consumer.accept(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: k */
    public static final void m85892k(final OldBaseFragment oldBaseFragment, Consumer consumer, BlackGroupResponse blackGroupResponse) throws Exception {
        oldBaseFragment.hideDialogLoading();
        if (blackGroupResponse.isLimitWithdraw()) {
            consumer.accept(Boolean.FALSE);
            final long time = blackGroupResponse.getTime() / 1000;
            AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt);
            Context contextRequireContext = oldBaseFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            final long j11 = 86400;
            alertDialogFragmentHelperM54167X4.m54156M4(blackGroupResponse.getWithdrawLimitTips(contextRequireContext)).m54162S4(R$string.already_know, null).m54148E4(R$layout.kucoin_item_simple_textview, new DialogFragmentHelper.InterfaceC22882b() { // from class: gt.b
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    C38019j.m85893l(oldBaseFragment, time, j11, baseViewHolder, dialogFragmentHelper);
                }
            }).m54172c5(oldBaseFragment.getChildFragmentManager());
            return;
        }
        consumer.accept(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m85896o(long j11, long j12, TextView textView, OldBaseFragment oldBaseFragment, Long l11) {
        Intrinsics.checkNotNull(l11);
        if (j11 - l11.longValue() > j12) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66703r(textView);
        } else {
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66594y(textView);
        }
        textView.setText(oldBaseFragment.getString(R$string.countdown, TimeUtils.m66415b(Long.valueOf(j11 - l11.longValue()))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m85897p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m85898q(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m85899r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m85900s() {
    }
}
