package com.kubi.home.shortcut.edit;

import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.home.shortcut.NormalSpacesItemDecoration;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import dj.C36722g;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import io.chad.library.adapter.base.listener.OnItemDragListener;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.shortcut.edit.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AdapterCreateHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001/\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0011H\u0002J\f\u0010)\u001a\u00020**\u00020'H\u0002J\u0006\u0010+\u001a\u00020*J\b\u0010,\u001a\u00020*H\u0002J\u0006\u0010-\u001a\u00020*J\r\u0010.\u001a\u00020/H\u0002¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020\u001eJ\u0018\u00102\u001a\u00020**\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503H\u0002J\u0006\u00106\u001a\u00020*R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00067"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/AdapterCreateHelper;", "", "editHomeMenuHelper", "Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "activity", "Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;", "<init>", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;)V", "getEditHomeMenuHelper", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "setEditHomeMenuHelper", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;)V", "getActivity", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;", "setActivity", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;)V", "headerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getHeaderRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setHeaderRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "headerSpacesItemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getHeaderSpacesItemDecoration", "()Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "setHeaderSpacesItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V", "mNormalHeaderSpacesItemDecoration", "contentAdapter", "Lcom/kubi/home/shortcut/edit/EditHomeContentAdapter;", "mHeaderView", "Landroid/view/View;", "mMaskView", "getMMaskView", "()Landroid/view/View;", "setMMaskView", "(Landroid/view/View;)V", "createHeaderAdapter", "Lcom/kubi/home/shortcut/edit/HeaderAdapter;", "recyclerView", "listenDataChanged", "", "notifyItemCountChanged", "setNum", "setHeaderAdapterOnItemLongClickListener", "createOnItemLongClickListener", "com/kubi/home/shortcut/edit/AdapterCreateHelper$createOnItemLongClickListener$1", "()Lcom/kubi/home/shortcut/edit/AdapterCreateHelper$createOnItemLongClickListener$1;", "createContentAdapter", "addHeaderView", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/shortcut/FunctionEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "enableDragSort", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdapterCreateHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public EditHomeMenuHelper f26263a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public EditHomeMenuActivity f26264b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public RecyclerView f26265c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public RecyclerView.ItemDecoration f26266d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public RecyclerView.ItemDecoration f26267e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public EditHomeContentAdapter f26268f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public View f26269g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public View f26270h;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.a$a */
    /* JADX INFO: compiled from: AdapterCreateHelper.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/home/shortcut/edit/AdapterCreateHelper$createOnItemLongClickListener$1", "Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemLongClickListener;", "onItemLongClick", "", "adapter", "Lio/chad/library/adapter/base/BaseQuickAdapter;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements BaseQuickAdapter.OnItemLongClickListener {
        public a() {
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
        public boolean onItemLongClick(BaseQuickAdapter<?, ?> adapter, View view, int position) throws JSONException {
            List<?> data;
            if (!(((adapter == null || (data = adapter.getData()) == null) ? null : data.get(position)) instanceof FunctionEntity)) {
                return false;
            }
            AdapterCreateHelper.this.getF26264b().m30329s0();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.a$b */
    /* JADX INFO: compiled from: AdapterCreateHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J,\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/shortcut/edit/AdapterCreateHelper$enableDragSort$1", "Lio/chad/library/adapter/base/listener/OnItemDragListener;", "onItemDragStart", "", "p0", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "p1", "", "onItemDragMoving", "p2", "p3", "onItemDragEnd", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements OnItemDragListener {
        public b() {
        }

        @Override // io.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragEnd(RecyclerView.ViewHolder p11, int p12) {
            EditHomeMenuViewModel editHomeMenuViewModelM30365l = AdapterCreateHelper.this.getF26263a().m30365l();
            HeaderAdapter f26289d = AdapterCreateHelper.this.getF26263a().getF26289d();
            editHomeMenuViewModelM30365l.m30389u(f26289d != null ? f26289d.getData() : null);
        }

        @Override // io.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragStart(RecyclerView.ViewHolder p11, int p12) {
            Object systemService = AdapterCreateHelper.this.getF26264b().getSystemService("vibrator");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).vibrate(20L);
            C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "dragItem", "1", new JSONObject());
        }

        @Override // io.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragMoving(RecyclerView.ViewHolder p11, int p12, RecyclerView.ViewHolder p13, int p14) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.a$c */
    /* JADX INFO: compiled from: AdapterCreateHelper.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/shortcut/edit/AdapterCreateHelper$enableDragSort$itemDragAndSwipeCallback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "", "source", "target", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends ItemDragAndSwipeCallback {
        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            return viewHolder.getAdapterPosition() < 4 ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : super.getMovementFlags(recyclerView, viewHolder);
        }

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(target, "target");
            if (C36722g.m82292f()) {
                return source.getAdapterPosition() != 0 && source.getAdapterPosition() > 3 && target.getAdapterPosition() != 0 && target.getAdapterPosition() > 3 && source.getItemViewType() == 1 && target.getItemViewType() == 1 && source.getItemViewType() == target.getItemViewType();
            }
            return super.onMove(recyclerView, source, target);
        }

        public c(HeaderAdapter headerAdapter) {
            super(headerAdapter);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.a$d */
    /* JADX INFO: compiled from: AdapterCreateHelper.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, m90084d2 = {"com/kubi/home/shortcut/edit/AdapterCreateHelper$listenDataChanged$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeRemoved", "onItemRangeMoved", "fromPosition", "toPosition", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount) {
            AdapterCreateHelper.this.m30348l();
        }

        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            AdapterCreateHelper.this.m30348l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            AdapterCreateHelper.this.m30348l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            AdapterCreateHelper.this.m30348l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            AdapterCreateHelper.this.m30348l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            AdapterCreateHelper.this.m30348l();
        }
    }

    public AdapterCreateHelper(@NotNull EditHomeMenuHelper editHomeMenuHelper, @NotNull EditHomeMenuActivity activity) {
        Intrinsics.checkNotNullParameter(editHomeMenuHelper, "editHomeMenuHelper");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f26263a = editHomeMenuHelper;
        this.f26264b = activity;
    }

    /* JADX INFO: renamed from: a */
    public final void m30337a(BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter) {
        View viewInflate = View.inflate(this.f26264b, R$layout.view_edit_menu_item_business, null);
        this.f26269g = viewInflate;
        this.f26270h = viewInflate.findViewById(R$id.line);
        ((TextView) viewInflate.findViewById(R$id.tv_label)).setText(this.f26264b.getString(R$string.home_page_entry));
        TextView textView = (TextView) viewInflate.findViewById(R$id.tv_tips);
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66594y(textView);
        textView.setText(C27017c.f54310a.m66516f(R$string.home_page_ten_entry_tips, 19));
        View viewFindViewById = viewInflate.findViewById(R$id.iv_question);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66577h(viewFindViewById);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.rv_menus);
        EditHomeMenuHelper editHomeMenuHelper = this.f26263a;
        Intrinsics.checkNotNull(recyclerView);
        editHomeMenuHelper.m30371t(m30339c(recyclerView));
        recyclerView.setAdapter(this.f26263a.getF26289d());
        baseQuickAdapter.addHeaderView(viewInflate);
        m30350n();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final EditHomeContentAdapter m30338b() {
        EditHomeContentAdapter editHomeContentAdapter = new EditHomeContentAdapter(this.f26263a);
        m30337a(editHomeContentAdapter);
        this.f26268f = editHomeContentAdapter;
        return editHomeContentAdapter;
    }

    /* JADX INFO: renamed from: c */
    public final HeaderAdapter m30339c(RecyclerView recyclerView) {
        this.f26265c = recyclerView;
        this.f26266d = new EditSpacesItemDecoration(C27040e.m66658b(20), 5);
        NormalSpacesItemDecoration normalSpacesItemDecoration = new NormalSpacesItemDecoration(C27040e.m66658b(10), 5);
        this.f26267e = normalSpacesItemDecoration;
        RecyclerView recyclerView2 = this.f26265c;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(normalSpacesItemDecoration);
        }
        EditHomeMenuHelper editHomeMenuHelper = this.f26263a;
        HeaderAdapter headerAdapter = new HeaderAdapter(editHomeMenuHelper, editHomeMenuHelper.m30365l().m30384p());
        m30347k(headerAdapter);
        return headerAdapter;
    }

    /* JADX INFO: renamed from: d */
    public final a m30340d() {
        return new a();
    }

    /* JADX INFO: renamed from: e */
    public final void m30341e() {
        HeaderAdapter f26289d = this.f26263a.getF26289d();
        if (f26289d != null) {
            f26289d.setOnItemDragListener(new b());
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new c(this.f26263a.getF26289d()));
        itemTouchHelper.attachToRecyclerView(this.f26265c);
        HeaderAdapter f26289d2 = this.f26263a.getF26289d();
        if (f26289d2 != null) {
            f26289d2.enableDragItem(itemTouchHelper, R$id.menu_root, true);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final EditHomeMenuActivity getF26264b() {
        return this.f26264b;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final EditHomeMenuHelper getF26263a() {
        return this.f26263a;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final RecyclerView getF26265c() {
        return this.f26265c;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final RecyclerView.ItemDecoration getF26266d() {
        return this.f26266d;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final View getF26270h() {
        return this.f26270h;
    }

    /* JADX INFO: renamed from: k */
    public final void m30347k(HeaderAdapter headerAdapter) {
        headerAdapter.registerAdapterDataObserver(new d());
    }

    /* JADX INFO: renamed from: m */
    public final void m30349m() {
        HeaderAdapter f26289d = this.f26263a.getF26289d();
        if (f26289d != null) {
            f26289d.setOnItemLongClickListener(m30340d());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m30350n() {
        TextView textView;
        C4988a.m5287b(String.valueOf(C14886q.m30392a(this.f26263a.m30365l()).size()), null, 1, null);
        View view = this.f26269g;
        if (view == null || (textView = (TextView) view.findViewById(R$id.num)) == null) {
            return;
        }
        textView.setText(String.valueOf(C14886q.m30392a(this.f26263a.m30365l()).size()));
    }

    /* JADX INFO: renamed from: l */
    public final void m30348l() {
        m30350n();
    }
}
