package com.kubi.home.shortcut.edit;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EditHomeContentAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001a\u0010\u000f\u001a\u00020\f*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/EditHomeContentAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/shortcut/FunctionEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "editHomeMenuHelper", "Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "<init>", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;)V", "getEditHomeMenuHelper", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "setEditHomeMenuHelper", "convert", "", "helper", "item", "initHomeListView", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditHomeContentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditHomeContentAdapter.kt\ncom/kubi/home/shortcut/edit/EditHomeContentAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1869#2,2:81\n*S KotlinDebug\n*F\n+ 1 EditHomeContentAdapter.kt\ncom/kubi/home/shortcut/edit/EditHomeContentAdapter\n*L\n41#1:81,2\n*E\n"})
public final class EditHomeContentAdapter extends BaseQuickAdapter<FunctionEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public EditHomeMenuHelper f26253i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditHomeContentAdapter(@NotNull EditHomeMenuHelper editHomeMenuHelper) {
        super(R$layout.view_edit_menu_item_business, editHomeMenuHelper.m30365l().m30382n());
        Intrinsics.checkNotNullParameter(editHomeMenuHelper, "editHomeMenuHelper");
        this.f26253i = editHomeMenuHelper;
    }

    /* JADX INFO: renamed from: i */
    public static final void m30311i(EditHomeContentAdapter editHomeContentAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (view.getId() == R$id.iv_question) {
            ArrayList arrayList = new ArrayList();
            ArrayList<FunctionEntity> children = editHomeContentAdapter.getData().get(i11).getChildren();
            if (children != null) {
                for (FunctionEntity functionEntity : children) {
                    String name = functionEntity.getName();
                    if (name == null) {
                        name = "";
                    }
                    arrayList.add(new SelectEntity(null, name, null, null, null, null, null, null, null, false, false, functionEntity.getExplain(), 2045, null));
                }
            }
            DialogFragmentHelper dialogFragmentHelperM58948G = BottomSheetDialogHelper.m58948G(BottomSheetDialogHelper.f48599a, arrayList, C27041f.m66668h(editHomeContentAdapter.getData().get(i11).getName()), false, null, 12, null);
            FragmentManager supportFragmentManager = editHomeContentAdapter.f26253i.getF26286a().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            dialogFragmentHelperM58948G.show(supportFragmentManager, "select_dialog");
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @NotNull FunctionEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (baseViewHolder != null) {
            ((TextView) baseViewHolder.getView(R$id.tv_label)).setText(item.getName());
            m30313j(baseViewHolder, item, baseViewHolder);
            baseViewHolder.setGone(R$id.tv_tips, false);
            ArrayList<FunctionEntity> children = item.getChildren();
            if (C27025c.m66566d(children != null ? Boolean.valueOf(!children.isEmpty()) : null)) {
                baseViewHolder.addOnClickListener(R$id.iv_question);
                setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: com.kubi.home.shortcut.edit.c
                    @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
                    public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                        EditHomeContentAdapter.m30311i(this.f26277a, baseQuickAdapter, view, i11);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m30313j(@NotNull BaseViewHolder baseViewHolder, @NotNull FunctionEntity item, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(helper, "helper");
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.rv_menus);
        List children = item.getChildren();
        if (children == null) {
            children = CollectionsKt.emptyList();
        }
        String id2 = item.getId();
        if (id2 == null) {
            id2 = "";
        }
        EditContentChildMenuListAdapter editContentChildMenuListAdapter = new EditContentChildMenuListAdapter(children, id2, helper.getAdapterPosition(), this.f26253i);
        this.f26253i.m30359f().put(item.getId(), editContentChildMenuListAdapter);
        recyclerView.setAdapter(editContentChildMenuListAdapter);
    }
}
