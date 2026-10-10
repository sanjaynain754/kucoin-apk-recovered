package com.kubi.futures.trade.track;

import android.text.TextUtils;
import com.kubi.futures.trade.track.DurationTrackManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationTrackManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/futures/trade/track/DurationTrackManager;", "", "<init>", "()V", "trackMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "generateUUID", "put", "", "key", "value", "get", "remove", "clear", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DurationTrackManager {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f24461b = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<DurationTrackManager> f24462c = LazyKt.lazy(new Function0() { // from class: ui.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DurationTrackManager.m28039e();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, String> f24463a = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: DurationTrackManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/trade/track/DurationTrackManager$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/futures/trade/track/DurationTrackManager;", "getInstance", "()Lcom/kubi/futures/trade/track/DurationTrackManager;", "instance$delegate", "Lkotlin/Lazy;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DurationTrackManager getInstance() {
            return (DurationTrackManager) DurationTrackManager.f24462c.getValue();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final DurationTrackManager m28039e() {
        return new DurationTrackManager();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m28041d(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f24463a.get(key);
    }

    /* JADX INFO: renamed from: f */
    public final void m28042f(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(key)) {
            return;
        }
        this.f24463a.put(key, value);
    }

    /* JADX INFO: renamed from: g */
    public final void m28043g(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f24463a.remove(key);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m28040c() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
