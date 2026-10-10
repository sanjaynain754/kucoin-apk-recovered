package com.kubi.share.api.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PageTextConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/share/api/entity/PageTextConfigEntity;", "", "businessLine", "", "properties", "", "Lcom/kubi/share/api/entity/ConfigProperty;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBusinessLine", "()Ljava/lang/String;", "setBusinessLine", "(Ljava/lang/String;)V", "getProperties", "()Ljava/util/List;", "setProperties", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PageTextConfigEntity {

    @Nullable
    private String businessLine;

    @Nullable
    private List<ConfigProperty> properties;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageTextConfigEntity)) {
            return false;
        }
        PageTextConfigEntity pageTextConfigEntity = (PageTextConfigEntity) other;
        return Intrinsics.areEqual(this.businessLine, pageTextConfigEntity.businessLine) && Intrinsics.areEqual(this.properties, pageTextConfigEntity.properties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageTextConfigEntity copy$default(PageTextConfigEntity pageTextConfigEntity, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pageTextConfigEntity.businessLine;
        }
        if ((i11 & 2) != 0) {
            list = pageTextConfigEntity.properties;
        }
        return pageTextConfigEntity.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusinessLine() {
        return this.businessLine;
    }

    @Nullable
    public final List<ConfigProperty> component2() {
        return this.properties;
    }

    @NotNull
    public final PageTextConfigEntity copy(@Nullable String businessLine, @Nullable List<ConfigProperty> properties) {
        return new PageTextConfigEntity(businessLine, properties);
    }

    @Nullable
    public final String getBusinessLine() {
        return this.businessLine;
    }

    @Nullable
    public final List<ConfigProperty> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.businessLine;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ConfigProperty> list = this.properties;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setBusinessLine(@Nullable String str) {
        this.businessLine = str;
    }

    public final void setProperties(@Nullable List<ConfigProperty> list) {
        this.properties = list;
    }

    @NotNull
    public String toString() {
        return "PageTextConfigEntity(businessLine=" + this.businessLine + ", properties=" + this.properties + ')';
    }

    public PageTextConfigEntity(@Nullable String str, @Nullable List<ConfigProperty> list) {
        this.businessLine = str;
        this.properties = list;
    }
}
