package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewPagerViewHolder.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/reactnativepagerview/ViewPagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/FrameLayout;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/widget/FrameLayout;)V", "getContainer", "()Landroid/widget/FrameLayout;", "g", "Companion", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ViewPagerViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ViewPagerViewHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/reactnativepagerview/ViewPagerViewHolder$Companion;", "", "<init>", "()V", "create", "Lcom/reactnativepagerview/ViewPagerViewHolder;", "parent", "Landroid/view/ViewGroup;", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ViewPagerViewHolder create(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new ViewPagerViewHolder(frameLayout, null);
        }
    }

    public /* synthetic */ ViewPagerViewHolder(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    public ViewPagerViewHolder(FrameLayout frameLayout) {
        super(frameLayout);
    }

    @NotNull
    public final FrameLayout getContainer() {
        View view = this.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) view;
    }
}
