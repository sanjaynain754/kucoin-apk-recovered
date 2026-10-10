package com.kubi.core.spot.business;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.core.spot.business.NFTDialog;
import com.kubi.core.spot.entity.NFTEntity;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$mipmap;
import com.kubi.tradecorebiz.R$style;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p310he.NFTItem;
import p419l2.C42032f;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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
import v30.C45402q;
import w00.C45681e;

/* JADX INFO: compiled from: NFTDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/core/spot/business/NFTDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/DialogNftBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/DialogNftBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "nft", "Lcom/kubi/core/spot/entity/NFTEntity;", "getNft", "()Lcom/kubi/core/spot/entity/NFTEntity;", "nft$delegate", "Lkotlin/Lazy;", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNFTDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NFTDialog.kt\ncom/kubi/core/spot/business/NFTDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n143#2,20:126\n1563#3:146\n1634#3,3:147\n1#4:150\n*S KotlinDebug\n*F\n+ 1 NFTDialog.kt\ncom/kubi/core/spot/business/NFTDialog\n*L\n39#1:126,20\n109#1:146\n109#1:147,3\n*E\n"})
public final class NFTDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f21004Z = C45681e.m100799e(this, new Function1<NFTDialog, C45402q>() { // from class: com.kubi.core.spot.business.NFTDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45402q invoke(@NotNull NFTDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45402q.m100341a(fragment.requireView());
        }
    }, new Function1<C45402q, Unit>() { // from class: com.kubi.core.spot.business.NFTDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C45402q it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45402q c45402q) {
            invoke(c45402q);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f21005a0 = LazyKt.lazy(new Function0() { // from class: he.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NFTDialog.m22843B3(this.f85877b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f21003c0 = {Reflection.property1(new PropertyReference1Impl(NFTDialog.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/DialogNftBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f21002b0 = new Companion(null);

    /* JADX INFO: compiled from: NFTDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/spot/business/NFTDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/spot/business/NFTDialog;", "nft", "Lcom/kubi/core/spot/entity/NFTEntity;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nNFTDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NFTDialog.kt\ncom/kubi/core/spot/business/NFTDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final NFTDialog newInstance(@Nullable NFTEntity nft) {
            NFTDialog nFTDialog = new NFTDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("nft", nft);
            nFTDialog.setArguments(bundle);
            return nFTDialog;
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m22844C3(NFTDialog nFTDialog, Drawable drawable, BGABanner bGABanner, FrameLayout itemView, final NFTItem nFTItem, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        FragmentActivity activity = nFTDialog.getActivity();
        if (C27025c.m66567e(activity != null ? Boolean.valueOf(activity.isDestroyed()) : null, true)) {
            return;
        }
        FragmentActivity activity2 = nFTDialog.getActivity();
        if (C27025c.m66567e(activity2 != null ? Boolean.valueOf(activity2.isFinishing()) : null, true)) {
            return;
        }
        ImageView imageView = (ImageView) itemView.findViewById(R$id.iv_banner);
        TextView textView = (TextView) itemView.findViewById(R$id.tv_banner);
        if (!C27025c.m66566d(nFTItem != null ? Boolean.valueOf(nFTItem.getIsMediaJump()) : null)) {
            itemView.setBackgroundColor(C27017c.f54310a.m66512a(R$color.c_transparent));
            Intrinsics.checkNotNull(imageView);
            ViewExtKt.m66594y(imageView);
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66577h(textView);
            C46338a.m102151a(itemView.getContext()).mo6634v(C27041f.m66668h(nFTItem != null ? nFTItem.getUrl() : null)).mo6606a(C42032f.m92239w0().mo92190c0(drawable).mo92210n(drawable)).m6594E0(imageView);
            return;
        }
        itemView.setBackgroundColor(C27017c.f54310a.m66512a(R$color.c_icon));
        Intrinsics.checkNotNull(imageView);
        ViewExtKt.m66577h(imageView);
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66594y(textView);
        textView.setText(C27041f.m66668h(nFTItem != null ? nFTItem.getMedeaJumpText() : null));
        C27046k.m66711z(textView, 0L, new Function0() { // from class: he.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NFTDialog.m22845D3(nFTItem);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m22845D3(NFTItem nFTItem) {
        String mediaJumpLink;
        if (nFTItem != null && (mediaJumpLink = nFTItem.getMediaJumpLink()) != null) {
            Router.f46192a.m56184f(mediaJumpLink).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final NFTEntity m22851A3() {
        return (NFTEntity) this.f21005a0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_nft, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        List<? extends Object> mutableList;
        BaseTextView baseTextView;
        BGABanner bGABanner;
        BGABanner bGABanner2;
        List<String> mediaUrls;
        BGABanner bGABanner3;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context context = getContext();
        NFTEntity nFTEntityM22851A3 = m22851A3();
        String strM66668h = C27041f.m66668h(nFTEntityM22851A3 != null ? nFTEntityM22851A3.getLogoPictureUrl() : null);
        C45402q c45402qM22852z3 = m22852z3();
        C24277v.m58540e(context, strM66668h, c45402qM22852z3 != null ? c45402qM22852z3.f102291d : null);
        C45402q c45402qM22852z4 = m22852z3();
        if (c45402qM22852z4 != null && (baseTextView3 = c45402qM22852z4.f102294g) != null) {
            NFTEntity nFTEntityM22851A4 = m22851A3();
            baseTextView3.setText(C27041f.m66668h(nFTEntityM22851A4 != null ? nFTEntityM22851A4.getLogoText() : null));
        }
        C45402q c45402qM22852z5 = m22852z3();
        if (c45402qM22852z5 != null && (baseTextView2 = c45402qM22852z5.f102292e) != null) {
            NFTEntity nFTEntityM22851A5 = m22851A3();
            baseTextView2.setText(C27041f.m66668h(nFTEntityM22851A5 != null ? nFTEntityM22851A5.getDescText() : null));
        }
        final Drawable drawable = AppCompatResources.getDrawable(view.getContext(), R$mipmap.home_banner_placeholder);
        C45402q c45402qM22852z6 = m22852z3();
        if (c45402qM22852z6 != null && (bGABanner3 = c45402qM22852z6.f102289b) != null) {
            bGABanner3.setAdapter(new BGABanner.InterfaceC22979b() { // from class: he.c
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner4, View view2, Object obj, int i11) {
                    NFTDialog.m22844C3(this.f85874a, drawable, bGABanner4, (FrameLayout) view2, (NFTItem) obj, i11);
                }
            });
        }
        NFTEntity nFTEntityM22851A6 = m22851A3();
        if (nFTEntityM22851A6 == null || (mediaUrls = nFTEntityM22851A6.getMediaUrls()) == null) {
            mutableList = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mediaUrls, 10));
            for (String str : mediaUrls) {
                NFTEntity nFTEntityM22851A7 = m22851A3();
                String mediaJumpText = nFTEntityM22851A7 != null ? nFTEntityM22851A7.getMediaJumpText() : null;
                NFTEntity nFTEntityM22851A8 = m22851A3();
                arrayList.add(new NFTItem(false, str, mediaJumpText, nFTEntityM22851A8 != null ? nFTEntityM22851A8.getMediaJumpLink() : null));
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        }
        NFTEntity nFTEntityM22851A9 = m22851A3();
        if (C27025c.m66566d(nFTEntityM22851A9 != null ? nFTEntityM22851A9.getMediaJump() : null) && mutableList != null) {
            NFTEntity nFTEntityM22851A10 = m22851A3();
            String mediaJumpText2 = nFTEntityM22851A10 != null ? nFTEntityM22851A10.getMediaJumpText() : null;
            NFTEntity nFTEntityM22851A11 = m22851A3();
            mutableList.add(new NFTItem(true, "", mediaJumpText2, nFTEntityM22851A11 != null ? nFTEntityM22851A11.getMediaJumpLink() : null));
        }
        C45402q c45402qM22852z7 = m22852z3();
        if (c45402qM22852z7 != null && (bGABanner2 = c45402qM22852z7.f102289b) != null) {
            bGABanner2.setAutoPlayAble(!(mutableList == null || mutableList.isEmpty()));
        }
        C45402q c45402qM22852z8 = m22852z3();
        if (c45402qM22852z8 != null && (bGABanner = c45402qM22852z8.f102289b) != null) {
            bGABanner.setData(R$layout.dialog_nft_item, mutableList, (List<String>) null);
        }
        C45402q c45402qM22852z9 = m22852z3();
        if (c45402qM22852z9 == null || (baseTextView = c45402qM22852z9.f102293f) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: he.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NFTDialog.m22846E3(this.f85876b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C45402q m22852z3() {
        return (C45402q) this.f21004Z.getValue(this, f21003c0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public static final NFTEntity m22843B3(NFTDialog nFTDialog) {
        Bundle arguments = nFTDialog.getArguments();
        if (arguments != null) {
            return (NFTEntity) arguments.getParcelable("nft");
        }
        return null;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m22846E3(NFTDialog nFTDialog) {
        nFTDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                Dialog dialog2 = getDialog();
                Intrinsics.checkNotNull(dialog2);
                Window window4 = dialog2.getWindow();
                Intrinsics.checkNotNull(window4);
                WindowManager.LayoutParams attributes = window4.getAttributes();
                attributes.width = C5267e0.m6183e();
                attributes.windowAnimations = R$style.style_bottom_dialog;
                attributes.height = -2;
                attributes.gravity = 80;
                Dialog dialog3 = getDialog();
                if (dialog3 != null && (window3 = dialog3.getWindow()) != null) {
                    window3.setAttributes(attributes);
                }
                Dialog dialog4 = getDialog();
                if (dialog4 != null && (window2 = dialog4.getWindow()) != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
            }
        }
    }
}
