package com.kubi.quotefacade.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.blankj.utilcode.util.C5303w0;
import com.google.android.material.navigation.NavigationBarView;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.view.MultiTokenLogoView;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MultiTokenLogoView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ\u001e\u0010\u0011\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/quotefacade/view/MultiTokenLogoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp17", "dpN6", "setLogoList", "", "logoList", "", "", "addIcons", "isRtl", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiTokenLogoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiTokenLogoView.kt\ncom/kubi/quotefacade/view/MultiTokenLogoView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1878#2,3:71\n*S KotlinDebug\n*F\n+ 1 MultiTokenLogoView.kt\ncom/kubi/quotefacade/view/MultiTokenLogoView\n*L\n52#1:71,3\n*E\n"})
public final class MultiTokenLogoView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public final int f42741b;

    /* JADX INFO: renamed from: c */
    public final int f42742c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiTokenLogoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: i */
    public static final void m53314i(MultiTokenLogoView multiTokenLogoView, List list) {
        multiTokenLogoView.m53315e(list, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiTokenLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public final void m53315e(final List<String> list, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: sv.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiTokenLogoView.m53311f(this.f98833b, list, z11);
            }
        });
    }

    public final void setLogoList(@Nullable final List<String> logoList) {
        C27100x0.m66923d(new Function0() { // from class: sv.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiTokenLogoView.m53313h(this.f98829b, logoList);
            }
        });
    }

    public /* synthetic */ MultiTokenLogoView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m53311f(MultiTokenLogoView multiTokenLogoView, List list, boolean z11) {
        int i11;
        int iAbs;
        Context context = multiTokenLogoView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM66699n = C27046k.m66699n(context, R$color.c_overlay);
        int width = multiTokenLogoView.getWidth();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final String str = (String) obj;
            Context context2 = multiTokenLogoView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            final CoinAvatarView coinAvatarView = new CoinAvatarView(context2, null, 2, null);
            coinAvatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            coinAvatarView.setStrokeColor(iM66699n);
            int i14 = multiTokenLogoView.f42741b;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i14, i14);
            if (z11) {
                if (i12 == 0) {
                    iAbs = width - multiTokenLogoView.f42741b;
                } else {
                    iAbs = (-(multiTokenLogoView.f42741b * 2)) + Math.abs(multiTokenLogoView.f42742c);
                }
                layoutParams.setMarginStart(iAbs);
            } else {
                if (i12 == 0) {
                    i11 = 0;
                } else {
                    i11 = multiTokenLogoView.f42742c;
                }
                layoutParams.setMarginStart(i11);
            }
            coinAvatarView.setLayoutParams(layoutParams);
            multiTokenLogoView.addView(coinAvatarView);
            C27100x0.m66923d(new Function0() { // from class: sv.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiTokenLogoView.m53312g(coinAvatarView, str);
                }
            });
            i12 = i13;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m53312g(CoinAvatarView coinAvatarView, String str) {
        C24277v.m58542g(coinAvatarView, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m53313h(final MultiTokenLogoView multiTokenLogoView, final List list) {
        multiTokenLogoView.removeAllViews();
        if (list != null && !list.isEmpty()) {
            if (C5303w0.m6511a()) {
                C22912t.m54416n(multiTokenLogoView, new Runnable() { // from class: sv.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        MultiTokenLogoView.m53314i(this.f98831b, list);
                    }
                });
            } else {
                multiTokenLogoView.m53315e(list, false);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiTokenLogoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        this.f42741b = C27040e.m66658b(17);
        this.f42742c = C27040e.m66658b(-6);
    }
}
