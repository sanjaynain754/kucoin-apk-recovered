package com.kubi.advert.api.entity;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromotionConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/advert/api/entity/BackupValue;", "", "text", "", "id", "domain", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "getId", "getDomain", "getEnable", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "AdvertApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BackupValue {

    @Nullable
    private final String domain;
    private final boolean enable;

    @Nullable
    private final String id;

    @Nullable
    private final String text;

    public BackupValue(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.text = str;
        this.id = str2;
        this.domain = str3;
        this.enable = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupValue)) {
            return false;
        }
        BackupValue backupValue = (BackupValue) other;
        return Intrinsics.areEqual(this.text, backupValue.text) && Intrinsics.areEqual(this.id, backupValue.id) && Intrinsics.areEqual(this.domain, backupValue.domain) && this.enable == backupValue.enable;
    }

    public static /* synthetic */ BackupValue copy$default(BackupValue backupValue, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = backupValue.text;
        }
        if ((i11 & 2) != 0) {
            str2 = backupValue.id;
        }
        if ((i11 & 4) != 0) {
            str3 = backupValue.domain;
        }
        if ((i11 & 8) != 0) {
            z11 = backupValue.enable;
        }
        return backupValue.copy(str, str2, str3, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final BackupValue copy(@Nullable String text, @Nullable String id2, @Nullable String domain, boolean enable) {
        return new BackupValue(text, id2, domain, enable);
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.domain;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.enable);
    }

    @NotNull
    public String toString() {
        return "BackupValue(text=" + this.text + ", id=" + this.id + ", domain=" + this.domain + ", enable=" + this.enable + ')';
    }

    public /* synthetic */ BackupValue(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? false : z11);
    }
}
