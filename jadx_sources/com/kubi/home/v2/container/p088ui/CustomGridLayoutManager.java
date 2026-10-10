package com.kubi.home.v2.container.p088ui;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.CardStyle;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562qj.C43745a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomGridLayoutManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0006\u0010\u0016\u001a\u00020\u0015J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u001aJ(\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/CustomGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "spanCount", "", "adapter", "Lcom/kubi/home/v2/container/ui/GridAdapter;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "<init>", "(Landroid/content/Context;ILcom/kubi/home/v2/container/ui/GridAdapter;)V", "extraHeight", "calculateExtraLayoutSpace", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "extraLayoutSpace", "", "limitY", "Ljava/lang/Integer;", "isEditState", "", "isTotalDyNull", "updateHomeFeedState", "isEdit", "dy", "(ZLjava/lang/Integer;)V", "scrollVerticallyBy", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Companion f26513g = new Companion(null);

    /* JADX INFO: renamed from: b */
    public final int f26514b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final C43745a<BaseCardDataV2> f26515c;

    /* JADX INFO: renamed from: d */
    public final int f26516d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Integer f26517e;

    /* JADX INFO: renamed from: f */
    public boolean f26518f;

    /* JADX INFO: compiled from: CustomGridLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/CustomGridLayoutManager$Companion;", "", "<init>", "()V", "TAG", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.container.ui.CustomGridLayoutManager$a */
    /* JADX INFO: compiled from: CustomGridLayoutManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m90084d2 = {"com/kubi/home/v2/container/ui/CustomGridLayoutManager$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", ViewProps.POSITION, "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15001a extends GridLayoutManager.SpanSizeLookup {
        public C15001a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int position) {
            BaseCardDataV2 baseCardDataV2;
            CardStyle style;
            List data = CustomGridLayoutManager.this.f26515c.getData();
            Integer numValueOf = (data == null || (baseCardDataV2 = (BaseCardDataV2) CollectionsKt.getOrNull(data, position)) == null || (style = baseCardDataV2.getStyle()) == null) ? null : Integer.valueOf(style.getGridType());
            if (numValueOf != null && numValueOf.intValue() == 2) {
                return 1;
            }
            return CustomGridLayoutManager.this.f26514b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomGridLayoutManager(@NotNull Context context, int i11, @NotNull C43745a<BaseCardDataV2> adapter) {
        super(context, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f26514b = i11;
        this.f26515c = adapter;
        this.f26516d = C5267e0.m6182d() / 2;
        setSpanSizeLookup(new C15001a());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m30819e(CustomGridLayoutManager customGridLayoutManager, boolean z11, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        customGridLayoutManager.m30821d(z11, num);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m30820c() {
        return this.f26517e == null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void calculateExtraLayoutSpace(@NotNull RecyclerView.State state, @NotNull int[] extraLayoutSpace) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
        super.calculateExtraLayoutSpace(state, extraLayoutSpace);
        int i11 = extraLayoutSpace[0];
        int i12 = this.f26516d;
        extraLayoutSpace[0] = i11 + i12;
        extraLayoutSpace[1] = extraLayoutSpace[1] + i12;
    }

    /* JADX INFO: renamed from: d */
    public final void m30821d(boolean z11, @Nullable Integer num) {
        if (z11 != this.f26518f) {
            this.f26517e = num;
            this.f26518f = z11;
        } else if (this.f26517e == null) {
            this.f26517e = num;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int dy2, @Nullable RecyclerView.Recycler recycler, @Nullable RecyclerView.State state) {
        Integer num = this.f26517e;
        if (!this.f26518f || num == null) {
            return super.scrollVerticallyBy(dy2, recycler, state);
        }
        if (dy2 > 0 && num.intValue() - dy2 < 0) {
            dy2 = num.intValue();
        }
        this.f26517e = Integer.valueOf(num.intValue() - dy2);
        return super.scrollVerticallyBy(dy2, recycler, state);
    }
}
