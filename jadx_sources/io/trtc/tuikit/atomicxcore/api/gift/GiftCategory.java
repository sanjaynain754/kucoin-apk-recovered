package io.trtc.tuikit.atomicxcore.api.gift;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "", "categoryID", "", "name", "desc", "extensionInfo", "", "giftList", "", "Lio/trtc/tuikit/atomicxcore/api/gift/Gift;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getCategoryID", "()Ljava/lang/String;", "getDesc", "getExtensionInfo", "()Ljava/util/Map;", "getGiftList", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class GiftCategory {

    @NotNull
    private final String categoryID;

    @NotNull
    private final String desc;

    @NotNull
    private final Map<String, String> extensionInfo;

    @NotNull
    private final List<Gift> giftList;

    @NotNull
    private final String name;

    public GiftCategory() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftCategory)) {
            return false;
        }
        GiftCategory giftCategory = (GiftCategory) other;
        return Intrinsics.areEqual(this.categoryID, giftCategory.categoryID) && Intrinsics.areEqual(this.name, giftCategory.name) && Intrinsics.areEqual(this.desc, giftCategory.desc) && Intrinsics.areEqual(this.extensionInfo, giftCategory.extensionInfo) && Intrinsics.areEqual(this.giftList, giftCategory.giftList);
    }

    public GiftCategory(@NotNull String categoryID, @NotNull String name, @NotNull String desc, @NotNull Map<String, String> extensionInfo, @NotNull List<Gift> giftList) {
        Intrinsics.checkNotNullParameter(categoryID, "categoryID");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        Intrinsics.checkNotNullParameter(giftList, "giftList");
        this.categoryID = categoryID;
        this.name = name;
        this.desc = desc;
        this.extensionInfo = extensionInfo;
        this.giftList = giftList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftCategory copy$default(GiftCategory giftCategory, String str, String str2, String str3, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = giftCategory.categoryID;
        }
        if ((i11 & 2) != 0) {
            str2 = giftCategory.name;
        }
        if ((i11 & 4) != 0) {
            str3 = giftCategory.desc;
        }
        if ((i11 & 8) != 0) {
            map = giftCategory.extensionInfo;
        }
        if ((i11 & 16) != 0) {
            list = giftCategory.giftList;
        }
        List list2 = list;
        String str4 = str3;
        return giftCategory.copy(str, str2, str4, map, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategoryID() {
        return this.categoryID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.extensionInfo;
    }

    @NotNull
    public final List<Gift> component5() {
        return this.giftList;
    }

    @NotNull
    public final GiftCategory copy(@NotNull String categoryID, @NotNull String name, @NotNull String desc, @NotNull Map<String, String> extensionInfo, @NotNull List<Gift> giftList) {
        Intrinsics.checkNotNullParameter(categoryID, "categoryID");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        Intrinsics.checkNotNullParameter(giftList, "giftList");
        return new GiftCategory(categoryID, name, desc, extensionInfo, giftList);
    }

    @NotNull
    public final String getCategoryID() {
        return this.categoryID;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final Map<String, String> getExtensionInfo() {
        return this.extensionInfo;
    }

    @NotNull
    public final List<Gift> getGiftList() {
        return this.giftList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.giftList.hashCode() + ((this.extensionInfo.hashCode() + AbstractC39391a.m88220a(this.desc, AbstractC39391a.m88220a(this.name, this.categoryID.hashCode() * 31, 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "GiftCategory(categoryID=" + this.categoryID + ", name=" + this.name + ", desc=" + this.desc + ", extensionInfo=" + this.extensionInfo + ", giftList=" + this.giftList + ')';
    }

    public /* synthetic */ GiftCategory(String str, String str2, String str3, Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? MapsKt.emptyMap() : map, (i11 & 16) != 0 ? CollectionsKt.emptyList() : list);
    }
}
