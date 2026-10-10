package com.kubi.share.lib.shareui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.PagerAdapter;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.share.R$id;
import com.kubi.share.R$layout;
import com.kubi.share.R$mipmap;
import com.kubi.share.R$string;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.IShareService;
import com.kubi.share.api.entity.ConfigProperty;
import com.kubi.share.api.entity.PageTextConfigEntity;
import com.kubi.share.lib.entity.ShareGalleryEntity;
import com.kubi.share.lib.utils.C24634d;
import com.kubi.share.lib.utils.ShareChannel;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.share.lib.utils.ShareImageLoadTarget;
import com.kubi.share.lib.widget.ShareChannelView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27028b;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import w10.C45696a;

/* JADX INFO: compiled from: GalleryShareDialogFragment.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J&\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/GalleryShareDialogFragment;", "Lcom/kubi/share/lib/shareui/AbsShareDailogFragment;", "<init>", "()V", "currentView", "Landroid/view/View;", "shareChannelView", "Lcom/kubi/share/lib/widget/ShareChannelView;", "shareBitmap", "Landroid/graphics/Bitmap;", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "updateVisibleQrCode", "shareLink", "", "applyStatusBarInset", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupImage", "param", "Lcom/kubi/share/api/GalleryShareParam;", "gallery", "", "Lcom/kubi/share/lib/entity/ShareGalleryEntity;", "dismiss", "onDestroyView", "Companion", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GalleryShareDialogFragment extends AbsShareDailogFragment {

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f49400w0 = new Companion(null);

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public View f49401t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public ShareChannelView f49402u0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public Bitmap f49403v0;

    /* JADX INFO: compiled from: GalleryShareDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/share/lib/shareui/GalleryShareDialogFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "fm", "Landroidx/fragment/app/FragmentManager;", "param", "Lcom/kubi/share/api/GalleryShareParam;", "gallery", "Ljava/util/ArrayList;", "Lcom/kubi/share/lib/entity/ShareGalleryEntity;", "Lkotlin/collections/ArrayList;", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull FragmentManager fm2, @NotNull GalleryShareParam param, @NotNull ArrayList<ShareGalleryEntity> gallery) {
            Intrinsics.checkNotNullParameter(fm2, "fm");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(gallery, "gallery");
            GalleryShareDialogFragment galleryShareDialogFragment = new GalleryShareDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.share_layout_gallery);
            bundle.putInt("type", 6);
            bundle.putParcelable("KEY_PARAMS", param);
            bundle.putParcelableArrayList("KEY_GALLERYS", gallery);
            bundle.putBoolean("isAnimationEnabled", false);
            galleryShareDialogFragment.setArguments(bundle);
            galleryShareDialogFragment.m59726o4(fm2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.share.lib.shareui.GalleryShareDialogFragment$a */
    /* JADX INFO: compiled from: GalleryShareDialogFragment.kt */
    @Metadata(m90083d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, m90084d2 = {"com/kubi/share/lib/shareui/GalleryShareDialogFragment$setupImage$1$1", "Landroidx/viewpager/widget/PagerAdapter;", "isViewFromObject", "", "v", "Landroid/view/View;", "p", "", "getCount", "", "instantiateItem", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", ViewProps.POSITION, "destroyItem", "", "obj", "setPrimaryItem", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24577a extends PagerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<ShareGalleryEntity> f49404a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RtlViewPager f49405b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ GalleryShareParam f49406c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ GalleryShareDialogFragment f49407d;

        public C24577a(List<ShareGalleryEntity> list, RtlViewPager rtlViewPager, GalleryShareParam galleryShareParam, GalleryShareDialogFragment galleryShareDialogFragment) {
            this.f49404a = list;
            this.f49405b = rtlViewPager;
            this.f49406c = galleryShareParam;
            this.f49407d = galleryShareDialogFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object obj) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(obj, "obj");
            container.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f49404a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup container, int position) {
            List<ConfigProperty> properties;
            ConfigProperty configProperty;
            Intrinsics.checkNotNullParameter(container, "container");
            final ShareGalleryEntity shareGalleryEntity = this.f49404a.get(position);
            String value = null;
            final View viewInflate = View.inflate(this.f49405b.getContext(), R$layout.share_item_gallery, null);
            final RtlViewPager rtlViewPager = this.f49405b;
            C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.shareui.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryShareDialogFragment.C24577a.m59752b(rtlViewPager, shareGalleryEntity, viewInflate);
                }
            });
            BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
            GalleryShareParam galleryShareParam = this.f49406c;
            GalleryShareDialogFragment galleryShareDialogFragment = this.f49407d;
            String strM59837J = ShareExtKt.m59837J(galleryShareParam);
            if (!galleryShareParam.getNeedQrCode() || strM59837J.length() <= 0) {
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
                String subTitle = galleryShareParam.getSubTitle();
                if (subTitle == null) {
                    subTitle = "";
                }
                if (subTitle.length() > 0) {
                    int i11 = R$id.tvSubtitle;
                    baseViewHolder.setGone(i11, true);
                    baseViewHolder.setText(i11, subTitle);
                } else {
                    String rcode = galleryShareParam.getRcode();
                    String strMo39e = rcode != null ? rcode : "";
                    if (strMo39e.length() == 0) {
                        strMo39e = IShareService.f49268a.get().mo39e();
                    }
                    int i12 = R$id.tvSubtitle;
                    baseViewHolder.setGone(i12, strMo39e.length() > 0);
                    baseViewHolder.setText(i12, galleryShareDialogFragment.getString(R$string.share_rcode, strMo39e));
                    TextView textView = (TextView) baseViewHolder.getView(R$id.tvTitle);
                    if (textView != null) {
                        textView.setMaxLines(strMo39e.length() > 0 ? 2 : 3);
                    }
                }
            }
            container.addView(viewInflate);
            Intrinsics.checkNotNull(viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View v11, Object p11) {
            Intrinsics.checkNotNullParameter(v11, "v");
            Intrinsics.checkNotNullParameter(p11, "p");
            return Intrinsics.areEqual(v11, p11);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(ViewGroup container, int position, Object view) {
            View viewFindViewById;
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(view, "view");
            super.setPrimaryItem(container, position, view);
            View view2 = view instanceof View ? (View) view : null;
            if (view2 == null || (viewFindViewById = view2.findViewById(R$id.layoutContent)) == null) {
                return;
            }
            this.f49407d.f49401t0 = viewFindViewById;
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m59752b(RtlViewPager rtlViewPager, ShareGalleryEntity shareGalleryEntity, View view) {
            C46340c<Bitmap> c46340cMo92188b0 = C46338a.m102151a(rtlViewPager.getContext()).mo6621d().mo6601L0(shareGalleryEntity.getUrl()).mo92188b0(R$mipmap.bg_share_app);
            ImageView imageView = (ImageView) view.findViewById(R$id.ivImage);
            Intrinsics.checkNotNull(rtlViewPager);
            c46340cMo92188b0.m6591B0(new ShareImageLoadTarget(imageView, Integer.valueOf(C27029c.m66601d(rtlViewPager, C33556b3.f69027c)), null, null, null, 28, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final WindowInsetsCompat m59727B4(int i11, View target, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(insets, "insets");
        target.setPadding(target.getPaddingLeft(), i11 + insets.getInsets(WindowInsetsCompat.Type.statusBars()).top, target.getPaddingRight(), target.getPaddingBottom());
        return insets;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m59728C4(final GalleryShareDialogFragment galleryShareDialogFragment) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.share.lib.shareui.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GalleryShareDialogFragment.m59729D4(this.f49447b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m59730E4(GalleryShareDialogFragment galleryShareDialogFragment) {
        Bitmap bitmap = galleryShareDialogFragment.f49403v0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m59732H4(final GalleryShareDialogFragment galleryShareDialogFragment, GalleryShareParam galleryShareParam, BaseViewHolder baseViewHolder, List list, ShareChannel shareChannel) {
        Bitmap bitmapM66589t;
        final ShareGalleryEntity shareGalleryEntity;
        if (shareChannel == null) {
            galleryShareDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
        View view = galleryShareDialogFragment.f49401t0;
        if (view == null || (bitmapM66589t = ViewExtKt.m66589t(view, 0, 1, null)) == null) {
            return Unit.INSTANCE;
        }
        galleryShareDialogFragment.f49403v0 = bitmapM66589t;
        ShareDispatcher.m59807i(ShareDispatcher.f49422a, shareChannel, galleryShareDialogFragment, bitmapM66589t, null, ShareExtKt.m59837J(galleryShareParam), new Function0() { // from class: com.kubi.share.lib.shareui.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GalleryShareDialogFragment.m59733I4(this.f49475b);
            }
        }, 4, null);
        galleryShareDialogFragment.m59725n4(true);
        RtlViewPager rtlViewPager = (RtlViewPager) baseViewHolder.getView(R$id.viewPager);
        if (rtlViewPager != null && (shareGalleryEntity = (ShareGalleryEntity) CollectionsKt.getOrNull(list, rtlViewPager.getCurrentItem())) != null) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.shareui.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryShareDialogFragment.m59734J4(shareGalleryEntity);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m59734J4(ShareGalleryEntity shareGalleryEntity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("galleryId", shareGalleryEntity.getId());
        jSONObject.put("galleryName", shareGalleryEntity.getName());
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B3SidebarPage", "galleryShare", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m59735K4(final GalleryShareDialogFragment galleryShareDialogFragment, final GalleryShareParam galleryShareParam, final BaseViewHolder baseViewHolder) {
        ShareDialogModifyIFragment.Companion companion = ShareDialogModifyIFragment.f49414r0;
        FragmentManager parentFragmentManager = galleryShareDialogFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        companion.show(parentFragmentManager, ShareExtKt.m59837J(galleryShareParam), new Function1() { // from class: com.kubi.share.lib.shareui.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryShareDialogFragment.m59736L4(galleryShareParam, galleryShareDialogFragment, baseViewHolder, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m59736L4(GalleryShareParam galleryShareParam, GalleryShareDialogFragment galleryShareDialogFragment, BaseViewHolder baseViewHolder, String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        boolean z11 = !Intrinsics.areEqual(link, ShareExtKt.m59837J(galleryShareParam));
        galleryShareParam.setGalleryLink(link);
        ShareChannelView shareChannelView = galleryShareDialogFragment.f49402u0;
        if (shareChannelView != null) {
            shareChannelView.m59929I(link, z11);
        }
        galleryShareDialogFragment.m59750M4(baseViewHolder, link);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public final void m59749F4(GalleryShareParam galleryShareParam, List<ShareGalleryEntity> list, BaseViewHolder baseViewHolder) {
        RtlViewPager rtlViewPager = (RtlViewPager) baseViewHolder.getView(R$id.viewPager);
        Context context = rtlViewPager.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rtlViewPager.setPageTransformer(false, new C27028b(context));
        rtlViewPager.setPageMargin(C5275i0.m6236a(40.0f));
        rtlViewPager.setAdapter(new C24577a(list, rtlViewPager, galleryShareParam, this));
        int iM66650j = C27039d.m66650j(Integer.valueOf(galleryShareParam.getGalleryIndex()));
        if (iM66650j <= 0 || iM66650j >= list.size()) {
            return;
        }
        rtlViewPager.setCurrentItem(iM66650j);
    }

    /* JADX INFO: renamed from: M4 */
    public final void m59750M4(BaseViewHolder baseViewHolder, String str) {
        RtlViewPager rtlViewPager = (RtlViewPager) baseViewHolder.getView(R$id.viewPager);
        if (rtlViewPager != null) {
            int childCount = rtlViewPager.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ImageView imageView = (ImageView) rtlViewPager.getChildAt(i11).findViewById(R$id.ivQRCode);
                if (imageView != null) {
                    imageView.setImageBitmap(ShareExtKt.m59857p(str, 0, 1, null));
                }
            }
        }
    }

    @Override // com.kubi.share.lib.shareui.AbsShareDailogFragment
    /* JADX INFO: renamed from: b3 */
    public void mo59724b3(@NotNull final BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        Bundle arguments = getArguments();
        final GalleryShareParam galleryShareParam = arguments != null ? (GalleryShareParam) RouteExKt.m56274t(arguments, "KEY_PARAMS") : null;
        Bundle arguments2 = getArguments();
        final List<ShareGalleryEntity> parcelableArrayList = arguments2 != null ? arguments2.getParcelableArrayList("KEY_GALLERYS") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = CollectionsKt.emptyList();
        }
        if (galleryShareParam == null) {
            return;
        }
        View itemView = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.share.lib.shareui.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GalleryShareDialogFragment.m59731G4(this.f49452b);
            }
        }, 1, null);
        m59749F4(galleryShareParam, parcelableArrayList, viewHolder);
        ShareChannelView shareChannelView = (ShareChannelView) viewHolder.getView(R$id.shareChannelView);
        if (shareChannelView == null) {
            return;
        }
        this.f49402u0 = shareChannelView;
        shareChannelView.setSupportModifyLink(Intrinsics.areEqual(galleryShareParam.isSupportModifyLink(), Boolean.TRUE));
        if (Intrinsics.areEqual(galleryShareParam.isSupportModifyLink(), Boolean.TRUE)) {
            View itemView2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            m59748A4(itemView2);
        }
        ShareChannelView shareChannelView2 = this.f49402u0;
        if (shareChannelView2 != null) {
            C24634d.m59873d(shareChannelView2, 300L);
        }
        ShareChannelView shareChannelView3 = this.f49402u0;
        if (shareChannelView3 != null) {
            shareChannelView3.m59928D(galleryShareParam, new Function1() { // from class: com.kubi.share.lib.shareui.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GalleryShareDialogFragment.m59732H4(this.f49454b, galleryShareParam, viewHolder, parcelableArrayList, (ShareChannel) obj);
                }
            }, new Function0() { // from class: com.kubi.share.lib.shareui.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryShareDialogFragment.m59735K4(this.f49459b, galleryShareParam, viewHolder);
                }
            });
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismiss() {
        ShareChannelView shareChannelView = this.f49402u0;
        if (shareChannelView != null) {
            C24634d.m59875f(shareChannelView, 230L, new Function0() { // from class: com.kubi.share.lib.shareui.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryShareDialogFragment.m59728C4(this.f49437b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m59729D4(GalleryShareDialogFragment galleryShareDialogFragment) {
        super.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m59731G4(GalleryShareDialogFragment galleryShareDialogFragment) {
        galleryShareDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m59733I4(GalleryShareDialogFragment galleryShareDialogFragment) {
        galleryShareDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m59748A4(View view) {
        final int paddingTop = view.getPaddingTop();
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.kubi.share.lib.shareui.j
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return GalleryShareDialogFragment.m59727B4(paddingTop, view2, windowInsetsCompat);
            }
        });
        ViewCompat.requestApplyInsets(view);
    }

    @Override // com.kubi.share.lib.shareui.AbsShareDailogFragment, com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C27100x0.m66923d(new Function0() { // from class: com.kubi.share.lib.shareui.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GalleryShareDialogFragment.m59730E4(this.f49442b);
            }
        });
        this.f49403v0 = null;
    }
}
