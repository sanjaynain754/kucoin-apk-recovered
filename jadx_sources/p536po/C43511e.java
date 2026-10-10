package p536po;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.util.C24217a1;
import com.kubi.unify.api.IUnifyAccountService;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import no.C42856a;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: po.e */
/* JADX INFO: compiled from: CrossMarginToggleHelper.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m90084d2 = {"applyCrossMarginVisibility", "", "rbGroup", "Landroid/widget/RadioGroup;", "rbCorss", "Landroid/widget/RadioButton;", "rbIsolated", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "LoanLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43511e {
    /* JADX INFO: renamed from: e */
    public static final void m95737e(@NotNull final RadioGroup rbGroup, @NotNull RadioButton rbCorss, @NotNull RadioButton rbIsolated, @NotNull CompositeDisposable disposable) {
        Observable<BaseEntity<LeverBalance>> observableMo37935f;
        Observable<R> observableCompose;
        Intrinsics.checkNotNullParameter(rbGroup, "rbGroup");
        Intrinsics.checkNotNullParameter(rbCorss, "rbCorss");
        Intrinsics.checkNotNullParameter(rbIsolated, "rbIsolated");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        C42856a c42856a = C42856a.f94921a;
        IUnifyAccountService iUnifyAccountServiceM93999b = c42856a.m93999b();
        if (iUnifyAccountServiceM93999b != null && iUnifyAccountServiceM93999b.mo64979C() && Intrinsics.areEqual(SiteType.INSTANCE.getCurrentSiteType(), "global")) {
            rbGroup.setVisibility(8);
            rbIsolated.setChecked(true);
            IMarginService iMarginServiceM93998a = c42856a.m93998a();
            if (iMarginServiceM93998a == null || (observableMo37935f = iMarginServiceM93998a.mo37935f()) == null || (observableCompose = observableMo37935f.compose(C24217a1.m58389m())) == 0) {
                return;
            }
            final Function1 function1 = new Function1() { // from class: po.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43511e.m95738f(rbGroup, (LeverBalance) obj);
                }
            };
            Consumer consumer = new Consumer() { // from class: po.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C43511e.m95739g(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: po.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43511e.m95740h((Throwable) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: po.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C43511e.m95741i(function2, obj);
                }
            });
            if (disposableSubscribe != null) {
                DisposableKt.addTo(disposableSubscribe, disposable);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m95740h(Throwable th2) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m95738f(RadioGroup radioGroup, LeverBalance leverBalance) {
        if (!C41014a.m89917B(leverBalance.getTotalBalance()) || !C41014a.m89917B(leverBalance.getTotalLiability())) {
            radioGroup.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m95739g(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static final void m95741i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
