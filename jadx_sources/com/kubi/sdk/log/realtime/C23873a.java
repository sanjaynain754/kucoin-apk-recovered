package com.kubi.sdk.log.realtime;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.log.realtime.p116db.LogData;
import com.tencent.bugly.proguard.C33627eb;
import org.jetbrains.annotations.NotNull;
import p669uo.C45282b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import so.InterfaceC44530a;

/* JADX INFO: renamed from: com.kubi.sdk.log.realtime.a */
/* JADX INFO: compiled from: RealLogAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/log/realtime/a;", "Lso/a;", "<init>", "()V", "", "priority", "type", "", "tag", "", "e", "(IILjava/lang/String;)Z", "msg", "", "b", "(IILjava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "Lcom/kubi/sdk/log/realtime/db/LogData;", "d", "(IILjava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/log/realtime/db/LogData;", "c", "(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Logger-realtime_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23873a implements InterfaceC44530a {
    @Override // so.InterfaceC44530a
    /* JADX INFO: renamed from: a */
    public boolean mo57204a() {
        return false;
    }

    @Override // so.InterfaceC44530a
    /* JADX INFO: renamed from: b */
    public void mo57205b(int priority, int type, @NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (m57208e(priority, type, tag)) {
            RealTimeReporter.f46947a.m57201v(m57207d(priority, type, tag, msg));
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m57206c(int priority, String tag, String msg) {
        StringBuffer stringBuffer = new StringBuffer();
        C45282b c45282b = C45282b.f101815a;
        stringBuffer.append(c45282b.m100084a());
        stringBuffer.append(C33627eb.f69716f);
        stringBuffer.append(c45282b.m100085b(priority));
        stringBuffer.append(C33627eb.f69716f);
        stringBuffer.append(tag);
        stringBuffer.append(": ");
        stringBuffer.append(msg);
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n …msg)\n        }.toString()");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public final LogData m57207d(int priority, int type, String tag, String msg) {
        String strM57206c = m57206c(priority, tag, msg);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "currentThread().name");
        return new LogData(null, strM57206c, type, jCurrentTimeMillis, name, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean m57208e(int priority, int type, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (priority < 4) {
            return false;
        }
        RealTimeReporter realTimeReporter = RealTimeReporter.f46947a;
        if (!realTimeReporter.m57189j().isOpen()) {
            return false;
        }
        if (realTimeReporter.m57189j().getAvailableTag().isEmpty() || !realTimeReporter.m57189j().getAvailableTag().contains(tag)) {
            return realTimeReporter.m57189j().getAvailableType().contains(Integer.valueOf(type)) && realTimeReporter.m57189j().getAvailableLevel().contains(Integer.valueOf(priority));
        }
        return true;
    }
}
