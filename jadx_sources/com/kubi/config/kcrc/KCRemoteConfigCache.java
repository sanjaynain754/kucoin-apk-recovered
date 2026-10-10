package com.kubi.config.kcrc;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.annotation.WorkerThread;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5287o0;
import com.kubi.config.Config;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27101y;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o00.C42917g;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRemoteConfigCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J%\u0010\f\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0012J%\u0010\u0018\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010&\u001a\n !*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRemoteConfigCache;", "", "<init>", "()V", "", "name", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Ljava/lang/String;", "", CmcdData.Factory.STREAM_TYPE_LIVE, "", "data", "p", "(Ljava/util/Map;)V", "", "keys", "Lkotlin/Result;", "q", "(Ljava/util/List;)Ljava/lang/Object;", "", "clean", "m", "(Z)V", "r", "i", "o", "jsonStr", "writeFile", "j", "(Ljava/lang/String;Z)Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/String;)V", "Landroid/app/Application;", "kotlin.jvm.PlatformType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "g", "()Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "Ljava/util/concurrent/ConcurrentHashMap;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "configMap", "c", "tempConfigMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isWritting", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
@SuppressLint({"CheckResult"})
public final class KCRemoteConfigCache {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy application = LazyKt.lazy(new Function0<Application>() { // from class: com.kubi.config.kcrc.KCRemoteConfigCache$application$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        public final Application invoke() {
            return C5287o0.m6331a();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public ConcurrentHashMap<String, String> configMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public ConcurrentHashMap<String, String> tempConfigMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isWritting = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.config.kcrc.KCRemoteConfigCache$a */
    /* JADX INFO: compiled from: KCRemoteConfigUtils.kt */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"", "run", "()V", "<anonymous>"}, m90085k = 3, m90086mv = {1, 7, 1})
    public static final class RunnableC11409a implements Runnable {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f19651c;

        public RunnableC11409a(boolean z11) {
            this.f19651c = z11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Function1<Throwable, Unit> function1M20447c;
            try {
                C11426l.m20571d("notifyWrite: size=" + KCRemoteConfigCache.this.configMap.size());
                if (KCRemoteConfigCache.this.isWritting.compareAndSet(false, true)) {
                    try {
                        int size = KCRemoteConfigCache.this.tempConfigMap.size();
                        if (this.f19651c && size > 0) {
                            KCRemoteConfigCache kCRemoteConfigCache = KCRemoteConfigCache.this;
                            kCRemoteConfigCache.configMap = kCRemoteConfigCache.tempConfigMap;
                            KCRemoteConfigCache.this.tempConfigMap = new ConcurrentHashMap();
                        }
                        C11424j.f19691a.m20559b("[refreshConfigMap]-success: changedSize=" + size + '.');
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : KCRemoteConfigCache.this.configMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                        KCRemoteConfigCache kCRemoteConfigCache2 = KCRemoteConfigCache.this;
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
                        kCRemoteConfigCache2.m20489s(string);
                        C11424j.f19691a.m20559b("[notifyWrite]-success: size=" + KCRemoteConfigCache.this.configMap.size() + '.');
                    } catch (Throwable th2) {
                        C11424j.f19691a.m20558a("[notifyWrite]-error: " + th2.getMessage() + '.', th2);
                    }
                    KCRemoteConfigCache.this.isWritting.set(false);
                }
            } catch (Exception e11) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H == null || (function1M20447c = configM20528H.m20447c()) == null) {
                    return;
                }
                function1M20447c.invoke(e11);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Object m20477k(KCRemoteConfigCache kCRemoteConfigCache, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return kCRemoteConfigCache.m20482j(str, z11);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m20478n(KCRemoteConfigCache kCRemoteConfigCache, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        kCRemoteConfigCache.m20484m(z11);
    }

    /* JADX INFO: renamed from: g */
    public final Application m20479g() {
        return (Application) this.application.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m20480h(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            String str = this.configMap.get(name);
            C11424j.f19691a.m20560c(name, str);
            return str;
        } catch (Throwable th2) {
            C11424j.f19691a.m20558a("[getConfig]-error: " + th2.getMessage() + '.', th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m20481i(Map<String, ? extends Object> data) {
        Object objM103844constructorimpl;
        String strM66668h;
        Function1<Throwable, Unit> function1M20447c;
        C11426l.m20571d("jsonConvertMap: " + data);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Result.Companion companion = Result.INSTANCE;
            for (Map.Entry<String, ? extends Object> entry : data.entrySet()) {
                ConcurrentHashMap<String, String> concurrentHashMap = this.configMap;
                String key = entry.getKey();
                Object value = entry.getValue();
                concurrentHashMap.put(key, C27041f.m66668h(value != null ? value.toString() : null));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            strM66668h = C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage());
            Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
            if (configM20528H != null && (function1M20447c = configM20528H.m20447c()) != null) {
                function1M20447c.invoke(thM103847exceptionOrNullimpl);
            }
        } else {
            strM66668h = "";
        }
        C11425k.m20567f(System.currentTimeMillis() - jCurrentTimeMillis, strM66668h.length() == 0, strM66668h);
    }

    /* JADX INFO: renamed from: j */
    public final Object m20482j(String jsonStr, boolean writeFile) {
        Object objM103844constructorimpl;
        Config configM20528H;
        Function1<Throwable, Unit> function1M20447c;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (jsonStr.length() > 0) {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject(jsonStr);
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String it = itKeys.next();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    Object objOpt = jSONObject.opt(it);
                    if (objOpt == null) {
                        objOpt = "";
                    } else {
                        Intrinsics.checkNotNullExpressionValue(objOpt, "jsonObject.opt(it) ?: \"\"");
                    }
                    map.put(it, objOpt);
                }
                m20481i(map);
                if (writeFile) {
                    m20478n(this, false, 1, null);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null && (configM20528H = KCRemoteConfigFetcher.f19652a.m20528H()) != null && (function1M20447c = configM20528H.m20447c()) != null) {
            function1M20447c.invoke(thM103847exceptionOrNullimpl);
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: m */
    public final void m20484m(boolean clean) {
        C42917g.m94137c().execute(new RunnableC11409a(clean));
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final void m20486p(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            for (Map.Entry<String, ? extends Object> entry : data.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String strM66668h = C27041f.m66668h(value != null ? value.toString() : null);
                this.tempConfigMap.put(key, strM66668h);
                this.configMap.put(key, strM66668h);
            }
            C11424j.f19691a.m20559b("[refreshCache]-success: config=" + this.configMap.size() + ", tempConfig=" + this.tempConfigMap.size() + ", dataSize=" + data.size() + '.');
        } catch (Throwable th2) {
            C11424j.f19691a.m20558a("[refreshCache]-error: " + th2.getMessage() + '.', th2);
        }
    }

    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: q */
    public final Object m20487q(@NotNull List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return m20488r(keys);
    }

    /* JADX INFO: renamed from: r */
    public final Object m20488r(List<String> keys) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!keys.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : keys) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.configMap.remove((String) it.next());
                }
                C11424j c11424j = C11424j.f19691a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[removeKeys]-keys=");
                String strM66919i = C27099x.m66919i(keys, false, 2, null);
                if (strM66919i == null) {
                    strM66919i = "";
                }
                sb2.append(strM66919i);
                sb2.append('.');
                c11424j.m20559b(sb2.toString());
            }
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m20489s(String data) {
        Object objM103844constructorimpl;
        Function1<Throwable, Unit> function1M20447c;
        Object objM103844constructorimpl2;
        C11426l.m20571d("writeJsonIntoFile: data=" + data);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM66668h = "";
        try {
            Result.Companion companion = Result.INSTANCE;
            File file = new File(m20479g().getFilesDir(), "kc_remote_config.temp");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter.write(data);
                objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
            strM66668h = thM103847exceptionOrNullimpl != null ? C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()) : "";
            Util.closeQuietly(bufferedWriter);
            File file2 = new File(m20479g().getFilesDir(), "kc_remote_config.json");
            if (file2.exists()) {
                file2.delete();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(file.renameTo(file2)));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
            if (configM20528H != null && (function1M20447c = configM20528H.m20447c()) != null) {
                function1M20447c.invoke(thM103847exceptionOrNullimpl2);
            }
            strM66668h = C27041f.m66668h(thM103847exceptionOrNullimpl2.getMessage());
            C11424j.f19691a.m20558a("[writeJsonIntoFile]-error: " + thM103847exceptionOrNullimpl2.getMessage() + '.', thM103847exceptionOrNullimpl2);
        }
        C11425k.m20565d(true, System.currentTimeMillis() - jCurrentTimeMillis, strM66668h.length() == 0, strM66668h);
    }

    /* JADX INFO: renamed from: l */
    public final void m20483l() {
        m20485o();
    }

    /* JADX INFO: renamed from: o */
    public final void m20485o() {
        boolean z11;
        Object objM103844constructorimpl;
        String strM66668h;
        Function1<Throwable, Unit> function1M20447c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(m20479g().getFilesDir(), "kc_remote_config.json");
        boolean z12 = true;
        if (file.exists() && file.isFile()) {
            char[] cArr = new char[C33627eb.f69713c];
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                Result.Companion companion = Result.INSTANCE;
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = bufferedReader.read(cArr); i11 != -1; i11 = bufferedReader.read(cArr)) {
                    sb2.append(cArr);
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
                objM103844constructorimpl = Result.m103844constructorimpl(Result.m103843boximpl(m20477k(this, string, false, 2, null)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                Config configM20528H = KCRemoteConfigFetcher.f19652a.m20528H();
                if (configM20528H != null && (function1M20447c = configM20528H.m20447c()) != null) {
                    function1M20447c.invoke(thM103847exceptionOrNullimpl);
                }
                strM66668h = C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage());
                C11424j.f19691a.m20558a("[readJsonFromFile]-error: " + thM103847exceptionOrNullimpl.getMessage() + '.', thM103847exceptionOrNullimpl);
            } else {
                strM66668h = "";
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (strM66668h.length() != 0) {
                z12 = false;
            }
            C11425k.m20565d(false, jCurrentTimeMillis2, z12, strM66668h);
            Util.closeQuietly(bufferedReader);
            return;
        }
        String json = C27101y.m66925a(m20479g().getApplicationContext(), "kc_remote_config.json");
        Intrinsics.checkNotNullExpressionValue(json, "json");
        if (json.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m20482j(json, true);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("readJsonFromFile: file not exists. and read asset default config. (empty=");
        if (json.length() != 0) {
            z12 = false;
        }
        sb3.append(z12);
        sb3.append(')');
        C11426l.m20571d(sb3.toString());
        C11425k.m20566e(false, System.currentTimeMillis() - jCurrentTimeMillis, true, null, 8, null);
    }
}
