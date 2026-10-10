package com.kubi.sdk.util;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.s1 */
/* JADX INFO: compiled from: TrackExt.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003\u001a$\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003\u001a$\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0003¨\u0006\t"}, m90084d2 = {"appendSpm", "Lcom/kubi/router/model/Postcard;", "pageId", "", "blockId", "locationId", "spmId", "Landroid/os/Bundle;", "Landroid/content/Intent;", "LBase_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24271s1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bundle m58529a(@NotNull Bundle bundle, @NotNull String spmId) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(spmId, "spmId");
        bundle.putString("spm", spmId);
        return bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Bundle m58530b(@NotNull Bundle bundle, @NotNull String pageId, @NotNull String blockId, @NotNull String locationId) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        bundle.putString("spm", C43852m.m96601m(pageId, blockId, locationId));
        return bundle;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C4400a m58531c(@NotNull C4400a c4400a, @NotNull String spmId) {
        Intrinsics.checkNotNullParameter(c4400a, "<this>");
        Intrinsics.checkNotNullParameter(spmId, "spmId");
        c4400a.m4038a("spm", spmId);
        return c4400a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C4400a m58532d(@NotNull C4400a c4400a, @NotNull String pageId, @NotNull String blockId, @NotNull String locationId) {
        Intrinsics.checkNotNullParameter(c4400a, "<this>");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        c4400a.m4038a("spm", C43852m.m96601m(pageId, blockId, locationId));
        return c4400a;
    }
}
