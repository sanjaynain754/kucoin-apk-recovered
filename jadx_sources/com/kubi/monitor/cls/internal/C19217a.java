package com.kubi.monitor.cls.internal;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import jc0.C40383a;
import jc0.C40384b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p624sq.InterfaceC44537c;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.monitor.cls.internal.a */
/* JADX INFO: compiled from: AppTrackerRuntime.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\r\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b!\u0010%¨\u0006'"}, m90084d2 = {"Lcom/kubi/monitor/cls/internal/a;", "", "<init>", "()V", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "e", "(Landroid/content/Context;)V", "appContext", "Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "c", "Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "()Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;", "g", "(Lcom/kubi/monitor/cls/internal/AppTrackerClsToken;)V", "currentToken", "Ljc0/b;", "d", "Ljc0/b;", "()Ljc0/b;", "i", "(Ljc0/b;)V", "producerConfig", "Ljc0/a;", "Ljc0/a;", "()Ljc0/a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljc0/a;)V", "producerClient", "Lsq/c;", "f", "Lsq/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lsq/c;", "(Lsq/c;)V", "contextProxy", "Monitor-cls_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19217a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19217a f35512a = new C19217a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile Context appContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static volatile AppTrackerClsToken currentToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static volatile C40384b producerConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static volatile C40383a producerClient;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static volatile InterfaceC44537c contextProxy;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC44537c m42407a() {
        return contextProxy;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final AppTrackerClsToken m42408b() {
        return currentToken;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C40383a m42409c() {
        return producerClient;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final C40384b m42410d() {
        return producerConfig;
    }

    /* JADX INFO: renamed from: e */
    public final void m42411e(@Nullable Context context) {
        appContext = context;
    }

    /* JADX INFO: renamed from: f */
    public final void m42412f(@Nullable InterfaceC44537c interfaceC44537c) {
        contextProxy = interfaceC44537c;
    }

    /* JADX INFO: renamed from: g */
    public final void m42413g(@Nullable AppTrackerClsToken appTrackerClsToken) {
        currentToken = appTrackerClsToken;
    }

    /* JADX INFO: renamed from: h */
    public final void m42414h(@Nullable C40383a c40383a) {
        producerClient = c40383a;
    }

    /* JADX INFO: renamed from: i */
    public final void m42415i(@Nullable C40384b c40384b) {
        producerConfig = c40384b;
    }
}
