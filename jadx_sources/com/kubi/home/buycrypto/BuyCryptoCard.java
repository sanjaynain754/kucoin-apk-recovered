package com.kubi.home.buycrypto;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.group.GroupCardData;
import com.kubi.otc.entity.OtcAd;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import fj.C37511c;
import fj.C37513d;
import fj.C37515e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BuyCryptoCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u000e\u001a\u00020\u0014H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/buycrypto/BuyCryptoCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "binding", "Lcom/kubi/home/databinding/HomeCardBuyCryptoBinding;", "getBinding", "()Lcom/kubi/home/databinding/HomeCardBuyCryptoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "isLargeCard", "", "childrenInGroup", "", "Lcom/kubi/kucoin/home/cards/group/GroupCardData;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyCryptoCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyCryptoCard.kt\ncom/kubi/home/buycrypto/BuyCryptoCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n147#2,16:123\n295#3,2:139\n1869#3,2:141\n1869#3,2:143\n*S KotlinDebug\n*F\n+ 1 BuyCryptoCard.kt\ncom/kubi/home/buycrypto/BuyCryptoCard\n*L\n28#1:123,16\n93#1:139,2\n96#1:141,2\n112#1:143,2\n*E\n"})
public final class BuyCryptoCard extends BaseCard {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f25536W = {Reflection.property1(new PropertyReference1Impl(BuyCryptoCard.class, "binding", "getBinding()Lcom/kubi/home/databinding/HomeCardBuyCryptoBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f25537V = C45681e.m100799e(this, new Function1<BuyCryptoCard, C37511c>() { // from class: com.kubi.home.buycrypto.BuyCryptoCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37511c invoke(@NotNull BuyCryptoCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37511c.m84480a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37511c, Unit>() { // from class: com.kubi.home.buycrypto.BuyCryptoCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37511c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37511c c37511c) {
            invoke(c37511c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: g3 */
    public static final Unit m28994g3(BuyCryptoCardData.Data data, FrameLayout frameLayout) throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postId", frameLayout.getId());
        jSONObject.put("postTitle", data.getTitle());
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        Integer order = data.getOrder();
        jSONObject.put("sortPosition", order != null ? order.toString() : null);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "recommendPosition", "1", jSONObject);
        String link = data.getLink();
        if (link != null) {
            C4400a c4400aM56184f = Router.f46192a.m56184f(link);
            Integer order2 = data.getOrder();
            if (order2 == null || (string = order2.toString()) == null) {
                string = OtcAd.KYC_NOT_PASS;
            }
            c4400aM56184f.m4038a("spm", C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "recommendPosition", string)).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j3 */
    private final boolean m28995j3() {
        BaseCardData baseCardData;
        boolean z11;
        boolean z12;
        Object next;
        List<BaseCardData> listM29075l = HomeCardsRepository.f25606a.m29075l();
        if (listM29075l != null) {
            Iterator<T> it = listM29075l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((BaseCardData) next).getCode(), "threeGrip"));
            baseCardData = (BaseCardData) next;
        } else {
            baseCardData = null;
        }
        GroupCardData groupCardData = baseCardData instanceof GroupCardData ? (GroupCardData) baseCardData : null;
        if (groupCardData != null) {
            z11 = false;
            z12 = false;
            for (BaseCardData baseCardData2 : m28996h3(groupCardData)) {
                if (Intrinsics.areEqual(baseCardData2.getType(), "BANNER")) {
                    z11 = true;
                }
                if (Intrinsics.areEqual(baseCardData2.getType(), "GEM_BOX")) {
                    z12 = true;
                }
            }
        } else {
            z11 = false;
            z12 = false;
        }
        return (z11 && z12) ? false : true;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        final BuyCryptoCardData.Data data2;
        C37511c c37511cM28997i3;
        final FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(data, "data");
        BuyCryptoCardData buyCryptoCardData = data instanceof BuyCryptoCardData ? (BuyCryptoCardData) data : null;
        if (buyCryptoCardData == null || (data2 = buyCryptoCardData.getData()) == null || (c37511cM28997i3 = m28997i3()) == null || (frameLayout = c37511cM28997i3.f83226b) == null) {
            return;
        }
        frameLayout.removeAllViews();
        if (m28995j3()) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            frameLayout.setLayoutParams(layoutParams);
            C37513d c37513dM84485c = C37513d.m84485c(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(c37513dM84485c, "inflate(...)");
            frameLayout.addView(c37513dM84485c.getRoot(), new FrameLayout.LayoutParams(-1, -1));
            c37513dM84485c.f83232c.setText(data2.getTitle());
            c37513dM84485c.f83231b.setText(data2.getSummary());
        } else {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
            } else {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            }
            frameLayout.setLayoutParams(layoutParams2);
            C37515e c37515eM84490c = C37515e.m84490c(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(c37515eM84490c, "inflate(...)");
            frameLayout.addView(c37515eM84490c.getRoot(), new FrameLayout.LayoutParams(-1, -2));
            c37515eM84490c.f83238d.setText(data2.getTitle());
            c37515eM84490c.f83237c.setText(data2.getSummary());
        }
        C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.home.buycrypto.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyCryptoCard.m28994g3(data2, frameLayout);
            }
        }, 1, null);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.home_card_buy_crypto;
    }

    /* JADX INFO: renamed from: h3 */
    public final List<BaseCardData> m28996h3(GroupCardData groupCardData) {
        ArrayList arrayList = new ArrayList();
        List<BaseCardData> children = groupCardData.getChildren();
        if (children != null) {
            for (BaseCardData baseCardData : children) {
                if (baseCardData instanceof GroupCardData) {
                    arrayList.addAll(m28996h3((GroupCardData) baseCardData));
                } else {
                    arrayList.add(baseCardData);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i3 */
    public final C37511c m28997i3() {
        return (C37511c) this.f25537V.getValue(this, f25536W[0]);
    }
}
