package com.kubi.home.v2.container.p088ui.description;

import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.v2.container.p088ui.HandleTouchRecyclerView;
import com.kubi.home.v2.container.p088ui.description.CardDetailBottomSheet;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.CardStyle;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseAdapter;
import com.kubi.sdk.InnerViewHolder;
import com.kubi.sdk.ItemCallBack;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CardDetailBottomSheet.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00070\rJV\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\n\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\rH\u0002J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001cH\u0002J\u001c\u0010\"\u001a\u00020\u0007*\u00020#2\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/description/CardDetailBottomSheet;", "", "<init>", "()V", "isShowing", "", TIMPushProvider.f75062n, "", "cardData", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "context", "Landroid/content/Context;", "handleAddCard", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "addIndicator", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "styles", "", "Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "Lcom/kubi/sdk/BaseActivity;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "snapHelper", "Landroidx/recyclerview/widget/PagerSnapHelper;", "selectIndex", "", "onIndexChange", "disableItemTouch", "createIndicator", "Landroid/view/View;", "gridType", "addItem", "Landroid/widget/LinearLayout;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "spacing", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardDetailBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardDetailBottomSheet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n*L\n1#1,251:1\n295#2,2:252\n1878#2,3:255\n1869#2,2:261\n1549#2:264\n1620#2,3:265\n1878#2,3:268\n1#3:254\n49#4:258\n216#5,2:259\n372#6:263\n*S KotlinDebug\n*F\n+ 1 CardDetailBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardDetailBottomSheet\n*L\n63#1:252,2\n169#1:255,3\n110#1:261,2\n174#1:264\n174#1:265,3\n174#1:268,3\n244#1:258\n105#1:259,2\n174#1:263\n*E\n"})
public final class CardDetailBottomSheet {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CardDetailBottomSheet f26550a = new CardDetailBottomSheet();

    /* JADX INFO: renamed from: b */
    public static boolean f26551b;

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.description.CardDetailBottomSheet$a */
    /* JADX INFO: compiled from: CardDetailBottomSheet.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/home/v2/container/ui/description/CardDetailBottomSheet$addIndicator$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCardDetailBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardDetailBottomSheet$addIndicator$3\n+ 2 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n372#2:252\n1549#3:253\n1620#3,3:254\n1878#3,3:257\n*S KotlinDebug\n*F\n+ 1 CardDetailBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardDetailBottomSheet$addIndicator$3\n*L\n194#1:252\n194#1:253\n194#1:254,3\n194#1:257,3\n*E\n"})
    public static final class C15005a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PagerSnapHelper f26552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<CardStyle> f26553b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<CardStyle, Unit> f26554c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ LinearLayout f26555d;

        /* JADX WARN: Multi-variable type inference failed */
        public C15005a(PagerSnapHelper pagerSnapHelper, List<CardStyle> list, Function1<? super CardStyle, Unit> function1, LinearLayout linearLayout) {
            this.f26552a = pagerSnapHelper;
            this.f26553b = list;
            this.f26554c = function1;
            this.f26555d = linearLayout;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            RecyclerView.LayoutManager layoutManager;
            int childAdapterPosition;
            CardStyle cardStyle;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState != 0 || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            PagerSnapHelper pagerSnapHelper = this.f26552a;
            List<CardStyle> list = this.f26553b;
            Function1<CardStyle, Unit> function1 = this.f26554c;
            LinearLayout linearLayout = this.f26555d;
            View viewFindSnapView = pagerSnapHelper.findSnapView(layoutManager);
            if (viewFindSnapView == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView)) == -1 || (cardStyle = (CardStyle) CollectionsKt.getOrNull(list, childAdapterPosition)) == null) {
                return;
            }
            function1.invoke(cardStyle);
            Intrinsics.checkNotNull(linearLayout);
            IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
            }
            int i11 = 0;
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((View) obj).setSelected(i11 == childAdapterPosition);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.description.CardDetailBottomSheet$b */
    /* JADX INFO: compiled from: CardDetailBottomSheet.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m90084d2 = {"com/kubi/home/v2/container/ui/description/CardDetailBottomSheet$disableItemTouch$1", "Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView$TouchHandler;", "interceptTouchEvent", "", "e", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onTouchEvent", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15006b implements HandleTouchRecyclerView.InterfaceC15004a {
        @Override // com.kubi.home.v2.container.p088ui.HandleTouchRecyclerView.InterfaceC15004a
        /* JADX INFO: renamed from: b */
        public Boolean mo30867b(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return null;
        }

        @Override // com.kubi.home.v2.container.p088ui.HandleTouchRecyclerView.InterfaceC15004a
        /* JADX INFO: renamed from: c */
        public Boolean mo30868c(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.description.CardDetailBottomSheet$c */
    /* JADX INFO: compiled from: CardDetailBottomSheet.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/home/v2/container/ui/description/CardDetailBottomSheet$show$1$5", "Lcom/kubi/sdk/BaseAdapter;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "getItemViewType", "", ViewProps.POSITION, "onBindViewHolder", "", C33954u6.f72238i, "Lcom/kubi/sdk/InnerViewHolder;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15007c extends BaseAdapter<BaseCardDataV2> {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ int f26556q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ int f26557r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15007c(List<BaseCardDataV2> list, int i11, int i12, SparseArray<Class<?>> sparseArray, SparseArray<ItemCallBack<?>> sparseArray2, SparseArray<ItemCallBack<?>> sparseArray3) {
            super(list, sparseArray, sparseArray2, sparseArray3, null, null, 48, null);
            this.f26556q = i11;
            this.f26557r = i12;
        }

        @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l */
        public void onBindViewHolder(InnerViewHolder<BaseCardDataV2> holder, int i11) {
            BaseCardDataV2 baseCardDataV2;
            CardStyle style;
            Intrinsics.checkNotNullParameter(holder, "holder");
            super.onBindViewHolder(holder, i11);
            List<BaseCardDataV2> data = getData();
            Integer numValueOf = (data == null || (baseCardDataV2 = data.get(holder.getBindingAdapterPosition())) == null || (style = baseCardDataV2.getStyle()) == null) ? null : Integer.valueOf(style.getGridType());
            View view = holder.itemView;
            int i12 = this.f26556q;
            int i13 = this.f26557r;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (numValueOf != null && numValueOf.intValue() == 2) {
                view.setPadding(i12, 0, i12, 0);
            } else {
                view.setPadding(i13, 0, i13, 0);
            }
        }

        @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            BaseCardDataV2 baseCardDataV2;
            List<BaseCardDataV2> data = getData();
            if (data != null && (baseCardDataV2 = data.get(position)) != null) {
                return baseCardDataV2.getF27926j();
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m30877n(int i11, int i12, BaseCardDataV2 baseCardDataV2, List list, final Ref.ObjectRef objectRef, Context context, final Function1 function1, int i13, int i14, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        final RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        viewHolder.itemView.setMinimumHeight(i11);
        viewHolder.itemView.setMinimumWidth(i12);
        ((TextView) viewHolder.getView(R$id.title)).setText(baseCardDataV2.getTitle());
        ((TextView) viewHolder.getView(R$id.content)).setText(baseCardDataV2.getContent());
        View view = viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        final BaseCardDataV2 baseCardDataV3 = baseCardDataV2;
        C27046k.m66710y(view, 1000L, new Function0() { // from class: rj.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardDetailBottomSheet.m30878o(function1, baseCardDataV3, objectRef, dialogFragmentHelper);
            }
        });
        View view2 = viewHolder.getView(R$id.close);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: rj.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardDetailBottomSheet.m30879p(dialogFragmentHelper);
            }
        }, 1, null);
        final Context context2 = viewHolder.itemView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2) { // from class: com.kubi.home.v2.container.ui.description.CardDetailBottomSheet$show$1$3
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] extraLayoutSpace) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
                super.calculateExtraLayoutSpace(state, extraLayoutSpace);
                extraLayoutSpace[0] = extraLayoutSpace[0] + (C5267e0.m6183e() * 3);
                extraLayoutSpace[1] = extraLayoutSpace[1] + (C5267e0.m6183e() * 3);
            }
        };
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        CardDetailBottomSheet cardDetailBottomSheet = f26550a;
        Intrinsics.checkNotNull(recyclerView);
        cardDetailBottomSheet.m30886l(recyclerView);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(recyclerView);
        ArrayList<BaseCardDataV2> arrayList = new ArrayList();
        Iterator<Map.Entry<String, CardStyle>> it = baseCardDataV3.m32256k().entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(BaseCardDataV2.m32246b(baseCardDataV3, null, it.next().getValue(), null, null, null, false, false, null, null, 509, null));
            baseCardDataV3 = baseCardDataV2;
        }
        SparseArray sparseArray = new SparseArray();
        for (BaseCardDataV2 baseCardDataV4 : arrayList) {
            sparseArray.put(baseCardDataV4.getF27926j(), baseCardDataV4.getStyle().getMapping().m32263a());
        }
        recyclerView.setAdapter(new C15007c(arrayList, i13, i14, sparseArray, new SparseArray(), new SparseArray()));
        if (list.size() > 1) {
            final Ref.IntRef intRef = new Ref.IntRef();
            int iIndexOf = list.indexOf(objectRef.element);
            intRef.element = iIndexOf;
            if (iIndexOf < 0) {
                intRef.element = 0;
            }
            f26550a.m30883h(viewHolder, list, (BaseActivity) context, recyclerView, pagerSnapHelper, intRef.element, new Function1() { // from class: rj.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardDetailBottomSheet.m30880q(objectRef, (CardStyle) obj);
                }
            });
            recyclerView.post(new Runnable() { // from class: rj.k
                @Override // java.lang.Runnable
                public final void run() {
                    CardDetailBottomSheet.m30881r(recyclerView, intRef);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m30882s(DialogInterface dialogInterface) {
        f26551b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final Unit m30878o(Function1 function1, BaseCardDataV2 baseCardDataV2, Ref.ObjectRef objectRef, DialogFragmentHelper dialogFragmentHelper) {
        function1.invoke(BaseCardDataV2.m32246b(baseCardDataV2, null, (CardStyle) objectRef.element, null, null, null, false, false, null, null, 509, null));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final Unit m30880q(Ref.ObjectRef objectRef, CardStyle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        objectRef.element = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m30881r(RecyclerView recyclerView, Ref.IntRef intRef) {
        if ((recyclerView != null ? recyclerView.getContext() : null) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(intRef.element);
    }

    /* JADX INFO: renamed from: h */
    public final void m30883h(BaseViewHolder baseViewHolder, List<CardStyle> list, BaseActivity baseActivity, final RecyclerView recyclerView, PagerSnapHelper pagerSnapHelper, int i11, final Function1<? super CardStyle, Unit> function1) {
        final LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R$id.card_indicator);
        final int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CardStyle cardStyle = (CardStyle) obj;
            CardDetailBottomSheet cardDetailBottomSheet = f26550a;
            View viewM30885k = cardDetailBottomSheet.m30885k(baseActivity, cardStyle.getGridType());
            C27046k.m66711z(viewM30885k, 0L, new Function0() { // from class: rj.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CardDetailBottomSheet.m30876i(recyclerView, i12, function1, cardStyle, linearLayout);
                }
            }, 1, null);
            Intrinsics.checkNotNull(linearLayout);
            cardDetailBottomSheet.m30884j(linearLayout, viewM30885k, C27040e.m66658b(24));
            i12 = i13;
        }
        linearLayout.getChildAt(i11).setSelected(true);
        recyclerView.addOnScrollListener(new C15005a(pagerSnapHelper, list, function1, linearLayout));
    }

    /* JADX INFO: renamed from: j */
    public final void m30884j(LinearLayout linearLayout, View view, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C27040e.m66658b(40), C27040e.m66658b(40));
        if (linearLayout.getChildCount() != 0) {
            layoutParams.setMarginStart(i11);
        }
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
    }

    /* JADX INFO: renamed from: k */
    public final View m30885k(Context context, int i11) {
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        imageView.setBackground(ContextCompat.getDrawable(context, R$drawable.selector_btn_emphasis4_12r));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageTintList(ContextCompat.getColorStateList(context, R$color.c_text));
        int i12 = (i11 == 0 || i11 == 1) ? R$drawable.ic2_medium_widget_24 : R$drawable.ic2_small_widget_24;
        imageView.setImageResource(i12);
        return imageView;
    }

    /* JADX INFO: renamed from: l */
    public final void m30886l(RecyclerView recyclerView) {
        HandleTouchRecyclerView handleTouchRecyclerView = recyclerView instanceof HandleTouchRecyclerView ? (HandleTouchRecyclerView) recyclerView : null;
        if (handleTouchRecyclerView != null) {
            handleTouchRecyclerView.setTouchHandler(new C15006b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final void m30887m(@NotNull final BaseCardDataV2 cardData, @Nullable final Context context, @NotNull final Function1<? super BaseCardDataV2, Unit> handleAddCard) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        Intrinsics.checkNotNullParameter(handleAddCard, "handleAddCard");
        if (f26551b) {
            return;
        }
        Object obj = null;
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity == null || (supportFragmentManager = baseActivity.getSupportFragmentManager()) == null) {
            return;
        }
        Collection<CardStyle> collectionValues = cardData.m32256k().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        final List list = CollectionsKt.toList(collectionValues);
        if (list.isEmpty()) {
            return;
        }
        final int iM6183e = C5267e0.m6183e();
        final int iM66658b = C27040e.m66658b(16);
        final int i11 = (iM6183e - (iM6183e / 2)) / 2;
        final int iM6182d = (int) (C5267e0.m6182d() * 0.8f);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((CardStyle) obj2).getName(), cardData.getStyle().getName())) {
                obj = obj2;
                break;
            }
        }
        CardStyle cardStyle = (CardStyle) obj;
        T t11 = cardStyle;
        if (cardStyle == null) {
            Object obj3 = list.get(0);
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            t11 = (CardStyle) obj3;
        }
        objectRef.element = t11;
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.home_card_detail_bottom_sheet, 0, 0, iM6182d, true, true, false, false, false, 454, null).m54237f4(new Function2() { // from class: rj.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj4, Object obj5) {
                return CardDetailBottomSheet.m30877n(iM6182d, iM6183e, cardData, list, objectRef, context, handleAddCard, i11, iM66658b, (BaseViewHolder) obj4, (DialogFragmentHelper) obj5);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: rj.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CardDetailBottomSheet.m30882s(dialogInterface);
            }
        }).show(supportFragmentManager, "CardDetailBottomSheet");
        f26551b = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "widgetDetail", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m30876i(RecyclerView recyclerView, int i11, Function1 function1, CardStyle cardStyle, LinearLayout linearLayout) {
        boolean z11;
        recyclerView.smoothScrollToPosition(i11);
        function1.invoke(cardStyle);
        Intrinsics.checkNotNull(linearLayout);
        IntRange intRangeUntil = RangesKt.until(0, linearLayout.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(linearLayout.getChildAt(((IntIterator) it).nextInt()));
        }
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (i12 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            view.setSelected(z11);
            i12 = i13;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30879p(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
