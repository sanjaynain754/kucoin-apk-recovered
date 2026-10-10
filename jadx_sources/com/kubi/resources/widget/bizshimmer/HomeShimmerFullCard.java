package com.kubi.resources.widget.bizshimmer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.bizshimmer.HomeShimmerFullCard;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import k00.C40851o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213dw.InterfaceC36986b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeShimmerFullCard.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\rH\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/resources/widget/bizshimmer/HomeShimmerFullCard;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/ViewShimmerHomeCardFullBinding;", "showMe", "", "hideMe", "onDetachedFromWindow", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeShimmerFullCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeShimmerFullCard.kt\ncom/kubi/resources/widget/bizshimmer/HomeShimmerFullCard\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,58:1\n49#2:59\n*S KotlinDebug\n*F\n+ 1 HomeShimmerFullCard.kt\ncom/kubi/resources/widget/bizshimmer/HomeShimmerFullCard\n*L\n51#1:59\n*E\n"})
public final class HomeShimmerFullCard extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C40851o f44258b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerFullCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerFullCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m54970c() {
        C27100x0.m66924e(new Function0() { // from class: jw.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerFullCard.m54968d(this.f90665b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m54971e() {
        C27100x0.m66924e(new Function0() { // from class: jw.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerFullCard.m54969f(this.f90664b);
            }
        });
    }

    public /* synthetic */ HomeShimmerFullCard(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m54968d(HomeShimmerFullCard homeShimmerFullCard) {
        C27046k.m66700o(homeShimmerFullCard);
        if (homeShimmerFullCard.getChildCount() != 0) {
            homeShimmerFullCard.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m54969f(HomeShimmerFullCard homeShimmerFullCard) {
        C27046k.m66685H(homeShimmerFullCard);
        homeShimmerFullCard.removeAllViews();
        C40851o c40851oM89401c = C40851o.m89401c(LayoutInflater.from(homeShimmerFullCard.getContext()), homeShimmerFullCard, false);
        homeShimmerFullCard.f44258b = c40851oM89401c;
        homeShimmerFullCard.addView(c40851oM89401c.getRoot(), new FrameLayout.LayoutParams(-1, -2));
        C40851o c40851o = homeShimmerFullCard.f44258b;
        if (c40851o == null) {
            return Unit.INSTANCE;
        }
        View v11 = c40851o.f90797b;
        Intrinsics.checkNotNullExpressionValue(v11, "v1");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(v11, Float.valueOf(32.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c40851o.f90798c, c40851o.f90799d, c40851o.f90800e, c40851o.f90801f, c40851o.f90802g, c40851o.f90803h, c40851o.f90804i, c40851o.f90805j}), false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54970c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerFullCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewExtKt.m66577h(this);
    }
}
