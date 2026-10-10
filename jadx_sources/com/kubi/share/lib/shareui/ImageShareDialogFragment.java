package com.kubi.share.lib.shareui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.share.R$drawable;
import com.kubi.share.R$id;
import com.kubi.share.R$layout;
import com.kubi.share.R$string;
import com.kubi.share.api.CustomDisplay;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.api.entity.ConfigProperty;
import com.kubi.share.api.entity.PageTextConfigEntity;
import com.kubi.share.lib.utils.C24634d;
import com.kubi.share.lib.utils.C24651u;
import com.kubi.share.lib.utils.ShareChannel;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.share.lib.widget.ShareChannelView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import w10.C45696a;

/* JADX INFO: compiled from: ImageShareDialogFragment.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/ImageShareDialogFragment;", "Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;", "<init>", "()V", "shareImageView", "Landroid/widget/ImageView;", "customDisplayBtn", "Landroid/view/View;", "shareChannelView", "Lcom/kubi/share/lib/widget/ShareChannelView;", "subShareBitmap", "Landroid/graphics/Bitmap;", "shareBitmap", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "dismiss", "createShareImageBitmap", "ctx", "Landroid/content/Context;", "param", "Lcom/kubi/share/api/ImageShareParam;", "measureWrapContentHeight", "", "width", "onDestroyView", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImageShareDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageShareDialogFragment.kt\ncom/kubi/share/lib/shareui/ImageShareDialogFragment\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,234:1\n470#2:235\n470#2:236\n1#3:237\n*S KotlinDebug\n*F\n+ 1 ImageShareDialogFragment.kt\ncom/kubi/share/lib/shareui/ImageShareDialogFragment\n*L\n200#1:235\n201#1:236\n*E\n"})
public final class ImageShareDialogFragment extends AbsShareDailogFragment {

    /* JADX INFO: renamed from: y0 */
    @NotNull
    public static final Companion f49408y0 = new Companion(null);

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public ImageView f49409t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public View f49410u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public ShareChannelView f49411v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public Bitmap f49412w0;

    /* JADX INFO: renamed from: x0 */
    @Nullable
    public Bitmap f49413x0;

    /* JADX INFO: compiled from: ImageShareDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/ImageShareDialogFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "fm", "Landroidx/fragment/app/FragmentManager;", "param", "Lcom/kubi/share/api/ImageShareParam;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull FragmentManager fm2, @NotNull ImageShareParam param) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(param, "param");
            ImageShareDialogFragment imageShareDialogFragment = new ImageShareDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.share_layout_image);
            bundle.putInt("type", 6);
            imageShareDialogFragment.f49412w0 = param.getBitmap();
            bundle.putString("KEY_UTMSOURCE", param.getUtmSource());
            bundle.putBoolean("KEY_NEEDQRCODE", param.getNeedQrCode());
            bundle.putString("KEY_QRCODEURL", param.getQrCodeUrl());
            bundle.putBoolean("KEY_ONLY_DARK", param.getOnlyDarkMode());
            bundle.putString("KEY_RCODE", param.getRcode());
            bundle.putParcelable("KEY_CUSTOM", param.getCustomDisplay());
            bundle.putString("KEY_SUBTITLE", param.getSubTitle());
            bundle.putBoolean("KEY_SUPPORT_MODIFY_LINK", Intrinsics.areEqual(param.isSupportModifyLink(), Boolean.TRUE));
            bundle.putBoolean("isAnimationEnabled", false);
            imageShareDialogFragment.setArguments(bundle);
            imageShareDialogFragment.m59726o4(fm2);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m59755D4(final ImageShareDialogFragment imageShareDialogFragment) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.shareui.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageShareDialogFragment.m59756E4(this.f49489b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m59757G4(ImageShareDialogFragment imageShareDialogFragment) {
        Bitmap bitmap = imageShareDialogFragment.f49412w0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = imageShareDialogFragment.f49413x0;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m59760J4(ImageShareParam imageShareParam, ImageShareDialogFragment imageShareDialogFragment, Context context, String str, String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        imageShareParam.setQrCodeUrl(link);
        final Bitmap bitmap = imageShareDialogFragment.f49413x0;
        Bitmap bitmapM59778C4 = imageShareDialogFragment.m59778C4(context, imageShareParam);
        imageShareDialogFragment.f49413x0 = bitmapM59778C4;
        ImageView imageView = imageShareDialogFragment.f49409t0;
        if (imageView != null) {
            imageView.setImageBitmap(bitmapM59778C4);
        }
        ImageView imageView2 = imageShareDialogFragment.f49409t0;
        if (imageView2 != null) {
            C24651u.m59890g(imageView2, bitmapM59778C4, null, null, 6, null);
        }
        if (bitmap != null) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.shareui.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageShareDialogFragment.m59761K4(bitmap);
                }
            });
        }
        ShareChannelView shareChannelView = imageShareDialogFragment.f49411v0;
        if (shareChannelView != null) {
            shareChannelView.m59929I(link, !Intrinsics.areEqual(link, str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m59762L4(ImageShareParam imageShareParam, KcPrimaryButton kcPrimaryButton, ImageShareDialogFragment imageShareDialogFragment, View it) {
        Function2<AppCompatTextView, DialogFragment, Unit> customCallback;
        Intrinsics.checkNotNullParameter(it, "it");
        CustomDisplay customDisplay = imageShareParam.getCustomDisplay();
        if (customDisplay != null && (customCallback = customDisplay.getCustomCallback()) != null) {
            Intrinsics.checkNotNull(kcPrimaryButton);
            customCallback.invoke(kcPrimaryButton, imageShareDialogFragment);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m59763M4(final KcPrimaryButton kcPrimaryButton) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.shareui.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageShareDialogFragment.m59764N4(kcPrimaryButton);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m59765O4(final ImageShareDialogFragment imageShareDialogFragment, ImageShareParam imageShareParam, ShareChannel shareChannel) {
        if (shareChannel == null) {
            imageShareDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
        ShareDispatcher.m59807i(ShareDispatcher.f49422a, shareChannel, imageShareDialogFragment, imageShareDialogFragment.f49413x0, null, ShareExtKt.m59837J(imageShareParam), new Function0() { // from class: com.kubi.share.lib.shareui.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageShareDialogFragment.m59766P4(this.f49486b);
            }
        }, 4, null);
        imageShareDialogFragment.m59725n4(true);
        return Unit.INSTANCE;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: C4 */
    public final Bitmap m59778C4(Context context, ImageShareParam imageShareParam) {
        View viewFindViewById;
        List<ConfigProperty> properties;
        ConfigProperty configProperty;
        Bitmap bitmapM59855n = this.f49412w0;
        if (bitmapM59855n == null) {
            bitmapM59855n = ShareExtKt.m59855n(context);
        }
        int iM59779F4 = 0;
        boolean z11 = imageShareParam.getNeedQrCode() && ShareExtKt.m59837J(imageShareParam).length() > 0;
        String value = null;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.share_layout_image_content, (ViewGroup) null, false);
        BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
        baseViewHolder.setImageBitmap(R$id.ivShareContentImage, bitmapM59855n);
        String strM59837J = ShareExtKt.m59837J(imageShareParam);
        if (!imageShareParam.getNeedQrCode() || strM59837J.length() <= 0) {
            baseViewHolder.setGone(R$id.layoutFooter, false);
        } else {
            baseViewHolder.setGone(R$id.layoutFooter, true);
            baseViewHolder.setImageBitmap(R$id.ivQRCode, ShareExtKt.m59857p(strM59837J, 0, 1, null));
            PageTextConfigEntity pageTextConfigEntityM100872b = C45696a.m100872b();
            if (pageTextConfigEntityM100872b != null && (properties = pageTextConfigEntityM100872b.getProperties()) != null && (configProperty = (ConfigProperty) CollectionsKt.firstOrNull((List) properties)) != null) {
                value = configProperty.getValue();
            }
            if (value == null) {
                value = "";
            }
            if (value.length() > 0) {
                baseViewHolder.setText(R$id.tvTitle, value);
            }
            String subTitle = imageShareParam.getSubTitle();
            if (subTitle == null) {
                subTitle = "";
            }
            if (subTitle.length() > 0) {
                int i11 = R$id.tvSubtitle;
                baseViewHolder.setGone(i11, true);
                baseViewHolder.setText(i11, subTitle);
            } else {
                String rcode = imageShareParam.getRcode();
                String strMo39e = rcode != null ? rcode : "";
                if (strMo39e.length() == 0) {
                    strMo39e = IShareService.f49268a.get().mo39e();
                }
                int i12 = R$id.tvSubtitle;
                baseViewHolder.setGone(i12, strMo39e.length() > 0);
                baseViewHolder.setText(i12, getString(R$string.share_rcode, strMo39e));
                TextView textView = (TextView) baseViewHolder.getView(R$id.tvTitle);
                if (textView != null) {
                    textView.setMaxLines(strMo39e.length() > 0 ? 2 : 3);
                }
            }
        }
        if (imageShareParam.getOnlyDarkMode()) {
            baseViewHolder.setBackgroundRes(R$id.layoutFooter, R$drawable.shape_share_footer_bg_dark);
            baseViewHolder.setTextColor(R$id.tvTitle, Color.parseColor("#F3F3F3"));
            baseViewHolder.setTextColor(R$id.tvSubtitle, Color.parseColor("#7AF3F3F3"));
        }
        if (z11 && (viewFindViewById = viewInflate.findViewById(R$id.layoutFooter)) != null) {
            iM59779F4 = m59779F4(viewFindViewById, bitmapM59855n.getWidth());
        }
        Intrinsics.checkNotNull(viewInflate);
        return ViewExtKt.m66593x(viewInflate, bitmapM59855n.getWidth(), bitmapM59855n.getHeight() + iM59779F4, 0, 4, null);
    }

    /* JADX INFO: renamed from: F4 */
    public final int m59779F4(View view, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    @Override // com.kubi.share.lib.shareui.AbsShareDailogFragment
    /* JADX INFO: renamed from: b3 */
    public void mo59724b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        Bundle arguments = getArguments();
        String strM56284y = arguments != null ? RouteExKt.m56284y(arguments, "KEY_UTMSOURCE") : null;
        if (strM56284y == null) {
            strM56284y = "";
        }
        Bundle arguments2 = getArguments();
        boolean zM56250h = arguments2 != null ? RouteExKt.m56250h(arguments2, "KEY_NEEDQRCODE") : true;
        Bundle arguments3 = getArguments();
        String strM56284y2 = arguments3 != null ? RouteExKt.m56284y(arguments3, "KEY_QRCODEURL") : null;
        String str = strM56284y2 == null ? "" : strM56284y2;
        Bundle arguments4 = getArguments();
        boolean zM56250h2 = arguments4 != null ? RouteExKt.m56250h(arguments4, "KEY_ONLY_DARK") : false;
        Bundle arguments5 = getArguments();
        String strM56284y3 = arguments5 != null ? RouteExKt.m56284y(arguments5, "KEY_RCODE") : null;
        if (strM56284y3 == null) {
            strM56284y3 = "";
        }
        Bundle arguments6 = getArguments();
        CustomDisplay customDisplay = arguments6 != null ? (CustomDisplay) RouteExKt.m56274t(arguments6, "KEY_CUSTOM") : null;
        Bundle arguments7 = getArguments();
        String strM56284y4 = arguments7 != null ? RouteExKt.m56284y(arguments7, "KEY_SUBTITLE") : null;
        if (strM56284y4 == null) {
            strM56284y4 = "";
        }
        Bundle arguments8 = getArguments();
        final ImageShareParam imageShareParam = new ImageShareParam(strM56284y, null, zM56250h, str, zM56250h2, strM56284y3, customDisplay, strM56284y4, null, Boolean.valueOf(arguments8 != null ? RouteExKt.m56250h(arguments8, "KEY_SUPPORT_MODIFY_LINK") : false), 258, null);
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageShareDialogFragment.m59758H4(this.f49490b);
            }
        }, 1, null);
        final Context context = getContext();
        if (context == null) {
            return;
        }
        Bitmap bitmapM59778C4 = m59778C4(context, imageShareParam);
        ImageView imageView = (ImageView) viewHolder.getView(R$id.ivShareImage);
        this.f49409t0 = imageView;
        C24651u.m59890g(imageView, bitmapM59778C4, null, null, 6, null);
        Intrinsics.checkNotNull(imageView);
        C24634d.m59878i(imageView, 300L);
        this.f49413x0 = bitmapM59778C4;
        final KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) viewHolder.getView(R$id.customDisplay);
        this.f49410u0 = kcPrimaryButton;
        CustomDisplay customDisplay2 = imageShareParam.getCustomDisplay();
        if (C27025c.m66566d(customDisplay2 != null ? Boolean.valueOf(customDisplay2.getSupportCustom()) : null)) {
            Intrinsics.checkNotNull(kcPrimaryButton);
            C27046k.m66703r(kcPrimaryButton);
            ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.share.lib.shareui.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageShareDialogFragment.m59762L4(imageShareParam, kcPrimaryButton, this, (View) obj);
                }
            });
            kcPrimaryButton.postDelayed(new Runnable() { // from class: com.kubi.share.lib.shareui.u
                @Override // java.lang.Runnable
                public final void run() {
                    ImageShareDialogFragment.m59763M4(kcPrimaryButton);
                }
            }, 200L);
        } else {
            Intrinsics.checkNotNull(kcPrimaryButton);
            ViewExtKt.m66577h(kcPrimaryButton);
        }
        ShareChannelView shareChannelView = (ShareChannelView) viewHolder.getView(R$id.shareChannelView);
        if (shareChannelView == null) {
            return;
        }
        this.f49411v0 = shareChannelView;
        shareChannelView.setSupportModifyLink(Intrinsics.areEqual(imageShareParam.isSupportModifyLink(), Boolean.TRUE));
        ShareChannelView shareChannelView2 = this.f49411v0;
        if (shareChannelView2 != null) {
            C24634d.m59873d(shareChannelView2, 300L);
        }
        ShareChannelView shareChannelView3 = this.f49411v0;
        if (shareChannelView3 != null) {
            shareChannelView3.m59928D(imageShareParam, new Function1() { // from class: com.kubi.share.lib.shareui.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageShareDialogFragment.m59765O4(this.f49495b, imageShareParam, (ShareChannel) obj);
                }
            }, new Function0() { // from class: com.kubi.share.lib.shareui.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageShareDialogFragment.m59759I4(imageShareParam, this, context);
                }
            });
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        View view = this.f49410u0;
        if (view != null) {
            C24634d.m59879j(view, 230L);
        }
        ImageView imageView = this.f49409t0;
        if (imageView != null) {
            C24634d.m59879j(imageView, 230L);
        }
        ShareChannelView shareChannelView = this.f49411v0;
        if (shareChannelView != null) {
            C24634d.m59875f(shareChannelView, 230L, new Function0() { // from class: com.kubi.share.lib.shareui.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageShareDialogFragment.m59755D4(this.f49488b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m59756E4(ImageShareDialogFragment imageShareDialogFragment) {
        super.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m59758H4(ImageShareDialogFragment imageShareDialogFragment) {
        imageShareDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m59759I4(final ImageShareParam imageShareParam, final ImageShareDialogFragment imageShareDialogFragment, final Context context) {
        final String strM59837J = ShareExtKt.m59837J(imageShareParam);
        ShareDialogModifyIFragment.Companion companion = ShareDialogModifyIFragment.f49414r0;
        FragmentManager parentFragmentManager = imageShareDialogFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        companion.show(parentFragmentManager, strM59837J, new Function1() { // from class: com.kubi.share.lib.shareui.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageShareDialogFragment.m59760J4(imageShareParam, imageShareDialogFragment, context, strM59837J, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m59761K4(Bitmap bitmap) {
        bitmap.recycle();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m59764N4(KcPrimaryButton kcPrimaryButton) {
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66685H(kcPrimaryButton);
        C24634d.m59878i(kcPrimaryButton, 300L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m59766P4(ImageShareDialogFragment imageShareDialogFragment) {
        imageShareDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.share.lib.shareui.AbsShareDailogFragment, com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.shareui.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageShareDialogFragment.m59757G4(this.f49485b);
            }
        });
        this.f49412w0 = null;
        this.f49413x0 = null;
    }
}
