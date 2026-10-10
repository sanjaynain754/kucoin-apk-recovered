package com.kubi.user.protocol.text;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.user.R$drawable;
import com.kubi.user.R$id;
import com.kubi.user.R$layout;
import com.tencent.bugly.proguard.C33954u6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.user.protocol.text.n, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SignProtocolProcessListAdapter.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolProcessListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kubi/user/protocol/text/SignProtocolProcessListAdapter$ViewHolder;", "protocolNameList", "", "", "activeIndex", "", "<init>", "(Ljava/util/List;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "updateActiveIndex", "newIndex", "ViewHolder", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SignProtocolProcessListAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<String> f53785i;

    /* JADX INFO: renamed from: j */
    public int f53786j;

    /* JADX INFO: renamed from: com.kubi.user.protocol.text.n$a */
    /* JADX INFO: compiled from: SignProtocolProcessListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/user/protocol/text/SignProtocolProcessListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "index", "Lcom/kubi/resources/widget/BaseTextView;", "getIndex", "()Lcom/kubi/resources/widget/BaseTextView;", "protocolName", "getProtocolName", "check", "Landroid/widget/ImageView;", "getCheck", "()Landroid/widget/ImageView;", "arrow", "getArrow", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final BaseTextView f53787g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final BaseTextView f53788h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f53789i;

        /* JADX INFO: renamed from: j */
        @NotNull
        public final ImageView f53790j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tvProtocolIndex);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f53787g = (BaseTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tvProtocolName);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f53788h = (BaseTextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.imgProtocolCheck);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f53789i = (ImageView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.imgProtocolArrow);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.f53790j = (ImageView) viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF53790j() {
            return this.f53790j;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageView getF53789i() {
            return this.f53789i;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseTextView getF53787g() {
            return this.f53787g;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final BaseTextView getF53788h() {
            return this.f53788h;
        }
    }

    public SignProtocolProcessListAdapter(@NotNull List<String> protocolNameList, int i11) {
        Intrinsics.checkNotNullParameter(protocolNameList, "protocolNameList");
        this.f53785i = protocolNameList;
        this.f53786j = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getF53787g().setText(String.valueOf(i11 + 1));
        holder.getF53788h().setText(this.f53785i.get(i11));
        int i12 = this.f53786j;
        if (i11 < i12) {
            holder.getF53787g().setVisibility(8);
            holder.getF53788h().setVisibility(8);
            holder.getF53789i().setVisibility(0);
        } else if (i11 == i12) {
            holder.getF53787g().setVisibility(0);
            holder.getF53787g().setBackgroundResource(R$drawable.shape_oval_emphasis);
            holder.getF53788h().setVisibility(0);
            holder.getF53789i().setVisibility(8);
        } else if (i11 > i12) {
            holder.getF53787g().setVisibility(0);
            holder.getF53787g().setBackgroundResource(R$drawable.shape_oval_emphasis20_without_stroke);
            holder.getF53788h().setVisibility(8);
            holder.getF53789i().setVisibility(8);
        }
        holder.getF53790j().setVisibility(i11 == getItemCount() + (-1) ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f53785i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.busercenter_sign_protocol_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    /* JADX INFO: renamed from: i */
    public final void m65693i(int i11) {
        this.f53786j = i11;
        notifyDataSetChanged();
    }
}
