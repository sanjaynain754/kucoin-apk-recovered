package com.kubi.notice.lib.entity;

import androidx.annotation.Keep;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: WsNoticeEntity.kt */
/* JADX INFO: loaded from: classes30.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006#"}, m90084d2 = {"Lcom/kubi/notice/lib/entity/WsNoticeEntity;", "", "<init>", "()V", "data", "Lcom/kubi/notice/lib/entity/WsNoticeEntity$DataBean;", "getData", "()Lcom/kubi/notice/lib/entity/WsNoticeEntity$DataBean;", "setData", "(Lcom/kubi/notice/lib/entity/WsNoticeEntity$DataBean;)V", "subject", "", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "topic", "getTopic", "setTopic", "id", "getId", "setId", "sn", "", "getSn", "()J", "setSn", "(J)V", "type", "getType", "setType", "userId", "getUserId", "setUserId", "DataBean", "NoticeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WsNoticeEntity {

    @Nullable
    private DataBean data;

    @Nullable
    private String id;
    private long sn;

    @Nullable
    private String subject;

    @Nullable
    private String topic;

    @Nullable
    private String type;

    @Nullable
    private String userId;

    /* JADX INFO: compiled from: WsNoticeEntity.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR:\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010%\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00101\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u0010\tR\u001a\u00108\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00102\"\u0004\b9\u00104R\u001c\u0010:\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u001a\u0010=\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00102\"\u0004\b>\u00104R\u001c\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\t¨\u0006B"}, m90084d2 = {"Lcom/kubi/notice/lib/entity/WsNoticeEntity$DataBean;", "", "<init>", "()V", "display", "", "getDisplay", "()Ljava/lang/String;", "setDisplay", "(Ljava/lang/String;)V", "context", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getContext", "()Ljava/util/HashMap;", "setContext", "(Ljava/util/HashMap;)V", "title", "getTitle", "setTitle", "content", "getContent", "setContent", "sendTime", "", "getSendTime", "()Ljava/lang/Long;", "setSendTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "needToSetting", "", "getNeedToSetting", "()Ljava/lang/Boolean;", "setNeedToSetting", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "needShowDialog", "getNeedShowDialog", "setNeedShowDialog", "id", "", "getId", "()I", "setId", "(I)V", "groupId", "getGroupId", "setGroupId", "isBox", "()Z", "setBox", "(Z)V", "url", "getUrl", "setUrl", "isRedHot", "setRedHot", "logo", "getLogo", "setLogo", "isNotifyBusiness", "setNotifyBusiness", "templateCode", "getTemplateCode", "setTemplateCode", "NoticeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DataBean {

        @Nullable
        private String content;

        @Nullable
        private HashMap<String, String> context;

        @Nullable
        private String display;
        private int groupId;
        private int id;
        private boolean isBox;
        private boolean isNotifyBusiness;
        private boolean isRedHot;

        @Nullable
        private String logo;

        @Nullable
        private String templateCode;

        @Nullable
        private String title;

        @Nullable
        private String url;

        @Nullable
        private Long sendTime = 0L;

        @Nullable
        private Boolean needToSetting = Boolean.FALSE;

        @Nullable
        private Boolean needShowDialog = Boolean.TRUE;

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final HashMap<String, String> getContext() {
            return this.context;
        }

        @Nullable
        public final String getDisplay() {
            return this.display;
        }

        public final int getGroupId() {
            return this.groupId;
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final String getLogo() {
            return this.logo;
        }

        @Nullable
        public final Boolean getNeedShowDialog() {
            return this.needShowDialog;
        }

        @Nullable
        public final Boolean getNeedToSetting() {
            return this.needToSetting;
        }

        @Nullable
        public final Long getSendTime() {
            return this.sendTime;
        }

        @Nullable
        public final String getTemplateCode() {
            return this.templateCode;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: isBox, reason: from getter */
        public final boolean getIsBox() {
            return this.isBox;
        }

        /* JADX INFO: renamed from: isNotifyBusiness, reason: from getter */
        public final boolean getIsNotifyBusiness() {
            return this.isNotifyBusiness;
        }

        /* JADX INFO: renamed from: isRedHot, reason: from getter */
        public final boolean getIsRedHot() {
            return this.isRedHot;
        }

        public final void setBox(boolean z11) {
            this.isBox = z11;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setContext(@Nullable HashMap<String, String> map) {
            this.context = map;
        }

        public final void setDisplay(@Nullable String str) {
            this.display = str;
        }

        public final void setGroupId(int i11) {
            this.groupId = i11;
        }

        public final void setId(int i11) {
            this.id = i11;
        }

        public final void setLogo(@Nullable String str) {
            this.logo = str;
        }

        public final void setNeedShowDialog(@Nullable Boolean bool) {
            this.needShowDialog = bool;
        }

        public final void setNeedToSetting(@Nullable Boolean bool) {
            this.needToSetting = bool;
        }

        public final void setNotifyBusiness(boolean z11) {
            this.isNotifyBusiness = z11;
        }

        public final void setRedHot(boolean z11) {
            this.isRedHot = z11;
        }

        public final void setSendTime(@Nullable Long l11) {
            this.sendTime = l11;
        }

        public final void setTemplateCode(@Nullable String str) {
            this.templateCode = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    @Nullable
    public final DataBean getData() {
        return this.data;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final long getSn() {
        return this.sn;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setData(@Nullable DataBean dataBean) {
        this.data = dataBean;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setSn(long j11) {
        this.sn = j11;
    }

    public final void setSubject(@Nullable String str) {
        this.subject = str;
    }

    public final void setTopic(@Nullable String str) {
        this.topic = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }
}
