package com.kubi.home.shortcut.edit;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.BaseMultiItemDragQuickAdapter;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.home.shortcut.IMenuItem;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.DoubleClickListener;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HeaderAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010\u001f\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u001c\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/HeaderAdapter;", "Lcom/kubi/home/common/BaseMultiItemDragQuickAdapter;", "Lcom/kubi/home/shortcut/IMenuItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "editHomeMenuHelper", "Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "data", "", "<init>", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;Ljava/util/List;)V", "getEditHomeMenuHelper", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "setEditHomeMenuHelper", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;)V", "replaceData", "", "", "onViewAttachedToWindow", C33954u6.f72238i, "uploadItemExpose", "convert", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HeaderAdapter extends BaseMultiItemDragQuickAdapter<IMenuItem, BaseViewHolder> {

    /* JADX INFO: renamed from: j */
    @NotNull
    public EditHomeMenuHelper f26259j;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.HeaderAdapter$a */
    /* JADX INFO: compiled from: HeaderAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/home/shortcut/edit/HeaderAdapter$convert$1$1", "Lcom/kubi/resources/DoubleClickListener$DoubleClickCallBack;", "singleClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "doubleClick", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14869a implements DoubleClickListener.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IMenuItem f26260a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HeaderAdapter f26261b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BaseViewHolder f26262c;

        public C14869a(IMenuItem iMenuItem, HeaderAdapter headerAdapter, BaseViewHolder baseViewHolder) {
            this.f26260a = iMenuItem;
            this.f26261b = headerAdapter;
            this.f26262c = baseViewHolder;
        }

        @Override // com.kubi.resources.DoubleClickListener.a
        /* JADX INFO: renamed from: a */
        public void mo30247a(View view) {
            if (((FunctionEntity) this.f26260a).getEditing()) {
                this.f26261b.getF26259j().m30369r(this.f26262c.getAdapterPosition(), view);
            } else {
                this.f26261b.getF26259j().m30358e((FunctionEntity) this.f26260a, null, 0, this.f26262c.getAdapterPosition());
            }
        }

        @Override // com.kubi.resources.DoubleClickListener.a
        /* JADX INFO: renamed from: b */
        public void mo30248b(View view) {
            this.f26261b.getF26259j().m30376y((FunctionEntity) this.f26260a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAdapter(@NotNull EditHomeMenuHelper editHomeMenuHelper, @NotNull List<IMenuItem> data) {
        super(data);
        Intrinsics.checkNotNullParameter(editHomeMenuHelper, "editHomeMenuHelper");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f26259j = editHomeMenuHelper;
        addItemType(1, R$layout.home_edit_menu_adapter_item);
        addItemType(2, R$layout.view_edit_menu_item_empty);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final EditHomeMenuHelper getF26259j() {
        return this.f26259j;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        m30336j(holder);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void replaceData(@NotNull Collection<? extends IMenuItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.replaceData(data);
    }

    @Override // com.kubi.home.common.BaseMultiItemDragQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable IMenuItem iMenuItem) {
        String darkIcons;
        super.convert(baseViewHolder, iMenuItem);
        if (iMenuItem instanceof FunctionEntity) {
            if (!this.f26259j.m30364k().contains(iMenuItem)) {
                this.f26259j.m30364k().add(iMenuItem);
            }
            if (baseViewHolder != null) {
                FunctionEntity functionEntity = (FunctionEntity) iMenuItem;
                ((TextView) baseViewHolder.getView(R$id.tv_label)).setText(functionEntity.getName());
                this.f26259j.m30373v(functionEntity, baseViewHolder, functionEntity.getMarks());
                if (functionEntity.getEditing()) {
                    int i11 = R$id.iv_menu_edit_icon;
                    ((ImageView) baseViewHolder.getView(i11)).setImageResource(R$drawable.ic_sub_filled_16);
                    ((ImageView) baseViewHolder.getView(i11)).setImageTintList(ContextCompat.getColorStateList(this.mContext, R$color.secondary));
                }
                baseViewHolder.setGone(R$id.iv_menu_edit_icon, functionEntity.getEditing());
                baseViewHolder.itemView.setOnClickListener(new DoubleClickListener(new C14869a(iMenuItem, this, baseViewHolder)));
                C46341d c46341dM102151a = C46338a.m102151a(this.mContext);
                if (DayNightThemeManager.f28592a.m33187l()) {
                    darkIcons = functionEntity.getIcons();
                } else {
                    darkIcons = functionEntity.getDarkIcons();
                }
                C46340c<Drawable> c46340cMo6634v = c46341dM102151a.mo6634v(darkIcons);
                C42032f c42032f = new C42032f();
                int i12 = R$mipmap.ic_placeholder;
                c46340cMo6634v.mo6606a(c42032f.mo92188b0(i12).mo92208m(i12)).m6594E0((ImageView) baseViewHolder.getView(R$id.iv_menu_icon));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m30336j(BaseViewHolder baseViewHolder) {
        IMenuItem iMenuItem = (IMenuItem) getItem(baseViewHolder.getAdapterPosition());
        if (iMenuItem != null && (iMenuItem instanceof FunctionEntity)) {
            this.f26259j.m30375x((FunctionEntity) iMenuItem, 0, baseViewHolder.getAdapterPosition());
        }
    }
}
