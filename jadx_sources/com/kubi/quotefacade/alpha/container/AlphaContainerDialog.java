package com.kubi.quotefacade.alpha.container;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.alpha.AlphaCurrent;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.AlphaNetworks;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.BiConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: AlphaContainerDialog.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ:\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00070\u0014J4\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerDialog;", "", "<init>", "()V", "TAG", "", "alertChooseTimePeriod", "", "fm", "Landroidx/fragment/app/FragmentManager;", "currentParams", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "onSelected", "Lkotlin/Function0;", "alertChooseNetwork", "selectedIndex", "", "networkList", "", "Lcom/kubi/quotefacade/entity/AlphaNetworks;", "Lkotlin/Function1;", "alertFilterPop", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "filterType", "chainFilterData", "Lcom/kubi/quotefacade/entity/ChainFilterData;", "onFiltered", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaContainerDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AlphaContainerDialog f41156a = new AlphaContainerDialog();

    /* JADX INFO: renamed from: k */
    public static final Unit m50370k(List list, int i11, Function1 function1, BaseViewHolder viewHolder, final DialogFragmentHelper dialogHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogHelper, "dialogHelper");
        ((RecyclerView) viewHolder.getView(R$id.recyclerView)).setAdapter(new AlphaContainerDialog$alertChooseNetwork$1$1$1(list, i11, function1, dialogHelper, R$layout.kucoin_item_simple_text));
        View view = viewHolder.getView(R$id.layoutDialogRoot);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.quotefacade.alpha.container.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaContainerDialog.m50371l(dialogHelper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m50372m(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder it) {
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(it, "it");
        Dialog dialog = dialogFragmentHelper.getDialog();
        if (dialog == null) {
            return Unit.INSTANCE;
        }
        try {
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            BottomSheetBehavior bottomSheetBehaviorFrom = frameLayout != null ? BottomSheetBehavior.from(frameLayout) : null;
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setState(3);
            }
            int iM6182d = C5267e0.m6182d() - C27040e.m66658b(64);
            if (C5275i0.m6237b((RecyclerView) dialog.findViewById(R$id.recyclerView)) > iM6182d - C27040e.m66658b(72)) {
                Window window = dialog.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    attributes.height = iM6182d;
                }
                if (bottomSheetBehaviorFrom != null) {
                    bottomSheetBehaviorFrom.setMaxHeight(iM6182d);
                }
                if (bottomSheetBehaviorFrom != null) {
                    bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
                }
            }
        } catch (Exception e11) {
            C44128b.m97263g("AlphaContainerDialog", e11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m50373o(final AlphaCurrent.a aVar, FragmentManager fragmentManager, final Function0 function0) {
        C27017c c27017c = C27017c.f54310a;
        TimeSelectedEnum timeSelectedEnum = TimeSelectedEnum.TIME_5_MINUTES;
        SelectEntity selectEntity = new SelectEntity(null, c27017c.m66516f(timeSelectedEnum.getResourceId(), new Object[0]), timeSelectedEnum.getConstTimeTag(), null, null, null, null, null, null, false, aVar.getF41148c() == timeSelectedEnum, null, 3065, null);
        TimeSelectedEnum timeSelectedEnum2 = TimeSelectedEnum.TIME_1_HOUR;
        SelectEntity selectEntity2 = new SelectEntity(null, c27017c.m66516f(timeSelectedEnum2.getResourceId(), new Object[0]), timeSelectedEnum2.getConstTimeTag(), null, null, null, null, null, null, false, aVar.getF41148c() == timeSelectedEnum2, null, 3065, null);
        TimeSelectedEnum timeSelectedEnum3 = TimeSelectedEnum.TIME_4_HOURS;
        SelectEntity selectEntity3 = new SelectEntity(null, c27017c.m66516f(timeSelectedEnum3.getResourceId(), new Object[0]), timeSelectedEnum3.getConstTimeTag(), null, null, null, null, null, null, false, aVar.getF41148c() == timeSelectedEnum3, null, 3065, null);
        TimeSelectedEnum timeSelectedEnum4 = TimeSelectedEnum.TIME_24_HOURS;
        BottomSheetDialogHelper.m58955P(BottomSheetDialogHelper.f48599a, CollectionsKt.listOf((Object[]) new SelectEntity[]{selectEntity, selectEntity2, selectEntity3, new SelectEntity(null, c27017c.m66516f(timeSelectedEnum4.getResourceId(), new Object[0]), timeSelectedEnum4.getConstTimeTag(), null, null, null, null, null, null, false, aVar.getF41148c() == timeSelectedEnum4, null, 3065, null)}), new BiConsumer() { // from class: com.kubi.quotefacade.alpha.container.g
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AlphaContainerDialog.m50374p(function0, aVar, (Integer) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, null, false, 12, null).show(fragmentManager, "alertChooseTimePeriod");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m50374p(Function0 function0, AlphaCurrent.a aVar, Integer num, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        TimeSelectedEnum timeSelectedEnumFindEnumByConstTag = TimeSelectedEnum.INSTANCE.findEnumByConstTag(interfaceC24339a.getValue());
        if (timeSelectedEnumFindEnumByConstTag != null) {
            aVar.m50360o(timeSelectedEnumFindEnumByConstTag);
        }
        function0.invoke();
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m50375r(final String str, ChainFilterData chainFilterData, final LifecycleCoroutineScope lifecycleCoroutineScope, final Function1 function1) {
        KCFlutterRouteManager.f46704a.m56849i("market/chainFilter?key_chain_page_from_type=" + str + "&key_chain_filter_data=" + C27099x.m66919i(chainFilterData, false, 2, null), false, new Function1() { // from class: com.kubi.quotefacade.alpha.container.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerDialog.m50376s(str, lifecycleCoroutineScope, function1, (Map) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m50376s(String str, LifecycleCoroutineScope lifecycleCoroutineScope, Function1 function1, Map map) {
        if (map == null || map.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(map.get("key_chain_page_from_type"), str)) {
            return Unit.INSTANCE;
        }
        QuoteExKt.m51873x(lifecycleCoroutineScope, new AlphaContainerDialog$alertFilterPop$1$1$1(String.valueOf(map.get("key_chain_filter_data")), function1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final void m50377i(@NotNull final FragmentManager fm2, final int i11, @NotNull final List<AlphaNetworks> networkList, @NotNull final Function1<? super AlphaNetworks, Unit> onSelected) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(networkList, "networkList");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerDialog.m50369j(networkList, fm2, i11, onSelected);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m50378n(@NotNull final FragmentManager fm2, @NotNull final AlphaCurrent.a currentParams, @NotNull final Function0<Unit> onSelected) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(currentParams, "currentParams");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerDialog.m50373o(currentParams, fm2, onSelected);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m50379q(@NotNull final LifecycleCoroutineScope scope, @NotNull final String filterType, @NotNull final ChainFilterData chainFilterData, @NotNull final Function1<? super ChainFilterData, Unit> onFiltered) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(chainFilterData, "chainFilterData");
        Intrinsics.checkNotNullParameter(onFiltered, "onFiltered");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.container.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaContainerDialog.m50375r(filterType, chainFilterData, scope, onFiltered);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m50369j(List list, FragmentManager fragmentManager, final int i11, final Function1 function1) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        final DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.quote_dialog_choose_network, true).m54237f4(new Function2() { // from class: com.kubi.quotefacade.alpha.container.h
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlphaContainerDialog.m50370k(arrayList, i11, function1, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.m54238g4(new Function1() { // from class: com.kubi.quotefacade.alpha.container.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaContainerDialog.m50372m(dialogFragmentHelperM54237f4, (BaseViewHolder) obj);
            }
        });
        dialogFragmentHelperM54237f4.show(fragmentManager, "alertChooseNetwork");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m50371l(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
