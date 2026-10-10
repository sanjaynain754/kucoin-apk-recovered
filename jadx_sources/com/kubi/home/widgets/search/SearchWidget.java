package com.kubi.home.widgets.search;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.api.ISearchService;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37512c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p10.C43353a;
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

/* JADX INFO: compiled from: SearchWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/home/widgets/search/SearchWidget;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "getLayout", "", "binding", "Lcom/kubi/home/databinding/HomeWidgetSearchBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/HomeWidgetSearchBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "currentSearchHint", "Lcom/kubi/search/api/entity/SearchHintEntity;", "refreshSearchGuideWord", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchWidget.kt\ncom/kubi/home/widgets/search/SearchWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,68:1\n147#2,16:69\n153#3,7:85\n*S KotlinDebug\n*F\n+ 1 SearchWidget.kt\ncom/kubi/home/widgets/search/SearchWidget\n*L\n33#1:69,16\n53#1:85,7\n*E\n"})
public final class SearchWidget extends BaseCardV2 {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f26792X = {Reflection.property1(new PropertyReference1Impl(SearchWidget.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/HomeWidgetSearchBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26793V = C45681e.m100799e(this, new Function1<SearchWidget, C37512c0>() { // from class: com.kubi.home.widgets.search.SearchWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37512c0 invoke(@NotNull SearchWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37512c0.m84482a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37512c0, Unit>() { // from class: com.kubi.home.widgets.search.SearchWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37512c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37512c0 c37512c0) {
            invoke(c37512c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @Nullable
    public SearchHintEntity f26794W;

    /* JADX INFO: renamed from: k3 */
    public static final Unit m31231k3(SearchWidget searchWidget) throws JSONException {
        SearchHintEntity searchHintEntity = searchWidget.f26794W;
        String value = searchHintEntity != null ? searchHintEntity.getValue() : null;
        if (value == null) {
            value = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentItem", value);
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        String type = searchHintEntity != null ? searchHintEntity.getType() : null;
        if (type == null) {
            type = "";
        }
        jSONObject.put("messageType", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1", jSONObject);
        C43841b.m96557d("event_click_home_search", "click_start_btn", null, 4, null);
        C43353a c43353a = C43353a.f95736a;
        String strM96601m = C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1");
        String type2 = searchHintEntity != null ? searchHintEntity.getType() : null;
        c43353a.m95474b(value, "HOME", strM96601m, type2 != null ? type2 : "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public final void m31232l3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.widgets.search.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchWidget.m31233m3(this.f26796b);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.home_widget_search;
    }

    @Nullable
    /* JADX INFO: renamed from: j3 */
    public final C37512c0 m31234j3() {
        return (C37512c0) this.f26793V.getValue(this, f26792X[0]);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        LinearLayoutCompat linearLayoutCompat;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37512c0 c37512c0M31234j3 = m31234j3();
        if (c37512c0M31234j3 != null && (linearLayoutCompat = c37512c0M31234j3.f83228b) != null) {
            C27046k.m66710y(linearLayoutCompat, 1000L, new Function0() { // from class: com.kubi.home.widgets.search.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchWidget.m31231k3(this.f26795b);
                }
            });
        }
        if (C12573b.f21598a.m23696a()) {
            "SearchEvent:UPDATE_HINT_WORD".length();
        }
        C12572a.m23692a(this, false, new SearchWidget$onViewCreated$$inlined$bindFlowEvent$default$1("SearchEvent:UPDATE_HINT_WORD", null, this));
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m31233m3(SearchWidget searchWidget) {
        C37512c0 c37512c0M31234j3 = searchWidget.m31234j3();
        if (c37512c0M31234j3 == null) {
            return Unit.INSTANCE;
        }
        SearchHintEntity searchHintEntityMo59108a = ISearchService.f48774a.get().mo59108a();
        if (searchHintEntityMo59108a != null) {
            c37512c0M31234j3.f83229c.setText(searchHintEntityMo59108a.getValue());
        } else {
            searchHintEntityMo59108a = null;
        }
        searchWidget.f26794W = searchHintEntityMo59108a;
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        m31232l3();
    }
}
