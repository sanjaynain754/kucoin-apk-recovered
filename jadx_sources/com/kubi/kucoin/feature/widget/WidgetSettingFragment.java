package com.kubi.kucoin.feature.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kucoin.feature.widget.appwidget.WidgetDeskSettingFragment;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.p100ui.floating.setting.NewFloatingWindowSettingActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
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
import sl.C44517f;
import w00.C45681e;

/* JADX INFO: compiled from: WidgetSettingFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/WidgetSettingFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "fragmentWidgetSettingBinding", "Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentWidgetSettingBinding;", "getFragmentWidgetSettingBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentWidgetSettingBinding;", "fragmentWidgetSettingBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWidgetSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetSettingFragment.kt\ncom/kubi/kucoin/feature/widget/WidgetSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,46:1\n147#2,16:47\n*S KotlinDebug\n*F\n+ 1 WidgetSettingFragment.kt\ncom/kubi/kucoin/feature/widget/WidgetSettingFragment\n*L\n20#1:47,16\n*E\n"})
public final class WidgetSettingFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f27791V = {Reflection.property1(new PropertyReference1Impl(WidgetSettingFragment.class, "fragmentWidgetSettingBinding", "getFragmentWidgetSettingBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentWidgetSettingBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f27792U = C45681e.m100799e(this, new Function1<WidgetSettingFragment, C44517f>() { // from class: com.kubi.kucoin.feature.widget.WidgetSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44517f invoke(@NotNull WidgetSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44517f.m98494a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44517f, Unit>() { // from class: com.kubi.kucoin.feature.widget.WidgetSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44517f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44517f c44517f) {
            invoke(c44517f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final Unit m32111m3() {
        NewFloatingWindowSettingActivity.INSTANCE.launch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final C44517f m32113l3() {
        return (C44517f) this.f27792U.getValue(this, f27791V[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_widget_setting, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle("");
        C44517f c44517fM32113l3 = m32113l3();
        if (c44517fM32113l3 != null && (textView2 = c44517fM32113l3.f98656b) != null) {
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.kucoin.feature.widget.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WidgetSettingFragment.m32111m3();
                }
            }, 1, null);
        }
        C44517f c44517fM32113l4 = m32113l3();
        if (c44517fM32113l4 == null || (textView = c44517fM32113l4.f98657c) == null) {
            return;
        }
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.kucoin.feature.widget.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetSettingFragment.m32112n3(this.f27848b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m32112n3(WidgetSettingFragment widgetSettingFragment) {
        Context context = widgetSettingFragment.getContext();
        if (context != null) {
            WidgetDeskSettingFragment.f27794W.toWidgetDeskSettingFragment(context);
        }
        return Unit.INSTANCE;
    }
}
