package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.bugly.proguard.C33616e0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0013\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bHÆ\u0003Jj\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/PayMethodSelect;", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", TUIConstants.TUIChat.INPUT_MORE_ICON, "id", "name", "selected", C33616e0.f69644s, "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIcon", "getId", "getName", "getSelected", "getTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/kubi/payment/third/data/entities/PayMethodSelect;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayMethodSelect {

    @Nullable
    private final String description;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final String icon;

    @Nullable
    private final String id;

    @Nullable
    private final String name;

    @Nullable
    private final Boolean selected;

    @SerializedName(C33616e0.f69644s)
    @Nullable
    private final List<String> tags;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayMethodSelect)) {
            return false;
        }
        PayMethodSelect payMethodSelect = (PayMethodSelect) other;
        return Intrinsics.areEqual(this.description, payMethodSelect.description) && Intrinsics.areEqual(this.enable, payMethodSelect.enable) && Intrinsics.areEqual(this.icon, payMethodSelect.icon) && Intrinsics.areEqual(this.id, payMethodSelect.id) && Intrinsics.areEqual(this.name, payMethodSelect.name) && Intrinsics.areEqual(this.selected, payMethodSelect.selected) && Intrinsics.areEqual(this.tags, payMethodSelect.tags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayMethodSelect copy$default(PayMethodSelect payMethodSelect, String str, Boolean bool, String str2, String str3, String str4, Boolean bool2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payMethodSelect.description;
        }
        if ((i11 & 2) != 0) {
            bool = payMethodSelect.enable;
        }
        if ((i11 & 4) != 0) {
            str2 = payMethodSelect.icon;
        }
        if ((i11 & 8) != 0) {
            str3 = payMethodSelect.id;
        }
        if ((i11 & 16) != 0) {
            str4 = payMethodSelect.name;
        }
        if ((i11 & 32) != 0) {
            bool2 = payMethodSelect.selected;
        }
        if ((i11 & 64) != 0) {
            list = payMethodSelect.tags;
        }
        Boolean bool3 = bool2;
        List list2 = list;
        String str5 = str4;
        String str6 = str2;
        return payMethodSelect.copy(str, bool, str6, str3, str5, bool3, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final List<String> component7() {
        return this.tags;
    }

    @NotNull
    public final PayMethodSelect copy(@Nullable String description, @Nullable Boolean enable, @Nullable String icon, @Nullable String id2, @Nullable String name, @Nullable Boolean selected, @Nullable List<String> tags) {
        return new PayMethodSelect(description, enable, icon, id2, name, selected, tags);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.tags;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PayMethodSelect(description=" + this.description + ", enable=" + this.enable + ", icon=" + this.icon + ", id=" + this.id + ", name=" + this.name + ", selected=" + this.selected + ", tags=" + this.tags + ')';
    }

    public PayMethodSelect(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool2, @Nullable List<String> list) {
        this.description = str;
        this.enable = bool;
        this.icon = str2;
        this.id = str3;
        this.name = str4;
        this.selected = bool2;
        this.tags = list;
    }
}
