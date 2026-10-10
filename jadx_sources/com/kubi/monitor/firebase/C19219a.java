package com.kubi.monitor.firebase;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.ktx.Firebase;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import p642tq.InterfaceC45064g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.monitor.firebase.a */
/* JADX INFO: compiled from: FireBaseTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/monitor/firebase/a;", "Ltq/g;", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "", "b", "(Landroid/os/Bundle;)V", "", "name", ReportDataTable.COLUMN_PARAMS, "values", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V", "Landroid/os/Bundle;", "customAttributes", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19219a implements InterfaceC45064g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19219a f35541a = new C19219a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Bundle customAttributes = new Bundle();

    @Override // p642tq.InterfaceC45064g
    /* JADX INFO: renamed from: a */
    public void mo42442a(@NotNull String name, @NotNull Bundle params, @NotNull Bundle values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            Bundle bundle = new Bundle();
            bundle.putAll(params);
            bundle.putAll(values);
            bundle.putAll(customAttributes);
            AnalyticsKt.getAnalytics(Firebase.INSTANCE).logEvent(name, bundle);
        } catch (Throwable th2) {
            C44128b.m97263g("FireBaseTracker", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42443b(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        customAttributes.putAll(bundle);
    }
}
