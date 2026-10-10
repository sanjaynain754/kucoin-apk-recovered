package com.kubi.kyc.vendor.jumio.p095ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kyc.R$drawable;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.core.C27029c;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: JumioLayoutRejectIndicator.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectIndicator;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "showPoints", "", "count", "initialIndex", "selectPosition", ViewProps.POSITION, "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioLayoutRejectIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioLayoutRejectIndicator.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectIndicator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1869#2,2:54\n1869#2:56\n1870#2:58\n1#3:57\n*S KotlinDebug\n*F\n+ 1 JumioLayoutRejectIndicator.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioLayoutRejectIndicator\n*L\n34#1:54,2\n48#1:56\n48#1:58\n*E\n"})
public final class JumioLayoutRejectIndicator extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutRejectIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutRejectIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m37336c(final int i11) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutRejectIndicator.m37334d(this.f31641b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m37337e(final int i11, final int i12) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JumioLayoutRejectIndicator.m37335f(this.f31645b, i11, i12);
            }
        });
    }

    public /* synthetic */ JumioLayoutRejectIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m37334d(JumioLayoutRejectIndicator jumioLayoutRejectIndicator, int i11) {
        boolean z11;
        if (jumioLayoutRejectIndicator.getChildCount() <= 1) {
            return Unit.INSTANCE;
        }
        Iterator<Integer> it = RangesKt.until(0, jumioLayoutRejectIndicator.getChildCount()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            View childAt = jumioLayoutRejectIndicator.getChildAt(iNextInt);
            if (childAt != null) {
                if (i11 == iNextInt) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                childAt.setSelected(z11);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m37335f(JumioLayoutRejectIndicator jumioLayoutRejectIndicator, int i11, int i12) {
        boolean z11;
        jumioLayoutRejectIndicator.removeAllViews();
        if (i11 <= 1) {
            return Unit.INSTANCE;
        }
        Iterator<Integer> it = RangesKt.until(0, i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            ImageView imageView = new ImageView(jumioLayoutRejectIndicator.getContext());
            imageView.setImageResource(R$drawable.selector_indicator_reject_view);
            if (i12 == iNextInt) {
                z11 = true;
            } else {
                z11 = false;
            }
            imageView.setSelected(z11);
            jumioLayoutRejectIndicator.addView(imageView, new LinearLayout.LayoutParams(C27029c.m66601d(jumioLayoutRejectIndicator, 8), -2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public JumioLayoutRejectIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(17);
    }
}
