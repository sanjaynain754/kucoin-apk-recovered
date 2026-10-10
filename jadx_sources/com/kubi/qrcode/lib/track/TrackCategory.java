package com.kubi.qrcode.lib.track;

import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: QrCodeTrack.kt */
/* JADX INFO: loaded from: classes36.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/qrcode/lib/track/TrackCategory;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WITHDRAW", "REDPACKET", "WEB_KYC", "WEB_LOGIN", "WITHDRAW_DIALOG", "OTHERS", "QrCodeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum TrackCategory {
    WITHDRAW(ChannelKycRequest.SCENE_WITHDRAW),
    REDPACKET("redpacket"),
    WEB_KYC("webKyc"),
    WEB_LOGIN("webLogin"),
    WITHDRAW_DIALOG("withdrawDialog"),
    OTHERS(InterfaceC33953u5.f72221q);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f40940c = EnumEntriesKt.enumEntries(m50108a());

    @NotNull
    private final String value;

    @NotNull
    public static EnumEntries<TrackCategory> getEntries() {
        return f40940c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    TrackCategory(String str) {
        this.value = str;
    }
}
