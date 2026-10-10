package com.kubi.assets.dialog.payment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$mipmap;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44873u1;
import p637ta.C44880v1;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aB;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetGroupItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "", "Lcom/kubi/assets/dialog/payment/AssetPaymentListItem;", "tradeType", "", "itemClick", "Lkotlin/Function2;", "", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getItemViewType", "", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, "getItemCount", "Companion", "FullViewHolder", "HalfViewHolder", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetGroupItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f17147l = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<AssetPaymentListItem> f17148i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final String f17149j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Function2<AssetPaymentListItem, Boolean, Unit> f17150k;

    /* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetGroupItemAdapter$Companion;", "", "<init>", "()V", "ITEM_TYPE_FULL", "", "ITEM_TYPE_HALF", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetGroupItemAdapter$a */
    /* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetGroupItemAdapter$FullViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/kubi/assets/dialog/payment/AssetPaymentListItem;", "isLastUse", "", "itemClick", "Lkotlin/Function2;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9816a extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9816a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m16311c(Function2 function2, AssetPaymentListItem assetPaymentListItem, boolean z11) {
            if (function2 != null) {
                function2.invoke(assetPaymentListItem, Boolean.valueOf(z11));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public final void m16312b(@NotNull final AssetPaymentListItem item, final boolean z11, @Nullable final Function2<? super AssetPaymentListItem, ? super Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(item, "item");
            C44880v1 c44880v1M99284a = C44880v1.m99284a(this.itemView);
            Intrinsics.checkNotNullExpressionValue(c44880v1M99284a, "bind(...)");
            c44880v1M99284a.f100991e.setText(C27041f.m66668h(item.getPaymentMethodName()));
            c44880v1M99284a.f100992f.setText(C27041f.m66668h(item.getDescription()));
            AppCompatImageView appCompatImageView = c44880v1M99284a.f100988b;
            C46338a.m102151a(appCompatImageView.getContext()).mo6634v(item.getIconUrl()).mo92188b0(R$mipmap.kucoin_icon_default_icon).m6594E0(appCompatImageView);
            ShapeTextView tvLastUse = c44880v1M99284a.f100990d;
            Intrinsics.checkNotNullExpressionValue(tvLastUse, "tvLastUse");
            AssetExKt.m15138z(tvLastUse, z11);
            LinearLayoutCompat jumpRoot = c44880v1M99284a.f100989c;
            Intrinsics.checkNotNullExpressionValue(jumpRoot, "jumpRoot");
            C27046k.m66711z(jumpRoot, 0L, new Function0() { // from class: com.kubi.assets.dialog.payment.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetGroupItemAdapter.C9816a.m16311c(function2, item, z11);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetGroupItemAdapter$b */
    /* JADX INFO: compiled from: AssetMultiPaymentContentAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetGroupItemAdapter$HalfViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "Lcom/kubi/assets/dialog/payment/AssetPaymentListItem;", "isLastUse", "", "itemClick", "Lkotlin/Function2;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9817b extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9817b(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final Unit m16314c(Function2 function2, AssetPaymentListItem assetPaymentListItem, boolean z11) {
            if (function2 != null) {
                function2.invoke(assetPaymentListItem, Boolean.valueOf(z11));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public final void m16315b(@NotNull final AssetPaymentListItem item, final boolean z11, @Nullable final Function2<? super AssetPaymentListItem, ? super Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(item, "item");
            C44873u1 c44873u1M99270a = C44873u1.m99270a(this.itemView);
            Intrinsics.checkNotNullExpressionValue(c44873u1M99270a, "bind(...)");
            c44873u1M99270a.f100930e.setText(C27041f.m66668h(item.getPaymentMethodName()));
            AppCompatImageView appCompatImageView = c44873u1M99270a.f100927b;
            C46338a.m102151a(appCompatImageView.getContext()).mo6634v(item.getIconUrl()).mo92188b0(R$mipmap.kucoin_icon_default_icon).m6594E0(appCompatImageView);
            ShapeTextView tvLastUse = c44873u1M99270a.f100929d;
            Intrinsics.checkNotNullExpressionValue(tvLastUse, "tvLastUse");
            AssetExKt.m15138z(tvLastUse, z11);
            LinearLayoutCompat jumpRoot = c44873u1M99270a.f100928c;
            Intrinsics.checkNotNullExpressionValue(jumpRoot, "jumpRoot");
            C27046k.m66711z(jumpRoot, 0L, new Function0() { // from class: com.kubi.assets.dialog.payment.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetGroupItemAdapter.C9817b.m16314c(function2, item, z11);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetGroupItemAdapter(@NotNull List<AssetPaymentListItem> data, @Nullable String str, @Nullable Function2<? super AssetPaymentListItem, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17148i = data;
        this.f17149j = str;
        this.f17150k = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f17148i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return !Intrinsics.areEqual(this.f17148i.get(position).getDisplayType(), "L") ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AssetPaymentListItem assetPaymentListItem = this.f17148i.get(position);
        boolean zM16377c = AssetPaymentLastUseHelper.f17185a.m16377c(this.f17149j, assetPaymentListItem.getPaymentMethodCode());
        if (holder instanceof C9816a) {
            ((C9816a) holder).m16312b(assetPaymentListItem, zM16377c, this.f17150k);
        } else if (holder instanceof C9817b) {
            ((C9817b) holder).m16315b(assetPaymentListItem, zM16377c, this.f17150k);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (viewType == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R$layout.asset_multi_payment_dialog_item_row, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new C9816a(viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R$layout.asset_multi_payment_dialog_item_grid, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new C9817b(viewInflate2);
    }
}
