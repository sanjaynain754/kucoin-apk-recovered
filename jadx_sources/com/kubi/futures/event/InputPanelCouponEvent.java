package com.kubi.futures.event;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: InputPanelCouponEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/event/InputPanelCouponEvent;", "", "tips", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTips", "()Ljava/lang/String;", "getId", "putStorageId", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nInputPanelCouponEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputPanelCouponEvent.kt\ncom/kubi/futures/event/InputPanelCouponEvent\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,24:1\n126#2,2:25\n*S KotlinDebug\n*F\n+ 1 InputPanelCouponEvent.kt\ncom/kubi/futures/event/InputPanelCouponEvent\n*L\n22#1:25,2\n*E\n"})
public final /* data */ class InputPanelCouponEvent {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f23041c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f23042d = "com.kubi.futures.event.InputPanelCouponEvent";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f23043e = "InputPanelCouponEventId";

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String tips;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String id;

    /* JADX INFO: compiled from: InputPanelCouponEvent.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/event/InputPanelCouponEvent$Companion;", "", "<init>", "()V", "Key", "", "getKey", "()Ljava/lang/String;", "couponId", "getCouponId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String getCouponId() {
            return InputPanelCouponEvent.f23043e;
        }

        @NotNull
        public final String getKey() {
            return InputPanelCouponEvent.f23042d;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputPanelCouponEvent)) {
            return false;
        }
        InputPanelCouponEvent inputPanelCouponEvent = (InputPanelCouponEvent) other;
        return Intrinsics.areEqual(this.tips, inputPanelCouponEvent.tips) && Intrinsics.areEqual(this.id, inputPanelCouponEvent.id);
    }

    public InputPanelCouponEvent(@NotNull String tips, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.tips = tips;
        this.id = id2;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    /* JADX INFO: renamed from: d */
    public final void m25558d() {
        C46392a.m102328k(C46894j.f104736a.m103272k(f23043e), true);
    }

    public int hashCode() {
        return (this.tips.hashCode() * 31) + this.id.hashCode();
    }

    @NotNull
    public String toString() {
        return "InputPanelCouponEvent(tips=" + this.tips + ", id=" + this.id + ')';
    }
}
