package com.sumsub.sns.internal.core.exception;

import android.content.Context;
import com.sumsub.sentry.C27929c0;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.C28403K0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.log.cacher.AbstractC33277e;
import com.sumsub.sns.internal.log.cacher.C33284l;
import com.sumsub.sns.internal.log.cacher.InterfaceC33275c;
import java.util.Set;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28618c {

    /* JADX INFO: renamed from: d */
    public static final Set f58233d = SetsKt.setOf((Object[]) new String[]{"com.sumsub", "de.authada", "org.jmrtd", "com.kinegram", "com.twilio"});

    /* JADX INFO: renamed from: a */
    public final Object f58234a = new Object();

    /* JADX INFO: renamed from: b */
    public boolean f58235b;

    /* JADX INFO: renamed from: c */
    public Thread.UncaughtExceptionHandler f58236c;

    /* JADX INFO: renamed from: b */
    public final void m69473b(Context context, C28578h c28578h) {
        synchronized (this.f58234a) {
            if (this.f58235b) {
                return;
            }
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new C28624i(new C28616a(f58233d), CollectionsKt.listOf((Object[]) new InterfaceC28620e[]{new C28625j(new C27929c0(c28578h.f58163a), (InterfaceC33275c) c28578h.f58177o.getValue()), m69472a(context, c28578h)}), new C28617b(c28578h, null), defaultUncaughtExceptionHandler));
            this.f58236c = defaultUncaughtExceptionHandler;
            this.f58235b = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C28619d m69472a(Context context, C28578h c28578h) {
        if (!AbstractC28413P0.f57921a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SNSSession sNSSession = AbstractC28413P0.f57923c;
        if (sNSSession == null) {
            sNSSession = null;
        }
        C33284l c33284l = new C33284l("SNSExceptionSink", new C28403K0(context, sNSSession.getUrl(), c28578h.f58157N, c28578h.f58156M), context.getCacheDir(), 12);
        AbstractC33277e.f67822b.add(c33284l);
        return new C28619d(c33284l);
    }
}
