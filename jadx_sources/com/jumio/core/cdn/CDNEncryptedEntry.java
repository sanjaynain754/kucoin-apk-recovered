package com.jumio.core.cdn;

import android.content.Context;
import android.os.SystemClock;
import com.jumio.ale.swig.AESGCMInputStream;
import com.jumio.commons.log.Log;
import com.jumio.core.environment.Environment;
import com.jumio.core.extraction.util.ByteBufferOutputStream;
import com.tencent.bugly.proguard.C33590cg;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.TimeoutException;
import jumio.core.AbstractC40511C;
import jumio.core.AbstractC40637b0;
import jumio.core.InterfaceC40516D;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÂ\u0003JE\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006."}, m90084d2 = {"Lcom/jumio/core/cdn/CDNEncryptedEntry;", "Lcom/jumio/core/cdn/CDNEntry;", "Ljava/io/Serializable;", "name", "", "file", "key", "iv", "shouldCache", "", C33590cg.f69440j, "Lcom/jumio/core/cdn/CDNCache;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/jumio/core/cdn/CDNCache;)V", "getName", "()Ljava/lang/String;", "getFile", "getKey", "getIv", "getShouldCache", "()Z", "checksum", "getChecksum", "isAssetFile", "isPreloadedFile", "getStream", "Lcom/jumio/ale/swig/AESGCMInputStream;", "context", "Landroid/content/Context;", "load", "Ljava/nio/ByteBuffer;", "initTimeoutInMs", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCDNEncryptedEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CDNEncryptedEntry.kt\ncom/jumio/core/cdn/CDNEncryptedEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public final /* data */ class CDNEncryptedEntry implements InterfaceC40516D, Serializable {

    /* JADX INFO: renamed from: a */
    public final String f13754a;

    /* JADX INFO: renamed from: b */
    public final String f13755b;

    /* JADX INFO: renamed from: c */
    public final String f13756c;

    /* JADX INFO: renamed from: d */
    public final String f13757d;

    /* JADX INFO: renamed from: e */
    public final boolean f13758e;

    /* JADX INFO: renamed from: f */
    public final CDNCache f13759f;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CDNEncryptedEntry)) {
            return false;
        }
        CDNEncryptedEntry cDNEncryptedEntry = (CDNEncryptedEntry) other;
        return Intrinsics.areEqual(this.f13754a, cDNEncryptedEntry.f13754a) && Intrinsics.areEqual(this.f13755b, cDNEncryptedEntry.f13755b) && Intrinsics.areEqual(this.f13756c, cDNEncryptedEntry.f13756c) && Intrinsics.areEqual(this.f13757d, cDNEncryptedEntry.f13757d) && this.f13758e == cDNEncryptedEntry.f13758e && Intrinsics.areEqual(this.f13759f, cDNEncryptedEntry.f13759f);
    }

    @Override // jumio.core.InterfaceC40516D
    @Nullable
    public String getChecksum() {
        return null;
    }

    public CDNEncryptedEntry(@NotNull String name, @NotNull String file, @NotNull String key, @NotNull String iv2, boolean z11, @NotNull CDNCache cache) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv2, "iv");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f13754a = name;
        this.f13755b = file;
        this.f13756c = key;
        this.f13757d = iv2;
        this.f13758e = z11;
        this.f13759f = cache;
    }

    public static /* synthetic */ CDNEncryptedEntry copy$default(CDNEncryptedEntry cDNEncryptedEntry, String str, String str2, String str3, String str4, boolean z11, CDNCache cDNCache, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cDNEncryptedEntry.f13754a;
        }
        if ((i11 & 2) != 0) {
            str2 = cDNEncryptedEntry.f13755b;
        }
        if ((i11 & 4) != 0) {
            str3 = cDNEncryptedEntry.f13756c;
        }
        if ((i11 & 8) != 0) {
            str4 = cDNEncryptedEntry.f13757d;
        }
        if ((i11 & 16) != 0) {
            z11 = cDNEncryptedEntry.f13758e;
        }
        if ((i11 & 32) != 0) {
            cDNCache = cDNEncryptedEntry.f13759f;
        }
        boolean z12 = z11;
        CDNCache cDNCache2 = cDNCache;
        return cDNEncryptedEntry.copy(str, str2, str3, str4, z12, cDNCache2);
    }

    public static /* synthetic */ ByteBuffer load$default(CDNEncryptedEntry cDNEncryptedEntry, Context context, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return cDNEncryptedEntry.load(context, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF13754a() {
        return this.f13754a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF13755b() {
        return this.f13755b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getF13756c() {
        return this.f13756c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getF13757d() {
        return this.f13757d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getF13758e() {
        return this.f13758e;
    }

    @NotNull
    public final CDNEncryptedEntry copy(@NotNull String name, @NotNull String file, @NotNull String key, @NotNull String iv2, boolean shouldCache, @NotNull CDNCache cache) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(iv2, "iv");
        Intrinsics.checkNotNullParameter(cache, "cache");
        return new CDNEncryptedEntry(name, file, key, iv2, shouldCache, cache);
    }

    @Override // jumio.core.InterfaceC40516D
    @NotNull
    public String getFile() {
        return this.f13755b;
    }

    @NotNull
    public final String getIv() {
        return this.f13757d;
    }

    @NotNull
    public final String getKey() {
        return this.f13756c;
    }

    @Override // jumio.core.InterfaceC40516D
    @NotNull
    public String getName() {
        return this.f13754a;
    }

    public final boolean getShouldCache() {
        return this.f13758e;
    }

    @Nullable
    public final AESGCMInputStream getStream(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InputStream inputStream = this.f13759f.get(this);
        if (inputStream == null || !Environment.INSTANCE.loadAleLib(context)) {
            return null;
        }
        String str = this.f13756c;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bytes2 = this.f13757d.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        return new AESGCMInputStream(inputStream, bytes, bytes2);
    }

    public int hashCode() {
        return this.f13759f.hashCode() + AbstractC40637b0.m89251a(this.f13758e, AbstractC40511C.m89148a(this.f13757d, AbstractC40511C.m89148a(this.f13756c, AbstractC40511C.m89148a(this.f13755b, this.f13754a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final boolean isAssetFile() {
        return this.f13759f.isAssetFile(this);
    }

    public final boolean isPreloadedFile() {
        return this.f13759f.isPreloadedFile(this);
    }

    @NotNull
    public final ByteBuffer load(@NotNull Context context, long initTimeoutInMs) throws CDNDecryptException {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            AESGCMInputStream stream = getStream(context);
            if (stream != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(stream, 8192);
                try {
                    ByteBufferOutputStream byteBufferOutputStream = new ByteBufferOutputStream();
                    byte[] bArr = new byte[16384];
                    while (true) {
                        i11 = bufferedInputStream.read(bArr, 0, 16384);
                        if (i11 == -1 || (SystemClock.uptimeMillis() - jUptimeMillis >= initTimeoutInMs && initTimeoutInMs >= 0)) {
                            break;
                        }
                        byteBufferOutputStream.write(bArr, 0, i11);
                    }
                    if (i11 != -1) {
                        throw new TimeoutException("CipherInputStream buffered read timed out");
                    }
                    ByteBuffer directByteBuffer = byteBufferOutputStream.toDirectByteBuffer();
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    if (directByteBuffer != null) {
                        Log.m14479v("CDNEncryptedEntry", "loadEncFile duration: " + (SystemClock.uptimeMillis() - jUptimeMillis));
                        return directByteBuffer;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedInputStream, th2);
                        throw th3;
                    }
                }
            }
            throw new Exception("CDNEncryptedEntry: stream should not be null!");
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            this.f13759f.remove(this);
            throw new CDNDecryptException(e11.toString());
        }
    }

    @NotNull
    public String toString() {
        return "CDNEncryptedEntry(name=" + this.f13754a + ", file=" + this.f13755b + ", key=" + this.f13756c + ", iv=" + this.f13757d + ", shouldCache=" + this.f13758e + ", cache=" + this.f13759f + ')';
    }
}
