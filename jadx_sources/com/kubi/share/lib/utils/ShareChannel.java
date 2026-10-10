package com.kubi.share.lib.utils;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'More' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: ShareChannel.kt */
/* JADX INFO: loaded from: classes46.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/share/lib/utils/ShareChannel;", "", "pkgName", "", "className", "isApp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getPkgName", "()Ljava/lang/String;", "getClassName", "()Z", "Twitter", "Facebook", "Telegram", "Line", "More", "Save", "Copy", "ShareLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ShareChannel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShareChannel[] $VALUES;
    public static final ShareChannel Copy;
    public static final ShareChannel More;
    public static final ShareChannel Save;

    @NotNull
    private final String className;
    private final boolean isApp;

    @NotNull
    private final String pkgName;
    public static final ShareChannel Twitter = new ShareChannel("Twitter", 0, "com.twitter.android", null, true, 2, null);
    public static final ShareChannel Facebook = new ShareChannel("Facebook", 1, "com.facebook.katana", null, true, 2, null);
    public static final ShareChannel Telegram = new ShareChannel("Telegram", 2, "org.telegram.messenger", null, true, 2, null);
    public static final ShareChannel Line = new ShareChannel("Line", 3, "jp.naver.line", "jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity", true);

    private ShareChannel(String str, int i11, String str2, String str3, boolean z11) {
        super(str, i11);
        this.pkgName = str2;
        this.className = str3;
        this.isApp = z11;
    }

    private static final /* synthetic */ ShareChannel[] $values() {
        return new ShareChannel[]{Twitter, Facebook, Telegram, Line, More, Save, Copy};
    }

    static {
        String str = null;
        More = new ShareChannel("More", 4, null, str, false, 3, null);
        String str2 = null;
        Save = new ShareChannel("Save", 5, str, str2, false, 3, null);
        Copy = new ShareChannel("Copy", 6, str2, null, false, 3, null);
        ShareChannel[] shareChannelArr$values = $values();
        $VALUES = shareChannelArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shareChannelArr$values);
    }

    public /* synthetic */ ShareChannel(String str, int i11, String str2, String str3, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 1) != 0 ? "" : str2, (i12 & 2) != 0 ? "" : str3, z11);
    }

    @NotNull
    public static EnumEntries<ShareChannel> getEntries() {
        return $ENTRIES;
    }

    public static ShareChannel valueOf(String str) {
        return (ShareChannel) Enum.valueOf(ShareChannel.class, str);
    }

    public static ShareChannel[] values() {
        return (ShareChannel[]) $VALUES.clone();
    }

    @NotNull
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }

    /* JADX INFO: renamed from: isApp, reason: from getter */
    public final boolean getIsApp() {
        return this.isApp;
    }
}
