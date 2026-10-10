package com.kubi.home.v2.biz.grid;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.entity.GridNaviData;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviEditHomeAdapter;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviGroupAdapter;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviShowHomeAdapter;
import com.kubi.home.v2.biz.grid.utils.GridNaviItemDecoration;
import com.kubi.home.v2.biz.grid.utils.GridNavigationDialog;
import com.kubi.home.v2.biz.grid.utils.GridNavigationExKt;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import fj.C37523i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p289gj.C37967a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: GridNavigationFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0005*\u00010\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u000bH\u0002J\b\u00102\u001a\u00020\u001fH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0004\n\u0002\u00101¨\u00064"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/home/v2/biz/grid/GridNavigationVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "getLayout", "", "binding", "Lcom/kubi/home/databinding/HomeFragmentGridNavigationBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/HomeFragmentGridNavigationBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapterHomeShow", "Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviShowHomeAdapter;", "adapterHomeEdit", "Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviEditHomeAdapter;", "adapterCategory", "Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupAdapter;", "initView", "", "onLoad", "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "fillViewData", "Lkotlinx/coroutines/Job;", "event", "Lcom/kubi/home/v2/biz/grid/GridNavigationContract$DataEvent;", "saveCustomsizeGrid", "onBackPressed", "", "scrollTabIndicator", "tab", "scrollByHand", "onScrollListener", "com/kubi/home/v2/biz/grid/GridNavigationFragment$onScrollListener$1", "Lcom/kubi/home/v2/biz/grid/GridNavigationFragment$onScrollListener$1;", "checkTabAfterScroll", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNavigationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationFragment.kt\ncom/kubi/home/v2/biz/grid/GridNavigationFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n+ 6 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,274:1\n147#2,16:275\n76#3,7:291\n76#3,7:298\n153#3,7:305\n93#4,4:312\n75#5:316\n77#5:321\n47#6,4:317\n1563#7:322\n1634#7,3:323\n1563#7:326\n1634#7,3:327\n360#7,7:330\n*S KotlinDebug\n*F\n+ 1 GridNavigationFragment.kt\ncom/kubi/home/v2/biz/grid/GridNavigationFragment\n*L\n98#1:275,16\n148#1:291,7\n153#1:298,7\n160#1:305,7\n167#1:312,4\n171#1:316\n171#1:321\n171#1:317,4\n212#1:322\n212#1:323,3\n224#1:326\n224#1:327,3\n241#1:330,7\n*E\n"})
public final class GridNavigationFragment extends SimpleStateFragment<GridNavigationContract$UIState> {

    /* JADX INFO: renamed from: Z */
    public boolean f26385Z;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f26379c0 = {Reflection.property1(new PropertyReference1Impl(GridNavigationFragment.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/HomeFragmentGridNavigationBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f26378b0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public String f26380U = "B1eightplacepage";

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26381V = C45681e.m100799e(this, new Function1<GridNavigationFragment, C37523i>() { // from class: com.kubi.home.v2.biz.grid.GridNavigationFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37523i invoke(@NotNull GridNavigationFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37523i.m84506a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37523i, Unit>() { // from class: com.kubi.home.v2.biz.grid.GridNavigationFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37523i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37523i c37523i) {
            invoke(c37523i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final GridNaviShowHomeAdapter f26382W = new GridNaviShowHomeAdapter();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final GridNaviEditHomeAdapter f26383X = new GridNaviEditHomeAdapter();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final GridNaviGroupAdapter f26384Y = new GridNaviGroupAdapter();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C14932a f26386a0 = new C14932a();

    /* JADX INFO: compiled from: GridNavigationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/GridNavigationFragment$Companion;", "", "<init>", "()V", "GRID_PAGE_ID", "", "EVENT_ITEM_REMOVE", "EVENT_ITEM_ADD", "EVENT_SAVE_HOME_SHOW", "openMe", "", "context", "Landroid/content/Context;", "openMeWithoutLoginCheck", "from", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m30563b(Context context) {
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            String string = context.getString(R$string.quick_access);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            companion.launch(context, GridNavigationFragment.class, string);
            return Unit.INSTANCE;
        }

        public final void openMe(@NotNull final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.home.v2.biz.grid.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationFragment.Companion.m30563b(context);
                }
            }, 1, (Object) null);
        }

        public final void openMeWithoutLoginCheck(@NotNull String from) {
            Intrinsics.checkNotNullParameter(from, "from");
            Application application = BaseApplication.INSTANCE.get();
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            String string = application.getString(R$string.quick_access);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Bundle bundle = new Bundle();
            bundle.putString("from", from);
            Unit unit = Unit.INSTANCE;
            companion.launch(application, GridNavigationFragment.class, string, bundle);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.biz.grid.GridNavigationFragment$a */
    /* JADX INFO: compiled from: GridNavigationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/home/v2/biz/grid/GridNavigationFragment$onScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14932a extends RecyclerView.OnScrollListener {
        public C14932a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                GridNavigationFragment.this.m30557E3();
                GridNavigationFragment.this.f26385Z = false;
            } else {
                if (newState != 1) {
                    return;
                }
                GridNavigationFragment.this.f26385Z = true;
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m30532F3(GridNavigationFragment gridNavigationFragment) {
        if (!gridNavigationFragment.f26385Z) {
            return Unit.INSTANCE;
        }
        C37523i c37523iM30559H3 = gridNavigationFragment.m30559H3();
        if (c37523iM30559H3 == null) {
            return Unit.INSTANCE;
        }
        RecyclerView.LayoutManager layoutManager = c37523iM30559H3.f83328f.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return Unit.INSTANCE;
        }
        Pair<? extends String, ? extends List<? extends GridNaviData>> item = gridNavigationFragment.f26384Y.getItem(linearLayoutManager.findFirstVisibleItemPosition());
        if (item == null) {
            return Unit.INSTANCE;
        }
        c37523iM30559H3.f83329g.m54766c(item.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m30533I3(GridNavigationFragment gridNavigationFragment) {
        gridNavigationFragment.sendIntent(GridNavigationContract$UiIntent.ResetHomeData.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m30534J3(C37523i c37523i, GridNavigationFragment gridNavigationFragment) {
        KcPrimaryButton btnEdit = c37523i.f83325c;
        Intrinsics.checkNotNullExpressionValue(btnEdit, "btnEdit");
        C27046k.m66700o(btnEdit);
        KcPrimaryButton btnDone = c37523i.f83324b;
        Intrinsics.checkNotNullExpressionValue(btnDone, "btnDone");
        C27046k.m66685H(btnDone);
        RecyclerView listHomeShow = c37523i.f83327e;
        Intrinsics.checkNotNullExpressionValue(listHomeShow, "listHomeShow");
        C27046k.m66700o(listHomeShow);
        RecyclerView listHomeEdit = c37523i.f83326d;
        Intrinsics.checkNotNullExpressionValue(listHomeEdit, "listHomeEdit");
        C27046k.m66685H(listHomeEdit);
        gridNavigationFragment.f26384Y.m30615p(true, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m30536L3(GridNavigationFragment gridNavigationFragment, List list) {
        gridNavigationFragment.sendIntent(new GridNavigationContract$UiIntent.SaveHomeData(true, list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m30538N3(GridNavigationFragment gridNavigationFragment, List list) {
        gridNavigationFragment.sendIntent(new GridNavigationContract$UiIntent.SaveHomeData(true, list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m30540Q3(GridNavigationFragment gridNavigationFragment, List list) {
        gridNavigationFragment.sendIntent(new GridNavigationContract$UiIntent.SaveHomeData(false, list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m30557E3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.grid.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationFragment.m30532F3(this.f26403b);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: H3 */
    public final C37523i m30559H3() {
        return (C37523i) this.f26381V.getValue(this, f26379c0[0]);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m30560P3() {
        List<GridNavigationEntity> listM30601s = this.f26383X.m30601s();
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM30601s, 10));
        Iterator<T> it = listM30601s.iterator();
        while (it.hasNext()) {
            arrayList.add(C27041f.m66668h(((GridNavigationEntity) it.next()).getId()));
        }
        if (arrayList.isEmpty()) {
            GridNavigationDialog.f26422a.m30662f(new Function0() { // from class: com.kubi.home.v2.biz.grid.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationFragment.m30540Q3(this.f26408b, arrayList);
                }
            });
        } else {
            sendIntent(new GridNavigationContract$UiIntent.SaveHomeData(false, arrayList));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m30561R3(final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.grid.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationFragment.m30541S3(this.f26410b, str);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C14937a) {
            m30558G3((C14937a) singleEvent);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.home_fragment_grid_navigation;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF18113U() {
        return this.f26380U;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<GridNavigationVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(GridNavigationVM.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f26380U = str;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m30535K3(GridNavigationFragment gridNavigationFragment) {
        gridNavigationFragment.m30560P3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m30537M3(GridNavigationFragment gridNavigationFragment) {
        FragmentActivity activity = gridNavigationFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m30539O3(GridNavigationFragment gridNavigationFragment) {
        FragmentActivity activity = gridNavigationFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m30541S3(GridNavigationFragment gridNavigationFragment, String str) {
        C37523i c37523iM30559H3 = gridNavigationFragment.m30559H3();
        if (c37523iM30559H3 == null) {
            return Unit.INSTANCE;
        }
        List<Pair<? extends String, ? extends List<? extends GridNaviData>>> data = gridNavigationFragment.f26384Y.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        Iterator<Pair<? extends String, ? extends List<? extends GridNaviData>>> it = data.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (!Intrinsics.areEqual(it.next().getFirst(), str)) {
                i11++;
            } else {
                int iCoerceAtLeast = RangesKt.coerceAtLeast(i11, 0);
                RecyclerView listMenus = c37523iM30559H3.f83328f;
                Intrinsics.checkNotNullExpressionValue(listMenus, "listMenus");
                GridNavigationExKt.m30673h(listMenus, iCoerceAtLeast, 0, 2, null);
                RecyclerView listMenus2 = c37523iM30559H3.f83328f;
                Intrinsics.checkNotNullExpressionValue(listMenus2, "listMenus");
                C22912t.m54416n(listMenus2, new Runnable() { // from class: com.kubi.home.v2.biz.grid.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        GridNavigationFragment.m30542T3();
                    }
                });
                return Unit.INSTANCE;
            }
        }
        i11 = -1;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i11, 0);
        RecyclerView listMenus3 = c37523iM30559H3.f83328f;
        Intrinsics.checkNotNullExpressionValue(listMenus3, "listMenus");
        GridNavigationExKt.m30673h(listMenus3, iCoerceAtLeast2, 0, 2, null);
        RecyclerView listMenus4 = c37523iM30559H3.f83328f;
        Intrinsics.checkNotNullExpressionValue(listMenus4, "listMenus");
        C22912t.m54416n(listMenus4, new Runnable() { // from class: com.kubi.home.v2.biz.grid.c
            @Override // java.lang.Runnable
            public final void run() {
                GridNavigationFragment.m30542T3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public final InterfaceC41775x1 m30558G3(C14937a c14937a) {
        return C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), new C37967a(CoroutineExceptionHandler.INSTANCE), null, new GridNavigationFragment$fillViewData$1(this, c14937a, null), 2, null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "EVENT_ITEM_REMOVE".length();
        }
        C12572a.m23692a(this, false, new C14933x2df9822b("EVENT_ITEM_REMOVE", null, this));
        if (c12573b.m23696a()) {
            "EVENT_ITEM_ADD".length();
        }
        C12572a.m23692a(this, false, new C14934x2df9822c("EVENT_ITEM_ADD", null, this));
        if (c12573b.m23696a()) {
            "EVENT_SAVE_HOME_SHOW".length();
        }
        C12572a.m23692a(this, false, new C14935x2df9822d("EVENT_SAVE_HOME_SHOW", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() throws JSONException {
        super.initView();
        final C37523i c37523iM30559H3 = m30559H3();
        if (c37523iM30559H3 == null) {
            return;
        }
        if (UserInfo.a.n()) {
            LinearLayoutCompat userWidgetLayout = c37523iM30559H3.f83331i;
            Intrinsics.checkNotNullExpressionValue(userWidgetLayout, "userWidgetLayout");
            C27046k.m66685H(userWidgetLayout);
            RecyclerView listHomeShow = c37523iM30559H3.f83327e;
            Intrinsics.checkNotNullExpressionValue(listHomeShow, "listHomeShow");
            C27046k.m66685H(listHomeShow);
        } else {
            LinearLayoutCompat userWidgetLayout2 = c37523iM30559H3.f83331i;
            Intrinsics.checkNotNullExpressionValue(userWidgetLayout2, "userWidgetLayout");
            ViewExtKt.m66577h(userWidgetLayout2);
            RecyclerView listHomeShow2 = c37523iM30559H3.f83327e;
            Intrinsics.checkNotNullExpressionValue(listHomeShow2, "listHomeShow");
            ViewExtKt.m66577h(listHomeShow2);
        }
        RecyclerView listHomeShow3 = c37523iM30559H3.f83327e;
        Intrinsics.checkNotNullExpressionValue(listHomeShow3, "listHomeShow");
        C22912t.m54409g(listHomeShow3, false);
        c37523iM30559H3.f83327e.addItemDecoration(new GridNaviItemDecoration(7, 0, 2, null));
        c37523iM30559H3.f83327e.setAdapter(this.f26382W);
        RecyclerView listHomeEdit = c37523iM30559H3.f83326d;
        Intrinsics.checkNotNullExpressionValue(listHomeEdit, "listHomeEdit");
        C22912t.m54409g(listHomeEdit, false);
        c37523iM30559H3.f83326d.addItemDecoration(new GridNaviItemDecoration(0, C27040e.m66658b(8), 1, null));
        RecyclerView recyclerView = c37523iM30559H3.f83326d;
        GridNaviEditHomeAdapter gridNaviEditHomeAdapter = this.f26383X;
        gridNaviEditHomeAdapter.m30599D(new Function0() { // from class: com.kubi.home.v2.biz.grid.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationFragment.m30533I3(this.f26404b);
            }
        });
        recyclerView.setAdapter(gridNaviEditHomeAdapter);
        c37523iM30559H3.f83329g.setTextSize(14.0f);
        c37523iM30559H3.f83329g.setPaddingRelative(0, C27040e.m66658b(10), 0, 0);
        RecyclerView listMenus = c37523iM30559H3.f83328f;
        Intrinsics.checkNotNullExpressionValue(listMenus, "listMenus");
        C22912t.m54409g(listMenus, false);
        c37523iM30559H3.f83328f.setAdapter(this.f26384Y);
        c37523iM30559H3.f83328f.addOnScrollListener(this.f26386a0);
        KcPrimaryButton btnEdit = c37523iM30559H3.f83325c;
        Intrinsics.checkNotNullExpressionValue(btnEdit, "btnEdit");
        C27046k.m66711z(btnEdit, 0L, new Function0() { // from class: com.kubi.home.v2.biz.grid.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationFragment.m30534J3(c37523iM30559H3, this);
            }
        }, 1, null);
        KcPrimaryButton btnDone = c37523iM30559H3.f83324b;
        Intrinsics.checkNotNullExpressionValue(btnDone, "btnDone");
        C27046k.m66711z(btnDone, 0L, new Function0() { // from class: com.kubi.home.v2.biz.grid.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationFragment.m30535K3(this.f26407b);
            }
        }, 1, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1eightplacepage", "eightPlaceEdit", null, jSONObject, 4, null);
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        KcPrimaryButton kcPrimaryButton;
        C37523i c37523iM30559H3 = m30559H3();
        if (c37523iM30559H3 != null && (kcPrimaryButton = c37523iM30559H3.f83324b) != null && C27046k.m66704s(kcPrimaryButton)) {
            List<GridNavigationEntity> listM30601s = this.f26383X.m30601s();
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM30601s, 10));
            Iterator<T> it = listM30601s.iterator();
            while (it.hasNext()) {
                arrayList.add(C27041f.m66668h(((GridNavigationEntity) it.next()).getId()));
            }
            if (arrayList.isEmpty()) {
                GridNavigationDialog.f26422a.m30663g(new Function0() { // from class: com.kubi.home.v2.biz.grid.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GridNavigationFragment.m30536L3(this.f26397b, arrayList);
                    }
                }, new Function0() { // from class: com.kubi.home.v2.biz.grid.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GridNavigationFragment.m30537M3(this.f26399b);
                    }
                });
            } else {
                GridNavigationDialog.f26422a.m30664i(new Function0() { // from class: com.kubi.home.v2.biz.grid.e
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GridNavigationFragment.m30538N3(this.f26400b, arrayList);
                    }
                }, new Function0() { // from class: com.kubi.home.v2.biz.grid.f
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GridNavigationFragment.m30539O3(this.f26402b);
                    }
                });
            }
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        sendIntent(GridNavigationContract$UiIntent.LoadData.INSTANCE);
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m30542T3() {
    }
}
