package com.kubi.welfare;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.TextShareParam;
import com.kubi.utils.C27017c;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.welfare.WelfareInviteFragment;
import com.kubi.welfare.api.entity.InviteRecordItemEntity;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import com.kubi.welfare.api.entity.WelfareInfoEntity;
import com.kubi.welfare.view.WelfareHeaderView;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.Map;
import l80.InterfaceC42137a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.properties.Delegates;
import p852kotlin.properties.ObservableProperty;
import p852kotlin.properties.ReadWriteProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: WelfareInviteFragment.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\u001c\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0014J$\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001dH\u0014J\b\u0010)\u001a\u00020 H\u0016J\u001a\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020\u001dH\u0014J\b\u00101\u001a\u00020\u001dH\u0014J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020 H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00065"}, m90084d2 = {"Lcom/kubi/welfare/WelfareInviteFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;", "<init>", "()V", "mHeaderView", "Lcom/kubi/welfare/view/WelfareHeaderView;", "assetApi", "Lcom/kubi/welfare/api/remote/WelfareApi;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/welfare/api/remote/WelfareApi;", "assetApi$delegate", "Lkotlin/Lazy;", "invitation", "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "getInvitation", "()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;", "invitation$delegate", "<set-?>", "", "canDraw", "getCanDraw", "()Z", "setCanDraw", "(Z)V", "canDraw$delegate", "Lkotlin/properties/ReadWriteProperty;", "getLayout", "", "getItemLayout", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "refreshData", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initHeader", "getEmptyFooterText", "getEmptyFooterIcon", "doDraw", "onDrawSuccess", "getRemainNum", "WelfareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareInviteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareInviteFragment.kt\ncom/kubi/welfare/WelfareInviteFragment\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,182:1\n33#2,3:183\n*S KotlinDebug\n*F\n+ 1 WelfareInviteFragment.kt\ncom/kubi/welfare/WelfareInviteFragment\n*L\n57#1:183,3\n*E\n"})
public final class WelfareInviteFragment extends BasePagingFragment<InviteRecordItemEntity> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f54883d0 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WelfareInviteFragment.class, "canDraw", "getCanDraw()Z", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WelfareHeaderView f54884Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f54885a0 = LazyKt.lazy(new Function0() { // from class: k80.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareInviteFragment.m67030O3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f54886b0 = LazyKt.lazy(new Function0() { // from class: k80.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareInviteFragment.m67036Z3(this.f91037b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final ReadWriteProperty f54887c0;

    /* JADX INFO: renamed from: com.kubi.welfare.WelfareInviteFragment$a */
    /* JADX INFO: compiled from: Delegates.kt */
    /* JADX INFO: loaded from: classes58.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 WelfareInviteFragment.kt\ncom/kubi/welfare/WelfareInviteFragment\n*L\n1#1,73:1\n58#2,2:74\n*E\n"})
    public static final class C27120a extends ObservableProperty<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ WelfareInviteFragment f54888a;

        @Override // p852kotlin.properties.ObservableProperty
        public void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            boolean zBooleanValue = newValue.booleanValue();
            oldValue.getClass();
            View viewFindViewById = this.f54888a.findViewById(R$id.bottom);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(zBooleanValue ? 0 : 8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27120a(Object obj, WelfareInviteFragment welfareInviteFragment) {
            super(obj);
            this.f54888a = welfareInviteFragment;
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m67044a4() {
        m67045d4(false);
        hideDialogLoading();
        showToast(getString(R$string.withdrawal_all_success));
        mo15906F3();
    }

    /* JADX INFO: renamed from: S3 */
    private final InterfaceC42137a m67032S3() {
        return (InterfaceC42137a) this.f54885a0.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m67033W3(WelfareInviteFragment welfareInviteFragment, RemainAwardNumEntity remainAwardNumEntity) {
        Integer invitationAwardCount;
        if (remainAwardNumEntity == null || (invitationAwardCount = remainAwardNumEntity.getInvitationAwardCount()) == null || invitationAwardCount.intValue() != 0) {
            welfareInviteFragment.m67045d4(true);
            Button button = (Button) welfareInviteFragment.findViewById(R$id.btn_draw);
            if (button != null) {
                button.setText(C27017c.f54310a.m66516f(R$string.withdrawal_all_stub, remainAwardNumEntity != null ? remainAwardNumEntity.getInvitationAwardCount() : null));
                return;
            }
            return;
        }
        welfareInviteFragment.m67045d4(false);
        Button button2 = (Button) welfareInviteFragment.findViewById(R$id.btn_draw);
        if (button2 != null) {
            button2.setText(C27017c.f54310a.m66516f(R$string.withdrawal_all, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: X3 */
    private final void m67034X3() {
        if (this.f54884Z == null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            WelfareHeaderView welfareHeaderView = new WelfareHeaderView(mContext, 1);
            this.f54884Z = welfareHeaderView;
            this.f46495W.addHeaderView(welfareHeaderView);
        }
        if (m67042U3() == null) {
            addSubscription(m67032S3().m92471d().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: k80.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    WelfareInviteFragment.m67035Y3(this.f91042b, (WelfareInfoEntity) obj);
                }
            }, new C24223c1(this)));
            return;
        }
        WelfareHeaderView welfareHeaderView2 = this.f54884Z;
        if (welfareHeaderView2 != null) {
            welfareHeaderView2.setData(m67042U3());
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m67035Y3(WelfareInviteFragment welfareInviteFragment, WelfareInfoEntity welfareInfoEntity) {
        Map<String, WelfareInfoEntity.WelfareDetailEntity> incomeResponse;
        WelfareInfoEntity.WelfareDetailEntity welfareDetailEntity = (welfareInfoEntity == null || (incomeResponse = welfareInfoEntity.getIncomeResponse()) == null) ? null : incomeResponse.get("INVITATION_REWARD");
        WelfareHeaderView welfareHeaderView = welfareInviteFragment.f54884Z;
        if (welfareHeaderView != null) {
            welfareHeaderView.setData(welfareDetailEntity);
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m67038c4(WelfareInviteFragment welfareInviteFragment) {
        IShareService.Companion companion = IShareService.f49268a;
        IShareService iShareService = companion.get();
        TextShareParam textShareParam = new TextShareParam("KCS_b_share", null, null, null, 14, null);
        textShareParam.setContent(welfareInviteFragment.getString(R$string.share_content_tips));
        textShareParam.setLinkUrl(companion.get().mo38d("KCS_b_share"));
        IShareService.m59640c(iShareService, textShareParam, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable InviteRecordItemEntity inviteRecordItemEntity) {
        Integer status;
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(inviteRecordItemEntity != null ? inviteRecordItemEntity.getCurrency() : null));
        if (inviteRecordItemEntity != null && (status = inviteRecordItemEntity.getStatus()) != null) {
            DrawStatus drawStatusValueOfInt = DrawStatus.INSTANCE.valueOfInt(status.intValue());
            if (drawStatusValueOfInt != null) {
                if (baseViewHolder != null) {
                    baseViewHolder.setText(R$id.tv_status, getString(drawStatusValueOfInt.getStr()));
                }
                if (baseViewHolder != null) {
                    baseViewHolder.setTextColor(R$id.tv_status, getColorRes(drawStatusValueOfInt.getColor()));
                }
            }
        }
        if (baseViewHolder != null) {
            int i11 = R$id.tv_coin_name;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null));
            sb2.append('(');
            sb2.append(C27041f.m66668h(inviteRecordItemEntity != null ? inviteRecordItemEntity.getReason() : null));
            sb2.append(')');
            baseViewHolder.setText(i11, sb2.toString());
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_amount_1, String.valueOf(C27039d.m66650j(inviteRecordItemEntity != null ? inviteRecordItemEntity.getCount() : null)));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_amount_2, C37885i.m85571j(C27039d.m66647g(inviteRecordItemEntity != null ? inviteRecordItemEntity.getAmount() : null), C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, false, false, false, false, null, 126, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_price_2, C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(inviteRecordItemEntity != null ? inviteRecordItemEntity.getAmount() : null), coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null), null, null, 0, false, false, false, false, 127, null));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tv_amount_3, TimeUtils.m66422i(C27039d.m66652l(inviteRecordItemEntity != null ? inviteRecordItemEntity.getRewardDate() : null)));
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final boolean m67041T3() {
        return ((Boolean) this.f54887c0.getValue(this, f54883d0[0])).booleanValue();
    }

    /* JADX INFO: renamed from: U3 */
    public final WelfareInfoEntity.WelfareDetailEntity m67042U3() {
        return (WelfareInfoEntity.WelfareDetailEntity) this.f54886b0.getValue();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m67045d4(boolean z11) {
        this.f54887c0.setValue(this, f54883d0[0], Boolean.valueOf(z11));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_invite_record;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: s3 */
    public int mo56581s3() {
        return R$drawable.ic2_common_empty;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return R$string.no_award;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_invite_record;
    }

    public WelfareInviteFragment() {
        Delegates delegates = Delegates.INSTANCE;
        this.f54887c0 = new C27120a(Boolean.FALSE, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final InterfaceC42137a m67030O3() {
        return (InterfaceC42137a) C42597a.m93386b().create(InterfaceC42137a.class);
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m67031R3(WelfareInviteFragment welfareInviteFragment, Object obj) {
        welfareInviteFragment.m67044a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public static final WelfareInfoEntity.WelfareDetailEntity m67036Z3(WelfareInviteFragment welfareInviteFragment) {
        Bundle arguments = welfareInviteFragment.getArguments();
        if (arguments != null) {
            return (WelfareInfoEntity.WelfareDetailEntity) RouteExKt.m56231V(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m67037b4(WelfareInviteFragment welfareInviteFragment) {
        welfareInviteFragment.m67040Q3();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        super.mo15906F3();
        m67034X3();
        m67043V3();
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m67040Q3() {
        if (!m67041T3()) {
            return;
        }
        showDialogLoading();
        addSubscription(m67032S3().m92474g().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: k80.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelfareInviteFragment.m67031R3(this.f91041b, obj);
            }
        }, new C24223c1(this)));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m67043V3() {
        addSubscription(m67032S3().m92468a().compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: k80.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WelfareInviteFragment.m67033W3(this.f91040b, (RemainAwardNumEntity) obj);
            }
        }, new C24223c1(this)));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) findViewById(R$id.m_swipe_recycler_view);
        if (swipeRefreshRecyclerView != null && (recyclerView = swipeRefreshRecyclerView.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        Button button = (Button) findViewById(R$id.btn_draw);
        if (button != null) {
            C27046k.m66711z(button, 0L, new Function0() { // from class: k80.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareInviteFragment.m67037b4(this.f91038b);
                }
            }, 1, null);
        }
        m67043V3();
        getTitleBar().setTitle(getString(R$string.invite_bonus));
        ImageView rightOneIcon = getTitleBar().getRightOneIcon();
        rightOneIcon.setImageResource(R$drawable.kucoin_icon_share_mirrored);
        C27046k.m66711z(rightOneIcon, 0L, new Function0() { // from class: k80.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareInviteFragment.m67038c4(this.f91039b);
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<InviteRecordItemEntity>> mo16440r3(int i11, int i12) {
        Observable observableCompose = m67032S3().m92472e(i11, i12).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
