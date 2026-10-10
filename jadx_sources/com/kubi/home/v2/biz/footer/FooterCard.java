package com.kubi.home.v2.biz.footer;

import android.os.Bundle;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.v2.card.C15000n;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37536o0;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
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

/* JADX INFO: compiled from: FooterCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/home/v2/biz/footer/FooterCard;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "footerBinding", "Lcom/kubi/home/databinding/KucoinLayoutCardsFooterBinding;", "getFooterBinding", "()Lcom/kubi/home/databinding/KucoinLayoutCardsFooterBinding;", "footerBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onEnterDragMode", "onExitDragMode", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFooterCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FooterCard.kt\ncom/kubi/home/v2/biz/footer/FooterCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,60:1\n147#2,16:61\n*S KotlinDebug\n*F\n+ 1 FooterCard.kt\ncom/kubi/home/v2/biz/footer/FooterCard\n*L\n28#1:61,16\n*E\n"})
public class FooterCard extends BaseCardV2 {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f26376W = {Reflection.property1(new PropertyReference1Impl(FooterCard.class, "footerBinding", "getFooterBinding()Lcom/kubi/home/databinding/KucoinLayoutCardsFooterBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26377V = C45681e.m100799e(this, new Function1<FooterCard, C37536o0>() { // from class: com.kubi.home.v2.biz.footer.FooterCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37536o0 invoke(@NotNull FooterCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37536o0.m84537a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37536o0, Unit>() { // from class: com.kubi.home.v2.biz.footer.FooterCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37536o0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37536o0 c37536o0) {
            invoke(c37536o0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final Unit m30526i3() throws JSONException {
        C12572a.m23695d("com.kubi.home.v2.card.CardsViewModelV2_EVENT_ADD_WIDGET", null, 0L, 6, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "addWidget", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.kucoin_layout_cards_footer;
    }

    /* JADX INFO: renamed from: h3 */
    public final C37536o0 m30527h3() {
        return (C37536o0) this.f26377V.getValue(this, f26376W[0]);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        CardView root;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37536o0 c37536o0M30527h3 = m30527h3();
        if (c37536o0M30527h3 == null || (root = c37536o0M30527h3.getRoot()) == null) {
            return;
        }
        C27046k.m66711z(root, 0L, new Function0() { // from class: com.kubi.home.v2.biz.footer.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FooterCard.m30526i3();
            }
        }, 1, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: k0 */
    public void mo30080k0() {
        super.mo30080k0();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FooterCard$onExitDragMode$1(this, null), 3, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: r0 */
    public void mo30082r0() {
        super.mo30082r0();
        C15000n.m30816f(this, false);
    }
}
