package com.kubi.sdk.eventhub;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: NativeEventHubCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/EventHubSkipReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NOT_FOUND", "NOT_SUBSCRIBED", "TECH_STACK_FILTERED", "INVALID_TOPIC", "INVALID_TARGET", "SEND_FAILED", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum EventHubSkipReason {
    NOT_FOUND("notFound"),
    NOT_SUBSCRIBED("notSubscribed"),
    TECH_STACK_FILTERED("techStackFiltered"),
    INVALID_TOPIC("invalidTopic"),
    INVALID_TARGET("invalidTarget"),
    SEND_FAILED("sendFailed");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f46554c = EnumEntriesKt.enumEntries(m56612a());

    @NotNull
    private final String value;

    @NotNull
    public static EnumEntries<EventHubSkipReason> getEntries() {
        return f46554c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    EventHubSkipReason(String str) {
        this.value = str;
    }
}
