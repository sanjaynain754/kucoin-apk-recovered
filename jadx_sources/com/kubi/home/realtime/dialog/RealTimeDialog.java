package com.kubi.home.realtime.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.dialog.RealTimeDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27023a;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37531m;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p403kj.C41052b;
import p403kj.C41061k;
import p456mj.C42562k;
import p456mj.InterfaceC42553b;
import p575qw.C43881b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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
import ss.C44542b;
import w00.C45681e;

/* JADX INFO: compiled from: RealTimeDialog.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u000fH\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001dH\u0003J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0010¨\u0006&"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/RealTimeDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/home/realtime/frame/manager/IUIDataRefreshListener;", "refreshHelper", "Lcom/kubi/home/realtime/dialog/RealTimeDialogRefreshHelper;", "binding", "Lcom/kubi/home/databinding/HomeLayoutRealtimeDialogBinding;", "getBinding", "()Lcom/kubi/home/databinding/HomeLayoutRealtimeDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isRealtimeV2", "", "()Z", "isRealtimeV2$delegate", "Lkotlin/Lazy;", "isBottomSheet", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onDestroyView", "initLoginListener", "onStart", "initUIListener", "initRecyclerView", "onDestroy", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealTimeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeDialog.kt\ncom/kubi/home/realtime/dialog/RealTimeDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n143#2,20:190\n1#3:210\n*S KotlinDebug\n*F\n+ 1 RealTimeDialog.kt\ncom/kubi/home/realtime/dialog/RealTimeDialog\n*L\n36#1:190,20\n*E\n"})
public final class RealTimeDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public InterfaceC42553b f26129q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public RealTimeDialogRefreshHelper f26130r0;

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC24293a f26131s0 = C45681e.m100799e(this, new Function1<RealTimeDialog, C37531m>() { // from class: com.kubi.home.realtime.dialog.RealTimeDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37531m invoke(@NotNull RealTimeDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37531m.m84525a(fragment.requireView());
        }
    }, new Function1<C37531m, Unit>() { // from class: com.kubi.home.realtime.dialog.RealTimeDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C37531m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37531m c37531m) {
            invoke(c37531m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f26132t0 = LazyKt.lazy(new Function0() { // from class: kj.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(RealTimeDialog.m30113F4());
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f26128v0 = {Reflection.property1(new PropertyReference1Impl(RealTimeDialog.class, "binding", "getBinding()Lcom/kubi/home/databinding/HomeLayoutRealtimeDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f26127u0 = new Companion(null);

    /* JADX INFO: compiled from: RealTimeDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/realtime/dialog/RealTimeDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@Nullable FragmentManager fragmentManager) {
            if (fragmentManager != null) {
                new RealTimeDialog().show(fragmentManager, "RealTimeDialog");
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.dialog.RealTimeDialog$a */
    /* JADX INFO: compiled from: RealTimeDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/home/realtime/dialog/RealTimeDialog$initUIListener$1", "Lcom/kubi/home/realtime/frame/manager/IUIDataRefreshListener;", "onAdd", "", "data", "Lcom/kubi/home/realtime/IRealTimeData;", "immediate", "", "onUpdate", "onRemove", "onRemoveAll", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14826a implements InterfaceC42553b {
        public C14826a() {
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: a */
        public void mo30086a(IRealTimeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
            RealTimeDialogRefreshHelper realTimeDialogRefreshHelper = RealTimeDialog.this.f26130r0;
            if (realTimeDialogRefreshHelper != null) {
                realTimeDialogRefreshHelper.m30150j(data, z11);
            }
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: c */
        public void mo30088c(IRealTimeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: d */
        public void mo30089d(IRealTimeData data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
            RealTimeDialogRefreshHelper realTimeDialogRefreshHelper = RealTimeDialog.this.f26130r0;
            if (realTimeDialogRefreshHelper != null) {
                realTimeDialogRefreshHelper.m30148g(data, z11);
            }
            RealTimeDialogRefreshHelper realTimeDialogRefreshHelper2 = RealTimeDialog.this.f26130r0;
            if (realTimeDialogRefreshHelper2 != null) {
                realTimeDialogRefreshHelper2.m30136m(RealTimeDialog.this.m30130E4(), false);
            }
        }

        @Override // p456mj.InterfaceC42553b
        /* JADX INFO: renamed from: b */
        public void mo30087b(boolean z11) {
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m30110A4(RealTimeDialog realTimeDialog) throws JSONException {
        List<IRealTimeData> listEmptyList;
        RealTimeDialogRefreshHelper realTimeDialogRefreshHelper = realTimeDialog.f26130r0;
        if (realTimeDialogRefreshHelper == null || (listEmptyList = realTimeDialogRefreshHelper.m30134k()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        C42562k.f94240a.m93306F(listEmptyList, true);
        Dialog dialog = realTimeDialog.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "deleteAllActivity", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m30112C4(IRealTimeData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C42562k.f94240a.m93305D(data, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final boolean m30113F4() {
        return C44542b.f98754a.m98608c();
    }

    /* JADX INFO: renamed from: v4 */
    public static final Boolean m30124v4(Boolean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!UserInfo.a.n());
    }

    /* JADX INFO: renamed from: w4 */
    public static final Boolean m30125w4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m30129D4() {
        C14826a c14826a = new C14826a();
        this.f26129q0 = c14826a;
        C42562k.f94240a.m93314m(c14826a);
    }

    /* JADX INFO: renamed from: E4 */
    public final boolean m30130E4() {
        return ((Boolean) this.f26132t0.getValue()).booleanValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.home_layout_realtime_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m30132u4();
        m30128z4();
        m30129D4();
        RealTimeDialogRefreshHelper realTimeDialogRefreshHelper = this.f26130r0;
        if (realTimeDialogRefreshHelper != null) {
            RealTimeDialogRefreshHelper.m30133n(realTimeDialogRefreshHelper, m30130E4(), false, 2, null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "realtimeUpdatesCardPop", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: t4 */
    public final C37531m m30131t4() {
        return (C37531m) this.f26131s0.getValue(this, f26128v0[0]);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: u4 */
    public final void m30132u4() {
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: kj.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealTimeDialog.m30124v4((Boolean) obj);
            }
        };
        Observable observableDistinctUntilChanged = observableE.map(new Function() { // from class: kj.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RealTimeDialog.m30125w4(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: kj.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RealTimeDialog.m30126x4(this.f91271b, (Boolean) obj);
            }
        };
        observableDistinctUntilChanged.subscribe(new Consumer() { // from class: kj.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RealTimeDialog.m30127y4(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m30111B4(RealTimeDialog realTimeDialog) {
        Dialog dialog = realTimeDialog.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m30126x4(RealTimeDialog realTimeDialog, Boolean bool) {
        Dialog dialog = realTimeDialog.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m30127y4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z4 */
    private final void m30128z4() {
        RecyclerView recyclerView;
        C37531m c37531mM30131t4 = m30131t4();
        if (c37531mM30131t4 != null && (recyclerView = c37531mM30131t4.f83369b) != null) {
            DataListAdapter dataListAdapter = new DataListAdapter(null, new Function0() { // from class: kj.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeDialog.m30110A4(this.f91273b);
                }
            }, new Function0() { // from class: kj.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RealTimeDialog.m30111B4(this.f91274b);
                }
            }, 1, null);
            recyclerView.setAdapter(dataListAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.addItemDecoration(new C41052b(C43881b.m96650a(12)));
            new ItemTouchHelper(new C41061k(dataListAdapter, new Function1() { // from class: kj.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RealTimeDialog.m30112C4((IRealTimeData) obj);
                }
            })).attachToRecyclerView(recyclerView);
            this.f26130r0 = new RealTimeDialogRefreshHelper(dataListAdapter);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC42553b interfaceC42553b = this.f26129q0;
        if (interfaceC42553b == null) {
            return;
        }
        C42562k.f94240a.m93308H(interfaceC42553b);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC42553b interfaceC42553b = this.f26129q0;
        if (interfaceC42553b != null) {
            C42562k.f94240a.m93308H(interfaceC42553b);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        WindowManager windowManager;
        Display defaultDisplay;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            FragmentActivity activity = getActivity();
            if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            int i11 = (int) (((double) displayMetrics.heightPixels) * 0.9d);
            View viewFindViewById = dialog.findViewById(R$id.design_bottom_sheet);
            if (viewFindViewById instanceof FrameLayout) {
                frameLayout = (FrameLayout) viewFindViewById;
            } else {
                frameLayout = null;
            }
            if (frameLayout != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                bottomSheetBehaviorFrom.setPeekHeight(i11);
                bottomSheetBehaviorFrom.setMaxHeight(i11);
                bottomSheetBehaviorFrom.setState(3);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                    frameLayout.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
