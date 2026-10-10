package com.kubi.home.main.shimmer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.kubi.home.R$color;
import com.kubi.home.main.shimmer.NavigationShimmerLayout;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import fj.C37539q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.InterfaceC36986b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NavigationShimmerLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u00020\u0012H\u0002R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/main/shimmer/NavigationShimmerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getInflater", "()Landroid/view/LayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", TIMPushProvider.f75063o, "", TIMPushProvider.f75062n, "createSkeletonsAndShow", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NavigationShimmerLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f25821b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NavigationShimmerLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NavigationShimmerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LayoutInflater getInflater() {
        return (LayoutInflater) this.f25821b.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m29489e() {
        C27100x0.m66923d(new Function0() { // from class: jj.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationShimmerLayout.m29485f(this.f89743b);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m29490g() {
        C27100x0.m66923d(new Function0() { // from class: jj.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationShimmerLayout.m29486h(this.f89742b);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m29491j() {
        C27100x0.m66923d(new Function0() { // from class: jj.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationShimmerLayout.m29488k(this.f89741b);
            }
        });
    }

    public /* synthetic */ NavigationShimmerLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m29485f(NavigationShimmerLayout navigationShimmerLayout) {
        C37539q c37539qM84545c = C37539q.m84545c(navigationShimmerLayout.getInflater(), navigationShimmerLayout, true);
        View icon = c37539qM84545c.f83395b;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        Float fValueOf = Float.valueOf(18.0f);
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(icon, fValueOf);
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        View v11 = c37539qM84545c.f83396c;
        Intrinsics.checkNotNullExpressionValue(v11, "v1");
        InterfaceC36986b interfaceC36986bM54400e2 = C22911a.m54400e(v11, fValueOf);
        if (interfaceC36986bM54400e2 != null) {
            interfaceC36986bM54400e2.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m29486h(NavigationShimmerLayout navigationShimmerLayout) {
        navigationShimmerLayout.removeAllViews();
        ViewExtKt.m66577h(navigationShimmerLayout);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final LayoutInflater m29487i(Context context) {
        return LayoutInflater.from(context);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m29488k(NavigationShimmerLayout navigationShimmerLayout) {
        if (ViewExtKt.m66581l(navigationShimmerLayout)) {
            return Unit.INSTANCE;
        }
        ViewExtKt.m66594y(navigationShimmerLayout);
        navigationShimmerLayout.m29489e();
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NavigationShimmerLayout(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25821b = LazyKt.lazy(new Function0() { // from class: jj.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavigationShimmerLayout.m29487i(context);
            }
        });
        setClickable(true);
        setBackgroundColor(ContextCompat.getColor(context, R$color.c_background));
        ViewExtKt.m66577h(this);
    }
}
