package com.kubi.home.search;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.api.ISearchService;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import fj.C37519g;
import g00.InterfaceC37760l;
import k00.C40848l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43841b;
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

/* JADX INFO: compiled from: SearchCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002R#\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/search/SearchCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "getLayout", "", "binding", "Lcom/kubi/home/databinding/HomeCardSearchBinding;", "getBinding$annotations", "getBinding", "()Lcom/kubi/home/databinding/HomeCardSearchBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "currentSearchHint", "Lcom/kubi/search/api/entity/SearchHintEntity;", "refreshSearchGuideWord", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCard.kt\ncom/kubi/home/search/SearchCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,76:1\n147#2,16:77\n153#3,7:93\n*S KotlinDebug\n*F\n+ 1 SearchCard.kt\ncom/kubi/home/search/SearchCard\n*L\n38#1:77,16\n61#1:93,7\n*E\n"})
public final class SearchCard extends BaseCard {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f26193X = {Reflection.property1(new PropertyReference1Impl(SearchCard.class, "binding", "getBinding()Lcom/kubi/home/databinding/HomeCardSearchBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26194V = C45681e.m100799e(this, new Function1<SearchCard, C37519g>() { // from class: com.kubi.home.search.SearchCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37519g invoke(@NotNull SearchCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37519g.m84498a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37519g, Unit>() { // from class: com.kubi.home.search.SearchCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37519g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37519g c37519g) {
            invoke(c37519g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @Nullable
    public SearchHintEntity f26195W;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final Unit m30216l3() {
        C12572a.m23695d("com.kubi.home.event.HomeEvent:openQrCodeScan", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k3 */
    public static final Unit m30215k3(SearchCard searchCard) throws JSONException {
        SearchHintEntity searchHintEntity = searchCard.f26195W;
        String value = searchHintEntity != null ? searchHintEntity.getValue() : null;
        String str = value == null ? "" : value;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentItem", str);
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        String type = searchHintEntity != null ? searchHintEntity.getType() : null;
        if (type == null) {
            type = "";
        }
        jSONObject.put("messageType", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1", jSONObject);
        C43841b.m96557d("event_click_home_search", "click_start_btn", null, 4, null);
        C37304a c37304a = C37304a.f82764a;
        String strM96601m = C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1");
        String type2 = searchHintEntity != null ? searchHintEntity.getType() : null;
        InterfaceC37760l.a.m85175a(c37304a, "HOME", str, type2 == null ? "" : type2, null, strM96601m, null, null, 104, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public final void m30217m3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.search.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchCard.m30218n3(this.f26196b);
            }
        });
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.home_card_search;
    }

    @Nullable
    /* JADX INFO: renamed from: j3 */
    public final C37519g m30219j3() {
        return (C37519g) this.f26194V.getValue(this, f26193X[0]);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        C40848l c40848l;
        ImageView imageView;
        C40848l c40848l2;
        LinearLayoutCompat linearLayoutCompat;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37519g c37519gM30219j3 = m30219j3();
        if (c37519gM30219j3 != null && (c40848l2 = c37519gM30219j3.f83297b) != null && (linearLayoutCompat = c40848l2.f90782c) != null) {
            C27046k.m66710y(linearLayoutCompat, 1000L, new Function0() { // from class: com.kubi.home.search.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchCard.m30215k3(this.f26197b);
                }
            });
        }
        C37519g c37519gM30219j4 = m30219j3();
        if (c37519gM30219j4 != null && (c40848l = c37519gM30219j4.f83297b) != null && (imageView = c40848l.f90781b) != null) {
            C27046k.m66710y(imageView, 1000L, new Function0() { // from class: com.kubi.home.search.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchCard.m30216l3();
                }
            });
        }
        if (C12573b.f21598a.m23696a()) {
            "SearchEvent:UPDATE_HINT_WORD".length();
        }
        C12572a.m23692a(this, false, new SearchCard$onViewCreated$$inlined$bindFlowEvent$default$1("SearchEvent:UPDATE_HINT_WORD", null, this));
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m30218n3(SearchCard searchCard) {
        C37519g c37519gM30219j3 = searchCard.m30219j3();
        if (c37519gM30219j3 == null) {
            return Unit.INSTANCE;
        }
        SearchHintEntity searchHintEntityMo59108a = ISearchService.f48774a.get().mo59108a();
        if (searchHintEntityMo59108a != null) {
            c37519gM30219j3.f83297b.f90783d.setText(searchHintEntityMo59108a.getValue());
        } else {
            searchHintEntityMo59108a = null;
        }
        searchCard.f26195W = searchHintEntityMo59108a;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        super.onShow();
        m30217m3();
    }
}
