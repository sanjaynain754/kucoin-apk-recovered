package com.kubi.otc.fiat.withdraw.capitual;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.view.TitleChooseView;
import com.kubi.otc.view.TitleEditTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/PixCPFTypeContentView;", "Landroid/widget/FrameLayout;", "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult$PixCPFParamsResult;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getPixKey", "", "getDiscription", "setChanges", "", "choosePixType", "Lcom/kubi/otc/view/TitleChooseView;", "tvConfirm", "Landroid/widget/TextView;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatCapitualWithdrawAddAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatCapitualWithdrawAddAccountFragment.kt\ncom/kubi/otc/fiat/withdraw/capitual/PixCPFTypeContentView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class PixCPFTypeContentView extends FrameLayout implements ParamsResult.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixCPFTypeContentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.botc_view_pix_cpf_type, this);
    }

    /* JADX INFO: renamed from: i */
    public static final Boolean m44642i(CharSequence t11, CharSequence t12) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        return Boolean.valueOf(t11.length() > 0 && t12.length() > 0);
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m44643j(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Boolean) function2.invoke(p11, p12);
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.a
    @NotNull
    public String getDiscription() {
        return ((TitleEditTextView) findViewById(R$id.ted_des)).getText();
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.a
    @NotNull
    public String getPixKey() {
        return ((TitleEditTextView) findViewById(R$id.ted_pix_key)).getText();
    }

    /* JADX INFO: renamed from: h */
    public final void m44648h(@Nullable TitleChooseView titleChooseView, @Nullable final TextView textView) {
        if (titleChooseView == null || textView == null) {
            return;
        }
        TextView textView2 = titleChooseView.getTextView();
        AbstractC46099a<CharSequence> abstractC46099aM784d = textView2 != null ? C0206f.m784d(textView2) : null;
        AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(((TitleEditTextView) findViewById(R$id.ted_pix_key)).getEditText());
        final Function2 function2 = new Function2() { // from class: com.kubi.otc.fiat.withdraw.capitual.g0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PixCPFTypeContentView.m44642i((CharSequence) obj, (CharSequence) obj2);
            }
        };
        Observable observableCombineLatest = Observable.combineLatest(abstractC46099aM784d, abstractC46099aM784d2, new BiFunction() { // from class: com.kubi.otc.fiat.withdraw.capitual.h0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return PixCPFTypeContentView.m44643j(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PixCPFTypeContentView.m44644k(textView, (Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PixCPFTypeContentView.m44645l(function1, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PixCPFTypeContentView.m44646m((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCombineLatest.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PixCPFTypeContentView.m44647n(function3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(this));
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m44644k(TextView textView, Boolean bool) {
        textView.setEnabled(C27025c.m66566d(bool));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m44645l(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m44646m(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m44647n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
