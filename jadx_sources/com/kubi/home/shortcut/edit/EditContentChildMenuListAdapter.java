package com.kubi.home.shortcut.edit;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.DoubleClickListener;
import com.kubi.utils.C27014a1;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p058cj.C4988a;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EditContentChildMenuListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0014J\u0014\u0010$\u001a\u00020\u001f*\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0002R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/EditContentChildMenuListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/shortcut/FunctionEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "menuList", "", "groupId", "", "groupPosition", "", "editHomeMenuHelper", "Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "<init>", "(Ljava/util/List;Ljava/lang/String;ILcom/kubi/home/shortcut/edit/EditHomeMenuHelper;)V", "getMenuList", "()Ljava/util/List;", "setMenuList", "(Ljava/util/List;)V", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "getGroupPosition", "()I", "setGroupPosition", "(I)V", "getEditHomeMenuHelper", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "setEditHomeMenuHelper", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;)V", "onViewAttachedToWindow", "", C33954u6.f72238i, "convert", "menuHelper", "menuItem", "handleClickEvent", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EditContentChildMenuListAdapter extends BaseQuickAdapter<FunctionEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public List<FunctionEntity> f26246i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f26247j;

    /* JADX INFO: renamed from: k */
    public int f26248k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public EditHomeMenuHelper f26249l;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.EditContentChildMenuListAdapter$a */
    /* JADX INFO: compiled from: EditContentChildMenuListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/home/shortcut/edit/EditContentChildMenuListAdapter$handleClickEvent$1", "Lcom/kubi/resources/DoubleClickListener$DoubleClickCallBack;", "singleClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "doubleClick", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14868a implements DoubleClickListener.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseViewHolder f26250a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EditContentChildMenuListAdapter f26251b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FunctionEntity f26252c;

        public C14868a(BaseViewHolder baseViewHolder, EditContentChildMenuListAdapter editContentChildMenuListAdapter, FunctionEntity functionEntity) {
            this.f26250a = baseViewHolder;
            this.f26251b = editContentChildMenuListAdapter;
            this.f26252c = functionEntity;
        }

        @Override // com.kubi.resources.DoubleClickListener.a
        /* JADX INFO: renamed from: a */
        public void mo30247a(View view) throws JSONException {
            int adapterPosition = this.f26250a.getAdapterPosition();
            if (adapterPosition >= this.f26251b.m30308l().size() || adapterPosition < 0) {
                return;
            }
            if (!this.f26252c.getEditing()) {
                this.f26251b.getF26249l().m30358e(this.f26252c, null, this.f26251b.getF26248k(), this.f26250a.getAdapterPosition());
                return;
            }
            if (C27014a1.m66501a(view)) {
                return;
            }
            FunctionEntity functionEntityCopy$default = FunctionEntity.copy$default(this.f26252c, null, null, null, null, null, null, false, null, null, null, false, 2047, null);
            FunctionEntity functionEntity = this.f26252c;
            functionEntityCopy$default.setEditable(functionEntity.getEditing());
            functionEntityCopy$default.setEditing(functionEntity.getEditing());
            this.f26251b.getF26249l().m30357d(functionEntityCopy$default);
            FunctionEntity functionEntity2 = this.f26251b.m30308l().get(adapterPosition);
            if (functionEntity2 != null) {
                functionEntity2.setEditable(false);
            }
            this.f26251b.m30308l().get(adapterPosition).setEditing(false);
            BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter = this.f26251b.getF26249l().m30359f().get(this.f26251b.getF26247j());
            if (baseQuickAdapter != null) {
                baseQuickAdapter.notifyDataSetChanged();
            }
            String str = "entryAddMod" + (this.f26251b.getF26248k() + 1);
            String strValueOf = String.valueOf(adapterPosition + 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.f26252c.getUri());
            Unit unit = Unit.INSTANCE;
            C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, str, strValueOf, jSONObject);
        }

        @Override // com.kubi.resources.DoubleClickListener.a
        /* JADX INFO: renamed from: b */
        public void mo30248b(View view) {
            this.f26251b.getF26249l().m30376y(this.f26252c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditContentChildMenuListAdapter(@NotNull List<FunctionEntity> menuList, @NotNull String groupId, int i11, @NotNull EditHomeMenuHelper editHomeMenuHelper) {
        super(R$layout.home_edit_menu_adapter_item, menuList);
        Intrinsics.checkNotNullParameter(menuList, "menuList");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(editHomeMenuHelper, "editHomeMenuHelper");
        this.f26246i = menuList;
        this.f26247j = groupId;
        this.f26248k = i11;
        this.f26249l = editHomeMenuHelper;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder menuHelper, @NotNull FunctionEntity menuItem) {
        Intrinsics.checkNotNullParameter(menuHelper, "menuHelper");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        ((TextView) menuHelper.getView(R$id.tv_label)).setText(menuItem.getName());
        this.f26249l.m30373v(menuItem, menuHelper, menuItem.getMarks());
        menuHelper.setGone(R$id.iv_menu_edit_icon, menuItem.getEditing());
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(this.mContext).mo6634v(DayNightThemeManager.f28592a.m33187l() ? menuItem.getIcons() : menuItem.getDarkIcons());
        C42032f c42032f = new C42032f();
        int i11 = R$mipmap.ic_placeholder;
        c46340cMo6634v.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0((ImageView) menuHelper.getView(R$id.iv_menu_icon));
        m30309m(menuHelper, menuItem);
        menuHelper.itemView.setAlpha((menuItem.getEditable() || !this.f26249l.getF26292g()) ? 1.0f : 0.4f);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final EditHomeMenuHelper getF26249l() {
        return this.f26249l;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF26247j() {
        return this.f26247j;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getF26248k() {
        return this.f26248k;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<FunctionEntity> m30308l() {
        return this.f26246i;
    }

    /* JADX INFO: renamed from: m */
    public final void m30309m(BaseViewHolder baseViewHolder, FunctionEntity functionEntity) {
        baseViewHolder.itemView.setOnClickListener(new DoubleClickListener(new C14868a(baseViewHolder, this, functionEntity)));
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull final BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        final FunctionEntity item = getItem(holder.getAdapterPosition());
        if (item != null) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ExtensionKt.m32181g(itemView, item.getName(), 0.0f, 0, new Function0() { // from class: com.kubi.home.shortcut.edit.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditContentChildMenuListAdapter.m30303n(holder, this, item);
                }
            }, 6, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m30303n(BaseViewHolder baseViewHolder, EditContentChildMenuListAdapter editContentChildMenuListAdapter, FunctionEntity functionEntity) {
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < editContentChildMenuListAdapter.f26246i.size()) {
            C4988a.m5286a("曝光->" + functionEntity.getName(), "EditChildMenuListAdapter");
            editContentChildMenuListAdapter.f26249l.m30375x(functionEntity, editContentChildMenuListAdapter.f26248k, adapterPosition);
        }
        return Unit.INSTANCE;
    }
}
