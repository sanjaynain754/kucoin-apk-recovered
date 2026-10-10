package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import android.content.Context;
import android.util.AtomicFile;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.reflect.TypeToken;
import com.kubi.utils.C27099x;
import com.kubi.utils.exception.GsonCode;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.Charsets;
import ro.C44128b;
import v70.C45463a;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: ConfigStorageClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient;", "", "Landroid/content/Context;", "context", "", "fileName", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "configContainer", "", "d", "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;)V", "c", "()Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "", "b", "()J", "cacheTime", "e", "(J)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "Ljava/lang/String;", "Ly70/g;", "Ly70/g;", "storageId", "Companion", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfigStorageClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigStorageClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,85:1\n151#2,5:86\n75#3,2:91\n84#3:93\n*S KotlinDebug\n*F\n+ 1 ConfigStorageClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient\n*L\n49#1:86,5\n64#1:91,2\n68#1:93\n*E\n"})
public final class ConfigStorageClient {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<String, ConfigStorageClient> f46901e = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final StorageId<Long> storageId;

    /* JADX INFO: compiled from: ConfigStorageClient.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient$Companion;", "", "()V", "TAG", "", "clientInstance", "", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient;", "getInstance", "context", "Landroid/content/Context;", "fileName", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nConfigStorageClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigStorageClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,85:1\n361#2,7:86\n*S KotlinDebug\n*F\n+ 1 ConfigStorageClient.kt\ncom/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient$Companion\n*L\n79#1:86,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized ConfigStorageClient getInstance(@NotNull Context context, @NotNull String fileName) {
            Object configStorageClient;
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                Map map = ConfigStorageClient.f46901e;
                configStorageClient = map.get(fileName);
                if (configStorageClient == null) {
                    configStorageClient = new ConfigStorageClient(context, fileName, null);
                    map.put(fileName, configStorageClient);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return (ConfigStorageClient) configStorageClient;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigStorageClient$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/sdk/lib/kucoin/biz/control/internal/loader/ConfigStorageClient$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,225:1\n*E\n"})
    public static final class C23856a extends TypeToken<BizConfig> {
    }

    public /* synthetic */ ConfigStorageClient(Context context, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized C23857a m57092c() {
        Object obj;
        Object objM103844constructorimpl;
        obj = null;
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                FileInputStream fileInputStreamOpenFileInput = this.context.openFileInput(this.fileName);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    String str = new String(bArr, Charsets.UTF_8);
                    try {
                        C27099x c27099x = C27099x.f54458a;
                        C23857a c23857aM57100b = new C23857a.a().m57100b((BizConfig) C27099x.m66914d(str, new C23856a().getType()));
                        CloseableKt.closeFinally(fileInputStreamOpenFileInput, null);
                        objM103844constructorimpl = Result.m103844constructorimpl(c23857aM57100b);
                    } catch (Throwable th2) {
                        C45463a.m100411d(th2, GsonCode.FROM_FAIL);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileInputStreamOpenFileInput, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th5));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97270n("BizControl::ConfigStorageClient", "loadConfig error: " + thM103847exceptionOrNullimpl);
            }
            if (!Result.m103850isFailureimpl(objM103844constructorimpl)) {
                obj = objM103844constructorimpl;
            }
        } catch (Throwable th6) {
            throw th6;
        }
        return (C23857a) obj;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m57093d(@NotNull C23857a configContainer) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(configContainer, "configContainer");
        try {
            Result.Companion companion = Result.INSTANCE;
            AtomicFile atomicFile = new AtomicFile(this.context.getFileStreamPath(this.fileName));
            FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                byte[] bytes = configContainer.m57098d().getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStreamStartWrite.write(bytes);
                atomicFile.finishWrite(fileOutputStreamStartWrite);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamStartWrite, null);
                m57094e(configContainer.m57096b());
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStreamStartWrite, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97269m("saveConfig error: " + thM103847exceptionOrNullimpl);
        }
    }

    public ConfigStorageClient(Context context, String str) {
        this.context = context;
        this.fileName = str;
        this.storageId = new StorageId<>("BizControl", str, null, false, 12, null);
    }

    /* JADX INFO: renamed from: b */
    public final long m57091b() {
        return C46392a.m102324f(this.storageId, 0L);
    }

    /* JADX INFO: renamed from: e */
    public final void m57094e(long cacheTime) {
        C46392a.m102330m(this.storageId, cacheTime);
    }
}
