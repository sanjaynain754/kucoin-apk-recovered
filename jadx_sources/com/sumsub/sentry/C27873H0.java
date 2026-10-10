package com.sumsub.sentry;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.BuildConfig;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.cacher.C33278f;
import com.sumsub.sns.internal.log.cacher.InterfaceC33273a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.internal.C41801c2;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.H0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27873H0 implements InterfaceC33273a {

    @NotNull
    public static final C27871G0 Companion = new C27871G0();

    /* JADX INFO: renamed from: a */
    public final String f56922a;

    /* JADX INFO: renamed from: b */
    public final Lazy f56923b;

    public /* synthetic */ C27873H0(int i11, String str) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C27869F0.f56916a.getDescriptor());
        }
        this.f56922a = str;
        this.f56923b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sentry.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27873H0.m68967a();
            }
        });
    }

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    public final Object mo68970a(Object obj, ByteArrayOutputStream byteArrayOutputStream, C33278f c33278f) {
        C27866E.m68965a((C27925b0) obj, byteArrayOutputStream);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final OkHttpClient m68968b() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).pingInterval(20L, timeUnit).build();
    }

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33275c
    public final Object send(Object obj, Continuation continuation) {
        C27925b0 c27925b0 = (C27925b0) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            C27866E.m68965a(c27925b0, gZIPOutputStream);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(gZIPOutputStream, null);
            return Boxing.boxBoolean(m68971a(byteArrayOutputStream.toByteArray()));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(gZIPOutputStream, th2);
                throw th3;
            }
        }
    }

    public C27873H0() {
        this.f56922a = BuildConfig.SENTRY_URL;
        this.f56923b = LazyKt.lazy(new Function0() { // from class: com.sumsub.sentry.n1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27873H0.m68968b();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final OkHttpClient m68967a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).pingInterval(20L, timeUnit).build();
    }

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    public final Object mo68969a(ByteArrayInputStream byteArrayInputStream, Continuation continuation) {
        boolean zM68971a;
        Logger.DefaultImpls.d$default(C33272c.f67812a, "SentrySink", "Resend envelope from cache", null, 4, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(ByteStreamsKt.readBytes(byteArrayInputStream));
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(gZIPOutputStream, null);
                zM68971a = m68971a(byteArrayOutputStream.toByteArray());
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(gZIPOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            Logger.DefaultImpls.d$default(C33272c.f67812a, "SentrySink", "Can't resend envelope from cache: " + e11, null, 4, null);
            zM68971a = false;
        }
        return Boxing.boxBoolean(zM68971a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68971a(byte[] bArr) {
        try {
            return FirebasePerfOkHttpClient.execute(((OkHttpClient) this.f56923b.getValue()).newCall(new Request.Builder().url(this.f56922a + "api/2/envelope/").header("Content-Encoding", "gzip").header("Accept", "application/json").header("Connection", "close").header("User-Agent", "1.46.0").header("X-Sentry-Auth", "Sentry sentry_version=7,sentry_client=1.46.0,sentry_key=5ed67192b2104fb682468a5be4dee5da").post(RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, MediaType.INSTANCE.get("application/x-sentry-envelope"), 0, 0, 6, (Object) null)).build())).isSuccessful();
        } catch (Exception unused) {
            return false;
        }
    }
}
