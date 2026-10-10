package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes34.dex */
@SourceDebugExtension({"SMAP\nAFIntentWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n+ 2 MultiCatch.kt\ncom/appsflyer/internal/util/MultiCatchKt\n*L\n1#1,111:1\n16#2,7:112\n*S KotlinDebug\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n*L\n84#1:112,7\n*E\n"})
public final class AFj1hSDK {

    @NotNull
    final Intent getRevenue;

    private final <T> T AFAdRevenueData(Function0<? extends T> function0, String str, T t11, boolean z11) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        Object objAFAdRevenueData;
        synchronized (this.getRevenue) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(function0.invoke());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                try {
                    if (!ArraysKt.contains(kClassArr, Reflection.getOrCreateKotlinClass(thM103847exceptionOrNullimpl.getClass()))) {
                        throw thM103847exceptionOrNullimpl;
                    }
                    if (z11) {
                        objAFAdRevenueData = AFAdRevenueData(function0, str, t11, false);
                    } else {
                        AFLogger.afErrorLog(str, thM103847exceptionOrNullimpl, false, false);
                        objAFAdRevenueData = t11;
                    }
                    objM103844constructorimpl2 = Result.m103844constructorimpl(objAFAdRevenueData);
                    objM103844constructorimpl = objM103844constructorimpl2;
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
                }
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 == null) {
                t11 = (T) objM103844constructorimpl;
            } else {
                AFLogger.afErrorLog(str, thM103847exceptionOrNullimpl2, false, false);
            }
        }
        return t11;
    }

    public AFj1hSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getRevenue = intent;
    }

    @Nullable
    /* JADX INFO: renamed from: H_ */
    public final <T extends Parcelable> T m5992H_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFAdRevenueData(new Function0<T>() { // from class: com.appsflyer.internal.AFj1hSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1hSDK.this.getRevenue.getParcelableExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    /* JADX INFO: renamed from: I_ */
    public final Intent m5993I_(@NotNull final String str, final long j11) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFAdRevenueData(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1hSDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1hSDK.this.getRevenue.putExtra(str, j11);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    @Nullable
    public final String getCurrencyIso4217Code(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFAdRevenueData(new Function0<String>() { // from class: com.appsflyer.internal.AFj1hSDK.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1hSDK.this.getRevenue.getStringExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean getMonetizationNetwork(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFAdRevenueData(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1hSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1hSDK.this.getRevenue.hasExtra(str));
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
