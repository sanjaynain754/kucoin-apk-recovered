package com.kubi.core.spot.business.businessTrack;

import android.text.TextUtils;
import com.kubi.core.spot.business.businessTrack.DurationTrackManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DurationTrackManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0006J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0012\u001a\u00020\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/DurationTrackManager;", "", "<init>", "()V", "trackMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "currentUUID", "getCurrentUUID", "getTrackMap", "clearCurrentUUID", "", "generateUUID", "put", "key", "value", "get", "remove", "clear", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DurationTrackManager {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f21006c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy<DurationTrackManager> f21007d = LazyKt.lazy(new Function0() { // from class: ie.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DurationTrackManager.m22855f();
        }
    });

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ConcurrentHashMap<String, String> f21008a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f21009b = "";

    /* JADX INFO: compiled from: DurationTrackManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/core/spot/business/businessTrack/DurationTrackManager$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/core/spot/business/businessTrack/DurationTrackManager;", "getInstance", "()Lcom/kubi/core/spot/business/businessTrack/DurationTrackManager;", "instance$delegate", "Lkotlin/Lazy;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final DurationTrackManager getInstance() {
            return (DurationTrackManager) DurationTrackManager.f21007d.getValue();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final DurationTrackManager m22855f() {
        return new DurationTrackManager();
    }

    /* JADX INFO: renamed from: c */
    public final void m22856c() {
        this.f21009b = "";
    }

    /* JADX INFO: renamed from: d */
    public final void m22857d() {
        if (this.f21009b.length() == 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.f21009b = string;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF21009b() {
        return this.f21009b;
    }

    /* JADX INFO: renamed from: g */
    public final void m22859g(@NotNull String key, @NotNull String value) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(key) || (concurrentHashMap = this.f21008a) == null) {
            return;
        }
        concurrentHashMap.put(key, value);
    }
}
