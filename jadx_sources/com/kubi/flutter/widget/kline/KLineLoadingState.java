package com.kubi.flutter.widget.kline;

import com.google.common.net.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: KLineContract.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/flutter/widget/kline/KLineLoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "Loading", HttpHeaders.REFRESH, "LoadSuccess", "LoadFailed", "Problem", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum KLineLoadingState {
    Loading,
    Refresh,
    LoadSuccess,
    LoadFailed,
    Problem;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f22374c = EnumEntriesKt.enumEntries(m24173a());

    @NotNull
    public static EnumEntries<KLineLoadingState> getEntries() {
        return f22374c;
    }
}
