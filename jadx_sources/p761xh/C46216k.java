package p761xh;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36798l4;
import fm.C37567b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: xh.k */
/* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002:;B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0001H\u0014J\b\u0010$\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\bH\u0002J\u0010\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0005H\u0002J\u0016\u0010)\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001cH\u0002J\u0010\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020+H\u0002J\u001e\u0010.\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020/0\u001c2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020/0\u001c2\u0006\u00105\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012RJ\u0010\u0015\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0007j\u0002`\u00190\u0016j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0007j\u0002`\u0019`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u000e\u00106\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "currentSymbol", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getCurrentSymbol", "()Ljava/lang/String;", "getAction", "()Lkotlin/jvm/functions/Function1;", "binding", "Lcom/kubi/kumex/databinding/BkumexSelectContractOfHistoryPopBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexSelectContractOfHistoryPopBinding;", "binding$delegate", "Lkotlin/Lazy;", "filters", "Ljava/util/HashMap;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "", "Lcom/kubi/futures/dialog/pop/ContractFilter;", "Lkotlin/collections/HashMap;", "contractList", "", "getContractList", "()Ljava/util/List;", "contractList$delegate", "initViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "initData", "initFilters", "initEdit", "handleSearch", "searchText", "setMainSectionAdapter", "list", "Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter$SectionIndex;", "handleMainSectionItemTap", "sectionIndex", "setContractAdapter", "Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$ContractAdapter$ContractIndex;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dismiss", "symbol", "buildContractListByType", "type", "ALL", "USDT", "CRYPTO", "USDC", "MainSectionAdapter", "ContractAdapter", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSelectContractOfHistoryPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectContractOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n65#2,16:379\n93#2,3:395\n774#3:398\n865#3,2:399\n1869#3,2:401\n1869#3,2:403\n*S KotlinDebug\n*F\n+ 1 SelectContractOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup\n*L\n144#1:379,16\n144#1:395,3\n162#1:398\n162#1:399,2\n164#1:401,2\n240#1:403,2\n*E\n"})
public final class C46216k extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Context f103756D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public final String f103757E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Function1<String, Unit> f103758F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final Lazy f103759G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final HashMap<String, Function1<ContractEntity, Boolean>> f103760H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public final Lazy f103761I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public final String f103762J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public final String f103763K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public final String f103764L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public final String f103765M;

    /* JADX INFO: renamed from: xh.k$a */
    /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$ContractAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$ContractAdapter$ContractViewHolder;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$ContractAdapter$ContractIndex;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setDatas", "datas", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "ContractViewHolder", "ContractIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final Function1<ContractIndex, Unit> f103766i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ArrayList<ContractIndex> f103767j;

        /* JADX INFO: renamed from: xh.k$a$a, reason: collision with other inner class name and from toString */
        /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$ContractAdapter$ContractIndex;", "", "symbol", "", "name", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getSymbol", "()Ljava/lang/String;", "getName", "getChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class ContractIndex {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String symbol;

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final String name;

            /* JADX INFO: renamed from: c, reason: from toString */
            public final boolean checked;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContractIndex)) {
                    return false;
                }
                ContractIndex contractIndex = (ContractIndex) other;
                return Intrinsics.areEqual(this.symbol, contractIndex.symbol) && Intrinsics.areEqual(this.name, contractIndex.name) && this.checked == contractIndex.checked;
            }

            public ContractIndex(@NotNull String symbol, @NotNull String name, boolean z11) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(name, "name");
                this.symbol = symbol;
                this.name = name;
                this.checked = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public int hashCode() {
                return (((this.symbol.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            @NotNull
            public String toString() {
                return "ContractIndex(symbol=" + this.symbol + ", name=" + this.name + ", checked=" + this.checked + ')';
            }
        }

        /* JADX INFO: renamed from: xh.k$a$b */
        /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$ContractAdapter$ContractViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super ContractIndex, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f103766i = callback;
            this.f103767j = new ArrayList<>();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f103767j.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull b holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ContractIndex contractIndex = this.f103767j.get(i11);
            Intrinsics.checkNotNullExpressionValue(contractIndex, "get(...)");
            ContractIndex contractIndex2 = contractIndex;
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            appCompatTextView.setText(contractIndex2.getName());
            if (contractIndex2.getChecked()) {
                appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.primary));
            } else {
                appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
            appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, C27029c.m66601d(appCompatTextView, 48)));
            appCompatTextView.setTypeface(ResourcesCompat.getFont(appCompatTextView.getContext(), R$font.regular));
            appCompatTextView.setPaddingRelative(C27029c.m66601d(appCompatTextView, 16), 0, 0, 0);
            appCompatTextView.setTextSize(14.0f);
            appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            appCompatTextView.setGravity(16);
            final b bVar = new b(appCompatTextView);
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: xh.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C46216k.a.m101908j(bVar, this, view);
                }
            });
            return bVar;
        }

        /* JADX INFO: renamed from: k */
        public final void m101911k(@NotNull List<ContractIndex> datas) {
            Intrinsics.checkNotNullParameter(datas, "datas");
            this.f103767j.clear();
            this.f103767j.addAll(datas);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: j */
        public static final void m101908j(b bVar, a aVar, View view) {
            int bindingAdapterPosition = bVar.getBindingAdapterPosition();
            if (bindingAdapterPosition < 0) {
                return;
            }
            Function1<ContractIndex, Unit> function1 = aVar.f103766i;
            ContractIndex contractIndex = aVar.f103767j.get(bindingAdapterPosition);
            Intrinsics.checkNotNullExpressionValue(contractIndex, "get(...)");
            function1.invoke(contractIndex);
        }
    }

    /* JADX INFO: renamed from: xh.k$b */
    /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter$SectionViewHolder;", "itemCallback", "Lkotlin/Function1;", "Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter$SectionIndex;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setDatas", "datas", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "SectionViewHolder", "SectionIndex", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSelectContractOfHistoryPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectContractOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1869#2,2:379\n*S KotlinDebug\n*F\n+ 1 SelectContractOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter\n*L\n287#1:379,2\n*E\n"})
    public static final class b extends RecyclerView.Adapter<C47036b> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final Function1<SectionIndex, Unit> f103771i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ArrayList<SectionIndex> f103772j;

        /* JADX INFO: renamed from: xh.k$b$a, reason: from toString */
        /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
        @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter$SectionIndex;", "", "id", "", "name", "checked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getChecked", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class SectionIndex {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String id;

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final String name;

            /* JADX INFO: renamed from: c, reason: from toString */
            public boolean checked;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionIndex)) {
                    return false;
                }
                SectionIndex sectionIndex = (SectionIndex) other;
                return Intrinsics.areEqual(this.id, sectionIndex.id) && Intrinsics.areEqual(this.name, sectionIndex.name) && this.checked == sectionIndex.checked;
            }

            public SectionIndex(@NotNull String id2, @NotNull String name, boolean z11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                this.id = id2;
                this.name = name;
                this.checked = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: d */
            public final void m101923d(boolean z11) {
                this.checked = z11;
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.checked);
            }

            @NotNull
            public String toString() {
                return "SectionIndex(id=" + this.id + ", name=" + this.name + ", checked=" + this.checked + ')';
            }
        }

        /* JADX INFO: renamed from: xh.k$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$MainSectionAdapter$SectionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C47036b extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C47036b(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Function1<? super SectionIndex, Unit> itemCallback) {
            Intrinsics.checkNotNullParameter(itemCallback, "itemCallback");
            this.f103771i = itemCallback;
            this.f103772j = new ArrayList<>();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f103772j.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C47036b holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            SectionIndex sectionIndex = this.f103772j.get(i11);
            Intrinsics.checkNotNullExpressionValue(sectionIndex, "get(...)");
            SectionIndex sectionIndex2 = sectionIndex;
            appCompatTextView.setText(sectionIndex2.getName());
            if (sectionIndex2.getChecked()) {
                appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.primary));
            } else {
                appCompatTextView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C47036b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            AppCompatTextView appCompatTextView = new AppCompatTextView(parent.getContext());
            appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, C27029c.m66601d(appCompatTextView, 48)));
            appCompatTextView.setPaddingRelative(C27029c.m66601d(appCompatTextView, 16), 0, 0, 0);
            appCompatTextView.setTextSize(14.0f);
            appCompatTextView.setGravity(16);
            final C47036b c47036b = new C47036b(appCompatTextView);
            c47036b.itemView.setOnClickListener(new View.OnClickListener() { // from class: xh.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C46216k.b.m101916j(c47036b, this, view);
                }
            });
            return c47036b;
        }

        /* JADX INFO: renamed from: k */
        public final void m101919k(@NotNull List<SectionIndex> datas) {
            Intrinsics.checkNotNullParameter(datas, "datas");
            this.f103772j.clear();
            this.f103772j.addAll(datas);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: j */
        public static final void m101916j(C47036b c47036b, b bVar, View view) {
            int bindingAdapterPosition = c47036b.getBindingAdapterPosition();
            if (bindingAdapterPosition >= 0) {
                SectionIndex sectionIndex = bVar.f103772j.get(bindingAdapterPosition);
                Intrinsics.checkNotNullExpressionValue(sectionIndex, "get(...)");
                SectionIndex sectionIndex2 = sectionIndex;
                if (sectionIndex2.getChecked()) {
                    return;
                }
                Iterator<T> it = bVar.f103772j.iterator();
                while (it.hasNext()) {
                    ((SectionIndex) it.next()).m101923d(false);
                }
                sectionIndex2.m101923d(true);
                bVar.f103771i.invoke(sectionIndex2);
                bVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: xh.k$c */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SelectContractOfHistoryPopup.kt\ncom/kubi/futures/dialog/pop/SelectContractOfHistoryPopup\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n145#2,10:98\n71#3:108\n77#4:109\n*E\n"})
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            String strM66668h = C27041f.m66668h(s11 != null ? s11.toString() : null);
            RecyclerView section = C46216k.this.m101903w0().f80500f;
            Intrinsics.checkNotNullExpressionValue(section, "section");
            C27046k.m66684G(section, strM66668h.length() == 0);
            RecyclerView sectionItem = C46216k.this.m101903w0().f80501g;
            Intrinsics.checkNotNullExpressionValue(sectionItem, "sectionItem");
            C27046k.m66684G(sectionItem, strM66668h.length() == 0);
            View line = C46216k.this.m101903w0().f80498d;
            Intrinsics.checkNotNullExpressionValue(line, "line");
            C27046k.m66684G(line, strM66668h.length() == 0);
            BaseTextView empty = C46216k.this.m101903w0().f80497c;
            Intrinsics.checkNotNullExpressionValue(empty, "empty");
            C27046k.m66684G(empty, false);
            RecyclerView searchRecyclerView = C46216k.this.m101903w0().f80499e;
            Intrinsics.checkNotNullExpressionValue(searchRecyclerView, "searchRecyclerView");
            C27046k.m66684G(searchRecyclerView, strM66668h.length() > 0);
            if (strM66668h.length() > 0) {
                C46216k.this.m101906z0(strM66668h);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: xh.k$d */
    /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$initFilters$1", "Lkotlin/Function1;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "", "Lcom/kubi/futures/dialog/pop/ContractFilter;", "invoke", "p1", "(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/Boolean;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d implements Function1<ContractEntity, Boolean> {
        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(ContractEntity p11) {
            Intrinsics.checkNotNullParameter(p11, "p1");
            return Boolean.valueOf(Intrinsics.areEqual(C27041f.m66668h(p11.getQuoteCurrency()), "USDT"));
        }
    }

    /* JADX INFO: renamed from: xh.k$e */
    /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$initFilters$2", "Lkotlin/Function1;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "", "Lcom/kubi/futures/dialog/pop/ContractFilter;", "invoke", "p1", "(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/Boolean;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e implements Function1<ContractEntity, Boolean> {
        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(ContractEntity p11) {
            Intrinsics.checkNotNullParameter(p11, "p1");
            return Boolean.valueOf(Intrinsics.areEqual(C27041f.m66668h(p11.getQuoteCurrency()), "USDC"));
        }
    }

    /* JADX INFO: renamed from: xh.k$f */
    /* JADX INFO: compiled from: SelectContractOfHistoryPopup.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/futures/dialog/pop/SelectContractOfHistoryPopup$initFilters$3", "Lkotlin/Function1;", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "", "Lcom/kubi/futures/dialog/pop/ContractFilter;", "invoke", "p1", "(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/lang/Boolean;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f implements Function1<ContractEntity, Boolean> {
        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(ContractEntity p11) {
            Intrinsics.checkNotNullParameter(p11, "p1");
            return Boolean.valueOf(p11.isInverse());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46216k(@NotNull Context context, @Nullable String str, @NotNull Function1<? super String, Unit> action) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f103756D = context;
        this.f103757E = str;
        this.f103758F = action;
        this.f103759G = LazyKt.lazy(new Function0() { // from class: xh.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46216k.m101894s0(this.f103745b);
            }
        });
        this.f103760H = new HashMap<>();
        this.f103761I = LazyKt.lazy(new Function0() { // from class: xh.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46216k.m101895u0();
            }
        });
        m96307Q(R$layout.bkumex_select_contract_of_history_pop).m96317a0(-1);
        this.f103762J = TtmlNode.COMBINE_ALL;
        this.f103763K = "usdt";
        this.f103764L = "crypto";
        this.f103765M = "usdc";
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m101884G0(C46216k c46216k, a.ContractIndex it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c46216k.m101902v0(it.getSymbol());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m101885I0(C46216k c46216k, b.SectionIndex it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c46216k.m101905y0(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u0 */
    public static final List m101895u0() {
        return RepositoryServiceLocator.f19236a.m20288g().mo25016k();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m101896A0() {
        Object next;
        Object next2;
        Object obj;
        final Pair pair;
        if (this.f103757E == null) {
            m101900H0(CollectionsKt.listOf((Object[]) new b.SectionIndex[]{new b.SectionIndex(this.f103762J, C27017c.f54310a.m66516f(R$string.all, new Object[0]), true), new b.SectionIndex(this.f103763K, "USDT-ⓜ", false), new b.SectionIndex(this.f103765M, "USDC-ⓜ", false), new b.SectionIndex(this.f103764L, "COIN-ⓜ", false)}));
            return;
        }
        List<a.ContractIndex> listM101901t0 = m101901t0(this.f103763K);
        Iterator<T> it = listM101901t0.iterator();
        int i11 = 0;
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                i11++;
            }
        } while (!Intrinsics.areEqual(this.f103757E, ((a.ContractIndex) next).getSymbol()));
        boolean z11 = next != null;
        List<a.ContractIndex> listM101901t1 = m101901t0(this.f103765M);
        Iterator<T> it2 = listM101901t1.iterator();
        int i12 = 0;
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                i12++;
            }
        } while (!Intrinsics.areEqual(this.f103757E, ((a.ContractIndex) next2).getSymbol()));
        boolean z12 = next2 != null;
        List<a.ContractIndex> listM101901t2 = m101901t0(this.f103764L);
        Iterator<T> it3 = listM101901t2.iterator();
        int i13 = 0;
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            Object next3 = it3.next();
            i13++;
            if (Intrinsics.areEqual(this.f103757E, ((a.ContractIndex) next3).getSymbol())) {
                obj = next3;
                break;
            }
        }
        int i14 = i11;
        int i15 = i12;
        int i16 = i13;
        m101900H0(CollectionsKt.listOf((Object[]) new b.SectionIndex[]{new b.SectionIndex(this.f103762J, C27017c.f54310a.m66516f(R$string.all, new Object[0]), false), new b.SectionIndex(this.f103763K, "USDT-ⓜ", z11), new b.SectionIndex(this.f103765M, "USDC-ⓜ", z12), new b.SectionIndex(this.f103764L, "COIN-ⓜ", obj != null)}));
        if (z11) {
            pair = new Pair(listM101901t0, Integer.valueOf(i14));
        } else {
            pair = z12 ? new Pair(listM101901t1, Integer.valueOf(i15)) : new Pair(listM101901t2, Integer.valueOf(i16));
        }
        List<a.ContractIndex> list = (List) pair.getFirst();
        RecyclerView sectionItem = m101903w0().f80501g;
        Intrinsics.checkNotNullExpressionValue(sectionItem, "sectionItem");
        m101899F0(list, sectionItem);
        m101903w0().f80501g.post(new Runnable() { // from class: xh.g
            @Override // java.lang.Runnable
            public final void run() {
                C46216k.m101882B0(this.f103747b, pair);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final void m101898D0() {
        this.f103760H.put(this.f103763K, new d());
        this.f103760H.put(this.f103765M, new e());
        this.f103760H.put(this.f103764L, new f());
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@NotNull View view, @NotNull C43724b popup) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(popup, "popup");
        super.mo25306H(view, popup);
        m101897C0();
        m101898D0();
        m101896A0();
        m101903w0().f80503i.setOnClickListener(new View.OnClickListener() { // from class: xh.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C46216k.m101883E0(this.f103733b, view2);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final List<a.ContractIndex> m101901t0(String str) {
        List<ContractEntity> listMo25016k = RepositoryServiceLocator.f19236a.m20288g().mo25016k();
        ArrayList arrayList = new ArrayList();
        Function1<ContractEntity, Boolean> function1 = this.f103760H.get(str);
        if (function1 == null) {
            return CollectionsKt.emptyList();
        }
        for (ContractEntity contractEntity : listMo25016k) {
            if (function1.invoke(contractEntity).booleanValue()) {
                String strM66668h = C27041f.m66668h(contractEntity.getSymbol());
                String string = FuturesDisplayNameUtils.m24435g(FuturesDisplayNameUtils.f22525a, contractEntity, false, 1, null).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                arrayList.add(new a.ContractIndex(strM66668h, string, Intrinsics.areEqual(C27041f.m66668h(contractEntity.getSymbol()), C27041f.m66668h(this.f103757E))));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m101902v0(String str) {
        this.f103758F.invoke(str);
        m96331y();
    }

    /* JADX INFO: renamed from: w0 */
    public final C36798l4 m101903w0() {
        return (C36798l4) this.f103759G.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    public final List<ContractEntity> m101904x0() {
        return (List) this.f103761I.getValue();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m101906z0(String str) {
        ArrayList arrayList = new ArrayList();
        List<ContractEntity> listM101904x0 = m101904x0();
        ArrayList<ContractEntity> arrayList2 = new ArrayList();
        for (Object obj : listM101904x0) {
            if (C37567b.m84628r((ContractEntity) obj, str)) {
                arrayList2.add(obj);
            }
        }
        for (ContractEntity contractEntity : arrayList2) {
            String strM66668h = C27041f.m66668h(contractEntity.getSymbol());
            String string = FuturesDisplayNameUtils.m24435g(FuturesDisplayNameUtils.f22525a, contractEntity, false, 1, null).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new a.ContractIndex(strM66668h, string, Intrinsics.areEqual(contractEntity.getSymbol(), this.f103757E)));
        }
        if (arrayList.isEmpty()) {
            RecyclerView searchRecyclerView = m101903w0().f80499e;
            Intrinsics.checkNotNullExpressionValue(searchRecyclerView, "searchRecyclerView");
            C27046k.m66684G(searchRecyclerView, false);
            BaseTextView empty = m101903w0().f80497c;
            Intrinsics.checkNotNullExpressionValue(empty, "empty");
            C27046k.m66684G(empty, true);
            return;
        }
        RecyclerView searchRecyclerView2 = m101903w0().f80499e;
        Intrinsics.checkNotNullExpressionValue(searchRecyclerView2, "searchRecyclerView");
        C27046k.m66684G(searchRecyclerView2, true);
        BaseTextView empty2 = m101903w0().f80497c;
        Intrinsics.checkNotNullExpressionValue(empty2, "empty");
        C27046k.m66684G(empty2, false);
        RecyclerView searchRecyclerView3 = m101903w0().f80499e;
        Intrinsics.checkNotNullExpressionValue(searchRecyclerView3, "searchRecyclerView");
        m101899F0(arrayList, searchRecyclerView3);
    }

    /* JADX INFO: renamed from: B0 */
    public static final void m101882B0(C46216k c46216k, Pair pair) {
        if (c46216k.m96299I()) {
            c46216k.m101903w0().f80501g.scrollToPosition(((Number) pair.getSecond()).intValue());
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m101883E0(C46216k c46216k, View view) {
        c46216k.m96331y();
    }

    /* JADX INFO: renamed from: s0 */
    public static final C36798l4 m101894s0(C46216k c46216k) {
        return C36798l4.m82457a(c46216k.m96292A());
    }

    /* JADX INFO: renamed from: C0 */
    public final void m101897C0() {
        ClearEditText edit = m101903w0().f80496b;
        Intrinsics.checkNotNullExpressionValue(edit, "edit");
        edit.addTextChangedListener(new c());
    }

    /* JADX INFO: renamed from: F0 */
    public final void m101899F0(List<a.ContractIndex> list, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            adapter = new a(new Function1() { // from class: xh.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C46216k.m101884G0(this.f103749b, (C46216k.a.ContractIndex) obj);
                }
            });
            recyclerView.setAdapter(adapter);
        }
        ((a) adapter).m101911k(list);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m101900H0(List<b.SectionIndex> list) {
        RecyclerView section = m101903w0().f80500f;
        Intrinsics.checkNotNullExpressionValue(section, "section");
        section.setLayoutManager(new LinearLayoutManager(section.getContext()));
        b bVar = new b(new Function1() { // from class: xh.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C46216k.m101885I0(this.f103751b, (C46216k.b.SectionIndex) obj);
            }
        });
        bVar.m101919k(list);
        section.setAdapter(bVar);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m101905y0(b.SectionIndex sectionIndex) {
        if (Intrinsics.areEqual(sectionIndex.getId(), this.f103762J)) {
            m101902v0(null);
            return;
        }
        List<a.ContractIndex> listM101901t0 = m101901t0(sectionIndex.getId());
        RecyclerView sectionItem = m101903w0().f80501g;
        Intrinsics.checkNotNullExpressionValue(sectionItem, "sectionItem");
        m101899F0(listM101901t0, sectionItem);
    }
}
