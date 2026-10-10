package com.kubi.spot.business;

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
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$style;
import com.kubi.spot.entity.NFTEntity;
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
import t20.C44674x;
import w00.C45681e;

/* JADX INFO: compiled from: NFTDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/spot/business/NFTDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/DialogNftBinding;", "getBinding", "()Lcom/kubi/spot/databinding/DialogNftBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "nft", "Lcom/kubi/spot/entity/NFTEntity;", "getNft", "()Lcom/kubi/spot/entity/NFTEntity;", "nft$delegate", "Lkotlin/Lazy;", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNFTDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NFTDialog.kt\ncom/kubi/spot/business/NFTDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n143#2,20:127\n1563#3:147\n1634#3,3:148\n1#4:151\n*S KotlinDebug\n*F\n+ 1 NFTDialog.kt\ncom/kubi/spot/business/NFTDialog\n*L\n40#1:127,20\n110#1:147\n110#1:148,3\n*E\n"})
public final class NFTDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f49750Z = C45681e.m100799e(this, new Function1<NFTDialog, C44674x>() { // from class: com.kubi.spot.business.NFTDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44674x invoke(@NotNull NFTDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44674x.m98824a(fragment.requireView());
        }
    }, new Function1<C44674x, Unit>() { // from class: com.kubi.spot.business.NFTDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44674x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44674x c44674x) {
            invoke(c44674x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f49751a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.k3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NFTDialog.m60228B3(this.f50177b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f49749c0 = {Reflection.property1(new PropertyReference1Impl(NFTDialog.class, "binding", "getBinding()Lcom/kubi/spot/databinding/DialogNftBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f49748b0 = new Companion(null);

    /* JADX INFO: compiled from: NFTDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/business/NFTDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/business/NFTDialog;", "nft", "Lcom/kubi/spot/entity/NFTEntity;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nNFTDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NFTDialog.kt\ncom/kubi/spot/business/NFTDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
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
    public static final void m60229C3(NFTDialog nFTDialog, Drawable drawable, BGABanner bGABanner, FrameLayout itemView, final NFTItem nFTItem, int i11) {
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
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.spot.business.l3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NFTDialog.m60230D3(nFTItem);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m60230D3(NFTItem nFTItem) {
        String mediaJumpLink;
        if (nFTItem != null && (mediaJumpLink = nFTItem.getMediaJumpLink()) != null) {
            Router.f46192a.m56184f(mediaJumpLink).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final NFTEntity m60236A3() {
        return (NFTEntity) this.f49751a0.getValue();
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
        NFTEntity nFTEntityM60236A3 = m60236A3();
        String strM66668h = C27041f.m66668h(nFTEntityM60236A3 != null ? nFTEntityM60236A3.getLogoPictureUrl() : null);
        C44674x c44674xM60237z3 = m60237z3();
        C24277v.m58540e(context, strM66668h, c44674xM60237z3 != null ? c44674xM60237z3.f99428d : null);
        C44674x c44674xM60237z4 = m60237z3();
        if (c44674xM60237z4 != null && (baseTextView3 = c44674xM60237z4.f99431g) != null) {
            NFTEntity nFTEntityM60236A4 = m60236A3();
            baseTextView3.setText(C27041f.m66668h(nFTEntityM60236A4 != null ? nFTEntityM60236A4.getLogoText() : null));
        }
        C44674x c44674xM60237z5 = m60237z3();
        if (c44674xM60237z5 != null && (baseTextView2 = c44674xM60237z5.f99429e) != null) {
            NFTEntity nFTEntityM60236A5 = m60236A3();
            baseTextView2.setText(C27041f.m66668h(nFTEntityM60236A5 != null ? nFTEntityM60236A5.getDescText() : null));
        }
        final Drawable drawable = AppCompatResources.getDrawable(view.getContext(), R$mipmap.home_banner_placeholder);
        C44674x c44674xM60237z6 = m60237z3();
        if (c44674xM60237z6 != null && (bGABanner3 = c44674xM60237z6.f99426b) != null) {
            bGABanner3.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.spot.business.i3
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner4, View view2, Object obj, int i11) {
                    NFTDialog.m60229C3(this.f50167a, drawable, bGABanner4, (FrameLayout) view2, (NFTItem) obj, i11);
                }
            });
        }
        NFTEntity nFTEntityM60236A6 = m60236A3();
        if (nFTEntityM60236A6 == null || (mediaUrls = nFTEntityM60236A6.getMediaUrls()) == null) {
            mutableList = null;
        } else {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mediaUrls, 10));
            for (String str : mediaUrls) {
                NFTEntity nFTEntityM60236A7 = m60236A3();
                String mediaJumpText = nFTEntityM60236A7 != null ? nFTEntityM60236A7.getMediaJumpText() : null;
                NFTEntity nFTEntityM60236A8 = m60236A3();
                arrayList.add(new NFTItem(false, str, mediaJumpText, nFTEntityM60236A8 != null ? nFTEntityM60236A8.getMediaJumpLink() : null));
            }
            mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        }
        NFTEntity nFTEntityM60236A9 = m60236A3();
        if (C27025c.m66566d(nFTEntityM60236A9 != null ? nFTEntityM60236A9.getMediaJump() : null) && mutableList != null) {
            NFTEntity nFTEntityM60236A10 = m60236A3();
            String mediaJumpText2 = nFTEntityM60236A10 != null ? nFTEntityM60236A10.getMediaJumpText() : null;
            NFTEntity nFTEntityM60236A11 = m60236A3();
            mutableList.add(new NFTItem(true, "", mediaJumpText2, nFTEntityM60236A11 != null ? nFTEntityM60236A11.getMediaJumpLink() : null));
        }
        C44674x c44674xM60237z7 = m60237z3();
        if (c44674xM60237z7 != null && (bGABanner2 = c44674xM60237z7.f99426b) != null) {
            bGABanner2.setAutoPlayAble(!(mutableList == null || mutableList.isEmpty()));
        }
        C44674x c44674xM60237z8 = m60237z3();
        if (c44674xM60237z8 != null && (bGABanner = c44674xM60237z8.f99426b) != null) {
            bGABanner.setData(R$layout.dialog_nft_item, mutableList, (List<String>) null);
        }
        C44674x c44674xM60237z9 = m60237z3();
        if (c44674xM60237z9 == null || (baseTextView = c44674xM60237z9.f99430f) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.business.j3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NFTDialog.m60231E3(this.f50173b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C44674x m60237z3() {
        return (C44674x) this.f49750Z.getValue(this, f49749c0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public static final NFTEntity m60228B3(NFTDialog nFTDialog) {
        Bundle arguments = nFTDialog.getArguments();
        if (arguments != null) {
            return (NFTEntity) arguments.getParcelable("nft");
        }
        return null;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m60231E3(NFTDialog nFTDialog) {
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
