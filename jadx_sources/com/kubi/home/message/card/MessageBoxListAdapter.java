package com.kubi.home.message.card;

import android.view.View;
import android.widget.TextView;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBoxListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/home/message/card/MessageBoxListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/message/card/MessageBox;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "onViewAttachedToWindow", C33954u6.f72238i, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MessageBoxListAdapter extends BaseQuickAdapter<MessageBox, BaseViewHolder> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBoxListAdapter(@NotNull List<MessageBox> data) {
        super(R$layout.item_card_message_box, data);
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable MessageBox messageBox) {
        View view;
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null || messageBox == null) {
            return;
        }
        int i11 = R$id.message_titile;
        ((TextView) view.findViewById(i11)).setText(messageBox.getTitle());
        ((TextView) view.findViewById(R$id.message_time)).setText(messageBox.getShowTime());
        ((TextView) view.findViewById(i11)).setText(messageBox.getTitle());
        view.setPadding(0, messageBox.getPaddingTop(), 0, messageBox.getPaddingBottom());
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        MessageBox item = getItem(holder.getAdapterPosition());
        if (item != null) {
            C12572a.m23695d("expose_message_box", item, 0L, 4, null);
        }
    }
}
