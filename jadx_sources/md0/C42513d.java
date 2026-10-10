package md0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.component.gift.view.ImageLoader;
import io.trtc.tuikit.atomicxcore.api.gift.Gift;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: md0.d */
/* JADX INFO: compiled from: GiftPanelAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u001a\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftPanelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftPanelAdapter$ViewHolder;", "mPageIndex", "", "mGiftModelList", "", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "mContext", "Landroid/content/Context;", "<init>", "(ILjava/util/List;Landroid/content/Context;)V", "mOnItemClickListener", "Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftPanelAdapter$OnItemClickListener;", "mSelectedPosition", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "ViewHolder", "OnItemClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42513d extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i */
    public final int f94197i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<Gift> f94198j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Context f94199k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public a f94200l;

    /* JADX INFO: renamed from: m */
    public int f94201m;

    /* JADX INFO: renamed from: md0.d$a */
    /* JADX INFO: compiled from: GiftPanelAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftPanelAdapter$OnItemClickListener;", "", "onItemClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "gift", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", ViewProps.POSITION, "", "pageIndex", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo92606a(@Nullable View view, @NotNull Gift gift, int i11, int i12);
    }

    /* JADX INFO: renamed from: md0.d$b */
    /* JADX INFO: compiled from: GiftPanelAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftPanelAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mLayoutRootView", "Landroid/widget/LinearLayout;", "getMLayoutRootView", "()Landroid/widget/LinearLayout;", "setMLayoutRootView", "(Landroid/widget/LinearLayout;)V", "mLayoutGiftView", "getMLayoutGiftView", "setMLayoutGiftView", "mImageGift", "Landroid/widget/ImageView;", "getMImageGift", "()Landroid/widget/ImageView;", "setMImageGift", "(Landroid/widget/ImageView;)V", "mTextGiftName", "Landroid/widget/TextView;", "getMTextGiftName", "()Landroid/widget/TextView;", "setMTextGiftName", "(Landroid/widget/TextView;)V", "mTextGiftPrice", "getMTextGiftPrice", "setMTextGiftPrice", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public LinearLayout f94202g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public LinearLayout f94203h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public ImageView f94204i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public TextView f94205j;

        /* JADX INFO: renamed from: k */
        @NotNull
        public TextView f94206k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(R$id.ll_gift_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f94202g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.ll_gift);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f94203h = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.iv_gift_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f94204i = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R$id.tv_gift_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f94205j = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R$id.tv_gift_price);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.f94206k = (TextView) viewFindViewById5;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF94204i() {
            return this.f94204i;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF94203h() {
            return this.f94203h;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final LinearLayout getF94202g() {
            return this.f94202g;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextView getF94205j() {
            return this.f94205j;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getF94206k() {
            return this.f94206k;
        }
    }

    public C42513d(int i11, @NotNull List<Gift> mGiftModelList, @NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mGiftModelList, "mGiftModelList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f94197i = i11;
        this.f94198j = mGiftModelList;
        this.f94199k = mContext;
    }

    /* JADX INFO: renamed from: j */
    public static final void m93226j(C42513d c42513d, b bVar, View view) {
        int i11 = c42513d.f94201m;
        c42513d.f94201m = bVar.getBindingAdapterPosition();
        if (i11 != -1) {
            c42513d.notifyItemChanged(i11);
        }
        int i12 = c42513d.f94201m;
        if (i12 != -1) {
            c42513d.notifyItemChanged(i12);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m93227k(C42513d c42513d, int i11, Gift gift, View view) {
        if (c42513d.f94201m == i11) {
            c42513d.f94201m = -1;
            a aVar = c42513d.f94200l;
            Intrinsics.checkNotNull(aVar);
            aVar.mo92606a(view, gift, i11, c42513d.f94197i);
            c42513d.notifyItemChanged(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94198j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final b holder, final int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Gift gift = this.f94198j.get(i11);
        ImageLoader.m79679b(ImageLoader.f77792a, this.f94199k, holder.getF94204i(), gift.getIconURL(), 0, 0, 24, null);
        String string = this.f94201m == i11 ? this.f94199k.getString(R$string.common_gift_give_gift) : gift.getName();
        Intrinsics.checkNotNull(string);
        holder.getF94205j().setText(string);
        holder.getF94202g().setBackground(null);
        holder.getF94206k().setText(String.valueOf(gift.getCoins()));
        holder.getF94203h().setBackgroundResource(this.f94201m == i11 ? R$drawable.gift_selected_bg : R$drawable.gift_normal_bg);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: md0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42513d.m93226j(this.f94192b, holder, view);
            }
        });
        holder.getF94205j().setOnClickListener(new View.OnClickListener() { // from class: md0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42513d.m93227k(this.f94194b, i11, gift, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f94199k).inflate(R$layout.gift_layout_panel_recycle_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    public final void setOnItemClickListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f94200l = listener;
    }
}
