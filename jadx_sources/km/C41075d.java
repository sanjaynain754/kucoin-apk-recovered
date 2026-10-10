package km;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.trade.ContractsOfflineManager;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.C27022e0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import dm.C36869x3;
import fm.C37567b;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import rs.C44172b;

/* JADX INFO: renamed from: km.d */
/* JADX INFO: compiled from: DrawerAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001$B;\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0016J\u0016\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u000bH\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR)\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/adapter/DrawerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/kumex/market/tradingArea/adapter/DrawerAdapter$DrawerViewHolder;", "Lcom/kubi/kumex/market/tradingArea/adapter/AdapterData;", "click", "Lkotlin/Function1;", "Lcom/kubi/kumex/market/ContractObject;", "", "longClick", "Lkotlin/Function3;", "Landroid/view/View;", "", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getClick", "()Lkotlin/jvm/functions/Function1;", "getLongClick", "()Lkotlin/jvm/functions/Function3;", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemId", "", "getItemCount", "getList", "notifySetDataChanged", "data", "", "removeItem", "index", "DrawerViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41075d extends RecyclerView.Adapter<a> implements InterfaceC41072a {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Function1<ContractObject, Unit> f91288i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Function3<View, Integer, ContractObject, Unit> f91289j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<ContractObject> f91290k;

    /* JADX INFO: renamed from: km.d$a */
    /* JADX INFO: compiled from: DrawerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/adapter/DrawerAdapter$DrawerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexItemContractDrawerBinding;", "<init>", "(Lcom/kubi/kumex/market/tradingArea/adapter/DrawerAdapter;Lcom/kubi/kumex/databinding/BkumexItemContractDrawerBinding;)V", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexItemContractDrawerBinding;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final C36869x3 f91291g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C41075d f91292h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull C41075d c41075d, C36869x3 viewBinding) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            this.f91292h = c41075d;
            this.f91291g = viewBinding;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final C36869x3 getF91291g() {
            return this.f91291g;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41075d(@NotNull Function1<? super ContractObject, Unit> click, @NotNull Function3<? super View, ? super Integer, ? super ContractObject, Unit> longClick) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(longClick, "longClick");
        this.f91288i = click;
        this.f91289j = longClick;
        setHasStableIds(true);
        this.f91290k = new ArrayList();
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m90055l(a aVar, C41075d c41075d, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < c41075d.f91290k.size()) {
            c41075d.f91289j.invoke(it, Integer.valueOf(bindingAdapterPosition), c41075d.f91290k.get(bindingAdapterPosition));
        }
        return true;
    }

    @Override // km.InterfaceC41072a
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<ContractObject> mo90050a() {
        return this.f91290k;
    }

    @Override // km.InterfaceC41072a
    /* JADX INFO: renamed from: c */
    public void mo90051c(@NotNull List<? extends ContractObject> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f91290k.clear();
        this.f91290k.addAll(data);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f91290k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i11 < 0) {
            return;
        }
        ContractObject contractObject = this.f91290k.get(i11);
        ImageView ivFavor = holder.getF91291g().f81332g;
        Intrinsics.checkNotNullExpressionValue(ivFavor, "ivFavor");
        C27046k.m66684G(ivFavor, contractObject.m34387h() && contractObject.getF29416a() != 0);
        ShowHideTextView showHideTextView = holder.getF91291g().f81330e;
        ContractEntity f29420e = contractObject.getF29420e();
        showHideTextView.setText(C27041f.m66669i(f29420e != null ? FuturesDisplayNameUtils.f22525a.m24442h(f29420e) : null, C42180b.m92647l(contractObject.getF29417b().getSymbol())));
        ShapeTextView shapeTextView = holder.getF91291g().f81334i;
        String string = holder.itemView.getContext().getString(R$string.perpetual_contract, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        shapeTextView.setText(StringsKt.trim((CharSequence) string).toString());
        ShapeTextView perpLabel = holder.getF91291g().f81334i;
        Intrinsics.checkNotNullExpressionValue(perpLabel, "perpLabel");
        ContractEntity f29420e2 = contractObject.getF29420e();
        C27046k.m66684G(perpLabel, C27025c.m66566d(f29420e2 != null ? Boolean.valueOf(C37567b.m84625o(f29420e2)) : null));
        ShapeTextView preMarketLabel = holder.getF91291g().f81335j;
        Intrinsics.checkNotNullExpressionValue(preMarketLabel, "preMarketLabel");
        ContractEntity f29420e3 = contractObject.getF29420e();
        C27046k.m66684G(preMarketLabel, C27025c.m66566d(f29420e3 != null ? Boolean.valueOf(f29420e3.isPreMarket()) : null));
        ImageView ivFire = holder.getF91291g().f81333h;
        Intrinsics.checkNotNullExpressionValue(ivFire, "ivFire");
        C27046k.m66684G(ivFire, C27025c.m66566d(contractObject.getF29417b().getRecommended()));
        ShapeTextView tvOfflineTips = holder.getF91291g().f81339n;
        Intrinsics.checkNotNullExpressionValue(tvOfflineTips, "tvOfflineTips");
        C27046k.m66684G(tvOfflineTips, ContractsOfflineManager.f30505a.m36295g(contractObject.getF29420e()));
        ShapeTextView tagNew = holder.getF91291g().f81337l;
        Intrinsics.checkNotNullExpressionValue(tagNew, "tagNew");
        long jMo25031v = RepositoryServiceLocator.f19236a.m20288g().mo25031v();
        ContractEntity f29420e4 = contractObject.getF29420e();
        C27046k.m66684G(tagNew, jMo25031v - C27039d.m66652l(f29420e4 != null ? Long.valueOf(f29420e4.getFirstOpenDate()) : null) < 604800000);
        ShowHideTextView drawerPrice = holder.getF91291g().f81328c;
        Intrinsics.checkNotNullExpressionValue(drawerPrice, "drawerPrice");
        C44172b.m97383c(drawerPrice, null, false, 3, null).setText(contractObject.getF29421f());
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM54282g = C22890g.m54282g(context, C27039d.m66656p(contractObject.getF29417b().getPriceChgPct()), 0, 2, null);
        holder.getF91291g().f81329d.setText(contractObject.getF29422g());
        holder.getF91291g().f81329d.setTextColor(iM54282g);
        View view = holder.itemView;
        C27022e0 c27022e0 = C27022e0.f54314a;
        ContractEntity f29420e5 = contractObject.getF29420e();
        view.setBackgroundResource((c27022e0.m66528a(f29420e5 != null ? f29420e5.getSymbol() : null, contractObject.getF29419d()) || contractObject.getF29418c() == holder.getBindingAdapterPosition()) ? R$color.c_cover2 : R$drawable.selector_slide_style_click);
        g gVar = g.a;
        boolean zO = gVar.o(contractObject.getF29420e());
        BaseTextView countDownView = holder.getF91291g().f81327b;
        Intrinsics.checkNotNullExpressionValue(countDownView, "countDownView");
        C27046k.m66684G(countDownView, zO);
        BaseTextView tv1 = holder.getF91291g().f81338m;
        Intrinsics.checkNotNullExpressionValue(tv1, "tv1");
        C27046k.m66684G(tv1, zO);
        ShowHideTextView drawerPrice2 = holder.getF91291g().f81328c;
        Intrinsics.checkNotNullExpressionValue(drawerPrice2, "drawerPrice");
        C27046k.m66684G(drawerPrice2, !zO);
        ShowHideTextView drawerRate = holder.getF91291g().f81329d;
        Intrinsics.checkNotNullExpressionValue(drawerRate, "drawerRate");
        C27046k.m66684G(drawerRate, !zO);
        int f29416a = contractObject.getF29416a();
        ContractEntity f29420e6 = contractObject.getF29420e();
        BaseTextView countDownView2 = holder.getF91291g().f81327b;
        Intrinsics.checkNotNullExpressionValue(countDownView2, "countDownView");
        gVar.t(f29416a, f29420e6, countDownView2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C36869x3 c36869x3M82606c = C36869x3.m82606c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c36869x3M82606c, "inflate(...)");
        final a aVar = new a(this, c36869x3M82606c);
        View itemView = aVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: km.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41075d.m90054k(aVar, this);
            }
        }, 1, null);
        View itemView2 = aVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        ViewExtKt.m66582m(itemView2, new Function1() { // from class: km.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C41075d.m90055l(aVar, this, (View) obj));
            }
        });
        return aVar;
    }

    @Override // km.InterfaceC41072a
    public void removeItem(int index) {
        if (index < 0 || index >= this.f91290k.size()) {
            return;
        }
        this.f91290k.remove(index);
        notifyItemRemoved(index);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m90054k(a aVar, C41075d c41075d) {
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < c41075d.f91290k.size()) {
            c41075d.f91288i.invoke(c41075d.f91290k.get(bindingAdapterPosition));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
