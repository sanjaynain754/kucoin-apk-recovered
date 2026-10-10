package com.kubi.resources.widget.bizshimmer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.bizshimmer.HomeShimmerHalfCard;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import k00.C40852p;
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

/* JADX INFO: compiled from: HomeShimmerHalfCard.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/resources/widget/bizshimmer/HomeShimmerHalfCard;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/res/databinding/ViewShimmerHomeCardHalfBinding;", "showMe", "", "hideMe", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeShimmerHalfCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeShimmerHalfCard.kt\ncom/kubi/resources/widget/bizshimmer/HomeShimmerHalfCard\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,47:1\n49#2:48\n*S KotlinDebug\n*F\n+ 1 HomeShimmerHalfCard.kt\ncom/kubi/resources/widget/bizshimmer/HomeShimmerHalfCard\n*L\n45#1:48\n*E\n"})
public final class HomeShimmerHalfCard extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @Nullable
    public C40852p f44259b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerHalfCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerHalfCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m54976c() {
        C27100x0.m66924e(new Function0() { // from class: jw.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerHalfCard.m54974d(this.f90667b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m54977e() {
        C27100x0.m66924e(new Function0() { // from class: jw.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeShimmerHalfCard.m54975f(this.f90666b);
            }
        });
    }

    public /* synthetic */ HomeShimmerHalfCard(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m54974d(HomeShimmerHalfCard homeShimmerHalfCard) {
        C27046k.m66700o(homeShimmerHalfCard);
        if (homeShimmerHalfCard.getChildCount() != 0) {
            homeShimmerHalfCard.removeAllViews();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m54975f(HomeShimmerHalfCard homeShimmerHalfCard) {
        C27046k.m66685H(homeShimmerHalfCard);
        homeShimmerHalfCard.removeAllViews();
        C40852p c40852pM89404c = C40852p.m89404c(LayoutInflater.from(homeShimmerHalfCard.getContext()), homeShimmerHalfCard, false);
        homeShimmerHalfCard.f44259b = c40852pM89404c;
        homeShimmerHalfCard.addView(c40852pM89404c.getRoot(), new FrameLayout.LayoutParams(-1, -1));
        C40852p c40852p = homeShimmerHalfCard.f44259b;
        if (c40852p == null) {
            return Unit.INSTANCE;
        }
        C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c40852p.f90807b, c40852p.f90808c, c40852p.f90809d}), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeShimmerHalfCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewExtKt.m66577h(this);
    }
}
