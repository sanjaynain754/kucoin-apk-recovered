package com.kubi.margin.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TagEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/margin/entity/TagEntity;", "", "plates", "", "Lcom/kubi/margin/entity/Tag;", "tag", "<init>", "(Ljava/util/List;Lcom/kubi/margin/entity/Tag;)V", "getPlates", "()Ljava/util/List;", "getTag", "()Lcom/kubi/margin/entity/Tag;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TagEntity {

    @Nullable
    private final List<Tag> plates;

    @Nullable
    private final Tag tag;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagEntity)) {
            return false;
        }
        TagEntity tagEntity = (TagEntity) other;
        return Intrinsics.areEqual(this.plates, tagEntity.plates) && Intrinsics.areEqual(this.tag, tagEntity.tag);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagEntity copy$default(TagEntity tagEntity, List list, Tag tag, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tagEntity.plates;
        }
        if ((i11 & 2) != 0) {
            tag = tagEntity.tag;
        }
        return tagEntity.copy(list, tag);
    }

    @Nullable
    public final List<Tag> component1() {
        return this.plates;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Tag getTag() {
        return this.tag;
    }

    @NotNull
    public final TagEntity copy(@Nullable List<Tag> plates, @Nullable Tag tag) {
        return new TagEntity(plates, tag);
    }

    @Nullable
    public final List<Tag> getPlates() {
        return this.plates;
    }

    @Nullable
    public final Tag getTag() {
        return this.tag;
    }

    public int hashCode() {
        List<Tag> list = this.plates;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Tag tag = this.tag;
        return iHashCode + (tag != null ? tag.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TagEntity(plates=" + this.plates + ", tag=" + this.tag + ')';
    }

    public TagEntity(@Nullable List<Tag> list, @Nullable Tag tag) {
        this.plates = list;
        this.tag = tag;
    }
}
