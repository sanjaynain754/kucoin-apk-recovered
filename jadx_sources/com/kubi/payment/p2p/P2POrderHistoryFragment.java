package com.kubi.payment.p2p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.otc.order.OtcOrderListFragment;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37657n0;
import p270ft.C37683s1;
import p270ft.C37688t1;
import p274fx.C37727a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: P2POrderHistoryFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2POrderHistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderHistoryBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "P2POrderHistoryChildFragment", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2POrderHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2POrderHistoryFragment.kt\ncom/kubi/payment/p2p/P2POrderHistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,159:1\n147#2,16:160\n*S KotlinDebug\n*F\n+ 1 P2POrderHistoryFragment.kt\ncom/kubi/payment/p2p/P2POrderHistoryFragment\n*L\n29#1:160,16\n*E\n"})
public final class P2POrderHistoryFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f39684V = {Reflection.property1(new PropertyReference1Impl(P2POrderHistoryFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderHistoryBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f39685U = C45681e.m100799e(this, new Function1<P2POrderHistoryFragment, C37683s1>() { // from class: com.kubi.payment.p2p.P2POrderHistoryFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37683s1 invoke(@NotNull P2POrderHistoryFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37683s1.m84956a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37683s1, Unit>() { // from class: com.kubi.payment.p2p.P2POrderHistoryFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37683s1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37683s1 c37683s1) {
            invoke(c37683s1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: P2POrderHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2POrderHistoryFragment$P2POrderHistoryChildFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderHistoryChildBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderHistoryChildBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tradeSide", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nP2POrderHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2POrderHistoryFragment.kt\ncom/kubi/payment/p2p/P2POrderHistoryFragment$P2POrderHistoryChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,159:1\n147#2,16:160\n*S KotlinDebug\n*F\n+ 1 P2POrderHistoryFragment.kt\ncom/kubi/payment/p2p/P2POrderHistoryFragment$P2POrderHistoryChildFragment\n*L\n77#1:160,16\n*E\n"})
    public static final class P2POrderHistoryChildFragment extends BaseFragment {

        /* JADX INFO: renamed from: U */
        @NotNull
        public final InterfaceC24293a f39688U = C45681e.m100799e(this, new Function1<P2POrderHistoryChildFragment, C37688t1>() { // from class: com.kubi.payment.p2p.P2POrderHistoryFragment$P2POrderHistoryChildFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37688t1 invoke(@NotNull P2POrderHistoryFragment.P2POrderHistoryChildFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C37688t1.m84967a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C37688t1, Unit>() { // from class: com.kubi.payment.p2p.P2POrderHistoryFragment$P2POrderHistoryChildFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C37688t1 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C37688t1 c37688t1) {
                invoke(c37688t1);
                return Unit.INSTANCE;
            }
        });

        /* JADX INFO: renamed from: V */
        @NotNull
        public String f39689V = "";

        /* JADX INFO: renamed from: X */
        public static final /* synthetic */ KProperty<Object>[] f39687X = {Reflection.property1(new PropertyReference1Impl(P2POrderHistoryChildFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderHistoryChildBinding;", 0))};

        /* JADX INFO: renamed from: W */
        @NotNull
        public static final Companion f39686W = new Companion(null);

        /* JADX INFO: compiled from: P2POrderHistoryFragment.kt */
        @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2POrderHistoryFragment$P2POrderHistoryChildFragment$Companion;", "", "<init>", "()V", "PROCESSING", "", "DONE", OrderDetailInfo.ORDER_STATUS_CANCELED, "newInstance", "Lcom/kubi/payment/p2p/P2POrderHistoryFragment$P2POrderHistoryChildFragment;", "tradeSide", "newInstance$PaymentLib_googleRelease", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public static /* synthetic */ P2POrderHistoryChildFragment newInstance$PaymentLib_googleRelease$default(Companion companion, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = null;
                }
                return companion.newInstance$PaymentLib_googleRelease(str);
            }

            @NotNull
            public final P2POrderHistoryChildFragment newInstance$PaymentLib_googleRelease(@Nullable String tradeSide) {
                P2POrderHistoryChildFragment p2POrderHistoryChildFragment = new P2POrderHistoryChildFragment();
                p2POrderHistoryChildFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("side", tradeSide)));
                return p2POrderHistoryChildFragment;
            }
        }

        /* JADX INFO: renamed from: com.kubi.payment.p2p.P2POrderHistoryFragment$P2POrderHistoryChildFragment$a */
        /* JADX INFO: compiled from: P2POrderHistoryFragment.kt */
        @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/p2p/P2POrderHistoryFragment$P2POrderHistoryChildFragment$onViewCreated$1$2", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", ViewProps.POSITION, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C21068a extends ViewPager2.OnPageChangeCallback {
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                C44128b.m97266j("payment", "tab2 position:" + position);
            }
        }

        /* JADX INFO: renamed from: o3 */
        public static final Fragment m48449o3(P2POrderHistoryChildFragment p2POrderHistoryChildFragment, int i11) {
            return OtcOrderListFragment.f37838e0.newInstance(p2POrderHistoryChildFragment.f39689V, null, true);
        }

        /* JADX INFO: renamed from: p3 */
        public static final Fragment m48450p3(P2POrderHistoryChildFragment p2POrderHistoryChildFragment, int i11) {
            return OtcOrderListFragment.f37838e0.newInstance(p2POrderHistoryChildFragment.f39689V, "PROCESSING", true);
        }

        /* JADX INFO: renamed from: q3 */
        public static final Fragment m48451q3(P2POrderHistoryChildFragment p2POrderHistoryChildFragment, int i11) {
            return OtcOrderListFragment.f37838e0.newInstance(p2POrderHistoryChildFragment.f39689V, "DONE", true);
        }

        /* JADX INFO: renamed from: r3 */
        public static final Fragment m48452r3(P2POrderHistoryChildFragment p2POrderHistoryChildFragment, int i11) {
            return OtcOrderListFragment.f37838e0.newInstance(p2POrderHistoryChildFragment.f39689V, OrderDetailInfo.ORDER_STATUS_CANCELED, true);
        }

        /* JADX INFO: renamed from: n3 */
        public final C37688t1 m48453n3() {
            return (C37688t1) this.f39688U.getValue(this, f39687X[0]);
        }

        @Override // com.kubi.sdk.BaseFragment
        @NotNull
        public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            View viewInflate = inflater.inflate(R$layout.payment_fragment_p2p_order_history_child, container, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return viewInflate;
        }

        @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(view, "view");
            super.onViewCreated(view, savedInstanceState);
            C37688t1 c37688t1M48453n3 = m48453n3();
            if (c37688t1M48453n3 != null) {
                ArrayList<CharSequence> arrayList = new ArrayList<>();
                arrayList.addAll(CollectionsKt.listOf((Object[]) new String[]{getStringRes(R$string.all, new Object[0]), getStringRes(R$string.payment_status_processing, new Object[0]), getStringRes(R$string.completed, new Object[0]), getStringRes(R$string.canceled, new Object[0])}));
                c37688t1M48453n3.f84668c.setOffscreenPageLimit(3);
                ViewPager2 viewPager2 = c37688t1M48453n3.f84668c;
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                Lifecycle lifecycle = getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                C37727a c37727a = new C37727a(childFragmentManager, lifecycle);
                c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P2POrderHistoryFragment.P2POrderHistoryChildFragment.m48449o3(this.f40160b, ((Integer) obj).intValue());
                    }
                });
                c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.x
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P2POrderHistoryFragment.P2POrderHistoryChildFragment.m48450p3(this.f40165b, ((Integer) obj).intValue());
                    }
                });
                c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.y
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P2POrderHistoryFragment.P2POrderHistoryChildFragment.m48451q3(this.f40166b, ((Integer) obj).intValue());
                    }
                });
                c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.z
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return P2POrderHistoryFragment.P2POrderHistoryChildFragment.m48452r3(this.f40167b, ((Integer) obj).intValue());
                    }
                });
                viewPager2.setAdapter(c37727a);
                c37688t1M48453n3.f84668c.registerOnPageChangeCallback(new C21068a());
                c37688t1M48453n3.f84667b.setNeedBold(true);
                c37688t1M48453n3.f84667b.m55601z(c37688t1M48453n3.f84668c, arrayList);
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(@Nullable Bundle savedInstanceState) {
            String strM56285z;
            super.onCreate(savedInstanceState);
            Bundle arguments = getArguments();
            if (arguments != null) {
                strM56285z = RouteExKt.m56285z(arguments, "side", "");
            } else {
                strM56285z = null;
            }
            this.f39689V = C45148b.m99794d(strM56285z);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.P2POrderHistoryFragment$a */
    /* JADX INFO: compiled from: P2POrderHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/payment/p2p/P2POrderHistoryFragment$onViewCreated$1$2", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", ViewProps.POSITION, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21071a extends ViewPager2.OnPageChangeCallback {
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C44128b.m97266j("payment", "tab1 position:" + position);
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final Fragment m48440o3(int i11) {
        return P2POrderHistoryChildFragment.Companion.newInstance$PaymentLib_googleRelease$default(P2POrderHistoryChildFragment.f39686W, null, 1, null);
    }

    /* JADX INFO: renamed from: p3 */
    public static final Fragment m48441p3(int i11) {
        return P2POrderHistoryChildFragment.f39686W.newInstance$PaymentLib_googleRelease("SELL");
    }

    /* JADX INFO: renamed from: q3 */
    public static final Fragment m48442q3(int i11) {
        return P2POrderHistoryChildFragment.f39686W.newInstance$PaymentLib_googleRelease("BUY");
    }

    /* JADX INFO: renamed from: n3 */
    public final C37683s1 m48444n3() {
        return (C37683s1) this.f39685U.getValue(this, f39684V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.payment_fragment_p2p_order_history, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C37657n0 c37657n0;
        AppCompatImageView appCompatImageView;
        C37657n0 c37657n1;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37683s1 c37683s1M48444n3 = m48444n3();
        if (c37683s1M48444n3 != null) {
            ArrayList<CharSequence> arrayList = new ArrayList<>();
            arrayList.addAll(CollectionsKt.listOf((Object[]) new String[]{getStringRes(R$string.all, new Object[0]), getStringRes(R$string.otc_buy, new Object[0]), getStringRes(R$string.otc_sell, new Object[0])}));
            c37683s1M48444n3.f84617d.setOffscreenPageLimit(2);
            ViewPager2 viewPager2 = c37683s1M48444n3.f84617d;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            C37727a c37727a = new C37727a(childFragmentManager, lifecycle);
            c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2POrderHistoryFragment.m48440o3(((Integer) obj).intValue());
                }
            });
            c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2POrderHistoryFragment.m48441p3(((Integer) obj).intValue());
                }
            });
            c37727a.m85027g(new Function1() { // from class: com.kubi.payment.p2p.u
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return P2POrderHistoryFragment.m48442q3(((Integer) obj).intValue());
                }
            });
            viewPager2.setAdapter(c37727a);
            c37683s1M48444n3.f84617d.registerOnPageChangeCallback(new C21071a());
            c37683s1M48444n3.f84616c.setNeedBold(true);
            c37683s1M48444n3.f84616c.m55601z(c37683s1M48444n3.f84617d, arrayList);
        }
        C37683s1 c37683s1M48444n4 = m48444n3();
        if (c37683s1M48444n4 != null && (c37657n1 = c37683s1M48444n4.f84615b) != null && (baseTextView = c37657n1.f84300c) != null) {
            baseTextView.setText(getStringRes(R$string.payment_orders, new Object[0]));
        }
        C37683s1 c37683s1M48444n5 = m48444n3();
        if (c37683s1M48444n5 == null || (c37657n0 = c37683s1M48444n5.f84615b) == null || (appCompatImageView = c37657n0.f84299b) == null) {
            return;
        }
        C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.payment.p2p.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2POrderHistoryFragment.m48443r3(this.f40159b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m48443r3(P2POrderHistoryFragment p2POrderHistoryFragment) {
        FragmentActivity activity = p2POrderHistoryFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }
}
