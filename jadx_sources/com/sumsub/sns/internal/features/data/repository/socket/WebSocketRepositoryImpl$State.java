package com.sumsub.sns.internal.features.data.repository.socket;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"com/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State", "", "Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepositoryImpl$State;", "<init>", "(Ljava/lang/String;I)V", "", "isDisconnected", "()Z", "DEFAULT", "CONNECTED", "DISCONNECTING", "DISCONNECTED", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
enum WebSocketRepositoryImpl$State {
    DEFAULT,
    CONNECTED,
    DISCONNECTING,
    DISCONNECTED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<WebSocketRepositoryImpl$State> getEntries() {
        return $ENTRIES;
    }

    public final boolean isDisconnected() {
        return this == DISCONNECTED;
    }
}
