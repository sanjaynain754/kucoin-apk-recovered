package com.kubi.mine.lib.p101ui.userinfo;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: EditUserInfoContract.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "QueryAuditUserInfoIntent", "CommitAuditUserInfoIntent", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent$CommitAuditUserInfoIntent;", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent$QueryAuditUserInfoIntent;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class EditUserInfoContract$UIIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: EditUserInfoContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent$CommitAuditUserInfoIntent;", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent;", "avatar", "", "nickName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getNickName", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CommitAuditUserInfoIntent extends EditUserInfoContract$UIIntent {

        @Nullable
        private final String avatar;

        @Nullable
        private final String nickName;

        public CommitAuditUserInfoIntent(@Nullable String str, @Nullable String str2) {
            super(null);
            this.avatar = str;
            this.nickName = str2;
        }

        @Nullable
        public final String getAvatar() {
            return this.avatar;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }
    }

    /* JADX INFO: compiled from: EditUserInfoContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent$QueryAuditUserInfoIntent;", "Lcom/kubi/mine/lib/ui/userinfo/EditUserInfoContract$UIIntent;", "<init>", "()V", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class QueryAuditUserInfoIntent extends EditUserInfoContract$UIIntent {
        public QueryAuditUserInfoIntent() {
            super(null);
        }
    }

    public /* synthetic */ EditUserInfoContract$UIIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EditUserInfoContract$UIIntent() {
    }
}
