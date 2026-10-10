package com.kubi.mine.lib.util;

import com.kubi.mine.lib.service.MineDepend;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import y70.StorageId;

/* JADX INFO: compiled from: MineStorageIds.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/mine/lib/util/MineStorageIds;", "", "<init>", "()V", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MineStorageIds {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f35421a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<String> f35422b = new StorageId<>("mine", "cache_language_list", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f35423c = new StorageId<>("mine", "CONTACT_US_KEY", null, false, 12, null);

    /* JADX INFO: compiled from: MineStorageIds.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/mine/lib/util/MineStorageIds$Companion;", "", "<init>", "()V", "MINE_CATEGORY", "", "KEY_CACHE_LANGUAGE_LIST", "languageListSid", "Lcom/kubi/utils/storage/StorageId;", "getLanguageListSid", "()Lcom/kubi/utils/storage/StorageId;", "CONTACT_US_KEY", "contactUsSid", "getContactUsSid", "inviteDataSid", "getInviteDataSid", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final StorageId<String> getInviteDataSid() {
            return new StorageId("mine", "fetchInviteData", null, false, 12, null).m102384f(MineDepend.f35159a.m41826e().id);
        }

        @NotNull
        public final StorageId<String> getContactUsSid() {
            return MineStorageIds.f35423c;
        }

        @NotNull
        public final StorageId<String> getLanguageListSid() {
            return MineStorageIds.f35422b;
        }
    }
}
