package com.kubi.home.shortcut;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.service.HomeDepend;
import com.kubi.home.shortcut.edit.EditHomeMenuActivity;
import com.kubi.resources.DoubleClickListener;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24275u;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import dj.C36719d;
import dj.C36722g;
import dj.C36723h;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p048c2.C4781a0;
import p058cj.C4988a;
import p419l2.C42032f;
import p481ny.C42899b;
import p569qq.C43852m;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: HomeMenuListAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0017\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J,\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010!\u001a\u00020\nH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/kubi/home/shortcut/HomeMenuListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/shortcut/FunctionEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "viewExposeList", "", "", "mEncourageCount", "", "innerWelfareDoubleClick", "Lio/reactivex/functions/Action;", "getInnerWelfareDoubleClick", "()Lio/reactivex/functions/Action;", "setInnerWelfareDoubleClick", "(Lio/reactivex/functions/Action;)V", "onViewAttachedToWindow", "", C33954u6.f72238i, "notifyTags", "encourageCount", "(Ljava/lang/Integer;)V", "getPageString", ViewProps.POSITION, "convert", "helper", "item", "setTag", "mContext", "Landroid/content/Context;", "normalClick", "adapter", "pos", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeMenuListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMenuListAdapter.kt\ncom/kubi/home/shortcut/HomeMenuListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 5 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,237:1\n1#2:238\n1068#3:239\n1869#3:240\n1870#3:244\n1068#3:245\n1869#3:246\n1870#3:252\n109#4:241\n109#4:247\n46#5:242\n46#5:248\n136#6:243\n136#6:249\n126#6,2:250\n*S KotlinDebug\n*F\n+ 1 HomeMenuListAdapter.kt\ncom/kubi/home/shortcut/HomeMenuListAdapter\n*L\n147#1:239\n147#1:240\n147#1:244\n226#1:245\n226#1:246\n226#1:252\n149#1:241\n227#1:247\n149#1:242\n227#1:248\n149#1:243\n228#1:249\n229#1:250,2\n*E\n"})
public final class HomeMenuListAdapter extends BaseQuickAdapter<FunctionEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<String> f26206i;

    /* JADX INFO: renamed from: j */
    public int f26207j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Action f26208k;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.HomeMenuListAdapter$a */
    /* JADX INFO: compiled from: HomeMenuListAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/home/shortcut/HomeMenuListAdapter$convert$1", "Lcom/kubi/resources/DoubleClickListener$DoubleClickCallBack;", "singleClick", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "doubleClick", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14852a implements DoubleClickListener.a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FunctionEntity f26210b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeMenuListAdapter f26211c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BaseViewHolder f26212d;

        public C14852a(FunctionEntity functionEntity, HomeMenuListAdapter homeMenuListAdapter, BaseViewHolder baseViewHolder) {
            this.f26210b = functionEntity;
            this.f26211c = homeMenuListAdapter;
            this.f26212d = baseViewHolder;
        }

        @Override // com.kubi.resources.DoubleClickListener.a
        /* JADX INFO: renamed from: a */
        public void mo30247a(View view) throws JSONException {
            HomeMenuListAdapter.this.m30243n(this.f26210b, this.f26211c, this.f26212d.getAdapterPosition());
        }

        @Override // com.kubi.resources.DoubleClickListener.a
        /* JADX INFO: renamed from: b */
        public void mo30248b(View view) throws Exception {
            Action f26208k;
            if (this.f26210b.isEmpty() || (f26208k = HomeMenuListAdapter.this.getF26208k()) == null) {
                return;
            }
            f26208k.run();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.HomeMenuListAdapter$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HomeMenuListAdapter.kt\ncom/kubi/home/shortcut/HomeMenuListAdapter\n*L\n1#1,328:1\n226#2:329\n*E\n"})
    public static final class C14853b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((Mark) t12).getType(), ((Mark) t11).getType());
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.HomeMenuListAdapter$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HomeMenuListAdapter.kt\ncom/kubi/home/shortcut/HomeMenuListAdapter\n*L\n1#1,328:1\n147#2:329\n*E\n"})
    public static final class C14854c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((Mark) t12).getType(), ((Mark) t11).getType());
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m30243n(FunctionEntity functionEntity, BaseQuickAdapter<FunctionEntity, BaseViewHolder> baseQuickAdapter, final int i11) throws JSONException {
        List<Mark> marks;
        List<Mark> listSortedWith;
        if (functionEntity.isEmpty()) {
            return;
        }
        int i12 = i11 + 1;
        String strValueOf = String.valueOf(i12);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", functionEntity.getUri());
        jSONObject.put(ViewProps.POSITION, m30242m(i11));
        jSONObject.put("contentType", C36722g.m82293g() ? C33789m5.f70921k : "night");
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocale().getLanguage());
        Unit unit = Unit.INSTANCE;
        C36716a.m82242e(HomeCardViewHolderProxy.PAGE_ID, "eightPlace", strValueOf, jSONObject);
        String uri = functionEntity.getUri();
        if (uri != null) {
            if (Intrinsics.areEqual(uri, "home/actionEdit")) {
                if (UserInfo.a.n()) {
                    C42899b.m94073c(new Function1() { // from class: com.kubi.home.shortcut.d
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeMenuListAdapter.m30239o(i11, (FragmentActivity) obj);
                        }
                    });
                    return;
                } else {
                    IUserService.O(HomeDepend.f26198a.m30225d(), (Map) null, (IRedirect) null, 3, (Object) null);
                    return;
                }
            }
            C36723h.m82297a(uri, HomeCardViewHolderProxy.PAGE_ID, "eightPlace", String.valueOf(i12));
            if (functionEntity.getShowMark()) {
                List<Mark> marks2 = functionEntity.getMarks();
                if (!C27025c.m66566d(marks2 != null ? Boolean.valueOf(!marks2.isEmpty()) : null) || (marks = functionEntity.getMarks()) == null || (listSortedWith = CollectionsKt.sortedWith(marks, new C14853b())) == null) {
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
                        baseQuickAdapter.notifyDataSetChanged();
                        return;
                    }
                }
            }
        }
    }

    public HomeMenuListAdapter() {
        super(R$layout.home_view_edit_menu_item_menu);
        this.f26206i = new ArrayList();
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30239o(int i11, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent(it, (Class<?>) EditHomeMenuActivity.class);
        intent.putExtra("spm", C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "eightPlace", String.valueOf(i11 + 1)));
        it.startActivity(intent);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final FunctionEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) helper.getView(R$id.tv_menu_tag);
        if (textView != null) {
            ViewExtKt.m66577h(textView);
        }
        helper.setText(R$id.tv_label, item.getName());
        if (item.getIconRes() != null) {
            helper.setImageResource(R$id.iv_menu_icon, item.getIconRes().intValue());
        } else {
            C46341d c46341dM102151a = C46338a.m102151a(this.mContext);
            Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
            C46340c<Object> c46340cM58535a = C24275u.m58535a(c46341dM102151a, C36722g.m82293g() ? item.getIcons() : item.getDarkIcons());
            C42032f c42032f = new C42032f();
            int i11 = R$mipmap.ic_placeholder;
            c46340cM58535a.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0((ImageView) helper.getView(R$id.iv_menu_icon));
        }
        if (!Intrinsics.areEqual("welfare/encourage", item.getUri()) || this.f26207j <= 0) {
            View itemView = helper.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.home.shortcut.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeMenuListAdapter.m30238k(this.f26239b, item, this, helper);
                }
            }, 1, null);
        } else {
            helper.itemView.setOnClickListener(new DoubleClickListener(new C14852a(item, this, helper)));
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        m30246r(mContext, helper, item);
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Action getF26208k() {
        return this.f26208k;
    }

    /* JADX INFO: renamed from: m */
    public final String m30242m(int i11) {
        return i11 < 10 ? "1st_page" : "2nd_page";
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        FunctionEntity item = getItem(holder.getAdapterPosition());
        if (item == null || CollectionsKt.contains(this.f26206i, item.getId())) {
            return;
        }
        String id2 = item.getId();
        if (id2 != null) {
            this.f26206i.add(id2);
        }
        String strValueOf = String.valueOf(holder.getAdapterPosition() + 1);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", item.getUri());
        jSONObject.put(ViewProps.POSITION, m30242m(holder.getAdapterPosition()));
        jSONObject.put("contentType", C36722g.m82293g() ? C33789m5.f70921k : "night");
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocale().getLanguage());
        Unit unit = Unit.INSTANCE;
        C36716a.m82244g(HomeCardViewHolderProxy.PAGE_ID, "eightPlace", strValueOf, jSONObject);
    }

    /* JADX INFO: renamed from: p */
    public final void m30244p(@Nullable Integer num) {
        if (num != null) {
            this.f26207j = num.intValue();
        }
        C4988a.m5287b("鼓励金个数" + num, null, 1, null);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: q */
    public final void m30245q(@Nullable Action action) {
        this.f26208k = action;
    }

    /* JADX INFO: renamed from: r */
    public final void m30246r(Context context, BaseViewHolder baseViewHolder, FunctionEntity functionEntity) {
        List<Mark> marks;
        List<Mark> listSortedWith;
        int i11;
        View view = baseViewHolder.getView(R$id.iv_menu_tag);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        ViewExtKt.m66577h(view);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_menu_tag);
        if (textView != null) {
            ViewExtKt.m66577h(textView);
            if (Intrinsics.areEqual("welfare/encourage", functionEntity.getUri()) && (i11 = this.f26207j) > 0) {
                textView.setText(String.valueOf(i11));
                textView.setBackgroundResource(R$drawable.shape_menu_tag_bg_secondary_20r);
                ViewExtKt.m66594y(textView);
                return;
            }
        }
        if (functionEntity.getShowMark()) {
            List<Mark> marks2 = functionEntity.getMarks();
            if (!C27025c.m66566d(marks2 != null ? Boolean.valueOf(!marks2.isEmpty()) : null) || (marks = functionEntity.getMarks()) == null || (listSortedWith = CollectionsKt.sortedWith(marks, new C14854c())) == null) {
                return;
            }
            for (Mark mark : listSortedWith) {
                C4988a.m5287b("正在加载" + mark.getName(), null, 1, null);
                StorageId<Boolean> storageIdM82274s = C36719d.f79632a.m82274s();
                String id2 = mark.getId();
                if (id2 == null) {
                    id2 = "";
                }
                boolean zM102322d = C46392a.m102322d(new StorageId(storageIdM82274s.getCategory(), storageIdM82274s.getKey() + id2, storageIdM82274s.getStorageType(), storageIdM82274s.getSupportLegacy()).m102384f(C36722g.m82291e()), true);
                if (!mark.getExpired() && (mark.getLongShow() || zM102322d)) {
                    Integer styleType = mark.getStyleType();
                    if (styleType == null || styleType.intValue() != 1) {
                        if (styleType != null && styleType.intValue() == 2) {
                            ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_menu_tag);
                            C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(context).mo6634v(C36722g.m82293g() ? mark.getIcons() : mark.getDarkIcons());
                            int i12 = R$mipmap.ic_home_menu_default;
                            c46340cMo6634v.mo92208m(i12).mo92188b0(i12).mo92186a0(C5275i0.m6236a(36.0f), C5275i0.m6236a(18.0f)).mo6606a(C42032f.m92235s0(new C4781a0(C5275i0.m6236a(20.0f)))).m6594E0(imageView);
                            Intrinsics.checkNotNull(imageView);
                            ViewExtKt.m66594y(imageView);
                            return;
                        }
                        return;
                    }
                    TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_menu_tag);
                    if (textView2 == null || TextUtils.isEmpty(mark.getName())) {
                        return;
                    }
                    Integer color = mark.getColor();
                    if (color != null && color.intValue() == 1) {
                        textView2.setBackgroundResource(R$drawable.shape_menu_tag_bg_secondary_20r);
                    } else if (color != null && color.intValue() == 2) {
                        textView2.setBackgroundResource(R$drawable.shape_menu_tag_bg_primary_20r);
                    }
                    textView2.setText(mark.getName());
                    ViewExtKt.m66594y(textView2);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m30238k(HomeMenuListAdapter homeMenuListAdapter, FunctionEntity functionEntity, HomeMenuListAdapter homeMenuListAdapter2, BaseViewHolder baseViewHolder) throws JSONException {
        homeMenuListAdapter.m30243n(functionEntity, homeMenuListAdapter2, baseViewHolder.getAdapterPosition());
        return Unit.INSTANCE;
    }
}
