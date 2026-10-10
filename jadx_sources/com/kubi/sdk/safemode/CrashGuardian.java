package com.kubi.sdk.safemode;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.annotation.Keep;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.C23705e3;
import com.kubi.sdk.R$string;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import com.kubi.sdk.exception.CrashType;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.core.C27031e;
import com.kubi.utils.storage.StorageType;
import java.io.File;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p518oy.C43337a;
import p569qq.C43846g;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.C46396e;
import y70.StorageId;

/* JADX INFO: compiled from: CrashGuardian.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001/B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0019H\u0002¢\u0006\u0004\b&\u0010\u001cJ\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u0019H\u0002¢\u0006\u0004\b(\u0010\u001cJ\b\u0010)\u001a\u00020\u001aH\u0002J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0002J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b.\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/sdk/safemode/CrashGuardian;", "", "<init>", "()V", "TAG", "", "RECORD_VERSION", "START_CRASH_TIMES", "UNCAUGHT_EXCEPTION_TIMES", "CRASH_CATEGORY", "LAST_ALERT_TIME", "ENABLE_CRASH_GUARDIAN", "MAIN_ACTIVITY", "FIREBASE_DIR", "IGNORE_DAY", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "startTime", "", "START_CRASH_TIMEOUT", "dataDir", "Ljava/io/File;", "cleanTagFile", "monitorCrash", "Lkotlin/Result;", "", "monitorCrash-d1pmJ48", "()Ljava/lang/Object;", "checkIsSameVersion", "needShowAlert", "checkSameException", "handleException", "e", "", "checkStartupCrash", "clearStartupCrashTag", "Lcom/kubi/utils/storage/MMKVHelper;", "clearStartupCrashTag-d1pmJ48", "clearExceptionTag", "clearExceptionTag-d1pmJ48", "cleanFilesAndRestart", "showConfirmDialog", "activity", "Landroid/app/Activity;", "restartApp", "restartApp-d1pmJ48", "CrashInfo", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrashGuardian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashGuardian.kt\ncom/kubi/sdk/safemode/CrashGuardian\n+ 2 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelper\n+ 5 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,322:1\n274#2:323\n274#2:325\n226#2,2:326\n274#2:336\n226#2,2:337\n274#2:347\n255#2:348\n1#3:324\n134#4,6:328\n17#4:334\n134#4,6:339\n17#4:345\n178#5:335\n178#5:346\n*S KotlinDebug\n*F\n+ 1 CrashGuardian.kt\ncom/kubi/sdk/safemode/CrashGuardian\n*L\n82#1:323\n98#1:325\n103#1:326,2\n134#1:336\n135#1:337,2\n150#1:347\n54#1:348\n112#1:328,6\n112#1:334\n138#1:339,6\n138#1:345\n112#1:335\n138#1:346\n*E\n"})
public final class CrashGuardian {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final CrashGuardian f47695a = new CrashGuardian();

    /* JADX INFO: renamed from: b */
    public static final boolean f47696b = C46396e.m102347d("crash_category", "enable_crash_guardian", false);

    /* JADX INFO: renamed from: c */
    public static long f47697c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static final File f47698d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final File f47699e;

    /* JADX INFO: compiled from: CrashGuardian.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/safemode/CrashGuardian$CrashInfo;", "Landroid/os/Parcelable;", "times", "", "type", "", "<init>", "(ILjava/lang/String;)V", "getTimes", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CrashInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CrashInfo> CREATOR = new C24106a();
        private final int times;

        @NotNull
        private final String type;

        /* JADX INFO: renamed from: com.kubi.sdk.safemode.CrashGuardian$CrashInfo$a */
        /* JADX INFO: compiled from: CrashGuardian.kt */
        /* JADX INFO: loaded from: classes42.dex */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C24106a implements Parcelable.Creator<CrashInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CrashInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CrashInfo(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CrashInfo[] newArray(int i11) {
                return new CrashInfo[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrashInfo)) {
                return false;
            }
            CrashInfo crashInfo = (CrashInfo) other;
            return this.times == crashInfo.times && Intrinsics.areEqual(this.type, crashInfo.type);
        }

        public CrashInfo(int i11, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.times = i11;
            this.type = type;
        }

        public static /* synthetic */ CrashInfo copy$default(CrashInfo crashInfo, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = crashInfo.times;
            }
            if ((i12 & 2) != 0) {
                str = crashInfo.type;
            }
            return crashInfo.copy(i11, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTimes() {
            return this.times;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final CrashInfo copy(int times, @NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new CrashInfo(times, type);
        }

        public final int getTimes() {
            return this.times;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return (Integer.hashCode(this.times) * 31) + this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "CrashInfo(times=" + this.times + ", type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.times);
            dest.writeString(this.type);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.safemode.CrashGuardian$a */
    /* JADX INFO: compiled from: CrashGuardian.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m90084d2 = {"com/kubi/sdk/safemode/CrashGuardian$checkStartupCrash$1", "Lcom/kubi/sdk/SimpleActivityLifecycleCallbacks;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "cancelRunnable", "Ljava/lang/Runnable;", "getCancelRunnable", "()Ljava/lang/Runnable;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCrashGuardian.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashGuardian.kt\ncom/kubi/sdk/safemode/CrashGuardian$checkStartupCrash$1\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n*L\n1#1,322:1\n35#2,4:323\n39#2:329\n44#3,2:327\n236#4,2:330\n*S KotlinDebug\n*F\n+ 1 CrashGuardian.kt\ncom/kubi/sdk/safemode/CrashGuardian$checkStartupCrash$1\n*L\n177#1:323,4\n177#1:329\n177#1:327,2\n178#1:330,2\n*E\n"})
    public static final class C24107a extends C23705e3 {

        /* JADX INFO: renamed from: b */
        public final Handler f47700b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c */
        public final Runnable f47701c = new Runnable() { // from class: com.kubi.sdk.safemode.i
            @Override // java.lang.Runnable
            public final void run() {
                CrashGuardian.C24107a.m57977b(this.f47711b);
            }
        };

        /* JADX INFO: renamed from: com.kubi.sdk.safemode.CrashGuardian$a$a */
        /* JADX INFO: compiled from: RemoteConfig.kt */
        @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
        public static final class a extends TypeToken<Boolean> {
        }

        /* JADX INFO: renamed from: b */
        public static final void m57977b(C24107a c24107a) {
            CrashGuardian crashGuardian = CrashGuardian.f47695a;
            CrashGuardian.f47697c = System.currentTimeMillis();
            CrashGuardian.f47695a.m57968s();
            BaseApplication.INSTANCE.get().unregisterActivityLifecycleCallbacks(c24107a);
        }

        @Override // com.kubi.sdk.C23705e3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Object objM103844constructorimpl;
            Object objM20457a;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Log.e("CrashGuardian", "onActivityCreated: " + activity.getClass().getName());
            if (Intrinsics.areEqual(activity.getClass().getName(), "com.kubi.kucoin.main.KuCoinMainActivity")) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    try {
                        RemoteConfig remoteConfig = RemoteConfig.f19636a;
                        Type type = new a().getType();
                        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                        objM20457a = RemoteConfig.m20457a("enable_crash_guardian", type);
                    } catch (Throwable th2) {
                        C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                        objM20457a = null;
                    }
                    Boolean bool = (Boolean) objM20457a;
                    C46396e.m102354k("crash_category", "enable_crash_guardian", bool != null ? bool.booleanValue() : false);
                    CrashGuardian crashGuardian = CrashGuardian.f47695a;
                    if (crashGuardian.m57971v()) {
                        crashGuardian.m57973x(activity);
                    }
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
                }
            }
            if ((activity instanceof IStartupActivity) || Intrinsics.areEqual(activity.getClass().getName(), "com.kubi.kucoin.main.KuCoinMainActivity")) {
                CrashGuardian crashGuardian2 = CrashGuardian.f47695a;
                CrashGuardian.f47697c = System.currentTimeMillis();
                Handler handler = this.f47700b;
                handler.removeCallbacks(this.f47701c);
                handler.postDelayed(this.f47701c, 10000L);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m57966q() {
        Object objM103844constructorimpl;
        File[] fileArrListFiles;
        Object objM103844constructorimpl2;
        File[] fileArrListFiles2;
        Object objM103844constructorimpl3;
        boolean z11 = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!f47696b) {
                m57968s();
                m57967r();
                return;
            }
            Log.e("CrashGuardian", "cleanFilesAndRestart");
            File file = f47699e;
            if (!file.exists()) {
                file.createNewFile();
            }
            File file2 = f47698d;
            if (file2 != null && (fileArrListFiles = file2.listFiles()) != null) {
                boolean z12 = true;
                for (File file3 : fileArrListFiles) {
                    if (!Intrinsics.areEqual(file3, f47699e)) {
                        if (!Intrinsics.areEqual(file3, BaseApplication.INSTANCE.get().getFilesDir())) {
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                Intrinsics.checkNotNull(file3);
                                objM103844constructorimpl2 = Result.m103844constructorimpl(Boolean.valueOf(FilesKt.deleteRecursively(file3)));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.INSTANCE;
                                objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                            }
                            if (Result.m103851isSuccessimpl(objM103844constructorimpl2) && !((Boolean) objM103844constructorimpl2).booleanValue()) {
                                z12 = false;
                            }
                            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl2) != null) {
                                z12 = false;
                            }
                            Result.m103843boximpl(objM103844constructorimpl2);
                        } else if (file3 != null && (fileArrListFiles2 = file3.listFiles()) != null) {
                            for (File file4 : fileArrListFiles2) {
                                String name = file4.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "com.google.firebase.crashlytics", false, 2, (Object) null)) {
                                    try {
                                        Result.Companion companion4 = Result.INSTANCE;
                                        Intrinsics.checkNotNull(file4);
                                        objM103844constructorimpl3 = Result.m103844constructorimpl(Boolean.valueOf(FilesKt.deleteRecursively(file4)));
                                    } catch (Throwable th3) {
                                        Result.Companion companion5 = Result.INSTANCE;
                                        objM103844constructorimpl3 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                                    }
                                    if (Result.m103851isSuccessimpl(objM103844constructorimpl3) && !((Boolean) objM103844constructorimpl3).booleanValue()) {
                                        z12 = false;
                                    }
                                    if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl3) != null) {
                                        z12 = false;
                                    }
                                }
                            }
                        }
                    }
                }
                z11 = z12;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Result.m103843boximpl(z11 ? f47699e.delete() ? m57972w() : C43337a.m95404b("cleanTagFile delete failed", "CrashGuardian") : C43337a.m95404b("dataDir delete failed", "CrashGuardian")));
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
            }
        } catch (Throwable th4) {
            Result.Companion companion6 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th4));
        }
    }

    static {
        File dataDir = BaseApplication.INSTANCE.get().getDataDir();
        f47698d = dataDir;
        f47699e = new File(dataDir, "clean_start");
    }

    /* JADX INFO: renamed from: A */
    public static final void m57943A(CrashGuardian crashGuardian, DialogInterface dialogInterface, int i11) {
        C43337a.m95404b("uncaught crash times > 2, cancel", "CrashGuardian");
        crashGuardian.m57967r();
        C46396e.m102356m("crash_category", "last_alert_time", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: B */
    public static final void m57944B(CrashGuardian crashGuardian, DialogInterface dialogInterface) {
        C43337a.m95404b("uncaught crash times > 2, cancel", "CrashGuardian");
        crashGuardian.m57967r();
        C46396e.m102356m("crash_category", "last_alert_time", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: C */
    public static final void m57945C(CrashGuardian crashGuardian, DialogInterface dialogInterface, int i11) {
        C43337a.m95404b("uncaught crash times > 2,delete files and exit", "CrashGuardian");
        crashGuardian.m57966q();
    }

    /* JADX INFO: renamed from: D */
    public static final void m57946D(CrashGuardian crashGuardian, DialogInterface dialogInterface, int i11) {
        C43337a.m95404b("uncaught crash times > 2, cancel", "CrashGuardian");
        crashGuardian.m57967r();
        C46396e.m102356m("crash_category", "last_alert_time", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: E */
    public static final void m57947E(CrashGuardian crashGuardian, DialogInterface dialogInterface) {
        C43337a.m95404b("uncaught crash times > 2, cancel", "CrashGuardian");
        crashGuardian.m57967r();
        C46396e.m102356m("crash_category", "last_alert_time", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o */
    public static final void m57960o(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        Object objM103844constructorimpl;
        Log.e("CrashGuardian", "handleException: " + th2.getClass().getName());
        CrashGuardian crashGuardian = f47695a;
        try {
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNull(th2);
            crashGuardian.m57969t(th2);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m57961y(Activity activity, final CrashGuardian crashGuardian) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.clean_data_title).m54156M4(C27017c.f54310a.m66516f(R$string.clean_data_content, 3)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.sdk.safemode.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CrashGuardian.m57962z(this.f47708b, dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.sdk.safemode.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CrashGuardian.m57943A(this.f47709b, dialogInterface, i11);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.sdk.safemode.h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CrashGuardian.m57944B(this.f47710b, dialogInterface);
            }
        }).m54194t3((FragmentActivity) activity, "CrashConfirmDialog");
    }

    /* JADX INFO: renamed from: z */
    public static final void m57962z(CrashGuardian crashGuardian, DialogInterface dialogInterface, int i11) {
        C43337a.m95404b("uncaught crash times > 2,delete files and exit", "CrashGuardian");
        crashGuardian.m57966q();
    }

    /* JADX INFO: renamed from: m */
    public final void m57963m() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Application application = BaseApplication.INSTANCE.get();
            int i11 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionCode;
            if (i11 != C46396e.m102348e("crash_category", "record_version", -1)) {
                f47699e.delete();
                m57968s();
                m57967r();
            }
            C46396e.m102355l("crash_category", "record_version", i11);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
        }
    }

    /* JADX INFO: renamed from: r */
    public final Object m57967r() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(C46396e.m102360q("crash_category", "uncaught_exception_times"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: s */
    public final Object m57968s() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Log.e("CrashGuardian", "clearStartupCrashTag");
            objM103844constructorimpl = Result.m103844constructorimpl(C46396e.m102360q("crash_category", "start_crash_times"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
        }
        return objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final Object m57970u() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Log.e("CrashGuardian", "monitorCrash");
            m57963m();
            if (f47699e.exists()) {
                C43337a.m95404b("cleanTagFile exists", "CrashGuardian");
                m57966q();
            } else if (C46396e.m102348e("crash_category", "start_crash_times", 0) > 2) {
                C43337a.m95404b("startup crash times > 2", "CrashGuardian");
                C43847h.m96575d(KunlunTechEventEnum.CATE_STARTUP_CRASH, CrashType.STARTUP_CRASH.ordinal());
                m57966q();
            } else {
                m57965p();
                m57964n();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m57971v() {
        C46396e c46396e = C46396e.f104049a;
        CrashInfo crashInfo = (CrashInfo) C46392a.f104043a.m102336j(new StorageId("crash_category", "uncaught_exception_times", StorageType.Shared, true), CrashInfo.class, null);
        return (crashInfo != null ? crashInfo.getTimes() : 0) > 2 && System.currentTimeMillis() - C46396e.m102349f("crash_category", "last_alert_time", 0L) > 259200000;
    }

    /* JADX INFO: renamed from: w */
    public final Object m57972w() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Log.e("CrashGuardian", "restartApp");
            Application application = BaseApplication.INSTANCE.get();
            application.startActivity(application.getPackageManager().getLaunchIntentForPackage(application.getPackageName()));
            Process.killProcess(Process.myPid());
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
        }
        return objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: x */
    public final void m57973x(final Activity activity) {
        Object objM103844constructorimpl;
        Object objValueOf;
        View decorView;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!f47696b) {
                m57968s();
                m57967r();
                return;
            }
            Log.e("CrashGuardian", "showConfirmDialog");
            if (activity instanceof FragmentActivity) {
                Window window = ((FragmentActivity) activity).getWindow();
                objValueOf = (window == null || (decorView = window.getDecorView()) == null) ? null : Boolean.valueOf(decorView.post(new Runnable() { // from class: com.kubi.sdk.safemode.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CrashGuardian.m57961y(activity, this);
                    }
                }));
            } else {
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(R$string.clean_data_title).setMessage(C27017c.f54310a.m66516f(R$string.clean_data_content, 3)).setPositiveButton(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.sdk.safemode.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        CrashGuardian.m57945C(this.f47704b, dialogInterface, i11);
                    }
                }).setNegativeButton(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.sdk.safemode.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        CrashGuardian.m57946D(this.f47705b, dialogInterface, i11);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.kubi.sdk.safemode.d
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        CrashGuardian.m57947E(this.f47706b, dialogInterface);
                    }
                }).create();
                Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
                C27031e.m66609a(alertDialogCreate);
                objValueOf = Unit.INSTANCE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(objValueOf);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43337a.m95403a(thM103847exceptionOrNullimpl, "CrashGuardian");
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m57964n() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.kubi.sdk.safemode.e
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                CrashGuardian.m57960o(defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m57965p() {
        f47697c = System.currentTimeMillis();
        BaseApplication.INSTANCE.get().registerActivityLifecycleCallbacks(new C24107a());
    }

    /* JADX INFO: renamed from: t */
    public final void m57969t(Throwable th2) {
        int times = 1;
        if (System.currentTimeMillis() - f47697c < 10000) {
            C46396e.m102355l("crash_category", "start_crash_times", C46396e.m102348e("crash_category", "start_crash_times", 0) + 1);
        }
        C46396e c46396e = C46396e.f104049a;
        CrashInfo crashInfo = (CrashInfo) C46392a.f104043a.m102336j(new StorageId("crash_category", "uncaught_exception_times", StorageType.Shared, true), CrashInfo.class, null);
        if (crashInfo != null && Intrinsics.areEqual(crashInfo.getType(), th2.getClass().getName())) {
            times = 1 + crashInfo.getTimes();
        }
        String name = th2.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C46396e.m102357n("crash_category", "uncaught_exception_times", new CrashInfo(times, name));
        if (times > 2) {
            C43847h.m96575d(KunlunTechEventEnum.CATE_STARTUP_CRASH, CrashType.SAME_CRASH.ordinal());
        }
        if (C46396e.m102348e("crash_category", "start_crash_times", 0) > 2) {
            C43337a.m95404b("startup crash times > 2 now", "CrashGuardian");
            C43847h.m96575d(KunlunTechEventEnum.CATE_STARTUP_CRASH, CrashType.STARTUP_CRASH.ordinal());
            m57966q();
        }
    }
}
