package com.kubi.kucoin.feature.widget.appwidget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cl.InterfaceC4995a;
import com.kubi.kucoin.feature.widget.ChooseSymbolFragment;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.kucoin.market.monitor.lib.R$mipmap;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p265fl.C37565d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import sl.C44516e;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: WidgetDeskSettingFragment.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetDeskSettingFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "fragmentWidgetDeskSettingBinding", "Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentWidgetDeskSettingBinding;", "getFragmentWidgetDeskSettingBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentWidgetDeskSettingBinding;", "fragmentWidgetDeskSettingBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "timeDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "getTimeDialog", "()Lcom/kubi/resources/dialog/DialogFragmentHelper;", "timeDialog$delegate", "Lkotlin/Lazy;", "onResume", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWidgetDeskSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetDeskSettingFragment.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetDeskSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n147#2,16:140\n17#3,2:156\n67#4:158\n58#4,2:159\n67#4:161\n1563#5:162\n1634#5,3:163\n*S KotlinDebug\n*F\n+ 1 WidgetDeskSettingFragment.kt\ncom/kubi/kucoin/feature/widget/appwidget/WidgetDeskSettingFragment\n*L\n39#1:140,16\n114#1:156,2\n126#1:158\n54#1:159,2\n47#1:161\n49#1:162\n49#1:163,3\n*E\n"})
public final class WidgetDeskSettingFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f27796U = C45681e.m100799e(this, new Function1<WidgetDeskSettingFragment, C44516e>() { // from class: com.kubi.kucoin.feature.widget.appwidget.WidgetDeskSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44516e invoke(@NotNull WidgetDeskSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44516e.m98492a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44516e, Unit>() { // from class: com.kubi.kucoin.feature.widget.appwidget.WidgetDeskSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44516e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44516e c44516e) {
            invoke(c44516e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f27797V = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.feature.widget.appwidget.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetDeskSettingFragment.m32120r3(this.f27812b);
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f27795X = {Reflection.property1(new PropertyReference1Impl(WidgetDeskSettingFragment.class, "fragmentWidgetDeskSettingBinding", "getFragmentWidgetDeskSettingBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/FragmentWidgetDeskSettingBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f27794W = new Companion(null);

    /* JADX INFO: compiled from: WidgetDeskSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/appwidget/WidgetDeskSettingFragment$Companion;", "", "<init>", "()V", "ACTION_WIDGET_DESK_SETTING", "", "toWidgetDeskSettingFragment", "", "context", "Landroid/content/Context;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void toWidgetDeskSettingFragment(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56573m0(context, context.getString(R$string.widget_tracking), WidgetDeskSettingFragment.class.getName());
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static final DialogFragmentHelper m32120r3(final WidgetDeskSettingFragment widgetDeskSettingFragment) {
        final Ref.IntRef intRef = new Ref.IntRef();
        C37565d c37565d = C37565d.f83517a;
        int iM102323e = C46392a.m102323e(c37565d.m84601g(), 1);
        intRef.element = iM102323e;
        if (iM102323e >= 4) {
            intRef.element = 3;
        }
        ArrayList<Pair<String, Long>> arrayListM84607o = c37565d.m84607o();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM84607o, 10));
        Iterator<T> it = arrayListM84607o.iterator();
        while (it.hasNext()) {
            arrayList.add(new SelectEntity(null, (CharSequence) ((Pair) it.next()).getFirst(), null, null, null, null, null, null, null, false, false, null, 4093, null));
        }
        ((SelectEntity) arrayList.get(intRef.element)).setChecked(true);
        return BottomSheetDialogHelper.m58944B(BottomSheetDialogHelper.f48599a, arrayList, new BiConsumer() { // from class: com.kubi.kucoin.feature.widget.appwidget.d
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                WidgetDeskSettingFragment.m32121s3(intRef, widgetDeskSettingFragment, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
    }

    /* JADX INFO: renamed from: n3 */
    public final C44516e m32122n3() {
        return (C44516e) this.f27796U.getValue(this, f27795X[0]);
    }

    /* JADX INFO: renamed from: o3 */
    public final DialogFragmentHelper m32123o3() {
        return (DialogFragmentHelper) this.f27797V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_widget_desk_setting, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ImageView imageView;
        String string;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        ImageView imageView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        boolean zM33187l = DayNightThemeManager.f28592a.m33187l();
        getTitleBar().setTitle(getString(R$string.widget_tracking));
        if (zM33187l) {
            C44516e c44516eM32122n3 = m32122n3();
            if (c44516eM32122n3 != null && (imageView = c44516eM32122n3.f98649d) != null) {
                imageView.setImageResource(R$mipmap.ic_app_widget_eu_white_bg);
            }
        } else {
            C44516e c44516eM32122n4 = m32122n3();
            if (c44516eM32122n4 != null && (imageView2 = c44516eM32122n4.f98649d) != null) {
                imageView2.setImageResource(R$mipmap.ic_app_widget_eu_black_bg);
            }
        }
        Context context = getContext();
        if (context != null) {
            Object objM56186h = Router.f46192a.m56186h(InterfaceC4995a.class, SiteInfoManager.f47913a.m58109c());
            string = context.getString(objM56186h != null ? ((InterfaceC4995a) objM56186h).getName() : R$string.site_name_global);
        } else {
            string = null;
        }
        String string2 = getString(R$string.widget_tip_03, string);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C44516e c44516eM32122n5 = m32122n3();
        if (c44516eM32122n5 != null && (textView3 = c44516eM32122n5.f98654i) != null) {
            textView3.setText(string2);
        }
        C44516e c44516eM32122n6 = m32122n3();
        if (c44516eM32122n6 != null && (textView2 = c44516eM32122n6.f98653h) != null) {
            C27096v0 c27096v0 = new C27096v0();
            C27017c c27017c = C27017c.f54310a;
            textView2.setText(c27096v0.append(c27017c.m66516f(R$string.widget_tip_02_start, new Object[0])).append(C33627eb.f69716f).m66907g(c27017c.m66516f(R$string.widget_tip_02_end, new Object[0]), C27029c.m66603f(this, 12)));
        }
        C37565d c37565d = C37565d.f83517a;
        int iM102323e = C46392a.m102323e(c37565d.m84601g(), 1);
        if (iM102323e >= 4) {
            iM102323e = 3;
        }
        C44516e c44516eM32122n7 = m32122n3();
        if (c44516eM32122n7 != null && (textView = c44516eM32122n7.f98651f) != null) {
            textView.setText(c37565d.m84607o().get(iM102323e).getFirst());
        }
        C44516e c44516eM32122n8 = m32122n3();
        if (c44516eM32122n8 != null && (frameLayout2 = c44516eM32122n8.f98647b) != null) {
            C27046k.m66711z(frameLayout2, 0L, new Function0() { // from class: com.kubi.kucoin.feature.widget.appwidget.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WidgetDeskSettingFragment.m32118p3(this.f27813b);
                }
            }, 1, null);
        }
        C44516e c44516eM32122n9 = m32122n3();
        if (c44516eM32122n9 == null || (frameLayout = c44516eM32122n9.f98648c) == null) {
            return;
        }
        C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.kucoin.feature.widget.appwidget.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WidgetDeskSettingFragment.m32119q3(this.f27814b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m32118p3(WidgetDeskSettingFragment widgetDeskSettingFragment) {
        DialogFragmentHelper dialogFragmentHelperM32123o3 = widgetDeskSettingFragment.m32123o3();
        FragmentManager childFragmentManager = widgetDeskSettingFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM32123o3.show(childFragmentManager, "timeDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m32119q3(WidgetDeskSettingFragment widgetDeskSettingFragment) {
        Context context = widgetDeskSettingFragment.getContext();
        if (context != null) {
            ChooseSymbolFragment.f27783Y.toChooseSymbolFragment(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m32121s3(Ref.IntRef intRef, WidgetDeskSettingFragment widgetDeskSettingFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        String packageName;
        TextView textView;
        if (baseViewHolder.getAdapterPosition() != intRef.element) {
            intRef.element = baseViewHolder.getAdapterPosition();
            C46392a.m102329l(C37565d.f83517a.m84601g(), baseViewHolder.getAdapterPosition());
            C44516e c44516eM32122n3 = widgetDeskSettingFragment.m32122n3();
            if (c44516eM32122n3 != null && (textView = c44516eM32122n3.f98651f) != null) {
                textView.setText(interfaceC24339a.getLabel());
            }
            FragmentActivity activity = widgetDeskSettingFragment.getActivity();
            if (activity != null) {
                Intent intent = new Intent("update_duration_tag");
                Context context = widgetDeskSettingFragment.getContext();
                if (context != null) {
                    packageName = context.getPackageName();
                } else {
                    packageName = null;
                }
                intent.setPackage(packageName);
                activity.sendBroadcast(intent);
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        TextView textView;
        super.onResume();
        C44516e c44516eM32122n3 = m32122n3();
        if (c44516eM32122n3 != null && (textView = c44516eM32122n3.f98650e) != null) {
            textView.setText(getString(R$string.widget_count, String.valueOf(C37565d.f83517a.m84606n())));
        }
    }
}
