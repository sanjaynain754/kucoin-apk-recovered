package com.kubi.operation.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.operation.lib.entity.BonusTaskEntity;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.OperationHomeHelper;
import com.kubi.operation.lib.widget.Bouns2TaskView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p701vs.C45632i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Bouns2TaskView.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/operation/lib/widget/Bouns2TaskView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fillItems", "", "list", "", "Lcom/kubi/operation/lib/entity/BonusTaskEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBouns2TaskView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bouns2TaskView.kt\ncom/kubi/operation/lib/widget/Bouns2TaskView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1878#2,3:51\n*S KotlinDebug\n*F\n+ 1 Bouns2TaskView.kt\ncom/kubi/operation/lib/widget/Bouns2TaskView\n*L\n32#1:51,3\n*E\n"})
public final class Bouns2TaskView extends LinearLayoutCompat {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Bouns2TaskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Bouns2TaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m43692c(@NotNull final List<BonusTaskEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C27100x0.m66923d(new Function0() { // from class: dt.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Bouns2TaskView.m43690d(this.f82067b, list);
            }
        });
    }

    public /* synthetic */ Bouns2TaskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m43690d(Bouns2TaskView bouns2TaskView, List list) {
        bouns2TaskView.removeAllViews();
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
            C45632i c45632iM100751c = C45632i.m100751c(LayoutInflater.from(bouns2TaskView.getContext()), bouns2TaskView, false);
            c45632iM100751c.f102848c.setText(bonusTaskEntity.getTitle());
            c45632iM100751c.f102849d.setText(C19570t.m43670h(bonusTaskEntity.getSubtitle()));
            c45632iM100751c.f102847b.setText(bonusTaskEntity.getTips());
            LinearLayoutCompat root = c45632iM100751c.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            C27046k.m66711z(root, 0L, new Function0() { // from class: dt.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Bouns2TaskView.m43691e(bonusTaskEntity);
                }
            }, 1, null);
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(0, -2, 1.0f);
            if (i11 != 0) {
                layoutParams.setMarginStart(C27040e.m66658b(12));
            }
            bouns2TaskView.addView(c45632iM100751c.getRoot(), layoutParams);
            i11 = i12;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m43691e(BonusTaskEntity bonusTaskEntity) throws JSONException {
        RouteExKt.m56217H(bonusTaskEntity.getForwardUrl());
        String blockid = bonusTaskEntity.getBlockid();
        if (blockid != null) {
            OperationHomeHelper.m43673e(OperationHomeHelper.f36890a, blockid, null, null, null, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Bouns2TaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
    }
}
