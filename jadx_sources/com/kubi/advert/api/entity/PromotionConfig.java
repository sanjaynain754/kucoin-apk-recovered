package com.kubi.advert.api.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromotionConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/advert/api/entity/PromotionConfig;", "", "businessLine", "", "properties", "", "Lcom/kubi/advert/api/entity/Property;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBusinessLine", "()Ljava/lang/String;", "getProperties", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "AdvertApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PromotionConfig {

    @Nullable
    private final String businessLine;

    @Nullable
    private final List<Property> properties;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionConfig)) {
            return false;
        }
        PromotionConfig promotionConfig = (PromotionConfig) other;
        return Intrinsics.areEqual(this.businessLine, promotionConfig.businessLine) && Intrinsics.areEqual(this.properties, promotionConfig.properties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionConfig copy$default(PromotionConfig promotionConfig, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = promotionConfig.businessLine;
        }
        if ((i11 & 2) != 0) {
            list = promotionConfig.properties;
        }
        return promotionConfig.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBusinessLine() {
        return this.businessLine;
    }

    @Nullable
    public final List<Property> component2() {
        return this.properties;
    }

    @NotNull
    public final PromotionConfig copy(@Nullable String businessLine, @Nullable List<Property> properties) {
        return new PromotionConfig(businessLine, properties);
    }

    @Nullable
    public final String getBusinessLine() {
        return this.businessLine;
    }

    @Nullable
    public final List<Property> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.businessLine;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Property> list = this.properties;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PromotionConfig(businessLine=" + this.businessLine + ", properties=" + this.properties + ')';
    }

    public PromotionConfig(@Nullable String str, @Nullable List<Property> list) {
        this.businessLine = str;
        this.properties = list;
    }
}
