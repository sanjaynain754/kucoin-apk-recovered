package com.kubi.kumex.record;

import am.HistoryProfitDetailParams;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.ProfitDetailItemEntity;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageFragment;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36743c3;
import hb0.InterfaceC38162f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44074b;
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
import w00.C45681e;

/* JADX INFO: compiled from: ProfitDetailFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\u001aH\u0002J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f*\b\u0012\u0004\u0012\u00020'0!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006,"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitDetailFragment;", "Lcom/kubi/sdk/BasePageFragment;", "", "<init>", "()V", "bkumexFragmentProfitDetailBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentProfitDetailBinding;", "getBkumexFragmentProfitDetailBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentProfitDetailBinding;", "bkumexFragmentProfitDetailBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "record", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "getRecord", "()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "record$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "getFailData", "", "fetchPageData", "Lcom/kubi/sdk/PageEntity;", "page", "", "size", "initListener", "toDisplayList", "Lcom/kubi/kumex/data/assets/model/ProfitDetailItemEntity;", "first", "", "toEmptyList", "toFailList", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProfitDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfitDetailFragment.kt\ncom/kubi/kumex/record/ProfitDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n147#2,16:173\n1573#3:189\n1604#3,4:190\n*S KotlinDebug\n*F\n+ 1 ProfitDetailFragment.kt\ncom/kubi/kumex/record/ProfitDetailFragment\n*L\n33#1:173,16\n136#1:189\n136#1:190,4\n*E\n"})
public final class ProfitDetailFragment extends BasePageFragment<Object> {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f29909Z = {Reflection.property1(new PropertyReference1Impl(ProfitDetailFragment.class, "bkumexFragmentProfitDetailBinding", "getBkumexFragmentProfitDetailBinding()Lcom/kubi/kumex/databinding/BkumexFragmentProfitDetailBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f29910X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29911Y;

    /* JADX INFO: renamed from: com.kubi.kumex.record.ProfitDetailFragment$a */
    /* JADX INFO: compiled from: ProfitDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/record/ProfitDetailFragment$initListener$adapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/record/CommonFailObject;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16534a implements ItemCallBack<CommonFailObject> {
        public C16534a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, CommonFailObject data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            ProfitDetailFragment.this.mo25620B0();
        }
    }

    public ProfitDetailFragment() {
        super(false, 1, null);
        this.f29910X = C45681e.m100799e(this, new Function1<ProfitDetailFragment, C36743c3>() { // from class: com.kubi.kumex.record.ProfitDetailFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36743c3 invoke(@NotNull ProfitDetailFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36743c3.m82337a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36743c3, Unit>() { // from class: com.kubi.kumex.record.ProfitDetailFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36743c3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36743c3 c36743c3) {
                invoke(c36743c3);
                return Unit.INSTANCE;
            }
        });
        this.f29911Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitDetailFragment.m35208F3(this.f30309b);
            }
        });
    }

    /* JADX INFO: renamed from: C3 */
    private final void m35205C3() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        BasePageAdapter basePageAdapterM57045a = BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), CommonHeadObject.class, CommonHeadObjectProxy.class, null, null, 12, null), ProfitBrieflyObject.class, ProfitBrieflyObjectProxy.class, null, null, 12, null), ProfitDetailObject.class, ProfitDetailObjectProxy.class, null, null, 12, null), CommonEmptyObject.class, CommonEmptyObjectProxy.class, null, null, 12, null), CommonFailObject.class, CommonFailObjectProxy.class, new C16534a(), null, 8, null).m57045a(new ProfitDetailDiffCallBack());
        C36743c3 c36743c3M35212A3 = m35212A3();
        if (c36743c3M35212A3 != null && (recyclerView3 = c36743c3M35212A3.f79817b) != null) {
            recyclerView3.setAdapter(basePageAdapterM57045a);
        }
        C36743c3 c36743c3M35212A4 = m35212A3();
        if (c36743c3M35212A4 != null && (recyclerView2 = c36743c3M35212A4.f79817b) != null) {
            recyclerView2.setItemAnimator(null);
        }
        C36743c3 c36743c3M35212A5 = m35212A3();
        if (c36743c3M35212A5 != null && (recyclerView = c36743c3M35212A5.f79817b) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        C36743c3 c36743c3M35212A6 = m35212A3();
        if (c36743c3M35212A6 == null || (kuCoinRefreshLayout = c36743c3M35212A6.f79818c) == null) {
            return;
        }
        kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.m0
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                ProfitDetailFragment.m35206D3(this.f30306b, interfaceC38162f);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m35206D3(final ProfitDetailFragment profitDetailFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        profitDetailFragment.mo25620B0();
        BaseFragment.runOnUiThread$default(profitDetailFragment, new Function0() { // from class: com.kubi.kumex.record.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitDetailFragment.m35207E3(this.f30311b);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: A3 */
    public final C36743c3 m35212A3() {
        return (C36743c3) this.f29910X.getValue(this, f29909Z[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public final ProfitRecordEntity m35213B3() {
        return (ProfitRecordEntity) this.f29911Y.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final List<Object> m35215H3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ProfitBrieflyObject(m35213B3()));
        arrayList.add(new CommonEmptyObject(null, 1, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: I3 */
    public final List<Object> m35216I3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ProfitBrieflyObject(m35213B3()));
        arrayList.add(new CommonFailObject(null, 1, null));
        return arrayList;
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public PageEntity<Object> mo24546o3(int i11, int i12) {
        MultiBizFacadeManager multiBizFacadeManager = MultiBizFacadeManager.f19232a;
        MultiBizType multiBizType = m35213B3().getMultiBizType();
        if (multiBizType == null) {
            multiBizType = MultiBizType.CLASSIC;
        }
        InterfaceC44074b interfaceC44074bM20272m = multiBizFacadeManager.m20272m(multiBizType);
        String id2 = m35213B3().getId();
        if (id2 == null) {
            id2 = "";
        }
        PageEntity<ProfitDetailItemEntity> pageEntityMo83056c0 = interfaceC44074bM20272m.mo83056c0(new HistoryProfitDetailParams(id2, i11, i12, Boolean.valueOf(m35213B3().isTrialFunds()), String.valueOf(m35213B3().getOpenTime()), String.valueOf(m35213B3().getCloseDate())));
        if (i11 != 1) {
            return new PageEntity<>(m35214G3(pageEntityMo83056c0, i11, false), pageEntityMo83056c0.getHasNext(), pageEntityMo83056c0.getContext(), pageEntityMo83056c0.getOffset(), pageEntityMo83056c0.getTrialOffset(), null, 32, null);
        }
        List<ProfitDetailItemEntity> items = pageEntityMo83056c0.getItems();
        return (items == null || items.isEmpty()) ? new PageEntity<>(m35215H3(), false, pageEntityMo83056c0.getContext(), pageEntityMo83056c0.getOffset(), pageEntityMo83056c0.getTrialOffset(), null, 32, null) : new PageEntity<>(m35214G3(pageEntityMo83056c0, i11, true), pageEntityMo83056c0.getHasNext(), pageEntityMo83056c0.getContext(), pageEntityMo83056c0.getOffset(), pageEntityMo83056c0.getTrialOffset(), null, 32, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_profit_detail, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setTitle("");
        m35205C3();
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m35207E3(ProfitDetailFragment profitDetailFragment) {
        C36743c3 c36743c3M35212A3;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        if (profitDetailFragment.getView() != null && (c36743c3M35212A3 = profitDetailFragment.m35212A3()) != null && (kuCoinRefreshLayout = c36743c3M35212A3.f79818c) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final ProfitRecordEntity m35208F3(ProfitDetailFragment profitDetailFragment) {
        ProfitRecordEntity profitRecordEntity;
        Bundle arguments = profitDetailFragment.getArguments();
        if (arguments != null) {
            profitRecordEntity = (ProfitRecordEntity) arguments.getParcelable("data");
        } else {
            profitRecordEntity = null;
        }
        Intrinsics.checkNotNull(profitRecordEntity);
        return profitRecordEntity;
    }

    /* JADX INFO: renamed from: G3 */
    public final List<Object> m35214G3(PageEntity<ProfitDetailItemEntity> pageEntity, int i11, boolean z11) {
        List listM66560c = C27024b.m66560c(pageEntity.getItems());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
        int i12 = 0;
        for (Object obj : listM66560c) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append('_');
            sb2.append(i12);
            arrayList.add(new ProfitDetailObject(sb2.toString(), m35213B3(), (ProfitDetailItemEntity) obj));
            i12 = i13;
        }
        List<Object> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (z11) {
            mutableList.add(0, new ProfitBrieflyObject(m35213B3()));
            mutableList.add(1, new CommonHeadObject(C27017c.f54310a.m66516f(R$string.profit_detail, new Object[0])));
        }
        return mutableList;
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: q3 */
    public List<Object> mo35217q3() {
        return m35216I3();
    }

    @Override // com.kubi.sdk.BasePageFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public RecyclerView mo24547s3() {
        C36743c3 c36743c3M35212A3 = m35212A3();
        if (c36743c3M35212A3 != null) {
            return c36743c3M35212A3.f79817b;
        }
        return null;
    }
}
