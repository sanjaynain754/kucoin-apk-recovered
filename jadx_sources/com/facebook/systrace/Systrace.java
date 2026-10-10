package com.facebook.systrace;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.tracing.Trace;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Systrace.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001:\u00014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b*\u0010&J/\u0010,\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\nH\u0007¢\u0006\u0004\b,\u0010)J'\u0010/\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u001eH\u0007¢\u0006\u0004\b/\u0010&J'\u00100\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b0\u0010&J'\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u001eH\u0007¢\u0006\u0004\b1\u0010&J%\u00102\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b2\u00103¨\u00065"}, m90084d2 = {"Lcom/facebook/systrace/Systrace;", "", "<init>", "()V", "Lcom/facebook/systrace/TraceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "k", "(Lcom/facebook/systrace/TraceListener;)V", "p", "", "tag", "", "j", "(J)Z", "", "title", "Lcom/facebook/systrace/Systrace$EventScope;", "scope", "n", "(JLjava/lang/String;Lcom/facebook/systrace/Systrace$EventScope;)V", "sectionName", "Ljava/lang/Runnable;", "block", "o", "(JLjava/lang/String;Ljava/lang/Runnable;)V", "c", "(JLjava/lang/String;)V", "", "args", "", "argsLength", "d", "(JLjava/lang/String;[Ljava/lang/String;I)V", "i", "(J)V", "cookie", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(JLjava/lang/String;I)V", "startNanos", "b", "(JLjava/lang/String;IJ)V", "g", "endNanos", CmcdData.Factory.STREAMING_FORMAT_HLS, "counterName", "counterValue", "m", CmcdData.Factory.STREAM_TYPE_LIVE, "f", "e", "([Ljava/lang/String;I)Ljava/lang/String;", "EventScope", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class Systrace {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Systrace f9961a = new Systrace();

    /* JADX INFO: compiled from: Systrace.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/systrace/Systrace$EventScope;", "", "code", "", "<init>", "(Ljava/lang/String;IC)V", "getCode", "()C", "THREAD", "PROCESS", "GLOBAL", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public enum EventScope {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f9963c = EnumEntriesKt.enumEntries(m10676a());
        private final char code;

        @NotNull
        public static EnumEntries<EventScope> getEntries() {
            return f9963c;
        }

        public final char getCode() {
            return this.code;
        }

        EventScope(char c11) {
            this.code = c11;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m10668j(long tag) {
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m10671m(long tag, @NotNull String counterName, int counterValue) {
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        Trace.setCounter(counterName, counterValue);
    }

    /* JADX INFO: renamed from: e */
    public final String m10675e(String[] args, int argsLength) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < argsLength; i11 += 2) {
            String str = args[i11 - 1];
            String str2 = args[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < argsLength - 1) {
                sb2.append(';');
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m10660a(long tag, @NotNull String sectionName, int cookie) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Trace.beginAsyncSection(sectionName, cookie);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m10661b(long tag, @NotNull String sectionName, int cookie, long startNanos) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        m10660a(tag, sectionName, cookie);
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m10662c(long tag, @NotNull String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Trace.beginSection(sectionName);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m10663d(long tag, @NotNull String sectionName, @NotNull String[] args, int argsLength) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Trace.beginSection(sectionName + "|" + f9961a.m10675e(args, argsLength));
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m10664f(long tag, @NotNull String sectionName, int cookie) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        m10665g(tag, sectionName, cookie);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m10665g(long tag, @NotNull String sectionName, int cookie) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Trace.endAsyncSection(sectionName, cookie);
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m10666h(long tag, @NotNull String sectionName, int cookie, long endNanos) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        m10665g(tag, sectionName, cookie);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m10667i(long tag) {
        Trace.endSection();
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m10670l(long tag, @NotNull String sectionName, int cookie) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        m10660a(tag, sectionName, cookie);
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final void m10673o(long tag, @NotNull String sectionName, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        m10662c(tag, sectionName);
        try {
            block.run();
        } finally {
            m10667i(tag);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m10669k(@Nullable TraceListener listener) {
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m10674p(@Nullable TraceListener listener) {
    }

    @JvmStatic
    /* JADX INFO: renamed from: n */
    public static final void m10672n(long tag, @Nullable String title, @Nullable EventScope scope) {
    }
}
