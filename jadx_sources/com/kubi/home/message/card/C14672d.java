package com.kubi.home.message.card;

import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.home.message.card.d */
/* JADX INFO: compiled from: MessageBoxEx.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"EVENT_MESSAGE_BOX_DATA", "", "EVENT_REMOVE_MESSAGE_BOX_CARD", "EVENT_EXPOSE_MESSAGE_BOX", "JUMP_TO_MESSAGE_CENTER", "REFRESH_RED_DOT", "noticeSetMessageBoxSwitch", "getNoticeSetMessageBoxSwitch", "()Ljava/lang/String;", "addUserId", "MESSAGE_BOX_SWITCH_ID", "", "MESSAGE_BOX_TYPE", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C14672d {
    /* JADX INFO: renamed from: a */
    public static final String m29556a(String str) {
        return str + '_' + UserInfo.c().id;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m29557b() {
        return m29556a("flutter.notice_set_message_box_switch_new");
    }
}
