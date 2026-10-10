package com.kubi.host.utils;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: HostUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\f\u001a\u00020\u0003J\b\u0010\r\u001a\u0004\u0018\u00010\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/host/utils/ConfigUrl;", "", "baseurl", "", "path", "(Ljava/lang/String;Ljava/lang/String;)V", "getBaseurl", "()Ljava/lang/String;", "getPath", "equals", "", "other", "getConfigUrl", "getValidData", "Companion", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ConfigUrl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String baseurl;

    @Nullable
    private final String path;

    /* JADX INFO: compiled from: HostUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/host/utils/ConfigUrl$Companion;", "", "()V", "default", "Lcom/kubi/host/utils/ConfigUrl;", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final ConfigUrl m103793default() {
            return new ConfigUrl("https://config.staticimg.com", "/app/v1/domain-config");
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(ConfigUrl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.host.utils.ConfigUrl");
        ConfigUrl configUrl = (ConfigUrl) other;
        return Intrinsics.areEqual(this.baseurl, configUrl.baseurl) && Intrinsics.areEqual(this.path, configUrl.path);
    }

    @Nullable
    public final String getBaseurl() {
        return this.baseurl;
    }

    @NotNull
    public final String getConfigUrl() {
        return C27041f.m66668h(this.baseurl) + C27041f.m66668h(this.path);
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final ConfigUrl getValidData() {
        if (TextUtils.isEmpty(this.baseurl) || TextUtils.isEmpty(this.path) || !StringsKt.startsWith$default(C27041f.m66668h(this.baseurl), "http", false, 2, (Object) null)) {
            return null;
        }
        return this;
    }

    public ConfigUrl(@Nullable String str, @Nullable String str2) {
        this.baseurl = str;
        this.path = str2;
    }
}
