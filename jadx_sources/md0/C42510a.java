package md0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import java.util.List;
import ld0.C42175e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: md0.a */
/* JADX INFO: compiled from: GiftCategoryPagerAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftCategoryPagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftCategoryPagerAdapter$CategoryViewHolder;", "context", "Landroid/content/Context;", "categories", "", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "columns", "", "categoryViewManager", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager;", "<init>", "(Landroid/content/Context;Ljava/util/List;ILcom/trtc/uikit/livekit/component/gift/view/GiftCategoryViewPagerManager;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "CategoryViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42510a extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f94187i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<GiftCategory> f94188j;

    /* JADX INFO: renamed from: k */
    public final int f94189k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final C42175e f94190l;

    /* JADX INFO: renamed from: md0.a$a */
    /* JADX INFO: compiled from: GiftCategoryPagerAdapter.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/adapter/GiftCategoryPagerAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "bind", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final FrameLayout f94191g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f94191g = (FrameLayout) itemView;
        }

        /* JADX INFO: renamed from: a */
        public final void m93223a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f94191g.removeAllViews();
            this.f94191g.addView(view);
        }
    }

    public C42510a(@NotNull Context context, @NotNull List<GiftCategory> categories, int i11, @NotNull C42175e categoryViewManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(categoryViewManager, "categoryViewManager");
        this.f94187i = context;
        this.f94188j = categories;
        this.f94189k = i11;
        this.f94190l = categoryViewManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.m93223a(this.f94190l.m92604b(this.f94187i, this.f94188j.get(i11), this.f94189k));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f94188j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(this.f94187i);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new a(frameLayout);
    }
}
