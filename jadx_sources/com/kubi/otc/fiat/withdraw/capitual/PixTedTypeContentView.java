package com.kubi.otc.fiat.withdraw.capitual;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.entity.FiatCapitualBank;
import com.kubi.otc.view.TitleChooseView;
import com.kubi.otc.view.TitleEditTextView;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p752x8.AbstractC46099a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: FiatCapitualWithdrawAddAccountFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u001a\u001a\u00020\t2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ+\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\"R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/capitual/PixTedTypeContentView;", "Landroid/widget/FrameLayout;", "Lcom/kubi/otc/fiat/withdraw/capitual/ParamsResult$PixTedParamsResult;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "clickListener", "Lkotlin/Function0;", "", "bankInfo", "Lcom/kubi/otc/entity/FiatCapitualBank;", "getAccountName", "", "getCpf", "getAccount", "isCheckAccount", "", "getBankNo", "getBranch", "getDiscription", "getBankInfo", "setBankInfo", "bank", "setAccountName", "name", "setBankNoListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setChanges", "choosePixType", "Lcom/kubi/otc/view/TitleChooseView;", "tvConfirm", "Landroid/widget/TextView;", "isTed", "(Lcom/kubi/otc/view/TitleChooseView;Landroid/widget/TextView;Ljava/lang/Boolean;)V", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PixTedTypeContentView extends FrameLayout implements ParamsResult.b {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function0<Unit> f37523b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public FiatCapitualBank f37524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixTedTypeContentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.botc_view_pix_bank_type, this);
        View viewFindViewById = findViewById(R$id.ted_bank_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.capitual.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PixTedTypeContentView.m44656i(this.f37556b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m44656i(PixTedTypeContentView pixTedTypeContentView) {
        Function0<Unit> function0 = pixTedTypeContentView.f37523b;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Boolean m44657k(Boolean bool, CharSequence t11, CharSequence t12, CharSequence t13, CharSequence t14, CharSequence t15, CharSequence t16) {
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        Intrinsics.checkNotNullParameter(t13, "t3");
        Intrinsics.checkNotNullParameter(t14, "t4");
        Intrinsics.checkNotNullParameter(t15, "t5");
        Intrinsics.checkNotNullParameter(t16, "t6");
        boolean z11 = false;
        boolean z12 = t11.length() > 0 && t12.length() > 0 && t13.length() > 0 && t14.length() > 0 && t15.length() > 0;
        if (C27025c.m66566d(bool)) {
            z11 = z12;
        } else if (z12 && t16.length() > 0) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: l */
    public static final Boolean m44658l(Function6 function6, Object p11, Object p12, Object p13, Object p14, Object p15, Object p16) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p13, "p2");
        Intrinsics.checkNotNullParameter(p14, "p3");
        Intrinsics.checkNotNullParameter(p15, "p4");
        Intrinsics.checkNotNullParameter(p16, "p5");
        return (Boolean) function6.invoke(p11, p12, p13, p14, p15, p16);
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    /* JADX INFO: renamed from: a */
    public boolean mo44663a() {
        return ((RadioGroup) findViewById(R$id.rg_account)).getCheckedRadioButtonId() == R$id.rb_check_account;
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @NotNull
    public String getAccount() {
        return ((TitleEditTextView) findViewById(R$id.ted_account)).getText();
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @NotNull
    public String getAccountName() {
        return ((TitleEditTextView) findViewById(R$id.ted_account_holder)).getText();
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @Nullable
    /* JADX INFO: renamed from: getBankInfo, reason: from getter */
    public FiatCapitualBank getF37524c() {
        return this.f37524c;
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @NotNull
    public String getBankNo() {
        return ((TitleChooseView) findViewById(R$id.ted_bank_no)).getText();
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @NotNull
    public String getBranch() {
        return ((TitleEditTextView) findViewById(R$id.ted_branch)).getText();
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @NotNull
    public String getCpf() {
        return ((TitleEditTextView) findViewById(R$id.ted_cpf)).getText();
    }

    @Override // com.kubi.otc.fiat.withdraw.capitual.ParamsResult.b
    @NotNull
    public String getDiscription() {
        return ((TitleEditTextView) findViewById(R$id.ted_remarks)).getText();
    }

    /* JADX INFO: renamed from: j */
    public final void m44664j(@Nullable TitleChooseView titleChooseView, @Nullable final TextView textView, @Nullable final Boolean bool) {
        if (titleChooseView == null || textView == null) {
            return;
        }
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(((TitleEditTextView) findViewById(R$id.ted_account_holder)).getEditText());
        AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(((TitleEditTextView) findViewById(R$id.ted_cpf)).getEditText());
        AbstractC46099a<CharSequence> abstractC46099aM784d3 = C0206f.m784d(((TitleEditTextView) findViewById(R$id.ted_account)).getEditText());
        AbstractC46099a<CharSequence> abstractC46099aM784d4 = C0206f.m784d(((TitleChooseView) findViewById(R$id.ted_bank_no)).getTextView());
        AbstractC46099a<CharSequence> abstractC46099aM784d5 = C0206f.m784d(((TitleEditTextView) findViewById(R$id.ted_branch)).getEditText());
        AbstractC46099a<CharSequence> abstractC46099aM784d6 = C0206f.m784d(titleChooseView.getTextView());
        final Function6 function6 = new Function6() { // from class: com.kubi.otc.fiat.withdraw.capitual.n0
            @Override // p852kotlin.jvm.functions.Function6
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PixTedTypeContentView.m44657k(bool, (CharSequence) obj, (CharSequence) obj2, (CharSequence) obj3, (CharSequence) obj4, (CharSequence) obj5, (CharSequence) obj6);
            }
        };
        Observable observableCombineLatest = Observable.combineLatest(abstractC46099aM784d, abstractC46099aM784d2, abstractC46099aM784d3, abstractC46099aM784d4, abstractC46099aM784d5, abstractC46099aM784d6, new io.reactivex.functions.Function6() { // from class: com.kubi.otc.fiat.withdraw.capitual.o0
            @Override // io.reactivex.functions.Function6
            public final Object apply(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return PixTedTypeContentView.m44658l(function6, obj, obj2, obj3, obj4, obj5, obj6);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PixTedTypeContentView.m44659m(textView, (Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.q0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PixTedTypeContentView.m44660n(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.capitual.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PixTedTypeContentView.m44661o((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCombineLatest.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.fiat.withdraw.capitual.s0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                PixTedTypeContentView.m44662p(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, C27046k.m66696k(this));
    }

    public final void setAccountName(@Nullable String name) {
        ((TitleEditTextView) findViewById(R$id.ted_account_holder)).setText(C27041f.m66668h(name));
    }

    public final void setBankInfo(@Nullable FiatCapitualBank bank) {
        ((TitleChooseView) findViewById(R$id.ted_bank_no)).setText(C27041f.m66668h(bank != null ? bank.getIspbCode() : null));
        this.f37524c = bank;
    }

    public final void setBankNoListener(@Nullable Function0<Unit> listener) {
        this.f37523b = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Unit m44659m(TextView textView, Boolean bool) {
        textView.setEnabled(C27025c.m66566d(bool));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m44660n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Unit m44661o(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m44662p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
