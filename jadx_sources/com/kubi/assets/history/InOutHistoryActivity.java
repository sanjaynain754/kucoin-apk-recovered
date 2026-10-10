package com.kubi.assets.history;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.UrlConstant;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24271s1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27041f;
import i10.Menu;
import java.util.ArrayList;
import lb.C42148c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p569qq.C43852m;
import p637ta.C44849q5;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: InOutHistoryActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000bH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/history/InOutHistoryActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutSwitchFragmentbarBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutSwitchFragmentbarBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "type", "", "getType", "()I", "type$delegate", "Lkotlin/Lazy;", "getLayout", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setRightIcon", "currentItem", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInOutHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InOutHistoryActivity.kt\ncom/kubi/assets/history/InOutHistoryActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n*L\n1#1,135:1\n45#2,19:136\n*S KotlinDebug\n*F\n+ 1 InOutHistoryActivity.kt\ncom/kubi/assets/history/InOutHistoryActivity\n*L\n41#1:136,19\n*E\n"})
public final class InOutHistoryActivity extends BaseActivity {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ KProperty<Object>[] f17625k = {Reflection.property1(new PropertyReference1Impl(InOutHistoryActivity.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutSwitchFragmentbarBinding;", 0))};

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f17626i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f17627j;

    /* JADX INFO: renamed from: com.kubi.assets.history.InOutHistoryActivity$a */
    /* JADX INFO: compiled from: InOutHistoryActivity.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/history/InOutHistoryActivity$onCreate$2$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10137a extends ViewPager.SimpleOnPageChangeListener {
        public C10137a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            InOutHistoryActivity.this.m17286c0(position);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        TitleBar titleBar;
        TitleBar titleBar2;
        super.onCreate(savedInstanceState);
        setContentView(m17279Z());
        C44849q5 c44849q5M17285Y = m17285Y();
        if (c44849q5M17285Y != null && (titleBar2 = c44849q5M17285Y.f100698c) != null) {
            titleBar2.setTitle(getString(R$string.history_record));
        }
        C44849q5 c44849q5M17285Y2 = m17285Y();
        if (c44849q5M17285Y2 != null && (titleBar = c44849q5M17285Y2.f100698c) != null) {
            titleBar.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.assets.history.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InOutHistoryActivity.m17281b0(this.f17682b, view);
                }
            });
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "code");
        boolean zM15129q = AssetExKt.m15129q();
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(getString(R$string.deposit_coin), getString(R$string.withdrawal_label));
        if (!zM15129q) {
            arrayListArrayListOf.add(getString(R$string.transfer));
        }
        InOutHistoryFragment inOutHistoryFragmentM17293O3 = InOutHistoryFragment.m17293O3(1, strM56280w);
        Intrinsics.checkNotNullExpressionValue(inOutHistoryFragmentM17293O3, "newInstance(...)");
        InOutHistoryFragment inOutHistoryFragmentM17293O4 = InOutHistoryFragment.m17293O3(2, strM56280w);
        Intrinsics.checkNotNullExpressionValue(inOutHistoryFragmentM17293O4, "newInstance(...)");
        ArrayList arrayListArrayListOf2 = CollectionsKt.arrayListOf(inOutHistoryFragmentM17293O3, inOutHistoryFragmentM17293O4);
        if (!zM15129q) {
            arrayListArrayListOf2.add(TransferHistoryFragment.f17637f0.newInstance(strM56280w));
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        C27103z c27103z = new C27103z(supportFragmentManager, arrayListArrayListOf2, arrayListArrayListOf);
        C44849q5 c44849q5M17285Y3 = m17285Y();
        if (c44849q5M17285Y3 != null) {
            c44849q5M17285Y3.f100699d.setAdapter(c27103z);
            c44849q5M17285Y3.f100697b.setViewPager(c44849q5M17285Y3.f100699d);
            c44849q5M17285Y3.f100699d.setOffscreenPageLimit(arrayListArrayListOf2.size());
            c44849q5M17285Y3.f100699d.setCurrentItem(m17280a0());
            m17286c0(c44849q5M17285Y3.f100699d.getCurrentItem());
            c44849q5M17285Y3.f100699d.addOnPageChangeListener(new C10137a());
        }
        if (m17280a0() == 1) {
            C43852m.m96595g("withdrawRecordDetail", "statButton", "1", null, 8, null);
        } else {
            C43852m.m96595g("depositRecordDetail", "statButton", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: Z */
    private final int m17279Z() {
        return R$layout.layout_switch_fragmentbar;
    }

    /* JADX INFO: renamed from: a0 */
    private final int m17280a0() {
        return ((Number) this.f17627j.getValue()).intValue();
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m17282d0(InOutHistoryActivity inOutHistoryActivity, View view) {
        AssetsHelper.f18684a.m19155I();
        if (inOutHistoryActivity.m17280a0() == 1) {
            C43852m.m96591c("withdrawRecordDetail", "statButton", "1", null, 8, null);
        } else {
            C43852m.m96591c("depositRecordDetail", "statButton", "1", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m17283e0(int i11, InOutHistoryActivity inOutHistoryActivity, View view) throws JSONException {
        if (i11 == 0) {
            if (AssetExKt.m15129q()) {
                C42148c.m92487b();
                return;
            } else {
                C24271s1.m58531c(Router.f46192a.m56184f(UrlConstant.f16608a.m15458a()), C43852m.m96601m(C27041f.m66668h(inOutHistoryActivity.getF34288V()), "faq", "1")).m4048k();
                return;
            }
        }
        if (i11 != 1) {
            return;
        }
        if (AssetExKt.m15129q()) {
            C42148c.m92488c();
        } else {
            C24271s1.m58531c(Router.f46192a.m56184f(UrlConstant.f16608a.m15463f()), C43852m.m96601m(C27041f.m66668h(inOutHistoryActivity.getF34288V()), "faq", "1")).m4048k();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final C44849q5 m17285Y() {
        return (C44849q5) this.f17626i.getValue(this, f17625k[0]);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17286c0(final int i11) {
        TitleBar titleBar;
        C44849q5 c44849q5M17285Y = m17285Y();
        if (c44849q5M17285Y == null || (titleBar = c44849q5M17285Y.f100698c) == null) {
            return;
        }
        Integer numValueOf = i11 != 2 ? Integer.valueOf(R$drawable.ic2_ranking_20) : null;
        int i12 = R$color.c_text;
        titleBar.setMenu(new Menu(0, numValueOf, Integer.valueOf(i12), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.assets.history.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InOutHistoryActivity.m17282d0(this.f17684b, view);
            }
        }, 0, 377, null), new Menu(0, i11 != 2 ? Integer.valueOf(R$drawable.ic2_novice_guide_20) : null, Integer.valueOf(i12), 0, null, 0, 0, new View.OnClickListener() { // from class: com.kubi.assets.history.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                InOutHistoryActivity.m17283e0(i11, this, view);
            }
        }, 0, 377, null));
    }

    public InOutHistoryActivity() {
        setPageId("historyRecord");
        this.f17626i = C45678b.m100788b(this, new Function1<C44849q5, Unit>() { // from class: com.kubi.assets.history.InOutHistoryActivity$special$$inlined$viewBindingActivity$default$1
            public final void invoke(@NotNull C44849q5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44849q5 c44849q5) {
                invoke(c44849q5);
                return Unit.INSTANCE;
            }
        }, new Function1<InOutHistoryActivity, C44849q5>() { // from class: com.kubi.assets.history.InOutHistoryActivity$special$$inlined$viewBindingActivity$default$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44849q5 invoke(@NotNull InOutHistoryActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                return C44849q5.m99223a(C45678b.m100787a(activity));
            }
        });
        this.f17627j = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.history.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(InOutHistoryActivity.m17284f0(this.f17679b));
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m17281b0(InOutHistoryActivity inOutHistoryActivity, View view) {
        inOutHistoryActivity.onBackPressed();
    }

    /* JADX INFO: renamed from: f0 */
    public static final int m17284f0(InOutHistoryActivity inOutHistoryActivity) {
        Intent intent = inOutHistoryActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return RouteExKt.m56258l(intent, "type", 0);
    }
}
