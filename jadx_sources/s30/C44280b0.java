package s30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.R$mipmap;
import com.kubi.tradebase.R$string;
import com.kubi.tradebase.tradetype.ITradeTypeBizInfo;
import com.kubi.tradebase.tradetype.ITradeTypePlatform;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t30.C44682b;

/* JADX INFO: renamed from: s30.b0 */
/* JADX INFO: compiled from: ScaledOrderTypeInfoView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u0096\u0001J\t\u0010\u001b\u001a\u00020\u0010H\u0096\u0001J\t\u0010\u001c\u001a\u00020\u0010H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView;", "Lcom/kubi/tradebase/tradetype/ITradeTypeBizInfo;", "Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;", "platformInfo", "<init>", "(Lcom/kubi/tradebase/tradetype/ITradeTypePlatform;)V", "avgData", "", "Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView$ScaledOrderItem;", "ascData", "descData", "displayView", "Landroid/view/View;", "resolveMipmapRes", "", "name", "", "fallback", "displayTitle", "", "tabChangeTrackEvent", "Lkotlin/Pair;", "context", "Landroid/content/Context;", "isConditionalMarket", "", "isFutures", "pageId", "quoteCurrency", "ScaledOrderItem", "ScaledOrderTableAdapter", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScaledOrderTypeInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaledOrderTypeInfoView.kt\ncom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1#2:218\n93#3,13:219\n1563#4:232\n1634#4,3:233\n*S KotlinDebug\n*F\n+ 1 ScaledOrderTypeInfoView.kt\ncom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView\n*L\n133#1:219,13\n75#1:232\n75#1:233,3\n*E\n"})
public final class C44280b0 implements ITradeTypeBizInfo, ITradeTypePlatform {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ITradeTypePlatform f97842a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<ScaledOrderItem> f97843b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<ScaledOrderItem> f97844c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<ScaledOrderItem> f97845d;

    /* JADX INFO: renamed from: s30.b0$a, reason: from toString */
    /* JADX INFO: compiled from: ScaledOrderTypeInfoView.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView$ScaledOrderItem;", "", FirebaseAnalytics.Param.PRICE, "", "amount", "ratio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getAmount", "getRatio", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ScaledOrderItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String price;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String amount;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String ratio;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScaledOrderItem)) {
                return false;
            }
            ScaledOrderItem scaledOrderItem = (ScaledOrderItem) other;
            return Intrinsics.areEqual(this.price, scaledOrderItem.price) && Intrinsics.areEqual(this.amount, scaledOrderItem.amount) && Intrinsics.areEqual(this.ratio, scaledOrderItem.ratio);
        }

        public ScaledOrderItem(@NotNull String price, @NotNull String amount, @NotNull String ratio) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            this.price = price;
            this.amount = amount;
            this.ratio = ratio;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ScaledOrderItem m97702b(ScaledOrderItem scaledOrderItem, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = scaledOrderItem.price;
            }
            if ((i11 & 2) != 0) {
                str2 = scaledOrderItem.amount;
            }
            if ((i11 & 4) != 0) {
                str3 = scaledOrderItem.ratio;
            }
            return scaledOrderItem.m97703a(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ScaledOrderItem m97703a(@NotNull String price, @NotNull String amount, @NotNull String ratio) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(ratio, "ratio");
            return new ScaledOrderItem(price, amount, ratio);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRatio() {
            return this.ratio;
        }

        public int hashCode() {
            return (((this.price.hashCode() * 31) + this.amount.hashCode()) * 31) + this.ratio.hashCode();
        }

        @NotNull
        public String toString() {
            return "ScaledOrderItem(price=" + this.price + ", amount=" + this.amount + ", ratio=" + this.ratio + ')';
        }
    }

    /* JADX INFO: renamed from: s30.b0$b */
    /* JADX INFO: compiled from: ScaledOrderTypeInfoView.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView$ScaledOrderTableAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "quoteCurrency", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "TYPE_HEADER", "", "TYPE_ITEM", "data", "", "Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView$ScaledOrderItem;", "submitList", "", "list", "getItemCount", "getItemViewType", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, "HeaderViewHolder", "ItemViewHolder", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: i */
        @NotNull
        public final Context f97849i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final String f97850j;

        /* JADX INFO: renamed from: k */
        public final int f97851k;

        /* JADX INFO: renamed from: l */
        public final int f97852l;

        /* JADX INFO: renamed from: m */
        @NotNull
        public List<ScaledOrderItem> f97853m;

        /* JADX INFO: renamed from: s30.b0$b$a */
        /* JADX INFO: compiled from: ScaledOrderTypeInfoView.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView$ScaledOrderTableAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
            }
        }

        /* JADX INFO: renamed from: s30.b0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ScaledOrderTypeInfoView.kt */
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView$ScaledOrderTableAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvPrice", "Landroid/widget/TextView;", "getTvPrice", "()Landroid/widget/TextView;", "tvAmount", "getTvAmount", "tvRatio", "getTvRatio", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C47016b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: g */
            @NotNull
            public final TextView f97854g;

            /* JADX INFO: renamed from: h */
            @NotNull
            public final TextView f97855h;

            /* JADX INFO: renamed from: i */
            @NotNull
            public final TextView f97856i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C47016b(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "view");
                View viewFindViewById = view.findViewById(R$id.tvPrice);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.f97854g = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R$id.tvAmount);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.f97855h = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(R$id.tvRatio);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.f97856i = (TextView) viewFindViewById3;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final TextView getF97855h() {
                return this.f97855h;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final TextView getF97854g() {
                return this.f97854g;
            }

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final TextView getF97856i() {
                return this.f97856i;
            }
        }

        public b(@NotNull Context context, @NotNull String quoteCurrency) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
            this.f97849i = context;
            this.f97850j = quoteCurrency;
            this.f97852l = 1;
            this.f97853m = CollectionsKt.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f97853m.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return position == 0 ? this.f97851k : this.f97852l;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder instanceof C47016b) {
                ScaledOrderItem scaledOrderItem = this.f97853m.get(position - 1);
                C47016b c47016b = (C47016b) holder;
                c47016b.getF97854g().setText(scaledOrderItem.getPrice());
                c47016b.getF97855h().setText(scaledOrderItem.getAmount());
                c47016b.getF97856i().setText(scaledOrderItem.getRatio());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            if (viewType != this.f97851k) {
                View viewInflate = layoutInflaterFrom.inflate(R$layout.btradebase_item_scaled_order_table_row, parent, false);
                Intrinsics.checkNotNull(viewInflate);
                return new C47016b(viewInflate);
            }
            View viewInflate2 = layoutInflaterFrom.inflate(R$layout.btradebase_item_scaled_order_table_header, parent, false);
            ((TextView) viewInflate2.findViewById(R$id.tvHeaderPrice)).setText(this.f97849i.getString(R$string.price_order, this.f97850j));
            Intrinsics.checkNotNull(viewInflate2);
            return new a(viewInflate2);
        }

        public final void submitList(@NotNull List<ScaledOrderItem> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f97853m = list;
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: s30.b0$c */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n+ 2 ScaledOrderTypeInfoView.kt\ncom/kubi/tradebase/tradetype/type/ScaledOrderTypeInfoView\n*L\n1#1,414:1\n133#2:415\n*E\n"})
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f97857b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ShapeTextView f97858c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ShapeTextView f97859d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ShapeTextView f97860e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TextView f97861f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ View f97862g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ImageView f97863h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C44280b0 f97864i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ b f97865j;

        public c(View view, ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view2, ImageView imageView, C44280b0 c44280b0, b bVar) {
            this.f97857b = view;
            this.f97858c = shapeTextView;
            this.f97859d = shapeTextView2;
            this.f97860e = shapeTextView3;
            this.f97861f = textView;
            this.f97862g = view2;
            this.f97863h = imageView;
            this.f97864i = c44280b0;
            this.f97865j = bVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            this.f97857b.removeOnAttachStateChangeListener(this);
            C44280b0.m97700r(this.f97858c, this.f97859d, this.f97860e, this.f97861f, this.f97862g, this.f97863h, this.f97864i, this.f97865j, 0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m97696n(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, ImageView imageView, C44280b0 c44280b0, b bVar) {
        m97700r(shapeTextView, shapeTextView2, shapeTextView3, textView, view, imageView, c44280b0, bVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m97697o(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, ImageView imageView, C44280b0 c44280b0, b bVar) {
        m97700r(shapeTextView, shapeTextView2, shapeTextView3, textView, view, imageView, c44280b0, bVar, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m97698p(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, ImageView imageView, C44280b0 c44280b0, b bVar) {
        m97700r(shapeTextView, shapeTextView2, shapeTextView3, textView, view, imageView, c44280b0, bVar, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m97700r(ShapeTextView shapeTextView, ShapeTextView shapeTextView2, ShapeTextView shapeTextView3, TextView textView, View view, ImageView imageView, C44280b0 c44280b0, b bVar, int i11) {
        shapeTextView.setSelected(i11 == 0);
        shapeTextView2.setSelected(i11 == 1);
        shapeTextView3.setSelected(i11 == 2);
        if (i11 == 0) {
            textView.setText(view.getContext().getString(R$string.kumex_segment_average_desc));
            imageView.setImageResource(c44280b0.m97701s("trade_ordertype_scaled_uniform", R$mipmap.trade_ordertype_segment_uniform));
            List<ScaledOrderItem> list = c44280b0.f97843b;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            bVar.submitList(m97699q(list, context));
        } else if (i11 == 1) {
            textView.setText(view.getContext().getString(R$string.kumex_segment_incremental_desc));
            imageView.setImageResource(c44280b0.m97701s("trade_ordertype_scaled_asc", R$mipmap.trade_ordertype_segment_increasing));
            List<ScaledOrderItem> list2 = c44280b0.f97844c;
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            bVar.submitList(m97699q(list2, context2));
        } else if (i11 == 2) {
            textView.setText(view.getContext().getString(R$string.kumex_segment_decreasing_desc));
            imageView.setImageResource(c44280b0.m97701s("trade_ordertype_scaled_desc", R$mipmap.trade_ordertype_segment_decreasing));
            List<ScaledOrderItem> list3 = c44280b0.f97845d;
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            bVar.submitList(m97699q(list3, context3));
        }
        m97695m(imageView);
    }

    public C44280b0(@NotNull ITradeTypePlatform platformInfo) {
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        this.f97842a = platformInfo;
        this.f97843b = CollectionsKt.listOf((Object[]) new ScaledOrderItem[]{new ScaledOrderItem("57,000", "0.25 BTC", "25%"), new ScaledOrderItem("58,000", "0.25 BTC", "25%"), new ScaledOrderItem("59,000", "0.25 BTC", "25%"), new ScaledOrderItem("60,000", "0.25 BTC", "25%")});
        this.f97844c = CollectionsKt.listOf((Object[]) new ScaledOrderItem[]{new ScaledOrderItem("57,000", "0.1 BTC", "10%"), new ScaledOrderItem("58,000", "0.2 BTC", "20%"), new ScaledOrderItem("59,000", "0.3 BTC", "30%"), new ScaledOrderItem("60,000", "0.4 BTC", "40%")});
        this.f97845d = CollectionsKt.listOf((Object[]) new ScaledOrderItem[]{new ScaledOrderItem("57,000", "0.4 BTC", "40%"), new ScaledOrderItem("58,000", "0.3 BTC", "30%"), new ScaledOrderItem("59,000", "0.2 BTC", "20%"), new ScaledOrderItem("60,000", "0.1 BTC", "10%")});
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: a */
    public String mo63362a() {
        return this.f97842a.mo63362a();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: d */
    public Pair<String, String> mo63387d() {
        return new Pair<>(pageId(), "orderIntroScaledOrderTab");
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    /* JADX INFO: renamed from: e */
    public Context mo63363e() {
        return this.f97842a.mo63363e();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: f */
    public boolean mo63364f() {
        return this.f97842a.mo63364f();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    /* JADX INFO: renamed from: g */
    public boolean mo63365g() {
        return this.f97842a.mo63365g();
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypePlatform
    @NotNull
    public String pageId() {
        return this.f97842a.pageId();
    }

    /* JADX INFO: renamed from: m */
    public static final void m97695m(ImageView imageView) {
        Intrinsics.checkNotNull(imageView);
        C44682b.m98836a(imageView);
    }

    /* JADX INFO: renamed from: q */
    public static final List<ScaledOrderItem> m97699q(List<ScaledOrderItem> list, Context context) {
        if (C44682b.m98837b(context)) {
            list = CollectionsKt.reversed(list);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ScaledOrderItem scaledOrderItem : list) {
            arrayList.add(ScaledOrderItem.m97702b(scaledOrderItem, null, C44682b.m98838c(scaledOrderItem.getAmount(), context), C44682b.m98840e(scaledOrderItem.getRatio(), context), 1, null));
        }
        return arrayList;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: b */
    public CharSequence mo63385b() {
        String string = mo63363e().getString(R$string.kemex_segment_delegation);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.kubi.tradebase.tradetype.ITradeTypeBizInfo
    @NotNull
    /* JADX INFO: renamed from: c */
    public View mo63386c() {
        View view;
        final View viewInflate = LayoutInflater.from(mo63363e()).inflate(R$layout.btradebase_view_scaled_order_trade_info, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.rvTable);
        recyclerView.setLayoutManager(new LinearLayoutManager(mo63363e()));
        String strMo63362a = mo63362a();
        if (strMo63362a.length() == 0) {
            strMo63362a = "USDT";
        }
        final b bVar = new b(mo63363e(), strMo63362a);
        recyclerView.setAdapter(bVar);
        final TextView textView = (TextView) viewInflate.findViewById(R$id.tvDescDetail);
        final ImageView imageView = (ImageView) viewInflate.findViewById(R$id.ivType);
        final ShapeTextView shapeTextView = (ShapeTextView) viewInflate.findViewById(R$id.tvAvg);
        final ShapeTextView shapeTextView2 = (ShapeTextView) viewInflate.findViewById(R$id.tvAsc);
        final ShapeTextView shapeTextView3 = (ShapeTextView) viewInflate.findViewById(R$id.tvDescTab);
        Intrinsics.checkNotNull(shapeTextView);
        C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: s30.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44280b0.m97696n(shapeTextView, shapeTextView2, shapeTextView3, textView, viewInflate, imageView, this, bVar);
            }
        }, 1, null);
        Intrinsics.checkNotNull(shapeTextView2);
        C27046k.m66711z(shapeTextView2, 0L, new Function0() { // from class: s30.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44280b0.m97697o(shapeTextView, shapeTextView2, shapeTextView3, textView, viewInflate, imageView, this, bVar);
            }
        }, 1, null);
        Intrinsics.checkNotNull(shapeTextView3);
        C27046k.m66711z(shapeTextView3, 0L, new Function0() { // from class: s30.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44280b0.m97698p(shapeTextView, shapeTextView2, shapeTextView3, textView, viewInflate, imageView, this, bVar);
            }
        }, 1, null);
        Intrinsics.checkNotNull(viewInflate);
        if (viewInflate.isAttachedToWindow()) {
            m97700r(shapeTextView, shapeTextView2, shapeTextView3, textView, viewInflate, imageView, this, bVar, 0);
            view = viewInflate;
        } else {
            c cVar = new c(viewInflate, shapeTextView, shapeTextView2, shapeTextView3, textView, viewInflate, imageView, this, bVar);
            view = viewInflate;
            view.addOnAttachStateChangeListener(cVar);
        }
        Intrinsics.checkNotNullExpressionValue(view, "apply(...)");
        return view;
    }

    /* JADX INFO: renamed from: s */
    public final int m97701s(String str, int i11) {
        int identifier = mo63363e().getResources().getIdentifier(str, "mipmap", mo63363e().getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        return i11;
    }
}
