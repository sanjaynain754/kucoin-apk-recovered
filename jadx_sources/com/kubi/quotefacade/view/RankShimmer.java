package com.kubi.quotefacade.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.shimmer.SkeletonLayout;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.InterfaceC36986b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: RankShimmer.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/quotefacade/view/RankShimmer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Lcom/kubi/quotefacade/view/RankShimmer$RankShimmerAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/view/RankShimmer$RankShimmerAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "dataList", "", "", "getDataList", "()Ljava/util/List;", "dataList$delegate", "isPlay", "", "play", "", InterfaceC33730j9.f70350a, "onDetachedFromWindow", "tryUpdateState", "Companion", "RankShimmerAdapter", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRankShimmer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankShimmer.kt\ncom/kubi/quotefacade/view/RankShimmer\n+ 2 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n372#2:102\n372#2:108\n372#2:116\n372#2:122\n1549#3:103\n1620#3,3:104\n1869#3:107\n1549#3:109\n1620#3,3:110\n1869#3,2:113\n1870#3:115\n1549#3:117\n1620#3,3:118\n1869#3:121\n1549#3:123\n1620#3,3:124\n1869#3,2:127\n1870#3:129\n*S KotlinDebug\n*F\n+ 1 RankShimmer.kt\ncom/kubi/quotefacade/view/RankShimmer\n*L\n58#1:102\n60#1:108\n71#1:116\n73#1:122\n58#1:103\n58#1:104,3\n58#1:107\n60#1:109\n60#1:110,3\n60#1:113,2\n58#1:115\n71#1:117\n71#1:118,3\n71#1:121\n73#1:123\n73#1:124,3\n73#1:127,2\n71#1:129\n*E\n"})
public final class RankShimmer extends LinearLayout {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f42760f = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final RecyclerView f42761b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f42762c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f42763d;

    /* JADX INFO: renamed from: e */
    public boolean f42764e;

    /* JADX INFO: compiled from: RankShimmer.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/view/RankShimmer$Companion;", "", "<init>", "()V", "COUNT", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.view.RankShimmer$a */
    /* JADX INFO: compiled from: RankShimmer.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/view/RankShimmer$RankShimmerAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22592a extends BaseQuickAdapter<String, BaseViewHolder> {
        public C22592a() {
            super(R$layout.rank_item_shimmer);
        }

        @Override // io.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void convert(@NotNull BaseViewHolder helper, @NotNull String item) {
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RankShimmer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public final void m53323f() {
        this.f42764e = false;
        RecyclerView recyclerView = this.f42761b;
        IntRange intRangeUntil = RangesKt.until(0, recyclerView.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof LinearLayout) {
                ViewGroup viewGroup = (ViewGroup) view;
                IntRange intRangeUntil2 = RangesKt.until(0, viewGroup.getChildCount());
                ArrayList<View> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
                Iterator<Integer> it2 = intRangeUntil2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(viewGroup.getChildAt(((IntIterator) it2).nextInt()));
                }
                for (View view2 : arrayList2) {
                    if (view2 instanceof SkeletonLayout) {
                        ((SkeletonLayout) view2).m54395d();
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RankShimmer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public static final C22592a m53320c() {
        return new C22592a();
    }

    /* JADX INFO: renamed from: d */
    public static final List m53321d() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 20; i11++) {
            arrayList.add(String.valueOf(i11));
        }
        return arrayList;
    }

    private final C22592a getAdapter() {
        return (C22592a) this.f42762c.getValue();
    }

    private final List<String> getDataList() {
        return (List) this.f42763d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m53322e() {
        if (this.f42764e) {
            return;
        }
        this.f42764e = true;
        RecyclerView recyclerView = this.f42761b;
        IntRange intRangeUntil = RangesKt.until(0, recyclerView.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof LinearLayout) {
                ViewGroup viewGroup = (ViewGroup) view;
                IntRange intRangeUntil2 = RangesKt.until(0, viewGroup.getChildCount());
                ArrayList<View> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
                Iterator<Integer> it2 = intRangeUntil2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(viewGroup.getChildAt(((IntIterator) it2).nextInt()));
                }
                for (View view2 : arrayList2) {
                    if (!(view2 instanceof Guideline)) {
                        Intrinsics.checkNotNull(view2);
                        InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(view2, null, 1, null);
                        if (interfaceC36986bM54399d != null) {
                            interfaceC36986bM54399d.mo54393a();
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ RankShimmer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m53323f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RankShimmer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42762c = LazyKt.lazy(new Function0() { // from class: sv.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankShimmer.m53320c();
            }
        });
        this.f42763d = LazyKt.lazy(new Function0() { // from class: sv.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankShimmer.m53321d();
            }
        });
        View viewFindViewById = LayoutInflater.from(context).inflate(R$layout.rank_shimmer, this).findViewById(R$id.rank_shimmer_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f42761b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(getAdapter());
        getAdapter().replaceData(getDataList());
    }
}
