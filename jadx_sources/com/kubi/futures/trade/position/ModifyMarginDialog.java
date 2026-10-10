package com.kubi.futures.trade.position;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36780i4;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p274fx.C37727a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ModifyMarginDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013¨\u0006&"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ModifyMarginDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexModifyMarginDialogBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexModifyMarginDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "Lkotlin/Lazy;", "addMarginFragment", "Landroidx/fragment/app/Fragment;", "getAddMarginFragment", "()Landroidx/fragment/app/Fragment;", "addMarginFragment$delegate", "reduceMarginFragment", "getReduceMarginFragment", "reduceMarginFragment$delegate", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyMarginDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyMarginDialog.kt\ncom/kubi/futures/trade/position/ModifyMarginDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,113:1\n143#2,20:114\n*S KotlinDebug\n*F\n+ 1 ModifyMarginDialog.kt\ncom/kubi/futures/trade/position/ModifyMarginDialog\n*L\n32#1:114,20\n*E\n"})
public final class ModifyMarginDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f24073q0 = C45681e.m100799e(this, new Function1<ModifyMarginDialog, C36780i4>() { // from class: com.kubi.futures.trade.position.ModifyMarginDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36780i4 invoke(@NotNull ModifyMarginDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36780i4.m82418a(fragment.requireView());
        }
    }, new Function1<C36780i4, Unit>() { // from class: com.kubi.futures.trade.position.ModifyMarginDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36780i4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36780i4 c36780i4) {
            invoke(c36780i4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f24074r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.z1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyMarginDialog.m27547y4(this.f24452b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f24075s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.a2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyMarginDialog.m27542q4(this.f24123b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f24076t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.position.b2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyMarginDialog.m27548z4(this.f24128b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f24072v0 = {Reflection.property1(new PropertyReference1Impl(ModifyMarginDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexModifyMarginDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f24071u0 = new Companion(null);

    /* JADX INFO: compiled from: ModifyMarginDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/position/ModifyMarginDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(position, "position");
            ModifyMarginDialog modifyMarginDialog = new ModifyMarginDialog();
            modifyMarginDialog.setArguments(BundleKt.bundleOf(new Pair("data", position)));
            modifyMarginDialog.show(manager, "ModifyMarginDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.position.ModifyMarginDialog$a */
    /* JADX INFO: compiled from: ModifyMarginDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/trade/position/ModifyMarginDialog$onViewCreated$2", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", ViewProps.POSITION, "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13894a extends ViewPager2.OnPageChangeCallback {
        public C13894a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int position) throws JSONException {
            String str;
            super.onPageSelected(position);
            String strM36552b = C17060n0.m36552b();
            JSONObject jSONObject = new JSONObject();
            ModifyMarginDialog modifyMarginDialog = ModifyMarginDialog.this;
            if (position == 0) {
                str = "AddMargin";
            } else {
                str = "ReduceMargin";
            }
            jSONObject.put("MarginDirection", str);
            jSONObject.put("isTrialFunds", String.valueOf(modifyMarginDialog.m27543t4().isTrialFunds()));
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(strM36552b, "AdjustMargin", "1", jSONObject);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final Fragment m27542q4(ModifyMarginDialog modifyMarginDialog) {
        return AddMarginFragment.f24052b0.newInstance(modifyMarginDialog.m27543t4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public final PositionEntity m27543t4() {
        return (PositionEntity) this.f24074r0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    public static final Fragment m27548z4(ModifyMarginDialog modifyMarginDialog) {
        return ReduceMarginFragment.f24115b0.newInstance(modifyMarginDialog.m27543t4());
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54235d4(0.95f);
        return inflater.inflate(R$layout.bkumex_modify_margin_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewExtKt.m66578i(view, (int) (C5267e0.m6179a() * getF43576g0()));
        C36780i4 c36780i4M27550s4 = m27550s4();
        if (c36780i4M27550s4 == null) {
            return;
        }
        C43852m.m96593e(C17060n0.m36552b(), "AdjustMargin", "1", new JSONObject().put("isTrialFunds", String.valueOf(m27543t4().isTrialFunds())));
        c36780i4M27550s4.f80264d.setOffscreenPageLimit(2);
        ViewPager2 viewPager2 = c36780i4M27550s4.f80264d;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        C37727a c37727a = new C37727a(childFragmentManager, lifecycle);
        c37727a.m85027g(new Function1() { // from class: com.kubi.futures.trade.position.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginDialog.m27544v4(this.f24435b, ((Integer) obj).intValue());
            }
        });
        c37727a.m85027g(new Function1() { // from class: com.kubi.futures.trade.position.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyMarginDialog.m27545w4(this.f24441b, ((Integer) obj).intValue());
            }
        });
        viewPager2.setAdapter(c37727a);
        ArrayList<CharSequence> arrayList = new ArrayList<>();
        arrayList.add(getString(R$string.kumex_modify_margin_add_margin));
        arrayList.add(getString(R$string.kumex_modify_margin_reduce_margin));
        c36780i4M27550s4.f80262b.setNeedBold(true);
        c36780i4M27550s4.f80262b.m55601z(c36780i4M27550s4.f80264d, arrayList);
        c36780i4M27550s4.f80264d.registerOnPageChangeCallback(new C13894a());
        AppCompatImageView ivBack = c36780i4M27550s4.f80263c;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        C27046k.m66711z(ivBack, 0L, new Function0() { // from class: com.kubi.futures.trade.position.y1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifyMarginDialog.m27546x4(this.f24447b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: r4 */
    public final Fragment m27549r4() {
        return (Fragment) this.f24075s0.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    public final C36780i4 m27550s4() {
        return (C36780i4) this.f24073q0.getValue(this, f24072v0[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final Fragment m27551u4() {
        return (Fragment) this.f24076t0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    public static final Fragment m27544v4(ModifyMarginDialog modifyMarginDialog, int i11) {
        return modifyMarginDialog.m27549r4();
    }

    /* JADX INFO: renamed from: w4 */
    public static final Fragment m27545w4(ModifyMarginDialog modifyMarginDialog, int i11) {
        return modifyMarginDialog.m27551u4();
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m27546x4(ModifyMarginDialog modifyMarginDialog) {
        modifyMarginDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final PositionEntity m27547y4(ModifyMarginDialog modifyMarginDialog) {
        PositionEntity positionEntity;
        Bundle arguments = modifyMarginDialog.getArguments();
        if (arguments != null && (positionEntity = (PositionEntity) arguments.getParcelable("data")) != null) {
            return positionEntity;
        }
        return new PositionEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 131071, null);
    }
}
