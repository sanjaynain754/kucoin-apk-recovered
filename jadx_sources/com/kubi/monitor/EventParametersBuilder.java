package com.kubi.monitor;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/monitor/EventParametersBuilder;", "", "<init>", "()V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/HashMap;", "key", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "b", "(Ljava/lang/String;I)Ljava/lang/Object;", "", "d", "(Ljava/lang/String;Z)Ljava/lang/Object;", "Ljava/util/HashMap;", "map", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class EventParametersBuilder {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Object> map;

    /* JADX INFO: compiled from: DurationTracker.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/monitor/EventParametersBuilder$Companion;", "", "()V", "acquire", "Lcom/kubi/monitor/EventParametersBuilder;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final EventParametersBuilder acquire() {
            return new EventParametersBuilder(null);
        }
    }

    public /* synthetic */ EventParametersBuilder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public EventParametersBuilder() {
        this.map = new HashMap<>();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, Object> m42380a() {
        return this.map;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m42381b(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.put(key, Integer.valueOf(value));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m42382c(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.map.put(key, value);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m42383d(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.put(key, Boolean.valueOf(value));
    }
}
