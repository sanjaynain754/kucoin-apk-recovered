package com.kubi.futures.compliance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.futures.data.compliance.entity.EuropeComplianceDocsEntity;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.C17067s;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageFragment;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.PageEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EuropeComplianceSearchContractsFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000bJ\b\u0010%\u001a\u00020!H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006&"}, m90084d2 = {"Lcom/kubi/futures/compliance/EuropeComplianceSearchContractsFragment;", "Lcom/kubi/sdk/BasePageFragment;", "", "<init>", "()V", "isExecuteAddCommitTransaction", "", "()Z", "setExecuteAddCommitTransaction", "(Z)V", "symbol", "", "documentType", "getDocumentType", "()Ljava/lang/String;", "documentType$delegate", "Lkotlin/Lazy;", "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "fetchPageData", "Lcom/kubi/sdk/PageEntity;", "page", "", "size", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onTextChanged", "text", "onDestroyView", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EuropeComplianceSearchContractsFragment extends BasePageFragment<Object> {

    /* JADX INFO: renamed from: X */
    public boolean f22576X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public String f22577Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f22578Z;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceSearchContractsFragment$a */
    /* JADX INFO: compiled from: EuropeComplianceSearchContractsFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/futures/compliance/EuropeComplianceSearchContractsFragment$onViewCreated$adapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceDocsEntity;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12857a implements ItemCallBack<EuropeComplianceDocsEntity> {
        public C12857a() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, EuropeComplianceDocsEntity data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            EuropeComplianceLangDialog.f22566u0.show(EuropeComplianceSearchContractsFragment.this, data);
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.compliance.EuropeComplianceSearchContractsFragment$b */
    /* JADX INFO: compiled from: EuropeComplianceSearchContractsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/futures/compliance/EuropeComplianceSearchContractsFragment$onViewCreated$adapter$2", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12858b extends DiffUtil.ItemCallback<Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return false;
        }
    }

    public EuropeComplianceSearchContractsFragment() {
        super(true);
        this.f22578Z = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.compliance.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EuropeComplianceSearchContractsFragment.m24543y3(this.f22674b);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f22576X = false;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: A3, reason: from getter */
    public final boolean getF22576X() {
        return this.f22576X;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m24545B3(boolean z11) {
        this.f22576X = z11;
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public PageEntity<Object> mo24546o3(int i11, int i12) {
        return IComplianceService.f22675a.get().mo97163f(m24548z3(), this.f22577Y, i11, i12).toPageEntity();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_europe_compliance_search_contracts, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void onTextChanged(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f22577Y = text;
        if (C17067s.m36608a(this) || text.length() == 0) {
            return;
        }
        mo25620B0();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerViewMo24547s3 = mo24547s3();
        if (recyclerViewMo24547s3 == null) {
            return;
        }
        recyclerViewMo24547s3.setAdapter(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), EuropeComplianceDocsEntity.class, EuropeComplianceDocProxy.class, new C12857a(), null, 8, null).m57045a(new C12858b()));
        String str = this.f22577Y;
        if (str == null || str.length() == 0) {
            return;
        }
        mo25620B0();
    }

    @Override // com.kubi.sdk.BasePageFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public RecyclerView mo24547s3() {
        return (RecyclerView) findViewById(R$id.recyclerView);
    }

    /* JADX INFO: renamed from: z3 */
    public final String m24548z3() {
        return (String) this.f22578Z.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public static final String m24543y3(EuropeComplianceSearchContractsFragment europeComplianceSearchContractsFragment) {
        Bundle arguments = europeComplianceSearchContractsFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("documentType");
        }
        return null;
    }
}
