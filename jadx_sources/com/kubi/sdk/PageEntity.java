package com.kubi.sdk;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BasePageAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BE\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJZ\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/PageEntity;", ExifInterface.GPS_DIRECTION_TRUE, "", FirebaseAnalytics.Param.ITEMS, "", "hasNext", "", "context", "Lcom/kubi/sdk/PageContext;", TypedValues.CycleType.S_WAVE_OFFSET, "", "trialOffset", "totalNum", "", "<init>", "(Ljava/util/List;ZLcom/kubi/sdk/PageContext;IILjava/lang/Long;)V", "getItems", "()Ljava/util/List;", "getHasNext", "()Z", "getContext", "()Lcom/kubi/sdk/PageContext;", "getOffset", "()I", "getTrialOffset", "getTotalNum", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;ZLcom/kubi/sdk/PageContext;IILjava/lang/Long;)Lcom/kubi/sdk/PageEntity;", "equals", "other", "hashCode", "toString", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PageEntity<T> {

    @SerializedName("context")
    @Nullable
    private final PageContext context;

    @SerializedName("hasNext")
    private final boolean hasNext;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    @NotNull
    private final List<T> items;

    @SerializedName(TypedValues.CycleType.S_WAVE_OFFSET)
    private final int offset;

    @Nullable
    private final Long totalNum;

    @SerializedName("trialOffset")
    private final int trialOffset;

    public PageEntity(@NotNull List<T> items, boolean z11, @Nullable PageContext pageContext, int i11, int i12, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.hasNext = z11;
        this.context = pageContext;
        this.offset = i11;
        this.trialOffset = i12;
        this.totalNum = l11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageEntity)) {
            return false;
        }
        PageEntity pageEntity = (PageEntity) other;
        return Intrinsics.areEqual(this.items, pageEntity.items) && this.hasNext == pageEntity.hasNext && Intrinsics.areEqual(this.context, pageEntity.context) && this.offset == pageEntity.offset && this.trialOffset == pageEntity.trialOffset && Intrinsics.areEqual(this.totalNum, pageEntity.totalNum);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageEntity copy$default(PageEntity pageEntity, List list, boolean z11, PageContext pageContext, int i11, int i12, Long l11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = pageEntity.items;
        }
        if ((i13 & 2) != 0) {
            z11 = pageEntity.hasNext;
        }
        if ((i13 & 4) != 0) {
            pageContext = pageEntity.context;
        }
        if ((i13 & 8) != 0) {
            i11 = pageEntity.offset;
        }
        if ((i13 & 16) != 0) {
            i12 = pageEntity.trialOffset;
        }
        if ((i13 & 32) != 0) {
            l11 = pageEntity.totalNum;
        }
        int i14 = i12;
        Long l12 = l11;
        return pageEntity.copy(list, z11, pageContext, i11, i14, l12);
    }

    @NotNull
    public final List<T> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PageContext getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTrialOffset() {
        return this.trialOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTotalNum() {
        return this.totalNum;
    }

    @NotNull
    public final PageEntity<T> copy(@NotNull List<T> items, boolean hasNext, @Nullable PageContext context, int offset, int trialOffset, @Nullable Long totalNum) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PageEntity<>(items, hasNext, context, offset, trialOffset, totalNum);
    }

    @Nullable
    public final PageContext getContext() {
        return this.context;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final List<T> getItems() {
        return this.items;
    }

    public final int getOffset() {
        return this.offset;
    }

    @Nullable
    public final Long getTotalNum() {
        return this.totalNum;
    }

    public final int getTrialOffset() {
        return this.trialOffset;
    }

    public int hashCode() {
        int iHashCode = ((this.items.hashCode() * 31) + Boolean.hashCode(this.hasNext)) * 31;
        PageContext pageContext = this.context;
        int iHashCode2 = (((((iHashCode + (pageContext == null ? 0 : pageContext.hashCode())) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.trialOffset)) * 31;
        Long l11 = this.totalNum;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PageEntity(items=" + this.items + ", hasNext=" + this.hasNext + ", context=" + this.context + ", offset=" + this.offset + ", trialOffset=" + this.trialOffset + ", totalNum=" + this.totalNum + ')';
    }

    public /* synthetic */ PageEntity(List list, boolean z11, PageContext pageContext, int i11, int i12, Long l11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new ArrayList() : list, z11, pageContext, i11, i12, (i13 & 32) != 0 ? null : l11);
    }
}
