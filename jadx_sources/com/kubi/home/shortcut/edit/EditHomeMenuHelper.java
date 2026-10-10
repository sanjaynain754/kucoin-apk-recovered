package com.kubi.home.shortcut.edit;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.BeepHelper;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$raw;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.shortcut.EmptyItem;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.home.shortcut.IMenuItem;
import com.kubi.home.shortcut.Mark;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import dj.C36719d;
import dj.C36722g;
import dj.C36723h;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import l80.InterfaceC42137a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p048c2.C4781a0;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.shortcut.edit.l, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EditHomeMenuHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00132\u0016\b\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\u0006\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020 J\u001e\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020 J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u0013H\u0002J&\u0010@\u001a\u0002052\u0006\u00106\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00142\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CJ\u0018\u0010E\u001a\u0002052\u0006\u0010F\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u00010HJ\u0010\u0010I\u001a\u0002052\u0006\u0010F\u001a\u00020 H\u0002J\u0010\u0010J\u001a\u00020&2\u0006\u00106\u001a\u00020\u0013H\u0002J\u000e\u0010K\u001a\u0002052\u0006\u00106\u001a\u00020\u0013J\u0006\u0010L\u001a\u000205J\u0010\u0010M\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0013J\u0006\u0010N\u001a\u000205J\u000e\u0010O\u001a\u0002052\u0006\u0010<\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR)\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-¨\u0006P"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/EditHomeMenuHelper;", "", "editHomeMenuActivity", "Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;", "<init>", "(Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;)V", "getEditHomeMenuActivity", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuActivity;", "setEditHomeMenuActivity", "model", "Lcom/kubi/home/shortcut/edit/EditHomeMenuViewModel;", "getModel", "()Lcom/kubi/home/shortcut/edit/EditHomeMenuViewModel;", "model$delegate", "Lkotlin/Lazy;", "adapters", "Landroid/util/ArrayMap;", "", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/shortcut/FunctionEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "getAdapters", "()Landroid/util/ArrayMap;", "headerAdapter", "Lcom/kubi/home/shortcut/edit/HeaderAdapter;", "getHeaderAdapter", "()Lcom/kubi/home/shortcut/edit/HeaderAdapter;", "setHeaderAdapter", "(Lcom/kubi/home/shortcut/edit/HeaderAdapter;)V", "newAddFunctionList", "", "encourageCount", "", "getEncourageCount", "()I", "setEncourageCount", "(I)V", "editing", "", "getEditing", "()Z", "setEditing", "(Z)V", "mHeaderFunctionItem", "getMHeaderFunctionItem", "()Ljava/util/List;", "setMHeaderFunctionItem", "(Ljava/util/List;)V", "viewExposeList", "getViewExposeList", "editModeExposeList", "getEditModeExposeList", "clickMenu", "", "item", "baseQuickAdapter", "Lcom/kubi/home/shortcut/IMenuItem;", "groupPos", "itemPos", "uploadItemExpose", "functionEntity", "groupPosition", "itemPosition", "getGroupId", "setTag", "helper", "marks", "", "Lcom/kubi/home/shortcut/Mark;", "removeHeaderItemIfNeed", "pos", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "removeHeaderItem", "isKcsItem", "welfareDoubleClick", "updateKcsItem", "addUserMenu", "getRemainNum", "setMenuEditable", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditHomeMenuHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditHomeMenuHelper.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 4 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,371:1\n1068#2:372\n1869#2:373\n1870#2:380\n1869#2:381\n1869#2,2:382\n1870#2:384\n1068#2:385\n1869#2:386\n1870#2:390\n808#2,11:391\n1869#2,2:402\n808#2,11:404\n360#2,7:415\n1869#2:422\n1878#2,3:423\n1870#2:426\n360#2,7:427\n1869#2,2:434\n388#2,7:436\n1869#2,2:443\n1869#2:445\n1878#2,3:446\n1870#2:449\n109#3:374\n109#3:387\n46#4:375\n46#4:388\n136#5:376\n126#5,2:378\n136#5:389\n1#6:377\n220#7,5:450\n*S KotlinDebug\n*F\n+ 1 EditHomeMenuHelper.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuHelper\n*L\n104#1:372\n104#1:373\n104#1:380\n162#1:381\n163#1:382,2\n162#1:384\n185#1:385\n185#1:386\n185#1:390\n267#1:391,11\n271#1:402,2\n299#1:404,11\n300#1:415,7\n303#1:422\n304#1:423,3\n303#1:426\n317#1:427,7\n328#1:434,2\n330#1:436,7\n337#1:443,2\n359#1:445\n360#1:446,3\n359#1:449\n105#1:374\n186#1:387\n105#1:375\n186#1:388\n106#1:376\n107#1:378,2\n186#1:389\n52#1:450,5\n*E\n"})
public final class EditHomeMenuHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public EditHomeMenuActivity f26286a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f26287b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ArrayMap<String, BaseQuickAdapter<FunctionEntity, BaseViewHolder>> f26288c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public HeaderAdapter f26289d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public List<FunctionEntity> f26290e;

    /* JADX INFO: renamed from: f */
    public int f26291f;

    /* JADX INFO: renamed from: g */
    public boolean f26292g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public List<FunctionEntity> f26293h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<String> f26294i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<String> f26295j;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.l$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 EditHomeMenuHelper.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuHelper\n*L\n1#1,328:1\n104#2:329\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((Mark) t12).getType(), ((Mark) t11).getType());
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.l$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 EditHomeMenuHelper.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuHelper\n*L\n1#1,328:1\n185#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((Mark) t12).getType(), ((Mark) t11).getType());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m30358e(@NotNull FunctionEntity item, @Nullable BaseQuickAdapter<IMenuItem, BaseViewHolder> baseQuickAdapter, int i11, int i12) {
        List<Mark> marks;
        List<Mark> listSortedWith;
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f26292g) {
            return;
        }
        if (i11 >= 0 && i12 >= 0) {
            new ArrayMap().put("url", item.getUri());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mod");
            sb2.append((baseQuickAdapter == null ? 1 : i11 + 1) + i11);
            String string = sb2.toString();
            String strValueOf = String.valueOf(i12 + 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", item.getUri());
            Unit unit = Unit.INSTANCE;
            C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, string, strValueOf, jSONObject);
        }
        String uri = item.getUri();
        if (uri != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("mod");
            sb3.append(i11 + (baseQuickAdapter == null ? 1 : i11 + 1));
            C36723h.m82297a(uri, HomeCardViewHolderProxy.PAGE_ID, sb3.toString(), String.valueOf(i12 + 1));
            if (item.getShowMark()) {
                List<Mark> marks2 = item.getMarks();
                if (!C27025c.m66566d(marks2 != null ? Boolean.valueOf(!marks2.isEmpty()) : null) || (marks = item.getMarks()) == null || (listSortedWith = CollectionsKt.sortedWith(marks, new a())) == null) {
                    return;
                }
                for (Mark mark : listSortedWith) {
                    StorageId<Boolean> storageIdM82274s = C36719d.f79632a.m82274s();
                    String id2 = mark.getId();
                    if (id2 == null) {
                        id2 = "";
                    }
                    StorageId storageIdM102384f = new StorageId(storageIdM82274s.getCategory(), storageIdM82274s.getKey() + id2, storageIdM82274s.getStorageType(), storageIdM82274s.getSupportLegacy()).m102384f(C36722g.m82291e());
                    if (!mark.getExpired() && !mark.getLongShow() && C46392a.m102322d(storageIdM102384f, true)) {
                        if (mark.getId() != null) {
                            C46392a.m102328k(storageIdM102384f, false);
                        }
                        if (baseQuickAdapter == null) {
                            BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter2 = this.f26288c.get(m30362i(item));
                            if (baseQuickAdapter2 != null) {
                                baseQuickAdapter2.notifyDataSetChanged();
                            }
                        } else {
                            baseQuickAdapter.notifyDataSetChanged();
                        }
                        HeaderAdapter headerAdapter = this.f26289d;
                        if (headerAdapter != null) {
                            headerAdapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public EditHomeMenuHelper(@NotNull EditHomeMenuActivity editHomeMenuActivity) {
        Intrinsics.checkNotNullParameter(editHomeMenuActivity, "editHomeMenuActivity");
        this.f26286a = editHomeMenuActivity;
        this.f26287b = LazyKt.lazy(new Function0() { // from class: com.kubi.home.shortcut.edit.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditHomeMenuHelper.m30355p(this.f26283b);
            }
        });
        this.f26288c = new ArrayMap<>();
        this.f26290e = new ArrayList();
        this.f26293h = new ArrayList();
        this.f26294i = new ArrayList();
        this.f26295j = new ArrayList();
    }

    /* JADX INFO: renamed from: p */
    public static final EditHomeMenuViewModel m30355p(EditHomeMenuHelper editHomeMenuHelper) {
        return (EditHomeMenuViewModel) new ViewModelProvider(editHomeMenuHelper.f26286a).get(EditHomeMenuViewModel.class);
    }

    /* JADX INFO: renamed from: z */
    public static final void m30356z(EditHomeMenuHelper editHomeMenuHelper, Object obj) {
        editHomeMenuHelper.f26286a.hideDialogLoading();
        editHomeMenuHelper.f26291f = 0;
        editHomeMenuHelper.m30374w();
        BeepHelper.m23642f("beep_income", R$raw.asset_in);
        EditHomeMenuActivity editHomeMenuActivity = editHomeMenuHelper.f26286a;
        editHomeMenuActivity.m56592j0(editHomeMenuActivity.getString(R$string.withdrawal_all_success));
    }

    /* JADX INFO: renamed from: d */
    public final void m30357d(@Nullable FunctionEntity functionEntity) {
        int iNextIndex;
        List<T> data;
        if (functionEntity == null) {
            return;
        }
        Iterator<IMenuItem> it = m30365l().m30384p().iterator();
        int i11 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next() instanceof EmptyItem) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            if (!this.f26290e.contains(functionEntity)) {
                this.f26290e.add(functionEntity);
            }
            m30365l().m30384p().add(i11, functionEntity);
            HeaderAdapter headerAdapter = this.f26289d;
            if (headerAdapter != null) {
                headerAdapter.notifyItemInserted(i11);
            }
            HeaderAdapter headerAdapter2 = this.f26289d;
            if (headerAdapter2 != null) {
                headerAdapter2.notifyDataSetChanged();
            }
            if (C14886q.m30392a(m30365l()).size() >= 19) {
                m30365l().m30391w(false);
                Set<Map.Entry<String, BaseQuickAdapter<FunctionEntity, BaseViewHolder>>> setEntrySet = this.f26288c.entrySet();
                Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    ((BaseQuickAdapter) ((Map.Entry) it2.next()).getValue()).notifyDataSetChanged();
                }
            }
            List<IMenuItem> listM30384p = m30365l().m30384p();
            ListIterator<IMenuItem> listIterator = listM30384p.listIterator(listM30384p.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() instanceof EmptyItem) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex >= 0) {
                HeaderAdapter headerAdapter3 = this.f26289d;
                if (iNextIndex >= C27039d.m66650j((headerAdapter3 == null || (data = headerAdapter3.getData()) == 0) ? null : Integer.valueOf(data.size())) || iNextIndex >= m30365l().m30384p().size()) {
                    return;
                }
                m30365l().m30384p().remove(iNextIndex);
                HeaderAdapter headerAdapter4 = this.f26289d;
                if (headerAdapter4 != null) {
                    headerAdapter4.notifyItemRemoved(iNextIndex);
                }
                if (i11 == 19) {
                    m30365l().m30391w(false);
                    Set<Map.Entry<String, BaseQuickAdapter<FunctionEntity, BaseViewHolder>>> setEntrySet2 = this.f26288c.entrySet();
                    Intrinsics.checkNotNullExpressionValue(setEntrySet2, "<get-entries>(...)");
                    Iterator<T> it3 = setEntrySet2.iterator();
                    while (it3.hasNext()) {
                        ((BaseQuickAdapter) ((Map.Entry) it3.next()).getValue()).notifyDataSetChanged();
                    }
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ArrayMap<String, BaseQuickAdapter<FunctionEntity, BaseViewHolder>> m30359f() {
        return this.f26288c;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final EditHomeMenuActivity getF26286a() {
        return this.f26286a;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getF26292g() {
        return this.f26292g;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final HeaderAdapter getF26289d() {
        return this.f26289d;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final List<FunctionEntity> m30364k() {
        return this.f26293h;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final EditHomeMenuViewModel m30365l() {
        return (EditHomeMenuViewModel) this.f26287b.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m30367o(FunctionEntity functionEntity) {
        return Intrinsics.areEqual("welfare/encourage", functionEntity.getUri()) && this.f26291f > 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m30368q(int i11) {
        List<FunctionEntity> list = this.f26290e;
        IMenuItem iMenuItem = m30365l().m30384p().get(i11);
        Intrinsics.checkNotNull(iMenuItem, "null cannot be cast to non-null type com.kubi.home.shortcut.FunctionEntity");
        list.remove((FunctionEntity) iMenuItem);
        HeaderAdapter headerAdapter = this.f26289d;
        if (headerAdapter != null) {
            headerAdapter.notifyItemRemoved(i11);
        }
        IMenuItem iMenuItemRemove = m30365l().m30384p().remove(i11);
        Intrinsics.checkNotNull(iMenuItemRemove, "null cannot be cast to non-null type com.kubi.home.shortcut.FunctionEntity");
        m30372u((FunctionEntity) iMenuItemRemove);
        if (m30365l().m30384p().size() < 19) {
            m30365l().m30384p().add(new EmptyItem());
            HeaderAdapter headerAdapter2 = this.f26289d;
            if (headerAdapter2 != null) {
                headerAdapter2.notifyDataSetChanged();
            }
        }
        List<IMenuItem> listM30384p = m30365l().m30384p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM30384p) {
            if (obj instanceof FunctionEntity) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 18) {
            m30365l().m30391w(true);
            Set<Map.Entry<String, BaseQuickAdapter<FunctionEntity, BaseViewHolder>>> setEntrySet = this.f26288c.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                ((BaseQuickAdapter) ((Map.Entry) it.next()).getValue()).notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m30370s(boolean z11) {
        this.f26292g = z11;
    }

    /* JADX INFO: renamed from: t */
    public final void m30371t(@Nullable HeaderAdapter headerAdapter) {
        this.f26289d = headerAdapter;
    }

    /* JADX INFO: renamed from: u */
    public final void m30372u(@NotNull FunctionEntity functionEntity) {
        Intrinsics.checkNotNullParameter(functionEntity, "functionEntity");
        for (FunctionEntity functionEntity2 : m30365l().m30382n()) {
            ArrayList<FunctionEntity> children = functionEntity2.getChildren();
            if (children != null) {
                int i11 = 0;
                for (Object obj : children) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    FunctionEntity functionEntity3 = (FunctionEntity) obj;
                    if (Intrinsics.areEqual(functionEntity3.getId(), functionEntity.getId())) {
                        functionEntity3.setEditable(true);
                        functionEntity3.setEditing(true);
                        BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter = this.f26288c.get(functionEntity2.getId());
                        if (baseQuickAdapter != null) {
                            baseQuickAdapter.notifyItemChanged(i11);
                        }
                    }
                    i11 = i12;
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m30373v(@NotNull FunctionEntity item, @NotNull BaseViewHolder helper, @Nullable List<Mark> list) {
        List<Mark> listSortedWith;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = helper.getView(R$id.iv_menu_tag);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        ViewExtKt.m66577h(view);
        TextView textView = (TextView) helper.getView(R$id.tv_menu_tag);
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66577h(textView);
        if (m30367o(item)) {
            textView.setText(String.valueOf(this.f26291f));
            textView.setBackgroundResource(R$drawable.shape_menu_tag_bg_secondary_20r);
            ViewExtKt.m66594y(textView);
            return;
        }
        if (item.getShowMark()) {
            if (!C27025c.m66566d(list != null ? Boolean.valueOf(!list.isEmpty()) : null) || list == null || (listSortedWith = CollectionsKt.sortedWith(list, new b())) == null) {
                return;
            }
            for (Mark mark : listSortedWith) {
                StorageId<Boolean> storageIdM82274s = C36719d.f79632a.m82274s();
                String id2 = mark.getId();
                if (id2 == null) {
                    id2 = "";
                }
                boolean zM102322d = C46392a.m102322d(new StorageId(storageIdM82274s.getCategory(), storageIdM82274s.getKey() + id2, storageIdM82274s.getStorageType(), storageIdM82274s.getSupportLegacy()).m102384f(C36722g.m82291e()), true);
                if (!mark.getExpired() && (mark.getLongShow() || zM102322d)) {
                    C44128b.m97268l(C14882m.f26296a, "tag: " + mark.getName());
                    Integer styleType = mark.getStyleType();
                    if (styleType == null || styleType.intValue() != 1) {
                        if (styleType != null && styleType.intValue() == 2) {
                            C44128b.m97268l(C14882m.f26296a, "STYLE_IMG " + mark.getIcons());
                            ImageView imageView = (ImageView) helper.getView(R$id.iv_menu_tag);
                            C46338a.m102154d(this.f26286a).mo6634v(C36722g.m82293g() ? mark.getIcons() : mark.getDarkIcons()).mo92186a0(C5275i0.m6236a(36.0f), C5275i0.m6236a(18.0f)).mo6606a(C42032f.m92235s0(new C4781a0(C5275i0.m6236a(20.0f)))).m6594E0(imageView);
                            Intrinsics.checkNotNull(imageView);
                            ViewExtKt.m66594y(imageView);
                            return;
                        }
                        return;
                    }
                    C44128b.m97268l(C14882m.f26296a, "STYLE_TEXT " + mark.getName());
                    TextView textView2 = (TextView) helper.getView(R$id.tv_menu_tag);
                    if (TextUtils.isEmpty(mark.getName())) {
                        return;
                    }
                    Integer color = mark.getColor();
                    if (color != null && color.intValue() == 1) {
                        textView2.setBackgroundResource(R$drawable.shape_menu_tag_bg_secondary_20r);
                    } else if (color != null && color.intValue() == 2) {
                        textView2.setBackgroundResource(R$drawable.shape_menu_tag_bg_primary_20r);
                    }
                    C44128b.m97268l(C14882m.f26296a, "STYLE_TEXT" + mark + ".name");
                    textView2.setText(mark.getName());
                    Intrinsics.checkNotNull(textView2);
                    ViewExtKt.m66594y(textView2);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m30375x(@NotNull FunctionEntity functionEntity, int i11, int i12) {
        Intrinsics.checkNotNullParameter(functionEntity, "functionEntity");
        if (this.f26292g) {
            if (CollectionsKt.contains(this.f26295j, functionEntity.getId())) {
                return;
            }
            List<String> list = this.f26295j;
            String id2 = functionEntity.getId();
            if (id2 == null) {
                return;
            }
            list.add(id2);
            String strValueOf = String.valueOf(i12 + 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", functionEntity.getUri());
            Unit unit = Unit.INSTANCE;
            C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "entryAddMod" + (i11 + 1), strValueOf, jSONObject);
            return;
        }
        if (CollectionsKt.contains(this.f26294i, functionEntity.getId())) {
            return;
        }
        List<String> list2 = this.f26294i;
        String id3 = functionEntity.getId();
        if (id3 == null) {
            return;
        }
        list2.add(id3);
        String strValueOf2 = String.valueOf(i12 + 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", functionEntity.getUri());
        Unit unit2 = Unit.INSTANCE;
        C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "mod" + (i11 + 1), strValueOf2, jSONObject2);
    }

    /* JADX INFO: renamed from: y */
    public final void m30376y(@NotNull FunctionEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (m30367o(item)) {
            this.f26286a.showDialogLoading();
            this.f26286a.m56593T(((InterfaceC42137a) C42597a.m93386b().create(InterfaceC42137a.class)).m92470c().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.home.shortcut.edit.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EditHomeMenuHelper.m30356z(this.f26285b, obj);
                }
            }, new C24223c1(this.f26286a)));
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m30354n(EditHomeMenuHelper editHomeMenuHelper, RemainAwardNumEntity remainAwardNumEntity) {
        editHomeMenuHelper.f26291f = C27039d.m66650j(remainAwardNumEntity.getEncouragementCount());
        editHomeMenuHelper.m30374w();
    }

    /* JADX INFO: renamed from: i */
    public final String m30362i(FunctionEntity functionEntity) {
        for (FunctionEntity functionEntity2 : m30365l().m30382n()) {
            ArrayList<FunctionEntity> children = functionEntity2.getChildren();
            if (children != null) {
                Iterator<T> it = children.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((FunctionEntity) it.next()).getId(), functionEntity.getId())) {
                        return C27041f.m66668h(functionEntity2.getId());
                    }
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: m */
    public final void m30366m() {
        if (C36722g.m82292f()) {
            this.f26286a.m56593T(m30365l().m30383o().subscribe(new Consumer() { // from class: com.kubi.home.shortcut.edit.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EditHomeMenuHelper.m30354n(this.f26284b, (RemainAwardNumEntity) obj);
                }
            }, new C24223c1(this.f26286a)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m30369r(int i11, @Nullable View view) {
        int size;
        List<T> data;
        if (m30365l().m30384p().size() > 4 && !C27014a1.m66501a(view) && i11 >= 0 && i11 < m30365l().m30384p().size()) {
            HeaderAdapter headerAdapter = this.f26289d;
            if (headerAdapter != null && (data = headerAdapter.getData()) != 0) {
                size = data.size();
            } else {
                size = 0;
            }
            if (i11 < size) {
                m30368q(i11);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m30374w() {
        Integer numValueOf;
        Integer numValueOf2;
        List<FunctionEntity> data;
        List<T> data2;
        List<IMenuItem> listM30384p = m30365l().m30384p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM30384p) {
            if (obj instanceof FunctionEntity) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((FunctionEntity) it.next()).getUri(), "welfare/encourage")) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            HeaderAdapter headerAdapter = this.f26289d;
            if (headerAdapter != null && (data2 = headerAdapter.getData()) != 0) {
                numValueOf = Integer.valueOf(data2.size());
            } else {
                numValueOf = null;
            }
            if (i11 < C27039d.m66650j(numValueOf)) {
                HeaderAdapter headerAdapter2 = this.f26289d;
                if (headerAdapter2 != null) {
                    headerAdapter2.notifyItemChanged(i11);
                }
                for (FunctionEntity functionEntity : m30365l().m30382n()) {
                    ArrayList<FunctionEntity> children = functionEntity.getChildren();
                    if (children != null) {
                        int i12 = 0;
                        for (Object obj2 : children) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (Intrinsics.areEqual(((FunctionEntity) obj2).getUri(), "welfare/encourage") && i12 >= 0) {
                                BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter = this.f26288c.get(functionEntity.getId());
                                if (baseQuickAdapter != null && (data = baseQuickAdapter.getData()) != null) {
                                    numValueOf2 = Integer.valueOf(data.size());
                                } else {
                                    numValueOf2 = null;
                                }
                                if (i12 < C27039d.m66650j(numValueOf2)) {
                                    C44128b.m97268l(C14882m.f26296a, "鼓励金刷新位置：" + i12);
                                    BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter2 = this.f26288c.get(functionEntity.getId());
                                    if (baseQuickAdapter2 != null) {
                                        baseQuickAdapter2.notifyItemChanged(i12);
                                    }
                                }
                            }
                            i12 = i13;
                        }
                    }
                }
            }
        }
    }
}
