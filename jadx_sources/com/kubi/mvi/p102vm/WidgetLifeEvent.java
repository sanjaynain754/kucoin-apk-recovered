package com.kubi.mvi.p102vm;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: WidgetLifeEvent.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mvi/vm/WidgetLifeEvent;", "", "(Ljava/lang/String;I)V", "IDLE", "ON_SHOW", "ON_HIDE", "ON_DESTROY", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public enum WidgetLifeEvent {
    IDLE,
    ON_SHOW,
    ON_HIDE,
    ON_DESTROY;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f35715c = EnumEntriesKt.enumEntries(m42726a());

    @NotNull
    public static EnumEntries<WidgetLifeEvent> getEntries() {
        return f35715c;
    }
}
