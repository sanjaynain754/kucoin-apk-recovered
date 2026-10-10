package com.kubi.operation.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.operation.lib.entity.BonusTaskEntity;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.OperationHomeHelper;
import com.kubi.operation.lib.widget.Bouns3TaskView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p701vs.C45631h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Bouns3TaskView.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/operation/lib/widget/Bouns3TaskView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fillItems", "", "list", "", "Lcom/kubi/operation/lib/entity/BonusTaskEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBouns3TaskView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bouns3TaskView.kt\ncom/kubi/operation/lib/widget/Bouns3TaskView\n+ 2 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n372#2:66\n372#2:73\n1549#3:67\n1620#3,3:68\n1869#3,2:71\n1549#3:74\n1620#3,3:75\n1869#3,2:78\n1878#3,3:80\n*S KotlinDebug\n*F\n+ 1 Bouns3TaskView.kt\ncom/kubi/operation/lib/widget/Bouns3TaskView\n*L\n55#1:66\n57#1:73\n55#1:67\n55#1:68,3\n55#1:71,2\n57#1:74\n57#1:75,3\n57#1:78,2\n34#1:80,3\n*E\n"})
public final class Bouns3TaskView extends LinearLayoutCompat {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Bouns3TaskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Bouns3TaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: h */
    public static final void m43699h(final Bouns3TaskView bouns3TaskView) {
        C27100x0.m66924e(new Function0() { // from class: dt.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Bouns3TaskView.m43700i(this.f82074b);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m43701e(@NotNull final List<BonusTaskEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C27100x0.m66923d(new Function0() { // from class: dt.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Bouns3TaskView.m43697f(this.f82070b, list);
            }
        });
    }

    public /* synthetic */ Bouns3TaskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m43697f(final Bouns3TaskView bouns3TaskView, List list) {
        bouns3TaskView.removeAllViews();
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final BonusTaskEntity bonusTaskEntity = (BonusTaskEntity) obj;
            C45631h c45631hM100748c = C45631h.m100748c(LayoutInflater.from(bouns3TaskView.getContext()), bouns3TaskView, false);
            c45631hM100748c.f102844c.setText(bonusTaskEntity.getTitle());
            c45631hM100748c.f102845d.setText(C19570t.m43670h(bonusTaskEntity.getSubtitle()));
            c45631hM100748c.f102843b.setText(bonusTaskEntity.getTips());
            LinearLayoutCompat root = c45631hM100748c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C27046k.m66711z(root, 0L, new Function0() { // from class: dt.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Bouns3TaskView.m43698g(bonusTaskEntity);
                }
            }, 1, null);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(0, -2, 1.0f);
            if (i11 != 0) {
                layoutParams.setMarginStart(C27040e.m66658b(8));
            }
            bouns3TaskView.addView(c45631hM100748c.getRoot(), layoutParams);
            i11 = i12;
        }
        bouns3TaskView.post(new Runnable() { // from class: dt.e
            @Override // java.lang.Runnable
            public final void run() {
                Bouns3TaskView.m43699h(this.f82073b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m43698g(BonusTaskEntity bonusTaskEntity) throws JSONException {
        RouteExKt.m56217H(bonusTaskEntity.getForwardUrl());
        String blockid = bonusTaskEntity.getBlockid();
        if (blockid != null) {
            OperationHomeHelper.m43673e(OperationHomeHelper.f36890a, blockid, null, null, null, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m43700i(Bouns3TaskView bouns3TaskView) {
        IntRange intRangeUntil = RangesKt.until(0, bouns3TaskView.getChildCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(bouns3TaskView.getChildAt(((IntIterator) it).nextInt()));
        }
        Iterator it2 = arrayList.iterator();
        int iCoerceAtLeast = 0;
        while (it2.hasNext()) {
            iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, ((View) it2.next()).getHeight());
        }
        IntRange intRangeUntil2 = RangesKt.until(0, bouns3TaskView.getChildCount());
        ArrayList<View> arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
        Iterator<Integer> it3 = intRangeUntil2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(bouns3TaskView.getChildAt(((IntIterator) it3).nextInt()));
        }
        for (View view : arrayList2) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = iCoerceAtLeast;
            view.setLayoutParams(layoutParams);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Bouns3TaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
    }
}
