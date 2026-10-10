package com.kubi.permissions.utils;

import android.os.Build;
import com.kubi.permissions.exception.PermissionException;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.HashSet;
import kotlinx.coroutines.rx2.C41734a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import xb0.C46126b;

/* JADX INFO: compiled from: PermissionCompat.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007\u001a&\u0010\b\u001a\u00020\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0086@¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¨\u0006\u000e"}, m90084d2 = {"requestSmart", "Lio/reactivex/Observable;", "", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "permissions", "", "", "(Lcom/tbruyelle/rxpermissions2/RxPermissions;[Ljava/lang/String;)Lio/reactivex/Observable;", "awaitRequestSmart", "(Lcom/tbruyelle/rxpermissions2/RxPermissions;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterPermissions", "([Ljava/lang/String;)[Ljava/lang/String;", "convertPermission", "permission", "LPermissions_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPermissionCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionCompat.kt\ncom/kubi/permissions/utils/PermissionCompatKt\n+ 2 PermissionIssue.kt\ncom/kubi/permissions/exception/PermissionIssueKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,99:1\n32#2,2:100\n32#2,2:102\n37#3:104\n36#3,3:105\n*S KotlinDebug\n*F\n+ 1 PermissionCompat.kt\ncom/kubi/permissions/utils/PermissionCompatKt\n*L\n43#1:100,2\n60#1:102,2\n71#1:104\n71#1:105,3\n*E\n"})
public final class PermissionCompatKt {
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m49933b(@NotNull C46126b c46126b, @NotNull String[] strArr, @NotNull Continuation<? super Boolean> continuation) {
        PermissionCompatKt$awaitRequestSmart$1 permissionCompatKt$awaitRequestSmart$1;
        boolean zBooleanValue;
        if (continuation instanceof PermissionCompatKt$awaitRequestSmart$1) {
            permissionCompatKt$awaitRequestSmart$1 = (PermissionCompatKt$awaitRequestSmart$1) continuation;
            int i11 = permissionCompatKt$awaitRequestSmart$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                permissionCompatKt$awaitRequestSmart$1.label = i11 - Integer.MIN_VALUE;
            } else {
                permissionCompatKt$awaitRequestSmart$1 = new PermissionCompatKt$awaitRequestSmart$1(continuation);
            }
        } else {
            permissionCompatKt$awaitRequestSmart$1 = new PermissionCompatKt$awaitRequestSmart$1(continuation);
        }
        Object objM91214d = permissionCompatKt$awaitRequestSmart$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = permissionCompatKt$awaitRequestSmart$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM91214d);
                String[] strArrM49935d = m49935d((String[]) Arrays.copyOf(strArr, strArr.length));
                if (strArrM49935d.length != 0) {
                    Observable<Boolean> observableM101655n = c46126b.m101655n((String[]) Arrays.copyOf(strArrM49935d, strArrM49935d.length));
                    Intrinsics.checkNotNullExpressionValue(observableM101655n, "request(...)");
                    permissionCompatKt$awaitRequestSmart$1.L$0 = SpillingKt.nullOutSpilledVariable(c46126b);
                    permissionCompatKt$awaitRequestSmart$1.L$1 = SpillingKt.nullOutSpilledVariable(strArr);
                    permissionCompatKt$awaitRequestSmart$1.L$2 = SpillingKt.nullOutSpilledVariable(strArrM49935d);
                    permissionCompatKt$awaitRequestSmart$1.label = 1;
                    objM91214d = C41734a.m91214d(observableM101655n, permissionCompatKt$awaitRequestSmart$1);
                    if (objM91214d == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(z);
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91214d);
            Boolean bool = (Boolean) objM91214d;
            Intrinsics.checkNotNull(bool);
            zBooleanValue = bool.booleanValue();
        } catch (Exception e11) {
            C43846g.m96568c(new PermissionException(e11, "PermissionCompat", false, null, 8, null), null, 2, null);
            zBooleanValue = false;
        }
        boolean z11 = zBooleanValue;
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: renamed from: c */
    public static final String m49934c(String str) {
        if (Build.VERSION.SDK_INT < 33) {
            int iHashCode = str.hashCode();
            if (iHashCode != 175802396) {
                if (iHashCode != 691260818) {
                    if (iHashCode == 710297143 && str.equals("android.permission.READ_MEDIA_VIDEO")) {
                        return "android.permission.READ_EXTERNAL_STORAGE";
                    }
                } else if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    return "android.permission.READ_EXTERNAL_STORAGE";
                }
            } else if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                return "android.permission.READ_EXTERNAL_STORAGE";
            }
        } else if (Intrinsics.areEqual(str, "android.permission.READ_EXTERNAL_STORAGE") || Intrinsics.areEqual(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static final String[] m49935d(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String strM49934c = m49934c(str);
            if (strM49934c != null) {
                hashSet.add(strM49934c);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Observable<Boolean> m49936e(@NotNull C46126b c46126b, @NotNull String... permissions) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(c46126b, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        String[] strArrM49935d = m49935d((String[]) Arrays.copyOf(permissions, permissions.length));
        if (strArrM49935d.length == 0) {
            Observable<Boolean> observableJust = Observable.just(Boolean.TRUE);
            Intrinsics.checkNotNull(observableJust);
            return observableJust;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(c46126b.m101655n((String[]) Arrays.copyOf(strArrM49935d, strArrM49935d.length)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new PermissionException(thM103847exceptionOrNullimpl, "PermissionCompat", false, null, 8, null), null, 2, null);
        }
        Observable observableJust2 = Observable.just(Boolean.FALSE);
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = observableJust2;
        }
        Intrinsics.checkNotNull(objM103844constructorimpl);
        return (Observable) objM103844constructorimpl;
    }
}
