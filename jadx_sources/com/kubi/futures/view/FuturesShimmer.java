package com.kubi.futures.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.kubi.kumex.R$layout;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.shimmer.SkeletonLayout;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p213dw.InterfaceC36986b;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: FuturesShimmer.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\tH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/view/FuturesShimmer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isPlay", "", "play", "", InterfaceC33730j9.f70350a, "onAttachedToWindow", "onDetachedFromWindow", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesShimmer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesShimmer.kt\ncom/kubi/futures/view/FuturesShimmer\n+ 2 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n372#2:53\n372#2:60\n1549#3:54\n1620#3,3:55\n1869#3,2:58\n1549#3:61\n1620#3,3:62\n1869#3,2:65\n*S KotlinDebug\n*F\n+ 1 FuturesShimmer.kt\ncom/kubi/futures/view/FuturesShimmer\n*L\n28#1:53\n36#1:60\n28#1:54\n28#1:55,3\n28#1:58,2\n36#1:61\n36#1:62,3\n36#1:65,2\n*E\n"})
public final class FuturesShimmer extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public boolean f24986n;

    /* JADX INFO: renamed from: g */
    public final void m28822g() {
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof SkeletonLayout) {
                ((SkeletonLayout) view).m54395d();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesShimmer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R$layout.bkumex_shimmer, this);
    }

    /* JADX INFO: renamed from: f */
    public final void m28821f() {
        if (this.f24986n) {
            return;
        }
        this.f24986n = true;
        IntRange intRangeUntil = RangesKt.until(0, getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (!(view instanceof Guideline)) {
                Intrinsics.checkNotNull(view);
                InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(view, null, 1, null);
                if (interfaceC36986bM54399d != null) {
                    interfaceC36986bM54399d.mo54393a();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m28821f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m28822g();
    }
}
