package com.kubi.margin.trade.etf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36940t0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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

/* JADX INFO: compiled from: EtfRecordActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfRecordActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "bmarginLayoutSwitchFragmentbarBinding", "Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;", "getBmarginLayoutSwitchFragmentbarBinding", "()Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;", "bmarginLayoutSwitchFragmentbarBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "type", "", "getType", "()Ljava/lang/Integer;", "type$delegate", "Lkotlin/Lazy;", "getLayout", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initNavigationBar", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEtfRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtfRecordActivity.kt\ncom/kubi/margin/trade/etf/EtfRecordActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n*L\n1#1,58:1\n49#2,15:59\n*S KotlinDebug\n*F\n+ 1 EtfRecordActivity.kt\ncom/kubi/margin/trade/etf/EtfRecordActivity\n*L\n28#1:59,15\n*E\n"})
public final class EtfRecordActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ KProperty<Object>[] f33888x = {Reflection.property1(new PropertyReference1Impl(EtfRecordActivity.class, "bmarginLayoutSwitchFragmentbarBinding", "getBmarginLayoutSwitchFragmentbarBinding()Lcom/kubi/margin/databinding/BmarginLayoutSwitchFragmentbarBinding;", 0))};

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f33889v = C45678b.m100788b(this, new Function1<C36940t0, Unit>() { // from class: com.kubi.margin.trade.etf.EtfRecordActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C36940t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36940t0 c36940t0) {
            invoke(c36940t0);
            return Unit.INSTANCE;
        }
    }, new Function1<EtfRecordActivity, C36940t0>() { // from class: com.kubi.margin.trade.etf.EtfRecordActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36940t0 invoke(@NotNull EtfRecordActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s293364695(...)");
            return C36940t0.m82749a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f33890w = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.etf.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EtfRecordActivity.m40311p0(this.f33908b);
        }
    });

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public Void m40314o0() {
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.bmargin_layout_switch_fragmentbar;
    }

    /* JADX INFO: renamed from: m0 */
    public final C36940t0 m40312m0() {
        return (C36940t0) this.f33889v.getValue(this, f33888x[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public final Integer m40313n0() {
        return (Integer) this.f33890w.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public static final Integer m40311p0(EtfRecordActivity etfRecordActivity) {
        Intent intent = etfRecordActivity.getIntent();
        if (intent != null) {
            return Integer.valueOf(RouteExKt.m56225P(intent, "type", 0));
        }
        return null;
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ /* synthetic */ View mo32393c0() {
        return (View) m40314o0();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        String strM56237a0;
        super.onCreate(savedInstanceState);
        C36940t0 c36940t0M40312m0 = m40312m0();
        if (c36940t0M40312m0 != null) {
            c36940t0M40312m0.f81983b.setTextOneLabel(getString(R$string.etf_buy_record));
            c36940t0M40312m0.f81983b.setTextTwoLabel(getString(R$string.etf_sell_record));
            ArrayList arrayList = new ArrayList();
            Intent intent = getIntent();
            if (intent != null) {
                strM56237a0 = RouteExKt.m56237a0(intent, "coin");
            } else {
                strM56237a0 = null;
            }
            EtfRecordListFragment.Companion companion = EtfRecordListFragment.f33891i0;
            arrayList.add(companion.newInstance("0", strM56237a0));
            arrayList.add(companion.newInstance("1", strM56237a0));
            c36940t0M40312m0.f81983b.m54803h(arrayList, getSupportFragmentManager());
            c36940t0M40312m0.f81983b.setCurrentItem(C27039d.m66650j(m40313n0()));
        }
    }
}
