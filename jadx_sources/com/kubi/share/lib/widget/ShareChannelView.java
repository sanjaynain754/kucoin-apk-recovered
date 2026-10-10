package com.kubi.share.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.core.Router;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.share.R$layout;
import com.kubi.share.R$string;
import com.kubi.share.api.GalleryShareParam;
import com.kubi.share.api.ImageShareParam;
import com.kubi.share.api.ShareParam;
import com.kubi.share.api.TextShareParam;
import com.kubi.share.api.entity.AdEntity;
import com.kubi.share.api.entity.Ads;
import com.kubi.share.api.entity.ShareReferralEntity;
import com.kubi.share.lib.utils.ShareChannel;
import com.kubi.share.lib.utils.ShareExtKt;
import com.kubi.share.lib.widget.ShareChannelView;
import com.kubi.user.protocol.entity.SignTermItem;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;
import w10.C45696a;
import x10.C45991a;

/* JADX INFO: compiled from: ShareChannelView.kt */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00110\u0015J4\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00110\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\u00020\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00110\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010 \u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, m90084d2 = {"Lcom/kubi/share/lib/widget/ShareChannelView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/share/databinding/ShareChannelViewBinding;", "getBinding", "()Lcom/kubi/share/databinding/ShareChannelViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setup", "", "shareParam", "Lcom/kubi/share/api/ShareParam;", "onClick", "Lkotlin/Function1;", "Lcom/kubi/share/lib/utils/ShareChannel;", "onModifyInviteLink", "Lkotlin/Function0;", "updateInviteLink", SignTermItem.LINK, "", "isCustom", "", "applyOnClick", "resetTitleLayout", "isSupportModifyLink", "()Z", "setSupportModifyLink", "(Z)V", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShareChannelView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareChannelView.kt\ncom/kubi/share/lib/widget/ShareChannelView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n52#2:155\n80#2,7:156\n1#3:163\n*S KotlinDebug\n*F\n+ 1 ShareChannelView.kt\ncom/kubi/share/lib/widget/ShareChannelView\n*L\n37#1:155\n37#1:156,7\n*E\n"})
public final class ShareChannelView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f49555d = {Reflection.property1(new PropertyReference1Impl(ShareChannelView.class, "binding", "getBinding()Lcom/kubi/share/databinding/ShareChannelViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f49556b;

    /* JADX INFO: renamed from: c */
    public boolean f49557c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareChannelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m59921t(Function1 function1) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareChannelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m59899E(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m59900F(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m59901G(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m59902H(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C45991a getBinding() {
        return (C45991a) this.f49556b.getValue(this, f49555d[0]);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m59919r(Function1 function1) {
        function1.invoke(ShareChannel.Save);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m59920s(Function1 function1) {
        function1.invoke(ShareChannel.Copy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m59922u(Function1 function1) {
        function1.invoke(ShareChannel.Twitter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m59923v(Function1 function1) {
        function1.invoke(ShareChannel.Facebook);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m59924w(Function1 function1) {
        function1.invoke(ShareChannel.Telegram);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m59925x(Function1 function1) {
        function1.invoke(ShareChannel.Line);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m59926y(Function1 function1) {
        function1.invoke(ShareChannel.More);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public final void m59927C(@NotNull ShareParam shareParam, @NotNull Function1<? super ShareChannel, Unit> onClick) {
        Intrinsics.checkNotNullParameter(shareParam, "shareParam");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        m59928D(shareParam, onClick, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m59928D(@NotNull ShareParam shareParam, @NotNull Function1<? super ShareChannel, Unit> onClick, @Nullable final Function0<Unit> function0) {
        KcSecondaryButton kcSecondaryButton;
        View view;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        KcSecondaryButton kcSecondaryButton2;
        View view2;
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton3;
        View view3;
        ConstraintLayout constraintLayout4;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout5;
        ConstraintLayout constraintLayout6;
        KcSecondaryButton kcSecondaryButton4;
        View view4;
        KcPrimaryButton kcPrimaryButton2;
        ConstraintLayout constraintLayout7;
        KcSecondaryButton kcSecondaryButton5;
        View view5;
        KcPrimaryButton kcPrimaryButton3;
        Intrinsics.checkNotNullParameter(shareParam, "shareParam");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        m59931z();
        if (shareParam instanceof TextShareParam) {
            C45991a binding = getBinding();
            if (binding != null && (kcPrimaryButton3 = binding.f103472c) != null) {
                ViewExtKt.m66577h(kcPrimaryButton3);
            }
            C45991a binding2 = getBinding();
            if (binding2 != null && (view5 = binding2.f103486q) != null) {
                ViewExtKt.m66577h(view5);
            }
            C45991a binding3 = getBinding();
            if (binding3 != null && (kcSecondaryButton5 = binding3.f103471b) != null) {
                ViewExtKt.m66594y(kcSecondaryButton5);
            }
            C45991a binding4 = getBinding();
            if (binding4 != null && (constraintLayout7 = binding4.f103476g) != null) {
                ViewExtKt.m66577h(constraintLayout7);
            }
        } else if (shareParam instanceof GalleryShareParam) {
            C45991a binding5 = getBinding();
            if (binding5 != null && (kcPrimaryButton2 = binding5.f103472c) != null) {
                ViewExtKt.m66594y(kcPrimaryButton2);
            }
            if (ShareExtKt.m59837J(shareParam).length() > 0) {
                C45991a binding6 = getBinding();
                if (binding6 != null && (view4 = binding6.f103486q) != null) {
                    ViewExtKt.m66594y(view4);
                }
                C45991a binding7 = getBinding();
                if (binding7 != null && (kcSecondaryButton4 = binding7.f103471b) != null) {
                    ViewExtKt.m66594y(kcSecondaryButton4);
                }
            } else {
                C45991a binding8 = getBinding();
                if (binding8 != null && (view3 = binding8.f103486q) != null) {
                    ViewExtKt.m66577h(view3);
                }
                C45991a binding9 = getBinding();
                if (binding9 != null && (kcSecondaryButton3 = binding9.f103471b) != null) {
                    ViewExtKt.m66577h(kcSecondaryButton3);
                }
            }
            if (this.f49557c) {
                C45991a binding10 = getBinding();
                if (binding10 != null && (constraintLayout6 = binding10.f103476g) != null) {
                    ViewExtKt.m66594y(constraintLayout6);
                }
            } else {
                C45991a binding11 = getBinding();
                if (binding11 != null && (constraintLayout4 = binding11.f103476g) != null) {
                    ViewExtKt.m66577h(constraintLayout4);
                }
            }
            m59929I(ShareExtKt.m59837J(shareParam), false);
            C45991a binding12 = getBinding();
            if (binding12 != null && (constraintLayout5 = binding12.f103476g) != null) {
                C27046k.m66711z(constraintLayout5, 0L, new Function0() { // from class: b20.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareChannelView.m59899E(function0);
                    }
                }, 1, null);
            }
            C45991a binding13 = getBinding();
            if (binding13 != null && (baseTextView2 = binding13.f103479j) != null) {
                C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: b20.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareChannelView.m59900F(function0);
                    }
                }, 1, null);
            }
        } else if (shareParam instanceof ImageShareParam) {
            C45991a binding14 = getBinding();
            if (binding14 != null && (kcPrimaryButton = binding14.f103472c) != null) {
                ViewExtKt.m66594y(kcPrimaryButton);
            }
            if (ShareExtKt.m59837J(shareParam).length() > 0) {
                C45991a binding15 = getBinding();
                if (binding15 != null && (view2 = binding15.f103486q) != null) {
                    ViewExtKt.m66594y(view2);
                }
                C45991a binding16 = getBinding();
                if (binding16 != null && (kcSecondaryButton2 = binding16.f103471b) != null) {
                    ViewExtKt.m66594y(kcSecondaryButton2);
                }
            } else {
                C45991a binding17 = getBinding();
                if (binding17 != null && (view = binding17.f103486q) != null) {
                    ViewExtKt.m66577h(view);
                }
                C45991a binding18 = getBinding();
                if (binding18 != null && (kcSecondaryButton = binding18.f103471b) != null) {
                    ViewExtKt.m66577h(kcSecondaryButton);
                }
            }
            if (this.f49557c) {
                C45991a binding19 = getBinding();
                if (binding19 != null && (constraintLayout3 = binding19.f103476g) != null) {
                    ViewExtKt.m66594y(constraintLayout3);
                }
            } else {
                C45991a binding20 = getBinding();
                if (binding20 != null && (constraintLayout = binding20.f103476g) != null) {
                    ViewExtKt.m66577h(constraintLayout);
                }
            }
            m59929I(ShareExtKt.m59837J(shareParam), false);
            C45991a binding21 = getBinding();
            if (binding21 != null && (constraintLayout2 = binding21.f103476g) != null) {
                C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: b20.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareChannelView.m59901G(function0);
                    }
                }, 1, null);
            }
            C45991a binding22 = getBinding();
            if (binding22 != null && (baseTextView = binding22.f103479j) != null) {
                C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: b20.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareChannelView.m59902H(function0);
                    }
                }, 1, null);
            }
        }
        m59930p(onClick);
    }

    /* JADX INFO: renamed from: I */
    public final void m59929I(@NotNull String link, boolean z11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(link, "link");
        C45991a binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f103478i) != null) {
            baseTextView2.setText(z11 ? R$string.share_custom_link : R$string.share_default_link);
        }
        C45991a binding2 = getBinding();
        if (binding2 == null || (baseTextView = binding2.f103477h) == null) {
            return;
        }
        baseTextView.setText(link);
    }

    /* JADX INFO: renamed from: p */
    public final void m59930p(final Function1<? super ShareChannel, Unit> function1) {
        C27100x0.m66924e(new Function0() { // from class: b20.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareChannelView.m59918q(this.f3881b, function1);
            }
        });
    }

    public final void setSupportModifyLink(boolean z11) {
        this.f49557c = z11;
    }

    /* JADX INFO: renamed from: z */
    public final void m59931z() {
        BaseTextView baseTextView;
        RoundImageView roundImageView;
        Ads ads;
        HashMap<String, List<AdEntity>> data;
        Collection<List<AdEntity>> collectionValues;
        List list;
        BaseTextView baseTextView2;
        RoundImageView roundImageView2;
        if (this.f49557c) {
            C45991a binding = getBinding();
            if (binding != null && (roundImageView2 = binding.f103474e) != null) {
                ViewExtKt.m66577h(roundImageView2);
            }
            C45991a binding2 = getBinding();
            if (binding2 == null || (baseTextView2 = binding2.f103484o) == null) {
                return;
            }
            ViewExtKt.m66594y(baseTextView2);
            return;
        }
        ShareReferralEntity shareReferralEntityM100871a = C45696a.m100871a();
        final AdEntity adEntity = (shareReferralEntityM100871a == null || (ads = shareReferralEntityM100871a.getAds()) == null || (data = ads.getData()) == null || (collectionValues = data.values()) == null || (list = (List) CollectionsKt.firstOrNull(collectionValues)) == null) ? null : (AdEntity) CollectionsKt.firstOrNull(list);
        if (adEntity == null) {
            C45991a binding3 = getBinding();
            if (binding3 != null && (roundImageView = binding3.f103474e) != null) {
                ViewExtKt.m66577h(roundImageView);
            }
            C45991a binding4 = getBinding();
            if (binding4 == null || (baseTextView = binding4.f103484o) == null) {
                return;
            }
            ViewExtKt.m66594y(baseTextView);
            return;
        }
        final String daytime_image_url = DayNightThemeManager.f28592a.m33187l() ? adEntity.getDaytime_image_url() : adEntity.getImageUrl();
        final C45991a binding5 = getBinding();
        if (binding5 != null) {
            C27100x0.m66924e(new Function0() { // from class: b20.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59897A(this.f3877b, daytime_image_url, binding5);
                }
            });
            RoundImageView ivOperationImage = binding5.f103474e;
            Intrinsics.checkNotNullExpressionValue(ivOperationImage, "ivOperationImage");
            ViewExtKt.m66594y(ivOperationImage);
            BaseTextView tvShareTitle = binding5.f103484o;
            Intrinsics.checkNotNullExpressionValue(tvShareTitle, "tvShareTitle");
            ViewExtKt.m66577h(tvShareTitle);
            RoundImageView ivOperationImage2 = binding5.f103474e;
            Intrinsics.checkNotNullExpressionValue(ivOperationImage2, "ivOperationImage");
            C27046k.m66711z(ivOperationImage2, 0L, new Function0() { // from class: b20.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59898B(adEntity);
                }
            }, 1, null);
        }
    }

    public /* synthetic */ ShareChannelView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m59897A(ShareChannelView shareChannelView, String str, C45991a c45991a) {
        C46338a.m102151a(shareChannelView.getContext()).mo6634v(str).m6594E0(c45991a.f103474e);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m59898B(AdEntity adEntity) {
        String url = adEntity.getUrl();
        if (url != null) {
            Router.f46192a.m56184f(url).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m59918q(ShareChannelView shareChannelView, final Function1 function1) {
        C45991a binding = shareChannelView.getBinding();
        if (binding != null) {
            ImageView ivClose = binding.f103473d;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: b20.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59921t(function1);
                }
            }, 1, null);
            BaseTextView tvShareTwitter = binding.f103485p;
            Intrinsics.checkNotNullExpressionValue(tvShareTwitter, "tvShareTwitter");
            C27046k.m66711z(tvShareTwitter, 0L, new Function0() { // from class: b20.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59922u(function1);
                }
            }, 1, null);
            BaseTextView tvShareFacebook = binding.f103480k;
            Intrinsics.checkNotNullExpressionValue(tvShareFacebook, "tvShareFacebook");
            C27046k.m66711z(tvShareFacebook, 0L, new Function0() { // from class: b20.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59923v(function1);
                }
            }, 1, null);
            BaseTextView tvShareTelegram = binding.f103483n;
            Intrinsics.checkNotNullExpressionValue(tvShareTelegram, "tvShareTelegram");
            C27046k.m66711z(tvShareTelegram, 0L, new Function0() { // from class: b20.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59924w(function1);
                }
            }, 1, null);
            BaseTextView tvShareLine = binding.f103481l;
            Intrinsics.checkNotNullExpressionValue(tvShareLine, "tvShareLine");
            C27046k.m66711z(tvShareLine, 0L, new Function0() { // from class: b20.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59925x(function1);
                }
            }, 1, null);
            BaseTextView tvShareMore = binding.f103482m;
            Intrinsics.checkNotNullExpressionValue(tvShareMore, "tvShareMore");
            C27046k.m66711z(tvShareMore, 0L, new Function0() { // from class: b20.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59926y(function1);
                }
            }, 1, null);
            KcPrimaryButton btnSave = binding.f103472c;
            Intrinsics.checkNotNullExpressionValue(btnSave, "btnSave");
            C27046k.m66711z(btnSave, 0L, new Function0() { // from class: b20.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59919r(function1);
                }
            }, 1, null);
            KcSecondaryButton btnCopy = binding.f103471b;
            Intrinsics.checkNotNullExpressionValue(btnCopy, "btnCopy");
            C27046k.m66711z(btnCopy, 0L, new Function0() { // from class: b20.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareChannelView.m59920s(function1);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShareChannelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        LinearLayout linearLayout;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49556b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C45991a>() { // from class: com.kubi.share.lib.widget.ShareChannelView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45991a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C45991a.m101466a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.share_channel_view, (ViewGroup) this, true);
        C45991a binding = getBinding();
        if (binding == null || (linearLayout = binding.f103475f) == null) {
            return;
        }
        linearLayout.setPaddingRelative(0, 0, 0, EdgeToEdgeCompat.f48106a.m58271i());
    }
}
