package com.kubi.home.main.shimmer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$color;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.main.shimmer.HomeShimmerLayout;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.operation.api.IOperationService;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.shimmer.SkeletonLayout;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import fj.C37533n;
import fj.C37535o;
import fj.C37537p;
import fj.C37541r;
import fj.C37543s;
import fj.C37545t;
import fj.C37547u;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058cj.C4988a;
import p213dw.InterfaceC36986b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;

/* JADX INFO: compiled from: HomeShimmerLayout.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0014\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J\u0016\u0010#\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0002J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0002R\u001c\u0010\n\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0018X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006."}, m90084d2 = {"Lcom/kubi/home/main/shimmer/HomeShimmerLayout;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", TtmlNode.RUBY_CONTAINER, "Landroidx/appcompat/widget/LinearLayoutCompat;", "getContainer$HomeLib_googleRelease$annotations", "()V", "getContainer$HomeLib_googleRelease", "()Landroidx/appcompat/widget/LinearLayoutCompat;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "isShimmerShowing", "", "isShimmerShowing$HomeLib_googleRelease", "()Z", "setShimmerShowing$HomeLib_googleRelease", "(Z)V", TIMPushProvider.f75063o, "", TIMPushProvider.f75062n, "cards", "", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "createSkeletonsAndShow", "operationCardShimmer", "type", "", "menu", "hotSymbol", "messageBox", "twoGrip", "rankList", "currencyRecommend", "recommendedPosition", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeShimmerLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeShimmerLayout.kt\ncom/kubi/home/main/shimmer/HomeShimmerLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1869#2,2:190\n1#3:192\n*S KotlinDebug\n*F\n+ 1 HomeShimmerLayout.kt\ncom/kubi/home/main/shimmer/HomeShimmerLayout\n*L\n86#1:190,2\n*E\n"})
public final class HomeShimmerLayout extends NestedScrollView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final LinearLayoutCompat f25818b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f25819c;

    /* JADX INFO: renamed from: d */
    public boolean f25820d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m29463t(HomeShimmerLayout homeShimmerLayout) {
        homeShimmerLayout.f25820d = false;
        if (!ViewExtKt.m66581l(homeShimmerLayout)) {
            return Unit.INSTANCE;
        }
        ViewExtKt.m66577h(homeShimmerLayout);
        homeShimmerLayout.f25818b.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m29442D(String str, HomeShimmerLayout homeShimmerLayout) {
        IOperationService iOperationService = IOperationService.f36504a.get();
        if (str == null) {
            str = "";
        }
        LayoutInflater inflater = homeShimmerLayout.getInflater();
        Intrinsics.checkNotNullExpressionValue(inflater, "<get-inflater>(...)");
        iOperationService.mo4606h(str, inflater, homeShimmerLayout.f25818b);
        return Unit.INSTANCE;
    }

    private final LayoutInflater getInflater() {
        return (LayoutInflater) this.f25819c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    public static final Unit m29460o(List list, HomeShimmerLayout homeShimmerLayout) {
        C4988a.m5286a(CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: jj.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeShimmerLayout.m29461p((BaseCardData) obj);
            }
        }, 30, null), "HomeShimmer");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseCardData baseCardData = (BaseCardData) it.next();
            String type = baseCardData.getType();
            if (type != null) {
                switch (type.hashCode()) {
                    case -1077595670:
                        if (type.equals("HOT_SYMBOL")) {
                            homeShimmerLayout.m29476u();
                        }
                        break;
                    case -820584873:
                        if (type.equals("NO_LOGINED_WELFARE")) {
                            homeShimmerLayout.m29468C(baseCardData.getType());
                        }
                        break;
                    case 2362719:
                        if (type.equals("MENU")) {
                            homeShimmerLayout.m29478y();
                        }
                        break;
                    case 530110958:
                        if (type.equals("CURRENCY_RECOMMEND")) {
                            homeShimmerLayout.m29474q();
                        }
                        break;
                    case 1281126739:
                        if (type.equals("MESSAGE_BOX")) {
                            homeShimmerLayout.m29467A();
                        }
                        break;
                    case 1333333894:
                        if (type.equals("NO_LOGINED_CURRENCY")) {
                            homeShimmerLayout.m29468C(baseCardData.getType());
                        }
                        break;
                    case 1598531367:
                        if (type.equals("RANKING_LIST")) {
                            homeShimmerLayout.m29469E();
                        }
                        break;
                    case 1951158380:
                        if (type.equals("WELFARE")) {
                            homeShimmerLayout.m29468C(baseCardData.getType());
                        }
                        break;
                }
            }
            String code = baseCardData.getCode();
            if (code != null) {
                int iHashCode = code.hashCode();
                if (iHashCode != -1632153436) {
                    if (iHashCode != -1559386608) {
                        if (iHashCode == -912147522 && code.equals("twoGrip")) {
                            homeShimmerLayout.m29472K();
                        }
                    } else if (code.equals("threeGrip")) {
                        homeShimmerLayout.m29472K();
                    }
                } else if (code.equals("recommendedPosition")) {
                    homeShimmerLayout.m29470G();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final CharSequence m29461p(BaseCardData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode() + '(' + it.getType() + ')';
    }

    /* JADX INFO: renamed from: A */
    public final void m29467A() {
        C27100x0.m66923d(new Function0() { // from class: jj.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29441B(this.f89735b);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m29468C(final String str) {
        C27100x0.m66923d(new Function0() { // from class: jj.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29442D(str, this);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m29469E() {
        C27100x0.m66923d(new Function0() { // from class: jj.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29443F(this.f89729b);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m29470G() {
        C27100x0.m66923d(new Function0() { // from class: jj.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29444H(this.f89738b);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m29471I(@NotNull final List<BaseCardData> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        C27100x0.m66923d(new Function0() { // from class: jj.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29445J(this.f89730b, cards);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m29472K() {
        C27100x0.m66923d(new Function0() { // from class: jj.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29446L(this.f89728b);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: getContainer$HomeLib_googleRelease, reason: from getter */
    public final LinearLayoutCompat getF25818b() {
        return this.f25818b;
    }

    /* JADX INFO: renamed from: n */
    public final void m29473n(final List<BaseCardData> list) {
        C27100x0.m66923d(new Function0() { // from class: jj.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29460o(list, this);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m29474q() {
        C27100x0.m66923d(new Function0() { // from class: jj.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29462r(this.f89739b);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m29475s() {
        C27100x0.m66923d(new Function0() { // from class: jj.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29463t(this.f89734b);
            }
        });
    }

    public final void setShimmerShowing$HomeLib_googleRelease(boolean z11) {
        this.f25820d = z11;
    }

    /* JADX INFO: renamed from: u */
    public final void m29476u() {
        C27100x0.m66923d(new Function0() { // from class: jj.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29464v(this.f89736b);
            }
        });
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getF25820d() {
        return this.f25820d;
    }

    /* JADX INFO: renamed from: y */
    public final void m29478y() {
        C27100x0.m66923d(new Function0() { // from class: jj.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29466z(this.f89737b);
            }
        });
    }

    public /* synthetic */ HomeShimmerLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m29441B(HomeShimmerLayout homeShimmerLayout) {
        C37537p c37537pM84540c = C37537p.m84540c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true);
        View v11 = c37537pM84540c.f83384b;
        Intrinsics.checkNotNullExpressionValue(v11, "v1");
        InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(v11, null, 1, null);
        if (interfaceC36986bM54399d != null) {
            interfaceC36986bM54399d.mo54393a();
        }
        View v12 = c37537pM84540c.f83385c;
        Intrinsics.checkNotNullExpressionValue(v12, "v2");
        InterfaceC36986b interfaceC36986bM54399d2 = C22911a.m54399d(v12, null, 1, null);
        if (interfaceC36986bM54399d2 != null) {
            interfaceC36986bM54399d2.mo54393a();
        }
        View v13 = c37537pM84540c.f83386d;
        Intrinsics.checkNotNullExpressionValue(v13, "v3");
        InterfaceC36986b interfaceC36986bM54399d3 = C22911a.m54399d(v13, null, 1, null);
        if (interfaceC36986bM54399d3 != null) {
            interfaceC36986bM54399d3.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m29443F(HomeShimmerLayout homeShimmerLayout) {
        RecyclerView recyclerView = C37543s.m84555c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true).f83407b;
        final int i11 = R$layout.home_item_shimmer_ranklist;
        BaseQuickAdapter<Integer, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<Integer, BaseViewHolder>(i11) { // from class: com.kubi.home.main.shimmer.HomeShimmerLayout$rankList$1$1$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, Integer num) {
                SkeletonLayout skeletonLayout;
                SkeletonLayout skeletonLayout2;
                SkeletonLayout skeletonLayout3;
                SkeletonLayout skeletonLayout4;
                if (baseViewHolder != null && (skeletonLayout4 = (SkeletonLayout) baseViewHolder.getView(R$id.icon)) != null) {
                    skeletonLayout4.mo54393a();
                }
                if (baseViewHolder != null && (skeletonLayout3 = (SkeletonLayout) baseViewHolder.getView(R$id.f25375v1)) != null) {
                    skeletonLayout3.mo54393a();
                }
                if (baseViewHolder != null && (skeletonLayout2 = (SkeletonLayout) baseViewHolder.getView(R$id.f25376v2)) != null) {
                    skeletonLayout2.mo54393a();
                }
                if (baseViewHolder == null || (skeletonLayout = (SkeletonLayout) baseViewHolder.getView(R$id.f25377v3)) == null) {
                    return;
                }
                skeletonLayout.mo54393a();
            }
        };
        baseQuickAdapter.setNewData(CollectionsKt.toList(new IntRange(0, 4)));
        recyclerView.setAdapter(baseQuickAdapter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m29444H(HomeShimmerLayout homeShimmerLayout) {
        C37545t c37545tM84560c = C37545t.m84560c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true);
        c37545tM84560c.f83415c.mo54393a();
        View icon = c37545tM84560c.f83414b;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(icon, Float.valueOf(21.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m29445J(HomeShimmerLayout homeShimmerLayout, List list) {
        if (ViewExtKt.m66581l(homeShimmerLayout)) {
            return Unit.INSTANCE;
        }
        homeShimmerLayout.f25820d = true;
        ViewExtKt.m66594y(homeShimmerLayout);
        homeShimmerLayout.m29473n(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m29446L(HomeShimmerLayout homeShimmerLayout) {
        C37547u c37547uM84566c = C37547u.m84566c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true);
        View v11 = c37547uM84566c.f83421b;
        Intrinsics.checkNotNullExpressionValue(v11, "v1");
        InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(v11, null, 1, null);
        if (interfaceC36986bM54399d != null) {
            interfaceC36986bM54399d.mo54393a();
        }
        View v12 = c37547uM84566c.f83422c;
        Intrinsics.checkNotNullExpressionValue(v12, "v2");
        InterfaceC36986b interfaceC36986bM54399d2 = C22911a.m54399d(v12, null, 1, null);
        if (interfaceC36986bM54399d2 != null) {
            interfaceC36986bM54399d2.mo54393a();
        }
        View v13 = c37547uM84566c.f83423d;
        Intrinsics.checkNotNullExpressionValue(v13, "v3");
        InterfaceC36986b interfaceC36986bM54399d3 = C22911a.m54399d(v13, null, 1, null);
        if (interfaceC36986bM54399d3 != null) {
            interfaceC36986bM54399d3.mo54393a();
        }
        View v14 = c37547uM84566c.f83424e;
        Intrinsics.checkNotNullExpressionValue(v14, "v4");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(v14, Float.valueOf(21.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        View v15 = c37547uM84566c.f83425f;
        Intrinsics.checkNotNullExpressionValue(v15, "v5");
        InterfaceC36986b interfaceC36986bM54399d4 = C22911a.m54399d(v15, null, 1, null);
        if (interfaceC36986bM54399d4 != null) {
            interfaceC36986bM54399d4.mo54393a();
        }
        View v16 = c37547uM84566c.f83426g;
        Intrinsics.checkNotNullExpressionValue(v16, "v6");
        InterfaceC36986b interfaceC36986bM54399d5 = C22911a.m54399d(v16, null, 1, null);
        if (interfaceC36986bM54399d5 != null) {
            interfaceC36986bM54399d5.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m29462r(HomeShimmerLayout homeShimmerLayout) {
        C37541r c37541rM84550c = C37541r.m84550c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true);
        View icon = c37541rM84550c.f83399b;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(icon, Float.valueOf(21.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        c37541rM84550c.f83400c.mo54393a();
        c37541rM84550c.f83401d.mo54393a();
        c37541rM84550c.f83402e.mo54393a();
        c37541rM84550c.f83403f.mo54393a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m29464v(HomeShimmerLayout homeShimmerLayout) {
        C37533n c37533nM84530c = C37533n.m84530c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true);
        LinearLayoutCompat layout1 = c37533nM84530c.f83373b;
        Intrinsics.checkNotNullExpressionValue(layout1, "layout1");
        InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(layout1, null, 1, null);
        if (interfaceC36986bM54399d != null) {
            interfaceC36986bM54399d.mo54393a();
        }
        LinearLayoutCompat layout2 = c37533nM84530c.f83374c;
        Intrinsics.checkNotNullExpressionValue(layout2, "layout2");
        InterfaceC36986b interfaceC36986bM54399d2 = C22911a.m54399d(layout2, null, 1, null);
        if (interfaceC36986bM54399d2 != null) {
            interfaceC36986bM54399d2.mo54393a();
        }
        LinearLayoutCompat layout3 = c37533nM84530c.f83375d;
        Intrinsics.checkNotNullExpressionValue(layout3, "layout3");
        InterfaceC36986b interfaceC36986bM54399d3 = C22911a.m54399d(layout3, null, 1, null);
        if (interfaceC36986bM54399d3 != null) {
            interfaceC36986bM54399d3.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final LayoutInflater m29465w(Context context) {
        return LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m29466z(HomeShimmerLayout homeShimmerLayout) {
        RecyclerView recyclerView = C37535o.m84535c(homeShimmerLayout.getInflater(), homeShimmerLayout.f25818b, true).f83381b;
        final int i11 = R$layout.home_item_shimmer_menu;
        BaseQuickAdapter<Integer, BaseViewHolder> baseQuickAdapter = new BaseQuickAdapter<Integer, BaseViewHolder>(i11) { // from class: com.kubi.home.main.shimmer.HomeShimmerLayout$menu$1$1$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder baseViewHolder, Integer num) {
                SkeletonLayout skeletonLayout;
                SkeletonLayout skeletonLayout2;
                if (baseViewHolder != null && (skeletonLayout2 = (SkeletonLayout) baseViewHolder.getView(R$id.icon)) != null) {
                    skeletonLayout2.mo54393a();
                }
                if (baseViewHolder == null || (skeletonLayout = (SkeletonLayout) baseViewHolder.getView(R$id.title)) == null) {
                    return;
                }
                skeletonLayout.mo54393a();
            }
        };
        baseQuickAdapter.setNewData(CollectionsKt.toList(new IntRange(0, 9)));
        recyclerView.setAdapter(baseQuickAdapter);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerLayout(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context, attributeSet, i11);
        this.f25818b = linearLayoutCompat;
        this.f25819c = LazyKt.lazy(new Function0() { // from class: jj.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerLayout.m29465w(context);
            }
        });
        linearLayoutCompat.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = EdgeToEdgeCompat.f48106a.m58272j() + C27040e.m66658b(44);
        addView(linearLayoutCompat, layoutParams);
        setClickable(true);
        setBackgroundColor(ContextCompat.getColor(context, R$color.c_background));
        ViewExtKt.m66577h(this);
    }

    @VisibleForTesting
    public static /* synthetic */ void getContainer$HomeLib_googleRelease$annotations() {
    }
}
