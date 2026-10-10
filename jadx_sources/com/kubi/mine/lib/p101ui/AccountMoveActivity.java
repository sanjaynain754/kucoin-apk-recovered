package com.kubi.mine.lib.p101ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5286o;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.router.utils.C23636b;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27046k;
import gq.C37986g;
import java.util.ArrayList;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: AccountMoveActivity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\"\u0010\u0018\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f`\u000eJ\u0006\u0010\u0019\u001a\u00020\u0012R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R*\u0010\n\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/AccountMoveActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/BusercenterActivitySystemUpgradeBinding;", "getBinding", "()Lcom/kubi/mine/databinding/BusercenterActivitySystemUpgradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "arrayList", "Ljava/util/ArrayList;", "", "", "Lkotlin/collections/ArrayList;", "isOk", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "finish", "toNext", "getCheckList", "setOk", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountMoveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMoveActivity.kt\ncom/kubi/mine/lib/ui/AccountMoveActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n*L\n1#1,122:1\n45#2,19:123\n*S KotlinDebug\n*F\n+ 1 AccountMoveActivity.kt\ncom/kubi/mine/lib/ui/AccountMoveActivity\n*L\n36#1:123,19\n*E\n"})
public final class AccountMoveActivity extends BaseActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f35169i = C45678b.m100788b(this, new Function1<C37986g, Unit>() { // from class: com.kubi.mine.lib.ui.AccountMoveActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C37986g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37986g c37986g) {
            invoke(c37986g);
            return Unit.INSTANCE;
        }
    }, new Function1<AccountMoveActivity, C37986g>() { // from class: com.kubi.mine.lib.ui.AccountMoveActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37986g invoke(@NotNull AccountMoveActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C37986g.m85847a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: j */
    @NotNull
    public ArrayList<String[]> f35170j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public boolean f35171k;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ KProperty<Object>[] f35168m = {Reflection.property1(new PropertyReference1Impl(AccountMoveActivity.class, "binding", "getBinding()Lcom/kubi/mine/databinding/BusercenterActivitySystemUpgradeBinding;", 0))};

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f35167l = new Companion(null);

    /* JADX INFO: compiled from: AccountMoveActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/AccountMoveActivity$Companion;", "", "<init>", "()V", "startToMove", "", "loginUserEntity", "Lcom/kubi/user/model/LoginUserEntity;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void startToMove(@NotNull LoginUserEntity loginUserEntity) {
            Intrinsics.checkNotNullParameter(loginUserEntity, "loginUserEntity");
            UserInfo.a.u(loginUserEntity);
            Context contextM56289c = C23636b.m56289c();
            if (contextM56289c != null) {
                contextM56289c.startActivity(new Intent(contextM56289c, (Class<?>) AccountMoveH5Activity.class));
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m41865a0() {
        this.f35171k = true;
        UserInfo.c().setStatus(10);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AccountMoveActivity$setOk$1(null), 3, null);
        IUserService iUserServiceM41834m = MineDepend.f35159a.m41834m();
        if (iUserServiceM41834m != null) {
            IUserService.z(iUserServiceM41834m, (Function0) null, 1, (Object) null);
        }
        preformBackPressed();
    }

    /* JADX INFO: renamed from: W */
    public final C37986g m41863W() {
        return (C37986g) this.f35169i.getValue(this, f35168m[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final ArrayList<String[]> m41864X() {
        return this.f35170j;
    }

    /* JADX INFO: renamed from: Y */
    private final void m41860Y() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AccountMoveActivity$initView$1(this, null));
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m41861Z(AccountMoveActivity accountMoveActivity) {
        accountMoveActivity.m41862b0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m41862b0() {
        TextView textView;
        ScrollView scrollView;
        FrameLayout frameLayout;
        C37986g c37986gM41863W = m41863W();
        if (c37986gM41863W != null && (frameLayout = c37986gM41863W.f85461b) != null) {
            frameLayout.setVisibility(0);
        }
        C37986g c37986gM41863W2 = m41863W();
        if (c37986gM41863W2 != null && (scrollView = c37986gM41863W2.f85463d) != null) {
            scrollView.setVisibility(8);
        }
        C37986g c37986gM41863W3 = m41863W();
        if (c37986gM41863W3 != null && (textView = c37986gM41863W3.f85466g) != null) {
            textView.setVisibility(8);
        }
        C5286o.m6327k(getSupportFragmentManager(), MineDepend.f35159a.m41827f().m56310c(), R$id.fl_container);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (!this.f35171k) {
            UserInfo.a.u(new LoginUserEntity());
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        TextView textView;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.busercenter_activity_system_upgrade);
        hideTitleBar();
        m41860Y();
        C37986g c37986gM41863W = m41863W();
        if (c37986gM41863W != null && (textView = c37986gM41863W.f85466g) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountMoveActivity.m41861Z(this.f35285b);
                }
            }, 1, null);
        }
    }
}
