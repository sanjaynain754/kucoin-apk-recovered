package com.kubi.applet;

import com.kubi.mine.lib.service.MineDepend;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: compiled from: AppletStorageIds.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/applet/AppletStorageIds;", "", "<init>", "()V", "Companion", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppletStorageIds {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f16208a = new Companion(null);

    /* JADX INFO: compiled from: AppletStorageIds.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/applet/AppletStorageIds$Companion;", "", "<init>", "()V", "APPLET_VISIT_CATEGORY", "", "APPLET_PASSIVE_CATEGORY", "APPLET_CALL_CATEGORY", "lastVisitDateSid", "Lcom/kubi/utils/storage/StorageId;", "", "key", "lastPassivePopDateSid", "lastCallPopDateSid", "AppletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final StorageId<Long> lastCallPopDateSid(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StorageId("appletCall", key, null, false, 12, null).m102384f(MineDepend.f35159a.m41826e().id);
        }

        @NotNull
        public final StorageId<Long> lastPassivePopDateSid(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StorageId("appletPassive", key, null, false, 12, null).m102384f(MineDepend.f35159a.m41826e().id);
        }

        @NotNull
        public final StorageId<Long> lastVisitDateSid(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new StorageId("appletVisit", key, null, false, 12, null).m102384f(MineDepend.f35159a.m41826e().id);
        }
    }
}
