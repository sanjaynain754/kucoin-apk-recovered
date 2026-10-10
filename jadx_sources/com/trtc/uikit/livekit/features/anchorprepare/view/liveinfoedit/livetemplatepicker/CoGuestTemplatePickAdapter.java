package com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.trtc.uikit.livekit.R$drawable;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.features.anchorprepare.store.AnchorPrepareStore;
import com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.CoGuestTemplatePickAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CoGuestTemplatePickAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/CoGuestTemplatePickAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/CoGuestTemplatePickAdapter$ImageViewHolder;", "context", "Landroid/content/Context;", "store", "Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;", "dataList", "", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;", "itemClickListener", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/CoGuestTemplatePickAdapter$OnItemClickListener;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/anchorprepare/store/AnchorPrepareStore;Ljava/util/List;Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/CoGuestTemplatePickAdapter$OnItemClickListener;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "ImageViewHolder", "OnItemClickListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoGuestTemplatePickAdapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f78525i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final AnchorPrepareStore f78526j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<LiveTemplatePicker.TemplateType> f78527k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final b f78528l;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.a$a */
    /* JADX INFO: compiled from: CoGuestTemplatePickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/CoGuestTemplatePickAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "imageIcon", "Landroid/widget/ImageView;", "getImageIcon", "()Landroid/widget/ImageView;", "textName", "Landroid/widget/TextView;", "getTextName", "()Landroid/widget/TextView;", "layoutContainer", "Landroid/widget/LinearLayout;", "getLayoutContainer", "()Landroid/widget/LinearLayout;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final ImageView f78529g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f78530h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final LinearLayout f78531i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f78529g = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f78530h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.layout_container);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f78531i = (LinearLayout) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageView getF78529g() {
            return this.f78529g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final LinearLayout getF78531i() {
            return this.f78531i;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF78530h() {
            return this.f78530h;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.anchorprepare.view.liveinfoedit.livetemplatepicker.a$b */
    /* JADX INFO: compiled from: CoGuestTemplatePickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/CoGuestTemplatePickAdapter$OnItemClickListener;", "", "onClick", "", "type", "Lcom/trtc/uikit/livekit/features/anchorprepare/view/liveinfoedit/livetemplatepicker/LiveTemplatePicker$TemplateType;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5173a(@NotNull LiveTemplatePicker.TemplateType templateType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoGuestTemplatePickAdapter(@NotNull Context context, @NotNull AnchorPrepareStore store, @NotNull List<? extends LiveTemplatePicker.TemplateType> dataList, @NotNull b itemClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.f78525i = context;
        this.f78526j = store;
        this.f78527k = dataList;
        this.f78528l = itemClickListener;
    }

    /* JADX INFO: renamed from: i */
    public static final void m80707i(CoGuestTemplatePickAdapter coGuestTemplatePickAdapter, int i11, View view) {
        coGuestTemplatePickAdapter.f78528l.mo5173a(coGuestTemplatePickAdapter.f78527k.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f78527k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, final int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        LiveTemplatePicker.TemplateType templateType = this.f78527k.get(i11);
        holder.getF78529g().setImageResource(templateType.getIcon());
        holder.getF78530h().setText(LiveTemplatePicker.TemplateType.INSTANCE.getNameById(this.f78525i, Integer.valueOf(templateType.getId())));
        if (this.f78526j.getF78482a().m80621b().getValue().intValue() == templateType.getId()) {
            holder.getF78531i().setBackgroundResource(R$drawable.anchor_prepare_template_icon_background_selected);
        } else {
            holder.getF78531i().setBackgroundResource(R$drawable.anchor_prepare_template_icon_background);
        }
        holder.getF78531i().setOnClickListener(new View.OnClickListener() { // from class: ce0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoGuestTemplatePickAdapter.m80707i(this.f5494b, i11, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.anchor_prepare_layout_template_pick_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }
}
