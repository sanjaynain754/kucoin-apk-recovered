package com.kubi.home.v2.biz.empty;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$layout;
import com.kubi.kucoin.home.p090v2.cards.BaseCardV2;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37542r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/* JADX INFO: compiled from: EmptyCard.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/home/v2/biz/empty/EmptyCard;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardV2;", "<init>", "()V", "kucoinLayoutCardsNoDataBinding", "Lcom/kubi/home/databinding/KucoinLayoutCardsNoDataBinding;", "getKucoinLayoutCardsNoDataBinding", "()Lcom/kubi/home/databinding/KucoinLayoutCardsNoDataBinding;", "kucoinLayoutCardsNoDataBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmptyCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyCard.kt\ncom/kubi/home/v2/biz/empty/EmptyCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,42:1\n147#2,16:43\n*S KotlinDebug\n*F\n+ 1 EmptyCard.kt\ncom/kubi/home/v2/biz/empty/EmptyCard\n*L\n22#1:43,16\n*E\n"})
public class EmptyCard extends BaseCardV2 {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f26374W = {Reflection.property1(new PropertyReference1Impl(EmptyCard.class, "kucoinLayoutCardsNoDataBinding", "getKucoinLayoutCardsNoDataBinding()Lcom/kubi/home/databinding/KucoinLayoutCardsNoDataBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26375V = C45681e.m100799e(this, new Function1<EmptyCard, C37542r0>() { // from class: com.kubi.home.v2.biz.empty.EmptyCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37542r0 invoke(@NotNull EmptyCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37542r0.m84552a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37542r0, Unit>() { // from class: com.kubi.home.v2.biz.empty.EmptyCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37542r0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37542r0 c37542r0) {
            invoke(c37542r0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final Unit m30523i3() {
        C12572a.m23695d("com.kubi.home.event.HomeEvent:updateHomeCards", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.kucoin_layout_cards_no_data;
    }

    /* JADX INFO: renamed from: h3 */
    public final C37542r0 m30524h3() {
        return (C37542r0) this.f26375V.getValue(this, f26374W[0]);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        C37542r0 c37542r0M30524h3;
        LinearLayout root;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent != null ? parent.getParent() : null;
        ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup != null && (c37542r0M30524h3 = m30524h3()) != null && (root = c37542r0M30524h3.getRoot()) != null) {
            ViewExtKt.m66578i(root, viewGroup.getHeight());
        }
        C37542r0 c37542r0M30524h4 = m30524h3();
        if (c37542r0M30524h4 == null || (kcPrimaryButton = c37542r0M30524h4.f83405b) == null) {
            return;
        }
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.home.v2.biz.empty.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmptyCard.m30523i3();
            }
        }, 1, null);
    }
}
