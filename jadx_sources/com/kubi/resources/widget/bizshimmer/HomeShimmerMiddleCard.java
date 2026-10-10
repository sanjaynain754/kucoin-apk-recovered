package com.kubi.resources.widget.bizshimmer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.bizshimmer.HomeShimmerMiddleCard;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import k00.C40853q;
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

/* JADX INFO: compiled from: HomeShimmerMiddleCard.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/widget/bizshimmer/HomeShimmerMiddleCard;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/ViewShimmerHomeCardMiddleBinding;", "showMe", "", "hideMe", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeShimmerMiddleCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeShimmerMiddleCard.kt\ncom/kubi/resources/widget/bizshimmer/HomeShimmerMiddleCard\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,48:1\n49#2:49\n*S KotlinDebug\n*F\n+ 1 HomeShimmerMiddleCard.kt\ncom/kubi/resources/widget/bizshimmer/HomeShimmerMiddleCard\n*L\n46#1:49\n*E\n"})
public final class HomeShimmerMiddleCard extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C40853q f44260b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerMiddleCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerMiddleCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m54982c() {
        C27100x0.m66924e(new Function0() { // from class: jw.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerMiddleCard.m54980d(this.f90669b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m54983e() {
        C27100x0.m66924e(new Function0() { // from class: jw.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerMiddleCard.m54981f(this.f90668b);
            }
        });
    }

    public /* synthetic */ HomeShimmerMiddleCard(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m54980d(HomeShimmerMiddleCard homeShimmerMiddleCard) {
        C27046k.m66700o(homeShimmerMiddleCard);
        if (homeShimmerMiddleCard.getChildCount() != 0) {
            homeShimmerMiddleCard.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m54981f(HomeShimmerMiddleCard homeShimmerMiddleCard) {
        C27046k.m66685H(homeShimmerMiddleCard);
        homeShimmerMiddleCard.removeAllViews();
        C40853q c40853qM89407c = C40853q.m89407c(LayoutInflater.from(homeShimmerMiddleCard.getContext()), homeShimmerMiddleCard, false);
        homeShimmerMiddleCard.f44260b = c40853qM89407c;
        homeShimmerMiddleCard.addView(c40853qM89407c.getRoot(), new FrameLayout.LayoutParams(-1, -2));
        C40853q c40853q = homeShimmerMiddleCard.f44260b;
        if (c40853q == null) {
            return Unit.INSTANCE;
        }
        C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c40853q.f90811b, c40853q.f90812c}), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerMiddleCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewExtKt.m66577h(this);
    }
}
