package com.kubi.mart.sidebar.spot;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mart.R$color;
import com.kubi.mart.R$layout;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.mart.sidebar.spot.search.SpotSidebarSearchLayout;
import com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p182cq.C36516a;
import p208dr.InterfaceC36952a;
import p268fq.C37578a;
import p268fq.C37579b;
import p274fx.C37727a;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SpotSidebarFragment.kt */
/* JADX INFO: loaded from: classes28.dex */
@Keep
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0013H\u0002J\b\u0010'\u001a\u00020\u001eH\u0014J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0014J\u001e\u00100\u001a\u00020\u001e2\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020,H\u0003J\u0010\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020,H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mart/sidebar/spot/SpotSidebarVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/mart/databinding/MartFragmentSpotSidebarBinding;", "getBinding$MartLib_googleRelease", "()Lcom/kubi/mart/databinding/MartFragmentSpotSidebarBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "sidebarType", "", "getSidebarType", "()Ljava/lang/String;", "sidebarType$delegate", "Lkotlin/Lazy;", "symbolCode", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initViewDiff", "initSearch", "onTextChanged", "input", "bindFlowEvent", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "setUserVisibleHint", "isVisibleToUser", "", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "fillMenus", "menus", "", "Lcom/kubi/mart/entity/SpotMenuModel;", "hasFavoriteData", "getDefaultSelectedTab", "Companion", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSidebarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarFragment.kt\ncom/kubi/mart/sidebar/spot/SpotSidebarFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,210:1\n147#2,16:211\n76#3,7:227\n1869#4,2:234\n1869#4,2:244\n1869#4,2:246\n93#5,4:236\n93#5,4:240\n*S KotlinDebug\n*F\n+ 1 SpotSidebarFragment.kt\ncom/kubi/mart/sidebar/spot/SpotSidebarFragment\n*L\n69#1:211,16\n144#1:227,7\n174#1:234,2\n133#1:244,2\n196#1:246,2\n181#1:236,4\n183#1:240,4\n*E\n"})
public final class SpotSidebarFragment extends SimpleStateFragment<SpotSidebarContract$UIState> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SpotSidebarFragment.class, "binding", "getBinding$MartLib_googleRelease()Lcom/kubi/mart/databinding/MartFragmentSpotSidebarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String symbolCode;

    @NotNull
    private final InterfaceC24293a binding$delegate = C45681e.m100799e(this, new Function1<SpotSidebarFragment, C36516a>() { // from class: com.kubi.mart.sidebar.spot.SpotSidebarFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36516a invoke(@NotNull SpotSidebarFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36516a.m81761a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36516a, Unit>() { // from class: com.kubi.mart.sidebar.spot.SpotSidebarFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36516a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36516a c36516a) {
            invoke(c36516a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: sidebarType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sidebarType = LazyKt.lazy(new Function0() { // from class: com.kubi.mart.sidebar.spot.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotSidebarFragment.sidebarType_delegate$lambda$1(this.f34725b);
        }
    });

    @NotNull
    private final ArrayList<CharSequence> titleList = new ArrayList<>();

    /* JADX INFO: compiled from: SpotSidebarFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/mart/sidebar/spot/SpotSidebarFragment;", "type", "", "symbolCode", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final SpotSidebarFragment instance(@NotNull String type, @NotNull String symbolCode) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
            SpotSidebarFragment spotSidebarFragment = new SpotSidebarFragment();
            C27051h c27051h = new C27051h();
            c27051h.m66720d(BaseFragment.FRAGMENT_BACK, R$color.c_bulletLayer);
            c27051h.m66724h("type", type);
            c27051h.m66724h("symbolCode", symbolCode);
            spotSidebarFragment.setArguments(c27051h.m66717a());
            return spotSidebarFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.SpotSidebarFragment$a */
    /* JADX INFO: compiled from: SpotSidebarFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18842a implements Function0<Unit> {
        public C18842a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m41435a() {
            SpotSidebarSearchLayout spotSidebarSearchLayout;
            C36516a binding$MartLib_googleRelease = SpotSidebarFragment.this.getBinding$MartLib_googleRelease();
            if (binding$MartLib_googleRelease == null || (spotSidebarSearchLayout = binding$MartLib_googleRelease.f79348d) == null) {
                return;
            }
            spotSidebarSearchLayout.m41516k(SpotSidebarFragment.this.symbolCode);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m41435a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.SpotSidebarFragment$b */
    /* JADX INFO: compiled from: SpotSidebarFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/mart/sidebar/spot/SpotSidebarFragment$onViewCreated$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18843b extends C45938b {
        public C18843b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            if (Intrinsics.areEqual(SpotSidebarFragment.this.getSidebarType(), "spot_kline") && i11 == 1) {
                C43852m.m96591c(C37578a.f83542a.m84710a(), ExifInterface.TAG_CONTRAST, null, null, 12, null);
            } else {
                C43852m.m96590b(C37578a.f83542a.m84710a(), "symbolSelectTab", String.valueOf(i11 + 1), TuplesKt.m90091to("tag", i11 == 0 ? "FAV" : String.valueOf(CollectionsKt.getOrNull(SpotSidebarFragment.this.titleList, i11))));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.SpotSidebarFragment$onShow$1 */
    /* JADX INFO: compiled from: SpotSidebarFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.SpotSidebarFragment$onShow$1", m90122f = "SpotSidebarFragment.kt", m90123i = {}, m90124l = {156}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C188451 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C188451(Continuation<? super C188451> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SpotSidebarFragment.this.new C188451(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C188451) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m90350b(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SpotSidebarFragment spotSidebarFragment = SpotSidebarFragment.this;
            BaseFragment.showLoadingView$default(spotSidebarFragment, ((OldBaseFragment) spotSidebarFragment).mContext.getColor(R$color.c_bulletLayer), 0, 2, null);
            SpotSidebarFragment spotSidebarFragment2 = SpotSidebarFragment.this;
            String sidebarType = spotSidebarFragment2.getSidebarType();
            String str = SpotSidebarFragment.this.symbolCode;
            if (str == null) {
                str = "";
            }
            spotSidebarFragment2.sendIntent(new SpotSidebarContract$UIIntent.FetchMenus(sidebarType, str));
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void fillMenus(final List<SpotMenuModel> menus, final boolean hasFavoriteData) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarFragment.fillMenus$lambda$20(this.f34732b, menus, hasFavoriteData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment fillMenus$lambda$20$lambda$19$lambda$18(SpotSidebarFragment spotSidebarFragment, SpotMenuModel spotMenuModel, int i11) {
        SpotSidebarTabFragment.Companion companion = SpotSidebarTabFragment.f34804b0;
        String sidebarType = spotSidebarFragment.getSidebarType();
        String str = spotSidebarFragment.symbolCode;
        if (str == null) {
            str = "";
        }
        return companion.instance(sidebarType, str, spotMenuModel);
    }

    private final int getDefaultSelectedTab(boolean hasFavoriteData) {
        return !hasFavoriteData ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSidebarType() {
        return (String) this.sidebarType.getValue();
    }

    private final void initSearch() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarFragment.initSearch$lambda$8(this.f34788b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Editable initSearch$lambda$8$lambda$2(C36516a c36516a, Integer it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c36516a.f79346b.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Editable initSearch$lambda$8$lambda$3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Editable) function1.invoke(p11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSearch$lambda$8$lambda$4(SpotSidebarFragment spotSidebarFragment, CharSequence charSequence) {
        if (charSequence == null) {
            return Unit.INSTANCE;
        }
        spotSidebarFragment.onTextChanged(charSequence.toString());
        return Unit.INSTANCE;
    }

    private final void initViewDiff() {
        String strMo59997j;
        C37578a c37578a = C37578a.f83542a;
        String sidebarType = getSidebarType();
        if (Intrinsics.areEqual(sidebarType, "spot_kline")) {
            strMo59997j = "B5candle";
        } else {
            strMo59997j = Intrinsics.areEqual(sidebarType, "spot_grid") ? "B10SpotCreate.SelectCoin" : ISpotService.f49646a.get().mo59997j();
        }
        c37578a.m84711b(strMo59997j);
    }

    @JvmStatic
    @NotNull
    public static final SpotSidebarFragment instance(@NotNull String str, @NotNull String str2) {
        return INSTANCE.instance(str, str2);
    }

    private final void onTextChanged(final String input) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarFragment.onTextChanged$lambda$11(this.f34786b, input);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C18847a) {
            C18847a c18847a = (C18847a) singleEvent;
            fillMenus(c18847a.m41444b(), c18847a.getF34722b());
        }
        if (singleEvent instanceof C18848b) {
            final C18848b c18848b = (C18848b) singleEvent;
            C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotSidebarFragment.dispatchSingleEvent$lambda$17$lambda$16(this.f34728b, c18848b);
                }
            });
        }
    }

    @Nullable
    public final C36516a getBinding$MartLib_googleRelease() {
        return (C36516a) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.mart_fragment_spot_sidebar;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<SpotSidebarVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SpotSidebarVM.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.symbolCode = arguments != null ? RouteExKt.m56284y(arguments, "symbolCode") : null;
        C37579b.m84715d("onViewCreated-sidebar. sidebarType=" + getSidebarType() + ",symbolCode=" + this.symbolCode);
        BaseFragment.showEmptyView$default(this, "", 0, (View.OnClickListener) null, 4, (Object) null);
        C36516a binding$MartLib_googleRelease = getBinding$MartLib_googleRelease();
        if (binding$MartLib_googleRelease == null) {
            return;
        }
        initViewDiff();
        this.titleList.clear();
        ViewPager2 viewPager2 = binding$MartLib_googleRelease.f79349e;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new C37727a(childFragmentManager, lifecycle));
        binding$MartLib_googleRelease.f79349e.setOffscreenPageLimit(1);
        binding$MartLib_googleRelease.f79347c.setNeedBold(true);
        binding$MartLib_googleRelease.f79347c.m55601z(binding$MartLib_googleRelease.f79349e, this.titleList);
        binding$MartLib_googleRelease.f79347c.setOnTabSelectListener(new C18843b());
        initSearch();
        binding$MartLib_googleRelease.f79350f.setDisplayedChild(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dispatchSingleEvent$lambda$17$lambda$16(SpotSidebarFragment spotSidebarFragment, C18848b c18848b) {
        SpotSidebarSearchLayout spotSidebarSearchLayout;
        C36516a binding$MartLib_googleRelease = spotSidebarFragment.getBinding$MartLib_googleRelease();
        if (binding$MartLib_googleRelease != null && (spotSidebarSearchLayout = binding$MartLib_googleRelease.f79348d) != null) {
            spotSidebarSearchLayout.m41518o(c18848b.getF34723a(), c18848b.m41445a());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fillMenus$lambda$20(final SpotSidebarFragment spotSidebarFragment, List list, boolean z11) {
        C37727a c37727a;
        spotSidebarFragment.showContentView();
        C36516a binding$MartLib_googleRelease = spotSidebarFragment.getBinding$MartLib_googleRelease();
        if (binding$MartLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        RecyclerView.Adapter adapter = binding$MartLib_googleRelease.f79349e.getAdapter();
        if (adapter instanceof C37727a) {
            c37727a = (C37727a) adapter;
        } else {
            c37727a = null;
        }
        if (c37727a == null) {
            return Unit.INSTANCE;
        }
        c37727a.clear();
        spotSidebarFragment.titleList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final SpotMenuModel spotMenuModel = (SpotMenuModel) it.next();
            spotSidebarFragment.titleList.add(spotMenuModel.getTitleName());
            c37727a.m85027g(new Function1() { // from class: com.kubi.mart.sidebar.spot.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SpotSidebarFragment.fillMenus$lambda$20$lambda$19$lambda$18(this.f34730b, spotMenuModel, ((Integer) obj).intValue());
                }
            });
        }
        binding$MartLib_googleRelease.f79349e.setCurrentItem(spotSidebarFragment.getDefaultSelectedTab(z11), false);
        c37727a.m85031k(list);
        binding$MartLib_googleRelease.f79347c.m55597u();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSearch$lambda$8(final SpotSidebarFragment spotSidebarFragment) {
        final C36516a binding$MartLib_googleRelease = spotSidebarFragment.getBinding$MartLib_googleRelease();
        if (binding$MartLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        SpotSidebarSearchLayout spotSidebarSearchLayout = binding$MartLib_googleRelease.f79348d;
        String sidebarType = spotSidebarFragment.getSidebarType();
        String str = spotSidebarFragment.symbolCode;
        ClearEditText etSearch = binding$MartLib_googleRelease.f79346b;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        spotSidebarSearchLayout.m41517m(spotSidebarFragment, sidebarType, str, etSearch);
        Observable<CharSequence> observableM101605b = C0206f.m784d(binding$MartLib_googleRelease.f79346b).m101605b();
        Observable<Integer> observableM782b = C0206f.m782b(binding$MartLib_googleRelease.f79346b);
        final Function1 function1 = new Function1() { // from class: com.kubi.mart.sidebar.spot.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotSidebarFragment.initSearch$lambda$8$lambda$2(binding$MartLib_googleRelease, (Integer) obj);
            }
        };
        Observable observableObserveOn = Observable.merge(observableM101605b, observableM782b.map(new Function() { // from class: com.kubi.mart.sidebar.spot.l
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SpotSidebarFragment.initSearch$lambda$8$lambda$3(function1, obj);
            }
        })).debounce(200L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
        final Function1 function2 = new Function1() { // from class: com.kubi.mart.sidebar.spot.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotSidebarFragment.initSearch$lambda$8$lambda$4(this.f34791b, (CharSequence) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.mart.sidebar.spot.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: com.kubi.mart.sidebar.spot.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotSidebarFragment.initSearch$lambda$8$lambda$6(this.f34793b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.mart.sidebar.spot.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, spotSidebarFragment.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSearch$lambda$8$lambda$6(SpotSidebarFragment spotSidebarFragment, Throwable th2) {
        String message;
        String tag = spotSidebarFragment.getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("textChanges:");
        if (th2 != null) {
            message = th2.getMessage();
        } else {
            message = null;
        }
        sb2.append(message);
        C44128b.m97261e(tag, sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onTextChanged$lambda$11(SpotSidebarFragment spotSidebarFragment, String str) {
        final boolean z11;
        C37727a c37727a;
        List<Fragment> listM85030j;
        C36516a binding$MartLib_googleRelease = spotSidebarFragment.getBinding$MartLib_googleRelease();
        if (binding$MartLib_googleRelease == null) {
            return Unit.INSTANCE;
        }
        C37579b.m84715d("search-onTextChanged:" + str);
        if (str.length() == 0) {
            z11 = 1;
        } else {
            z11 = 0;
        }
        binding$MartLib_googleRelease.f79350f.setDisplayedChild(!z11);
        RecyclerView.Adapter adapter = binding$MartLib_googleRelease.f79349e.getAdapter();
        if (adapter instanceof C37727a) {
            c37727a = (C37727a) adapter;
        } else {
            c37727a = null;
        }
        if (c37727a != null && (listM85030j = c37727a.m85030j()) != null) {
            for (final Fragment fragment : listM85030j) {
                C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotSidebarFragment.onTextChanged$lambda$11$lambda$10$lambda$9(fragment, z11);
                    }
                });
            }
        }
        if (z11 == 0) {
            binding$MartLib_googleRelease.f79348d.m41519q(str);
            spotSidebarFragment.sendIntent(new SpotSidebarContract$UIIntent.SearchInput(spotSidebarFragment.getSidebarType(), str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTextChanged$lambda$11$lambda$10$lambda$9(Fragment fragment, boolean z11) {
        fragment.setUserVisibleHint(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUserVisibleHint$lambda$14$lambda$13(Fragment fragment, boolean z11) {
        fragment.setUserVisibleHint(z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sidebarType_delegate$lambda$1(SpotSidebarFragment spotSidebarFragment) {
        String strM56284y;
        Bundle arguments = spotSidebarFragment.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, "type")) != null) {
            return strM56284y;
        }
        return "spot_trade";
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "mart_changeSymol".length();
        }
        C12572a.m23692a(this, false, new C18844xa8b0dc6b("mart_changeSymol", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        Editable text;
        C36516a binding$MartLib_googleRelease;
        ClearEditText clearEditText;
        ClearEditText clearEditText2;
        super.onHide();
        if (getView() != null) {
            C36516a binding$MartLib_googleRelease2 = getBinding$MartLib_googleRelease();
            if (binding$MartLib_googleRelease2 != null && (clearEditText2 = binding$MartLib_googleRelease2.f79346b) != null) {
                text = clearEditText2.getText();
            } else {
                text = null;
            }
            if (!TextUtils.isEmpty(text) && (binding$MartLib_googleRelease = getBinding$MartLib_googleRelease()) != null && (clearEditText = binding$MartLib_googleRelease.f79346b) != null) {
                clearEditText.setText("");
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (getView() != null && this.titleList.size() == 0) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C188451(null));
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(final boolean isVisibleToUser) {
        RecyclerView.Adapter adapter;
        List<Fragment> listM85030j;
        ViewPager2 viewPager2;
        super.setUserVisibleHint(isVisibleToUser);
        if (getView() != null) {
            C36516a binding$MartLib_googleRelease = getBinding$MartLib_googleRelease();
            C37727a c37727a = null;
            if (binding$MartLib_googleRelease != null && (viewPager2 = binding$MartLib_googleRelease.f79349e) != null) {
                adapter = viewPager2.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof C37727a) {
                c37727a = (C37727a) adapter;
            }
            if (c37727a != null && (listM85030j = c37727a.m85030j()) != null) {
                for (final Fragment fragment : listM85030j) {
                    C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.d
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SpotSidebarFragment.setUserVisibleHint$lambda$14$lambda$13(fragment, isVisibleToUser);
                        }
                    });
                }
            }
        }
    }
}
