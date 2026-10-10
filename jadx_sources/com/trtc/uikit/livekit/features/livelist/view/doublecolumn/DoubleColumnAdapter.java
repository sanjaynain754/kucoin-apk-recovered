package com.trtc.uikit.livekit.features.livelist.view.doublecolumn;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.R$string;
import he0.InterfaceC38182b;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DoubleColumnAdapter.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003()*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000fJ\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "liveListViewAdapter", "Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;", "<init>", "(Landroid/content/Context;Lcom/trtc/uikit/livekit/features/livelist/LiveListViewAdapter;)V", "loadState", "", "liveInfoList", "", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "onItemClickListener", "Lcom/trtc/uikit/livekit/features/livelist/OnItemClickListener;", "setData", "", "newLiveInfoList", "", "getItemViewType", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", C33954u6.f72238i, "getItemCount", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindFootViewHolder", "Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter$FootViewHolder;", "bindLiveInfoViewHolder", "Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter$LiveInfoViewHolder;", "setLoadState", "newLoadState", "LiveInfoViewHolder", "GridDividerItemDecoration", "FootViewHolder", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DoubleColumnAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Context f79079i;

    /* JADX INFO: renamed from: j */
    public int f79080j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<LiveInfo> f79081k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC38182b f79082l;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.b$a */
    /* JADX INFO: compiled from: DoubleColumnAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter$FootViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "pbProgressBar", "Landroid/widget/ProgressBar;", "getPbProgressBar", "()Landroid/widget/ProgressBar;", "tvLoading", "Landroid/widget/TextView;", "getTvLoading", "()Landroid/widget/TextView;", "tvNoMoreData", "getTvNoMoreData", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final ProgressBar f79083g;

        /* JADX INFO: renamed from: h */
        @NotNull
        public final TextView f79084h;

        /* JADX INFO: renamed from: i */
        @NotNull
        public final TextView f79085i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.pb_progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f79083g = (ProgressBar) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_loading_data);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f79084h = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_no_more_data);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f79085i = (TextView) viewFindViewById3;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProgressBar getF79083g() {
            return this.f79083g;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getF79084h() {
            return this.f79084h;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getF79085i() {
            return this.f79085i;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.b$b */
    /* JADX INFO: compiled from: DoubleColumnAdapter.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter$GridDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dividerValue", "", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final int f79086d;

        public b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f79086d = (int) TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int i11 = this.f79086d;
            outRect.set(i11, i11, i11, i11);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.b$c */
    /* JADX INFO: compiled from: DoubleColumnAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter$LiveInfoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "getLiveInfo", "()Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "setLiveInfo", "(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V", "bind", "", "newLiveInfo", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        @Nullable
        public LiveInfo f79087g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        /* JADX INFO: renamed from: a */
        public final void m81413a(@NotNull LiveInfo newLiveInfo) {
            Intrinsics.checkNotNullParameter(newLiveInfo, "newLiveInfo");
            this.f79087g = newLiveInfo;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final LiveInfo getF79087g() {
            return this.f79087g;
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.b$d */
    /* JADX INFO: compiled from: DoubleColumnAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/trtc/uikit/livekit/features/livelist/view/doublecolumn/DoubleColumnAdapter$onAttachedToRecyclerView$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", ViewProps.POSITION, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView f79089b;

        public d(RecyclerView recyclerView) {
            this.f79089b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            if (DoubleColumnAdapter.this.getItemViewType(position) != 2) {
                return 1;
            }
            RecyclerView.LayoutManager layoutManager = this.f79089b.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            return ((GridLayoutManager) layoutManager).getSpanCount();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position + 1 == getItemCount() ? 2 : 1;
    }

    /* JADX INFO: renamed from: j */
    public static final void m81406j(DoubleColumnAdapter doubleColumnAdapter, View view) {
        InterfaceC38182b interfaceC38182b = doubleColumnAdapter.f79082l;
        if (interfaceC38182b != null) {
            Intrinsics.checkNotNull(view);
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveInfo");
            interfaceC38182b.mo81403a(view, (LiveInfo) tag);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f79081k.size() + 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m81408i(c cVar, int i11) {
        LiveInfo liveInfo = this.f79081k.get(i11);
        View view = cVar.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.trtc.uikit.livekit.features.livelist.view.doublecolumn.DoubleColumnItemView");
        DoubleColumnItemView doubleColumnItemView = (DoubleColumnItemView) view;
        if (cVar.getF79087g() == null) {
            doubleColumnItemView.m81373b(null, liveInfo);
        } else {
            doubleColumnItemView.m81378g(liveInfo);
        }
        cVar.m81413a(liveInfo);
        View view2 = cVar.itemView;
        view2.setTag(liveInfo);
        view2.setEnabled(true);
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.uikit.livekit.features.livelist.view.doublecolumn.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DoubleColumnAdapter.m81406j(this.f79078b, view3);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m81409k(@NotNull List<LiveInfo> newLiveInfoList) {
        Intrinsics.checkNotNullParameter(newLiveInfoList, "newLiveInfoList");
        this.f79081k.clear();
        this.f79081k.addAll(newLiveInfoList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanSizeLookup(new d(recyclerView));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof a) {
            m81407h((a) holder);
        } else if (holder instanceof c) {
            m81408i((c) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType != 2) {
            return new c(new DoubleColumnItemView(this.f79079i, null, 0, 6, null));
        }
        View viewInflate = LayoutInflater.from(this.f79079i).inflate(R$layout.livelist_layout_refresh_footer, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    public final void setOnItemClickListener(@NotNull InterfaceC38182b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f79082l = listener;
    }

    /* JADX INFO: renamed from: h */
    public final void m81407h(a aVar) {
        int i11;
        TextView f79085i = aVar.getF79085i();
        if (this.f79081k.isEmpty()) {
            i11 = R$string.livelist_empty_data;
        } else {
            i11 = R$string.livelist_no_more_data;
        }
        f79085i.setText(i11);
        int i12 = this.f79080j;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                aVar.getF79083g().setVisibility(8);
                aVar.getF79084h().setVisibility(8);
                aVar.getF79085i().setVisibility(0);
                return;
            }
            aVar.getF79083g().setVisibility(4);
            aVar.getF79084h().setVisibility(4);
            aVar.getF79085i().setVisibility(8);
            return;
        }
        aVar.getF79083g().setVisibility(0);
        aVar.getF79084h().setVisibility(0);
        aVar.getF79085i().setVisibility(8);
    }
}
