package com.kubi.kumex.trade.menu.announcement;

import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.Article;
import com.kubi.kumex.data.platform.model.ArticleCategories;
import com.kubi.kumex.trade.menu.p092vm.AnnouncementType;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27017c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p729wl.C45875l0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BaseAnnouncementTypeFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dB=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "announcementType", "Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;", "articles", "Ljava/util/ArrayList;", "Lcom/kubi/kumex/data/platform/model/Article;", "Lkotlin/collections/ArrayList;", "onItemClick", "Lkotlin/Function1;", "", "<init>", "(Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "notifyChanged", "newList", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", C33954u6.f72238i, ViewProps.POSITION, "getItemCount", "getItemViewType", "Companion", "TypeViewHolder", "FooterViewHolder", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnnouncementTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f30583l = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AnnouncementType f30584i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public ArrayList<Article> f30585j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final Function1<Article, Unit> f30586k;

    /* JADX INFO: compiled from: BaseAnnouncementTypeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter$Companion;", "", "<init>", "()V", "TYPE_ARTICLE", "", "TYPE_FOOTER", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: BaseAnnouncementTypeFragment.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter$TypeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "tvTag", "tvTime", "bind", "", "article", "Lcom/kubi/kumex/data/platform/model/Article;", "announcementType", "Lcom/kubi/kumex/trade/menu/vm/AnnouncementType;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseAnnouncementTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAnnouncementTypeFragment.kt\ncom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter$TypeViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n295#2,2:243\n295#2,2:245\n1#3:247\n*S KotlinDebug\n*F\n+ 1 BaseAnnouncementTypeFragment.kt\ncom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter$TypeViewHolder\n*L\n199#1:243,2\n205#1:245,2\n*E\n"})
    public static final class TypeViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: j */
        @NotNull
        public static final Companion f30587j = new Companion(null);

        /* JADX INFO: renamed from: k */
        @NotNull
        public static final Map<String, Pair<String, Integer>> f30588k;

        /* JADX INFO: renamed from: l */
        @NotNull
        public static final Set<String> f30589l;

        /* JADX INFO: renamed from: g */
        public final AppCompatTextView f30590g;

        /* JADX INFO: renamed from: h */
        public final AppCompatTextView f30591h;

        /* JADX INFO: renamed from: i */
        public final AppCompatTextView f30592i;

        /* JADX INFO: compiled from: BaseAnnouncementTypeFragment.kt */
        @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter$TypeViewHolder$Companion;", "", "<init>", "()V", "tagMap", "", "", "Lkotlin/Pair;", "", "excludePaths", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        static {
            C27017c c27017c = C27017c.f54310a;
            f30588k = MapsKt.mapOf(TuplesKt.m90091to("activities", TuplesKt.m90091to(c27017c.m66516f(R$string.feed_activity, new Object[0]), Integer.valueOf(R$drawable.ic2_flag_12))), TuplesKt.m90091to("new-listings", TuplesKt.m90091to(c27017c.m66516f(R$string.home_card_activity_title_new_coin, new Object[0]), Integer.valueOf(R$drawable.ic2_buy_crypto_12))), TuplesKt.m90091to("product-updates", TuplesKt.m90091to(c27017c.m66516f(R$string.produce_updates, new Object[0]), Integer.valueOf(R$drawable.ic2_product_update_12))), TuplesKt.m90091to("maintenance-updates", TuplesKt.m90091to(c27017c.m66516f(R$string.system_maintenance, new Object[0]), Integer.valueOf(R$drawable.ic2_maintence_12))), TuplesKt.m90091to("delistings", TuplesKt.m90091to(c27017c.m66516f(R$string.delisting, new Object[0]), Integer.valueOf(R$drawable.ic2_delisting_12))), TuplesKt.m90091to("vip", TuplesKt.m90091to(c27017c.m66516f(R$string.institutions_vips, new Object[0]), Integer.valueOf(R$drawable.ic2_vip_crown_12))), TuplesKt.m90091to(SearchCategory$Companion.WEB3, TuplesKt.m90091to(c27017c.m66516f(R$string.tab_web3, new Object[0]), Integer.valueOf(R$drawable.ic2_web3_thin_12))), TuplesKt.m90091to(InterfaceC33953u5.f72221q, TuplesKt.m90091to(c27017c.m66516f(R$string.other, new Object[0]), Integer.valueOf(R$drawable.ic2_more2_12))));
            f30589l = SetsKt.setOf((Object[]) new String[]{"latest-announcements", "futures-announcements"});
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TypeViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f30590g = (AppCompatTextView) itemView.findViewById(R$id.announcement_name);
            this.f30591h = (AppCompatTextView) itemView.findViewById(R$id.announcement_tag);
            this.f30592i = (AppCompatTextView) itemView.findViewById(R$id.announcement_time);
        }

        /* JADX INFO: renamed from: a */
        public final void m36351a(@NotNull Article article, @NotNull AnnouncementType announcementType) {
            Object next;
            Pair<String, Integer> pairM90091to;
            Object next2;
            String path;
            Intrinsics.checkNotNullParameter(article, "article");
            Intrinsics.checkNotNullParameter(announcementType, "announcementType");
            AppCompatTextView appCompatTextView = this.f30590g;
            String title = article.getTitle();
            if (title == null) {
                title = "";
            }
            appCompatTextView.setText(title);
            if (announcementType == AnnouncementType.LATEST) {
                this.f30591h.setText(C27017c.f54310a.m66516f(R$string.feed_activity, new Object[0]));
                this.f30591h.setCompoundDrawablesRelativeWithIntrinsicBounds(R$drawable.ic2_flag_12, 0, 0, 0);
            } else if (announcementType == AnnouncementType.NEW_TRADING_PAIR) {
                this.f30591h.setText(C27017c.f54310a.m66516f(R$string.home_card_activity_title_new_coin, new Object[0]));
                this.f30591h.setCompoundDrawablesRelativeWithIntrinsicBounds(R$drawable.ic2_buy_crypto_12, 0, 0, 0);
            } else {
                List<ArticleCategories> categories = article.getCategories();
                if (categories == null || categories.isEmpty()) {
                    this.f30591h.setVisibility(8);
                } else {
                    this.f30591h.setVisibility(0);
                    Iterator<T> it = categories.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        path = ((ArticleCategories) next).getPath();
                        if (path == null) {
                            path = "";
                        }
                    } while (f30589l.contains(path));
                    ArticleCategories articleCategories = (ArticleCategories) next;
                    if (articleCategories != null) {
                        String path2 = articleCategories.getPath();
                        if (path2 == null) {
                            path2 = "";
                        }
                        Iterator<T> it2 = f30588k.keySet().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!StringsKt.contains$default((CharSequence) path2, (CharSequence) next2, false, 2, (Object) null));
                        Map<String, Pair<String, Integer>> map = f30588k;
                        pairM90091to = map.get((String) next2);
                        if (pairM90091to == null && (pairM90091to = map.get(InterfaceC33953u5.f72221q)) == null) {
                            pairM90091to = TuplesKt.m90091to("", 0);
                        }
                    } else {
                        pairM90091to = f30588k.get(InterfaceC33953u5.f72221q);
                        if (pairM90091to == null) {
                            pairM90091to = TuplesKt.m90091to("", 0);
                        }
                    }
                    String strComponent1 = pairM90091to.component1();
                    int iIntValue = pairM90091to.component2().intValue();
                    this.f30591h.setText(strComponent1);
                    if (iIntValue != 0) {
                        this.f30591h.setCompoundDrawablesRelativeWithIntrinsicBounds(iIntValue, 0, 0, 0);
                    } else {
                        this.f30591h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
            Long publishTime = article.getPublishTime();
            this.f30592i.setText(C42179a.m92633f(publishTime != null ? publishTime.longValue() * ((long) 1000) : 0L, null, false, false, null, 15, null));
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.announcement.AnnouncementTypeAdapter$a */
    /* JADX INFO: compiled from: BaseAnnouncementTypeFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/announcement/AnnouncementTypeAdapter$FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvFootTitle", "Landroidx/appcompat/widget/AppCompatTextView;", "kotlin.jvm.PlatformType", "bind", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16914a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: g */
        public final AppCompatTextView f30593g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16914a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f30593g = (AppCompatTextView) itemView.findViewById(R$id.tv_footer);
        }

        /* JADX INFO: renamed from: b */
        public final void m36352b() {
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            AppCompatTextView tvFootTitle = this.f30593g;
            Intrinsics.checkNotNullExpressionValue(tvFootTitle, "tvFootTitle");
            highlightTextHelper.m54116a(tvFootTitle, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.primary)));
        }
    }

    public /* synthetic */ AnnouncementTypeAdapter(AnnouncementType announcementType, ArrayList arrayList, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(announcementType, (i11 & 2) != 0 ? new ArrayList() : arrayList, function1);
    }

    /* JADX INFO: renamed from: j */
    public static final void m36348j(AnnouncementTypeAdapter announcementTypeAdapter, Article article, View view) {
        announcementTypeAdapter.f30586k.invoke(article);
    }

    /* JADX INFO: renamed from: k */
    public static final void m36349k(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101349q0(), null, null, null, null, null, null, 126, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30585j.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position < this.f30585j.size() ? 0 : 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m36350i(@NotNull List<Article> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.f30585j.clear();
        this.f30585j.addAll(newList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof TypeViewHolder) || position >= this.f30585j.size()) {
            if (holder instanceof C16914a) {
                ((C16914a) holder).m36352b();
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.kumex.trade.menu.announcement.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AnnouncementTypeAdapter.m36349k(view);
                    }
                });
                return;
            }
            return;
        }
        Article article = this.f30585j.get(position);
        Intrinsics.checkNotNullExpressionValue(article, "get(...)");
        final Article article2 = article;
        ((TypeViewHolder) holder).m36351a(article2, this.f30584i);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.kumex.trade.menu.announcement.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnnouncementTypeAdapter.m36348j(this.f30604b, article2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_announcement_item_type, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new TypeViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R$layout.bkumex_announcement_footer, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new C16914a(viewInflate2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnouncementTypeAdapter(@NotNull AnnouncementType announcementType, @NotNull ArrayList<Article> articles, @NotNull Function1<? super Article, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(announcementType, "announcementType");
        Intrinsics.checkNotNullParameter(articles, "articles");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f30584i = announcementType;
        this.f30585j = articles;
        this.f30586k = onItemClick;
    }
}
