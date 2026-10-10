package com.kubi.mine.lib.p101ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.p;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27046k;
import com.kubi.widget.web.ui.KWebContainer;
import gq.C37985f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: AccountMoveH5Activity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/AccountMoveH5Activity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/BusercenterActivityMoveH5Binding;", "getBinding", "()Lcom/kubi/mine/databinding/BusercenterActivityMoveH5Binding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isMoveClick", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountMoveH5Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMoveH5Activity.kt\ncom/kubi/mine/lib/ui/AccountMoveH5Activity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n*L\n1#1,61:1\n45#2,19:62\n*S KotlinDebug\n*F\n+ 1 AccountMoveH5Activity.kt\ncom/kubi/mine/lib/ui/AccountMoveH5Activity\n*L\n23#1:62,19\n*E\n"})
public final class AccountMoveH5Activity extends BaseActivity {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f35172k = {Reflection.property1(new PropertyReference1Impl(AccountMoveH5Activity.class, "binding", "getBinding()Lcom/kubi/mine/databinding/BusercenterActivityMoveH5Binding;", 0))};

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f35173i = C45678b.m100788b(this, new Function1<C37985f, Unit>() { // from class: com.kubi.mine.lib.ui.AccountMoveH5Activity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C37985f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37985f c37985f) {
            invoke(c37985f);
            return Unit.INSTANCE;
        }
    }, new Function1<AccountMoveH5Activity, C37985f>() { // from class: com.kubi.mine.lib.ui.AccountMoveH5Activity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37985f invoke(@NotNull AccountMoveH5Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C37985f.m85845a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    public boolean f35174j;

    /* JADX INFO: renamed from: Z */
    public static final Unit m41871Z(AccountMoveH5Activity accountMoveH5Activity) {
        Bundle bundle;
        accountMoveH5Activity.f35174j = true;
        Intent intent = new Intent(accountMoveH5Activity, (Class<?>) AccountMoveActivity.class);
        Intent intent2 = accountMoveH5Activity.getIntent();
        if (intent2 == null || (bundle = intent2.getExtras()) == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        accountMoveH5Activity.startActivity(intent);
        accountMoveH5Activity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Long m41872a0(long j11) {
        return Long.valueOf(((long) 10) - j11);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Long m41873b0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Long) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m41874c0(AccountMoveH5Activity accountMoveH5Activity, long j11) {
        TextView textView;
        String string;
        TextView textView2;
        FrameLayout frameLayout;
        boolean z11 = j11 > 0;
        C37985f c37985fM41876Y = accountMoveH5Activity.m41876Y();
        if (c37985fM41876Y != null && (frameLayout = c37985fM41876Y.f85457b) != null) {
            frameLayout.setEnabled(!z11);
        }
        C37985f c37985fM41876Y2 = accountMoveH5Activity.m41876Y();
        if (c37985fM41876Y2 != null && (textView2 = c37985fM41876Y2.f85458c) != null) {
            textView2.setEnabled(!z11);
        }
        C37985f c37985fM41876Y3 = accountMoveH5Activity.m41876Y();
        if (c37985fM41876Y3 != null && (textView = c37985fM41876Y3.f85458c) != null) {
            int i11 = R$string.have_read_agree;
            if (z11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(j11);
                sb2.append(')');
                string = sb2.toString();
            } else {
                string = "";
            }
            textView.setText(accountMoveH5Activity.getString(i11, string));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public final C37985f m41876Y() {
        return (C37985f) this.f35173i.getValue(this, f35172k[0]);
    }

    @Override // android.app.Activity
    public void finish() {
        if (!this.f35174j) {
            UserInfo.a.u(new LoginUserEntity());
        }
        super.finish();
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m41875d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        FrameLayout frameLayout;
        KWebContainer kWebContainer;
        String strH;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.busercenter_activity_move_h5);
        C37985f c37985fM41876Y = m41876Y();
        if (c37985fM41876Y != null && (kWebContainer = c37985fM41876Y.f85459d) != null) {
            if (MultiLanguageManager.m56979h()) {
                strH = p.a.g();
            } else {
                strH = p.a.h();
            }
            kWebContainer.m67477C(strH);
        }
        C37985f c37985fM41876Y2 = m41876Y();
        if (c37985fM41876Y2 != null && (frameLayout = c37985fM41876Y2.f85457b) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountMoveH5Activity.m41871Z(this.f35292b);
                }
            }, 1, null);
        }
        Observable<Long> observableObserveOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountMoveH5Activity.m41872a0(((Long) obj).longValue());
            }
        };
        Observable observableTake = observableObserveOn.map(new Function() { // from class: com.kubi.mine.lib.ui.k
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AccountMoveH5Activity.m41873b0(function1, obj);
            }
        }).take(11L);
        final Function1 function2 = new Function1() { // from class: com.kubi.mine.lib.ui.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountMoveH5Activity.m41874c0(this.f35309b, ((Long) obj).longValue());
            }
        };
        Disposable disposableSubscribe = observableTake.subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AccountMoveH5Activity.m41875d0(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }
}
