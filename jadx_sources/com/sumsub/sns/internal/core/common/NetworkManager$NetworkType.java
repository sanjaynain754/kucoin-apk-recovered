package com.sumsub.sns.internal.core.common;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"com/sumsub/sns/internal/core/common/NetworkManager$NetworkType", "", "Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "OTHER", "WIFI", "MOBILE", "ETHERNET", "M_2G", "M_3G", "M_4G", "M_5G", "LTE", "NONE", "NO_PERMISSION", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum NetworkManager$NetworkType {
    OTHER("Other"),
    WIFI("WiFi"),
    MOBILE("Mobile"),
    ETHERNET("Ethernet"),
    M_2G("2G"),
    M_3G("3G"),
    M_4G("4G"),
    M_5G("5G"),
    LTE("LTE"),
    NONE("None"),
    NO_PERMISSION("No permission");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String type;

    @NotNull
    public static EnumEntries<NetworkManager$NetworkType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    NetworkManager$NetworkType(String str) {
        this.type = str;
    }
}
