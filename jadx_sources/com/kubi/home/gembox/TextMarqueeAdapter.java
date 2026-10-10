package com.kubi.home.gembox;

import android.view.View;
import android.widget.TextView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextMarqueeAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/gembox/TextMarqueeAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "dataList", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TextMarqueeAdapter extends BaseQuickAdapter<CharSequence, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public List<CharSequence> f25671i;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMarqueeAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TextMarqueeAdapter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList()) : list);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable CharSequence charSequence) {
        View view;
        TextView textView;
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null || (textView = (TextView) view.findViewById(R$id.text)) == null) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMarqueeAdapter(@NotNull List<CharSequence> dataList) {
        super(R$layout.item_text_marquee, dataList);
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.f25671i = dataList;
    }
}
