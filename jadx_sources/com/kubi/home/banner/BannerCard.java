package com.kubi.home.banner;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.card.MaterialCardView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.IExposureCallback;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.sdk.util.C24275u;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37528k0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p419l2.C42032f;
import p569qq.C43841b;
import p778xy.C46338a;
import p778xy.C46341d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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

/* JADX INFO: compiled from: BannerCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/home/banner/BannerCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinItemHomeBannerBinding", "Lcom/kubi/home/databinding/KucoinItemHomeBannerBinding;", "getKucoinItemHomeBannerBinding", "()Lcom/kubi/home/databinding/KucoinItemHomeBannerBinding;", "kucoinItemHomeBannerBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/home/banner/BannerViewModel;", "getViewModel", "()Lcom/kubi/home/banner/BannerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "setHomeAdsData", "dataList", "", "Lcom/kubi/home/banner/BannerData$Data;", "onMoveStart", "onMoveStop", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBannerCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerCard.kt\ncom/kubi/home/banner/BannerCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,126:1\n147#2,16:127\n1#3:143\n220#4,5:144\n*S KotlinDebug\n*F\n+ 1 BannerCard.kt\ncom/kubi/home/banner/BannerCard\n*L\n38#1:127,16\n45#1:144,5\n*E\n"})
public final class BannerCard extends BaseCard {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f25521X = {Reflection.property1(new PropertyReference1Impl(BannerCard.class, "kucoinItemHomeBannerBinding", "getKucoinItemHomeBannerBinding()Lcom/kubi/home/databinding/KucoinItemHomeBannerBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f25522V = C45681e.m100799e(this, new Function1<BannerCard, C37528k0>() { // from class: com.kubi.home.banner.BannerCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37528k0 invoke(@NotNull BannerCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37528k0.m84518a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37528k0, Unit>() { // from class: com.kubi.home.banner.BannerCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37528k0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37528k0 c37528k0) {
            invoke(c37528k0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f25523W = LazyKt.lazy(new Function0() { // from class: com.kubi.home.banner.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BannerCard.m28979n3(this.f25532b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.home.banner.BannerCard$a */
    /* JADX INFO: compiled from: BannerCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/banner/BannerCard$onViewCreated$1$1$2", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14498a implements IExposureCallback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f25525b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BannerData.Data f25526c;

        public C14498a(int i11, BannerData.Data data) {
            this.f25525b = i11;
            this.f25526c = data;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() throws JSONException {
            BannerViewModel bannerViewModelM28984j3 = BannerCard.this.m28984j3();
            int i11 = this.f25525b;
            BannerData.Data data = this.f25526c;
            bannerViewModelM28984j3.m28991d(i11, data != null ? data.getTitle() : null);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public static final void m28977k3(final BannerCard bannerCard, boolean z11, Drawable drawable, BGABanner bGABanner, ImageView itemView, final BannerData.Data data, final int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        FragmentActivity activity = bannerCard.getActivity();
        String imageUrl = null;
        if (!C27025c.m66567e(activity != null ? Boolean.valueOf(activity.isDestroyed()) : null, true)) {
            FragmentActivity activity2 = bannerCard.getActivity();
            if (!C27025c.m66567e(activity2 != null ? Boolean.valueOf(activity2.isFinishing()) : null, true)) {
                if (Intrinsics.areEqual(itemView.getTag(), data != null ? data.getImageUrl() : null)) {
                    return;
                }
                itemView.setTag(data != null ? data.getImageUrl() : null);
                Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSLESS : Bitmap.CompressFormat.WEBP;
                C46341d c46341dM102151a = C46338a.m102151a(itemView.getContext());
                Intrinsics.checkNotNullExpressionValue(c46341dM102151a, "with(...)");
                if (z11) {
                    if (data != null) {
                        imageUrl = data.getDaytime_image_url();
                    }
                } else if (data != null) {
                    imageUrl = data.getImageUrl();
                }
                C24275u.m58535a(c46341dM102151a, imageUrl).mo6606a(C42032f.m92239w0().mo92190c0(drawable).mo92210n(drawable).mo92206l(compressFormat)).m6594E0((ImageView) itemView.findViewById(R$id.iv_banner));
            }
        }
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.home.banner.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerCard.m28978l3(this.f25533b, i11, data);
            }
        }, 1, null);
        ExtensionKt.m32178d(itemView, bannerCard.new C14498a(i11, data), 0.0f, 0, 6, null);
    }

    /* JADX INFO: renamed from: n3 */
    public static final BannerViewModel m28979n3(BannerCard bannerCard) {
        return (BannerViewModel) new ViewModelProvider(bannerCard).get(BannerViewModel.class);
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        List<BannerData.Data> data2;
        Intrinsics.checkNotNullParameter(data, "data");
        BannerData bannerData = data instanceof BannerData ? (BannerData) data : null;
        if (bannerData == null || (data2 = bannerData.getData()) == null) {
            return;
        }
        m28985m3(data2);
        C43841b.m96557d("event_load_home_banner", "page_load_end", null, 4, null);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_item_home_banner;
    }

    /* JADX INFO: renamed from: i3 */
    public final C37528k0 m28983i3() {
        return (C37528k0) this.f25522V.getValue(this, f25521X[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: j3 */
    public final BannerViewModel m28984j3() {
        return (BannerViewModel) this.f25523W.getValue();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCard, com.kubi.kucoin.home.cards.BaseCardFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BGABanner bGABanner;
        C37528k0 c37528k0M28983i3;
        MaterialCardView materialCardView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final boolean zM33187l = DayNightThemeManager.f28592a.m33187l();
        final Drawable drawableM66510d = C27017c.m66510d(C27017c.f54310a, R$mipmap.home_banner_placeholder_small, null, 2, null);
        if (!zM33187l && (c37528k0M28983i3 = m28983i3()) != null && (materialCardView = c37528k0M28983i3.f83357b) != null) {
            materialCardView.setStrokeWidth(C27040e.m66658b(1));
        }
        C37528k0 c37528k0M28983i4 = m28983i3();
        if (c37528k0M28983i4 == null || (bGABanner = c37528k0M28983i4.f83358c) == null) {
            return;
        }
        bGABanner.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.home.banner.b
            @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
            /* JADX INFO: renamed from: a */
            public final void mo17775a(BGABanner bGABanner2, View view2, Object obj, int i11) {
                BannerCard.m28977k3(this.f25529a, zM33187l, drawableM66510d, bGABanner2, (ImageView) view2, (BannerData.Data) obj, i11);
            }
        });
        C22912t.m54422t(bGABanner, 14);
    }

    /* JADX INFO: renamed from: l3 */
    public static final Unit m28978l3(BannerCard bannerCard, int i11, BannerData.Data data) throws JSONException {
        String title;
        BannerViewModel bannerViewModelM28984j3 = bannerCard.m28984j3();
        String url = null;
        if (data != null) {
            title = data.getTitle();
        } else {
            title = null;
        }
        if (data != null) {
            url = data.getUrl();
        }
        bannerViewModelM28984j3.m28990b(i11, title, url);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        BGABanner bGABanner;
        super.mo28981P();
        C37528k0 c37528k0M28983i3 = m28983i3();
        if (c37528k0M28983i3 != null && (bGABanner = c37528k0M28983i3.f83358c) != null) {
            bGABanner.startAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        BGABanner bGABanner;
        super.mo28982Q();
        C37528k0 c37528k0M28983i3 = m28983i3();
        if (c37528k0M28983i3 != null && (bGABanner = c37528k0M28983i3.f83358c) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final void m28985m3(List<BannerData.Data> list) {
        BGABanner bGABanner;
        C37528k0 c37528k0M28983i3 = m28983i3();
        if (c37528k0M28983i3 != null && (bGABanner = c37528k0M28983i3.f83358c) != null) {
            if (list.isEmpty()) {
                bGABanner = null;
            }
            if (bGABanner != null) {
                boolean z11 = true;
                if (list.size() == 1) {
                    z11 = false;
                }
                bGABanner.setAutoPlayAble(z11);
                bGABanner.setData(R$layout.kucoin_item_home_banner_item, list, (List<String>) null);
            }
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        BGABanner bGABanner;
        super.onHide();
        C37528k0 c37528k0M28983i3 = m28983i3();
        if (c37528k0M28983i3 != null && (bGABanner = c37528k0M28983i3.f83358c) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        BGABanner bGABanner;
        super.onShow();
        C37528k0 c37528k0M28983i3 = m28983i3();
        if (c37528k0M28983i3 != null && (bGABanner = c37528k0M28983i3.f83358c) != null) {
            bGABanner.startAutoPlay();
        }
    }
}
