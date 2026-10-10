package com.kubi.assets.overview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$mipmap;
import com.kubi.assets.R$string;
import com.kubi.assets.dialog.payment.C9835j;
import com.kubi.assets.entity.NewGuideBannerEntity;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.host.HostManager;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.C4781a0;
import p419l2.C42032f;
import p569qq.C43852m;
import p628t1.InterfaceC44616h;
import p637ta.C44889w3;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: NewGuideChildFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/overview/NewGuideChildFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2NewguideBinding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2NewguideBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bannerList", "", "Lcom/kubi/assets/entity/NewGuideBannerEntity;", "isDeposit", "", "()Z", "isDeposit$delegate", "Lkotlin/Lazy;", "getLayout", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewGuideChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewGuideChildFragment.kt\ncom/kubi/assets/overview/NewGuideChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,166:1\n147#2,16:167\n*S KotlinDebug\n*F\n+ 1 NewGuideChildFragment.kt\ncom/kubi/assets/overview/NewGuideChildFragment\n*L\n33#1:167,16\n*E\n"})
public final class NewGuideChildFragment extends BaseFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final String f18205Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final String f18206a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final String f18207b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final String f18208c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final String f18209d0;

    /* JADX INFO: renamed from: V */
    public List<NewGuideBannerEntity> f18211V;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f18204Y = {Reflection.property1(new PropertyReference1Impl(NewGuideChildFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2NewguideBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f18203X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18210U = C45681e.m100799e(this, new Function1<NewGuideChildFragment, C44889w3>() { // from class: com.kubi.assets.overview.NewGuideChildFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44889w3 invoke(@NotNull NewGuideChildFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44889w3.m99302a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44889w3, Unit>() { // from class: com.kubi.assets.overview.NewGuideChildFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44889w3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44889w3 c44889w3) {
            invoke(c44889w3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18212W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.s0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(NewGuideChildFragment.m18333v3(this.f18549b));
        }
    });

    /* JADX INFO: compiled from: NewGuideChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/assets/overview/NewGuideChildFragment$Companion;", "", "<init>", "()V", "TYPE_DEPOSIT", "", "TYPE_BUY", "PAGE_TYPE", "", "DEPOSIT_GUIDE1", "getDEPOSIT_GUIDE1", "()Ljava/lang/String;", "DEPOSIT_GUIDE2", "getDEPOSIT_GUIDE2", "BUY_GUIDE1", "getBUY_GUIDE1", "BUY_GUIDE2", "getBUY_GUIDE2", "BUY_GUIDE3", "getBUY_GUIDE3", "newInstance", "Lcom/kubi/assets/overview/NewGuideChildFragment;", "type", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final NewGuideChildFragment newInstance(int type) {
            NewGuideChildFragment newGuideChildFragment = new NewGuideChildFragment();
            newGuideChildFragment.setArguments(new C27051h().m66720d("page_type", type).m66717a());
            return newGuideChildFragment;
        }

        @NotNull
        public final String getBUY_GUIDE1() {
            return NewGuideChildFragment.f18207b0;
        }

        @NotNull
        public final String getBUY_GUIDE2() {
            return NewGuideChildFragment.f18208c0;
        }

        @NotNull
        public final String getBUY_GUIDE3() {
            return NewGuideChildFragment.f18209d0;
        }

        @NotNull
        public final String getDEPOSIT_GUIDE1() {
            return NewGuideChildFragment.f18205Z;
        }

        @NotNull
        public final String getDEPOSIT_GUIDE2() {
            return NewGuideChildFragment.f18206a0;
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        HostManager hostManager = HostManager.a;
        sb2.append(hostManager.c());
        sb2.append("/ucenter/crypto/deposit-guide-1.png");
        f18205Z = sb2.toString();
        f18206a0 = hostManager.c() + "/ucenter/crypto/deposit-guide-2.png";
        f18207b0 = hostManager.c() + "/ucenter/crypto/buy-crypto-guide-1.png";
        f18208c0 = hostManager.c() + "/ucenter/crypto/buy-crypto-guide-2.png";
        f18209d0 = hostManager.c() + "/ucenter/crypto/buy-crypto-guide-3.png";
    }

    private final int getLayout() {
        return R$layout.fragment_assetv2_newguide;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m18335x3(NewGuideChildFragment newGuideChildFragment) {
        C43852m.m96591c("B1overview", "guidence", "2", null, 8, null);
        AssetsHelper.f18684a.m19177z(C43852m.m96601m("B1overview", "guidence", "2"));
        if (newGuideChildFragment.getParentFragment() instanceof NewGuideDialogFragment) {
            Fragment parentFragment = newGuideChildFragment.getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.assets.overview.NewGuideDialogFragment");
            ((NewGuideDialogFragment) parentFragment).dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m18337z3(BGABanner bGABanner, BGABanner bGABanner2, View itemView, NewGuideBannerEntity newGuideBannerEntity, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (newGuideBannerEntity != null) {
            ImageView imageView = (ImageView) itemView.findViewById(R$id.iv_banner);
            if (C24277v.m58537b(bGABanner.getContext())) {
                C46338a.m102151a(bGABanner.getContext()).mo6634v(newGuideBannerEntity.getResourceUrl()).mo6606a(C42032f.m92235s0(new C4781a0(C27029c.m66601d(bGABanner, 4))).mo92188b0(R$mipmap.guide_banner_place_holder).mo92217q0(new InterfaceC44616h[0])).m6594E0(imageView);
            }
            ((TextView) itemView.findViewById(R$id.tv_title)).setText(newGuideBannerEntity.getTitle());
            ((TextView) itemView.findViewById(R$id.tv_content)).setText(newGuideBannerEntity.getContent());
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        final BGABanner bGABanner;
        KcSecondaryButton kcSecondaryButton;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m18339u3()) {
            C44889w3 c44889w3M18338t3 = m18338t3();
            if (c44889w3M18338t3 != null && (kcPrimaryButton5 = c44889w3M18338t3.f101059c) != null) {
                kcPrimaryButton5.setText(getString(R$string.deposit_coin));
            }
            C44889w3 c44889w3M18338t4 = m18338t3();
            if (c44889w3M18338t4 != null && (kcPrimaryButton4 = c44889w3M18338t4.f101059c) != null) {
                C27046k.m66711z(kcPrimaryButton4, 0L, new Function0() { // from class: com.kubi.assets.overview.t0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewGuideChildFragment.m18334w3(this.f18551b);
                    }
                }, 1, null);
            }
            String string = getString(R$string.asset_guide_tips_deposit_net);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getString(R$string.asset_guide_tips_deposit_coin);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            NewGuideBannerEntity newGuideBannerEntity = new NewGuideBannerEntity(string, string2, f18205Z);
            String string3 = getString(R$string.asset_guide_tips_other_platform);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(R$string.asset_guide_tips_copy_qr);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            this.f18211V = CollectionsKt.mutableListOf(newGuideBannerEntity, new NewGuideBannerEntity(string3, string4, f18206a0));
        } else {
            C44889w3 c44889w3M18338t5 = m18338t3();
            if (c44889w3M18338t5 != null && (kcPrimaryButton3 = c44889w3M18338t5.f101059c) != null) {
                AssetExKt.m15138z(kcPrimaryButton3, C24129b.m58030b(SiteVisibleConfigKey.FastTrade));
            }
            C44889w3 c44889w3M18338t6 = m18338t3();
            if (c44889w3M18338t6 != null && (kcPrimaryButton2 = c44889w3M18338t6.f101059c) != null) {
                kcPrimaryButton2.setText(getString(R$string.order_buy));
            }
            C44889w3 c44889w3M18338t7 = m18338t3();
            if (c44889w3M18338t7 != null && (kcPrimaryButton = c44889w3M18338t7.f101059c) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.overview.u0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NewGuideChildFragment.m18335x3(this.f18553b);
                    }
                }, 1, null);
            }
            String string5 = getString(R$string.asset_guide_tips_complete_kyc);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = getString(R$string.asset_guide_tips_to_fast_trade);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            NewGuideBannerEntity newGuideBannerEntity2 = new NewGuideBannerEntity(string5, string6, f18207b0);
            String string7 = getString(R$string.assets_confirm_buy_currency);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            String string8 = getString(R$string.asset_guide_tips_fiat_ways);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            NewGuideBannerEntity newGuideBannerEntity3 = new NewGuideBannerEntity(string7, string8, f18208c0);
            String string9 = getString(R$string.asset_guide_tips_other_way);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            String string10 = getString(R$string.asset_guide_tips_other_way_c2c);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            this.f18211V = CollectionsKt.mutableListOf(newGuideBannerEntity2, newGuideBannerEntity3, new NewGuideBannerEntity(string9, string10, f18209d0));
        }
        C44889w3 c44889w3M18338t8 = m18338t3();
        if (c44889w3M18338t8 != null && (kcSecondaryButton = c44889w3M18338t8.f101060d) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.overview.v0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewGuideChildFragment.m18336y3(this.f18555b);
                }
            }, 1, null);
        }
        C44889w3 c44889w3M18338t9 = m18338t3();
        if (c44889w3M18338t9 == null || (bGABanner = c44889w3M18338t9.f101058b) == null) {
            return;
        }
        bGABanner.setAutoPlayInterval(3000);
        List<NewGuideBannerEntity> list = this.f18211V;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerList");
            list = null;
        }
        bGABanner.setAutoPlayAble(list.size() != 1);
        int i11 = R$layout.kucoin_item_asset_banner;
        List<NewGuideBannerEntity> list2 = this.f18211V;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerList");
            list2 = null;
        }
        bGABanner.setData(i11, list2, (List<String>) null);
        bGABanner.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.assets.overview.w0
            @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
            /* JADX INFO: renamed from: a */
            public final void mo17775a(BGABanner bGABanner2, View view2, Object obj, int i12) {
                NewGuideChildFragment.m18337z3(bGABanner, bGABanner2, view2, (NewGuideBannerEntity) obj, i12);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final C44889w3 m18338t3() {
        return (C44889w3) this.f18210U.getValue(this, f18204Y[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final boolean m18339u3() {
        return ((Boolean) this.f18212W.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v3 */
    public static final boolean m18333v3(NewGuideChildFragment newGuideChildFragment) {
        Bundle arguments = newGuideChildFragment.getArguments();
        if (arguments == null || arguments.getInt("page_type") != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m18334w3(NewGuideChildFragment newGuideChildFragment) {
        C43852m.m96590b("B1overview", "guidence", "1", TuplesKt.m90091to("isABNew", Boolean.valueOf(C9835j.m16374a())));
        AssetsHelper.m19137F(AssetsHelper.f18684a, C43852m.m96601m("B1overview", "guidence", "1"), 0, false, 6, null);
        if (newGuideChildFragment.getParentFragment() instanceof NewGuideDialogFragment) {
            Fragment parentFragment = newGuideChildFragment.getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.assets.overview.NewGuideDialogFragment");
            ((NewGuideDialogFragment) parentFragment).dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m18336y3(NewGuideChildFragment newGuideChildFragment) {
        if (newGuideChildFragment.getParentFragment() instanceof NewGuideDialogFragment) {
            Fragment parentFragment = newGuideChildFragment.getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.assets.overview.NewGuideDialogFragment");
            ((NewGuideDialogFragment) parentFragment).dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        C44889w3 c44889w3M18338t3;
        BGABanner bGABanner;
        super.onHide();
        if (getView() != null && (c44889w3M18338t3 = m18338t3()) != null && (bGABanner = c44889w3M18338t3.f101058b) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        C44889w3 c44889w3M18338t3;
        BGABanner bGABanner;
        super.onShow();
        if (getView() != null && (c44889w3M18338t3 = m18338t3()) != null && (bGABanner = c44889w3M18338t3.f101058b) != null) {
            bGABanner.startAutoPlay();
        }
    }
}
