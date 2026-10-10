package com.trtc.uikit.livekit.component.beauty.basicbeauty.view;

import android.annotation.SuppressLint;
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
import com.trtc.uikit.livekit.component.beauty.basicbeauty.view.BeautyListAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BeautyListAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0017J\b\u0010\u0019\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "currentBeautyType", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;", "onItemClickListener", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$OnItemClickListener;", "data", "", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyItem;", "setOnItemClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ViewHolder", "BeautyItem", "BeautyType", "OnItemClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BeautyListAdapter extends RecyclerView.Adapter<C35902c> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public BeautyType f77682i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InterfaceC35901b f77683j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<BeautyItem> f77684k;

    /* JADX INFO: compiled from: BeautyListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "CLOSE", "SMOOTH", "WHITENESS", "RUDDY", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum BeautyType {
        NONE(0),
        CLOSE(1),
        SMOOTH(2),
        WHITENESS(3),
        RUDDY(4);


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f77686c = EnumEntriesKt.enumEntries(m79565a());
        private final int value;

        @NotNull
        public static EnumEntries<BeautyType> getEntries() {
            return f77686c;
        }

        public final int getValue() {
            return this.value;
        }

        BeautyType(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.view.BeautyListAdapter$a, reason: from toString */
    /* JADX INFO: compiled from: BeautyListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyItem;", "", "title", "", TUIConstants.TUIChat.INPUT_MORE_ICON, "", "type", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "<init>", "(Ljava/lang/String;ILcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;Landroid/view/View$OnClickListener;)V", "getTitle", "()Ljava/lang/String;", "getIcon", "()I", "getType", "()Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;", "getListener", "()Landroid/view/View$OnClickListener;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BeautyItem {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int icon;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final BeautyType type;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public final View.OnClickListener listener;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeautyItem)) {
                return false;
            }
            BeautyItem beautyItem = (BeautyItem) other;
            return Intrinsics.areEqual(this.title, beautyItem.title) && this.icon == beautyItem.icon && this.type == beautyItem.type && Intrinsics.areEqual(this.listener, beautyItem.listener);
        }

        public BeautyItem(@NotNull String title, int i11, @NotNull BeautyType type, @Nullable View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = title;
            this.icon = i11;
            this.type = type;
            this.listener = onClickListener;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final BeautyType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + Integer.hashCode(this.icon)) * 31) + this.type.hashCode()) * 31;
            View.OnClickListener onClickListener = this.listener;
            return iHashCode + (onClickListener == null ? 0 : onClickListener.hashCode());
        }

        @NotNull
        public String toString() {
            return "BeautyItem(title=" + this.title + ", icon=" + this.icon + ", type=" + this.type + ", listener=" + this.listener + ')';
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.view.BeautyListAdapter$b */
    /* JADX INFO: compiled from: BeautyListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$OnItemClickListener;", "", "onItemClick", "", "type", "Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$BeautyType;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC35901b {
        /* JADX INFO: renamed from: a */
        void mo79569a(@NotNull BeautyType beautyType);
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.component.beauty.basicbeauty.view.BeautyListAdapter$c */
    /* JADX INFO: compiled from: BeautyListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/beauty/basicbeauty/view/BeautyListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "layoutRoot", "Landroid/widget/LinearLayout;", "getLayoutRoot", "()Landroid/widget/LinearLayout;", "textTitle", "Landroid/widget/TextView;", "getTextTitle", "()Landroid/widget/TextView;", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C35902c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final LinearLayout f77691g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f77692h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final ImageView f77693i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35902c(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.ll_root);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f77691g = (LinearLayout) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f77692h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.iv_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f77693i = (ImageView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF77693i() {
            return this.f77693i;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF77691g() {
            return this.f77691g;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF77692h() {
            return this.f77692h;
        }
    }

    public BeautyListAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77682i = BeautyType.NONE;
        String string = context.getString(R$string.common_beauty_item_close);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        BeautyItem beautyItem = new BeautyItem(string, R$drawable.beauty_item_close, BeautyType.CLOSE, null);
        String string2 = context.getString(R$string.common_beauty_item_smooth);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        BeautyItem beautyItem2 = new BeautyItem(string2, R$drawable.beauty_item_smooth, BeautyType.SMOOTH, null);
        String string3 = context.getString(R$string.common_beauty_item_whiteness);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        BeautyItem beautyItem3 = new BeautyItem(string3, R$drawable.beauty_item_whiteness, BeautyType.WHITENESS, null);
        String string4 = context.getString(R$string.common_beauty_item_ruddy);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        this.f77684k = CollectionsKt.listOf((Object[]) new BeautyItem[]{beautyItem, beautyItem2, beautyItem3, new BeautyItem(string4, R$drawable.beauty_item_ruddy, BeautyType.RUDDY, null)});
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f77684k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"RecyclerView", "NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C35902c holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final BeautyItem beautyItem = this.f77684k.get(i11);
        holder.getF77692h().setText(beautyItem.getTitle());
        ImageView f77693i = holder.getF77693i();
        f77693i.setImageResource(beautyItem.getIcon());
        f77693i.setBackgroundResource(beautyItem.getType() == this.f77682i ? R$drawable.beauty_item_select_background : R$drawable.beauty_item_not_select_background);
        LinearLayout f77691g = holder.getF77691g();
        f77691g.setTag(beautyItem.getType());
        f77691g.setOnClickListener(new View.OnClickListener() { // from class: hd0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeautyListAdapter.m79562i(this.f85872b, beautyItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C35902c onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.beauty_panel_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new C35902c(viewInflate);
    }

    public final void setOnItemClickListener(@NotNull InterfaceC35901b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f77683j = listener;
    }

    /* JADX INFO: renamed from: i */
    public static final void m79562i(BeautyListAdapter beautyListAdapter, BeautyItem beautyItem, View view) {
        BeautyType type = beautyItem.getType();
        beautyListAdapter.f77682i = type;
        InterfaceC35901b interfaceC35901b = beautyListAdapter.f77683j;
        if (interfaceC35901b != null) {
            interfaceC35901b.mo79569a(type);
        }
        beautyListAdapter.notifyDataSetChanged();
    }
}
