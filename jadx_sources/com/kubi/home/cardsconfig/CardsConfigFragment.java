package com.kubi.home.cardsconfig;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.futures.dialog.twap.OrderPriceType;
import com.kubi.home.R$color;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.home.common.p086ex.ViewExKt;
import com.kubi.kucoin.home.cards.CardInterceptor;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.IExposureCallback;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import com.kubi.mvi.common.MviExKt;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37514d0;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CardsConfigFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 E2\u00020\u0001:\tEFGHIJKLMB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0+H\u0002J\b\u0010,\u001a\u00020\u001fH\u0014J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020.H\u0002J\b\u00104\u001a\u00020.H\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020.H\u0002J \u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>H\u0002J(\u0010?\u001a\u00020.2\u0006\u0010:\u001a\u00020@2\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020>H\u0002J\b\u0010B\u001a\u00020\u000bH\u0016J\u0010\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020\u0014H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010$\u001a\u00060%R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006N"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "kucoinFragmentCardsSettingBinding", "Lcom/kubi/home/databinding/KucoinFragmentCardsSettingBinding;", "getKucoinFragmentCardsSettingBinding", "()Lcom/kubi/home/databinding/KucoinFragmentCardsSettingBinding;", "kucoinFragmentCardsSettingBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "cardSaved", "", "config", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "getConfig", "()Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;", "setConfig", "(Lcom/kubi/kucoin/home/cardsconfig/CardListRsp;)V", "cardsItems", "", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "getCardsItems", "()Ljava/util/List;", "setCardsItems", "(Ljava/util/List;)V", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "firstFixed", "", "lastFixed", "firstAdded", "lastAdded", "firstCandidate", "cardsAdapter", "Lcom/kubi/home/cardsconfig/CardsConfigFragment$CardConfigAdapter;", "getCardsAdapter", "()Lcom/kubi/home/cardsconfig/CardsConfigFragment$CardConfigAdapter;", "cardsAdapter$delegate", "Lkotlin/Lazy;", "updateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateHeaderVisibility", "updateItemNum", "insertHeader", "initDragBehavior", "Landroidx/recyclerview/widget/ItemTouchHelper;", "updateBorderPosition", "reportExposure", C33954u6.f72238i, "Lio/chad/library/adapter/base/BaseViewHolder;", "item", ViewProps.POSITION, "", "reportChange", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "clickPosition", "onBackPressed", "checkRemoteData", "card", "Companion", CredentialProviderBaseController.TYPE_TAG, "FixedCardViewHolder", "AddedCardViewHolder", "CandidateCardViewHolder", "FixedHeaderViewHolder", "CandidateHeaderViewHolder", "CardConfigAdapter", "CardItemCallback", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardsConfigFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsConfigFragment.kt\ncom/kubi/home/cardsconfig/CardsConfigFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,581:1\n147#2,16:582\n774#3:598\n865#3,2:599\n388#3,7:603\n360#3,7:610\n388#3,7:617\n360#3,7:624\n360#3,7:631\n1#4:601\n189#5:602\n*S KotlinDebug\n*F\n+ 1 CardsConfigFragment.kt\ncom/kubi/home/cardsconfig/CardsConfigFragment\n*L\n61#1:582,16\n84#1:598\n84#1:599,2\n220#1:603,7\n341#1:610,7\n342#1:617,7\n344#1:624,7\n345#1:631,7\n146#1:602\n*E\n"})
public final class CardsConfigFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f25543U = C45681e.m100799e(this, new Function1<CardsConfigFragment, C37514d0>() { // from class: com.kubi.home.cardsconfig.CardsConfigFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37514d0 invoke(@NotNull CardsConfigFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37514d0.m84487a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37514d0, Unit>() { // from class: com.kubi.home.cardsconfig.CardsConfigFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37514d0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37514d0 c37514d0) {
            invoke(c37514d0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public boolean f25544V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public CardListRsp f25545W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public List<CardListRsp.Card> f25546X;

    /* JADX INFO: renamed from: Y */
    public boolean f25547Y;

    /* JADX INFO: renamed from: Z */
    public int f25548Z;

    /* JADX INFO: renamed from: a0 */
    public int f25549a0;

    /* JADX INFO: renamed from: b0 */
    public int f25550b0;

    /* JADX INFO: renamed from: c0 */
    public int f25551c0;

    /* JADX INFO: renamed from: d0 */
    public int f25552d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f25553e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f25542g0 = {Reflection.property1(new PropertyReference1Impl(CardsConfigFragment.class, "kucoinFragmentCardsSettingBinding", "getKucoinFragmentCardsSettingBinding()Lcom/kubi/home/databinding/KucoinFragmentCardsSettingBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f25541f0 = new Companion(null);

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$AddedCardViewHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;Landroid/view/ViewGroup;)V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class AddedCardViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CardsConfigFragment f25554g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddedCardViewHolder(@NotNull CardsConfigFragment cardsConfigFragment, ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_layout_cards_setting_item, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f25554g = cardsConfigFragment;
        }
    }

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$CandidateCardViewHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;Landroid/view/ViewGroup;)V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class CandidateCardViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CardsConfigFragment f25555g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CandidateCardViewHolder(@NotNull CardsConfigFragment cardsConfigFragment, ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_layout_cards_setting_item_candidate, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f25555g = cardsConfigFragment;
        }
    }

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$CandidateHeaderViewHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;Landroid/view/ViewGroup;)V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class CandidateHeaderViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CardsConfigFragment f25556g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CandidateHeaderViewHolder(@NotNull CardsConfigFragment cardsConfigFragment, ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_layout_cards_setting_candidate_header, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f25556g = cardsConfigFragment;
        }
    }

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "BLOCK_ID", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$FixedCardViewHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;Landroid/view/ViewGroup;)V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class FixedCardViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CardsConfigFragment f25557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedCardViewHolder(@NotNull CardsConfigFragment cardsConfigFragment, ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_layout_cards_setting_item_fixed, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f25557g = cardsConfigFragment;
        }
    }

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$FixedHeaderViewHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", "parent", "Landroid/view/ViewGroup;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;Landroid/view/ViewGroup;)V", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class FixedHeaderViewHolder extends BaseViewHolder {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CardsConfigFragment f25558g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedHeaderViewHolder(@NotNull CardsConfigFragment cardsConfigFragment, ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(R$layout.kucoin_layout_cards_setting_fixed_header, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f25558g = cardsConfigFragment;
        }
    }

    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$TYPE;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED_HEADER", OrderPriceType.TYPE_FIXED, "ADDED", "CANDIDATE_HEADER", "CANDIDATE", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum TYPE {
        FIXED_HEADER,
        FIXED,
        ADDED,
        CANDIDATE_HEADER,
        CANDIDATE;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f25560c = EnumEntriesKt.enumEntries(m29029a());

        @NotNull
        public static EnumEntries<TYPE> getEntries() {
            return f25560c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$a */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$CardConfigAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemViewType", ViewProps.POSITION, "onBindViewHolder", "", C33954u6.f72238i, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C14508a extends ListAdapter<CardListRsp.Card, BaseViewHolder> {
        public C14508a() {
            super(CardsConfigFragment.this.new C14509b());
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m29034k(ImageView imageView, boolean z11) {
            if (!z11) {
                imageView.setImageResource(R$mipmap.home_icon_placeholder);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull final BaseViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            final CardListRsp.Card item = getItem(holder.getAdapterPosition());
            if (holder instanceof AddedCardViewHolder) {
                C46338a.m102151a(holder.itemView.getContext()).mo6634v(item.getSchematicUrl());
                holder.setText(R$id.card_order, String.valueOf(position));
                holder.setText(R$id.card_name, item.getName());
                ImageView imageView = (ImageView) holder.getView(R$id.card_remove);
                if (imageView != null) {
                    final CardsConfigFragment cardsConfigFragment = CardsConfigFragment.this;
                    C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.home.cardsconfig.b
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CardsConfigFragment.C14508a.m29033j(cardsConfigFragment, holder, item, this);
                        }
                    }, 1, null);
                }
                CardsConfigFragment cardsConfigFragment2 = CardsConfigFragment.this;
                Intrinsics.checkNotNull(item);
                cardsConfigFragment2.m29022G3(holder, item, "added");
                return;
            }
            if (holder instanceof FixedCardViewHolder) {
                holder.setText(R$id.card_order, String.valueOf(position));
                holder.setText(R$id.card_name, item.getName());
                return;
            }
            if (!(holder instanceof CandidateCardViewHolder)) {
                if (holder instanceof CandidateHeaderViewHolder) {
                    if (((CandidateHeaderViewHolder) holder).getAdapterPosition() == CollectionsKt.getLastIndex(CardsConfigFragment.this.m29016A3())) {
                        holder.itemView.setAlpha(0.0f);
                        return;
                    } else {
                        holder.itemView.setAlpha(1.0f);
                        return;
                    }
                }
                return;
            }
            holder.setText(R$id.card_name, item.getName());
            final ImageView imageView2 = (ImageView) holder.getView(R$id.card_bg);
            if (imageView2 != null) {
                ViewExKt.loadImage(imageView2, item.getSchematicUrl(), new Function1() { // from class: com.kubi.home.cardsconfig.c
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CardsConfigFragment.C14508a.m29034k(imageView2, ((Boolean) obj).booleanValue());
                    }
                });
            }
            View view = holder.getView(R$id.card_add);
            if (view != null) {
                final CardsConfigFragment cardsConfigFragment3 = CardsConfigFragment.this;
                C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.home.cardsconfig.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CardsConfigFragment.C14508a.m29035l(cardsConfigFragment3, holder, item, this);
                    }
                }, 1, null);
            }
            CardsConfigFragment cardsConfigFragment4 = CardsConfigFragment.this;
            Intrinsics.checkNotNull(item);
            cardsConfigFragment4.m29022G3(holder, item, "not_added");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public BaseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (viewType == TYPE.FIXED_HEADER.ordinal()) {
                return new FixedHeaderViewHolder(CardsConfigFragment.this, parent);
            }
            if (viewType == TYPE.CANDIDATE_HEADER.ordinal()) {
                return new CandidateHeaderViewHolder(CardsConfigFragment.this, parent);
            }
            if (viewType == TYPE.FIXED.ordinal()) {
                return new FixedCardViewHolder(CardsConfigFragment.this, parent);
            }
            return viewType == TYPE.CANDIDATE.ordinal() ? new CandidateCardViewHolder(CardsConfigFragment.this, parent) : new AddedCardViewHolder(CardsConfigFragment.this, parent);
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m29033j(CardsConfigFragment cardsConfigFragment, BaseViewHolder baseViewHolder, CardListRsp.Card card, C14508a c14508a) throws JSONException {
            List<CardListRsp.Card> listM29016A3 = cardsConfigFragment.m29016A3();
            int size = cardsConfigFragment.m29016A3().size();
            AddedCardViewHolder addedCardViewHolder = (AddedCardViewHolder) baseViewHolder;
            int adapterPosition = addedCardViewHolder.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < size) {
                Intrinsics.checkNotNull(card);
                cardsConfigFragment.m29021F3(baseViewHolder, card, "added", "remove");
                CardListRsp.Card cardRemove = listM29016A3.remove(addedCardViewHolder.getAdapterPosition());
                c14508a.notifyItemRemoved(addedCardViewHolder.getAdapterPosition());
                cardRemove.setUserVisible(0);
                listM29016A3.add(cardRemove);
                c14508a.notifyItemInserted(listM29016A3.size());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: l */
        public static final Unit m29035l(CardsConfigFragment cardsConfigFragment, BaseViewHolder baseViewHolder, CardListRsp.Card card, C14508a c14508a) throws JSONException {
            List<CardListRsp.Card> listM29016A3 = cardsConfigFragment.m29016A3();
            int size = cardsConfigFragment.m29016A3().size();
            CandidateCardViewHolder candidateCardViewHolder = (CandidateCardViewHolder) baseViewHolder;
            int adapterPosition = candidateCardViewHolder.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < size) {
                Intrinsics.checkNotNull(card);
                cardsConfigFragment.m29021F3(baseViewHolder, card, "not_added", "add");
                CardListRsp.Card cardRemove = listM29016A3.remove(candidateCardViewHolder.getAdapterPosition());
                c14508a.notifyItemRemoved(candidateCardViewHolder.getAdapterPosition());
                int i11 = cardsConfigFragment.f25551c0 + 1;
                cardRemove.setUserVisible(1);
                listM29016A3.add(i11, cardRemove);
                c14508a.notifyItemInserted(i11);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            CardListRsp.Card item = getItem(position);
            if (Intrinsics.areEqual(item.getCode(), "FIXED_HEADER")) {
                return TYPE.FIXED_HEADER.ordinal();
            }
            if (Intrinsics.areEqual(item.getCode(), "CANDIDATE_HEADER")) {
                return TYPE.CANDIDATE_HEADER.ordinal();
            }
            if (item.isFixed()) {
                return TYPE.FIXED.ordinal();
            }
            if (item.getUserVisible() == 0) {
                return TYPE.CANDIDATE.ordinal();
            }
            if (item.getUserVisible() == 1) {
                return TYPE.ADDED.ordinal();
            }
            if (item.isDefaultHidden()) {
                return TYPE.CANDIDATE.ordinal();
            }
            return TYPE.ADDED.ordinal();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$b */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/cardsconfig/CardsConfigFragment$CardItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/kubi/kucoin/home/cardsconfig/CardListRsp$Card;", "<init>", "(Lcom/kubi/home/cardsconfig/CardsConfigFragment;)V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C14509b extends DiffUtil.ItemCallback<CardListRsp.Card> {
        public C14509b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull CardListRsp.Card oldItem, @NotNull CardListRsp.Card newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.toString(), newItem.toString());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull CardListRsp.Card oldItem, @NotNull CardListRsp.Card newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getCode(), newItem.getCode());
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$c */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J@\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"com/kubi/home/cardsconfig/CardsConfigFragment$initDragBehavior$1", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "EXTRA_DRAG", "", "movePosition", "", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onSelectedChanged", "", "actionState", "clearView", "onMove", "", "target", "canDropOver", "current", "onChildDraw", "c", "Landroid/graphics/Canvas;", "dX", "dY", "isCurrentlyActive", "onSwiped", "direction", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14510c extends ItemTouchHelper.Callback {

        /* JADX INFO: renamed from: b */
        public final float f25563b;

        /* JADX INFO: renamed from: c */
        public int f25564c = -1;

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) throws JSONException {
            View view;
            ViewPropertyAnimator viewPropertyAnimatorAnimate;
            ViewPropertyAnimator viewPropertyAnimatorScaleX;
            ViewPropertyAnimator viewPropertyAnimatorScaleY;
            ViewPropertyAnimator viewPropertyAnimatorTranslationZ;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator interpolator;
            if (actionState == 2) {
                this.f25564c = viewHolder != null ? viewHolder.getAdapterPosition() : -1;
                if (viewHolder != null && (view = viewHolder.itemView) != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(1.05f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(1.05f)) != null && (viewPropertyAnimatorTranslationZ = viewPropertyAnimatorScaleY.translationZ(8.0f)) != null && (duration = viewPropertyAnimatorTranslationZ.setDuration(120L)) != null && (interpolator = duration.setInterpolator(new OvershootInterpolator())) != null) {
                    interpolator.start();
                }
                if (viewHolder != null) {
                    CardsConfigFragment cardsConfigFragment = CardsConfigFragment.this;
                    if (viewHolder instanceof AddedCardViewHolder) {
                        cardsConfigFragment.m29021F3(viewHolder, cardsConfigFragment.m29016A3().get(((AddedCardViewHolder) viewHolder).getAdapterPosition()), "added", "move");
                    } else if (viewHolder instanceof CandidateCardViewHolder) {
                        cardsConfigFragment.m29021F3(viewHolder, cardsConfigFragment.m29016A3().get(((CandidateCardViewHolder) viewHolder).getAdapterPosition()), "not_added", "move");
                    }
                }
            }
        }

        public C14510c() {
            this.f25563b = C27029c.m66603f(CardsConfigFragment.this, 5);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder current, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(target, "target");
            return target instanceof AddedCardViewHolder;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            this.f25564c = -1;
            viewHolder.itemView.setElevation(0.0f);
            viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f).translationZ(0.0f).setDuration(120L).start();
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            if (viewHolder instanceof AddedCardViewHolder) {
                return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
            }
            return 0;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0037  */
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(Canvas c11, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
            float f11;
            float f12;
            Intrinsics.checkNotNullParameter(c11, "c");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            if (actionState != 2) {
                f11 = dY;
            } else if (this.f25564c == CardsConfigFragment.this.f25550b0) {
                float f13 = this.f25563b;
                if (dY < (-f13)) {
                    f12 = -f13;
                } else {
                    if (this.f25564c == CardsConfigFragment.this.f25551c0) {
                        f12 = this.f25563b;
                        if (dY > f12) {
                        }
                    }
                    f11 = dY;
                }
                f11 = f12;
            } else {
                if (this.f25564c == CardsConfigFragment.this.f25551c0) {
                    f12 = this.f25563b;
                    if (dY > f12) {
                        f11 = f12;
                    }
                }
                f11 = dY;
            }
            super.onChildDraw(c11, recyclerView, viewHolder, dX, f11, actionState, isCurrentlyActive);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            this.f25564c = target.getAdapterPosition();
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            if (adapterPosition >= adapterPosition2) {
                int i11 = adapterPosition2 + 1;
                if (i11 <= adapterPosition) {
                    int i12 = adapterPosition;
                    while (true) {
                        Collections.swap(CardsConfigFragment.this.m29016A3(), i12, i12 - 1);
                        if (i12 == i11) {
                            break;
                        }
                        i12--;
                    }
                }
            } else {
                int i13 = adapterPosition;
                while (i13 < adapterPosition2) {
                    int i14 = i13 + 1;
                    Collections.swap(CardsConfigFragment.this.m29016A3(), i13, i14);
                    i13 = i14;
                }
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return true;
            }
            adapter.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$d */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/cardsconfig/CardsConfigFragment$onViewCreated$3$2", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14512d extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ RecyclerView f25567e;

        public C14512d(RecyclerView recyclerView) {
            this.f25567e = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            RecyclerView.ViewHolder childViewHolder = parent.getChildViewHolder(view);
            CardsConfigFragment cardsConfigFragment = CardsConfigFragment.this;
            RecyclerView recyclerView = this.f25567e;
            if (!(childViewHolder instanceof FixedCardViewHolder) && !(childViewHolder instanceof AddedCardViewHolder)) {
                if (childViewHolder instanceof CandidateHeaderViewHolder) {
                    outRect.bottom = C27029c.m66601d(recyclerView, 32);
                }
            } else if (((BaseViewHolder) childViewHolder).getAdapterPosition() == cardsConfigFragment.f25549a0) {
                outRect.bottom = C27029c.m66601d(recyclerView, 10);
            } else {
                outRect.bottom = C27029c.m66601d(recyclerView, 1);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$e */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/cardsconfig/CardsConfigFragment$reportExposure$1", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14513e implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseViewHolder f25568a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CardsConfigFragment f25569b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CardListRsp.Card f25570c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f25571d;

        public C14513e(BaseViewHolder baseViewHolder, CardsConfigFragment cardsConfigFragment, CardListRsp.Card card, String str) {
            this.f25568a = baseViewHolder;
            this.f25569b = cardsConfigFragment;
            this.f25570c = card;
            this.f25571d = str;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() throws JSONException {
            int i11;
            int adapterPosition;
            int i12;
            BaseViewHolder baseViewHolder = this.f25568a;
            if (baseViewHolder instanceof FixedCardViewHolder) {
                adapterPosition = ((FixedCardViewHolder) baseViewHolder).getAdapterPosition();
                i12 = this.f25569b.f25548Z;
            } else {
                if (!(baseViewHolder instanceof AddedCardViewHolder)) {
                    if (baseViewHolder instanceof CandidateCardViewHolder) {
                        adapterPosition = ((CandidateCardViewHolder) baseViewHolder).getAdapterPosition();
                        i12 = this.f25569b.f25552d0;
                    } else {
                        i11 = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    CardListRsp.Card card = this.f25570c;
                    String str = this.f25571d;
                    jSONObject.put("groupId", card.getCode());
                    jSONObject.put(ViewProps.POSITION, str);
                    jSONObject.put("sortPosition", i11);
                    jSONObject.put("labelId", HomeCardsRepository.f25606a.m29072i().getUserPortrait());
                    Unit unit = Unit.INSTANCE;
                    C43852m.m96593e("B1homepageEdit", "blockGroupEdited", "1", jSONObject);
                }
                adapterPosition = ((AddedCardViewHolder) baseViewHolder).getAdapterPosition();
                i12 = this.f25569b.f25550b0;
            }
            i11 = adapterPosition - i12;
            JSONObject jSONObject2 = new JSONObject();
            CardListRsp.Card card2 = this.f25570c;
            String str2 = this.f25571d;
            jSONObject2.put("groupId", card2.getCode());
            jSONObject2.put(ViewProps.POSITION, str2);
            jSONObject2.put("sortPosition", i11);
            jSONObject2.put("labelId", HomeCardsRepository.f25606a.m29072i().getUserPortrait());
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96593e("B1homepageEdit", "blockGroupEdited", "1", jSONObject2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$onBackPressed$1 */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$onBackPressed$1", m90122f = "CardsConfigFragment.kt", m90123i = {}, m90124l = {539}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCardsConfigFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsConfigFragment.kt\ncom/kubi/home/cardsconfig/CardsConfigFragment$onBackPressed$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,581:1\n774#2:582\n865#2,2:583\n*S KotlinDebug\n*F\n+ 1 CardsConfigFragment.kt\ncom/kubi/home/cardsconfig/CardsConfigFragment$onBackPressed$1\n*L\n532#1:582\n532#1:583,2\n*E\n"})
    public static final class C145141 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$onBackPressed$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: CardsConfigFragment.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$onBackPressed$1$2", m90122f = "CardsConfigFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CardsConfigFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(CardsConfigFragment cardsConfigFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cardsConfigFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f25544V = true;
                    this.this$0.preformBackPressed();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C145141(Continuation<? super C145141> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardsConfigFragment.this.new C145141(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C145141) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CardListRsp f25545w = CardsConfigFragment.this.getF25545W();
                List<CardListRsp.Card> currentList = CardsConfigFragment.this.m29028z3().getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : currentList) {
                    CardListRsp.Card card = (CardListRsp.Card) obj2;
                    if (!Intrinsics.areEqual(card.getCode(), "FIXED_HEADER") && !Intrinsics.areEqual(card.getCode(), "CANDIDATE_HEADER")) {
                        arrayList.add(obj2);
                    }
                }
                f25545w.setCardList(arrayList);
                HomeCardsRepository homeCardsRepository = HomeCardsRepository.f25606a;
                HomeCardsRepository.m29066t(homeCardsRepository, CardsConfigFragment.this.getF25545W(), false, 2, null);
                homeCardsRepository.m29067c();
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CardsConfigFragment.this, null);
                this.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final C14508a m29015x3(CardsConfigFragment cardsConfigFragment) {
        return cardsConfigFragment.new C14508a();
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public final List<CardListRsp.Card> m29016A3() {
        return this.f25546X;
    }

    @NotNull
    /* JADX INFO: renamed from: B3, reason: from getter */
    public final CardListRsp getF25545W() {
        return this.f25545W;
    }

    /* JADX INFO: renamed from: C3 */
    public final C37514d0 m29018C3() {
        return (C37514d0) this.f25543U.getValue(this, f25542g0[0]);
    }

    /* JADX INFO: renamed from: D3 */
    public final ItemTouchHelper m29019D3() {
        return new ItemTouchHelper(new C14510c());
    }

    /* JADX INFO: renamed from: E3 */
    public final List<CardListRsp.Card> m29020E3() {
        int iNextIndex;
        List<CardListRsp.Card> list = this.f25546X;
        list.add(0, new CardListRsp.Card("FIXED_HEADER", null, false, false, true, null, null, 0, 0, 0, 1006, null));
        ListIterator<CardListRsp.Card> listIterator = list.listIterator(list.size());
        while (true) {
            iNextIndex = -1;
            if (!listIterator.hasPrevious()) {
                break;
            }
            CardListRsp.Card cardPrevious = listIterator.previous();
            if (cardPrevious.isFixed() || cardPrevious.getUserVisible() == 1 || (cardPrevious.getUserVisible() == -1 && !cardPrevious.isDefaultHidden())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        list.add(iNextIndex + 1, new CardListRsp.Card("CANDIDATE_HEADER", null, false, true, false, null, null, 0, 0, 0, 1014, null));
        return this.f25546X;
    }

    /* JADX INFO: renamed from: F3 */
    public final void m29021F3(RecyclerView.ViewHolder viewHolder, CardListRsp.Card card, String str, String str2) throws JSONException {
        int i11;
        int adapterPosition;
        int i12;
        if (viewHolder instanceof FixedCardViewHolder) {
            adapterPosition = ((FixedCardViewHolder) viewHolder).getAdapterPosition();
            i12 = this.f25548Z;
        } else {
            if (!(viewHolder instanceof AddedCardViewHolder)) {
                if (viewHolder instanceof CandidateCardViewHolder) {
                    adapterPosition = ((CandidateCardViewHolder) viewHolder).getAdapterPosition();
                    i12 = this.f25552d0;
                } else {
                    i11 = 0;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("groupId", card.getCode());
                jSONObject.put(ViewProps.POSITION, str);
                jSONObject.put("sortPosition", i11);
                jSONObject.put("clickPosition", str2);
                jSONObject.put("labelId", HomeCardsRepository.f25606a.m29072i().getUserPortrait());
                Unit unit = Unit.INSTANCE;
                C43852m.m96589a("B1homepageEdit", "blockGroupEdited", "1", jSONObject);
            }
            adapterPosition = ((AddedCardViewHolder) viewHolder).getAdapterPosition();
            i12 = this.f25550b0;
        }
        i11 = adapterPosition - i12;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("groupId", card.getCode());
        jSONObject2.put(ViewProps.POSITION, str);
        jSONObject2.put("sortPosition", i11);
        jSONObject2.put("clickPosition", str2);
        jSONObject2.put("labelId", HomeCardsRepository.f25606a.m29072i().getUserPortrait());
        Unit unit2 = Unit.INSTANCE;
        C43852m.m96589a("B1homepageEdit", "blockGroupEdited", "1", jSONObject2);
    }

    /* JADX INFO: renamed from: G3 */
    public final void m29022G3(BaseViewHolder baseViewHolder, CardListRsp.Card card, String str) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ExtensionKt.m32178d(itemView, new C14513e(baseViewHolder, this, card, str), 0.0f, 0, 6, null);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m29023H3() {
        int i11;
        int iNextIndex;
        Iterator<CardListRsp.Card> it = this.f25546X.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getCode(), "FIXED_HEADER")) {
                break;
            } else {
                i13++;
            }
        }
        this.f25548Z = i13 + 1;
        List<CardListRsp.Card> list = this.f25546X;
        ListIterator<CardListRsp.Card> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (listIterator.previous().isFixed()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        this.f25549a0 = iNextIndex;
        this.f25550b0 = iNextIndex + 1;
        Iterator<CardListRsp.Card> it2 = this.f25546X.iterator();
        int i14 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i14 = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().getCode(), "CANDIDATE_HEADER")) {
                break;
            } else {
                i14++;
            }
        }
        this.f25551c0 = i14 - 1;
        Iterator<CardListRsp.Card> it3 = this.f25546X.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.areEqual(it3.next().getCode(), "CANDIDATE_HEADER")) {
                i11 = i12;
                break;
            }
            i12++;
        }
        this.f25552d0 = i11 + 1;
    }

    /* JADX INFO: renamed from: I3 */
    public final InterfaceC41634e<Boolean> m29024I3() {
        return C41636g.m90913f(new CardsConfigFragment$updateFlow$1(this, null));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_cards_setting;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF25547Y() {
        return this.f25547Y;
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        if (this.f25544V) {
            HomeCardsRepository.f25606a.m29082u();
            return super.onBackPressed();
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new C145141(null), 2, null);
        return true;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setStatusBarColor(getColorRes(R$color.c_background));
        }
        TitleBar titleBar = getTitleBar();
        titleBar.setBackgroundResource(R$color.c_background);
        titleBar.setTitle(getString(R$string.home_edit_title));
        C37514d0 c37514d0M29018C3 = m29018C3();
        if (c37514d0M29018C3 == null || (recyclerView = c37514d0M29018C3.f83234b) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C14508a c14508aM29028z3 = m29028z3();
        c14508aM29028z3.submitList(this.f25546X);
        C41636g.m90891O(C41636g.m90930n0(C41636g.m90896T(C41636g.m90937t(C41636g.m90896T(m29024I3(), new CardsConfigFragment$onViewCreated$3$1$1(this, null)), 200L), new CardsConfigFragment$onViewCreated$3$1$2(this, null)), new C14515xf13abfca(null, this)), LifecycleOwnerKt.getLifecycleScope(this));
        recyclerView.setAdapter(c14508aM29028z3);
        recyclerView.addItemDecoration(new C14512d(recyclerView));
        m29019D3().attachToRecyclerView(recyclerView);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f25547Y = z11;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m29027y3(CardListRsp.Card card) {
        MviExKt.m42519o(this, new CardsConfigFragment$checkRemoteData$1(card, null));
    }

    /* JADX INFO: renamed from: z3 */
    public final C14508a m29028z3() {
        return (C14508a) this.f25553e0.getValue();
    }

    public CardsConfigFragment() {
        CardInterceptor interceptor;
        CardListRsp cardListRspM29072i = HomeCardsRepository.f25606a.m29072i();
        this.f25545W = cardListRspM29072i;
        List<CardListRsp.Card> cardList = cardListRspM29072i.getCardList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cardList) {
            CardListRsp.Card card = (CardListRsp.Card) obj;
            if (card.getConfigVisible() == 2) {
                m29027y3(card);
            }
            boolean zMo29506c = true;
            if (card.getConfigVisible() != 1 && (card.getConfigVisible() != 2 || HomeCardsRepository.f25606a.m29073j(card.getCode()).length() <= 0)) {
                zMo29506c = false;
            } else {
                ClassMapping classMapping = HomeCardsRepository.f25606a.m29074k().m32209k().get(card.getType());
                if (classMapping != null && (interceptor = classMapping.getInterceptor()) != null) {
                    zMo29506c = interceptor.mo29506c();
                }
            }
            if (zMo29506c) {
                arrayList.add(obj);
            }
        }
        this.f25546X = CollectionsKt.toMutableList((Collection) arrayList);
        this.f25548Z = -1;
        this.f25549a0 = -1;
        this.f25550b0 = -1;
        this.f25551c0 = -1;
        this.f25552d0 = -1;
        setPageId("B1homepageEdit");
        m29020E3();
        m29023H3();
        this.f25553e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.cardsconfig.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardsConfigFragment.m29015x3(this.f25574b);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final void m29025J3() {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        C37514d0 c37514d0M29018C3;
        RecyclerView recyclerView2;
        RecyclerView.ViewHolder childViewHolder;
        C37514d0 c37514d0M29018C4 = m29018C3();
        if (c37514d0M29018C4 != null && (recyclerView = c37514d0M29018C4.f83234b) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int childCount = layoutManager.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View viewFindViewByPosition = layoutManager.findViewByPosition(i11);
                if (viewFindViewByPosition != null && (c37514d0M29018C3 = m29018C3()) != null && (recyclerView2 = c37514d0M29018C3.f83234b) != null && (childViewHolder = recyclerView2.getChildViewHolder(viewFindViewByPosition)) != null && (childViewHolder instanceof CandidateHeaderViewHolder)) {
                    if (((CandidateHeaderViewHolder) childViewHolder).getAdapterPosition() == CollectionsKt.getLastIndex(this.f25546X)) {
                        childViewHolder.itemView.animate().alpha(0.0f).setDuration(120L).start();
                    } else {
                        childViewHolder.itemView.animate().alpha(1.0f).setDuration(120L).start();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public final void m29026K3() {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.ViewHolder childViewHolder;
        RecyclerView recyclerView2;
        C37514d0 c37514d0M29018C3 = m29018C3();
        if (c37514d0M29018C3 != null && (recyclerView = c37514d0M29018C3.f83234b) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int size = this.f25546X.size();
            for (int i11 = 0; i11 < size; i11++) {
                View viewFindViewByPosition = layoutManager.findViewByPosition(i11);
                if (viewFindViewByPosition != null) {
                    C37514d0 c37514d0M29018C4 = m29018C3();
                    if (c37514d0M29018C4 != null && (recyclerView2 = c37514d0M29018C4.f83234b) != null) {
                        childViewHolder = recyclerView2.getChildViewHolder(viewFindViewByPosition);
                    } else {
                        childViewHolder = null;
                    }
                    Intrinsics.checkNotNull(childViewHolder, "null cannot be cast to non-null type io.chad.library.adapter.base.BaseViewHolder");
                    BaseViewHolder baseViewHolder = (BaseViewHolder) childViewHolder;
                    if ((baseViewHolder instanceof FixedCardViewHolder) || (baseViewHolder instanceof AddedCardViewHolder)) {
                        baseViewHolder.setText(R$id.card_order, String.valueOf(i11));
                    }
                }
            }
        }
    }
}
