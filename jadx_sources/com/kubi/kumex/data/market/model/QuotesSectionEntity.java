package com.kubi.kumex.data.market.model;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.data.market.model.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuotesSectionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/QuotesSectionEntity;", "", "checked", "", "name", "", "id", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getChecked", "()Z", "setChecked", "(Z)V", "getName", "()Ljava/lang/String;", "getId", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuotesSectionEntity {

    /* JADX INFO: renamed from: a */
    public boolean f28820a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f28821b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f28822c;

    public QuotesSectionEntity(boolean z11, @NotNull String name, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f28820a = z11;
        this.f28821b = name;
        this.f28822c = id2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF28820a() {
        return this.f28820a;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF28822c() {
        return this.f28822c;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF28821b() {
        return this.f28821b;
    }

    /* JADX INFO: renamed from: d */
    public final void m33378d(boolean z11) {
        this.f28820a = z11;
    }
}
